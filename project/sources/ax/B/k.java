package ax.B;

import ax.tb.C3133i;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class k<K, V> {
    private Object[] c0;
    private int d0;
    private int[] q;

    public k() {
        this(0, 1, null);
    }

    private final int c(K k, int i) {
        int i2 = this.d0;
        if (i2 == 0) {
            return -1;
        }
        int a = ax.C.a.a(this.q, i2, i);
        if (a < 0 || ax.Gb.l.a(k, this.c0[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.q[i3] == i) {
            if (ax.Gb.l.a(k, this.c0[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a - 1; i4 >= 0 && this.q[i4] == i; i4--) {
            if (ax.Gb.l.a(k, this.c0[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    private final int e() {
        int i = this.d0;
        if (i == 0) {
            return -1;
        }
        int a = ax.C.a.a(this.q, i, 0);
        if (a < 0 || this.c0[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.q[i2] == 0) {
            if (this.c0[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a - 1; i3 >= 0 && this.q[i3] == 0; i3--) {
            if (this.c0[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final int a(V v) {
        int i = this.d0 * 2;
        Object[] objArr = this.c0;
        if (v == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (ax.Gb.l.a(v, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public void b(int i) {
        int i2 = this.d0;
        int[] iArr = this.q;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            ax.Gb.l.e(copyOf, "copyOf(this, newSize)");
            this.q = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c0, i * 2);
            ax.Gb.l.e(copyOf2, "copyOf(this, newSize)");
            this.c0 = copyOf2;
        }
        if (this.d0 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.d0 > 0) {
            this.q = ax.C.a.a;
            this.c0 = ax.C.a.c;
            this.d0 = 0;
        }
        if (this.d0 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k) {
        return d(k) >= 0;
    }

    public boolean containsValue(V v) {
        return a(v) >= 0;
    }

    public int d(K k) {
        return k == null ? e() : c(k, k.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof k) {
                if (size() != ((k) obj).size()) {
                    return false;
                }
                k kVar = (k) obj;
                int i = this.d0;
                for (int i2 = 0; i2 < i; i2++) {
                    K f = f(i2);
                    V k = k(i2);
                    Object obj2 = kVar.get(f);
                    if (k == null) {
                        if (obj2 != null || !kVar.containsKey(f)) {
                            return false;
                        }
                    } else if (!ax.Gb.l.a(k, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.d0;
            for (int i4 = 0; i4 < i3; i4++) {
                K f2 = f(i4);
                V k2 = k(i4);
                Object obj3 = ((Map) obj).get(f2);
                if (k2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f2)) {
                        return false;
                    }
                } else if (!ax.Gb.l.a(k2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public K f(int i) {
        if (i >= 0 && i < this.d0) {
            return (K) this.c0[i << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
    }

    public void g(k<? extends K, ? extends V> kVar) {
        ax.Gb.l.f(kVar, "map");
        int i = kVar.d0;
        b(this.d0 + i);
        if (this.d0 != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.f(i2), kVar.k(i2));
            }
        } else if (i > 0) {
            C3133i.e(kVar.q, this.q, 0, 0, i);
            C3133i.g(kVar.c0, this.c0, 0, 0, i << 1);
            this.d0 = i;
        }
    }

    public V get(K k) {
        int d = d(k);
        if (d >= 0) {
            return (V) this.c0[(d << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(Object obj, V v) {
        int d = d(obj);
        return d >= 0 ? (V) this.c0[(d << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.q;
        Object[] objArr = this.c0;
        int i = this.d0;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public V i(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.d0)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        Object[] objArr = this.c0;
        int i3 = i << 1;
        V v = (V) objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return v;
        }
        int i4 = i2 - 1;
        int[] iArr = this.q;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                C3133i.e(iArr, iArr, i, i5, i2);
                Object[] objArr2 = this.c0;
                C3133i.g(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.c0;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i7);
            ax.Gb.l.e(copyOf, "copyOf(this, newSize)");
            this.q = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c0, i7 << 1);
            ax.Gb.l.e(copyOf2, "copyOf(this, newSize)");
            this.c0 = copyOf2;
            if (i2 != this.d0) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                C3133i.e(iArr, this.q, 0, 0, i);
                C3133i.g(objArr, this.c0, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                C3133i.e(iArr, this.q, i, i8, i2);
                C3133i.g(objArr, this.c0, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.d0) {
            throw new ConcurrentModificationException();
        }
        this.d0 = i4;
        return v;
    }

    public boolean isEmpty() {
        return this.d0 <= 0;
    }

    public V j(int i, V v) {
        if (i < 0 || i >= this.d0) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.c0;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public V k(int i) {
        if (i >= 0 && i < this.d0) {
            return (V) this.c0[(i << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
    }

    public V put(K k, V v) {
        int i = this.d0;
        int hashCode = k != null ? k.hashCode() : 0;
        int c = k != null ? c(k, hashCode) : e();
        if (c >= 0) {
            int i2 = (c << 1) + 1;
            Object[] objArr = this.c0;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = ~c;
        int[] iArr = this.q;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            ax.Gb.l.e(copyOf, "copyOf(this, newSize)");
            this.q = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.c0, i4 << 1);
            ax.Gb.l.e(copyOf2, "copyOf(this, newSize)");
            this.c0 = copyOf2;
            if (i != this.d0) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.q;
            int i5 = i3 + 1;
            C3133i.e(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.c0;
            C3133i.g(objArr2, objArr2, i5 << 1, i3 << 1, this.d0 << 1);
        }
        int i6 = this.d0;
        if (i == i6) {
            int[] iArr3 = this.q;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.c0;
                int i7 = i3 << 1;
                objArr3[i7] = k;
                objArr3[i7 + 1] = v;
                this.d0 = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(K k) {
        int d = d(k);
        if (d >= 0) {
            return i(d);
        }
        return null;
    }

    public V replace(K k, V v) {
        int d = d(k);
        if (d >= 0) {
            return j(d, v);
        }
        return null;
    }

    public int size() {
        return this.d0;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d0 * 28);
        sb.append('{');
        int i = this.d0;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K f = f(i2);
            if (f != sb) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V k = k(i2);
            if (k != sb) {
                sb.append(k);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        ax.Gb.l.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public k(int i) {
        this.q = i == 0 ? ax.C.a.a : new int[i];
        this.c0 = i == 0 ? ax.C.a.c : new Object[i << 1];
    }

    public boolean remove(K k, V v) {
        int d = d(k);
        if (d < 0 || !ax.Gb.l.a(v, k(d))) {
            return false;
        }
        i(d);
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        int d = d(k);
        if (d < 0 || !ax.Gb.l.a(v, k(d))) {
            return false;
        }
        j(d, v2);
        return true;
    }

    public /* synthetic */ k(int i, int i2, ax.Gb.g gVar) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public k(k<? extends K, ? extends V> kVar) {
        this(0, 1, null);
        if (kVar != null) {
            g(kVar);
        }
    }
}
