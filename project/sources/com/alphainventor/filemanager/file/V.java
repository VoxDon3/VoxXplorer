package com.voxdon.xplorer.file;

import android.text.TextUtils;
import ax.c3.C1833v;
import ax.c3.d0;
import ax.h5.InterfaceC2155e;
import java.io.File;
import java.io.IOException;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class V extends AbstractC3595n {
    private String k0;
    private String l0;
    private boolean m0;
    private boolean n0;
    private boolean o0;
    private long p0;
    private long q0;
    private InterfaceC2155e r0;

    public V(U u, String str, InterfaceC2155e interfaceC2155e) {
        super(u);
        this.l0 = g0(str);
        this.n0 = true;
        this.o0 = true;
        f0();
        this.p0 = 0L;
        this.q0 = 0L;
        if (interfaceC2155e != null) {
            this.r0 = interfaceC2155e;
            this.m0 = interfaceC2155e.isDirectory();
            if (d0.D(R(), str)) {
                return;
            }
            this.p0 = interfaceC2155e.h();
            if (this.r0.isDirectory()) {
                return;
            }
            this.q0 = interfaceC2155e.getLength();
        }
    }

    private void f0() {
        this.k0 = C1833v.e(this, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    private String g0(String str) {
        return TextUtils.isEmpty(str) ? File.separator : d0.U(str.substring(str.indexOf("/")));
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

    @Override // ax.c3.InterfaceC1814b
    public boolean d() {
        return this.n0;
    }

    @Override // java.lang.Comparable
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC3595n abstractC3595n) {
        try {
            return this.l0.compareTo(((V) abstractC3595n).l0);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean h() {
        return C().startsWith(".");
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean isDirectory() {
        return this.m0;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean j() {
        return this.o0;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean l() {
        return false;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean n() {
        return this.r0 != null;
    }

    @Override // ax.c3.InterfaceC1814b
    public long p() {
        return this.q0;
    }

    @Override // ax.c3.InterfaceC1814b
    public long q() {
        return this.p0;
    }

    @Override // ax.c3.InterfaceC1814b
    public int r(boolean z) {
        String[] strArr;
        InterfaceC2155e interfaceC2155e = this.r0;
        if (interfaceC2155e == null) {
            return -1000;
        }
        if (!interfaceC2155e.isDirectory()) {
            return -2;
        }
        if (X() != -1) {
            return X();
        }
        try {
            strArr = this.r0.c0();
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
            if (ax.Q2.o.i().m()) {
                ax.Q2.o.i().b(x());
                if (ax.Q2.o.i().m()) {
                    ax.Ha.c.h().f().d("!!USB NUM CHILDREN!!").l(e).h();
                }
            }
            strArr = null;
        }
        if (strArr != null) {
            return strArr.length;
        }
        return -1;
    }

    @Override // ax.c3.InterfaceC1814b
    public String s() {
        return this.k0;
    }

    @Override // ax.c3.InterfaceC1814b
    public String t() {
        return this.l0;
    }
}
