/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import ax.J5.i;
import ax.M5.c0;
import ax.M5.d0;
import ax.M5.e0;
import ax.M5.f;
import ax.M5.f0;
import ax.M5.g0;
import ax.M5.h;
import ax.M5.h0;
import ax.M5.i0;
import ax.M5.j;
import ax.M5.k;
import ax.M5.l;
import ax.M5.m0;
import ax.M5.p;
import ax.M5.q;
import ax.M5.r;
import ax.M5.t0;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class c<T extends IInterface> {
    public static final String[] E0;
    private static final ax.J5.e[] F0;
    private ax.J5.c A0;
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
    private final h k0;
    private final i l0;
    final Handler m0;
    private final Object n0;
    private final Object o0;
    private l p0;
    private int q;
    protected c q0;
    private IInterface r0;
    private final ArrayList s0;
    private f0 t0;
    private int u0;
    private final a v0;
    private final b w0;
    private final int x0;
    private final String y0;
    private volatile String z0;

    static {
        F0 = new ax.J5.e[0];
        E0 = new String[]{"service_esmobile", "service_googleme"};
    }

    protected c(Context context, Looper looper, int n8, a a8, b b8, String string) {
        h h8 = h.c(context);
        i i8 = i.f();
        p.l(a8);
        p.l(b8);
        this(context, looper, h8, i8, n8, a8, b8, string);
    }

    protected c(Context context, Looper looper, h h8, i i8, int n8, a a8, b b8, String string) {
        this.g0 = null;
        this.n0 = new Object();
        this.o0 = new Object();
        this.s0 = new ArrayList();
        this.u0 = 1;
        this.A0 = null;
        this.B0 = false;
        this.C0 = null;
        this.D0 = new AtomicInteger(0);
        p.m(context, "Context must not be null");
        this.i0 = context;
        p.m(looper, "Looper must not be null");
        this.j0 = looper;
        p.m(h8, "Supervisor must not be null");
        this.k0 = h8;
        p.m(i8, "API availability must not be null");
        this.l0 = i8;
        this.m0 = new c0(this, looper);
        this.x0 = n8;
        this.v0 = a8;
        this.w0 = b8;
        this.y0 = string;
    }

    static /* bridge */ /* synthetic */ ax.J5.c T(c c8) {
        return c8.A0;
    }

    static /* bridge */ /* synthetic */ a U(c c8) {
        return c8.v0;
    }

    static /* bridge */ /* synthetic */ Object W(c c8) {
        return c8.o0;
    }

    static /* bridge */ /* synthetic */ ArrayList Y(c c8) {
        return c8.s0;
    }

    static /* bridge */ /* synthetic */ void Z(c c8, ax.J5.c c9) {
        c8.A0 = c9;
    }

    static /* bridge */ /* synthetic */ void a0(c c8, l l8) {
        c8.p0 = l8;
    }

    static /* bridge */ /* synthetic */ void b0(c c8, int n8, IInterface iInterface) {
        c8.i0(n8, null);
    }

    static /* bridge */ /* synthetic */ void c0(c object, i0 object2) {
        ((c)object).C0 = object2;
        if (((c)object).S()) {
            object = ((i0)object2).e0;
            object2 = ax.M5.q.b();
            object = object == null ? null : ((ax.M5.e)object).D();
            ((q)object2).c((r)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static /* bridge */ /* synthetic */ void d0(c c8, int n8) {
        Object object = c8.n0;
        // MONITORENTER : object
        n8 = c8.u0;
        // MONITOREXIT : object
        if (n8 == 3) {
            c8.B0 = true;
            n8 = 5;
        } else {
            n8 = 4;
        }
        object = c8.m0;
        object.sendMessage(object.obtainMessage(n8, c8.D0.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean f0(c c8) {
        return c8.B0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static /* bridge */ /* synthetic */ boolean g0(c c8, int n8, int n9, IInterface iInterface) {
        Object object = c8.n0;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                try {
                    if (c8.u0 != n8) {
                        return false;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                c8.i0(n9, iInterface);
                return true;
            }
            throw throwable2;
        }
    }

    static /* bridge */ /* synthetic */ boolean h0(c c8) {
        if (c8.B0) {
            return false;
        }
        if (TextUtils.isEmpty((CharSequence)c8.E())) {
            return false;
        }
        if (TextUtils.isEmpty((CharSequence)c8.B())) {
            return false;
        }
        try {
            Class.forName(c8.E());
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void i0(int n8, IInterface object) {
        boolean bl;
        boolean bl2 = false;
        boolean bl3 = n8 == 4;
        if (bl3 == (bl = object != null)) {
            bl2 = true;
        }
        p.a(bl2);
        Object object2 = this.n0;
        synchronized (object2) {
            Throwable throwable2;
            block12: {
                block11: {
                    block9: {
                        Object object3;
                        Object object4;
                        Object object5;
                        block10: {
                            try {
                                this.u0 = n8;
                                this.r0 = object;
                                if (n8 == 1) break block9;
                                if (n8 == 2 || n8 == 3) break block10;
                                if (n8 == 4) {
                                    p.l(object);
                                    this.K(object);
                                }
                                break block11;
                            }
                            catch (Throwable throwable2) {
                                break block12;
                            }
                        }
                        object = this.t0;
                        if (object != null && (object5 = this.h0) != null) {
                            object4 = ((t0)object5).b();
                            object5 = ((t0)object5).a();
                            object3 = new StringBuilder();
                            ((StringBuilder)object3).append("Calling connect() while still connected, missing disconnect() for ");
                            ((StringBuilder)object3).append((String)object4);
                            ((StringBuilder)object3).append(" on ");
                            ((StringBuilder)object3).append((String)object5);
                            Log.e((String)"GmsClient", (String)((StringBuilder)object3).toString());
                            object4 = this.k0;
                            object5 = this.h0.b();
                            p.l(object5);
                            ((h)object4).g((String)object5, this.h0.a(), 4225, (ServiceConnection)object, this.X(), this.h0.c());
                            this.D0.incrementAndGet();
                        }
                        this.t0 = object4 = new f0(this, this.D0.get());
                        object = this.u0 == 3 && this.B() != null ? new t0(this.y().getPackageName(), this.B(), true, 4225, false) : new t0(this.G(), this.F(), false, 4225, this.I());
                        this.h0 = object;
                        if (((t0)object).c() && this.k() < 17895000) {
                            object = new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.h0.b())));
                            throw object;
                        }
                        object3 = this.k0;
                        String string = this.h0.b();
                        p.l(string);
                        object = this.h0.a();
                        object5 = this.X();
                        bl2 = this.h0.c();
                        Executor executor = this.w();
                        m0 m02 = new m0(string, (String)object, 4225, bl2);
                        if (!((h)object3).h(m02, (ServiceConnection)object4, (String)object5, executor)) {
                            object = this.h0.b();
                            object5 = this.h0.a();
                            object4 = new StringBuilder();
                            ((StringBuilder)object4).append("unable to connect to service: ");
                            ((StringBuilder)object4).append((String)object);
                            ((StringBuilder)object4).append(" on ");
                            ((StringBuilder)object4).append((String)object5);
                            Log.w((String)"GmsClient", (String)((StringBuilder)object4).toString());
                            this.e0(16, null, this.D0.get());
                        }
                        break block11;
                    }
                    f0 f02 = this.t0;
                    if (f02 != null) {
                        object = this.k0;
                        String string = this.h0.b();
                        p.l(string);
                        ((h)object).g(string, this.h0.a(), 4225, f02, this.X(), this.h0.c());
                        this.t0 = null;
                    }
                }
                return;
            }
            throw throwable2;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final T D() throws DeadObjectException {
        Object object = this.n0;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                try {
                    if (this.u0 != 5) {
                        this.r();
                        IInterface iInterface = this.r0;
                        p.m(iInterface, "Client is connected but service is null");
                        return (T)iInterface;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                DeadObjectException deadObjectException = new DeadObjectException();
                throw deadObjectException;
            }
            throw throwable2;
        }
    }

    protected abstract String E();

    protected abstract String F();

    protected String G() {
        return "com.google.android.gms";
    }

    public ax.M5.e H() {
        i0 i02 = this.C0;
        if (i02 == null) {
            return null;
        }
        return i02.e0;
    }

    protected boolean I() {
        return this.k() >= 211700000;
    }

    public boolean J() {
        return this.C0 != null;
    }

    protected void K(T t8) {
        this.d0 = System.currentTimeMillis();
    }

    protected void L(ax.J5.c c8) {
        this.e0 = c8.k();
        this.f0 = System.currentTimeMillis();
    }

    protected void M(int n8) {
        this.q = n8;
        this.c0 = System.currentTimeMillis();
    }

    protected void N(int n8, IBinder object, Bundle bundle, int n9) {
        object = new g0(this, n8, (IBinder)object, bundle);
        object = this.m0.obtainMessage(1, n9, -1, object);
        this.m0.sendMessage((Message)object);
    }

    public boolean O() {
        return false;
    }

    public void P(String string) {
        this.z0 = string;
    }

    public void Q(int n8) {
        int n9 = this.D0.get();
        Message message = this.m0.obtainMessage(6, n9, n8);
        this.m0.sendMessage(message);
    }

    protected void R(c c8, int n8, PendingIntent pendingIntent) {
        p.m(c8, "Connection progress callbacks cannot be null.");
        this.q0 = c8;
        int n9 = this.D0.get();
        c8 = this.m0.obtainMessage(3, n9, n8, (Object)pendingIntent);
        this.m0.sendMessage((Message)c8);
    }

    public boolean S() {
        return false;
    }

    protected final String X() {
        String string;
        String string2 = string = this.y0;
        if (string == null) {
            string2 = this.i0.getClass().getName();
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a() {
        Object object = this.n0;
        synchronized (object) {
            if (this.u0 != 4) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void b() {
        this.D0.incrementAndGet();
        ArrayList arrayList = this.s0;
        // MONITORENTER : arrayList
        int n8 = this.s0.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            ((d0)this.s0.get(i8)).d();
        }
        this.s0.clear();
        // MONITOREXIT : arrayList
        Object object = this.o0;
        this.p0 = null;
        // MONITOREXIT : object
        this.i0(1, null);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void c(j object, Set<Scope> object2) {
        DeadObjectException deadObjectException2;
        block19: {
            Throwable var1_6;
            Throwable throwable2;
            block17: {
                Object object3 = this.A();
                String string = this.z0;
                int n8 = i.a;
                Scope[] scopeArray = f.p0;
                Object object4 = new Bundle();
                int n9 = this.x0;
                ax.J5.e[] eArray = f.q0;
                object4 = new f(6, n9, n8, null, null, scopeArray, (Bundle)object4, null, eArray, eArray, true, 0, false, string);
                object4.e0 = this.i0.getPackageName();
                object4.h0 = object3;
                if (object2 != null) {
                    object4.g0 = object2.toArray(new Scope[0]);
                }
                if (this.o()) {
                    object2 = object3 = this.u();
                    if (object3 == null) {
                        object2 = new Account("<<default account>>", "com.google");
                    }
                    object4.i0 = object2;
                    if (object != null) {
                        object4.f0 = object.asBinder();
                    }
                } else if (this.O()) {
                    object4.i0 = this.u();
                }
                object4.j0 = F0;
                object4.k0 = this.v();
                if (this.S()) {
                    object4.n0 = true;
                }
                object = this.o0;
                // MONITORENTER : object
                try {
                    object3 = this.p0;
                    if (object3 != null) {
                        object2 = new e0(this, this.D0.get());
                        object3.L1((k)object2, (f)object4);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block17;
                }
                Log.w((String)"GmsClient", (String)"mServiceBroker is null, client disconnected");
                // MONITOREXIT : object
                return;
            }
            // MONITOREXIT : object
            try {
                throw throwable2;
            }
            catch (RuntimeException runtimeException) {
            }
            catch (RemoteException remoteException) {
            }
            catch (SecurityException securityException) {
                throw securityException;
            }
            catch (DeadObjectException deadObjectException2) {
                break block19;
            }
            Log.w((String)"GmsClient", (String)"IGmsServiceBroker.getService failed", (Throwable)var1_6);
            this.N(8, null, null, this.D0.get());
            return;
        }
        Log.w((String)"GmsClient", (String)"IGmsServiceBroker.getService failed", (Throwable)deadObjectException2);
        this.Q(3);
    }

    public void e(String string) {
        this.g0 = string;
        this.b();
    }

    protected final void e0(int n8, Bundle object, int n9) {
        object = new h0(this, n8, null);
        object = this.m0.obtainMessage(7, n9, -1, object);
        this.m0.sendMessage((Message)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean f() {
        Object object = this.n0;
        synchronized (object) {
            boolean bl;
            int n8 = this.u0;
            boolean bl2 = bl = true;
            if (n8 == 2) return bl2;
            if (n8 != 3) return false;
            return bl;
        }
    }

    public String g() {
        t0 t02;
        if (this.a() && (t02 = this.h0) != null) {
            return t02.a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public void h(c c8) {
        p.m(c8, "Connection progress callbacks cannot be null.");
        this.q0 = c8;
        this.i0(2, null);
    }

    public void i(e e8) {
        e8.a();
    }

    public boolean j() {
        return true;
    }

    public int k() {
        return i.a;
    }

    public final ax.J5.e[] l() {
        i0 i02 = this.C0;
        if (i02 == null) {
            return null;
        }
        return i02.c0;
    }

    public String m() {
        return this.g0;
    }

    public boolean o() {
        return false;
    }

    public void q() {
        int n8 = this.l0.h(this.i0, this.k());
        if (n8 != 0) {
            this.i0(1, null);
            this.R(new d(this), n8, null);
            return;
        }
        this.h(new d(this));
    }

    protected final void r() {
        if (this.a()) {
            return;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }

    protected abstract T s(IBinder var1);

    protected boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public ax.J5.e[] v() {
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

    public static interface a {
        public void B(Bundle var1);

        public void w(int var1);
    }

    public static interface b {
        public void r(ax.J5.c var1);
    }

    public static interface c {
        public void c(ax.J5.c var1);
    }

    protected class d
    implements c {
        final c a;

        public d(c c8) {
            this.a = c8;
        }

        @Override
        public final void c(ax.J5.c object) {
            if (((ax.J5.c)object).C()) {
                object = this.a;
                ((c)object).c(null, ((c)object).C());
                return;
            }
            if (this.a.w0 != null) {
                this.a.w0.r((ax.J5.c)object);
            }
        }
    }

    public static interface e {
        public void a();
    }
}

