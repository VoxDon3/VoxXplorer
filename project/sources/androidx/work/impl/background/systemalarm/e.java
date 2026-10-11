package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import ax.B2.i;
import ax.C2.D;
import ax.C2.InterfaceC0656e;
import ax.C2.r;
import ax.C2.w;
import ax.K2.m;
import ax.L2.E;
import ax.L2.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class e implements InterfaceC0656e {
    static final String k = i.i("SystemAlarmDispatcher");
    final Context a;
    final ax.N2.c b;
    private final E c;
    private final r d;
    private final D e;
    final androidx.work.impl.background.systemalarm.b f;
    final List<Intent> g;
    Intent h;
    private c i;
    private w j;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (e.this.g) {
                e eVar = e.this;
                eVar.h = eVar.g.get(0);
            }
            Intent intent = e.this.h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.h.getIntExtra("KEY_START_ID", 0);
                i e = i.e();
                String str = e.k;
                e.a(str, "Processing command " + e.this.h + ", " + intExtra);
                PowerManager.WakeLock b = y.b(e.this.a, action + " (" + intExtra + ")");
                try {
                    i.e().a(str, "Acquiring operation wake lock (" + action + ") " + b);
                    b.acquire();
                    e eVar2 = e.this;
                    eVar2.f.q(eVar2.h, intExtra, eVar2);
                    i.e().a(str, "Releasing operation wake lock (" + action + ") " + b);
                    b.release();
                    e.this.b.a().execute(new d(e.this));
                } catch (Throwable th) {
                    try {
                        i e2 = i.e();
                        String str2 = e.k;
                        e2.d(str2, "Unexpected error in onHandleIntent", th);
                        i.e().a(str2, "Releasing operation wake lock (" + action + ") " + b);
                        b.release();
                        e.this.b.a().execute(new d(e.this));
                    } catch (Throwable th2) {
                        i.e().a(e.k, "Releasing operation wake lock (" + action + ") " + b);
                        b.release();
                        e.this.b.a().execute(new d(e.this));
                        throw th2;
                    }
                }
            }
        }
    }

    static class b implements Runnable {
        private final Intent c0;
        private final int d0;
        private final e q;

        b(e eVar, Intent intent, int i) {
            this.q = eVar;
            this.c0 = intent;
            this.d0 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.a(this.c0, this.d0);
        }
    }

    interface c {
        void a();
    }

    static class d implements Runnable {
        private final e q;

        d(e eVar) {
            this.q = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.c();
        }
    }

    e(Context context) {
        this(context, null, null);
    }

    private void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        b();
        synchronized (this.g) {
            try {
                Iterator<Intent> it = this.g.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void k() {
        b();
        PowerManager.WakeLock b2 = y.b(this.a, "ProcessCommand");
        try {
            b2.acquire();
            this.e.p().c(new a());
        } finally {
            b2.release();
        }
    }

    public boolean a(Intent intent, int i) {
        i e = i.e();
        String str = k;
        e.a(str, "Adding command " + intent + " (" + i + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            i.e().k(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.g) {
            try {
                boolean isEmpty = this.g.isEmpty();
                this.g.add(intent);
                if (isEmpty) {
                    k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    void c() {
        i e = i.e();
        String str = k;
        e.a(str, "Checking if commands are complete.");
        b();
        synchronized (this.g) {
            try {
                if (this.h != null) {
                    i.e().a(str, "Removing command " + this.h);
                    if (!this.g.remove(0).equals(this.h)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.h = null;
                }
                ax.N2.a b2 = this.b.b();
                if (!this.f.p() && this.g.isEmpty() && !b2.u()) {
                    i.e().a(str, "No more commands & intents.");
                    c cVar = this.i;
                    if (cVar != null) {
                        cVar.a();
                    }
                } else if (!this.g.isEmpty()) {
                    k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    r d() {
        return this.d;
    }

    @Override // ax.C2.InterfaceC0656e
    public void e(m mVar, boolean z) {
        this.b.a().execute(new b(this, androidx.work.impl.background.systemalarm.b.c(this.a, mVar, z), 0));
    }

    ax.N2.c f() {
        return this.b;
    }

    D g() {
        return this.e;
    }

    E h() {
        return this.c;
    }

    void j() {
        i.e().a(k, "Destroying SystemAlarmDispatcher");
        this.d.l(this);
        this.i = null;
    }

    void l(c cVar) {
        if (this.i != null) {
            i.e().c(k, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.i = cVar;
        }
    }

    e(Context context, r rVar, D d2) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.j = new w();
        this.f = new androidx.work.impl.background.systemalarm.b(applicationContext, this.j);
        d2 = d2 == null ? D.j(context) : d2;
        this.e = d2;
        this.c = new E(d2.h().k());
        rVar = rVar == null ? d2.l() : rVar;
        this.d = rVar;
        this.b = d2.p();
        rVar.g(this);
        this.g = new ArrayList();
        this.h = null;
    }
}
