/*
 * Decompiled with CFR 0.152.
 */
package ax.m1;

import android.net.Uri;
import ax.S0.d0;
import ax.U0.g;
import ax.U0.i;
import ax.U0.k;
import ax.U0.y;
import ax.m1.o;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public final class p<T>
implements o.e {
    public final long a;
    public final k b;
    public final int c;
    private final y d;
    private final a<? extends T> e;
    private volatile T f;

    public p(g g8, k k8, int n8, a<? extends T> a8) {
        this.d = new y(g8);
        this.b = k8;
        this.c = n8;
        this.e = a8;
        this.a = ax.i1.y.a();
    }

    @Override
    public final void a() throws IOException {
        this.d.t();
        i i8 = new i(this.d, this.b);
        try {
            i8.b();
            Uri uri = ax.S0.a.e(this.d.b());
            this.f = this.e.a(uri, i8);
            return;
        }
        finally {
            d0.n(i8);
        }
    }

    public long b() {
        return this.d.q();
    }

    @Override
    public final void c() {
    }

    public Map<String, List<String>> d() {
        return this.d.s();
    }

    public final T e() {
        return this.f;
    }

    public Uri f() {
        return this.d.r();
    }

    public static interface a<T> {
        public T a(Uri var1, InputStream var2) throws IOException;
    }
}

