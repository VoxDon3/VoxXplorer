package ax.N1;

import ax.S0.C0968a;
import ax.S0.d0;
import ax.q7.InterfaceC2879f;
import ax.r7.AbstractC2991z;
import ax.r7.T;

/* loaded from: classes.dex */
final class g implements k {
    private static final T<e> d0 = T.d().f(new InterfaceC2879f() { // from class: ax.N1.f
        @Override // ax.q7.InterfaceC2879f
        public final Object apply(Object obj) {
            Comparable valueOf;
            valueOf = Long.valueOf(g.c(((e) obj).b));
            return valueOf;
        }
    });
    private final long[] c0;
    private final AbstractC2991z<AbstractC2991z<ax.R0.a>> q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(java.util.List<ax.N1.e> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 2
            r2 = 0
            r0.<init>()
            int r3 = r18.size()
            r4 = 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != r4) goto L4c
            java.lang.Object r3 = ax.r7.F.h(r18)
            ax.N1.e r3 = (ax.N1.e) r3
            long r7 = r3.b
            long r7 = c(r7)
            long r9 = r3.c
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 != 0) goto L34
            ax.r7.z<ax.R0.a> r1 = r3.a
            ax.r7.z r1 = ax.r7.AbstractC2991z.A(r1)
            r0.q = r1
            long[] r1 = new long[r4]
            r1[r2] = r7
            r0.c0 = r1
            return
        L34:
            ax.r7.z<ax.R0.a> r5 = r3.a
            ax.r7.z r6 = ax.r7.AbstractC2991z.z()
            ax.r7.z r5 = ax.r7.AbstractC2991z.B(r5, r6)
            r0.q = r5
            long r5 = r3.c
            long r5 = r5 + r7
            long[] r1 = new long[r1]
            r1[r2] = r7
            r1[r4] = r5
            r0.c0 = r1
            return
        L4c:
            int r3 = r18.size()
            int r3 = r3 * 2
            long[] r1 = new long[r3]
            r0.c0 = r1
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r1, r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ax.r7.T<ax.N1.e> r3 = ax.N1.g.d0
            r7 = r18
            ax.r7.z r3 = ax.r7.AbstractC2991z.J(r3, r7)
            r7 = 0
        L6c:
            int r8 = r3.size()
            if (r2 >= r8) goto Ld7
            java.lang.Object r8 = r3.get(r2)
            ax.N1.e r8 = (ax.N1.e) r8
            long r9 = r8.b
            long r9 = c(r9)
            long r11 = r8.c
            long r11 = r11 + r9
            if (r7 == 0) goto Lb5
            long[] r13 = r0.c0
            int r14 = r7 + (-1)
            r15 = r13[r14]
            int r13 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r13 >= 0) goto L8e
            goto Lb5
        L8e:
            int r13 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r13 != 0) goto La4
            java.lang.Object r13 = r1.get(r14)
            ax.r7.z r13 = (ax.r7.AbstractC2991z) r13
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto La4
            ax.r7.z<ax.R0.a> r9 = r8.a
            r1.set(r14, r9)
            goto Lc1
        La4:
            java.lang.String r13 = "CuesWithTimingSubtitle"
            java.lang.String r15 = "Truncating unsupported overlapping cues."
            ax.S0.C0987u.h(r13, r15)
            long[] r13 = r0.c0
            r13[r14] = r9
            ax.r7.z<ax.R0.a> r9 = r8.a
            r1.set(r14, r9)
            goto Lc1
        Lb5:
            long[] r13 = r0.c0
            int r14 = r7 + 1
            r13[r7] = r9
            ax.r7.z<ax.R0.a> r7 = r8.a
            r1.add(r7)
            r7 = r14
        Lc1:
            long r8 = r8.c
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 == 0) goto Ld5
            long[] r8 = r0.c0
            int r9 = r7 + 1
            r8[r7] = r11
            ax.r7.z r7 = ax.r7.AbstractC2991z.z()
            r1.add(r7)
            r7 = r9
        Ld5:
            int r2 = r2 + r4
            goto L6c
        Ld7:
            ax.r7.z r1 = ax.r7.AbstractC2991z.u(r1)
            r0.q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.N1.g.<init>(java.util.List):void");
    }

    private static long c(long j) {
        if (j == -9223372036854775807L) {
            return 0L;
        }
        return j;
    }

    @Override // ax.N1.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC2991z<ax.R0.a> j(long j) {
        int h = d0.h(this.c0, j, true, false);
        return h == -1 ? AbstractC2991z.z() : this.q.get(h);
    }

    @Override // ax.N1.k
    public int d(long j) {
        int d = d0.d(this.c0, j, false, false);
        if (d < this.q.size()) {
            return d;
        }
        return -1;
    }

    @Override // ax.N1.k
    public long h(int i) {
        C0968a.a(i < this.q.size());
        return this.c0[i];
    }

    @Override // ax.N1.k
    public int l() {
        return this.q.size();
    }
}
