package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import ax.c0.C1760d0;
import ax.c0.C1780n0;
import ax.c0.InterfaceC1782o0;
import ax.m.C2506a;

/* renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0570a extends ViewGroup {
    protected final C0009a a;
    protected final Context b;
    protected ActionMenuView c;
    protected C0572c d;
    protected int e;
    protected C1780n0 f;
    private boolean g;
    private boolean h;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0009a implements InterfaceC1782o0 {
        private boolean a = false;
        int b;

        protected C0009a() {
        }

        @Override // ax.c0.InterfaceC1782o0
        public void a(View view) {
            this.a = true;
        }

        @Override // ax.c0.InterfaceC1782o0
        public void b(View view) {
            if (this.a) {
                return;
            }
            AbstractC0570a abstractC0570a = AbstractC0570a.this;
            abstractC0570a.f = null;
            AbstractC0570a.super.setVisibility(this.b);
        }

        @Override // ax.c0.InterfaceC1782o0
        public void c(View view) {
            AbstractC0570a.super.setVisibility(0);
            this.a = false;
        }

        public C0009a d(C1780n0 c1780n0, int i) {
            AbstractC0570a.this.f = c1780n0;
            this.b = i;
            return this;
        }
    }

    AbstractC0570a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected static int d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    protected int c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    protected int e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public C1780n0 f(int i, long j) {
        C1780n0 c1780n0 = this.f;
        if (c1780n0 != null) {
            c1780n0.c();
        }
        if (i != 0) {
            C1780n0 b = C1760d0.e(this).b(0.0f);
            b.e(j);
            b.g(this.a.d(b, i));
            return b;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C1780n0 b2 = C1760d0.e(this).b(1.0f);
        b2.e(j);
        b2.g(this.a.d(b2, i));
        return b2;
    }

    public int getAnimatedVisibility() {
        return this.f != null ? this.a.b : getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, ax.m.j.a, C2506a.c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(ax.m.j.j, 0));
        obtainStyledAttributes.recycle();
        C0572c c0572c = this.d;
        if (c0572c != null) {
            c0572c.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.e = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C1780n0 c1780n0 = this.f;
            if (c1780n0 != null) {
                c1780n0.c();
            }
            super.setVisibility(i);
        }
    }

    AbstractC0570a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new C0009a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C2506a.a, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
