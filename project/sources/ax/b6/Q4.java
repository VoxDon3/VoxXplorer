package ax.b6;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class Q4 implements N4 {
    Q4() {
    }

    @Override // ax.b6.N4
    public final L4<?, ?> b(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // ax.b6.N4
    public final Map<?, ?> c(Object obj) {
        return (O4) obj;
    }

    @Override // ax.b6.N4
    public final Map<?, ?> d(Object obj) {
        return (O4) obj;
    }

    @Override // ax.b6.N4
    public final Object e(Object obj) {
        ((O4) obj).i();
        return obj;
    }

    @Override // ax.b6.N4
    public final Object f(Object obj) {
        return O4.c().f();
    }

    @Override // ax.b6.N4
    public final Object g(Object obj, Object obj2) {
        O4 o4 = (O4) obj;
        O4 o42 = (O4) obj2;
        if (!o42.isEmpty()) {
            if (!o4.j()) {
                o4 = o4.f();
            }
            o4.d(o42);
        }
        return o4;
    }

    @Override // ax.b6.N4
    public final boolean h(Object obj) {
        return !((O4) obj).j();
    }

    @Override // ax.b6.N4
    public final int i(int i, Object obj, Object obj2) {
        O4 o4 = (O4) obj;
        if (o4.isEmpty()) {
            return 0;
        }
        Iterator it = o4.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
