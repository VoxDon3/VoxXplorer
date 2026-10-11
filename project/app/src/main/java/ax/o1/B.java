/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import android.util.Range;
import ax.S0.a;

class B {
    private long a;
    private long b;
    private double c;
    private Range<Double> d;

    public B(float f8) {
        Range range;
        boolean bl = f8 > 0.0f;
        ax.S0.a.a(bl);
        this.d = range = new Range((Comparable)Double.valueOf(0.0), (Comparable)Double.valueOf(1.0 / (double)f8));
        this.c = (Double)range.getUpper();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    private double a(long l8, long l9) {
        long l10;
        long l11 = this.a;
        if (l11 != -9223372036854775807L && (l10 = this.b) != -9223372036854775807L && l8 != l11) {
            return (double)(l9 - l10) / (double)(l8 - l11);
        }
        return (Double)this.d.getUpper();
    }

    private void f(double d8) {
        this.c = this.c * (double)0.8f + d8 * (double)0.2f;
    }

    public void b(long l8, long l9) {
        boolean bl = false;
        boolean bl2 = l8 != -9223372036854775807L;
        ax.S0.a.a(bl2);
        bl2 = bl;
        if (l9 != -9223372036854775807L) {
            bl2 = true;
        }
        ax.S0.a.a(bl2);
        double d8 = this.a(l8, l9);
        this.f((Double)this.d.clamp((Comparable)Double.valueOf(d8)));
        this.a = l8;
        this.b = l9;
    }

    public long c(long l8) {
        long l9 = this.a;
        if (l9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long)((double)this.b + (double)(l8 - l9) * this.c);
    }

    public void d() {
        this.c = (Double)this.d.getUpper();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public void e(float f8) {
        boolean bl = f8 > 0.0f;
        ax.S0.a.a(bl);
        this.d = new Range((Comparable)Double.valueOf(0.0), (Comparable)Double.valueOf(1.0 / (double)f8));
        this.d();
    }
}

