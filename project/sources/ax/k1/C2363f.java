package ax.k1;

import ax.r7.AbstractC2991z;
import ax.r7.F;
import java.util.ArrayList;

/* renamed from: ax.k1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2363f implements InterfaceC2358a {
    private final ArrayList<ax.N1.e> a = new ArrayList<>();

    private int f(long j) {
        for (int i = 0; i < this.a.size(); i++) {
            if (j < this.a.get(i).b) {
                return i;
            }
        }
        return this.a.size();
    }

    @Override // ax.k1.InterfaceC2358a
    public long a(long j) {
        if (this.a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < this.a.get(0).b) {
            return this.a.get(0).b;
        }
        for (int i = 1; i < this.a.size(); i++) {
            ax.N1.e eVar = this.a.get(i);
            if (j < eVar.b) {
                long j2 = this.a.get(i - 1).d;
                return (j2 == -9223372036854775807L || j2 <= j || j2 >= eVar.b) ? eVar.b : j2;
            }
        }
        long j3 = ((ax.N1.e) F.e(this.a)).d;
        if (j3 == -9223372036854775807L || j >= j3) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // ax.k1.InterfaceC2358a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(ax.N1.e r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.b
            r2 = 0
            r3 = 1
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            ax.S0.C0968a.a(r0)
            long r0 = r10.b
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 > 0) goto L25
            long r0 = r10.d
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L23
            int r4 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r4 >= 0) goto L25
        L23:
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            java.util.ArrayList<ax.N1.e> r1 = r9.a
            int r1 = r1.size()
            int r1 = r1 - r3
        L2d:
            if (r1 < 0) goto L58
            long r4 = r10.b
            java.util.ArrayList<ax.N1.e> r6 = r9.a
            java.lang.Object r6 = r6.get(r1)
            ax.N1.e r6 = (ax.N1.e) r6
            long r6 = r6.b
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L46
            java.util.ArrayList<ax.N1.e> r11 = r9.a
            int r1 = r1 + r3
            r11.add(r1, r10)
            return r0
        L46:
            java.util.ArrayList<ax.N1.e> r4 = r9.a
            java.lang.Object r4 = r4.get(r1)
            ax.N1.e r4 = (ax.N1.e) r4
            long r4 = r4.b
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 > 0) goto L55
            r0 = 0
        L55:
            int r1 = r1 + (-1)
            goto L2d
        L58:
            java.util.ArrayList<ax.N1.e> r11 = r9.a
            r11.add(r2, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.k1.C2363f.b(ax.N1.e, long):boolean");
    }

    @Override // ax.k1.InterfaceC2358a
    public AbstractC2991z<ax.R0.a> c(long j) {
        int f = f(j);
        if (f == 0) {
            return AbstractC2991z.z();
        }
        ax.N1.e eVar = this.a.get(f - 1);
        long j2 = eVar.d;
        return (j2 == -9223372036854775807L || j < j2) ? eVar.a : AbstractC2991z.z();
    }

    @Override // ax.k1.InterfaceC2358a
    public void clear() {
        this.a.clear();
    }

    @Override // ax.k1.InterfaceC2358a
    public long d(long j) {
        if (this.a.isEmpty() || j < this.a.get(0).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < this.a.size(); i++) {
            long j2 = this.a.get(i).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                ax.N1.e eVar = this.a.get(i - 1);
                long j3 = eVar.d;
                return (j3 == -9223372036854775807L || j3 > j) ? eVar.b : j3;
            }
        }
        ax.N1.e eVar2 = (ax.N1.e) F.e(this.a);
        long j4 = eVar2.d;
        return (j4 == -9223372036854775807L || j < j4) ? eVar2.b : j4;
    }

    @Override // ax.k1.InterfaceC2358a
    public void e(long j) {
        int f = f(j);
        if (f == 0) {
            return;
        }
        long j2 = this.a.get(f - 1).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            f--;
        }
        this.a.subList(0, f).clear();
    }
}
