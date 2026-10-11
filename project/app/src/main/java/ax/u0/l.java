/*
 * Decompiled with CFR 0.152.
 */
package ax.u0;

import ax.u0.h;

public final class l {
    double a = Math.sqrt(1500.0);
    double b = 0.5;
    private boolean c = false;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i = Double.MAX_VALUE;
    private final h.o j = new h.o();

    public l() {
    }

    public l(float f8) {
        this.i = f8;
    }

    private void d() {
        if (this.c) {
            return;
        }
        if (this.i != Double.MAX_VALUE) {
            double d8 = this.b;
            if (d8 > 1.0) {
                double d9 = -d8;
                double d10 = this.a;
                this.f = d9 * d10 + d10 * Math.sqrt(d8 * d8 - 1.0);
                d10 = this.b;
                d9 = -d10;
                d8 = this.a;
                this.g = d9 * d8 - d8 * Math.sqrt(d10 * d10 - 1.0);
            } else if (d8 >= 0.0 && d8 < 1.0) {
                this.h = this.a * Math.sqrt(1.0 - d8 * d8);
            }
            this.c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    public float a() {
        return (float)this.b;
    }

    public float b() {
        return (float)this.i;
    }

    public float c() {
        double d8 = this.a;
        return (float)(d8 * d8);
    }

    public boolean e(float f8, float f9) {
        return (double)Math.abs(f9) < this.e && (double)Math.abs(f8 - this.b()) < this.d;
    }

    public l f(float f8) {
        if (!(f8 < 0.0f)) {
            this.b = f8;
            this.c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public l g(float f8) {
        this.i = f8;
        return this;
    }

    public l h(float f8) {
        if (!(f8 <= 0.0f)) {
            this.a = Math.sqrt(f8);
            this.c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    void i(double d8) {
        this.d = d8 = Math.abs(d8);
        this.e = d8 * 62.5;
    }

    h.o j(double d8, double d9, long l8) {
        this.d();
        double d10 = (double)l8 / 1000.0;
        double d11 = d8 - this.i;
        d8 = this.b;
        if (d8 > 1.0) {
            d8 = this.g;
            double d12 = this.f;
            double d13 = d11 - (d8 * d11 - d9) / (d8 - d12);
            d9 = (d11 * d8 - d9) / (d8 - d12);
            d8 = Math.pow(Math.E, d8 * d10) * d13 + Math.pow(Math.E, this.f * d10) * d9;
            d11 = this.g;
            d12 = Math.pow(Math.E, d11 * d10);
            double d14 = this.f;
            d9 = d13 * d11 * d12 + d9 * d14 * Math.pow(Math.E, d14 * d10);
        } else if (d8 == 1.0) {
            d8 = this.a;
            d9 += d8 * d11;
            d8 = Math.pow(Math.E, -d8 * d10) * (d11 += d9 * d10);
            double d15 = Math.pow(Math.E, -this.a * d10);
            double d16 = this.a;
            double d17 = -d16;
            d9 = d9 * Math.pow(Math.E, -d16 * d10) + d11 * d15 * d17;
        } else {
            double d18 = 1.0 / this.h;
            double d19 = this.a;
            d9 = d18 * (d8 * d19 * d11 + d9);
            d8 = Math.pow(Math.E, -d8 * d19 * d10) * (Math.cos(this.h * d10) * d11 + Math.sin(this.h * d10) * d9);
            double d20 = this.a;
            d19 = -d20;
            d18 = this.b;
            d20 = Math.pow(Math.E, -d18 * d20 * d10);
            double d21 = this.h;
            double d22 = -d21;
            double d23 = Math.sin(d21 * d10);
            d21 = this.h;
            d9 = d19 * d8 * d18 + d20 * (d22 * d11 * d23 + d9 * d21 * Math.cos(d21 * d10));
        }
        h.o o8 = this.j;
        o8.a = (float)(d8 + this.i);
        o8.b = (float)d9;
        return o8;
    }
}

