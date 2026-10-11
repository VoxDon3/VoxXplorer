/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;

public final class u4
extends Enum<u4> {
    public static final /* enum */ u4 c0;
    public static final /* enum */ u4 d0;
    public static final /* enum */ u4 e0;
    public static final /* enum */ u4 f0;
    public static final /* enum */ u4 g0;
    public static final /* enum */ u4 h0;
    public static final /* enum */ u4 i0;
    public static final /* enum */ u4 j0;
    public static final /* enum */ u4 k0;
    public static final /* enum */ u4 l0;
    private static final u4[] m0;
    private final Class<?> q;

    static {
        u4 u42;
        u4 u43;
        u4 u44;
        u4 u45;
        u4 u46;
        u4 u47;
        u4 u48;
        u4 u49;
        c0 = u49 = new u4(Void.class, Void.class, null);
        Object object = Integer.TYPE;
        d0 = u48 = new u4((Class<?>)object, Integer.class, 0);
        e0 = u47 = new u4(Long.TYPE, Long.class, 0L);
        f0 = u46 = new u4(Float.TYPE, Float.class, Float.valueOf(0.0f));
        g0 = u45 = new u4(Double.TYPE, Double.class, 0.0);
        Object object2 = Boolean.FALSE;
        h0 = u44 = new u4(Boolean.TYPE, Boolean.class, object2);
        i0 = u43 = new u4(String.class, String.class, "");
        object2 = new u4(B3.class, B3.class, B3.c0);
        j0 = object2;
        object = new u4((Class<?>)object, Integer.class, null);
        k0 = object;
        l0 = u42 = new u4(Object.class, Object.class, null);
        m0 = new u4[]{u49, u48, u47, u46, u45, u44, u43, object2, object, u42};
    }

    private u4(Class<?> clazz, Class<?> clazz2, Object object) {
        this.q = clazz2;
    }

    public static u4[] values() {
        return (u4[])m0.clone();
    }

    public final Class<?> d() {
        return this.q;
    }
}

