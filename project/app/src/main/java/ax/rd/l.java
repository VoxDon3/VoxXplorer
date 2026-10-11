/*
 * Decompiled with CFR 0.152.
 */
package ax.rd;

import ax.Wc.A;
import ax.Wc.D;
import ax.Wc.c;
import ax.Wc.h;
import ax.Wc.k0;
import ax.Wc.t;
import ax.Wc.x0;
import ax.rd.a;

public class l
extends t {
    private c c0;
    private a q;

    public l(D object) {
        if (((D)object).size() == 2) {
            object = ((D)object).J();
            this.q = a.t(object.nextElement());
            this.c0 = k0.O(object.nextElement());
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bad sequence size: ");
        stringBuilder.append(((D)object).size());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static l r(Object object) {
        if (object instanceof l) {
            return (l)object;
        }
        if (object != null) {
            return new l(D.G(object));
        }
        return null;
    }

    @Override
    public A g() {
        h h8 = new h(2);
        h8.a(this.q);
        h8.a(this.c0);
        return new x0(h8);
    }
}

