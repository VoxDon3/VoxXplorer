package ax.W2;

import ax.Dc.I;
import ax.Dc.J;
import ax.Q2.a;
import ax.W2.h;
import ax.W2.v;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.C1835x;
import ax.c3.F;
import ax.c3.K;
import ax.c3.d0;
import ax.u3.AbstractC3199q;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: ax.W2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1010b extends j {
    private C3596o A;
    private boolean B;
    private List<ax.U2.f> w;
    private c x;
    private C0216b y;
    private ax.U2.f z;

    /* renamed from: ax.W2.b$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.b.values().length];
            a = iArr;
            try {
                iArr[h.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h.b.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h.b.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: ax.W2.b$b, reason: collision with other inner class name */
    private class C0216b extends AbstractC3199q<Void, Void, Boolean> {
        public C0216b() {
            super(AbstractC3199q.e.NORMAL);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Void... voidArr) {
            Iterator it = C1010b.this.w.iterator();
            while (it.hasNext()) {
                C1010b.this.w().h(((ax.U2.f) it.next()).b());
                C1010b.this.w().g(1);
            }
            return Boolean.TRUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void p(Boolean bool) {
            C1010b.this.g0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            C1010b.this.k0();
            C1010b c1010b = C1010b.this;
            c1010b.x = c1010b.new c();
            C1010b.this.x.i(new Void[0]);
        }
    }

    /* renamed from: ax.W2.b$c */
    private class c extends AbstractC3199q<Void, Void, Integer> {
        public c() {
            super(AbstractC3199q.e.NORMAL);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Integer g(Void... voidArr) {
            boolean D0;
            ax.U2.d F = ax.U2.d.F(C1010b.this.r());
            F.f();
            for (ax.U2.f fVar : C1010b.this.w) {
                if (isCancelled()) {
                    break;
                }
                C1010b.this.z = fVar;
                if (C1010b.this.z.E()) {
                    C1010b c1010b = C1010b.this;
                    D0 = c1010b.E0(F, c1010b.z, this);
                } else {
                    C1010b c1010b2 = C1010b.this;
                    D0 = c1010b2.D0(F, c1010b2.z, this);
                }
                if (D0) {
                    C1010b.this.w().c(v.b.SUCCESS, 1);
                } else {
                    C1010b.this.w().c(v.b.FAILURE, 1);
                    C1010b.this.w().b(C1010b.this.z.q());
                }
            }
            C1010b.this.l0(true);
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void p(Integer num) {
            C1010b.this.g0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(Integer num) {
            C1010b.this.o();
        }
    }

    public C1010b(h.a aVar, List<ax.U2.f> list, boolean z) {
        super(aVar);
        C3596o d = C1835x.d(ax.Q2.f.t0, 0);
        this.A = d;
        d.n0();
        this.w = list;
        this.B = z;
        h(K.a(ax.Q2.f.V0, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean D0(ax.U2.d dVar, ax.U2.f fVar, InterfaceC3185c interfaceC3185c) {
        File z = dVar.z(fVar);
        File f = fVar.f();
        try {
            AbstractC3595n z2 = this.A.z(z.getAbsolutePath());
            AbstractC3595n z3 = this.A.z(f.getAbsolutePath());
            if (z2.n()) {
                this.A.P(z2);
                z2 = this.A.z(z.getAbsolutePath());
            }
            AbstractC3595n abstractC3595n = z2;
            C3596o c3596o = this.A;
            c3596o.j(z3, c3596o, abstractC3595n, false, false, false, interfaceC3185c, V());
            return true;
        } catch (C1486a unused) {
            return false;
        } catch (C1495j e) {
            q0(e);
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean E0(ax.U2.d dVar, ax.U2.f fVar, InterfaceC3185c interfaceC3185c) {
        try {
            try {
                return H0(r(), fVar, dVar.z(fVar), interfaceC3185c, this);
            } catch (C1495j e) {
                e = e;
                C1495j c1495j = e;
                c1495j.printStackTrace();
                q0(c1495j);
                return false;
            }
        } catch (C1495j e2) {
            e = e2;
        }
    }

    private static void F0(J j, File file, File file2, InterfaceC3185c interfaceC3185c, ax.g3.j jVar) throws C1486a, IOException {
        Throwable th;
        J j2;
        InterfaceC3185c interfaceC3185c2;
        ax.g3.j jVar2;
        if (!file2.isDirectory()) {
            throw new IOException("Not directory : " + file2.getName());
        }
        File[] listFiles = file2.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file3 = listFiles[i];
                String substring = d0.n(file.getAbsolutePath(), file3.getAbsolutePath()).substring(1);
                if (file3.isDirectory()) {
                    j.u0(new I(substring + d0.a));
                    j.d();
                    F0(j, file, file3, interfaceC3185c, jVar);
                    j2 = j;
                    interfaceC3185c2 = interfaceC3185c;
                    jVar2 = jVar;
                } else {
                    j.u0(new I(substring));
                    FileInputStream fileInputStream = null;
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file3);
                        try {
                            if ("apk".equals(d0.j(file3.getName()))) {
                                j2 = j;
                                interfaceC3185c2 = interfaceC3185c;
                                ax.g3.j jVar3 = jVar;
                                F.c(fileInputStream2, j2, file3.length(), interfaceC3185c2, jVar3);
                                jVar2 = jVar3;
                            } else {
                                j2 = j;
                                interfaceC3185c2 = interfaceC3185c;
                                jVar2 = jVar;
                                F.c(fileInputStream2, j2, file3.length(), interfaceC3185c2, null);
                            }
                            if (jVar2 != null) {
                                jVar2.b();
                            }
                            j2.d();
                            F.a(fileInputStream2);
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            F.a(fileInputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                i++;
                jVar = jVar2;
                j = j2;
                interfaceC3185c = interfaceC3185c2;
            }
        }
    }

    public static void G0(File file, File file2, int i, InterfaceC3185c interfaceC3185c, ax.g3.j jVar) throws C1486a, IOException {
        J j = null;
        try {
            J j2 = new J(new FileOutputStream(file2));
            if (i >= 0) {
                try {
                    j2.G0(i);
                } catch (Throwable th) {
                    th = th;
                    j = j2;
                    F.a(j);
                    throw th;
                }
            }
            F0(j2, file, file, interfaceC3185c, jVar);
            j2.flush();
            j2.o();
            F.a(j2);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // ax.W2.j
    public String A() {
        ax.U2.f fVar = this.z;
        return fVar == null ? HttpUrl.FRAGMENT_ENCODE_SET : fVar.q();
    }

    @Override // ax.W2.j
    public int B() {
        return 11;
    }

    @Override // ax.W2.j
    public String C() {
        return this.B ? r().getString(R.string.title_share) : r().getString(R.string.title_backup);
    }

    @Override // ax.W2.j
    public String F() {
        int i = a.a[D().ordinal()];
        if (i == 1) {
            return this.w.size() == 1 ? r().getResources().getString(R.string.msg_backed_up_one, "/backups/apps") : r().getResources().getString(R.string.msg_backed_up, "/backups/apps");
        }
        if (i == 2) {
            return r().getResources().getString(R.string.msg_backup_failed);
        }
        if (i != 3) {
            return null;
        }
        return r().getResources().getString(R.string.cancelled);
    }

    @Override // ax.W2.j
    public String G() {
        return a.a[D().ordinal()] != 2 ? HttpUrl.FRAGMENT_ENCODE_SET : v(false);
    }

    @Override // ax.W2.j
    public K H() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009d A[Catch: all -> 0x0085, TryCatch #4 {all -> 0x0085, blocks: (B:10:0x003a, B:16:0x0065, B:53:0x0081, B:61:0x0094, B:62:0x0097, B:19:0x009d, B:20:0x00a2, B:22:0x00aa, B:24:0x00c0, B:26:0x00d6, B:29:0x00e4, B:30:0x00e7, B:48:0x00f8, B:38:0x0107, B:46:0x010c, B:76:0x011f, B:77:0x0122, B:70:0x0125), top: B:9:0x003a, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #4 {all -> 0x0085, blocks: (B:10:0x003a, B:16:0x0065, B:53:0x0081, B:61:0x0094, B:62:0x0097, B:19:0x009d, B:20:0x00a2, B:22:0x00aa, B:24:0x00c0, B:26:0x00d6, B:29:0x00e4, B:30:0x00e7, B:48:0x00f8, B:38:0x0107, B:46:0x010c, B:76:0x011f, B:77:0x0122, B:70:0x0125), top: B:9:0x003a, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean H0(android.content.Context r16, ax.U2.f r17, java.io.File r18, ax.u3.InterfaceC3185c r19, ax.W2.j r20) throws ax.b3.C1495j {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.W2.C1010b.H0(android.content.Context, ax.U2.f, java.io.File, ax.u3.c, ax.W2.j):boolean");
    }

    @Override // ax.W2.j
    public String J() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // ax.W2.j
    public K K() {
        return null;
    }

    @Override // ax.W2.j
    public String M() {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // ax.W2.j
    protected boolean P() {
        return this.A.Y();
    }

    @Override // ax.W2.j
    protected boolean X() {
        boolean z;
        if (S(this.y)) {
            this.y.e();
            z = true;
        } else {
            z = false;
        }
        if (!S(this.x)) {
            return z;
        }
        this.x.e();
        return true;
    }

    @Override // ax.W2.j
    protected void Y() {
        if (this.A.Y()) {
            w().T(v.a.SCANNING);
            this.A.n(x());
        }
    }

    @Override // ax.W2.j
    protected void Z() {
        if (w().M() == w().H()) {
            t0(h.b.SUCCESS);
        } else {
            t0(h.b.FAILURE);
        }
    }

    @Override // ax.W2.j
    public void c0() {
        j0();
        C0216b c0216b = new C0216b();
        this.y = c0216b;
        c0216b.i(new Void[0]);
    }

    @Override // ax.W2.j
    public void k() {
        this.A.k0(true);
    }

    @Override // ax.W2.j
    public void n0() {
        ax.Q2.a.i().m("command", "app_backup").c("result", a.c.a(D())).d(w().x()).e();
    }

    @Override // ax.W2.j
    protected void W() {
    }
}
