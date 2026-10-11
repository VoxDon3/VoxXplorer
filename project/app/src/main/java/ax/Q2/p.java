/*
 * Decompiled with CFR 0.152.
 */
package ax.Q2;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import ax.X2.J;

public class p {
    private static Boolean a;

    public static boolean a(Context context) {
        if (!J.D(context)) {
            return false;
        }
        if (a == null) {
            if ((context = (AccessibilityManager)context.getSystemService("accessibility")) == null) {
                return false;
            }
            a = context.isEnabled();
        }
        return a;
    }
}

