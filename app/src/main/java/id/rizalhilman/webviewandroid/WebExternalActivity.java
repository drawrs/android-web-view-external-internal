package id.rizalhilman.webviewandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebExternalActivity extends AppCompatActivity {
    // Deklarasi
    WebView wvTampilanWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_external);
        // Inisialisasi
        wvTampilanWeb = findViewById(R.id.wvTampilanWeb);
        // aktifkan fitur tambahan
        wvTampilanWeb.getSettings().setJavaScriptEnabled(true);
        wvTampilanWeb.getSettings().setSupportZoom(true);

        // Set Wev View Client
        wvTampilanWeb.setWebViewClient(new WebViewClient()); // tanpa ini, nanti malah ngebuka Browser
        // Load URL yang dituju
        wvTampilanWeb.loadUrl("http://khilman.net");
    }
}
