package ax.W2;

import ax.Q2.a;
import ax.W2.h;
import ax.W2.v;
import ax.X2.L;
import ax.X2.Q;
import ax.a3.H;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.K;
import ax.o3.C2685b;
import ax.u3.AbstractC3199q;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.R;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class C extends j {
    private d A;
    private c B;
    private C3596o w;
    private C3596o x;
    private File y;
    private AbstractC3595n z;

    class a implements H.b {
        a() {
        }

        @Override // ax.a3.H.b
        public void a(boolean z) {
            if (!z) {
                C.this.w().c(v.b.FAILURE, 1);
                C.this.o();
            } else {
                C.this.A = C.this.new d();
                C.this.A.h(new Void[0]);
            }
        }
    }

    static /* synthetic */ class b {
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

    private class c extends AbstractC3199q<Void, Void, Boolean> {
        L h;

        public c() {
            super(AbstractC3199q.e.NORMAL);
            this.h = new L();
        }

        private long x() {
            File file = new File(C.this.y.getAbsolutePath());
            if (!Q.P1()) {
                return file.length();
            }
            try {
                ax.X2.v.l(C.this.y.getAbsolutePath(), this.h);
                return this.h.a;
            } catch (Exception unused) {
                return file.length();
            }
        }

        private boolean z() {
            long length = C.this.y.length();
            long currentTimeMillis = System.currentTimeMillis();
            while (!isCancelled()) {
                try {
                    Thread.sleep(1500L);
                } catch (Exception unused) {
                }
                long x = x();
                if (x == 0) {
                    if (System.currentTimeMillis() - currentTimeMillis > 10000) {
                        return false;
                    }
                } else {
                    if (length == x) {
                        return true;
                    }
                    C.this.w().e0(x);
                    length = x;
                }
            }
            return false;
        }

        @Override // ax.u3.AbstractC3199q
        protected void o() {
            C.this.g0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Void... voidArr) {
            boolean z = z();
            if (!z) {
                C.this.w().c(v.b.FAILURE, 1);
            }
            return Boolean.valueOf(z);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            if (!bool.booleanValue()) {
                C.this.o();
                return;
            }
            C.this.k0();
            C c = C.this;
            c.A = c.new d();
            C.this.A.h(new Void[0]);
        }
    }

    private class d extends AbstractC3199q<Void, Void, Integer> {
        public d() {
            super(AbstractC3199q.e.NORMAL);
        }

        @Override // ax.u3.AbstractC3199q
        protected void o() {
            C.this.g0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Integer g(Void... voidArr) {
            d dVar;
            int i;
            RandomAccessFile randomAccessFile;
            try {
                try {
                    C2685b.j().l(C.this.z.Q());
                    C3605y c3605y = (C3605y) C.this.w.z(C.this.y.getAbsolutePath());
                    dVar = this;
                    try {
                        C.this.w.t0(c3605y, C.this.x, C.this.z, dVar, C.this.V());
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = currentTimeMillis % 1000;
                        long j2 = (currentTimeMillis + 2000) - j;
                        C.this.y.setLastModified(j2);
                        if (j2 != C.this.y.lastModified()) {
                            try {
                                Thread.sleep(2050 - j);
                            } catch (InterruptedException unused) {
                            }
                            RandomAccessFile randomAccessFile2 = null;
                            try {
                                try {
                                    randomAccessFile = new RandomAccessFile(C.this.y, "rw");
                                } catch (IOException unused2) {
                                }
                            } catch (IOException unused3) {
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                long length = randomAccessFile.length();
                                randomAccessFile.setLength(1 + length);
                                randomAccessFile.setLength(length);
                                randomAccessFile.getFD().sync();
                                randomAccessFile.close();
                            } catch (IOException unused4) {
                                randomAccessFile2 = randomAccessFile;
                                if (randomAccessFile2 != null) {
                                    randomAccessFile2.close();
                                }
                                c3605y.v1();
                                C2685b.j().t(C.this.z.Q(), c3605y.q());
                                C.this.w().c(v.b.SUCCESS, 1);
                                C.this.l0(true);
                                i = 0;
                                C2685b.j().m(C.this.z.Q());
                                return i;
                            } catch (Throwable th2) {
                                th = th2;
                                randomAccessFile2 = randomAccessFile;
                                if (randomAccessFile2 != null) {
                                    try {
                                        randomAccessFile2.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                                throw th;
                            }
                        }
                        c3605y.v1();
                        C2685b.j().t(C.this.z.Q(), c3605y.q());
                        C.this.w().c(v.b.SUCCESS, 1);
                        C.this.l0(true);
                        i = 0;
                    } catch (C1486a unused6) {
                        C.this.w().c(v.b.FAILURE, 1);
                        i = 0;
                        C2685b.j().m(C.this.z.Q());
                        return i;
                    } catch (C1495j e) {
                        e = e;
                        int q0 = C.this.q0(e);
                        if (q0 == 50) {
                            C.this.w().c0(0L);
                            i = 11;
                        } else if (q0 == 170) {
                            C.this.w().c0(0L);
                            i = 12;
                        } else {
                            C.this.w().c(v.b.FAILURE, 1);
                            i = 0;
                        }
                        C2685b.j().m(C.this.z.Q());
                        return i;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    C2685b.j().m(C.this.z.Q());
                    throw th4;
                }
            } catch (C1486a unused7) {
                dVar = this;
            } catch (C1495j e2) {
                e = e2;
                dVar = this;
            } catch (Throwable th5) {
                th = th5;
                Throwable th42 = th;
                C2685b.j().m(C.this.z.Q());
                throw th42;
            }
            C2685b.j().m(C.this.z.Q());
            return i;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Integer num) {
            if (num.intValue() == 11) {
                C.this.D0(R.string.error_network);
            } else if (num.intValue() == 12) {
                C.this.D0(R.string.error_file_is_in_use);
            } else {
                C.this.o();
            }
        }
    }

    public C(h.a aVar, C3596o c3596o, File file, C3596o c3596o2, AbstractC3595n abstractC3595n) {
        super(aVar);
        this.w = c3596o;
        this.y = file;
        this.x = c3596o2;
        this.z = abstractC3595n;
        c3596o.n0();
        this.x.n0();
        h(this.w.T());
        h(this.x.T());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(int i) {
        H l3 = H.l3(this.y.getName(), i);
        l3.m3(new a());
        q().K(this, l3);
    }

    @Override // ax.W2.j
    public String A() {
        return L();
    }

    @Override // ax.W2.j
    public int B() {
        return 5;
    }

    @Override // ax.W2.j
    public String C() {
        return r().getString(R.string.dialog_title_upload_file);
    }

    @Override // ax.W2.j
    public String F() {
        int i = b.a[D().ordinal()];
        if (i == 1) {
            return r().getResources().getString(R.string.msg_upload_complete);
        }
        if (i == 2) {
            return r().getResources().getString(R.string.msg_upload_failed);
        }
        if (i != 3) {
            return null;
        }
        return r().getResources().getString(R.string.cancelled);
    }

    @Override // ax.W2.j
    protected String G() {
        return b.a[D().ordinal()] != 2 ? HttpUrl.FRAGMENT_ENCODE_SET : v(false);
    }

    @Override // ax.W2.j
    public K H() {
        return null;
    }

    @Override // ax.W2.j
    public String J() {
        File file = this.y;
        return file == null ? HttpUrl.FRAGMENT_ENCODE_SET : file.getAbsolutePath();
    }

    @Override // ax.W2.j
    public K K() {
        AbstractC3595n abstractC3595n = this.z;
        if (abstractC3595n == null) {
            return null;
        }
        return abstractC3595n.R();
    }

    @Override // ax.W2.j
    public String M() {
        AbstractC3595n abstractC3595n = this.z;
        return abstractC3595n == null ? HttpUrl.FRAGMENT_ENCODE_SET : abstractC3595n.W();
    }

    @Override // ax.W2.j
    protected boolean P() {
        return this.x.Y() || this.w.Y();
    }

    @Override // ax.W2.j
    protected boolean X() {
        boolean z;
        if (S(this.B)) {
            this.B.e();
            z = true;
        } else {
            z = false;
        }
        if (!S(this.A)) {
            return z;
        }
        this.A.e();
        return true;
    }

    @Override // ax.W2.j
    protected void Y() {
        w().T(v.a.SCANNING);
        if (this.x.Y()) {
            this.x.n(x());
        }
        C3596o c3596o = this.x;
        C3596o c3596o2 = this.w;
        if (c3596o == c3596o2 || !c3596o2.Y()) {
            return;
        }
        this.w.n(x());
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
        w().e0(this.y.length());
        w().d0(1);
        w().U(this.y.length());
        c cVar = new c();
        this.B = cVar;
        cVar.h(new Void[0]);
    }

    @Override // ax.W2.j
    public void k() {
        this.w.k0(true);
        this.x.k0(true);
    }

    @Override // ax.W2.j
    public void n0() {
        ax.Q2.a.i().m("command", "file_update").c("result", a.c.a(D())).c("loc", this.x.S().I()).e();
    }

    @Override // ax.W2.j
    protected void W() {
    }
}
