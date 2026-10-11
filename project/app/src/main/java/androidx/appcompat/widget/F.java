/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.B;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.u;
import androidx.appcompat.widget.x;
import ax.n.a;
import ax.s.a;

public class F
extends HorizontalScrollView
implements AdapterView.OnItemSelectedListener {
    private static final Interpolator j = new DecelerateInterpolator();
    Runnable a;
    private c b;
    B c;
    private Spinner d;
    private boolean e;
    int f;
    int g;
    private int h;
    private int i;

    private Spinner b() {
        u u8 = new u(this.getContext(), null, ax.m.a.h);
        u8.setLayoutParams((ViewGroup.LayoutParams)new B.a(-2, -1));
        u8.setOnItemSelectedListener(this);
        return u8;
    }

    private boolean d() {
        Spinner spinner = this.d;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        Runnable runnable2;
        if (this.d()) {
            return;
        }
        if (this.d == null) {
            this.d = this.b();
        }
        this.removeView((View)this.c);
        this.addView((View)this.d, new ViewGroup.LayoutParams(-2, -1));
        if (this.d.getAdapter() == null) {
            this.d.setAdapter((SpinnerAdapter)new b(this));
        }
        if ((runnable2 = this.a) != null) {
            this.removeCallbacks(runnable2);
            this.a = null;
        }
        this.d.setSelection(this.i);
    }

    private boolean f() {
        if (!this.d()) {
            return false;
        }
        this.removeView((View)this.d);
        this.addView((View)this.c, new ViewGroup.LayoutParams(-2, -1));
        this.setTabSelected(this.d.getSelectedItemPosition());
        return false;
    }

    public void a(int n8) {
        View view = this.c.getChildAt(n8);
        Runnable runnable2 = this.a;
        if (runnable2 != null) {
            this.removeCallbacks(runnable2);
        }
        this.a = runnable2 = new Runnable(){
            final F c0;
            final View q;
            {
                this.c0 = f8;
                this.q = view;
            }

            @Override
            public void run() {
                int n8 = this.q.getLeft();
                int n9 = (this.c0.getWidth() - this.q.getWidth()) / 2;
                this.c0.smoothScrollTo(n8 - n9, 0);
                this.c0.a = null;
            }
        };
        this.post(runnable2);
    }

    d c(a.c object, boolean bl) {
        object = new d(this, this.getContext(), (a.c)object, bl);
        if (bl) {
            object.setBackgroundDrawable(null);
            object.setLayoutParams((ViewGroup.LayoutParams)new AbsListView.LayoutParams(-1, this.h));
            return object;
        }
        object.setFocusable(true);
        if (this.b == null) {
            this.b = new c(this);
        }
        object.setOnClickListener(this.b);
        return object;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable2 = this.a;
        if (runnable2 != null) {
            this.post(runnable2);
        }
    }

    protected void onConfigurationChanged(Configuration object) {
        super.onConfigurationChanged((Configuration)object);
        object = ax.s.a.b(this.getContext());
        this.setContentHeight(((a)object).f());
        this.g = ((a)object).e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable2 = this.a;
        if (runnable2 != null) {
            this.removeCallbacks(runnable2);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int n8, long l8) {
        ((d)view).b().e();
    }

    public void onMeasure(int n8, int n9) {
        int n10 = View.MeasureSpec.getMode((int)n8);
        boolean bl = n10 == 0x40000000;
        this.setFillViewport(bl);
        n9 = this.c.getChildCount();
        if (n9 > 1 && (n10 == 0x40000000 || n10 == Integer.MIN_VALUE)) {
            this.f = n9 > 2 ? (int)((float)View.MeasureSpec.getSize((int)n8) * 0.4f) : View.MeasureSpec.getSize((int)n8) / 2;
            this.f = Math.min(this.f, this.g);
        } else {
            this.f = -1;
        }
        n10 = View.MeasureSpec.makeMeasureSpec((int)this.h, (int)0x40000000);
        if (!bl && this.e) {
            this.c.measure(0, n10);
            if (this.c.getMeasuredWidth() > View.MeasureSpec.getSize((int)n8)) {
                this.e();
            } else {
                this.f();
            }
        } else {
            this.f();
        }
        n9 = this.getMeasuredWidth();
        super.onMeasure(n8, n10);
        n8 = this.getMeasuredWidth();
        if (bl && n9 != n8) {
            this.setTabSelected(this.i);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean bl) {
        this.e = bl;
    }

    public void setContentHeight(int n8) {
        this.h = n8;
        this.requestLayout();
    }

    public void setTabSelected(int n8) {
        Spinner spinner;
        this.i = n8;
        int n9 = this.c.getChildCount();
        for (int i8 = 0; i8 < n9; ++i8) {
            spinner = this.c.getChildAt(i8);
            boolean bl = i8 == n8;
            spinner.setSelected(bl);
            if (!bl) continue;
            this.a(n8);
        }
        spinner = this.d;
        if (spinner != null && n8 >= 0) {
            spinner.setSelection(n8);
        }
    }

    private class b
    extends BaseAdapter {
        final F a;

        b(F f8) {
            this.a = f8;
        }

        public int getCount() {
            return this.a.c.getChildCount();
        }

        public Object getItem(int n8) {
            return ((d)this.a.c.getChildAt(n8)).b();
        }

        public long getItemId(int n8) {
            return n8;
        }

        public View getView(int n8, View view, ViewGroup viewGroup) {
            if (view == null) {
                return this.a.c((a.c)this.getItem(n8), true);
            }
            ((d)view).a((a.c)this.getItem(n8));
            return view;
        }
    }

    private class c
    implements View.OnClickListener {
        final F a;

        c(F f8) {
            this.a = f8;
        }

        public void onClick(View view) {
            ((d)view).b().e();
            int n8 = this.a.c.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                View view2 = this.a.c.getChildAt(i8);
                boolean bl = view2 == view;
                view2.setSelected(bl);
            }
        }
    }

    private class d
    extends LinearLayout {
        private final int[] a;
        private a.c b;
        private TextView c;
        private ImageView d;
        private View e;
        final F f;

        public d(F object, Context context, a.c c8, boolean bl) {
            this.f = object;
            int n8 = ax.m.a.d;
            super(context, null, n8);
            object = new int[1];
            object[0] = (F)16842964;
            this.a = (int[])object;
            this.b = c8;
            object = L.v(context, null, (int[])object, n8, 0);
            if (((L)object).s(0)) {
                this.setBackgroundDrawable(((L)object).g(0));
            }
            ((L)object).x();
            if (bl) {
                this.setGravity(8388627);
            }
            this.c();
        }

        public void a(a.c c8) {
            this.b = c8;
            this.c();
        }

        public a.c b() {
            return this.b;
        }

        public void c() {
            Object object;
            a.c c8 = this.b;
            Object object2 = c8.b();
            Object object3 = null;
            if (object2 != null) {
                object3 = object2.getParent();
                if (object3 != this) {
                    if (object3 != null) {
                        ((ViewGroup)object3).removeView(object2);
                    }
                    this.addView((View)object2);
                }
                this.e = object2;
                object3 = this.c;
                if (object3 != null) {
                    object3.setVisibility(8);
                }
                if ((object3 = this.d) != null) {
                    object3.setVisibility(8);
                    this.d.setImageDrawable(null);
                }
                return;
            }
            object2 = this.e;
            if (object2 != null) {
                this.removeView((View)object2);
                this.e = null;
            }
            Drawable drawable = c8.c();
            object2 = c8.d();
            if (drawable != null) {
                if (this.d == null) {
                    object = new AppCompatImageView(this.getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    object.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
                    this.addView((View)object, 0);
                    this.d = object;
                }
                this.d.setImageDrawable(drawable);
                this.d.setVisibility(0);
            } else {
                drawable = this.d;
                if (drawable != null) {
                    drawable.setVisibility(8);
                    this.d.setImageDrawable(null);
                }
            }
            boolean bl = TextUtils.isEmpty((CharSequence)object2);
            if (!bl) {
                if (this.c == null) {
                    object = new x(this.getContext(), null, ax.m.a.e);
                    object.setEllipsize(TextUtils.TruncateAt.END);
                    drawable = new LinearLayout.LayoutParams(-2, -2);
                    drawable.gravity = 16;
                    object.setLayoutParams((ViewGroup.LayoutParams)drawable);
                    this.addView((View)object);
                    this.c = object;
                }
                this.c.setText((CharSequence)object2);
                this.c.setVisibility(0);
            } else {
                object2 = this.c;
                if (object2 != null) {
                    object2.setVisibility(8);
                    this.c.setText(null);
                }
            }
            object2 = this.d;
            if (object2 != null) {
                object2.setContentDescription(c8.a());
            }
            if (bl) {
                object3 = c8.a();
            }
            ax.u.B.a((View)this, (CharSequence)object3);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName((CharSequence)"androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName((CharSequence)"androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int n8, int n9) {
            int n10;
            super.onMeasure(n8, n9);
            if (this.f.f > 0 && (n8 = this.getMeasuredWidth()) > (n10 = this.f.f)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)n10, (int)0x40000000), n9);
            }
        }

        public void setSelected(boolean bl) {
            boolean bl2 = this.isSelected() != bl;
            super.setSelected(bl);
            if (bl2 && bl) {
                this.sendAccessibilityEvent(4);
            }
        }
    }
}

