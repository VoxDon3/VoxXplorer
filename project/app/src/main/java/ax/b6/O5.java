/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.R5;
import ax.b6.T5;
import ax.b6.V5;
import ax.b6.X5;
import ax.b6.Y5;
import ax.b6.Z5;

public class O5
extends Enum<O5> {
    public static final /* enum */ O5 d0;
    public static final /* enum */ O5 e0;
    public static final /* enum */ O5 f0;
    public static final /* enum */ O5 g0;
    public static final /* enum */ O5 h0;
    public static final /* enum */ O5 i0;
    public static final /* enum */ O5 j0;
    public static final /* enum */ O5 k0;
    public static final /* enum */ O5 l0;
    public static final /* enum */ O5 m0;
    public static final /* enum */ O5 n0;
    public static final /* enum */ O5 o0;
    public static final /* enum */ O5 p0;
    public static final /* enum */ O5 q0;
    public static final /* enum */ O5 r0;
    public static final /* enum */ O5 s0;
    public static final /* enum */ O5 t0;
    public static final /* enum */ O5 u0;
    private static final O5[] v0;
    private final int c0;
    private final Y5 q;

    static {
        O5 o52;
        O5 o53;
        O5 o54;
        O5 o55;
        O5 o56;
        O5 o57;
        O5 o58;
        O5 o59;
        O5 o510;
        O5 o511;
        O5 o512;
        O5 o513;
        d0 = o513 = new O5(Y5.e0, 1);
        e0 = o512 = new O5(Y5.d0, 5);
        Enum enum_ = Y5.c0;
        f0 = o511 = new O5((Y5)enum_, 0);
        g0 = o510 = new O5((Y5)enum_, 0);
        Enum enum_2 = Y5.q;
        h0 = o59 = new O5((Y5)enum_2, 0);
        i0 = o58 = new O5((Y5)enum_, 1);
        j0 = o57 = new O5((Y5)enum_2, 5);
        k0 = o56 = new O5(Y5.f0, 0);
        R5 r52 = new R5("STRING", 8, Y5.g0, 2, null);
        l0 = r52;
        Enum enum_3 = Y5.j0;
        T5 t52 = new T5("GROUP", 9, (Y5)enum_3, 3, null);
        m0 = t52;
        V5 v52 = new V5("MESSAGE", 10, (Y5)enum_3, 2, null);
        n0 = v52;
        o0 = enum_3 = new X5("BYTES", 11, Y5.h0, 2, null);
        p0 = o55 = new O5((Y5)enum_2, 0);
        q0 = o54 = new O5(Y5.i0, 0);
        r0 = o53 = new O5((Y5)enum_2, 5);
        s0 = o52 = new O5((Y5)enum_, 1);
        t0 = enum_2 = new O5((Y5)enum_2, 0);
        u0 = enum_ = new O5((Y5)enum_, 0);
        v0 = new O5[]{o513, o512, o511, o510, o59, o58, o57, o56, r52, t52, v52, enum_3, o55, o54, o53, o52, enum_2, enum_};
    }

    private O5(Y5 y52, int n9) {
        this.q = y52;
        this.c0 = n9;
    }

    /* synthetic */ O5(String string, int n8, Y5 y52, int n9, Z5 z52) {
        this(y52, n9);
    }

    public static O5[] values() {
        return (O5[])v0.clone();
    }

    public final Y5 d() {
        return this.q;
    }
}

