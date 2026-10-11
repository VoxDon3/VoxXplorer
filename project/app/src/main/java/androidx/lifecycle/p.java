/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public abstract class p {
    private final Map<String, Object> a = new HashMap<String, Object>();
    private final Set<Closeable> b = new LinkedHashSet<Closeable>();
    private volatile boolean c = false;

    private static void b(Object object) {
        if (object instanceof Closeable) {
            try {
                ((Closeable)object).close();
                return;
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void a() {
        Iterator<Object> iterator;
        this.c = true;
        Map<String, Object> map = this.a;
        if (map != null) {
            synchronized (map) {
                try {
                    iterator = this.a.values().iterator();
                    while (iterator.hasNext()) {
                        p.b(iterator.next());
                    }
                }
                catch (Throwable throwable) {
                }
                throw throwable;
            }
        }
        if ((map = this.b) != null) {
            synchronized (map) {
                try {
                    iterator = this.b.iterator();
                    while (iterator.hasNext()) {
                        p.b((Closeable)iterator.next());
                    }
                }
                catch (Throwable throwable) {
                }
                throw throwable;
            }
        }
        this.d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    <T> T c(String object) {
        Map<String, Object> map = this.a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            object = this.a.get(object);
            return (T)object;
        }
    }

    protected void d() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    <T> T e(String string, T object) {
        Map<String, Object> map = this.a;
        // MONITORENTER : map
        Object object2 = this.a.get(string);
        if (object2 == null) {
            this.a.put(string, object);
        }
        if (object2 != null) {
            object = object2;
        }
        if (!this.c) return (T)object;
        p.b(object);
        return (T)object;
    }
}

