/*
 * Decompiled with CFR 0.152.
 */
package ax.B;

import ax.B.l;
import ax.C.a;

public final class m {
    private static final Object a = new Object();

    public static final /* synthetic */ void a(l l8) {
        m.f(l8);
    }

    public static final /* synthetic */ Object b() {
        return a;
    }

    public static final <E> E c(l<E> object, int n8) {
        ax.Gb.l.f(object, "<this>");
        n8 = ax.C.a.a(((l)object).c0, ((l)object).e0, n8);
        if (n8 >= 0 && (object = ((l)object).d0[n8]) != a) {
            return (E)object;
        }
        return null;
    }

    public static final <E> E d(l<E> object, int n8, E e8) {
        ax.Gb.l.f(object, "<this>");
        n8 = ax.C.a.a(((l)object).c0, ((l)object).e0, n8);
        if (n8 >= 0 && (object = ((l)object).d0[n8]) != a) {
            return (E)object;
        }
        return e8;
    }

    public static final <E> void e(l<E> l8, int n8) {
        Object object;
        Object[] objectArray;
        Object object2;
        ax.Gb.l.f(l8, "<this>");
        n8 = ax.C.a.a(l8.c0, l8.e0, n8);
        if (n8 >= 0 && (object2 = (objectArray = l8.d0)[n8]) != (object = a)) {
            objectArray[n8] = object;
            l8.q = true;
        }
    }

    private static final <E> void f(l<E> l8) {
        int n8 = l8.e0;
        int[] nArray = l8.c0;
        Object[] objectArray = l8.d0;
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object = objectArray[i8];
            int n10 = n9;
            if (object != a) {
                if (i8 != n9) {
                    nArray[n9] = nArray[i8];
                    objectArray[n9] = object;
                    objectArray[i8] = null;
                }
                n10 = n9 + 1;
            }
            n9 = n10;
        }
        l8.q = false;
        l8.e0 = n9;
    }
}

