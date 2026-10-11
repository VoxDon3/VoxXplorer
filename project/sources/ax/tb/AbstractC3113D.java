package ax.tb;

import java.util.Iterator;

/* renamed from: ax.tb.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3113D implements Iterator<Integer>, ax.Hb.a {
    public abstract int b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
