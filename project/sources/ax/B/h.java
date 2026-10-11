package ax.B;

import ax.tb.C3133i;
import java.util.Arrays;

/* loaded from: classes.dex */
public class h<E> implements Cloneable {
    public /* synthetic */ long[] c0;
    public /* synthetic */ Object[] d0;
    public /* synthetic */ int e0;
    public /* synthetic */ boolean q;

    public h() {
        this(0, 1, null);
    }

    public void b(long j, E e) {
        Object obj;
        int i = this.e0;
        if (i != 0 && j <= this.c0[i - 1]) {
            k(j, e);
            return;
        }
        if (this.q) {
            long[] jArr = this.c0;
            if (i >= jArr.length) {
                Object[] objArr = this.d0;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj2 = objArr[i3];
                    obj = i.a;
                    if (obj2 != obj) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj2;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.q = false;
                this.e0 = i2;
            }
        }
        int i4 = this.e0;
        if (i4 >= this.c0.length) {
            int f = ax.C.a.f(i4 + 1);
            long[] copyOf = Arrays.copyOf(this.c0, f);
            ax.Gb.l.e(copyOf, "copyOf(this, newSize)");
            this.c0 = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.d0, f);
            ax.Gb.l.e(copyOf2, "copyOf(this, newSize)");
            this.d0 = copyOf2;
        }
        this.c0[i4] = j;
        this.d0[i4] = e;
        this.e0 = i4 + 1;
    }

    public void c() {
        int i = this.e0;
        Object[] objArr = this.d0;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e0 = 0;
        this.q = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public h<E> clone() {
        Object clone = super.clone();
        ax.Gb.l.d(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        h<E> hVar = (h) clone;
        hVar.c0 = (long[]) this.c0.clone();
        hVar.d0 = (Object[]) this.d0.clone();
        return hVar;
    }

    public E f(long j) {
        Object obj;
        int b = ax.C.a.b(this.c0, this.e0, j);
        if (b < 0) {
            return null;
        }
        Object obj2 = this.d0[b];
        obj = i.a;
        if (obj2 == obj) {
            return null;
        }
        return (E) this.d0[b];
    }

    public E h(long j, E e) {
        Object obj;
        int b = ax.C.a.b(this.c0, this.e0, j);
        if (b >= 0) {
            Object obj2 = this.d0[b];
            obj = i.a;
            if (obj2 != obj) {
                return (E) this.d0[b];
            }
        }
        return e;
    }

    public int i(long j) {
        Object obj;
        if (this.q) {
            int i = this.e0;
            long[] jArr = this.c0;
            Object[] objArr = this.d0;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj2 = objArr[i3];
                obj = i.a;
                if (obj2 != obj) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj2;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.q = false;
            this.e0 = i2;
        }
        return ax.C.a.b(this.c0, this.e0, j);
    }

    public long j(int i) {
        int i2;
        Object obj;
        if (i < 0 || i >= (i2 = this.e0)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        if (this.q) {
            long[] jArr = this.c0;
            Object[] objArr = this.d0;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj2 = objArr[i4];
                obj = i.a;
                if (obj2 != obj) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj2;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.q = false;
            this.e0 = i3;
        }
        return this.c0[i];
    }

    public void k(long j, E e) {
        Object obj;
        Object obj2;
        int b = ax.C.a.b(this.c0, this.e0, j);
        if (b >= 0) {
            this.d0[b] = e;
            return;
        }
        int i = ~b;
        if (i < this.e0) {
            Object obj3 = this.d0[i];
            obj2 = i.a;
            if (obj3 == obj2) {
                this.c0[i] = j;
                this.d0[i] = e;
                return;
            }
        }
        if (this.q) {
            int i2 = this.e0;
            long[] jArr = this.c0;
            if (i2 >= jArr.length) {
                Object[] objArr = this.d0;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj4 = objArr[i4];
                    obj = i.a;
                    if (obj4 != obj) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj4;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.q = false;
                this.e0 = i3;
                i = ~ax.C.a.b(this.c0, i3, j);
            }
        }
        int i5 = this.e0;
        if (i5 >= this.c0.length) {
            int f = ax.C.a.f(i5 + 1);
            long[] copyOf = Arrays.copyOf(this.c0, f);
            ax.Gb.l.e(copyOf, "copyOf(this, newSize)");
            this.c0 = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.d0, f);
            ax.Gb.l.e(copyOf2, "copyOf(this, newSize)");
            this.d0 = copyOf2;
        }
        int i6 = this.e0;
        if (i6 - i != 0) {
            long[] jArr2 = this.c0;
            int i7 = i + 1;
            C3133i.f(jArr2, jArr2, i7, i, i6);
            Object[] objArr2 = this.d0;
            C3133i.g(objArr2, objArr2, i7, i, this.e0);
        }
        this.c0[i] = j;
        this.d0[i] = e;
        this.e0++;
    }

    public void l(long j) {
        Object obj;
        Object obj2;
        int b = ax.C.a.b(this.c0, this.e0, j);
        if (b >= 0) {
            Object obj3 = this.d0[b];
            obj = i.a;
            if (obj3 != obj) {
                Object[] objArr = this.d0;
                obj2 = i.a;
                objArr[b] = obj2;
                this.q = true;
            }
        }
    }

    public void m(int i) {
        Object obj;
        Object obj2;
        Object obj3 = this.d0[i];
        obj = i.a;
        if (obj3 != obj) {
            Object[] objArr = this.d0;
            obj2 = i.a;
            objArr[i] = obj2;
            this.q = true;
        }
    }

    public int n() {
        Object obj;
        if (this.q) {
            int i = this.e0;
            long[] jArr = this.c0;
            Object[] objArr = this.d0;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj2 = objArr[i3];
                obj = i.a;
                if (obj2 != obj) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj2;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.q = false;
            this.e0 = i2;
        }
        return this.e0;
    }

    public E o(int i) {
        int i2;
        Object obj;
        if (i < 0 || i >= (i2 = this.e0)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        if (this.q) {
            long[] jArr = this.c0;
            Object[] objArr = this.d0;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj2 = objArr[i4];
                obj = i.a;
                if (obj2 != obj) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj2;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.q = false;
            this.e0 = i3;
        }
        return (E) this.d0[i];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e0 * 28);
        sb.append('{');
        int i = this.e0;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(j(i2));
            sb.append('=');
            E o = o(i2);
            if (o != sb) {
                sb.append(o);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        ax.Gb.l.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public h(int i) {
        if (i == 0) {
            this.c0 = ax.C.a.b;
            this.d0 = ax.C.a.c;
        } else {
            int f = ax.C.a.f(i);
            this.c0 = new long[f];
            this.d0 = new Object[f];
        }
    }

    public /* synthetic */ h(int i, int i2, ax.Gb.g gVar) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
