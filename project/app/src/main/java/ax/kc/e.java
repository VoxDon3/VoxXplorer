/*
 * Decompiled with CFR 0.152.
 */
package ax.kc;

import ax.cc.d;
import ax.hc.g;
import ax.kc.f;
import java.util.Collection;
import java.util.Comparator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public class e {
    public static final Comparator<e> f = new Comparator<e>(){

        public int a(e e8, e e9) {
            int n8 = Integer.valueOf(e9.c()).compareTo(e8.c());
            if (n8 == 0) {
                return e9.a.compareTo(e8.a);
            }
            return n8;
        }
    };
    private final UUID a = UUID.randomUUID();
    protected final Collection<Object> b;
    private final g c;
    private final f d;
    private final CopyOnWriteArrayList<Runnable> e = new CopyOnWriteArrayList();

    e(f f8, g g8, Collection<Object> collection) {
        this.d = f8;
        this.c = g8;
        this.b = collection;
    }

    public Class[] b() {
        return this.d.a().d();
    }

    public int c() {
        return this.d.a().g();
    }

    public boolean d(Class<?> clazz) {
        return this.d.a().h(clazz);
    }

    public void e(d d8, Object object) {
        if (!this.b.isEmpty()) {
            this.c.a(d8, object, this.b);
        }
    }

    public void f(Object runnableArray) {
        this.b.add(runnableArray);
        runnableArray = this.e;
        runnableArray = runnableArray.toArray(new Runnable[0]);
        int n8 = runnableArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            runnableArray[i8].run();
        }
    }
}

