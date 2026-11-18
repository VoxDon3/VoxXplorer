package com.voxdon.xplorer.file;

import ax.c3.C1833v;
import ax.c3.d0;
import ax.pb.C2794a0;
import ax.pb.C2796b0;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class S extends AbstractC3595n {
    private String k0;
    private String l0;
    private String m0;
    private boolean n0;
    private boolean o0;
    private boolean p0;
    private boolean q0;
    private boolean r0;
    private boolean s0;
    private long t0;
    private long u0;
    private C2796b0 v0;
    private final boolean w0;

    public S(Q q, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        super(q);
        this.s0 = false;
        this.w0 = z4;
        this.l0 = str;
        this.m0 = q.y0(str);
        this.q0 = z;
        this.n0 = z2;
        this.o0 = true;
        this.p0 = true;
        this.r0 = z3;
        this.t0 = -1L;
        this.u0 = 0L;
    }

    public static S f0(Q q, String str, boolean z) {
        return new S(q, str, false, false, false, z);
    }

    public static S g0(Q q, String str) {
        return new S(q, str, true, true, str.endsWith("$"), false);
    }

    private void h0() {
        this.k0 = C1833v.e(this, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    private void i0(long j) {
        this.n0 = (ax.L8.a.FILE_ATTRIBUTE_DIRECTORY.getValue() & j) != 0;
        this.p0 = (ax.L8.a.FILE_ATTRIBUTE_READONLY.getValue() & j) == 0;
        this.r0 = (ax.L8.a.FILE_ATTRIBUTE_HIDDEN.getValue() & j) != 0;
        this.s0 = (j & ax.L8.a.FILE_ATTRIBUTE_REPARSE_POINT.getValue()) != 0;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String C() {
        return d0.h(this.l0);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String F() {
        return this.l0;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String U() {
        return d0.r(this.l0);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public boolean b0() {
        if (ax.X2.Q.t1()) {
            return !this.w0;
        }
        return false;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean d() {
        return this.o0;
    }

    @Override // java.lang.Comparable
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC3595n abstractC3595n) {
        try {
            return this.l0.compareTo(((S) abstractC3595n).l0);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean h() {
        return this.r0;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean isDirectory() {
        return this.n0;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean j() {
        return this.p0;
    }

    public C2796b0 j0() {
        return this.v0;
    }

    public void k0(C2796b0 c2796b0) {
        this.v0 = c2796b0;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean l() {
        return this.s0;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean n() {
        return this.q0;
    }

    @Override // ax.c3.InterfaceC1814b
    public long p() {
        return this.u0;
    }

    @Override // ax.c3.InterfaceC1814b
    public long q() {
        return this.t0;
    }

    @Override // ax.c3.InterfaceC1814b
    public int r(boolean z) {
        if (isDirectory()) {
            return X();
        }
        return -2;
    }

    @Override // ax.c3.InterfaceC1814b
    public String s() {
        if (this.k0 == null) {
            h0();
        }
        return this.k0;
    }

    @Override // ax.c3.InterfaceC1814b
    public String t() {
        return this.m0;
    }

    public S(Q q, String str, ax.N8.m mVar) {
        super(q);
        this.s0 = false;
        this.w0 = false;
        this.l0 = str;
        this.m0 = q.y0(str);
        this.q0 = true;
        this.o0 = true;
        i0(mVar.d());
        if (mVar.e() != null) {
            this.t0 = mVar.e().g();
        }
        this.u0 = mVar.c();
    }

    public S(Q q, String str, ax.N8.c cVar) throws ax.k9.d {
        super(q);
        this.s0 = false;
        this.w0 = false;
        ax.N8.e a = cVar.a();
        this.l0 = str;
        this.m0 = q.y0(str);
        this.q0 = true;
        this.o0 = true;
        i0(a.c());
        if (a.e() != null) {
            this.t0 = a.e().g();
        }
        this.u0 = cVar.b().a();
    }

    public S(Q q, C2796b0 c2796b0) throws C2794a0 {
        super(q);
        this.s0 = false;
        this.w0 = true;
        this.v0 = c2796b0;
        this.l0 = N.g(q, c2796b0);
        this.m0 = c2796b0.getURL().toString();
        this.q0 = c2796b0.s();
        h0();
        if (this.q0) {
            this.n0 = c2796b0.G();
            this.o0 = c2796b0.b();
            this.p0 = c2796b0.c();
            this.r0 = c2796b0.H();
            this.t0 = c2796b0.K();
            this.u0 = c2796b0.L();
            return;
        }
        this.n0 = false;
        this.o0 = true;
        this.p0 = true;
        this.r0 = false;
        this.t0 = -1L;
        this.u0 = 0L;
    }
}
