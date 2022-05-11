package binar.greta.fileprocessing_pert8.handlevideo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.greta.fileprocessing_pert8.R
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.upstream.DataSource
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource
import kotlinx.android.synthetic.main.activity_handling_video_player.*

class HandlingVideoPlayer : AppCompatActivity() {

    private var mPlayer : ExoPlayer?= null
    private val videoURL = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_handling_video_player)
        viewExoPlayer()
    }

    fun viewExoPlayer(){
        mPlayer = ExoPlayer.Builder(this).build()
        viewPlayer.player = mPlayer
        mPlayer!!.playWhenReady = true
        mPlayer!!.setMediaSource(buildMediaSource())
        mPlayer!!.prepare()
    }

    private fun buildMediaSource(): MediaSource {
        // Create a data source factory.
        val dataSourceFactory: DataSource.Factory = DefaultHttpDataSource.Factory()

        // Create a progressive media source pointing to a stream uri.
        val mediaSource: MediaSource = ProgressiveMediaSource.Factory(dataSourceFactory)
            .createMediaSource(MediaItem.fromUri(videoURL))

        return mediaSource
    }

    fun releasePlayer(){
        if(mPlayer == null ){
            return
        }
        mPlayer!!.release()
        mPlayer = null
    }

    override fun onPause() {
        super.onPause()

        releasePlayer()
    }

    override fun onStop() {
        super.onStop()
        releasePlayer()
    }

}