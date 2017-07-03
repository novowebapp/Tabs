package ecomax.tabs;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static android.app.Activity.RESULT_OK;
import static android.content.ContentValues.TAG;
import static android.content.Context.CAMERA_SERVICE;
import static ecomax.tabs.R.id.container;
import static ecomax.tabs.R.id.webview;


public class home extends Fragment {


    WebView myBrowser_home;
    private ValueCallback<Uri> mUploadMessage;
    private final static int FILECHOOSER_RESULTCODE = 1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.contato, container, false);
        // Toast.makeText(getContext(),"contato",Toast.LENGTH_SHORT).show();

        myBrowser_home = (WebView) rootView.findViewById(R.id.webview2);

        myBrowser_home.getSettings().setJavaScriptEnabled(true);
        myBrowser_home.getSettings().setDomStorageEnabled(true);

        myBrowser_home.setWebViewClient(new WebViewClient());
//webView.setWebChromeClient(new WebChromeClient());

        myBrowser_home.loadUrl("http://prestador.esy.es");

        return rootView;
    }
}