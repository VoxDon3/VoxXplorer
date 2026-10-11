package ax.W4;

import ax.X4.t;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class b {
    public static BigInteger a(String str) {
        try {
            return t.a(str);
        } catch (NumberFormatException e) {
            if (str.length() > 1000) {
                str = str.substring(0, 1000) + " [truncated]";
            }
            throw new NumberFormatException("Value \"" + str + "\" can not be represented as `java.math.BigInteger`, reason: " + e.getMessage());
        }
    }
}
