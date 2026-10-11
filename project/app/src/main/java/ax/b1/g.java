/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import ax.P0.i;
import ax.P0.o;
import ax.S0.d0;
import ax.S0.l;
import ax.S0.m;
import ax.S0.u;
import ax.Z0.I1;
import ax.b1.A;
import ax.b1.E;
import ax.b1.Q;
import ax.b1.S;
import ax.b1.T;
import ax.b1.V;
import ax.b1.n;
import ax.b1.u;
import ax.i1.B;
import ax.i1.y;
import ax.m1.m;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

class g
implements n {
    public final List<o.b> a;
    private final E b;
    private final a c;
    private final b d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final HashMap<String, String> h;
    private final m<u.a> i;
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
    private n.a u;
    private byte[] v;
    private byte[] w;
    private E.a x;
    private E.d y;

    public g(UUID uUID, E e8, a a8, b b8, List<o.b> list, int n8, boolean bl, boolean bl2, byte[] byArray, HashMap<String, String> hashMap, S s8, Looper looper, ax.m1.m m8, I1 i12) {
        if (n8 == 1 || n8 == 3) {
            ax.S0.a.e(byArray);
        }
        this.m = uUID;
        this.c = a8;
        this.d = b8;
        this.b = e8;
        this.e = n8;
        this.f = bl;
        this.g = bl2;
        if (byArray != null) {
            this.w = byArray;
            this.a = null;
        } else {
            this.a = java.util.DesugarCollections.unmodifiableList(ax.S0.a.e(list));
        }
        this.h = hashMap;
        this.l = s8;
        this.i = new m();
        this.j = m8;
        this.k = i12;
        this.p = 2;
        this.n = looper;
        this.o = new e(this, looper);
    }

    private void C(Object object, Object object2) {
        if (object == this.y && (this.p == 2 || this.u())) {
            this.y = null;
            if (object2 instanceof Exception) {
                this.c.a((Exception)object2, false);
                return;
            }
            try {
                this.b.l((byte[])object2);
                this.c.c();
                return;
            }
            catch (Exception exception) {
                this.c.a(exception, true);
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean D() {
        Throwable var1_4;
        if (this.u()) {
            return true;
        }
        try {
            Object object = this.b.e();
            this.v = object;
            this.b.i((byte[])object, this.k);
            this.t = this.b.c(this.v);
            this.p = 3;
            object = new ax.b1.b;
            object(3);
            this.q((l<u.a>)object);
            ax.S0.a.e(this.v);
            return true;
        }
        catch (NoSuchMethodError noSuchMethodError) {
        }
        catch (Exception exception) {
            // empty catch block
        }
        catch (NotProvisionedException notProvisionedException) {
            this.c.b(this);
            return false;
        }
        if (A.d((Throwable)var1_4)) {
            this.c.b(this);
            return false;
        }
        this.v((Throwable)var1_4, 1);
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private void E(byte[] byArray, int n8, boolean bl) {
        Throwable var1_4;
        try {
            this.x = this.b.m(byArray, this.a, n8, this.h);
            d0.i(this.s).b(2, ax.S0.a.e(this.x), bl);
            return;
        }
        catch (NoSuchMethodError noSuchMethodError) {
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.x((Throwable)var1_4, true);
    }

    /*
     * WARNING - void declaration
     */
    private boolean G() {
        Throwable var1_3;
        try {
            this.b.g(this.v, this.w);
            return true;
        }
        catch (NoSuchMethodError noSuchMethodError) {
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.v((Throwable)var1_3, 1);
        return false;
    }

    private void H() {
        if (Thread.currentThread() != this.n.getThread()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append("\nExpected thread: ");
            stringBuilder.append(this.n.getThread().getName());
            ax.S0.u.i("DefaultDrmSession", stringBuilder.toString(), new IllegalStateException());
        }
    }

    public static /* synthetic */ void i(Throwable throwable, u.a a8) {
        a8.l((Exception)throwable);
    }

    public static /* synthetic */ void j(int n8, u.a a8) {
        a8.k(n8);
    }

    private void q(l<u.a> l8) {
        Iterator<u.a> iterator = this.i.H().iterator();
        while (iterator.hasNext()) {
            l8.accept(iterator.next());
        }
    }

    private void r(boolean bl) {
        byte[] byArray;
        block13: {
            block11: {
                block12: {
                    if (this.g) break block11;
                    byArray = d0.i(this.v);
                    int n8 = this.e;
                    if (n8 == 0 || n8 == 1) break block12;
                    if (n8 != 2) {
                        if (n8 == 3) {
                            ax.S0.a.e(this.w);
                            ax.S0.a.e(this.v);
                            this.E(this.w, 3, bl);
                            return;
                        }
                    } else if (this.w == null || this.G()) {
                        this.E(byArray, 2, bl);
                        return;
                    }
                    break block11;
                }
                if (this.w == null) {
                    this.E(byArray, 1, bl);
                    return;
                }
                if (this.p == 4 || this.G()) break block13;
            }
            return;
        }
        long l8 = this.s();
        if (this.e == 0 && l8 <= 60L) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Offline license has expired or will expire soon. Remaining seconds: ");
            stringBuilder.append(l8);
            ax.S0.u.b("DefaultDrmSession", stringBuilder.toString());
            this.E(byArray, 2, bl);
            return;
        }
        if (l8 <= 0L) {
            this.v(new Q(), 2);
            return;
        }
        this.p = 4;
        this.q(new ax.b1.f());
    }

    private long s() {
        if (!ax.P0.i.d.equals(this.m)) {
            return Long.MAX_VALUE;
        }
        Pair<Long, Long> pair = ax.S0.a.e(V.b(this));
        return Math.min((Long)pair.first, (Long)pair.second);
    }

    private boolean u() {
        int n8 = this.p;
        return n8 == 3 || n8 == 4;
        {
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void v(Throwable throwable, int n8) {
        this.u = new n.a(throwable, A.b(throwable, n8));
        ax.S0.u.d("DefaultDrmSession", "DRM session error", throwable);
        if (throwable instanceof Exception) {
            this.q(new ax.b1.e(throwable));
        } else {
            if (!(throwable instanceof Error)) throw new IllegalStateException("Unexpected Throwable subclass", throwable);
            if (!A.e(throwable) && !A.d(throwable)) {
                throw (Error)throwable;
            }
        }
        if (this.p == 4) return;
        this.p = 1;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void w(Object object, Object object2) {
        if (object != this.x) return;
        if (!this.u()) {
            return;
        }
        this.x = null;
        if (!(object2 instanceof Exception) && !(object2 instanceof NoSuchMethodError)) {
            Throwable var1_4;
            block7: {
                try {
                    object = (byte[])object2;
                    if (this.e == 3) {
                        this.b.j(d0.i(this.w), (byte[])object);
                        object = new ax.b1.c();
                        this.q((l<u.a>)object);
                        return;
                    }
                }
                catch (NoSuchMethodError noSuchMethodError) {
                    break block7;
                }
                catch (Exception exception) {
                    break block7;
                }
                object = this.b.j(this.v, (byte[])object);
                int n8 = this.e;
                if ((n8 == 2 || n8 == 0 && this.w != null) && object != null && ((Object)object).length != 0) {
                    this.w = (byte[])object;
                }
                this.p = 4;
                object = new ax.b1.d();
                this.q((l<u.a>)object);
                return;
            }
            this.x((Throwable)var1_4, true);
            return;
        }
        this.x((Throwable)object2, false);
    }

    private void x(Throwable throwable, boolean bl) {
        if (!(throwable instanceof NotProvisionedException) && !A.d(throwable)) {
            int n8 = bl ? 1 : 2;
            this.v(throwable, n8);
            return;
        }
        this.c.b(this);
    }

    private void y() {
        if (this.e == 0 && this.p == 4) {
            d0.i(this.v);
            this.r(false);
        }
    }

    void A() {
        if (this.D()) {
            this.r(true);
        }
    }

    void B(Exception exception, boolean bl) {
        int n8 = bl ? 1 : 3;
        this.v(exception, n8);
    }

    void F() {
        this.y = this.b.b();
        d0.i(this.s).b(1, ax.S0.a.e(this.y), true);
    }

    @Override
    public void a(u.a a8) {
        this.H();
        int n8 = this.q;
        if (n8 <= 0) {
            ax.S0.u.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        this.q = --n8;
        if (n8 == 0) {
            this.p = 0;
            d0.i(this.o).removeCallbacksAndMessages(null);
            d0.i(this.s).c();
            this.s = null;
            d0.i(this.r).quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            this.y = null;
            byte[] byArray = this.v;
            if (byArray != null) {
                this.b.h(byArray);
                this.v = null;
            }
        }
        if (a8 != null) {
            this.i.h(a8);
            if (this.i.g(a8) == 0) {
                a8.m();
            }
        }
        this.d.b(this, this.q);
    }

    @Override
    public final UUID b() {
        this.H();
        return this.m;
    }

    @Override
    public void c(u.a a8) {
        this.H();
        int n8 = this.q;
        boolean bl = false;
        if (n8 < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Session reference count less than zero: ");
            stringBuilder.append(this.q);
            ax.S0.u.c("DefaultDrmSession", stringBuilder.toString());
            this.q = 0;
        }
        if (a8 != null) {
            this.i.e(a8);
        }
        this.q = n8 = this.q + 1;
        if (n8 == 1) {
            if (this.p == 2) {
                bl = true;
            }
            ax.S0.a.g(bl);
            a8 = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = a8;
            ((Thread)((Object)a8)).start();
            this.s = new c(this, this.r.getLooper());
            if (this.D()) {
                this.r(true);
            }
        } else if (a8 != null && this.u() && this.i.g(a8) == 1) {
            a8.k(this.p);
        }
        this.d.a(this, this.q);
    }

    @Override
    public boolean d() {
        this.H();
        return this.f;
    }

    @Override
    public Map<String, String> e() {
        this.H();
        byte[] byArray = this.v;
        if (byArray == null) {
            return null;
        }
        return this.b.a(byArray);
    }

    @Override
    public boolean f(String string) {
        this.H();
        return this.b.f(ax.S0.a.i(this.v), string);
    }

    @Override
    public final n.a g() {
        this.H();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override
    public final int getState() {
        this.H();
        return this.p;
    }

    @Override
    public final ax.V0.b h() {
        this.H();
        return this.t;
    }

    public boolean t(byte[] byArray) {
        this.H();
        return Arrays.equals(this.v, byArray);
    }

    void z(int n8) {
        if (n8 != 2) {
            return;
        }
        this.y();
    }

    public static interface a {
        public void a(Exception var1, boolean var2);

        public void b(g var1);

        public void c();
    }

    public static interface b {
        public void a(g var1, int var2);

        public void b(g var1, int var2);
    }

    @SuppressLint(value={"HandlerLeak"})
    private class c
    extends Handler {
        private boolean a;
        final g b;

        public c(g g8, Looper looper) {
            this.b = g8;
            super(looper);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private boolean a(Message message, T iOException) {
            int n8;
            d d8 = (d)message.obj;
            if (!d8.b) {
                return false;
            }
            d8.e = n8 = d8.e + 1;
            if (n8 > this.b.j.c(3)) {
                return false;
            }
            y y8 = new y(d8.a, iOException.q, iOException.c0, iOException.d0, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - d8.c, iOException.e0);
            B b8 = new B(3);
            iOException = iOException.getCause() instanceof IOException ? (IOException)iOException.getCause() : new f(iOException.getCause());
            long l8 = this.b.j.b(new m.c(y8, b8, iOException, d8.e));
            if (l8 == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                Throwable throwable2;
                block7: {
                    try {
                        if (!this.a) {
                            this.sendMessageDelayed(Message.obtain((Message)message), l8);
                            return true;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    return false;
                }
                throw throwable2;
            }
        }

        void b(int n8, Object object, boolean bl) {
            this.obtainMessage(n8, new d(ax.i1.y.a(), bl, SystemClock.elapsedRealtime(), object)).sendToTarget();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void c() {
            synchronized (this) {
                this.removeCallbacksAndMessages(null);
                this.a = true;
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void handleMessage(Message message) {
            Object object;
            d d8;
            block9: {
                T t82;
                block11: {
                    Exception exception2;
                    block10: {
                        block8: {
                            d8 = (d)message.obj;
                            try {
                                int n8 = message.what;
                                if (n8 == 1) break block8;
                                if (n8 != 2) {
                                    RuntimeException runtimeException = new RuntimeException();
                                    throw runtimeException;
                                }
                                object = this.b.l.b(this.b.m, (E.a)d8.d);
                                break block9;
                            }
                            catch (Exception exception2) {
                                break block10;
                            }
                            catch (T t82) {
                                break block11;
                            }
                        }
                        object = this.b.l.a(this.b.m, (E.d)d8.d);
                        break block9;
                    }
                    ax.S0.u.i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", exception2);
                    break block9;
                }
                object = t82;
                if (this.a(message, t82)) {
                    return;
                }
            }
            this.b.j.a(d8.a);
            synchronized (this) {
                try {
                    if (this.a) return;
                    this.b.o.obtainMessage(message.what, Pair.create((Object)d8.d, (Object)object)).sendToTarget();
                    return;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }
    }

    private static final class d {
        public final long a;
        public final boolean b;
        public final long c;
        public final Object d;
        public int e;

        public d(long l8, boolean bl, long l9, Object object) {
            this.a = l8;
            this.b = bl;
            this.c = l9;
            this.d = object;
        }
    }

    @SuppressLint(value={"HandlerLeak"})
    private class e
    extends Handler {
        final g a;

        public e(g g8, Looper looper) {
            this.a = g8;
            super(looper);
        }

        public void handleMessage(Message message) {
            Object object = (Pair)message.obj;
            Object object2 = object.first;
            object = object.second;
            int n8 = message.what;
            if (n8 != 1) {
                if (n8 != 2) {
                    return;
                }
                this.a.w(object2, object);
                return;
            }
            this.a.C(object2, object);
        }
    }

    public static final class f
    extends IOException {
        public f(Throwable throwable) {
            super(throwable);
        }
    }
}

