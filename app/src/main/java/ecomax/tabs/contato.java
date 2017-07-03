package ecomax.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class contato extends Fragment {

    public static WebView myBrowser_contato;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.contato, container, false);
       // Toast.makeText(getContext(),"contato",Toast.LENGTH_SHORT).show();

        myBrowser_contato = (WebView) rootView.findViewById(R.id.webview2);

        myBrowser_contato.getSettings().setJavaScriptEnabled(true);
        myBrowser_contato.getSettings().setDomStorageEnabled(true);

        myBrowser_contato.setWebViewClient(new WebViewClient());
//webView.setWebChromeClient(new WebChromeClient());

        myBrowser_contato.loadUrl("http://ecomax.esy.es/loja/");

        return rootView;
    }
}
