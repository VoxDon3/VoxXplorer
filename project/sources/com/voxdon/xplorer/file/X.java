package com.voxdon.xplorer.file;

import ax.b3.C1495j;
import ax.c3.C1833v;
import ax.c3.d0;

/* loaded from: classes.dex */
public class X extends AbstractC3595n {
    ax.Ia.c k0;
    String l0;
    String m0;

    public X(W w, ax.Ia.c cVar) throws C1495j {
        super(w);
        this.k0 = cVar;
        this.l0 = w.q0(cVar.k());
    }

    private boolean f0() {
        ax.Ia.c cVar = this.k0;
        if (cVar == null || cVar.q() == null) {
            return true;
        }
        return h0(this.k0.q());
    }

    private static boolean h0(String str) {
        return Integer.parseInt(str) == 1;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    protected String C() {
        return d0.h(this.l0);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    protected String F() {
        return this.l0;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    protected String U() {
        return d0.r(this.l0);
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean d() {
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC3595n abstractC3595n) {
        try {
            return this.l0.compareTo(((X) abstractC3595n).l0);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public boolean g0() {
        ax.Ia.c cVar = this.k0;
        if (cVar == null) {
            return false;
        }
        return cVar.i();
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean h() {
        if (B().startsWith(".")) {
            return true;
        }
        return !f0();
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean isDirectory() {
        if ("/".equals(this.l0)) {
            return true;
        }
        ax.Ia.c cVar = this.k0;
        return cVar != null && cVar.s();
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean j() {
        ax.Ia.c cVar = this.k0;
        if (cVar == null || cVar.n() == null) {
            return true;
        }
        return !Boolean.parseBoolean(this.k0.n());
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean l() {
        return false;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean n() {
        return "/".equals(this.l0) || this.k0 != null;
    }

    @Override // ax.c3.InterfaceC1814b
    public long p() {
        ax.Ia.c cVar = this.k0;
        if (cVar == null) {
            return 0L;
        }
        return cVar.c().longValue();
    }

    @Override // ax.c3.InterfaceC1814b
    public long q() {
        ax.Ia.c cVar = this.k0;
        if (cVar == null || cVar.l() == null) {
            return -1L;
        }
        return this.k0.l().getTime();
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
        if (this.m0 == null) {
            this.m0 = C1833v.e(this, "application/octet-stream");
        }
        return this.m0;
    }

    @Override // ax.c3.InterfaceC1814b
    public String t() {
        return this.l0;
    }

    public X(W w, String str) {
        super(w);
        this.l0 = str;
    }
}
