/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.K;
import ax.r0.L;
import ax.r0.M;
import java.util.AbstractMap;
import java.util.Map;

class N
implements M {
    N() {
    }

    private static <K, V> int i(int n8, Object object, Object iterator) {
        L object22 = (L)object;
        object = (K)((Object)iterator);
        boolean bl = ((AbstractMap)object22).isEmpty();
        int n9 = 0;
        if (bl) {
            return 0;
        }
        for (Map.Entry entry : object22.entrySet()) {
            n9 += ((K)object).a(n8, entry.getKey(), entry.getValue());
        }
        return n9;
    }

    private static <K, V> L<K, V> j(Object l8, Object object) {
        L l9 = l8;
        object = (L)object;
        l8 = l9;
        if (!((AbstractMap)object).isEmpty()) {
            l8 = l9;
            if (!l9.l()) {
                l8 = l9.o();
            }
            l8.n(object);
        }
        return l8;
    }

    @Override
    public Object a(Object object, Object object2) {
        return N.j(object, object2);
    }

    @Override
    public Object b(Object object) {
        ((L)object).m();
        return object;
    }

    @Override
    public K.a<?, ?> c(Object object) {
        return ((K)object).c();
    }

    @Override
    public Map<?, ?> d(Object object) {
        return (L)object;
    }

    @Override
    public Object e(Object object) {
        return L.f().o();
    }

    @Override
    public int f(int n8, Object object, Object object2) {
        return N.i(n8, object, object2);
    }

    @Override
    public boolean g(Object object) {
        return ((L)object).l() ^ true;
    }

    @Override
    public Map<?, ?> h(Object object) {
        return (L)object;
    }
}

