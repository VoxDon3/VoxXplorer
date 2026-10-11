package ax.X0;

import android.util.Pair;
import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.G;
import ax.q1.U;
import ax.r7.F;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class j implements Comparable<j> {
    private final int c0;
    private final G d0;
    private final a e0;
    private final G f0 = new G(3);
    private final k g0 = new k();
    private final ArrayList<Pair<Long, Integer>> h0;
    private int i0;
    private long j0;
    private long k0;
    private final int q;

    public interface a {
        void a(int i, long j);
    }

    public j(int i, int i2, G g, a aVar) {
        this.q = i;
        this.c0 = i2;
        this.d0 = g;
        this.e0 = aVar;
        ArrayList<Pair<Long, Integer>> arrayList = new ArrayList<>();
        this.h0 = arrayList;
        this.i0 = Integer.MIN_VALUE;
        arrayList.add(Pair.create(0L, 120));
    }

    private static long h(ArrayList<Pair<Long, Integer>> arrayList, long j, long j2, int i) {
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Pair<Long, Integer> pair = arrayList.get(size);
            long min = Math.min(j3, j4 - ((Long) pair.first).longValue());
            C0968a.g(min >= 0);
            j5 += s(((Integer) pair.second).intValue(), min, i);
            j3 -= min;
            j4 -= min;
        }
        return j5 + s(((Integer) ((Pair) F.e(arrayList)).second).intValue(), j3, i);
    }

    private void l(int i, long j) {
        if (this.q == 2) {
            d(i, j);
        } else {
            this.e0.a(i, j);
        }
    }

    private static long s(int i, long j, int i2) {
        return (j * 60000000) / (i * i2);
    }

    public void d(int i, long j) {
        this.h0.add(Pair.create(Long.valueOf(j), Integer.valueOf(i)));
    }

    @Override // java.lang.Comparable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(j jVar) {
        long p = p();
        long p2 = jVar.p();
        if (p == p2) {
            return 0;
        }
        if (p == -9223372036854775807L) {
            return 1;
        }
        if (p2 == -9223372036854775807L) {
            return -1;
        }
        return Long.compare(p, p2);
    }

    public void n(U u, boolean z) {
        if (this.g0.e()) {
            this.j0 += h(this.h0, this.g0.f, this.k0, this.c0);
            if (z && this.g0.d()) {
                this.d0.c0(this.g0.b);
                k kVar = this.g0;
                this.i0 = kVar.d;
                kVar.h();
                return;
            }
            G g = this.d0;
            k kVar2 = this.g0;
            int i = kVar2.b;
            int i2 = kVar2.a;
            int i3 = i - i2;
            g.c0(i2);
            if (this.g0.c()) {
                this.d0.c0(i3);
                this.f0.b0(0);
                this.g0.i(this.f0.f());
                g = this.f0;
                i3 = this.g0.c;
            } else if (this.g0.b()) {
                long j = this.g0.e;
                if (j != -9223372036854775807L) {
                    l((int) (60000000 / j), this.k0);
                }
            }
            int i4 = i3;
            u.g(g, i4);
            u.f(this.j0, 0, i4, 0, null);
            if (this.h0.size() > 1) {
                Pair<Long, Integer> pair = (Pair) F.e(this.h0);
                this.h0.clear();
                this.h0.add(pair);
            }
            k kVar3 = this.g0;
            this.i0 = kVar3.d;
            kVar3.h();
        }
    }

    public long p() {
        if (this.g0.e()) {
            return this.j0 + h(this.h0, this.g0.f, this.k0, this.c0);
        }
        return -9223372036854775807L;
    }

    public void q() throws E {
        if (this.g0.e() || !this.g0.f(this.d0, this.i0)) {
            return;
        }
        this.k0 += this.g0.f;
    }

    public void r() {
        this.j0 = 0L;
        this.k0 = 0L;
        this.i0 = Integer.MIN_VALUE;
        this.d0.b0(0);
        this.f0.b0(0);
        this.g0.h();
        this.h0.clear();
        this.h0.add(Pair.create(0L, 120));
    }
}
