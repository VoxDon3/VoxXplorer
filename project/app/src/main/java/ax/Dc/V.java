/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import java.util.HashMap;
import java.util.Map;

public final class V
extends Enum<V> {
    public static final /* enum */ V c0;
    public static final /* enum */ V d0;
    public static final /* enum */ V e0;
    public static final /* enum */ V f0;
    public static final /* enum */ V g0;
    public static final /* enum */ V h0;
    public static final /* enum */ V i0;
    public static final /* enum */ V j0;
    public static final /* enum */ V k0;
    public static final /* enum */ V l0;
    public static final /* enum */ V m0;
    public static final /* enum */ V n0;
    public static final /* enum */ V o0;
    public static final /* enum */ V p0;
    public static final /* enum */ V q0;
    public static final /* enum */ V r0;
    public static final /* enum */ V s0;
    public static final /* enum */ V t0;
    public static final /* enum */ V u0;
    private static final Map<Integer, V> v0;
    private static final V[] w0;
    private final int q;

    static {
        V v8;
        V v9;
        V v10;
        V v11;
        V v122;
        V v13;
        V v14;
        V v15;
        V v16;
        V v17;
        V v18;
        V v19;
        V v20;
        V v21;
        V v22;
        V v23;
        V v24;
        c0 = v24 = new V(0);
        d0 = v23 = new V(1);
        e0 = v22 = new V(2);
        f0 = v21 = new V(3);
        g0 = v20 = new V(4);
        h0 = v19 = new V(5);
        i0 = v18 = new V(6);
        j0 = v17 = new V(7);
        Object object = new V(8);
        k0 = object;
        l0 = v16 = new V(9);
        m0 = v15 = new V(10);
        n0 = v14 = new V(12);
        o0 = v13 = new V(14);
        p0 = v122 = new V(95);
        q0 = v11 = new V(96);
        r0 = v10 = new V(97);
        s0 = v9 = new V(98);
        t0 = v8 = new V(99);
        V[] vArray = new V();
        u0 = vArray;
        w0 = new V[]{v24, v23, v22, v21, v20, v19, v18, v17, object, v16, v15, v14, v13, v122, v11, v10, v9, v8, vArray};
        object = new HashMap();
        for (V v122 : V.values()) {
            object.put(v122.d(), v122);
        }
        v0 = java.util.DesugarCollections.unmodifiableMap((Map)object);
    }

    private V() {
        this(-1);
    }

    private V(int n9) {
        this.q = n9;
    }

    public static V h(int n8) {
        return v0.get(n8);
    }

    public static V valueOf(String string) {
        return Enum.valueOf(V.class, string);
    }

    public static V[] values() {
        return (V[])w0.clone();
    }

    public int d() {
        return this.q;
    }
}

