package com.google.android.material.timepicker;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
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
import ax.c0.C1753a;
import ax.c0.C1760d0;
import ax.d0.H;
import ax.k6.C2402c;
import ax.k6.C2403d;
import ax.k6.C2404e;
import ax.k6.C2406g;
import ax.k6.C2408i;
import ax.k6.l;
import ax.k6.m;
import ax.o.C2653a;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
class ClockFaceView extends d implements ClockHandView.b {
    private final ClockHandView B;
    private final Rect C;
    private final RectF D;
    private final Rect E;
    private final SparseArray<TextView> F;
    private final C1753a G;
    private final int[] H;
    private final float[] I;
    private final int J;
    private final int K;
    private final int L;
    private final int M;
    private String[] N;
    private float O;
    private final ColorStateList P;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.F(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.B.i()) - ClockFaceView.this.J);
            return true;
        }
    }

    class b extends C1753a {
        b() {
        }

        @Override // ax.c0.C1753a
        public void g(View view, H h) {
            super.g(view, h);
            int intValue = ((Integer) view.getTag(C2406g.r)).intValue();
            if (intValue > 0) {
                h.N0((View) ClockFaceView.this.F.get(intValue - 1));
            }
            h.p0(H.f.a(0, 1, intValue, 1, false, view.isSelected()));
            h.n0(true);
            h.b(H.a.i);
        }

        @Override // ax.c0.C1753a
        public boolean j(View view, int i, Bundle bundle) {
            if (i != 16) {
                return super.j(view, i, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.C);
            float centerX = ClockFaceView.this.C.centerX();
            float centerY = ClockFaceView.this.C.centerY();
            ClockFaceView.this.B.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            ClockFaceView.this.B.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2402c.y);
    }

    private void N() {
        RectF e = this.B.e();
        TextView P = P(e);
        for (int i = 0; i < this.F.size(); i++) {
            TextView textView = this.F.get(i);
            if (textView != null) {
                textView.setSelected(textView == P);
                textView.getPaint().setShader(O(e, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient O(RectF rectF, TextView textView) {
        textView.getHitRect(this.C);
        this.D.set(this.C);
        textView.getLineBounds(0, this.E);
        RectF rectF2 = this.D;
        Rect rect = this.E;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.D)) {
            return new RadialGradient(rectF.centerX() - this.D.left, rectF.centerY() - this.D.top, rectF.width() * 0.5f, this.H, this.I, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private TextView P(RectF rectF) {
        float f = Float.MAX_VALUE;
        TextView textView = null;
        for (int i = 0; i < this.F.size(); i++) {
            TextView textView2 = this.F.get(i);
            if (textView2 != null) {
                textView2.getHitRect(this.C);
                this.D.set(this.C);
                this.D.union(rectF);
                float width = this.D.width() * this.D.height();
                if (width < f) {
                    textView = textView2;
                    f = width;
                }
            }
        }
        return textView;
    }

    private static float Q(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    private void S(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.F.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.N.length, size); i2++) {
            TextView textView = this.F.get(i2);
            if (i2 >= this.N.length) {
                removeView(textView);
                this.F.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C2408i.i, (ViewGroup) this, false);
                    this.F.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.N[i2]);
                textView.setTag(C2406g.r, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(C2406g.m, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                C1760d0.l0(textView, this.G);
                textView.setTextColor(this.P);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.N[i2]));
                }
            }
        }
        this.B.q(z);
    }

    @Override // com.google.android.material.timepicker.d
    public void F(int i) {
        if (i != E()) {
            super.F(i);
            this.B.m(E());
        }
    }

    @Override // com.google.android.material.timepicker.d
    protected void H() {
        super.H();
        for (int i = 0; i < this.F.size(); i++) {
            this.F.get(i).setVisibility(0);
        }
    }

    public void R(String[] strArr, int i) {
        this.N = strArr;
        S(i);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f, boolean z) {
        if (Math.abs(this.O - f) > 0.001f) {
            this.O = f;
            N();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        H.Q0(accessibilityNodeInfo).o0(H.e.a(1, this.N.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        N();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int Q = (int) (this.M / Q(this.K / displayMetrics.heightPixels, this.L / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Q, 1073741824);
        setMeasuredDimension(Q, Q);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.C = new Rect();
        this.D = new RectF();
        this.E = new Rect();
        this.F = new SparseArray<>();
        this.I = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.z1, i, l.F);
        Resources resources = getResources();
        ColorStateList a2 = ax.K6.c.a(context, obtainStyledAttributes, m.B1);
        this.P = a2;
        LayoutInflater.from(context).inflate(C2408i.j, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C2406g.l);
        this.B = clockHandView;
        this.J = resources.getDimensionPixelSize(C2404e.C);
        int colorForState = a2.getColorForState(new int[]{R.attr.state_selected}, a2.getDefaultColor());
        this.H = new int[]{colorForState, colorForState, a2.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = C2653a.a(context, C2403d.b).getDefaultColor();
        ColorStateList a3 = ax.K6.c.a(context, obtainStyledAttributes, m.A1);
        setBackgroundColor(a3 != null ? a3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(false);
        obtainStyledAttributes.recycle();
        this.G = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, HttpUrl.FRAGMENT_ENCODE_SET);
        R(strArr, 0);
        this.K = resources.getDimensionPixelSize(C2404e.Q);
        this.L = resources.getDimensionPixelSize(C2404e.R);
        this.M = resources.getDimensionPixelSize(C2404e.E);
    }
}
