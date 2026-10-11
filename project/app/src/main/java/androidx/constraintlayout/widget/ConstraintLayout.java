/*
 * Decompiled with CFR 0.152.
 */
package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.f;
import androidx.constraintlayout.widget.g;
import androidx.constraintlayout.widget.h;
import ax.H.d;
import ax.H.e;
import ax.H.k;
import ax.H.l;
import ax.I.b;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout
extends ViewGroup {
    private static ax.L.d x;
    SparseArray<View> a = new SparseArray();
    private ArrayList<androidx.constraintlayout.widget.c> b = new ArrayList(4);
    protected ax.H.f c = new ax.H.f();
    private int d = 0;
    private int e = 0;
    private int f = Integer.MAX_VALUE;
    private int g = Integer.MAX_VALUE;
    protected boolean h = true;
    private int i = 257;
    private e j = null;
    protected d k = null;
    private int l = -1;
    private HashMap<String, Integer> m = new HashMap();
    private int n = -1;
    private int o = -1;
    int p = -1;
    int q = -1;
    int r = 0;
    int s = 0;
    private SparseArray<ax.H.e> t = new SparseArray();
    c u = new c(this, this);
    private int v = 0;
    private int w = 0;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        this.q(attributeSet, n8, 0);
    }

    private boolean A() {
        boolean bl;
        int n8 = this.getChildCount();
        boolean bl2 = false;
        int n9 = 0;
        while (true) {
            bl = bl2;
            if (n9 >= n8) break;
            if (this.getChildAt(n9).isLayoutRequested()) {
                bl = true;
                break;
            }
            ++n9;
        }
        if (bl) {
            this.w();
        }
        return bl;
    }

    private int getPaddingWidth() {
        int n8 = Math.max(0, this.getPaddingLeft());
        int n9 = Math.max(0, this.getPaddingRight());
        int n10 = Math.max(0, this.getPaddingStart()) + Math.max(0, this.getPaddingEnd());
        if (n10 > 0) {
            return n10;
        }
        return n8 + n9;
    }

    public static ax.L.d getSharedValues() {
        if (x == null) {
            x = new ax.L.d();
        }
        return x;
    }

    private final ax.H.e l(int n8) {
        View view;
        if (n8 == 0) {
            return this.c;
        }
        View view2 = view = (View)this.a.get(n8);
        if (view == null) {
            view2 = view = this.findViewById(n8);
            if (view != null) {
                view2 = view;
                if (view != this) {
                    view2 = view;
                    if (view.getParent() == this) {
                        this.onViewAdded(view);
                        view2 = view;
                    }
                }
            }
        }
        if (view2 == this) {
            return this.c;
        }
        if (view2 == null) {
            return null;
        }
        return ((b)view2.getLayoutParams()).v0;
    }

    private void q(AttributeSet attributeSet, int n8, int n9) {
        this.c.B0((Object)this);
        this.c.V1(this.u);
        this.a.put(this.getId(), (Object)this);
        this.j = null;
        if (attributeSet != null) {
            attributeSet = this.getContext().obtainStyledAttributes(attributeSet, ax.L.c.n1, n8, n9);
            n9 = attributeSet.getIndexCount();
            for (n8 = 0; n8 < n9; ++n8) {
                int n10 = attributeSet.getIndex(n8);
                if (n10 == ax.L.c.x1) {
                    this.d = attributeSet.getDimensionPixelOffset(n10, this.d);
                    continue;
                }
                if (n10 == ax.L.c.y1) {
                    this.e = attributeSet.getDimensionPixelOffset(n10, this.e);
                    continue;
                }
                if (n10 == ax.L.c.v1) {
                    this.f = attributeSet.getDimensionPixelOffset(n10, this.f);
                    continue;
                }
                if (n10 == ax.L.c.w1) {
                    this.g = attributeSet.getDimensionPixelOffset(n10, this.g);
                    continue;
                }
                if (n10 == ax.L.c.g3) {
                    this.i = attributeSet.getInt(n10, this.i);
                    continue;
                }
                if (n10 == ax.L.c.b2) {
                    if ((n10 = attributeSet.getResourceId(n10, 0)) == 0) continue;
                    try {
                        this.t(n10);
                    }
                    catch (Resources.NotFoundException notFoundException) {
                        this.k = null;
                    }
                    continue;
                }
                if (n10 != ax.L.c.F1) continue;
                n10 = attributeSet.getResourceId(n10, 0);
                try {
                    e e8;
                    this.j = e8 = new e();
                    e8.l(this.getContext(), n10);
                }
                catch (Resources.NotFoundException notFoundException) {
                    this.j = null;
                }
                this.l = n10;
            }
            attributeSet.recycle();
        }
        this.c.W1(this.i);
    }

    private void s() {
        this.h = true;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void w() {
        int n8;
        String string;
        Object object;
        int n9;
        boolean bl = this.isInEditMode();
        int n10 = this.getChildCount();
        for (n9 = 0; n9 < n10; ++n9) {
            object = this.n(this.getChildAt(n9));
            if (object == null) continue;
            ((ax.H.e)object).t0();
        }
        if (bl) {
            for (n9 = 0; n9 < n10; ++n9) {
                View view = this.getChildAt(n9);
                try {
                    string = this.getResources().getResourceName(view.getId());
                    this.x(0, string, view.getId());
                    n8 = string.indexOf(47);
                    object = string;
                    if (n8 != -1) {
                        object = string.substring(n8 + 1);
                    }
                    this.l(view.getId()).C0((String)object);
                    continue;
                }
                catch (Resources.NotFoundException notFoundException) {}
            }
        }
        if (this.l != -1) {
            for (n9 = 0; n9 < n10; ++n9) {
                object = this.getChildAt(n9);
                if (object.getId() != this.l || !(object instanceof f)) continue;
                this.j = ((f)((Object)object)).getConstraintSet();
            }
        }
        if ((object = this.j) != null) {
            ((e)object).d(this, true);
        }
        this.c.u1();
        n8 = this.b.size();
        if (n8 > 0) {
            for (n9 = 0; n9 < n8; ++n9) {
                this.b.get(n9).r(this);
            }
        }
        for (n9 = 0; n9 < n10; ++n9) {
            object = this.getChildAt(n9);
            if (!(object instanceof h)) continue;
            ((h)((Object)object)).b(this);
        }
        this.t.clear();
        this.t.put(0, (Object)this.c);
        this.t.put(this.getId(), (Object)this.c);
        for (n9 = 0; n9 < n10; ++n9) {
            string = this.getChildAt(n9);
            object = this.n((View)string);
            this.t.put(string.getId(), object);
        }
        n9 = 0;
        while (n9 < n10) {
            string = this.getChildAt(n9);
            object = this.n((View)string);
            if (object != null) {
                b b8 = (b)string.getLayoutParams();
                this.c.c((ax.H.e)object);
                this.g(bl, (View)string, (ax.H.e)object, b8, this.t);
            }
            ++n9;
        }
        return;
    }

    private void z(ax.H.e e8, b b8, SparseArray<ax.H.e> object, int n8, d.b b9) {
        Object object2 = (View)this.a.get(n8);
        if ((object = (ax.H.e)object.get(n8)) != null && object2 != null && object2.getLayoutParams() instanceof b) {
            b8.g0 = true;
            d.b b10 = d.b.g0;
            if (b9 == b10) {
                object2 = (b)object2.getLayoutParams();
                object2.g0 = true;
                object2.v0.K0(true);
            }
            e8.o(b10).b(((ax.H.e)object).o(b9), b8.D, b8.C, true);
            e8.K0(true);
            e8.o(d.b.d0).q();
            e8.o(d.b.f0).q();
        }
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    protected void dispatchDraw(Canvas canvas) {
        int n8;
        int n9;
        Paint paint = this.b;
        if (paint != null && (n9 = paint.size()) > 0) {
            for (n8 = 0; n8 < n9; ++n8) {
                this.b.get(n8).q(this);
            }
        }
        super.dispatchDraw(canvas);
        if (this.isInEditMode()) {
            float f8 = this.getWidth();
            float f9 = this.getHeight();
            n9 = this.getChildCount();
            for (n8 = 0; n8 < n9; ++n8) {
                paint = this.getChildAt(n8);
                if (paint.getVisibility() == 8 || (paint = paint.getTag()) == null || !(paint instanceof String) || ((String[])(paint = ((String)paint).split(","))).length != 4) continue;
                int n10 = Integer.parseInt(paint[0]);
                int n11 = Integer.parseInt(paint[1]);
                int n12 = Integer.parseInt(paint[2]);
                int n13 = Integer.parseInt(paint[3]);
                n10 = (int)((float)n10 / 1080.0f * f8);
                n11 = (int)((float)n11 / 1920.0f * f9);
                n12 = (int)((float)n12 / 1080.0f * f8);
                n13 = (int)((float)n13 / 1920.0f * f9);
                paint = new Paint();
                paint.setColor(-65536);
                float f10 = n10;
                float f11 = n11;
                float f12 = n10 + n12;
                canvas.drawLine(f10, f11, f12, f11, paint);
                float f13 = n11 + n13;
                canvas.drawLine(f12, f11, f12, f13, paint);
                canvas.drawLine(f12, f13, f10, f13, paint);
                canvas.drawLine(f10, f13, f10, f11, paint);
                paint.setColor(-16711936);
                canvas.drawLine(f10, f11, f12, f13, paint);
                canvas.drawLine(f10, f13, f12, f11, paint);
            }
        }
    }

    public void forceLayout() {
        this.s();
        super.forceLayout();
    }

    protected void g(boolean bl, View object, ax.H.e e8, b b8, SparseArray<ax.H.e> sparseArray) {
        b8.a();
        b8.w0 = false;
        e8.j1(object.getVisibility());
        if (b8.j0) {
            e8.T0(true);
            e8.j1(8);
        }
        e8.B0(object);
        if (object instanceof androidx.constraintlayout.widget.c) {
            ((androidx.constraintlayout.widget.c)((Object)object)).n(e8, this.c.P1());
        }
        if (b8.h0) {
            object = (ax.H.h)e8;
            int n8 = b8.s0;
            int n9 = b8.t0;
            float f8 = b8.u0;
            if (f8 != -1.0f) {
                object.z1(f8);
                return;
            }
            if (n8 != -1) {
                object.x1(n8);
                return;
            }
            if (n9 != -1) {
                object.y1(n9);
            }
            return;
        }
        int n10 = b8.l0;
        int n11 = b8.m0;
        int n12 = b8.n0;
        int n13 = b8.o0;
        int n14 = b8.p0;
        int n15 = b8.q0;
        float f9 = b8.r0;
        int n16 = b8.p;
        if (n16 != -1) {
            object = (ax.H.e)sparseArray.get(n16);
            if (object != null) {
                e8.l((ax.H.e)object, b8.r, b8.q);
            }
        } else {
            Object object2;
            if (n10 != -1) {
                object = (ax.H.e)sparseArray.get(n10);
                if (object != null) {
                    object2 = d.b.c0;
                    e8.e0((d.b)((Object)object2), (ax.H.e)object, (d.b)((Object)object2), b8.leftMargin, n14);
                }
            } else if (n11 != -1 && (object = (ax.H.e)sparseArray.get(n11)) != null) {
                e8.e0(d.b.c0, (ax.H.e)object, d.b.e0, b8.leftMargin, n14);
            }
            if (n12 != -1) {
                object = (ax.H.e)sparseArray.get(n12);
                if (object != null) {
                    e8.e0(d.b.e0, (ax.H.e)object, d.b.c0, b8.rightMargin, n15);
                }
            } else if (n13 != -1 && (object = (ax.H.e)sparseArray.get(n13)) != null) {
                object2 = d.b.e0;
                e8.e0((d.b)((Object)object2), (ax.H.e)object, (d.b)((Object)object2), b8.rightMargin, n15);
            }
            if ((n15 = b8.i) != -1) {
                object = (ax.H.e)sparseArray.get(n15);
                if (object != null) {
                    object2 = d.b.d0;
                    e8.e0((d.b)((Object)object2), (ax.H.e)object, (d.b)((Object)object2), b8.topMargin, b8.x);
                }
            } else {
                n15 = b8.j;
                if (n15 != -1 && (object = (ax.H.e)sparseArray.get(n15)) != null) {
                    e8.e0(d.b.d0, (ax.H.e)object, d.b.f0, b8.topMargin, b8.x);
                }
            }
            if ((n15 = b8.k) != -1) {
                object = (ax.H.e)sparseArray.get(n15);
                if (object != null) {
                    e8.e0(d.b.f0, (ax.H.e)object, d.b.d0, b8.bottomMargin, b8.z);
                }
            } else {
                n15 = b8.l;
                if (n15 != -1 && (object2 = (ax.H.e)sparseArray.get(n15)) != null) {
                    object = d.b.f0;
                    e8.e0((d.b)((Object)object), (ax.H.e)object2, (d.b)((Object)object), b8.bottomMargin, b8.z);
                }
            }
            if ((n15 = b8.m) != -1) {
                this.z(e8, b8, sparseArray, n15, d.b.g0);
            } else {
                n15 = b8.n;
                if (n15 != -1) {
                    this.z(e8, b8, sparseArray, n15, d.b.d0);
                } else {
                    n15 = b8.o;
                    if (n15 != -1) {
                        this.z(e8, b8, sparseArray, n15, d.b.f0);
                    }
                }
            }
            if (f9 >= 0.0f) {
                e8.M0(f9);
            }
            if ((f9 = b8.H) >= 0.0f) {
                e8.d1(f9);
            }
        }
        if (bl && ((n15 = b8.X) != -1 || b8.Y != -1)) {
            e8.b1(n15, b8.Y);
        }
        if (!b8.e0) {
            if (b8.width == -1) {
                if (b8.a0) {
                    e8.P0(e.b.d0);
                } else {
                    e8.P0(e.b.e0);
                }
                e8.o((d.b)d.b.c0).g = b8.leftMargin;
                e8.o((d.b)d.b.e0).g = b8.rightMargin;
            } else {
                e8.P0(e.b.d0);
                e8.k1(0);
            }
        } else {
            e8.P0(e.b.q);
            e8.k1(b8.width);
            if (b8.width == -2) {
                e8.P0(e.b.c0);
            }
        }
        if (!b8.f0) {
            if (b8.height == -1) {
                if (b8.b0) {
                    e8.g1(e.b.d0);
                } else {
                    e8.g1(e.b.e0);
                }
                e8.o((d.b)d.b.d0).g = b8.topMargin;
                e8.o((d.b)d.b.f0).g = b8.bottomMargin;
            } else {
                e8.g1(e.b.d0);
                e8.L0(0);
            }
        } else {
            e8.g1(e.b.q);
            e8.L0(b8.height);
            if (b8.height == -2) {
                e8.g1(e.b.c0);
            }
        }
        e8.D0(b8.I);
        e8.R0(b8.L);
        e8.i1(b8.M);
        e8.N0(b8.N);
        e8.e1(b8.O);
        e8.l1(b8.d0);
        e8.Q0(b8.P, b8.R, b8.T, b8.V);
        e8.h1(b8.Q, b8.S, b8.U, b8.W);
    }

    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getMaxHeight() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.J1();
    }

    public String getSceneString() {
        Object object;
        int n8;
        StringBuilder stringBuilder = new StringBuilder();
        if (this.c.o == null) {
            n8 = this.getId();
            this.c.o = n8 != -1 ? (object = this.getContext().getResources().getResourceEntryName(n8)) : "parent";
        }
        if (this.c.t() == null) {
            object = this.c;
            ((ax.H.e)object).C0(((ax.H.e)object).o);
            object = new StringBuilder();
            ((StringBuilder)object).append(" setDebugName ");
            ((StringBuilder)object).append(this.c.t());
            Log.v((String)"ConstraintLayout", (String)((StringBuilder)object).toString());
        }
        object = this.c.r1();
        int n9 = ((ArrayList)object).size();
        n8 = 0;
        while (n8 < n9) {
            Object object2 = ((ArrayList)object).get(n8);
            int n10 = n8 + 1;
            object2 = (ax.H.e)object2;
            Object object3 = (View)((ax.H.e)object2).s();
            n8 = n10;
            if (object3 == null) continue;
            if (((ax.H.e)object2).o == null && (n8 = object3.getId()) != -1) {
                ((ax.H.e)object2).o = this.getContext().getResources().getResourceEntryName(n8);
            }
            n8 = n10;
            if (((ax.H.e)object2).t() != null) continue;
            ((ax.H.e)object2).C0(((ax.H.e)object2).o);
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(" setDebugName ");
            ((StringBuilder)object3).append(((ax.H.e)object2).t());
            Log.v((String)"ConstraintLayout", (String)((StringBuilder)object3).toString());
            n8 = n10;
        }
        this.c.O(stringBuilder);
        return stringBuilder.toString();
    }

    protected b i() {
        return new b(-2, -2);
    }

    public b j(AttributeSet attributeSet) {
        return new b(this.getContext(), attributeSet);
    }

    public Object k(int n8, Object object) {
        if (n8 == 0 && object instanceof String) {
            object = (String)object;
            HashMap<String, Integer> hashMap = this.m;
            if (hashMap != null && hashMap.containsKey(object)) {
                return this.m.get(object);
            }
        }
        return null;
    }

    public View m(int n8) {
        return (View)this.a.get(n8);
    }

    public final ax.H.e n(View view) {
        if (view == this) {
            return this.c;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof b) {
                return ((b)view.getLayoutParams()).v0;
            }
            view.setLayoutParams(this.generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof b) {
                return ((b)view.getLayoutParams()).v0;
            }
        }
        return null;
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        n10 = this.getChildCount();
        bl = this.isInEditMode();
        n9 = 0;
        for (n8 = 0; n8 < n10; ++n8) {
            View view = this.getChildAt(n8);
            b b8 = (b)view.getLayoutParams();
            ax.H.e e8 = b8.v0;
            if (view.getVisibility() == 8 && !b8.h0 && !b8.i0 && !b8.k0 && !bl || b8.j0) continue;
            n11 = e8.X();
            int n12 = e8.Y();
            int n13 = e8.W() + n11;
            int n14 = e8.x() + n12;
            view.layout(n11, n12, n13, n14);
            if (!(view instanceof h) || (view = ((h)view).getContent()) == null) continue;
            view.setVisibility(0);
            view.layout(n11, n12, n13, n14);
        }
        n10 = this.b.size();
        if (n10 > 0) {
            for (n8 = n9; n8 < n10; ++n8) {
                this.b.get(n8).o(this);
            }
        }
    }

    protected void onMeasure(int n8, int n9) {
        int n10;
        if (this.v == n8) {
            n10 = this.w;
        }
        if (!this.h) {
            int n11 = this.getChildCount();
            for (n10 = 0; n10 < n11; ++n10) {
                if (!this.getChildAt(n10).isLayoutRequested()) continue;
                this.h = true;
                break;
            }
        }
        this.v = n8;
        this.w = n9;
        this.c.Y1(this.r());
        if (this.h) {
            this.h = false;
            if (this.A()) {
                this.c.a2();
            }
        }
        this.v(this.c, this.i, n8, n9);
        this.u(n8, n9, this.c.W(), this.c.x(), this.c.Q1(), this.c.O1());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        Object object = this.n(view);
        if (view instanceof g && !(object instanceof ax.H.h)) {
            b b8 = (b)view.getLayoutParams();
            b8.v0 = object = new ax.H.h();
            b8.h0 = true;
            ((ax.H.h)object).A1(b8.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            object = (androidx.constraintlayout.widget.c)view;
            ((androidx.constraintlayout.widget.c)((Object)object)).s();
            ((b)view.getLayoutParams()).i0 = true;
            if (!this.b.contains(object)) {
                this.b.add((androidx.constraintlayout.widget.c)((Object)object));
            }
        }
        this.a.put(view.getId(), (Object)view);
        this.h = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        ax.H.e e8 = this.n(view);
        this.c.t1(e8);
        this.b.remove(view);
        this.h = true;
    }

    protected boolean r() {
        return (this.getContext().getApplicationInfo().flags & 0x400000) != 0 && 1 == this.getLayoutDirection();
    }

    public void requestLayout() {
        this.s();
        super.requestLayout();
    }

    public void setConstraintSet(e e8) {
        this.j = e8;
    }

    public void setId(int n8) {
        this.a.remove(this.getId());
        super.setId(n8);
        this.a.put(this.getId(), (Object)this);
    }

    public void setMaxHeight(int n8) {
        if (n8 == this.g) {
            return;
        }
        this.g = n8;
        this.requestLayout();
    }

    public void setMaxWidth(int n8) {
        if (n8 == this.f) {
            return;
        }
        this.f = n8;
        this.requestLayout();
    }

    public void setMinHeight(int n8) {
        if (n8 == this.e) {
            return;
        }
        this.e = n8;
        this.requestLayout();
    }

    public void setMinWidth(int n8) {
        if (n8 == this.d) {
            return;
        }
        this.d = n8;
        this.requestLayout();
    }

    public void setOnConstraintsChanged(ax.L.a a8) {
        d d8 = this.k;
        if (d8 != null) {
            d8.c(a8);
        }
    }

    public void setOptimizationLevel(int n8) {
        this.i = n8;
        this.c.W1(n8);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected void t(int n8) {
        this.k = new d(this.getContext(), this, n8);
    }

    protected void u(int n8, int n9, int n10, int n11, boolean bl, boolean bl2) {
        c c8 = this.u;
        int n12 = c8.e;
        n8 = View.resolveSizeAndState((int)(n10 + c8.d), (int)n8, (int)0);
        n10 = View.resolveSizeAndState((int)(n11 + n12), (int)n9, (int)0);
        n9 = Math.min(this.f, n8 & 0xFFFFFF);
        n10 = Math.min(this.g, n10 & 0xFFFFFF);
        n8 = n9;
        if (bl) {
            n8 = n9 | 0x1000000;
        }
        n9 = n10;
        if (bl2) {
            n9 = n10 | 0x1000000;
        }
        this.setMeasuredDimension(n8, n9);
        this.n = n8;
        this.o = n9;
    }

    protected void v(ax.H.f f8, int n8, int n9, int n10) {
        int n11 = View.MeasureSpec.getMode((int)n9);
        int n12 = View.MeasureSpec.getSize((int)n9);
        int n13 = View.MeasureSpec.getMode((int)n10);
        int n14 = View.MeasureSpec.getSize((int)n10);
        int n15 = Math.max(0, this.getPaddingTop());
        int n16 = Math.max(0, this.getPaddingBottom());
        int n17 = n15 + n16;
        int n18 = this.getPaddingWidth();
        this.u.c(n9, n10, n15, n16, n18, n17);
        n9 = Math.max(0, this.getPaddingStart());
        n10 = Math.max(0, this.getPaddingEnd());
        if (n9 <= 0 && n10 <= 0) {
            n9 = Math.max(0, this.getPaddingLeft());
        } else if (this.r()) {
            n9 = n10;
        }
        n10 = n12 - n18;
        this.y(f8, n11, n10, n13, n14 -= n17);
        f8.R1(n8, n11, n10, n13, n14, this.n, this.o, n9, n15);
    }

    public void x(int n8, Object object, Object object2) {
        if (n8 == 0 && object instanceof String && object2 instanceof Integer) {
            if (this.m == null) {
                this.m = new HashMap();
            }
            String string = (String)object;
            n8 = string.indexOf("/");
            object = string;
            if (n8 != -1) {
                object = string.substring(n8 + 1);
            }
            object2 = (Integer)object2;
            ((Integer)object2).intValue();
            this.m.put((String)object, (Integer)object2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void y(ax.H.f var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        var9_6 /* !! */  = this.u;
        var6_7 = var9_6 /* !! */ .e;
        var7_8 = var9_6 /* !! */ .d;
        var10_9 = e.b.q;
        var8_10 = this.getChildCount();
        if (var2_2 != -2147483648) {
            if (var2_2 != 0) {
                if (var2_2 != 0x40000000) {
                    var9_6 /* !! */  = var10_9;
                    while (true) {
                        var3_3 = 0;
                        break;
                    }
                } else {
                    var3_3 = Math.min(this.f - var7_8, var3_3);
                    var9_6 /* !! */  = var10_9;
                }
            } else {
                var11_11 = e.b.c0;
                var9_6 /* !! */  = var11_11;
                if (var8_10 != 0) ** continue;
                var3_3 = Math.max(0, this.d);
                var9_6 /* !! */  = var11_11;
            }
        } else {
            var11_11 = e.b.c0;
            var9_6 /* !! */  = var11_11;
            if (var8_10 == 0) {
                var3_3 = Math.max(0, this.d);
                var9_6 /* !! */  = var11_11;
            }
        }
        if (var4_4 != -2147483648) {
            if (var4_4 != 0) {
                if (var4_4 != 0x40000000) {
                    while (true) {
                        var5_5 = 0;
                        break;
                    }
                } else {
                    var5_5 = Math.min(this.g - var6_7, var5_5);
                }
            } else {
                var10_9 = var11_11 = e.b.c0;
                if (var8_10 != 0) ** continue;
                var5_5 = Math.max(0, this.e);
                var10_9 = var11_11;
            }
        } else {
            var10_9 = var11_11 = e.b.c0;
            if (var8_10 == 0) {
                var5_5 = Math.max(0, this.e);
                var10_9 = var11_11;
            }
        }
        if (var3_3 != var1_1.W() || var5_5 != var1_1.x()) {
            var1_1.N1();
        }
        var1_1.m1(0);
        var1_1.n1(0);
        var1_1.X0(this.f - var7_8);
        var1_1.W0(this.g - var6_7);
        var1_1.a1(0);
        var1_1.Z0(0);
        var1_1.P0((e.b)var9_6 /* !! */ );
        var1_1.k1(var3_3);
        var1_1.g1(var10_9);
        var1_1.L0(var5_5);
        var1_1.a1(this.d - var7_8);
        var1_1.Z0(this.e - var6_7);
    }

    public static class b
    extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D = 0;
        boolean E = true;
        boolean F = true;
        public float G = 0.5f;
        public float H = 0.5f;
        public String I = null;
        float J = 0.0f;
        int K = 1;
        public float L = -1.0f;
        public float M = -1.0f;
        public int N = 0;
        public int O = 0;
        public int P = 0;
        public int Q = 0;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public float V = 1.0f;
        public float W = 1.0f;
        public int X = -1;
        public int Y = -1;
        public int Z = -1;
        public int a = -1;
        public boolean a0 = false;
        public int b = -1;
        public boolean b0 = false;
        public float c = -1.0f;
        public String c0 = null;
        public boolean d = true;
        public int d0 = 0;
        public int e = -1;
        boolean e0 = true;
        public int f = -1;
        boolean f0 = true;
        public int g = -1;
        boolean g0 = false;
        public int h = -1;
        boolean h0 = false;
        public int i = -1;
        boolean i0 = false;
        public int j = -1;
        boolean j0 = false;
        public int k = -1;
        boolean k0 = false;
        public int l = -1;
        int l0 = -1;
        public int m = -1;
        int m0 = -1;
        public int n = -1;
        int n0 = -1;
        public int o = -1;
        int o0 = -1;
        public int p = -1;
        int p0;
        public int q = 0;
        int q0;
        public float r = 0.0f;
        float r0 = 0.5f;
        public int s = -1;
        int s0;
        public int t = -1;
        int t0;
        public int u = -1;
        float u0;
        public int v = -1;
        ax.H.e v0;
        public int w = Integer.MIN_VALUE;
        public boolean w0 = false;
        public int x = Integer.MIN_VALUE;
        public int y = Integer.MIN_VALUE;
        public int z = Integer.MIN_VALUE;

        public b(int n8, int n9) {
            super(n8, n9);
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.v0 = new ax.H.e();
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.v0 = new ax.H.e();
            context = context.obtainStyledAttributes(attributeSet, ax.L.c.n1);
            int n8 = context.getIndexCount();
            block68: for (int i8 = 0; i8 < n8; ++i8) {
                int n9 = context.getIndex(i8);
                int n10 = a.a.get(n9);
                switch (n10) {
                    default: {
                        block44 : switch (n10) {
                            default: {
                                switch (n10) {
                                    default: {
                                        break block44;
                                    }
                                    case 67: {
                                        this.d = context.getBoolean(n9, this.d);
                                        break block44;
                                    }
                                    case 66: {
                                        this.d0 = context.getInt(n9, this.d0);
                                        break block44;
                                    }
                                    case 65: {
                                        androidx.constraintlayout.widget.e.o((Object)this, (TypedArray)context, n9, 1);
                                        this.F = true;
                                        break block44;
                                    }
                                    case 64: 
                                }
                                androidx.constraintlayout.widget.e.o((Object)this, (TypedArray)context, n9, 0);
                                this.E = true;
                                break;
                            }
                            case 55: {
                                this.C = context.getDimensionPixelSize(n9, this.C);
                                break;
                            }
                            case 54: {
                                this.D = context.getDimensionPixelSize(n9, this.D);
                                break;
                            }
                            case 53: {
                                this.o = n10 = context.getResourceId(n9, this.o);
                                if (n10 != -1) continue block68;
                                this.o = context.getInt(n9, -1);
                                break;
                            }
                            case 52: {
                                this.n = n10 = context.getResourceId(n9, this.n);
                                if (n10 != -1) continue block68;
                                this.n = context.getInt(n9, -1);
                                break;
                            }
                            case 51: {
                                this.c0 = context.getString(n9);
                                break;
                            }
                            case 50: {
                                this.Y = context.getDimensionPixelOffset(n9, this.Y);
                                break;
                            }
                            case 49: {
                                this.X = context.getDimensionPixelOffset(n9, this.X);
                                break;
                            }
                            case 48: {
                                this.O = context.getInt(n9, 0);
                                break;
                            }
                            case 47: {
                                this.N = context.getInt(n9, 0);
                                break;
                            }
                            case 46: {
                                this.M = context.getFloat(n9, this.M);
                                break;
                            }
                            case 45: {
                                this.L = context.getFloat(n9, this.L);
                                break;
                            }
                            case 44: {
                                androidx.constraintlayout.widget.e.q(this, context.getString(n9));
                                break;
                            }
                        }
                        continue block68;
                    }
                    case 38: {
                        this.W = Math.max(0.0f, context.getFloat(n9, this.W));
                        this.Q = 2;
                        continue block68;
                    }
                    case 37: {
                        try {
                            this.U = context.getDimensionPixelSize(n9, this.U);
                        }
                        catch (Exception exception) {
                            if (context.getInt(n9, this.U) != -2) continue block68;
                            this.U = -2;
                        }
                        continue block68;
                    }
                    case 36: {
                        try {
                            this.S = context.getDimensionPixelSize(n9, this.S);
                        }
                        catch (Exception exception) {
                            if (context.getInt(n9, this.S) != -2) continue block68;
                            this.S = -2;
                        }
                        continue block68;
                    }
                    case 35: {
                        this.V = Math.max(0.0f, context.getFloat(n9, this.V));
                        this.P = 2;
                        continue block68;
                    }
                    case 34: {
                        try {
                            this.T = context.getDimensionPixelSize(n9, this.T);
                        }
                        catch (Exception exception) {
                            if (context.getInt(n9, this.T) != -2) continue block68;
                            this.T = -2;
                        }
                        continue block68;
                    }
                    case 33: {
                        try {
                            this.R = context.getDimensionPixelSize(n9, this.R);
                        }
                        catch (Exception exception) {
                            if (context.getInt(n9, this.R) != -2) continue block68;
                            this.R = -2;
                        }
                        continue block68;
                    }
                    case 32: {
                        this.Q = n9 = context.getInt(n9, 0);
                        if (n9 != 1) continue block68;
                        Log.e((String)"ConstraintLayout", (String)"layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        continue block68;
                    }
                    case 31: {
                        this.P = n9 = context.getInt(n9, 0);
                        if (n9 != 1) continue block68;
                        Log.e((String)"ConstraintLayout", (String)"layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        continue block68;
                    }
                    case 30: {
                        this.H = context.getFloat(n9, this.H);
                        continue block68;
                    }
                    case 29: {
                        this.G = context.getFloat(n9, this.G);
                        continue block68;
                    }
                    case 28: {
                        this.b0 = context.getBoolean(n9, this.b0);
                        continue block68;
                    }
                    case 27: {
                        this.a0 = context.getBoolean(n9, this.a0);
                        continue block68;
                    }
                    case 26: {
                        this.B = context.getDimensionPixelSize(n9, this.B);
                        continue block68;
                    }
                    case 25: {
                        this.A = context.getDimensionPixelSize(n9, this.A);
                        continue block68;
                    }
                    case 24: {
                        this.z = context.getDimensionPixelSize(n9, this.z);
                        continue block68;
                    }
                    case 23: {
                        this.y = context.getDimensionPixelSize(n9, this.y);
                        continue block68;
                    }
                    case 22: {
                        this.x = context.getDimensionPixelSize(n9, this.x);
                        continue block68;
                    }
                    case 21: {
                        this.w = context.getDimensionPixelSize(n9, this.w);
                        continue block68;
                    }
                    case 20: {
                        this.v = n10 = context.getResourceId(n9, this.v);
                        if (n10 != -1) continue block68;
                        this.v = context.getInt(n9, -1);
                        continue block68;
                    }
                    case 19: {
                        this.u = n10 = context.getResourceId(n9, this.u);
                        if (n10 != -1) continue block68;
                        this.u = context.getInt(n9, -1);
                        continue block68;
                    }
                    case 18: {
                        this.t = n10 = context.getResourceId(n9, this.t);
                        if (n10 != -1) continue block68;
                        this.t = context.getInt(n9, -1);
                        continue block68;
                    }
                    case 17: {
                        this.s = n10 = context.getResourceId(n9, this.s);
                        if (n10 != -1) continue block68;
                        this.s = context.getInt(n9, -1);
                        continue block68;
                    }
                    case 16: {
                        this.m = n10 = context.getResourceId(n9, this.m);
                        if (n10 != -1) continue block68;
                        this.m = context.getInt(n9, -1);
                        continue block68;
                    }
                    case 15: {
                        this.l = n10 = context.getResourceId(n9, this.l);
                        if (n10 != -1) continue block68;
                        this.l = context.getInt(n9, -1);
                        continue block68;
                    }
                    case 14: {
                        this.k = n10 = context.getResourceId(n9, this.k);
                        if (n10 != -1) continue block68;
                        this.k = context.getInt(n9, -1);
                        continue block68;
                    }
                    case 13: {
                        this.j = n10 = context.getResourceId(n9, this.j);
                        if (n10 != -1) continue block68;
                        this.j = context.getInt(n9, -1);
                        continue block68;
                    }
                    case 12: {
                        this.i = n10 = context.getResourceId(n9, this.i);
                        if (n10 != -1) continue block68;
                        this.i = context.getInt(n9, -1);
                        continue block68;
                    }
                    case 11: {
                        this.h = n10 = context.getResourceId(n9, this.h);
                        if (n10 != -1) continue block68;
                        this.h = context.getInt(n9, -1);
                        continue block68;
                    }
                    case 10: {
                        this.g = n10 = context.getResourceId(n9, this.g);
                        if (n10 != -1) continue block68;
                        this.g = context.getInt(n9, -1);
                        continue block68;
                    }
                    case 9: {
                        this.f = n10 = context.getResourceId(n9, this.f);
                        if (n10 != -1) continue block68;
                        this.f = context.getInt(n9, -1);
                        continue block68;
                    }
                    case 8: {
                        this.e = n10 = context.getResourceId(n9, this.e);
                        if (n10 != -1) continue block68;
                        this.e = context.getInt(n9, -1);
                        continue block68;
                    }
                    case 7: {
                        this.c = context.getFloat(n9, this.c);
                        continue block68;
                    }
                    case 6: {
                        this.b = context.getDimensionPixelOffset(n9, this.b);
                        continue block68;
                    }
                    case 5: {
                        this.a = context.getDimensionPixelOffset(n9, this.a);
                        continue block68;
                    }
                    case 4: {
                        float f8;
                        this.r = f8 = context.getFloat(n9, this.r) % 360.0f;
                        if (!(f8 < 0.0f)) continue block68;
                        this.r = (360.0f - f8) % 360.0f;
                        continue block68;
                    }
                    case 3: {
                        this.q = context.getDimensionPixelSize(n9, this.q);
                        continue block68;
                    }
                    case 2: {
                        this.p = n10 = context.getResourceId(n9, this.p);
                        if (n10 != -1) continue block68;
                        this.p = context.getInt(n9, -1);
                        continue block68;
                    }
                    case 1: {
                        this.Z = context.getInt(n9, this.Z);
                    }
                }
            }
            context.recycle();
            this.a();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.v0 = new ax.H.e();
        }

        public void a() {
            int n8;
            this.h0 = false;
            this.e0 = true;
            this.f0 = true;
            int n9 = this.width;
            if (n9 == -2 && this.a0) {
                this.e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            if ((n8 = this.height) == -2 && this.b0) {
                this.f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (n9 == 0 || n9 == -1) {
                this.e0 = false;
                if (n9 == 0 && this.P == 1) {
                    this.width = -2;
                    this.a0 = true;
                }
            }
            if (n8 == 0 || n8 == -1) {
                this.f0 = false;
                if (n8 == 0 && this.Q == 1) {
                    this.height = -2;
                    this.b0 = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.h0 = true;
            this.e0 = true;
            this.f0 = true;
            if (!(this.v0 instanceof ax.H.h)) {
                this.v0 = new ax.H.h();
            }
            ((ax.H.h)this.v0).A1(this.Z);
        }

        /*
         * Enabled aggressive block sorting
         */
        @TargetApi(value=17)
        public void resolveLayoutDirection(int n8) {
            int n9;
            int n10;
            block33: {
                block29: {
                    int n11;
                    int n12;
                    block34: {
                        float f8;
                        float f9;
                        int n13;
                        block32: {
                            block31: {
                                block30: {
                                    n10 = this.leftMargin;
                                    n9 = this.rightMargin;
                                    super.resolveLayoutDirection(n8);
                                    n8 = this.getLayoutDirection();
                                    n13 = 0;
                                    n8 = 1 == n8 ? 1 : 0;
                                    this.n0 = -1;
                                    this.o0 = -1;
                                    this.l0 = -1;
                                    this.m0 = -1;
                                    this.p0 = this.w;
                                    this.q0 = this.y;
                                    this.r0 = f9 = this.G;
                                    this.s0 = n12 = this.a;
                                    this.t0 = n11 = this.b;
                                    this.u0 = f8 = this.c;
                                    if (n8 == 0) break block29;
                                    n8 = this.s;
                                    if (n8 == -1) break block30;
                                    this.n0 = n8;
                                    break block31;
                                }
                                int n14 = this.t;
                                n8 = n13;
                                if (n14 == -1) break block32;
                                this.o0 = n14;
                            }
                            n8 = 1;
                        }
                        if ((n13 = this.u) != -1) {
                            this.m0 = n13;
                            n8 = 1;
                        }
                        if ((n13 = this.v) != -1) {
                            this.l0 = n13;
                            n8 = 1;
                        }
                        if ((n13 = this.A) != Integer.MIN_VALUE) {
                            this.q0 = n13;
                        }
                        if ((n13 = this.B) != Integer.MIN_VALUE) {
                            this.p0 = n13;
                        }
                        if (n8 != 0) {
                            this.r0 = 1.0f - f9;
                        }
                        if (!this.h0 || this.Z != 1 || !this.d) break block33;
                        if (f8 == -1.0f) break block34;
                        this.u0 = 1.0f - f8;
                        this.s0 = -1;
                        this.t0 = -1;
                        break block33;
                    }
                    if (n12 != -1) {
                        this.t0 = n12;
                        this.s0 = -1;
                        this.u0 = -1.0f;
                        break block33;
                    } else if (n11 != -1) {
                        this.s0 = n11;
                        this.t0 = -1;
                        this.u0 = -1.0f;
                    }
                    break block33;
                }
                n8 = this.s;
                if (n8 != -1) {
                    this.m0 = n8;
                }
                if ((n8 = this.t) != -1) {
                    this.l0 = n8;
                }
                if ((n8 = this.u) != -1) {
                    this.n0 = n8;
                }
                if ((n8 = this.v) != -1) {
                    this.o0 = n8;
                }
                if ((n8 = this.A) != Integer.MIN_VALUE) {
                    this.p0 = n8;
                }
                if ((n8 = this.B) != Integer.MIN_VALUE) {
                    this.q0 = n8;
                }
            }
            if (this.u != -1 || this.v != -1 || this.t != -1 || this.s != -1) return;
            n8 = this.g;
            if (n8 != -1) {
                this.n0 = n8;
                if (this.rightMargin <= 0 && n9 > 0) {
                    this.rightMargin = n9;
                }
            } else {
                n8 = this.h;
                if (n8 != -1) {
                    this.o0 = n8;
                    if (this.rightMargin <= 0 && n9 > 0) {
                        this.rightMargin = n9;
                    }
                }
            }
            if ((n8 = this.e) != -1) {
                this.l0 = n8;
                if (this.leftMargin > 0 || n10 <= 0) return;
                this.leftMargin = n10;
                return;
            } else {
                n8 = this.f;
                if (n8 == -1) return;
                this.m0 = n8;
                if (this.leftMargin > 0 || n10 <= 0) return;
                this.leftMargin = n10;
            }
        }

        private static class a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray;
                a = sparseIntArray = new SparseIntArray();
                sparseIntArray.append(ax.L.c.R2, 64);
                sparseIntArray.append(ax.L.c.u2, 65);
                sparseIntArray.append(ax.L.c.D2, 8);
                sparseIntArray.append(ax.L.c.E2, 9);
                sparseIntArray.append(ax.L.c.G2, 10);
                sparseIntArray.append(ax.L.c.H2, 11);
                sparseIntArray.append(ax.L.c.N2, 12);
                sparseIntArray.append(ax.L.c.M2, 13);
                sparseIntArray.append(ax.L.c.k2, 14);
                sparseIntArray.append(ax.L.c.j2, 15);
                sparseIntArray.append(ax.L.c.f2, 16);
                sparseIntArray.append(ax.L.c.h2, 52);
                sparseIntArray.append(ax.L.c.g2, 53);
                sparseIntArray.append(ax.L.c.l2, 2);
                sparseIntArray.append(ax.L.c.n2, 3);
                sparseIntArray.append(ax.L.c.m2, 4);
                sparseIntArray.append(ax.L.c.W2, 49);
                sparseIntArray.append(ax.L.c.X2, 50);
                sparseIntArray.append(ax.L.c.r2, 5);
                sparseIntArray.append(ax.L.c.s2, 6);
                sparseIntArray.append(ax.L.c.t2, 7);
                sparseIntArray.append(ax.L.c.a2, 67);
                sparseIntArray.append(ax.L.c.o1, 1);
                sparseIntArray.append(ax.L.c.I2, 17);
                sparseIntArray.append(ax.L.c.J2, 18);
                sparseIntArray.append(ax.L.c.q2, 19);
                sparseIntArray.append(ax.L.c.p2, 20);
                sparseIntArray.append(ax.L.c.b3, 21);
                sparseIntArray.append(ax.L.c.e3, 22);
                sparseIntArray.append(ax.L.c.c3, 23);
                sparseIntArray.append(ax.L.c.Z2, 24);
                sparseIntArray.append(ax.L.c.d3, 25);
                sparseIntArray.append(ax.L.c.a3, 26);
                sparseIntArray.append(ax.L.c.Y2, 55);
                sparseIntArray.append(ax.L.c.f3, 54);
                sparseIntArray.append(ax.L.c.z2, 29);
                sparseIntArray.append(ax.L.c.O2, 30);
                sparseIntArray.append(ax.L.c.o2, 44);
                sparseIntArray.append(ax.L.c.B2, 45);
                sparseIntArray.append(ax.L.c.Q2, 46);
                sparseIntArray.append(ax.L.c.A2, 47);
                sparseIntArray.append(ax.L.c.P2, 48);
                sparseIntArray.append(ax.L.c.d2, 27);
                sparseIntArray.append(ax.L.c.c2, 28);
                sparseIntArray.append(ax.L.c.S2, 31);
                sparseIntArray.append(ax.L.c.v2, 32);
                sparseIntArray.append(ax.L.c.U2, 33);
                sparseIntArray.append(ax.L.c.T2, 34);
                sparseIntArray.append(ax.L.c.V2, 35);
                sparseIntArray.append(ax.L.c.x2, 36);
                sparseIntArray.append(ax.L.c.w2, 37);
                sparseIntArray.append(ax.L.c.y2, 38);
                sparseIntArray.append(ax.L.c.C2, 39);
                sparseIntArray.append(ax.L.c.L2, 40);
                sparseIntArray.append(ax.L.c.F2, 41);
                sparseIntArray.append(ax.L.c.i2, 42);
                sparseIntArray.append(ax.L.c.e2, 43);
                sparseIntArray.append(ax.L.c.K2, 51);
                sparseIntArray.append(ax.L.c.h3, 66);
            }
        }
    }

    class c
    implements b.b {
        ConstraintLayout a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        final ConstraintLayout h;

        public c(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
            this.h = constraintLayout;
            this.a = constraintLayout2;
        }

        private boolean d(int n8, int n9, int n10) {
            if (n8 == n9) {
                return true;
            }
            int n11 = View.MeasureSpec.getMode((int)n8);
            View.MeasureSpec.getSize((int)n8);
            n8 = View.MeasureSpec.getMode((int)n9);
            n9 = View.MeasureSpec.getSize((int)n9);
            return n8 == 0x40000000 && (n11 == Integer.MIN_VALUE || n11 == 0) && n10 == n9;
        }

        @Override
        @SuppressLint(value={"WrongCall"})
        public final void a(ax.H.e e8, b.a a8) {
            int n8;
            int n9;
            int n10;
            Object object;
            block44: {
                int n11;
                int n12;
                View view;
                int n13;
                int n14;
                int n15;
                int n16;
                block45: {
                    boolean bl;
                    boolean bl2;
                    boolean bl3;
                    Object object2;
                    block43: {
                        block42: {
                            block27: {
                                Object object3;
                                block39: {
                                    block35: {
                                        block36: {
                                            block37: {
                                                block41: {
                                                    block40: {
                                                        block38: {
                                                            block32: {
                                                                block28: {
                                                                    block29: {
                                                                        block30: {
                                                                            block34: {
                                                                                block33: {
                                                                                    block31: {
                                                                                        if (e8 == null) break block27;
                                                                                        if (e8.V() == 8 && !e8.j0()) {
                                                                                            a8.e = 0;
                                                                                            a8.f = 0;
                                                                                            a8.g = 0;
                                                                                            return;
                                                                                        }
                                                                                        if (e8.K() == null) break block27;
                                                                                        object2 = a8.a;
                                                                                        object = a8.b;
                                                                                        n16 = a8.c;
                                                                                        n15 = a8.d;
                                                                                        n14 = this.b + this.c;
                                                                                        n13 = this.d;
                                                                                        view = (View)e8.s();
                                                                                        object3 = androidx.constraintlayout.widget.ConstraintLayout$a.a;
                                                                                        n10 = object3[object2.ordinal()];
                                                                                        if (n10 == 1) break block28;
                                                                                        if (n10 == 2) break block29;
                                                                                        if (n10 == 3) break block30;
                                                                                        if (n10 == 4) break block31;
                                                                                        n16 = 0;
                                                                                        break block32;
                                                                                    }
                                                                                    n10 = ViewGroup.getChildMeasureSpec((int)this.f, (int)n13, (int)-2);
                                                                                    n13 = e8.w == 1 ? 1 : 0;
                                                                                    n9 = a8.j;
                                                                                    if (n9 == b.a.l) break block33;
                                                                                    n16 = n10;
                                                                                    if (n9 != b.a.m) break block32;
                                                                                }
                                                                                n16 = view.getMeasuredHeight() == e8.x() ? 1 : 0;
                                                                                if (a8.j == b.a.m || n13 == 0 || n13 != 0 && n16 != 0 || view instanceof h) break block34;
                                                                                n16 = n10;
                                                                                if (!e8.n0()) break block32;
                                                                            }
                                                                            n16 = View.MeasureSpec.makeMeasureSpec((int)e8.W(), (int)0x40000000);
                                                                            break block32;
                                                                        }
                                                                        n16 = ViewGroup.getChildMeasureSpec((int)this.f, (int)(n13 + e8.B()), (int)-1);
                                                                        break block32;
                                                                    }
                                                                    n16 = ViewGroup.getChildMeasureSpec((int)this.f, (int)n13, (int)-2);
                                                                    break block32;
                                                                }
                                                                n16 = View.MeasureSpec.makeMeasureSpec((int)n16, (int)0x40000000);
                                                            }
                                                            n13 = object3[object.ordinal()];
                                                            if (n13 == 1) break block35;
                                                            if (n13 == 2) break block36;
                                                            if (n13 == 3) break block37;
                                                            if (n13 == 4) break block38;
                                                            n13 = 0;
                                                            break block39;
                                                        }
                                                        n15 = ViewGroup.getChildMeasureSpec((int)this.g, (int)n14, (int)-2);
                                                        n10 = e8.x == 1 ? 1 : 0;
                                                        n14 = a8.j;
                                                        if (n14 == b.a.l) break block40;
                                                        n13 = n15;
                                                        if (n14 != b.a.m) break block39;
                                                    }
                                                    n13 = view.getMeasuredWidth() == e8.W() ? 1 : 0;
                                                    if (a8.j == b.a.m || n10 == 0 || n10 != 0 && n13 != 0 || view instanceof h) break block41;
                                                    n13 = n15;
                                                    if (!e8.o0()) break block39;
                                                }
                                                n13 = View.MeasureSpec.makeMeasureSpec((int)e8.x(), (int)0x40000000);
                                                break block39;
                                            }
                                            n13 = ViewGroup.getChildMeasureSpec((int)this.g, (int)(n14 + e8.U()), (int)-1);
                                            break block39;
                                        }
                                        n13 = ViewGroup.getChildMeasureSpec((int)this.g, (int)n14, (int)-2);
                                        break block39;
                                    }
                                    n13 = View.MeasureSpec.makeMeasureSpec((int)n15, (int)0x40000000);
                                }
                                object3 = (ax.H.f)e8.K();
                                if (object3 != null && ax.H.k.b(this.h.i, 256) && view.getMeasuredWidth() == e8.W() && view.getMeasuredWidth() < object3.W() && view.getMeasuredHeight() == e8.x() && view.getMeasuredHeight() < object3.x() && view.getBaseline() == e8.p() && !e8.m0() && this.d(e8.C(), n16, e8.W()) && this.d(e8.D(), n13, e8.x())) {
                                    a8.e = e8.W();
                                    a8.f = e8.x();
                                    a8.g = e8.p();
                                    return;
                                }
                                object3 = (Object)e.b.d0;
                                n10 = object2 == object3 ? 1 : 0;
                                n15 = object == object3 ? 1 : 0;
                                object3 = (Object)e.b.e0;
                                n8 = object != object3 && object != e.b.q ? 0 : 1;
                                bl3 = object2 == object3 || object2 == e.b.q;
                                bl2 = n10 != 0 && e8.d0 > 0.0f;
                                bl = n15 != 0 && e8.d0 > 0.0f;
                                if (view != null) break block42;
                            }
                            return;
                        }
                        object = (b)view.getLayoutParams();
                        n14 = a8.j;
                        if (n14 == b.a.l || n14 == b.a.m || n10 == 0 || e8.w != 0 || n15 == 0 || e8.x != 0) break block43;
                        n10 = 0;
                        n9 = 0;
                        n8 = 0;
                        break block44;
                    }
                    if (view instanceof ax.L.e && e8 instanceof l) {
                        object2 = (l)e8;
                        ((ax.L.e)view).t((l)object2, n16, n13);
                    } else {
                        view.measure(n16, n13);
                    }
                    e8.V0(n16, n13);
                    n12 = view.getMeasuredWidth();
                    n11 = view.getMeasuredHeight();
                    int n17 = view.getBaseline();
                    n10 = e8.z;
                    n15 = n10 > 0 ? Math.max(n10, n12) : n12;
                    n14 = e8.A;
                    n10 = n15;
                    if (n14 > 0) {
                        n10 = Math.min(n14, n15);
                    }
                    n15 = (n15 = e8.C) > 0 ? Math.max(n15, n11) : n11;
                    n14 = e8.D;
                    n9 = n15;
                    if (n14 > 0) {
                        n9 = Math.min(n14, n15);
                    }
                    n15 = n9;
                    n14 = n10;
                    if (!ax.H.k.b(this.h.i, 1)) {
                        if (bl2 && n8 != 0) {
                            float f8 = e8.d0;
                            n14 = (int)((float)n9 * f8 + 0.5f);
                            n15 = n9;
                        } else {
                            n15 = n9;
                            n14 = n10;
                            if (bl) {
                                n15 = n9;
                                n14 = n10;
                                if (bl3) {
                                    float f9 = e8.d0;
                                    n15 = (int)((float)n10 / f9 + 0.5f);
                                    n14 = n10;
                                }
                            }
                        }
                    }
                    if (n12 != n14) break block45;
                    n10 = n15;
                    n9 = n17;
                    n8 = n14;
                    if (n11 == n15) break block44;
                }
                if (n12 != n14) {
                    n16 = View.MeasureSpec.makeMeasureSpec((int)n14, (int)0x40000000);
                }
                if (n11 != n15) {
                    n13 = View.MeasureSpec.makeMeasureSpec((int)n15, (int)0x40000000);
                }
                view.measure(n16, n13);
                e8.V0(n16, n13);
                n8 = view.getMeasuredWidth();
                n10 = view.getMeasuredHeight();
                n9 = view.getBaseline();
            }
            boolean bl = n9 != -1;
            boolean bl4 = n8 != a8.c || n10 != a8.d;
            a8.i = bl4;
            if (((b)((Object)object)).g0) {
                bl = true;
            }
            if (bl && n9 != -1 && e8.p() != n9) {
                a8.i = true;
            }
            a8.e = n8;
            a8.f = n10;
            a8.h = bl;
            a8.g = n9;
        }

        @Override
        public final void b() {
            int n8;
            int n9 = this.a.getChildCount();
            int n10 = 0;
            for (n8 = 0; n8 < n9; ++n8) {
                View view = this.a.getChildAt(n8);
                if (!(view instanceof h)) continue;
                ((h)view).a(this.a);
            }
            n9 = this.a.b.size();
            if (n9 > 0) {
                for (n8 = n10; n8 < n9; ++n8) {
                    ((androidx.constraintlayout.widget.c)((Object)this.a.b.get(n8))).p(this.a);
                }
            }
        }

        public void c(int n8, int n9, int n10, int n11, int n12, int n13) {
            this.b = n10;
            this.c = n11;
            this.d = n12;
            this.e = n13;
            this.f = n8;
            this.g = n9;
        }
    }
}

