/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.view.MotionEvent;

class a0 {
    private final float[] a = new float[20];
    private final long[] b = new long[20];
    private float c = 0.0f;
    private int d = 0;
    private int e = 0;

    a0() {
    }

    private void b() {
        this.d = 0;
        this.c = 0.0f;
    }

    private float e() {
        long[] lArray;
        long l8;
        int n8 = this.d;
        if (n8 < 2) {
            return 0.0f;
        }
        int n9 = this.e;
        n8 = (n9 + 20 - (n8 - 1)) % 20;
        long l9 = this.b[n9];
        while (l9 - (l8 = (lArray = this.b)[n8]) > 100L) {
            --this.d;
            n8 = (n8 + 1) % 20;
        }
        n9 = this.d;
        if (n9 < 2) {
            return 0.0f;
        }
        if (n9 == 2) {
            l9 = lArray[n8 = (n8 + 1) % 20];
            if (l8 == l9) {
                return 0.0f;
            }
            return this.a[n8] / (float)(l9 - l8);
        }
        int n10 = 0;
        float f8 = 0.0f;
        for (n9 = 0; n9 < this.d - 1; ++n9) {
            lArray = this.b;
            int n11 = n9 + n8;
            int n12 = (n11 + 1) % 20;
            l8 = lArray[n11 % 20];
            if (lArray[n12] == l8) continue;
            n11 = n10 + 1;
            float f9 = a0.f(f8);
            float f10 = this.a[n12] / (float)(this.b[n12] - l8);
            f9 = f8 + (f10 - f9) * Math.abs(f10);
            n10 = n11;
            f8 = f9;
            if (n11 != 1) continue;
            f8 = f9 * 0.5f;
            n10 = n11;
        }
        return a0.f(f8);
    }

    private static float f(float f8) {
        float f9 = f8 < 0.0f ? -1.0f : 1.0f;
        return f9 * (float)Math.sqrt(Math.abs(f8) * 2.0f);
    }

    void a(MotionEvent motionEvent) {
        int n8;
        long l8 = motionEvent.getEventTime();
        if (this.d != 0 && l8 - this.b[this.e] > 40L) {
            this.b();
        }
        this.e = n8 = (this.e + 1) % 20;
        int n9 = this.d;
        if (n9 != 20) {
            this.d = n9 + 1;
        }
        this.a[n8] = motionEvent.getAxisValue(26);
        this.b[this.e] = l8;
    }

    void c(int n8, float f8) {
        float f9;
        this.c = f9 = this.e() * (float)n8;
        if (f9 < -Math.abs(f8)) {
            this.c = -Math.abs(f8);
            return;
        }
        if (this.c > Math.abs(f8)) {
            this.c = Math.abs(f8);
        }
    }

    float d(int n8) {
        if (n8 != 26) {
            return 0.0f;
        }
        return this.c;
    }
}

