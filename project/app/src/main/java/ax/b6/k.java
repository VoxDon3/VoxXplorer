/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.j;
import ax.b6.s;
import ax.b6.u;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;

public final class k
implements s {
    private final Double q;

    public k(Double d8) {
        if (d8 == null) {
            this.q = Double.NaN;
            return;
        }
        this.q = d8;
    }

    @Override
    public final s c() {
        return new k(this.q);
    }

    @Override
    public final Boolean e() {
        boolean bl = !Double.isNaN(this.q) && this.q != 0.0;
        return bl;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof k)) {
            return false;
        }
        object = (k)object;
        return this.q.equals(((k)object).q);
    }

    @Override
    public final Double f() {
        return this.q;
    }

    @Override
    public final String g() {
        if (Double.isNaN(this.q)) {
            return "NaN";
        }
        if (Double.isInfinite(this.q)) {
            if (this.q > 0.0) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal bigDecimal = BigDecimal.valueOf(this.q);
        bigDecimal = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : j.a(bigDecimal);
        Object object = new DecimalFormat("0E0");
        ((NumberFormat)object).setRoundingMode(RoundingMode.HALF_UP);
        int n8 = bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale();
        ((NumberFormat)object).setMinimumFractionDigits(n8 - 1);
        object = ((Format)object).format(bigDecimal);
        n8 = ((String)object).indexOf("E");
        if (n8 > 0) {
            if ((n8 = Integer.parseInt(((String)object).substring(n8 + 1))) < 0 && n8 > -7 || n8 >= 0 && n8 < 21) {
                return bigDecimal.toPlainString();
            }
            return ((String)object).replace("E-", "e-").replace("E", "e+");
        }
        return object;
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    @Override
    public final Iterator<s> i() {
        return null;
    }

    @Override
    public final s k(String string, Z2 z22, List<s> list) {
        if ("toString".equals(string)) {
            return new u(this.g());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", this.g(), string));
    }

    public final String toString() {
        return this.g();
    }
}

