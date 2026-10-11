package ax.Z6;

import android.os.Build;
import ax.m7.v;

/* loaded from: classes3.dex */
public class a {
    public static void a(int i) {
        v.c(b(i), "running on Android SDK level %s but requires minimum %s", Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(i));
    }

    public static boolean b(int i) {
        return Build.VERSION.SDK_INT >= i;
    }
}
