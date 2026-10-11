package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import ax.J5.C0742c;
import ax.L5.C0790b;
import ax.M5.AbstractC0808c;
import ax.M5.C0810e;
import ax.M5.C0818m;
import ax.M5.C0822q;
import ax.j6.AbstractC2327j;
import ax.j6.InterfaceC2322e;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
final class s implements InterfaceC2322e {
    private final C3609c a;
    private final int b;
    private final C0790b c;
    private final long d;
    private final long e;

    s(C3609c c3609c, int i, C0790b c0790b, long j, long j2, String str, String str2) {
        this.a = c3609c;
        this.b = i;
        this.c = c0790b;
        this.d = j;
        this.e = j2;
    }

    static s b(C3609c c3609c, int i, C0790b c0790b) {
        boolean z;
        if (!c3609c.e()) {
            return null;
        }
        ax.M5.r a = C0822q.b().a();
        if (a == null) {
            z = true;
        } else {
            if (!a.z()) {
                return null;
            }
            z = a.B();
            o t = c3609c.t(c0790b);
            if (t != null) {
                if (!(t.u() instanceof AbstractC0808c)) {
                    return null;
                }
                AbstractC0808c abstractC0808c = (AbstractC0808c) t.u();
                if (abstractC0808c.J() && !abstractC0808c.f()) {
                    C0810e c = c(t, abstractC0808c, i);
                    if (c == null) {
                        return null;
                    }
                    t.H();
                    z = c.C();
                }
            }
        }
        return new s(c3609c, i, c0790b, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static C0810e c(o oVar, AbstractC0808c abstractC0808c, int i) {
        int[] y;
        int[] z;
        C0810e H = abstractC0808c.H();
        if (H == null || !H.B() || ((y = H.y()) != null ? !ax.R5.b.a(y, i) : !((z = H.z()) == null || !ax.R5.b.a(z, i))) || oVar.q() >= H.k()) {
            return null;
        }
        return H;
    }

    @Override // ax.j6.InterfaceC2322e
    public final void a(AbstractC2327j abstractC2327j) {
        o t;
        int i;
        int i2;
        int i3;
        int i4;
        int k;
        long j;
        long j2;
        int i5;
        if (this.a.e()) {
            ax.M5.r a = C0822q.b().a();
            if ((a == null || a.z()) && (t = this.a.t(this.c)) != null && (t.u() instanceof AbstractC0808c)) {
                AbstractC0808c abstractC0808c = (AbstractC0808c) t.u();
                boolean z = this.d > 0;
                int z2 = abstractC0808c.z();
                if (a != null) {
                    z &= a.B();
                    int k2 = a.k();
                    int y = a.y();
                    i = a.C();
                    if (abstractC0808c.J() && !abstractC0808c.f()) {
                        C0810e c = c(t, abstractC0808c, this.b);
                        if (c == null) {
                            return;
                        }
                        boolean z3 = c.C() && this.d > 0;
                        y = c.k();
                        z = z3;
                    }
                    i2 = k2;
                    i3 = y;
                } else {
                    i = 0;
                    i2 = 5000;
                    i3 = 100;
                }
                C3609c c3609c = this.a;
                if (abstractC2327j.m()) {
                    i4 = 0;
                    k = 0;
                } else {
                    if (abstractC2327j.k()) {
                        i4 = 100;
                    } else {
                        Exception i6 = abstractC2327j.i();
                        if (i6 instanceof ax.K5.b) {
                            Status a2 = ((ax.K5.b) i6).a();
                            int y2 = a2.y();
                            C0742c k3 = a2.k();
                            if (k3 == null) {
                                i4 = y2;
                            } else {
                                k = k3.k();
                                i4 = y2;
                            }
                        } else {
                            i4 = 101;
                        }
                    }
                    k = -1;
                }
                if (z) {
                    long j3 = this.d;
                    long j4 = this.e;
                    j = j3;
                    j2 = System.currentTimeMillis();
                    i5 = (int) (SystemClock.elapsedRealtime() - j4);
                } else {
                    j = 0;
                    j2 = 0;
                    i5 = -1;
                }
                c3609c.C(new C0818m(this.b, i4, k, j, j2, null, null, z2, i5), i, i2, i3);
            }
        }
    }
}
