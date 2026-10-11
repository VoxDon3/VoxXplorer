/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import android.content.Context;
import android.os.Build;
import ax.Gb.l;
import ax.n8.A;
import ax.n8.D;
import ax.n8.a;
import ax.n8.b;
import ax.n8.c;
import ax.n8.d;
import ax.n8.f;
import ax.n8.j;
import ax.n8.u;
import ax.n8.v;
import ax.n8.w;
import ax.n8.z;
import ax.o8.b;
import java.util.Map;

public final class B {
    public static final B a = new B();
    private static final ax.U7.a b;

    static {
        ax.U7.a a8 = new ax.W7.d().j(c.a).k(true).i();
        l.e(a8, "JsonDataEncoderBuilder()\u2026lues(true)\n      .build()");
        b = a8;
    }

    private B() {
    }

    private final d d(ax.o8.b b8) {
        if (b8 == null) {
            return d.d0;
        }
        if (b8.a()) {
            return d.e0;
        }
        return d.f0;
    }

    public final A a(ax.x7.f f8, z z8, ax.p8.f f9, Map<b.a, ? extends ax.o8.b> map, String string, String string2) {
        l.f(f8, "firebaseApp");
        l.f(z8, "sessionDetails");
        l.f(f9, "sessionsSettings");
        l.f(map, "subscribers");
        l.f(string, "firebaseInstallationId");
        l.f(string2, "firebaseAuthenticationToken");
        return new A(j.d0, new D(z8.b(), z8.a(), z8.c(), z8.d(), new f(this.d(map.get((Object)b.a.c0)), this.d(map.get((Object)b.a.q)), f9.b()), string, string2), this.b(f8));
    }

    public final b b(ax.x7.f f8) {
        l.f(f8, "firebaseApp");
        Object object = f8.k();
        l.e(object, "firebaseApp.applicationContext");
        String string = object.getPackageName();
        Object object2 = object.getPackageManager().getPackageInfo(string, 0);
        object = Build.VERSION.SDK_INT >= 28 ? String.valueOf(ax.U2.b.a(object2)) : String.valueOf(object2.versionCode);
        String string2 = f8.n().c();
        l.e(string2, "firebaseApp.options.applicationId");
        String string3 = Build.MODEL;
        l.e(string3, "MODEL");
        String string4 = Build.VERSION.RELEASE;
        l.e(string4, "RELEASE");
        u u8 = u.f0;
        l.e(string, "packageName");
        object2 = object2.versionName;
        if (object2 == null) {
            object2 = object;
        }
        String string5 = Build.MANUFACTURER;
        l.e(string5, "MANUFACTURER");
        w w8 = w.a;
        Object object3 = f8.k();
        l.e(object3, "firebaseApp.applicationContext");
        object3 = w8.d((Context)object3);
        f8 = f8.k();
        l.e(f8, "firebaseApp.applicationContext");
        return new b(string2, string3, "2.0.3", string4, u8, new a(string, (String)object2, (String)object, string5, (v)object3, w8.c((Context)f8)));
    }

    public final ax.U7.a c() {
        return b;
    }
}

