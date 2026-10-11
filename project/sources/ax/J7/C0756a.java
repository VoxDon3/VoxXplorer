package ax.J7;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;

/* renamed from: ax.J7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0756a {
    public final String a;
    public final String b;
    public final List<C0761f> c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ax.G7.f h;

    public C0756a(String str, String str2, List<C0761f> list, String str3, String str4, String str5, String str6, ax.G7.f fVar) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = fVar;
    }

    public static C0756a a(Context context, C c, String str, String str2, List<C0761f> list, ax.G7.f fVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String g = c.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String b = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C0756a(str, str2, list, g, packageName, b, str3, fVar);
    }

    private static String b(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT < 28) {
            return Integer.toString(packageInfo.versionCode);
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return Long.toString(longVersionCode);
    }
}
