package com.voxdon.xplorer.file;

import ax.c3.C1833v;
import ax.c3.d0;
import com.voxdon.xplorer.file.L;
import com.jcraft.jsch.SftpATTRS;
import com.jcraft.jsch.SftpException;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class M extends AbstractC3595n {
    private SftpATTRS k0;
    private String l0;
    private String m0;
    private String n0;
    private boolean o0;
    private Long p0;

    public M(L l, String str) {
        this(l, null, null, str);
    }

    private void f0() {
        this.n0 = C1833v.e(this, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String C() {
        return this.m0;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String F() {
        return this.l0;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String U() {
        return d0.r(this.l0);
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean d() {
        SftpATTRS sftpATTRS = this.k0;
        return (sftpATTRS == null || (sftpATTRS.g() & 4) == 0) ? false : true;
    }

    @Override // java.lang.Comparable
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC3595n abstractC3595n) {
        try {
            return this.l0.compareTo(((M) abstractC3595n).l0);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean h() {
        String str = this.m0;
        return str != null && str.startsWith(".");
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean isDirectory() {
        SftpATTRS sftpATTRS = this.k0;
        return sftpATTRS != null && sftpATTRS.k();
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean j() {
        SftpATTRS sftpATTRS = this.k0;
        return (sftpATTRS == null || (sftpATTRS.g() & 2) == 0) ? false : true;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean l() {
        return this.o0;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean n() {
        return this.k0 != null;
    }

    @Override // ax.c3.InterfaceC1814b
    public long p() {
        SftpATTRS sftpATTRS = this.k0;
        if (sftpATTRS != null) {
            return sftpATTRS.i();
        }
        return 0L;
    }

    @Override // ax.c3.InterfaceC1814b
    public long q() {
        if (this.p0 == null) {
            if (this.k0 != null) {
                this.p0 = Long.valueOf(r0.e() * 1000);
            } else {
                this.p0 = -1L;
            }
        }
        return this.p0.longValue();
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
        return this.n0;
    }

    @Override // ax.c3.InterfaceC1814b
    public String t() {
        return this.l0;
    }

    public M(L l, L.e eVar, SftpATTRS sftpATTRS, String str) {
        super(l);
        this.k0 = sftpATTRS;
        this.l0 = str;
        this.m0 = d0.h(str);
        f0();
        if (sftpATTRS == null || !sftpATTRS.l()) {
            return;
        }
        this.o0 = true;
        try {
            this.k0 = eVar.o(str);
        } catch (SftpException unused) {
        }
    }
}
