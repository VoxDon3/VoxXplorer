package ax.i1;

import androidx.media3.exoplayer.C0618p0;
import ax.S0.C0968a;
import ax.r7.AbstractC2991z;
import java.util.List;

/* renamed from: ax.i1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2219i implements f0 {
    private long c0;
    private final AbstractC2991z<a> q;

    /* renamed from: ax.i1.i$a */
    private static final class a implements f0 {
        private final AbstractC2991z<Integer> c0;
        private final f0 q;

        public a(f0 f0Var, List<Integer> list) {
            this.q = f0Var;
            this.c0 = AbstractC2991z.u(list);
        }

        @Override // ax.i1.f0
        public boolean a(C0618p0 c0618p0) {
            return this.q.a(c0618p0);
        }

        @Override // ax.i1.f0
        public long b() {
            return this.q.b();
        }

        @Override // ax.i1.f0
        public boolean c() {
            return this.q.c();
        }

        @Override // ax.i1.f0
        public long d() {
            return this.q.d();
        }

        @Override // ax.i1.f0
        public void e(long j) {
            this.q.e(j);
        }

        public AbstractC2991z<Integer> f() {
            return this.c0;
        }
    }

    public C2219i(List<? extends f0> list, List<List<Integer>> list2) {
        AbstractC2991z.a r = AbstractC2991z.r();
        C0968a.a(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            r.a(new a(list.get(i), list2.get(i)));
        }
        this.q = r.k();
        this.c0 = -9223372036854775807L;
    }

    @Override // ax.i1.f0
    public boolean a(C0618p0 c0618p0) {
        boolean z;
        boolean z2 = false;
        do {
            long b = b();
            if (b == Long.MIN_VALUE) {
                return z2;
            }
            z = false;
            for (int i = 0; i < this.q.size(); i++) {
                long b2 = this.q.get(i).b();
                boolean z3 = b2 != Long.MIN_VALUE && b2 <= c0618p0.a;
                if (b2 == b || z3) {
                    z |= this.q.get(i).a(c0618p0);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // ax.i1.f0
    public long b() {
        long j = Long.MAX_VALUE;
        for (int i = 0; i < this.q.size(); i++) {
            long b = this.q.get(i).b();
            if (b != Long.MIN_VALUE) {
                j = Math.min(j, b);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // ax.i1.f0
    public boolean c() {
        for (int i = 0; i < this.q.size(); i++) {
            if (this.q.get(i).c()) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.i1.f0
    public long d() {
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        for (int i = 0; i < this.q.size(); i++) {
            a aVar = this.q.get(i);
            long d = aVar.d();
            if ((aVar.f().contains(1) || aVar.f().contains(2) || aVar.f().contains(4)) && d != Long.MIN_VALUE) {
                j = Math.min(j, d);
            }
            if (d != Long.MIN_VALUE) {
                j2 = Math.min(j2, d);
            }
        }
        if (j != Long.MAX_VALUE) {
            this.c0 = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.c0;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    @Override // ax.i1.f0
    public void e(long j) {
        for (int i = 0; i < this.q.size(); i++) {
            this.q.get(i).e(j);
        }
    }
}
