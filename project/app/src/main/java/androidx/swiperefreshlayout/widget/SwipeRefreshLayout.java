/*
 * Decompiled with CFR 0.152.
 */
package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.swiperefreshlayout.widget.a;
import ax.Q.b;
import ax.c0.D;
import ax.c0.E;
import ax.c0.F;
import ax.c0.G;
import ax.c0.H;
import ax.c0.d0;
import ax.h0.g;

public class SwipeRefreshLayout
extends ViewGroup
implements G,
F,
D {
    private static final String Q = "SwipeRefreshLayout";
    private static final int[] R = new int[]{0x101000E};
    int A;
    int B;
    ax.t2.a C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    private Animation H;
    boolean I;
    private int J;
    boolean K;
    private i L;
    private boolean M;
    private Animation.AnimationListener N;
    private final Animation O;
    private final Animation P;
    private View a;
    j b;
    boolean c = false;
    private int d;
    private float e = -1.0f;
    private float f;
    private final H g;
    private final E h;
    private final int[] i = new int[2];
    private final int[] j = new int[2];
    private final int[] k = new int[2];
    private boolean l;
    private int m;
    int n;
    private float o;
    private float p;
    private boolean q;
    private int r = -1;
    boolean s;
    private boolean t;
    private final DecelerateInterpolator u;
    a v;
    private int w = -1;
    protected int x;
    float y;
    protected int z;

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n8;
        this.N = new Animation.AnimationListener(this){
            final SwipeRefreshLayout a;
            {
                this.a = swipeRefreshLayout;
            }

            public void onAnimationEnd(Animation object) {
                object = this.a;
                if (((SwipeRefreshLayout)object).c) {
                    ((SwipeRefreshLayout)object).C.setAlpha(255);
                    this.a.C.start();
                    object = this.a;
                    if (((SwipeRefreshLayout)object).I && (object = ((SwipeRefreshLayout)object).b) != null) {
                        object.a();
                    }
                    object = this.a;
                    ((SwipeRefreshLayout)object).n = ((SwipeRefreshLayout)object).v.getTop();
                    return;
                }
                ((SwipeRefreshLayout)object).s();
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        };
        this.O = new Animation(this){
            final SwipeRefreshLayout q;
            {
                this.q = swipeRefreshLayout;
            }

            public void applyTransformation(float f8, Transformation object) {
                object = this.q;
                int n8 = !object.K ? object.A - Math.abs(object.z) : object.A;
                object = this.q;
                int n9 = object.x;
                n8 = (int)((float)(n8 - n9) * f8);
                int n10 = object.v.getTop();
                this.q.setTargetOffsetTopAndBottom(n9 + n8 - n10);
                this.q.C.e(1.0f - f8);
            }
        };
        this.P = new Animation(this){
            final SwipeRefreshLayout q;
            {
                this.q = swipeRefreshLayout;
            }

            public void applyTransformation(float f8, Transformation transformation) {
                this.q.q(f8);
            }
        };
        this.d = ViewConfiguration.get((Context)context).getScaledTouchSlop();
        this.m = this.getResources().getInteger(0x10E0001);
        this.setWillNotDraw(false);
        this.u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.J = (int)(displayMetrics.density * 40.0f);
        this.g();
        this.setChildrenDrawingOrderEnabled(true);
        this.A = n8 = (int)(displayMetrics.density * 64.0f);
        this.e = n8;
        this.g = new H(this);
        this.h = new E((View)this);
        this.setNestedScrollingEnabled(true);
        this.n = n8 = -this.J;
        this.z = n8;
        this.q(1.0f);
        context = context.obtainStyledAttributes(attributeSet, R);
        this.setEnabled(context.getBoolean(0, true));
        context.recycle();
    }

    private void A(Animation.AnimationListener animationListener) {
        Animation animation;
        this.v.setVisibility(0);
        this.C.setAlpha(255);
        this.D = animation = new Animation(this){
            final SwipeRefreshLayout q;
            {
                this.q = swipeRefreshLayout;
            }

            public void applyTransformation(float f8, Transformation transformation) {
                this.q.setAnimationProgress(f8);
            }
        };
        animation.setDuration((long)this.m);
        if (animationListener != null) {
            this.v.b(animationListener);
        }
        this.v.clearAnimation();
        this.v.startAnimation(this.D);
    }

    private void a(int n8, Animation.AnimationListener animationListener) {
        this.x = n8;
        this.O.reset();
        this.O.setDuration(200L);
        this.O.setInterpolator((Interpolator)this.u);
        if (animationListener != null) {
            this.v.b(animationListener);
        }
        this.v.clearAnimation();
        this.v.startAnimation(this.O);
    }

    private void c(int n8, Animation.AnimationListener animationListener) {
        if (this.s) {
            this.z(n8, animationListener);
            return;
        }
        this.x = n8;
        this.P.reset();
        this.P.setDuration(200L);
        this.P.setInterpolator((Interpolator)this.u);
        if (animationListener != null) {
            this.v.b(animationListener);
        }
        this.v.clearAnimation();
        this.v.startAnimation(this.P);
    }

    private void g() {
        ax.t2.a a8;
        this.v = new a(this.getContext());
        this.C = a8 = new ax.t2.a(this.getContext());
        a8.l(1);
        this.v.setImageDrawable(this.C);
        this.v.setVisibility(8);
        this.addView((View)this.v);
    }

    private void j() {
        if (this.a == null) {
            for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
                View view = this.getChildAt(i8);
                if (view.equals((Object)this.v)) continue;
                this.a = view;
                return;
            }
        }
    }

    private void k(float f8) {
        if (f8 > this.e) {
            this.t(true, true);
            return;
        }
        this.c = false;
        this.C.j(0.0f, 0.0f);
        Animation.AnimationListener animationListener = !this.s ? new Animation.AnimationListener(this){
            final SwipeRefreshLayout a;
            {
                this.a = swipeRefreshLayout;
            }

            public void onAnimationEnd(Animation object) {
                object = this.a;
                if (!((SwipeRefreshLayout)object).s) {
                    ((SwipeRefreshLayout)object).y(null);
                }
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        } : null;
        this.c(this.n, animationListener);
        this.C.d(false);
    }

    private boolean l(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void n(float f8) {
        this.C.d(true);
        float f9 = Math.min(1.0f, Math.abs(f8 / this.e));
        float f10 = (float)Math.max((double)f9 - 0.4, 0.0) * 5.0f / 3.0f;
        float f11 = Math.abs(f8);
        float f12 = this.e;
        int n8 = this.B;
        if (n8 <= 0) {
            n8 = this.K ? this.A - this.z : this.A;
        }
        float f13 = n8;
        double d8 = Math.max(0.0f, Math.min(f11 - f12, f13 * 2.0f) / f13) / 4.0f;
        f11 = (float)(d8 - Math.pow(d8, 2.0)) * 2.0f;
        n8 = this.z;
        int n9 = (int)(f13 * f9 + f13 * f11 * 2.0f);
        if (this.v.getVisibility() != 0) {
            this.v.setVisibility(0);
        }
        if (!this.s) {
            this.v.setScaleX(1.0f);
            this.v.setScaleY(1.0f);
        }
        if (this.s) {
            this.setAnimationProgress(Math.min(1.0f, f8 / this.e));
        }
        if (f8 < this.e) {
            if (this.C.getAlpha() > 76 && !this.l(this.F)) {
                this.x();
            }
        } else if (this.C.getAlpha() < 255 && !this.l(this.G)) {
            this.w();
        }
        this.C.j(0.0f, Math.min(0.8f, f10 * 0.8f));
        this.C.e(Math.min(1.0f, f10));
        this.C.g((f10 * 0.4f - 0.25f + f11 * 2.0f) * 0.5f);
        this.setTargetOffsetTopAndBottom(n8 + n9 - this.n);
    }

    private void r(MotionEvent motionEvent) {
        int n8 = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(n8) == this.r) {
            n8 = n8 == 0 ? 1 : 0;
            this.r = motionEvent.getPointerId(n8);
        }
    }

    private void setColorViewAlpha(int n8) {
        this.v.getBackground().setAlpha(n8);
        this.C.setAlpha(n8);
    }

    private void t(boolean bl, boolean bl2) {
        if (this.c != bl) {
            this.I = bl2;
            this.j();
            this.c = bl;
            if (bl) {
                this.a(this.n, this.N);
                return;
            }
            this.y(this.N);
        }
    }

    private Animation u(int n8, int n9) {
        Animation animation = new Animation(this, n8, n9){
            final int c0;
            final SwipeRefreshLayout d0;
            final int q;
            {
                this.d0 = swipeRefreshLayout;
                this.q = n8;
                this.c0 = n9;
            }

            public void applyTransformation(float f8, Transformation object) {
                object = this.d0.C;
                int n8 = this.q;
                ((ax.t2.a)((Object)object)).setAlpha((int)((float)n8 + (float)(this.c0 - n8) * f8));
            }
        };
        animation.setDuration(300L);
        this.v.b(null);
        this.v.clearAnimation();
        this.v.startAnimation(animation);
        return animation;
    }

    private void v(float f8) {
        float f9 = this.p;
        int n8 = this.d;
        if (f8 - f9 > (float)n8 && !this.q) {
            this.o = f9 + (float)n8;
            this.q = true;
            this.C.setAlpha(76);
        }
    }

    private void w() {
        this.G = this.u(this.C.getAlpha(), 255);
    }

    private void x() {
        this.F = this.u(this.C.getAlpha(), 76);
    }

    private void z(int n8, Animation.AnimationListener animationListener) {
        Animation animation;
        this.x = n8;
        this.y = this.v.getScaleX();
        this.H = animation = new Animation(this){
            final SwipeRefreshLayout q;
            {
                this.q = swipeRefreshLayout;
            }

            public void applyTransformation(float f8, Transformation object) {
                object = this.q;
                float f9 = ((SwipeRefreshLayout)object).y;
                ((SwipeRefreshLayout)object).setAnimationProgress(f9 + -f9 * f8);
                this.q.q(f8);
            }
        };
        animation.setDuration(150L);
        if (animationListener != null) {
            this.v.b(animationListener);
        }
        this.v.clearAnimation();
        this.v.startAnimation(this.H);
    }

    @Override
    public void b(View view, int n8, int n9, int n10, int n11, int n12, int[] nArray) {
        if (n12 == 0) {
            int n13 = nArray[1];
            this.i(n8, n9, n10, n11, this.j, n12, nArray);
            n9 = n11 - (nArray[1] - n13);
            n8 = n9 == 0 ? n11 + this.j[1] : n9;
            if (n8 < 0 && !this.d()) {
                float f8;
                this.f = f8 = this.f + (float)Math.abs(n8);
                this.n(f8);
                nArray[1] = nArray[1] + n9;
            }
        }
    }

    public boolean d() {
        i i8 = this.L;
        if (i8 != null) {
            return i8.a(this, this.a);
        }
        i8 = this.a;
        if (i8 instanceof ListView) {
            return ax.h0.g.a((ListView)i8, -1);
        }
        return i8.canScrollVertically(-1);
    }

    public boolean dispatchNestedFling(float f8, float f9, boolean bl) {
        return this.h.a(f8, f9, bl);
    }

    public boolean dispatchNestedPreFling(float f8, float f9) {
        return this.h.b(f8, f9);
    }

    public boolean dispatchNestedPreScroll(int n8, int n9, int[] nArray, int[] nArray2) {
        return this.h.c(n8, n9, nArray, nArray2);
    }

    public boolean dispatchNestedScroll(int n8, int n9, int n10, int n11, int[] nArray) {
        return this.h.f(n8, n9, n10, n11, nArray);
    }

    @Override
    public void e(View view, int n8, int n9, int n10, int n11, int n12) {
        this.b(view, n8, n9, n10, n11, n12, this.k);
    }

    @Override
    public boolean f(View view, View view2, int n8, int n9) {
        if (n9 == 0) {
            return this.onStartNestedScroll(view, view2, n8);
        }
        return false;
    }

    protected int getChildDrawingOrder(int n8, int n9) {
        int n10 = this.w;
        if (n10 < 0) {
            n8 = n9;
        } else {
            if (n9 == n8 - 1) {
                return n10;
            }
            n8 = n9;
            if (n9 >= n10) {
                n8 = n9 + 1;
            }
        }
        return n8;
    }

    public int getNestedScrollAxes() {
        return this.g.a();
    }

    public int getProgressCircleDiameter() {
        return this.J;
    }

    public int getProgressViewEndOffset() {
        return this.A;
    }

    public int getProgressViewStartOffset() {
        return this.z;
    }

    @Override
    public void h(View view, View view2, int n8, int n9) {
        if (n9 == 0) {
            this.onNestedScrollAccepted(view, view2, n8);
        }
    }

    public boolean hasNestedScrollingParent() {
        return this.h.j();
    }

    public void i(int n8, int n9, int n10, int n11, int[] nArray, int n12, int[] nArray2) {
        if (n12 == 0) {
            this.h.e(n8, n9, n10, n11, nArray, n12, nArray2);
        }
    }

    public boolean isNestedScrollingEnabled() {
        return this.h.l();
    }

    public boolean m() {
        return this.c;
    }

    @Override
    public void o(View view, int n8) {
        if (n8 == 0) {
            this.onStopNestedScroll(view);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.s();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        block5: {
            block9: {
                int n8;
                block6: {
                    block7: {
                        block8: {
                            this.j();
                            n8 = motionEvent.getActionMasked();
                            if (this.t && n8 == 0) {
                                this.t = false;
                            }
                            if (!this.isEnabled() || this.t || this.d() || this.c || this.l) break block5;
                            if (n8 == 0) break block6;
                            if (n8 == 1) break block7;
                            if (n8 == 2) break block8;
                            if (n8 == 3) break block7;
                            if (n8 == 6) {
                                this.r(motionEvent);
                            }
                            break block9;
                        }
                        n8 = this.r;
                        if (n8 == -1) {
                            Log.e((String)Q, (String)"Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        if ((n8 = motionEvent.findPointerIndex(n8)) < 0) {
                            return false;
                        }
                        this.v(motionEvent.getY(n8));
                        break block9;
                    }
                    this.q = false;
                    this.r = -1;
                    break block9;
                }
                this.setTargetOffsetTopAndBottom(this.z - this.v.getTop());
                this.r = n8 = motionEvent.getPointerId(0);
                this.q = false;
                n8 = motionEvent.findPointerIndex(n8);
                if (n8 < 0) {
                    return false;
                }
                this.p = motionEvent.getY(n8);
            }
            return this.q;
        }
        return false;
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        Object object;
        block5: {
            block4: {
                n9 = this.getMeasuredWidth();
                n10 = this.getMeasuredHeight();
                if (this.getChildCount() == 0) break block4;
                if (this.a == null) {
                    this.j();
                }
                if ((object = this.a) != null) break block5;
            }
            return;
        }
        n8 = this.getPaddingLeft();
        n11 = this.getPaddingTop();
        object.layout(n8, n11, n9 - this.getPaddingLeft() - this.getPaddingRight() + n8, n10 - this.getPaddingTop() - this.getPaddingBottom() + n11);
        n10 = this.v.getMeasuredWidth();
        n8 = this.v.getMeasuredHeight();
        object = this.v;
        n11 = n10 / 2;
        n10 = this.n;
        object.layout((n9 /= 2) - n11, n10, n9 + n11, n8 + n10);
    }

    public void onMeasure(int n8, int n9) {
        View view;
        super.onMeasure(n8, n9);
        if (this.a == null) {
            this.j();
        }
        if ((view = this.a) != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((int)(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight()), (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom()), (int)0x40000000));
            this.v.measure(View.MeasureSpec.makeMeasureSpec((int)this.J, (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)this.J, (int)0x40000000));
            this.w = -1;
            for (n8 = 0; n8 < this.getChildCount(); ++n8) {
                if (this.getChildAt(n8) != this.v) continue;
                this.w = n8;
                return;
            }
        }
    }

    public boolean onNestedFling(View view, float f8, float f9, boolean bl) {
        return this.dispatchNestedFling(f8, f9, bl);
    }

    public boolean onNestedPreFling(View view, float f8, float f9) {
        return this.dispatchNestedPreFling(f8, f9);
    }

    public void onNestedPreScroll(View object, int n8, int n9, int[] nArray) {
        float f8;
        if (n9 > 0 && (f8 = this.f) > 0.0f) {
            float f9 = n9;
            if (f9 > f8) {
                nArray[1] = (int)f8;
                this.f = 0.0f;
            } else {
                this.f = f8 - f9;
                nArray[1] = n9;
            }
            this.n(this.f);
        }
        if (this.K && n9 > 0 && this.f == 0.0f && Math.abs(n9 - nArray[1]) > 0) {
            this.v.setVisibility(8);
        }
        if (this.dispatchNestedPreScroll(n8 - nArray[0], n9 - nArray[1], (int[])(object = (Object)this.i), null)) {
            nArray[0] = nArray[0] + object[0];
            nArray[1] = nArray[1] + object[1];
        }
    }

    public void onNestedScroll(View view, int n8, int n9, int n10, int n11) {
        this.b(view, n8, n9, n10, n11, 0, this.k);
    }

    public void onNestedScrollAccepted(View view, View view2, int n8) {
        this.g.b(view, view2, n8);
        this.startNestedScroll(n8 & 2);
        this.f = 0.0f;
        this.l = true;
    }

    protected void onRestoreInstanceState(Parcelable object) {
        object = (k)((Object)object);
        super.onRestoreInstanceState(object.getSuperState());
        this.setRefreshing(object.q);
    }

    protected Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.c);
    }

    public boolean onStartNestedScroll(View view, View view2, int n8) {
        return this.isEnabled() && !this.t && !this.c && (n8 & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.g.d(view);
        this.l = false;
        float f8 = this.f;
        if (f8 > 0.0f) {
            this.k(f8);
            this.f = 0.0f;
        }
        this.stopNestedScroll();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n8 = motionEvent.getActionMasked();
        if (this.t && n8 == 0) {
            this.t = false;
        }
        if (!this.isEnabled()) return false;
        if (this.t) return false;
        if (this.d()) return false;
        if (this.c) return false;
        if (this.l) {
            return false;
        }
        if (n8 == 0) {
            this.r = motionEvent.getPointerId(0);
            this.q = false;
            return true;
        }
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 == 3) return false;
                if (n8 != 5) {
                    if (n8 != 6) {
                        return true;
                    }
                    this.r(motionEvent);
                    return true;
                }
                n8 = motionEvent.getActionIndex();
                if (n8 < 0) {
                    Log.e((String)Q, (String)"Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.r = motionEvent.getPointerId(n8);
                return true;
            }
            n8 = motionEvent.findPointerIndex(this.r);
            if (n8 < 0) {
                Log.e((String)Q, (String)"Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float f8 = motionEvent.getY(n8);
            this.v(f8);
            if (!this.q) return true;
            if (!((f8 = (f8 - this.o) * 0.5f) > 0.0f)) return false;
            this.getParent().requestDisallowInterceptTouchEvent(true);
            this.n(f8);
            return true;
        }
        n8 = motionEvent.findPointerIndex(this.r);
        if (n8 < 0) {
            Log.e((String)Q, (String)"Got ACTION_UP event but don't have an active pointer id.");
            return false;
        }
        if (this.q) {
            float f9 = motionEvent.getY(n8);
            float f10 = this.o;
            this.q = false;
            this.k((f9 - f10) * 0.5f);
        }
        this.r = -1;
        return false;
    }

    @Override
    public void p(View view, int n8, int n9, int[] nArray, int n10) {
        if (n10 == 0) {
            this.onNestedPreScroll(view, n8, n9, nArray);
        }
    }

    void q(float f8) {
        int n8 = this.x;
        this.setTargetOffsetTopAndBottom(n8 + (int)((float)(this.z - n8) * f8) - this.v.getTop());
    }

    public void requestDisallowInterceptTouchEvent(boolean bl) {
        View view = this.a;
        if (view != null && !d0.S(view)) {
            if (!this.M && (view = this.getParent()) != null) {
                view.requestDisallowInterceptTouchEvent(bl);
            }
            return;
        }
        super.requestDisallowInterceptTouchEvent(bl);
    }

    void s() {
        this.v.clearAnimation();
        this.C.stop();
        this.v.setVisibility(8);
        this.setColorViewAlpha(255);
        if (this.s) {
            this.setAnimationProgress(0.0f);
        } else {
            this.setTargetOffsetTopAndBottom(this.z - this.n);
        }
        this.n = this.v.getTop();
    }

    void setAnimationProgress(float f8) {
        this.v.setScaleX(f8);
        this.v.setScaleY(f8);
    }

    @Deprecated
    public void setColorScheme(int ... nArray) {
        this.setColorSchemeResources(nArray);
    }

    public void setColorSchemeColors(int ... nArray) {
        this.j();
        this.C.f(nArray);
    }

    public void setColorSchemeResources(int ... nArray) {
        Context context = this.getContext();
        int[] nArray2 = new int[nArray.length];
        for (int i8 = 0; i8 < nArray.length; ++i8) {
            nArray2[i8] = ax.Q.b.c(context, nArray[i8]);
        }
        this.setColorSchemeColors(nArray2);
    }

    public void setDistanceToTriggerSync(int n8) {
        this.e = n8;
    }

    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        if (!bl) {
            this.s();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean bl) {
        this.M = bl;
    }

    public void setNestedScrollingEnabled(boolean bl) {
        this.h.m(bl);
    }

    public void setOnChildScrollUpCallback(i i8) {
        this.L = i8;
    }

    public void setOnRefreshListener(j j8) {
        this.b = j8;
    }

    @Deprecated
    public void setProgressBackgroundColor(int n8) {
        this.setProgressBackgroundColorSchemeResource(n8);
    }

    public void setProgressBackgroundColorSchemeColor(int n8) {
        this.v.setBackgroundColor(n8);
    }

    public void setProgressBackgroundColorSchemeResource(int n8) {
        this.setProgressBackgroundColorSchemeColor(ax.Q.b.c(this.getContext(), n8));
    }

    public void setRefreshing(boolean bl) {
        if (bl && this.c != bl) {
            this.c = bl;
            int n8 = !this.K ? this.A + this.z : this.A;
            this.setTargetOffsetTopAndBottom(n8 - this.n);
            this.I = false;
            this.A(this.N);
            return;
        }
        this.t(bl, false);
    }

    public void setSize(int n8) {
        if (n8 != 0 && n8 != 1) {
            return;
        }
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.J = n8 == 0 ? (int)(displayMetrics.density * 56.0f) : (int)(displayMetrics.density * 40.0f);
        this.v.setImageDrawable(null);
        this.C.l(n8);
        this.v.setImageDrawable(this.C);
    }

    public void setSlingshotDistance(int n8) {
        this.B = n8;
    }

    void setTargetOffsetTopAndBottom(int n8) {
        this.v.bringToFront();
        d0.W((View)this.v, n8);
        this.n = this.v.getTop();
    }

    public boolean startNestedScroll(int n8) {
        return this.h.o(n8);
    }

    public void stopNestedScroll() {
        this.h.q();
    }

    void y(Animation.AnimationListener animationListener) {
        Animation animation;
        this.E = animation = new Animation(this){
            final SwipeRefreshLayout q;
            {
                this.q = swipeRefreshLayout;
            }

            public void applyTransformation(float f8, Transformation transformation) {
                this.q.setAnimationProgress(1.0f - f8);
            }
        };
        animation.setDuration(150L);
        this.v.b(animationListener);
        this.v.clearAnimation();
        this.v.startAnimation(this.E);
    }

    public static interface i {
        public boolean a(SwipeRefreshLayout var1, View var2);
    }

    public static interface j {
        public void a();
    }

    static class k
    extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new Parcelable.Creator<k>(){

            public k a(Parcel parcel) {
                return new k(parcel);
            }

            public k[] b(int n8) {
                return new k[n8];
            }
        };
        final boolean q;

        k(Parcel parcel) {
            super(parcel);
            boolean bl = parcel.readByte() != 0;
            this.q = bl;
        }

        k(Parcelable parcelable, boolean bl) {
            super(parcelable);
            this.q = bl;
        }

        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeByte((byte)(this.q ? 1 : 0));
        }
    }
}

