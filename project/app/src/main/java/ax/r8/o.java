/*
 * Decompiled with CFR 0.152.
 */
package ax.r8;

import ax.r8.i;
import ax.t8.a;
import ax.t8.f;
import java.math.BigInteger;

public final class o
extends i {
    private final Object q;

    public o(Boolean bl) {
        this.q = a.b(bl);
    }

    public o(Number number) {
        this.q = a.b(number);
    }

    public o(String string) {
        this.q = a.b(string);
    }

    private static boolean x(o object) {
        object = ((o)object).q;
        if (object instanceof Number) {
            return (object = (Number)object) instanceof BigInteger || object instanceof Long || object instanceof Integer || object instanceof Short || object instanceof Byte;
            {
            }
        }
        return false;
    }

    @Override
    public boolean e() {
        if (this.w()) {
            return (Boolean)this.q;
        }
        return Boolean.parseBoolean(this.k());
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && o.class == object.getClass()) {
            object = (o)object;
            if (this.q == null) {
                return ((o)object).q == null;
            }
            if (o.x(this) && o.x((o)object)) {
                return this.u().longValue() == ((o)object).u().longValue();
            }
            Object object2 = this.q;
            if (object2 instanceof Number && ((o)object).q instanceof Number) {
                double d8;
                double d9 = this.u().doubleValue();
                return d9 == (d8 = ((o)object).u().doubleValue()) || Double.isNaN(d9) && Double.isNaN(d8);
                {
                }
            }
            return object2.equals(((o)object).q);
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int hashCode() {
        long l8;
        if (this.q == null) {
            return 31;
        }
        if (o.x(this)) {
            l8 = this.u().longValue();
            return (int)(l8 >>> 32 ^ l8);
        }
        Object object = this.q;
        if (!(object instanceof Number)) return object.hashCode();
        l8 = Double.doubleToLongBits(this.u().doubleValue());
        return (int)(l8 >>> 32 ^ l8);
    }

    @Override
    public String k() {
        if (this.y()) {
            return this.u().toString();
        }
        if (this.w()) {
            return ((Boolean)this.q).toString();
        }
        return (String)this.q;
    }

    public double r() {
        if (this.y()) {
            return this.u().doubleValue();
        }
        return Double.parseDouble(this.k());
    }

    public int s() {
        if (this.y()) {
            return this.u().intValue();
        }
        return Integer.parseInt(this.k());
    }

    public long t() {
        if (this.y()) {
            return this.u().longValue();
        }
        return Long.parseLong(this.k());
    }

    public Number u() {
        Object object = this.q;
        if (object instanceof String) {
            return new f((String)object);
        }
        return (Number)object;
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
}

