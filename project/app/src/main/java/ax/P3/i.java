/*
 * Decompiled with CFR 0.152.
 */
package ax.P3;

import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import ax.P3.f;
import ax.P3.h;
import ax.P3.j;
import ax.P3.k;
import ax.P3.l;
import ax.P3.m;
import ax.P3.n;
import ax.P3.s;
import ax.P3.v;
import ax.R3.a;
import ax.R3.h;
import ax.g4.g;
import ax.l4.a;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class i
implements k,
h.a,
n.a {
    private final Map<ax.M3.h, j<?>> a;
    private final m b;
    private final ax.R3.h c;
    private final b d;
    private final Map<ax.M3.h, WeakReference<n<?>>> e;
    private final v f;
    private final c g;
    private final a h;
    private ReferenceQueue<n<?>> i;

    public i(ax.R3.h h8, a.a a8, ax.S3.a a9, ax.S3.a a10, ax.S3.a a11) {
        this(h8, a8, a9, a10, a11, null, null, null, null, null, null);
    }

    i(ax.R3.h h8, a.a object, ax.S3.a a8, ax.S3.a a9, ax.S3.a a10, Map<ax.M3.h, j<?>> map, m m8, Map<ax.M3.h, WeakReference<n<?>>> map2, b b8, a a11, v v8) {
        c c8;
        this.c = h8;
        this.g = c8 = new c((a.a)object);
        object = map2;
        if (map2 == null) {
            object = new HashMap();
        }
        this.e = object;
        object = m8;
        if (m8 == null) {
            object = new m();
        }
        this.b = object;
        object = map;
        if (map == null) {
            object = new HashMap();
        }
        this.a = object;
        object = b8;
        if (b8 == null) {
            object = new b(a8, a9, a10, this);
        }
        this.d = object;
        object = a11;
        if (a11 == null) {
            object = new a(c8);
        }
        this.h = object;
        object = v8;
        if (v8 == null) {
            object = new v();
        }
        this.f = object;
        h8.c(this);
    }

    private n<?> e(ax.M3.h object) {
        if ((object = this.c.d((ax.M3.h)object)) == null) {
            return null;
        }
        if (object instanceof n) {
            return (n)object;
        }
        return new n(object, true);
    }

    private ReferenceQueue<n<?>> f() {
        if (this.i == null) {
            this.i = new ReferenceQueue();
            Looper.myQueue().addIdleHandler((MessageQueue.IdleHandler)new e(this.e, this.i));
        }
        return this.i;
    }

    private n<?> h(ax.M3.h h8, boolean bl) {
        if (!bl) {
            return null;
        }
        WeakReference<n<?>> weakReference = this.e.get(h8);
        if (weakReference != null) {
            if ((weakReference = (n)weakReference.get()) != null) {
                ((n)((Object)weakReference)).a();
                return weakReference;
            }
            this.e.remove(h8);
            return weakReference;
        }
        return null;
    }

    private n<?> i(ax.M3.h h8, boolean bl) {
        if (!bl) {
            return null;
        }
        n<?> n8 = this.e(h8);
        if (n8 != null) {
            n8.a();
            this.e.put(h8, new f(h8, n8, this.f()));
        }
        return n8;
    }

    private static void j(String string, long l8, ax.M3.h h8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" in ");
        stringBuilder.append(ax.k4.d.a(l8));
        stringBuilder.append("ms, key: ");
        stringBuilder.append(h8);
        Log.v((String)"Engine", (String)stringBuilder.toString());
    }

    @Override
    public void a(ax.M3.h h8, n<?> n8) {
        ax.k4.i.b();
        if (n8 != null) {
            n8.e(h8, this);
            if (n8.c()) {
                this.e.put(h8, new f(h8, n8, this.f()));
            }
        }
        this.a.remove(h8);
    }

    public void b(ax.M3.h h8, n n8) {
        ax.k4.i.b();
        this.e.remove(h8);
        if (n8.c()) {
            this.c.e(h8, n8);
            return;
        }
        this.f.a(n8);
    }

    @Override
    public void c(s<?> s8) {
        ax.k4.i.b();
        this.f.a(s8);
    }

    @Override
    public void d(j j8, ax.M3.h h8) {
        ax.k4.i.b();
        if (j8.equals(this.a.get(h8))) {
            this.a.remove(h8);
        }
    }

    public <R> d g(ax.J3.e object, Object object2, ax.M3.h h8, int n8, int n9, Class<?> clazz, Class<R> clazz2, ax.J3.g g8, h h9, Map<Class<?>, ax.M3.m<?>> map, boolean bl, boolean bl2, ax.M3.j j8, boolean bl3, boolean bl4, boolean bl5, g g9) {
        ax.k4.i.b();
        long l8 = ax.k4.d.b();
        l l9 = this.b.a(object2, h8, n8, n9, map, clazz, clazz2, j8);
        j<?> j9 = this.i(l9, bl3);
        if (j9 != null) {
            g9.b((s<?>)((Object)j9), ax.M3.a.f0);
            if (Log.isLoggable((String)"Engine", (int)2)) {
                ax.P3.i.j("Loaded resource from cache", l8, l9);
            }
            return null;
        }
        j9 = this.h(l9, bl3);
        if (j9 != null) {
            g9.b((s<?>)((Object)j9), ax.M3.a.f0);
            if (Log.isLoggable((String)"Engine", (int)2)) {
                ax.P3.i.j("Loaded resource from active resources", l8, l9);
            }
            return null;
        }
        j9 = this.a.get(l9);
        if (j9 != null) {
            j9.d(g9);
            if (Log.isLoggable((String)"Engine", (int)2)) {
                ax.P3.i.j("Added to existing load", l8, l9);
            }
            return new d(g9, j9);
        }
        j9 = this.d.a(l9, bl3, bl4);
        object = this.h.a((ax.J3.e)((Object)object), object2, l9, h8, n8, n9, clazz, clazz2, g8, h9, map, bl, bl2, bl5, j8, j9);
        this.a.put(l9, j9);
        j9.d(g9);
        j9.p((ax.P3.f<?>)object);
        if (Log.isLoggable((String)"Engine", (int)2)) {
            ax.P3.i.j("Started new load", l8, l9);
        }
        return new d(g9, j9);
    }

    public void k(s<?> s8) {
        ax.k4.i.b();
        if (s8 instanceof n) {
            ((n)s8).d();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    static class a {
        final f.e a;
        final ax.b0.d<ax.P3.f<?>> b = ax.l4.a.d(150, new a.d<ax.P3.f<?>>(this){
            final a a;
            {
                this.a = a8;
            }

            public ax.P3.f<?> b() {
                a a8 = this.a;
                return new ax.P3.f(a8.a, a8.b);
            }
        });
        private int c;

        a(f.e e8) {
            this.a = e8;
        }

        <R> ax.P3.f<R> a(ax.J3.e e8, Object object, l l8, ax.M3.h h8, int n8, int n9, Class<?> clazz, Class<R> clazz2, ax.J3.g g8, h h9, Map<Class<?>, ax.M3.m<?>> map, boolean bl, boolean bl2, boolean bl3, ax.M3.j j8, f.b<R> b8) {
            ax.P3.f<?> f8 = this.b.b();
            int n10 = this.c;
            this.c = n10 + 1;
            return f8.B(e8, object, l8, h8, n8, n9, clazz, clazz2, g8, h9, map, bl, bl2, bl3, j8, b8, n10);
        }
    }

    static class b {
        final ax.S3.a a;
        final ax.S3.a b;
        final ax.S3.a c;
        final k d;
        final ax.b0.d<j<?>> e = ax.l4.a.d(150, new a.d<j<?>>(this){
            final b a;
            {
                this.a = b8;
            }

            public j<?> b() {
                b b8 = this.a;
                return new j(b8.a, b8.b, b8.c, b8.d, b8.e);
            }
        });

        b(ax.S3.a a8, ax.S3.a a9, ax.S3.a a10, k k8) {
            this.a = a8;
            this.b = a9;
            this.c = a10;
            this.d = k8;
        }

        <R> j<R> a(ax.M3.h h8, boolean bl, boolean bl2) {
            return this.e.b().k(h8, bl, bl2);
        }
    }

    private static class c
    implements f.e {
        private final a.a a;
        private volatile ax.R3.a b;

        public c(a.a a8) {
            this.a = a8;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public ax.R3.a a() {
            if (this.b != null) return this.b;
            synchronized (this) {
                Throwable throwable2;
                block4: {
                    block3: {
                        try {
                            if (this.b != null) break block3;
                            this.b = this.a.g();
                        }
                        catch (Throwable throwable2) {
                            break block4;
                        }
                    }
                    if (this.b != null) return this.b;
                    ax.R3.b b8 = new ax.R3.b();
                    this.b = b8;
                    return this.b;
                }
                throw throwable2;
            }
        }
    }

    public static class d {
        private final j<?> a;
        private final g b;

        public d(g g8, j<?> j8) {
            this.b = g8;
            this.a = j8;
        }

        public void a() {
            this.a.o(this.b);
        }
    }

    private static class e
    implements MessageQueue.IdleHandler {
        private final Map<ax.M3.h, WeakReference<n<?>>> a;
        private final ReferenceQueue<n<?>> b;

        public e(Map<ax.M3.h, WeakReference<n<?>>> map, ReferenceQueue<n<?>> referenceQueue) {
            this.a = map;
            this.b = referenceQueue;
        }

        public boolean queueIdle() {
            f f8 = (f)this.b.poll();
            if (f8 != null) {
                this.a.remove(f8.a);
            }
            return true;
        }
    }

    private static class f
    extends WeakReference<n<?>> {
        final ax.M3.h a;

        public f(ax.M3.h h8, n<?> n8, ReferenceQueue<? super n<?>> referenceQueue) {
            super(n8, referenceQueue);
            this.a = h8;
        }
    }
}

