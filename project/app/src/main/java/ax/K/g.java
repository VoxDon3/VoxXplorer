/*
 * Decompiled with CFR 0.152.
 */
package ax.K;

import android.view.View;
import android.view.animation.Interpolator;
import ax.J.a;
import ax.J.b;
import ax.J.c;
import ax.J.d;
import ax.K.d;
import ax.K.e;
import ax.K.f;
import ax.K.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

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
    private HashMap<String, c> q;
    private HashMap<String, b> r;
    private e[] s;
    private int t;
    private View u;
    private int v;
    private float w;
    private Interpolator x;
    private boolean y;

    private float a(float f8, float[] fArray) {
        float f9;
        float f10;
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (fArray != null) {
            fArray[0] = 1.0f;
            f10 = f8;
        } else {
            float f13 = this.i;
            f10 = f8;
            if ((double)f13 != 1.0) {
                float f14 = this.h;
                f9 = f8;
                if (f8 < f14) {
                    f9 = 0.0f;
                }
                f10 = f9;
                if (f9 > f14) {
                    f10 = f9;
                    if ((double)f9 < 1.0) {
                        f10 = Math.min((f9 - f14) * f13, 1.0f);
                    }
                }
            }
        }
        Object object = this.b.q;
        ArrayList<k> arrayList = this.o;
        int n8 = arrayList.size();
        f8 = Float.NaN;
        int n9 = 0;
        f9 = f11;
        while (n9 < n8) {
            Object object2 = arrayList.get(n9);
            int n10 = n9 + 1;
            k k8 = object2;
            object2 = k8.q;
            n9 = n10;
            if (object2 == null) continue;
            f11 = k8.d0;
            if (f11 < f10) {
                object = object2;
                f9 = f11;
                n9 = n10;
                continue;
            }
            n9 = n10;
            if (!Float.isNaN(f8)) continue;
            f8 = k8.d0;
            n9 = n10;
        }
        f11 = f10;
        if (object != null) {
            if (Float.isNaN(f8)) {
                f8 = f12;
            }
            double d8 = (f10 - f9) / (f8 -= f9);
            f11 = f8 = (float)((ax.F.b)object).a(d8) * f8 + f9;
            if (fArray != null) {
                fArray[0] = (float)((ax.F.b)object).b(d8);
                f11 = f8;
            }
        }
        return f11;
    }

    public void b(double d8, float[] fArray, float[] fArray2) {
        double[] dArray = new double[4];
        double[] dArray2 = new double[4];
        this.f[0].b(d8, dArray);
        this.f[0].d(d8, dArray2);
        Arrays.fill(fArray2, 0.0f);
        this.b.h(d8, this.j, dArray, fArray, dArray2, fArray2);
    }

    boolean c(View view, float f8, long l8, ax.F.c object) {
        boolean bl;
        float f9;
        Object object2;
        boolean bl2;
        Object object3;
        Object object42;
        float f10;
        float f11;
        float f12 = this.a(f8, null);
        int n8 = this.v;
        f8 = f12;
        if (n8 != ax.K.d.a) {
            f11 = 1.0f / (float)n8;
            f10 = (float)Math.floor(f12 / f11);
            f8 = f12 = f12 % f11 / f11;
            if (!Float.isNaN(this.w)) {
                f8 = (f12 + this.w) % 1.0f;
            }
            f8 = (object42 = this.x) != null ? object42.getInterpolation(f8) : ((double)f8 > 0.5 ? 1.0f : 0.0f);
            f8 = f8 * f11 + f10 * f11;
        }
        if ((object42 = this.q) != null) {
            object42 = ((HashMap)object42).values().iterator();
            while (object42.hasNext()) {
                ((c)object42.next()).b(view, f8);
            }
        }
        if ((object42 = this.p) != null) {
            object3 = ((HashMap)object42).values().iterator();
            object42 = null;
            bl2 = false;
            while (object3.hasNext()) {
                object2 = (ax.J.d)object3.next();
                if (object2 instanceof d.a) {
                    object42 = (d.a)object2;
                    continue;
                }
                bl2 |= ((ax.J.d)object2).b(view, f8, l8, (ax.F.c)object);
            }
        } else {
            object42 = null;
            bl2 = false;
        }
        if ((object3 = this.f) != null) {
            object3 = object3[0];
            double d8 = f8;
            ((ax.F.a)object3).b(d8, this.k);
            this.f[0].d(d8, this.l);
            if (!this.y) {
                this.b.j(f8, view, this.j, this.k, this.l, null, this.a);
                this.a = false;
            }
            if (this.t != ax.K.d.a) {
                if (this.u == null) {
                    this.u = ((View)view.getParent()).findViewById(this.t);
                }
                if ((object3 = this.u) != null) {
                    f11 = (float)(object3.getTop() + this.u.getBottom()) / 2.0f;
                    f10 = (float)(this.u.getLeft() + this.u.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        f9 = view.getLeft();
                        f12 = view.getTop();
                        view.setPivotX(f10 - f9);
                        view.setPivotY(f11 - f12);
                    }
                }
            }
            if ((object3 = this.q) != null) {
                for (ax.F.e e8 : ((HashMap)object3).values()) {
                    if (!(e8 instanceof c.a) || ((Object)(object2 = (Object)this.l)).length <= 1) continue;
                    ((c.a)e8).c(view, f8, (double)object2[0], (double)object2[1]);
                }
            }
            if (object42 != null) {
                object3 = this.l;
                bl = ((d.a)object42).c(view, (ax.F.c)object, f8, l8, (double)object3[0], (double)object3[1]);
                bl2 |= bl;
            }
            for (n8 = 1; n8 < ((ax.F.a[])(object = this.f)).length; ++n8) {
                object[n8].c(d8, this.n);
                ax.J.a.b(this.b.p0.get(this.m[n8 - 1]), view, this.n);
            }
            object = this.d;
            if (((f)object).q == 0) {
                if (f8 <= 0.0f) {
                    view.setVisibility(((f)object).c0);
                } else if (f8 >= 1.0f) {
                    view.setVisibility(this.e.c0);
                } else if (this.e.c0 != ((f)object).c0) {
                    view.setVisibility(0);
                }
            }
            f12 = f8;
            bl = bl2;
            if (this.s != null) {
                n8 = 0;
                while (true) {
                    object = this.s;
                    f12 = f8;
                    bl = bl2;
                    if (n8 < ((Object)object).length) {
                        ((e)object[n8]).a(f8, view);
                        ++n8;
                        continue;
                    }
                    break;
                }
            }
        } else {
            object = this.b;
            float f13 = ((k)object).f0;
            object42 = this.c;
            float f14 = ((k)object42).f0;
            float f15 = ((k)object).g0;
            float f16 = ((k)object42).g0;
            f12 = ((k)object).h0;
            f10 = ((k)object42).h0;
            f9 = ((k)object).i0;
            f11 = ((k)object42).i0;
            f13 = f13 + (f14 - f13) * f8 + 0.5f;
            int n9 = (int)f13;
            f15 = f15 + (f16 - f15) * f8 + 0.5f;
            int n10 = (int)f15;
            int n11 = (int)(f13 + ((f10 - f12) * f8 + f12));
            n8 = (int)(f15 + ((f11 - f9) * f8 + f9));
            if (f10 != f12 || f11 != f9 || this.a) {
                view.measure(View.MeasureSpec.makeMeasureSpec((int)(n11 - n9), (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)(n8 - n10), (int)0x40000000));
                this.a = false;
            }
            view.layout(n9, n10, n11, n8);
            bl = bl2;
            f12 = f8;
        }
        if ((object = this.r) != null) {
            for (Object object42 : ((HashMap)object).values()) {
                if (object42 instanceof b.a) {
                    object3 = (b.a)object42;
                    object42 = this.l;
                    ((b.a)object3).c(view, f12, (double)object42[0], (double)object42[1]);
                    continue;
                }
                ((b)object42).b(view, f12);
            }
        }
        return bl;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" start: x: ");
        stringBuilder.append(this.b.f0);
        stringBuilder.append(" y: ");
        stringBuilder.append(this.b.g0);
        stringBuilder.append(" end: x: ");
        stringBuilder.append(this.c.f0);
        stringBuilder.append(" y: ");
        stringBuilder.append(this.c.g0);
        return stringBuilder.toString();
    }
}

