/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.c;
import ax.c0.d0;
import ax.c0.n0;
import ax.c0.o0;
import ax.m.j;

abstract class a
extends ViewGroup {
    protected final a a = new a(this);
    protected final Context b;
    protected ActionMenuView c;
    protected c d;
    protected int e;
    protected n0 f;
    private boolean g;
    private boolean h;

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        attributeSet = new TypedValue();
        if (context.getTheme().resolveAttribute(ax.m.a.a, (TypedValue)attributeSet, true) && attributeSet.resourceId != 0) {
            this.b = new ContextThemeWrapper(context, attributeSet.resourceId);
            return;
        }
        this.b = context;
    }

    protected static int d(int n8, int n9, boolean bl) {
        if (bl) {
            return n8 - n9;
        }
        return n8 + n9;
    }

    protected int c(View view, int n8, int n9, int n10) {
        view.measure(View.MeasureSpec.makeMeasureSpec((int)n8, (int)Integer.MIN_VALUE), n9);
        return Math.max(0, n8 - view.getMeasuredWidth() - n10);
    }

    protected int e(View view, int n8, int n9, int n10, boolean bl) {
        int n11 = view.getMeasuredWidth();
        int n12 = view.getMeasuredHeight();
        n9 += (n10 - n12) / 2;
        if (bl) {
            view.layout(n8 - n11, n9, n8, n12 + n9);
        } else {
            view.layout(n8, n9, n8 + n11, n12 + n9);
        }
        if (bl) {
            return -n11;
        }
        return n11;
    }

    public n0 f(int n8, long l8) {
        n0 n02 = this.f;
        if (n02 != null) {
            n02.c();
        }
        if (n8 == 0) {
            if (this.getVisibility() != 0) {
                this.setAlpha(0.0f);
            }
            n02 = d0.e((View)this).b(1.0f);
            n02.e(l8);
            n02.g(this.a.d(n02, n8));
            return n02;
        }
        n02 = d0.e((View)this).b(0.0f);
        n02.e(l8);
        n02.g(this.a.d(n02, n8));
        return n02;
    }

    public int getAnimatedVisibility() {
        if (this.f != null) {
            return this.a.b;
        }
        return this.getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Object object = this.getContext().obtainStyledAttributes(null, j.a, ax.m.a.c, 0);
        this.setContentHeight(object.getLayoutDimension(j.j, 0));
        object.recycle();
        object = this.d;
        if (object != null) {
            ((c)object).F(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int n8 = motionEvent.getActionMasked();
        if (n8 == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean bl = super.onHoverEvent(motionEvent);
            if (n8 == 9 && !bl) {
                this.h = true;
            }
        }
        if (n8 == 10 || n8 == 3) {
            this.h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n8 = motionEvent.getActionMasked();
        if (n8 == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean bl = super.onTouchEvent(motionEvent);
            if (n8 == 0 && !bl) {
                this.g = true;
            }
        }
        if (n8 == 1 || n8 == 3) {
            this.g = false;
        }
        return true;
    }

    public void setContentHeight(int n8) {
        this.e = n8;
        this.requestLayout();
    }

    public void setVisibility(int n8) {
        if (n8 != this.getVisibility()) {
            n0 n02 = this.f;
            if (n02 != null) {
                n02.c();
            }
            super.setVisibility(n8);
        }
    }

    protected class a
    implements o0 {
        private boolean a;
        int b;
        final a c;

        protected a(a a8) {
            this.c = a8;
            this.a = false;
        }

        @Override
        public void a(View view) {
            this.a = true;
        }

        @Override
        public void b(View object) {
            if (this.a) {
                return;
            }
            object = this.c;
            object.f = null;
            a.super.setVisibility(this.b);
        }

        @Override
        public void c(View view) {
            a.super.setVisibility(0);
            this.a = false;
        }

        public a d(n0 n02, int n8) {
            this.c.f = n02;
            this.b = n8;
            return this;
        }
    }
}

