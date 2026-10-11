/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.r7.A;
import ax.r7.C;
import ax.r7.i;
import ax.r7.j0;
import ax.r7.w;
import ax.r7.x;
import ax.r7.z;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;

final class W<K, V>
extends A<K, V> {
    static final A<Object, Object> i0 = new W<Object, Object>(null, new Object[0], 0);
    private final transient Object f0;
    final transient Object[] g0;
    private final transient int h0;

    private W(Object object, Object[] objectArray, int n8) {
        this.f0 = object;
        this.g0 = objectArray;
        this.h0 = n8;
    }

    static <K, V> W<K, V> m(int n8, Object[] objectArray, A.a<K, V> object) {
        Object object2;
        if (n8 == 0) {
            return (W)i0;
        }
        if (n8 == 1) {
            Object object3 = objectArray[0];
            j.Objects.requireNonNull((Object)object3);
            object = objectArray[1];
            j.Objects.requireNonNull((Object)object);
            i.a(object3, object);
            return new W<K, V>(null, objectArray, 1);
        }
        n.q(n8, objectArray.length >> 1);
        Object object4 = object2 = W.n(objectArray, n8, C.r(n8), 0);
        Object[] objectArray2 = objectArray;
        if (object2 instanceof Object[]) {
            objectArray2 = (Object[])object2;
            object4 = (A.a.a)objectArray2[2];
            if (object != null) {
                ((A.a)object).e = object4;
                object4 = objectArray2[0];
                n8 = (Integer)objectArray2[1];
                objectArray2 = Arrays.copyOf(objectArray, n8 * 2);
            } else {
                throw ((A.a.a)object4).a();
            }
        }
        return new W<K, V>(object4, objectArray2, n8);
    }

    private static Object n(Object[] object, int n8, int n9, int n10) {
        Object object2 = null;
        Object object3 = null;
        Object object4 = null;
        if (n8 == 1) {
            object4 = object[n10];
            j.Objects.requireNonNull((Object)object4);
            object = object[n10 ^ 1];
            j.Objects.requireNonNull((Object)object);
            i.a(object4, object);
            return null;
        }
        int n11 = n9 - 1;
        if (n9 <= 128) {
            object2 = new byte[n9];
            Arrays.fill(object2, (byte)-1);
            int n12 = 0;
            block0: for (n9 = 0; n9 < n8; ++n9) {
                int n13 = n9 * 2 + n10;
                int n14 = n12 * 2 + n10;
                Object object5 = object[n13];
                j.Objects.requireNonNull((Object)object5);
                object3 = object[n13 ^ 1];
                j.Objects.requireNonNull((Object)object3);
                i.a(object5, object3);
                n13 = w.b(object5.hashCode());
                while (true) {
                    int n15;
                    if ((n15 = object2[n13 &= n11] & 0xFF) == 255) {
                        object2[n13] = (byte)n14;
                        if (n12 < n9) {
                            object[n14] = object5;
                            object[n14 ^ 1] = object3;
                        }
                        ++n12;
                        continue block0;
                    }
                    if (object5.equals(object[n15])) {
                        n13 = n15 ^ 1;
                        object4 = object[n13];
                        j.Objects.requireNonNull((Object)object4);
                        object4 = new A.a.a(object5, object3, object4);
                        object[n13] = object3;
                        continue block0;
                    }
                    ++n13;
                }
            }
            if (n12 == n8) {
                return object2;
            }
            return new Object[]{object2, n12, object4};
        }
        if (n9 <= 32768) {
            object3 = new short[n9];
            Arrays.fill(object3, (short)-1);
            int n16 = 0;
            object4 = object2;
            block2: for (n9 = 0; n9 < n8; ++n9) {
                int n17 = n9 * 2 + n10;
                int n18 = n16 * 2 + n10;
                Object object6 = object[n17];
                j.Objects.requireNonNull((Object)object6);
                object2 = object[n17 ^ 1];
                j.Objects.requireNonNull((Object)object2);
                i.a(object6, object2);
                n17 = w.b(object6.hashCode());
                while (true) {
                    int n19;
                    if ((n17 = object3[n19 = n17 & n11] & 0xFFFF) == 65535) {
                        object3[n19] = (short)n18;
                        if (n16 < n9) {
                            object[n18] = object6;
                            object[n18 ^ 1] = object2;
                        }
                        ++n16;
                        continue block2;
                    }
                    if (object6.equals(object[n17])) {
                        object4 = object[n17 ^= 1];
                        j.Objects.requireNonNull((Object)object4);
                        object4 = new A.a.a(object6, object2, object4);
                        object[n17] = object2;
                        continue block2;
                    }
                    n17 = n19 + 1;
                }
            }
            if (n16 == n8) {
                return object3;
            }
            return new Object[]{object3, n16, object4};
        }
        object2 = new int[n9];
        Arrays.fill((int[])object2, -1);
        int n20 = 0;
        object4 = object3;
        block4: for (n9 = 0; n9 < n8; ++n9) {
            int n21 = n9 * 2 + n10;
            int n22 = n20 * 2 + n10;
            Object object7 = object[n21];
            j.Objects.requireNonNull((Object)object7);
            object3 = object[n21 ^ 1];
            j.Objects.requireNonNull((Object)object3);
            i.a(object7, object3);
            n21 = w.b(object7.hashCode());
            while (true) {
                byte by;
                if ((by = object2[n21 &= n11]) == -1) {
                    object2[n21] = n22;
                    if (n20 < n9) {
                        object[n22] = object7;
                        object[n22 ^ 1] = object3;
                    }
                    ++n20;
                    continue block4;
                }
                if (object7.equals(object[by])) {
                    n21 = by ^ 1;
                    object4 = object[n21];
                    j.Objects.requireNonNull((Object)object4);
                    object4 = new A.a.a(object7, object3, object4);
                    object[n21] = object3;
                    continue block4;
                }
                ++n21;
            }
        }
        if (n20 == n8) {
            return object2;
        }
        return new Object[]{object2, n20, object4};
    }

    static Object o(Object object, Object[] objectArray, int n8, int n9, Object object2) {
        if (object2 == null) {
            return null;
        }
        if (n8 == 1) {
            object = objectArray[n9];
            j.Objects.requireNonNull((Object)object);
            if (object.equals(object2)) {
                object = objectArray[n9 ^ 1];
                j.Objects.requireNonNull((Object)object);
                return object;
            }
            return null;
        }
        if (object == null) {
            return null;
        }
        if (object instanceof byte[]) {
            object = (byte[])object;
            n9 = ((Object)object).length;
            n8 = w.b(object2.hashCode());
            while (true) {
                int n10;
                if ((n10 = object[n8 &= n9 - 1] & 0xFF) == 255) {
                    return null;
                }
                if (object2.equals(objectArray[n10])) {
                    return objectArray[n10 ^ 1];
                }
                ++n8;
            }
        }
        if (object instanceof short[]) {
            object = (short[])object;
            n9 = ((Object)object).length;
            n8 = w.b(object2.hashCode());
            while (true) {
                int n11;
                if ((n8 = object[n11 = n8 & n9 - 1] & 0xFFFF) == 65535) {
                    return null;
                }
                if (object2.equals(objectArray[n8])) {
                    return objectArray[n8 ^ 1];
                }
                n8 = n11 + 1;
            }
        }
        object = (int[])object;
        n9 = ((Object)object).length;
        n8 = w.b(object2.hashCode());
        Object object3;
        while ((object3 = object[n8 &= n9 - 1]) != -1) {
            if (object2.equals(objectArray[object3])) {
                return objectArray[object3 ^ 1];
            }
            ++n8;
        }
        return null;
    }

    @Override
    C<Map.Entry<K, V>> d() {
        return new a(this, this.g0, 0, this.h0);
    }

    @Override
    C<K> e() {
        return new b<Object>(this, new c(this.g0, 0, this.h0));
    }

    @Override
    x<V> f() {
        return new c(this.g0, 1, this.h0);
    }

    @Override
    public V get(Object object) {
        Object object2;
        object = object2 = W.o(this.f0, this.g0, this.h0, 0, object);
        if (object2 == null) {
            object = null;
        }
        return (V)object;
    }

    @Override
    boolean i() {
        return false;
    }

    @Override
    public int size() {
        return this.h0;
    }

    static class a<K, V>
    extends C<Map.Entry<K, V>> {
        private final transient A<K, V> d0;
        private final transient Object[] e0;
        private final transient int f0;
        private final transient int g0;

        a(A<K, V> a8, Object[] objectArray, int n8, int n9) {
            this.d0 = a8;
            this.e0 = objectArray;
            this.f0 = n8;
            this.g0 = n9;
        }

        @Override
        public boolean contains(Object object) {
            if (object instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry)object;
                object = entry.getKey();
                if ((entry = entry.getValue()) != null && ((Object)entry).equals(this.d0.get(object))) {
                    return true;
                }
            }
            return false;
        }

        @Override
        int g(Object[] objectArray, int n8) {
            return this.e().g(objectArray, n8);
        }

        @Override
        boolean l() {
            return true;
        }

        @Override
        public j0<Map.Entry<K, V>> n() {
            return this.e().n();
        }

        @Override
        public int size() {
            return this.g0;
        }

        @Override
        z<Map.Entry<K, V>> w() {
            return new z<Map.Entry<K, V>>(this){
                final a d0;
                {
                    this.d0 = a8;
                }

                public Map.Entry<K, V> N(int n8) {
                    n.l(n8, this.d0.g0);
                    Object object = this.d0.e0;
                    object = object[this.d0.f0 + (n8 *= 2)];
                    j.Objects.requireNonNull((Object)object);
                    Object object2 = this.d0.e0[n8 + (this.d0.f0 ^ 1)];
                    j.Objects.requireNonNull((Object)object2);
                    return new AbstractMap.SimpleImmutableEntry<Object[], Object>((Object[])object, object2);
                }

                @Override
                public boolean l() {
                    return true;
                }

                @Override
                public int size() {
                    return this.d0.g0;
                }
            };
        }
    }

    static final class b<K>
    extends C<K> {
        private final transient A<K, ?> d0;
        private final transient z<K> e0;

        b(A<K, ?> a8, z<K> z8) {
            this.d0 = a8;
            this.e0 = z8;
        }

        @Override
        public boolean contains(Object object) {
            return this.d0.get(object) != null;
        }

        @Override
        public z<K> e() {
            return this.e0;
        }

        @Override
        int g(Object[] objectArray, int n8) {
            return this.e().g(objectArray, n8);
        }

        @Override
        boolean l() {
            return true;
        }

        @Override
        public j0<K> n() {
            return this.e().n();
        }

        @Override
        public int size() {
            return this.d0.size();
        }
    }

    static final class c
    extends z<Object> {
        private final transient Object[] d0;
        private final transient int e0;
        private final transient int f0;

        c(Object[] objectArray, int n8, int n9) {
            this.d0 = objectArray;
            this.e0 = n8;
            this.f0 = n9;
        }

        @Override
        public Object get(int n8) {
            n.l(n8, this.f0);
            Object object = this.d0[n8 * 2 + this.e0];
            j.Objects.requireNonNull((Object)object);
            return object;
        }

        @Override
        boolean l() {
            return true;
        }

        @Override
        public int size() {
            return this.f0;
        }
    }
}

