package ax.c3;

import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3598q;
import java.io.IOException;
import okhttp3.HttpUrl;

/* renamed from: ax.c3.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1811D extends AbstractC3595n {
    private ax.Sc.i k0;
    private String l0;
    private String m0;
    private Long n0;
    private Boolean o0;
    private boolean p0;
    private boolean q0;
    private boolean r0;

    public C1811D(C3598q c3598q, String str, boolean z) {
        this(c3598q, null, null, str, false);
        this.o0 = Boolean.valueOf(z);
        this.r0 = z;
    }

    private void f0() {
        this.m0 = C1833v.e(this, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    private void g0(ax.Sc.e eVar, ax.Sc.i iVar, String str) {
        String a = iVar.a();
        if (a.endsWith("/")) {
            iVar.q(1);
            return;
        }
        try {
            if (a.startsWith("/") ? eVar.B0(a) : eVar.B0(d0.Q(str, a))) {
                iVar.q(1);
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String C() {
        ax.Sc.i iVar = this.k0;
        return iVar != null ? this.q0 ? iVar.b().trim() : iVar.b() : d0.h(this.l0);
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
        ax.Sc.i iVar = this.k0;
        if (iVar == null) {
            return false;
        }
        return iVar.f(0, 0) || this.k0.f(1, 0) || this.k0.f(2, 0);
    }

    @Override // java.lang.Comparable
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC3595n abstractC3595n) {
        try {
            return this.l0.compareTo(((C1811D) abstractC3595n).l0);
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
        if (this.r0 || "/".equals(this.l0)) {
            return true;
        }
        ax.Sc.i iVar = this.k0;
        return iVar != null && iVar.g();
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean j() {
        ax.Sc.i iVar = this.k0;
        if (iVar == null) {
            return false;
        }
        return iVar.f(0, 1) || this.k0.f(1, 1) || this.k0.f(2, 1);
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean l() {
        return this.p0;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean n() {
        if (this.o0 == null) {
            if ("/".equals(this.l0)) {
                this.o0 = Boolean.TRUE;
            } else {
                this.o0 = Boolean.valueOf(this.k0 != null);
            }
        }
        return this.o0.booleanValue();
    }

    @Override // ax.c3.InterfaceC1814b
    public long p() {
        ax.Sc.i iVar = this.k0;
        if (iVar != null) {
            return iVar.d();
        }
        return 0L;
    }

    @Override // ax.c3.InterfaceC1814b
    public long q() {
        if (this.n0 == null) {
            ax.Sc.i iVar = this.k0;
            if (iVar == null || iVar.e() == null) {
                this.n0 = -1L;
            } else {
                this.n0 = Long.valueOf(this.k0.e().getTimeInMillis());
            }
        }
        return this.n0.longValue();
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
        return this.m0;
    }

    @Override // ax.c3.InterfaceC1814b
    public String t() {
        return this.l0;
    }

    public C1811D(C3598q c3598q, ax.Sc.e eVar, ax.Sc.i iVar, String str, boolean z) {
        super(c3598q);
        this.k0 = iVar;
        this.l0 = str;
        this.q0 = z;
        if (iVar != null && iVar.h()) {
            this.p0 = true;
            g0(eVar, iVar, d0.r(str));
        }
        f0();
    }
}
