/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.J0;
import ax.W5.M0;
import ax.W5.P0;
import ax.W5.f2;
import ax.W5.k1;
import java.util.List;

public final class g2
extends J0
implements k1 {
    private static final g2 zzb;
    private M0 zzd = J0.g();

    static {
        g2 g22;
        zzb = g22 = new g2();
        J0.l(g2.class, g22);
    }

    private g2() {
    }

    static /* synthetic */ g2 q() {
        return zzb;
    }

    public static g2 r(byte[] byArray) throws P0 {
        return (g2)J0.d(zzb, byArray);
    }

    @Override
    protected final Object o(int n8, Object object, Object object2) {
        if (--n8 != 0) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        if (n8 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new f2(null);
                }
                return new g2();
            }
            return J0.i(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        return (byte)1;
    }

    public final List s() {
        return this.zzd;
    }
}

