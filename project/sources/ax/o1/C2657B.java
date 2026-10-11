package ax.o1;

import android.util.Range;
import ax.S0.C0968a;

/* renamed from: ax.o1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2657B {
    private long a;
    private long b;
    private double c;
    private Range<Double> d;

    public C2657B(float f) {
        C0968a.a(f > 0.0f);
        Range<Double> range = new Range<>(Double.valueOf(0.0d), Double.valueOf(1.0d / f));
        this.d = range;
        this.c = range.getUpper().doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    private double a(long j, long j2) {
        long j3 = this.a;
        if (j3 != -9223372036854775807L) {
            if (this.b != -9223372036854775807L && j != j3) {
                return (j2 - r4) / (j - j3);
            }
        }
        return this.d.getUpper().doubleValue();
    }

    private void f(double d) {
        this.c = (this.c * 0.800000011920929d) + (d * 0.20000000298023224d);
    }

    public void b(long j, long j2) {
        C0968a.a(j != -9223372036854775807L);
        C0968a.a(j2 != -9223372036854775807L);
        f(this.d.clamp(Double.valueOf(a(j, j2))).doubleValue());
        this.a = j;
        this.b = j2;
    }

    public long c(long j) {
        if (this.a == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.b + ((j - r0) * this.c));
    }

    public void d() {
        this.c = this.d.getUpper().doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public void e(float f) {
        C0968a.a(f > 0.0f);
        this.d = new Range<>(Double.valueOf(0.0d), Double.valueOf(1.0d / f));
        d();
    }
}
