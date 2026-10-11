/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.g0;
import ax.r0.h;
import ax.r0.o0;
import ax.r0.p0;
import ax.r0.u0;
import ax.r0.v0;
import ax.r0.y;
import java.io.IOException;

class q0
extends o0<p0, p0> {
    q0() {
    }

    p0 A(Object object) {
        return ((y)object).unknownFields;
    }

    int B(p0 p02) {
        return p02.f();
    }

    int C(p0 p02) {
        return p02.g();
    }

    p0 D(p0 p02, p0 p03) {
        if (p03.equals(p0.e())) {
            return p02;
        }
        return p0.k(p02, p03);
    }

    p0 E() {
        return p0.l();
    }

    void F(Object object, p0 p02) {
        this.G(object, p02);
    }

    void G(Object object, p0 p02) {
        ((y)object).unknownFields = p02;
    }

    p0 H(p0 p02) {
        p02.j();
        return p02;
    }

    void I(p0 p02, v0 v02) throws IOException {
        p02.o(v02);
    }

    void J(p0 p02, v0 v02) throws IOException {
        p02.q(v02);
    }

    @Override
    void j(Object object) {
        this.A(object).j();
    }

    @Override
    boolean q(g0 g02) {
        return false;
    }

    void u(p0 p02, int n8, int n9) {
        p02.n(u0.c(n8, 5), n9);
    }

    void v(p0 p02, int n8, long l8) {
        p02.n(u0.c(n8, 1), l8);
    }

    void w(p0 p02, int n8, p0 p03) {
        p02.n(u0.c(n8, 3), p03);
    }

    void x(p0 p02, int n8, h h8) {
        p02.n(u0.c(n8, 2), h8);
    }

    void y(p0 p02, int n8, long l8) {
        p02.n(u0.c(n8, 0), l8);
    }

    p0 z(Object object) {
        p0 p02;
        p0 p03 = p02 = this.A(object);
        if (p02 == p0.e()) {
            p03 = p0.l();
            this.G(object, p03);
        }
        return p03;
    }
}

