/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.L4;
import ax.b6.M4;
import ax.b6.N4;
import ax.b6.O4;
import java.util.AbstractMap;
import java.util.Map;

final class Q4
implements N4 {
    Q4() {
    }

    @Override
    public final L4<?, ?> b(Object object) {
        object = (M4)object;
        throw new NoSuchMethodError();
    }

    @Override
    public final Map<?, ?> c(Object object) {
        return (O4)object;
    }

    @Override
    public final Map<?, ?> d(Object object) {
        return (O4)object;
    }

    @Override
    public final Object e(Object object) {
        ((O4)object).i();
        return object;
    }

    @Override
    public final Object f(Object object) {
        return O4.c().f();
    }

    @Override
    public final Object g(Object o42, Object object) {
        O4 o43 = o42;
        object = (O4)object;
        o42 = o43;
        if (!((AbstractMap)object).isEmpty()) {
            o42 = o43;
            if (!o43.j()) {
                o42 = o43.f();
            }
            o42.d(object);
        }
        return o42;
    }

    @Override
    public final boolean h(Object object) {
        return !((O4)object).j();
    }

    @Override
    public final int i(int n8, Object object, Object object2) {
        object = (O4)object;
        object2 = (M4)object2;
        if (((AbstractMap)object).isEmpty()) {
            return 0;
        }
        if (!(object = ((O4)object).entrySet().iterator()).hasNext()) {
            return 0;
        }
        object = object.next();
        object.getKey();
        object.getValue();
        throw new NoSuchMethodError();
    }
}

