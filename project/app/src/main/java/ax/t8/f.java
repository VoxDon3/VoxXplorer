/*
 * Decompiled with CFR 0.152.
 */
package ax.t8;

import java.math.BigDecimal;

public final class f
extends Number {
    private final String q;

    public f(String string) {
        this.q = string;
    }

    @Override
    public double doubleValue() {
        return Double.parseDouble(this.q);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof f) {
            Object object2 = (f)object;
            object = this.q;
            object2 = ((f)object2).q;
            return object == object2 || ((String)object).equals(object2);
            {
            }
        }
        return false;
    }

    @Override
    public float floatValue() {
        return Float.parseFloat(this.q);
    }

    public int hashCode() {
        return this.q.hashCode();
    }

    @Override
    public int intValue() {
        try {
            int n8 = Integer.parseInt(this.q);
            return n8;
        }
        catch (NumberFormatException numberFormatException) {
            long l8;
            try {
                l8 = Long.parseLong(this.q);
            }
            catch (NumberFormatException numberFormatException2) {
                return new BigDecimal(this.q).intValue();
            }
            return (int)l8;
        }
    }

    @Override
    public long longValue() {
        try {
            long l8 = Long.parseLong(this.q);
            return l8;
        }
        catch (NumberFormatException numberFormatException) {
            return new BigDecimal(this.q).longValue();
        }
    }

    public String toString() {
        return this.q;
    }
}

