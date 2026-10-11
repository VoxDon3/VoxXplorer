package ax.u3;

import android.os.AsyncTask;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: ax.u3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ExecutorC3201s implements Executor {
    static Method d0;
    Runnable c0;
    final ArrayDeque<Runnable> q = new ArrayDeque<>();

    /* renamed from: ax.u3.s$a */
    class a implements Runnable {
        final /* synthetic */ Runnable q;

        a(Runnable runnable) {
            this.q = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.q.run();
            } catch (RuntimeException e) {
                ax.Ha.c.h().f().b("AsyncTask RuntimeException!!!!").l(e).h();
            } finally {
                ExecutorC3201s.this.b();
            }
        }
    }

    public static void a() {
        try {
            if (d0 == null) {
                try {
                    d0 = AsyncTask.class.getMethod("setDefaultExecutor", Executor.class);
                } catch (Exception unused) {
                    C3184b.e("API is not available on api level " + Build.VERSION.SDK_INT);
                }
            }
            ExecutorC3201s executorC3201s = new ExecutorC3201s();
            Method method = d0;
            if (method != null) {
                try {
                    method.invoke(null, executorC3201s);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {
                Field declaredField = AsyncTask.class.getDeclaredField("SERIAL_EXECUTOR");
                declaredField.setAccessible(true);
                declaredField.set(null, executorC3201s);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } catch (Exception unused2) {
        }
    }

    protected synchronized void b() {
        Runnable poll = this.q.poll();
        this.c0 = poll;
        if (poll != null) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.q.offer(new a(runnable));
        if (this.c0 == null) {
            b();
        }
    }
}
