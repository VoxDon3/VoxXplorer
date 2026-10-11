package com.voxdon.xplorer.file;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.b3.C1486a;
import ax.b3.C1489d;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.C1824l;
import ax.c3.EnumC1837z;
import ax.c3.d0;
import ax.c3.k0;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.InterfaceC3584c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(21)
/* renamed from: com.voxdon.xplorer.file.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3589h extends AbstractC3586e {
    private AtomicBoolean h = new AtomicBoolean(false);
    private Uri i;

    private InputStream n0(String str) throws IOException, C1495j {
        return new ParcelFileDescriptor.AutoCloseInputStream(o0(str));
    }

    private ParcelFileDescriptor o0(String str) throws IOException, C1495j {
        return C3588g.o(p(), ((C3590i) z(str)).n0(), "r");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0049, code lost:
    
        if (r3 == null) goto L28;
     */
    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream A(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            boolean r3 = r2.a()
            r5 = 0
            if (r3 != 0) goto L8
            return r5
        L8:
            java.lang.String r3 = ax.c3.d0.k(r4)
            ax.c3.z r3 = ax.c3.C1808A.g(r3)
            ax.c3.z r0 = ax.c3.EnumC1837z.IMAGE
            if (r0 != r3) goto L1f
            java.io.InputStream r3 = r2.n0(r4)     // Catch: java.lang.Exception -> L19
            return r3
        L19:
            r3 = move-exception
            r3.printStackTrace()
            goto L8b
        L1f:
            ax.c3.z r0 = ax.c3.EnumC1837z.VIDEO
            if (r0 != r3) goto L67
            android.os.ParcelFileDescriptor r3 = r2.o0(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Throwable -> L47
            android.content.Context r4 = r2.p()     // Catch: java.lang.Throwable -> L3b java.lang.Throwable -> L3e
            java.io.FileDescriptor r0 = r3.getFileDescriptor()     // Catch: java.lang.Throwable -> L3b java.lang.Throwable -> L3e
            r1 = 512(0x200, float:7.175E-43)
            android.graphics.Bitmap r5 = ax.u3.C3180B.g(r4, r5, r0, r5, r1)     // Catch: java.lang.Throwable -> L3b java.lang.Throwable -> L3e
        L35:
            r3.close()     // Catch: java.io.IOException -> L39
            goto L4c
        L39:
            goto L4c
        L3b:
            r4 = move-exception
            r5 = r3
            goto L41
        L3e:
            goto L49
        L40:
            r4 = move-exception
        L41:
            if (r5 == 0) goto L46
            r5.close()     // Catch: java.io.IOException -> L46
        L46:
            throw r4
        L47:
            r3 = r5
        L49:
            if (r3 == 0) goto L4c
            goto L35
        L4c:
            if (r5 != 0) goto L52
            android.graphics.Bitmap r5 = ax.s3.C3045a.b()
        L52:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG
            r0 = 0
            r5.compress(r4, r0, r3)
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            byte[] r3 = r3.toByteArray()
            r4.<init>(r3)
            return r4
        L67:
            ax.c3.z r0 = ax.c3.EnumC1837z.AUDIO
            if (r0 != r3) goto L8b
            android.os.ParcelFileDescriptor r3 = r2.o0(r4)     // Catch: java.lang.Throwable -> L81
            android.content.Context r4 = r2.p()     // Catch: java.lang.Throwable -> L81
            java.io.FileDescriptor r0 = r3.getFileDescriptor()     // Catch: java.lang.Throwable -> L81
            byte[] r4 = ax.u3.C3180B.k(r4, r5, r0)     // Catch: java.lang.Throwable -> L81
            r3.close()     // Catch: java.lang.Throwable -> L7f
            goto L83
        L7f:
            goto L83
        L81:
            r4 = r5
        L83:
            if (r4 == 0) goto L8b
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r3.<init>(r4)
            return r3
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3589h.A(java.lang.String, java.lang.String, java.lang.String):java.io.InputStream");
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean B(AbstractC3595n abstractC3595n) {
        return ax.X2.Q.I0();
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        return C3588g.J(this, abstractC3595n);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void D(AbstractC3595n abstractC3595n, ax.c3.G g, String str, long j, Long l, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        if (abstractC3595n.n()) {
            throw new C1495j("DocumentFile writefile already exists");
        }
        C3588g.Q(this, abstractC3595n, g, j, l, z, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void E(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j {
        C3184b.a(abstractC3595n2.n());
        Context p = p();
        if (abstractC3595n.T().equals(abstractC3595n2.T())) {
            C3588g.M(p, abstractC3595n, abstractC3595n2, interfaceC3185c, iVar);
        } else if (ax.X2.Q.I0() && abstractC3595n.P() == abstractC3595n2.P()) {
            C3588g.K(p, abstractC3595n, abstractC3595n2, interfaceC3185c, iVar);
        } else {
            C3588g.L(this, abstractC3595n, abstractC3595n2, interfaceC3185c, iVar);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void F(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        D(abstractC3595n2, s(abstractC3595n), abstractC3595n.s(), abstractC3595n.p(), Long.valueOf(abstractC3595n.q()), abstractC3595n.D(), false, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public int G(String str, String str2) {
        return -1;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        if (abstractC3595n == null) {
            return null;
        }
        EnumC1837z G = abstractC3595n.G();
        if (EnumC1837z.IMAGE == G || EnumC1837z.AUDIO == G || EnumC1837z.VIDEO == G) {
            return C1809B.Y(abstractC3595n);
        }
        return null;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void I(AbstractC3595n abstractC3595n) throws C1495j {
        C3184b.g("not support delete file recursively");
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream J(AbstractC3595n abstractC3595n, long j) throws C1495j {
        return C3588g.t(p(), abstractC3595n, j);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void K(Activity activity, Fragment fragment, InterfaceC3584c.a aVar) {
        if (aVar != null) {
            aVar.B();
        }
        if (!ax.X2.Q.R1() || !C3588g.C(p(), v(), null)) {
            this.h.compareAndSet(true, false);
            if (aVar != null) {
                aVar.T(false, null);
                return;
            }
            return;
        }
        this.i = Uri.parse(C3588g.x(p(), v(), null));
        this.h.compareAndSet(false, true);
        if (aVar != null) {
            aVar.T(true, null);
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean L() {
        return false;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean M(AbstractC3595n abstractC3595n) {
        try {
            if (abstractC3595n.n()) {
                return false;
            }
            return C3588g.d(this, abstractC3595n, true) != null;
        } catch (C1495j e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean N(AbstractC3595n abstractC3595n) {
        if (abstractC3595n.n()) {
            return false;
        }
        return C3588g.d(this, abstractC3595n, false) != null;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean O() {
        return false;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void P(AbstractC3595n abstractC3595n) throws C1495j {
        C3588g.g(this, abstractC3595n);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean Q(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        return true;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean Y() {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean a() {
        return this.h.get();
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void b() {
        this.h.compareAndSet(true, false);
    }

    public OutputStream c(String str, boolean z) throws IOException {
        try {
            return C3588g.u(this, z(str), z);
        } catch (C1495j e) {
            throw new IOException(e);
        }
    }

    @Override // com.voxdon.xplorer.file.AbstractC3586e
    public void l0(String str, long j) throws IOException {
        try {
            C3588g.P(this, z(str), j);
        } catch (C1495j e) {
            throw new IOException(e);
        }
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    void m(AbstractC3595n abstractC3595n, String str, boolean z, boolean z2, ax.g3.h hVar, InterfaceC3185c interfaceC3185c) throws C1495j {
        o(abstractC3595n, str, z, z2, hVar, interfaceC3185c);
    }

    protected AbstractC3595n m0(String str, Uri uri) throws C1495j {
        try {
            try {
                Cursor query = p().getContentResolver().query(uri, C1824l.g, null, null, null);
                if (query == null) {
                    throw new C1495j("query return null");
                }
                if (query.moveToFirst()) {
                    C3590i c3590i = new C3590i(this, d0.r(str), query);
                    ax.c3.F.a(query);
                    return c3590i;
                }
                C3590i c3590i2 = new C3590i(this, str);
                ax.c3.F.a(query);
                return c3590i2;
            } catch (IllegalArgumentException e) {
                if (!TextUtils.isEmpty(e.getMessage()) && !e.getMessage().contains("FileNotFoundException")) {
                    e.printStackTrace();
                    ax.Ha.c.h().f().b("DOCUMENT FILE EXCEPTION DO NOT CONTAIN FILENOTFOUND").l(e).h();
                }
                C3590i c3590i3 = new C3590i(this, str);
                ax.c3.F.a(null);
                return c3590i3;
            } catch (Exception e2) {
                throw C1489d.a("getFileInfo : " + e2.getClass().getSimpleName() + ":" + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            ax.c3.F.a(null);
            throw th;
        }
    }

    public Uri p0() {
        return this.i;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public k0 y() throws C1495j {
        if (ax.Q2.f.c0(u())) {
            return C3588g.k(p(), this, v(), this.i);
        }
        return null;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public AbstractC3595n z(String str) throws C1495j {
        return m0(str, C3588g.e(v(), this.i, str));
    }
}
