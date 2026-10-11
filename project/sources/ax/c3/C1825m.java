package ax.c3;

import ax.G4.C0713k;
import ax.G4.C0730t;
import ax.G4.C0735x;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3592k;
import java.io.File;

/* renamed from: ax.c3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1825m extends AbstractC3595n {
    private ax.G4.P k0;
    private String l0;
    private Long m0;
    private String n0;
    private C0730t o0;
    private C0735x p0;
    private boolean q0;
    private String r0;

    public C1825m(C3592k c3592k, String str) {
        super(c3592k);
        this.l0 = str;
        if ("/".equals(str)) {
            this.q0 = true;
        } else {
            this.q0 = false;
        }
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String C() {
        ax.G4.P p = this.k0;
        if (p != null) {
            return p.a();
        }
        String str = this.l0;
        return str.substring(str.lastIndexOf(File.separator) + 1);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String F() {
        String str = this.l0;
        return str != null ? str : this.n0;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String U() {
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
            return this.l0.compareTo(((C1825m) abstractC3595n).l0);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean h() {
        return false;
    }

    public int hashCode() {
        ax.G4.P p = this.k0;
        return p != null ? p.hashCode() : this.l0.hashCode();
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean isDirectory() {
        return this.q0;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean j() {
        return true;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean l() {
        return false;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean n() {
        if ("/".equals(this.l0)) {
            return true;
        }
        if (this.k0 == null) {
            return false;
        }
        return !(r0 instanceof C0713k);
    }

    @Override // ax.c3.InterfaceC1814b
    public long p() {
        C0730t c0730t = this.o0;
        if (c0730t != null) {
            return c0730t.f();
        }
        return 0L;
    }

    @Override // ax.c3.InterfaceC1814b
    public long q() {
        if (this.m0 == null) {
            if (isDirectory()) {
                this.m0 = 0L;
            } else {
                C0730t c0730t = this.o0;
                if (c0730t != null) {
                    this.m0 = Long.valueOf(c0730t.e().getTime());
                } else {
                    this.m0 = -1L;
                }
            }
        }
        return this.m0.longValue();
    }

    @Override // ax.c3.InterfaceC1814b
    public int r(boolean z) {
        if (this.q0) {
            return X();
        }
        return -2;
    }

    @Override // ax.c3.InterfaceC1814b
    public String s() {
        if (this.r0 == null) {
            this.r0 = C1833v.e(this, "application/octet-stream");
        }
        return this.r0;
    }

    @Override // ax.c3.InterfaceC1814b
    public String t() {
        return this.l0;
    }

    public C1825m(C3592k c3592k, ax.G4.P p) {
        super(c3592k);
        this.k0 = p;
        this.l0 = p.b();
        this.n0 = p.c();
        if (p instanceof C0730t) {
            this.q0 = false;
            this.o0 = (C0730t) p;
        } else if (p instanceof C0735x) {
            this.q0 = true;
            this.p0 = (C0735x) p;
        } else {
            this.q0 = false;
        }
    }
}
