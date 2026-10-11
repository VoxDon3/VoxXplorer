/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.webkit.WebView;

public final class d0 {
    private static Boolean a;

    private d0() {
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(WebView webView, String string) {
        block7: {
            synchronized (d0.class) {
                Boolean bl = a;
                if (bl == null) {
                    try {
                        webView.evaluateJavascript("(function(){})()", null);
                        a = Boolean.TRUE;
                    }
                    catch (IllegalStateException illegalStateException) {
                        a = Boolean.FALSE;
                    }
                }
                boolean bl2 = a;
                // MONITOREXIT @DISABLED, blocks:[0, 3] lbl12 : MonitorExitStatement: MONITOREXIT : ax.a6.d0.class
                if (!bl2) break block7;
            }
            webView.evaluateJavascript(string, null);
            return;
        }
        webView.loadUrl("javascript:".concat(string));
        return;
        {
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

