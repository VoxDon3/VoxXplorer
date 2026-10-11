package ax.b1;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import ax.P0.C0900i;
import ax.P0.C0906o;
import ax.S0.C0968a;
import ax.S0.C0980m;
import ax.S0.C0987u;
import ax.S0.InterfaceC0979l;
import ax.S0.d0;
import ax.Z0.I1;
import ax.b1.E;
import ax.b1.InterfaceC1465n;
import ax.b1.InterfaceC1471u;
import ax.i1.C2205B;
import ax.i1.C2234y;
import ax.m1.m;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: ax.b1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1458g implements InterfaceC1465n {
    public final List<C0906o.b> a;
    private final E b;
    private final a c;
    private final b d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final HashMap<String, String> h;
    private final C0980m<InterfaceC1471u.a> i;
    private final ax.m1.m j;
    private final I1 k;
    private final S l;
    private final UUID m;
    private final Looper n;
    private final e o;
    private int p;
    private int q;
    private HandlerThread r;
    private c s;
    private ax.V0.b t;
    private InterfaceC1465n.a u;
    private byte[] v;
    private byte[] w;
    private E.a x;
    private E.d y;

    /* renamed from: ax.b1.g$a */
    public interface a {
        void a(Exception exc, boolean z);

        void b(C1458g c1458g);

        void c();
    }

    /* renamed from: ax.b1.g$b */
    public interface b {
        void a(C1458g c1458g, int i);

        void b(C1458g c1458g, int i);
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: ax.b1.g$c */
    private class c extends Handler {
        private boolean a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, T t) {
            d dVar = (d) message.obj;
            if (!dVar.b) {
                return false;
            }
            int i = dVar.e + 1;
            dVar.e = i;
            if (i > C1458g.this.j.c(3)) {
                return false;
            }
            long b = C1458g.this.j.b(new m.c(new C2234y(dVar.a, t.q, t.c0, t.d0, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.c, t.e0), new C2205B(3), t.getCause() instanceof IOException ? (IOException) t.getCause() : new f(t.getCause()), dVar.e));
            if (b == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), b);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void b(int i, Object obj, boolean z) {
            obtainMessage(i, new d(C2234y.a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable th;
            d dVar = (d) message.obj;
            try {
                int i = message.what;
                if (i == 1) {
                    th = C1458g.this.l.a(C1458g.this.m, (E.d) dVar.d);
                } else {
                    if (i != 2) {
                        throw new RuntimeException();
                    }
                    th = C1458g.this.l.b(C1458g.this.m, (E.a) dVar.d);
                }
            } catch (T e) {
                boolean a = a(message, e);
                th = e;
                if (a) {
                    return;
                }
            } catch (Exception e2) {
                C0987u.i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                th = e2;
            }
            C1458g.this.j.a(dVar.a);
            synchronized (this) {
                try {
                    if (!this.a) {
                        C1458g.this.o.obtainMessage(message.what, Pair.create(dVar.d, th)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: ax.b1.g$d */
    private static final class d {
        public final long a;
        public final boolean b;
        public final long c;
        public final Object d;
        public int e;

        public d(long j, boolean z, long j2, Object obj) {
            this.a = j;
            this.b = z;
            this.c = j2;
            this.d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: ax.b1.g$e */
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 1) {
                C1458g.this.C(obj, obj2);
            } else {
                if (i != 2) {
                    return;
                }
                C1458g.this.w(obj, obj2);
            }
        }
    }

    /* renamed from: ax.b1.g$f */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public C1458g(UUID uuid, E e2, a aVar, b bVar, List<C0906o.b> list, int i, boolean z, boolean z2, byte[] bArr, HashMap<String, String> hashMap, S s, Looper looper, ax.m1.m mVar, I1 i1) {
        if (i == 1 || i == 3) {
            C0968a.e(bArr);
        }
        this.m = uuid;
        this.c = aVar;
        this.d = bVar;
        this.b = e2;
        this.e = i;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            this.a = DesugarCollections.unmodifiableList((List) C0968a.e(list));
        }
        this.h = hashMap;
        this.l = s;
        this.i = new C0980m<>();
        this.j = mVar;
        this.k = i1;
        this.p = 2;
        this.n = looper;
        this.o = new e(looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(Object obj, Object obj2) {
        if (obj == this.y) {
            if (this.p == 2 || u()) {
                this.y = null;
                if (obj2 instanceof Exception) {
                    this.c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.b.l((byte[]) obj2);
                    this.c.c();
                } catch (Exception e2) {
                    this.c.a(e2, true);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean D() {
        /*
            r4 = this;
            boolean r0 = r4.u()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            ax.b1.E r0 = r4.b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r0.e()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.v = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            ax.b1.E r2 = r4.b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            ax.Z0.I1 r3 = r4.k     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.i(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            ax.b1.E r0 = r4.b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r2 = r4.v     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            ax.V0.b r0 = r0.c(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.t = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r0 = 3
            r4.p = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            ax.b1.b r2 = new ax.b1.b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.<init>()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.q(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r4.v     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            ax.S0.C0968a.e(r0)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            return r1
        L32:
            r0 = move-exception
            goto L35
        L34:
            r0 = move-exception
        L35:
            boolean r2 = ax.b1.C1449A.d(r0)
            if (r2 == 0) goto L41
            ax.b1.g$a r0 = r4.c
            r0.b(r4)
            goto L4a
        L41:
            r4.v(r0, r1)
            goto L4a
        L45:
            ax.b1.g$a r0 = r4.c
            r0.b(r4)
        L4a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.b1.C1458g.D():boolean");
    }

    private void E(byte[] bArr, int i, boolean z) {
        try {
            this.x = this.b.m(bArr, this.a, i, this.h);
            ((c) d0.i(this.s)).b(2, C0968a.e(this.x), z);
        } catch (Exception | NoSuchMethodError e2) {
            x(e2, true);
        }
    }

    private boolean G() {
        try {
            this.b.g(this.v, this.w);
            return true;
        } catch (Exception | NoSuchMethodError e2) {
            v(e2, 1);
            return false;
        }
    }

    private void H() {
        if (Thread.currentThread() != this.n.getThread()) {
            C0987u.i("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.n.getThread().getName(), new IllegalStateException());
        }
    }

    private void q(InterfaceC0979l<InterfaceC1471u.a> interfaceC0979l) {
        Iterator<InterfaceC1471u.a> it = this.i.H().iterator();
        while (it.hasNext()) {
            interfaceC0979l.accept(it.next());
        }
    }

    private void r(boolean z) {
        if (this.g) {
            return;
        }
        byte[] bArr = (byte[]) d0.i(this.v);
        int i = this.e;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.w == null || G()) {
                    E(bArr, 2, z);
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            C0968a.e(this.w);
            C0968a.e(this.v);
            E(this.w, 3, z);
            return;
        }
        if (this.w == null) {
            E(bArr, 1, z);
            return;
        }
        if (this.p == 4 || G()) {
            long s = s();
            if (this.e != 0 || s > 60) {
                if (s <= 0) {
                    v(new Q(), 2);
                    return;
                } else {
                    this.p = 4;
                    q(new InterfaceC0979l() { // from class: ax.b1.f
                        @Override // ax.S0.InterfaceC0979l
                        public final void accept(Object obj) {
                            ((InterfaceC1471u.a) obj).j();
                        }
                    });
                    return;
                }
            }
            C0987u.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + s);
            E(bArr, 2, z);
        }
    }

    private long s() {
        if (!C0900i.d.equals(this.m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) C0968a.e(V.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean u() {
        int i = this.p;
        return i == 3 || i == 4;
    }

    private void v(final Throwable th, int i) {
        this.u = new InterfaceC1465n.a(th, C1449A.b(th, i));
        C0987u.d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            q(new InterfaceC0979l() { // from class: ax.b1.e
                @Override // ax.S0.InterfaceC0979l
                public final void accept(Object obj) {
                    ((InterfaceC1471u.a) obj).l((Exception) th);
                }
            });
        } else {
            if (!(th instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
            if (!C1449A.e(th) && !C1449A.d(th)) {
                throw ((Error) th);
            }
        }
        if (this.p != 4) {
            this.p = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(Object obj, Object obj2) {
        if (obj == this.x && u()) {
            this.x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                x((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.e == 3) {
                    this.b.j((byte[]) d0.i(this.w), bArr);
                    q(new InterfaceC0979l() { // from class: ax.b1.c
                        @Override // ax.S0.InterfaceC0979l
                        public final void accept(Object obj3) {
                            ((InterfaceC1471u.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] j = this.b.j(this.v, bArr);
                int i = this.e;
                if ((i == 2 || (i == 0 && this.w != null)) && j != null && j.length != 0) {
                    this.w = j;
                }
                this.p = 4;
                q(new InterfaceC0979l() { // from class: ax.b1.d
                    @Override // ax.S0.InterfaceC0979l
                    public final void accept(Object obj3) {
                        ((InterfaceC1471u.a) obj3).h();
                    }
                });
            } catch (Exception e2) {
                e = e2;
                x(e, true);
            } catch (NoSuchMethodError e3) {
                e = e3;
                x(e, true);
            }
        }
    }

    private void x(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || C1449A.d(th)) {
            this.c.b(this);
        } else {
            v(th, z ? 1 : 2);
        }
    }

    private void y() {
        if (this.e == 0 && this.p == 4) {
            d0.i(this.v);
            r(false);
        }
    }

    void A() {
        if (D()) {
            r(true);
        }
    }

    void B(Exception exc, boolean z) {
        v(exc, z ? 1 : 3);
    }

    void F() {
        this.y = this.b.b();
        ((c) d0.i(this.s)).b(1, C0968a.e(this.y), true);
    }

    @Override // ax.b1.InterfaceC1465n
    public void a(InterfaceC1471u.a aVar) {
        H();
        int i = this.q;
        if (i <= 0) {
            C0987u.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.q = i2;
        if (i2 == 0) {
            this.p = 0;
            ((e) d0.i(this.o)).removeCallbacksAndMessages(null);
            ((c) d0.i(this.s)).c();
            this.s = null;
            ((HandlerThread) d0.i(this.r)).quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            this.y = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.b.h(bArr);
                this.v = null;
            }
        }
        if (aVar != null) {
            this.i.h(aVar);
            if (this.i.g(aVar) == 0) {
                aVar.m();
            }
        }
        this.d.b(this, this.q);
    }

    @Override // ax.b1.InterfaceC1465n
    public final UUID b() {
        H();
        return this.m;
    }

    @Override // ax.b1.InterfaceC1465n
    public void c(InterfaceC1471u.a aVar) {
        H();
        if (this.q < 0) {
            C0987u.c("DefaultDrmSession", "Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (aVar != null) {
            this.i.e(aVar);
        }
        int i = this.q + 1;
        this.q = i;
        if (i == 1) {
            C0968a.g(this.p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new c(this.r.getLooper());
            if (D()) {
                r(true);
            }
        } else if (aVar != null && u() && this.i.g(aVar) == 1) {
            aVar.k(this.p);
        }
        this.d.a(this, this.q);
    }

    @Override // ax.b1.InterfaceC1465n
    public boolean d() {
        H();
        return this.f;
    }

    @Override // ax.b1.InterfaceC1465n
    public Map<String, String> e() {
        H();
        byte[] bArr = this.v;
        if (bArr == null) {
            return null;
        }
        return this.b.a(bArr);
    }

    @Override // ax.b1.InterfaceC1465n
    public boolean f(String str) {
        H();
        return this.b.f((byte[]) C0968a.i(this.v), str);
    }

    @Override // ax.b1.InterfaceC1465n
    public final InterfaceC1465n.a g() {
        H();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // ax.b1.InterfaceC1465n
    public final int getState() {
        H();
        return this.p;
    }

    @Override // ax.b1.InterfaceC1465n
    public final ax.V0.b h() {
        H();
        return this.t;
    }

    public boolean t(byte[] bArr) {
        H();
        return Arrays.equals(this.v, bArr);
    }

    void z(int i) {
        if (i != 2) {
            return;
        }
        y();
    }
}
