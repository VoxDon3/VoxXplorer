package ax.b6;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.b6.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1594k implements InterfaceC1658s {
    private final Double q;

    public C1594k(Double d) {
        if (d == null) {
            this.q = Double.valueOf(Double.NaN);
        } else {
            this.q = d;
        }
    }

    @Override // ax.b6.InterfaceC1658s
    public final InterfaceC1658s c() {
        return new C1594k(this.q);
    }

    @Override // ax.b6.InterfaceC1658s
    public final Boolean e() {
        return Boolean.valueOf((Double.isNaN(this.q.doubleValue()) || this.q.doubleValue() == 0.0d) ? false : true);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1594k) {
            return this.q.equals(((C1594k) obj).q);
        }
        return false;
    }

    @Override // ax.b6.InterfaceC1658s
    public final Double f() {
        return this.q;
    }

    @Override // ax.b6.InterfaceC1658s
    public final String g() {
        if (Double.isNaN(this.q.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.q.doubleValue())) {
            return this.q.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(this.q.doubleValue());
        BigDecimal bigDecimal = valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : C1585j.a(valueOf);
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String format = decimalFormat.format(bigDecimal);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    @Override // ax.b6.InterfaceC1658s
    public final Iterator<InterfaceC1658s> i() {
        return null;
    }

    @Override // ax.b6.InterfaceC1658s
    public final InterfaceC1658s k(String str, Z2 z2, List<InterfaceC1658s> list) {
        if ("toString".equals(str)) {
            return new C1674u(g());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", g(), str));
    }

    public final String toString() {
        return g();
    }
}
