package ax.C2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import ax.B2.i;
import ax.L2.AbstractRunnableC0785b;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public class D extends ax.B2.s {
    private static final String k = ax.B2.i.i("WorkManagerImpl");
    private static D l = null;
    private static D m = null;
    private static final Object n = new Object();
    private Context a;
    private androidx.work.a b;
    private WorkDatabase c;
    private ax.N2.c d;
    private List<t> e;
    private r f;
    private ax.L2.s g;
    private boolean h;
    private BroadcastReceiver.PendingResult i;
    private final ax.I2.o j;

    static class a {
        static boolean a(Context context) {
            boolean isDeviceProtectedStorage;
            isDeviceProtectedStorage = context.isDeviceProtectedStorage();
            return isDeviceProtectedStorage;
        }
    }

    public D(Context context, androidx.work.a aVar, ax.N2.c cVar) {
        this(context, aVar, cVar, context.getResources().getBoolean(ax.B2.o.a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (ax.C2.D.m != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        ax.C2.D.m = new ax.C2.D(r4, r5, new ax.N2.d(r5.m()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        ax.C2.D.l = ax.C2.D.m;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(android.content.Context r4, androidx.work.a r5) {
        /*
            java.lang.Object r0 = ax.C2.D.n
            monitor-enter(r0)
            ax.C2.D r1 = ax.C2.D.l     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            ax.C2.D r2 = ax.C2.D.m     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L14
            throw r4     // Catch: java.lang.Throwable -> L14
        L14:
            r4 = move-exception
            goto L36
        L16:
            if (r1 != 0) goto L34
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            ax.C2.D r1 = ax.C2.D.m     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L30
            ax.C2.D r1 = new ax.C2.D     // Catch: java.lang.Throwable -> L14
            ax.N2.d r2 = new ax.N2.d     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.Executor r3 = r5.m()     // Catch: java.lang.Throwable -> L14
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L14
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L14
            ax.C2.D.m = r1     // Catch: java.lang.Throwable -> L14
        L30:
            ax.C2.D r4 = ax.C2.D.m     // Catch: java.lang.Throwable -> L14
            ax.C2.D.l = r4     // Catch: java.lang.Throwable -> L14
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.C2.D.d(android.content.Context, androidx.work.a):void");
    }

    @Deprecated
    public static D i() {
        synchronized (n) {
            try {
                D d = l;
                if (d != null) {
                    return d;
                }
                return m;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static D j(Context context) {
        D i;
        synchronized (n) {
            try {
                i = i();
                if (i == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof a.c)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    d(applicationContext, ((a.c) applicationContext).a());
                    i = j(applicationContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    private void q(Context context, androidx.work.a aVar, ax.N2.c cVar, WorkDatabase workDatabase, List<t> list, r rVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = aVar;
        this.d = cVar;
        this.c = workDatabase;
        this.e = list;
        this.f = rVar;
        this.g = new ax.L2.s(workDatabase);
        this.h = false;
        if (Build.VERSION.SDK_INT >= 24 && a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.d.c(new ForceStopRunnable(applicationContext, this));
    }

    @Override // ax.B2.s
    public ax.B2.l b(List<? extends ax.B2.t> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new x(this, list).a();
    }

    public ax.B2.l e(UUID uuid) {
        AbstractRunnableC0785b b = AbstractRunnableC0785b.b(uuid, this);
        this.d.c(b);
        return b.d();
    }

    public List<t> f(Context context, androidx.work.a aVar, ax.I2.o oVar) {
        return Arrays.asList(u.a(context, this), new ax.D2.b(context, aVar, oVar, this));
    }

    public Context g() {
        return this.a;
    }

    public androidx.work.a h() {
        return this.b;
    }

    public ax.L2.s k() {
        return this.g;
    }

    public r l() {
        return this.f;
    }

    public List<t> m() {
        return this.e;
    }

    public ax.I2.o n() {
        return this.j;
    }

    public WorkDatabase o() {
        return this.c;
    }

    public ax.N2.c p() {
        return this.d;
    }

    public void r() {
        synchronized (n) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s() {
        if (Build.VERSION.SDK_INT >= 23) {
            ax.F2.l.b(g());
        }
        o().I().u();
        u.b(h(), o(), m());
    }

    public void t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (n) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.i;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.i = pendingResult;
                if (this.h) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u(v vVar) {
        v(vVar, null);
    }

    public void v(v vVar, WorkerParameters.a aVar) {
        this.d.c(new ax.L2.v(this, vVar, aVar));
    }

    public void w(ax.K2.m mVar) {
        this.d.c(new ax.L2.w(this, new v(mVar), true));
    }

    public void x(v vVar) {
        this.d.c(new ax.L2.w(this, vVar, false));
    }

    public D(Context context, androidx.work.a aVar, ax.N2.c cVar, boolean z) {
        this(context, aVar, cVar, WorkDatabase.C(context.getApplicationContext(), cVar.b(), z));
    }

    public D(Context context, androidx.work.a aVar, ax.N2.c cVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        ax.B2.i.h(new i.a(aVar.j()));
        ax.I2.o oVar = new ax.I2.o(applicationContext, cVar);
        this.j = oVar;
        List<t> f = f(applicationContext, aVar, oVar);
        q(context, aVar, cVar, workDatabase, f, new r(context, aVar, cVar, workDatabase, f));
    }
}
