package binar.greta.fileprocessing_pert8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_handle_p_d_f.*

class HandlePDF : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_handle_p_d_f)

        btn_pdfWebView.setOnClickListener {
            startActivity(Intent(this, PdfWebView::class.java))
        }
        btn_pdfAssets.setOnClickListener {
            startActivity(Intent(this, PdfAssets::class.java))
        }
        btn_pdfStorage.setOnClickListener {
            startActivity(Intent(this, PdfStorage::class.java ))
        }
        btn_pdfInternet.setOnClickListener {
            startActivity(Intent(this, PdfInternet::class.java))
        }
    }
}