package ax.Lb;

import ax.tb.AbstractC3113D;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class d extends AbstractC3113D {
    private final int c0;
    private boolean d0;
    private int e0;
    private final int q;

    public d(int i, int i2, int i3) {
        this.q = i3;
        this.c0 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.d0 = z;
        this.e0 = z ? i : i2;
    }

    @Override // ax.tb.AbstractC3113D
    public int b() {
        int i = this.e0;
        if (i != this.c0) {
            this.e0 = this.q + i;
            return i;
        }
        if (!this.d0) {
            throw new NoSuchElementException();
        }
        this.d0 = false;
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.d0;
    }
}
