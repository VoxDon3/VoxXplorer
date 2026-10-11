package ax.k2;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import ax.l2.AbstractC2464b;
import ax.l2.InterfaceC2463a;
import ax.o2.C2682c;
import ax.o2.h;
import ax.tb.C3115F;
import ax.tb.C3121L;
import ax.tb.C3139o;
import ax.v.C3243c;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: ax.k2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2390u {
    public static final c o = new c(null);
    protected volatile ax.o2.g a;
    private Executor b;
    private Executor c;
    private ax.o2.h d;
    private boolean f;
    private boolean g;
    protected List<? extends b> h;
    private C2372c k;
    private final Map<String, Object> m;
    private final Map<Class<?>, Object> n;
    private final C2384o e = g();
    private Map<Class<? extends InterfaceC2463a>, InterfaceC2463a> i = new LinkedHashMap();
    private final ReentrantReadWriteLock j = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> l = new ThreadLocal<>();

    /* renamed from: ax.k2.u$a */
    public static class a<T extends AbstractC2390u> {
        private final Context a;
        private final Class<T> b;
        private final String c;
        private final List<b> d;
        private final List<Object> e;
        private List<InterfaceC2463a> f;
        private Executor g;
        private Executor h;
        private h.c i;
        private boolean j;
        private d k;
        private Intent l;
        private boolean m;
        private boolean n;
        private long o;
        private TimeUnit p;
        private final e q;
        private Set<Integer> r;
        private Set<Integer> s;
        private String t;
        private File u;
        private Callable<InputStream> v;

        public a(Context context, Class<T> cls, String str) {
            ax.Gb.l.f(context, "context");
            ax.Gb.l.f(cls, "klass");
            this.a = context;
            this.b = cls;
            this.c = str;
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.k = d.AUTOMATIC;
            this.m = true;
            this.o = -1L;
            this.q = new e();
            this.r = new LinkedHashSet();
        }

        public a<T> a(b bVar) {
            ax.Gb.l.f(bVar, "callback");
            this.d.add(bVar);
            return this;
        }

        public a<T> b(AbstractC2464b... abstractC2464bArr) {
            ax.Gb.l.f(abstractC2464bArr, "migrations");
            if (this.s == null) {
                this.s = new HashSet();
            }
            for (AbstractC2464b abstractC2464b : abstractC2464bArr) {
                Set<Integer> set = this.s;
                ax.Gb.l.c(set);
                set.add(Integer.valueOf(abstractC2464b.a));
                Set<Integer> set2 = this.s;
                ax.Gb.l.c(set2);
                set2.add(Integer.valueOf(abstractC2464b.b));
            }
            this.q.b((AbstractC2464b[]) Arrays.copyOf(abstractC2464bArr, abstractC2464bArr.length));
            return this;
        }

        public a<T> c() {
            this.j = true;
            return this;
        }

        public T d() {
            Executor executor = this.g;
            if (executor == null && this.h == null) {
                Executor f = C3243c.f();
                this.h = f;
                this.g = f;
            } else if (executor != null && this.h == null) {
                this.h = executor;
            } else if (executor == null) {
                this.g = this.h;
            }
            Set<Integer> set = this.s;
            if (set != null) {
                ax.Gb.l.c(set);
                Iterator<Integer> it = set.iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (this.r.contains(Integer.valueOf(intValue))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue).toString());
                    }
                }
            }
            h.c cVar = this.i;
            if (cVar == null) {
                cVar = new ax.p2.f();
            }
            if (cVar != null) {
                if (this.o > 0) {
                    if (this.c == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j = this.o;
                    TimeUnit timeUnit = this.p;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.g;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    cVar = new C2374e(cVar, new C2372c(j, timeUnit, executor2));
                }
                String str = this.t;
                if (str != null || this.u != null || this.v != null) {
                    if (this.c == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int i = str == null ? 0 : 1;
                    File file = this.u;
                    int i2 = file == null ? 0 : 1;
                    Callable<InputStream> callable = this.v;
                    if (i + i2 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    cVar = new C2395z(str, file, callable, cVar);
                }
            } else {
                cVar = null;
            }
            h.c cVar2 = cVar;
            if (cVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Context context = this.a;
            String str2 = this.c;
            e eVar = this.q;
            List<b> list = this.d;
            boolean z = this.j;
            d j2 = this.k.j(context);
            Executor executor3 = this.g;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.h;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C2375f c2375f = new C2375f(context, str2, cVar2, eVar, list, z, j2, executor3, executor4, this.l, this.m, this.n, this.r, this.t, this.u, this.v, null, this.e, this.f);
            T t = (T) C2389t.b(this.b, "_Impl");
            t.r(c2375f);
            return t;
        }

        public a<T> e() {
            this.m = false;
            this.n = true;
            return this;
        }

        public a<T> f(h.c cVar) {
            this.i = cVar;
            return this;
        }

        public a<T> g(Executor executor) {
            ax.Gb.l.f(executor, "executor");
            this.g = executor;
            return this;
        }
    }

    /* renamed from: ax.k2.u$b */
    public static abstract class b {
        public void a(ax.o2.g gVar) {
            ax.Gb.l.f(gVar, "db");
        }

        public void b(ax.o2.g gVar) {
            ax.Gb.l.f(gVar, "db");
        }

        public void c(ax.o2.g gVar) {
            ax.Gb.l.f(gVar, "db");
        }
    }

    /* renamed from: ax.k2.u$c */
    public static final class c {
        public /* synthetic */ c(ax.Gb.g gVar) {
            this();
        }

        private c() {
        }
    }

    /* renamed from: ax.k2.u$d */
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean h(ActivityManager activityManager) {
            return C2682c.b(activityManager);
        }

        public final d j(Context context) {
            ax.Gb.l.f(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ax.Gb.l.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return !h((ActivityManager) systemService) ? WRITE_AHEAD_LOGGING : TRUNCATE;
        }
    }

    /* renamed from: ax.k2.u$e */
    public static class e {
        private final Map<Integer, TreeMap<Integer, AbstractC2464b>> a = new LinkedHashMap();

        private final void a(AbstractC2464b abstractC2464b) {
            int i = abstractC2464b.a;
            int i2 = abstractC2464b.b;
            Map<Integer, TreeMap<Integer, AbstractC2464b>> map = this.a;
            Integer valueOf = Integer.valueOf(i);
            TreeMap<Integer, AbstractC2464b> treeMap = map.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(valueOf, treeMap);
            }
            TreeMap<Integer, AbstractC2464b> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + abstractC2464b);
            }
            treeMap2.put(Integer.valueOf(i2), abstractC2464b);
        }

        private final List<AbstractC2464b> e(List<AbstractC2464b> list, boolean z, int i, int i2) {
            boolean z2;
            do {
                if (z) {
                    if (i >= i2) {
                        return list;
                    }
                } else if (i <= i2) {
                    return list;
                }
                TreeMap<Integer, AbstractC2464b> treeMap = this.a.get(Integer.valueOf(i));
                if (treeMap == null) {
                    return null;
                }
                for (Integer num : z ? treeMap.descendingKeySet() : treeMap.keySet()) {
                    if (z) {
                        int i3 = i + 1;
                        ax.Gb.l.e(num, "targetVersion");
                        int intValue = num.intValue();
                        if (i3 <= intValue && intValue <= i2) {
                            AbstractC2464b abstractC2464b = treeMap.get(num);
                            ax.Gb.l.c(abstractC2464b);
                            list.add(abstractC2464b);
                            i = num.intValue();
                            z2 = true;
                            break;
                        }
                    } else {
                        ax.Gb.l.e(num, "targetVersion");
                        int intValue2 = num.intValue();
                        if (i2 <= intValue2 && intValue2 < i) {
                            AbstractC2464b abstractC2464b2 = treeMap.get(num);
                            ax.Gb.l.c(abstractC2464b2);
                            list.add(abstractC2464b2);
                            i = num.intValue();
                            z2 = true;
                            break;
                            break;
                        }
                    }
                }
                z2 = false;
            } while (z2);
            return null;
        }

        public void b(AbstractC2464b... abstractC2464bArr) {
            ax.Gb.l.f(abstractC2464bArr, "migrations");
            for (AbstractC2464b abstractC2464b : abstractC2464bArr) {
                a(abstractC2464b);
            }
        }

        public final boolean c(int i, int i2) {
            Map<Integer, Map<Integer, AbstractC2464b>> f = f();
            if (!f.containsKey(Integer.valueOf(i))) {
                return false;
            }
            Map<Integer, AbstractC2464b> map = f.get(Integer.valueOf(i));
            if (map == null) {
                map = C3115F.g();
            }
            return map.containsKey(Integer.valueOf(i2));
        }

        public List<AbstractC2464b> d(int i, int i2) {
            if (i == i2) {
                return C3139o.j();
            }
            return e(new ArrayList(), i2 > i, i, i2);
        }

        public Map<Integer, Map<Integer, AbstractC2464b>> f() {
            return this.a;
        }
    }

    /* renamed from: ax.k2.u$f */
    public static abstract class f {
    }

    /* renamed from: ax.k2.u$g */
    static final class g extends ax.Gb.m implements ax.Fb.l<ax.o2.g, Object> {
        g() {
            super(1);
        }

        @Override // ax.Fb.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ax.o2.g gVar) {
            ax.Gb.l.f(gVar, "it");
            AbstractC2390u.this.s();
            return null;
        }
    }

    /* renamed from: ax.k2.u$h */
    static final class h extends ax.Gb.m implements ax.Fb.l<ax.o2.g, Object> {
        h() {
            super(1);
        }

        @Override // ax.Fb.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ax.o2.g gVar) {
            ax.Gb.l.f(gVar, "it");
            AbstractC2390u.this.t();
            return null;
        }
    }

    public AbstractC2390u() {
        Map<String, Object> synchronizedMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
        ax.Gb.l.e(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.m = synchronizedMap;
        this.n = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T B(Class<T> cls, ax.o2.h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof InterfaceC2376g) {
            return (T) B(cls, ((InterfaceC2376g) hVar).a());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        c();
        ax.o2.g g0 = m().g0();
        l().t(g0);
        if (g0.E0()) {
            g0.a0();
        } else {
            g0.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        m().g0().j0();
        if (q()) {
            return;
        }
        l().l();
    }

    public static /* synthetic */ Cursor y(AbstractC2390u abstractC2390u, ax.o2.j jVar, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return abstractC2390u.x(jVar, cancellationSignal);
    }

    public void A() {
        m().g0().Y();
    }

    public void c() {
        if (!this.f && v()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void d() {
        if (!q() && this.l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void e() {
        c();
        C2372c c2372c = this.k;
        if (c2372c == null) {
            s();
        } else {
            c2372c.g(new g());
        }
    }

    public ax.o2.k f(String str) {
        ax.Gb.l.f(str, "sql");
        c();
        d();
        return m().g0().J(str);
    }

    protected abstract C2384o g();

    protected abstract ax.o2.h h(C2375f c2375f);

    public void i() {
        C2372c c2372c = this.k;
        if (c2372c == null) {
            t();
        } else {
            c2372c.g(new h());
        }
    }

    public List<AbstractC2464b> j(Map<Class<? extends InterfaceC2463a>, InterfaceC2463a> map) {
        ax.Gb.l.f(map, "autoMigrationSpecs");
        return C3139o.j();
    }

    public final Lock k() {
        ReentrantReadWriteLock.ReadLock readLock = this.j.readLock();
        ax.Gb.l.e(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public C2384o l() {
        return this.e;
    }

    public ax.o2.h m() {
        ax.o2.h hVar = this.d;
        if (hVar != null) {
            return hVar;
        }
        ax.Gb.l.t("internalOpenHelper");
        return null;
    }

    public Executor n() {
        Executor executor = this.b;
        if (executor != null) {
            return executor;
        }
        ax.Gb.l.t("internalQueryExecutor");
        return null;
    }

    public Set<Class<? extends InterfaceC2463a>> o() {
        return C3121L.d();
    }

    protected Map<Class<?>, List<Class<?>>> p() {
        return C3115F.g();
    }

    public boolean q() {
        return m().g0().z0();
    }

    public void r(C2375f c2375f) {
        ax.Gb.l.f(c2375f, "configuration");
        this.d = h(c2375f);
        Set<Class<? extends InterfaceC2463a>> o2 = o();
        BitSet bitSet = new BitSet();
        for (Class<? extends InterfaceC2463a> cls : o2) {
            int size = c2375f.r.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    if (cls.isAssignableFrom(c2375f.r.get(size).getClass())) {
                        bitSet.set(size);
                        break;
                    } else if (i < 0) {
                        break;
                    } else {
                        size = i;
                    }
                }
            }
            size = -1;
            if (size < 0) {
                throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
            }
            this.i.put(cls, c2375f.r.get(size));
        }
        int size2 = c2375f.r.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                if (!bitSet.get(size2)) {
                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        for (AbstractC2464b abstractC2464b : j(this.i)) {
            if (!c2375f.d.c(abstractC2464b.a, abstractC2464b.b)) {
                c2375f.d.b(abstractC2464b);
            }
        }
        C2394y c2394y = (C2394y) B(C2394y.class, m());
        if (c2394y != null) {
            c2394y.d(c2375f);
        }
        C2373d c2373d = (C2373d) B(C2373d.class, m());
        if (c2373d != null) {
            this.k = c2373d.c0;
            l().o(c2373d.c0);
        }
        boolean z = c2375f.g == d.WRITE_AHEAD_LOGGING;
        m().setWriteAheadLoggingEnabled(z);
        this.h = c2375f.e;
        this.b = c2375f.h;
        this.c = new ExecutorC2369C(c2375f.i);
        this.f = c2375f.f;
        this.g = z;
        if (c2375f.j != null) {
            if (c2375f.b == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            l().p(c2375f.a, c2375f.b, c2375f.j);
        }
        Map<Class<?>, List<Class<?>>> p = p();
        BitSet bitSet2 = new BitSet();
        for (Map.Entry<Class<?>, List<Class<?>>> entry : p.entrySet()) {
            Class<?> key = entry.getKey();
            for (Class<?> cls2 : entry.getValue()) {
                int size3 = c2375f.q.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        int i3 = size3 - 1;
                        if (cls2.isAssignableFrom(c2375f.q.get(size3).getClass())) {
                            bitSet2.set(size3);
                            break;
                        } else if (i3 < 0) {
                            break;
                        } else {
                            size3 = i3;
                        }
                    }
                }
                size3 = -1;
                if (size3 < 0) {
                    throw new IllegalArgumentException(("A required type converter (" + cls2 + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                }
                this.n.put(cls2, c2375f.q.get(size3));
            }
        }
        int size4 = c2375f.q.size() - 1;
        if (size4 < 0) {
            return;
        }
        while (true) {
            int i4 = size4 - 1;
            if (!bitSet2.get(size4)) {
                throw new IllegalArgumentException("Unexpected type converter " + c2375f.q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
            }
            if (i4 < 0) {
                return;
            } else {
                size4 = i4;
            }
        }
    }

    protected void u(ax.o2.g gVar) {
        ax.Gb.l.f(gVar, "db");
        l().i(gVar);
    }

    public final boolean v() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean w() {
        Boolean bool;
        boolean isOpen;
        C2372c c2372c = this.k;
        if (c2372c != null) {
            isOpen = c2372c.l();
        } else {
            ax.o2.g gVar = this.a;
            if (gVar == null) {
                bool = null;
                return ax.Gb.l.a(bool, Boolean.TRUE);
            }
            isOpen = gVar.isOpen();
        }
        bool = Boolean.valueOf(isOpen);
        return ax.Gb.l.a(bool, Boolean.TRUE);
    }

    public Cursor x(ax.o2.j jVar, CancellationSignal cancellationSignal) {
        ax.Gb.l.f(jVar, "query");
        c();
        d();
        return cancellationSignal != null ? m().g0().y(jVar, cancellationSignal) : m().g0().n0(jVar);
    }

    public <V> V z(Callable<V> callable) {
        ax.Gb.l.f(callable, "body");
        e();
        try {
            V call = callable.call();
            A();
            return call;
        } finally {
            i();
        }
    }
}
