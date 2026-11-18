/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.annotation.Keep;

@Keep
public class WebViewActivity
extends ax.R2.c {
    private String mDropboxKey;
    private ProgressBar mProgress;
    private Uri mUri;
    private WebView mWebView;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void setUpWebView() {
        this.mWebView.setVerticalScrollBarEnabled(false);
        this.mWebView.setHorizontalScrollBarEnabled(false);
        this.mWebView.setWebViewClient((WebViewClient)new c(this));
        this.mWebView.setWebChromeClient((WebChromeClient)new b(this));
        this.mWebView.getSettings().setJavaScriptEnabled(true);
        try {
            this.mWebView.loadUrl(this.mUri.toString());
        }
        catch (SecurityException securityException) {}
        this.mWebView.getSettings().setSavePassword(false);
        this.mWebView.getSettings().setSaveFormData(false);
        this.mProgress.setVisibility(0);
    }

    @Override
    public boolean isContentClipToPadding(boolean bl) {
        return true;
    }

    @Override
    public void onApplyWindowsInsets(ax.T.b b8, boolean bl) {
    }

    @Override
    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        this.setContentView(2131558441);
        this.setTitle(2131952156);
        this.onSetContentView(true);
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().B(2131231111);
        }
        this.mWebView = (WebView)this.findViewById(2131363047);
        this.mProgress = (ProgressBar)this.findViewById(2131362714);
        object = this.getIntent().getAction();
        Uri uri = this.getIntent().getData();
        if ("android.intent.action.VIEW".equals(object) && uri != null) {
            this.mUri = uri;
            this.mDropboxKey = this.getString(2131951919);
            this.setUpWebView();
            this.mWebView.requestFocus();
            return;
        }
        this.finish();
    }

    private class b
    extends WebChromeClient {
        final WebViewActivity a;

        private b(WebViewActivity webViewActivity) {
            this.a = webViewActivity;
        }

        public void onReceivedTitle(WebView webView, String string) {
            super.onReceivedTitle(webView, string);
        }
    }

    private class c
    extends WebViewClient {
        final WebViewActivity a;

        private c(WebViewActivity webViewActivity) {
            this.a = webViewActivity;
        }

        public void onPageFinished(WebView webView, String string) {
            super.onPageFinished(webView, string);
            this.a.mProgress.setVisibility(8);
        }

        public void onPageStarted(WebView webView, String string, Bitmap bitmap) {
            super.onPageStarted(webView, string, bitmap);
        }

        public void onReceivedError(WebView webView, int n8, String string, String string2) {
            super.onReceivedError(webView, n8, string, string2);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String string) {
            if (string.startsWith(this.a.mDropboxKey)) {
                webView = new Intent("android.intent.action.VIEW", Uri.parse((String)string));
                this.a.startActivity((Intent)webView);
                this.a.finish();
                return true;
            }
            this.a.mWebView.loadUrl(string);
            return true;
        }
    }
}

