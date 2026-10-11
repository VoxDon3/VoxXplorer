package ax.ge;

import ax.be.C1735c;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* loaded from: classes3.dex */
final class c extends f {
    private final d l;
    private final int[] m;
    private final g n;
    private final int o;
    private final int p;
    private int q;
    private int r;

    c(int i, int i2, int i3, int i4, int i5, int i6, C1735c c1735c) {
        super(i, i2, i3, i4, i5, c1735c);
        this.q = -1;
        this.l = new d(i, c1735c);
        int i7 = i + 1;
        this.p = i7;
        this.m = c1735c.c(i7, false);
        this.r = i7;
        this.n = new g(i4 - 1);
        this.o = i6 <= 0 ? (i4 / 4) + 4 : i6;
    }

    private int w() {
        int n = n(4, 4);
        if (n != 0) {
            int i = this.r + 1;
            this.r = i;
            if (i == Integer.MAX_VALUE) {
                int i2 = SubsamplingScaleImageView.TILE_SIZE_AUTO - this.p;
                this.l.f(i2);
                f.p(this.m, this.p, i2);
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[ADDED_TO_REGION, LOOP:0: B:23:0x008f->B:26:0x009f, LOOP_START, PHI: r10
      0x008f: PHI (r10v15 int) = (r10v2 int), (r10v16 int) binds: [B:22:0x008d, B:26:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    @Override // ax.ge.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ax.ge.g j() {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.ge.c.j():ax.ge.g");
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
            if (w() != 0) {
                this.l.a(this.e, this.g);
                this.m[this.q] = this.l.d();
                this.l.h(this.r);
            }
            i = i2;
        }
    }
}
