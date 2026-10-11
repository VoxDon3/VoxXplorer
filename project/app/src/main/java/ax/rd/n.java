/*
 * Decompiled with CFR 0.152.
 */
package ax.rd;

import ax.Wc.A;
import ax.Wc.B0;
import ax.Wc.L;
import ax.Wc.f;
import ax.Wc.m;
import ax.Wc.o0;
import ax.Wc.t;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class n
extends t
implements f {
    A q;

    public n(A a8) {
        if (!(a8 instanceof L) && !(a8 instanceof m)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.q = a8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public n(Date object) {
        Serializable serializable = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        simpleDateFormat.setTimeZone((TimeZone)serializable);
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append(simpleDateFormat.format((Date)object));
        ((StringBuilder)serializable).append("Z");
        object = ((StringBuilder)serializable).toString();
        int n8 = Integer.parseInt(((String)object).substring(0, 4));
        object = n8 >= 1950 && n8 <= 2049 ? new B0(((String)object).substring(2)) : new o0((String)object);
        this.q = object;
    }

    public static n r(Object object) {
        if (object != null && !(object instanceof n)) {
            if (object instanceof L) {
                return new n((L)object);
            }
            if (object instanceof m) {
                return new n((m)object);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unknown object in factory: ");
            stringBuilder.append(object.getClass().getName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return (n)object;
    }

    @Override
    public A g() {
        return this.q;
    }

    public String s() {
        A a8 = this.q;
        if (a8 instanceof L) {
            return ((L)a8).D();
        }
        return ((m)a8).J();
    }

    public String toString() {
        return this.s();
    }
}

