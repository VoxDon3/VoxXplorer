package ax.t8;

import java.math.BigDecimal;

/* loaded from: classes3.dex */
public final class f extends Number {
    private final String q;

    public f(String str) {
        this.q = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.q);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.q;
        String str2 = ((f) obj).q;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.q);
    }

    public int hashCode() {
        return this.q.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.q);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.q);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.q).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.q);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.q).longValue();
        }
    }

    public String toString() {
        return this.q;
    }
}
