package ax.b6;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ax.b6.v5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1688v5 implements Iterator {
    private boolean c0;
    private Iterator d0;
    private final /* synthetic */ C1617m5 e0;
    private int q;

    private final Iterator b() {
        Map map;
        if (this.d0 == null) {
            map = this.e0.c0;
            this.d0 = map.entrySet().iterator();
        }
        return this.d0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.q + 1;
        list = this.e0.q;
        if (i >= list.size()) {
            map = this.e0.c0;
            if (map.isEmpty() || !b().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.c0 = true;
        int i = this.q + 1;
        this.q = i;
        list = this.e0.q;
        if (i >= list.size()) {
            return (Map.Entry) b().next();
        }
        list2 = this.e0.q;
        return (Map.Entry) list2.get(this.q);
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.c0) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.c0 = false;
        this.e0.q();
        int i = this.q;
        list = this.e0.q;
        if (i >= list.size()) {
            b().remove();
            return;
        }
        C1617m5 c1617m5 = this.e0;
        int i2 = this.q;
        this.q = i2 - 1;
        c1617m5.i(i2);
    }

    private C1688v5(C1617m5 c1617m5) {
        this.e0 = c1617m5;
        this.q = -1;
    }
}
