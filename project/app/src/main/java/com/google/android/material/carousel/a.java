/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.carousel;

public final class a {
    final int a;
    float b;
    int c;
    int d;
    float e;
    float f;
    final int g;
    final float h;

    public a(int n8, float f8, float f9, float f10, int n9, float f11, int n10, float f12, int n11, float f13) {
        this.a = n8;
        this.b = ax.W.a.a(f8, f9, f10);
        this.c = n9;
        this.e = f11;
        this.d = n10;
        this.f = f12;
        this.g = n11;
        this.d(f13, f9, f10, f12);
        this.h = this.b(f12);
    }

    private float a(float f8, int n8, float f9, int n9, int n10) {
        if (n8 <= 0) {
            f9 = 0.0f;
        }
        float f10 = n8;
        float f11 = (float)n9 / 2.0f;
        return (f8 - (f10 + f11) * f9) / ((float)n10 + f11);
    }

    private float b(float f8) {
        if (!this.g()) {
            return Float.MAX_VALUE;
        }
        return Math.abs(f8 - this.f) * (float)this.a;
    }

    public static a c(float f8, float f9, float f10, float f11, int[] nArray, float f12, int[] nArray2, float f13, int[] nArray3) {
        int n8 = nArray3.length;
        a a8 = null;
        int n9 = 1;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n10 = nArray3[i8];
            for (int n11 : nArray2) {
                int n12 = nArray.length;
                int n13 = 0;
                while (n13 < n12) {
                    a a9;
                    block8: {
                        a a10;
                        block7: {
                            a10 = new a(n9, f9, f10, f11, nArray[n13], f12, n11, f13, n10, f8);
                            if (a8 == null) break block7;
                            a9 = a8;
                            if (!(a10.h < a8.h)) break block8;
                        }
                        if (a10.h == 0.0f) {
                            return a10;
                        }
                        a9 = a10;
                    }
                    ++n13;
                    ++n9;
                    a8 = a9;
                }
            }
        }
        return a8;
    }

    private void d(float f8, float f9, float f10, float f11) {
        float f12 = f8 - this.f();
        int n8 = this.c;
        if (n8 > 0 && f12 > 0.0f) {
            f9 = this.b;
            this.b = f9 + Math.min(f12 / (float)n8, f10 - f9);
        } else if (n8 > 0 && f12 < 0.0f) {
            f10 = this.b;
            this.b = f10 + Math.max(f12 / (float)n8, f9 - f10);
        }
        n8 = this.c;
        f9 = n8 > 0 ? this.b : 0.0f;
        this.b = f9;
        this.f = f9 = this.a(f8, n8, f9, this.d, this.g);
        this.e = f8 = (this.b + f9) / 2.0f;
        n8 = this.d;
        if (n8 > 0 && f9 != f11) {
            f9 = (f11 - f9) * (float)this.g;
            f10 = n8;
            f8 = Math.min(Math.abs(f9), f8 * 0.1f * f10);
            if (f9 > 0.0f) {
                this.e -= f8 / (float)this.d;
                this.f += f8 / (float)this.g;
                return;
            }
            this.e += f8 / (float)this.d;
            this.f -= f8 / (float)this.g;
        }
    }

    private float f() {
        return this.f * (float)this.g + this.e * (float)this.d + this.b * (float)this.c;
    }

    private boolean g() {
        int n8 = this.g;
        if (n8 > 0 && this.c > 0 && this.d > 0) {
            float f8 = this.f;
            float f9 = this.e;
            return f8 > f9 && f9 > this.b;
        }
        if (n8 > 0 && this.c > 0) {
            return this.f > this.b;
        }
        return true;
    }

    int e() {
        return this.c + this.d + this.g;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Arrangement [priority=");
        stringBuilder.append(this.a);
        stringBuilder.append(", smallCount=");
        stringBuilder.append(this.c);
        stringBuilder.append(", smallSize=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mediumCount=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mediumSize=");
        stringBuilder.append(this.e);
        stringBuilder.append(", largeCount=");
        stringBuilder.append(this.g);
        stringBuilder.append(", largeSize=");
        stringBuilder.append(this.f);
        stringBuilder.append(", cost=");
        stringBuilder.append(this.h);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

