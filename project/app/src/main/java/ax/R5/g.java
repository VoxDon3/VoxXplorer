/*
 * Decompiled with CFR 0.152.
 */
package ax.R5;

import android.content.Context;
import android.util.Log;
import ax.M5.p;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

public final class g {
    private static final String[] a = new String[]{"android.", "com.android.", "dalvik.", "java.", "javax."};

    @ResultIgnorabilityUnspecified
    public static boolean a(Context context, Throwable throwable) {
        try {
            p.l(context);
            p.l(throwable);
        }
        catch (Exception exception) {
            Log.e((String)"CrashUtils", (String)"Error adding exception to DropBox!", (Throwable)exception);
        }
        return false;
    }
}

