/*
 * Decompiled with CFR 0.152.
 */
package ax.Qc;

public class a
extends Number
implements Comparable<a> {
    private int q;

    public int d(a a8) {
        return ax.Pc.a.a(this.q, a8.q);
    }

    @Override
    public double doubleValue() {
        return this.q;
    }

    public boolean equals(Object object) {
        return object instanceof a && this.q == ((a)object).intValue();
    }

    @Override
    public float floatValue() {
        return this.q;
    }

    public Integer h() {
        return this.q;
    }

    public int hashCode() {
        return this.q;
    }

    @Override
    public int intValue() {
        return this.q;
    }

    public void j(int n8) {
        this.q = n8;
    }

    @Override
    public long longValue() {
        return this.q;
    }

    public String toString() {
        return String.valueOf(this.q);
    }
}

