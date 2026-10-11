package ax.k1;

import ax.S0.C0968a;
import ax.q7.InterfaceC2879f;
import ax.r7.AbstractC2991z;
import ax.r7.T;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.k1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2362e implements InterfaceC2358a {
    private static final T<ax.N1.e> b = T.d().f(new InterfaceC2879f() { // from class: ax.k1.c
        @Override // ax.q7.InterfaceC2879f
        public final Object apply(Object obj) {
            Long valueOf;
            valueOf = Long.valueOf(((ax.N1.e) obj).b);
            return valueOf;
        }
    }).a(T.d().g().f(new InterfaceC2879f() { // from class: ax.k1.d
        @Override // ax.q7.InterfaceC2879f
        public final Object apply(Object obj) {
            Long valueOf;
            valueOf = Long.valueOf(((ax.N1.e) obj).c);
            return valueOf;
        }
    }));
    private final List<ax.N1.e> a = new ArrayList();

    @Override // ax.k1.InterfaceC2358a
    public long a(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            if (i >= this.a.size()) {
                break;
            }
            long j3 = this.a.get(i).b;
            long j4 = this.a.get(i).d;
            if (j < j3) {
                j2 = j2 == -9223372036854775807L ? j3 : Math.min(j2, j3);
            } else {
                if (j < j4) {
                    j2 = j2 == -9223372036854775807L ? j4 : Math.min(j2, j4);
                }
                i++;
            }
        }
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    @Override // ax.k1.InterfaceC2358a
    public boolean b(ax.N1.e eVar, long j) {
        C0968a.a(eVar.b != -9223372036854775807L);
        C0968a.a(eVar.c != -9223372036854775807L);
        boolean z = eVar.b <= j && j < eVar.d;
        for (int size = this.a.size() - 1; size >= 0; size--) {
            if (eVar.b >= this.a.get(size).b) {
                this.a.add(size + 1, eVar);
                return z;
            }
        }
        this.a.add(0, eVar);
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.k1.InterfaceC2358a
    public AbstractC2991z<ax.R0.a> c(long j) {
        if (!this.a.isEmpty()) {
            if (j >= this.a.get(0).b) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.a.size(); i++) {
                    ax.N1.e eVar = this.a.get(i);
                    if (j >= eVar.b && j < eVar.d) {
                        arrayList.add(eVar);
                    }
                    if (j < eVar.b) {
                        break;
                    }
                }
                AbstractC2991z J = AbstractC2991z.J(b, arrayList);
                AbstractC2991z.a r = AbstractC2991z.r();
                for (int i2 = 0; i2 < J.size(); i2++) {
                    r.j(((ax.N1.e) J.get(i2)).a);
                }
                return r.k();
            }
        }
        return AbstractC2991z.z();
    }

    @Override // ax.k1.InterfaceC2358a
    public void clear() {
        this.a.clear();
    }

    @Override // ax.k1.InterfaceC2358a
    public long d(long j) {
        if (this.a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < this.a.get(0).b) {
            return -9223372036854775807L;
        }
        long j2 = this.a.get(0).b;
        for (int i = 0; i < this.a.size(); i++) {
            long j3 = this.a.get(i).b;
            long j4 = this.a.get(i).d;
            if (j4 > j) {
                if (j3 > j) {
                    break;
                }
                j2 = Math.max(j2, j3);
            } else {
                j2 = Math.max(j2, j4);
            }
        }
        return j2;
    }

    @Override // ax.k1.InterfaceC2358a
    public void e(long j) {
        int i = 0;
        while (i < this.a.size()) {
            long j2 = this.a.get(i).b;
            if (j > j2 && j > this.a.get(i).d) {
                this.a.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }
}
