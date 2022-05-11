package binar.greta.fileprocessing_pert8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_pdf_web_view.*

class PdfWebView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf_web_view)
        loadPdfWebView()
    }

    fun loadPdfWebView(){
//        agar ngeload tetap di layar
        viewWeb.webViewClient = WebViewClient()
        viewWeb.settings.setSupportZoom(true)
        viewWeb.settings.javaScriptEnabled = true // bilamana webnya ada settingan java script, maka webnya bisa jalan
        viewWeb.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=" + "https://kotlinlang.org/assets/kotlin-media-kit.pdf")
    }
}