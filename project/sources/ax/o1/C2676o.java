package ax.o1;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import ax.S0.C0968a;
import ax.S0.C0983p;
import ax.S0.C0987u;
import ax.S0.RunnableC0981n;

/* renamed from: ax.o1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2676o extends Surface {
    private static int e0;
    private static boolean f0;
    private final b c0;
    private boolean d0;
    public final boolean q;

    /* renamed from: ax.o1.o$b */
    private static class b extends HandlerThread implements Handler.Callback {
        private Handler c0;
        private Error d0;
        private RuntimeException e0;
        private C2676o f0;
        private RunnableC0981n q;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i) throws C0983p.a {
            C0968a.e(this.q);
            this.q.h(i);
            this.f0 = new C2676o(this, this.q.g(), i != 0);
        }

        private void d() {
            C0968a.e(this.q);
            this.q.i();
        }

        public C2676o a(int i) {
            boolean z;
            start();
            this.c0 = new Handler(getLooper(), this);
            this.q = new RunnableC0981n(this.c0);
            synchronized (this) {
                z = false;
                this.c0.obtainMessage(1, i, 0).sendToTarget();
                while (this.f0 == null && this.e0 == null && this.d0 == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.e0;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.d0;
            if (error == null) {
                return (C2676o) C0968a.e(this.f0);
            }
            throw error;
        }

        public void c() {
            C0968a.e(this.c0);
            this.c0.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (C0983p.a e) {
                    C0987u.d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.e0 = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    C0987u.d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.d0 = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    C0987u.d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.e0 = e3;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    private static int a(Context context) {
        try {
            if (C0983p.m(context)) {
                return C0983p.n() ? 1 : 2;
            }
            return 0;
        } catch (C0983p.a e) {
            C0987u.c("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (C2676o.class) {
            try {
                if (!f0) {
                    e0 = a(context);
                    f0 = true;
                }
                z = e0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public static C2676o c(Context context, boolean z) {
        C0968a.g(!z || b(context));
        return new b().a(z ? e0 : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.c0) {
            try {
                if (!this.d0) {
                    this.c0.c();
                    this.d0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private C2676o(b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.c0 = bVar;
        this.q = z;
    }
}
