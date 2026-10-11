/*
 * Decompiled with CFR 0.152.
 */
package ax.Qc;

import ax.Pc.a;

public class b
extends Number
implements Comparable<b> {
    private long q;

    public void d(Number number) {
        this.q += number.longValue();
    }

    @Override
    public double doubleValue() {
        return this.q;
    }

    public boolean equals(Object object) {
        return object instanceof b && this.q == ((b)object).longValue();
    }

    @Override
    public float floatValue() {
        return this.q;
    }

    public int h(b b8) {
        return a.b(this.q, b8.q);
    }

    public int hashCode() {
        long l8 = this.q;
        return (int)(l8 ^ l8 >>> 32);
    }

    @Override
    public int intValue() {
        return (int)this.q;
    }

    public Long j() {
        return this.q;
    }

    @Override
    public long longValue() {
        return this.q;
    }

    public String toString() {
        return String.valueOf(this.q);
    }
}

