package sg.edu.rp.c346.demomywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLoadURL;
    WebView wvMyPage;
    EditText edtLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadURL=findViewById(R.id.buttonLoad);
        wvMyPage=findViewById(R.id.webViewMyPage);
        edtLink=findViewById(R.id.editTextLink);
        wvMyPage.setWebViewClient(new WebViewClient());
        WebSettings settings = wvMyPage.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);


        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=edtLink.getText().toString();
                wvMyPage.loadUrl(url);
                edtLink.setVisibility(View.GONE);


            }
        });

    }
}
