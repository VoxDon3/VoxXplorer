/*
 * Decompiled with CFR 0.152.
 */
package ax.Z4;

import ax.T4.h;
import ax.T4.i;
import ax.T4.j;
import ax.T4.k;
import ax.T4.l;
import ax.Z4.b;

public final class d
extends l {
    protected final d d;
    protected b e;
    protected d f;
    protected String g;
    protected Object h;
    protected int i;
    protected int j;

    public d(d d8, int n8, b b8, int n9, int n10, int n11) {
        this.d = d8;
        this.e = b8;
        this.a = n9;
        this.i = n10;
        this.j = n11;
        this.b = -1;
        this.c = n8;
    }

    private void i(b object, String string) throws k {
        if (((b)object).c(string)) {
            object = (object = ((b)object).b()) instanceof j ? (j)object : null;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Duplicate field '");
            stringBuilder.append(string);
            stringBuilder.append("'");
            throw new i((j)object, stringBuilder.toString());
        }
    }

    public static d m(b b8) {
        return new d(null, 0, b8, 0, 1, 0);
    }

    @Override
    public String b() {
        return this.g;
    }

    public d j() {
        this.h = null;
        return this.d;
    }

    public d k(int n8, int n9) {
        Object object = this.f;
        if (object == null) {
            int n10 = this.c;
            object = this.e;
            object = object == null ? null : ((b)object).a();
            this.f = object = new d(this, n10 + 1, (b)object, 1, n8, n9);
            return object;
        }
        ((d)object).p(1, n8, n9);
        return object;
    }

    public d l(int n8, int n9) {
        Object object = this.f;
        if (object == null) {
            int n10 = this.c;
            object = this.e;
            object = object == null ? null : ((b)object).a();
            this.f = object = new d(this, n10 + 1, (b)object, 2, n8, n9);
            return object;
        }
        ((d)object).p(2, n8, n9);
        return object;
    }

    public boolean n() {
        int n8;
        this.b = n8 = this.b + 1;
        return this.a != 0 && n8 > 0;
    }

    public d o() {
        return this.d;
    }

    public void p(int n8, int n9, int n10) {
        this.a = n8;
        this.b = -1;
        this.i = n9;
        this.j = n10;
        this.g = null;
        this.h = null;
        b b8 = this.e;
        if (b8 != null) {
            b8.d();
        }
    }

    public void q(String string) throws k {
        this.g = string;
        b b8 = this.e;
        if (b8 != null) {
            this.i(b8, string);
        }
    }

    public h r(ax.W4.d d8) {
        return new h(d8, -1L, this.i, this.j);
    }
}

