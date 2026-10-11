package ax.Q2;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import ax.X2.J;

/* loaded from: classes.dex */
public class p {
    private static Boolean a;

    public static boolean a(Context context) {
        if (!J.D(context)) {
            return false;
        }
        if (a == null) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager == null) {
                return false;
            }
            a = Boolean.valueOf(accessibilityManager.isEnabled());
        }
        return a.booleanValue();
    }
}
