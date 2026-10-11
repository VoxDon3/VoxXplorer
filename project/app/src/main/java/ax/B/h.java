/*
 * Decompiled with CFR 0.152.
 */
package ax.B;

import ax.B.i;
import ax.C.a;
import ax.Gb.g;
import ax.Gb.l;
import java.util.Arrays;

public class h<E>
implements Cloneable {
    public long[] c0;
    public Object[] d0;
    public int e0;
    public boolean q;

    public h() {
        this(0, 1, null);
    }

    public h(int n8) {
        if (n8 == 0) {
            this.c0 = a.b;
            this.d0 = a.c;
            return;
        }
        n8 = a.f(n8);
        this.c0 = new long[n8];
        this.d0 = new Object[n8];
    }

    public /* synthetic */ h(int n8, int n9, g g8) {
        if ((n9 & 1) != 0) {
            n8 = 10;
        }
        this(n8);
    }

    public void b(long l8, E e8) {
        int n8;
        int n9;
        Object[] objectArray;
        int n10 = this.e0;
        if (n10 != 0 && l8 <= this.c0[n10 - 1]) {
            this.k(l8, e8);
            return;
        }
        if (this.q && n10 >= (objectArray = this.c0).length) {
            Object[] objectArray2 = this.d0;
            n9 = 0;
            for (n8 = 0; n8 < n10; ++n8) {
                Object object = objectArray2[n8];
                int n11 = n9;
                if (object != i.a()) {
                    if (n8 != n9) {
                        objectArray[n9] = objectArray[n8];
                        objectArray2[n9] = object;
                        objectArray2[n8] = null;
                    }
                    n11 = n9 + 1;
                }
                n9 = n11;
            }
            this.q = false;
            this.e0 = n9;
        }
        if ((n9 = this.e0) >= this.c0.length) {
            n8 = a.f(n9 + 1);
            objectArray = Arrays.copyOf(this.c0, n8);
            l.e(objectArray, "copyOf(this, newSize)");
            this.c0 = objectArray;
            objectArray = Arrays.copyOf(this.d0, n8);
            l.e(objectArray, "copyOf(this, newSize)");
            this.d0 = objectArray;
        }
        this.c0[n9] = l8;
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

    public h<E> d() {
        Object object = super.clone();
        l.d(object, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        object = (h)object;
        ((h)object).c0 = (long[])this.c0.clone();
        ((h)object).d0 = (Object[])this.d0.clone();
        return object;
    }

    public E f(long l8) {
        int n8 = a.b(this.c0, this.e0, l8);
        if (n8 >= 0 && this.d0[n8] != i.a()) {
            return (E)this.d0[n8];
        }
        return null;
    }

    public E h(long l8, E e8) {
        int n8 = a.b(this.c0, this.e0, l8);
        if (n8 >= 0 && this.d0[n8] != i.a()) {
            return (E)this.d0[n8];
        }
        return e8;
    }

    public int i(long l8) {
        if (this.q) {
            int n8 = this.e0;
            long[] lArray = this.c0;
            Object[] objectArray = this.d0;
            int n9 = 0;
            for (int i8 = 0; i8 < n8; ++i8) {
                Object object = objectArray[i8];
                int n10 = n9;
                if (object != i.a()) {
                    if (i8 != n9) {
                        lArray[n9] = lArray[i8];
                        objectArray[n9] = object;
                        objectArray[i8] = null;
                    }
                    n10 = n9 + 1;
                }
                n9 = n10;
            }
            this.q = false;
            this.e0 = n9;
        }
        return a.b(this.c0, this.e0, l8);
    }

    public long j(int n8) {
        int n9;
        if (n8 >= 0 && n8 < (n9 = this.e0)) {
            if (this.q) {
                long[] lArray = this.c0;
                Object[] objectArray = this.d0;
                int n10 = 0;
                for (int i8 = 0; i8 < n9; ++i8) {
                    Object object = objectArray[i8];
                    int n11 = n10;
                    if (object != i.a()) {
                        if (i8 != n10) {
                            lArray[n10] = lArray[i8];
                            objectArray[n10] = object;
                            objectArray[i8] = null;
                        }
                        n11 = n10 + 1;
                    }
                    n10 = n11;
                }
                this.q = false;
                this.e0 = n10;
            }
            return this.c0[n8];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected index to be within 0..size()-1, but was ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public void k(long l8, E e8) {
        int n8;
        Object[] objectArray;
        int n9 = a.b(this.c0, this.e0, l8);
        if (n9 >= 0) {
            this.d0[n9] = e8;
            return;
        }
        int n10 = ~n9;
        if (n10 < this.e0 && this.d0[n10] == i.a()) {
            this.c0[n10] = l8;
            this.d0[n10] = e8;
            return;
        }
        n9 = n10;
        if (this.q) {
            int n11 = this.e0;
            long[] lArray = this.c0;
            n9 = n10;
            if (n11 >= lArray.length) {
                objectArray = this.d0;
                n9 = 0;
                for (n10 = 0; n10 < n11; ++n10) {
                    Object object = objectArray[n10];
                    n8 = n9;
                    if (object != i.a()) {
                        if (n10 != n9) {
                            lArray[n9] = lArray[n10];
                            objectArray[n9] = object;
                            objectArray[n10] = null;
                        }
                        n8 = n9 + 1;
                    }
                    n9 = n8;
                }
                this.q = false;
                this.e0 = n9;
                n9 = ~a.b(this.c0, n9, l8);
            }
        }
        if ((n10 = this.e0) >= this.c0.length) {
            n10 = a.f(n10 + 1);
            objectArray = Arrays.copyOf(this.c0, n10);
            l.e(objectArray, "copyOf(this, newSize)");
            this.c0 = (long[])objectArray;
            objectArray = Arrays.copyOf(this.d0, n10);
            l.e(objectArray, "copyOf(this, newSize)");
            this.d0 = objectArray;
        }
        if ((n8 = this.e0) - n9 != 0) {
            objectArray = this.c0;
            n10 = n9 + 1;
            ax.tb.i.f((long[])objectArray, (long[])objectArray, n10, n9, n8);
            objectArray = this.d0;
            ax.tb.i.g(objectArray, objectArray, n10, n9, this.e0);
        }
        this.c0[n9] = l8;
        this.d0[n9] = e8;
        ++this.e0;
    }

    public void l(long l8) {
        int n8 = a.b(this.c0, this.e0, l8);
        if (n8 >= 0 && this.d0[n8] != i.a()) {
            this.d0[n8] = i.a();
            this.q = true;
        }
    }

    public void m(int n8) {
        if (this.d0[n8] != i.a()) {
            this.d0[n8] = i.a();
            this.q = true;
        }
    }

    public int n() {
        if (this.q) {
            int n8 = this.e0;
            long[] lArray = this.c0;
            Object[] objectArray = this.d0;
            int n9 = 0;
            for (int i8 = 0; i8 < n8; ++i8) {
                Object object = objectArray[i8];
                int n10 = n9;
                if (object != i.a()) {
                    if (i8 != n9) {
                        lArray[n9] = lArray[i8];
                        objectArray[n9] = object;
                        objectArray[i8] = null;
                    }
                    n10 = n9 + 1;
                }
                n9 = n10;
            }
            this.q = false;
            this.e0 = n9;
        }
        return this.e0;
    }

    public E o(int n8) {
        int n9;
        if (n8 >= 0 && n8 < (n9 = this.e0)) {
            if (this.q) {
                long[] lArray = this.c0;
                Object[] objectArray = this.d0;
                int n10 = 0;
                for (int i8 = 0; i8 < n9; ++i8) {
                    Object object = objectArray[i8];
                    int n11 = n10;
                    if (object != i.a()) {
                        if (i8 != n10) {
                            lArray[n10] = lArray[i8];
                            objectArray[n10] = object;
                            objectArray[i8] = null;
                        }
                        n11 = n10 + 1;
                    }
                    n10 = n11;
                }
                this.q = false;
                this.e0 = n10;
            }
            return (E)this.d0[n8];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected index to be within 0..size()-1, but was ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public String toString() {
        String string;
        if (this.n() <= 0) {
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
            string = this.o(i8);
            if (string != stringBuilder) {
                stringBuilder.append((Object)string);
                continue;
            }
            stringBuilder.append("(this Map)");
        }
        stringBuilder.append('}');
        string = stringBuilder.toString();
        l.e(string, "StringBuilder(capacity).\u2026builderAction).toString()");
        return string;
    }
}

