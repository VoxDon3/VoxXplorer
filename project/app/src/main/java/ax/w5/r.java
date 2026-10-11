/*
 * Decompiled with CFR 0.152.
 */
package ax.w5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import ax.q5.e;
import ax.q5.f;
import ax.q5.g;
import ax.s5.c;
import ax.w5.g;
import ax.w5.h;
import ax.w5.i;
import ax.w5.j;
import ax.w5.k;
import ax.w5.l;
import ax.w5.m;
import ax.w5.n;
import ax.w5.o;
import ax.w5.p;
import ax.w5.q;
import ax.w5.x;
import ax.x5.c;
import ax.x5.d;
import ax.y5.a;
import ax.y5.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

public class r {
    private final Context a;
    private final e b;
    private final d c;
    private final x d;
    private final Executor e;
    private final b f;
    private final ax.z5.a g;
    private final ax.z5.a h;
    private final c i;

    public r(Context context, e e8, d d8, x x8, Executor executor, b b8, ax.z5.a a8, ax.z5.a a9, c c8) {
        this.a = context;
        this.b = e8;
        this.c = d8;
        this.d = x8;
        this.e = executor;
        this.f = b8;
        this.g = a8;
        this.h = a9;
        this.i = c8;
    }

    public static /* synthetic */ Iterable a(r r8, ax.p5.p p8) {
        return r8.c.k0(p8);
    }

    public static /* synthetic */ Object b(r r8, Iterable iterable, ax.p5.p p8, long l8) {
        r8.c.N0(iterable);
        r8.c.V(p8, r8.g.a() + l8);
        return null;
    }

    public static /* synthetic */ Object c(r r8) {
        r8.i.b();
        return null;
    }

    public static /* synthetic */ Boolean d(r r8, ax.p5.p p8) {
        return r8.c.s(p8);
    }

    public static /* synthetic */ Object e(r r8, Iterable iterable) {
        r8.c.w(iterable);
        return null;
    }

    public static /* synthetic */ Object f(r r8, ax.p5.p p8, int n8) {
        r8.d.a(p8, n8 + 1);
        return null;
    }

    public static /* synthetic */ Object g(r r8, ax.p5.p p8, long l8) {
        r8.c.V(p8, r8.g.a() + l8);
        return null;
    }

    public static /* synthetic */ Object h(r r8, Map object2) {
        r8.getClass();
        for (Map.Entry entry : object2.entrySet()) {
            r8.i.d(((Integer)entry.getValue()).intValue(), c.b.h0, (String)entry.getKey());
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void i(r r8, ax.p5.p p8, int n8, Runnable runnable2) {
        Throwable throwable222222;
        block5: {
            r8.getClass();
            Object object = r8.f;
            Object object2 = r8.c;
            j.Objects.requireNonNull((Object)object2);
            i i8 = new i((d)object2);
            object.a(i8);
            if (!r8.k()) {
                object2 = r8.f;
                object = new j(r8, p8, n8);
                object2.a(object);
                break block5;
            }
            r8.l(p8, n8);
        }
        runnable2.run();
        return;
        {
            catch (Throwable throwable222222) {
            }
            catch (a a8) {}
            {
                r8.d.a(p8, n8 + 1);
                runnable2.run();
                return;
            }
        }
        runnable2.run();
        throw throwable222222;
    }

    public ax.p5.i j(ax.q5.m m8) {
        Object object = this.f;
        c c8 = this.i;
        j.Objects.requireNonNull((Object)c8);
        object = (ax.s5.a)object.a(new h(c8));
        return m8.a(ax.p5.i.a().i(this.g.a()).o(this.h.a()).n("GDT_CLIENT_METRICS").h(new ax.p5.h(ax.n5.b.b("proto"), ((ax.s5.a)object).f())).d());
    }

    boolean k() {
        NetworkInfo networkInfo = ((ConnectivityManager)this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }

    public ax.q5.g l(ax.p5.p object, int n8) {
        ax.q5.m m8 = this.b.i(((ax.p5.p)object).b());
        Object object2 = ax.q5.g.e(0L);
        long l8 = 0L;
        ax.p5.p p8 = object;
        object = object2;
        while (((Boolean)this.f.a(new k(this, p8))).booleanValue()) {
            long l9;
            Object object3;
            object2 = (Iterable)this.f.a(new l(this, p8));
            if (!object2.iterator().hasNext()) {
                return object;
            }
            if (m8 == null) {
                ax.t5.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", p8);
                object = ax.q5.g.a();
            } else {
                object = new ArrayList();
                object3 = object2.iterator();
                while (object3.hasNext()) {
                    object.add(((ax.x5.k)object3.next()).b());
                }
                if (p8.e()) {
                    object.add(this.j(m8));
                }
                object = m8.b(ax.q5.f.a().b((Iterable<ax.p5.i>)object).c(p8.c()).a());
            }
            if (((ax.q5.g)object).c() == g.a.c0) {
                this.f.a(new m(this, (Iterable)object2, p8, l8));
                this.d.b(p8, n8 + 1, true);
                return object;
            }
            this.f.a(new n(this, (Iterable)object2));
            if (((ax.q5.g)object).c() == g.a.q) {
                l9 = Math.max(l8, ((ax.q5.g)object).b());
                if (p8.e()) {
                    this.f.a(new o(this));
                }
            } else {
                l9 = l8;
                if (((ax.q5.g)object).c() == g.a.e0) {
                    object3 = new HashMap();
                    Iterator iterator = object2.iterator();
                    while (iterator.hasNext()) {
                        object2 = ((ax.x5.k)iterator.next()).b().n();
                        if (!object3.containsKey(object2)) {
                            object3.put(object2, 1);
                            continue;
                        }
                        object3.put(object2, (Integer)object3.get(object2) + 1);
                    }
                    this.f.a(new p(this, (Map)object3));
                    l9 = l8;
                }
            }
            l8 = l9;
        }
        this.f.a(new q(this, p8, l8));
        return object;
    }

    public void m(ax.p5.p p8, int n8, Runnable runnable2) {
        this.e.execute(new g(this, p8, n8, runnable2));
    }
}

