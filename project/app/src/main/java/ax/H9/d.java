/*
 * Decompiled with CFR 0.152.
 */
package ax.H9;

import ax.B9.b;
import ax.H9.e;
import ax.H9.f;
import ax.H9.h;
import ax.H9.i;
import ax.Qa.a;

public abstract class d
extends e
implements a {
    protected f k0;
    protected b l0;

    public d(i object, b b8, int n8, int n9) {
        super(object);
        int n10 = n8 + n9;
        if (n10 <= b8.b()) {
            if (n8 >= 0) {
                this.q = b8;
                this.l0 = b8;
                this.k0 = new f();
                this.c0 = n8;
                this.d0 = n9;
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("tried to queue before start of data, ");
            ((StringBuilder)object).append(n8);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("tried to queue past end of data, ");
        ((StringBuilder)object).append(n10);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public h h() {
        return null;
    }

    public b i() {
        return this.l0;
    }

    public void j(int n8) {
        this.e0 = n8;
    }
}

