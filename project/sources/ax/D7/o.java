package ax.D7;

import android.util.Log;
import ax.D7.o;
import ax.a8.InterfaceC1430a;
import ax.f1.C2015i;
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

/* loaded from: classes3.dex */
public class o implements InterfaceC0663e, ax.T7.a {
    private static final ax.a8.b<Set<Object>> i = new ax.a8.b() { // from class: ax.D7.k
        @Override // ax.a8.b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };
    private final Map<C0661c<?>, ax.a8.b<?>> a;
    private final Map<F<?>, ax.a8.b<?>> b;
    private final Map<F<?>, y<?>> c;
    private final List<ax.a8.b<ComponentRegistrar>> d;
    private Set<String> e;
    private final v f;
    private final AtomicReference<Boolean> g;
    private final j h;

    public static final class b {
        private final Executor a;
        private final List<ax.a8.b<ComponentRegistrar>> b = new ArrayList();
        private final List<C0661c<?>> c = new ArrayList();
        private j d = j.a;

        b(Executor executor) {
            this.a = executor;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(C0661c<?> c0661c) {
            this.c.add(c0661c);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.b.add(new ax.a8.b() { // from class: ax.D7.p
                @Override // ax.a8.b
                public final Object get() {
                    return o.b.a(ComponentRegistrar.this);
                }
            });
            return this;
        }

        public b d(Collection<ax.a8.b<ComponentRegistrar>> collection) {
            this.b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.a, this.b, this.c, this.d);
        }

        public b f(j jVar) {
            this.d = jVar;
            return this;
        }
    }

    public static /* synthetic */ Object j(o oVar, C0661c c0661c) {
        oVar.getClass();
        return c0661c.h().a(new G(c0661c, oVar));
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List<C0661c<?>> list) {
        int i2;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<ax.a8.b<ComponentRegistrar>> it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (w e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator<C0661c<?>> it2 = list.iterator();
            while (true) {
                i2 = 0;
                if (!it2.hasNext()) {
                    break;
                }
                Object[] array = it2.next().j().toArray();
                int length = array.length;
                while (true) {
                    if (i2 < length) {
                        Object obj = array[i2];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.e.add(obj.toString());
                        }
                        i2++;
                    }
                }
            }
            if (this.a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            for (final C0661c<?> c0661c : list) {
                this.a.put(c0661c, new x(new ax.a8.b() { // from class: ax.D7.l
                    @Override // ax.a8.b
                    public final Object get() {
                        return o.j(o.this, c0661c);
                    }
                }));
            }
            arrayList.addAll(t(list));
            arrayList.addAll(u());
            s();
        }
        int size = arrayList.size();
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ((Runnable) obj2).run();
        }
        r();
    }

    private void o(Map<C0661c<?>, ax.a8.b<?>> map, boolean z) {
        for (Map.Entry<C0661c<?>, ax.a8.b<?>> entry : map.entrySet()) {
            C0661c<?> key = entry.getKey();
            ax.a8.b<?> value = entry.getValue();
            if (key.n() || (key.o() && z)) {
                value.get();
            }
        }
        this.f.c();
    }

    private static <T> List<T> q(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private void r() {
        Boolean bool = this.g.get();
        if (bool != null) {
            o(this.a, bool.booleanValue());
        }
    }

    private void s() {
        for (C0661c<?> c0661c : this.a.keySet()) {
            for (r rVar : c0661c.g()) {
                if (rVar.g() && !this.c.containsKey(rVar.c())) {
                    this.c.put(rVar.c(), y.b(Collections.EMPTY_SET));
                } else if (this.b.containsKey(rVar.c())) {
                    continue;
                } else {
                    if (rVar.f()) {
                        throw new z(String.format("Unsatisfied dependency for component %s: %s", c0661c, rVar.c()));
                    }
                    if (!rVar.g()) {
                        this.b.put(rVar.c(), D.e());
                    }
                }
            }
        }
    }

    private List<Runnable> t(List<C0661c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C0661c<?> c0661c : list) {
            if (c0661c.p()) {
                final ax.a8.b<?> bVar = this.a.get(c0661c);
                for (F<? super Object> f : c0661c.j()) {
                    if (this.b.containsKey(f)) {
                        final D d = (D) this.b.get(f);
                        arrayList.add(new Runnable() { // from class: ax.D7.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                D.this.g(bVar);
                            }
                        });
                    } else {
                        this.b.put(f, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> u() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<C0661c<?>, ax.a8.b<?>> entry : this.a.entrySet()) {
            C0661c<?> key = entry.getKey();
            if (!key.p()) {
                ax.a8.b<?> value = entry.getValue();
                for (F<? super Object> f : key.j()) {
                    if (!hashMap.containsKey(f)) {
                        hashMap.put(f, new HashSet());
                    }
                    ((Set) hashMap.get(f)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.c.containsKey(entry2.getKey())) {
                final y<?> yVar = this.c.get(entry2.getKey());
                for (final ax.a8.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: ax.D7.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            y.this.a(bVar);
                        }
                    });
                }
            } else {
                this.c.put((F) entry2.getKey(), y.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // ax.D7.InterfaceC0663e
    public /* synthetic */ Object a(Class cls) {
        return C0662d.b(this, cls);
    }

    @Override // ax.D7.InterfaceC0663e
    public synchronized <T> ax.a8.b<Set<T>> b(F<T> f) {
        y<?> yVar = this.c.get(f);
        if (yVar != null) {
            return yVar;
        }
        return (ax.a8.b<Set<T>>) i;
    }

    @Override // ax.D7.InterfaceC0663e
    public /* synthetic */ Object c(F f) {
        return C0662d.a(this, f);
    }

    @Override // ax.D7.InterfaceC0663e
    public /* synthetic */ ax.a8.b d(Class cls) {
        return C0662d.d(this, cls);
    }

    @Override // ax.D7.InterfaceC0663e
    public /* synthetic */ Set e(F f) {
        return C0662d.e(this, f);
    }

    @Override // ax.D7.InterfaceC0663e
    public /* synthetic */ Set f(Class cls) {
        return C0662d.f(this, cls);
    }

    @Override // ax.D7.InterfaceC0663e
    public synchronized <T> ax.a8.b<T> g(F<T> f) {
        E.c(f, "Null interface requested.");
        return (ax.a8.b) this.b.get(f);
    }

    @Override // ax.D7.InterfaceC0663e
    public <T> InterfaceC1430a<T> h(F<T> f) {
        ax.a8.b<T> g = g(f);
        return g == null ? D.e() : g instanceof D ? (D) g : D.f(g);
    }

    @Override // ax.D7.InterfaceC0663e
    public /* synthetic */ InterfaceC1430a i(Class cls) {
        return C0662d.c(this, cls);
    }

    public void p(boolean z) {
        HashMap hashMap;
        if (C2015i.a(this.g, null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.a);
            }
            o(hashMap, z);
        }
    }

    private o(Executor executor, Iterable<ax.a8.b<ComponentRegistrar>> iterable, Collection<C0661c<?>> collection, j jVar) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = new HashSet();
        this.g = new AtomicReference<>();
        v vVar = new v(executor);
        this.f = vVar;
        this.h = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C0661c.q(vVar, v.class, ax.Y7.d.class, ax.Y7.c.class));
        arrayList.add(C0661c.q(this, ax.T7.a.class, new Class[0]));
        for (C0661c<?> c0661c : collection) {
            if (c0661c != null) {
                arrayList.add(c0661c);
            }
        }
        this.d = q(iterable);
        n(arrayList);
    }
}
