/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import java.util.Arrays;

abstract class i<S extends com.google.android.material.progressindicator.b> {
    S a;
    final Path b;
    final Path c;
    final PathMeasure d;
    final Matrix e;

    public i(S s8) {
        Path path;
        this.b = path = new Path();
        this.c = new Path();
        this.d = new PathMeasure(path, false);
        this.a = s8;
        this.e = new Matrix();
    }

    abstract void a(Canvas var1, Rect var2, float var3, boolean var4, boolean var5);

    abstract void b(Canvas var1, Paint var2, int var3, int var4);

    abstract void c(Canvas var1, Paint var2, a var3, int var4);

    abstract void d(Canvas var1, Paint var2, float var3, float var4, int var5, int var6, int var7);

    abstract int e();

    abstract int f();

    abstract void g();

    void h(Canvas canvas, Rect rect, float f8, boolean bl, boolean bl2) {
        ((com.google.android.material.progressindicator.b)this.a).h();
        this.a(canvas, rect, f8, bl, bl2);
    }

    float i(float[] fArray) {
        return (float)Math.toDegrees(Math.atan2(fArray[1], fArray[0]));
    }

    protected static class a {
        float a;
        float b;
        int c;
        int d;
        float e = 1.0f;
        float f;
        float g;
        boolean h;

        protected a() {
        }
    }

    protected class b {
        float[] a;
        float[] b;
        final Matrix c;
        final i d;

        public b(i object) {
            this.d = object;
            this.a = new float[2];
            object = new float[2];
            this.b = (float[])object;
            object[0] = 1.0f;
            this.c = new Matrix();
        }

        public b(i i8, b b8) {
            this(i8, b8.a, b8.b);
        }

        public b(i object, float[] fArray, float[] fArray2) {
            this.d = object;
            object = new float[2];
            this.a = (float[])object;
            this.b = new float[2];
            System.arraycopy(fArray, 0, object, 0, 2);
            System.arraycopy(fArray2, 0, this.b, 0, 2);
            this.c = new Matrix();
        }

        void a(float f8) {
            float[] fArray = this.b;
            float f9 = (float)(Math.atan2(fArray[1], fArray[0]) + 1.5707963267948966);
            fArray = this.a;
            double d8 = fArray[0];
            double d9 = f8;
            double d10 = f9;
            fArray[0] = (float)(d8 + Math.cos(d10) * d9);
            fArray = this.a;
            fArray[1] = (float)((double)fArray[1] + d9 * Math.sin(d10));
        }

        void b(float f8) {
            float[] fArray = this.b;
            float f9 = (float)Math.atan2(fArray[1], fArray[0]);
            fArray = this.a;
            double d8 = fArray[0];
            double d9 = f8;
            double d10 = f9;
            fArray[0] = (float)(d8 + Math.cos(d10) * d9);
            fArray = this.a;
            fArray[1] = (float)((double)fArray[1] + d9 * Math.sin(d10));
        }

        public void c() {
            Arrays.fill(this.a, 0.0f);
            Arrays.fill(this.b, 0.0f);
            this.b[0] = 1.0f;
            this.c.reset();
        }

        public void d(float f8) {
            this.c.reset();
            this.c.setRotate(f8);
            this.c.mapPoints(this.a);
            this.c.mapPoints(this.b);
        }

        void e(float f8, float f9) {
            float[] fArray = this.a;
            fArray[0] = fArray[0] * f8;
            fArray[1] = fArray[1] * f9;
            fArray = this.b;
            fArray[0] = fArray[0] * f8;
            fArray[1] = fArray[1] * f9;
        }

        void f(float f8, float f9) {
            float[] fArray = this.a;
            fArray[0] = fArray[0] + f8;
            fArray[1] = fArray[1] + f9;
        }
    }
}

