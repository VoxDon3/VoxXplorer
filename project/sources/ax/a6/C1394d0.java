package ax.a6;

import android.webkit.WebView;

/* renamed from: ax.a6.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1394d0 {
    private static Boolean a;

    private C1394d0() {
    }

    public static void a(WebView webView, String str) {
        boolean booleanValue;
        synchronized (C1394d0.class) {
            if (a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    a = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    a = Boolean.FALSE;
                }
            }
            booleanValue = a.booleanValue();
        }
        if (booleanValue) {
            webView.evaluateJavascript(str, null);
        } else {
            webView.loadUrl("javascript:".concat(str));
        }
    }
}
