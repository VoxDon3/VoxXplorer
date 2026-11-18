package com.voxdon.xplorer.file;

import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import ax.b3.C1495j;
import ax.c3.AbstractC1823k;
import ax.c3.C1809B;
import ax.c3.C1824l;
import ax.c3.C1833v;
import ax.c3.C1835x;
import ax.c3.EnumC1837z;
import ax.c3.d0;
import ax.p3.C2761a;
import ax.u3.C3184b;
import ax.y0.C3495a;
import com.voxdon.xplorer.FileManagerApp;
import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.util.List;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* renamed from: com.voxdon.xplorer.file.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3605y extends AbstractC1823k {
    private static final Logger R0 = Logger.getLogger("FileManager.LocalFileInfo");
    private Boolean A0;
    private Uri B0;
    private Boolean C0;
    private Boolean D0;
    private Boolean E0;
    private int F0;
    private String G0;
    private String H0;
    private ax.c3.K I0;
    private boolean J0;
    private Boolean K0;
    private b L0;
    File M0;
    private String N0;
    private boolean O0;
    private boolean P0;
    String Q0;
    protected C3604x m0;
    protected File n0;
    private String o0;
    private String p0;
    private String q0;
    private String r0;
    private Boolean s0;
    private Long t0;
    private Long u0;
    private Long v0;
    public Boolean w0;
    public Boolean x0;
    private Boolean y0;
    private Boolean z0;

    /* renamed from: com.voxdon.xplorer.file.y$a */
    class a implements FilenameFilter {
        final /* synthetic */ boolean q;

        a(boolean z) {
            this.q = z;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            if (str != null) {
                boolean startsWith = str.startsWith(".");
                if (startsWith) {
                    C3605y.this.J0 = true;
                }
                if (this.q) {
                    if (J.k2(str)) {
                        return false;
                    }
                } else if (startsWith) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: com.voxdon.xplorer.file.y$b */
    public enum b {
        VISIBLE,
        HIDDEN_OS,
        HIDDEN_DOTHIDDEN,
        HIDDEN_LIBRARY,
        HIDDEN_NOMEDIA,
        HIDDEN_DATA,
        HIDDEN_HIDELIST,
        HIDDEN_PARENT
    }

    public C3605y(C3604x c3604x, File file, File file2, ax.c3.K k, boolean z) {
        this(c3604x, file2, k, z);
        this.M0 = file;
    }

    private void A0() {
        if (this.t0.longValue() == 0 && P() == ax.Q2.f.t0 && !F0().exists() && n0()) {
            this.t0 = Long.valueOf(C3606z.Y().n(E()));
        }
    }

    public static C3605y I0(String str) throws C1495j {
        return (C3605y) C1835x.g(str).z(str);
    }

    private static int J0(String str) {
        if (str == null) {
            return 0;
        }
        int length = str.length();
        int i = 1;
        if (length == 0) {
            return 1;
        }
        while (length > 0 && str.charAt(length - 1) == d0.b) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == d0.b) {
                i++;
            }
        }
        return i;
    }

    private static String L0(String str, String str2) {
        int i;
        int length = str2.length();
        if (str.length() > length) {
            char charAt = str.charAt(length);
            char c = d0.b;
            if (charAt != c || str.length() <= (i = length + 1)) {
                return null;
            }
            int indexOf = str.indexOf(c, i);
            return indexOf < 0 ? str : str.substring(0, indexOf);
        }
        return null;
    }

    private boolean Q0() {
        try {
            Path absolutePath = FileRetargetClass.toPath(F0()).toAbsolutePath();
            if (!Files.isDirectory(absolutePath, new LinkOption[0])) {
                return false;
            }
            DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(absolutePath);
            try {
                boolean hasNext = newDirectoryStream.iterator().hasNext();
                newDirectoryStream.close();
                return hasNext;
            } catch (Throwable th) {
                if (newDirectoryStream != null) {
                    try {
                        newDirectoryStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException | DirectoryIteratorException unused) {
            return r(true) > 0;
        }
    }

    private boolean R0() {
        if (!ax.X2.Q.V1() || P() == ax.Q2.f.o0 || !i0()) {
            return false;
        }
        if (this.v0 == null) {
            p();
        }
        return this.n0.length() == 0 && this.v0.longValue() != 0;
    }

    public static boolean U0(ax.c3.K k, String str) {
        return J0(d0.v(k, str, Boolean.TRUE)) == 3;
    }

    public static boolean Y0(String str) {
        return d0.G("/Android", str) || d0.G("/Android/obb", str) || d0.G("/Android/data", str);
    }

    public static boolean c1(C3605y c3605y, C3605y c3605y2) {
        if (c3605y.B0() != c3605y2.B0()) {
            return false;
        }
        return !ax.Q2.f.Q(c3605y.B0()) || c3605y.P0() == c3605y2.P0();
    }

    private boolean e1() {
        String str = this.p0;
        return str != null && str.equals("/");
    }

    private boolean n0() {
        return ax.t3.j.k(x()) && ax.Z2.j.F().q0();
    }

    private void n1(ax.X2.L l, boolean z, boolean z2, boolean z3, boolean z4) {
        if (l.e) {
            if (z3) {
                this.v0 = Long.valueOf(l.a);
            }
            if (z) {
                this.y0 = Boolean.valueOf(l.b);
            }
            if (z2) {
                this.t0 = Long.valueOf(l.c);
            }
            if (z4) {
                this.x0 = Boolean.TRUE;
            }
            this.w0 = Boolean.TRUE;
            return;
        }
        if (z4) {
            this.x0 = Boolean.FALSE;
        }
        Boolean bool = Boolean.FALSE;
        this.w0 = bool;
        if (z3) {
            this.v0 = 0L;
        }
        if (z2) {
            this.t0 = 0L;
        }
        if (z && this.y0 == null) {
            this.y0 = bool;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean p0(boolean r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3605y.p0(boolean, boolean):boolean");
    }

    private void p1() {
        this.y0 = Boolean.valueOf(this.n0.isDirectory());
        z0();
    }

    private boolean s1() throws C1495j {
        C1824l j = C3588g.j(x(), this);
        if (j == null) {
            this.v0 = 0L;
            Boolean bool = Boolean.FALSE;
            this.A0 = bool;
            this.z0 = bool;
            return false;
        }
        this.v0 = Long.valueOf(j.e);
        this.A0 = Boolean.valueOf(j.a());
        this.z0 = Boolean.valueOf(j.b());
        this.y0 = Boolean.valueOf(j.d());
        this.t0 = Long.valueOf(j.d);
        return true;
    }

    private void u0() {
        if (d0.B(this.p0)) {
            this.I0 = ax.Z2.j.F().J(this.n0.getAbsolutePath(), R());
            return;
        }
        ax.Ha.c.h().b("GLFLFI 2:").f().j().g("location:" + P() + ",path:" + this.p0 + ",name:" + this.n0.getName() + "," + this.n0.getAbsolutePath()).h();
        this.I0 = R();
    }

    private void u1(boolean z, boolean z2, boolean z3, boolean z4) throws IOException {
        n1(d1() ? com.voxdon.xplorer.shizuku.c.t().y(E()) : O0(), z, z2, z3, z4);
    }

    private void v0() {
        this.o0 = C1833v.e(this, "application/octet-stream");
    }

    private void w1() {
        this.t0 = Long.valueOf(this.n0.lastModified());
        A0();
    }

    private void y0() {
        if (this.v0.longValue() != 0 || isDirectory()) {
            return;
        }
        if (ax.X2.Q.H() && i0()) {
            try {
                s1();
                this.v0.longValue();
            } catch (Exception unused) {
            }
        }
        if (this.v0.longValue() == 0 && P() == ax.Q2.f.t0 && !F0().exists() && n0()) {
            this.v0 = Long.valueOf(C3606z.Y().s(E()));
        }
    }

    private void y1() {
        try {
            this.v0 = Long.valueOf(this.n0.length());
            y0();
        } catch (IllegalArgumentException unused) {
            this.v0 = -1L;
        }
    }

    private void z0() {
        if (ax.X2.Q.G() && R() == ax.c3.K.f && a1()) {
            if (this.y0.booleanValue()) {
                return;
            }
            q1();
        } else {
            if (this.y0.booleanValue() || P() != ax.Q2.f.t0 || this.n0.exists() || !n0()) {
                return;
            }
            this.y0 = Boolean.valueOf(C3606z.Y().K(E()));
        }
    }

    public ax.c3.K B0() {
        if (this.I0 == null) {
            u0();
            ax.Ha.b b2 = ax.Ha.c.h().b("BASE LOCATION UNIT NULL 2");
            StringBuilder sb = new StringBuilder();
            sb.append("loc:");
            sb.append(R());
            sb.append(",path:");
            sb.append(F());
            sb.append(",constructor:");
            sb.append(this.N0);
            sb.append(",retry:");
            sb.append(this.I0 != null);
            b2.g(sb.toString()).h();
            if (this.I0 == null) {
                this.I0 = R();
            }
        }
        return this.I0;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String C() {
        if (this.r0 == null) {
            this.r0 = this.n0.getName();
        }
        return this.r0;
    }

    public String C0() {
        if (this.H0 == null) {
            if (ax.Q2.f.g0(B0().d())) {
                C3184b.e("library:?" + B0());
                this.H0 = d0.v(B0(), E(), Boolean.valueOf(isDirectory()));
            } else {
                this.H0 = d0.v(B0(), E(), null);
            }
        }
        return this.H0;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public C3597p D() {
        if (R() == ax.c3.K.h && ax.Z2.j.F().q()) {
            return C3606z.Y().o(E());
        }
        return null;
    }

    public long D0() {
        if (this.u0 == null) {
            if (!isDirectory()) {
                if (C3495a.S(s())) {
                    try {
                        C3495a c3495a = new C3495a(E());
                        try {
                            this.u0 = c3495a.o();
                        } catch (Exception unused) {
                        }
                        if (this.u0 == null) {
                            try {
                                this.u0 = c3495a.n();
                            } catch (Exception unused2) {
                            }
                        }
                        if (this.u0 == null) {
                            this.u0 = c3495a.m();
                        }
                    } catch (IOException | Exception unused3) {
                    }
                } else {
                    G();
                    EnumC1837z enumC1837z = EnumC1837z.AUDIO;
                }
            }
            if (this.u0 == null) {
                this.u0 = Long.valueOf(q());
            }
        }
        return this.u0.longValue();
    }

    public String E0() {
        ax.Q2.f P = P();
        return P == ax.Q2.f.z0 ? !isDirectory() ? f0() : HttpUrl.FRAGMENT_ENCODE_SET : (P == ax.Q2.f.B0 || P == ax.Q2.f.A0) ? !isDirectory() ? g0() : HttpUrl.FRAGMENT_ENCODE_SET : V();
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String F() {
        return this.p0;
    }

    public File F0() {
        return this.n0;
    }

    public String G0(int i) {
        u(i);
        String str = this.Q0;
        if (str != null) {
            return str;
        }
        String w = w(D0(), i);
        this.Q0 = w;
        return w;
    }

    public b H0() {
        return this.L0;
    }

    public String K0() {
        if (this.q0 == null) {
            this.q0 = this.n0.getAbsolutePath();
        }
        return this.q0;
    }

    public String M0() {
        if (ax.Q2.f.Q(B0()) && a1()) {
            return this.G0;
        }
        return null;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public File N() {
        return F0();
    }

    public Uri N0() throws ax.b3.r {
        Uri n;
        if (this.B0 == null && ax.X2.Q.V1()) {
            String str = null;
            if (!a1()) {
                str = C3588g.x(x(), B0(), null);
            } else if (ax.Z2.j.F().E0(B0())) {
                String M0 = M0();
                if (M0 != null && M0.length() >= 14 && (n = C3588g.n(B0(), M0)) != null && C3588g.a(x(), n)) {
                    str = n.toString();
                }
            } else {
                str = C3588g.x(x(), B0(), M0());
            }
            if (TextUtils.isEmpty(str)) {
                throw new ax.b3.r("RootUri is empty");
            }
            this.B0 = Uri.parse(str);
        }
        return this.B0;
    }

    public ax.X2.L O0() throws IOException {
        return ax.X2.v.l(K0(), new ax.X2.L());
    }

    public int P0() {
        if (this.F0 == 0) {
            if (!ax.X2.Q.L()) {
                this.F0 = 1;
            } else if (!ax.Q2.f.Q(B0())) {
                this.F0 = 1;
            } else if (ax.Z2.j.F().E0(B0())) {
                String M0 = M0();
                if (M0 == null) {
                    this.F0 = 1;
                } else if (d0.H("/Android/data", M0)) {
                    this.F0 = M0.hashCode() + 268435456;
                } else if (d0.H("/Android/obb", M0)) {
                    this.F0 = M0.hashCode() + 536870912;
                } else {
                    this.F0 = 1;
                }
            } else {
                String C0 = C0();
                if (d0.H("/Android/data", C0)) {
                    this.F0 = 268435456;
                } else if (d0.H("/Android/obb", C0)) {
                    this.F0 = 536870912;
                } else {
                    this.F0 = 1;
                }
            }
        }
        return this.F0;
    }

    public boolean S0() {
        return this.J0;
    }

    public boolean T0() {
        try {
            return N0() != null;
        } catch (ax.b3.r unused) {
            return false;
        }
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String U() {
        return d0.r(this.p0);
    }

    public boolean V0() {
        String C0 = C0();
        if (C0 == null) {
            return false;
        }
        if (!d0.B(C0)) {
            ax.Q2.d.c("ISFP2", new Exception("Invalid path 2: " + C0 + ":" + F()));
        }
        return d0.G("/Android", C0);
    }

    public boolean W0() {
        return isDirectory() ? (X() == -1 || X() == -3) ? false : true : this.v0 != null;
    }

    public boolean X0() {
        return this.I0.d() == ax.Q2.f.p0;
    }

    public boolean Z0() {
        if (this.E0 == null) {
            if (a1()) {
                this.E0 = Boolean.valueOf(J0(C0()) == 4);
            } else {
                this.E0 = Boolean.FALSE;
            }
        }
        return this.E0.booleanValue();
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public boolean a0() {
        return X() >= 0 ? X() > 0 : ax.X2.Q.P0() ? Q0() : super.a0();
    }

    public boolean a1() {
        String C0;
        String L0;
        if (this.C0 == null) {
            if (ax.X2.Q.L() && ax.Q2.f.R(B0()) && (C0 = C0()) != null) {
                if (d0.H("/Android/data", C0)) {
                    if (!d0.I("/Android/data/com.voxdon.xplorer", C0)) {
                        this.C0 = Boolean.TRUE;
                        this.G0 = "/Android/data";
                    }
                } else if (d0.H("/Android/obb", C0) && !d0.I("/Android/obb/com.voxdon.xplorer", C0)) {
                    this.C0 = Boolean.TRUE;
                    this.G0 = "/Android/obb";
                }
                Boolean bool = this.C0;
                if (bool != null && bool.booleanValue() && ax.Z2.j.F().E0(B0()) && (L0 = L0(C0, this.G0)) != null) {
                    this.G0 = L0;
                }
            }
            if (this.C0 == null) {
                this.C0 = Boolean.FALSE;
            }
        }
        return this.C0.booleanValue();
    }

    public boolean b1() {
        if (this.D0 == null) {
            if (a1()) {
                this.D0 = Boolean.valueOf(J0(C0()) == 3);
            } else {
                this.D0 = Boolean.FALSE;
            }
        }
        return this.D0.booleanValue();
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean d() {
        if (this.A0 == null) {
            Boolean valueOf = Boolean.valueOf(this.n0.canRead());
            this.A0 = valueOf;
            if (!valueOf.booleanValue() && i0()) {
                if (ax.Z2.j.F().E0(B0()) && b1()) {
                    return true;
                }
                try {
                    s1();
                } catch (ax.b3.r unused) {
                } catch (Exception e) {
                    ax.Ha.c.h().f().d("DOCUMENT FILE CANREAD").l(e).g(P().I()).h();
                }
            }
        }
        return this.A0.booleanValue();
    }

    public boolean d1() {
        return this.O0;
    }

    @Override // ax.c3.AbstractC1823k
    public ParcelFileDescriptor e0(boolean z) throws C1495j {
        Uri e = C3588g.e(B0(), N0(), E());
        return z ? C3588g.o(x(), e, "r") : C3588g.o(x(), e, "rw");
    }

    public boolean f1() {
        return this.P0;
    }

    public void g1(boolean z) {
        int u;
        if (X() == -1) {
            try {
                if (d1() && (u = com.voxdon.xplorer.shizuku.c.t().u(E(), z)) != -2) {
                    d0(u);
                    return;
                }
                String[] list = this.n0.list(new a(z));
                if (list != null) {
                    d0(list.length);
                    return;
                }
                if ((P() == ax.Q2.f.t0 || a1()) && n0()) {
                    int C = C3606z.Y().C(E(), z);
                    if (C < 0) {
                        d0(-2);
                        return;
                    } else {
                        d0(C);
                        return;
                    }
                }
                if (!m0()) {
                    d0(-2);
                    return;
                }
                try {
                    try {
                        List<AbstractC3595n> J = C3588g.J(this.m0, this);
                        if (J != null) {
                            d0(J.size());
                        } else {
                            d0(-2);
                        }
                    } catch (NullPointerException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("NullPointer helper==null:");
                        sb.append(this.m0 == null);
                        sb.append(",");
                        sb.append(R().k());
                        ax.Q2.d.c("HELPERNULL", new Exception(sb.toString()));
                        d0(-2);
                    }
                } catch (C1495j unused2) {
                    d0(-2);
                }
            } catch (OutOfMemoryError unused3) {
                d0(-2);
            }
        }
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean h() {
        if (this.K0 == null) {
            this.K0 = Boolean.valueOf(C().startsWith("."));
        }
        return this.K0.booleanValue();
    }

    public boolean h1(boolean z) {
        if (!ax.X2.Q.V1() || o0() || f1()) {
            return false;
        }
        ax.c3.K B0 = B0();
        if (B0 == ax.c3.K.e) {
            return a1();
        }
        if (B0 != ax.c3.K.f) {
            return !ax.Z2.j.F().j0(B0);
        }
        if (ax.Z2.j.F().j0(B0)) {
            return a1();
        }
        if (z) {
            return true;
        }
        return a1();
    }

    @Override // ax.c3.AbstractC1823k
    public boolean i0() {
        return h1(true);
    }

    public void i1(long j) {
        this.u0 = Long.valueOf(j);
    }

    public boolean isDirectory() {
        if (this.y0 == null) {
            Boolean bool = this.x0;
            if (bool != null && !bool.booleanValue()) {
                return false;
            }
            if (e1()) {
                this.y0 = Boolean.TRUE;
            } else {
                if (ax.X2.Q.P1()) {
                    try {
                        t1();
                    } catch (Exception unused) {
                    }
                }
                if (this.y0 == null) {
                    p1();
                }
            }
        }
        return this.y0.booleanValue();
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean j() {
        if (this.z0 == null) {
            Boolean valueOf = Boolean.valueOf(this.n0.canWrite());
            this.z0 = valueOf;
            if (!valueOf.booleanValue() && i0()) {
                try {
                    s1();
                } catch (ax.b3.r unused) {
                } catch (Exception e) {
                    ax.Ha.c.h().f().d("DOCUMENT FILE CANWRITE").l(e).g("loc:" + R().toString()).h();
                }
            }
        }
        return this.z0.booleanValue();
    }

    @Override // ax.c3.AbstractC1823k
    public boolean j0() {
        return ax.X2.Q.F1() && d1();
    }

    public void j1(boolean z) {
        this.x0 = Boolean.valueOf(z);
    }

    @Override // ax.c3.AbstractC1823k
    public boolean k0() {
        if (m0()) {
            return B0() == ax.c3.K.e ? a1() : R0();
        }
        return false;
    }

    public void k1(b bVar) {
        this.K0 = Boolean.valueOf(bVar != b.VISIBLE);
        this.L0 = bVar;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean l() {
        if (this.s0 == null) {
            if (P() == ax.Q2.f.t0) {
                try {
                    this.s0 = Boolean.valueOf(C1809B.R(this.n0));
                } catch (IOException unused) {
                    this.s0 = Boolean.FALSE;
                }
            } else {
                this.s0 = Boolean.FALSE;
            }
        }
        return this.s0.booleanValue();
    }

    public void l1(boolean z) {
        this.O0 = z;
    }

    public boolean m0() {
        if (!i0()) {
            return false;
        }
        if (ax.X2.J.l() && ax.X2.J.C(B0())) {
            return false;
        }
        return T0();
    }

    public void m1(long j) {
        this.t0 = Long.valueOf(j);
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean n() {
        if (this.x0 == null) {
            q1();
        }
        return this.x0.booleanValue();
    }

    public boolean o0() {
        return ax.X2.Q.a2() && ax.Z2.j.F().q() && R() == ax.c3.K.h;
    }

    public boolean o1() {
        return false;
    }

    public long p() {
        if (this.v0 == null) {
            if (ax.X2.Q.P1()) {
                try {
                    t1();
                } catch (Exception unused) {
                }
            }
            if (this.v0 == null) {
                y1();
            }
        }
        return this.v0.longValue();
    }

    public long q() {
        if (this.t0 == null) {
            v1();
        }
        return this.t0.longValue();
    }

    public boolean q0() {
        Long l = this.t0;
        if (l == null) {
            v1();
            return false;
        }
        long longValue = l.longValue();
        v1();
        return this.t0.longValue() != longValue;
    }

    public void q1() {
        this.x0 = Boolean.valueOf(p0(false, true));
    }

    public int r(boolean z) {
        g1(z);
        return X();
    }

    public void r0() {
        this.t0 = null;
    }

    public void r1() {
        Boolean bool = this.w0;
        if (bool != null) {
            this.x0 = bool;
        } else {
            this.x0 = Boolean.valueOf(p0(true, false));
        }
    }

    @Override // ax.c3.InterfaceC1814b
    public String s() {
        if (this.o0 == null) {
            v0();
        }
        return this.o0;
    }

    @Override // java.lang.Comparable
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC3595n abstractC3595n) {
        if (abstractC3595n == null) {
            return -1;
        }
        try {
            return this.n0.compareTo(((C3605y) abstractC3595n).n0);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @Override // ax.c3.InterfaceC1814b
    public String t() {
        return this.n0.getAbsolutePath();
    }

    public void t0(C3605y c3605y) {
        this.C0 = c3605y.C0;
        this.G0 = c3605y.G0;
    }

    public void t1() throws IOException {
        u1(true, true, true, false);
        z0();
        A0();
        y0();
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    protected boolean u(int i) {
        boolean u = super.u(i);
        if (u) {
            this.Q0 = null;
        }
        return u;
    }

    public void v1() {
        if (!ax.X2.Q.P1()) {
            w1();
            return;
        }
        try {
            t1();
        } catch (IOException unused) {
            w1();
        }
    }

    public boolean w0() {
        if (this.x0 == null) {
            r1();
        }
        return this.x0.booleanValue();
    }

    public boolean x0() {
        return this.n0.exists();
    }

    public Uri x1() throws ax.b3.r {
        this.B0 = null;
        return N0();
    }

    public C3605y(C3604x c3604x, File file, ax.c3.K k) {
        this(c3604x, file, k, false);
    }

    public C3605y(C3604x c3604x, File file, ax.c3.K k, boolean z) {
        super(c3604x);
        this.L0 = b.VISIBLE;
        this.N0 = "no_constructor";
        this.m0 = c3604x;
        C3184b.b(file);
        this.n0 = file;
        this.P0 = z;
        String absolutePath = file.getAbsolutePath();
        if (z) {
            this.p0 = ax.c3.I.f(absolutePath);
            this.q0 = absolutePath;
        } else {
            this.p0 = absolutePath;
            this.q0 = absolutePath;
        }
        this.I0 = k;
        if (k == null) {
            u0();
        }
        this.N0 = "constructor 1";
    }

    public C3605y(C3604x c3604x, File file, ax.c3.K k, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2) {
        this(c3604x, file, k);
        this.y0 = Boolean.valueOf(z);
        this.s0 = Boolean.valueOf(z2);
        this.A0 = Boolean.valueOf(z3);
        this.z0 = Boolean.valueOf(z4);
        this.v0 = Long.valueOf(j);
        this.t0 = Long.valueOf(j2);
    }

    public C3605y(C3604x c3604x, C3605y c3605y) {
        super(c3604x);
        this.L0 = b.VISIBLE;
        this.N0 = "no_constructor";
        this.m0 = c3604x;
        this.B0 = c3605y.B0;
        this.n0 = c3605y.n0;
        this.p0 = c3605y.p0;
        this.y0 = c3605y.y0;
        this.s0 = c3605y.s0;
        this.A0 = c3605y.A0;
        this.z0 = c3605y.z0;
        this.v0 = c3605y.v0;
        this.t0 = c3605y.t0;
        ax.c3.K k = c3605y.I0;
        this.I0 = k;
        this.O0 = c3605y.O0;
        this.P0 = c3605y.P0;
        this.q0 = c3605y.q0;
        this.u0 = c3605y.u0;
        if (k == null) {
            u0();
        }
        this.N0 = "constructor 2";
    }

    public C3605y(C3604x c3604x, ax.c3.K k, C2761a c2761a) {
        super(c3604x);
        this.L0 = b.VISIBLE;
        this.N0 = "no_constructor";
        this.m0 = c3604x;
        this.O0 = true;
        this.n0 = new File(c2761a.q);
        this.y0 = Boolean.valueOf(c2761a.e0);
        this.s0 = Boolean.valueOf(c2761a.f0);
        this.A0 = Boolean.valueOf(c2761a.g0);
        this.z0 = Boolean.valueOf(c2761a.h0);
        this.v0 = Long.valueOf(c2761a.i0);
        this.t0 = Long.valueOf(c2761a.j0);
        this.x0 = Boolean.valueOf(c2761a.d0);
        this.r0 = c2761a.c0;
        this.p0 = c2761a.q;
        this.I0 = k;
        if (k == null) {
            u0();
        }
    }

    public C3605y(C3604x c3604x, Uri uri, ax.c3.K k, String str, Cursor cursor) throws C1495j {
        super(c3604x);
        String str2;
        boolean z;
        String Q;
        this.L0 = b.VISIBLE;
        this.N0 = "no_constructor";
        this.m0 = c3604x;
        C1824l c1824l = new C1824l(cursor);
        String str3 = c1824l.a;
        boolean z2 = true;
        if (str3 == null || !str3.endsWith("/")) {
            str2 = str3;
            z = false;
        } else {
            str2 = str3.replaceAll(".$", "_");
            z = true;
        }
        String q = C3588g.q(x(), k, uri, str2, str, c1824l);
        if (d0.J(str, q, true)) {
            String substring = d0.o(str, q, true).substring(1);
            if (substring.contains("/")) {
                String replaceAll = substring.replaceAll("/", "_");
                q = d0.Q(str, replaceAll);
                if (replaceAll.length() > 12) {
                    ax.Ha.c.h().f().b("LOCAL DOCUMENT FILE NAME FIXED UNUSUAL").j().g("file:" + str + "," + c1824l.b + "," + c1824l.a + ",root:" + uri).h();
                }
            } else {
                z2 = z;
            }
            if (TextUtils.isEmpty(c1824l.b)) {
                ax.Ha.c.h().f().b("empty local document displayname").g("id:" + c1824l.a + ",root:" + uri + ",parent:" + str).h();
                Q = null;
            } else if (c1824l.b.contains("/")) {
                Q = d0.Q(str, c1824l.b.replaceAll("/", "_"));
            } else {
                Q = d0.Q(str, c1824l.b);
            }
            if (Q != null && !Q.equalsIgnoreCase(q) && !"/".equals(q)) {
                FileManagerApp.b("LOCAL DOCUMENT FILE NAME CONFLICT:" + str + "," + c1824l.b + "," + Q + "," + q);
                if (z2) {
                    C3184b.e("DOCUMENT PATH CONFLICT");
                } else {
                    ax.Ha.c.h().f().b("LOCAL DOCUMENT FILE NAME CONFLICT 1").j().g("parent:" + str + "," + c1824l.b + "," + c1824l.a + ",root:" + uri).h();
                    throw new C1495j("path conflict");
                }
            }
            if (q == null) {
                ax.Ha.c.h().b("LOCAL DOCUMENT FILE PATH NULL").g("file:" + str + "," + c1824l.b + "," + Q + "," + q).h();
            }
            this.B0 = uri;
            this.n0 = new File(q);
            this.p0 = q;
            this.y0 = Boolean.valueOf(c1824l.d());
            this.s0 = Boolean.FALSE;
            this.z0 = Boolean.valueOf(c1824l.b());
            this.A0 = Boolean.valueOf(c1824l.a());
            this.t0 = Long.valueOf(c1824l.d);
            this.v0 = Long.valueOf(c1824l.e);
            this.I0 = k;
            if (k == null) {
                u0();
            }
            this.N0 = "constructor 3";
            return;
        }
        ax.Ha.c.h().b("invalid file local document file path").g("parentPath:" + str + ",docId:" + c1824l.a);
        throw new C1495j("path problem");
    }
}
