/*
 * Decompiled with CFR 0.152.
 */
package ax.Z2;

import android.os.SystemClock;
import android.util.LruCache;
import ax.U2.f;
import ax.X2.Q;
import ax.c3.B;
import ax.c3.K;
import ax.c3.d0;
import com.alphainventor.filemanager.file.n;
import java.util.List;

public class b {
    private static b d;
    private LruCache<String, b> a = new LruCache<String, b>(this, 20480){
        final b a;
        {
            this.a = b8;
            super(n8);
        }

        protected int a(String string, b b8) {
            return Math.max(1, b8.c);
        }
    };
    private j.ConcurrentHashMap<String, List<f>> b = new j.ConcurrentHashMap();
    private c c;

    private b() {
    }

    public static b k() {
        if (d == null) {
            d = new b();
        }
        return d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(int n8) {
        synchronized (this) {
            block4: {
                if (n8 > 15360) {
                    Throwable throwable2;
                    block6: {
                        block5: {
                            try {
                                if (n8 <= ax.Z2.b.k().j() * 3 / 4) break block4;
                                if (n8 >= 30720) break block5;
                                ax.Z2.b.k().w(40960);
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        ax.Z2.b.k().w(81920);
                        break block4;
                    }
                    throw throwable2;
                }
            }
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        j.ConcurrentHashMap<String, List<f>> concurrentHashMap = this.b;
                        if (concurrentHashMap == null) break block4;
                        concurrentHashMap.clear();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        LruCache<String, b> lruCache = this.a;
                        if (lruCache == null) break block4;
                        lruCache.evictAll();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d(K k8) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                c c8;
                block5: {
                    try {
                        c8 = this.c;
                        if (c8 != null) break block5;
                    }
                    catch (Throwable throwable2) {}
                    return;
                }
                if (c8.b != k8) break block6;
                this.c = null;
            }
            return;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e(n n8) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                c c8;
                block5: {
                    try {
                        c8 = this.c;
                        if (c8 != null) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                if (c8.b == n8.R() && (d0.I(this.c.d, n8.E()) || d0.G(this.c.d, n8.E()))) {
                    this.c = null;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean f(n object) {
        synchronized (this) {
            object = this.g((n)object);
            if (object == null) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<n> g(n list) {
        synchronized (this) {
            list = ((n)((Object)list)).Q();
            if (list != null) return this.h((String)((Object)list));
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<n> h(String object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                b b8;
                block4: {
                    try {
                        b8 = (b)this.a.get(object);
                        if (b8 != null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    return null;
                }
                if (!b8.a()) return b8.b;
                this.a.remove(object);
                return null;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<f> i(String object) {
        synchronized (this) {
            return (List)this.b.get(object);
        }
    }

    public int j() {
        return this.a.maxSize();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<n> l(K object, String string, String string2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                c c8;
                block6: {
                    try {
                        c8 = this.c;
                        if (c8 != null) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    return null;
                }
                long l8 = System.currentTimeMillis();
                c8 = this.c;
                if (l8 - c8.e > 300000L) {
                    this.c = null;
                    return null;
                }
                if (c8.b != object) return null;
                if (!c8.d.equals(string)) return null;
                if (!this.c.c.equals(string2)) return null;
                return this.c.a;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void m(n n8, List<n> list) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        String string = n8.Q();
                        if (string == null || list == null) break block4;
                        LruCache<String, b> lruCache = this.a;
                        b b8 = new b(list);
                        lruCache.put((Object)string, (Object)b8);
                        n8.d0(list.size());
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void n(String string, List<f> list) {
        synchronized (this) {
            this.b.put((Object)string, list);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void o(K k8, String string, String string2, List<n> list) {
        synchronized (this) {
            c c8 = new c();
            c8.b = k8;
            c8.d = string;
            c8.c = string2;
            c8.a = list;
            c8.e = System.currentTimeMillis();
            this.c = c8;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<n> p(K object, String string) {
        synchronized (this) {
            return this.r(B.U((K)object, string));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<n> q(n object) {
        synchronized (this) {
            if (object != null) return this.r(((n)object).Q());
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<n> r(String list) {
        synchronized (this) {
            if (list == null) {
                return null;
            }
            if ((list = (b)this.a.remove((Object)list)) != null) return ((b)((Object)list)).b;
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void s(K k8, String string) {
        synchronized (this) {
            if (string == null) {
                return;
            }
            this.u(B.U(k8, string));
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void t(n n8) {
        synchronized (this) {
            this.u(n8.Q());
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void u(String iterator) {
        synchronized (this) {
            block7: {
                if (iterator == null) {
                    return;
                }
                iterator = this.r((String)((Object)iterator));
                if (iterator != null) break block7;
                return;
            }
            try {
                iterator = iterator.iterator();
                while (iterator.hasNext()) {
                    this.u(((n)iterator.next()).Q());
                }
            }
            catch (Throwable throwable) {}
            return;
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void v(n iterator) {
        synchronized (this) {
            block7: {
                if (iterator == null) {
                    return;
                }
                iterator = this.q((n)((Object)iterator));
                if (iterator != null) break block7;
                return;
            }
            try {
                iterator = iterator.iterator();
                while (iterator.hasNext()) {
                    this.q((n)iterator.next());
                }
            }
            catch (Throwable throwable) {}
            return;
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void w(int n8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (!Q.d1() || this.a.maxSize() >= n8) break block4;
                        this.a.resize(n8);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void x(int n8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (!Q.d1() || n8 < 256) break block4;
                        this.w(40960);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    static class b {
        long a;
        List<n> b;
        int c;

        b(List<n> list) {
            this.b = list;
            this.a = SystemClock.uptimeMillis();
            this.c = list.size();
        }

        boolean a() {
            return SystemClock.uptimeMillis() - this.a > 1800000L;
        }
    }

    public static class c {
        List<n> a;
        K b;
        String c;
        String d;
        long e;
    }
}

