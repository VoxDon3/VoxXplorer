package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class p {
    private final Map<String, Object> a = new HashMap();
    private final Set<Closeable> b = new LinkedHashSet();
    private volatile boolean c = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    final void a() {
        this.c = true;
        Map<String, Object> map = this.a;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator<Object> it = this.a.values().iterator();
                    while (it.hasNext()) {
                        b(it.next());
                    }
                } finally {
                }
            }
        }
        Set<Closeable> set = this.b;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator<Closeable> it2 = this.b.iterator();
                    while (it2.hasNext()) {
                        b(it2.next());
                    }
                } finally {
                }
            }
        }
        d();
    }

    <T> T c(String str) {
        T t;
        Map<String, Object> map = this.a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.a.get(str);
        }
        return t;
    }

    protected void d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T> T e(String str, T t) {
        Object obj;
        synchronized (this.a) {
            try {
                obj = this.a.get(str);
                if (obj == 0) {
                    this.a.put(str, t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != 0) {
            t = obj;
        }
        if (this.c) {
            b(t);
        }
        return t;
    }
}
