package ax.B;

import ax.sb.t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class j<K, V> {
    private int a;
    private final ax.C.c<K, V> b;
    private final ax.C.b c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public j(int i) {
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.b = new ax.C.c<>(0, 0.75f);
        this.c = new ax.C.b();
    }

    private final int f(K k, V v) {
        int g = g(k, v);
        if (g >= 0) {
            return g;
        }
        throw new IllegalStateException(("Negative size: " + k + '=' + v).toString());
    }

    protected V a(K k) {
        ax.Gb.l.f(k, "key");
        return null;
    }

    protected void b(boolean z, K k, V v, V v2) {
        ax.Gb.l.f(k, "key");
        ax.Gb.l.f(v, "oldValue");
    }

    public final V c(K k) {
        V v;
        ax.Gb.l.f(k, "key");
        synchronized (this.c) {
            V a = this.b.a(k);
            if (a != null) {
                this.h++;
                return a;
            }
            this.i++;
            V a2 = a(k);
            if (a2 == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    this.f++;
                    v = (V) this.b.d(k, a2);
                    if (v != null) {
                        this.b.d(k, v);
                    } else {
                        this.d += f(k, a2);
                        t tVar = t.a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v != null) {
                b(false, k, a2, v);
                return v;
            }
            i(this.a);
            return a2;
        }
    }

    public final V d(K k, V v) {
        V d;
        ax.Gb.l.f(k, "key");
        ax.Gb.l.f(v, "value");
        synchronized (this.c) {
            try {
                this.e++;
                this.d += f(k, v);
                d = this.b.d(k, v);
                if (d != null) {
                    this.d -= f(k, d);
                }
                t tVar = t.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d != null) {
            b(false, k, d, v);
        }
        i(this.a);
        return d;
    }

    public final V e(K k) {
        V e;
        ax.Gb.l.f(k, "key");
        synchronized (this.c) {
            try {
                e = this.b.e(k);
                if (e != null) {
                    this.d -= f(k, e);
                }
                t tVar = t.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e != null) {
            b(false, k, e, null);
        }
        return e;
    }

    protected int g(K k, V v) {
        ax.Gb.l.f(k, "key");
        ax.Gb.l.f(v, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> h() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.c) {
            try {
                Iterator<T> it = this.b.b().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                t tVar = t.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(int r6) {
        /*
            r5 = this;
        L0:
            ax.C.b r0 = r5.c
            monitor-enter(r0)
            int r1 = r5.d     // Catch: java.lang.Throwable -> L14
            if (r1 < 0) goto L57
            ax.C.c<K, V> r1 = r5.b     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            int r1 = r5.d     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L57
            goto L16
        L14:
            r6 = move-exception
            goto L5f
        L16:
            int r1 = r5.d     // Catch: java.lang.Throwable -> L14
            if (r1 <= r6) goto L55
            ax.C.c<K, V> r1 = r5.b     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L23
            goto L55
        L23:
            ax.C.c<K, V> r1 = r5.b     // Catch: java.lang.Throwable -> L14
            java.util.Set r1 = r1.b()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = ax.tb.C3139o.F(r1)     // Catch: java.lang.Throwable -> L14
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L33
            monitor-exit(r0)
            return
        L33:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L14
            ax.C.c<K, V> r3 = r5.b     // Catch: java.lang.Throwable -> L14
            r3.e(r2)     // Catch: java.lang.Throwable -> L14
            int r3 = r5.d     // Catch: java.lang.Throwable -> L14
            int r4 = r5.f(r2, r1)     // Catch: java.lang.Throwable -> L14
            int r3 = r3 - r4
            r5.d = r3     // Catch: java.lang.Throwable -> L14
            int r3 = r5.g     // Catch: java.lang.Throwable -> L14
            r4 = 1
            int r3 = r3 + r4
            r5.g = r3     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            r0 = 0
            r5.b(r4, r2, r1, r0)
            goto L0
        L55:
            monitor-exit(r0)
            return
        L57:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L5f:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.B.j.i(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.h;
                int i2 = this.i + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.h + ",misses=" + this.i + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
