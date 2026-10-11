/*
 * Decompiled with CFR 0.152.
 */
package ax.D7;

import android.util.Log;
import ax.D7.D;
import ax.D7.E;
import ax.D7.F;
import ax.D7.G;
import ax.D7.c;
import ax.D7.d;
import ax.D7.e;
import ax.D7.j;
import ax.D7.k;
import ax.D7.l;
import ax.D7.m;
import ax.D7.n;
import ax.D7.p;
import ax.D7.q;
import ax.D7.r;
import ax.D7.v;
import ax.D7.w;
import ax.D7.x;
import ax.D7.y;
import ax.D7.z;
import ax.a8.a;
import ax.f1.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public class o
implements e,
ax.T7.a {
    private static final ax.a8.b<Set<Object>> i = new k();
    private final Map<c<?>, ax.a8.b<?>> a = new HashMap();
    private final Map<F<?>, ax.a8.b<?>> b = new HashMap();
    private final Map<F<?>, y<?>> c = new HashMap();
    private final List<ax.a8.b<ComponentRegistrar>> d;
    private Set<String> e = new HashSet<String>();
    private final v f;
    private final AtomicReference<Boolean> g = new AtomicReference();
    private final j h;

    private o(Executor object, Iterable<ax.a8.b<ComponentRegistrar>> iterable, Collection<c<?>> object2, j object3) {
        v v8;
        this.f = v8 = new v((Executor)object);
        this.h = object3;
        object = new ArrayList();
        object.add(ax.D7.c.q(v8, v.class, ax.Y7.d.class, ax.Y7.c.class));
        object.add(ax.D7.c.q(this, ax.T7.a.class, new Class[0]));
        object3 = object2.iterator();
        while (object3.hasNext()) {
            object2 = (c)object3.next();
            if (object2 == null) continue;
            object.add(object2);
        }
        this.d = o.q(iterable);
        this.n((List<c<?>>)object);
    }

    public static /* synthetic */ Object j(o o8, c c8) {
        o8.getClass();
        return c8.h().a(new G(c8, o8));
    }

    public static /* synthetic */ void k(D d8, ax.a8.b b8) {
        d8.g(b8);
    }

    public static /* synthetic */ void l(y y8, ax.a8.b b8) {
        y8.a(b8);
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void n(List<c<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList<Runnable>();
        synchronized (this) {
            x x8;
            Object object;
            try {
                object = this.d.iterator();
                while (object.hasNext()) {
                    x8 = object.next();
                    try {
                        if ((x8 = (ComponentRegistrar)x8.get()) == null) continue;
                        list.addAll(this.h.a((ComponentRegistrar)((Object)x8)));
                        object.remove();
                    }
                    catch (w w8) {
                        object.remove();
                        Log.w((String)"ComponentDiscovery", (String)"Invalid component registrar.", (Throwable)w8);
                    }
                }
                x8 = list.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            block9: while (true) {
                boolean bl = x8.hasNext();
                int n8 = 0;
                int n9 = 0;
                if (!bl) {
                    if (this.a.isEmpty()) {
                        q.a(list);
                    } else {
                        object = new ArrayList(this.a.keySet());
                        ((ArrayList)object).addAll(list);
                        q.a(object);
                    }
                    for (c<?> c8 : list) {
                        object = new l(this, c8);
                        x8 = new x(object);
                        this.a.put(c8, x8);
                    }
                    arrayList.addAll(this.t(list));
                    arrayList.addAll(this.u());
                    this.s();
                    // MONITOREXIT @DISABLED, blocks:[18, 5, 9] lbl48 : MonitorExitStatement: MONITOREXIT : this
                    n9 = arrayList.size();
                    while (true) {
                        if (n8 >= n9) {
                            this.r();
                            return;
                        }
                        list = arrayList.get(n8);
                        ++n8;
                        ((Runnable)((Object)list)).run();
                    }
                }
                object = ((c)x8.next()).j().toArray();
                int n10 = ((Object[])object).length;
                n8 = n9;
                while (true) {
                    if (n8 >= n10) continue block9;
                    {
                        Object object2 = object[n8];
                        if (object2.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.e.contains(object2.toString())) {
                                x8.remove();
                                continue block9;
                            }
                            this.e.add(object2.toString());
                        }
                        ++n8;
                        continue;
                    }
                    break;
                }
                break;
            }
        }
    }

    private void o(Map<c<?>, ax.a8.b<?>> object, boolean bl) {
        for (Map.Entry entry : object.entrySet()) {
            c c8 = (c)entry.getKey();
            ax.a8.b object2 = (ax.a8.b)entry.getValue();
            if (!c8.n() && (!c8.o() || !bl)) continue;
            object2.get();
        }
        this.f.c();
    }

    private static <T> List<T> q(Iterable<T> object) {
        ArrayList arrayList = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(object.next());
        }
        return arrayList;
    }

    private void r() {
        Boolean bl = this.g.get();
        if (bl != null) {
            this.o(this.a, bl);
        }
    }

    private void s() {
        for (c<?> c8 : this.a.keySet()) {
            for (r r8 : c8.g()) {
                if (r8.g() && !this.c.containsKey(r8.c())) {
                    this.c.put(r8.c(), y.b(Collections.EMPTY_SET));
                    continue;
                }
                if (this.b.containsKey(r8.c())) continue;
                if (!r8.f()) {
                    if (r8.g()) continue;
                    this.b.put(r8.c(), D.e());
                    continue;
                }
                throw new z(String.format("Unsatisfied dependency for component %s: %s", c8, r8.c()));
            }
        }
    }

    private List<Runnable> t(List<c<?>> object) {
        ArrayList<Runnable> arrayList = new ArrayList<Runnable>();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            c c8 = (c)iterator.next();
            if (!c8.p()) continue;
            object = this.a.get(c8);
            for (F f8 : c8.j()) {
                if (!this.b.containsKey(f8)) {
                    this.b.put(f8, object);
                    continue;
                }
                arrayList.add(new m((D)this.b.get(f8), object));
            }
        }
        return arrayList;
    }

    private List<Runnable> u() {
        ArrayList<Runnable> arrayList = new ArrayList<Runnable>();
        Object object = new HashMap();
        for (Map.Entry<c<?>, ax.a8.b<?>> entry : this.a.entrySet()) {
            c<?> c8 = entry.getKey();
            if (c8.p()) continue;
            ax.a8.b<?> b8 = entry.getValue();
            for (F<?> f8 : c8.j()) {
                if (!object.containsKey(f8)) {
                    object.put(f8, new HashSet());
                }
                ((Set)object.get(f8)).add(b8);
            }
        }
        for (Map.Entry<c<Object>, ax.a8.b<Object>> entry : object.entrySet()) {
            if (!this.c.containsKey(entry.getKey())) {
                this.c.put((F)((Object)entry.getKey()), y.b((Collection)((Object)entry.getValue())));
                continue;
            }
            object = this.c.get(entry.getKey());
            Iterator iterator = ((Set)((Object)entry.getValue())).iterator();
            while (iterator.hasNext()) {
                arrayList.add(new n((y)object, (ax.a8.b)iterator.next()));
            }
        }
        return arrayList;
    }

    public /* synthetic */ Object a(Class clazz) {
        return ax.D7.d.b(this, clazz);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public <T> ax.a8.b<Set<T>> b(F<T> b8) {
        synchronized (this) {
            b8 = this.c.get(b8);
            if (b8 == null) return i;
            return b8;
        }
    }

    public /* synthetic */ Object c(F f8) {
        return ax.D7.d.a(this, f8);
    }

    public /* synthetic */ ax.a8.b d(Class clazz) {
        return ax.D7.d.d(this, clazz);
    }

    public /* synthetic */ Set e(F f8) {
        return ax.D7.d.e(this, f8);
    }

    public /* synthetic */ Set f(Class clazz) {
        return ax.D7.d.f(this, clazz);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public <T> ax.a8.b<T> g(F<T> object) {
        synchronized (this) {
            E.c(object, "Null interface requested.");
            return this.b.get(object);
        }
    }

    @Override
    public <T> a<T> h(F<T> object) {
        if ((object = this.g((F<T>)object)) == null) {
            return D.e();
        }
        if (object instanceof D) {
            return (D)object;
        }
        return D.f(object);
    }

    public /* synthetic */ a i(Class clazz) {
        return ax.D7.d.c(this, clazz);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void p(boolean bl) {
        HashMap hashMap;
        if (!ax.f1.i.a(this.g, null, bl)) {
            return;
        }
        synchronized (this) {
            hashMap = new HashMap(this.a);
        }
        this.o(hashMap, bl);
    }

    public static final class b {
        private final Executor a;
        private final List<ax.a8.b<ComponentRegistrar>> b = new ArrayList<ax.a8.b<ComponentRegistrar>>();
        private final List<c<?>> c = new ArrayList();
        private j d = j.a;

        b(Executor executor) {
            this.a = executor;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(c<?> c8) {
            this.c.add(c8);
            return this;
        }

        public b c(ComponentRegistrar componentRegistrar) {
            this.b.add(new p(componentRegistrar));
            return this;
        }

        public b d(Collection<ax.a8.b<ComponentRegistrar>> collection) {
            this.b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.a, this.b, this.c, this.d);
        }

        public b f(j j8) {
            this.d = j8;
            return this;
        }
    }
}

