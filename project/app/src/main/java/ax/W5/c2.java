/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.d2;

public final class c2
extends Enum {
    public static final /* enum */ c2 c0;
    public static final /* enum */ c2 d0;
    public static final /* enum */ c2 e0;
    public static final /* enum */ c2 f0;
    public static final /* enum */ c2 g0;
    public static final /* enum */ c2 h0;
    public static final /* enum */ c2 i0;
    public static final /* enum */ c2 j0;
    public static final /* enum */ c2 k0;
    public static final /* enum */ c2 l0;
    public static final /* enum */ c2 m0;
    public static final /* enum */ c2 n0;
    public static final /* enum */ c2 o0;
    public static final /* enum */ c2 p0;
    public static final /* enum */ c2 q0;
    public static final /* enum */ c2 r0;
    public static final /* enum */ c2 s0;
    public static final /* enum */ c2 t0;
    private static final c2[] u0;
    private final d2 q;

    static {
        c2 c22;
        c2 c23;
        c2 c24;
        c2 c25;
        c2 c26;
        c2 c27;
        c2 c28;
        c2 c29;
        c2 c210;
        c2 c211;
        c2 c212;
        c2 c213;
        c2 c214;
        c2 c215;
        c2 c216;
        c0 = c216 = new c2("DOUBLE", 0, d2.f0, 1);
        d0 = c215 = new c2("FLOAT", 1, d2.e0, 5);
        Enum enum_ = d2.d0;
        e0 = c214 = new c2("INT64", 2, (d2)enum_, 0);
        f0 = c213 = new c2("UINT64", 3, (d2)enum_, 0);
        Enum enum_2 = d2.c0;
        g0 = c212 = new c2("INT32", 4, (d2)enum_2, 0);
        h0 = c211 = new c2("FIXED64", 5, (d2)enum_, 1);
        i0 = c210 = new c2("FIXED32", 6, (d2)enum_2, 5);
        j0 = c29 = new c2("BOOL", 7, d2.g0, 0);
        k0 = c28 = new c2("STRING", 8, d2.h0, 2);
        Enum enum_3 = d2.k0;
        l0 = c27 = new c2("GROUP", 9, (d2)enum_3, 3);
        m0 = c26 = new c2("MESSAGE", 10, (d2)enum_3, 2);
        n0 = c25 = new c2("BYTES", 11, d2.i0, 2);
        o0 = c24 = new c2("UINT32", 12, (d2)enum_2, 0);
        p0 = c23 = new c2("ENUM", 13, d2.j0, 0);
        q0 = enum_3 = new c2("SFIXED32", 14, (d2)enum_2, 5);
        r0 = c22 = new c2("SFIXED64", 15, (d2)enum_, 1);
        s0 = enum_2 = new c2("SINT32", 16, (d2)enum_2, 0);
        t0 = enum_ = new c2("SINT64", 17, (d2)enum_, 0);
        u0 = new c2[]{c216, c215, c214, c213, c212, c211, c210, c29, c28, c27, c26, c25, c24, c23, enum_3, c22, enum_2, enum_};
    }

    /*
     * WARNING - void declaration
     */
    private c2() {
        Object var3_2;
        void var1_-1;
        this.q = var3_2;
    }

    public static c2[] values() {
        return (c2[])u0.clone();
    }

    public final d2 d() {
        return this.q;
    }
}

