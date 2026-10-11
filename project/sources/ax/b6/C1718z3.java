package ax.b6;

import java.util.NoSuchElementException;

/* renamed from: ax.b6.z3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1718z3 extends C3 {
    private final int c0;
    private final /* synthetic */ B3 d0;
    private int q = 0;

    C1718z3(B3 b3) {
        this.d0 = b3;
        this.c0 = b3.s();
    }

    @Override // ax.b6.H3
    public final byte a() {
        int i = this.q;
        if (i >= this.c0) {
            throw new NoSuchElementException();
        }
        this.q = i + 1;
        return this.d0.r(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.q < this.c0;
    }
}
