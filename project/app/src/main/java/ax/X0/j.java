/*
 * Decompiled with CFR 0.152.
 */
package ax.X0;

import android.util.Pair;
import ax.P0.E;
import ax.S0.G;
import ax.X0.k;
import ax.q1.U;
import ax.r7.F;
import java.util.ArrayList;

final class j
implements Comparable<j> {
    private final int c0;
    private final G d0;
    private final a e0;
    private final G f0;
    private final k g0;
    private final ArrayList<Pair<Long, Integer>> h0;
    private int i0;
    private long j0;
    private long k0;
    private final int q;

    public j(int n8, int n9, G object, a a8) {
        this.q = n8;
        this.c0 = n9;
        this.d0 = object;
        this.e0 = a8;
        this.f0 = new G(3);
        this.g0 = new k();
        this.h0 = object = new ArrayList();
        this.i0 = Integer.MIN_VALUE;
        ((ArrayList)object).add(Pair.create((Object)0L, (Object)120));
    }

    private static long h(ArrayList<Pair<Long, Integer>> arrayList, long l8, long l9, int n8) {
        long l10 = l8;
        l8 = l9;
        long l11 = 0L;
        l9 = l10;
        for (int i8 = arrayList.size() - 1; i8 >= 0; --i8) {
            Pair<Long, Integer> pair = arrayList.get(i8);
            l10 = Math.min(l9, l8 - (Long)pair.first);
            boolean bl = l10 >= 0L;
            ax.S0.a.g(bl);
            l11 += j.s((Integer)pair.second, l10, n8);
            l9 -= l10;
            l8 -= l10;
        }
        return l11 + j.s((Integer)F.e(arrayList).second, l9, n8);
    }

    private void l(int n8, long l8) {
        if (this.q == 2) {
            this.d(n8, l8);
            return;
        }
        this.e0.a(n8, l8);
    }

    private static long s(int n8, long l8, int n9) {
        return l8 * 60000000L / ((long)n8 * (long)n9);
    }

    public void d(int n8, long l8) {
        this.h0.add((Pair<Long, Integer>)Pair.create((Object)l8, (Object)n8));
    }

    public int j(j j8) {
        long l8;
        long l9 = this.p();
        if (l9 == (l8 = j8.p())) {
            return 0;
        }
        if (l9 == -9223372036854775807L) {
            return 1;
        }
        if (l8 == -9223372036854775807L) {
            return -1;
        }
        return Long.compare(l9, l8);
    }

    public void n(U pair, boolean bl) {
        if (!this.g0.e()) {
            return;
        }
        this.j0 += j.h(this.h0, this.g0.f, this.k0, this.c0);
        if (bl && this.g0.d()) {
            this.d0.c0(this.g0.b);
            pair = this.g0;
            this.i0 = pair.d;
            pair.h();
            return;
        }
        G g8 = this.d0;
        Object object = this.g0;
        int n8 = ((k)object).b;
        int n9 = ((k)object).a;
        n8 -= n9;
        g8.c0(n9);
        if (this.g0.c()) {
            this.d0.c0(n8);
            this.f0.b0(0);
            this.g0.i(this.f0.f());
            object = this.f0;
            n9 = this.g0.c;
        } else {
            n9 = n8;
            object = g8;
            if (this.g0.b()) {
                long l8 = this.g0.e;
                n9 = n8;
                object = g8;
                if (l8 != -9223372036854775807L) {
                    this.l((int)(60000000L / l8), this.k0);
                    n9 = n8;
                    object = g8;
                }
            }
        }
        pair.g((G)object, n9);
        pair.f(this.j0, 0, n9, 0, null);
        if (this.h0.size() > 1) {
            pair = F.e(this.h0);
            this.h0.clear();
            this.h0.add(pair);
        }
        pair = this.g0;
        this.i0 = pair.d;
        pair.h();
    }

    public long p() {
        if (!this.g0.e()) {
            return -9223372036854775807L;
        }
        return this.j0 + j.h(this.h0, this.g0.f, this.k0, this.c0);
    }

    public void q() throws E {
        if (!this.g0.e() && this.g0.f(this.d0, this.i0)) {
            this.k0 += this.g0.f;
        }
    }

    public void r() {
        this.j0 = 0L;
        this.k0 = 0L;
        this.i0 = Integer.MIN_VALUE;
        this.d0.b0(0);
        this.f0.b0(0);
        this.g0.h();
        this.h0.clear();
        this.h0.add((Pair<Long, Integer>)Pair.create((Object)0L, (Object)120));
    }

    public static interface a {
        public void a(int var1, long var2);
    }
}

