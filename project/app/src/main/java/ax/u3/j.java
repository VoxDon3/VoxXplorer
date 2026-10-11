/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import ax.u3.B;

public class j {
    private static String a;
    private static Boolean b;

    public static String a(Context context) {
        if (a == null) {
            if (B.L(context, "com.android.bluetooth")) {
                a = "com.android.bluetooth";
                b = Boolean.TRUE;
            } else if (B.L(context, "com.google.android.bluetooth")) {
                a = "com.google.android.bluetooth";
                b = Boolean.TRUE;
            } else {
                b = Boolean.FALSE;
            }
        }
        return a;
    }

    public static boolean b(Context object, Intent intent, String string) {
        if ((object = object.getPackageManager().queryIntentActivities(intent, 65536)) != null && object.size() > 0) {
            object = object.iterator();
            while (object.hasNext()) {
                if (!string.equals(((ResolveInfo)object.next()).activityInfo.packageName)) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean c(Context context) {
        if (b == null) {
            j.a(context);
        }
        return b;
    }
}

