/*
 * Decompiled with CFR 0.152.
 */
package ax.T4;

import ax.W4.d;
import java.io.Serializable;

public class h
implements Serializable {
    public static final h h0 = new h(d.o(), -1L, -1L, -1, -1);
    protected final long c0;
    protected final int d0;
    protected final int e0;
    protected final d f0;
    protected transient String g0;
    protected final long q;

    public h(d d8, long l8, int n8, int n9) {
        this(d8, -1L, l8, n8, n9);
    }

    public h(d d8, long l8, long l9, int n8, int n9) {
        d d9 = d8;
        if (d8 == null) {
            d9 = d.o();
        }
        this.f0 = d9;
        this.q = l8;
        this.c0 = l9;
        this.d0 = n8;
        this.e0 = n9;
    }

    public StringBuilder a(StringBuilder stringBuilder) {
        if (this.f0.m()) {
            stringBuilder.append("line: ");
            int n8 = this.d0;
            if (n8 >= 0) {
                stringBuilder.append(n8);
            } else {
                stringBuilder.append("UNKNOWN");
            }
            stringBuilder.append(", column: ");
            n8 = this.e0;
            if (n8 >= 0) {
                stringBuilder.append(n8);
                return stringBuilder;
            }
            stringBuilder.append("UNKNOWN");
            return stringBuilder;
        }
        if (this.d0 > 0) {
            stringBuilder.append("line: ");
            stringBuilder.append(this.d0);
            if (this.e0 > 0) {
                stringBuilder.append(", column: ");
                stringBuilder.append(this.e0);
            }
            return stringBuilder;
        }
        stringBuilder.append("byte offset: #");
        long l8 = this.q;
        if (l8 >= 0L) {
            stringBuilder.append(l8);
            return stringBuilder;
        }
        stringBuilder.append("UNKNOWN");
        return stringBuilder;
    }

    public int b() {
        return this.e0;
    }

    public int c() {
        return this.d0;
    }

    @Deprecated
    public Object d() {
        return this.f0.l();
    }

    public String e() {
        if (this.g0 == null) {
            this.g0 = this.f0.h();
        }
        return this.g0;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof h)) {
            return false;
        }
        object = (h)object;
        d d8 = this.f0;
        if (d8 == null ? ((h)object).f0 != null : !d8.equals(((h)object).f0)) {
            return false;
        }
        return this.d0 == ((h)object).d0 && this.e0 == ((h)object).e0 && this.c0 == ((h)object).c0 && this.q == ((h)object).q;
    }

    public int hashCode() {
        int n8 = this.f0 == null ? 1 : 2;
        return ((n8 ^ this.d0) + this.e0 ^ (int)this.c0) + (int)this.q;
    }

    public String toString() {
        CharSequence charSequence = this.e();
        StringBuilder stringBuilder = new StringBuilder(((String)charSequence).length() + 40);
        stringBuilder.append("[Source: ");
        stringBuilder.append((String)charSequence);
        stringBuilder.append("; ");
        charSequence = this.a(stringBuilder);
        ((StringBuilder)charSequence).append(']');
        return ((StringBuilder)charSequence).toString();
    }
}

