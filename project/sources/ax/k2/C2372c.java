package ax.k2;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: ax.k2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2372c {
    public static final a m = new a(null);
    public ax.o2.h a;
    private final Handler b;
    private Runnable c;
    private final Object d;
    private long e;
    private final Executor f;
    private int g;
    private long h;
    private ax.o2.g i;
    private boolean j;
    private final Runnable k;
    private final Runnable l;

    /* renamed from: ax.k2.c$a */
    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    public C2372c(long j, TimeUnit timeUnit, Executor executor) {
        ax.Gb.l.f(timeUnit, "autoCloseTimeUnit");
        ax.Gb.l.f(executor, "autoCloseExecutor");
        this.b = new Handler(Looper.getMainLooper());
        this.d = new Object();
        this.e = timeUnit.toMillis(j);
        this.f = executor;
        this.h = SystemClock.uptimeMillis();
        this.k = new Runnable() { // from class: ax.k2.a
            @Override // java.lang.Runnable
            public final void run() {
                C2372c.f(C2372c.this);
            }
        };
        this.l = new Runnable() { // from class: ax.k2.b
            @Override // java.lang.Runnable
            public final void run() {
                C2372c.c(C2372c.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C2372c c2372c) {
        ax.sb.t tVar;
        ax.Gb.l.f(c2372c, "this$0");
        synchronized (c2372c.d) {
            try {
                if (SystemClock.uptimeMillis() - c2372c.h < c2372c.e) {
                    return;
                }
                if (c2372c.g != 0) {
                    return;
                }
                Runnable runnable = c2372c.c;
                if (runnable != null) {
                    runnable.run();
                    tVar = ax.sb.t.a;
                } else {
                    tVar = null;
                }
                if (tVar == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                ax.o2.g gVar = c2372c.i;
                if (gVar != null && gVar.isOpen()) {
                    gVar.close();
                }
                c2372c.i = null;
                ax.sb.t tVar2 = ax.sb.t.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C2372c c2372c) {
        ax.Gb.l.f(c2372c, "this$0");
        c2372c.f.execute(c2372c.l);
    }

    public final void d() throws IOException {
        synchronized (this.d) {
            try {
                this.j = true;
                ax.o2.g gVar = this.i;
                if (gVar != null) {
                    gVar.close();
                }
                this.i = null;
                ax.sb.t tVar = ax.sb.t.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.d) {
            try {
                int i = this.g;
                if (i <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i2 = i - 1;
                this.g = i2;
                if (i2 == 0) {
                    if (this.i == null) {
                        return;
                    } else {
                        this.b.postDelayed(this.k, this.e);
                    }
                }
                ax.sb.t tVar = ax.sb.t.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <V> V g(ax.Fb.l<? super ax.o2.g, ? extends V> lVar) {
        ax.Gb.l.f(lVar, "block");
        try {
            return lVar.invoke(j());
        } finally {
            e();
        }
    }

    public final ax.o2.g h() {
        return this.i;
    }

    public final ax.o2.h i() {
        ax.o2.h hVar = this.a;
        if (hVar != null) {
            return hVar;
        }
        ax.Gb.l.t("delegateOpenHelper");
        return null;
    }

    public final ax.o2.g j() {
        synchronized (this.d) {
            this.b.removeCallbacks(this.k);
            this.g++;
            if (this.j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            ax.o2.g gVar = this.i;
            if (gVar != null && gVar.isOpen()) {
                return gVar;
            }
            ax.o2.g g0 = i().g0();
            this.i = g0;
            return g0;
        }
    }

    public final void k(ax.o2.h hVar) {
        ax.Gb.l.f(hVar, "delegateOpenHelper");
        n(hVar);
    }

    public final boolean l() {
        return !this.j;
    }

    public final void m(Runnable runnable) {
        ax.Gb.l.f(runnable, "onAutoClose");
        this.c = runnable;
    }

    public final void n(ax.o2.h hVar) {
        ax.Gb.l.f(hVar, "<set-?>");
        this.a = hVar;
    }
}
