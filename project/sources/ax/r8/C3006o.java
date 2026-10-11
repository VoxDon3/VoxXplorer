package ax.r8;

import ax.t8.C3105a;
import java.math.BigInteger;

/* renamed from: ax.r8.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3006o extends AbstractC3000i {
    private final Object q;

    public C3006o(Boolean bool) {
        this.q = C3105a.b(bool);
    }

    private static boolean x(C3006o c3006o) {
        Object obj = c3006o.q;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // ax.r8.AbstractC3000i
    public boolean e() {
        return w() ? ((Boolean) this.q).booleanValue() : Boolean.parseBoolean(k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3006o.class != obj.getClass()) {
            return false;
        }
        C3006o c3006o = (C3006o) obj;
        if (this.q == null) {
            return c3006o.q == null;
        }
        if (x(this) && x(c3006o)) {
            return u().longValue() == c3006o.u().longValue();
        }
        Object obj2 = this.q;
        if (!(obj2 instanceof Number) || !(c3006o.q instanceof Number)) {
            return obj2.equals(c3006o.q);
        }
        double doubleValue = u().doubleValue();
        double doubleValue2 = c3006o.u().doubleValue();
        return doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2));
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.q == null) {
            return 31;
        }
        if (x(this)) {
            doubleToLongBits = u().longValue();
        } else {
            Object obj = this.q;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(u().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // ax.r8.AbstractC3000i
    public String k() {
        return y() ? u().toString() : w() ? ((Boolean) this.q).toString() : (String) this.q;
    }

    public double r() {
        return y() ? u().doubleValue() : Double.parseDouble(k());
    }

    public int s() {
        return y() ? u().intValue() : Integer.parseInt(k());
    }

    public long t() {
        return y() ? u().longValue() : Long.parseLong(k());
    }

    public Number u() {
        Object obj = this.q;
        return obj instanceof String ? new ax.t8.f((String) obj) : (Number) obj;
    }

    public boolean w() {
        return this.q instanceof Boolean;
    }

    public boolean y() {
        return this.q instanceof Number;
    }

    public boolean z() {
        return this.q instanceof String;
    }

    public C3006o(Number number) {
        this.q = C3105a.b(number);
    }

    public C3006o(String str) {
        this.q = C3105a.b(str);
    }
}
