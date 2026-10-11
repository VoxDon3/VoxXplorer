package ax.Z2;

import android.os.SystemClock;
import android.util.LruCache;
import ax.X2.Q;
import ax.c3.C1809B;
import ax.c3.K;
import ax.c3.d0;
import com.voxdon.xplorer.file.AbstractC3595n;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class b {
    private static b d;
    private LruCache<String, C0231b> a = new a(20480);
    private ConcurrentHashMap<String, List<ax.U2.f>> b = new ConcurrentHashMap<>();
    private c c;

    class a extends LruCache<String, C0231b> {
        a(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, C0231b c0231b) {
            return Math.max(1, c0231b.c);
        }
    }

    /* renamed from: ax.Z2.b$b, reason: collision with other inner class name */
    static class C0231b {
        long a = SystemClock.uptimeMillis();
        List<AbstractC3595n> b;
        int c;

        C0231b(List<AbstractC3595n> list) {
            this.b = list;
            this.c = list.size();
        }

        boolean a() {
            return SystemClock.uptimeMillis() - this.a > 1800000;
        }
    }

    public static class c {
        List<AbstractC3595n> a;
        K b;
        String c;
        String d;
        long e;
    }

    private b() {
    }

    public static b k() {
        if (d == null) {
            d = new b();
        }
        return d;
    }

    public synchronized void a(int i) {
        if (i > 15360) {
            try {
                if (i > (k().j() * 3) / 4) {
                    if (i < 30720) {
                        k().w(40960);
                    } else {
                        k().w(81920);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void b() {
        ConcurrentHashMap<String, List<ax.U2.f>> concurrentHashMap = this.b;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
    }

    public synchronized void c() {
        LruCache<String, C0231b> lruCache = this.a;
        if (lruCache != null) {
            lruCache.evictAll();
        }
    }

    public synchronized void d(K k) {
        c cVar = this.c;
        if (cVar == null) {
            return;
        }
        if (cVar.b == k) {
            this.c = null;
        }
    }

    public synchronized void e(AbstractC3595n abstractC3595n) {
        try {
            c cVar = this.c;
            if (cVar == null) {
                return;
            }
            if (cVar.b == abstractC3595n.R()) {
                if (!d0.I(this.c.d, abstractC3595n.E())) {
                    if (d0.G(this.c.d, abstractC3595n.E())) {
                    }
                }
                this.c = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean f(AbstractC3595n abstractC3595n) {
        return g(abstractC3595n) != null;
    }

    public synchronized List<AbstractC3595n> g(AbstractC3595n abstractC3595n) {
        String Q = abstractC3595n.Q();
        if (Q == null) {
            return null;
        }
        return h(Q);
    }

    public synchronized List<AbstractC3595n> h(String str) {
        C0231b c0231b = this.a.get(str);
        if (c0231b == null) {
            return null;
        }
        if (c0231b.a()) {
            this.a.remove(str);
            return null;
        }
        return c0231b.b;
    }

    public synchronized List<ax.U2.f> i(String str) {
        return this.b.get(str);
    }

    public int j() {
        return this.a.maxSize();
    }

    public synchronized List<AbstractC3595n> l(K k, String str, String str2) {
        if (this.c == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        c cVar = this.c;
        if (currentTimeMillis - cVar.e > 300000) {
            this.c = null;
            return null;
        }
        if (cVar.b != k || !cVar.d.equals(str) || !this.c.c.equals(str2)) {
            return null;
        }
        return this.c.a;
    }

    public synchronized void m(AbstractC3595n abstractC3595n, List<AbstractC3595n> list) {
        String Q = abstractC3595n.Q();
        if (Q != null && list != null) {
            this.a.put(Q, new C0231b(list));
            abstractC3595n.d0(list.size());
        }
    }

    public synchronized void n(String str, List<ax.U2.f> list) {
        this.b.put(str, list);
    }

    public synchronized void o(K k, String str, String str2, List<AbstractC3595n> list) {
        c cVar = new c();
        cVar.b = k;
        cVar.d = str;
        cVar.c = str2;
        cVar.a = list;
        cVar.e = System.currentTimeMillis();
        this.c = cVar;
    }

    public synchronized List<AbstractC3595n> p(K k, String str) {
        return r(C1809B.U(k, str));
    }

    public synchronized List<AbstractC3595n> q(AbstractC3595n abstractC3595n) {
        if (abstractC3595n == null) {
            return null;
        }
        return r(abstractC3595n.Q());
    }

    public synchronized List<AbstractC3595n> r(String str) {
        if (str == null) {
            return null;
        }
        C0231b remove = this.a.remove(str);
        if (remove == null) {
            return null;
        }
        return remove.b;
    }

    public synchronized void s(K k, String str) {
        if (str == null) {
            return;
        }
        u(C1809B.U(k, str));
    }

    public synchronized void t(AbstractC3595n abstractC3595n) {
        u(abstractC3595n.Q());
    }

    public synchronized void u(String str) {
        if (str == null) {
            return;
        }
        List<AbstractC3595n> r = r(str);
        if (r == null) {
            return;
        }
        Iterator<AbstractC3595n> it = r.iterator();
        while (it.hasNext()) {
            u(it.next().Q());
        }
    }

    public synchronized void v(AbstractC3595n abstractC3595n) {
        if (abstractC3595n == null) {
            return;
        }
        List<AbstractC3595n> q = q(abstractC3595n);
        if (q == null) {
            return;
        }
        Iterator<AbstractC3595n> it = q.iterator();
        while (it.hasNext()) {
            q(it.next());
        }
    }

    public synchronized void w(int i) {
        if (Q.d1() && this.a.maxSize() < i) {
            this.a.resize(i);
        }
    }

    public synchronized void x(int i) {
        if (Q.d1() && i >= 256) {
            w(40960);
        }
    }
}
