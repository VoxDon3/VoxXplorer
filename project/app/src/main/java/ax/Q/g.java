/*
 * Decompiled with CFR 0.152.
 */
package ax.Q;

import android.content.Context;
import android.os.Process;
import ax.P.f;
import ax.b0.b;

public final class g {
    public static int a(Context context, String object, int n8, int n9, String string) {
        if (context.checkPermission((String)object, n8, n9) == -1) {
            return -1;
        }
        String string2 = f.c((String)object);
        if (string2 == null) {
            return 0;
        }
        object = string;
        if (string == null) {
            object = context.getPackageManager().getPackagesForUid(n9);
            if (object != null && ((String[])object).length > 0) {
                object = object[0];
            } else {
                return -1;
            }
        }
        n8 = Process.myUid();
        string = context.getPackageName();
        if ((n8 = n8 == n9 && b.a(string, object) ? f.a(context, n9, string2, (String)object) : f.b(context, string2, (String)object)) == 0) {
            return 0;
        }
        return -2;
    }

    public static int b(Context context, String string) {
        return g.a(context, string, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}

