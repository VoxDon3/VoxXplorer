package ax.R5;

import android.content.Context;
import android.util.Log;
import ax.M5.C0821p;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class g {
    private static final String[] a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @ResultIgnorabilityUnspecified
    public static boolean a(Context context, Throwable th) {
        try {
            C0821p.l(context);
            C0821p.l(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
