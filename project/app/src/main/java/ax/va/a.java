/*
 * Decompiled with CFR 0.152.
 */
package ax.va;

import java.util.HashMap;
import java.util.Map;

public final class a
extends Enum<a> {
    public static final /* enum */ a A0;
    public static final /* enum */ a B0;
    public static final /* enum */ a C0;
    public static final /* enum */ a D0;
    public static final /* enum */ a E0;
    public static final /* enum */ a F0;
    public static final /* enum */ a G0;
    public static final /* enum */ a H0;
    public static final /* enum */ a I0;
    public static final /* enum */ a J0;
    public static final /* enum */ a K0;
    public static final /* enum */ a L0;
    public static final /* enum */ a M0;
    public static final /* enum */ a N0;
    public static final /* enum */ a O0;
    public static final /* enum */ a P0;
    public static final /* enum */ a Q0;
    public static final /* enum */ a R0;
    public static final /* enum */ a S0;
    public static final /* enum */ a T0;
    public static final /* enum */ a U0;
    public static final /* enum */ a V0;
    public static final /* enum */ a W0;
    private static final Map<Short, a> X0;
    private static final a[] Y0;
    public static final /* enum */ a c0;
    public static final /* enum */ a d0;
    public static final /* enum */ a e0;
    public static final /* enum */ a f0;
    public static final /* enum */ a g0;
    public static final /* enum */ a h0;
    public static final /* enum */ a i0;
    public static final /* enum */ a j0;
    public static final /* enum */ a k0;
    public static final /* enum */ a l0;
    public static final /* enum */ a m0;
    public static final /* enum */ a n0;
    public static final /* enum */ a o0;
    public static final /* enum */ a p0;
    public static final /* enum */ a q0;
    public static final /* enum */ a r0;
    public static final /* enum */ a s0;
    public static final /* enum */ a t0;
    public static final /* enum */ a u0;
    public static final /* enum */ a v0;
    public static final /* enum */ a w0;
    public static final /* enum */ a x0;
    public static final /* enum */ a y0;
    public static final /* enum */ a z0;
    private final short q;

    static {
        c0 = new a(8);
        d0 = new a(9);
        e0 = new a(10);
        f0 = new a(11);
        g0 = new a(12);
        h0 = new a(13);
        i0 = new a(14);
        j0 = new a(15);
        k0 = new a(36);
        l0 = new a(16);
        m0 = new a(17);
        n0 = new a(18);
        o0 = new a(19);
        p0 = new a(37);
        q0 = new a(38);
        r0 = new a(20);
        s0 = new a(21);
        t0 = new a(22);
        u0 = new a(23);
        v0 = new a(24);
        w0 = new a(28);
        x0 = new a(25);
        y0 = new a(41);
        z0 = new a(26);
        A0 = new a(27);
        B0 = new a(53);
        C0 = new a(39);
        D0 = new a(40);
        E0 = new a(30);
        F0 = new a(31);
        G0 = new a(32);
        H0 = new a(33);
        I0 = new a(34);
        J0 = new a(35);
        K0 = new a(43);
        L0 = new a(44);
        M0 = new a(45);
        N0 = new a(46);
        O0 = new a(48);
        P0 = new a(50);
        Q0 = new a(49);
        R0 = new a(51);
        S0 = new a(52);
        T0 = new a(54);
        U0 = new a(55);
        V0 = new a(56);
        W0 = new a(57);
        Y0 = a.d();
        X0 = new HashMap<Short, a>();
        for (a a8 : a.values()) {
            X0.put(a8.h(), a8);
        }
    }

    private a(int n9) {
        this.q = (short)n9;
    }

    private static /* synthetic */ a[] d() {
        return new a[]{c0, d0, e0, f0, g0, h0, i0, j0, k0, l0, m0, n0, o0, p0, q0, r0, s0, t0, u0, v0, w0, x0, y0, z0, A0, B0, C0, D0, E0, F0, G0, H0, I0, J0, K0, L0, M0, N0, O0, P0, Q0, R0, S0, T0, U0, V0, W0};
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return (a[])Y0.clone();
    }

    public short h() {
        return this.q;
    }
}

