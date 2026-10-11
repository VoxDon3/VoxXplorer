package ax.h4;

import ax.k4.i;

/* loaded from: classes.dex */
public abstract class c<Z> extends AbstractC2150a<Z> {
    private final int c0;
    private final int d0;

    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // ax.h4.e
    public final void g(d dVar) {
        if (i.r(this.c0, this.d0)) {
            dVar.e(this.c0, this.d0);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.c0 + " and height: " + this.d0 + ", either provide dimensions in the constructor or call override()");
    }

    public c(int i, int i2) {
        this.c0 = i;
        this.d0 = i2;
    }

    @Override // ax.h4.e
    public void d(d dVar) {
    }
}
