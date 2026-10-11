package ax.n8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import ax.o8.InterfaceC2733b;
import ax.x7.C3471f;
import java.util.Map;

/* renamed from: ax.n8.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2588B {
    public static final C2588B a = new C2588B();
    private static final ax.U7.a b;

    static {
        ax.U7.a i = new ax.W7.d().j(C2600c.a).k(true).i();
        ax.Gb.l.e(i, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        b = i;
    }

    private C2588B() {
    }

    private final EnumC2601d d(InterfaceC2733b interfaceC2733b) {
        return interfaceC2733b == null ? EnumC2601d.COLLECTION_SDK_NOT_INSTALLED : interfaceC2733b.a() ? EnumC2601d.COLLECTION_ENABLED : EnumC2601d.COLLECTION_DISABLED;
    }

    public final C2587A a(C3471f c3471f, C2623z c2623z, ax.p8.f fVar, Map<InterfaceC2733b.a, ? extends InterfaceC2733b> map, String str, String str2) {
        ax.Gb.l.f(c3471f, "firebaseApp");
        ax.Gb.l.f(c2623z, "sessionDetails");
        ax.Gb.l.f(fVar, "sessionsSettings");
        ax.Gb.l.f(map, "subscribers");
        ax.Gb.l.f(str, "firebaseInstallationId");
        ax.Gb.l.f(str2, "firebaseAuthenticationToken");
        return new C2587A(EnumC2607j.SESSION_START, new C2590D(c2623z.b(), c2623z.a(), c2623z.c(), c2623z.d(), new C2603f(d(map.get(InterfaceC2733b.a.PERFORMANCE)), d(map.get(InterfaceC2733b.a.CRASHLYTICS)), fVar.b()), str, str2), b(c3471f));
    }

    public final C2599b b(C3471f c3471f) {
        String valueOf;
        long longVersionCode;
        ax.Gb.l.f(c3471f, "firebaseApp");
        Context k = c3471f.k();
        ax.Gb.l.e(k, "firebaseApp.applicationContext");
        String packageName = k.getPackageName();
        PackageInfo packageInfo = k.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = String.valueOf(longVersionCode);
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str = valueOf;
        String c = c3471f.n().c();
        ax.Gb.l.e(c, "firebaseApp.options.applicationId");
        String str2 = Build.MODEL;
        ax.Gb.l.e(str2, "MODEL");
        String str3 = Build.VERSION.RELEASE;
        ax.Gb.l.e(str3, "RELEASE");
        EnumC2618u enumC2618u = EnumC2618u.LOG_ENVIRONMENT_PROD;
        ax.Gb.l.e(packageName, "packageName");
        String str4 = packageInfo.versionName;
        String str5 = str4 == null ? str : str4;
        String str6 = Build.MANUFACTURER;
        ax.Gb.l.e(str6, "MANUFACTURER");
        C2620w c2620w = C2620w.a;
        Context k2 = c3471f.k();
        ax.Gb.l.e(k2, "firebaseApp.applicationContext");
        C2619v d = c2620w.d(k2);
        Context k3 = c3471f.k();
        ax.Gb.l.e(k3, "firebaseApp.applicationContext");
        return new C2599b(c, str2, "2.0.3", str3, enumC2618u, new C2598a(packageName, str5, str, str6, d, c2620w.c(k3)));
    }

    public final ax.U7.a c() {
        return b;
    }
}
