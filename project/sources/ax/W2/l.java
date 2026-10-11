package ax.W2;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import ax.Q2.a;
import ax.W2.h;
import ax.W2.j;
import ax.W2.k;
import ax.W2.v;
import ax.a3.K;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.AbstractC1823k;
import ax.c3.d0;
import ax.u3.AbstractC3199q;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3604x;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.R;
import j$.io.FileRetargetClass;
import j$.nio.channels.DesugarChannels;
import j$.nio.file.Files;
import j$.nio.file.StandardOpenOption;
import j$.nio.file.attribute.FileAttribute;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class l extends j {
    private List<AbstractC3595n> A;
    private String B;
    private String C;
    private AbstractC3595n D;
    private AbstractC3595n E;
    private ax.B.b<String> F;
    private k.a w;
    private d x;
    private c y;
    private C3596o z;

    class a implements K.i {
        a() {
        }

        @Override // ax.a3.K.i
        public void a(j.f fVar, boolean z) {
            try {
                int i = b.a[fVar.ordinal()];
                if (i == 1) {
                    l.this.z.P(l.this.E);
                    l.this.y = l.this.new c();
                    l.this.y.h(new Void[0]);
                    return;
                }
                if (i == 2) {
                    l lVar = l.this;
                    lVar.E = lVar.z.X(l.this.E, false);
                    l.this.y = l.this.new c();
                    l.this.y.h(new Void[0]);
                    return;
                }
                if (i == 3) {
                    l.this.i();
                } else {
                    if (i != 4) {
                        return;
                    }
                    l.this.i();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[h.b.values().length];
            b = iArr;
            try {
                iArr[h.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[h.b.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[h.b.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[j.f.values().length];
            a = iArr2;
            try {
                iArr2[j.f.OVERWRITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[j.f.RENAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[j.f.SKIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[j.f.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private class c extends AbstractC3199q<Void, Void, Boolean> {
        private FileOutputStream h;
        private ParcelFileDescriptor i;

        public c() {
            super(AbstractC3199q.e.NORMAL);
        }

        private SeekableByteChannel B(AbstractC1823k abstractC1823k) throws IOException {
            ParcelFileDescriptor e0;
            FileChannel convertMaybeLegacyFileChannelFromLibrary;
            if (abstractC1823k.j0() && (abstractC1823k instanceof C3605y)) {
                C3605y c3605y = (C3605y) abstractC1823k;
                try {
                    AbstractC3594m u = l.this.z.u();
                    if (!c3605y.n()) {
                        l.this.z.N(c3605y);
                    }
                    e0 = ((C3604x) u).U0(c3605y);
                } catch (C1495j e) {
                    e.printStackTrace();
                }
            } else {
                if (abstractC1823k.i0()) {
                    try {
                        if (!abstractC1823k.n()) {
                            l.this.z.N(abstractC1823k);
                        }
                        e0 = abstractC1823k.e0(false);
                    } catch (C1495j e2) {
                        e2.printStackTrace();
                    }
                } else if (abstractC1823k instanceof C3605y) {
                    return Files.newByteChannel(FileRetargetClass.toPath(((C3605y) abstractC1823k).F0()), EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.READ), new FileAttribute[0]);
                }
                e0 = null;
            }
            if (e0 == null) {
                return null;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(e0.getFileDescriptor());
            this.i = e0;
            this.h = fileOutputStream;
            convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel());
            return convertMaybeLegacyFileChannelFromLibrary;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        
            if (r21 == null) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        
            r21.a(r4, r18);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        
            if (r20 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        
            if (r20.isCancelled() != false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        
            throw new ax.b3.C1486a();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private long C(java.io.InputStream r16, ax.Bc.r r17, long r18, ax.u3.InterfaceC3185c r20, ax.g3.i r21) throws ax.b3.C1486a, java.io.IOException {
            /*
                r15 = this;
                r0 = r18
                r2 = r21
                r3 = 8192(0x2000, float:1.14794E-41)
                byte[] r3 = new byte[r3]
                r4 = 0
                r8 = r16
            Lc:
                r6 = r4
            Ld:
                int r9 = r8.read(r3)
                if (r9 >= 0) goto L19
                if (r2 == 0) goto L18
                r2.a(r4, r0)
            L18:
                return r4
            L19:
                if (r9 != 0) goto L23
                r9 = 5
                java.lang.Thread.sleep(r9)     // Catch: java.lang.InterruptedException -> L21
                goto Ld
            L21:
                goto Ld
            L23:
                r10 = 0
                r11 = r17
                r11.u(r3, r10, r9)
                long r9 = (long) r9
                long r4 = r4 + r9
                long r9 = r4 - r6
                r12 = 262144(0x40000, double:1.295163E-318)
                int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
                if (r14 < 0) goto Ld
                if (r2 == 0) goto L39
                r2.a(r4, r0)
            L39:
                if (r20 == 0) goto Lc
                boolean r6 = r20.isCancelled()
                if (r6 != 0) goto L42
                goto Lc
            L42:
                ax.b3.a r0 = new ax.b3.a
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.W2.l.c.C(java.io.InputStream, ax.Bc.r, long, ax.u3.c, ax.g3.i):long");
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r5v7, types: [boolean] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void w(com.voxdon.xplorer.file.AbstractC3595n r12, java.lang.String r13, ax.Bc.r r14, ax.g3.i r15) throws ax.b3.C1495j, ax.b3.C1486a {
            /*
                Method dump skipped, instructions count: 307
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.W2.l.c.w(com.voxdon.xplorer.file.n, java.lang.String, ax.Bc.r, ax.g3.i):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0186 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void x(com.voxdon.xplorer.file.AbstractC3595n r10, java.lang.String r11, ax.Dc.J r12, ax.g3.i r13) throws ax.b3.C1495j, ax.b3.C1486a {
            /*
                Method dump skipped, instructions count: 394
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.W2.l.c.x(com.voxdon.xplorer.file.n, java.lang.String, ax.Dc.J, ax.g3.i):void");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            l.this.o();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x01d5, code lost:
        
            if (r8 == null) goto L151;
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x01b7, code lost:
        
            if (r8 == null) goto L151;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x019b, code lost:
        
            if (r8 == null) goto L151;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0204, code lost:
        
            if (r8 == null) goto L151;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x019d, code lost:
        
            ax.c3.F.a(r8);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v21, types: [ax.W2.k$a] */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Boolean g(java.lang.Void... r8) {
            /*
                Method dump skipped, instructions count: 537
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.W2.l.c.g(java.lang.Void[]):java.lang.Boolean");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public void p(Boolean bool) {
            l.this.g0();
        }
    }

    private class d extends AbstractC3199q<Void, Void, Boolean> {
        public d() {
            super(AbstractC3199q.e.NORMAL);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Void... voidArr) {
            try {
                Iterator it = l.this.A.iterator();
                while (it.hasNext()) {
                    l.this.H0((AbstractC3595n) it.next(), this);
                }
                return Boolean.TRUE;
            } catch (C1486a unused) {
                return Boolean.FALSE;
            } catch (C1495j e) {
                e.printStackTrace();
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void p(Boolean bool) {
            l.this.g0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            if (l.this.E == null || !bool.booleanValue()) {
                l.this.o();
                return;
            }
            l.this.k0();
            if (l.this.E.n()) {
                l.this.J0();
                return;
            }
            l lVar = l.this;
            lVar.y = lVar.new c();
            l.this.y.i(new Void[0]);
        }
    }

    public l(h.a aVar, k.a aVar2, C3596o c3596o, List<AbstractC3595n> list, String str, String str2) {
        super(aVar);
        this.F = new ax.B.b<>();
        this.w = aVar2;
        this.z = c3596o;
        this.A = list;
        this.B = str;
        if (str2.endsWith(I0())) {
            this.C = str2;
        } else {
            this.C = str2 + I0();
        }
        this.z.n0();
        h(this.z.T());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0(AbstractC3595n abstractC3595n, InterfaceC3185c interfaceC3185c) throws C1486a, C1495j {
        if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
            throw new C1486a();
        }
        if (!abstractC3595n.isDirectory()) {
            w().h(abstractC3595n.p());
            w().g(1);
            return;
        }
        w().g(1);
        List<AbstractC3595n> f0 = this.z.f0(abstractC3595n);
        if (f0 != null) {
            Iterator<AbstractC3595n> it = f0.iterator();
            while (it.hasNext()) {
                H0(it.next(), interfaceC3185c);
            }
        }
    }

    private String I0() {
        return this.w == k.a.SEVENZ ? ".7z" : ".zip";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0() {
        Iterator<AbstractC3595n> it = this.A.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().E().equals(this.E.E())) {
                z = true;
            }
        }
        K k = new K();
        Bundle bundle = new Bundle();
        bundle.putString("progressTypeString", C());
        bundle.putString("fileName", this.E.B());
        bundle.putBoolean("no_overwrite", z);
        bundle.putInt("errCode", 1);
        k.v2(bundle);
        k.v3(new a());
        q().K(this, k);
    }

    @Override // ax.W2.j
    public String A() {
        return L();
    }

    @Override // ax.W2.j
    public int B() {
        return 2;
    }

    @Override // ax.W2.j
    public String C() {
        return r().getString(R.string.progress_compressing);
    }

    @Override // ax.W2.j
    public String F() {
        int i = b.b[D().ordinal()];
        if (i == 1) {
            return r().getResources().getQuantityString(R.plurals.msg_compressed_items_plurals, w().H(), Integer.valueOf(w().H()), M());
        }
        if (i == 2) {
            return r().getResources().getString(R.string.msg_compress_failed);
        }
        if (i != 3) {
            return null;
        }
        return r().getResources().getString(R.string.cancelled);
    }

    @Override // ax.W2.j
    protected String G() {
        return b.b[D().ordinal()] != 2 ? HttpUrl.FRAGMENT_ENCODE_SET : v(false);
    }

    @Override // ax.W2.j
    public ax.c3.K H() {
        AbstractC3595n abstractC3595n = this.D;
        if (abstractC3595n == null) {
            return null;
        }
        return abstractC3595n.R();
    }

    @Override // ax.W2.j
    public String J() {
        AbstractC3595n abstractC3595n = this.D;
        return abstractC3595n == null ? HttpUrl.FRAGMENT_ENCODE_SET : abstractC3595n.W();
    }

    @Override // ax.W2.j
    public ax.c3.K K() {
        AbstractC3595n abstractC3595n = this.E;
        if (abstractC3595n == null) {
            return null;
        }
        return abstractC3595n.R();
    }

    @Override // ax.W2.j
    public String M() {
        AbstractC3595n abstractC3595n = this.E;
        return abstractC3595n == null ? HttpUrl.FRAGMENT_ENCODE_SET : abstractC3595n.W();
    }

    @Override // ax.W2.j
    protected boolean P() {
        return this.z.Y();
    }

    @Override // ax.W2.j
    protected boolean X() {
        boolean z;
        if (S(this.x)) {
            this.x.e();
            z = true;
        } else {
            z = false;
        }
        if (!S(this.y)) {
            return z;
        }
        this.y.e();
        return true;
    }

    @Override // ax.W2.j
    protected void Y() {
        if (this.z.Y()) {
            w().T(v.a.SCANNING);
            this.z.n(x());
        }
    }

    @Override // ax.W2.j
    protected void Z() {
        if (this.B != null) {
            w.c().g(this.z.T(), this.B, this.F);
        }
        if (w().M() == 0 || w().M() != w().H()) {
            t0(h.b.FAILURE);
        } else {
            t0(h.b.SUCCESS);
        }
    }

    @Override // ax.W2.j
    public void c0() {
        j0();
        try {
            AbstractC3595n z = this.z.z(d0.Q(this.B, this.C));
            this.E = z;
            if (z.isDirectory()) {
                this.E = this.z.z(d0.Q(this.B, this.C + I0()));
            }
        } catch (C1495j e) {
            e.printStackTrace();
        }
        d dVar = new d();
        this.x = dVar;
        dVar.i(new Void[0]);
    }

    @Override // ax.W2.j
    public void k() {
        this.z.k0(true);
    }

    @Override // ax.W2.j
    public void n0() {
        ax.Q2.a.i().m("command", "file_compress").c("result", a.c.a(D())).c("loc", this.z.S().I()).d(w().x()).e();
    }

    @Override // ax.W2.j
    protected void W() {
    }
}
