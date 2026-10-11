/*
 * Decompiled with CFR 0.152.
 */
package ax.l1;

import android.os.SystemClock;
import ax.P0.P;
import ax.P0.v;
import ax.S0.a;
import ax.S0.d0;
import ax.j1.d;
import ax.l1.C;
import ax.l1.D;
import ax.l1.b;
import java.util.Arrays;
import java.util.List;

public abstract class c
implements D {
    protected final P a;
    protected final int b;
    protected final int[] c;
    private final int d;
    private final v[] e;
    private final long[] f;
    private int g;
    private boolean h;

    public c(P p8, int ... nArray) {
        this(p8, nArray, 0);
    }

    public c(P p8, int[] nArray, int n8) {
        int n9;
        boolean bl = nArray.length > 0;
        ax.S0.a.g(bl);
        this.d = n8;
        this.a = ax.S0.a.e(p8);
        this.b = n8 = nArray.length;
        this.e = new v[n8];
        for (n8 = 0; n8 < nArray.length; ++n8) {
            this.e[n8] = p8.b(nArray[n8]);
        }
        Arrays.sort(this.e, new b());
        this.c = new int[this.b];
        for (n8 = 0; n8 < (n9 = this.b); ++n8) {
            this.c[n8] = p8.c(this.e[n8]);
        }
        this.f = new long[n9];
        this.h = false;
    }

    public static /* synthetic */ int u(v v8, v v9) {
        return v9.j - v8.j;
    }

    @Override
    public boolean a(int n8, long l8) {
        return this.f[n8] > l8;
    }

    @Override
    public final P b() {
        return this.a;
    }

    public /* synthetic */ boolean e(long l8, ax.j1.b b8, List list) {
        return C.c(this, l8, b8, list);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (c)object;
            if (this.a.equals(((c)object).a) && Arrays.equals(this.c, ((c)object).c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void f() {
    }

    @Override
    public void g(boolean bl) {
        this.h = bl;
    }

    @Override
    public final v h(int n8) {
        return this.e[n8];
    }

    public int hashCode() {
        if (this.g == 0) {
            this.g = System.identityHashCode(this.a) * 31 + Arrays.hashCode(this.c);
        }
        return this.g;
    }

    @Override
    public void i() {
    }

    @Override
    public final int j(int n8) {
        return this.c[n8];
    }

    @Override
    public int k(long l8, List<? extends d> list) {
        return list.size();
    }

    @Override
    public final int l() {
        return this.c[this.d()];
    }

    @Override
    public final int length() {
        return this.c.length;
    }

    @Override
    public final v m() {
        return this.e[this.d()];
    }

    @Override
    public boolean o(int n8, long l8) {
        long l9 = SystemClock.elapsedRealtime();
        boolean bl = this.a(n8, l9);
        for (int i8 = 0; i8 < this.b && !bl; ++i8) {
            bl = i8 != n8 && !this.a(i8, l9);
        }
        if (!bl) {
            return false;
        }
        long[] lArray = this.f;
        lArray[n8] = Math.max(lArray[n8], d0.c(l9, l8, Long.MAX_VALUE));
        return true;
    }

    @Override
    public void p(float f8) {
    }

    @Override
    public /* synthetic */ void r() {
        C.a(this);
    }

    @Override
    public /* synthetic */ void s() {
        C.b(this);
    }

    @Override
    public final int t(int n8) {
        for (int i8 = 0; i8 < this.b; ++i8) {
            if (this.c[i8] != n8) continue;
            return i8;
        }
        return -1;
    }

    public final int v(v v8) {
        for (int i8 = 0; i8 < this.b; ++i8) {
            if (this.e[i8] != v8) continue;
            return i8;
        }
        return -1;
    }
}

