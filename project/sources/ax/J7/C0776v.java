package ax.J7;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ax.J7.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C0776v implements Thread.UncaughtExceptionHandler {
    private final a a;
    private final ax.Q7.i b;
    private final Thread.UncaughtExceptionHandler c;
    private final ax.G7.a d;
    private final AtomicBoolean e = new AtomicBoolean(false);

    /* renamed from: ax.J7.v$a */
    interface a {
        void a(ax.Q7.i iVar, Thread thread, Throwable th);
    }

    public C0776v(a aVar, ax.Q7.i iVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ax.G7.a aVar2) {
        this.a = aVar;
        this.b = iVar;
        this.c = uncaughtExceptionHandler;
        this.d = aVar2;
    }

    private boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            ax.G7.g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            ax.G7.g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.d.b()) {
            return true;
        }
        ax.G7.g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean a() {
        return this.e.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.a.a(this.b, thread, th);
                } else {
                    ax.G7.g.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
                ax.G7.g.f().b("Completed exception processing. Invoking default exception handler.");
                this.c.uncaughtException(thread, th);
                this.e.set(false);
            } catch (Exception e) {
                ax.G7.g.f().e("An error occurred in the uncaught exception handler", e);
                ax.G7.g.f().b("Completed exception processing. Invoking default exception handler.");
                this.c.uncaughtException(thread, th);
                this.e.set(false);
            }
        } catch (Throwable th2) {
            ax.G7.g.f().b("Completed exception processing. Invoking default exception handler.");
            this.c.uncaughtException(thread, th);
            this.e.set(false);
            throw th2;
        }
    }
}
