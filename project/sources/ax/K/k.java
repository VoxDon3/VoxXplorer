package ax.K;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
class k implements Comparable<k> {
    static String[] t0 = {"position", "x", "y", "width", "height", "pathRotate"};
    float d0;
    float e0;
    float f0;
    float g0;
    float h0;
    float i0;
    int l0;
    int m0;
    float n0;
    g o0;
    LinkedHashMap<String, androidx.constraintlayout.widget.b> p0;
    ax.F.b q;
    int q0;
    double[] r0;
    double[] s0;
    int c0 = 0;
    float j0 = Float.NaN;
    float k0 = Float.NaN;

    public k() {
        int i = d.a;
        this.l0 = i;
        this.m0 = i;
        this.n0 = Float.NaN;
        this.o0 = null;
        this.p0 = new LinkedHashMap<>();
        this.q0 = 0;
        this.r0 = new double[18];
        this.s0 = new double[18];
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        return Float.compare(this.e0, kVar.e0);
    }

    void h(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        float f2 = this.f0;
        float f3 = this.g0;
        float f4 = this.h0;
        float f5 = this.i0;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f2 = f10;
                f6 = f11;
            } else if (i2 == 2) {
                f3 = f10;
                f8 = f11;
            } else if (i2 == 3) {
                f4 = f10;
                f7 = f11;
            } else if (i2 == 4) {
                f5 = f10;
                f9 = f11;
            }
        }
        float f12 = (f7 / 2.0f) + f6;
        float f13 = (f9 / 2.0f) + f8;
        g gVar = this.o0;
        if (gVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            gVar.b(d, fArr3, fArr4);
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr4[0];
            float f17 = fArr4[1];
            f = 2.0f;
            double d2 = f2;
            double d3 = f3;
            f2 = (float) ((f14 + (Math.sin(d3) * d2)) - (f4 / 2.0f));
            f3 = (float) ((f15 - (Math.cos(d3) * d2)) - (f5 / 2.0f));
            double d4 = f6;
            double sin = f16 + (Math.sin(d3) * d4);
            double d5 = f8;
            float cos = (float) (sin + (Math.cos(d3) * d5));
            f13 = (float) ((f17 - (d4 * Math.cos(d3))) + (Math.sin(d3) * d5));
            f12 = cos;
        } else {
            f = 2.0f;
        }
        fArr[0] = f2 + (f4 / f) + 0.0f;
        fArr[1] = f3 + (f5 / f) + 0.0f;
        fArr2[0] = f12;
        fArr2[1] = f13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void j(float f, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f2;
        float f3 = this.f0;
        float f4 = this.g0;
        float f5 = this.h0;
        float f6 = this.i0;
        if (iArr.length != 0 && this.r0.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.r0 = new double[i];
            this.s0 = new double[i];
        }
        Arrays.fill(this.r0, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            double[] dArr4 = this.r0;
            int i3 = iArr[i2];
            dArr4[i3] = dArr[i2];
            this.s0[i3] = dArr2[i2];
        }
        float f7 = Float.NaN;
        int i4 = 0;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (true) {
            double[] dArr5 = this.r0;
            if (i4 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i4]) && (dArr3 == null || dArr3[i4] == 0.0d)) {
                f2 = f7;
            } else {
                double d = dArr3 != null ? dArr3[i4] : 0.0d;
                if (!Double.isNaN(this.r0[i4])) {
                    d = this.r0[i4] + d;
                }
                f2 = f7;
                float f12 = (float) d;
                float f13 = (float) this.s0[i4];
                if (i4 == 1) {
                    f7 = f2;
                    f8 = f13;
                    f3 = f12;
                } else if (i4 == 2) {
                    f7 = f2;
                    f9 = f13;
                    f4 = f12;
                } else if (i4 == 3) {
                    f7 = f2;
                    f10 = f13;
                    f5 = f12;
                } else if (i4 == 4) {
                    f7 = f2;
                    f11 = f13;
                    f6 = f12;
                } else if (i4 == 5) {
                    f7 = f12;
                }
                i4++;
            }
            f7 = f2;
            i4++;
        }
        float f14 = f7;
        g gVar = this.o0;
        if (gVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            gVar.b(f, fArr, fArr2);
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr2[0];
            float f18 = fArr2[1];
            double d2 = f15;
            double d3 = f3;
            double d4 = f4;
            f3 = (float) ((d2 + (Math.sin(d4) * d3)) - (f5 / 2.0f));
            f4 = (float) ((f16 - (Math.cos(d4) * d3)) - (f6 / 2.0f));
            double d5 = f17;
            double d6 = f8;
            double sin = d5 + (Math.sin(d4) * d6);
            double cos = Math.cos(d4) * d3;
            double d7 = f9;
            float f19 = (float) (sin + (cos * d7));
            float cos2 = (float) ((f18 - (d6 * Math.cos(d4))) + (Math.sin(d4) * d3 * d7));
            if (dArr2.length >= 2) {
                dArr2[0] = f19;
                dArr2[1] = cos2;
            }
            if (!Float.isNaN(f14)) {
                view.setRotation((float) (f14 + Math.toDegrees(Math.atan2(cos2, f19))));
            }
        } else if (!Float.isNaN(f14)) {
            view.setRotation((float) (0.0f + f14 + Math.toDegrees(Math.atan2(f9 + (f11 / 2.0f), f8 + (f10 / 2.0f)))));
        }
        if (view instanceof c) {
            ((c) view).a(f3, f4, f5 + f3, f6 + f4);
            return;
        }
        float f20 = f3 + 0.5f;
        int i5 = (int) f20;
        float f21 = f4 + 0.5f;
        int i6 = (int) f21;
        int i7 = (int) (f20 + f5);
        int i8 = (int) (f21 + f6);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (i9 != view.getMeasuredWidth() || i10 != view.getMeasuredHeight() || z) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view.layout(i5, i6, i7, i8);
    }
}
