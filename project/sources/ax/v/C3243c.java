package ax.v;

import java.util.concurrent.Executor;

/* renamed from: ax.v.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3243c extends e {
    private static volatile C3243c c;
    private static final Executor d = new Executor() { // from class: ax.v.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C3243c.g().c(runnable);
        }
    };
    private static final Executor e = new Executor() { // from class: ax.v.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C3243c.g().a(runnable);
        }
    };
    private e a;
    private final e b;

    private C3243c() {
        d dVar = new d();
        this.b = dVar;
        this.a = dVar;
    }

    public static Executor f() {
        return e;
    }

    public static C3243c g() {
        if (c != null) {
            return c;
        }
        synchronized (C3243c.class) {
            try {
                if (c == null) {
                    c = new C3243c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    @Override // ax.v.e
    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    @Override // ax.v.e
    public boolean b() {
        return this.a.b();
    }

    @Override // ax.v.e
    public void c(Runnable runnable) {
        this.a.c(runnable);
    }
}
