/*
 * Decompiled with CFR 0.152.
 */
package ax.Q3;

import android.util.Log;
import ax.Q3.c;
import ax.Q3.f;
import ax.Q3.g;
import ax.Q3.h;
import ax.Q3.m;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class i
implements ax.Q3.b {
    private final g<a, Object> a = new g();
    private final b b = new b();
    private final Map<Class<?>, NavigableMap<Integer, Integer>> c = new HashMap();
    private final Map<Class<?>, ax.Q3.a<?>> d = new HashMap();
    private final int e;
    private int f;

    public i(int n8) {
        this.e = n8;
    }

    private void e(int n8, Class<?> serializable) {
        NavigableMap<Integer, Integer> navigableMap = this.k((Class<?>)serializable);
        if ((serializable = (Integer)navigableMap.get(n8)) != null) {
            if ((Integer)serializable == 1) {
                navigableMap.remove(n8);
                return;
            }
            navigableMap.put(n8, (Integer)serializable - 1);
            return;
        }
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("Tried to decrement empty size, size: ");
        ((StringBuilder)serializable).append(n8);
        ((StringBuilder)serializable).append(", this: ");
        ((StringBuilder)serializable).append(this);
        throw new NullPointerException(((StringBuilder)serializable).toString());
    }

    private void f() {
        this.g(this.e);
    }

    private void g(int n8) {
        while (this.f > n8) {
            Object object = this.a.f();
            ax.k4.h.d(object);
            ax.Q3.a<Object> a8 = this.h(object);
            this.f -= a8.b(object) * a8.a();
            this.e(a8.b(object), object.getClass());
            if (!Log.isLoggable((String)a8.l(), (int)2)) continue;
            String string = a8.l();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("evicted: ");
            stringBuilder.append(a8.b(object));
            Log.v((String)string, (String)stringBuilder.toString());
        }
    }

    private <T> ax.Q3.a<T> h(T t8) {
        return this.i(t8.getClass());
    }

    private <T> ax.Q3.a<T> i(Class<T> clazz) {
        Object object;
        block2: {
            block5: {
                block4: {
                    block3: {
                        object = this.d.get(clazz);
                        if (object != null) break block2;
                        if (!clazz.equals(int[].class)) break block3;
                        object = new h();
                        break block4;
                    }
                    if (!clazz.equals(byte[].class)) break block5;
                    object = new f();
                }
                this.d.put(clazz, (ax.Q3.a<?>)object);
                return object;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("No array pool found for: ");
            ((StringBuilder)object).append(clazz.getSimpleName());
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        return object;
    }

    private <T> T j(a a8) {
        return (T)this.a.a(a8);
    }

    private NavigableMap<Integer, Integer> k(Class<?> clazz) {
        NavigableMap<Integer, Integer> navigableMap;
        NavigableMap<Integer, Integer> navigableMap2 = navigableMap = this.c.get(clazz);
        if (navigableMap == null) {
            navigableMap2 = new TreeMap<Integer, Integer>();
            this.c.put(clazz, navigableMap2);
        }
        return navigableMap2;
    }

    private boolean l() {
        int n8 = this.f;
        return n8 == 0 || this.e / n8 >= 2;
        {
        }
    }

    private boolean m(int n8) {
        return n8 <= this.e / 2;
    }

    private boolean n(int n8, Integer n9) {
        return n9 != null && (this.l() || n9 <= n8 * 8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(int n8) {
        synchronized (this) {
            block6: {
                Throwable throwable2;
                block5: {
                    if (n8 >= 40) {
                        try {
                            this.b();
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    if (n8 >= 20) {
                        this.g(this.e / 2);
                    }
                    break block6;
                }
                throw throwable2;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b() {
        synchronized (this) {
            this.g(0);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public <T> void c(T object, Class<T> constable) {
        synchronized (this) {
            Object object2 = this.i((Class<T>)constable);
            int n8 = object2.b(object);
            int n9 = object2.a() * n8;
            boolean bl = this.m(n9);
            if (!bl) {
                return;
            }
            object2 = this.b.e(n8, (Class<?>)constable);
            this.a.d((a)object2, object);
            object = this.k((Class<?>)constable);
            constable = (Integer)object.get(((a)object2).b);
            int n10 = ((a)object2).b;
            n8 = 1;
            if (constable != null) {
                n8 = 1 + (Integer)constable;
            }
            object.put(n10, n8);
            this.f += n9;
            this.f();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public <T> T d(int n8, Class<T> serializable) {
        ax.Q3.a<Object> a8 = this.i((Class<T>)serializable);
        // MONITORENTER : this
        Object object = this.k((Class<?>)serializable).ceilingKey(n8);
        object = this.n(n8, (Integer)object) ? this.b.e((Integer)object, (Class<?>)serializable) : this.b.e(n8, (Class<?>)serializable);
        object = this.j((a)object);
        if (object != null) {
            this.f -= a8.b(object) * a8.a();
            this.e(a8.b(object), (Class<?>)serializable);
        }
        // MONITOREXIT : this
        if (object != null) return (T)object;
        if (!Log.isLoggable((String)a8.l(), (int)2)) return a8.newArray(n8);
        object = a8.l();
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("Allocated ");
        ((StringBuilder)serializable).append(n8);
        ((StringBuilder)serializable).append(" bytes");
        Log.v((String)object, (String)((StringBuilder)serializable).toString());
        return a8.newArray(n8);
    }

    private static final class a
    implements m {
        private final b a;
        int b;
        private Class<?> c;

        a(b b8) {
            this.a = b8;
        }

        @Override
        public void a() {
            this.a.c(this);
        }

        void b(int n8, Class<?> clazz) {
            this.b = n8;
            this.c = clazz;
        }

        public boolean equals(Object object) {
            if (object instanceof a) {
                object = (a)object;
                if (this.b == ((a)object).b && this.c == ((a)object).c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int n8 = this.b;
            Class<?> clazz = this.c;
            int n9 = clazz != null ? clazz.hashCode() : 0;
            return n8 * 31 + n9;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Key{size=");
            stringBuilder.append(this.b);
            stringBuilder.append("array=");
            stringBuilder.append(this.c);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    private static final class b
    extends c<a> {
        b() {
        }

        protected a d() {
            return new a(this);
        }

        a e(int n8, Class<?> clazz) {
            a a8 = (a)this.b();
            a8.b(n8, clazz);
            return a8;
        }
    }
}

