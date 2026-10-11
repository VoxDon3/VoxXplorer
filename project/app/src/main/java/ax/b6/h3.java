/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.content.Context;
import android.net.Uri;
import ax.b6.Y2;
import ax.q7.f;

public final class h3 {
    final String a;
    final Uri b;
    final String c;
    final String d;
    final boolean e;
    final boolean f;
    private final boolean g;
    final boolean h;
    final f<Context, Boolean> i;

    public h3(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private h3(String string, Uri uri, String string2, String string3, boolean bl, boolean bl2, boolean bl3, boolean bl4, f<Context, Boolean> f8) {
        this.a = string;
        this.b = uri;
        this.c = string2;
        this.d = string3;
        this.e = bl;
        this.f = bl2;
        this.g = bl3;
        this.h = bl4;
        this.i = f8;
    }

    public final Y2<Double> a(String string, double d8) {
        return Y2.b(this, string, -3.0, true);
    }

    public final Y2<Long> b(String string, long l8) {
        return Y2.c(this, string, l8, true);
    }

    public final Y2<String> c(String string, String string2) {
        return Y2.d(this, string, string2, true);
    }

    public final Y2<Boolean> d(String string, boolean bl) {
        return Y2.a(this, string, bl, true);
    }

    public final h3 e() {
        return new h3(this.a, this.b, this.c, this.d, this.e, this.f, true, this.h, this.i);
    }

    public final h3 f() {
        if (this.c.isEmpty()) {
            f<Context, Boolean> f8 = this.i;
            if (f8 == null) {
                return new h3(this.a, this.b, this.c, this.d, true, this.f, this.g, this.h, f8);
            }
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }
}

