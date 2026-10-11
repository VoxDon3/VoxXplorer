package ax.C2;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import ax.C2.G;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public class r implements InterfaceC0656e, ax.J2.a {
    private static final String m = ax.B2.i.i("Processor");
    private Context b;
    private androidx.work.a c;
    private ax.N2.c d;
    private WorkDatabase e;
    private List<t> i;
    private Map<String, G> g = new HashMap();
    private Map<String, G> f = new HashMap();
    private Set<String> j = new HashSet();
    private final List<InterfaceC0656e> k = new ArrayList();
    private PowerManager.WakeLock a = null;
    private final Object l = new Object();
    private Map<String, Set<v>> h = new HashMap();

    private static class a implements Runnable {
        private final ax.K2.m c0;
        private ax.v7.e<Boolean> d0;
        private InterfaceC0656e q;

        a(InterfaceC0656e interfaceC0656e, ax.K2.m mVar, ax.v7.e<Boolean> eVar) {
            this.q = interfaceC0656e;
            this.c0 = mVar;
            this.d0 = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                z = this.d0.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.q.e(this.c0, z);
        }
    }

    public r(Context context, androidx.work.a aVar, ax.N2.c cVar, WorkDatabase workDatabase, List<t> list) {
        this.b = context;
        this.c = aVar;
        this.d = cVar;
        this.e = workDatabase;
        this.i = list;
    }

    public static /* synthetic */ ax.K2.v f(r rVar, ArrayList arrayList, String str) {
        arrayList.addAll(rVar.e.J().b(str));
        return rVar.e.I().n(str);
    }

    private static boolean i(String str, G g) {
        if (g == null) {
            ax.B2.i.e().a(m, "WorkerWrapper could not be found for " + str);
            return false;
        }
        g.g();
        ax.B2.i.e().a(m, "WorkerWrapper interrupted for " + str);
        return true;
    }

    private void m(final ax.K2.m mVar, final boolean z) {
        this.d.a().execute(new Runnable() { // from class: ax.C2.q
            @Override // java.lang.Runnable
            public final void run() {
                r.this.e(mVar, z);
            }
        });
    }

    private void q() {
        synchronized (this.l) {
            try {
                if (this.f.isEmpty()) {
                    try {
                        this.b.startService(androidx.work.impl.foreground.a.g(this.b));
                    } catch (Throwable th) {
                        ax.B2.i.e().d(m, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ax.J2.a
    public void a(String str) {
        synchronized (this.l) {
            this.f.remove(str);
            q();
        }
    }

    @Override // ax.J2.a
    public boolean b(String str) {
        boolean containsKey;
        synchronized (this.l) {
            containsKey = this.f.containsKey(str);
        }
        return containsKey;
    }

    @Override // ax.J2.a
    public void c(String str, ax.B2.e eVar) {
        synchronized (this.l) {
            try {
                ax.B2.i.e().f(m, "Moving WorkSpec (" + str + ") to the foreground");
                G remove = this.g.remove(str);
                if (remove != null) {
                    if (this.a == null) {
                        PowerManager.WakeLock b = ax.L2.y.b(this.b, "ProcessorForegroundLck");
                        this.a = b;
                        b.acquire();
                    }
                    this.f.put(str, remove);
                    ax.Q.b.m(this.b, androidx.work.impl.foreground.a.d(this.b, remove.d(), eVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.C2.InterfaceC0656e
    public void e(ax.K2.m mVar, boolean z) {
        synchronized (this.l) {
            try {
                G g = this.g.get(mVar.b());
                if (g != null && mVar.equals(g.d())) {
                    this.g.remove(mVar.b());
                }
                ax.B2.i.e().a(m, getClass().getSimpleName() + " " + mVar.b() + " executed; reschedule = " + z);
                Iterator<InterfaceC0656e> it = this.k.iterator();
                while (it.hasNext()) {
                    it.next().e(mVar, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(InterfaceC0656e interfaceC0656e) {
        synchronized (this.l) {
            this.k.add(interfaceC0656e);
        }
    }

    public ax.K2.v h(String str) {
        synchronized (this.l) {
            try {
                G g = this.f.get(str);
                if (g == null) {
                    g = this.g.get(str);
                }
                if (g == null) {
                    return null;
                }
                return g.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean j(String str) {
        boolean contains;
        synchronized (this.l) {
            contains = this.j.contains(str);
        }
        return contains;
    }

    public boolean k(String str) {
        boolean z;
        synchronized (this.l) {
            try {
                z = this.g.containsKey(str) || this.f.containsKey(str);
            } finally {
            }
        }
        return z;
    }

    public void l(InterfaceC0656e interfaceC0656e) {
        synchronized (this.l) {
            this.k.remove(interfaceC0656e);
        }
    }

    public boolean n(v vVar) {
        return o(vVar, null);
    }

    public boolean o(v vVar, WorkerParameters.a aVar) {
        Throwable th;
        ax.K2.m a2 = vVar.a();
        final String b = a2.b();
        final ArrayList arrayList = new ArrayList();
        ax.K2.v vVar2 = (ax.K2.v) this.e.z(new Callable() { // from class: ax.C2.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return r.f(r.this, arrayList, b);
            }
        });
        if (vVar2 == null) {
            ax.B2.i.e().k(m, "Didn't find WorkSpec for id " + a2);
            m(a2, false);
            return false;
        }
        synchronized (this.l) {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    throw th;
                }
                try {
                    if (k(b)) {
                        Set<v> set = this.h.get(b);
                        if (set.iterator().next().a().a() == a2.a()) {
                            set.add(vVar);
                            ax.B2.i.e().a(m, "Work " + a2 + " is already enqueued for processing");
                        } else {
                            m(a2, false);
                        }
                        return false;
                    }
                    if (vVar2.d() != a2.a()) {
                        m(a2, false);
                        return false;
                    }
                    G b2 = new G.c(this.b, this.c, this.d, this, this.e, vVar2, arrayList).d(this.i).c(aVar).b();
                    ax.v7.e<Boolean> c = b2.c();
                    c.h(new a(this, vVar.a(), c), this.d.a());
                    this.g.put(b, b2);
                    HashSet hashSet = new HashSet();
                    hashSet.add(vVar);
                    this.h.put(b, hashSet);
                    this.d.b().execute(b2);
                    ax.B2.i.e().a(m, getClass().getSimpleName() + ": processing " + a2);
                    return true;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public boolean p(String str) {
        G remove;
        boolean z;
        synchronized (this.l) {
            try {
                ax.B2.i.e().a(m, "Processor cancelling " + str);
                this.j.add(str);
                remove = this.f.remove(str);
                z = remove != null;
                if (remove == null) {
                    remove = this.g.remove(str);
                }
                if (remove != null) {
                    this.h.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean i = i(str, remove);
        if (z) {
            q();
        }
        return i;
    }

    public boolean r(v vVar) {
        G remove;
        String b = vVar.a().b();
        synchronized (this.l) {
            try {
                ax.B2.i.e().a(m, "Processor stopping foreground work " + b);
                remove = this.f.remove(b);
                if (remove != null) {
                    this.h.remove(b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i(b, remove);
    }

    public boolean s(v vVar) {
        String b = vVar.a().b();
        synchronized (this.l) {
            try {
                G remove = this.g.remove(b);
                if (remove == null) {
                    ax.B2.i.e().a(m, "WorkerWrapper could not be found for " + b);
                    return false;
                }
                Set<v> set = this.h.get(b);
                if (set != null && set.contains(vVar)) {
                    ax.B2.i.e().a(m, "Processor stopping background work " + b);
                    this.h.remove(b);
                    return i(b, remove);
                }
                return false;
            } finally {
            }
        }
    }
}
