/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.annotation.TargetApi;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ax.a6.M;
import ax.a6.N;

final class L
extends WebViewClient {
    final N a;

    /* synthetic */ L(N n8, M m8) {
        this.a = n8;
    }

    public final void onLoadResource(WebView webView, String string) {
        webView = this.a;
        if (N.f((N)webView, string)) {
            N.a((N)webView).e(string);
        }
    }

    public final void onPageFinished(WebView webView, String string) {
        webView = this.a;
        if (!N.e((N)webView)) {
            Log.d((String)"UserMessagingPlatform", (String)"Wall html loaded.");
            N.b((N)webView, true);
        }
    }

    public final void onReceivedError(WebView webView, int n8, String string, String string2) {
        N.a(this.a).f(n8, string, string2);
    }

    @TargetApi(value=24)
    public final boolean shouldOverrideUrlLoading(WebView object, WebResourceRequest object2) {
        object2 = this.a;
        object = object2.getUrl().toString();
        if (N.f((N)((Object)object2), (String)object)) {
            N.a((N)((Object)object2)).e((String)object);
            return true;
        }
        return false;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String string) {
        webView = this.a;
        if (N.f((N)webView, string)) {
            N.a((N)webView).e(string);
            return true;
        }
        return false;
    }
}

