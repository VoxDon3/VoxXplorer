package ax.M5;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import ax.J5.C0742c;
import ax.J5.C0744e;
import ax.J5.C0748i;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ax.M5.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0808c<T extends IInterface> {
    private C0742c A0;
    private boolean B0;
    private volatile i0 C0;
    protected AtomicInteger D0;
    private long c0;
    private long d0;
    private int e0;
    private long f0;
    private volatile String g0;
    t0 h0;
    private final Context i0;
    private final Looper j0;
    private final AbstractC0813h k0;
    private final C0748i l0;
    final Handler m0;
    private final Object n0;
    private final Object o0;
    private InterfaceC0817l p0;
    private int q;
    protected InterfaceC0151c q0;
    private IInterface r0;
    private final ArrayList s0;
    private f0 t0;
    private int u0;
    private final a v0;
    private final b w0;
    private final int x0;
    private final String y0;
    private volatile String z0;
    private static final C0744e[] F0 = new C0744e[0];
    public static final String[] E0 = {"service_esmobile", "service_googleme"};

    /* renamed from: ax.M5.c$a */
    public interface a {
        void B(Bundle bundle);

        void w(int i);
    }

    /* renamed from: ax.M5.c$b */
    public interface b {
        void r(C0742c c0742c);
    }

    /* renamed from: ax.M5.c$c, reason: collision with other inner class name */
    public interface InterfaceC0151c {
        void c(C0742c c0742c);
    }

    /* renamed from: ax.M5.c$d */
    protected class d implements InterfaceC0151c {
        public d() {
        }

        @Override // ax.M5.AbstractC0808c.InterfaceC0151c
        public final void c(C0742c c0742c) {
            if (c0742c.C()) {
                AbstractC0808c abstractC0808c = AbstractC0808c.this;
                abstractC0808c.c(null, abstractC0808c.C());
            } else if (AbstractC0808c.this.w0 != null) {
                AbstractC0808c.this.w0.r(c0742c);
            }
        }
    }

    /* renamed from: ax.M5.c$e */
    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected AbstractC0808c(android.content.Context r10, android.os.Looper r11, int r12, ax.M5.AbstractC0808c.a r13, ax.M5.AbstractC0808c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            ax.M5.h r3 = ax.M5.AbstractC0813h.c(r10)
            ax.J5.i r4 = ax.J5.C0748i.f()
            ax.M5.C0821p.l(r13)
            ax.M5.C0821p.l(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.M5.AbstractC0808c.<init>(android.content.Context, android.os.Looper, int, ax.M5.c$a, ax.M5.c$b, java.lang.String):void");
    }

    static /* bridge */ /* synthetic */ void c0(AbstractC0808c abstractC0808c, i0 i0Var) {
        abstractC0808c.C0 = i0Var;
        if (abstractC0808c.S()) {
            C0810e c0810e = i0Var.e0;
            C0822q.b().c(c0810e == null ? null : c0810e.D());
        }
    }

    static /* bridge */ /* synthetic */ void d0(AbstractC0808c abstractC0808c, int i) {
        int i2;
        int i3;
        synchronized (abstractC0808c.n0) {
            i2 = abstractC0808c.u0;
        }
        if (i2 == 3) {
            abstractC0808c.B0 = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = abstractC0808c.m0;
        handler.sendMessage(handler.obtainMessage(i3, abstractC0808c.D0.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean g0(AbstractC0808c abstractC0808c, int i, int i2, IInterface iInterface) {
        synchronized (abstractC0808c.n0) {
            try {
                if (abstractC0808c.u0 != i) {
                    return false;
                }
                abstractC0808c.i0(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean h0(AbstractC0808c abstractC0808c) {
        if (abstractC0808c.B0 || TextUtils.isEmpty(abstractC0808c.E()) || TextUtils.isEmpty(abstractC0808c.B())) {
            return false;
        }
        try {
            Class.forName(abstractC0808c.E());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i0(int i, IInterface iInterface) {
        t0 t0Var;
        C0821p.a((i == 4) == (iInterface != 0));
        synchronized (this.n0) {
            try {
                this.u0 = i;
                this.r0 = iInterface;
                if (i == 1) {
                    f0 f0Var = this.t0;
                    if (f0Var != null) {
                        AbstractC0813h abstractC0813h = this.k0;
                        String b2 = this.h0.b();
                        C0821p.l(b2);
                        abstractC0813h.g(b2, this.h0.a(), 4225, f0Var, X(), this.h0.c());
                        this.t0 = null;
                    }
                } else if (i == 2 || i == 3) {
                    f0 f0Var2 = this.t0;
                    if (f0Var2 != null && (t0Var = this.h0) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + t0Var.b() + " on " + t0Var.a());
                        AbstractC0813h abstractC0813h2 = this.k0;
                        String b3 = this.h0.b();
                        C0821p.l(b3);
                        abstractC0813h2.g(b3, this.h0.a(), 4225, f0Var2, X(), this.h0.c());
                        this.D0.incrementAndGet();
                    }
                    f0 f0Var3 = new f0(this, this.D0.get());
                    this.t0 = f0Var3;
                    t0 t0Var2 = (this.u0 != 3 || B() == null) ? new t0(G(), F(), false, 4225, I()) : new t0(y().getPackageName(), B(), true, 4225, false);
                    this.h0 = t0Var2;
                    if (t0Var2.c() && k() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.h0.b())));
                    }
                    AbstractC0813h abstractC0813h3 = this.k0;
                    String b4 = this.h0.b();
                    C0821p.l(b4);
                    if (!abstractC0813h3.h(new m0(b4, this.h0.a(), 4225, this.h0.c()), f0Var3, X(), w())) {
                        Log.w("GmsClient", "unable to connect to service: " + this.h0.b() + " on " + this.h0.a());
                        e0(16, null, this.D0.get());
                    }
                } else if (i == 4) {
                    C0821p.l(iInterface);
                    K(iInterface);
                }
            } finally {
            }
        }
    }

    protected Bundle A() {
        return new Bundle();
    }

    protected String B() {
        return null;
    }

    protected Set<Scope> C() {
        return Collections.EMPTY_SET;
    }

    public final T D() throws DeadObjectException {
        T t;
        synchronized (this.n0) {
            try {
                if (this.u0 == 5) {
                    throw new DeadObjectException();
                }
                r();
                t = (T) this.r0;
                C0821p.m(t, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    protected abstract String E();

    protected abstract String F();

    protected String G() {
        return "com.google.android.gms";
    }

    public C0810e H() {
        i0 i0Var = this.C0;
        if (i0Var == null) {
            return null;
        }
        return i0Var.e0;
    }

    protected boolean I() {
        return k() >= 211700000;
    }

    public boolean J() {
        return this.C0 != null;
    }

    protected void K(T t) {
        this.d0 = System.currentTimeMillis();
    }

    protected void L(C0742c c0742c) {
        this.e0 = c0742c.k();
        this.f0 = System.currentTimeMillis();
    }

    protected void M(int i) {
        this.q = i;
        this.c0 = System.currentTimeMillis();
    }

    protected void N(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.m0.sendMessage(this.m0.obtainMessage(1, i2, -1, new g0(this, i, iBinder, bundle)));
    }

    public boolean O() {
        return false;
    }

    public void P(String str) {
        this.z0 = str;
    }

    public void Q(int i) {
        this.m0.sendMessage(this.m0.obtainMessage(6, this.D0.get(), i));
    }

    protected void R(InterfaceC0151c interfaceC0151c, int i, PendingIntent pendingIntent) {
        C0821p.m(interfaceC0151c, "Connection progress callbacks cannot be null.");
        this.q0 = interfaceC0151c;
        this.m0.sendMessage(this.m0.obtainMessage(3, this.D0.get(), i, pendingIntent));
    }

    public boolean S() {
        return false;
    }

    protected final String X() {
        String str = this.y0;
        return str == null ? this.i0.getClass().getName() : str;
    }

    public boolean a() {
        boolean z;
        synchronized (this.n0) {
            z = this.u0 == 4;
        }
        return z;
    }

    public void b() {
        this.D0.incrementAndGet();
        synchronized (this.s0) {
            try {
                int size = this.s0.size();
                for (int i = 0; i < size; i++) {
                    ((d0) this.s0.get(i)).d();
                }
                this.s0.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.o0) {
            this.p0 = null;
        }
        i0(1, null);
    }

    public void c(InterfaceC0815j interfaceC0815j, Set<Scope> set) {
        Bundle A = A();
        String str = this.z0;
        int i = C0748i.a;
        Scope[] scopeArr = C0811f.p0;
        Bundle bundle = new Bundle();
        int i2 = this.x0;
        C0744e[] c0744eArr = C0811f.q0;
        C0811f c0811f = new C0811f(6, i2, i, null, null, scopeArr, bundle, null, c0744eArr, c0744eArr, true, 0, false, str);
        c0811f.e0 = this.i0.getPackageName();
        c0811f.h0 = A;
        if (set != null) {
            c0811f.g0 = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account u = u();
            if (u == null) {
                u = new Account("<<default account>>", "com.google");
            }
            c0811f.i0 = u;
            if (interfaceC0815j != null) {
                c0811f.f0 = interfaceC0815j.asBinder();
            }
        } else if (O()) {
            c0811f.i0 = u();
        }
        c0811f.j0 = F0;
        c0811f.k0 = v();
        if (S()) {
            c0811f.n0 = true;
        }
        try {
            synchronized (this.o0) {
                try {
                    InterfaceC0817l interfaceC0817l = this.p0;
                    if (interfaceC0817l != null) {
                        interfaceC0817l.L1(new e0(this, this.D0.get()), c0811f);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            Q(3);
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.D0.get());
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.D0.get());
        }
    }

    public void e(String str) {
        this.g0 = str;
        b();
    }

    protected final void e0(int i, Bundle bundle, int i2) {
        this.m0.sendMessage(this.m0.obtainMessage(7, i2, -1, new h0(this, i, null)));
    }

    public boolean f() {
        boolean z;
        synchronized (this.n0) {
            int i = this.u0;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public String g() {
        t0 t0Var;
        if (!a() || (t0Var = this.h0) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return t0Var.a();
    }

    public void h(InterfaceC0151c interfaceC0151c) {
        C0821p.m(interfaceC0151c, "Connection progress callbacks cannot be null.");
        this.q0 = interfaceC0151c;
        i0(2, null);
    }

    public void i(e eVar) {
        eVar.a();
    }

    public boolean j() {
        return true;
    }

    public int k() {
        return C0748i.a;
    }

    public final C0744e[] l() {
        i0 i0Var = this.C0;
        if (i0Var == null) {
            return null;
        }
        return i0Var.c0;
    }

    public String m() {
        return this.g0;
    }

    public boolean o() {
        return false;
    }

    public void q() {
        int h = this.l0.h(this.i0, k());
        if (h == 0) {
            h(new d());
        } else {
            i0(1, null);
            R(new d(), h, null);
        }
    }

    protected final void r() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract T s(IBinder iBinder);

    protected boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public C0744e[] v() {
        return F0;
    }

    protected Executor w() {
        return null;
    }

    public Bundle x() {
        return null;
    }

    public final Context y() {
        return this.i0;
    }

    public int z() {
        return this.x0;
    }

    protected AbstractC0808c(Context context, Looper looper, AbstractC0813h abstractC0813h, C0748i c0748i, int i, a aVar, b bVar, String str) {
        this.g0 = null;
        this.n0 = new Object();
        this.o0 = new Object();
        this.s0 = new ArrayList();
        this.u0 = 1;
        this.A0 = null;
        this.B0 = false;
        this.C0 = null;
        this.D0 = new AtomicInteger(0);
        C0821p.m(context, "Context must not be null");
        this.i0 = context;
        C0821p.m(looper, "Looper must not be null");
        this.j0 = looper;
        C0821p.m(abstractC0813h, "Supervisor must not be null");
        this.k0 = abstractC0813h;
        C0821p.m(c0748i, "API availability must not be null");
        this.l0 = c0748i;
        this.m0 = new c0(this, looper);
        this.x0 = i;
        this.v0 = aVar;
        this.w0 = bVar;
        this.y0 = str;
    }
}
