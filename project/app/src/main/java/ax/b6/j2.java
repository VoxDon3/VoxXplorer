/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.l2;
import ax.b6.o4;
import ax.b6.p4;

public final class j2
extends Enum<j2>
implements p4 {
    private static final /* enum */ j2 c0;
    private static final /* enum */ j2 d0;
    private static final /* enum */ j2 e0;
    private static final /* enum */ j2 f0;
    private static final /* enum */ j2 g0;
    private static final /* enum */ j2 h0;
    private static final j2[] i0;
    private final int q;

    static {
        j2 j22;
        j2 j23;
        j2 j24;
        j2 j25;
        j2 j26;
        j2 j27;
        c0 = j27 = new j2(0);
        d0 = j26 = new j2(1);
        e0 = j25 = new j2(2);
        f0 = j24 = new j2(3);
        g0 = j23 = new j2(4);
        h0 = j22 = new j2(5);
        i0 = new j2[]{j27, j26, j25, j24, j23, j22};
    }

    private j2(int n9) {
        this.q = n9;
    }

    public static j2 d(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 != 5) {
                                return null;
                            }
                            return h0;
                        }
                        return g0;
                    }
                    return f0;
                }
                return e0;
            }
            return d0;
        }
        return c0;
    }

    public static o4 h() {
        return l2.a;
    }

    public static j2[] values() {
        return (j2[])i0.clone();
    }

    @Override
    public final int a() {
        return this.q;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        stringBuilder.append(j2.class.getName());
        stringBuilder.append('@');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" number=");
        stringBuilder.append(this.q);
        stringBuilder.append(" name=");
        stringBuilder.append(this.name());
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}

