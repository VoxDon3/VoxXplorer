/*
 * Decompiled with CFR 0.152.
 */
package ax.l1;

import ax.P0.P;
import ax.P0.v;
import ax.j1.b;
import ax.j1.d;
import ax.j1.e;
import ax.l1.D;
import java.util.List;

public class F
implements D {
    private final D a;

    public F(D d8) {
        this.a = d8;
    }

    @Override
    public boolean a(int n8, long l8) {
        return this.a.a(n8, l8);
    }

    @Override
    public P b() {
        return this.a.b();
    }

    @Override
    public void c(long l8, long l9, long l10, List<? extends d> list, e[] eArray) {
        this.a.c(l8, l9, l10, list, eArray);
    }

    @Override
    public int d() {
        return this.a.d();
    }

    @Override
    public boolean e(long l8, b b8, List<? extends d> list) {
        return this.a.e(l8, b8, list);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof F)) {
            return false;
        }
        object = (F)object;
        return this.a.equals(((F)object).a);
    }

    @Override
    public void f() {
        this.a.f();
    }

    @Override
    public void g(boolean bl) {
        this.a.g(bl);
    }

    @Override
    public v h(int n8) {
        return this.a.h(n8);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public void i() {
        this.a.i();
    }

    @Override
    public int j(int n8) {
        return this.a.j(n8);
    }

    @Override
    public int k(long l8, List<? extends d> list) {
        return this.a.k(l8, list);
    }

    @Override
    public int l() {
        return this.a.l();
    }

    @Override
    public int length() {
        return this.a.length();
    }

    @Override
    public v m() {
        return this.a.m();
    }

    @Override
    public int n() {
        return this.a.n();
    }

    @Override
    public boolean o(int n8, long l8) {
        return this.a.o(n8, l8);
    }

    @Override
    public void p(float f8) {
        this.a.p(f8);
    }

    @Override
    public Object q() {
        return this.a.q();
    }

    @Override
    public void r() {
        this.a.r();
    }

    @Override
    public void s() {
        this.a.s();
    }

    @Override
    public int t(int n8) {
        return this.a.t(n8);
    }

    public D u() {
        return this.a;
    }
}

