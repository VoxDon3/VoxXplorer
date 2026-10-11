/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.net.Uri;
import ax.W5.G;
import ax.W5.H;
import ax.W5.I;
import ax.W5.J;
import ax.W5.O;
import ax.W5.T;
import ax.W5.m2;

public final class K {
    final Uri a;
    final String b;
    final String c;
    final boolean d;
    final boolean e;

    public K(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private K(String string, Uri uri, String string2, String string3, boolean bl, boolean bl2, boolean bl3, boolean bl4, T t8) {
        this.a = uri;
        this.b = "";
        this.c = "";
        this.d = bl;
        this.e = bl3;
    }

    public final K a() {
        return new K(null, this.a, this.b, this.c, this.d, false, true, false, null);
    }

    public final K b() {
        if (this.b.isEmpty()) {
            return new K(null, this.a, this.b, this.c, true, false, this.e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final O c(String string, double d8) {
        return new I(this, string, 0.0, true);
    }

    public final O d(String string, long l8) {
        return new G(this, string, l8, true);
    }

    public final O e(String string, boolean bl) {
        return new H(this, string, bl, true);
    }

    public final O f(String string, Object object, m2 m22) {
        return new J(this, "getTokenRefactor__blocked_packages", object, true, m22);
    }
}

