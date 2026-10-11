package ax.W5;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class E1 implements Iterator {
    private boolean c0;
    private Iterator d0;
    final /* synthetic */ I1 e0;
    private int q = -1;

    private final Iterator b() {
        Map map;
        if (this.d0 == null) {
            map = this.e0.d0;
            this.d0 = map.entrySet().iterator();
        }
        return this.d0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.q + 1;
        list = this.e0.c0;
        if (i < list.size()) {
            return true;
        }
        map = this.e0.d0;
        return !map.isEmpty() && b().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.c0 = true;
        int i = this.q + 1;
        this.q = i;
        list = this.e0.c0;
        if (i >= list.size()) {
            return (Map.Entry) b().next();
        }
        list2 = this.e0.c0;
        return (Map.Entry) list2.get(this.q);
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.c0) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.c0 = false;
        this.e0.o();
        int i = this.q;
        list = this.e0.c0;
        if (i >= list.size()) {
            b().remove();
            return;
        }
        I1 i1 = this.e0;
        int i2 = this.q;
        this.q = i2 - 1;
        i1.m(i2);
    }
}
