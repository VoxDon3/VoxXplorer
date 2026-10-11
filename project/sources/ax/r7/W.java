package ax.r7;

import ax.r7.AbstractC2962A;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
final class W<K, V> extends AbstractC2962A<K, V> {
    static final AbstractC2962A<Object, Object> i0 = new W(null, new Object[0], 0);
    private final transient Object f0;
    final transient Object[] g0;
    private final transient int h0;

    static class a<K, V> extends AbstractC2964C<Map.Entry<K, V>> {
        private final transient AbstractC2962A<K, V> d0;
        private final transient Object[] e0;
        private final transient int f0;
        private final transient int g0;

        /* renamed from: ax.r7.W$a$a, reason: collision with other inner class name */
        class C0441a extends AbstractC2991z<Map.Entry<K, V>> {
            C0441a() {
            }

            @Override // java.util.List
            /* renamed from: N, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i) {
                ax.q7.n.l(i, a.this.g0);
                int i2 = i * 2;
                Object obj = a.this.e0[a.this.f0 + i2];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.e0[i2 + (a.this.f0 ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // ax.r7.AbstractC2989x
            public boolean l() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.g0;
            }
        }

        a(AbstractC2962A<K, V> abstractC2962A, Object[] objArr, int i, int i2) {
            this.d0 = abstractC2962A;
            this.e0 = objArr;
            this.f0 = i;
            this.g0 = i2;
        }

        @Override // ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.d0.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // ax.r7.AbstractC2989x
        int g(Object[] objArr, int i) {
            return e().g(objArr, i);
        }

        @Override // ax.r7.AbstractC2989x
        boolean l() {
            return true;
        }

        @Override // ax.r7.AbstractC2964C, ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: n */
        public j0<Map.Entry<K, V>> iterator() {
            return e().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.g0;
        }

        @Override // ax.r7.AbstractC2964C
        AbstractC2991z<Map.Entry<K, V>> w() {
            return new C0441a();
        }
    }

    static final class b<K> extends AbstractC2964C<K> {
        private final transient AbstractC2962A<K, ?> d0;
        private final transient AbstractC2991z<K> e0;

        b(AbstractC2962A<K, ?> abstractC2962A, AbstractC2991z<K> abstractC2991z) {
            this.d0 = abstractC2962A;
            this.e0 = abstractC2991z;
        }

        @Override // ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.d0.get(obj) != null;
        }

        @Override // ax.r7.AbstractC2964C, ax.r7.AbstractC2989x
        public AbstractC2991z<K> e() {
            return this.e0;
        }

        @Override // ax.r7.AbstractC2989x
        int g(Object[] objArr, int i) {
            return e().g(objArr, i);
        }

        @Override // ax.r7.AbstractC2989x
        boolean l() {
            return true;
        }

        @Override // ax.r7.AbstractC2964C, ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: n */
        public j0<K> iterator() {
            return e().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.d0.size();
        }
    }

    static final class c extends AbstractC2991z<Object> {
        private final transient Object[] d0;
        private final transient int e0;
        private final transient int f0;

        c(Object[] objArr, int i, int i2) {
            this.d0 = objArr;
            this.e0 = i;
            this.f0 = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            ax.q7.n.l(i, this.f0);
            Object obj = this.d0[(i * 2) + this.e0];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // ax.r7.AbstractC2989x
        boolean l() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f0;
        }
    }

    private W(Object obj, Object[] objArr, int i) {
        this.f0 = obj;
        this.g0 = objArr;
        this.h0 = i;
    }

    static <K, V> W<K, V> m(int i, Object[] objArr, AbstractC2962A.a<K, V> aVar) {
        if (i == 0) {
            return (W) i0;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            C2975i.a(obj, obj2);
            return new W<>(null, objArr, 1);
        }
        ax.q7.n.q(i, objArr.length >> 1);
        Object n = n(objArr, i, AbstractC2964C.r(i), 0);
        if (n instanceof Object[]) {
            Object[] objArr2 = (Object[]) n;
            AbstractC2962A.a.C0437a c0437a = (AbstractC2962A.a.C0437a) objArr2[2];
            if (aVar == null) {
                throw c0437a.a();
            }
            aVar.e = c0437a;
            Object obj3 = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            n = obj3;
            i = intValue;
        }
        return new W<>(n, objArr, i);
    }

    private static Object n(Object[] objArr, int i, int i2, int i3) {
        AbstractC2962A.a.C0437a c0437a = null;
        int i4 = 1;
        if (i == 1) {
            Object obj = objArr[i3];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i3 ^ 1];
            Objects.requireNonNull(obj2);
            C2975i.a(obj, obj2);
            return null;
        }
        int i5 = i2 - 1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                int i8 = (i7 * 2) + i3;
                int i9 = (i6 * 2) + i3;
                Object obj3 = objArr[i8];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i8 ^ 1];
                Objects.requireNonNull(obj4);
                C2975i.a(obj3, obj4);
                int b2 = C2988w.b(obj3.hashCode());
                while (true) {
                    int i10 = b2 & i5;
                    int i11 = bArr[i10] & 255;
                    if (i11 == 255) {
                        bArr[i10] = (byte) i9;
                        if (i6 < i7) {
                            objArr[i9] = obj3;
                            objArr[i9 ^ 1] = obj4;
                        }
                        i6++;
                    } else {
                        if (obj3.equals(objArr[i11])) {
                            int i12 = i11 ^ 1;
                            Object obj5 = objArr[i12];
                            Objects.requireNonNull(obj5);
                            c0437a = new AbstractC2962A.a.C0437a(obj3, obj4, obj5);
                            objArr[i12] = obj4;
                            break;
                        }
                        b2 = i10 + 1;
                    }
                }
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), c0437a};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = (i14 * 2) + i3;
                int i16 = (i13 * 2) + i3;
                Object obj6 = objArr[i15];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i15 ^ 1];
                Objects.requireNonNull(obj7);
                C2975i.a(obj6, obj7);
                int b3 = C2988w.b(obj6.hashCode());
                while (true) {
                    int i17 = b3 & i5;
                    int i18 = sArr[i17] & 65535;
                    if (i18 == 65535) {
                        sArr[i17] = (short) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj6;
                            objArr[i16 ^ 1] = obj7;
                        }
                        i13++;
                    } else {
                        if (obj6.equals(objArr[i18])) {
                            int i19 = i18 ^ 1;
                            Object obj8 = objArr[i19];
                            Objects.requireNonNull(obj8);
                            c0437a = new AbstractC2962A.a.C0437a(obj6, obj7, obj8);
                            objArr[i19] = obj7;
                            break;
                        }
                        b3 = i17 + 1;
                    }
                }
            }
            return i13 == i ? sArr : new Object[]{sArr, Integer.valueOf(i13), c0437a};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i20 = 0;
        int i21 = 0;
        while (i20 < i) {
            int i22 = (i20 * 2) + i3;
            int i23 = (i21 * 2) + i3;
            Object obj9 = objArr[i22];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i22 ^ i4];
            Objects.requireNonNull(obj10);
            C2975i.a(obj9, obj10);
            int b4 = C2988w.b(obj9.hashCode());
            while (true) {
                int i24 = b4 & i5;
                int i25 = iArr[i24];
                if (i25 == -1) {
                    iArr[i24] = i23;
                    if (i21 < i20) {
                        objArr[i23] = obj9;
                        objArr[i23 ^ 1] = obj10;
                    }
                    i21++;
                } else {
                    if (obj9.equals(objArr[i25])) {
                        int i26 = i25 ^ 1;
                        Object obj11 = objArr[i26];
                        Objects.requireNonNull(obj11);
                        c0437a = new AbstractC2962A.a.C0437a(obj9, obj10, obj11);
                        objArr[i26] = obj10;
                        break;
                    }
                    b4 = i24 + 1;
                }
            }
            i20++;
            i4 = 1;
        }
        return i21 == i ? iArr : new Object[]{iArr, Integer.valueOf(i21), c0437a};
    }

    static Object o(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int b2 = C2988w.b(obj2.hashCode());
            while (true) {
                int i3 = b2 & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                b2 = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int b3 = C2988w.b(obj2.hashCode());
            while (true) {
                int i5 = b3 & length2;
                int i6 = sArr[i5] & 65535;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                b3 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int b4 = C2988w.b(obj2.hashCode());
            while (true) {
                int i7 = b4 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                b4 = i7 + 1;
            }
        }
    }

    @Override // ax.r7.AbstractC2962A
    AbstractC2964C<Map.Entry<K, V>> d() {
        return new a(this, this.g0, 0, this.h0);
    }

    @Override // ax.r7.AbstractC2962A
    AbstractC2964C<K> e() {
        return new b(this, new c(this.g0, 0, this.h0));
    }

    @Override // ax.r7.AbstractC2962A
    AbstractC2989x<V> f() {
        return new c(this.g0, 1, this.h0);
    }

    @Override // ax.r7.AbstractC2962A, java.util.Map
    public V get(Object obj) {
        V v = (V) o(this.f0, this.g0, this.h0, 0, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // ax.r7.AbstractC2962A
    boolean i() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.h0;
    }
}
