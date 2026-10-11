/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import java.math.BigDecimal;
import java.math.BigInteger;

public final class j {
    public static /* synthetic */ BigDecimal a(BigDecimal bigDecimal) {
        if (bigDecimal.signum() == 0) {
            return new BigDecimal(BigInteger.ZERO, 0);
        }
        return bigDecimal.stripTrailingZeros();
    }
}

