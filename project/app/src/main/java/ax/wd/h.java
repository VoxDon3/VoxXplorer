/*
 * Decompiled with CFR 0.152.
 */
package ax.wd;

import ax.Nd.f;
import ax.wd.d;

public class h
extends d {
    public h() {
    }

    public h(h h8) {
        super(h8);
    }

    @Override
    public void a() {
        super.a();
        this.e = 7640891576956012808L;
        this.f = -4942790177534073029L;
        this.g = 4354685564936845355L;
        this.h = -6534734903238641935L;
        this.i = 5840696475078001361L;
        this.j = -7276294671716946913L;
        this.k = 2270897969802886507L;
        this.l = 6620516959819538809L;
    }

    @Override
    public int c(byte[] byArray, int n8) {
        this.s();
        ax.Nd.h.n(this.e, byArray, n8);
        ax.Nd.h.n(this.f, byArray, n8 + 8);
        ax.Nd.h.n(this.g, byArray, n8 + 16);
        ax.Nd.h.n(this.h, byArray, n8 + 24);
        ax.Nd.h.n(this.i, byArray, n8 + 32);
        ax.Nd.h.n(this.j, byArray, n8 + 40);
        ax.Nd.h.n(this.k, byArray, n8 + 48);
        ax.Nd.h.n(this.l, byArray, n8 + 56);
        this.a();
        return 64;
    }

    @Override
    public String f() {
        return "SHA-512";
    }

    @Override
    public f g() {
        return new h(this);
    }

    @Override
    public int i() {
        return 64;
    }

    @Override
    public void j(f f8) {
        this.r((h)f8);
    }
}

