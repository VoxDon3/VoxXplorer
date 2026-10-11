package ax.r0;

import ax.r0.u0;
import java.io.IOException;

/* loaded from: classes.dex */
public class K<K, V> {
    private final a<K, V> a;
    private final K b;
    private final V c;

    static class a<K, V> {
        public final u0.b a;
        public final K b;
        public final u0.b c;
        public final V d;

        public a(u0.b bVar, K k, u0.b bVar2, V v) {
            this.a = bVar;
            this.b = k;
            this.c = bVar2;
            this.d = v;
        }
    }

    private K(u0.b bVar, K k, u0.b bVar2, V v) {
        this.a = new a<>(bVar, k, bVar2, v);
        this.b = k;
        this.c = v;
    }

    static <K, V> int b(a<K, V> aVar, K k, V v) {
        return C2933u.d(aVar.a, 1, k) + C2933u.d(aVar.c, 2, v);
    }

    public static <K, V> K<K, V> d(u0.b bVar, K k, u0.b bVar2, V v) {
        return new K<>(bVar, k, bVar2, v);
    }

    static <K, V> void e(AbstractC2924k abstractC2924k, a<K, V> aVar, K k, V v) throws IOException {
        C2933u.z(abstractC2924k, aVar.a, 1, k);
        C2933u.z(abstractC2924k, aVar.c, 2, v);
    }

    public int a(int i, K k, V v) {
        return AbstractC2924k.V(i) + AbstractC2924k.C(b(this.a, k, v));
    }

    a<K, V> c() {
        return this.a;
    }
}
