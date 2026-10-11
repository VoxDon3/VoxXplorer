package ax.R5;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import ax.J5.C0752m;
import com.google.android.apps.common.proguard.SideEffectFree;

/* loaded from: classes3.dex */
public final class i {
    private static Boolean a;
    private static Boolean b;
    private static Boolean c;
    private static Boolean d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (d == null) {
            boolean z = false;
            if (l.h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            d = Boolean.valueOf(z);
        }
        return d.booleanValue();
    }

    public static boolean b() {
        int i = C0752m.a;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean c(Context context) {
        return g(context.getPackageManager());
    }

    @TargetApi(26)
    public static boolean d(Context context) {
        if (c(context) && !l.g()) {
            return true;
        }
        if (e(context)) {
            return !l.h() || l.j();
        }
        return false;
    }

    @TargetApi(21)
    public static boolean e(Context context) {
        if (b == null) {
            boolean z = false;
            if (l.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static boolean f(Context context) {
        if (c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            c = Boolean.valueOf(z);
        }
        return c.booleanValue();
    }

    @SideEffectFree
    @TargetApi(20)
    public static boolean g(PackageManager packageManager) {
        if (a == null) {
            boolean z = false;
            if (l.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            a = Boolean.valueOf(z);
        }
        return a.booleanValue();
    }
}
