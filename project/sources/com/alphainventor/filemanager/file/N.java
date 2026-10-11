package com.voxdon.xplorer.file;

import android.util.LruCache;
import ax.b3.C1489d;
import ax.b3.C1490e;
import ax.b3.C1495j;
import ax.b3.C1497l;
import ax.b3.C1498m;
import ax.c3.d0;
import ax.jb.C2346b;
import ax.pb.C2794a0;
import ax.pb.C2796b0;
import ax.pb.C2802e0;
import ax.pb.C2808h0;
import ax.pb.C2820u;
import ax.pb.k0;
import ax.rb.C3025d;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class N {
    private static final Logger e = Logger.getLogger("FileManager.Smb1Client");
    private Q a;
    private LruCache<String, C2796b0> b = new a(10);
    private ax.pb.r c;
    private String d;

    class a extends LruCache<String, C2796b0> {
        a(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, C2796b0 c2796b0) {
            return 1;
        }
    }

    public N(Q q) {
        this.a = q;
    }

    public static C1495j a(String str, C2794a0 c2794a0) {
        if (c2794a0 instanceof C2820u) {
            return new C1490e(c2794a0);
        }
        int c = c2794a0.c();
        return m(c) ? new ax.b3.t(c2794a0) : c == -1073741757 ? new C1497l(c2794a0) : c == -1073741697 ? new ax.b3.s(c2794a0) : c == -1073741612 ? new C1498m(c2794a0) : c2794a0.d() instanceof C3025d ? new ax.b3.q(c2794a0) : C1489d.b(str, c2794a0);
    }

    public static String g(Q q, C2796b0 c2796b0) {
        String v = c2796b0.v();
        StringBuilder sb = new StringBuilder();
        ax.Q2.f fVar = ax.Q2.f.J0;
        sb.append(fVar.K());
        sb.append("://");
        String replace = v.replace(sb.toString(), HttpUrl.FRAGMENT_ENCODE_SET);
        if (replace.isEmpty()) {
            return File.separator;
        }
        int indexOf = replace.indexOf("/");
        if (indexOf != -1) {
            return d0.U(replace.substring(indexOf));
        }
        ax.Ha.c.h().d("INVALID SMB PATH").j().g("PATH:" + c2796b0.v() + "," + c2796b0.z()).h();
        if (replace.equals(q.r0())) {
            return File.separator;
        }
        String replace2 = c2796b0.z().replace(fVar.K() + "://", HttpUrl.FRAGMENT_ENCODE_SET);
        int indexOf2 = replace2.indexOf("/");
        return indexOf2 == -1 ? d0.U(replace) : d0.U(replace2.substring(indexOf2));
    }

    private static boolean m(int i) {
        return i == -1073741810 || i == -1073741809 || i == -1073741773 || i == -1073741772 || i == -1073741766;
    }

    public static void r(C2346b c2346b, int i) throws IOException {
        (i > 0 ? k0.s(c2346b, i) : k0.s(c2346b, 445)).a(10000L);
    }

    public boolean b(AbstractC3595n abstractC3595n) {
        try {
            k(abstractC3595n.E()).h();
            return true;
        } catch (C2794a0 e2) {
            e2.printStackTrace();
            return false;
        } catch (MalformedURLException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public boolean c(AbstractC3595n abstractC3595n) {
        try {
            k(abstractC3595n.E()).O();
            return true;
        } catch (C2794a0 e2) {
            e2.printStackTrace();
            return false;
        } catch (MalformedURLException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public void d(AbstractC3595n abstractC3595n) throws C1495j {
        try {
            C2796b0 j = j(abstractC3595n, false);
            if (abstractC3595n.isDirectory() && j.M().length > 0) {
                throw new C1495j("SMB delete Directory failed : has children");
            }
            this.b.remove(abstractC3595n.E());
            j.i();
        } catch (C2794a0 e2) {
            e2.printStackTrace();
            throw a("SMB1 deleteFile", e2);
        } catch (MalformedURLException e3) {
            e3.printStackTrace();
            throw new C1495j(e3);
        }
    }

    public S e(String str) throws C1495j {
        try {
            return new S(this.a, k(str));
        } catch (C2794a0 e2) {
            e2.printStackTrace();
            int c = e2.c();
            if (m(c)) {
                return S.f0(this.a, str, true);
            }
            e.severe("SmbException : " + c);
            throw a("SMB1 getfileinfo", e2);
        } catch (NullPointerException e3) {
            e3.printStackTrace();
            ax.Ha.c.h().d("SmbFileInfo Invalid Path?").g(str + ":" + l(str)).h();
            throw new C1495j(e3);
        } catch (NumberFormatException e4) {
            e4.printStackTrace();
            ax.Ha.c.h().d("SmbFileInfo Number Format Exception").l(e4).g(str + ":" + l(str)).h();
            throw new C1495j(e4);
        } catch (MalformedURLException e5) {
            e5.printStackTrace();
            ax.Ha.c.h().f().d("MARFORMED URL 1").l(e5).g("prefix:" + this.d + ",path:" + str + ",connected:" + this.a.a()).h();
            throw new C1495j(e5);
        }
    }

    public InputStream f(AbstractC3595n abstractC3595n, long j) throws C1495j {
        try {
            b a2 = b.a(l(abstractC3595n.E()), this.c);
            if (j != 0) {
                a2.skip(j);
            }
            return new BufferedInputStream(a2, a2.b());
        } catch (C2794a0 e2) {
            throw a("SMB1 getInputStream", e2);
        } catch (FileNotFoundException e3) {
            throw new ax.b3.t(e3);
        } catch (IOException e4) {
            throw new C1495j(e4);
        }
    }

    public OutputStream h(AbstractC3595n abstractC3595n, boolean z) throws C1495j {
        try {
            C2796b0 j = j(abstractC3595n, false);
            C2802e0 b2 = z ? C2802e0.b(j) : C2802e0.a(j);
            return new BufferedOutputStream(b2, b2.d());
        } catch (C2794a0 e2) {
            throw a("SMB1 getOutputStream", e2);
        } catch (IOException e3) {
            throw C1489d.b("SMB1 getOutputStream", e3);
        }
    }

    public ax.c3.k0 i(AbstractC3595n abstractC3595n) throws C1495j {
        C2796b0 j0 = ((S) abstractC3595n).j0();
        if (j0 == null) {
            throw new C1495j("smb file is null");
        }
        try {
            long w = j0.w();
            long L = j0.L();
            return new ax.c3.k0(L, L - w);
        } catch (Exception e2) {
            throw new C1495j(e2);
        }
    }

    public C2796b0 j(AbstractC3595n abstractC3595n, boolean z) throws MalformedURLException {
        C2796b0 k;
        boolean z2 = abstractC3595n.isDirectory() || z;
        S s = (S) abstractC3595n;
        C2796b0 j0 = s.j0();
        if (j0 != null && (!z2 || j0.getURL().getPath().endsWith("/"))) {
            return j0;
        }
        if (z2) {
            k = k(abstractC3595n.E() + "/");
        } else {
            k = k(abstractC3595n.E());
        }
        s.k0(k);
        return k;
    }

    public C2796b0 k(String str) throws MalformedURLException {
        C2796b0 c2796b0 = this.b.get(str);
        if (c2796b0 != null) {
            return c2796b0;
        }
        C2796b0 c2796b02 = new C2796b0(l(str), this.c);
        this.b.put(str, c2796b02);
        if (str.endsWith("/")) {
            this.b.remove(str.substring(0, str.length() - 1));
            return c2796b02;
        }
        this.b.remove(str + "/");
        return c2796b02;
    }

    String l(String str) {
        return Q.z0(this.d, str);
    }

    public List<AbstractC3595n> n(AbstractC3595n abstractC3595n) throws C1495j {
        try {
            C2796b0 c2796b0 = new C2796b0(l(d0.O(abstractC3595n.E())), this.c);
            boolean E = d0.E(abstractC3595n);
            ArrayList arrayList = new ArrayList();
            C2796b0[] M = c2796b0.M();
            if (M != null) {
                for (C2796b0 c2796b02 : M) {
                    if (!E || c2796b02.C() == 8) {
                        arrayList.add(new S(this.a, c2796b02));
                    }
                }
            }
            return arrayList;
        } catch (C2794a0 e2) {
            throw a("SMB1 listChildren", e2);
        } catch (NullPointerException e3) {
            throw new C1495j(e3);
        } catch (MalformedURLException e4) {
            ax.Ha.c.h().f().d("MARFORMED URL 2").l(e4).h();
            throw new C1495j(e4);
        }
    }

    public void o(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) throws C1495j {
        try {
            C2796b0 j = j(abstractC3595n, false);
            j.W(j(abstractC3595n2, j.G()));
        } catch (C2794a0 e2) {
            e2.printStackTrace();
            throw a("SMB1 moveFile", e2);
        } catch (MalformedURLException e3) {
            e3.printStackTrace();
            throw new C1495j(e3);
        }
    }

    public void p(AbstractC3595n abstractC3595n, long j) throws C1495j {
        try {
            j(abstractC3595n, false).a0(j);
        } catch (C2794a0 e2) {
            throw a("SMB1 setLastModified", e2);
        } catch (IOException e3) {
            throw C1489d.b("SMB1 setLastModified", e3);
        }
    }

    public void q(ax.pb.r rVar, String str) {
        this.c = rVar;
        this.d = str;
    }

    public static class b extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
        private long c0;
        private long d0;
        private C2808h0 q;

        public b(C2808h0 c2808h0) throws IOException {
            this.q = c2808h0;
            this.c0 = c2808h0.c();
        }

        public static b a(String str, ax.pb.r rVar) throws IOException {
            C2796b0 c2796b0 = new C2796b0(str, rVar, 1);
            if (c2796b0.s()) {
                return new b(new C2808h0(c2796b0, "r"));
            }
            throw new FileNotFoundException("SmbFile does not exist");
        }

        /* JADX WARN: Multi-variable type inference failed */
        private IOException c(C2794a0 c2794a0) {
            Throwable d = c2794a0.d();
            C2794a0 c2794a02 = c2794a0;
            if (d instanceof C3025d) {
                C3025d c3025d = (C3025d) d;
                d = c3025d.a();
                c2794a02 = c3025d;
            }
            if (!(d instanceof InterruptedException)) {
                return c2794a02;
            }
            InterruptedIOException interruptedIOException = new InterruptedIOException(d.getMessage());
            interruptedIOException.initCause(d);
            return interruptedIOException;
        }

        public int b() {
            return this.q.b();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            try {
                this.q.a();
            } catch (C2794a0 e) {
                e.printStackTrace();
            }
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.c0 - this.d0 == 0) {
                return -1;
            }
            try {
                int d = this.q.d();
                this.d0 += d;
                return d;
            } catch (C2794a0 e) {
                e.printStackTrace();
                throw c(e);
            }
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            this.q.f(this.d0 + j);
            this.d0 += j;
            return j;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            return read(bArr, 0, bArr.length);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            try {
                if (this.c0 - this.d0 == 0) {
                    return -1;
                }
                int e = this.q.e(bArr, i, i2);
                this.d0 += e;
                return e;
            } catch (C2794a0 e2) {
                e2.printStackTrace();
                throw c(e2);
            }
        }
    }
}
