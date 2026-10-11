package ax.ge;

import ax.be.C1735c;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* loaded from: classes3.dex */
final class a extends f {
    private final d l;
    private final int[] m;
    private final g n;
    private final int o;
    private final int p;
    private int q;
    private int r;

    a(int i, int i2, int i3, int i4, int i5, int i6, C1735c c1735c) {
        super(i, i2, i3, i4, i5, c1735c);
        this.q = -1;
        int i7 = i + 1;
        this.p = i7;
        this.r = i7;
        this.l = new d(i, c1735c);
        this.m = c1735c.c(i7 * 2, false);
        this.n = new g(i4 - 1);
        this.o = i6 <= 0 ? (i4 / 2) + 16 : i6;
    }

    private int w() {
        int n = n(this.d, 4);
        if (n != 0) {
            int i = this.r + 1;
            this.r = i;
            if (i == Integer.MAX_VALUE) {
                int i2 = SubsamplingScaleImageView.TILE_SIZE_AUTO - this.p;
                this.l.f(i2);
                f.p(this.m, this.p * 2, i2);
                this.r -= i2;
            }
            int i3 = this.q + 1;
            this.q = i3;
            if (i3 == this.p) {
                this.q = 0;
            }
        }
        return n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        r13 = r12.m;
        r13[r2] = 0;
        r13[r1] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void x(int r13, int r14) {
        /*
            r12 = this;
            int r0 = r12.o
            int r1 = r12.q
            int r2 = r1 << 1
            int r2 = r2 + 1
            int r1 = r1 << 1
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            int r6 = r12.r
            int r6 = r6 - r14
            int r7 = r0 + (-1)
            if (r0 == 0) goto L7c
            int r0 = r12.p
            if (r6 < r0) goto L19
            goto L7c
        L19:
            int r8 = r12.q
            int r9 = r8 - r6
            if (r6 <= r8) goto L20
            goto L21
        L20:
            r0 = 0
        L21:
            int r9 = r9 + r0
            int r0 = r9 << 1
            int r8 = java.lang.Math.min(r4, r5)
            byte[] r9 = r12.e
            int r10 = r12.g
            int r11 = r10 + r8
            int r11 = r11 - r6
            r11 = r9[r11]
            int r10 = r10 + r8
            r9 = r9[r10]
            if (r11 != r9) goto L55
        L36:
            int r8 = r8 + 1
            if (r8 != r13) goto L47
            int[] r13 = r12.m
            r14 = r13[r0]
            r13[r1] = r14
            int r0 = r0 + 1
            r14 = r13[r0]
            r13[r2] = r14
            return
        L47:
            byte[] r9 = r12.e
            int r10 = r12.g
            int r11 = r10 + r8
            int r11 = r11 - r6
            r11 = r9[r11]
            int r10 = r10 + r8
            r9 = r9[r10]
            if (r11 == r9) goto L36
        L55:
            byte[] r9 = r12.e
            int r10 = r12.g
            int r11 = r10 + r8
            int r11 = r11 - r6
            r6 = r9[r11]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r10 = r10 + r8
            r9 = r9[r10]
            r9 = r9 & 255(0xff, float:3.57E-43)
            if (r6 >= r9) goto L72
            int[] r5 = r12.m
            r5[r1] = r14
            int r0 = r0 + 1
            r14 = r5[r0]
            r1 = r0
            r5 = r8
            goto L7a
        L72:
            int[] r4 = r12.m
            r4[r2] = r14
            r14 = r4[r0]
            r2 = r0
            r4 = r8
        L7a:
            r0 = r7
            goto Ld
        L7c:
            int[] r13 = r12.m
            r13[r2] = r3
            r13[r1] = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.ge.a.x(int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0150, code lost:
    
        r1 = r19.m;
        r1[r7] = 0;
        r1[r5] = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b A[ADDED_TO_REGION, LOOP:0: B:23:0x008b->B:26:0x009b, LOOP_START, PHI: r11
      0x008b: PHI (r11v8 int) = (r11v2 int), (r11v9 int) binds: [B:22:0x0089, B:26:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    @Override // ax.ge.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ax.ge.g j() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.ge.a.j():ax.ge.g");
    }

    @Override // ax.ge.f
    public void r(C1735c c1735c) {
        c1735c.e(this.m);
        this.l.g(c1735c);
        super.r(c1735c);
    }

    @Override // ax.ge.f
    public void v(int i) {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            int i3 = this.d;
            int w = w();
            if (w < i3) {
                if (w == 0) {
                    i = i2;
                } else {
                    i3 = w;
                }
            }
            this.l.a(this.e, this.g);
            int d = this.l.d();
            this.l.h(this.r);
            x(i3, d);
            i = i2;
        }
    }
}
