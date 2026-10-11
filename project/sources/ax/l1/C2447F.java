package ax.l1;

import ax.P0.C0912v;
import ax.P0.P;
import ax.j1.AbstractC2304b;
import ax.j1.AbstractC2306d;
import ax.j1.InterfaceC2307e;
import java.util.List;

/* renamed from: ax.l1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2447F implements InterfaceC2445D {
    private final InterfaceC2445D a;

    public C2447F(InterfaceC2445D interfaceC2445D) {
        this.a = interfaceC2445D;
    }

    @Override // ax.l1.InterfaceC2445D
    public boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override // ax.l1.InterfaceC2449H
    public P b() {
        return this.a.b();
    }

    @Override // ax.l1.InterfaceC2445D
    public void c(long j, long j2, long j3, List<? extends AbstractC2306d> list, InterfaceC2307e[] interfaceC2307eArr) {
        this.a.c(j, j2, j3, list, interfaceC2307eArr);
    }

    @Override // ax.l1.InterfaceC2445D
    public int d() {
        return this.a.d();
    }

    @Override // ax.l1.InterfaceC2445D
    public boolean e(long j, AbstractC2304b abstractC2304b, List<? extends AbstractC2306d> list) {
        return this.a.e(j, abstractC2304b, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2447F) {
            return this.a.equals(((C2447F) obj).a);
        }
        return false;
    }

    @Override // ax.l1.InterfaceC2445D
    public void f() {
        this.a.f();
    }

    @Override // ax.l1.InterfaceC2445D
    public void g(boolean z) {
        this.a.g(z);
    }

    @Override // ax.l1.InterfaceC2449H
    public C0912v h(int i) {
        return this.a.h(i);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // ax.l1.InterfaceC2445D
    public void i() {
        this.a.i();
    }

    @Override // ax.l1.InterfaceC2449H
    public int j(int i) {
        return this.a.j(i);
    }

    @Override // ax.l1.InterfaceC2445D
    public int k(long j, List<? extends AbstractC2306d> list) {
        return this.a.k(j, list);
    }

    @Override // ax.l1.InterfaceC2445D
    public int l() {
        return this.a.l();
    }

    @Override // ax.l1.InterfaceC2449H
    public int length() {
        return this.a.length();
    }

    @Override // ax.l1.InterfaceC2445D
    public C0912v m() {
        return this.a.m();
    }

    @Override // ax.l1.InterfaceC2445D
    public int n() {
        return this.a.n();
    }

    @Override // ax.l1.InterfaceC2445D
    public boolean o(int i, long j) {
        return this.a.o(i, j);
    }

    @Override // ax.l1.InterfaceC2445D
    public void p(float f) {
        this.a.p(f);
    }

    @Override // ax.l1.InterfaceC2445D
    public Object q() {
        return this.a.q();
    }

    @Override // ax.l1.InterfaceC2445D
    public void r() {
        this.a.r();
    }

    @Override // ax.l1.InterfaceC2445D
    public void s() {
        this.a.s();
    }

    @Override // ax.l1.InterfaceC2449H
    public int t(int i) {
        return this.a.t(i);
    }

    public InterfaceC2445D u() {
        return this.a;
    }
}
