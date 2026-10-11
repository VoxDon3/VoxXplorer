package ax.W5;

import java.util.NoSuchElementException;

/* renamed from: ax.W5.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1040j0 extends AbstractC1046l0 {
    private final int c0;
    final /* synthetic */ AbstractC1069t0 d0;
    private int q = 0;

    C1040j0(AbstractC1069t0 abstractC1069t0) {
        this.d0 = abstractC1069t0;
        this.c0 = abstractC1069t0.h();
    }

    @Override // ax.W5.InterfaceC1055o0
    public final byte a() {
        int i = this.q;
        if (i >= this.c0) {
            throw new NoSuchElementException();
        }
        this.q = i + 1;
        return this.d0.g(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.q < this.c0;
    }
}
