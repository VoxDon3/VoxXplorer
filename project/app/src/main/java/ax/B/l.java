/*
 * Decompiled with CFR 0.152.
 */
package ax.B;

import ax.B.m;
import ax.C.a;
import ax.Gb.g;
import ax.tb.i;
import java.util.Arrays;

public class l<E>
implements Cloneable {
    public int[] c0;
    public Object[] d0;
    public int e0;
    public boolean q;

    public l() {
        this(0, 1, null);
    }

    public l(int n8) {
        if (n8 == 0) {
            this.c0 = a.a;
            this.d0 = a.c;
            return;
        }
        n8 = a.e(n8);
        this.c0 = new int[n8];
        this.d0 = new Object[n8];
    }

    public /* synthetic */ l(int n8, int n9, g g8) {
        if ((n9 & 1) != 0) {
            n8 = 10;
        }
        this(n8);
    }

    public void b(int n8, E e8) {
        int n9;
        int n10 = this.e0;
        if (n10 != 0 && n8 <= this.c0[n10 - 1]) {
            this.k(n8, e8);
            return;
        }
        if (this.q && n10 >= this.c0.length) {
            m.a(this);
        }
        if ((n9 = this.e0) >= this.c0.length) {
            n10 = a.e(n9 + 1);
            Object[] objectArray = Arrays.copyOf(this.c0, n10);
            ax.Gb.l.e(objectArray, "copyOf(this, newSize)");
            this.c0 = objectArray;
            objectArray = Arrays.copyOf(this.d0, n10);
            ax.Gb.l.e(objectArray, "copyOf(this, newSize)");
            this.d0 = objectArray;
        }
        this.c0[n9] = n8;
        this.d0[n9] = e8;
        this.e0 = n9 + 1;
    }

    public void c() {
        int n8 = this.e0;
        Object[] objectArray = this.d0;
        for (int i8 = 0; i8 < n8; ++i8) {
            objectArray[i8] = null;
        }
        this.e0 = 0;
        this.q = false;
    }

    public l<E> d() {
        Object object = super.clone();
        ax.Gb.l.d(object, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        object = (l)object;
        ((l)object).c0 = (int[])this.c0.clone();
        ((l)object).d0 = (Object[])this.d0.clone();
        return object;
    }

    public E f(int n8) {
        return m.c(this, n8);
    }

    public E h(int n8, E e8) {
        return m.d(this, n8, e8);
    }

    public int i(E e8) {
        if (this.q) {
            m.a(this);
        }
        int n8 = this.e0;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (this.d0[i8] != e8) continue;
            return i8;
        }
        return -1;
    }

    public int j(int n8) {
        if (this.q) {
            m.a(this);
        }
        return this.c0[n8];
    }

    public void k(int n8, E e8) {
        int n9;
        Object[] objectArray;
        int n10 = a.a(this.c0, this.e0, n8);
        if (n10 >= 0) {
            this.d0[n10] = e8;
            return;
        }
        int n11 = ~n10;
        if (n11 < this.e0 && this.d0[n11] == m.b()) {
            this.c0[n11] = n8;
            this.d0[n11] = e8;
            return;
        }
        n10 = n11;
        if (this.q) {
            n10 = n11;
            if (this.e0 >= this.c0.length) {
                m.a(this);
                n10 = ~a.a(this.c0, this.e0, n8);
            }
        }
        if ((n11 = this.e0) >= this.c0.length) {
            n11 = a.e(n11 + 1);
            objectArray = Arrays.copyOf(this.c0, n11);
            ax.Gb.l.e(objectArray, "copyOf(this, newSize)");
            this.c0 = objectArray;
            objectArray = Arrays.copyOf(this.d0, n11);
            ax.Gb.l.e(objectArray, "copyOf(this, newSize)");
            this.d0 = objectArray;
        }
        if ((n9 = this.e0) - n10 != 0) {
            objectArray = this.c0;
            n11 = n10 + 1;
            i.e(objectArray, objectArray, n11, n10, n9);
            objectArray = this.d0;
            i.g(objectArray, objectArray, n11, n10, this.e0);
        }
        this.c0[n10] = n8;
        this.d0[n10] = e8;
        ++this.e0;
    }

    public void l(int n8) {
        m.e(this, n8);
    }

    public int m() {
        if (this.q) {
            m.a(this);
        }
        return this.e0;
    }

    public E n(int n8) {
        if (this.q) {
            m.a(this);
        }
        return (E)this.d0[n8];
    }

    public String toString() {
        String string;
        if (this.m() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.e0 * 28);
        stringBuilder.append('{');
        int n8 = this.e0;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (i8 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.j(i8));
            stringBuilder.append('=');
            string = this.n(i8);
            if (string != this) {
                stringBuilder.append((Object)string);
                continue;
            }
            stringBuilder.append("(this Map)");
        }
        stringBuilder.append('}');
        string = stringBuilder.toString();
        ax.Gb.l.e(string, "buffer.toString()");
        return string;
    }
}

