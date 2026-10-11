package ax.K;

import android.view.View;
import android.view.animation.Interpolator;
import ax.J.b;
import ax.J.c;
import ax.J.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g {
    boolean a;
    private k b;
    private k c;
    private f d;
    private f e;
    private ax.F.a[] f;
    private ax.F.a g;
    float h;
    float i;
    private int[] j;
    private double[] k;
    private double[] l;
    private String[] m;
    private float[] n;
    private ArrayList<k> o;
    private HashMap<String, ax.J.d> p;
    private HashMap<String, ax.J.c> q;
    private HashMap<String, ax.J.b> r;
    private e[] s;
    private int t;
    private View u;
    private int v;
    private float w;
    private Interpolator x;
    private boolean y;

    private float a(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.i;
            if (f3 != 1.0d) {
                float f4 = this.h;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        ax.F.b bVar = this.b.q;
        ArrayList<k> arrayList = this.o;
        int size = arrayList.size();
        float f5 = Float.NaN;
        int i = 0;
        while (i < size) {
            k kVar = arrayList.get(i);
            i++;
            k kVar2 = kVar;
            ax.F.b bVar2 = kVar2.q;
            if (bVar2 != null) {
                float f6 = kVar2.d0;
                if (f6 < f) {
                    bVar = bVar2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = kVar2.d0;
                }
            }
        }
        if (bVar != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) bVar.a(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) bVar.b(d);
            }
        }
        return f;
    }

    public void b(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f[0].b(d, dArr);
        this.f[0].d(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.b.h(d, this.j, dArr, fArr, dArr2, fArr2);
    }

    boolean c(View view, float f, long j, ax.F.c cVar) {
        d.a aVar;
        boolean z;
        View view2;
        View view3;
        double d;
        float f2;
        float f3;
        View view4 = view;
        float a = a(f, null);
        int i = this.v;
        if (i != d.a) {
            float f4 = 1.0f / i;
            float floor = ((float) Math.floor(a / f4)) * f4;
            float f5 = (a % f4) / f4;
            if (!Float.isNaN(this.w)) {
                f5 = (f5 + this.w) % 1.0f;
            }
            Interpolator interpolator = this.x;
            a = ((interpolator != null ? interpolator.getInterpolation(f5) : ((double) f5) > 0.5d ? 1.0f : 0.0f) * f4) + floor;
        }
        HashMap<String, ax.J.c> hashMap = this.q;
        if (hashMap != null) {
            Iterator<ax.J.c> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().b(view4, a);
            }
        }
        HashMap<String, ax.J.d> hashMap2 = this.p;
        if (hashMap2 != null) {
            d.a aVar2 = null;
            boolean z2 = false;
            for (ax.J.d dVar : hashMap2.values()) {
                if (dVar instanceof d.a) {
                    aVar2 = (d.a) dVar;
                } else {
                    z2 |= dVar.b(view4, a, j, cVar);
                    view4 = view;
                }
            }
            z = z2;
            aVar = aVar2;
        } else {
            aVar = null;
            z = false;
        }
        ax.F.a[] aVarArr = this.f;
        if (aVarArr != null) {
            double d2 = a;
            aVarArr[0].b(d2, this.k);
            this.f[0].d(d2, this.l);
            if (this.y) {
                view3 = view;
                d = d2;
                f2 = 0.0f;
                f3 = 1.0f;
            } else {
                float f6 = a;
                d = d2;
                f2 = 0.0f;
                f3 = 1.0f;
                this.b.j(f6, view, this.j, this.k, this.l, null, this.a);
                a = f6;
                view3 = view;
                this.a = false;
            }
            if (this.t != d.a) {
                if (this.u == null) {
                    this.u = ((View) view3.getParent()).findViewById(this.t);
                }
                if (this.u != null) {
                    float top = (r1.getTop() + this.u.getBottom()) / 2.0f;
                    float left = (this.u.getLeft() + this.u.getRight()) / 2.0f;
                    if (view3.getRight() - view3.getLeft() > 0 && view3.getBottom() - view3.getTop() > 0) {
                        view3.setPivotX(left - view3.getLeft());
                        view3.setPivotY(top - view3.getTop());
                    }
                }
            }
            HashMap<String, ax.J.c> hashMap3 = this.q;
            if (hashMap3 != null) {
                for (ax.J.c cVar2 : hashMap3.values()) {
                    if (cVar2 instanceof c.a) {
                        double[] dArr = this.l;
                        if (dArr.length > 1) {
                            ((c.a) cVar2).c(view3, a, dArr[0], dArr[1]);
                        }
                    }
                    view3 = view;
                }
            }
            if (aVar != null) {
                double[] dArr2 = this.l;
                view2 = view;
                float f7 = a;
                a = f7;
                z |= aVar.c(view2, cVar, f7, j, dArr2[0], dArr2[1]);
            } else {
                view2 = view;
            }
            int i2 = 1;
            while (true) {
                ax.F.a[] aVarArr2 = this.f;
                if (i2 >= aVarArr2.length) {
                    break;
                }
                aVarArr2[i2].c(d, this.n);
                ax.J.a.b(this.b.p0.get(this.m[i2 - 1]), view2, this.n);
                i2++;
            }
            f fVar = this.d;
            if (fVar.q == 0) {
                if (a <= f2) {
                    view2.setVisibility(fVar.c0);
                } else if (a >= f3) {
                    view2.setVisibility(this.e.c0);
                } else if (this.e.c0 != fVar.c0) {
                    view2.setVisibility(0);
                }
            }
            if (this.s != null) {
                int i3 = 0;
                while (true) {
                    e[] eVarArr = this.s;
                    if (i3 >= eVarArr.length) {
                        break;
                    }
                    eVarArr[i3].a(a, view2);
                    i3++;
                }
            }
        } else {
            view2 = view;
            k kVar = this.b;
            float f8 = kVar.f0;
            k kVar2 = this.c;
            float f9 = f8 + ((kVar2.f0 - f8) * a);
            float f10 = kVar.g0;
            float f11 = f10 + ((kVar2.g0 - f10) * a);
            float f12 = kVar.h0;
            float f13 = kVar2.h0;
            float f14 = kVar.i0;
            float f15 = kVar2.i0;
            float f16 = f9 + 0.5f;
            int i4 = (int) f16;
            float f17 = f11 + 0.5f;
            int i5 = (int) f17;
            int i6 = (int) (f16 + ((f13 - f12) * a) + f12);
            int i7 = (int) (f17 + ((f15 - f14) * a) + f14);
            int i8 = i6 - i4;
            int i9 = i7 - i5;
            if (f13 != f12 || f15 != f14 || this.a) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
                this.a = false;
            }
            view2.layout(i4, i5, i6, i7);
        }
        HashMap<String, ax.J.b> hashMap4 = this.r;
        if (hashMap4 != null) {
            for (ax.J.b bVar : hashMap4.values()) {
                if (bVar instanceof b.a) {
                    double[] dArr3 = this.l;
                    ((b.a) bVar).c(view2, a, dArr3[0], dArr3[1]);
                } else {
                    bVar.b(view2, a);
                }
            }
        }
        return z;
    }

    public String toString() {
        return " start: x: " + this.b.f0 + " y: " + this.b.g0 + " end: x: " + this.c.f0 + " y: " + this.c.g0;
    }
}
