package ecomax.tabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class notificacoes extends Fragment {
    WebView myBrowser_contato;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.notificacoes, container, false);

        myBrowser_contato = (WebView) rootView.findViewById(R.id.webview3);

        myBrowser_contato.getSettings().setJavaScriptEnabled(true);
        myBrowser_contato.getSettings().setDomStorageEnabled(true);

        myBrowser_contato.setWebViewClient(new WebViewClient());
//webView.setWebChromeClient(new WebChromeClient());

        //myBrowser_contato.loadUrl("http://ecomax.esy.es/open-ticket/");

        return rootView;

    }

}
