package ax.b6;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class Z4<T> implements InterfaceC1609l5<T> {
    private final U4 a;
    private final G5<?, ?> b;
    private final boolean c;
    private final Y3<?> d;

    private Z4(G5<?, ?> g5, Y3<?> y3, U4 u4) {
        this.b = g5;
        this.c = y3.e(u4);
        this.d = y3;
        this.a = u4;
    }

    static <T> Z4<T> j(G5<?, ?> g5, Y3<?> y3, U4 u4) {
        return new Z4<>(g5, y3, u4);
    }

    @Override // ax.b6.InterfaceC1609l5
    public final T a() {
        U4 u4 = this.a;
        return u4 instanceof AbstractC1599k4 ? (T) ((AbstractC1599k4) u4).B() : (T) u4.j().p();
    }

    @Override // ax.b6.InterfaceC1609l5
    public final int b(T t) {
        G5<?, ?> g5 = this.b;
        int e = g5.e(g5.k(t));
        return this.c ? e + this.d.b(t).a() : e;
    }

    @Override // ax.b6.InterfaceC1609l5
    public final void c(T t, InterfaceC1529c6 interfaceC1529c6) throws IOException {
        Iterator<Map.Entry<?, Object>> p = this.d.b(t).p();
        while (p.hasNext()) {
            Map.Entry<?, Object> next = p.next();
            InterfaceC1554f4 interfaceC1554f4 = (InterfaceC1554f4) next.getKey();
            if (interfaceC1554f4.c() != Y5.MESSAGE || interfaceC1554f4.f() || interfaceC1554f4.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof C1695w4) {
                interfaceC1529c6.k(interfaceC1554f4.a(), ((C1695w4) next).a().c());
            } else {
                interfaceC1529c6.k(interfaceC1554f4.a(), next.getValue());
            }
        }
        G5<?, ?> g5 = this.b;
        g5.d(g5.k(t), interfaceC1529c6);
    }

    @Override // ax.b6.InterfaceC1609l5
    public final boolean d(T t) {
        return this.d.b(t).s();
    }

    @Override // ax.b6.InterfaceC1609l5
    public final void e(T t) {
        this.b.l(t);
        this.d.g(t);
    }

    @Override // ax.b6.InterfaceC1609l5
    public final int f(T t) {
        int hashCode = this.b.k(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.b(t).hashCode() : hashCode;
    }

    @Override // ax.b6.InterfaceC1609l5
    public final void g(T t, T t2) {
        C1625n5.n(this.b, t, t2);
        if (this.c) {
            C1625n5.l(this.d, t, t2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[EDGE_INSN: B:24:0x00a1->B:25:0x00a1 BREAK  A[LOOP:1: B:10:0x0059->B:18:0x0059], SYNTHETIC] */
    @Override // ax.b6.InterfaceC1609l5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(T r10, byte[] r11, int r12, int r13, ax.b6.C1686v3 r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            ax.b6.k4 r0 = (ax.b6.AbstractC1599k4) r0
            ax.b6.F5 r1 = r0.zzb
            ax.b6.F5 r2 = ax.b6.F5.k()
            if (r1 != r2) goto L11
            ax.b6.F5 r1 = ax.b6.F5.l()
            r0.zzb = r1
        L11:
            r6 = r1
            ax.b6.k4$d r10 = (ax.b6.AbstractC1599k4.d) r10
            r10.I()
            r10 = 0
            r0 = r10
        L19:
            if (r12 >= r13) goto Laf
            int r4 = ax.b6.C1694w3.p(r11, r12, r14)
            int r2 = r14.a
            r12 = 11
            r1 = 2
            if (r2 == r12) goto L54
            r12 = r2 & 7
            if (r12 != r1) goto L4c
            ax.b6.Y3<?> r12 = r9.d
            ax.b6.W3 r0 = r14.d
            ax.b6.U4 r1 = r9.a
            int r3 = r2 >>> 3
            java.lang.Object r12 = r12.c(r0, r1, r3)
            r0 = r12
            ax.b6.k4$f r0 = (ax.b6.AbstractC1599k4.f) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r7 = r14
            int r12 = ax.b6.C1694w3.d(r2, r3, r4, r5, r6, r7)
            goto L19
        L43:
            ax.b6.C1582i5.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            r3 = r11
            r5 = r13
            r7 = r14
            int r12 = ax.b6.C1694w3.b(r2, r3, r4, r5, r7)
            goto L19
        L54:
            r3 = r11
            r5 = r13
            r7 = r14
            r11 = 0
            r12 = r10
        L59:
            if (r4 >= r5) goto La0
            int r13 = ax.b6.C1694w3.p(r3, r4, r7)
            int r14 = r7.a
            int r2 = r14 >>> 3
            r4 = r14 & 7
            if (r2 == r1) goto L81
            r8 = 3
            if (r2 == r8) goto L6b
            goto L97
        L6b:
            if (r0 != 0) goto L78
            if (r4 != r1) goto L97
            int r4 = ax.b6.C1694w3.k(r3, r13, r7)
            java.lang.Object r12 = r7.c
            ax.b6.B3 r12 = (ax.b6.B3) r12
            goto L59
        L78:
            ax.b6.C1582i5.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L81:
            if (r4 != 0) goto L97
            int r4 = ax.b6.C1694w3.p(r3, r13, r7)
            int r11 = r7.a
            ax.b6.Y3<?> r13 = r9.d
            ax.b6.W3 r14 = r7.d
            ax.b6.U4 r0 = r9.a
            java.lang.Object r13 = r13.c(r14, r0, r11)
            r0 = r13
            ax.b6.k4$f r0 = (ax.b6.AbstractC1599k4.f) r0
            goto L59
        L97:
            r2 = 12
            if (r14 == r2) goto La1
            int r4 = ax.b6.C1694w3.b(r14, r3, r13, r5, r7)
            goto L59
        La0:
            r13 = r4
        La1:
            if (r12 == 0) goto La9
            int r11 = r11 << 3
            r11 = r11 | r1
            r6.e(r11, r12)
        La9:
            r12 = r13
            r11 = r3
            r13 = r5
            r14 = r7
            goto L19
        Laf:
            r5 = r13
            if (r12 != r5) goto Lb3
            return
        Lb3:
            ax.b6.s4 r10 = ax.b6.C1663s4.e()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.b6.Z4.h(java.lang.Object, byte[], int, int, ax.b6.v3):void");
    }

    @Override // ax.b6.InterfaceC1609l5
    public final boolean i(T t, T t2) {
        if (!this.b.k(t).equals(this.b.k(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.b(t).equals(this.d.b(t2));
        }
        return true;
    }
}
