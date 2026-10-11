package ax.W5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ax.W5.z1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1088z1 implements Iterator {
    C1088z1() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
