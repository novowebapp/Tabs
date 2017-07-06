package ecomax.tabs;


import android.net.Uri;

import android.os.Bundle;

import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;

import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class home extends Fragment {


    WebView myBrowser_home;
    private ValueCallback<Uri> mUploadMessage;
    private final static int FILECHOOSER_RESULTCODE = 1;
    public static final String PREFS_NAME = "MyPrefsFile";



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.contato, container, false);
        // Toast.makeText(getContext(),"contato",Toast.LENGTH_SHORT).show();



        myBrowser_home = (WebView) rootView.findViewById(R.id.webview2);

        myBrowser_home.getSettings().setJavaScriptEnabled(true);
        myBrowser_home.getSettings().setDomStorageEnabled(true);

        myBrowser_home.setWebViewClient(new WebViewClient());
        myBrowser_home.setWebChromeClient(new WebChromeClient());

        myBrowser_home.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);


        myBrowser_home.loadUrl("http://prestador.esy.es");
        //teste commit
        //teste commit 2
        return rootView;
    }
}