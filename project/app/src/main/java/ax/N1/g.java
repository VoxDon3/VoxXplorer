/*
 * Decompiled with CFR 0.152.
 */
package ax.N1;

import ax.N1.e;
import ax.N1.f;
import ax.N1.k;
import ax.S0.a;
import ax.S0.d0;
import ax.S0.u;
import ax.r7.F;
import ax.r7.T;
import ax.r7.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class g
implements k {
    private static final T<e> d0 = T.d().f(new f());
    private final long[] c0;
    private final z<z<ax.R0.a>> q;

    public g(List<e> object) {
        if (object.size() == 1) {
            object = F.h(object);
            long l8 = g.c(((e)object).b);
            if (((e)object).c == -9223372036854775807L) {
                this.q = z.A(((e)object).a);
                this.c0 = new long[]{l8};
                return;
            }
            this.q = z.B(((e)object).a, z.z());
            this.c0 = new long[]{l8, ((e)object).c + l8};
            return;
        }
        Object object2 = new long[object.size() * 2];
        this.c0 = object2;
        Arrays.fill((long[])object2, Long.MAX_VALUE);
        object2 = new ArrayList();
        z<e> z8 = z.J(d0, object);
        int n8 = 0;
        for (int i8 = 0; i8 < z8.size(); ++i8) {
            int n9;
            long[] lArray;
            long l9;
            object = (e)z8.get(i8);
            long l10 = g.c(((e)object).b);
            long l11 = ((e)object).c;
            if (n8 != 0 && (l9 = (lArray = this.c0)[n9 = n8 - 1]) >= l10) {
                if (l9 == l10 && ((z)((ArrayList)object2).get(n9)).isEmpty()) {
                    ((ArrayList)object2).set(n9, ((e)object).a);
                    n9 = n8;
                } else {
                    u.h("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.c0[n9] = l10;
                    ((ArrayList)object2).set(n9, ((e)object).a);
                    n9 = n8;
                }
            } else {
                this.c0[n8] = l10;
                ((ArrayList)object2).add(((e)object).a);
                n9 = n8 + 1;
            }
            n8 = n9;
            if (((e)object).c == -9223372036854775807L) continue;
            this.c0[n9] = l11 + l10;
            ((ArrayList)object2).add(z.z());
            n8 = n9 + 1;
        }
        this.q = z.u(object2);
    }

    public static /* synthetic */ Comparable a(e e8) {
        return Long.valueOf(g.c(e8.b));
    }

    private static long c(long l8) {
        long l9 = l8;
        if (l8 == -9223372036854775807L) {
            l9 = 0L;
        }
        return l9;
    }

    public z<ax.R0.a> b(long l8) {
        int n8 = ax.S0.d0.h(this.c0, l8, true, false);
        if (n8 == -1) {
            return z.z();
        }
        return (z)this.q.get(n8);
    }

    @Override
    public int d(long l8) {
        int n8 = ax.S0.d0.d(this.c0, l8, false, false);
        if (n8 < this.q.size()) {
            return n8;
        }
        return -1;
    }

    @Override
    public long h(int n8) {
        boolean bl = n8 < this.q.size();
        a.a(bl);
        return this.c0[n8];
    }

    @Override
    public int l() {
        return this.q.size();
    }
}

