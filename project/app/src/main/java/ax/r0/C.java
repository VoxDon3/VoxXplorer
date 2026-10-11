/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.h;

public final class C
extends Enum<C> {
    public static final /* enum */ C e0;
    public static final /* enum */ C f0;
    public static final /* enum */ C g0;
    public static final /* enum */ C h0;
    public static final /* enum */ C i0;
    public static final /* enum */ C j0;
    public static final /* enum */ C k0;
    public static final /* enum */ C l0;
    public static final /* enum */ C m0;
    public static final /* enum */ C n0;
    private static final C[] o0;
    private final Class<?> c0;
    private final Object d0;
    private final Class<?> q;

    static {
        C c8;
        C c9;
        C c10;
        C c11;
        C c12;
        C c13;
        C c14;
        C c15;
        e0 = c15 = new C(Void.class, Void.class, null);
        Object object = Integer.TYPE;
        f0 = c14 = new C((Class<?>)object, Integer.class, 0);
        g0 = c13 = new C(Long.TYPE, Long.class, 0L);
        h0 = c12 = new C(Float.TYPE, Float.class, Float.valueOf(0.0f));
        i0 = c11 = new C(Double.TYPE, Double.class, 0.0);
        Object object2 = Boolean.FALSE;
        j0 = c10 = new C(Boolean.TYPE, Boolean.class, object2);
        object2 = new C(String.class, String.class, "");
        k0 = object2;
        l0 = c9 = new C(h.class, h.class, h.c0);
        object = new C((Class<?>)object, Integer.class, null);
        m0 = object;
        n0 = c8 = new C(Object.class, Object.class, null);
        o0 = new C[]{c15, c14, c13, c12, c11, c10, object2, c9, object, c8};
    }

    private C(Class<?> clazz, Class<?> clazz2, Object object) {
        this.q = clazz;
        this.c0 = clazz2;
        this.d0 = object;
    }

    public static C valueOf(String string) {
        return Enum.valueOf(C.class, string);
    }

    public static C[] values() {
        return (C[])o0.clone();
    }

    public Class<?> d() {
        return this.c0;
    }
}

