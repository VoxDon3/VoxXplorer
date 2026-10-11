/*
 * Decompiled with CFR 0.152.
 */
package ax.D7;

import ax.D7.E;
import ax.D7.u;
import ax.Y7.a;
import ax.Y7.b;
import ax.Y7.c;
import ax.Y7.d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

class v
implements d,
c {
    private final Map<Class<?>, j.ConcurrentHashMap<b<Object>, Executor>> a = new HashMap();
    private Queue<a<?>> b = new ArrayDeque();
    private final Executor c;

    v(Executor executor) {
        this.c = executor;
    }

    public static /* synthetic */ void b(Map.Entry entry, a a8) {
        ((b)entry.getKey()).a(a8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Set<Map.Entry<b<Object>, Executor>> d(a<?> set) {
        synchronized (this) {
            try {
                set = (Map)this.a.get(((a)((Object)set)).b());
                if (set != null) return set.entrySet();
                return Collections.EMPTY_SET;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public <T> void a(Class<T> clazz, Executor executor, b<? super T> b8) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        E.b(clazz);
                        E.b(b8);
                        E.b(executor);
                        if (this.a.containsKey(clazz)) break block3;
                        Map<Class<?>, j.ConcurrentHashMap<b<Object>, Executor>> map = this.a;
                        j.ConcurrentHashMap concurrentHashMap = new j.ConcurrentHashMap();
                        map.put(clazz, (j.ConcurrentHashMap<b<Object>, Executor>)concurrentHashMap);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.a.get(clazz).put(b8, (Object)executor);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    void c() {
        Object object;
        block6: {
            block5: {
                // MONITORENTER : this
                object = this.b;
                if (object == null) break block5;
                this.b = null;
                break block6;
            }
            object = null;
        }
        // MONITOREXIT : this
        if (object == null) return;
        object = object.iterator();
        while (object.hasNext()) {
            this.e((a)object.next());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void e(a<?> a8) {
        E.b(a8);
        // MONITORENTER : this
        Object object = this.b;
        if (object != null) {
            object.add(a8);
            // MONITOREXIT : this
            return;
        }
        object = this.d(a8).iterator();
        while (object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            ((Executor)entry.getValue()).execute(new u(entry, a8));
        }
    }
}

