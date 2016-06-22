package com.example.tapesh.workwebview;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    WebView webView;
    Button button;
    String url="http://symptomchecker.isabelhealthcare.com/suggest_diagnoses_advanced/landing_page";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=(WebView)findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://symptomchecker.isabelhealthcare.com/suggest_diagnoses_advanced/landing_page");

        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(this);




    }

   @Override
    public void onClick(View view)
   {

       webView.loadUrl(url);

   }

}
