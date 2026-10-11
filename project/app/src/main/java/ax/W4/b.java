/*
 * Decompiled with CFR 0.152.
 */
package ax.W4;

import ax.X4.t;
import java.math.BigInteger;

public final class b {
    public static BigInteger a(String string) {
        try {
            BigInteger bigInteger = t.a(string);
            return bigInteger;
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder;
            if (string.length() > 1000) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(string.substring(0, 1000));
                stringBuilder.append(" [truncated]");
                string = stringBuilder.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Value \"");
            stringBuilder.append(string);
            stringBuilder.append("\" can not be represented as `java.math.BigInteger`, reason: ");
            stringBuilder.append(numberFormatException.getMessage());
            throw new NumberFormatException(stringBuilder.toString());
        }
    }
}

