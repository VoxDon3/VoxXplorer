/*
 * Decompiled with CFR 0.152.
 */
package ax.R5;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import ax.J5.m;
import ax.R5.l;
import com.google.android.apps.common.proguard.SideEffectFree;

public final class i {
    private static Boolean a;
    private static Boolean b;
    private static Boolean c;
    private static Boolean d;

    public static boolean a(Context context) {
        context = context.getPackageManager();
        if (d == null) {
            boolean bl;
            boolean bl2 = l.h();
            boolean bl3 = bl = false;
            if (bl2) {
                bl3 = bl;
                if (context.hasSystemFeature("android.hardware.type.automotive")) {
                    bl3 = true;
                }
            }
            d = bl3;
        }
        return d;
    }

    public static boolean b() {
        int n8 = m.a;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(value=20)
    @SideEffectFree
    public static boolean c(Context context) {
        return i.g(context.getPackageManager());
    }

    @TargetApi(value=26)
    public static boolean d(Context context) {
        return i.c(context) && !l.g() || i.e(context) && (!l.h() || l.j());
    }

    @TargetApi(value=21)
    public static boolean e(Context context) {
        if (b == null) {
            boolean bl;
            boolean bl2 = l.f();
            boolean bl3 = bl = false;
            if (bl2) {
                bl3 = bl;
                if (context.getPackageManager().hasSystemFeature("cn.google")) {
                    bl3 = true;
                }
            }
            b = bl3;
        }
        return b;
    }

    public static boolean f(Context context) {
        if (c == null) {
            boolean bl;
            boolean bl2 = context.getPackageManager().hasSystemFeature("android.hardware.type.iot");
            boolean bl3 = bl = true;
            if (!bl2) {
                bl3 = context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? bl : false;
            }
            c = bl3;
        }
        return c;
    }

    @TargetApi(value=20)
    @SideEffectFree
    public static boolean g(PackageManager packageManager) {
        if (a == null) {
            boolean bl;
            boolean bl2 = l.e();
            boolean bl3 = bl = false;
            if (bl2) {
                bl3 = bl;
                if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                    bl3 = true;
                }
            }
            a = bl3;
        }
        return a;
    }
}

