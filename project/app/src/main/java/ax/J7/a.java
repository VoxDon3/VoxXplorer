/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import ax.J7.C;
import ax.J7.f;
import ax.U2.b;
import java.util.List;

public class a {
    public final String a;
    public final String b;
    public final List<f> c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ax.G7.f h;

    public a(String string, String string2, List<f> list, String string3, String string4, String string5, String string6, ax.G7.f f8) {
        this.a = string;
        this.b = string2;
        this.c = list;
        this.d = string3;
        this.e = string4;
        this.f = string5;
        this.g = string6;
        this.h = f8;
    }

    public static a a(Context object, C object2, String string, String string2, List<f> list, ax.G7.f f8) throws PackageManager.NameNotFoundException {
        String string3 = object.getPackageName();
        String string4 = ((C)object2).g();
        object = object.getPackageManager().getPackageInfo(string3, 0);
        String string5 = ax.J7.a.b((PackageInfo)object);
        object2 = object.versionName;
        object = object2;
        if (object2 == null) {
            object = "0.0";
        }
        return new a(string, string2, list, string4, string3, string5, (String)object, f8);
    }

    private static String b(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Long.toString(ax.U2.b.a(packageInfo));
        }
        return Integer.toString(packageInfo.versionCode);
    }
}

