/*
 * Decompiled with CFR 0.152.
 */
package ax.Z2;

import android.net.Uri;
import ax.Q2.f;
import ax.c3.B;
import ax.c3.K;

public class k {
    K a;
    String b;

    public k(K k8, String string) {
        this.a = k8;
        this.b = string;
    }

    public static k a(Uri uri) {
        f f8 = f.p(uri.getScheme());
        if (f8 != null) {
            try {
                int n8 = Integer.parseInt(uri.getHost());
                Object object = uri.getPath();
                object = new k(K.a(f8, n8), (String)object);
                return object;
            }
            catch (NumberFormatException numberFormatException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Not valid uri : ");
                stringBuilder.append(uri);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not valid uri : ");
        stringBuilder.append(uri);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static boolean f(Uri uri) {
        if (f.p(uri.getScheme()) == null) {
            return false;
        }
        try {
            Integer.parseInt(uri.getHost());
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    public static boolean g(Uri uri, f f8) {
        return k.h(uri.getScheme(), f8);
    }

    public static boolean h(String string, f f8) {
        return f8.I().equals(string);
    }

    public f b() {
        return this.a.d();
    }

    public int c() {
        return this.a.b();
    }

    public K d() {
        return this.a;
    }

    public String e() {
        return this.b;
    }

    public String toString() {
        return B.U(this.a, this.b);
    }
}

