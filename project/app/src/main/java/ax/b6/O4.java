/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.m4;
import ax.b6.p4;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class O4<K, V>
extends LinkedHashMap<K, V> {
    private static final O4<?, ?> c0;
    private boolean q = true;

    static {
        O4 o42 = new O4();
        c0 = o42;
        o42.q = false;
    }

    private O4() {
    }

    private O4(Map<K, V> map) {
        super(map);
    }

    private static int b(Object object) {
        if (object instanceof byte[]) {
            return m4.d((byte[])object);
        }
        if (!(object instanceof p4)) {
            return object.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static <K, V> O4<K, V> c() {
        return c0;
    }

    private final void k() {
        if (this.q) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        this.k();
        super.clear();
    }

    public final void d(O4<K, V> o42) {
        this.k();
        if (!((AbstractMap)o42).isEmpty()) {
            this.putAll(o42);
        }
    }

    @Override
    public final Set<Map.Entry<K, V>> entrySet() {
        if (((AbstractMap)this).isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final boolean equals(Object var1_1) {
        block4: {
            block3: {
                block5: {
                    block6: {
                        if (!(var1_1 instanceof Map)) break block4;
                        var4_2 = (Map)var1_1;
                        if (this == var4_2) break block5;
                        if (this.size() == var4_2.size()) break block6;
lbl5:
                        // 2 sources

                        while (true) {
                            var2_3 = false;
                            break block3;
                            break;
                        }
                    }
                    for (Map.Entry<K, V> var6_6 : this.entrySet()) {
                        if (!var4_2.containsKey(var6_6 /* !! */ .getKey())) ** GOTO lbl5
                        var5_5 = var6_6 /* !! */ .getValue();
                        var6_6 /* !! */  = var4_2.get(var6_6 /* !! */ .getKey());
                        var3_4 = var5_5 instanceof byte[] != false && var6_6 /* !! */  instanceof byte[] != false ? Arrays.equals((byte[])var5_5, (byte[])var6_6 /* !! */ ) : var5_5.equals(var6_6 /* !! */ );
                        if (var3_4) continue;
                        ** continue;
lbl16:
                        // 2 sources

                        ** GOTO lbl5
                    }
                }
                var2_3 = true;
            }
            if (var2_3) {
                return true;
            }
        }
        return false;
    }

    public final O4<K, V> f() {
        if (((AbstractMap)this).isEmpty()) {
            return new O4<K, V>();
        }
        return new O4<K, V>(this);
    }

    @Override
    public final int hashCode() {
        Iterator iterator = this.entrySet().iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            int n9 = O4.b(entry.getKey());
            n8 += O4.b(entry.getValue()) ^ n9;
        }
        return n8;
    }

    public final void i() {
        this.q = false;
    }

    public final boolean j() {
        return this.q;
    }

    @Override
    public final V put(K k8, V v8) {
        this.k();
        m4.e(k8);
        m4.e(v8);
        return super.put(k8, v8);
    }

    @Override
    public final void putAll(Map<? extends K, ? extends V> map) {
        this.k();
        for (K k8 : map.keySet()) {
            m4.e(k8);
            m4.e(map.get(k8));
        }
        super.putAll(map);
    }

    @Override
    public final V remove(Object object) {
        this.k();
        return super.remove(object);
    }
}

