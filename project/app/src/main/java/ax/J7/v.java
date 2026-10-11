/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import ax.G7.g;
import ax.Q7.i;
import java.util.concurrent.atomic.AtomicBoolean;

class v
implements Thread.UncaughtExceptionHandler {
    private final a a;
    private final i b;
    private final Thread.UncaughtExceptionHandler c;
    private final ax.G7.a d;
    private final AtomicBoolean e;

    public v(a a8, i i8, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ax.G7.a a9) {
        this.a = a8;
        this.b = i8;
        this.c = uncaughtExceptionHandler;
        this.e = new AtomicBoolean(false);
        this.d = a9;
    }

    private boolean b(Thread thread, Throwable throwable) {
        if (thread == null) {
            g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (throwable == null) {
            g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (this.d.b()) {
            g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
        return true;
    }

    boolean a() {
        return this.e.get();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        Throwable throwable22;
        block6: {
            this.e.set(true);
            try {
                if (this.b(thread, throwable)) {
                    this.a.a(this.b, thread, throwable);
                } else {
                    g.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
                g.f().b("Completed exception processing. Invoking default exception handler.");
                this.c.uncaughtException(thread, throwable);
                this.e.set(false);
                return;
            }
            catch (Throwable throwable22) {
                break block6;
            }
            catch (Exception exception) {}
            g.f().e("An error occurred in the uncaught exception handler", exception);
            g.f().b("Completed exception processing. Invoking default exception handler.");
            this.c.uncaughtException(thread, throwable);
            this.e.set(false);
            return;
        }
        g.f().b("Completed exception processing. Invoking default exception handler.");
        this.c.uncaughtException(thread, throwable);
        this.e.set(false);
        throw throwable22;
    }

    static interface a {
        public void a(i var1, Thread var2, Throwable var3);
    }
}

