package ax.L2;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import ax.B2.l;
import java.util.List;

/* renamed from: ax.L2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC0786c implements Runnable {
    private static final String d0 = ax.B2.i.i("EnqueueRunnable");
    private final ax.C2.o c0;
    private final ax.C2.x q;

    public RunnableC0786c(ax.C2.x xVar) {
        this(xVar, new ax.C2.o());
    }

    private static boolean b(ax.C2.x xVar) {
        boolean c = c(xVar.g(), xVar.f(), (String[]) ax.C2.x.l(xVar).toArray(new String[0]), xVar.d(), xVar.b());
        xVar.k();
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(ax.C2.D r18, java.util.List<? extends ax.B2.t> r19, java.lang.String[] r20, java.lang.String r21, ax.B2.d r22) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.L2.RunnableC0786c.c(ax.C2.D, java.util.List, java.lang.String[], java.lang.String, ax.B2.d):boolean");
    }

    private static boolean e(ax.C2.x xVar) {
        List<ax.C2.x> e = xVar.e();
        boolean z = false;
        if (e != null) {
            for (ax.C2.x xVar2 : e) {
                if (xVar2.j()) {
                    ax.B2.i.e().k(d0, "Already enqueued work ids (" + TextUtils.join(", ", xVar2.c()) + ")");
                } else {
                    z |= e(xVar2);
                }
            }
        }
        return b(xVar) | z;
    }

    public boolean a() {
        WorkDatabase o = this.q.g().o();
        o.e();
        try {
            boolean e = e(this.q);
            o.A();
            return e;
        } finally {
            o.i();
        }
    }

    public ax.B2.l d() {
        return this.c0;
    }

    public void f() {
        ax.C2.D g = this.q.g();
        ax.C2.u.b(g.h(), g.o(), g.m());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.q.h()) {
                throw new IllegalStateException("WorkContinuation has cycles (" + this.q + ")");
            }
            if (a()) {
                r.a(this.q.g().g(), RescheduleReceiver.class, true);
                f();
            }
            this.c0.a(ax.B2.l.a);
        } catch (Throwable th) {
            this.c0.a(new l.b.a(th));
        }
    }

    public RunnableC0786c(ax.C2.x xVar, ax.C2.o oVar) {
        this.q = xVar;
        this.c0 = oVar;
    }
}
