package ax.D2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import ax.B2.i;
import ax.B2.r;
import ax.C2.D;
import ax.C2.InterfaceC0656e;
import ax.C2.t;
import ax.C2.w;
import ax.G2.c;
import ax.G2.d;
import ax.G2.e;
import ax.I2.o;
import ax.K2.m;
import ax.K2.v;
import ax.K2.y;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class b implements t, c, InterfaceC0656e {
    private static final String j = i.i("GreedyScheduler");
    private final Context a;
    private final D b;
    private final d c;
    private a e;
    private boolean f;
    Boolean i;
    private final Set<v> d = new HashSet();
    private final w h = new w();
    private final Object g = new Object();

    public b(Context context, androidx.work.a aVar, o oVar, D d) {
        this.a = context;
        this.b = d;
        this.c = new e(oVar, this);
        this.e = new a(this, aVar.k());
    }

    private void g() {
        this.i = Boolean.valueOf(ax.L2.t.b(this.a, this.b.h()));
    }

    private void h() {
        if (this.f) {
            return;
        }
        this.b.l().g(this);
        this.f = true;
    }

    private void i(m mVar) {
        synchronized (this.g) {
            try {
                Iterator<v> it = this.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    v next = it.next();
                    if (y.a(next).equals(mVar)) {
                        i.e().a(j, "Stopping tracking for " + mVar);
                        this.d.remove(next);
                        this.c.b(this.d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.C2.t
    public void a(v... vVarArr) {
        if (this.i == null) {
            g();
        }
        if (!this.i.booleanValue()) {
            i.e().f(j, "Ignoring schedule request in a secondary process");
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (v vVar : vVarArr) {
            if (!this.h.a(y.a(vVar))) {
                long a = vVar.a();
                long currentTimeMillis = System.currentTimeMillis();
                if (vVar.b == r.ENQUEUED) {
                    if (currentTimeMillis < a) {
                        a aVar = this.e;
                        if (aVar != null) {
                            aVar.a(vVar);
                        }
                    } else if (vVar.f()) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 23 && vVar.j.h()) {
                            i.e().a(j, "Ignoring " + vVar + ". Requires device idle.");
                        } else if (i < 24 || !vVar.j.e()) {
                            hashSet.add(vVar);
                            hashSet2.add(vVar.a);
                        } else {
                            i.e().a(j, "Ignoring " + vVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.h.a(y.a(vVar))) {
                        i.e().a(j, "Starting work for " + vVar.a);
                        this.b.u(this.h.e(vVar));
                    }
                }
            }
        }
        synchronized (this.g) {
            try {
                if (!hashSet.isEmpty()) {
                    i.e().a(j, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.d.addAll(hashSet);
                    this.c.b(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.G2.c
    public void b(List<v> list) {
        Iterator<v> it = list.iterator();
        while (it.hasNext()) {
            m a = y.a(it.next());
            i.e().a(j, "Constraints not met: Cancelling work ID " + a);
            ax.C2.v b = this.h.b(a);
            if (b != null) {
                this.b.x(b);
            }
        }
    }

    @Override // ax.C2.t
    public boolean c() {
        return false;
    }

    @Override // ax.C2.t
    public void d(String str) {
        if (this.i == null) {
            g();
        }
        if (!this.i.booleanValue()) {
            i.e().f(j, "Ignoring schedule request in non-main process");
            return;
        }
        h();
        i.e().a(j, "Cancelling work ID " + str);
        a aVar = this.e;
        if (aVar != null) {
            aVar.b(str);
        }
        Iterator<ax.C2.v> it = this.h.c(str).iterator();
        while (it.hasNext()) {
            this.b.x(it.next());
        }
    }

    @Override // ax.C2.InterfaceC0656e
    public void e(m mVar, boolean z) {
        this.h.b(mVar);
        i(mVar);
    }

    @Override // ax.G2.c
    public void f(List<v> list) {
        Iterator<v> it = list.iterator();
        while (it.hasNext()) {
            m a = y.a(it.next());
            if (!this.h.a(a)) {
                i.e().a(j, "Constraints met: Scheduling work ID " + a);
                this.b.u(this.h.d(a));
            }
        }
    }
}
