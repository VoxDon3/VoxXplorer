/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import ax.K6.c;
import ax.c0.d0;
import ax.d0.H;
import ax.k6.e;
import ax.k6.g;
import ax.k6.i;
import ax.k6.l;
import ax.k6.m;
import ax.o.a;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.d;
import java.util.Arrays;

class ClockFaceView
extends d
implements ClockHandView.b {
    private final ClockHandView B;
    private final Rect C = new Rect();
    private final RectF D = new RectF();
    private final Rect E = new Rect();
    private final SparseArray<TextView> F = new SparseArray();
    private final ax.c0.a G;
    private final int[] H;
    private final float[] I = new float[]{0.0f, 0.9f, 1.0f};
    private final int J;
    private final int K;
    private final int L;
    private final int M;
    private String[] N;
    private float O;
    private final ColorStateList P;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.k6.c.y);
    }

    @SuppressLint(value={"ClickableViewAccessibility"})
    public ClockFaceView(Context objectArray, AttributeSet attributeSet, int n8) {
        super((Context)objectArray, attributeSet, n8);
        ClockHandView clockHandView;
        ColorStateList colorStateList;
        TypedArray typedArray = objectArray.obtainStyledAttributes(attributeSet, m.z1, n8, l.F);
        attributeSet = this.getResources();
        this.P = colorStateList = ax.K6.c.a((Context)objectArray, typedArray, m.B1);
        LayoutInflater.from((Context)objectArray).inflate(i.j, (ViewGroup)this, true);
        this.B = clockHandView = (ClockHandView)this.findViewById(g.l);
        this.J = attributeSet.getDimensionPixelSize(e.C);
        n8 = colorStateList.getDefaultColor();
        n8 = colorStateList.getColorForState(new int[]{0x10100A1}, n8);
        this.H = new int[]{n8, n8, colorStateList.getDefaultColor()};
        clockHandView.b(this);
        n8 = a.a((Context)objectArray, ax.k6.d.b).getDefaultColor();
        objectArray = ax.K6.c.a((Context)objectArray, typedArray, m.A1);
        if (objectArray != null) {
            n8 = objectArray.getDefaultColor();
        }
        this.setBackgroundColor(n8);
        this.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener(this){
            final ClockFaceView a;
            {
                this.a = clockFaceView;
            }

            public boolean onPreDraw() {
                if (!this.a.isShown()) {
                    return true;
                }
                this.a.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
                int n8 = this.a.getHeight() / 2;
                int n9 = this.a.B.i();
                int n10 = this.a.J;
                this.a.F(n8 - n9 - n10);
                return true;
            }
        });
        this.setFocusable(false);
        typedArray.recycle();
        this.G = new ax.c0.a(this){
            final ClockFaceView d;
            {
                this.d = clockFaceView;
            }

            @Override
            public void g(View view, H h8) {
                super.g(view, h8);
                int n8 = (Integer)view.getTag(g.r);
                if (n8 > 0) {
                    h8.N0((View)this.d.F.get(n8 - 1));
                }
                h8.p0(H.f.a(0, 1, n8, 1, false, view.isSelected()));
                h8.n0(true);
                h8.b(H.a.i);
            }

            @Override
            public boolean j(View view, int n8, Bundle bundle) {
                if (n8 == 16) {
                    long l8 = SystemClock.uptimeMillis();
                    view.getHitRect(this.d.C);
                    float f8 = this.d.C.centerX();
                    float f9 = this.d.C.centerY();
                    this.d.B.onTouchEvent(MotionEvent.obtain((long)l8, (long)l8, (int)0, (float)f8, (float)f9, (int)0));
                    this.d.B.onTouchEvent(MotionEvent.obtain((long)l8, (long)l8, (int)1, (float)f8, (float)f9, (int)0));
                    return true;
                }
                return super.j(view, n8, bundle);
            }
        };
        objectArray = new String[12];
        Arrays.fill(objectArray, "");
        this.R((String[])objectArray, 0);
        this.K = attributeSet.getDimensionPixelSize(e.Q);
        this.L = attributeSet.getDimensionPixelSize(e.R);
        this.M = attributeSet.getDimensionPixelSize(e.E);
    }

    private void N() {
        RectF rectF = this.B.e();
        TextView textView = this.P(rectF);
        for (int i8 = 0; i8 < this.F.size(); ++i8) {
            TextView textView2 = (TextView)this.F.get(i8);
            if (textView2 == null) continue;
            boolean bl = textView2 == textView;
            textView2.setSelected(bl);
            RadialGradient radialGradient = this.O(rectF, textView2);
            textView2.getPaint().setShader((Shader)radialGradient);
            textView2.invalidate();
        }
    }

    private RadialGradient O(RectF rectF, TextView textView) {
        textView.getHitRect(this.C);
        this.D.set(this.C);
        textView.getLineBounds(0, this.E);
        textView = this.D;
        Rect rect = this.E;
        textView.inset((float)rect.left, (float)rect.top);
        if (!RectF.intersects((RectF)rectF, (RectF)this.D)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.D.left, rectF.centerY() - this.D.top, rectF.width() * 0.5f, this.H, this.I, Shader.TileMode.CLAMP);
    }

    private TextView P(RectF rectF) {
        float f8 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i8 = 0; i8 < this.F.size(); ++i8) {
            float f9;
            TextView textView2 = (TextView)this.F.get(i8);
            if (textView2 == null) {
                f9 = f8;
            } else {
                textView2.getHitRect(this.C);
                this.D.set(this.C);
                this.D.union(rectF);
                float f10 = this.D.width() * this.D.height();
                f9 = f8;
                if (f10 < f8) {
                    textView = textView2;
                    f9 = f10;
                }
            }
            f8 = f9;
        }
        return textView;
    }

    private static float Q(float f8, float f9, float f10) {
        return Math.max(Math.max(f8, f9), f10);
    }

    private void S(int n8) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.getContext());
        int n9 = this.F.size();
        boolean bl = false;
        for (int i8 = 0; i8 < Math.max(this.N.length, n9); ++i8) {
            boolean bl2;
            TextView textView = (TextView)this.F.get(i8);
            if (i8 >= this.N.length) {
                this.removeView((View)textView);
                this.F.remove(i8);
                bl2 = bl;
            } else {
                TextView textView2 = textView;
                if (textView == null) {
                    textView2 = (TextView)layoutInflater.inflate(i.i, (ViewGroup)this, false);
                    this.F.put(i8, (Object)textView2);
                    this.addView((View)textView2);
                }
                textView2.setText((CharSequence)this.N[i8]);
                textView2.setTag(g.r, (Object)i8);
                int n10 = i8 / 12 + 1;
                textView2.setTag(g.m, (Object)n10);
                if (n10 > 1) {
                    bl = true;
                }
                d0.l0((View)textView2, this.G);
                textView2.setTextColor(this.P);
                bl2 = bl;
                if (n8 != 0) {
                    textView2.setContentDescription((CharSequence)this.getResources().getString(n8, new Object[]{this.N[i8]}));
                    bl2 = bl;
                }
            }
            bl = bl2;
        }
        this.B.q(bl);
    }

    @Override
    public void F(int n8) {
        if (n8 != this.E()) {
            super.F(n8);
            this.B.m(this.E());
        }
    }

    @Override
    protected void H() {
        super.H();
        for (int i8 = 0; i8 < this.F.size(); ++i8) {
            ((TextView)this.F.get(i8)).setVisibility(0);
        }
    }

    public void R(String[] stringArray, int n8) {
        this.N = stringArray;
        this.S(n8);
    }

    @Override
    public void a(float f8, boolean bl) {
        if (Math.abs(this.O - f8) > 0.001f) {
            this.O = f8;
            this.N();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ax.d0.H.Q0(accessibilityNodeInfo).o0(H.e.a(1, this.N.length, false, 1));
    }

    @Override
    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        this.N();
    }

    @Override
    protected void onMeasure(int n8, int n9) {
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        float f8 = displayMetrics.heightPixels;
        float f9 = displayMetrics.widthPixels;
        n8 = (int)((float)this.M / ClockFaceView.Q((float)this.K / f8, (float)this.L / f9, 1.0f));
        n9 = View.MeasureSpec.makeMeasureSpec((int)n8, (int)0x40000000);
        this.setMeasuredDimension(n8, n8);
        super.onMeasure(n9, n9);
    }
}

