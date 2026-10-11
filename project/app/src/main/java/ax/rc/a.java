/*
 * Decompiled with CFR 0.152.
 */
package ax.rc;

import ax.pc.b;
import ax.rc.i;
import ax.sc.c;

public class a
extends i {
    private int b;
    private ax.sc.b c;
    private String d;
    private ax.sc.a e;
    private c f;

    public a() {
        this.a(ax.pc.b.n0);
        this.b = 7;
        this.c = ax.sc.b.d0;
        this.d = "AE";
        this.e = ax.sc.a.h0;
        this.f = ax.sc.c.d0;
    }

    public ax.sc.a b() {
        return this.e;
    }

    public ax.sc.b c() {
        return this.c;
    }

    public c d() {
        return this.f;
    }

    public void e(ax.sc.a a8) {
        this.e = a8;
    }

    public void f(ax.sc.b b8) {
        this.c = b8;
    }

    public void g(c c8) {
        this.f = c8;
    }

    public void h(int n8) {
        this.b = n8;
    }

    public void i(String string) {
        this.d = string;
    }
}

