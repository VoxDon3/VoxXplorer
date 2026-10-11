package j$.nio.file;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class s implements Iterator {
    public final Iterator a;

    public s(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return x.b(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
