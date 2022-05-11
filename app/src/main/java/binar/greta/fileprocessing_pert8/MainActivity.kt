package binar.greta.fileprocessing_pert8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.greta.fileprocessing_pert8.handleiamge.HandleImage
import binar.greta.fileprocessing_pert8.handlevideo.HandlingVideoPlayer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_handlePdf.setOnClickListener {
            startActivity(Intent(this, HandlePDF::class.java))
        }
        btn_handleImage.setOnClickListener {
            startActivity(Intent(this, HandlingVideoPlayer::class.java))
        }
        btn_handleView.setOnClickListener {
            startActivity(Intent(this, HandleImage::class.java))
        }
    }
}