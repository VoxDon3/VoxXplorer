/*
 * Decompiled with CFR 0.152.
 */
package ax.pd;

import ax.Wc.A;
import ax.Wc.E;
import ax.Wc.g;
import ax.Wc.h;
import ax.Wc.t;
import ax.Wc.v;
import ax.Wc.x0;
import ax.Wc.y0;
import ax.pd.a;

public class b
extends t {
    private E q;

    private b(E e8) {
        this.q = e8;
    }

    public b(v v8, g g8) {
        h h8 = new h(2);
        h8.a(v8);
        h8.a(g8);
        this.q = new y0(new x0(h8));
    }

    public b(a[] aArray) {
        this.q = new y0(aArray);
    }

    public static b s(Object object) {
        if (object instanceof b) {
            return (b)object;
        }
        if (object != null) {
            return new b(E.E(object));
        }
        return null;
    }

    @Override
    public A g() {
        return this.q;
    }

    public a r() {
        if (this.q.size() == 0) {
            return null;
        }
        return a.r(this.q.G(0));
    }

    public int size() {
        return this.q.size();
    }

    public a[] t() {
        int n8 = this.q.size();
        a[] aArray = new a[n8];
        for (int i8 = 0; i8 != n8; ++i8) {
            aArray[i8] = a.r(this.q.G(i8));
        }
        return aArray;
    }

    public boolean u() {
        return this.q.size() > 1;
    }
}

