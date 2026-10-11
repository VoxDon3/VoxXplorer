package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import androidx.work.impl.background.systemalarm.e;
import ax.B2.i;
import ax.C2.v;
import ax.I2.o;
import ax.K2.m;
import ax.K2.y;
import ax.L2.E;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d implements ax.G2.c, E.a {
    private static final String m = i.i("DelayMetCommandHandler");
    private final Context a;
    private final int b;
    private final m c;
    private final e d;
    private final ax.G2.e e;
    private final Object f;
    private int g;
    private final Executor h;
    private final Executor i;
    private PowerManager.WakeLock j;
    private boolean k;
    private final v l;

    d(Context context, int i, e eVar, v vVar) {
        this.a = context;
        this.b = i;
        this.d = eVar;
        this.c = vVar.a();
        this.l = vVar;
        o n = eVar.g().n();
        this.h = eVar.f().b();
        this.i = eVar.f().a();
        this.e = new ax.G2.e(n, this);
        this.k = false;
        this.g = 0;
        this.f = new Object();
    }

    private void e() {
        synchronized (this.f) {
            try {
                this.e.a();
                this.d.h().b(this.c);
                PowerManager.WakeLock wakeLock = this.j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    i.e().a(m, "Releasing wakelock " + this.j + "for WorkSpec " + this.c);
                    this.j.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.g != 0) {
            i.e().a(m, "Already started work for " + this.c);
            return;
        }
        this.g = 1;
        i.e().a(m, "onAllConstraintsMet for " + this.c);
        if (this.d.d().n(this.l)) {
            this.d.h().a(this.c, 600000L, this);
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        String b = this.c.b();
        if (this.g >= 2) {
            i.e().a(m, "Already stopped work for " + b);
            return;
        }
        this.g = 2;
        i e = i.e();
        String str = m;
        e.a(str, "Stopping work for WorkSpec " + b);
        this.i.execute(new e.b(this.d, b.g(this.a, this.c), this.b));
        if (!this.d.d().k(this.c.b())) {
            i.e().a(str, "Processor does not have WorkSpec " + b + ". No need to reschedule");
            return;
        }
        i.e().a(str, "WorkSpec " + b + " needs to be rescheduled");
        this.i.execute(new e.b(this.d, b.f(this.a, this.c), this.b));
    }

    @Override // ax.L2.E.a
    public void a(m mVar) {
        i.e().a(m, "Exceeded time limits on execution for " + mVar);
        this.h.execute(new ax.E2.a(this));
    }

    @Override // ax.G2.c
    public void b(List<ax.K2.v> list) {
        this.h.execute(new ax.E2.a(this));
    }

    @Override // ax.G2.c
    public void f(List<ax.K2.v> list) {
        Iterator<ax.K2.v> it = list.iterator();
        while (it.hasNext()) {
            if (y.a(it.next()).equals(this.c)) {
                this.h.execute(new Runnable() { // from class: ax.E2.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.this.i();
                    }
                });
                return;
            }
        }
    }

    void g() {
        String b = this.c.b();
        this.j = ax.L2.y.b(this.a, b + " (" + this.b + ")");
        i e = i.e();
        String str = m;
        e.a(str, "Acquiring wakelock " + this.j + "for WorkSpec " + b);
        this.j.acquire();
        ax.K2.v n = this.d.g().o().I().n(b);
        if (n == null) {
            this.h.execute(new ax.E2.a(this));
            return;
        }
        boolean f = n.f();
        this.k = f;
        if (f) {
            this.e.b(Collections.singletonList(n));
            return;
        }
        i.e().a(str, "No constraints for " + b);
        f(Collections.singletonList(n));
    }

    void h(boolean z) {
        i.e().a(m, "onExecuted " + this.c + ", " + z);
        e();
        if (z) {
            this.i.execute(new e.b(this.d, b.f(this.a, this.c), this.b));
        }
        if (this.k) {
            this.i.execute(new e.b(this.d, b.a(this.a), this.b));
        }
    }
}
