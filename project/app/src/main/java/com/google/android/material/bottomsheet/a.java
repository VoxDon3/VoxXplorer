/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.F6.d;
import ax.F6.z;
import ax.O6.h;
import ax.c0.F0;
import ax.c0.I;
import ax.c0.d0;
import ax.c0.r0;
import ax.d0.H;
import ax.k6.c;
import ax.k6.g;
import ax.k6.i;
import ax.k6.l;
import ax.n.x;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class a
extends x {
    private BottomSheetBehavior<FrameLayout> f;
    private FrameLayout g;
    private CoordinatorLayout h;
    private FrameLayout i;
    boolean j;
    boolean k = true;
    private boolean l = true;
    private boolean m;
    private f n;
    private boolean o;
    private ax.H6.c p;
    private BottomSheetBehavior.g q = new BottomSheetBehavior.g(this){
        final a a;
        {
            this.a = a8;
        }

        @Override
        public void b(View view, float f8) {
        }

        @Override
        public void c(View view, int n8) {
            if (n8 == 5) {
                this.a.cancel();
            }
        }
    };

    public a(Context context, int n8) {
        super(context, a.f(context, n8));
        this.h(1);
        this.o();
    }

    private static int f(Context context, int n8) {
        if (n8 == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(c.b, typedValue, true)) {
                return typedValue.resourceId;
            }
            return ax.k6.l.f;
        }
        return n8;
    }

    static /* synthetic */ f j(a a8, f f8) {
        a8.n = f8;
        return f8;
    }

    private FrameLayout m() {
        if (this.g == null) {
            Object object = (FrameLayout)View.inflate((Context)this.getContext(), (int)ax.k6.i.a, null);
            this.g = object;
            this.h = (CoordinatorLayout)object.findViewById(ax.k6.g.e);
            object = (FrameLayout)this.g.findViewById(ax.k6.g.f);
            this.i = object;
            this.f = object = BottomSheetBehavior.q0(object);
            ((BottomSheetBehavior)object).c0(this.q);
            this.f.R0(this.k);
            this.p = new ax.H6.c(this.f, (View)this.i);
        }
        return this.g;
    }

    private void o() {
        TypedArray typedArray = this.getContext().getTheme().obtainStyledAttributes(new int[]{c.n});
        this.o = typedArray.getBoolean(0, false);
        typedArray.recycle();
    }

    private void q() {
        ax.H6.c c8 = this.p;
        if (c8 == null) {
            return;
        }
        if (this.k) {
            c8.b();
            return;
        }
        c8.d();
    }

    private View r(int n8, View view, ViewGroup.LayoutParams layoutParams) {
        this.m();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout)this.g.findViewById(ax.k6.g.e);
        View view2 = view;
        if (n8 != 0) {
            view2 = view;
            if (view == null) {
                view2 = this.getLayoutInflater().inflate(n8, (ViewGroup)coordinatorLayout, false);
            }
        }
        if (this.o) {
            d0.v0((View)this.g, new I(this){
                final a a;
                {
                    this.a = a8;
                }

                @Override
                public F0 a(View object, F0 f02) {
                    if (this.a.n != null) {
                        this.a.f.G0(this.a.n);
                    }
                    if (f02 != null) {
                        object = this.a;
                        a.j((a)object, new f((View)((a)object).i, f02));
                        this.a.n.e(this.a.getWindow());
                        this.a.f.c0(this.a.n);
                    }
                    return f02;
                }
            });
        }
        this.i.removeAllViews();
        if (layoutParams == null) {
            this.i.addView(view2);
        } else {
            this.i.addView(view2, layoutParams);
        }
        coordinatorLayout.findViewById(ax.k6.g.W).setOnClickListener(new View.OnClickListener(this){
            final a a;
            {
                this.a = a8;
            }

            public void onClick(View object) {
                object = this.a;
                if (object.k && object.isShowing() && this.a.p()) {
                    this.a.cancel();
                }
            }
        });
        d0.l0((View)this.i, new ax.c0.a(this){
            final a d;
            {
                this.d = a8;
            }

            @Override
            public void g(View view, H h8) {
                super.g(view, h8);
                if (this.d.k) {
                    h8.a(0x100000);
                    h8.r0(true);
                    return;
                }
                h8.r0(false);
            }

            @Override
            public boolean j(View view, int n8, Bundle bundle) {
                if (n8 == 0x100000) {
                    a a8 = this.d;
                    if (a8.k) {
                        a8.cancel();
                        return true;
                    }
                }
                return super.j(view, n8, bundle);
            }
        });
        this.i.setOnTouchListener(new View.OnTouchListener(this){
            final a a;
            {
                this.a = a8;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        return this.g;
    }

    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.n();
        if (this.j && bottomSheetBehavior.u0() != 5) {
            bottomSheetBehavior.Z0(5);
            return;
        }
        super.cancel();
    }

    public BottomSheetBehavior<FrameLayout> n() {
        if (this.f == null) {
            this.m();
        }
        return this.f;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = this.getWindow();
        if (window != null) {
            boolean bl = this.o && Color.alpha((int)window.getNavigationBarColor()) < 255;
            Object object = this.g;
            if (object != null) {
                object.setFitsSystemWindows(bl ^ true);
            }
            if ((object = this.h) != null) {
                ((CoordinatorLayout)object).setFitsSystemWindows(bl ^ true);
            }
            r0.b(window, bl ^ true);
            object = this.n;
            if (object != null) {
                ((f)object).e(window);
            }
        }
        this.q();
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = this.getWindow();
        if (bundle != null) {
            bundle.setStatusBarColor(0);
            bundle.addFlags(Integer.MIN_VALUE);
            if (Build.VERSION.SDK_INT < 23) {
                bundle.addFlags(0x4000000);
            }
            bundle.setLayout(-1, -1);
        }
    }

    public void onDetachedFromWindow() {
        Object object = this.n;
        if (object != null) {
            ((f)object).e(null);
        }
        if ((object = this.p) != null) {
            ((ax.H6.c)object).d();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f;
        if (bottomSheetBehavior != null && bottomSheetBehavior.u0() == 5) {
            this.f.Z0(4);
        }
    }

    boolean p() {
        if (!this.m) {
            TypedArray typedArray = this.getContext().obtainStyledAttributes(new int[]{16843611});
            this.l = typedArray.getBoolean(0, true);
            typedArray.recycle();
            this.m = true;
        }
        return this.l;
    }

    public void setCancelable(boolean bl) {
        super.setCancelable(bl);
        if (this.k != bl) {
            this.k = bl;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.R0(bl);
            }
            if (this.getWindow() != null) {
                this.q();
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean bl) {
        super.setCanceledOnTouchOutside(bl);
        if (bl && !this.k) {
            this.k = true;
        }
        this.l = bl;
        this.m = true;
    }

    @Override
    public void setContentView(int n8) {
        super.setContentView(this.r(n8, null, null));
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(this.r(0, view, null));
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(this.r(0, view, layoutParams));
    }

    private static class f
    extends BottomSheetBehavior.g {
        private final Boolean a;
        private final F0 b;
        private Window c;
        private boolean d;

        private f(View object, F0 object2) {
            this.b = object2;
            object2 = BottomSheetBehavior.q0(object).t0();
            object2 = object2 != null ? ((h)object2).B() : object.getBackgroundTintList();
            if (object2 != null) {
                this.a = ax.z6.a.i(object2.getDefaultColor());
                return;
            }
            if ((object = z.d((View)object)) != null) {
                this.a = ax.z6.a.i((Integer)object);
                return;
            }
            this.a = null;
        }

        private void d(View view) {
            if (view.getTop() < this.b.l()) {
                Window window = this.c;
                if (window != null) {
                    Boolean bl = this.a;
                    boolean bl2 = bl == null ? this.d : bl;
                    ax.F6.d.f(window, bl2);
                }
                view.setPadding(view.getPaddingLeft(), this.b.l() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window = this.c;
                if (window != null) {
                    ax.F6.d.f(window, this.d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override
        void a(View view) {
            this.d(view);
        }

        @Override
        public void b(View view, float f8) {
            this.d(view);
        }

        @Override
        public void c(View view, int n8) {
            this.d(view);
        }

        void e(Window window) {
            if (this.c != window) {
                this.c = window;
                if (window != null) {
                    this.d = r0.a(window, window.getDecorView()).b();
                }
            }
        }
    }
}

