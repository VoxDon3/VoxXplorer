package ax.W2;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import ax.Q2.a;
import ax.W2.h;
import ax.W2.j;
import ax.W2.v;
import ax.X2.J;
import ax.X2.Q;
import ax.a3.H;
import ax.a3.K;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.AbstractC1823k;
import ax.c3.C1809B;
import ax.c3.C1829q;
import ax.c3.C1835x;
import ax.c3.F;
import ax.c3.d0;
import ax.r7.C2983q;
import ax.u3.AbstractC3199q;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3597p;
import com.voxdon.xplorer.file.C3602v;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.R;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class e extends ax.W2.j {
    private static final Logger p0 = ax.Q2.g.a(e.class);
    private static final InterfaceC3185c q0 = new a();
    private LinkedList<k> A;
    private HashMap<String, String> B;
    private HashMap<String, f> C;
    private f D;
    private boolean E;
    private HashSet<String> F;
    private List<Map.Entry<AbstractC3595n, g>> G;
    private AbstractC3595n H;
    private C3596o I;
    private AbstractC3595n J;
    private C3596o K;
    private i L;
    private j M;
    private String N;
    private String O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private AbstractC3595n X;
    private AbstractC3595n Y;
    private AbstractC3595n Z;
    private AbstractC3595n a0;
    private C2983q<AbstractC3595n> b0;
    private boolean c0;
    private boolean d0;
    private boolean e0;
    private j.f f0;
    private j.f g0;
    private K h0;
    private H i0;
    private long j0;
    private int k0;
    private Long l0;
    private String m0;
    private boolean n0;
    private ax.B.b<String> o0;
    private List<AbstractC3595n> w;
    private List<AbstractC3595n> x;
    private LinkedList<AbstractC3595n> y;
    private LinkedList<m> z;

    class a implements InterfaceC3185c {
        a() {
        }

        @Override // ax.u3.InterfaceC3185c
        public boolean isCancelled() {
            return false;
        }
    }

    class b implements H.b {
        final /* synthetic */ AbstractC3595n a;
        final /* synthetic */ AbstractC3595n b;

        b(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            this.a = abstractC3595n;
            this.b = abstractC3595n2;
        }

        @Override // ax.a3.H.b
        public void a(boolean z) {
            if (!z) {
                e.this.u2(this.a, this.b.B(), 1);
                e.this.o();
            } else {
                e.this.M = new j(e.this);
                e.this.M.R(true);
                e.this.M.i(new Void[0]);
            }
        }
    }

    class c implements K.i {
        final /* synthetic */ boolean a;

        c(boolean z) {
            this.a = z;
        }

        @Override // ax.a3.K.i
        public void a(j.f fVar, boolean z) {
            if (this.a) {
                e.this.e0 = z;
                e.this.g0 = fVar;
            } else {
                e.this.d0 = z;
                e.this.f0 = fVar;
            }
            e.this.M = e.this.new j(true, fVar);
            e.this.M.i(new Void[0]);
        }
    }

    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[j.f.values().length];
            b = iArr;
            try {
                iArr[j.f.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[j.f.OVERWRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[j.f.OVERWRITE_NEWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[j.f.RENAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[j.f.SKIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[j.f.CANCEL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[h.b.values().length];
            a = iArr2;
            try {
                iArr2[h.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[h.b.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[h.b.CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: ax.W2.e$e, reason: collision with other inner class name */
    public static class C0217e {
        public boolean a;
        public C3596o b;
        public AbstractC3595n c;
        public List<AbstractC3595n> d;

        public C0217e(C3596o c3596o, AbstractC3595n abstractC3595n, List<AbstractC3595n> list, boolean z) {
            this.b = c3596o;
            this.c = abstractC3595n;
            this.d = list;
            this.a = z;
        }
    }

    static class f {
        int a;
        long b;
        ArrayList<String> c = new ArrayList<>();

        f() {
        }

        void a() {
            this.a = 0;
            this.b = 0L;
            this.c.clear();
        }
    }

    private static class g {
        long a;
        C3597p b;

        g(long j, C3597p c3597p) {
            this.a = j;
            this.b = c3597p;
        }
    }

    private enum h {
        SUCCESS,
        FAILURE,
        CANCELLED,
        FAILURE_NETWORK
    }

    private class i extends AbstractC3199q<Void, Void, Void> {
        public i() {
            super(AbstractC3199q.e.NORMAL);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Void g(Void... voidArr) {
            e.this.C = new HashMap();
            e.this.y = new LinkedList();
            e.this.z = new LinkedList();
            e.this.A = new LinkedList();
            e.this.B = new HashMap();
            try {
                for (AbstractC3595n abstractC3595n : e.this.w) {
                    e.this.y.offer(abstractC3595n);
                    e.this.B.put(abstractC3595n.E(), abstractC3595n.T());
                    if (Q.P1() && (abstractC3595n instanceof C3605y)) {
                        try {
                            ((C3605y) abstractC3595n).t1();
                        } catch (IOException unused) {
                        }
                    }
                    e eVar = e.this;
                    eVar.k2(eVar.I, abstractC3595n, e.this.C, this);
                }
            } catch (C1486a unused2) {
            }
            if (e.this.c0) {
                e eVar2 = e.this;
                eVar2.E = eVar2.h2();
                if (e.this.E) {
                    e.this.w().f0(true);
                    e.this.w().V(e.this.w().M());
                    e.this.w().g(e.this.w.size());
                }
            }
            e.this.j2();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void p(Void r1) {
            e.this.g0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(Void r1) {
            e.this.k0();
            e.this.t2();
        }
    }

    private class j extends AbstractC3199q<Void, Void, Integer> {
        boolean h;
        j.f i;
        boolean j;

        public j(e eVar) {
            this(false, j.f.NORMAL);
        }

        private boolean A(AbstractC3595n abstractC3595n) throws C1495j {
            return !d0.K(abstractC3595n.E()) || B(e.this.K, abstractC3595n);
        }

        private boolean B(C3596o c3596o, AbstractC3595n abstractC3595n) throws C1495j {
            if (c3596o.z(abstractC3595n.E()).n()) {
                return true;
            }
            String Q = d0.Q(abstractC3595n.T(), d0.b(abstractC3595n.B()));
            return !abstractC3595n.E().equals(Q) && c3596o.z(Q).n();
        }

        private h C(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c) {
            h hVar;
            C3184b.c(abstractC3595n.isDirectory());
            try {
                e.this.I.E(abstractC3595n, abstractC3595n2, interfaceC3185c, null);
                hVar = h.SUCCESS;
            } catch (C1486a unused) {
                hVar = h.CANCELLED;
            } catch (C1495j unused2) {
                hVar = h.FAILURE;
            }
            int l2 = e.this.l2(abstractC3595n.Q());
            if (hVar == h.SUCCESS) {
                e.this.w().c(v.b.SUCCESS, l2);
                e.b1(e.this, l2);
                e.e1(e.this);
                e.this.w().a(l2);
            } else {
                e.h1(e.this);
                if (l2 == 0) {
                    e.this.n0 = true;
                }
                e.this.u2(abstractC3595n, abstractC3595n2.B(), l2);
            }
            return hVar;
        }

        private void D() {
            if (e.this.x == null || e.this.x.size() == 0) {
                return;
            }
            for (AbstractC3595n abstractC3595n : e.this.x) {
                try {
                    if (!z(abstractC3595n)) {
                        e.this.I.P(abstractC3595n);
                    }
                } catch (C1495j e) {
                    e.printStackTrace();
                }
            }
            e.this.x.clear();
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00bd A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x000f A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean E(com.voxdon.xplorer.file.AbstractC3595n r7) throws ax.b3.C1495j, ax.b3.C1486a {
            /*
                r6 = this;
                java.util.Stack r0 = new java.util.Stack
                r0.<init>()
                ax.W2.p$c r1 = new ax.W2.p$c
                r1.<init>(r7)
                r0.push(r1)
                r7 = 1
                r1 = 1
            Lf:
                int r2 = r0.size()
                if (r2 <= 0) goto Lc6
                ax.W2.e r2 = ax.W2.e.this
                r2.v0()
                boolean r2 = r6.isCancelled()
                if (r2 != 0) goto Lc0
                java.lang.Object r2 = r0.pop()
                ax.W2.p$c r2 = (ax.W2.p.c) r2
                com.voxdon.xplorer.file.n r3 = r2.a
                boolean r4 = r3.isDirectory()
                r5 = 0
                if (r4 == 0) goto L85
                boolean r4 = r2.b
                if (r4 != 0) goto L63
                r2.b = r7
                r0.push(r2)
                ax.W2.e r2 = ax.W2.e.this
                com.voxdon.xplorer.file.o r2 = ax.W2.e.O0(r2)
                java.util.List r2 = r2.f0(r3)
                if (r2 == 0) goto Lf
                int r3 = r2.size()
                if (r3 <= 0) goto Lf
                java.util.Iterator r2 = r2.iterator()
            L4e:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto Lf
                java.lang.Object r3 = r2.next()
                com.voxdon.xplorer.file.n r3 = (com.voxdon.xplorer.file.AbstractC3595n) r3
                ax.W2.p$c r4 = new ax.W2.p$c
                r4.<init>(r3)
                r0.push(r4)
                goto L4e
            L63:
                ax.W2.e r2 = ax.W2.e.this     // Catch: ax.b3.C1495j -> L83
                java.util.HashSet r2 = ax.W2.e.S0(r2)     // Catch: ax.b3.C1495j -> L83
                java.lang.String r4 = r3.Q()     // Catch: ax.b3.C1495j -> L83
                boolean r2 = r2.contains(r4)     // Catch: ax.b3.C1495j -> L83
                if (r2 == 0) goto Lf
                boolean r2 = r6.z(r3)     // Catch: ax.b3.C1495j -> L83
                if (r2 != 0) goto Lf
                ax.W2.e r2 = ax.W2.e.this     // Catch: ax.b3.C1495j -> L83
                com.voxdon.xplorer.file.o r2 = ax.W2.e.O0(r2)     // Catch: ax.b3.C1495j -> L83
                r2.P(r3)     // Catch: ax.b3.C1495j -> L83
                goto Lf
            L83:
                r1 = 0
                goto Lc6
            L85:
                ax.W2.e r2 = ax.W2.e.this     // Catch: ax.b3.C1495j -> La5
                java.util.HashSet r2 = ax.W2.e.S0(r2)     // Catch: ax.b3.C1495j -> La5
                java.lang.String r4 = r3.Q()     // Catch: ax.b3.C1495j -> La5
                boolean r2 = r2.contains(r4)     // Catch: ax.b3.C1495j -> La5
                if (r2 == 0) goto Lf
                ax.W2.e r2 = ax.W2.e.this     // Catch: ax.b3.C1495j -> La5
                com.voxdon.xplorer.file.o r2 = ax.W2.e.O0(r2)     // Catch: ax.b3.C1495j -> La5
                r2.P(r3)     // Catch: ax.b3.C1495j -> La5
                ax.W2.e r2 = ax.W2.e.this     // Catch: ax.b3.C1495j -> La5
                r2.l0(r5)     // Catch: ax.b3.C1495j -> La5
                goto Lf
            La5:
                ax.W2.e r2 = ax.W2.e.this     // Catch: ax.b3.C1495j -> Lb9
                com.voxdon.xplorer.file.o r2 = ax.W2.e.O0(r2)     // Catch: ax.b3.C1495j -> Lb9
                java.lang.String r3 = r3.E()     // Catch: ax.b3.C1495j -> Lb9
                com.voxdon.xplorer.file.n r2 = r2.z(r3)     // Catch: ax.b3.C1495j -> Lb9
                boolean r2 = r2.n()     // Catch: ax.b3.C1495j -> Lb9
                r2 = r2 ^ r7
                goto Lbb
            Lb9:
                r2 = 0
            Lbb:
                if (r2 != 0) goto Lf
                r1 = 0
                goto Lf
            Lc0:
                ax.b3.a r7 = new ax.b3.a
                r7.<init>()
                throw r7
            Lc6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.W2.e.j.E(com.voxdon.xplorer.file.n):boolean");
        }

        private void F(m mVar) {
            if (mVar.b) {
                if (!e.this.c0) {
                    C3184b.f();
                    return;
                }
                AbstractC3595n abstractC3595n = mVar.a;
                try {
                    if (e.this.x.contains(abstractC3595n)) {
                        e.this.x.remove(abstractC3595n);
                        int n = e.this.w().n();
                        int C = e.this.w().C();
                        if (n == mVar.c && C == mVar.d && !z(abstractC3595n)) {
                            e.this.I.P(abstractC3595n);
                        }
                    }
                } catch (C1495j e) {
                    e.printStackTrace();
                }
            }
        }

        private String I(String str) {
            return (str == null || !str.startsWith("/sdcard/")) ? str : str.replaceFirst("/sdcard", ax.Q2.e.v());
        }

        private boolean J() {
            return e.this.E ? e.this.w().k() == e.this.w().j() + 1 : e.this.w().M() == e.this.w().x() + 1;
        }

        private boolean K() {
            return (!e.this.c0 || e.this.E) ? e.this.l0 != null && e.this.l0.longValue() < e.this.w().N() + 2097152 : e.this.l0 != null && e.this.l0.longValue() < 2097152;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00f2 A[Catch: j -> 0x004b, a -> 0x011d, TryCatch #3 {a -> 0x011d, j -> 0x004b, blocks: (B:3:0x0001, B:5:0x000d, B:7:0x0015, B:9:0x001d, B:11:0x0025, B:13:0x002b, B:16:0x004e, B:19:0x007f, B:27:0x005a, B:30:0x0062, B:32:0x0066, B:34:0x0074, B:36:0x007a, B:37:0x00a4, B:40:0x00d0, B:42:0x00f2, B:44:0x0106, B:45:0x0109, B:47:0x0114, B:48:0x0119, B:49:0x00b4, B:52:0x00bb, B:56:0x00ca), top: B:2:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0114 A[Catch: j -> 0x004b, a -> 0x011d, TryCatch #3 {a -> 0x011d, j -> 0x004b, blocks: (B:3:0x0001, B:5:0x000d, B:7:0x0015, B:9:0x001d, B:11:0x0025, B:13:0x002b, B:16:0x004e, B:19:0x007f, B:27:0x005a, B:30:0x0062, B:32:0x0066, B:34:0x0074, B:36:0x007a, B:37:0x00a4, B:40:0x00d0, B:42:0x00f2, B:44:0x0106, B:45:0x0109, B:47:0x0114, B:48:0x0119, B:49:0x00b4, B:52:0x00bb, B:56:0x00ca), top: B:2:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private ax.W2.e.h O(com.voxdon.xplorer.file.AbstractC3595n r12, com.voxdon.xplorer.file.AbstractC3595n r13, ax.u3.InterfaceC3185c r14) {
            /*
                Method dump skipped, instructions count: 882
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.W2.e.j.O(com.voxdon.xplorer.file.n, com.voxdon.xplorer.file.n, ax.u3.c):ax.W2.e$h");
        }

        private void Q(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, j.f fVar) throws l {
            h hVar;
            long p;
            int i;
            long z = e.this.w().z();
            int n = e.this.w().n();
            boolean z2 = false;
            boolean z3 = abstractC3595n2 == e.this.Y;
            a aVar = null;
            switch (d.b[fVar.ordinal()]) {
                case 1:
                case 2:
                    hVar = P(abstractC3595n, abstractC3595n2);
                    break;
                case 3:
                    if (abstractC3595n.q() / 1000 > abstractC3595n2.q() / 1000 || (abstractC3595n.p() != abstractC3595n2.p() && abstractC3595n.q() > abstractC3595n2.q())) {
                        hVar = P(abstractC3595n, abstractC3595n2);
                        break;
                    } else {
                        e.this.w().c(v.b.SKIPPED, 1);
                        e.this.w().a(1);
                        long p2 = abstractC3595n.p();
                        if (p2 > 0) {
                            e.this.w().e(p2);
                        }
                        hVar = h.SUCCESS;
                        break;
                    }
                    break;
                case 4:
                    try {
                        AbstractC3595n X = e.this.K.X(abstractC3595n2, abstractC3595n.E().equals(abstractC3595n2.E()));
                        e.this.x2(X);
                        if (abstractC3595n.isDirectory()) {
                            e.this.v2(abstractC3595n.E(), X.E());
                        }
                        hVar = P(abstractC3595n, X);
                        break;
                    } catch (C1495j e) {
                        int l2 = abstractC3595n.isDirectory() ? e.this.l2(abstractC3595n.Q()) : 1;
                        if (l2 == 0) {
                            e.this.n0 = true;
                        }
                        e.this.u2(abstractC3595n, abstractC3595n2.B(), l2);
                        e.printStackTrace();
                        hVar = h.FAILURE;
                        break;
                    }
                case 5:
                    if (abstractC3595n.isDirectory()) {
                        f m2 = e.this.m2(abstractC3595n.Q(), null);
                        i = m2.a;
                        p = m2.b;
                    } else {
                        p = abstractC3595n.p();
                        i = 1;
                    }
                    e.this.w().c(v.b.SKIPPED, i);
                    e.this.w().a(i);
                    if (p > 0) {
                        e.this.w().e(p);
                    }
                    hVar = h.SUCCESS;
                    break;
                case 6:
                    e.this.i();
                    hVar = h.CANCELLED;
                    break;
                default:
                    C3184b.g("invalid overwrite type");
                    hVar = h.FAILURE;
                    break;
            }
            if (hVar == h.FAILURE_NETWORK) {
                e.this.w().c0(z);
                e.this.w().W(n);
                throw new l(aVar);
            }
            if (z3 && e.this.a0 != null) {
                e.this.o0.add(e.this.a0.B());
            }
            if (e.this.z == null || !e.this.z.isEmpty() || isCancelled()) {
                return;
            }
            if (!e.this.E || hVar != h.SUCCESS) {
                if (e.this.c0) {
                    D();
                    return;
                }
                return;
            }
            if (e.this.P == e.this.a.n() && e.this.V == 0) {
                int H = e.this.a.H() - e.this.Q;
                if (e.this.T == H && e.this.U > 0) {
                    z2 = true;
                }
                if (e.this.S + e.this.T != H) {
                    ax.Ha.c.h().f().b("MOVE FILE COUNT NOT MATCH").g("expected:" + e.this.S + "," + e.this.T + ",result:" + e.this.a.H() + "," + e.this.Q + "," + e.this.a.C() + "," + e.this.R + ",dir:" + e.this.W + ",type:" + fVar + ",location:" + abstractC3595n.P().I()).h();
                }
                e eVar = e.this;
                eVar.w2(eVar.X);
                e eVar2 = e.this;
                eVar2.x2(eVar2.Y);
                e.this.l0(true);
                if (z2) {
                    e.this.w().c(v.b.SUCCESS, 1);
                } else {
                    if (G(e.this.X)) {
                        e.this.w().c(v.b.SUCCESS, 1);
                        return;
                    }
                    e.this.w().c(v.b.FAILURE, 1);
                    e.this.w().b(e.this.X.B());
                    e.this.r0(130);
                }
            }
        }

        private void w(C3596o c3596o, AbstractC3595n abstractC3595n) {
            boolean z;
            if (abstractC3595n == null || !abstractC3595n.isDirectory()) {
                return;
            }
            if (!abstractC3595n.n()) {
                ax.Ha.c.h().f().b("ADD SUB FILE NOT EXIST").g("location:" + abstractC3595n.R() + "," + abstractC3595n.E()).h();
                return;
            }
            if (e.this.k0 == 0 || !e.this.r2(abstractC3595n)) {
                z = false;
            } else {
                e.this.w().d0(e.this.w().M() - e.this.k0);
                e.this.w().e0(e.this.w().N() - e.this.j0);
                z = true;
            }
            try {
                for (AbstractC3595n abstractC3595n2 : C1829q.g(c3596o.g0(abstractC3595n, AbstractC3594m.f.NONE, false, false), C1829q.c("DateDown"))) {
                    if (z) {
                        try {
                            e eVar = e.this;
                            eVar.k2(c3596o, abstractC3595n2, eVar.C, e.q0);
                        } catch (C1486a unused) {
                        }
                    }
                    e.this.z.push(new m(abstractC3595n2, false, 0, 0));
                    String str = (String) e.this.B.get(abstractC3595n.E());
                    if (!TextUtils.isEmpty(str)) {
                        e.this.B.put(abstractC3595n2.E(), str);
                    }
                }
            } catch (C1495j e) {
                e.printStackTrace();
            }
        }

        private void x(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) throws C1495j {
            if (!abstractC3595n2.n()) {
                if (!e.this.K.k(abstractC3595n2, false)) {
                    throw new C1495j("Could not create folder in addSubFiles");
                }
                e.this.G.add(new AbstractMap.SimpleEntry(abstractC3595n2, new g(abstractC3595n.q(), abstractC3595n.D())));
                if (ax.Q2.f.V(abstractC3595n2.P())) {
                    String B = abstractC3595n2.B();
                    if (!d0.M(B) && !e.this.K.z(abstractC3595n2.E()).n()) {
                        AbstractC3595n z = e.this.K.z(d0.Q(abstractC3595n2.T(), d0.b(B)));
                        if (z.n()) {
                            e.this.v2(abstractC3595n.E(), z.E());
                        }
                    }
                }
                e.this.m0 = abstractC3595n2.E();
            }
            if (e.this.c0 && !e.this.E) {
                e.this.z.push(new m(abstractC3595n, true, e.this.w().n(), e.this.w().C()));
            }
            w(e.this.I, abstractC3595n);
            if (e.this.c0) {
                if (e.this.x == null) {
                    e.this.x = new ArrayList();
                }
                e.this.x.add(0, abstractC3595n);
                e.this.F.add(abstractC3595n.Q());
                e.V0(e.this);
            }
        }

        private void y(AbstractC3595n abstractC3595n) throws C1495j {
            ax.Q2.f S = e.this.K.S();
            if (S != ax.Q2.f.p0 || e.this.w().z() <= 500000000) {
                return;
            }
            try {
                if (e.this.l0 != null) {
                    long v = e.this.K.v();
                    if (v > 0) {
                        long longValue = e.this.l0.longValue() - v;
                        long z = (e.this.w().z() * 2) / 3;
                        if (longValue <= 0 || longValue >= z) {
                            return;
                        }
                        int i = !A(abstractC3595n) ? 1 : 0;
                        Iterator<E> it = e.this.b0.iterator();
                        while (it.hasNext()) {
                            if (!A((AbstractC3595n) it.next())) {
                                i++;
                            }
                        }
                        if (i <= 10) {
                            return;
                        }
                        ax.Ha.c.h().f().b("SD WRITTEN FILE NOT EXIST").g("location:" + S + ",increased:" + longValue + ",progressed:" + e.this.w().z() + ",total:" + e.this.w().N() + ",isAllInvalid:" + i).h();
                        throw new ax.b3.B("SD card corruption is detected. Written file not exist.");
                    }
                }
            } catch (C1495j e) {
                e.printStackTrace();
            } catch (Exception e2) {
                ax.Ha.c.h().f().b("checkLastFileWriteCheck error").l(e2).h();
                e2.printStackTrace();
            }
        }

        private boolean z(AbstractC3595n abstractC3595n) throws C1495j {
            if (!ax.Q2.f.g0(e.this.I.S())) {
                return e.this.I.f0(abstractC3595n).size() != 0;
            }
            C3596o g = C1835x.g(abstractC3595n.E());
            return g.f0(g.z(abstractC3595n.E())).size() != 0;
        }

        boolean G(AbstractC3595n abstractC3595n) {
            if (!e.this.I.O()) {
                try {
                    return E(abstractC3595n);
                } catch (C1486a | C1495j unused) {
                    return false;
                }
            }
            try {
                if (!e.this.F.contains(abstractC3595n.Q())) {
                    return true;
                }
                e.this.I.I(abstractC3595n);
                return true;
            } catch (C1495j unused2) {
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0416, code lost:
        
            if (r11.k.K.r0() == false) goto L141;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0418, code lost:
        
            r12 = r11.k.G.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0426, code lost:
        
            if (r12.hasNext() == false) goto L165;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0428, code lost:
        
            r1 = (java.util.Map.Entry) r12.next();
            r2 = (com.voxdon.xplorer.file.AbstractC3595n) r1.getKey();
            r1 = (ax.W2.e.g) r1.getValue();
            ((ax.c3.i0) r11.k.K.u()).d(r2, r1.a);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x044d, code lost:
        
            if (r1.b == null) goto L170;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0455, code lost:
        
            if (r2.R() != ax.c3.K.h) goto L171;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x045f, code lost:
        
            if (ax.Z2.j.F().q() == false) goto L172;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0461, code lost:
        
            com.voxdon.xplorer.file.C3606z.Y().V(r2.E(), r1.b);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0473, code lost:
        
            return 0;
         */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0369 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0400 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0000 A[ADDED_TO_REGION, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0251  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0256  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0318 A[Catch: l -> 0x0474, TryCatch #0 {l -> 0x0474, blocks: (B:2:0x0000, B:15:0x040c, B:17:0x0418, B:18:0x0422, B:20:0x0428, B:23:0x044f, B:26:0x0457, B:29:0x0461, B:36:0x046f, B:4:0x000e, B:164:0x0014, B:6:0x008a, B:8:0x008e, B:9:0x03f4, B:12:0x0400, B:42:0x00a3, B:44:0x00a7, B:45:0x00bc, B:47:0x00c9, B:49:0x00d9, B:50:0x00de, B:51:0x0134, B:54:0x0145, B:57:0x014d, B:130:0x01f9, B:134:0x0214, B:136:0x021e, B:138:0x0225, B:64:0x0258, B:66:0x025f, B:67:0x02f4, B:69:0x02fa, B:71:0x0308, B:72:0x030d, B:77:0x026e, B:78:0x02bd, B:79:0x0318, B:81:0x0329, B:83:0x0343, B:87:0x035f, B:104:0x0369, B:89:0x036f, B:91:0x0375, B:101:0x037e, B:94:0x0385, B:97:0x0399, B:99:0x039e, B:106:0x0352, B:107:0x03a4, B:109:0x03aa, B:126:0x03b4, B:111:0x03ba, B:113:0x03c0, B:115:0x03c8, B:116:0x03d2, B:118:0x03d8, B:120:0x03e0, B:122:0x03ea, B:128:0x03ef, B:145:0x0242, B:142:0x024b, B:151:0x020a, B:157:0x0197, B:158:0x01cf, B:160:0x01d5, B:162:0x00e2), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x036f A[Catch: l -> 0x0474, TryCatch #0 {l -> 0x0474, blocks: (B:2:0x0000, B:15:0x040c, B:17:0x0418, B:18:0x0422, B:20:0x0428, B:23:0x044f, B:26:0x0457, B:29:0x0461, B:36:0x046f, B:4:0x000e, B:164:0x0014, B:6:0x008a, B:8:0x008e, B:9:0x03f4, B:12:0x0400, B:42:0x00a3, B:44:0x00a7, B:45:0x00bc, B:47:0x00c9, B:49:0x00d9, B:50:0x00de, B:51:0x0134, B:54:0x0145, B:57:0x014d, B:130:0x01f9, B:134:0x0214, B:136:0x021e, B:138:0x0225, B:64:0x0258, B:66:0x025f, B:67:0x02f4, B:69:0x02fa, B:71:0x0308, B:72:0x030d, B:77:0x026e, B:78:0x02bd, B:79:0x0318, B:81:0x0329, B:83:0x0343, B:87:0x035f, B:104:0x0369, B:89:0x036f, B:91:0x0375, B:101:0x037e, B:94:0x0385, B:97:0x0399, B:99:0x039e, B:106:0x0352, B:107:0x03a4, B:109:0x03aa, B:126:0x03b4, B:111:0x03ba, B:113:0x03c0, B:115:0x03c8, B:116:0x03d2, B:118:0x03d8, B:120:0x03e0, B:122:0x03ea, B:128:0x03ef, B:145:0x0242, B:142:0x024b, B:151:0x020a, B:157:0x0197, B:158:0x01cf, B:160:0x01d5, B:162:0x00e2), top: B:1:0x0000 }] */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Integer g(java.lang.Void... r12) {
            /*
                Method dump skipped, instructions count: 1147
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.W2.e.j.g(java.lang.Void[]):java.lang.Integer");
        }

        boolean L(boolean z, String str, String str2) {
            if (z) {
                return d0.G(str, str2) || d0.I(str, str2);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public void p(Integer num) {
            e.this.g0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public void q(Integer num) {
            int intValue = num.intValue();
            if (intValue == 0) {
                e.this.t2();
            } else if (intValue == 11) {
                e eVar = e.this;
                eVar.B2(eVar.Z, e.this.a0);
            } else {
                e eVar2 = e.this;
                eVar2.A2(eVar2.Z, e.this.a0, intValue);
            }
        }

        h P(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            e.this.l0(true);
            if (!abstractC3595n.isDirectory()) {
                return O(abstractC3595n, abstractC3595n2, this);
            }
            if (e.this.g2(abstractC3595n, abstractC3595n2)) {
                return C(abstractC3595n, abstractC3595n2, this);
            }
            try {
                x(abstractC3595n, abstractC3595n2);
                return h.SUCCESS;
            } catch (C1495j e) {
                e.printStackTrace();
                int l2 = e.this.l2(abstractC3595n.Q());
                if (l2 == 0) {
                    e.this.n0 = true;
                }
                e.this.u2(abstractC3595n, abstractC3595n2.B(), l2);
                return h.FAILURE;
            }
        }

        public void R(boolean z) {
            this.j = z;
        }

        public j(boolean z, j.f fVar) {
            super(AbstractC3199q.e.NORMAL);
            this.h = z;
            this.i = fVar;
        }
    }

    private static class k {
        String a;
        String b;

        k(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    private static class l extends Exception {
        private l() {
        }

        /* synthetic */ l(a aVar) {
            this();
        }
    }

    static class m {
        AbstractC3595n a;
        boolean b;
        int c;
        int d;

        m(AbstractC3595n abstractC3595n, boolean z, int i, int i2) {
            this.a = abstractC3595n;
            this.b = z;
            this.c = i;
            this.d = i2;
        }
    }

    public e(h.a aVar, List<AbstractC3595n> list, C3596o c3596o, AbstractC3595n abstractC3595n, C3596o c3596o2, AbstractC3595n abstractC3595n2, boolean z) {
        super(aVar);
        this.D = new f();
        this.F = new HashSet<>();
        this.G = new ArrayList();
        this.o0 = new ax.B.b<>();
        this.w = list;
        this.I = c3596o;
        this.J = abstractC3595n;
        this.K = c3596o2;
        this.H = abstractC3595n2;
        this.c0 = z;
        c3596o.n0();
        this.K.n0();
        h(this.I.T());
        h(this.K.T());
        this.b0 = C2983q.l(249);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A2(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, int i2) {
        K k2 = new K();
        boolean isDirectory = abstractC3595n.isDirectory();
        Bundle bundle = new Bundle();
        bundle.putString("progressTypeString", C());
        bundle.putString("fileName", abstractC3595n.B());
        bundle.putBoolean("isDirectory", isDirectory);
        bundle.putInt("errCode", i2);
        bundle.putBoolean("applyToAll", true);
        bundle.putBoolean("useMergeForFolder", true);
        if (!isDirectory) {
            bundle.putBoolean("use_overwrite_newer", true);
        }
        bundle.putBoolean("directoryRename", false);
        if (!isDirectory && i2 == 1) {
            bundle.putString("new_file_path", abstractC3595n.E());
            bundle.putLong("new_file_date", abstractC3595n.q());
            bundle.putLong("new_file_size", abstractC3595n.p());
            bundle.putString("old_file_path", abstractC3595n2.E());
            bundle.putLong("old_file_date", abstractC3595n2.q());
            bundle.putLong("old_file_size", abstractC3595n2.p());
        }
        k2.v2(bundle);
        k2.v3(new c(isDirectory));
        this.h0 = k2;
        q().K(this, k2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B2(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        H l3 = H.l3(abstractC3595n.B(), R.string.error_network);
        l3.m3(new b(abstractC3595n, abstractC3595n2));
        this.i0 = l3;
        q().K(this, l3);
    }

    static /* synthetic */ int V0(e eVar) {
        int i2 = eVar.W;
        eVar.W = i2 + 1;
        return i2;
    }

    static /* synthetic */ int b1(e eVar, int i2) {
        int i3 = eVar.T + i2;
        eVar.T = i3;
        return i3;
    }

    private void d2(AbstractC3595n abstractC3595n) {
        if (this.x == null) {
            return;
        }
        String E = abstractC3595n.E();
        Iterator<AbstractC3595n> it = this.x.iterator();
        while (it.hasNext()) {
            AbstractC3595n next = it.next();
            String E2 = next.E();
            if (E2.equals(E) || d0.I(E2, E)) {
                it.remove();
                this.F.remove(next.Q());
            }
        }
    }

    static /* synthetic */ int e1(e eVar) {
        int i2 = eVar.U;
        eVar.U = i2 + 1;
        return i2;
    }

    private boolean e2(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        if (this.c0) {
            return !(J.x(r()) && C1809B.M(abstractC3595n) && !f2(r(), abstractC3595n)) && this.I.e(abstractC3595n, abstractC3595n2) && this.I.B(abstractC3595n);
        }
        return false;
    }

    private boolean f2(Context context, AbstractC3595n abstractC3595n) {
        Uri uri;
        String string;
        String[] strArr = {"owner_package_name"};
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            try {
                uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                cursor = contentResolver.query(uri, strArr, "_data = ?", new String[]{abstractC3595n.E()}, null);
                if (cursor != null && cursor.moveToFirst() && (string = cursor.getString(0)) != null) {
                    if (string.contains("chrome")) {
                        cursor.close();
                        return false;
                    }
                }
                if (cursor == null) {
                    return true;
                }
            } catch (RuntimeException e) {
                e.printStackTrace();
                if (cursor == null) {
                    return true;
                }
            }
            cursor.close();
            return true;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g2(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        return e2(abstractC3595n, abstractC3595n2) && !abstractC3595n2.n();
    }

    static /* synthetic */ int h1(e eVar) {
        int i2 = eVar.V;
        eVar.V = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h2() {
        boolean z;
        Iterator<AbstractC3595n> it = this.w.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            if (!e2(it.next(), this.H)) {
                z = false;
                break;
            }
        }
        return !z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i2() throws C1495j {
        boolean z;
        if (J.m() || !ax.Q2.f.w0(this.K.S())) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int size = this.b0.size();
        if (size == 0) {
            return;
        }
        boolean z2 = true;
        w().S(true);
        w().T(v.a.SYNC);
        try {
            ax.g3.i x = x();
            long j2 = size;
            x.a(0L, j2);
            ArrayList arrayList = new ArrayList(this.b0);
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC1823k abstractC1823k = (AbstractC1823k) ((AbstractC3595n) arrayList.get(i2));
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    try {
                        try {
                            if (abstractC1823k.k0()) {
                                try {
                                    parcelFileDescriptor = abstractC1823k.e0(true);
                                    z = true;
                                } catch (C1495j e) {
                                    e = e;
                                    ax.Q2.d.c("clipboard finishing", new IOException("Sync error : " + i2 + "/" + size + ":" + z2 + ":" + w().z(), e));
                                    throw new C1495j(e);
                                } catch (IOException e2) {
                                    e = e2;
                                    ax.Q2.d.c("clipboard finishing", new IOException("Sync error : " + i2 + "/" + size + ":" + z2 + ":" + w().z(), e));
                                    throw new C1495j(e);
                                }
                            } else if (abstractC1823k instanceof C3605y) {
                                parcelFileDescriptor = ParcelFileDescriptor.open(((C3605y) abstractC1823k).F0(), 268435456);
                                z = false;
                            } else {
                                C3184b.g("finish sync not reachable:" + y());
                            }
                            parcelFileDescriptor.getFileDescriptor().sync();
                            F.a(parcelFileDescriptor);
                            x.a(i2 + 1, j2);
                        } catch (C1495j | IOException e3) {
                            e = e3;
                            z2 = z;
                            ax.Q2.d.c("clipboard finishing", new IOException("Sync error : " + i2 + "/" + size + ":" + z2 + ":" + w().z(), e));
                            throw new C1495j(e);
                        }
                    } catch (Throwable th) {
                        if (parcelFileDescriptor != null) {
                            F.a(parcelFileDescriptor);
                        }
                        throw th;
                    }
                } catch (C1495j | IOException e4) {
                    e = e4;
                    z2 = false;
                }
            }
            w().S(false);
            p0.fine("USB syncing time : " + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable th2) {
            w().S(false);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j2() {
        try {
            if (ax.Q2.f.g0(this.K.S())) {
                AbstractC3595n abstractC3595n = this.H;
                if (abstractC3595n instanceof C3602v) {
                    long v = C1835x.e(((C3602v) abstractC3595n).B0()).v();
                    if (v > 0) {
                        this.l0 = Long.valueOf(v);
                        return;
                    }
                    return;
                }
            }
            if (ax.Q2.f.l0(this.K.S())) {
                long v2 = this.K.v();
                if (v2 > 0) {
                    this.l0 = Long.valueOf(v2);
                }
            }
        } catch (C1495j unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k2(C3596o c3596o, AbstractC3595n abstractC3595n, HashMap<String, f> hashMap, InterfaceC3185c interfaceC3185c) throws C1486a {
        Stack stack = new Stack();
        stack.push(abstractC3595n);
        boolean z = false;
        while (stack.size() > 0) {
            if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                throw new C1486a();
            }
            AbstractC3595n abstractC3595n2 = (AbstractC3595n) stack.pop();
            if (abstractC3595n2 == null) {
                break;
            }
            if (abstractC3595n2.isDirectory()) {
                f fVar = new f();
                try {
                    if (abstractC3595n2.n()) {
                        List<AbstractC3595n> f0 = c3596o.f0(abstractC3595n2);
                        if (f0 != null && f0.size() > 0) {
                            for (AbstractC3595n abstractC3595n3 : f0) {
                                if (abstractC3595n3.isDirectory()) {
                                    stack.push(abstractC3595n3);
                                    fVar.c.add(abstractC3595n3.Q());
                                } else {
                                    long p = abstractC3595n3.p();
                                    w().h(p);
                                    w().g(1);
                                    fVar.a++;
                                    fVar.b += p;
                                }
                            }
                        }
                    } else if (abstractC3595n2.P() != ax.Q2.f.t0) {
                        ax.Ha.c.h().f().b("CLIPBOARD DIR NOT EXIST").g("location:" + abstractC3595n2.R() + "," + abstractC3595n2.E()).h();
                    }
                } catch (C1495j e) {
                    e.printStackTrace();
                }
                hashMap.put(abstractC3595n2.Q(), fVar);
                if (r2(abstractC3595n2)) {
                    z = true;
                }
            } else {
                w().h(abstractC3595n2.p());
                w().g(1);
            }
        }
        if (this.c0 && z) {
            String p2 = p2(abstractC3595n.R());
            if (this.C.containsKey(p2)) {
                f m2 = m2(p2, null);
                this.k0 = m2.a;
                this.j0 = m2.b;
                p0.fine("Thumbnail Detected :" + this.k0 + "/" + this.j0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int l2(String str) {
        m2(str, this.D);
        return this.D.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f m2(String str, f fVar) {
        f fVar2;
        Stack stack = new Stack();
        f fVar3 = this.C.get(str);
        if (fVar != null) {
            fVar.a();
        } else {
            fVar = new f();
        }
        stack.push(fVar3);
        while (stack.size() > 0 && (fVar2 = (f) stack.pop()) != null) {
            fVar.a += fVar2.a;
            fVar.b += fVar2.b;
            ArrayList<String> arrayList = fVar2.c;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                String str2 = arrayList.get(i2);
                i2++;
                stack.push(this.C.get(str2));
            }
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String n2(String str) {
        Iterator<k> it = this.A.iterator();
        while (it.hasNext()) {
            k next = it.next();
            if (d0.I(next.a, str)) {
                return d0.P(next.b, d0.n(next.a, str));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String o2(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        String E = abstractC3595n2.E();
        String str = this.B.get(abstractC3595n.E());
        String E2 = abstractC3595n.E();
        if (E.equals(str)) {
            return E2;
        }
        if (TextUtils.isEmpty(E2) || TextUtils.isEmpty(str) || TextUtils.isEmpty(E)) {
            throw new IllegalArgumentException("empty path");
        }
        if (!d0.J(str, E2, abstractC3595n.P().W())) {
            ax.Ha.c.h().f().d("COGTFP!!:").g(str + ":" + E2 + ":" + abstractC3595n.R()).h();
        }
        return d0.P(E, d0.o(str, E2, abstractC3595n.P().W()));
    }

    private String p2(ax.c3.K k2) {
        return C1809B.U(k2, d0.W(k2, "/DCIM/.thumbnails"));
    }

    static /* synthetic */ int q1(e eVar) {
        int i2 = eVar.S;
        eVar.S = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q2(AbstractC3595n abstractC3595n) {
        if (ax.Q2.f.j0(abstractC3595n.P())) {
            return s2(abstractC3595n.R(), abstractC3595n.T());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r2(AbstractC3595n abstractC3595n) {
        if (ax.Q2.f.k0(abstractC3595n.P()) && abstractC3595n.isDirectory()) {
            return s2(abstractC3595n.R(), abstractC3595n.E());
        }
        return false;
    }

    private boolean s2(ax.c3.K k2, String str) {
        return d0.I(k2.e(), str) && "/DCIM/.thumbnails".equals(d0.n(k2.e(), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t2() {
        LinkedList<m> linkedList;
        LinkedList<AbstractC3595n> linkedList2 = this.y;
        if ((linkedList2 != null && !linkedList2.isEmpty()) || ((linkedList = this.z) != null && !linkedList.isEmpty())) {
            j jVar = new j(this);
            this.M = jVar;
            jVar.i(new Void[0]);
            return;
        }
        l0(true);
        if (w().O() != w().z()) {
            p0.severe("Total : " + w().O() + " != Progress : " + w().z());
        }
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u2(AbstractC3595n abstractC3595n, String str, int i2) {
        d2(abstractC3595n);
        w().c(v.b.FAILURE, i2);
        w().a(i2);
        w().b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v2(String str, String str2) {
        this.A.push(new k(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w2(AbstractC3595n abstractC3595n) {
        this.Z = abstractC3595n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x2(AbstractC3595n abstractC3595n) {
        this.a0 = abstractC3595n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y2(AbstractC3595n abstractC3595n) {
        this.X = abstractC3595n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z2(AbstractC3595n abstractC3595n) {
        this.Y = abstractC3595n;
    }

    @Override // ax.W2.j
    public String A() {
        return L();
    }

    @Override // ax.W2.j
    public int B() {
        return this.c0 ? 1 : 0;
    }

    @Override // ax.W2.j
    public String C() {
        return this.c0 ? r().getString(R.string.progress_moving) : r().getString(R.string.progress_copying);
    }

    @Override // ax.W2.j
    protected Object E() {
        return new C0217e(this.I, this.J, this.w, !this.c0);
    }

    @Override // ax.W2.j
    public String F() {
        int i2 = d.a[D().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return this.c0 ? r().getResources().getString(R.string.msg_move_failed) : r().getResources().getString(R.string.msg_copy_failed);
            }
            if (i2 != 3) {
                return null;
            }
            return r().getResources().getString(R.string.cancelled);
        }
        if (w().H() == 0 && w().M() != 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int size = this.w.size();
        if (size != 1) {
            return this.c0 ? r().getResources().getQuantityString(R.plurals.msg_moved_items_plurals, size, Integer.valueOf(size), this.H.E()) : r().getResources().getQuantityString(R.plurals.msg_copied_items_plurals, size, Integer.valueOf(size), this.H.E());
        }
        String B = this.w.get(0).B();
        return this.c0 ? r().getResources().getString(R.string.msg_moved_single_item, B, this.H.E()) : r().getResources().getString(R.string.msg_copied_single_item, B, this.H.E());
    }

    @Override // ax.W2.j
    public String G() {
        if (d.a[D().ordinal()] != 2) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return v(this.K.S() == ax.Q2.f.p0);
    }

    @Override // ax.W2.j
    public ax.c3.K H() {
        AbstractC3595n abstractC3595n = this.Z;
        if (abstractC3595n == null) {
            return null;
        }
        return abstractC3595n.R();
    }

    @Override // ax.W2.j
    public String J() {
        AbstractC3595n abstractC3595n = this.Z;
        return abstractC3595n == null ? HttpUrl.FRAGMENT_ENCODE_SET : abstractC3595n.W();
    }

    @Override // ax.W2.j
    public ax.c3.K K() {
        AbstractC3595n abstractC3595n = this.a0;
        if (abstractC3595n == null) {
            return null;
        }
        return abstractC3595n.R();
    }

    @Override // ax.W2.j
    public String M() {
        AbstractC3595n abstractC3595n = this.a0;
        return abstractC3595n == null ? HttpUrl.FRAGMENT_ENCODE_SET : abstractC3595n.W();
    }

    @Override // ax.W2.j
    protected boolean P() {
        return this.K.Y() || this.I.Y();
    }

    @Override // ax.W2.j
    protected void W() {
        K k2 = this.h0;
        if (k2 != null && k2.X0()) {
            if (this.h0.e1()) {
                this.h0.N2();
            } else {
                this.h0.u3(true);
            }
        }
        H h2 = this.i0;
        if (h2 == null || !h2.X0()) {
            return;
        }
        if (this.i0.e1()) {
            this.i0.N2();
        } else {
            this.i0.n3(true);
        }
    }

    @Override // ax.W2.j
    protected boolean X() {
        boolean z;
        if (S(this.L)) {
            this.L.e();
            z = true;
        } else {
            z = false;
        }
        if (!S(this.M)) {
            return z;
        }
        this.M.e();
        return true;
    }

    @Override // ax.W2.j
    protected void Y() {
        w().T(v.a.SCANNING);
        if (this.K.Y()) {
            this.K.n(x());
        }
        C3596o c3596o = this.K;
        C3596o c3596o2 = this.I;
        if (c3596o == c3596o2 || !c3596o2.Y()) {
            return;
        }
        this.I.n(x());
    }

    @Override // ax.W2.j
    protected void Z() {
        if (this.H != null) {
            w.c().g(this.H.R(), this.H.E(), this.o0);
        }
        if (w().M() != w().H() + w().C() || this.n0) {
            t0(h.b.FAILURE);
        } else {
            t0(h.b.SUCCESS);
        }
    }

    @Override // ax.W2.j
    public void c0() {
        j0();
        this.O = this.H.P().I();
        List<AbstractC3595n> list = this.w;
        if (list == null || list.size() <= 0) {
            this.N = "-";
        } else {
            this.N = this.w.get(0).P().I();
        }
        this.n0 = false;
        i iVar = new i();
        this.L = iVar;
        iVar.i(new Void[0]);
    }

    @Override // ax.W2.j
    public void k() {
        this.I.k0(true);
        this.K.k0(true);
    }

    @Override // ax.W2.j
    public void n0() {
        ax.Q2.a.i().m("command", this.c0 ? "file_move" : "file_copy").c("result", a.c.a(D())).c("src", this.N).c("tgt", this.O).d(w().x()).e();
    }
}
