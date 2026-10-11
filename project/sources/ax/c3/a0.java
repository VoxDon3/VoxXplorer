package ax.c3;

import com.voxdon.xplorer.file.AbstractC3595n;

/* loaded from: classes.dex */
public class a0 extends AbstractC3595n {
    private String k0;
    private Long l0;
    private boolean m0;
    private String n0;
    private String o0;
    private ax.la.u p0;
    private Long q0;

    public a0(com.voxdon.xplorer.file.I i, String str) {
        this(i, null, null, str);
    }

    public static long g0(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            if (str.isEmpty()) {
                return -1L;
            }
            return Long.parseLong(str.substring(1));
        } catch (Exception unused) {
            return -1L;
        }
    }

    public static String i0(long j) {
        return ax.ba.d.d + j;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    protected String C() {
        ax.la.u uVar = this.p0;
        return uVar != null ? uVar.a() : d0.h(this.k0);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    protected String F() {
        return this.k0;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    protected String U() {
        return d0.r(this.k0);
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean d() {
        if ("/".equals(this.k0)) {
            return true;
        }
        ax.la.u uVar = this.p0;
        if (uVar != null) {
            return uVar.d();
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC3595n abstractC3595n) {
        try {
            return t().compareTo(abstractC3595n.t());
        } catch (Exception unused) {
            return -1;
        }
    }

    public ax.la.u f0() {
        return this.p0;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean h() {
        String C = C();
        return C != null && C.startsWith(".");
    }

    public boolean h0() {
        ax.la.u uVar = this.p0;
        if (uVar == null || !uVar.o()) {
            return false;
        }
        ax.la.u uVar2 = this.p0;
        if (uVar2 instanceof ax.la.v) {
            return ((ax.la.v) uVar2).b();
        }
        return false;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean isDirectory() {
        return this.m0;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean j() {
        if ("/".equals(this.k0)) {
            return true;
        }
        ax.la.u uVar = this.p0;
        if (uVar != null) {
            return uVar.i() || this.p0.g();
        }
        return false;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean l() {
        return false;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean n() {
        return this.p0 != null || "/".equals(this.k0);
    }

    @Override // ax.c3.InterfaceC1814b
    public long p() {
        if (this.q0 == null) {
            ax.la.u uVar = this.p0;
            if (uVar != null && uVar.o()) {
                ax.la.u uVar2 = this.p0;
                if (uVar2 instanceof ax.la.v) {
                    this.q0 = Long.valueOf(((ax.la.v) uVar2).size());
                }
            }
            this.q0 = 0L;
        }
        return this.q0.longValue();
    }

    @Override // ax.c3.InterfaceC1814b
    public long q() {
        if (this.l0 == null) {
            ax.la.u uVar = this.p0;
            if (uVar == null || uVar.h() == null) {
                this.l0 = -1L;
            } else {
                this.l0 = Long.valueOf(this.p0.h().getTime());
            }
        }
        return this.l0.longValue();
    }

    @Override // ax.c3.InterfaceC1814b
    public int r(boolean z) {
        if (this.m0) {
            return X();
        }
        return -2;
    }

    @Override // ax.c3.InterfaceC1814b
    public String s() {
        if (this.n0 == null) {
            this.n0 = C1833v.e(this, "application/octet-stream");
        }
        return this.n0;
    }

    @Override // ax.c3.InterfaceC1814b
    public String t() {
        if ("/".equals(this.k0)) {
            return i0(0L);
        }
        ax.la.u uVar = this.p0;
        return uVar != null ? uVar.e() : "none";
    }

    public a0(com.voxdon.xplorer.file.I i, a0 a0Var, String str) {
        this(i, a0Var.t(), null, str);
    }

    public a0(com.voxdon.xplorer.file.I i, String str, ax.la.u uVar, String str2) {
        super(i);
        this.o0 = str;
        this.p0 = uVar;
        this.k0 = str2;
        if ("/".equals(str2)) {
            this.m0 = true;
        } else if (uVar != null) {
            this.m0 = uVar.f();
        } else {
            this.m0 = false;
        }
    }
}
