package binar.greta.fileprocessing_pert8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pdf_assets.*

class PdfAssets : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf_assets)

        showPdfFromAssets(getPdfName())

    }

    fun showPdfFromAssets(pdfName : String){
        viewpdfAssets.fromAsset(pdfName)
            .password(null)
            .defaultPage(0)
            .onPageError { page, _ ->
                Toast.makeText(this, "", Toast.LENGTH_LONG).show()
            }
            .load()

    }

    fun getPdfName(): String{
        return "kotlin-media-kit.pdf"
    }
}