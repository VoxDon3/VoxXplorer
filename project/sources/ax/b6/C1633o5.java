package ax.b6;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ax.b6.o5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1633o5 implements Iterator {
    private Iterator c0;
    private final /* synthetic */ C1617m5 d0;
    private int q;

    private final Iterator b() {
        Map map;
        if (this.c0 == null) {
            map = this.d0.f0;
            this.c0 = map.entrySet().iterator();
        }
        return this.c0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.q;
        if (i > 0) {
            list = this.d0.q;
            if (i <= list.size()) {
                return true;
            }
        }
        return b().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (b().hasNext()) {
            return (Map.Entry) b().next();
        }
        list = this.d0.q;
        int i = this.q - 1;
        this.q = i;
        return (Map.Entry) list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private C1633o5(C1617m5 c1617m5) {
        List list;
        this.d0 = c1617m5;
        list = c1617m5.q;
        this.q = list.size();
    }
}
