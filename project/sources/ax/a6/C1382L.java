package ax.a6;

import android.annotation.TargetApi;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: ax.a6.L, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1382L extends WebViewClient {
    final /* synthetic */ C1384N a;

    /* synthetic */ C1382L(C1384N c1384n, C1383M c1383m) {
        this.a = c1384n;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        V v;
        C1384N c1384n = this.a;
        if (C1384N.f(c1384n, str)) {
            v = c1384n.b;
            v.e(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        boolean z;
        C1384N c1384n = this.a;
        z = c1384n.c;
        if (z) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        c1384n.c = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        V v;
        v = this.a.b;
        v.f(i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        V v;
        String uri = webResourceRequest.getUrl().toString();
        C1384N c1384n = this.a;
        if (!C1384N.f(c1384n, uri)) {
            return false;
        }
        v = c1384n.b;
        v.e(uri);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        V v;
        C1384N c1384n = this.a;
        if (!C1384N.f(c1384n, str)) {
            return false;
        }
        v = c1384n.b;
        v.e(str);
        return true;
    }
}
