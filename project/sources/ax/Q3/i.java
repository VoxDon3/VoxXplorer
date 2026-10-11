package ax.Q3;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class i implements ax.Q3.b {
    private final g<a, Object> a = new g<>();
    private final b b = new b();
    private final Map<Class<?>, NavigableMap<Integer, Integer>> c = new HashMap();
    private final Map<Class<?>, ax.Q3.a<?>> d = new HashMap();
    private final int e;
    private int f;

    private static final class a implements m {
        private final b a;
        int b;
        private Class<?> c;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // ax.Q3.m
        public void a() {
            this.a.c(this);
        }

        void b(int i, Class<?> cls) {
            this.b = i;
            this.c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.b == aVar.b && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.b * 31;
            Class<?> cls = this.c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.b + "array=" + this.c + '}';
        }
    }

    private static final class b extends c<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.Q3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i, Class<?> cls) {
            a b = b();
            b.b(i, cls);
            return b;
        }
    }

    public i(int i) {
        this.e = i;
    }

    private void e(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> k = k(cls);
        Integer num = k.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                k.remove(Integer.valueOf(i));
                return;
            } else {
                k.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    private void f() {
        g(this.e);
    }

    private void g(int i) {
        while (this.f > i) {
            Object f = this.a.f();
            ax.k4.h.d(f);
            ax.Q3.a h = h(f);
            this.f -= h.b(f) * h.a();
            e(h.b(f), f.getClass());
            if (Log.isLoggable(h.l(), 2)) {
                Log.v(h.l(), "evicted: " + h.b(f));
            }
        }
    }

    private <T> ax.Q3.a<T> h(T t) {
        return i(t.getClass());
    }

    private <T> ax.Q3.a<T> i(Class<T> cls) {
        ax.Q3.a<T> fVar;
        ax.Q3.a<T> aVar = (ax.Q3.a) this.d.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            fVar = new h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            fVar = new f();
        }
        this.d.put(cls, fVar);
        return fVar;
    }

    private <T> T j(a aVar) {
        return (T) this.a.a(aVar);
    }

    private NavigableMap<Integer, Integer> k(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(cls, treeMap);
        return treeMap;
    }

    private boolean l() {
        int i = this.f;
        return i == 0 || this.e / i >= 2;
    }

    private boolean m(int i) {
        return i <= this.e / 2;
    }

    private boolean n(int i, Integer num) {
        if (num != null) {
            return l() || num.intValue() <= i * 8;
        }
        return false;
    }

    @Override // ax.Q3.b
    public synchronized void a(int i) {
        try {
            if (i >= 40) {
                b();
            } else if (i >= 20) {
                g(this.e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ax.Q3.b
    public synchronized void b() {
        g(0);
    }

    @Override // ax.Q3.b
    public synchronized <T> void c(T t, Class<T> cls) {
        ax.Q3.a<T> i = i(cls);
        int b2 = i.b(t);
        int a2 = i.a() * b2;
        if (m(a2)) {
            a e = this.b.e(b2, cls);
            this.a.d(e, t);
            NavigableMap<Integer, Integer> k = k(cls);
            Integer num = k.get(Integer.valueOf(e.b));
            Integer valueOf = Integer.valueOf(e.b);
            int i2 = 1;
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            k.put(valueOf, Integer.valueOf(i2));
            this.f += a2;
            f();
        }
    }

    @Override // ax.Q3.b
    public <T> T d(int i, Class<T> cls) {
        T t;
        ax.Q3.a<T> i2 = i(cls);
        synchronized (this) {
            try {
                Integer ceilingKey = k(cls).ceilingKey(Integer.valueOf(i));
                t = (T) j(n(i, ceilingKey) ? this.b.e(ceilingKey.intValue(), cls) : this.b.e(i, cls));
                if (t != null) {
                    this.f -= i2.b(t) * i2.a();
                    e(i2.b(t), cls);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(i2.l(), 2)) {
            Log.v(i2.l(), "Allocated " + i + " bytes");
        }
        return i2.newArray(i);
    }
}
