/*
 * Decompiled with CFR 0.152.
 */
package ax.N1;

import ax.N1.d;
import ax.N1.e;
import ax.N1.n;
import ax.N1.t;
import ax.P0.E;
import ax.P0.v;
import ax.S0.G;
import ax.S0.a;
import ax.S0.d0;
import ax.q1.I;
import ax.q1.M;
import ax.q1.U;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.u7.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class o
implements r {
    private final t a;
    private final d b;
    private final v c;
    private final List<b> d;
    private final G e;
    private byte[] f;
    private U g;
    private int h;
    private int i;
    private long[] j;
    private long k;

    public o(t object, v v8) {
        this.a = object;
        this.b = new d();
        this.f = d0.f;
        this.e = new G();
        object = v8 != null ? v8.b().y0("application/x-media3-cues").U(v8.o).Y(object.d()).P() : null;
        this.c = object;
        this.d = new ArrayList<b>();
        this.i = 0;
        this.j = d0.g;
        this.k = -9223372036854775807L;
    }

    public static /* synthetic */ void g(o o8, e e8) {
        o8.getClass();
        b b8 = new b(e8.b, o8.b.a(e8.a, e8.c));
        o8.d.add(b8);
        long l8 = o8.k;
        if (l8 != -9223372036854775807L && e8.d < l8) {
            return;
        }
        o8.m(b8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void h() throws IOException {
        t.b b8;
        try {
            long l8 = this.k;
            b8 = l8 != -9223372036854775807L ? t.b.c(l8) : t.b.b();
        }
        catch (RuntimeException runtimeException) {
            throw E.a("SubtitleParser failed.", runtimeException);
        }
        t t8 = this.a;
        byte[] byArray = this.f;
        int n8 = this.h;
        n n9 = new n(this);
        t8.c(byArray, 0, n8, b8, n9);
        Collections.sort(this.d);
        this.j = new long[this.d.size()];
        for (n8 = 0; n8 < this.d.size(); ++n8) {
            this.j[n8] = this.d.get(n8).q;
        }
        this.f = d0.f;
    }

    private boolean i(s s8) throws IOException {
        long l8;
        byte[] byArray = this.f;
        if (byArray.length == this.h) {
            this.f = Arrays.copyOf(byArray, byArray.length + 1024);
        }
        byArray = this.f;
        int n8 = this.h;
        if ((n8 = s8.c(byArray, n8, byArray.length - n8)) != -1) {
            this.h += n8;
        }
        return (l8 = s8.getLength()) != -1L && (long)this.h == l8 || n8 == -1;
    }

    private boolean j(s s8) throws IOException {
        int n8 = s8.getLength() != -1L ? ax.u7.f.e(s8.getLength()) : 1024;
        return s8.a(n8) == -1;
    }

    private void l() {
        for (int i8 = (var2_1 = this.k) == -9223372036854775807L ? 0 : d0.h(this.j, var2_1, true, true); i8 < this.d.size(); ++i8) {
            this.m(this.d.get(i8));
        }
    }

    private void m(b b8) {
        ax.S0.a.i(this.g);
        int n8 = b8.c0.length;
        this.e.Y(b8.c0);
        this.g.g(this.e, n8);
        this.g.f(b8.q, 1, n8, 0, null);
    }

    @Override
    public void a(ax.q1.t t8) {
        U u8;
        boolean bl = this.i == 0;
        ax.S0.a.g(bl);
        this.g = u8 = t8.u(0, 3);
        v v8 = this.c;
        if (v8 != null) {
            u8.e(v8);
            t8.o();
            t8.h(new I(new long[]{0L}, new long[]{0L}, -9223372036854775807L));
        }
        this.i = 1;
    }

    @Override
    public void b(long l8, long l9) {
        int n8 = this.i;
        boolean bl = n8 != 0 && n8 != 5;
        ax.S0.a.g(bl);
        this.k = l9;
        if (this.i == 2) {
            this.i = 1;
        }
        if (this.i == 4) {
            this.i = 3;
        }
    }

    @Override
    public boolean c(s s8) throws IOException {
        return true;
    }

    @Override
    public void d() {
        if (this.i == 5) {
            return;
        }
        this.a.a();
        this.i = 5;
    }

    @Override
    public /* synthetic */ r e() {
        return q.b(this);
    }

    @Override
    public int f(s s8, M m8) throws IOException {
        int n8 = this.i;
        boolean bl = n8 != 0 && n8 != 5;
        ax.S0.a.g(bl);
        if (this.i == 1) {
            n8 = s8.getLength() != -1L ? ax.u7.f.e(s8.getLength()) : 1024;
            if (n8 > this.f.length) {
                this.f = new byte[n8];
            }
            this.h = 0;
            this.i = 2;
        }
        if (this.i == 2 && this.i(s8)) {
            this.h();
            this.i = 4;
        }
        if (this.i == 3 && this.j(s8)) {
            this.l();
            this.i = 4;
        }
        if (this.i == 4) {
            return -1;
        }
        return 0;
    }

    public /* synthetic */ List k() {
        return q.a(this);
    }

    private static class b
    implements Comparable<b> {
        private final byte[] c0;
        private final long q;

        private b(long l8, byte[] byArray) {
            this.q = l8;
            this.c0 = byArray;
        }

        public int j(b b8) {
            return Long.compare(this.q, b8.q);
        }
    }
}

