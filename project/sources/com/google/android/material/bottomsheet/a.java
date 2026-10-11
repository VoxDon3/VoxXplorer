package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
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
import ax.F6.z;
import ax.O6.h;
import ax.c0.C1753a;
import ax.c0.C1760d0;
import ax.c0.C1787r0;
import ax.c0.F0;
import ax.c0.I;
import ax.d0.H;
import ax.k6.C2402c;
import ax.k6.C2406g;
import ax.k6.C2408i;
import ax.k6.l;
import ax.n.x;
import ax.z6.C3555a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes3.dex */
public class a extends x {
    private BottomSheetBehavior<FrameLayout> f;
    private FrameLayout g;
    private CoordinatorLayout h;
    private FrameLayout i;
    boolean j;
    boolean k;
    private boolean l;
    private boolean m;
    private f n;
    private boolean o;
    private ax.H6.c p;
    private BottomSheetBehavior.g q;

    /* renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    class C0548a implements I {
        C0548a() {
        }

        @Override // ax.c0.I
        public F0 a(View view, F0 f0) {
            if (a.this.n != null) {
                a.this.f.G0(a.this.n);
            }
            if (f0 != null) {
                a aVar = a.this;
                aVar.n = new f(aVar.i, f0, null);
                a.this.n.e(a.this.getWindow());
                a.this.f.c0(a.this.n);
            }
            return f0;
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.k && aVar.isShowing() && a.this.p()) {
                a.this.cancel();
            }
        }
    }

    class c extends C1753a {
        c() {
        }

        @Override // ax.c0.C1753a
        public void g(View view, H h) {
            super.g(view, h);
            if (!a.this.k) {
                h.r0(false);
            } else {
                h.a(1048576);
                h.r0(true);
            }
        }

        @Override // ax.c0.C1753a
        public boolean j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                a aVar = a.this;
                if (aVar.k) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.j(view, i, bundle);
        }
    }

    class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class e extends BottomSheetBehavior.g {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i) {
            if (i == 5) {
                a.this.cancel();
            }
        }
    }

    private static class f extends BottomSheetBehavior.g {
        private final Boolean a;
        private final F0 b;
        private Window c;
        private boolean d;

        /* synthetic */ f(View view, F0 f0, C0548a c0548a) {
            this(view, f0);
        }

        private void d(View view) {
            if (view.getTop() < this.b.l()) {
                Window window = this.c;
                if (window != null) {
                    Boolean bool = this.a;
                    ax.F6.d.f(window, bool == null ? this.d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.b.l() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.c;
                if (window2 != null) {
                    ax.F6.d.f(window2, this.d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i) {
            d(view);
        }

        void e(Window window) {
            if (this.c == window) {
                return;
            }
            this.c = window;
            if (window != null) {
                this.d = C1787r0.a(window, window.getDecorView()).b();
            }
        }

        private f(View view, F0 f0) {
            this.b = f0;
            h t0 = BottomSheetBehavior.q0(view).t0();
            ColorStateList B = t0 != null ? t0.B() : view.getBackgroundTintList();
            if (B != null) {
                this.a = Boolean.valueOf(C3555a.i(B.getDefaultColor()));
                return;
            }
            Integer d = z.d(view);
            if (d != null) {
                this.a = Boolean.valueOf(C3555a.i(d.intValue()));
            } else {
                this.a = null;
            }
        }
    }

    public a(Context context, int i) {
        super(context, f(context, i));
        this.k = true;
        this.l = true;
        this.q = new e();
        h(1);
        o();
    }

    private static int f(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C2402c.b, typedValue, true) ? typedValue.resourceId : l.f;
    }

    private FrameLayout m() {
        if (this.g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C2408i.a, null);
            this.g = frameLayout;
            this.h = (CoordinatorLayout) frameLayout.findViewById(C2406g.e);
            FrameLayout frameLayout2 = (FrameLayout) this.g.findViewById(C2406g.f);
            this.i = frameLayout2;
            BottomSheetBehavior<FrameLayout> q0 = BottomSheetBehavior.q0(frameLayout2);
            this.f = q0;
            q0.c0(this.q);
            this.f.R0(this.k);
            this.p = new ax.H6.c(this.f, this.i);
        }
        return this.g;
    }

    private void o() {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{C2402c.n});
        this.o = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    private void q() {
        ax.H6.c cVar = this.p;
        if (cVar == null) {
            return;
        }
        if (this.k) {
            cVar.b();
        } else {
            cVar.d();
        }
    }

    private View r(int i, View view, ViewGroup.LayoutParams layoutParams) {
        m();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.g.findViewById(C2406g.e);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.o) {
            C1760d0.v0(this.g, new C0548a());
        }
        this.i.removeAllViews();
        if (layoutParams == null) {
            this.i.addView(view);
        } else {
            this.i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C2406g.W).setOnClickListener(new b());
        C1760d0.l0(this.i, new c());
        this.i.setOnTouchListener(new d());
        return this.g;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> n = n();
        if (!this.j || n.u0() == 5) {
            super.cancel();
        } else {
            n.Z0(5);
        }
    }

    public BottomSheetBehavior<FrameLayout> n() {
        if (this.f == null) {
            m();
        }
        return this.f;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.o && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            C1787r0.b(window, !z);
            f fVar = this.n;
            if (fVar != null) {
                fVar.e(window);
            }
        }
        q();
    }

    @Override // ax.n.x, ax.i.DialogC2198n, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (Build.VERSION.SDK_INT < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.n;
        if (fVar != null) {
            fVar.e(null);
        }
        ax.H6.c cVar = this.p;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // ax.i.DialogC2198n, android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.u0() != 5) {
            return;
        }
        this.f.Z0(4);
    }

    boolean p() {
        if (!this.m) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.l = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.m = true;
        }
        return this.l;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.k != z) {
            this.k = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.R0(z);
            }
            if (getWindow() != null) {
                q();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.k) {
            this.k = true;
        }
        this.l = z;
        this.m = true;
    }

    @Override // ax.n.x, ax.i.DialogC2198n, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(r(i, null, null));
    }

    @Override // ax.n.x, ax.i.DialogC2198n, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(r(0, view, null));
    }

    @Override // ax.n.x, ax.i.DialogC2198n, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(r(0, view, layoutParams));
    }
}
