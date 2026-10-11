/*
 * Decompiled with CFR 0.152.
 */
package ax.rd;

import ax.Wc.A;
import ax.Wc.D;
import ax.Wc.J;
import ax.Wc.g;
import ax.Wc.h;
import ax.Wc.t;
import ax.Wc.v;
import ax.Wc.x0;

public class a
extends t {
    private g c0;
    private v q;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private a(D g8) {
        if (((D)g8).size() >= 1 && ((D)g8).size() <= 2) {
            Object var1_3;
            this.q = v.J(((D)g8).I(0));
            if (((D)g8).size() == 2) {
                g g9 = ((D)g8).I(1);
            } else {
                Object var1_4 = null;
            }
            this.c0 = var1_3;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bad sequence size: ");
        stringBuilder.append(((D)g8).size());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public a(v v8) {
        this.q = v8;
    }

    public a(v v8, g g8) {
        this.q = v8;
        this.c0 = g8;
    }

    public static a s(J j8, boolean bl) {
        return a.t(D.E(j8, bl));
    }

    public static a t(Object object) {
        if (object instanceof a) {
            return (a)object;
        }
        if (object != null) {
            return new a(D.G(object));
        }
        return null;
    }

    @Override
    public A g() {
        h h8 = new h(2);
        h8.a(this.q);
        g g8 = this.c0;
        if (g8 != null) {
            h8.a(g8);
        }
        return new x0(h8);
    }

    public v r() {
        return this.q;
    }

    public g u() {
        return this.c0;
    }
}

