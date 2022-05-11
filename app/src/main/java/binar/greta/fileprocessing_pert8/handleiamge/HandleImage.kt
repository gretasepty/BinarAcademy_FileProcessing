package binar.greta.fileprocessing_pert8.handleiamge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.greta.fileprocessing_pert8.R
import kotlinx.android.synthetic.main.activity_handle_image.*

class HandleImage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_handle_image)

        btn_image.setOnClickListener {
            pickImageFromGallery()
        }
    }

    fun  pickImageFromGallery(){
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, 100)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == 100 && resultCode == RESULT_OK){
            viewImage.setImageURI(data?.data)

        }
    }
}