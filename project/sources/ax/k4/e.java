package ax.k4;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e<T, Y> {
    private final int b;
    private int c;
    private final LinkedHashMap<T, Y> a = new LinkedHashMap<>(100, 0.75f, true);
    private int d = 0;

    public e(int i) {
        this.b = i;
        this.c = i;
    }

    private void f() {
        m(this.c);
    }

    public void b() {
        m(0);
    }

    public synchronized Y g(T t) {
        return this.a.get(t);
    }

    public synchronized int h() {
        return this.d;
    }

    protected int i(Y y) {
        return 1;
    }

    public synchronized Y k(T t, Y y) {
        if (i(y) >= this.c) {
            j(t, y);
            return null;
        }
        Y put = this.a.put(t, y);
        if (y != null) {
            this.d += i(y);
        }
        if (put != null) {
            this.d -= i(put);
        }
        f();
        return put;
    }

    public synchronized Y l(T t) {
        Y remove;
        remove = this.a.remove(t);
        if (remove != null) {
            this.d -= i(remove);
        }
        return remove;
    }

    protected synchronized void m(int i) {
        while (this.d > i) {
            Map.Entry<T, Y> next = this.a.entrySet().iterator().next();
            Y value = next.getValue();
            this.d -= i(value);
            T key = next.getKey();
            this.a.remove(key);
            j(key, value);
        }
    }

    protected void j(T t, Y y) {
    }
}
