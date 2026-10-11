/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.k;
import ax.r0.u;
import ax.r0.u0;
import java.io.IOException;

public class K<K, V> {
    private final a<K, V> a;
    private final K b;
    private final V c;

    private K(u0.b b8, K k8, u0.b b9, V v8) {
        this.a = new a<K, V>(b8, k8, b9, v8);
        this.b = k8;
        this.c = v8;
    }

    static <K, V> int b(a<K, V> a8, K k8, V v8) {
        return u.d(a8.a, 1, k8) + u.d(a8.c, 2, v8);
    }

    public static <K, V> K<K, V> d(u0.b b8, K k8, u0.b b9, V v8) {
        return new K<K, V>(b8, k8, b9, v8);
    }

    static <K, V> void e(k k8, a<K, V> a8, K k9, V v8) throws IOException {
        u.z(k8, a8.a, 1, k9);
        u.z(k8, a8.c, 2, v8);
    }

    public int a(int n8, K k8, V v8) {
        return k.V(n8) + k.C(K.b(this.a, k8, v8));
    }

    a<K, V> c() {
        return this.a;
    }

    static class a<K, V> {
        public final u0.b a;
        public final K b;
        public final u0.b c;
        public final V d;

        public a(u0.b b8, K k8, u0.b b9, V v8) {
            this.a = b8;
            this.b = k8;
            this.c = b9;
            this.d = v8;
        }
    }
}

