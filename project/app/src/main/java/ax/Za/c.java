/*
 * Decompiled with CFR 0.152.
 */
package ax.Za;

import java.util.Arrays;

final class c<K, V> {
    private final d<K, V> a;

    c() {
        this(null);
    }

    private c(d<K, V> d8) {
        this.a = d8;
    }

    public V a(K k8) {
        d<K, V> d8 = this.a;
        if (d8 == null) {
            return null;
        }
        return d8.a(k8, k8.hashCode(), 0);
    }

    public c<K, V> b(K k8, V v8) {
        d<K, V> d8 = this.a;
        if (d8 == null) {
            return new c<K, V>(new c<K, V>(k8, v8));
        }
        return new c<K, V>(d8.b(k8, v8, k8.hashCode(), 0));
    }

    static final class a<K, V>
    implements d<K, V> {
        private final K[] a;
        private final V[] b;

        a(K k8, V v8, K k9, V v9) {
            this(new Object[]{k8, k9}, new Object[]{v8, v9});
        }

        private a(K[] KArray, V[] VArray) {
            this.a = KArray;
            this.b = VArray;
        }

        private int c(K k8) {
            K[] KArray;
            for (int i8 = 0; i8 < (KArray = this.a).length; ++i8) {
                if (KArray[i8] != k8) continue;
                return i8;
            }
            return -1;
        }

        @Override
        public V a(K k8, int n8, int n9) {
            K[] KArray;
            for (n8 = 0; n8 < (KArray = this.a).length; ++n8) {
                if (KArray[n8] != k8) continue;
                return this.b[n8];
            }
            return null;
        }

        @Override
        public d<K, V> b(K k8, V v8, int n8, int n9) {
            int n10 = this.a[0].hashCode();
            if (n10 != n8) {
                return ax.Za.c$b.c(new c<K, V>(k8, v8), n8, this, n10, n9);
            }
            n8 = this.c(k8);
            if (n8 != -1) {
                K[] KArray = this.a;
                KArray = Arrays.copyOf(KArray, KArray.length);
                V[] VArray = Arrays.copyOf(this.b, this.a.length);
                KArray[n8] = k8;
                VArray[n8] = v8;
                return new a<K, V>(KArray, VArray);
            }
            Object[] objectArray = this.a;
            K[] KArray = Arrays.copyOf(objectArray, objectArray.length + 1);
            objectArray = Arrays.copyOf(this.b, this.a.length + 1);
            K[] KArray2 = this.a;
            KArray[KArray2.length] = k8;
            objectArray[KArray2.length] = v8;
            return new a<K, K>(KArray, objectArray);
        }

        @Override
        public int size() {
            return this.b.length;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CollisionLeaf(");
            for (int i8 = 0; i8 < this.b.length; ++i8) {
                stringBuilder.append("(key=");
                stringBuilder.append(this.a[i8]);
                stringBuilder.append(" value=");
                stringBuilder.append(this.b[i8]);
                stringBuilder.append(") ");
            }
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    static final class b<K, V>
    implements d<K, V> {
        final int a;
        final d<K, V>[] b;
        private final int c;

        private b(int n8, d<K, V>[] dArray, int n9) {
            this.a = n8;
            this.b = dArray;
            this.c = n9;
        }

        static <K, V> d<K, V> c(d<K, V> d8, int n8, d<K, V> d9, int n9, int n10) {
            int n11;
            int n12 = ax.Za.c$b.e(n8, n10);
            if (n12 == (n11 = ax.Za.c$b.e(n9, n10))) {
                d8 = ax.Za.c$b.c(d8, n8, d9, n9, n10 + 5);
                n8 = d8.size();
                return new b<K, V>(n12, new d[]{d8}, n8);
            }
            d<K, V> d10 = d8;
            d<K, V> d11 = d9;
            if (ax.Za.c$b.f(n8, n10) > ax.Za.c$b.f(n9, n10)) {
                d11 = d8;
                d10 = d9;
            }
            n9 = d10.size();
            n8 = d11.size();
            return new b<K, V>(n12 | n11, new d[]{d10, d11}, n9 + n8);
        }

        private int d(int n8) {
            return Integer.bitCount(n8 - 1 & this.a);
        }

        private static int e(int n8, int n9) {
            return 1 << ax.Za.c$b.f(n8, n9);
        }

        private static int f(int n8, int n9) {
            return n8 >>> n9 & 0x1F;
        }

        @Override
        public V a(K k8, int n8, int n9) {
            int n10 = ax.Za.c$b.e(n8, n9);
            if ((this.a & n10) == 0) {
                return null;
            }
            n10 = this.d(n10);
            return this.b[n10].a(k8, n8, n9 + 5);
        }

        @Override
        public d<K, V> b(K object, V v8, int n8, int n9) {
            int n10 = ax.Za.c$b.e(n8, n9);
            int n11 = this.d(n10);
            int n12 = this.a;
            if ((n12 & n10) == 0) {
                d<K, V>[] dArray = this.b;
                d[] dArray2 = new d[dArray.length + 1];
                System.arraycopy(dArray, 0, dArray2, 0, n11);
                dArray2[n11] = new c<K, V>(object, v8);
                object = this.b;
                System.arraycopy(object, n11, dArray2, n11 + 1, ((K)object).length - n11);
                return new b<K, V>(n12 | n10, dArray2, this.size() + 1);
            }
            d<K, V>[] dArray = this.b;
            dArray = Arrays.copyOf(dArray, dArray.length);
            dArray[n11] = this.b[n11].b(object, v8, n8, n9 + 5);
            n8 = this.size();
            n9 = dArray[n11].size();
            n11 = this.b[n11].size();
            return new b<K, V>(this.a, dArray, n8 + n9 - n11);
        }

        @Override
        public int size() {
            return this.c;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CompressedIndex(");
            d<K, V>[] dArray = Integer.toBinaryString(this.a);
            stringBuilder.append(String.format("bitmap=%s ", new Object[]{dArray}));
            dArray = this.b;
            int n8 = dArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                stringBuilder.append(dArray[i8]);
                stringBuilder.append(" ");
            }
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    static final class c<K, V>
    implements d<K, V> {
        private final K a;
        private final V b;

        public c(K k8, V v8) {
            this.a = k8;
            this.b = v8;
        }

        @Override
        public V a(K k8, int n8, int n9) {
            if (this.a == k8) {
                return this.b;
            }
            return null;
        }

        @Override
        public d<K, V> b(K k8, V v8, int n8, int n9) {
            int n10 = this.a.hashCode();
            if (n10 != n8) {
                return ax.Za.c$b.c(new c<K, V>(k8, v8), n8, this, n10, n9);
            }
            if (this.a == k8) {
                return new c<K, V>(k8, v8);
            }
            return new a<K, V>(this.a, this.b, k8, v8);
        }

        @Override
        public int size() {
            return 1;
        }

        public String toString() {
            return String.format("Leaf(key=%s value=%s)", this.a, this.b);
        }
    }

    static interface d<K, V> {
        public V a(K var1, int var2, int var3);

        public d<K, V> b(K var1, V var2, int var3, int var4);

        public int size();
    }
}

