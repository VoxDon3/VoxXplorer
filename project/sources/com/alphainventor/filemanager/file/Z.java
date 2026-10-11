package com.voxdon.xplorer.file;

import android.text.TextUtils;
import ax.c3.C1833v;
import ax.c3.d0;

/* loaded from: classes.dex */
public class Z extends AbstractC3595n {
    private final ax.Va.e k0;
    private final String l0;

    Z(Y y, ax.Va.e eVar, String str) {
        super(y);
        this.k0 = eVar;
        if (eVar == null || eVar.g() == null) {
            this.l0 = d0.U(str);
        } else {
            this.l0 = d0.U(eVar.g().a());
        }
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    protected String C() {
        ax.Va.e eVar = this.k0;
        return (eVar == null || TextUtils.isEmpty(eVar.e())) ? d0.h(this.l0) : this.k0.e();
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
        return n();
    }

    @Override // java.lang.Comparable
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC3595n abstractC3595n) {
        return this.l0.compareTo(abstractC3595n.E());
    }

    public String f0() {
        ax.Va.e eVar = this.k0;
        if (eVar == null) {
            return null;
        }
        return eVar.h();
    }

    boolean g0() {
        ax.Va.e eVar = this.k0;
        return (eVar == null || TextUtils.isEmpty(eVar.h())) ? false : true;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean h() {
        return B().startsWith(".");
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean isDirectory() {
        if (d0.a.equals(this.l0)) {
            return true;
        }
        ax.Va.e eVar = this.k0;
        return eVar != null && eVar.k();
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean j() {
        return n();
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean l() {
        return false;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean n() {
        return d0.a.equals(this.l0) || this.k0 != null;
    }

    @Override // ax.c3.InterfaceC1814b
    public long p() {
        if (this.k0 == null || isDirectory()) {
            return 0L;
        }
        return this.k0.j();
    }

    @Override // ax.c3.InterfaceC1814b
    public long q() {
        ax.Va.e eVar = this.k0;
        if (eVar == null || eVar.d() == null) {
            return -1L;
        }
        return this.k0.d().getTime();
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
        ax.Va.e eVar = this.k0;
        if (eVar == null || TextUtils.isEmpty(eVar.c())) {
            return C1833v.e(this, "application/octet-stream");
        }
        String c = this.k0.c();
        return ("text/plain".equals(c) && p() == 0) ? C1833v.e(this, c) : this.k0.c();
    }

    @Override // ax.c3.InterfaceC1814b
    public String t() {
        return this.l0;
    }
}
