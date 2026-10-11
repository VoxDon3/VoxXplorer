package ax.W2;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import ax.Dc.C0670e;
import ax.Dc.I;
import ax.Dc.S;
import ax.Dc.T;
import ax.Q2.a;
import ax.W2.h;
import ax.W2.j;
import ax.W2.t;
import ax.W2.v;
import ax.X2.Q;
import ax.a3.C1367x;
import ax.a3.K;
import ax.a3.L;
import ax.b3.C1486a;
import ax.b3.C1489d;
import ax.b3.C1492g;
import ax.b3.C1495j;
import ax.be.C1741i;
import ax.c3.AbstractC1823k;
import ax.c3.C1809B;
import ax.c3.C1813a;
import ax.c3.C1835x;
import ax.c3.F;
import ax.c3.P;
import ax.c3.U;
import ax.c3.d0;
import ax.oc.C2743a;
import ax.u3.AbstractC3199q;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3583b;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3604x;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.R;
import j$.nio.channels.DesugarChannels;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.zip.ZipException;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class u extends j {
    private AbstractC1823k A;
    private AbstractC3595n B;
    private String C;
    private AbstractC3199q<Void, Void, Boolean> D;
    private AbstractC3199q<Void, Void, Integer> E;
    private j.f F;
    private boolean G;
    private List<Map.Entry<AbstractC3595n, Long>> H;
    private List<AbstractC3595n> I;
    private C1367x.b J;
    private String K;
    private ax.B.b<String> L;
    private boolean M;
    private C3596o w;
    private String x;
    private List<e> y;
    private int z;

    class a implements L.c {
        final /* synthetic */ e a;

        a(e eVar) {
            this.a = eVar;
        }

        @Override // ax.a3.L.c
        public void X(String str) {
            this.a.s = str;
            u.this.r1();
        }

        @Override // ax.a3.L.c
        public void a() {
            u.this.i();
        }
    }

    class b implements L.c {
        final /* synthetic */ e a;

        b(e eVar) {
            this.a = eVar;
        }

        @Override // ax.a3.L.c
        public void X(String str) {
            this.a.s = str;
            u.this.D = u.this.new h();
            u.this.D.i(new Void[0]);
        }

        @Override // ax.a3.L.c
        public void a() {
            u.this.i();
        }
    }

    class c implements K.i {
        final /* synthetic */ e a;
        final /* synthetic */ ax.Ac.a b;

        c(e eVar, ax.Ac.a aVar) {
            this.a = eVar;
            this.b = aVar;
        }

        @Override // ax.a3.K.i
        public void a(j.f fVar, boolean z) {
            u.this.G = z;
            u.this.F = fVar;
            try {
                int i = d.b[fVar.ordinal()];
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                        u.this.i();
                        return;
                    } else {
                        u.this.w().c(v.b.SKIPPED, 1);
                        e eVar = this.a;
                        if (eVar.a == t.a.TAR) {
                            u.this.u1(eVar);
                        }
                        u.this.r1();
                        return;
                    }
                }
                int i2 = d.a[this.a.a.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        u uVar = u.this;
                        uVar.E = uVar.h1(this.a, fVar);
                        u.this.E.i(new Void[0]);
                        return;
                    } else if (i2 != 4 && i2 != 5) {
                        C3184b.f();
                        return;
                    }
                }
                u uVar2 = u.this;
                uVar2.E = uVar2.i1(this.a, this.b, fVar);
                u.this.E.i(new Void[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[h.b.values().length];
            c = iArr;
            try {
                iArr[h.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[h.b.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[h.b.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[j.f.values().length];
            b = iArr2;
            try {
                iArr2[j.f.OVERWRITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[j.f.RENAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[j.f.SKIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[j.f.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[j.f.NORMAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[t.a.values().length];
            a = iArr3;
            try {
                iArr3[t.a.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[t.a.XZ.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[t.a.GZ.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[t.a.TAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[t.a.SEVENZ.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static class e {
        t.a a;
        boolean b;
        ParcelFileDescriptor c;
        String d;
        AbstractC3595n e;
        AbstractC1823k f;
        String g;
        List<AbstractC3595n> h;
        long i;
        FileInputStream j;
        ax.Ec.a k;
        long l;
        boolean m;
        ax.Bc.n n;
        boolean o;
        boolean p;
        T q;
        boolean r;
        String s;
        LinkedList<ax.Ac.a> t;
        boolean u;
        ax.Cc.d v;
        ax.Cc.c w;

        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b() {
            t.a aVar = this.a;
            return aVar == t.a.GZ || aVar == t.a.XZ;
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    private class f extends AbstractC3199q<Void, Void, Integer> {
        e h;
        ax.Ac.a i;
        ax.Bc.l j;
        I k;
        j.f l;
        v.b m;
        boolean n;
        String o;
        ax.Cc.c p;

        f(e eVar, String str, ax.Ac.a aVar, j.f fVar) {
            super(AbstractC3199q.e.NORMAL);
            this.h = eVar;
            G(str, aVar, fVar);
        }

        private void A(AbstractC3595n abstractC3595n, ax.g3.i iVar) throws C1495j, C1486a {
            long j;
            InputStream u;
            ax.Bc.l lVar = this.j;
            InputStream inputStream = null;
            try {
                try {
                    long size = lVar.getSize();
                    j = -1;
                    if (size != -1) {
                        j = size;
                    }
                    u = this.h.n.u(lVar);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (C1741i e) {
                e = e;
            } catch (IOException e2) {
                e = e2;
            } catch (ArrayIndexOutOfBoundsException e3) {
                e = e3;
            } catch (IllegalStateException e4) {
                e = e4;
            } catch (NullPointerException e5) {
                e = e5;
            } catch (OutOfMemoryError e6) {
                e = e6;
            }
            try {
                u.this.w.v0(abstractC3595n, new U(u, j), abstractC3595n.s(), j, u.this.l1(lVar), null, false, this, iVar);
                if (u != null) {
                    try {
                        u.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (C1741i e7) {
                e = e7;
                if (!this.h.o) {
                    throw C1489d.a("7Z corrupted input", e);
                }
                throw new ax.b3.I(e);
            } catch (IOException e8) {
                e = e8;
                throw C1489d.a("7Z extract write error", e);
            } catch (ArrayIndexOutOfBoundsException e9) {
                e = e9;
                ax.Ha.c.h().d("7Z EOWF:").g(lVar.getSize() + ":" + lVar.getName()).h();
                throw new C1495j(e);
            } catch (IllegalStateException e10) {
                e = e10;
                ax.Ha.b d = ax.Ha.c.h().d("7Z EXWRITE:");
                StringBuilder sb = new StringBuilder();
                sb.append(e.getMessage());
                sb.append(":");
                sb.append(u.this.D().name());
                sb.append(":");
                sb.append(this.h.t == null);
                d.g(sb.toString()).h();
                throw new C1495j(e);
            } catch (NullPointerException e11) {
                e = e11;
                ax.Q2.d.b(e);
                throw new C1495j(e);
            } catch (OutOfMemoryError e12) {
                e = e12;
                throw new C1492g(e);
            } catch (Throwable th2) {
                th = th2;
                inputStream = u;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }

        private void B(AbstractC3595n abstractC3595n, ax.g3.i iVar) throws C1495j, C1486a {
            ax.Cc.c cVar = this.p;
            try {
                try {
                    try {
                        long j = cVar.j();
                        long j2 = j == -1 ? -1L : j;
                        Date h = cVar.h();
                        u.this.w.v0(abstractC3595n, new U(new P(this.h.v), j2), abstractC3595n.s(), j2, h != null ? Long.valueOf(h.getTime()) : null, null, false, this, iVar);
                        u.this.u1(this.h);
                        e eVar = this.h;
                        if (eVar.w == null) {
                            F.a(eVar.v);
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        ax.Ha.c.h().d("TAR EOWF:").g(cVar.j() + ":" + cVar.getName()).h();
                        throw new C1495j(e);
                    }
                } catch (IllegalStateException e2) {
                    ax.Ha.b d = ax.Ha.c.h().d("TAR EXWRITE:");
                    StringBuilder sb = new StringBuilder();
                    sb.append(e2.getMessage());
                    sb.append(":");
                    sb.append(u.this.D().name());
                    sb.append(":");
                    sb.append(this.h.t == null);
                    d.g(sb.toString()).h();
                    throw new C1495j(e2);
                }
            } catch (Throwable th) {
                u.this.u1(this.h);
                e eVar2 = this.h;
                if (eVar2.w == null) {
                    F.a(eVar2.v);
                }
                throw th;
            }
        }

        private void C(AbstractC3595n abstractC3595n, ax.g3.i iVar) throws C1495j, C1486a {
            long j;
            InputStream Q0;
            InputStream inputStream;
            I i = this.k;
            InputStream inputStream2 = null;
            try {
                try {
                    long size = i.getSize();
                    j = -1;
                    if (size != -1) {
                        j = size;
                    }
                    e eVar = this.h;
                    if (eVar.r) {
                        Q0 = C3583b.Q0(eVar.q, i, eVar.s);
                    } else {
                        T t = eVar.q;
                        if (t == null) {
                            ax.Q2.d.c("extractZipFileNull", new Exception("closed:" + this.h.b + ":" + isCancelled()));
                            if (!isCancelled()) {
                                throw new C1495j("zipFile is null");
                            }
                            throw new C1486a();
                        }
                        Q0 = t.j(i);
                    }
                    inputStream = Q0;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (C2743a e) {
                e = e;
            } catch (IOException e2) {
                e = e2;
            } catch (ArrayIndexOutOfBoundsException e3) {
                e = e3;
            } catch (IllegalStateException e4) {
                e = e4;
            }
            try {
                u.this.w.v0(abstractC3595n, new U(inputStream, j), abstractC3595n.s(), j, Long.valueOf(i.getTime()), null, false, this, iVar);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (C2743a e5) {
                e = e5;
                throw C1489d.a("extract write error", e);
            } catch (IOException e6) {
                e = e6;
                throw C1489d.a("extract write error", e);
            } catch (ArrayIndexOutOfBoundsException e7) {
                e = e7;
                ax.Ha.c.h().d("EOWF:").g(i.getSize() + ":" + i.getName()).h();
                throw new C1495j(e);
            } catch (IllegalStateException e8) {
                e = e8;
                ax.Ha.b d = ax.Ha.c.h().d("EXWRITE:");
                StringBuilder sb = new StringBuilder();
                sb.append(e.getMessage());
                sb.append(":");
                sb.append(u.this.D().name());
                sb.append(":");
                sb.append(this.h.t == null);
                d.g(sb.toString()).h();
                throw new C1495j(e);
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }

        private int F() {
            ax.Ac.a aVar;
            Long l1;
            e eVar = this.h;
            if (eVar.r && eVar.s == null) {
                return 13;
            }
            if (u.this.C == null) {
                this.m = v.b.FAILURE;
                return 0;
            }
            try {
                u uVar = u.this;
                uVar.B = uVar.w.z(u.this.C);
            } catch (C1495j e) {
                e.printStackTrace();
            }
            if (u.this.B == null) {
                this.m = v.b.FAILURE;
                return 0;
            }
            u.this.l0(false);
            t.a aVar2 = this.h.a;
            int i = d.a[aVar2.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (this.h.k == null) {
                        C3184b.f();
                        this.m = v.b.FAILURE;
                        return 0;
                    }
                } else if (i != 4) {
                    if (i != 5) {
                        C3184b.f();
                    } else if (this.j == null) {
                        C3184b.f();
                        this.m = v.b.FAILURE;
                        return 0;
                    }
                } else if (this.h.v == null || this.p == null) {
                    C3184b.f();
                    this.m = v.b.FAILURE;
                    return 0;
                }
            } else if (this.k == null) {
                C3184b.f();
                this.m = v.b.FAILURE;
                return 0;
            }
            try {
                AbstractC3595n z = u.this.w.z(u.this.B.T());
                if (z != null && !z.n() && !u.this.w.k(z, true)) {
                    this.m = v.b.FAILURE;
                    return 0;
                }
                if (!this.n) {
                    try {
                        try {
                            try {
                                if (u.this.B.n()) {
                                    if (u.this.B.isDirectory()) {
                                        return 2;
                                    }
                                    int i2 = d.b[this.l.ordinal()];
                                    if (i2 == 1) {
                                        try {
                                            u.this.w.P(u.this.B);
                                            u uVar2 = u.this;
                                            uVar2.B = uVar2.w.z(u.this.B.E());
                                        } catch (C1495j unused) {
                                            this.m = v.b.FAILURE;
                                            return 0;
                                        }
                                    } else if (i2 == 2) {
                                        u uVar3 = u.this;
                                        uVar3.B = uVar3.w.X(u.this.B, false);
                                    } else {
                                        if (i2 == 3) {
                                            this.m = v.b.SKIPPED;
                                            return 0;
                                        }
                                        if (i2 == 4) {
                                            u.this.i();
                                            this.m = v.b.SKIPPED;
                                            return 0;
                                        }
                                        if (i2 == 5) {
                                            return 1;
                                        }
                                    }
                                }
                                u.this.L.add(u.this.B.B());
                                y(aVar2, u.this.B, u.this.V());
                                this.m = v.b.SUCCESS;
                            } catch (C1495j unused2) {
                                this.m = v.b.FAILURE;
                                return 0;
                            }
                        } catch (C1495j e2) {
                            u.this.q0(e2);
                            if (!(e2 instanceof ax.b3.F) && !(e2 instanceof ax.b3.s) && !(e2 instanceof ax.b3.I)) {
                                ax.Ha.c.h().f().d("EXERR:").l(e2).h();
                            }
                            e2.printStackTrace();
                            this.m = v.b.FAILURE;
                        }
                    } catch (C1486a unused3) {
                        u.this.w.P(u.this.B);
                        this.m = v.b.FAILURE;
                        return 0;
                    }
                    return 0;
                }
                if (u.this.B.n()) {
                    if (!u.this.B.isDirectory()) {
                        return 2;
                    }
                    this.m = v.b.SUCCESS;
                    if ((aVar2 == t.a.ZIP || aVar2 == t.a.TAR || aVar2 == t.a.SEVENZ) && (aVar = this.i) != null && (l1 = u.this.l1(aVar)) != null) {
                        u.this.H.add(new AbstractMap.SimpleEntry(u.this.B, l1));
                    }
                    if (aVar2 == t.a.TAR) {
                        u.this.u1(this.h);
                    }
                    return 0;
                }
                if (aVar2 == t.a.ZIP) {
                    if (u.this.w.k(u.this.B, false)) {
                        Long l12 = u.this.l1(this.k);
                        if (l12 != null) {
                            u.this.H.add(new AbstractMap.SimpleEntry(u.this.B, l12));
                        }
                        this.m = v.b.SUCCESS;
                    } else {
                        this.m = v.b.FAILURE;
                    }
                    return 0;
                }
                if (aVar2 == t.a.TAR) {
                    if (u.this.w.k(u.this.B, false)) {
                        Long l13 = u.this.l1(this.p);
                        if (l13 != null) {
                            u.this.H.add(new AbstractMap.SimpleEntry(u.this.B, l13));
                        }
                        this.m = v.b.SUCCESS;
                        u.this.u1(this.h);
                    } else {
                        this.m = v.b.FAILURE;
                    }
                    return 0;
                }
                if (aVar2 != t.a.SEVENZ) {
                    C3184b.f();
                    return 0;
                }
                if (u.this.w.k(u.this.B, false)) {
                    Long l14 = u.this.l1(this.j);
                    if (l14 != null) {
                        u.this.H.add(new AbstractMap.SimpleEntry(u.this.B, l14));
                    }
                    this.m = v.b.SUCCESS;
                } else {
                    this.m = v.b.FAILURE;
                }
                return 0;
            } catch (C1495j unused4) {
                this.m = v.b.FAILURE;
                return 0;
            }
        }

        private void G(String str, ax.Ac.a aVar, j.f fVar) {
            this.k = null;
            this.p = null;
            this.j = null;
            if (aVar instanceof I) {
                this.k = (I) aVar;
            } else if (aVar instanceof ax.Cc.c) {
                this.p = (ax.Cc.c) aVar;
            } else if (aVar instanceof ax.Bc.l) {
                this.j = (ax.Bc.l) aVar;
            }
            this.l = fVar;
            this.i = aVar;
            if (aVar != null) {
                this.n = aVar.isDirectory();
            } else {
                this.n = false;
            }
            this.o = str;
            ax.Ac.a aVar2 = this.i;
            if (aVar2 != null) {
                u.this.C = d0.U(d0.R(this.h.g, aVar2.getName()));
                u.this.w().U(u.this.m1(this.i));
            }
        }

        private boolean H() {
            int i = d.a[this.h.a.ordinal()];
            if (i != 1) {
                if (i == 4) {
                    ax.Cc.c cVar = this.h.w;
                    if (cVar == null) {
                        return false;
                    }
                    G(cVar.getName(), cVar, u.this.o1());
                    return true;
                }
                if (i != 5) {
                    return false;
                }
            }
            LinkedList<ax.Ac.a> linkedList = this.h.t;
            if (linkedList == null || linkedList.isEmpty()) {
                return false;
            }
            ax.Ac.a poll = this.h.t.poll();
            G(poll.getName(), poll, u.this.o1());
            return true;
        }

        private void w() {
            ax.Cc.c cVar;
            e eVar = this.h;
            if (eVar.a == t.a.TAR && (cVar = this.p) != null && eVar.w == cVar) {
                u.this.u1(eVar);
            }
        }

        private void y(t.a aVar, AbstractC3595n abstractC3595n, ax.g3.i iVar) throws C1495j, C1486a {
            int i = d.a[aVar.ordinal()];
            if (i == 1) {
                C(abstractC3595n, iVar);
                return;
            }
            if (i == 2 || i == 3) {
                z(abstractC3595n, iVar);
                return;
            }
            if (i == 4) {
                B(abstractC3595n, iVar);
            } else if (i != 5) {
                C3184b.f();
            } else {
                A(abstractC3595n, iVar);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void z(com.voxdon.xplorer.file.AbstractC3595n r14, ax.g3.i r15) throws ax.b3.C1495j, ax.b3.C1486a {
            /*
                r13 = this;
                r11 = 0
                ax.W2.u$e r0 = r13.h     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
                ax.Ec.a r0 = r0.k     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
                boolean r1 = r0 instanceof ax.Hc.a     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
                if (r1 == 0) goto L2b
                ax.Hc.a r0 = (ax.Hc.a) r0     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
                ax.Hc.b r0 = r0.d()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
                if (r0 == 0) goto L2b
                long r1 = r0.a()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L2b
                long r0 = r0.a()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
                java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
                r6 = r0
                goto L2c
            L25:
                r0 = move-exception
                r12 = r11
                goto L73
            L28:
                r0 = move-exception
                r12 = r11
                goto L58
            L2b:
                r6 = r11
            L2c:
                ax.W2.u$e r0 = r13.h     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
                ax.Ec.a r12 = r0.k     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
                ax.W2.u r0 = ax.W2.u.this     // Catch: java.lang.Throwable -> L55 java.lang.RuntimeException -> L57
                com.voxdon.xplorer.file.o r0 = ax.W2.u.A0(r0)     // Catch: java.lang.Throwable -> L55 java.lang.RuntimeException -> L57
                ax.c3.U r2 = new ax.c3.U     // Catch: java.lang.Throwable -> L55 java.lang.RuntimeException -> L57
                r3 = -1
                r2.<init>(r12, r3)     // Catch: java.lang.Throwable -> L55 java.lang.RuntimeException -> L57
                java.lang.String r3 = r14.s()     // Catch: java.lang.Throwable -> L55 java.lang.RuntimeException -> L57
                r7 = 0
                r8 = 0
                r4 = -1
                r9 = r13
                r1 = r14
                r10 = r15
                r0.v0(r1, r2, r3, r4, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L55 java.lang.RuntimeException -> L57
                if (r12 == 0) goto L54
                r12.close()     // Catch: java.io.IOException -> L54
                ax.W2.u$e r0 = r13.h     // Catch: java.io.IOException -> L54
                r0.k = r11     // Catch: java.io.IOException -> L54
            L54:
                return
            L55:
                r0 = move-exception
                goto L73
            L57:
                r0 = move-exception
            L58:
                ax.Ha.b r1 = ax.Ha.c.h()     // Catch: java.lang.Throwable -> L55
                ax.Ha.b r1 = r1.f()     // Catch: java.lang.Throwable -> L55
                java.lang.String r2 = "Uncompressor runtime error"
                ax.Ha.b r1 = r1.d(r2)     // Catch: java.lang.Throwable -> L55
                ax.Ha.b r1 = r1.l(r0)     // Catch: java.lang.Throwable -> L55
                r1.h()     // Catch: java.lang.Throwable -> L55
                ax.b3.j r1 = new ax.b3.j     // Catch: java.lang.Throwable -> L55
                r1.<init>(r0)     // Catch: java.lang.Throwable -> L55
                throw r1     // Catch: java.lang.Throwable -> L55
            L73:
                if (r12 == 0) goto L7c
                r12.close()     // Catch: java.io.IOException -> L7c
                ax.W2.u$e r1 = r13.h     // Catch: java.io.IOException -> L7c
                r1.k = r11     // Catch: java.io.IOException -> L7c
            L7c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.W2.u.f.z(com.voxdon.xplorer.file.n, ax.g3.i):void");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public void p(Integer num) {
            u.this.g0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public void q(Integer num) {
            int intValue = num.intValue();
            if (intValue == 0) {
                if (u.this.t() == 10) {
                    u.this.o();
                    return;
                } else {
                    u.this.r1();
                    return;
                }
            }
            if (intValue == 1 || intValue == 2) {
                u.this.w1(this.h, this.o, this.i, num.intValue());
            } else {
                if (intValue != 13) {
                    return;
                }
                this.h.t.push(this.k);
                u.this.y1(this.h);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public Integer g(Void... voidArr) {
            int F;
            String str;
            do {
                F = F();
                if (F != 0) {
                    u.this.l0(true);
                    return Integer.valueOf(F);
                }
                u.this.w().c(this.m, 1);
                if (this.m == v.b.FAILURE) {
                    if (!TextUtils.isEmpty(this.o)) {
                        u.this.w().b(this.o);
                    }
                    if (u.this.K == null && (str = this.h.d) != null) {
                        u.this.K = str;
                    }
                }
                if (isCancelled() || u.this.t() == 10) {
                    u.this.l0(true);
                    return Integer.valueOf(F);
                }
                w();
            } while (H());
            u.this.l0(true);
            return Integer.valueOf(F);
        }
    }

    private class g extends AbstractC3199q<Void, Void, Integer> {
        g() {
            super(AbstractC3199q.e.NORMAL);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Integer g(Void... voidArr) {
            for (Map.Entry entry : u.this.H) {
                AbstractC3595n abstractC3595n = (AbstractC3595n) entry.getKey();
                Long l = (Long) entry.getValue();
                if (C1809B.P(abstractC3595n)) {
                    AbstractC3594m u = u.this.w.u();
                    if (u instanceof C3604x) {
                        ((C3604x) u).d((C3605y) abstractC3595n, l.longValue());
                    }
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Integer num) {
            u.this.o();
        }
    }

    private class h extends AbstractC3199q<Void, Void, Boolean> {
        public h() {
            super(AbstractC3199q.e.NORMAL);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
        
            r3 = r7.n.u(r3);
            r3.read();
            ax.c3.F.a(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
        
            if (r0 != null) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b2, code lost:
        
            ax.c3.F.a(r0);
            r7.j = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
        
            if (r0 != null) goto L63;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean A(ax.W2.u.e r7) {
            /*
                Method dump skipped, instructions count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.W2.u.h.A(ax.W2.u$e):boolean");
        }

        private void D(e eVar) throws IOException {
            FileChannel convertMaybeLegacyFileChannelFromLibrary;
            FileInputStream fileInputStream = new FileInputStream(eVar.c.getFileDescriptor());
            eVar.j = fileInputStream;
            convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
            eVar.l = convertMaybeLegacyFileChannelFromLibrary.size();
            if (eVar.s != null) {
                eVar.n = new ax.Bc.n(convertMaybeLegacyFileChannelFromLibrary, eVar.s.toCharArray());
            } else {
                eVar.n = new ax.Bc.n(convertMaybeLegacyFileChannelFromLibrary);
            }
            eVar.m = false;
        }

        private void E(e eVar) throws IOException {
            FileChannel convertMaybeLegacyFileChannelFromLibrary;
            C3184b.b(eVar.c);
            Charset b = C0670e.b(eVar.c.getFileDescriptor());
            u.this.q1(eVar);
            FileInputStream fileInputStream = new FileInputStream(eVar.c.getFileDescriptor());
            eVar.j = fileInputStream;
            convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
            eVar.l = convertMaybeLegacyFileChannelFromLibrary.size();
            eVar.q = T.u0(convertMaybeLegacyFileChannelFromLibrary, b.name());
            eVar.p = false;
        }

        private boolean F(e eVar) {
            try {
                AbstractC3595n z = u.this.w.z(eVar.g);
                if (z.n()) {
                    if (!z.isDirectory()) {
                        u.this.r0(140);
                        return false;
                    }
                } else {
                    if (!u.this.w.k(z, false)) {
                        u.this.r0(140);
                        return false;
                    }
                    u.this.M = true;
                }
                ParcelFileDescriptor parcelFileDescriptor = eVar.c;
                if (parcelFileDescriptor != null) {
                    try {
                        eVar.i = C1809B.g(parcelFileDescriptor);
                    } catch (Exception unused) {
                    }
                }
                int i = d.a[eVar.a.ordinal()];
                if (i == 1) {
                    return J(eVar);
                }
                if (i == 2 || i == 3) {
                    return G(eVar);
                }
                if (i == 4) {
                    return I(eVar);
                }
                if (i == 5) {
                    return H(eVar);
                }
                C3184b.f();
                return false;
            } catch (C1495j e) {
                u.this.q0(e);
                return false;
            }
        }

        private boolean G(e eVar) {
            FileChannel convertMaybeLegacyFileChannelFromLibrary;
            try {
                FileInputStream x = x(eVar);
                if (x == null) {
                    return false;
                }
                convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(x.getChannel());
                eVar.l = convertMaybeLegacyFileChannelFromLibrary.size();
                t.a aVar = eVar.a;
                if (aVar == t.a.GZ) {
                    eVar.k = new ax.Hc.a(x);
                } else if (aVar == t.a.XZ) {
                    eVar.k = new ax.Jc.a(x);
                } else {
                    C3184b.f();
                }
                u.this.w().h(eVar.l);
                u.this.w().g(1);
                return true;
            } catch (Exception unused) {
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }

        private boolean H(e eVar) throws C1495j {
            try {
                if (eVar.s == null) {
                    boolean A = A(eVar);
                    eVar.o = A;
                    if (A) {
                        return false;
                    }
                    if (eVar.c != null) {
                        u.this.q1(eVar);
                    }
                }
                if (eVar.c != null) {
                    D(eVar);
                } else {
                    AbstractC1823k abstractC1823k = eVar.f;
                    if (abstractC1823k == null || !abstractC1823k.k0()) {
                        AbstractC1823k abstractC1823k2 = eVar.f;
                        if (!(abstractC1823k2 instanceof C3605y)) {
                            C3184b.f();
                            return false;
                        }
                        C3605y c3605y = (C3605y) abstractC1823k2;
                        if (Q.F1() && c3605y.d1()) {
                            try {
                                ParcelFileDescriptor y = y(c3605y);
                                eVar.c = y;
                                eVar.i = 0L;
                                if (y == null) {
                                    return false;
                                }
                                D(eVar);
                            } catch (C1495j unused) {
                                return false;
                            }
                        } else {
                            File F0 = c3605y.F0();
                            eVar.l = F0.length();
                            if (eVar.s != null) {
                                eVar.n = new ax.Bc.n(F0, eVar.s.toCharArray());
                            } else {
                                eVar.n = new ax.Bc.n(F0);
                            }
                            eVar.m = true;
                        }
                    } else {
                        try {
                            ParcelFileDescriptor e0 = eVar.f.e0(true);
                            eVar.c = e0;
                            eVar.i = 0L;
                            if (e0 == null) {
                                return false;
                            }
                            D(eVar);
                        } catch (C1495j unused2) {
                            return false;
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e2) {
                e2.printStackTrace();
            } catch (OutOfMemoryError e3) {
                ax.Q2.d.c("SevenZPrepare", e3);
                e3.printStackTrace();
            } catch (RuntimeException e4) {
                e4.printStackTrace();
            } catch (ZipException e5) {
                e5.printStackTrace();
            }
            if (eVar.n == null) {
                return false;
            }
            try {
                u.this.j1(eVar, this);
                return true;
            } catch (C1486a unused3) {
                return false;
            }
        }

        private boolean I(e eVar) {
            FileChannel convertMaybeLegacyFileChannelFromLibrary;
            try {
                FileInputStream x = x(eVar);
                if (x == null) {
                    return false;
                }
                InputStream z = z(x, eVar);
                convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(x.getChannel());
                eVar.l = convertMaybeLegacyFileChannelFromLibrary.size();
                ax.Cc.d dVar = null;
                try {
                    ax.Cc.d dVar2 = new ax.Cc.d(new BufferedInputStream(z));
                    while (true) {
                        try {
                            ax.Cc.c p = dVar2.p();
                            if (p == null) {
                                break;
                            }
                            u.this.w().h(p.j());
                            u.this.w().g(1);
                        } catch (Throwable th) {
                            th = th;
                            dVar = dVar2;
                            F.a(dVar);
                            throw th;
                        }
                    }
                    F.a(dVar2);
                    if (eVar.c != null) {
                        u.this.q1(eVar);
                    }
                    FileInputStream x2 = x(eVar);
                    if (x2 == null) {
                        return false;
                    }
                    eVar.v = new ax.Cc.d(new BufferedInputStream(z(x2, eVar)));
                    return u.this.u1(eVar);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            } catch (Throwable th3) {
                throw th3;
            }
        }

        private boolean J(e eVar) {
            try {
                if (eVar.c != null) {
                    E(eVar);
                } else {
                    AbstractC1823k abstractC1823k = eVar.f;
                    if (abstractC1823k == null || !abstractC1823k.k0()) {
                        AbstractC1823k abstractC1823k2 = eVar.f;
                        if (!(abstractC1823k2 instanceof C3605y)) {
                            C3184b.f();
                            return false;
                        }
                        C3605y c3605y = (C3605y) abstractC1823k2;
                        if (Q.F1() && c3605y.d1()) {
                            try {
                                ParcelFileDescriptor y = y(c3605y);
                                eVar.c = y;
                                eVar.i = 0L;
                                if (y == null) {
                                    return false;
                                }
                                E(eVar);
                            } catch (C1495j unused) {
                                return false;
                            }
                        } else {
                            File F0 = c3605y.F0();
                            Charset a = C0670e.a(F0);
                            eVar.l = F0.length();
                            eVar.q = T.s0(F0, a.name());
                            eVar.p = true;
                        }
                    } else {
                        try {
                            ParcelFileDescriptor e0 = eVar.f.e0(true);
                            eVar.c = e0;
                            eVar.i = 0L;
                            if (e0 == null) {
                                return false;
                            }
                            E(eVar);
                        } catch (C1495j unused2) {
                            return false;
                        }
                    }
                }
            } catch (ZipException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e3) {
                e3.printStackTrace();
            } catch (RuntimeException e4) {
                e4.printStackTrace();
            }
            T t = eVar.q;
            if (t == null) {
                return false;
            }
            try {
                eVar.r = C3583b.d1(t, this);
                u.this.k1(eVar, this);
                return true;
            } catch (C1486a unused3) {
                return false;
            }
        }

        private ParcelFileDescriptor y(C3605y c3605y) throws C1495j {
            return ((C3604x) C1835x.g(c3605y.E()).u()).U0(c3605y);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public void p(Boolean bool) {
            u.this.g0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            if (bool.booleanValue()) {
                u.this.z = 0;
                u.this.k0();
                u.this.r1();
                return;
            }
            e n1 = u.this.n1();
            if (n1.a == t.a.SEVENZ && n1.o && n1.s == null) {
                u.this.x1(n1);
            } else {
                u.this.g1(n1);
                u.this.o();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Void... voidArr) {
            AbstractC1823k abstractC1823k;
            if (u.this.I == null) {
                return Boolean.valueOf(F(u.this.n1()));
            }
            while (u.this.z < u.this.y.size()) {
                e n1 = u.this.n1();
                AbstractC3595n abstractC3595n = n1.e;
                if (C1809B.H(abstractC3595n)) {
                    abstractC1823k = (AbstractC1823k) abstractC3595n;
                } else {
                    if (!abstractC3595n.N().exists()) {
                        C3184b.f();
                        return Boolean.FALSE;
                    }
                    File N = abstractC3595n.N();
                    try {
                        abstractC1823k = (C3605y) C1835x.f(N).z(N.getAbsolutePath());
                    } catch (C1495j unused) {
                        return Boolean.FALSE;
                    }
                }
                n1.f = abstractC1823k;
                if (!F(n1)) {
                    return Boolean.FALSE;
                }
                u.this.s1();
            }
            return Boolean.TRUE;
        }

        FileInputStream x(e eVar) throws IOException {
            if (eVar.c != null) {
                return new FileInputStream(eVar.c.getFileDescriptor());
            }
            AbstractC1823k abstractC1823k = eVar.f;
            if (abstractC1823k != null && abstractC1823k.k0()) {
                try {
                    ParcelFileDescriptor e0 = eVar.f.e0(true);
                    eVar.c = e0;
                    eVar.i = 0L;
                    if (e0 == null) {
                        return null;
                    }
                    return new FileInputStream(eVar.c.getFileDescriptor());
                } catch (C1495j unused) {
                    return null;
                }
            }
            AbstractC1823k abstractC1823k2 = eVar.f;
            if (!(abstractC1823k2 instanceof C3605y)) {
                return null;
            }
            C3605y c3605y = (C3605y) abstractC1823k2;
            if (!Q.F1() || !c3605y.d1()) {
                return new FileInputStream(c3605y.F0());
            }
            try {
                ParcelFileDescriptor y = y(c3605y);
                eVar.c = y;
                eVar.i = 0L;
                if (y == null) {
                    return null;
                }
                return new FileInputStream(eVar.c.getFileDescriptor());
            } catch (C1495j unused2) {
                return null;
            }
        }

        InputStream z(FileInputStream fileInputStream, e eVar) throws IOException {
            String str = eVar.d;
            if (str == null) {
                C3184b.f();
                return fileInputStream;
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            return (lowerCase.endsWith(".tar.xz") || lowerCase.endsWith(".txz")) ? new ax.Jc.a(fileInputStream) : (lowerCase.endsWith(".tar.gz") || lowerCase.endsWith(".tgz")) ? new ax.Hc.a(fileInputStream) : fileInputStream;
        }
    }

    public u(h.a aVar, List<AbstractC3595n> list, C3596o c3596o, C1367x.b bVar, String str) {
        super(aVar);
        this.y = new ArrayList();
        this.H = new ArrayList();
        this.L = new ax.B.b<>();
        this.w = c3596o;
        this.x = str;
        this.I = list;
        this.J = bVar;
        c3596o.n0();
        h(this.w.T());
        for (AbstractC3595n abstractC3595n : this.I) {
            e eVar = new e(null);
            eVar.e = abstractC3595n;
            eVar.d = abstractC3595n.B();
            eVar.a = t.k(abstractC3595n.B());
            if (this.J == C1367x.b.AUTO) {
                eVar.g = d0.e(str, abstractC3595n.B());
            } else {
                eVar.g = str;
            }
            this.y.add(eVar);
        }
    }

    private void A1(e eVar) {
        String a2;
        int i = d.a[eVar.a.ordinal()];
        if (i == 2) {
            a2 = ax.Jc.b.a(eVar.d);
        } else if (i != 3) {
            C3184b.f();
            a2 = ax.Jc.b.a(eVar.d);
        } else {
            a2 = ax.Hc.c.a(eVar.d);
        }
        this.C = d0.U(d0.R(eVar.g, a2));
        w().U(eVar.l);
        f h1 = h1(eVar, j.f.NORMAL);
        this.E = h1;
        h1.i(new Void[0]);
    }

    private void B1(e eVar) {
        f i1 = i1(eVar, eVar.w, o1());
        this.E = i1;
        i1.i(new Void[0]);
    }

    private void C1(e eVar) {
        f i1 = i1(eVar, (I) eVar.t.poll(), o1());
        this.E = i1;
        i1.i(new Void[0]);
    }

    private void e1(S s, Queue<ax.Ac.a> queue, C1813a c1813a) {
        I g2;
        List<C1813a> i0;
        if (c1813a == null || (g2 = s.g(c1813a.t())) == null) {
            return;
        }
        queue.add(g2);
        w().h(g2.getSize());
        w().g(1);
        if (!g2.isDirectory() || (i0 = c1813a.i0()) == null) {
            return;
        }
        synchronized (i0) {
            try {
                Iterator<C1813a> it = i0.iterator();
                while (it.hasNext()) {
                    e1(s, queue, it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void f1() {
        Iterator<e> it = this.y.iterator();
        while (it.hasNext()) {
            g1(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1(e eVar) {
        if (eVar.t != null) {
            eVar.t = null;
        }
        if (eVar.p) {
            F.a(eVar.q);
            eVar.q = null;
        }
        if (eVar.m) {
            F.a(eVar.n);
            eVar.n = null;
        }
        FileInputStream fileInputStream = eVar.j;
        if (fileInputStream != null) {
            F.a(fileInputStream);
            eVar.j = null;
        }
        ax.Ec.a aVar = eVar.k;
        if (aVar != null) {
            F.a(aVar);
            eVar.k = null;
        }
        eVar.w = null;
        ax.Cc.d dVar = eVar.v;
        if (dVar != null) {
            F.a(dVar);
            eVar.v = null;
        }
        ParcelFileDescriptor parcelFileDescriptor = eVar.c;
        if (parcelFileDescriptor != null) {
            F.a(parcelFileDescriptor);
            eVar.c = null;
        }
        eVar.b = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f h1(e eVar, j.f fVar) {
        String str = this.C;
        return new f(eVar, str != null ? d0.h(str) : HttpUrl.FRAGMENT_ENCODE_SET, null, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f i1(e eVar, ax.Ac.a aVar, j.f fVar) {
        return new f(eVar, aVar.getName(), aVar, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1(e eVar, InterfaceC3185c interfaceC3185c) throws C1486a, C1495j {
        ax.Bc.n nVar = eVar.n;
        eVar.t = new LinkedList<>();
        for (ax.Bc.l lVar : nVar.q()) {
            if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                throw new C1486a();
            }
            if (lVar.getName() == null) {
                C1492g c1492g = new C1492g("SevenZ entry does not have name");
                ax.Q2.d.b(c1492g);
                throw c1492g;
            }
            eVar.t.add(lVar);
            w().h(lVar.getSize());
            w().g(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k1(e eVar, InterfaceC3185c interfaceC3185c) throws C1486a {
        T t = eVar.q;
        eVar.t = new LinkedList<>();
        List<AbstractC3595n> list = eVar.h;
        if (list != null) {
            for (AbstractC3595n abstractC3595n : list) {
                if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                    throw new C1486a();
                }
                e1(t, eVar.t, (C1813a) abstractC3595n);
            }
            return;
        }
        Enumeration<I> f2 = t.f();
        while (f2.hasMoreElements()) {
            if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                throw new C1486a();
            }
            I nextElement = f2.nextElement();
            eVar.t.add(nextElement);
            w().h(nextElement.getSize());
            w().g(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e n1() {
        return this.y.get(this.z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j.f o1() {
        return this.G ? this.F : j.f.NORMAL;
    }

    private boolean p1() {
        return this.z < this.y.size() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q1(e eVar) {
        try {
            C1809B.d0(eVar.c, eVar.i);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r1() {
        e n1 = n1();
        this.A = n1.f;
        int i = d.a[n1.a.ordinal()];
        if (i == 1) {
            LinkedList<ax.Ac.a> linkedList = n1.t;
            if (linkedList != null && !linkedList.isEmpty()) {
                C1(n1);
                return;
            } else {
                g1(n1);
                t1(true);
                return;
            }
        }
        if (i == 2 || i == 3) {
            if (n1.u) {
                g1(n1);
                t1(false);
                return;
            } else {
                A1(n1);
                n1.u = true;
                return;
            }
        }
        if (i == 4) {
            if (n1.w != null) {
                B1(n1);
                return;
            } else {
                g1(n1);
                t1(true);
                return;
            }
        }
        if (i != 5) {
            return;
        }
        LinkedList<ax.Ac.a> linkedList2 = n1.t;
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            z1(n1);
        } else {
            g1(n1);
            t1(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s1() {
        this.z++;
    }

    private void t1(boolean z) {
        if (p1()) {
            s1();
            r1();
        } else if (z) {
            new g().i(new Void[0]);
        } else {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u1(e eVar) {
        try {
            ax.Cc.c p = eVar.v.p();
            eVar.w = p;
            return p != null;
        } catch (IOException unused) {
            eVar.w = null;
            return false;
        }
    }

    private void v1(Bundle bundle, ax.Ac.a aVar) {
        bundle.putString("new_file_path", aVar.getName());
        Long l1 = l1(aVar);
        if (l1 != null) {
            bundle.putLong("new_file_date", l1.longValue());
        }
        bundle.putLong("new_file_size", m1(aVar));
        bundle.putString("old_file_path", this.B.E());
        bundle.putLong("old_file_date", this.B.q());
        bundle.putLong("old_file_size", this.B.p());
        bundle.putBoolean("isDirectory", aVar.isDirectory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w1(e eVar, String str, ax.Ac.a aVar, int i) {
        K k = new K();
        Bundle bundle = new Bundle();
        bundle.putString("progressTypeString", C());
        bundle.putString("fileName", str);
        bundle.putBoolean("applyToAll", true);
        bundle.putInt("errCode", i);
        if ((i == 1 || i == 2) && this.B != null) {
            if (aVar != null) {
                v1(bundle, aVar);
            } else if (eVar.b()) {
                ax.Ec.a aVar2 = eVar.k;
                if (aVar2 instanceof ax.Hc.a) {
                    ax.Hc.b d2 = ((ax.Hc.a) aVar2).d();
                    if (d2 != null && d2.a() > 0) {
                        bundle.putLong("new_file_date", d2.a());
                        bundle.putLong("old_file_date", this.B.q());
                    }
                    bundle.putBoolean("isDirectory", false);
                }
            }
        }
        k.v2(bundle);
        k.v3(new c(eVar, aVar));
        q().K(this, k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x1(e eVar) {
        q().K(this, L.n3(TextUtils.isEmpty(eVar.d) ? r().getString(R.string.dialog_entry_password) : eVar.d, null, new b(eVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y1(e eVar) {
        q().K(this, L.n3(TextUtils.isEmpty(eVar.d) ? r().getString(R.string.dialog_entry_password) : eVar.d, null, new a(eVar)));
    }

    private void z1(e eVar) {
        f i1 = i1(eVar, (ax.Bc.l) eVar.t.poll(), o1());
        this.E = i1;
        i1.i(new Void[0]);
    }

    @Override // ax.W2.j
    public String A() {
        return L();
    }

    @Override // ax.W2.j
    public int B() {
        return 3;
    }

    @Override // ax.W2.j
    public String C() {
        return r().getString(R.string.progress_extracting);
    }

    @Override // ax.W2.j
    public String F() {
        int i = d.c[D().ordinal()];
        if (i == 1) {
            return r().getResources().getQuantityString(R.plurals.msg_extracted_items_plurals, w().H(), Integer.valueOf(w().H()), this.x);
        }
        if (i != 2) {
            if (i != 3) {
                return null;
            }
            return r().getResources().getString(R.string.cancelled);
        }
        String str = this.K;
        if (str == null) {
            str = this.y.get(0).d;
        }
        return r().getResources().getString(R.string.msg_extract_failed, str);
    }

    @Override // ax.W2.j
    protected String G() {
        return d.c[D().ordinal()] != 2 ? HttpUrl.FRAGMENT_ENCODE_SET : v(false);
    }

    @Override // ax.W2.j
    public ax.c3.K H() {
        return null;
    }

    @Override // ax.W2.j
    public String J() {
        AbstractC1823k abstractC1823k = this.A;
        return abstractC1823k == null ? HttpUrl.FRAGMENT_ENCODE_SET : abstractC1823k.E();
    }

    @Override // ax.W2.j
    public ax.c3.K K() {
        AbstractC3595n abstractC3595n = this.B;
        if (abstractC3595n == null) {
            return null;
        }
        return abstractC3595n.R();
    }

    @Override // ax.W2.j
    public String M() {
        AbstractC3595n abstractC3595n = this.B;
        return abstractC3595n == null ? HttpUrl.FRAGMENT_ENCODE_SET : abstractC3595n.W();
    }

    @Override // ax.W2.j
    protected boolean P() {
        return true;
    }

    @Override // ax.W2.j
    protected boolean X() {
        boolean z;
        if (S(this.D)) {
            this.D.e();
            z = true;
        } else {
            z = false;
        }
        if (!S(this.E)) {
            return z;
        }
        this.E.e();
        return true;
    }

    @Override // ax.W2.j
    protected void Y() {
        w().T(v.a.RESOURCE_CLEAR);
        f1();
        if (this.w.Y()) {
            w().T(v.a.SCANNING);
            this.w.n(x());
        }
    }

    @Override // ax.W2.j
    protected void Z() {
        if (this.x != null) {
            if (this.M) {
                this.L.clear();
                this.L.add(d0.h(this.x));
                w.c().g(this.w.T(), d0.r(this.x), this.L);
            } else {
                w.c().g(this.w.T(), this.x, this.L);
            }
        }
        int M = w().M();
        int H = w().H();
        int C = w().C();
        if (M == 0 || M != H + C) {
            t0(h.b.FAILURE);
        } else {
            t0(h.b.SUCCESS);
        }
    }

    @Override // ax.W2.j
    public void c0() {
        j0();
        this.G = false;
        h hVar = new h();
        this.D = hVar;
        hVar.i(new Void[0]);
    }

    @Override // ax.W2.j
    public void k() {
        this.w.k0(true);
        this.G = false;
    }

    Long l1(ax.Ac.a aVar) {
        if (aVar instanceof ax.Bc.l) {
            ax.Bc.l lVar = (ax.Bc.l) aVar;
            if (lVar.l()) {
                return Long.valueOf(aVar.b().getTime());
            }
            if (lVar.k()) {
                return Long.valueOf(lVar.h().getTime());
            }
            return null;
        }
        if (aVar instanceof I) {
            return Long.valueOf(((I) aVar).getTime());
        }
        if (aVar instanceof ax.Cc.c) {
            return Long.valueOf(aVar.b().getTime());
        }
        C3184b.f();
        return null;
    }

    long m1(ax.Ac.a aVar) {
        return aVar instanceof ax.Cc.c ? ((ax.Cc.c) aVar).j() : aVar instanceof ax.Bc.l ? aVar.getSize() : aVar.getSize();
    }

    @Override // ax.W2.j
    public void n0() {
        ax.Q2.a.i().m("command", "file_extract").c("result", a.c.a(D())).c("loc", this.w.S().I()).d(w().x()).e();
    }

    public u(h.a aVar, t.a aVar2, String str, ParcelFileDescriptor parcelFileDescriptor, AbstractC3595n abstractC3595n, AbstractC1823k abstractC1823k, C3596o c3596o, String str2, List<AbstractC3595n> list) {
        super(aVar);
        this.y = new ArrayList();
        this.H = new ArrayList();
        this.L = new ax.B.b<>();
        this.w = c3596o;
        this.x = str2;
        c3596o.n0();
        h(this.w.T());
        e eVar = new e(null);
        eVar.e = abstractC3595n;
        eVar.f = abstractC1823k;
        eVar.c = parcelFileDescriptor;
        eVar.d = str;
        eVar.h = list;
        eVar.g = str2;
        eVar.a = aVar2;
        this.y.add(eVar);
        this.z = 0;
    }

    @Override // ax.W2.j
    protected void W() {
    }
}
