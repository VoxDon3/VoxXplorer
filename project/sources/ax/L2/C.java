package ax.L2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes.dex */
public class C implements ax.B2.f {
    private static final String d = ax.B2.i.i("WMFgUpdater");
    private final ax.N2.c a;
    final ax.J2.a b;
    final ax.K2.w c;

    class a implements Runnable {
        final /* synthetic */ UUID c0;
        final /* synthetic */ ax.B2.e d0;
        final /* synthetic */ Context e0;
        final /* synthetic */ ax.M2.c q;

        a(ax.M2.c cVar, UUID uuid, ax.B2.e eVar, Context context) {
            this.q = cVar;
            this.c0 = uuid;
            this.d0 = eVar;
            this.e0 = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.q.isCancelled()) {
                    String uuid = this.c0.toString();
                    ax.K2.v n = C.this.c.n(uuid);
                    if (n == null || n.b.h()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C.this.b.c(uuid, this.d0);
                    this.e0.startService(androidx.work.impl.foreground.a.c(this.e0, ax.K2.y.a(n), this.d0));
                }
                this.q.p(null);
            } catch (Throwable th) {
                this.q.q(th);
            }
        }
    }

    public C(WorkDatabase workDatabase, ax.J2.a aVar, ax.N2.c cVar) {
        this.b = aVar;
        this.a = cVar;
        this.c = workDatabase.I();
    }

    @Override // ax.B2.f
    public ax.v7.e<Void> a(Context context, UUID uuid, ax.B2.e eVar) {
        ax.M2.c t = ax.M2.c.t();
        this.a.c(new a(t, uuid, eVar, context));
        return t;
    }
}
