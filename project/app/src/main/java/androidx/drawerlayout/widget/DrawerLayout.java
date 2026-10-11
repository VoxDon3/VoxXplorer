/*
 * Decompiled with CFR 0.152.
 */
package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import ax.Q.b;
import ax.c0.F0;
import ax.c0.d0;
import ax.c0.t;
import ax.d0.H;
import ax.d0.M;
import ax.l0.c;
import ax.t0.a;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout
extends ViewGroup {
    private static final int[] L = new int[]{16843828};
    static final int[] M = new int[]{16842931};
    static final boolean N;
    private static final boolean O;
    private static boolean P;
    private CharSequence A;
    private Object B;
    private boolean C;
    private Drawable D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private final ArrayList<View> H;
    private Rect I;
    private Matrix J;
    private final M K;
    private final d a;
    private float b;
    private int c;
    private int d;
    private float e;
    private Paint f;
    private final ax.l0.c g;
    private final ax.l0.c h;
    private final h i;
    private final h j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private e s;
    private List<e> t;
    private float u;
    private float v;
    private Drawable w;
    private Drawable x;
    private Drawable y;
    private CharSequence z;

    static {
        int n8 = Build.VERSION.SDK_INT;
        boolean bl = true;
        N = true;
        O = true;
        if (n8 < 29) {
            bl = false;
        }
        P = bl;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.s0.a.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public DrawerLayout(Context context, AttributeSet attributeSet, int n8) {
        Throwable throwable2;
        block7: {
            ax.l0.c c8;
            h h8;
            super(context, attributeSet, n8);
            this.a = new d();
            this.d = -1728053248;
            this.f = new Paint();
            this.m = true;
            this.n = 3;
            this.o = 3;
            this.p = 3;
            this.q = 3;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.K = new M(this){
                final DrawerLayout a;
                {
                    this.a = drawerLayout;
                }

                @Override
                public boolean a(View view, M.a a8) {
                    if (this.a.A(view) && this.a.p(view) != 2) {
                        this.a.d(view);
                        return true;
                    }
                    return false;
                }
            };
            this.setDescendantFocusability(262144);
            float f8 = this.getResources().getDisplayMetrics().density;
            this.c = (int)(64.0f * f8 + 0.5f);
            f8 *= 400.0f;
            Object object = new h(this, 3);
            this.i = object;
            this.j = h8 = new h(this, 5);
            this.g = c8 = ax.l0.c.n(this, 1.0f, (c.c)object);
            c8.M(1);
            c8.N(f8);
            ((h)object).q(c8);
            this.h = object = ax.l0.c.n(this, 1.0f, h8);
            ((ax.l0.c)object).M(2);
            ((ax.l0.c)object).N(f8);
            h8.q((ax.l0.c)object);
            this.setFocusableInTouchMode(true);
            d0.s0((View)this, 1);
            d0.l0((View)this, new c(this));
            this.setMotionEventSplittingEnabled(false);
            if (d0.y((View)this)) {
                this.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this){
                    final DrawerLayout a;
                    {
                        this.a = drawerLayout;
                    }

                    public WindowInsets onApplyWindowInsets(View object, WindowInsets windowInsets) {
                        object = (DrawerLayout)((Object)object);
                        boolean bl = windowInsets.getSystemWindowInsetTop() > 0;
                        ((DrawerLayout)((Object)object)).M(windowInsets, bl);
                        return windowInsets.consumeSystemWindowInsets();
                    }
                });
                this.setSystemUiVisibility(1280);
                h8 = context.obtainStyledAttributes(L);
                try {
                    this.w = h8.getDrawable(0);
                }
                finally {
                    h8.recycle();
                }
            }
            attributeSet = context.obtainStyledAttributes(attributeSet, ax.s0.c.b, n8, 0);
            try {
                n8 = ax.s0.c.c;
                this.b = attributeSet.hasValue(n8) ? attributeSet.getDimension(n8, 0.0f) : this.getResources().getDimension(ax.s0.b.a);
            }
            catch (Throwable throwable2) {
                break block7;
            }
            attributeSet.recycle();
            this.H = new ArrayList();
            return;
        }
        attributeSet.recycle();
        throw throwable2;
    }

    private boolean D(float f8, float f9, View view) {
        if (this.I == null) {
            this.I = new Rect();
        }
        view.getHitRect(this.I);
        return this.I.contains((int)f8, (int)f9);
    }

    private void E(Drawable drawable, int n8) {
        if (drawable != null && ax.U.a.h(drawable)) {
            ax.U.a.m(drawable, n8);
        }
    }

    private Drawable J() {
        int n8 = d0.B((View)this);
        if (n8 == 0) {
            Drawable drawable = this.D;
            if (drawable != null) {
                this.E(drawable, n8);
                return this.D;
            }
        } else {
            Drawable drawable = this.E;
            if (drawable != null) {
                this.E(drawable, n8);
                return this.E;
            }
        }
        return this.F;
    }

    private Drawable K() {
        int n8 = d0.B((View)this);
        if (n8 == 0) {
            Drawable drawable = this.E;
            if (drawable != null) {
                this.E(drawable, n8);
                return this.E;
            }
        } else {
            Drawable drawable = this.D;
            if (drawable != null) {
                this.E(drawable, n8);
                return this.D;
            }
        }
        return this.G;
    }

    private void L() {
        if (O) {
            return;
        }
        this.x = this.J();
        this.y = this.K();
    }

    private void P(View view) {
        H.a a8 = H.a.y;
        d0.f0(view, a8.b());
        if (this.A(view) && this.p(view) != 2) {
            d0.h0(view, a8, null, this.K);
        }
    }

    private void Q(View view, boolean bl) {
        int n8 = this.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            View view2 = this.getChildAt(i8);
            if (!bl && !this.B(view2) || bl && view2 == view) {
                d0.s0(view2, 1);
                continue;
            }
            d0.s0(view2, 4);
        }
    }

    private boolean k(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            motionEvent = this.t(motionEvent, view);
            boolean bl = view.dispatchGenericMotionEvent(motionEvent);
            motionEvent.recycle();
            return bl;
        }
        float f8 = this.getScrollX() - view.getLeft();
        float f9 = this.getScrollY() - view.getTop();
        motionEvent.offsetLocation(f8, f9);
        boolean bl = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-f8, -f9);
        return bl;
    }

    private MotionEvent t(MotionEvent motionEvent, View view) {
        float f8 = this.getScrollX() - view.getLeft();
        float f9 = this.getScrollY() - view.getTop();
        motionEvent = MotionEvent.obtain((MotionEvent)motionEvent);
        motionEvent.offsetLocation(f8, f9);
        view = view.getMatrix();
        if (!view.isIdentity()) {
            if (this.J == null) {
                this.J = new Matrix();
            }
            view.invert(this.J);
            motionEvent.transform(this.J);
        }
        return motionEvent;
    }

    static String u(int n8) {
        if ((n8 & 3) == 3) {
            return "LEFT";
        }
        if ((n8 & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(n8);
    }

    private static boolean v(View view) {
        return (view = view.getBackground()) != null && view.getOpacity() == -1;
    }

    private boolean w() {
        int n8 = this.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!((f)this.getChildAt((int)i8).getLayoutParams()).c) continue;
            return true;
        }
        return false;
    }

    private boolean x() {
        return this.n() != null;
    }

    static boolean y(View view) {
        return d0.z(view) != 4 && d0.z(view) != 2;
    }

    public boolean A(View view) {
        if (this.B(view)) {
            return (((f)view.getLayoutParams()).d & 1) == 1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    boolean B(View view) {
        int n8 = ax.c0.t.b(((f)view.getLayoutParams()).a, d0.B(view));
        if ((n8 & 3) != 0) {
            return true;
        }
        return (n8 & 5) != 0;
    }

    public boolean C(View view) {
        if (this.B(view)) {
            return ((f)view.getLayoutParams()).b > 0.0f;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    void F(View view, float f8) {
        float f9 = this.s(view);
        float f10 = view.getWidth();
        int n8 = (int)(f9 * f10);
        n8 = (int)(f10 * f8) - n8;
        if (!this.c(view, 3)) {
            n8 = -n8;
        }
        view.offsetLeftAndRight(n8);
        this.O(view, f8);
    }

    public void G(View view) {
        this.H(view, true);
    }

    public void H(View view, boolean bl) {
        if (this.B(view)) {
            f f8 = (f)view.getLayoutParams();
            if (this.m) {
                f8.b = 1.0f;
                f8.d = 1;
                this.Q(view, true);
                this.P(view);
            } else if (bl) {
                f8.d |= 2;
                if (this.c(view, 3)) {
                    this.g.Q(view, 0, view.getTop());
                } else {
                    this.h.Q(view, this.getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                this.F(view, 1.0f);
                this.R(0, view);
                view.setVisibility(0);
            }
            this.invalidate();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a sliding drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void I(e e8) {
        List<e> list;
        if (e8 == null || (list = this.t) == null) {
            return;
        }
        list.remove(e8);
    }

    public void M(Object object, boolean bl) {
        this.B = object;
        this.C = bl;
        bl = !bl && this.getBackground() == null;
        this.setWillNotDraw(bl);
        this.requestLayout();
    }

    public void N(int n8, int n9) {
        ax.l0.c c8;
        int n10 = ax.c0.t.b(n9, d0.B((View)this));
        if (n9 != 3) {
            if (n9 != 5) {
                if (n9 != 0x800003) {
                    if (n9 == 0x800005) {
                        this.q = n8;
                    }
                } else {
                    this.p = n8;
                }
            } else {
                this.o = n8;
            }
        } else {
            this.n = n8;
        }
        if (n8 != 0) {
            c8 = n10 == 3 ? this.g : this.h;
            c8.a();
        }
        if (n8 != 1) {
            if (n8 == 2 && (c8 = this.l(n10)) != null) {
                this.G((View)c8);
                return;
            }
        } else {
            c8 = this.l(n10);
            if (c8 != null) {
                this.d((View)c8);
            }
        }
    }

    void O(View view, float f8) {
        f f9 = (f)view.getLayoutParams();
        if (f8 == f9.b) {
            return;
        }
        f9.b = f8;
        this.j(view, f8);
    }

    void R(int n8, View object) {
        int n9;
        int n10 = this.g.A();
        int n11 = this.h.A();
        if (n10 != 1 && n11 != 1) {
            int n12;
            n9 = n12 = 2;
            if (n10 != 2) {
                n9 = n11 == 2 ? n12 : 0;
            }
        } else {
            n9 = 1;
        }
        if (object != null && n8 == 0) {
            float f8 = ((f)object.getLayoutParams()).b;
            if (f8 == 0.0f) {
                this.h((View)object);
            } else if (f8 == 1.0f) {
                this.i((View)object);
            }
        }
        if (n9 != this.k) {
            this.k = n9;
            object = this.t;
            if (object != null) {
                for (n8 = object.size() - 1; n8 >= 0; --n8) {
                    this.t.get(n8).c(n9);
                }
            }
        }
    }

    public void a(e e8) {
        if (e8 == null) {
            return;
        }
        if (this.t == null) {
            this.t = new ArrayList<e>();
        }
        this.t.add(e8);
    }

    public void addFocusables(ArrayList<View> arrayList, int n8, int n9) {
        View view;
        int n10;
        if (this.getDescendantFocusability() == 393216) {
            return;
        }
        int n11 = this.getChildCount();
        int n12 = 0;
        int n13 = 0;
        for (n10 = 0; n10 < n11; ++n10) {
            view = this.getChildAt(n10);
            if (this.B(view)) {
                if (!this.A(view)) continue;
                view.addFocusables(arrayList, n8, n9);
                n13 = 1;
                continue;
            }
            this.H.add(view);
        }
        if (n13 == 0) {
            n13 = this.H.size();
            for (n10 = n12; n10 < n13; ++n10) {
                view = this.H.get(n10);
                if (view.getVisibility() != 0) continue;
                view.addFocusables(arrayList, n8, n9);
            }
        }
        this.H.clear();
    }

    public void addView(View view, int n8, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, n8, layoutParams);
        if (this.m() == null && !this.B(view)) {
            d0.s0(view, 1);
        } else {
            d0.s0(view, 4);
        }
        if (!N) {
            d0.l0(view, this.a);
        }
    }

    void b() {
        if (!this.r) {
            long l8 = SystemClock.uptimeMillis();
            MotionEvent motionEvent = MotionEvent.obtain((long)l8, (long)l8, (int)3, (float)0.0f, (float)0.0f, (int)0);
            int n8 = this.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                this.getChildAt(i8).dispatchTouchEvent(motionEvent);
            }
            motionEvent.recycle();
            this.r = true;
        }
    }

    boolean c(View view, int n8) {
        return (this.r(view) & n8) == n8;
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int n8 = this.getChildCount();
        float f8 = 0.0f;
        for (int i8 = 0; i8 < n8; ++i8) {
            f8 = Math.max(f8, ((f)this.getChildAt((int)i8).getLayoutParams()).b);
        }
        this.e = f8;
        boolean bl = this.g.m(true);
        boolean bl2 = this.h.m(true);
        if (!bl && !bl2) {
            return;
        }
        d0.c0((View)this);
    }

    public void d(View view) {
        this.e(view, true);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && !(this.e <= 0.0f)) {
            int n8 = this.getChildCount();
            if (n8 != 0) {
                float f8 = motionEvent.getX();
                float f9 = motionEvent.getY();
                --n8;
                while (n8 >= 0) {
                    View view = this.getChildAt(n8);
                    if (this.D(f8, f9, view) && !this.z(view) && this.k(motionEvent, view)) {
                        return true;
                    }
                    --n8;
                }
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    protected boolean drawChild(Canvas canvas, View view, long l8) {
        int n8;
        int n9 = this.getHeight();
        boolean bl = this.z(view);
        int n10 = this.getWidth();
        int n11 = canvas.save();
        int n12 = 0;
        int n13 = n10;
        if (bl) {
            int n14 = this.getChildCount();
            n13 = 0;
            for (n12 = 0; n12 < n14; ++n12) {
                View view2 = this.getChildAt(n12);
                n8 = n10;
                int n15 = n13;
                if (view2 != view) {
                    n8 = n10;
                    n15 = n13;
                    if (view2.getVisibility() == 0) {
                        n8 = n10;
                        n15 = n13;
                        if (DrawerLayout.v(view2)) {
                            n8 = n10;
                            n15 = n13;
                            if (this.B(view2)) {
                                int n16;
                                if (view2.getHeight() < n9) {
                                    n8 = n10;
                                    n15 = n13;
                                } else if (this.c(view2, 3)) {
                                    n16 = view2.getRight();
                                    n8 = n10;
                                    n15 = n13;
                                    if (n16 > n13) {
                                        n15 = n16;
                                        n8 = n10;
                                    }
                                } else {
                                    n16 = view2.getLeft();
                                    n8 = n10;
                                    n15 = n13;
                                    if (n16 < n10) {
                                        n8 = n16;
                                        n15 = n13;
                                    }
                                }
                            }
                        }
                    }
                }
                n10 = n8;
                n13 = n15;
            }
            canvas.clipRect(n13, 0, n10, this.getHeight());
            n12 = n13;
            n13 = n10;
        }
        boolean bl2 = super.drawChild(canvas, view, l8);
        canvas.restoreToCount(n11);
        float f8 = this.e;
        if (f8 > 0.0f && bl) {
            n10 = this.d;
            n8 = (int)((float)((0xFF000000 & n10) >>> 24) * f8);
            this.f.setColor(n10 & 0xFFFFFF | n8 << 24);
            canvas.drawRect((float)n12, 0.0f, (float)n13, (float)this.getHeight(), this.f);
            return bl2;
        }
        if (this.x != null && this.c(view, 3)) {
            n10 = this.x.getIntrinsicWidth();
            n12 = view.getRight();
            n13 = this.g.x();
            f8 = Math.max(0.0f, Math.min((float)n12 / (float)n13, 1.0f));
            this.x.setBounds(n12, view.getTop(), n10 + n12, view.getBottom());
            this.x.setAlpha((int)(f8 * 255.0f));
            this.x.draw(canvas);
            return bl2;
        }
        if (this.y != null && this.c(view, 5)) {
            n8 = this.y.getIntrinsicWidth();
            n10 = view.getLeft();
            n12 = this.getWidth();
            n13 = this.h.x();
            f8 = Math.max(0.0f, Math.min((float)(n12 - n10) / (float)n13, 1.0f));
            this.y.setBounds(n10 - n8, view.getTop(), n10, view.getBottom());
            this.y.setAlpha((int)(f8 * 255.0f));
            this.y.draw(canvas);
        }
        return bl2;
    }

    public void e(View view, boolean bl) {
        if (this.B(view)) {
            f f8 = (f)view.getLayoutParams();
            if (this.m) {
                f8.b = 0.0f;
                f8.d = 0;
            } else if (bl) {
                f8.d |= 4;
                if (this.c(view, 3)) {
                    this.g.Q(view, -view.getWidth(), view.getTop());
                } else {
                    this.h.Q(view, this.getWidth(), view.getTop());
                }
            } else {
                this.F(view, 0.0f);
                this.R(0, view);
                view.setVisibility(4);
            }
            this.invalidate();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a sliding drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void f() {
        this.g(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    void g(boolean bl) {
        int n8 = this.getChildCount();
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = this.getChildAt(i8);
            f f8 = (f)view.getLayoutParams();
            int n10 = n9;
            if (this.B(view)) {
                if (bl && !f8.c) {
                    n10 = n9;
                } else {
                    n10 = view.getWidth();
                    int n11 = (this.c(view, 3) ? this.g.Q(view, -n10, view.getTop()) : this.h.Q(view, this.getWidth(), view.getTop())) ? 1 : 0;
                    n10 = n9 | n11;
                    f8.c = false;
                }
            }
            n9 = n10;
        }
        this.i.p();
        this.j.p();
        if (n9 != 0) {
            this.invalidate();
        }
    }

    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(this.getContext(), attributeSet);
    }

    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f)layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams)layoutParams);
        }
        return new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (O) {
            return this.b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.w;
    }

    void h(View view) {
        Object object = (f)view.getLayoutParams();
        if ((((f)((Object)object)).d & 1) == 1) {
            ((f)((Object)object)).d = 0;
            object = this.t;
            if (object != null) {
                for (int i8 = object.size() - 1; i8 >= 0; --i8) {
                    this.t.get(i8).b(view);
                }
            }
            this.Q(view, false);
            this.P(view);
            if (this.hasWindowFocus() && (view = this.getRootView()) != null) {
                view.sendAccessibilityEvent(32);
            }
        }
    }

    void i(View view) {
        Object object = (f)view.getLayoutParams();
        if ((((f)((Object)object)).d & 1) == 0) {
            ((f)((Object)object)).d = 1;
            object = this.t;
            if (object != null) {
                for (int i8 = object.size() - 1; i8 >= 0; --i8) {
                    this.t.get(i8).a(view);
                }
            }
            this.Q(view, true);
            this.P(view);
            if (this.hasWindowFocus()) {
                this.sendAccessibilityEvent(32);
            }
        }
    }

    void j(View view, float f8) {
        List<e> list = this.t;
        if (list != null) {
            for (int i8 = list.size() - 1; i8 >= 0; --i8) {
                this.t.get(i8).d(view, f8);
            }
        }
    }

    View l(int n8) {
        int n9 = ax.c0.t.b(n8, d0.B((View)this));
        int n10 = this.getChildCount();
        for (n8 = 0; n8 < n10; ++n8) {
            View view = this.getChildAt(n8);
            if ((this.r(view) & 7) != (n9 & 7)) continue;
            return view;
        }
        return null;
    }

    View m() {
        int n8 = this.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = this.getChildAt(i8);
            if ((((f)view.getLayoutParams()).d & 1) != 1) continue;
            return view;
        }
        return null;
    }

    View n() {
        int n8 = this.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = this.getChildAt(i8);
            if (!this.B(view) || !this.C(view)) continue;
            return view;
        }
        return null;
    }

    public int o(int n8) {
        int n9 = d0.B((View)this);
        if (n8 != 3) {
            if (n8 != 5) {
                if (n8 != 0x800003) {
                    if (n8 == 0x800005) {
                        n8 = this.q;
                        if (n8 != 3) {
                            return n8;
                        }
                        n8 = n9 == 0 ? this.o : this.n;
                        if (n8 != 3) {
                            return n8;
                        }
                    }
                } else {
                    n8 = this.p;
                    if (n8 != 3) {
                        return n8;
                    }
                    n8 = n9 == 0 ? this.n : this.o;
                    if (n8 != 3) {
                        return n8;
                    }
                }
            } else {
                n8 = this.o;
                if (n8 != 3) {
                    return n8;
                }
                n8 = n9 == 0 ? this.q : this.p;
                if (n8 != 3) {
                    return n8;
                }
            }
        } else {
            n8 = this.n;
            if (n8 != 3) {
                return n8;
            }
            n8 = n9 == 0 ? this.p : this.q;
            if (n8 != 3) {
                return n8;
            }
        }
        return 0;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m = true;
    }

    public void onDraw(Canvas canvas) {
        Object object;
        int n8;
        super.onDraw(canvas);
        if (this.C && this.w != null && (n8 = (object = this.B) != null ? ((WindowInsets)object).getSystemWindowInsetTop() : 0) > 0) {
            this.w.setBounds(0, 0, this.getWidth(), n8);
            this.w.draw(canvas);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean bl;
        boolean bl2;
        int n8;
        block6: {
            block2: {
                block5: {
                    block3: {
                        block4: {
                            n8 = motionEvent.getActionMasked();
                            bl2 = this.g.P(motionEvent);
                            bl = this.h.P(motionEvent);
                            if (n8 == 0) break block2;
                            if (n8 == 1) break block3;
                            if (n8 == 2) break block4;
                            if (n8 == 3) break block3;
                            break block5;
                        }
                        if (this.g.d(3)) {
                            this.i.p();
                            this.j.p();
                        }
                        break block5;
                    }
                    this.g(true);
                    this.r = false;
                }
                n8 = 0;
                break block6;
            }
            float f8 = motionEvent.getX();
            float f9 = motionEvent.getY();
            this.u = f8;
            this.v = f9;
            n8 = this.e > 0.0f && (motionEvent = this.g.t((int)f8, (int)f9)) != null && this.z((View)motionEvent) ? 1 : 0;
            this.r = false;
        }
        return bl2 | bl || n8 != 0 || this.w() || this.r;
        {
        }
    }

    public boolean onKeyDown(int n8, KeyEvent keyEvent) {
        if (n8 == 4 && this.x()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(n8, keyEvent);
    }

    public boolean onKeyUp(int n8, KeyEvent keyEvent) {
        if (n8 == 4) {
            keyEvent = this.n();
            if (keyEvent != null && this.p((View)keyEvent) == 0) {
                this.f();
            }
            return keyEvent != null;
        }
        return super.onKeyUp(n8, keyEvent);
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        Object object;
        Object object2;
        this.l = true;
        int n12 = n10 - n8;
        int n13 = this.getChildCount();
        for (n10 = 0; n10 < n13; ++n10) {
            int n14;
            float f8;
            object2 = this.getChildAt(n10);
            if (object2.getVisibility() == 8) continue;
            object = (f)object2.getLayoutParams();
            if (this.z((View)object2)) {
                n8 = ((ViewGroup.MarginLayoutParams)object).leftMargin;
                object2.layout(n8, ((ViewGroup.MarginLayoutParams)object).topMargin, object2.getMeasuredWidth() + n8, ((ViewGroup.MarginLayoutParams)object).topMargin + object2.getMeasuredHeight());
                continue;
            }
            int n15 = object2.getMeasuredWidth();
            int n16 = object2.getMeasuredHeight();
            if (this.c((View)object2, 3)) {
                n8 = -n15;
                f8 = n15;
                n14 = n8 + (int)(((f)((Object)object)).b * f8);
                f8 = (float)(n15 + n14) / f8;
            } else {
                f8 = n15;
                n14 = n12 - (int)(((f)((Object)object)).b * f8);
                f8 = (float)(n12 - n14) / f8;
            }
            boolean bl2 = f8 != ((f)((Object)object)).b;
            n8 = ((f)((Object)object)).a & 0x70;
            if (n8 != 16) {
                if (n8 != 80) {
                    n8 = ((ViewGroup.MarginLayoutParams)object).topMargin;
                    object2.layout(n14, n8, n15 + n14, n16 + n8);
                } else {
                    n8 = n11 - n9;
                    object2.layout(n14, n8 - ((ViewGroup.MarginLayoutParams)object).bottomMargin - object2.getMeasuredHeight(), n15 + n14, n8 - ((ViewGroup.MarginLayoutParams)object).bottomMargin);
                }
            } else {
                int n17 = n11 - n9;
                int n18 = (n17 - n16) / 2;
                n8 = ((ViewGroup.MarginLayoutParams)object).topMargin;
                if (n18 >= n8) {
                    int n19 = ((ViewGroup.MarginLayoutParams)object).bottomMargin;
                    n8 = n18;
                    if (n18 + n16 > n17 - n19) {
                        n8 = n17 - n19 - n16;
                    }
                }
                object2.layout(n14, n8, n15 + n14, n16 + n8);
            }
            if (bl2) {
                this.O((View)object2, f8);
            }
            n8 = ((f)((Object)object)).b > 0.0f ? 0 : 4;
            if (object2.getVisibility() == n8) continue;
            object2.setVisibility(n8);
        }
        if (P && (object2 = ax.t0.a.a(this)) != null) {
            object2 = F0.v((WindowInsets)object2).h();
            object = this.g;
            ((ax.l0.c)object).L(Math.max(((ax.l0.c)object).w(), object2.a));
            object = this.h;
            ((ax.l0.c)object).L(Math.max(((ax.l0.c)object).w(), object2.c));
        }
        this.l = false;
        this.m = false;
    }

    @SuppressLint(value={"WrongConstant"})
    protected void onMeasure(int n8, int n9) {
        block23: {
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            block22: {
                block21: {
                    n15 = View.MeasureSpec.getMode((int)n8);
                    n14 = View.MeasureSpec.getMode((int)n9);
                    n13 = View.MeasureSpec.getSize((int)n8);
                    n12 = View.MeasureSpec.getSize((int)n9);
                    if (n15 != 0x40000000) break block21;
                    n11 = n13;
                    n10 = n12;
                    if (n14 == 0x40000000) break block22;
                }
                if (!this.isInEditMode()) break block23;
                if (n15 == 0) {
                    n13 = 300;
                }
                n11 = n13;
                n10 = n12;
                if (n14 == 0) {
                    n10 = 300;
                    n11 = n13;
                }
            }
            this.setMeasuredDimension(n11, n10);
            n14 = this.B != null && d0.y((View)this) ? 1 : 0;
            int n16 = d0.B((View)this);
            int n17 = this.getChildCount();
            n12 = 0;
            n13 = 0;
            for (n15 = 0; n15 < n17; ++n15) {
                StringBuilder stringBuilder;
                int n18;
                View view = this.getChildAt(n15);
                if (view.getVisibility() == 8) continue;
                f f8 = (f)view.getLayoutParams();
                if (n14 != 0) {
                    WindowInsets windowInsets;
                    n18 = ax.c0.t.b(f8.a, n16);
                    if (d0.y(view)) {
                        windowInsets = (WindowInsets)this.B;
                        if (n18 == 3) {
                            stringBuilder = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else {
                            stringBuilder = windowInsets;
                            if (n18 == 5) {
                                stringBuilder = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                        }
                        view.dispatchApplyWindowInsets((WindowInsets)stringBuilder);
                    } else {
                        windowInsets = (WindowInsets)this.B;
                        if (n18 == 3) {
                            stringBuilder = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else {
                            stringBuilder = windowInsets;
                            if (n18 == 5) {
                                stringBuilder = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                        }
                        f8.leftMargin = stringBuilder.getSystemWindowInsetLeft();
                        f8.topMargin = stringBuilder.getSystemWindowInsetTop();
                        f8.rightMargin = stringBuilder.getSystemWindowInsetRight();
                        f8.bottomMargin = stringBuilder.getSystemWindowInsetBottom();
                    }
                }
                if (this.z(view)) {
                    view.measure(View.MeasureSpec.makeMeasureSpec((int)(n11 - f8.leftMargin - f8.rightMargin), (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)(n10 - f8.topMargin - f8.bottomMargin), (int)0x40000000));
                    continue;
                }
                if (this.B(view)) {
                    int n19;
                    float f9;
                    float f10;
                    if (O && (f10 = d0.v(view)) != (f9 = this.b)) {
                        d0.r0(view, f9);
                    }
                    if ((n18 = (n19 = this.r(view) & 7) == 3 ? 1 : 0) != 0 && n12 != 0 || n18 == 0 && n13 != 0) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Child drawer has absolute gravity ");
                        stringBuilder.append(DrawerLayout.u(n19));
                        stringBuilder.append(" but this ");
                        stringBuilder.append("DrawerLayout");
                        stringBuilder.append(" already has a drawer view along that edge");
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    if (n18 != 0) {
                        n12 = 1;
                    } else {
                        n13 = 1;
                    }
                    view.measure(ViewGroup.getChildMeasureSpec((int)n8, (int)(this.c + f8.leftMargin + f8.rightMargin), (int)f8.width), ViewGroup.getChildMeasureSpec((int)n9, (int)(f8.topMargin + f8.bottomMargin), (int)f8.height));
                    continue;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Child ");
                stringBuilder.append(view);
                stringBuilder.append(" at index ");
                stringBuilder.append(n15);
                stringBuilder.append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                throw new IllegalStateException(stringBuilder.toString());
            }
            return;
        }
        throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        View view;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (g)parcelable;
        super.onRestoreInstanceState(parcelable.a());
        int n8 = parcelable.d0;
        if (n8 != 0 && (view = this.l(n8)) != null) {
            this.G(view);
        }
        if ((n8 = parcelable.e0) != 3) {
            this.N(n8, 3);
        }
        if ((n8 = parcelable.f0) != 3) {
            this.N(n8, 5);
        }
        if ((n8 = parcelable.g0) != 3) {
            this.N(n8, 0x800003);
        }
        if ((n8 = parcelable.h0) != 3) {
            this.N(n8, 0x800005);
        }
    }

    public void onRtlPropertiesChanged(int n8) {
        this.L();
    }

    protected Parcelable onSaveInstanceState() {
        g g8 = new g(super.onSaveInstanceState());
        int n8 = this.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            f f8 = (f)this.getChildAt(i8).getLayoutParams();
            int n9 = f8.d;
            boolean bl = true;
            boolean bl2 = n9 == 1;
            if (n9 != 2) {
                bl = false;
            }
            if (!bl2 && !bl) {
                continue;
            }
            g8.d0 = f8.a;
            break;
        }
        g8.e0 = this.n;
        g8.f0 = this.o;
        g8.g0 = this.p;
        g8.h0 = this.q;
        return g8;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.g.F(motionEvent);
        this.h.F(motionEvent);
        int n8 = motionEvent.getAction() & 0xFF;
        boolean bl = false;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 == 3) {
                    this.g(true);
                    this.r = false;
                }
            } else {
                float f8;
                float f9 = motionEvent.getX();
                if ((motionEvent = this.g.t((int)f9, (int)(f8 = motionEvent.getY()))) == null || !this.z((View)motionEvent) || !((f9 -= this.u) * f9 + (f8 -= this.v) * f8 < (float)((n8 = this.g.z()) * n8)) || (motionEvent = this.m()) == null || this.p((View)motionEvent) == 2) {
                    bl = true;
                }
                this.g(bl);
            }
        } else {
            float f10 = motionEvent.getX();
            float f11 = motionEvent.getY();
            this.u = f10;
            this.v = f11;
            this.r = false;
        }
        return true;
    }

    public int p(View view) {
        if (this.B(view)) {
            return this.o(((f)view.getLayoutParams()).a);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public CharSequence q(int n8) {
        if ((n8 = ax.c0.t.b(n8, d0.B((View)this))) == 3) {
            return this.z;
        }
        if (n8 == 5) {
            return this.A;
        }
        return null;
    }

    int r(View view) {
        return ax.c0.t.b(((f)view.getLayoutParams()).a, d0.B((View)this));
    }

    public void requestDisallowInterceptTouchEvent(boolean bl) {
        super.requestDisallowInterceptTouchEvent(bl);
        if (bl) {
            this.g(true);
        }
    }

    public void requestLayout() {
        if (!this.l) {
            super.requestLayout();
        }
    }

    float s(View view) {
        return ((f)view.getLayoutParams()).b;
    }

    public void setDrawerElevation(float f8) {
        this.b = f8;
        for (int i8 = 0; i8 < this.getChildCount(); ++i8) {
            View view = this.getChildAt(i8);
            if (!this.B(view)) continue;
            d0.r0(view, this.b);
        }
    }

    @Deprecated
    public void setDrawerListener(e e8) {
        e e9 = this.s;
        if (e9 != null) {
            this.I(e9);
        }
        if (e8 != null) {
            this.a(e8);
        }
        this.s = e8;
    }

    public void setDrawerLockMode(int n8) {
        this.N(n8, 3);
        this.N(n8, 5);
    }

    public void setScrimColor(int n8) {
        this.d = n8;
        this.invalidate();
    }

    public void setStatusBarBackground(int n8) {
        Drawable drawable = n8 != 0 ? ax.Q.b.e(this.getContext(), n8) : null;
        this.w = drawable;
        this.invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.w = drawable;
        this.invalidate();
    }

    public void setStatusBarBackgroundColor(int n8) {
        this.w = new ColorDrawable(n8);
        this.invalidate();
    }

    boolean z(View view) {
        return ((f)view.getLayoutParams()).a == 0;
    }

    class c
    extends ax.c0.a {
        private final Rect d;
        final DrawerLayout e;

        c(DrawerLayout drawerLayout) {
            this.e = drawerLayout;
            this.d = new Rect();
        }

        private void n(H h8, ViewGroup viewGroup) {
            int n8 = viewGroup.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                View view = viewGroup.getChildAt(i8);
                if (!DrawerLayout.y(view)) continue;
                h8.c(view);
            }
        }

        private void o(H h8, H h9) {
            Rect rect = this.d;
            h9.n(rect);
            h8.j0(rect);
            h8.O0(h9.Y());
            h8.A0(h9.y());
            h8.m0(h9.q());
            h8.q0(h9.t());
            h8.s0(h9.N());
            h8.v0(h9.P());
            h8.g0(h9.I());
            h8.H0(h9.V());
            h8.a(h9.k());
        }

        @Override
        public boolean a(View object, AccessibilityEvent object2) {
            if (object2.getEventType() == 32) {
                int n8;
                object = object2.getText();
                object2 = this.e.n();
                if (object2 != null && (object2 = this.e.q(n8 = this.e.r((View)object2))) != null) {
                    object.add(object2);
                }
                return true;
            }
            return super.a((View)object, (AccessibilityEvent)object2);
        }

        @Override
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName((CharSequence)"androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override
        public void g(View view, H h8) {
            if (N) {
                super.g(view, h8);
            } else {
                H h9 = ax.d0.H.b0(h8);
                super.g(view, h9);
                h8.J0(view);
                ViewParent viewParent = d0.F(view);
                if (viewParent instanceof View) {
                    h8.C0((View)viewParent);
                }
                this.o(h8, h9);
                h9.d0();
                this.n(h8, (ViewGroup)view);
            }
            h8.m0("androidx.drawerlayout.widget.DrawerLayout");
            h8.u0(false);
            h8.v0(false);
            h8.e0(H.a.e);
            h8.e0(H.a.f);
        }

        @Override
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!N && !DrawerLayout.y(view)) {
                return false;
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }
    }

    static final class d
    extends ax.c0.a {
        d() {
        }

        @Override
        public void g(View view, H h8) {
            super.g(view, h8);
            if (!DrawerLayout.y(view)) {
                h8.C0(null);
            }
        }
    }

    public static interface e {
        public void a(View var1);

        public void b(View var1);

        public void c(int var1);

        public void d(View var1, float var2);
    }

    public static class f
    extends ViewGroup.MarginLayoutParams {
        public int a = 0;
        float b;
        boolean c;
        int d;

        public f(int n8, int n9) {
            super(n8, n9);
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, M);
            this.a = context.getInt(0, 0);
            context.recycle();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(f f8) {
            super((ViewGroup.MarginLayoutParams)f8);
            this.a = f8.a;
        }
    }

    protected static class g
    extends ax.k0.a {
        public static final Parcelable.Creator<g> CREATOR = new Parcelable.ClassLoaderCreator<g>(){

            public g a(Parcel parcel) {
                return new g(parcel, null);
            }

            public g b(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            public g[] c(int n8) {
                return new g[n8];
            }
        };
        int d0 = 0;
        int e0;
        int f0;
        int g0;
        int h0;

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d0 = parcel.readInt();
            this.e0 = parcel.readInt();
            this.f0 = parcel.readInt();
            this.g0 = parcel.readInt();
            this.h0 = parcel.readInt();
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override
        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeInt(this.d0);
            parcel.writeInt(this.e0);
            parcel.writeInt(this.f0);
            parcel.writeInt(this.g0);
            parcel.writeInt(this.h0);
        }
    }

    private class h
    extends c.c {
        private final int a;
        private ax.l0.c b;
        private final Runnable c;
        final DrawerLayout d;

        h(DrawerLayout drawerLayout, int n8) {
            this.d = drawerLayout;
            this.c = new Runnable(this){
                final h q;
                {
                    this.q = h8;
                }

                @Override
                public void run() {
                    this.q.o();
                }
            };
            this.a = n8;
        }

        private void n() {
            View view;
            int n8 = this.a;
            int n9 = 3;
            if (n8 == 3) {
                n9 = 5;
            }
            if ((view = this.d.l(n9)) != null) {
                this.d.d(view);
            }
        }

        @Override
        public int a(View view, int n8, int n9) {
            if (this.d.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(n8, 0));
            }
            n9 = this.d.getWidth();
            return Math.max(n9 - view.getWidth(), Math.min(n8, n9));
        }

        @Override
        public int b(View view, int n8, int n9) {
            return view.getTop();
        }

        @Override
        public int d(View view) {
            if (this.d.B(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override
        public void f(int n8, int n9) {
            View view = (n8 & 1) == 1 ? this.d.l(3) : this.d.l(5);
            if (view != null && this.d.p(view) == 0) {
                this.b.b(view, n9);
            }
        }

        @Override
        public boolean g(int n8) {
            return false;
        }

        @Override
        public void h(int n8, int n9) {
            this.d.postDelayed(this.c, 160L);
        }

        @Override
        public void i(View view, int n8) {
            ((f)view.getLayoutParams()).c = false;
            this.n();
        }

        @Override
        public void j(int n8) {
            this.d.R(n8, this.b.v());
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public void k(View view, int n8, int n9, int n10, int n11) {
            n9 = view.getWidth();
            float f8 = this.d.c(view, 3) ? (float)(n8 + n9) : (float)(this.d.getWidth() - n8);
            this.d.O(view, f8 /= (float)n9);
            n8 = f8 == 0.0f ? 4 : 0;
            view.setVisibility(n8);
            this.d.invalidate();
        }

        @Override
        public void l(View view, float f8, float f9) {
            float f10;
            block4: {
                int n8;
                int n9;
                block5: {
                    block3: {
                        f9 = this.d.s(view);
                        n9 = view.getWidth();
                        if (!this.d.c(view, 3)) break block3;
                        float f11 = f8 - 0.0f;
                        f10 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                        f10 = !(f10 > 0 || f10 == false && f9 > 0.5f) ? (float)(-n9) : 0.0f;
                        break block4;
                    }
                    n8 = this.d.getWidth();
                    if (f8 < 0.0f) break block5;
                    f10 = n8;
                    if (f8 != 0.0f) break block4;
                    f10 = n8;
                    if (!(f9 > 0.5f)) break block4;
                }
                f10 = n8 - n9;
            }
            this.b.O((int)f10, view.getTop());
            this.d.invalidate();
        }

        @Override
        public boolean m(View view, int n8) {
            return this.d.B(view) && this.d.c(view, this.a) && this.d.p(view) == 0;
        }

        void o() {
            View view;
            int n8 = this.b.x();
            int n9 = this.a;
            int n10 = 0;
            if ((n9 = n9 == 3 ? 1 : 0) != 0) {
                view = this.d.l(3);
                if (view != null) {
                    n10 = -view.getWidth();
                }
                n10 += n8;
            } else {
                view = this.d.l(5);
                n10 = this.d.getWidth() - n8;
            }
            if (view != null && (n9 != 0 && view.getLeft() < n10 || n9 == 0 && view.getLeft() > n10) && this.d.p(view) == 0) {
                f f8 = (f)view.getLayoutParams();
                this.b.Q(view, n10, view.getTop());
                f8.c = true;
                this.d.invalidate();
                this.n();
                this.d.b();
            }
        }

        public void p() {
            this.d.removeCallbacks(this.c);
        }

        public void q(ax.l0.c c8) {
            this.b = c8;
        }
    }
}

