package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import ax.F6.z;
import ax.b0.C1445f;
import ax.b0.InterfaceC1443d;
import ax.c0.C1760d0;
import ax.c0.M;
import ax.d0.H;
import ax.k6.C2402c;
import ax.k6.C2408i;
import ax.k6.C2410k;
import ax.k6.l;
import ax.n6.C2582a;
import ax.o.C2653a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.e
/* loaded from: classes3.dex */
public class TabLayout extends HorizontalScrollView {
    private static final int a0 = l.j;
    private static final InterfaceC1443d<g> b0 = new C1445f(16);
    int A;
    int B;
    int C;
    int D;
    boolean E;
    boolean F;
    int G;
    int H;
    boolean I;
    private com.google.android.material.tabs.c J;
    private final TimeInterpolator K;
    private c L;
    private final ArrayList<c> M;
    private c N;
    private ValueAnimator O;
    ViewPager P;
    private androidx.viewpager.widget.a Q;
    private DataSetObserver R;
    private h S;
    private b T;
    private boolean U;
    private int V;
    private final InterfaceC1443d<i> W;
    int a;
    private final ArrayList<g> b;
    private g c;
    final f d;
    int e;
    int f;
    int g;
    int h;
    private final int i;
    private final int j;
    private int k;
    ColorStateList l;
    ColorStateList m;
    ColorStateList n;
    Drawable o;
    private int p;
    PorterDuff.Mode q;
    float r;
    float s;
    float t;
    final int u;
    int v;
    private final int w;
    private final int x;
    private final int y;
    private int z;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    private class b implements ViewPager.i {
        private boolean a;

        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.P == viewPager) {
                tabLayout.N(aVar2, this.a);
            }
        }

        void b(boolean z) {
            this.a = z;
        }
    }

    @Deprecated
    public interface c<T extends g> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    public interface d extends c<g> {
    }

    private class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.G();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.G();
        }
    }

    class f extends LinearLayout {
        ValueAnimator a;
        private int b;

        class a implements ValueAnimator.AnimatorUpdateListener {
            final /* synthetic */ View a;
            final /* synthetic */ View b;

            a(View view, View view2) {
                this.a = view;
                this.b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.j(this.a, this.b, valueAnimator.getAnimatedFraction());
            }
        }

        f(Context context) {
            super(context);
            this.b = -1;
            setWillNotDraw(false);
        }

        private void e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.a == -1) {
                tabLayout.a = tabLayout.getSelectedTabPosition();
            }
            f(TabLayout.this.a);
        }

        private void f(int i) {
            if (TabLayout.this.V == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i);
                com.google.android.material.tabs.c cVar = TabLayout.this.J;
                TabLayout tabLayout = TabLayout.this;
                cVar.c(tabLayout, childAt, tabLayout.o);
                TabLayout.this.a = i;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            f(TabLayout.this.getSelectedTabPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(View view, View view2, float f) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.o;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.o.getBounds().bottom);
            } else {
                com.google.android.material.tabs.c cVar = TabLayout.this.J;
                TabLayout tabLayout = TabLayout.this;
                cVar.d(tabLayout, view, view2, f, tabLayout.o);
            }
            postInvalidateOnAnimation();
        }

        private void k(boolean z, int i, int i2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.a == i) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                g();
                return;
            }
            TabLayout.this.a = i;
            a aVar = new a(childAt, childAt2);
            if (!z) {
                this.a.removeAllUpdateListeners();
                this.a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.a = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.K);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        void c(int i, int i2) {
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.a != i) {
                this.a.cancel();
            }
            k(true, i, i2);
        }

        boolean d() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int height2 = TabLayout.this.o.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.o.getIntrinsicHeight();
            }
            int i = TabLayout.this.C;
            if (i == 0) {
                height = getHeight() - height2;
                height2 = getHeight();
            } else if (i != 1) {
                height = 0;
                if (i != 2) {
                    height2 = i != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
            if (TabLayout.this.o.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.o.getBounds();
                TabLayout.this.o.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout.this.o.draw(canvas);
            }
            super.draw(canvas);
        }

        void h(int i, float f) {
            TabLayout.this.a = Math.round(i + f);
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.a.cancel();
            }
            j(getChildAt(i), getChildAt(i + 1), f);
        }

        void i(int i) {
            Rect bounds = TabLayout.this.o.getBounds();
            TabLayout.this.o.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                k(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.A == 1 || tabLayout.D == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 <= 0) {
                    return;
                }
                if (i3 * childCount <= getMeasuredWidth() - (((int) z.c(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i3;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.A = 0;
                    tabLayout2.V(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT >= 23 || this.b == i) {
                return;
            }
            requestLayout();
            this.b = i;
        }
    }

    public static class g {
        private Object a;
        private Drawable b;
        private CharSequence c;
        private CharSequence d;
        private View f;
        public TabLayout h;
        public i i;
        private int e = -1;
        private int g = 1;
        private int j = -1;

        public View e() {
            return this.f;
        }

        public Drawable f() {
            return this.b;
        }

        public int g() {
            return this.e;
        }

        public int h() {
            return this.g;
        }

        public Object i() {
            return this.a;
        }

        public CharSequence j() {
            return this.c;
        }

        public boolean k() {
            TabLayout tabLayout = this.h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.e;
        }

        void l() {
            this.h = null;
            this.i = null;
            this.a = null;
            this.b = null;
            this.j = -1;
            this.c = null;
            this.d = null;
            this.e = -1;
            this.f = null;
        }

        public void m() {
            TabLayout tabLayout = this.h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.L(this);
        }

        public g n(CharSequence charSequence) {
            this.d = charSequence;
            w();
            return this;
        }

        public g o(int i) {
            return p(LayoutInflater.from(this.i.getContext()).inflate(i, (ViewGroup) this.i, false));
        }

        public g p(View view) {
            this.f = view;
            w();
            return this;
        }

        public g q(Drawable drawable) {
            this.b = drawable;
            TabLayout tabLayout = this.h;
            if (tabLayout.A == 1 || tabLayout.D == 2) {
                tabLayout.V(true);
            }
            w();
            return this;
        }

        void r(int i) {
            this.e = i;
        }

        public g s(int i) {
            this.g = i;
            TabLayout tabLayout = this.h;
            if (tabLayout.A == 1 || tabLayout.D == 2) {
                tabLayout.V(true);
            }
            w();
            return this;
        }

        public g t(Object obj) {
            this.a = obj;
            return this;
        }

        public g u(int i) {
            TabLayout tabLayout = this.h;
            if (tabLayout != null) {
                return v(tabLayout.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public g v(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence)) {
                this.i.setContentDescription(charSequence);
            }
            this.c = charSequence;
            w();
            return this;
        }

        void w() {
            i iVar = this.i;
            if (iVar != null) {
                iVar.p();
            }
        }
    }

    public static class h implements ViewPager.j {
        private final WeakReference<TabLayout> a;
        private int b;
        private int c;

        public h(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void K(int i) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.c;
            tabLayout.M(tabLayout.C(i), i2 == 0 || (i2 == 2 && this.b == 0));
        }

        void a() {
            this.c = 0;
            this.b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void e(int i) {
            this.b = this.c;
            this.c = i;
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                tabLayout.W(this.c);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void h(int i, float f, int i2) {
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                int i3 = this.c;
                boolean z = true;
                if (i3 == 2 && this.b != 1) {
                    z = false;
                }
                boolean z2 = true;
                if (i3 == 2 && this.b == 0) {
                    z2 = false;
                }
                tabLayout.Q(i, f, z, z2, false);
            }
        }
    }

    public final class i extends LinearLayout {
        private g a;
        private TextView b;
        private ImageView c;
        private View d;
        private C2582a e;
        private View f;
        private TextView g;
        private ImageView h;
        private Drawable i;
        private int j;

        class a implements View.OnLayoutChangeListener {
            final /* synthetic */ View a;

            a(View view) {
                this.a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.a.getVisibility() == 0) {
                    i.this.o(this.a);
                }
            }
        }

        public i(Context context) {
            super(context);
            this.j = 2;
            q(context);
            setPaddingRelative(TabLayout.this.e, TabLayout.this.f, TabLayout.this.g, TabLayout.this.h);
            setGravity(17);
            setOrientation(!TabLayout.this.E ? 1 : 0);
            setClickable(true);
            C1760d0.w0(this, M.b(getContext(), 1002));
        }

        private void d(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float e(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        private void f(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(Canvas canvas) {
            Drawable drawable = this.i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.i.draw(canvas);
            }
        }

        private C2582a getBadge() {
            return this.e;
        }

        private C2582a getOrCreateBadge() {
            if (this.e == null) {
                this.e = C2582a.e(getContext());
            }
            n();
            C2582a c2582a = this.e;
            if (c2582a != null) {
                return c2582a;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private boolean h() {
            return this.e != null;
        }

        private void i() {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C2408i.d, (ViewGroup) this, false);
            this.c = imageView;
            addView(imageView, 0);
        }

        private void j() {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C2408i.e, (ViewGroup) this, false);
            this.b = textView;
            addView(textView);
        }

        private void l(View view) {
            if (h() && view != null) {
                f(false);
                ax.n6.d.a(this.e, view, null);
                this.d = view;
            }
        }

        private void m() {
            if (h()) {
                f(true);
                View view = this.d;
                if (view != null) {
                    ax.n6.d.b(this.e, view);
                    this.d = null;
                }
            }
        }

        private void n() {
            g gVar;
            g gVar2;
            if (h()) {
                if (this.f != null) {
                    m();
                    return;
                }
                if (this.c != null && (gVar2 = this.a) != null && gVar2.f() != null) {
                    View view = this.d;
                    ImageView imageView = this.c;
                    if (view == imageView) {
                        o(imageView);
                        return;
                    } else {
                        m();
                        l(this.c);
                        return;
                    }
                }
                if (this.b == null || (gVar = this.a) == null || gVar.h() != 1) {
                    m();
                    return;
                }
                View view2 = this.d;
                TextView textView = this.b;
                if (view2 == textView) {
                    o(textView);
                } else {
                    m();
                    l(this.b);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(View view) {
            if (h() && view == this.d) {
                ax.n6.d.c(this.e, view, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.google.android.material.tabs.TabLayout$i] */
        public void q(Context context) {
            int i = TabLayout.this.u;
            if (i != 0) {
                Drawable b = C2653a.b(context, i);
                this.i = b;
                if (b != null && b.isStateful()) {
                    this.i.setState(getDrawableState());
                }
            } else {
                this.i = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.n != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList a2 = ax.L6.a.a(TabLayout.this.n);
                boolean z = TabLayout.this.I;
                if (z) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(a2, gradientDrawable, z ? null : gradientDrawable2);
            }
            setBackground(gradientDrawable);
            TabLayout.this.invalidate();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
        
            if (r7.a.g == 1) goto L28;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void t(android.widget.TextView r8, android.widget.ImageView r9, boolean r10) {
            /*
                r7 = this;
                com.google.android.material.tabs.TabLayout$g r0 = r7.a
                r1 = 0
                if (r0 == 0) goto L1a
                android.graphics.drawable.Drawable r0 = r0.f()
                if (r0 == 0) goto L1a
                com.google.android.material.tabs.TabLayout$g r0 = r7.a
                android.graphics.drawable.Drawable r0 = r0.f()
                android.graphics.drawable.Drawable r0 = ax.U.a.r(r0)
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L1b
            L1a:
                r0 = r1
            L1b:
                if (r0 == 0) goto L2d
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.m
                r0.setTintList(r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.graphics.PorterDuff$Mode r2 = r2.q
                if (r2 == 0) goto L2d
                r0.setTintMode(r2)
            L2d:
                com.google.android.material.tabs.TabLayout$g r2 = r7.a
                if (r2 == 0) goto L36
                java.lang.CharSequence r2 = r2.j()
                goto L37
            L36:
                r2 = r1
            L37:
                r3 = 8
                r4 = 0
                if (r9 == 0) goto L4e
                if (r0 == 0) goto L48
                r9.setImageDrawable(r0)
                r9.setVisibility(r4)
                r7.setVisibility(r4)
                goto L4e
            L48:
                r9.setVisibility(r3)
                r9.setImageDrawable(r1)
            L4e:
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r8 == 0) goto L78
                if (r0 != 0) goto L60
                com.google.android.material.tabs.TabLayout$g r5 = r7.a
                int r5 = com.google.android.material.tabs.TabLayout.g.b(r5)
                r6 = 1
                if (r5 != r6) goto L60
                goto L61
            L60:
                r6 = 0
            L61:
                if (r0 != 0) goto L65
                r5 = r2
                goto L66
            L65:
                r5 = r1
            L66:
                r8.setText(r5)
                if (r6 == 0) goto L6d
                r5 = 0
                goto L6f
            L6d:
                r5 = 8
            L6f:
                r8.setVisibility(r5)
                if (r0 != 0) goto L79
                r7.setVisibility(r4)
                goto L79
            L78:
                r6 = 0
            L79:
                if (r10 == 0) goto Lbd
                if (r9 == 0) goto Lbd
                android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
                if (r6 == 0) goto L95
                int r10 = r9.getVisibility()
                if (r10 != 0) goto L95
                android.content.Context r10 = r7.getContext()
                float r10 = ax.F6.z.c(r10, r3)
                int r10 = (int) r10
                goto L96
            L95:
                r10 = 0
            L96:
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                boolean r3 = r3.E
                if (r3 == 0) goto Lae
                int r3 = r8.getMarginEnd()
                if (r10 == r3) goto Lbd
                r8.setMarginEnd(r10)
                r8.bottomMargin = r4
                r9.setLayoutParams(r8)
                r9.requestLayout()
                goto Lbd
            Lae:
                int r3 = r8.bottomMargin
                if (r10 == r3) goto Lbd
                r8.bottomMargin = r10
                r8.setMarginEnd(r4)
                r9.setLayoutParams(r8)
                r9.requestLayout()
            Lbd:
                com.google.android.material.tabs.TabLayout$g r8 = r7.a
                if (r8 == 0) goto Lc5
                java.lang.CharSequence r1 = com.google.android.material.tabs.TabLayout.g.c(r8)
            Lc5:
                int r8 = android.os.Build.VERSION.SDK_INT
                r9 = 23
                if (r8 <= r9) goto Ld2
                if (r0 != 0) goto Lce
                goto Lcf
            Lce:
                r2 = r1
            Lcf:
                ax.u.C3151B.a(r7, r2)
            Ld2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.t(android.widget.TextView, android.widget.ImageView, boolean):void");
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.i;
            if ((drawable == null || !drawable.isStateful()) ? false : this.i.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        int getContentHeight() {
            View[] viewArr = {this.b, this.c, this.f};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                    i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return i - i2;
        }

        int getContentWidth() {
            View[] viewArr = {this.b, this.c, this.f};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        public g getTab() {
            return this.a;
        }

        void k() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            H Q0 = H.Q0(accessibilityNodeInfo);
            C2582a c2582a = this.e;
            if (c2582a != null && c2582a.isVisible()) {
                Q0.q0(this.e.i());
            }
            Q0.p0(H.f.a(0, 1, this.a.g(), 1, false, isSelected()));
            if (isSelected()) {
                Q0.n0(false);
                Q0.e0(H.a.i);
            }
            Q0.E0(getResources().getString(C2410k.h));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.v, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.b != null) {
                float f = TabLayout.this.r;
                if (isSelected() && TabLayout.this.k != -1) {
                    f = TabLayout.this.s;
                }
                int i3 = this.j;
                ImageView imageView = this.c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.t;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.b.getTextSize();
                int lineCount = this.b.getLineCount();
                int maxLines = this.b.getMaxLines();
                if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                    if (TabLayout.this.D != 1 || f <= textSize || lineCount != 1 || ((layout = this.b.getLayout()) != null && e(layout, 0, f) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.b.setTextSize(0, f);
                        this.b.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        final void p() {
            s();
            g gVar = this.a;
            setSelected(gVar != null && gVar.k());
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.a.m();
            return true;
        }

        final void r() {
            setOrientation(!TabLayout.this.E ? 1 : 0);
            TextView textView = this.g;
            if (textView == null && this.h == null) {
                t(this.b, this.c, true);
            } else {
                t(textView, this.h, false);
            }
        }

        final void s() {
            ViewParent parent;
            g gVar = this.a;
            View e = gVar != null ? gVar.e() : null;
            if (e != null) {
                ViewParent parent2 = e.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(e);
                    }
                    View view = this.f;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f);
                    }
                    addView(e);
                }
                this.f = e;
                TextView textView = this.b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) e.findViewById(R.id.text1);
                this.g = textView2;
                if (textView2 != null) {
                    this.j = textView2.getMaxLines();
                }
                this.h = (ImageView) e.findViewById(R.id.icon);
            } else {
                View view2 = this.f;
                if (view2 != null) {
                    removeView(view2);
                    this.f = null;
                }
                this.g = null;
                this.h = null;
            }
            if (this.f == null) {
                if (this.c == null) {
                    i();
                }
                if (this.b == null) {
                    j();
                    this.j = this.b.getMaxLines();
                }
                ax.h0.j.m(this.b, TabLayout.this.i);
                if (!isSelected() || TabLayout.this.k == -1) {
                    ax.h0.j.m(this.b, TabLayout.this.j);
                } else {
                    ax.h0.j.m(this.b, TabLayout.this.k);
                }
                ColorStateList colorStateList = TabLayout.this.l;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
                t(this.b, this.c, true);
                n();
                d(this.c);
                d(this.b);
            } else {
                TextView textView3 = this.g;
                if (textView3 != null || this.h != null) {
                    t(textView3, this.h, false);
                }
            }
            if (gVar == null || TextUtils.isEmpty(gVar.d)) {
                return;
            }
            setContentDescription(gVar.d);
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f;
            if (view != null) {
                view.setSelected(z);
            }
        }

        void setTab(g gVar) {
            if (gVar != this.a) {
                this.a = gVar;
                p();
            }
        }
    }

    public static class j implements d {
        private final ViewPager a;

        public j(ViewPager viewPager) {
            this.a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(g gVar) {
            this.a.setCurrentItem(gVar.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(g gVar) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2402c.d0);
    }

    private void A(g gVar) {
        for (int size = this.M.size() - 1; size >= 0; size--) {
            this.M.get(size).c(gVar);
        }
    }

    private void B() {
        if (this.O == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.O = valueAnimator;
            valueAnimator.setInterpolator(this.K);
            this.O.setDuration(this.B);
            this.O.addUpdateListener(new a());
        }
    }

    private boolean D() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    private void K(int i2) {
        i iVar = (i) this.d.getChildAt(i2);
        this.d.removeViewAt(i2);
        if (iVar != null) {
            iVar.k();
            this.W.a(iVar);
        }
        requestLayout();
    }

    private void S(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.P;
        if (viewPager2 != null) {
            h hVar = this.S;
            if (hVar != null) {
                viewPager2.J(hVar);
            }
            b bVar = this.T;
            if (bVar != null) {
                this.P.I(bVar);
            }
        }
        c cVar = this.N;
        if (cVar != null) {
            J(cVar);
            this.N = null;
        }
        if (viewPager != null) {
            this.P = viewPager;
            if (this.S == null) {
                this.S = new h(this);
            }
            this.S.a();
            viewPager.c(this.S);
            j jVar = new j(viewPager);
            this.N = jVar;
            g(jVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                N(adapter, z);
            }
            if (this.T == null) {
                this.T = new b();
            }
            this.T.b(z);
            viewPager.b(this.T);
            O(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.P = null;
            N(null, false);
        }
        this.U = z2;
    }

    private void T() {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.b.get(i2).w();
        }
    }

    private void U(LinearLayout.LayoutParams layoutParams) {
        if (this.D == 1 && this.A == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private int getDefaultHeight() {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.b.get(i2);
            if (gVar != null && gVar.f() != null && !TextUtils.isEmpty(gVar.j())) {
                return !this.E ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i2 = this.w;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.D;
        if (i3 == 0 || i3 == 2) {
            return this.y;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void l(ax.S6.a aVar) {
        g F = F();
        CharSequence charSequence = aVar.a;
        if (charSequence != null) {
            F.v(charSequence);
        }
        Drawable drawable = aVar.b;
        if (drawable != null) {
            F.q(drawable);
        }
        int i2 = aVar.c;
        if (i2 != 0) {
            F.o(i2);
        }
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            F.n(aVar.getContentDescription());
        }
        i(F);
    }

    private void m(g gVar) {
        i iVar = gVar.i;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.d.addView(iVar, gVar.g(), v());
    }

    private void n(View view) {
        if (!(view instanceof ax.S6.a)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        l((ax.S6.a) view);
    }

    private void o(int i2) {
        if (i2 == -1) {
            return;
        }
        if (getWindowToken() == null || !isLaidOut() || this.d.d()) {
            O(i2, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int r = r(i2, 0.0f);
        if (scrollX != r) {
            B();
            this.O.setIntValues(scrollX, r);
            this.O.start();
        }
        this.d.c(i2, this.B);
    }

    private void p(int i2) {
        if (i2 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i2 == 1) {
            this.d.setGravity(1);
            return;
        } else if (i2 != 2) {
            return;
        }
        this.d.setGravity(8388611);
    }

    private void q() {
        int i2 = this.D;
        this.d.setPaddingRelative((i2 == 0 || i2 == 2) ? Math.max(0, this.z - this.e) : 0, 0, 0, 0);
        int i3 = this.D;
        if (i3 == 0) {
            p(this.A);
        } else if (i3 == 1 || i3 == 2) {
            if (this.A == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.d.setGravity(1);
        }
        V(true);
    }

    private int r(int i2, float f2) {
        View childAt;
        int i3 = this.D;
        if ((i3 != 0 && i3 != 2) || (childAt = this.d.getChildAt(i2)) == null) {
            return 0;
        }
        int i4 = i2 + 1;
        View childAt2 = i4 < this.d.getChildCount() ? this.d.getChildAt(i4) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) ((width + width2) * 0.5f * f2);
        return getLayoutDirection() == 0 ? left + i5 : left - i5;
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.d.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.d.getChildAt(i3);
                if ((i3 != i2 || childAt.isSelected()) && (i3 == i2 || !childAt.isSelected())) {
                    childAt.setSelected(i3 == i2);
                    childAt.setActivated(i3 == i2);
                } else {
                    childAt.setSelected(i3 == i2);
                    childAt.setActivated(i3 == i2);
                    if (childAt instanceof i) {
                        ((i) childAt).s();
                    }
                }
                i3++;
            }
        }
    }

    private void t(g gVar, int i2) {
        gVar.r(i2);
        this.b.add(i2, gVar);
        int size = this.b.size();
        int i3 = -1;
        for (int i4 = i2 + 1; i4 < size; i4++) {
            if (this.b.get(i4).g() == this.a) {
                i3 = i4;
            }
            this.b.get(i4).r(i4);
        }
        this.a = i3;
    }

    private static ColorStateList u(int i2, int i3) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    private LinearLayout.LayoutParams v() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        U(layoutParams);
        return layoutParams;
    }

    private i x(g gVar) {
        InterfaceC1443d<i> interfaceC1443d = this.W;
        i b2 = interfaceC1443d != null ? interfaceC1443d.b() : null;
        if (b2 == null) {
            b2 = new i(getContext());
        }
        b2.setTab(gVar);
        b2.setFocusable(true);
        b2.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.d)) {
            b2.setContentDescription(gVar.c);
            return b2;
        }
        b2.setContentDescription(gVar.d);
        return b2;
    }

    private void y(g gVar) {
        for (int size = this.M.size() - 1; size >= 0; size--) {
            this.M.get(size).a(gVar);
        }
    }

    private void z(g gVar) {
        for (int size = this.M.size() - 1; size >= 0; size--) {
            this.M.get(size).b(gVar);
        }
    }

    public g C(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.b.get(i2);
    }

    public boolean E() {
        return this.F;
    }

    public g F() {
        g w = w();
        w.h = this;
        w.i = x(w);
        if (w.j != -1) {
            w.i.setId(w.j);
        }
        return w;
    }

    void G() {
        int currentItem;
        I();
        androidx.viewpager.widget.a aVar = this.Q;
        if (aVar != null) {
            int e2 = aVar.e();
            for (int i2 = 0; i2 < e2; i2++) {
                k(F().v(this.Q.g(i2)), false);
            }
            ViewPager viewPager = this.P;
            if (viewPager == null || e2 <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            L(C(currentItem));
        }
    }

    protected boolean H(g gVar) {
        return b0.a(gVar);
    }

    public void I() {
        for (int childCount = this.d.getChildCount() - 1; childCount >= 0; childCount--) {
            K(childCount);
        }
        Iterator<g> it = this.b.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.l();
            H(next);
        }
        this.c = null;
    }

    @Deprecated
    public void J(c cVar) {
        this.M.remove(cVar);
    }

    public void L(g gVar) {
        M(gVar, true);
    }

    public void M(g gVar, boolean z) {
        g gVar2 = this.c;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                y(gVar);
                o(gVar.g());
                return;
            }
            return;
        }
        int g2 = gVar != null ? gVar.g() : -1;
        if (z) {
            if ((gVar2 == null || gVar2.g() == -1) && g2 != -1) {
                O(g2, 0.0f, true);
            } else {
                o(g2);
            }
            if (g2 != -1) {
                setSelectedTabView(g2);
            }
        }
        this.c = gVar;
        if (gVar2 != null && gVar2.h != null) {
            A(gVar2);
        }
        if (gVar != null) {
            z(gVar);
        }
    }

    void N(androidx.viewpager.widget.a aVar, boolean z) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.Q;
        if (aVar2 != null && (dataSetObserver = this.R) != null) {
            aVar2.u(dataSetObserver);
        }
        this.Q = aVar;
        if (z && aVar != null) {
            if (this.R == null) {
                this.R = new e();
            }
            aVar.m(this.R);
        }
        G();
    }

    public void O(int i2, float f2, boolean z) {
        P(i2, f2, z, true);
    }

    public void P(int i2, float f2, boolean z, boolean z2) {
        Q(i2, f2, z, z2, true);
    }

    void Q(int i2, float f2, boolean z, boolean z2, boolean z3) {
        int round = Math.round(i2 + f2);
        if (round < 0 || round >= this.d.getChildCount()) {
            return;
        }
        if (z2) {
            this.d.h(i2, f2);
        }
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.O.cancel();
        }
        int r = r(i2, f2);
        int scrollX = getScrollX();
        boolean z4 = (i2 < getSelectedTabPosition() && r >= scrollX) || (i2 > getSelectedTabPosition() && r <= scrollX) || i2 == getSelectedTabPosition();
        if (getLayoutDirection() == 1) {
            z4 = (i2 < getSelectedTabPosition() && r <= scrollX) || (i2 > getSelectedTabPosition() && r >= scrollX) || i2 == getSelectedTabPosition();
        }
        if (z4 || this.V == 1 || z3) {
            if (i2 < 0) {
                r = 0;
            }
            scrollTo(r, 0);
        }
        if (z) {
            setSelectedTabView(round);
        }
    }

    public void R(ViewPager viewPager, boolean z) {
        S(viewPager, z, false);
    }

    void V(boolean z) {
        for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
            View childAt = this.d.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            U((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    void W(int i2) {
        this.V = i2;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        n(view);
    }

    @Deprecated
    public void g(c cVar) {
        if (this.M.contains(cVar)) {
            return;
        }
        this.M.add(cVar);
    }

    public int getSelectedTabPosition() {
        g gVar = this.c;
        if (gVar != null) {
            return gVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.A;
    }

    public ColorStateList getTabIconTint() {
        return this.m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.H;
    }

    public int getTabIndicatorGravity() {
        return this.C;
    }

    int getTabMaxWidth() {
        return this.v;
    }

    public int getTabMode() {
        return this.D;
    }

    public ColorStateList getTabRippleColor() {
        return this.n;
    }

    public Drawable getTabSelectedIndicator() {
        return this.o;
    }

    public ColorStateList getTabTextColors() {
        return this.l;
    }

    public void h(d dVar) {
        g(dVar);
    }

    public void i(g gVar) {
        k(gVar, this.b.isEmpty());
    }

    public void j(g gVar, int i2, boolean z) {
        if (gVar.h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        t(gVar, i2);
        m(gVar);
        if (z) {
            gVar.m();
        }
    }

    public void k(g gVar, boolean z) {
        j(gVar, this.b.size(), z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ax.O6.i.e(this);
        if (this.P == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                S((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.U) {
            setupWithViewPager(null);
            this.U = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
            View childAt = this.d.getChildAt(i2);
            if (childAt instanceof i) {
                ((i) childAt).g(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        H.Q0(accessibilityNodeInfo).o0(H.e.a(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return D() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int round = Math.round(z.c(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i3) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int i4 = this.x;
            if (i4 <= 0) {
                i4 = (int) (size - z.c(getContext(), 56));
            }
            this.v = i4;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i5 = this.D;
            if (i5 != 0) {
                if (i5 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                }
                if (i5 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || D()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void s() {
        this.M.clear();
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        ax.O6.i.d(this, f2);
    }

    public void setInlineLabel(boolean z) {
        if (this.E != z) {
            this.E = z;
            for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
                View childAt = this.d.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).r();
                }
            }
            q();
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        B();
        this.O.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = ax.U.a.r(drawable).mutate();
        this.o = mutate;
        ax.C6.f.k(mutate, this.p);
        int i2 = this.G;
        if (i2 == -1) {
            i2 = this.o.getIntrinsicHeight();
        }
        this.d.i(i2);
    }

    public void setSelectedTabIndicatorColor(int i2) {
        this.p = i2;
        ax.C6.f.k(this.o, i2);
        V(false);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.C != i2) {
            this.C = i2;
            this.d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.G = i2;
        this.d.i(i2);
    }

    public void setTabGravity(int i2) {
        if (this.A != i2) {
            this.A = i2;
            q();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            T();
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(C2653a.a(getContext(), i2));
    }

    public void setTabIndicatorAnimationMode(int i2) {
        this.H = i2;
        if (i2 == 0) {
            this.J = new com.google.android.material.tabs.c();
            return;
        }
        if (i2 == 1) {
            this.J = new com.google.android.material.tabs.a();
        } else {
            if (i2 == 2) {
                this.J = new com.google.android.material.tabs.b();
                return;
            }
            throw new IllegalArgumentException(i2 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.F = z;
        this.d.g();
        this.d.postInvalidateOnAnimation();
    }

    public void setTabMode(int i2) {
        if (i2 != this.D) {
            this.D = i2;
            q();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
                View childAt = this.d.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).q(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(C2653a.a(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            T();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        N(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.I != z) {
            this.I = z;
            for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
                View childAt = this.d.getChildAt(i2);
                if (childAt instanceof i) {
                    ((i) childAt).q(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        R(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    protected g w() {
        g b2 = b0.b();
        return b2 == null ? new g() : b2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TabLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        n(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.L;
        if (cVar2 != null) {
            J(cVar2);
        }
        this.L = cVar;
        if (cVar != null) {
            g(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        n(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        n(view);
    }

    public void setSelectedTabIndicator(int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(C2653a.b(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
