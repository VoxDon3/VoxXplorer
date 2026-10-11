/*
 * Decompiled with CFR 0.152.
 */
package ax.R3;

import android.annotation.SuppressLint;
import ax.P3.s;
import ax.R3.h;
import ax.k4.e;

public class g
extends e<ax.M3.h, s<?>>
implements h {
    private h.a e;

    public g(int n8) {
        super(n8);
    }

    @Override
    @SuppressLint(value={"InlinedApi"})
    public void a(int n8) {
        if (n8 >= 40) {
            this.b();
            return;
        }
        if (n8 >= 20) {
            this.m(this.h() / 2);
        }
    }

    @Override
    public void c(h.a a8) {
        this.e = a8;
    }

    protected int n(s<?> s8) {
        return s8.getSize();
    }

    protected void o(ax.M3.h object, s<?> s8) {
        object = this.e;
        if (object != null) {
            object.c(s8);
        }
    }
}

