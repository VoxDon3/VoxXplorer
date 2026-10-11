/*
 * Decompiled with CFR 0.152.
 */
package ax.H;

import ax.H.d;
import ax.H.e;
import ax.H.f;

public class k {
    static boolean[] a = new boolean[3];

    static void a(f object, ax.E.d d8, e e8) {
        int n8;
        int n9;
        e8.t = -1;
        e8.u = -1;
        Object object2 = ((e)object).Z[0];
        e.b b8 = e.b.c0;
        if (object2 != b8 && e8.Z[0] == e.b.e0) {
            n9 = e8.O.g;
            n8 = ((e)object).W() - e8.Q.g;
            object2 = e8.O;
            ((d)object2).i = d8.q(object2);
            object2 = e8.Q;
            ((d)object2).i = d8.q(object2);
            d8.f(e8.O.i, n9);
            d8.f(e8.Q.i, n8);
            e8.t = 2;
            e8.O0(n9, n8);
        }
        if (((e)object).Z[1] != b8 && e8.Z[1] == e.b.e0) {
            n9 = e8.P.g;
            n8 = ((e)object).x() - e8.R.g;
            object = e8.P;
            ((d)object).i = d8.q(object);
            object = e8.R;
            ((d)object).i = d8.q(object);
            d8.f(e8.P.i, n9);
            d8.f(e8.R.i, n8);
            if (e8.l0 > 0 || e8.V() == 8) {
                object = e8.S;
                ((d)object).i = d8.q(object);
                d8.f(e8.S.i, e8.l0 + n9);
            }
            e8.u = 2;
            e8.f1(n9, n8);
        }
    }

    public static final boolean b(int n8, int n9) {
        return (n8 & n9) == n9;
    }
}

