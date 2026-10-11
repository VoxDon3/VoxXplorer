package ax.r0;

import ax.r0.K;
import java.util.Map;

/* loaded from: classes.dex */
class N implements M {
    N() {
    }

    private static <K, V> int i(int i, Object obj, Object obj2) {
        L l = (L) obj;
        K k = (K) obj2;
        int i2 = 0;
        if (l.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : l.entrySet()) {
            i2 += k.a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    private static <K, V> L<K, V> j(Object obj, Object obj2) {
        L<K, V> l = (L) obj;
        L<K, V> l2 = (L) obj2;
        if (!l2.isEmpty()) {
            if (!l.l()) {
                l = l.o();
            }
            l.n(l2);
        }
        return l;
    }

    @Override // ax.r0.M
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // ax.r0.M
    public Object b(Object obj) {
        ((L) obj).m();
        return obj;
    }

    @Override // ax.r0.M
    public K.a<?, ?> c(Object obj) {
        return ((K) obj).c();
    }

    @Override // ax.r0.M
    public Map<?, ?> d(Object obj) {
        return (L) obj;
    }

    @Override // ax.r0.M
    public Object e(Object obj) {
        return L.f().o();
    }

    @Override // ax.r0.M
    public int f(int i, Object obj, Object obj2) {
        return i(i, obj, obj2);
    }

    @Override // ax.r0.M
    public boolean g(Object obj) {
        return !((L) obj).l();
    }

    @Override // ax.r0.M
    public Map<?, ?> h(Object obj) {
        return (L) obj;
    }
}
