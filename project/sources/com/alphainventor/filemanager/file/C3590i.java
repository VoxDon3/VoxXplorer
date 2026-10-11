package com.voxdon.xplorer.file;

import android.annotation.TargetApi;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import ax.b3.C1495j;
import ax.c3.AbstractC1823k;
import ax.c3.C1824l;
import ax.c3.C1833v;
import ax.c3.C1835x;
import ax.c3.d0;
import ax.u3.C3184b;
import com.voxdon.xplorer.FileManagerApp;

@TargetApi(21)
/* renamed from: com.voxdon.xplorer.file.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3590i extends AbstractC1823k {
    private String m0;
    private String n0;
    private String o0;
    private String p0;
    private String q0;
    private boolean r0;
    private boolean s0;
    private boolean t0;
    private boolean u0;
    private long v0;
    private long w0;
    private Uri x0;

    public C3590i(C3589h c3589h, String str, Cursor cursor) throws C1495j {
        super(c3589h);
        String str2;
        boolean z;
        String Q;
        this.x0 = c3589h.p0();
        C1824l c1824l = new C1824l(cursor);
        String str3 = c1824l.a;
        this.o0 = str3;
        if (str3 == null || !str3.endsWith("/")) {
            str2 = str3;
            z = false;
        } else {
            str2 = str3.replaceAll(".$", "_");
            z = true;
        }
        String q = C3588g.q(x(), R(), this.x0, str2, str, c1824l);
        if (d0.I(str, q)) {
            String substring = d0.n(str, q).substring(1);
            if (substring.contains("/")) {
                String replaceAll = substring.replaceAll("/", "_");
                q = d0.Q(str, replaceAll);
                if (replaceAll.length() > 12) {
                    ax.Ha.c.h().f().b("DOCUMENT FILE NAME FIXED UNUSUAL").j().g("file:" + str + "," + c1824l.b + "," + c1824l.a + "," + this.x0).h();
                }
                z = true;
            }
        } else {
            ax.Ha.c.h().b("invalid file document file path").g("parentPath:" + str + ",docId:" + c1824l.a);
        }
        if (TextUtils.isEmpty(c1824l.b)) {
            ax.Ha.c.h().f().b("empty document displayname").g("docid:" + c1824l.a + ",root:" + this.x0).h();
            Q = null;
        } else {
            Q = c1824l.b.contains("/") ? d0.Q(str, c1824l.b.replaceAll("/", "_")) : d0.Q(str, c1824l.b);
        }
        if (Q != null && !Q.equals(q) && !"/".equals(q)) {
            FileManagerApp.b("DOCUMENT FILE NAME CONFLICT:" + str + "," + c1824l.b + "," + Q + "," + q);
            if (!z) {
                ax.Ha.c.h().f().b("DOCUMENT FILE NAME CONFLICT 1").j().g("file:" + str + "," + c1824l.b + "," + c1824l.a + "," + this.x0).h();
            }
        }
        if (q == null) {
            ax.Ha.c.h().f().b("DOCUMENT FILE PATH NULL").g("file:" + str + "," + c1824l.b + "," + Q + "," + q).h();
        }
        this.n0 = q;
        this.q0 = d0.h(q);
        this.r0 = true;
        this.s0 = c1824l.d();
        this.u0 = c1824l.b();
        this.t0 = c1824l.a();
        this.v0 = c1824l.d;
        this.w0 = c1824l.e;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    protected String C() {
        return this.q0;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    protected String F() {
        return this.n0;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    protected String U() {
        return d0.r(this.n0);
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean d() {
        return this.t0;
    }

    @Override // ax.c3.AbstractC1823k
    public ParcelFileDescriptor e0(boolean z) throws C1495j {
        return z ? C3588g.o(x(), n0(), "r") : C3588g.o(x(), n0(), "rw");
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean h() {
        return C().startsWith(".");
    }

    @Override // ax.c3.AbstractC1823k
    public boolean i0() {
        return true;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean isDirectory() {
        return this.s0;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean j() {
        return this.u0;
    }

    @Override // ax.c3.AbstractC1823k
    public boolean j0() {
        return false;
    }

    @Override // ax.c3.AbstractC1823k
    public boolean k0() {
        return true;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean l() {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC3595n abstractC3595n) {
        try {
            return this.n0.compareTo(((C3590i) abstractC3595n).n0);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public String m0() {
        return this.o0;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean n() {
        return this.r0;
    }

    public Uri n0() throws C1495j {
        if (ax.Q2.f.c0(P())) {
            return C3588g.e(R(), this.x0, E());
        }
        if (P() != ax.Q2.f.h1) {
            C3184b.f();
            throw new C1495j("not reachable");
        }
        if (this.o0 != null) {
            return DocumentsContract.buildDocumentUriUsingTree(p0(), this.o0);
        }
        throw new ax.b3.t("no doc id");
    }

    public Uri o0() throws C1495j {
        if (ax.Q2.f.c0(P())) {
            return C3588g.e(R(), this.x0, T());
        }
        if (P() != ax.Q2.f.h1) {
            C3184b.f();
            throw new C1495j("not reachable");
        }
        if (this.p0 == null) {
            this.p0 = ((C3590i) C1835x.e(R()).z(T())).m0();
        }
        return DocumentsContract.buildDocumentUriUsingTree(p0(), this.p0);
    }

    @Override // ax.c3.InterfaceC1814b
    public long p() {
        return this.w0;
    }

    public Uri p0() {
        return this.x0;
    }

    @Override // ax.c3.InterfaceC1814b
    public long q() {
        return this.v0;
    }

    public void q0(String str) {
        this.p0 = str;
    }

    @Override // ax.c3.InterfaceC1814b
    public int r(boolean z) {
        if (this.s0) {
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
        return this.n0;
    }

    public C3590i(C3589h c3589h, String str) throws C1495j {
        super(c3589h);
        this.x0 = c3589h.p0();
        this.n0 = str;
        this.q0 = d0.h(str);
        this.r0 = false;
        this.s0 = false;
        this.u0 = true;
        this.t0 = true;
        this.v0 = -1L;
        this.w0 = 0L;
    }
}
