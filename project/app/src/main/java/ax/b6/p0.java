/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.p4;

public final class p0
extends Enum<p0>
implements p4 {
    private static final /* enum */ p0 c0;
    public static final /* enum */ p0 d0;
    private static final /* enum */ p0 e0;
    private static final /* enum */ p0 f0;
    private static final /* enum */ p0 g0;
    private static final /* enum */ p0 h0;
    private static final /* enum */ p0 i0;
    private static final /* enum */ p0 j0;
    private static final /* enum */ p0 k0;
    private static final /* enum */ p0 l0;
    private static final p0[] m0;
    private final int q;

    static {
        p0 p02;
        p0 p03;
        p0 p04;
        p0 p05;
        p0 p06;
        p0 p07;
        p0 p08;
        p0 p09;
        p0 p010;
        p0 p011;
        c0 = p011 = new p0(0);
        d0 = p010 = new p0(1);
        e0 = p09 = new p0(2);
        f0 = p08 = new p0(3);
        g0 = p07 = new p0(4);
        h0 = p06 = new p0(5);
        i0 = p05 = new p0(6);
        j0 = p04 = new p0(7);
        k0 = p03 = new p0(8);
        l0 = p02 = new p0(-1);
        m0 = new p0[]{p011, p010, p09, p08, p07, p06, p05, p04, p03, p02};
    }

    private p0(int n9) {
        this.q = n9;
    }

    public static p0[] values() {
        return (p0[])m0.clone();
    }

    @Override
    public final int a() {
        if (this != l0) {
            return this.q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        stringBuilder.append(p0.class.getName());
        stringBuilder.append('@');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != l0) {
            stringBuilder.append(" number=");
            stringBuilder.append(this.a());
        }
        stringBuilder.append(" name=");
        stringBuilder.append(this.name());
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}

