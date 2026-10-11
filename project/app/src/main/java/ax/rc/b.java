/*
 * Decompiled with CFR 0.152.
 */
package ax.rc;

import ax.rc.a;
import ax.rc.d;
import ax.rc.h;
import ax.rc.i;
import ax.sc.c;
import java.util.List;

public abstract class b
extends i {
    private int b;
    private byte[] c;
    private c d;
    private long e;
    private long f = 0L;
    private long g = 0L;
    private long h = 0L;
    private int i;
    private int j;
    private String k;
    private boolean l;
    private ax.sc.d m = ax.sc.d.q;
    private boolean n;
    private h o;
    private a p;
    private boolean q;
    private List<d> r;
    private boolean s;

    public void A(int n8) {
        this.j = n8;
    }

    public void B(String string) {
        this.k = string;
    }

    public void C(int n8) {
        this.i = n8;
    }

    public void D(boolean bl) {
        this.q = bl;
    }

    public void E(byte[] byArray) {
        this.c = byArray;
    }

    public void F(long l8) {
        this.e = l8;
    }

    public void G(long l8) {
        this.h = l8;
    }

    public void H(int n8) {
        this.b = n8;
    }

    public void I(h h8) {
        this.o = h8;
    }

    public a b() {
        return this.p;
    }

    public long c() {
        return this.g;
    }

    public c d() {
        return this.d;
    }

    public long e() {
        return this.f;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof b)) {
            return false;
        }
        return this.i().equals(((b)object).i());
    }

    public ax.sc.d f() {
        return this.m;
    }

    public List<d> g() {
        return this.r;
    }

    public int h() {
        return this.j;
    }

    public String i() {
        return this.k;
    }

    public byte[] j() {
        return this.c;
    }

    public long k() {
        return this.e;
    }

    public long l() {
        return this.h;
    }

    public h m() {
        return this.o;
    }

    public boolean n() {
        return this.n;
    }

    public boolean o() {
        return this.s;
    }

    public boolean p() {
        return this.l;
    }

    public boolean q() {
        return this.q;
    }

    public void r(a a8) {
        this.p = a8;
    }

    public void s(long l8) {
        this.g = l8;
    }

    public void t(c c8) {
        this.d = c8;
    }

    public void u(long l8) {
        this.f = l8;
    }

    public void v(boolean bl) {
        this.n = bl;
    }

    public void w(boolean bl) {
        this.s = bl;
    }

    public void x(boolean bl) {
        this.l = bl;
    }

    public void y(ax.sc.d d8) {
        this.m = d8;
    }

    public void z(List<d> list) {
        this.r = list;
    }
}

