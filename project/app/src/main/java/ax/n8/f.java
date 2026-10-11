/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import ax.Gb.g;
import ax.Gb.l;
import ax.n8.d;
import ax.n8.e;

public final class f {
    private final d a;
    private final d b;
    private final double c;

    public f() {
        this(null, null, 0.0, 7, null);
    }

    public f(d d8, d d9, double d10) {
        l.f(d8, "performance");
        l.f(d9, "crashlytics");
        this.a = d8;
        this.b = d9;
        this.c = d10;
    }

    public /* synthetic */ f(d d8, d d9, double d10, int n8, g g8) {
        if ((n8 & 1) != 0) {
            d8 = d.d0;
        }
        if ((n8 & 2) != 0) {
            d9 = d.d0;
        }
        if ((n8 & 4) != 0) {
            d10 = 1.0;
        }
        this(d8, d9, d10);
    }

    public final d a() {
        return this.b;
    }

    public final d b() {
        return this.a;
    }

    public final double c() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof f)) {
            return false;
        }
        object = (f)object;
        if (this.a != ((f)object).a) {
            return false;
        }
        if (this.b != ((f)object).b) {
            return false;
        }
        return Double.compare(this.c, ((f)object).c) == 0;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + e.a(this.c);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataCollectionStatus(performance=");
        stringBuilder.append(this.a);
        stringBuilder.append(", crashlytics=");
        stringBuilder.append(this.b);
        stringBuilder.append(", sessionSamplingRate=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

