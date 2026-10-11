/*
 * Decompiled with CFR 0.152.
 */
package ax.S8;

import ax.S8.c;
import ax.S8.d;
import ax.Z8.a;
import ax.h9.b;

public class e
extends c {
    private String b;

    e() {
        super(d.f0);
    }

    @Override
    protected void d(b b8, int n8) throws a.b {
        this.b = b8.C(ax.Y8.b.d);
    }

    @Override
    protected int g(b b8) {
        b8.m(this.b, ax.Y8.b.d);
        return this.b.length() * 2 + 2;
    }
}

