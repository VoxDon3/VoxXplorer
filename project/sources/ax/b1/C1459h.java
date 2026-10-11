package ax.b1;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import ax.P0.C0900i;
import ax.P0.C0906o;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.d0;
import ax.Z0.I1;
import ax.b1.C1458g;
import ax.b1.C1459h;
import ax.b1.E;
import ax.b1.InterfaceC1465n;
import ax.b1.InterfaceC1471u;
import ax.b1.w;
import ax.r7.AbstractC2964C;
import ax.r7.AbstractC2991z;
import ax.r7.j0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: ax.b1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1459h implements w {
    private final UUID b;
    private final E.c c;
    private final S d;
    private final HashMap<String, String> e;
    private final boolean f;
    private final int[] g;
    private final boolean h;
    private final g i;
    private final ax.m1.m j;
    private final C0256h k;
    private final long l;
    private final List<C1458g> m;
    private final Set<f> n;
    private final Set<C1458g> o;
    private int p;
    private E q;
    private C1458g r;
    private C1458g s;
    private Looper t;
    private Handler u;
    private int v;
    private byte[] w;
    private I1 x;
    volatile d y;

    /* renamed from: ax.b1.h$b */
    public static final class b {
        private boolean d;
        private final HashMap<String, String> a = new HashMap<>();
        private UUID b = C0900i.d;
        private E.c c = O.d;
        private int[] e = new int[0];
        private boolean f = true;
        private ax.m1.m g = new ax.m1.k();
        private long h = 300000;

        public C1459h a(S s) {
            return new C1459h(this.b, this.c, s, this.a, this.d, this.e, this.f, this.g, this.h);
        }

        public b b(ax.m1.m mVar) {
            this.g = (ax.m1.m) C0968a.e(mVar);
            return this;
        }

        public b c(boolean z) {
            this.d = z;
            return this;
        }

        public b d(boolean z) {
            this.f = z;
            return this;
        }

        public b e(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                C0968a.a(z);
            }
            this.e = (int[]) iArr.clone();
            return this;
        }

        public b f(UUID uuid, E.c cVar) {
            this.b = (UUID) C0968a.e(uuid);
            this.c = (E.c) C0968a.e(cVar);
            return this;
        }
    }

    /* renamed from: ax.b1.h$c */
    private class c implements E.b {
        private c() {
        }

        @Override // ax.b1.E.b
        public void a(E e, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((d) C0968a.e(C1459h.this.y)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: ax.b1.h$d */
    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (C1458g c1458g : C1459h.this.m) {
                if (c1458g.t(bArr)) {
                    c1458g.z(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: ax.b1.h$e */
    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ax.b1.h$f */
    class f implements w.b {
        private final InterfaceC1471u.a b;
        private InterfaceC1465n c;
        private boolean d;

        public f(InterfaceC1471u.a aVar) {
            this.b = aVar;
        }

        public static /* synthetic */ void a(f fVar, C0912v c0912v) {
            if (C1459h.this.p == 0 || fVar.d) {
                return;
            }
            C1459h c1459h = C1459h.this;
            fVar.c = c1459h.u((Looper) C0968a.e(c1459h.t), fVar.b, c0912v, false);
            C1459h.this.n.add(fVar);
        }

        public static /* synthetic */ void b(f fVar) {
            if (fVar.d) {
                return;
            }
            InterfaceC1465n interfaceC1465n = fVar.c;
            if (interfaceC1465n != null) {
                interfaceC1465n.a(fVar.b);
            }
            C1459h.this.n.remove(fVar);
            fVar.d = true;
        }

        public void c(final C0912v c0912v) {
            ((Handler) C0968a.e(C1459h.this.u)).post(new Runnable() { // from class: ax.b1.j
                @Override // java.lang.Runnable
                public final void run() {
                    C1459h.f.a(C1459h.f.this, c0912v);
                }
            });
        }

        @Override // ax.b1.w.b
        public void d() {
            d0.j1((Handler) C0968a.e(C1459h.this.u), new Runnable() { // from class: ax.b1.i
                @Override // java.lang.Runnable
                public final void run() {
                    C1459h.f.b(C1459h.f.this);
                }
            });
        }
    }

    /* renamed from: ax.b1.h$g */
    private class g implements C1458g.a {
        private final Set<C1458g> a = new HashSet();
        private C1458g b;

        public g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ax.b1.C1458g.a
        public void a(Exception exc, boolean z) {
            this.b = null;
            AbstractC2991z u = AbstractC2991z.u(this.a);
            this.a.clear();
            j0 it = u.iterator();
            while (it.hasNext()) {
                ((C1458g) it.next()).B(exc, z);
            }
        }

        @Override // ax.b1.C1458g.a
        public void b(C1458g c1458g) {
            this.a.add(c1458g);
            if (this.b != null) {
                return;
            }
            this.b = c1458g;
            c1458g.F();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ax.b1.C1458g.a
        public void c() {
            this.b = null;
            AbstractC2991z u = AbstractC2991z.u(this.a);
            this.a.clear();
            j0 it = u.iterator();
            while (it.hasNext()) {
                ((C1458g) it.next()).A();
            }
        }

        public void d(C1458g c1458g) {
            this.a.remove(c1458g);
            if (this.b == c1458g) {
                this.b = null;
                if (this.a.isEmpty()) {
                    return;
                }
                C1458g next = this.a.iterator().next();
                this.b = next;
                next.F();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ax.b1.h$h, reason: collision with other inner class name */
    class C0256h implements C1458g.b {
        private C0256h() {
        }

        @Override // ax.b1.C1458g.b
        public void a(C1458g c1458g, int i) {
            if (C1459h.this.l != -9223372036854775807L) {
                C1459h.this.o.remove(c1458g);
                ((Handler) C0968a.e(C1459h.this.u)).removeCallbacksAndMessages(c1458g);
            }
        }

        @Override // ax.b1.C1458g.b
        public void b(final C1458g c1458g, int i) {
            if (i == 1 && C1459h.this.p > 0 && C1459h.this.l != -9223372036854775807L) {
                C1459h.this.o.add(c1458g);
                ((Handler) C0968a.e(C1459h.this.u)).postAtTime(new Runnable() { // from class: ax.b1.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1458g.this.a(null);
                    }
                }, c1458g, SystemClock.uptimeMillis() + C1459h.this.l);
            } else if (i == 0) {
                C1459h.this.m.remove(c1458g);
                if (C1459h.this.r == c1458g) {
                    C1459h.this.r = null;
                }
                if (C1459h.this.s == c1458g) {
                    C1459h.this.s = null;
                }
                C1459h.this.i.d(c1458g);
                if (C1459h.this.l != -9223372036854775807L) {
                    ((Handler) C0968a.e(C1459h.this.u)).removeCallbacksAndMessages(c1458g);
                    C1459h.this.o.remove(c1458g);
                }
            }
            C1459h.this.D();
        }
    }

    private synchronized void A(Looper looper) {
        try {
            Looper looper2 = this.t;
            if (looper2 == null) {
                this.t = looper;
                this.u = new Handler(looper);
            } else {
                C0968a.g(looper2 == looper);
                C0968a.e(this.u);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private InterfaceC1465n B(int i, boolean z) {
        E e2 = (E) C0968a.e(this.q);
        if ((e2.n() == 2 && F.d) || d0.U0(this.g, i) == -1 || e2.n() == 1) {
            return null;
        }
        C1458g c1458g = this.r;
        if (c1458g == null) {
            C1458g y = y(AbstractC2991z.z(), true, null, z);
            this.m.add(y);
            this.r = y;
        } else {
            c1458g.c(null);
        }
        return this.r;
    }

    private void C(Looper looper) {
        if (this.y == null) {
            this.y = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            ((E) C0968a.e(this.q)).d();
            this.q = null;
        }
    }

    private void E() {
        j0 it = AbstractC2964C.t(this.o).iterator();
        while (it.hasNext()) {
            ((InterfaceC1465n) it.next()).a(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void F() {
        j0 it = AbstractC2964C.t(this.n).iterator();
        while (it.hasNext()) {
            ((f) it.next()).d();
        }
    }

    private void H(InterfaceC1465n interfaceC1465n, InterfaceC1471u.a aVar) {
        interfaceC1465n.a(aVar);
        if (this.l != -9223372036854775807L) {
            interfaceC1465n.a(null);
        }
    }

    private void I(boolean z) {
        if (z && this.t == null) {
            C0987u.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) C0968a.e(this.t)).getThread()) {
            C0987u.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.t.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public InterfaceC1465n u(Looper looper, InterfaceC1471u.a aVar, C0912v c0912v, boolean z) {
        List<C0906o.b> list;
        C(looper);
        C0906o c0906o = c0912v.s;
        if (c0906o == null) {
            return B(ax.P0.D.k(c0912v.o), z);
        }
        C1458g c1458g = null;
        Object[] objArr = 0;
        if (this.w == null) {
            list = z((C0906o) C0968a.e(c0906o), this.b, false);
            if (list.isEmpty()) {
                e eVar = new e(this.b);
                C0987u.d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new C1451C(new InterfaceC1465n.a(eVar, 6003));
            }
        } else {
            list = null;
        }
        if (this.f) {
            Iterator<C1458g> it = this.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1458g next = it.next();
                if (Objects.equals(next.a, list)) {
                    c1458g = next;
                    break;
                }
            }
        } else {
            c1458g = this.s;
        }
        if (c1458g != null) {
            c1458g.c(aVar);
            return c1458g;
        }
        C1458g y = y(list, false, aVar, z);
        if (!this.f) {
            this.s = y;
        }
        this.m.add(y);
        return y;
    }

    private static boolean v(InterfaceC1465n interfaceC1465n) {
        if (interfaceC1465n.getState() != 1) {
            return false;
        }
        Throwable cause = ((InterfaceC1465n.a) C0968a.e(interfaceC1465n.g())).getCause();
        return (cause instanceof ResourceBusyException) || C1449A.e(cause);
    }

    private boolean w(C0906o c0906o) {
        if (this.w != null) {
            return true;
        }
        if (z(c0906o, this.b, true).isEmpty()) {
            if (c0906o.e0 != 1 || !c0906o.e(0).c(C0900i.b)) {
                return false;
            }
            C0987u.h("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.b);
        }
        String str = c0906o.d0;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? Build.VERSION.SDK_INT >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private C1458g x(List<C0906o.b> list, boolean z, InterfaceC1471u.a aVar) {
        C0968a.e(this.q);
        C1458g c1458g = new C1458g(this.b, this.q, this.i, this.k, list, this.v, this.h | z, z, this.w, this.e, this.d, (Looper) C0968a.e(this.t), this.j, (I1) C0968a.e(this.x));
        c1458g.c(aVar);
        if (this.l != -9223372036854775807L) {
            c1458g.c(null);
        }
        return c1458g;
    }

    private C1458g y(List<C0906o.b> list, boolean z, InterfaceC1471u.a aVar, boolean z2) {
        C1458g x = x(list, z, aVar);
        if (v(x) && !this.o.isEmpty()) {
            E();
            H(x, aVar);
            x = x(list, z, aVar);
        }
        if (!v(x) || !z2 || this.n.isEmpty()) {
            return x;
        }
        F();
        if (!this.o.isEmpty()) {
            E();
        }
        H(x, aVar);
        return x(list, z, aVar);
    }

    private static List<C0906o.b> z(C0906o c0906o, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(c0906o.e0);
        for (int i = 0; i < c0906o.e0; i++) {
            C0906o.b e2 = c0906o.e(i);
            if ((e2.c(uuid) || (C0900i.c.equals(uuid) && e2.c(C0900i.b))) && (e2.f0 != null || z)) {
                arrayList.add(e2);
            }
        }
        return arrayList;
    }

    public void G(int i, byte[] bArr) {
        C0968a.g(this.m.isEmpty());
        if (i == 1 || i == 3) {
            C0968a.e(bArr);
        }
        this.v = i;
        this.w = bArr;
    }

    @Override // ax.b1.w
    public int a(C0912v c0912v) {
        I(false);
        int n = ((E) C0968a.e(this.q)).n();
        C0906o c0906o = c0912v.s;
        if (c0906o == null) {
            if (d0.U0(this.g, ax.P0.D.k(c0912v.o)) == -1) {
                return 0;
            }
        } else if (!w(c0906o)) {
            return 1;
        }
        return n;
    }

    @Override // ax.b1.w
    public InterfaceC1465n b(InterfaceC1471u.a aVar, C0912v c0912v) {
        I(false);
        C0968a.g(this.p > 0);
        C0968a.i(this.t);
        return u(this.t, aVar, c0912v, true);
    }

    @Override // ax.b1.w
    public void c(Looper looper, I1 i1) {
        A(looper);
        this.x = i1;
    }

    @Override // ax.b1.w
    public final void d() {
        I(true);
        int i = this.p - 1;
        this.p = i;
        if (i != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.m);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C1458g) arrayList.get(i2)).a(null);
            }
        }
        F();
        D();
    }

    @Override // ax.b1.w
    public w.b e(InterfaceC1471u.a aVar, C0912v c0912v) {
        C0968a.g(this.p > 0);
        C0968a.i(this.t);
        f fVar = new f(aVar);
        fVar.c(c0912v);
        return fVar;
    }

    @Override // ax.b1.w
    public final void k() {
        I(true);
        int i = this.p;
        this.p = i + 1;
        if (i != 0) {
            return;
        }
        if (this.q == null) {
            E a2 = this.c.a(this.b);
            this.q = a2;
            a2.k(new c());
        } else if (this.l != -9223372036854775807L) {
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                this.m.get(i2).c(null);
            }
        }
    }

    private C1459h(UUID uuid, E.c cVar, S s, HashMap<String, String> hashMap, boolean z, int[] iArr, boolean z2, ax.m1.m mVar, long j) {
        C0968a.e(uuid);
        C0968a.b(!C0900i.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.b = uuid;
        this.c = cVar;
        this.d = s;
        this.e = hashMap;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = mVar;
        this.i = new g();
        this.k = new C0256h();
        this.v = 0;
        this.m = new ArrayList();
        this.n = ax.r7.d0.h();
        this.o = ax.r7.d0.h();
        this.l = j;
    }
}
