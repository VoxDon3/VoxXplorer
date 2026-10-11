package ax.N2;

import android.os.Handler;
import android.os.Looper;
import ax.L2.u;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d implements c {
    private final u a;
    final Handler b = new Handler(Looper.getMainLooper());
    private final Executor c = new a();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            d.this.b.post(runnable);
        }
    }

    public d(Executor executor) {
        this.a = new u(executor);
    }

    @Override // ax.N2.c
    public Executor a() {
        return this.c;
    }

    @Override // ax.N2.c
    public /* synthetic */ void c(Runnable runnable) {
        b.a(this, runnable);
    }

    @Override // ax.N2.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public u b() {
        return this.a;
    }
}
