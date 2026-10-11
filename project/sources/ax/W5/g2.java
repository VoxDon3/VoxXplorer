package ax.W5;

import java.util.List;

/* loaded from: classes3.dex */
public final class g2 extends J0 implements InterfaceC1044k1 {
    private static final g2 zzb;
    private M0 zzd = J0.g();

    static {
        g2 g2Var = new g2();
        zzb = g2Var;
        J0.l(g2.class, g2Var);
    }

    private g2() {
    }

    public static g2 r(byte[] bArr) throws P0 {
        return (g2) J0.d(zzb, bArr);
    }

    @Override // ax.W5.J0
    protected final Object o(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return J0.i(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new g2();
        }
        e2 e2Var = null;
        if (i2 == 4) {
            return new f2(e2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final List s() {
        return this.zzd;
    }
}
