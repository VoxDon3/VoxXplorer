package ax.B;

import ax.tb.C3133i;
import java.util.Arrays;

/* loaded from: classes.dex */
public class l<E> implements Cloneable {
    public /* synthetic */ int[] c0;
    public /* synthetic */ Object[] d0;
    public /* synthetic */ int e0;
    public /* synthetic */ boolean q;

    public l() {
        this(0, 1, null);
    }

    public void b(int i, E e) {
        int i2 = this.e0;
        if (i2 != 0 && i <= this.c0[i2 - 1]) {
            k(i, e);
            return;
        }
        if (this.q && i2 >= this.c0.length) {
            m.f(this);
        }
        int i3 = this.e0;
        if (i3 >= this.c0.length) {
            int e2 = ax.C.a.e(i3 + 1);
            int[] copyOf = Arrays.copyOf(this.c0, e2);
            ax.Gb.l.e(copyOf, "copyOf(this, newSize)");
            this.c0 = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.d0, e2);
            ax.Gb.l.e(copyOf2, "copyOf(this, newSize)");
            this.d0 = copyOf2;
        }
        this.c0[i3] = i;
        this.d0[i3] = e;
        this.e0 = i3 + 1;
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
    public l<E> clone() {
        Object clone = super.clone();
        ax.Gb.l.d(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        l<E> lVar = (l) clone;
        lVar.c0 = (int[]) this.c0.clone();
        lVar.d0 = (Object[]) this.d0.clone();
        return lVar;
    }

    public E f(int i) {
        return (E) m.c(this, i);
    }

    public E h(int i, E e) {
        return (E) m.d(this, i, e);
    }

    public int i(E e) {
        if (this.q) {
            m.f(this);
        }
        int i = this.e0;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.d0[i2] == e) {
                return i2;
            }
        }
        return -1;
    }

    public int j(int i) {
        if (this.q) {
            m.f(this);
        }
        return this.c0[i];
    }

    public void k(int i, E e) {
        Object obj;
        int a = ax.C.a.a(this.c0, this.e0, i);
        if (a >= 0) {
            this.d0[a] = e;
            return;
        }
        int i2 = ~a;
        if (i2 < this.e0) {
            Object obj2 = this.d0[i2];
            obj = m.a;
            if (obj2 == obj) {
                this.c0[i2] = i;
                this.d0[i2] = e;
                return;
            }
        }
        if (this.q && this.e0 >= this.c0.length) {
            m.f(this);
            i2 = ~ax.C.a.a(this.c0, this.e0, i);
        }
        int i3 = this.e0;
        if (i3 >= this.c0.length) {
            int e2 = ax.C.a.e(i3 + 1);
            int[] copyOf = Arrays.copyOf(this.c0, e2);
            ax.Gb.l.e(copyOf, "copyOf(this, newSize)");
            this.c0 = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.d0, e2);
            ax.Gb.l.e(copyOf2, "copyOf(this, newSize)");
            this.d0 = copyOf2;
        }
        int i4 = this.e0;
        if (i4 - i2 != 0) {
            int[] iArr = this.c0;
            int i5 = i2 + 1;
            C3133i.e(iArr, iArr, i5, i2, i4);
            Object[] objArr = this.d0;
            C3133i.g(objArr, objArr, i5, i2, this.e0);
        }
        this.c0[i2] = i;
        this.d0[i2] = e;
        this.e0++;
    }

    public void l(int i) {
        m.e(this, i);
    }

    public int m() {
        if (this.q) {
            m.f(this);
        }
        return this.e0;
    }

    public E n(int i) {
        if (this.q) {
            m.f(this);
        }
        return (E) this.d0[i];
    }

    public String toString() {
        if (m() <= 0) {
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
            E n = n(i2);
            if (n != this) {
                sb.append(n);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        ax.Gb.l.e(sb2, "buffer.toString()");
        return sb2;
    }

    public l(int i) {
        if (i == 0) {
            this.c0 = ax.C.a.a;
            this.d0 = ax.C.a.c;
        } else {
            int e = ax.C.a.e(i);
            this.c0 = new int[e];
            this.d0 = new Object[e];
        }
    }

    public /* synthetic */ l(int i, int i2, ax.Gb.g gVar) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
