package ax.u3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.u3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3192j {
    private static String a;
    private static Boolean b;

    public static String a(Context context) {
        if (a == null) {
            if (C3180B.L(context, "com.android.bluetooth")) {
                a = "com.android.bluetooth";
                b = Boolean.TRUE;
            } else if (C3180B.L(context, "com.google.android.bluetooth")) {
                a = "com.google.android.bluetooth";
                b = Boolean.TRUE;
            } else {
                b = Boolean.FALSE;
            }
        }
        return a;
    }

    public static boolean b(Context context, Intent intent, String str) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
            return false;
        }
        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().activityInfo.packageName)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(Context context) {
        if (b == null) {
            a(context);
        }
        return b.booleanValue();
    }
}
