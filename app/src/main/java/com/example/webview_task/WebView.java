package com.example.webview_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebViewClient;
import android.widget.Toast;

/** This class will serve as the web view activity. */

public class WebView extends AppCompatActivity {

    android.webkit.WebView webView;
    String androidVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = findViewById(R.id.web_view);
        webView.setWebViewClient(new WebViewClient());
        androidVersion = getIntent().getStringExtra("name");

        /** Method to call Web View */
        loadWebView();

    }

    private void loadWebView() {
        switch(androidVersion){
            case "Android 1.0":
                webView.loadUrl("https://www.androidauthority.com/android-1-0-3028250/");
                break;
            case "Android 1.1":
                webView.loadUrl("https://android.fandom.com/wiki/Android_1.1");
                break;
            case "Cupcake":
                webView.loadUrl("https://www.androidheadlines.com/android-1-5-cupcake");
                break;
            case "Donut":
                webView.loadUrl("https://www.androidheadlines.com/android-1-6-donut");
                break;
            case "Eclair":
                webView.loadUrl("https://www.androidheadlines.com/android-2-0-2-1-eclair");
                break;
            case "Froyo":
                webView.loadUrl("https://www.androidheadlines.com/android-2-2-froyo");
                break;
            case "Gingerbread":
                webView.loadUrl("https://www.androidheadlines.com/2010/12/android-2-3-gingerbread-feature-highlights.html");
                break;
            case "Honeycomb":
                webView.loadUrl("https://www.androidheadlines.com/android-3-0-honeycomb");
                break;
            case "Ice Cream Sandwich":
                webView.loadUrl("https://www.androidheadlines.com/android-4-0-ice-cream-sandwich-ics");
                break;
            case "Jelly Bean":
                webView.loadUrl("https://www.androidheadlines.com/android-jelly-bean-4-1-4-3");
                break;
            case "Kitkat":
                webView.loadUrl("https://www.android.com/versions/kit-kat-4-4/");
                break;
            case "Lollipop":
                webView.loadUrl("https://www.android.com/versions/lollipop-5-0/");
                break;
            case "Marshmallow":
                webView.loadUrl("https://www.android.com/versions/marshmallow-6-0/");
                break;
            case "Nougat":
                webView.loadUrl("https://www.android.com/versions/nougat-7-0/");
                break;
            case "Oreo":
                webView.loadUrl("https://www.android.com/versions/oreo-8-0/");
                break;
            case "Pie":
                webView.loadUrl("https://www.android.com/versions/pie-9-0/");
                break;
            case "Android 10":
                webView.loadUrl("https://www.android.com/android-10/");
                break;
            case "Android 11":
                webView.loadUrl("https://www.android.com/android-11/");
                break;
            case "Android 12":
                webView.loadUrl(" https://www.android.com/android-12/");
                break;
            default:
                Toast.makeText(this, "Failed", Toast.LENGTH_LONG).show();

        }




    }
}