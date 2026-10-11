/*
 * Decompiled with CFR 0.152.
 */
package ax.K;

import android.view.View;
import ax.F.b;
import ax.K.c;
import ax.K.d;
import ax.K.g;
import java.util.Arrays;
import java.util.LinkedHashMap;

class k
implements Comparable<k> {
    static String[] t0 = new String[]{"position", "x", "y", "width", "height", "pathRotate"};
    int c0 = 0;
    float d0;
    float e0;
    float f0;
    float g0;
    float h0;
    float i0;
    float j0 = Float.NaN;
    float k0 = Float.NaN;
    int l0;
    int m0;
    float n0;
    g o0;
    LinkedHashMap<String, androidx.constraintlayout.widget.b> p0;
    b q;
    int q0;
    double[] r0;
    double[] s0;

    public k() {
        int n8;
        this.l0 = n8 = d.a;
        this.m0 = n8;
        this.n0 = Float.NaN;
        this.o0 = null;
        this.p0 = new LinkedHashMap();
        this.q0 = 0;
        this.r0 = new double[18];
        this.s0 = new double[18];
    }

    public int d(k k8) {
        return Float.compare(this.e0, k8.e0);
    }

    void h(double d8, int[] objectArray, double[] objectArray2, float[] fArray, double[] object, float[] fArray2) {
        float f8;
        float f9;
        float f10 = this.f0;
        float f11 = this.g0;
        float f12 = this.h0;
        float f13 = this.i0;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        for (int i8 = 0; i8 < objectArray.length; ++i8) {
            f9 = (float)objectArray2[i8];
            f8 = (float)object[i8];
            int n8 = objectArray[i8];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) continue;
                        f13 = f9;
                        f17 = f8;
                        continue;
                    }
                    f12 = f9;
                    f15 = f8;
                    continue;
                }
                f11 = f9;
                f16 = f8;
                continue;
            }
            f14 = f8;
            f10 = f9;
        }
        f8 = f15 / 2.0f + f14;
        f9 = f17 / 2.0f + f16;
        object = this.o0;
        if (object != null) {
            objectArray = new float[2];
            objectArray2 = new float[2];
            ((g)object).b(d8, (float[])objectArray, (float[])objectArray2);
            f15 = objectArray[0];
            f17 = objectArray[1];
            f8 = (float)objectArray2[0];
            f9 = (float)objectArray2[1];
            double d9 = f15;
            double d10 = f10;
            d8 = f11;
            f10 = (float)(d9 + Math.sin(d8) * d10 - (double)(f12 / 2.0f));
            f11 = (float)((double)f17 - Math.cos(d8) * d10 - (double)(f13 / 2.0f));
            double d11 = f8;
            d9 = f14;
            double d12 = Math.sin(d8);
            double d13 = Math.cos(d8);
            d10 = f16;
            f8 = (float)(d11 + d12 * d9 + d13 * d10);
            f9 = (float)((double)f9 - d9 * Math.cos(d8) + Math.sin(d8) * d10);
        }
        fArray[0] = f10 + f12 / 2.0f + 0.0f;
        fArray[1] = f11 + f13 / 2.0f + 0.0f;
        fArray2[0] = f8;
        fArray2[1] = f9;
    }

    void j(float f8, View view, int[] object, double[] objectArray, double[] dArray, double[] objectArray2, boolean bl) {
        double d8;
        float f9;
        double d9;
        int n8;
        int n9;
        float f10 = this.f0;
        float f11 = this.g0;
        float f12 = this.h0;
        float f13 = this.i0;
        if (((int[])object).length != 0 && this.r0.length <= object[((int[])object).length - 1]) {
            n9 = object[((int[])object).length - 1] + 1;
            this.r0 = new double[n9];
            this.s0 = new double[n9];
        }
        Arrays.fill(this.r0, Double.NaN);
        for (n9 = 0; n9 < ((int[])object).length; ++n9) {
            double[] dArray2 = this.r0;
            n8 = object[n9];
            dArray2[n8] = objectArray[n9];
            this.s0[n8] = dArray[n9];
        }
        float f14 = Float.NaN;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (n9 = 0; n9 < ((int[])(object = (Object)this.r0)).length; ++n9) {
            boolean bl2 = Double.isNaN(object[n9]);
            d9 = 0.0;
            if (bl2 && (objectArray2 == null || objectArray2[n9] == 0.0)) continue;
            if (objectArray2 != null) {
                d9 = objectArray2[n9];
            }
            if (!Double.isNaN(this.r0[n9])) {
                d9 = this.r0[n9] + d9;
            }
            f9 = (float)d9;
            d8 = (float)this.s0[n9];
            if (n9 != 1) {
                if (n9 != 2) {
                    if (n9 != 3) {
                        if (n9 != 4) {
                            if (n9 != 5) continue;
                            f14 = f9;
                            continue;
                        }
                        f13 = f9;
                        f18 = (float)d8;
                        continue;
                    }
                    f12 = f9;
                    f17 = (float)d8;
                    continue;
                }
                f11 = f9;
                f16 = (float)d8;
                continue;
            }
            f15 = (float)d8;
            f10 = f9;
        }
        object = this.o0;
        if (object != null) {
            objectArray = new float[2];
            objectArray2 = new float[2];
            ((g)object).b(f8, (float[])objectArray, (float[])objectArray2);
            d8 = objectArray[0];
            f18 = (float)objectArray[1];
            f9 = (float)objectArray2[0];
            f8 = (float)objectArray2[1];
            double d10 = d8;
            d9 = f10;
            double d11 = f11;
            d8 = (float)(d10 + Math.sin(d11) * d9 - (double)(f12 / 2.0f));
            f11 = (float)((double)f18 - Math.cos(d11) * d9 - (double)(f13 / 2.0f));
            double d12 = f9;
            double d13 = f15;
            double d14 = Math.sin(d11);
            double d15 = Math.cos(d11);
            d10 = f16;
            f10 = (float)(d12 + d14 * d13 + d15 * d9 * d10);
            f16 = (float)((double)f8 - d13 * Math.cos(d11) + Math.sin(d11) * d9 * d10);
            if (dArray.length >= 2) {
                dArray[0] = f10;
                dArray[1] = f16;
            }
            f9 = (float)d8;
            f8 = f11;
            if (!Float.isNaN(f14)) {
                view.setRotation((float)((double)f14 + Math.toDegrees(Math.atan2(f16, f10))));
                f9 = (float)d8;
                f8 = f11;
            }
        } else {
            f9 = f10;
            f8 = f11;
            if (!Float.isNaN(f14)) {
                f8 = f17 / 2.0f;
                f9 = f18 / 2.0f;
                view.setRotation((float)((double)0.0f + ((double)f14 + Math.toDegrees(Math.atan2(f16 + f9, f15 + f8)))));
                f8 = f11;
                f9 = f10;
            }
        }
        if (view instanceof c) {
            ((c)view).a(f9, f8, f12 + f9, f13 + f8);
            return;
        }
        f14 = f9 + 0.5f;
        int n10 = (int)f14;
        n8 = (int)(f8 += 0.5f);
        int n11 = (int)(f14 + f12);
        int n12 = (int)(f8 + f13);
        n9 = n11 - n10;
        int n13 = n12 - n8;
        if (n9 != view.getMeasuredWidth() || n13 != view.getMeasuredHeight() || bl) {
            view.measure(View.MeasureSpec.makeMeasureSpec((int)n9, (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)n13, (int)0x40000000));
        }
        view.layout(n10, n8, n11, n12);
    }
}

