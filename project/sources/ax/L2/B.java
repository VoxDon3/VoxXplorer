package ax.L2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public class B implements Runnable {
    static final String h0 = ax.B2.i.i("WorkForegroundRunnable");
    final Context c0;
    final ax.K2.v d0;
    final androidx.work.c e0;
    final ax.B2.f f0;
    final ax.N2.c g0;
    final ax.M2.c<Void> q = ax.M2.c.t();

    class a implements Runnable {
        final /* synthetic */ ax.M2.c q;

        a(ax.M2.c cVar) {
            this.q = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            if (B.this.q.isCancelled()) {
                return;
            }
            try {
                ax.B2.e eVar = (ax.B2.e) this.q.get();
                if (eVar == null) {
                    throw new IllegalStateException("Worker was marked important (" + B.this.d0.c + ") but did not provide ForegroundInfo");
                }
                ax.B2.i.e().a(B.h0, "Updating notification for " + B.this.d0.c);
                B b = B.this;
                b.q.r(b.f0.a(b.c0, b.e0.e(), eVar));
            } catch (Throwable th) {
                B.this.q.q(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public B(Context context, ax.K2.v vVar, androidx.work.c cVar, ax.B2.f fVar, ax.N2.c cVar2) {
        this.c0 = context;
        this.d0 = vVar;
        this.e0 = cVar;
        this.f0 = fVar;
        this.g0 = cVar2;
    }

    public static /* synthetic */ void a(B b, ax.M2.c cVar) {
        if (b.q.isCancelled()) {
            cVar.cancel(true);
        } else {
            cVar.r(b.e0.d());
        }
    }

    public ax.v7.e<Void> b() {
        return this.q;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (!this.d0.q || Build.VERSION.SDK_INT >= 31) {
            this.q.p(null);
            return;
        }
        final ax.M2.c t = ax.M2.c.t();
        this.g0.a().execute(new Runnable() { // from class: ax.L2.A
            @Override // java.lang.Runnable
            public final void run() {
                B.a(B.this, t);
            }
        });
        t.h(new a(t), this.g0.a());
    }
}
