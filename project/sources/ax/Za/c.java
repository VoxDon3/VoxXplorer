package ax.Za;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class c<K, V> {
    private final d<K, V> a;

    static final class a<K, V> implements d<K, V> {
        private final K[] a;
        private final V[] b;

        a(K k, V v, K k2, V v2) {
            this(new Object[]{k, k2}, new Object[]{v, v2});
        }

        private int c(K k) {
            int i = 0;
            while (true) {
                K[] kArr = this.a;
                if (i >= kArr.length) {
                    return -1;
                }
                if (kArr[i] == k) {
                    return i;
                }
                i++;
            }
        }

        @Override // ax.Za.c.d
        public V a(K k, int i, int i2) {
            int i3 = 0;
            while (true) {
                K[] kArr = this.a;
                if (i3 >= kArr.length) {
                    return null;
                }
                if (kArr[i3] == k) {
                    return this.b[i3];
                }
                i3++;
            }
        }

        @Override // ax.Za.c.d
        public d<K, V> b(K k, V v, int i, int i2) {
            int hashCode = this.a[0].hashCode();
            if (hashCode != i) {
                return b.c(new C0235c(k, v), i, this, hashCode, i2);
            }
            int c = c(k);
            if (c != -1) {
                K[] kArr = this.a;
                Object[] copyOf = Arrays.copyOf(kArr, kArr.length);
                Object[] copyOf2 = Arrays.copyOf(this.b, this.a.length);
                copyOf[c] = k;
                copyOf2[c] = v;
                return new a(copyOf, copyOf2);
            }
            K[] kArr2 = this.a;
            Object[] copyOf3 = Arrays.copyOf(kArr2, kArr2.length + 1);
            Object[] copyOf4 = Arrays.copyOf(this.b, this.a.length + 1);
            K[] kArr3 = this.a;
            copyOf3[kArr3.length] = k;
            copyOf4[kArr3.length] = v;
            return new a(copyOf3, copyOf4);
        }

        @Override // ax.Za.c.d
        public int size() {
            return this.b.length;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CollisionLeaf(");
            for (int i = 0; i < this.b.length; i++) {
                sb.append("(key=");
                sb.append(this.a[i]);
                sb.append(" value=");
                sb.append(this.b[i]);
                sb.append(") ");
            }
            sb.append(")");
            return sb.toString();
        }

        private a(K[] kArr, V[] vArr) {
            this.a = kArr;
            this.b = vArr;
        }
    }

    static final class b<K, V> implements d<K, V> {
        final int a;
        final d<K, V>[] b;
        private final int c;

        private b(int i, d<K, V>[] dVarArr, int i2) {
            this.a = i;
            this.b = dVarArr;
            this.c = i2;
        }

        static <K, V> d<K, V> c(d<K, V> dVar, int i, d<K, V> dVar2, int i2, int i3) {
            int e = e(i, i3);
            int e2 = e(i2, i3);
            if (e == e2) {
                d c = c(dVar, i, dVar2, i2, i3 + 5);
                return new b(e, new d[]{c}, c.size());
            }
            if (f(i, i3) > f(i2, i3)) {
                dVar2 = dVar;
                dVar = dVar2;
            }
            return new b(e | e2, new d[]{dVar, dVar2}, dVar.size() + dVar2.size());
        }

        private int d(int i) {
            return Integer.bitCount((i - 1) & this.a);
        }

        private static int e(int i, int i2) {
            return 1 << f(i, i2);
        }

        private static int f(int i, int i2) {
            return (i >>> i2) & 31;
        }

        @Override // ax.Za.c.d
        public V a(K k, int i, int i2) {
            int e = e(i, i2);
            if ((this.a & e) == 0) {
                return null;
            }
            return this.b[d(e)].a(k, i, i2 + 5);
        }

        @Override // ax.Za.c.d
        public d<K, V> b(K k, V v, int i, int i2) {
            int e = e(i, i2);
            int d = d(e);
            int i3 = this.a;
            if ((i3 & e) != 0) {
                d<K, V>[] dVarArr = this.b;
                d[] dVarArr2 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length);
                dVarArr2[d] = this.b[d].b(k, v, i, i2 + 5);
                return new b(this.a, dVarArr2, (size() + dVarArr2[d].size()) - this.b[d].size());
            }
            int i4 = i3 | e;
            d<K, V>[] dVarArr3 = this.b;
            d[] dVarArr4 = new d[dVarArr3.length + 1];
            System.arraycopy(dVarArr3, 0, dVarArr4, 0, d);
            dVarArr4[d] = new C0235c(k, v);
            d<K, V>[] dVarArr5 = this.b;
            System.arraycopy(dVarArr5, d, dVarArr4, d + 1, dVarArr5.length - d);
            return new b(i4, dVarArr4, size() + 1);
        }

        @Override // ax.Za.c.d
        public int size() {
            return this.c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CompressedIndex(");
            sb.append(String.format("bitmap=%s ", Integer.toBinaryString(this.a)));
            for (d<K, V> dVar : this.b) {
                sb.append(dVar);
                sb.append(" ");
            }
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: ax.Za.c$c, reason: collision with other inner class name */
    static final class C0235c<K, V> implements d<K, V> {
        private final K a;
        private final V b;

        public C0235c(K k, V v) {
            this.a = k;
            this.b = v;
        }

        @Override // ax.Za.c.d
        public V a(K k, int i, int i2) {
            if (this.a == k) {
                return this.b;
            }
            return null;
        }

        @Override // ax.Za.c.d
        public d<K, V> b(K k, V v, int i, int i2) {
            int hashCode = this.a.hashCode();
            return hashCode != i ? b.c(new C0235c(k, v), i, this, hashCode, i2) : this.a == k ? new C0235c(k, v) : new a(this.a, this.b, k, v);
        }

        @Override // ax.Za.c.d
        public int size() {
            return 1;
        }

        public String toString() {
            return String.format("Leaf(key=%s value=%s)", this.a, this.b);
        }
    }

    interface d<K, V> {
        V a(K k, int i, int i2);

        d<K, V> b(K k, V v, int i, int i2);

        int size();
    }

    c() {
        this(null);
    }

    public V a(K k) {
        d<K, V> dVar = this.a;
        if (dVar == null) {
            return null;
        }
        return dVar.a(k, k.hashCode(), 0);
    }

    public c<K, V> b(K k, V v) {
        d<K, V> dVar = this.a;
        return dVar == null ? new c<>(new C0235c(k, v)) : new c<>(dVar.b(k, v, k.hashCode(), 0));
    }

    private c(d<K, V> dVar) {
        this.a = dVar;
    }
}
