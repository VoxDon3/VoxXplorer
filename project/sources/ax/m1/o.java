package ax.m1;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.InterfaceC0979l;
import ax.S0.N;
import ax.S0.d0;
import ax.n1.C2571b;
import ax.n1.InterfaceExecutorC2572c;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class o {
    public static final c d = g(false, -9223372036854775807L);
    public static final c e = g(true, -9223372036854775807L);
    public static final c f;
    public static final c g;
    private final InterfaceExecutorC2572c a;
    private d<? extends e> b;
    private IOException c;

    public interface b<T extends e> {
        c j(T t, long j, long j2, IOException iOException, int i);

        void k(T t, long j, long j2, int i);

        void p(T t, long j, long j2, boolean z);

        void r(T t, long j, long j2);
    }

    public static final class c {
        private final int a;
        private final long b;

        public boolean c() {
            int i = this.a;
            return i == 0 || i == 1;
        }

        private c(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private final class d<T extends e> extends Handler implements Runnable {
        private final T c0;
        private final long d0;
        private b<T> e0;
        private IOException f0;
        private int g0;
        private Thread h0;
        private boolean i0;
        private volatile boolean j0;
        public final int q;

        public d(Looper looper, T t, b<T> bVar, int i, long j) {
            super(looper);
            this.c0 = t;
            this.e0 = bVar;
            this.q = i;
            this.d0 = j;
        }

        private void b() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ((b) C0968a.e(this.e0)).k(this.c0, elapsedRealtime, elapsedRealtime - this.d0, this.g0);
            this.f0 = null;
            o.this.a.execute((Runnable) C0968a.e(o.this.b));
        }

        private void c() {
            o.this.b = null;
        }

        private long d() {
            return Math.min((this.g0 - 1) * 1000, 5000);
        }

        public void a(boolean z) {
            this.j0 = z;
            this.f0 = null;
            if (hasMessages(1)) {
                this.i0 = true;
                removeMessages(1);
                if (!z) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.i0 = true;
                        this.c0.c();
                        Thread thread = this.h0;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) C0968a.e(this.e0)).p(this.c0, elapsedRealtime, elapsedRealtime - this.d0, true);
                this.e0 = null;
            }
        }

        public void e(int i) throws IOException {
            IOException iOException = this.f0;
            if (iOException != null && this.g0 > i) {
                throw iOException;
            }
        }

        public void f(long j) {
            C0968a.g(o.this.b == null);
            o.this.b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(1, j);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.j0) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                b();
                return;
            }
            if (i == 4) {
                throw ((Error) message.obj);
            }
            c();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.d0;
            b bVar = (b) C0968a.e(this.e0);
            if (this.i0) {
                bVar.p(this.c0, elapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 2) {
                try {
                    bVar.r(this.c0, elapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    C0987u.d("LoadTask", "Unexpected exception handling load completed", e);
                    o.this.c = new h(e);
                    return;
                }
            }
            if (i2 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f0 = iOException;
            int i3 = this.g0 + 1;
            this.g0 = i3;
            c j2 = bVar.j(this.c0, elapsedRealtime, j, iOException, i3);
            if (j2.a == 3) {
                o.this.c = this.f0;
            } else if (j2.a != 2) {
                if (j2.a == 1) {
                    this.g0 = 1;
                }
                f(j2.b != -9223372036854775807L ? j2.b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.i0;
                    this.h0 = Thread.currentThread();
                }
                if (!z) {
                    N.a("load:" + this.c0.getClass().getSimpleName());
                    try {
                        this.c0.a();
                        N.b();
                    } catch (Throwable th) {
                        N.b();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.h0 = null;
                    Thread.interrupted();
                }
                if (this.j0) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.j0) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (Error e2) {
                if (!this.j0) {
                    C0987u.d("LoadTask", "Unexpected error loading stream", e2);
                    obtainMessage(4, e2).sendToTarget();
                }
                throw e2;
            } catch (Exception e3) {
                if (this.j0) {
                    return;
                }
                C0987u.d("LoadTask", "Unexpected exception loading stream", e3);
                obtainMessage(3, new h(e3)).sendToTarget();
            } catch (OutOfMemoryError e4) {
                if (this.j0) {
                    return;
                }
                C0987u.d("LoadTask", "OutOfMemory error loading stream", e4);
                obtainMessage(3, new h(e4)).sendToTarget();
            }
        }
    }

    public interface e {
        void a() throws IOException;

        void c();
    }

    public interface f {
        void f();
    }

    private static final class g implements Runnable {
        private final f q;

        public g(f fVar) {
            this.q = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.f();
        }
    }

    public static final class h extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public h(java.lang.Throwable r4) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unexpected "
                r0.append(r1)
                java.lang.Class r1 = r4.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = r4.getMessage()
                if (r1 == 0) goto L31
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ": "
                r1.append(r2)
                java.lang.String r2 = r4.getMessage()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                goto L33
            L31:
                java.lang.String r1 = ""
            L33:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.m1.o.h.<init>(java.lang.Throwable):void");
        }
    }

    static {
        long j = -9223372036854775807L;
        f = new c(2, j);
        g = new c(3, j);
    }

    public o(String str) {
        this(C2571b.a(d0.b1("ExoPlayer:Loader:" + str), new InterfaceC0979l() { // from class: ax.m1.n
            @Override // ax.S0.InterfaceC0979l
            public final void accept(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    public static c g(boolean z, long j) {
        return new c(z ? 1 : 0, j);
    }

    public void e() {
        ((d) C0968a.i(this.b)).a(false);
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
        k(Integer.MIN_VALUE);
    }

    public void k(int i) throws IOException {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.b;
        if (dVar != null) {
            if (i == Integer.MIN_VALUE) {
                i = dVar.q;
            }
            dVar.e(i);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.a.execute(new g(fVar));
        }
        this.a.d();
    }

    public <T extends e> long n(T t, b<T> bVar, int i) {
        Looper looper = (Looper) C0968a.i(Looper.myLooper());
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t, bVar, i, elapsedRealtime).f(0L);
        return elapsedRealtime;
    }

    public o(InterfaceExecutorC2572c interfaceExecutorC2572c) {
        this.a = interfaceExecutorC2572c;
    }
}
