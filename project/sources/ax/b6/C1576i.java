package ax.b6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ax.b6.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1576i implements Iterator<InterfaceC1658s> {
    private final /* synthetic */ C1558g c0;
    private int q = 0;

    C1576i(C1558g c1558g) {
        this.c0 = c1558g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.q < this.c0.t();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ InterfaceC1658s next() {
        if (this.q < this.c0.t()) {
            C1558g c1558g = this.c0;
            int i = this.q;
            this.q = i + 1;
            return c1558g.q(i);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.q);
    }
}
