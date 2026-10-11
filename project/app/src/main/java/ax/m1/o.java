/*
 * Decompiled with CFR 0.152.
 */
package ax.m1;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import ax.S0.N;
import ax.S0.a;
import ax.S0.d0;
import ax.S0.u;
import ax.m1.n;
import java.io.IOException;

public final class o {
    public static final c d = o.g(false, -9223372036854775807L);
    public static final c e = o.g(true, -9223372036854775807L);
    public static final c f = new c(2, -9223372036854775807L);
    public static final c g = new c(3, -9223372036854775807L);
    private final ax.n1.c a;
    private d<? extends e> b;
    private IOException c;

    public o(ax.n1.c c8) {
        this.a = c8;
    }

    public o(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ExoPlayer:Loader:");
        stringBuilder.append(string);
        this(ax.n1.b.a(d0.b1(stringBuilder.toString()), new n()));
    }

    static /* synthetic */ d b(o o8, d d8) {
        o8.b = d8;
        return d8;
    }

    static /* synthetic */ IOException c(o o8, IOException iOException) {
        o8.c = iOException;
        return iOException;
    }

    public static c g(boolean bl, long l8) {
        return new c(bl ? 1 : 0, l8);
    }

    public void e() {
        ax.S0.a.i(this.b).a(false);
    }

    public void f() {
        this.c = null;
    }

    public boolean h() {
        return this.c != null;
    }

    public boolean i() {
        return this.b != null;
    }

    public void j() throws IOException {
        this.k(Integer.MIN_VALUE);
    }

    public void k(int n8) throws IOException {
        d<? extends e> d8 = this.c;
        if (d8 == null) {
            d8 = this.b;
            if (d8 != null) {
                int n9 = n8;
                if (n8 == Integer.MIN_VALUE) {
                    n9 = d8.q;
                }
                d8.e(n9);
            }
            return;
        }
        throw d8;
    }

    public void l() {
        this.m(null);
    }

    public void m(f f8) {
        d<? extends e> d8 = this.b;
        if (d8 != null) {
            d8.a(true);
        }
        if (f8 != null) {
            this.a.execute(new g(f8));
        }
        this.a.d();
    }

    public <T extends e> long n(T t8, b<T> b8, int n8) {
        Looper looper = ax.S0.a.i(Looper.myLooper());
        this.c = null;
        long l8 = SystemClock.elapsedRealtime();
        new d(this, looper, t8, b8, n8, l8).f(0L);
        return l8;
    }

    public static interface b<T extends e> {
        public c j(T var1, long var2, long var4, IOException var6, int var7);

        public void k(T var1, long var2, long var4, int var6);

        public void p(T var1, long var2, long var4, boolean var6);

        public void r(T var1, long var2, long var4);
    }

    public static final class c {
        private final int a;
        private final long b;

        private c(int n8, long l8) {
            this.a = n8;
            this.b = l8;
        }

        public boolean c() {
            int n8 = this.a;
            return n8 == 0 || n8 == 1;
            {
            }
        }
    }

    @SuppressLint(value={"HandlerLeak"})
    private final class d<T extends e>
    extends Handler
    implements Runnable {
        private final T c0;
        private final long d0;
        private b<T> e0;
        private IOException f0;
        private int g0;
        private Thread h0;
        private boolean i0;
        private volatile boolean j0;
        final o k0;
        public final int q;

        /*
         * WARNING - Possible parameter corruption
         * WARNING - void declaration
         */
        public d(Looper looper, T t8, b<T> b8, int n8, long l9) {
            void var2_-1;
            this.k0 = (o)l8;
            super((Looper)var2_-1);
            this.c0 = looper;
            this.e0 = t8;
            this.q = (int)b8;
            this.d0 = n8;
        }

        private void b() {
            long l8 = SystemClock.elapsedRealtime();
            long l9 = this.d0;
            ax.S0.a.e(this.e0).k(this.c0, l8, l8 - l9, this.g0);
            this.f0 = null;
            this.k0.a.execute(ax.S0.a.e(this.k0.b));
        }

        private void c() {
            o.b(this.k0, null);
        }

        private long d() {
            return Math.min((this.g0 - 1) * 1000, 5000);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public void a(boolean bl) {
            this.j0 = bl;
            this.f0 = null;
            if (this.hasMessages(1)) {
                this.i0 = true;
                this.removeMessages(1);
                if (!bl) {
                    this.sendEmptyMessage(2);
                }
            } else {
                // MONITORENTER : this
                this.i0 = true;
                this.c0.c();
                Thread thread = this.h0;
                if (thread != null) {
                    thread.interrupt();
                }
            }
            if (!bl) return;
            this.c();
            long l8 = SystemClock.elapsedRealtime();
            ax.S0.a.e(this.e0).p(this.c0, l8, l8 - this.d0, true);
            this.e0 = null;
        }

        public void e(int n8) throws IOException {
            IOException iOException = this.f0;
            if (iOException != null && this.g0 > n8) {
                throw iOException;
            }
        }

        public void f(long l8) {
            boolean bl = this.k0.b == null;
            ax.S0.a.g(bl);
            o.b(this.k0, this);
            if (l8 > 0L) {
                this.sendEmptyMessageDelayed(1, l8);
                return;
            }
            this.b();
        }

        public void handleMessage(Message object) {
            block14: {
                block13: {
                    if (this.j0) break block13;
                    int n8 = object.what;
                    if (n8 == 1) {
                        this.b();
                        return;
                    }
                    if (n8 == 4) break block14;
                    this.c();
                    long l8 = SystemClock.elapsedRealtime();
                    long l9 = l8 - this.d0;
                    b<T> b8 = ax.S0.a.e(this.e0);
                    if (this.i0) {
                        b8.p(this.c0, l8, l9, false);
                        return;
                    }
                    n8 = object.what;
                    if (n8 != 2) {
                        if (n8 == 3) {
                            object = (IOException)object.obj;
                            this.f0 = object;
                            this.g0 = n8 = this.g0 + 1;
                            if (((c)(object = b8.j(this.c0, l8, l9, (IOException)object, n8))).a == 3) {
                                o.c(this.k0, this.f0);
                                return;
                            }
                            if (((c)object).a != 2) {
                                if (((c)object).a == 1) {
                                    this.g0 = 1;
                                }
                                l8 = ((c)object).b != -9223372036854775807L ? ((c)object).b : this.d();
                                this.f(l8);
                                return;
                            }
                        }
                    } else {
                        try {
                            b8.r(this.c0, l8, l9);
                            return;
                        }
                        catch (RuntimeException runtimeException) {
                            u.d("LoadTask", "Unexpected exception handling load completed", runtimeException);
                            o.c(this.k0, new h(runtimeException));
                        }
                    }
                }
                return;
            }
            throw (Error)object.obj;
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        @Override
        public void run() {
            IOException iOException22;
            block23: {
                Exception exception22;
                block22: {
                    OutOfMemoryError outOfMemoryError22;
                    block21: {
                        boolean bl = this.i0;
                        this.h0 = Thread.currentThread();
                        // MONITOREXIT : this
                        if (!bl) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("load:");
                            stringBuilder.append(this.c0.getClass().getSimpleName());
                            N.a(stringBuilder.toString());
                            this.c0.a();
                            {
                                catch (Throwable throwable) {
                                    N.b();
                                    throw throwable;
                                }
                            }
                            N.b();
                            // MONITORENTER : this
                        }
                        this.h0 = null;
                        Thread.interrupted();
                        // MONITOREXIT : this
                        try {
                            if (this.j0) return;
                            this.sendEmptyMessage(2);
                            return;
                        }
                        catch (Error error) {
                        }
                        catch (OutOfMemoryError outOfMemoryError22) {
                            break block21;
                        }
                        catch (Exception exception22) {
                            break block22;
                        }
                        catch (IOException iOException22) {
                            break block23;
                        }
                        if (this.j0) throw error;
                        u.d("LoadTask", "Unexpected error loading stream", error);
                        this.obtainMessage(4, error).sendToTarget();
                        throw error;
                    }
                    if (this.j0) return;
                    u.d("LoadTask", "OutOfMemory error loading stream", outOfMemoryError22);
                    this.obtainMessage(3, new h(outOfMemoryError22)).sendToTarget();
                    return;
                }
                if (this.j0) return;
                u.d("LoadTask", "Unexpected exception loading stream", exception22);
                this.obtainMessage(3, new h(exception22)).sendToTarget();
                return;
            }
            if (this.j0) return;
            this.obtainMessage(3, iOException22).sendToTarget();
        }
    }

    public static interface e {
        public void a() throws IOException;

        public void c();
    }

    public static interface f {
        public void f();
    }

    private static final class g
    implements Runnable {
        private final f q;

        public g(f f8) {
            this.q = f8;
        }

        @Override
        public void run() {
            this.q.f();
        }
    }

    public static final class h
    extends IOException {
        public h(Throwable throwable) {
            CharSequence charSequence;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected ");
            stringBuilder.append(throwable.getClass().getSimpleName());
            if (throwable.getMessage() != null) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(": ");
                ((StringBuilder)charSequence).append(throwable.getMessage());
                charSequence = ((StringBuilder)charSequence).toString();
            } else {
                charSequence = "";
            }
            stringBuilder.append((String)charSequence);
            super(stringBuilder.toString(), throwable);
        }
    }
}

