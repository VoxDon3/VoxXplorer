/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import ax.Gb.l;
import ax.k2.C;
import ax.k2.g;
import ax.k2.o;
import ax.k2.t;
import ax.k2.y;
import ax.k2.z;
import ax.o2.h;
import ax.o2.j;
import ax.o2.k;
import ax.tb.F;
import ax.tb.L;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class u {
    public static final c o = new c(null);
    protected volatile ax.o2.g a;
    private Executor b;
    private Executor c;
    private h d;
    private final o e = this.g();
    private boolean f;
    private boolean g;
    protected List<? extends b> h;
    private Map<Class<? extends ax.l2.a>, ax.l2.a> i = new LinkedHashMap<Class<? extends ax.l2.a>, ax.l2.a>();
    private final ReentrantReadWriteLock j = new ReentrantReadWriteLock();
    private ax.k2.c k;
    private final ThreadLocal<Integer> l = new ThreadLocal();
    private final Map<String, Object> m;
    private final Map<Class<?>, Object> n;

    public u() {
        Map map = java.util.DesugarCollections.synchronizedMap(new LinkedHashMap());
        ax.Gb.l.e(map, "synchronizedMap(mutableMapOf())");
        this.m = map;
        this.n = new LinkedHashMap();
    }

    private final <T> T B(Class<T> clazz, h h8) {
        if (clazz.isInstance(h8)) {
            return (T)h8;
        }
        if (h8 instanceof g) {
            return this.B(clazz, ((g)((Object)h8)).a());
        }
        return null;
    }

    private final void s() {
        this.c();
        ax.o2.g g8 = this.m().g0();
        this.l().t(g8);
        if (g8.E0()) {
            g8.a0();
            return;
        }
        g8.r();
    }

    private final void t() {
        this.m().g0().j0();
        if (!this.q()) {
            this.l().l();
        }
    }

    public static /* synthetic */ Cursor y(u u8, j j8, CancellationSignal cancellationSignal, int n8, Object object) {
        if (object == null) {
            if ((n8 & 2) != 0) {
                cancellationSignal = null;
            }
            return u8.x(j8, cancellationSignal);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
    }

    public void A() {
        this.m().g0().Y();
    }

    public void c() {
        if (this.f || !this.v()) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }

    public void d() {
        if (!this.q() && this.l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void e() {
        this.c();
        ax.k2.c c8 = this.k;
        if (c8 == null) {
            this.s();
            return;
        }
        c8.g(new ax.Fb.l<ax.o2.g, Object>(this){
            final u q;
            {
                this.q = u8;
                super(1);
            }

            public final Object a(ax.o2.g g8) {
                ax.Gb.l.f(g8, "it");
                this.q.s();
                return null;
            }
        });
    }

    public k f(String string) {
        ax.Gb.l.f(string, "sql");
        this.c();
        this.d();
        return this.m().g0().J(string);
    }

    protected abstract o g();

    protected abstract h h(ax.k2.f var1);

    public void i() {
        ax.k2.c c8 = this.k;
        if (c8 == null) {
            this.t();
            return;
        }
        c8.g(new ax.Fb.l<ax.o2.g, Object>(this){
            final u q;
            {
                this.q = u8;
                super(1);
            }

            public final Object a(ax.o2.g g8) {
                ax.Gb.l.f(g8, "it");
                this.q.t();
                return null;
            }
        });
    }

    public List<ax.l2.b> j(Map<Class<? extends ax.l2.a>, ax.l2.a> map) {
        ax.Gb.l.f(map, "autoMigrationSpecs");
        return ax.tb.o.j();
    }

    public final Lock k() {
        ReentrantReadWriteLock.ReadLock readLock = this.j.readLock();
        ax.Gb.l.e(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public o l() {
        return this.e;
    }

    public h m() {
        h h8;
        h h9 = h8 = this.d;
        if (h8 == null) {
            ax.Gb.l.t("internalOpenHelper");
            h9 = null;
        }
        return h9;
    }

    public Executor n() {
        Executor executor;
        Executor executor2 = executor = this.b;
        if (executor == null) {
            ax.Gb.l.t("internalQueryExecutor");
            executor2 = null;
        }
        return executor2;
    }

    public Set<Class<? extends ax.l2.a>> o() {
        return L.d();
    }

    protected Map<Class<?>, List<Class<?>>> p() {
        return F.g();
    }

    public boolean q() {
        return this.m().g0().z0();
    }

    public void r(ax.k2.f object) {
        block27: {
            int n8;
            int n9;
            Object object3;
            boolean bl;
            block25: {
                bl = false;
                ax.Gb.l.f(object, "configuration");
                this.d = this.h((ax.k2.f)object);
                object3 = this.o();
                BitSet object22 = new BitSet();
                Iterator<Object> iterator = object3.iterator();
                while (iterator.hasNext()) {
                    block24: {
                        object3 = iterator.next();
                        n9 = ((ax.k2.f)object).r.size() - 1;
                        if (n9 >= 0) {
                            while (true) {
                                n8 = n9 - 1;
                                if (((Class)object3).isAssignableFrom(((ax.k2.f)object).r.get(n9).getClass())) {
                                    object22.set(n9);
                                    break block24;
                                }
                                if (n8 < 0) break;
                                n9 = n8;
                            }
                        }
                        n9 = -1;
                    }
                    if (n9 >= 0) {
                        this.i.put((Class<? extends ax.l2.a>)object3, ((ax.k2.f)object).r.get(n9));
                        continue;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("A required auto migration spec (");
                    ((StringBuilder)object).append(((Class)object3).getCanonicalName());
                    ((StringBuilder)object).append(") is missing in the database configuration.");
                    throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
                }
                n9 = ((ax.k2.f)object).r.size() - 1;
                if (n9 >= 0) {
                    while (true) {
                        n8 = n9 - 1;
                        if (!object22.get(n9)) break;
                        if (n8 >= 0) {
                            n9 = n8;
                            continue;
                        }
                        break block25;
                        break;
                    }
                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                }
            }
            for (ax.l2.b b8 : this.j(this.i)) {
                if (((ax.k2.f)object).d.c(b8.a, b8.b)) continue;
                ((ax.k2.f)object).d.b(b8);
            }
            object3 = this.B(y.class, this.m());
            if (object3 != null) {
                ((y)object3).d((ax.k2.f)object);
            }
            if ((object3 = this.B(ax.k2.d.class, this.m())) != null) {
                this.k = ((ax.k2.d)object3).c0;
                this.l().o(((ax.k2.d)object3).c0);
            }
            if (((ax.k2.f)object).g == ax.k2.u$d.d0) {
                bl = true;
            }
            this.m().setWriteAheadLoggingEnabled(bl);
            this.h = ((ax.k2.f)object).e;
            this.b = ((ax.k2.f)object).h;
            this.c = new C(((ax.k2.f)object).i);
            this.f = ((ax.k2.f)object).f;
            this.g = bl;
            if (((ax.k2.f)object).j != null) {
                if (((ax.k2.f)object).b != null) {
                    this.l().p(((ax.k2.f)object).a, ((ax.k2.f)object).b, ((ax.k2.f)object).j);
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            Map<Class<?>, List<Class<?>>> map = this.p();
            object3 = new BitSet();
            for (Map.Entry entry : map.entrySet()) {
                Class clazz = (Class)entry.getKey();
                for (Class clazz2 : (List)entry.getValue()) {
                    block26: {
                        n9 = ((ax.k2.f)object).q.size() - 1;
                        if (n9 >= 0) {
                            while (true) {
                                n8 = n9 - 1;
                                if (clazz2.isAssignableFrom(((ax.k2.f)object).q.get(n9).getClass())) {
                                    ((BitSet)object3).set(n9);
                                    break block26;
                                }
                                if (n8 < 0) break;
                                n9 = n8;
                            }
                        }
                        n9 = -1;
                    }
                    if (n9 >= 0) {
                        this.n.put(clazz2, ((ax.k2.f)object).q.get(n9));
                        continue;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("A required type converter (");
                    ((StringBuilder)object).append(clazz2);
                    ((StringBuilder)object).append(") for ");
                    ((StringBuilder)object).append(clazz.getCanonicalName());
                    ((StringBuilder)object).append(" is missing in the database configuration.");
                    throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
                }
            }
            n9 = ((ax.k2.f)object).q.size() - 1;
            if (n9 >= 0) {
                while (true) {
                    n8 = n9 - 1;
                    if (!((BitSet)object3).get(n9)) break;
                    if (n8 >= 0) {
                        n9 = n8;
                        continue;
                    }
                    break block27;
                    break;
                }
                object3 = ((ax.k2.f)object).q.get(n9);
                object = new StringBuilder();
                ((StringBuilder)object).append("Unexpected type converter ");
                ((StringBuilder)object).append(object3);
                ((StringBuilder)object).append(". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
        }
    }

    protected void u(ax.o2.g g8) {
        ax.Gb.l.f(g8, "db");
        this.l().i(g8);
    }

    public final boolean v() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean w() {
        boolean bl;
        Object object = this.k;
        if (object != null) {
            bl = ((ax.k2.c)object).l();
        } else {
            object = this.a;
            if (object == null) {
                object = null;
                return ax.Gb.l.a(object, Boolean.TRUE);
            }
            bl = object.isOpen();
        }
        object = bl;
        return ax.Gb.l.a(object, Boolean.TRUE);
    }

    public Cursor x(j j8, CancellationSignal cancellationSignal) {
        ax.Gb.l.f(j8, "query");
        this.c();
        this.d();
        if (cancellationSignal != null) {
            return this.m().g0().y(j8, cancellationSignal);
        }
        return this.m().g0().n0(j8);
    }

    public <V> V z(Callable<V> callable) {
        ax.Gb.l.f(callable, "body");
        this.e();
        try {
            callable = callable.call();
            this.A();
            return (V)callable;
        }
        finally {
            this.i();
        }
    }

    public static class a<T extends u> {
        private final Context a;
        private final Class<T> b;
        private final String c;
        private final List<b> d;
        private final List<Object> e;
        private List<ax.l2.a> f;
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

        public a(Context context, Class<T> clazz, String string) {
            ax.Gb.l.f(context, "context");
            ax.Gb.l.f(clazz, "klass");
            this.a = context;
            this.b = clazz;
            this.c = string;
            this.d = new ArrayList<b>();
            this.e = new ArrayList<Object>();
            this.f = new ArrayList<ax.l2.a>();
            this.k = ax.k2.u$d.q;
            this.m = true;
            this.o = -1L;
            this.q = new e();
            this.r = new LinkedHashSet<Integer>();
        }

        public a<T> a(b b8) {
            ax.Gb.l.f(b8, "callback");
            this.d.add(b8);
            return this;
        }

        public a<T> b(ax.l2.b ... bArray) {
            ax.Gb.l.f(bArray, "migrations");
            if (this.s == null) {
                this.s = new HashSet<Integer>();
            }
            int n8 = bArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                ax.l2.b b8 = bArray[i8];
                Set<Integer> set = this.s;
                ax.Gb.l.c(set);
                set.add(b8.a);
                set = this.s;
                ax.Gb.l.c(set);
                set.add(b8.b);
            }
            this.q.b(Arrays.copyOf(bArray, bArray.length));
            return this;
        }

        public a<T> c() {
            this.j = true;
            return this;
        }

        /*
         * WARNING - void declaration
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public T d() {
            Object object;
            Object object2;
            block14: {
                block12: {
                    h.c var8_7;
                    String string;
                    int n8;
                    block13: {
                        object2 = this.g;
                        if (object2 == null && this.h == null) {
                            object2 = ax.v.c.f();
                            this.h = object2;
                            this.g = object2;
                        } else if (object2 != null && this.h == null) {
                            this.h = object2;
                        } else if (object2 == null) {
                            this.g = this.h;
                        }
                        object2 = this.s;
                        if (object2 != null) {
                            ax.Gb.l.c(object2);
                            object2 = object2.iterator();
                            while (object2.hasNext()) {
                                n8 = ((Number)object2.next()).intValue();
                                if (!this.r.contains(n8)) continue;
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ");
                                ((StringBuilder)object2).append(n8);
                                throw new IllegalArgumentException(((StringBuilder)object2).toString().toString());
                            }
                        }
                        h.c c8 = this.i;
                        object2 = c8;
                        if (c8 == null) {
                            object2 = new ax.p2.f();
                        }
                        if (object2 == null) break block12;
                        Object object3 = object2;
                        if (this.o > 0L) {
                            if (this.c == null) throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                            long l8 = this.o;
                            TimeUnit timeUnit = this.p;
                            if (timeUnit == null) throw new IllegalArgumentException("Required value was null.");
                            Executor executor = this.g;
                            if (executor == null) throw new IllegalArgumentException("Required value was null.");
                            ax.k2.e e8 = new ax.k2.e((h.c)object2, new ax.k2.c(l8, timeUnit, executor));
                        }
                        if ((string = this.t) != null || this.u != null) break block13;
                        object2 = var8_7;
                        if (this.v == null) break block14;
                    }
                    if (this.c == null) throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    int n9 = 0;
                    n8 = string == null ? 0 : 1;
                    object2 = this.u;
                    int n10 = object2 == null ? 0 : 1;
                    object = this.v;
                    if (object != null) {
                        n9 = 1;
                    }
                    if (n8 + n10 + n9 != 1) throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    object2 = new z(string, (File)object2, (Callable<InputStream>)object, (h.c)var8_7);
                    break block14;
                }
                object2 = null;
            }
            if (object2 == null) throw new IllegalArgumentException("Required value was null.");
            Context context = this.a;
            String string = this.c;
            e e9 = this.q;
            List<b> list = this.d;
            boolean bl = this.j;
            d d8 = this.k.j(context);
            Executor executor = this.g;
            if (executor == null) throw new IllegalArgumentException("Required value was null.");
            object = this.h;
            if (object == null) throw new IllegalArgumentException("Required value was null.");
            ax.k2.f f8 = new ax.k2.f(context, string, (h.c)object2, e9, list, bl, d8, executor, (Executor)object, this.l, this.m, this.n, this.r, this.t, this.u, this.v, null, this.e, this.f);
            object2 = (u)ax.k2.t.b(this.b, "_Impl");
            ((u)object2).r(f8);
            return (T)object2;
        }

        public a<T> e() {
            this.m = false;
            this.n = true;
            return this;
        }

        public a<T> f(h.c c8) {
            this.i = c8;
            return this;
        }

        public a<T> g(Executor executor) {
            ax.Gb.l.f(executor, "executor");
            this.g = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(ax.o2.g g8) {
            ax.Gb.l.f(g8, "db");
        }

        public void b(ax.o2.g g8) {
            ax.Gb.l.f(g8, "db");
        }

        public void c(ax.o2.g g8) {
            ax.Gb.l.f(g8, "db");
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(ax.Gb.g g8) {
            this();
        }
    }

    public static final class d
    extends Enum<d> {
        public static final /* enum */ d c0;
        public static final /* enum */ d d0;
        private static final d[] e0;
        public static final /* enum */ d q;

        static {
            q = new d();
            c0 = new d();
            d0 = new d();
            e0 = ax.k2.u$d.d();
        }

        private static final /* synthetic */ d[] d() {
            return new d[]{q, c0, d0};
        }

        private final boolean h(ActivityManager activityManager) {
            return ax.o2.c.b(activityManager);
        }

        public static d valueOf(String string) {
            return Enum.valueOf(d.class, string);
        }

        public static d[] values() {
            return (d[])e0.clone();
        }

        public final d j(Context object) {
            ax.Gb.l.f(object, "context");
            if (this != q) {
                return this;
            }
            object = object.getSystemService("activity");
            ax.Gb.l.d(object, "null cannot be cast to non-null type android.app.ActivityManager");
            if (!this.h((ActivityManager)object)) {
                return d0;
            }
            return c0;
        }
    }

    public static class e {
        private final Map<Integer, TreeMap<Integer, ax.l2.b>> a = new LinkedHashMap<Integer, TreeMap<Integer, ax.l2.b>>();

        private final void a(ax.l2.b b8) {
            int n8 = b8.a;
            int n9 = b8.b;
            Map<Integer, TreeMap<Integer, ax.l2.b>> map = this.a;
            Integer n10 = n8;
            Serializable serializable = map.get(n10);
            TreeMap<Integer, ax.l2.b> treeMap = serializable;
            if (serializable == null) {
                treeMap = new TreeMap();
                map.put(n10, treeMap);
            }
            if (treeMap.containsKey(n9)) {
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append("Overriding migration ");
                ((StringBuilder)serializable).append(treeMap.get(n9));
                ((StringBuilder)serializable).append(" with ");
                ((StringBuilder)serializable).append(b8);
                Log.w((String)"ROOM", (String)((StringBuilder)serializable).toString());
            }
            treeMap.put(n9, b8);
        }

        /*
         * WARNING - void declaration
         */
        private final List<ax.l2.b> e(List<ax.l2.b> list, boolean bl, int n8, int n9) {
            block10: {
                int n10;
                block0: do {
                    Object var6_9;
                    if (bl) {
                        if (n8 >= n9) {
                            return list;
                        }
                    } else if (n8 <= n9) break block10;
                    Object object = this.a.get(n8);
                    if (object == null) {
                        return null;
                    }
                    if (bl) {
                        NavigableSet<Integer> navigableSet = ((TreeMap)object).descendingKeySet();
                    } else {
                        Set<Integer> set = ((TreeMap)object).keySet();
                    }
                    for (Integer n11 : var6_9) {
                        if (bl) {
                            ax.Gb.l.e(n11, "targetVersion");
                            n10 = n11;
                            if (n8 + 1 > n10 || n10 > n9) continue;
                        } else {
                            ax.Gb.l.e(n11, "targetVersion");
                            n10 = n11;
                            if (n9 > n10 || n10 >= n8) continue;
                        }
                        object = ((TreeMap)object).get(n11);
                        ax.Gb.l.c(object);
                        list.add((ax.l2.b)object);
                        n8 = n11;
                        n10 = 1;
                        continue block0;
                    }
                    n10 = 0;
                } while (n10 != 0);
                return null;
            }
            return list;
        }

        public void b(ax.l2.b ... bArray) {
            ax.Gb.l.f(bArray, "migrations");
            int n8 = bArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                this.a(bArray[i8]);
            }
        }

        public final boolean c(int n8, int n9) {
            Map<Integer, Object> map = this.f();
            if (map.containsKey(n8)) {
                Map<Integer, ax.l2.b> map2 = map.get(n8);
                map = map2;
                if (map2 == null) {
                    map = F.g();
                }
                return map.containsKey(n9);
            }
            return false;
        }

        public List<ax.l2.b> d(int n8, int n9) {
            if (n8 == n9) {
                return ax.tb.o.j();
            }
            boolean bl = n9 > n8;
            return this.e(new ArrayList<ax.l2.b>(), bl, n8, n9);
        }

        public Map<Integer, Map<Integer, ax.l2.b>> f() {
            return this.a;
        }
    }

    public static abstract class f {
    }
}

