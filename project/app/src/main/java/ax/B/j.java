/*
 * Decompiled with CFR 0.152.
 */
package ax.B;

import ax.C.b;
import ax.C.c;
import ax.Gb.l;
import ax.sb.t;
import ax.tb.o;
import java.util.LinkedHashMap;
import java.util.Map;

public class j<K, V> {
    private int a;
    private final c<K, V> b;
    private final b c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public j(int n8) {
        this.a = n8;
        if (n8 > 0) {
            this.b = new c(0, 0.75f);
            this.c = new b();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private final int f(K k8, V v8) {
        int n8 = this.g(k8, v8);
        if (n8 >= 0) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Negative size: ");
        stringBuilder.append(k8);
        stringBuilder.append('=');
        stringBuilder.append(v8);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    protected V a(K k8) {
        l.f(k8, "key");
        return null;
    }

    protected void b(boolean bl, K k8, V v8, V v9) {
        l.f(k8, "key");
        l.f(v8, "oldValue");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final V c(K k8) {
        V v8;
        V v9;
        block10: {
            block9: {
                l.f(k8, "key");
                b b8 = this.c;
                // MONITORENTER : b8
                v9 = this.b.a(k8);
                if (v9 != null) {
                    ++this.h;
                    // MONITOREXIT : b8
                    return v9;
                }
                ++this.i;
                // MONITOREXIT : b8
                v8 = this.a(k8);
                if (v8 == null) {
                    return null;
                }
                b8 = this.c;
                // MONITORENTER : b8
                ++this.f;
                v9 = this.b.d(k8, v8);
                if (v9 == null) break block9;
                this.b.d(k8, v9);
                break block10;
            }
            this.d += this.f(k8, v8);
            t t8 = t.a;
        }
        // MONITOREXIT : b8
        if (v9 != null) {
            this.b(false, k8, v8, v9);
            return v9;
        }
        this.i(this.a);
        return v8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final V d(K k8, V v8) {
        l.f(k8, "key");
        l.f(v8, "value");
        b b8 = this.c;
        synchronized (b8) {
            try {
                ++this.e;
                this.d += this.f(k8, v8);
                V v9 = this.b.d(k8, v8);
                if (v9 != null) {
                    this.d -= this.f(k8, v9);
                }
                t t8 = t.a;
                // MONITOREXIT @DISABLED, blocks:[0, 1] lbl12 : MonitorExitStatement: MONITOREXIT : var3_4
                if (v9 != null) {
                    this.b(false, k8, v9, v8);
                }
                this.i(this.a);
                return v9;
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
    public final V e(K k8) {
        l.f(k8, "key");
        b b8 = this.c;
        synchronized (b8) {
            try {
                V v8 = this.b.e(k8);
                if (v8 != null) {
                    this.d -= this.f(k8, v8);
                }
                t t8 = t.a;
                // MONITOREXIT @DISABLED, blocks:[0, 1] lbl9 : MonitorExitStatement: MONITOREXIT : var2_3
                if (v8 == null) return v8;
                this.b(false, k8, v8, null);
                return v8;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    protected int g(K k8, V v8) {
        l.f(k8, "key");
        l.f(v8, "value");
        return 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map<K, V> h() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b b8 = this.c;
        synchronized (b8) {
            try {
                Object object = this.b.b().iterator();
                while (true) {
                    if (!object.hasNext()) {
                        object = t.a;
                        return linkedHashMap;
                    }
                    Map.Entry entry = (Map.Entry)object.next();
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void i(int n8) {
        IllegalStateException illegalStateException;
        block7: {
            while (true) {
                Map.Entry<K, V> entry;
                block8: {
                    b b8 = this.c;
                    // MONITORENTER : b8
                    if (this.d < 0 || this.b.c() && this.d != 0) break block7;
                    if (this.d <= n8) break;
                    if (this.b.c()) {
                        return;
                    }
                    entry = o.F(this.b.b());
                    if (entry != null) break block8;
                    // MONITOREXIT : b8
                    return;
                }
                illegalStateException = entry.getKey();
                entry = entry.getValue();
                this.b.e(illegalStateException);
                this.d -= this.f(illegalStateException, entry);
                ++this.g;
                // MONITOREXIT : b8
                this.b(true, illegalStateException, entry, null);
                continue;
                break;
            }
            // MONITOREXIT : b8
            return;
        }
        illegalStateException = new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
        throw illegalStateException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String toString() {
        b b8 = this.c;
        synchronized (b8) {
            Throwable throwable2;
            block3: {
                int n8;
                try {
                    int n9 = this.h;
                    n8 = this.i + n9;
                    n8 = n8 != 0 ? n9 * 100 / n8 : 0;
                }
                catch (Throwable throwable2) {
                    break block3;
                }
                CharSequence charSequence = new StringBuilder();
                charSequence.append("LruCache[maxSize=");
                charSequence.append(this.a);
                charSequence.append(",hits=");
                charSequence.append(this.h);
                charSequence.append(",misses=");
                charSequence.append(this.i);
                charSequence.append(",hitRate=");
                charSequence.append(n8);
                charSequence.append("%]");
                return charSequence.toString();
            }
            throw throwable2;
        }
    }
}

