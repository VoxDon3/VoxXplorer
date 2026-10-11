package ax.b6;

import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: ax.b6.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1585j {
    public static /* synthetic */ BigDecimal a(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
