package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
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
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import ax.c0.C1753a;
import ax.c0.C1760d0;
import ax.c0.C1790t;
import ax.d0.H;
import ax.d0.M;
import ax.k0.AbstractC2357a;
import ax.l0.c;
import ax.s0.C3040a;
import ax.s0.C3041b;
import ax.s0.C3042c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    private static final int[] L = {R.attr.colorPrimaryDark};
    static final int[] M = {R.attr.layout_gravity};
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

    class a implements M {
        a() {
        }

        @Override // ax.d0.M
        public boolean a(View view, M.a aVar) {
            if (!DrawerLayout.this.A(view) || DrawerLayout.this.p(view) == 2) {
                return false;
            }
            DrawerLayout.this.d(view);
            return true;
        }
    }

    class b implements View.OnApplyWindowInsetsListener {
        b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).M(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class c extends C1753a {
        private final Rect d = new Rect();

        c() {
        }

        private void n(H h, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.y(childAt)) {
                    h.c(childAt);
                }
            }
        }

        private void o(H h, H h2) {
            Rect rect = this.d;
            h2.n(rect);
            h.j0(rect);
            h.O0(h2.Y());
            h.A0(h2.y());
            h.m0(h2.q());
            h.q0(h2.t());
            h.s0(h2.N());
            h.v0(h2.P());
            h.g0(h2.I());
            h.H0(h2.V());
            h.a(h2.k());
        }

        @Override // ax.c0.C1753a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View n = DrawerLayout.this.n();
            if (n == null) {
                return true;
            }
            CharSequence q = DrawerLayout.this.q(DrawerLayout.this.r(n));
            if (q == null) {
                return true;
            }
            text.add(q);
            return true;
        }

        @Override // ax.c0.C1753a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // ax.c0.C1753a
        public void g(View view, H h) {
            if (DrawerLayout.N) {
                super.g(view, h);
            } else {
                H b0 = H.b0(h);
                super.g(view, b0);
                h.J0(view);
                Object F = C1760d0.F(view);
                if (F instanceof View) {
                    h.C0((View) F);
                }
                o(h, b0);
                b0.d0();
                n(h, (ViewGroup) view);
            }
            h.m0("androidx.drawerlayout.widget.DrawerLayout");
            h.u0(false);
            h.v0(false);
            h.e0(H.a.e);
            h.e0(H.a.f);
        }

        @Override // ax.c0.C1753a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.N || DrawerLayout.y(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static final class d extends C1753a {
        d() {
        }

        @Override // ax.c0.C1753a
        public void g(View view, H h) {
            super.g(view, h);
            if (DrawerLayout.y(view)) {
                return;
            }
            h.C0(null);
        }
    }

    public interface e {
        void a(View view);

        void b(View view);

        void c(int i);

        void d(View view, float f);
    }

    private class h extends c.AbstractC0359c {
        private final int a;
        private ax.l0.c b;
        private final Runnable c = new a();

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.o();
            }
        }

        h(int i) {
            this.a = i;
        }

        private void n() {
            View l = DrawerLayout.this.l(this.a == 3 ? 5 : 3);
            if (l != null) {
                DrawerLayout.this.d(l);
            }
        }

        @Override // ax.l0.c.AbstractC0359c
        public int a(View view, int i, int i2) {
            if (DrawerLayout.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // ax.l0.c.AbstractC0359c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // ax.l0.c.AbstractC0359c
        public int d(View view) {
            if (DrawerLayout.this.B(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // ax.l0.c.AbstractC0359c
        public void f(int i, int i2) {
            View l = (i & 1) == 1 ? DrawerLayout.this.l(3) : DrawerLayout.this.l(5);
            if (l == null || DrawerLayout.this.p(l) != 0) {
                return;
            }
            this.b.b(l, i2);
        }

        @Override // ax.l0.c.AbstractC0359c
        public boolean g(int i) {
            return false;
        }

        @Override // ax.l0.c.AbstractC0359c
        public void h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.c, 160L);
        }

        @Override // ax.l0.c.AbstractC0359c
        public void i(View view, int i) {
            ((f) view.getLayoutParams()).c = false;
            n();
        }

        @Override // ax.l0.c.AbstractC0359c
        public void j(int i) {
            DrawerLayout.this.R(i, this.b.v());
        }

        @Override // ax.l0.c.AbstractC0359c
        public void k(View view, int i, int i2, int i3, int i4) {
            float width = (DrawerLayout.this.c(view, 3) ? i + r3 : DrawerLayout.this.getWidth() - i) / view.getWidth();
            DrawerLayout.this.O(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // ax.l0.c.AbstractC0359c
        public void l(View view, float f, float f2) {
            int i;
            float s = DrawerLayout.this.s(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && s > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && s > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.b.O(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // ax.l0.c.AbstractC0359c
        public boolean m(View view, int i) {
            return DrawerLayout.this.B(view) && DrawerLayout.this.c(view, this.a) && DrawerLayout.this.p(view) == 0;
        }

        void o() {
            View l;
            int width;
            int x = this.b.x();
            boolean z = this.a == 3;
            if (z) {
                l = DrawerLayout.this.l(3);
                width = (l != null ? -l.getWidth() : 0) + x;
            } else {
                l = DrawerLayout.this.l(5);
                width = DrawerLayout.this.getWidth() - x;
            }
            if (l != null) {
                if (((!z || l.getLeft() >= width) && (z || l.getLeft() <= width)) || DrawerLayout.this.p(l) != 0) {
                    return;
                }
                f fVar = (f) l.getLayoutParams();
                this.b.Q(l, width, l.getTop());
                fVar.c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.c);
        }

        public void q(ax.l0.c cVar) {
            this.b = cVar;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        N = true;
        O = true;
        P = i >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3040a.a);
    }

    private boolean D(float f2, float f3, View view) {
        if (this.I == null) {
            this.I = new Rect();
        }
        view.getHitRect(this.I);
        return this.I.contains((int) f2, (int) f3);
    }

    private void E(Drawable drawable, int i) {
        if (drawable == null || !ax.U.a.h(drawable)) {
            return;
        }
        ax.U.a.m(drawable, i);
    }

    private Drawable J() {
        int B = C1760d0.B(this);
        if (B == 0) {
            Drawable drawable = this.D;
            if (drawable != null) {
                E(drawable, B);
                return this.D;
            }
        } else {
            Drawable drawable2 = this.E;
            if (drawable2 != null) {
                E(drawable2, B);
                return this.E;
            }
        }
        return this.F;
    }

    private Drawable K() {
        int B = C1760d0.B(this);
        if (B == 0) {
            Drawable drawable = this.E;
            if (drawable != null) {
                E(drawable, B);
                return this.E;
            }
        } else {
            Drawable drawable2 = this.D;
            if (drawable2 != null) {
                E(drawable2, B);
                return this.D;
            }
        }
        return this.G;
    }

    private void L() {
        if (O) {
            return;
        }
        this.x = J();
        this.y = K();
    }

    private void P(View view) {
        H.a aVar = H.a.y;
        C1760d0.f0(view, aVar.b());
        if (!A(view) || p(view) == 2) {
            return;
        }
        C1760d0.h0(view, aVar, null, this.K);
    }

    private void Q(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || B(childAt)) && !(z && childAt == view)) {
                C1760d0.s0(childAt, 4);
            } else {
                C1760d0.s0(childAt, 1);
            }
        }
    }

    private boolean k(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent t = t(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(t);
            t.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent t(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.J == null) {
                this.J = new Matrix();
            }
            matrix.invert(this.J);
            obtain.transform(this.J);
        }
        return obtain;
    }

    static String u(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    private static boolean v(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean w() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((f) getChildAt(i).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }

    private boolean x() {
        return n() != null;
    }

    static boolean y(View view) {
        return (C1760d0.z(view) == 4 || C1760d0.z(view) == 2) ? false : true;
    }

    public boolean A(View view) {
        if (B(view)) {
            return (((f) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean B(View view) {
        int b2 = C1790t.b(((f) view.getLayoutParams()).a, C1760d0.B(view));
        return ((b2 & 3) == 0 && (b2 & 5) == 0) ? false : true;
    }

    public boolean C(View view) {
        if (B(view)) {
            return ((f) view.getLayoutParams()).b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void F(View view, float f2) {
        float s = s(view);
        float width = view.getWidth();
        int i = ((int) (width * f2)) - ((int) (s * width));
        if (!c(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        O(view, f2);
    }

    public void G(View view) {
        H(view, true);
    }

    public void H(View view, boolean z) {
        if (!B(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.m) {
            fVar.b = 1.0f;
            fVar.d = 1;
            Q(view, true);
            P(view);
        } else if (z) {
            fVar.d |= 2;
            if (c(view, 3)) {
                this.g.Q(view, 0, view.getTop());
            } else {
                this.h.Q(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            F(view, 1.0f);
            R(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void I(e eVar) {
        List<e> list;
        if (eVar == null || (list = this.t) == null) {
            return;
        }
        list.remove(eVar);
    }

    public void M(Object obj, boolean z) {
        this.B = obj;
        this.C = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void N(int i, int i2) {
        View l;
        int b2 = C1790t.b(i2, C1760d0.B(this));
        if (i2 == 3) {
            this.n = i;
        } else if (i2 == 5) {
            this.o = i;
        } else if (i2 == 8388611) {
            this.p = i;
        } else if (i2 == 8388613) {
            this.q = i;
        }
        if (i != 0) {
            (b2 == 3 ? this.g : this.h).a();
        }
        if (i != 1) {
            if (i == 2 && (l = l(b2)) != null) {
                G(l);
                return;
            }
            return;
        }
        View l2 = l(b2);
        if (l2 != null) {
            d(l2);
        }
    }

    void O(View view, float f2) {
        f fVar = (f) view.getLayoutParams();
        if (f2 == fVar.b) {
            return;
        }
        fVar.b = f2;
        j(view, f2);
    }

    void R(int i, View view) {
        int i2;
        int A = this.g.A();
        int A2 = this.h.A();
        if (A == 1 || A2 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (A != 2 && A2 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f2 = ((f) view.getLayoutParams()).b;
            if (f2 == 0.0f) {
                h(view);
            } else if (f2 == 1.0f) {
                i(view);
            }
        }
        if (i2 != this.k) {
            this.k = i2;
            List<e> list = this.t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.t.get(size).c(i2);
                }
            }
        }
    }

    public void a(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.t == null) {
            this.t = new ArrayList();
        }
        this.t.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!B(childAt)) {
                this.H.add(childAt);
            } else if (A(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
        }
        if (!z) {
            int size = this.H.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.H.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.H.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m() != null || B(view)) {
            C1760d0.s0(view, 4);
        } else {
            C1760d0.s0(view, 1);
        }
        if (N) {
            return;
        }
        C1760d0.l0(view, this.a);
    }

    void b() {
        if (this.r) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(obtain);
        }
        obtain.recycle();
        this.r = true;
    }

    boolean c(View view, int i) {
        return (r(view) & i) == i;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f2 = Math.max(f2, ((f) getChildAt(i).getLayoutParams()).b);
        }
        this.e = f2;
        boolean m = this.g.m(true);
        boolean m2 = this.h.m(true);
        if (m || m2) {
            C1760d0.c0(this);
        }
    }

    public void d(View view) {
        e(view, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (D(x, y, childAt) && !z(childAt) && k(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean z = z(view);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (z) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && v(childAt) && B(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f2 = this.e;
        if (f2 > 0.0f && z) {
            this.f.setColor((this.d & 16777215) | (((int) ((((-16777216) & r14) >>> 24) * f2)) << 24));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.f);
            return drawChild;
        }
        if (this.x != null && c(view, 3)) {
            int intrinsicWidth = this.x.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.g.x(), 1.0f));
            this.x.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.x.setAlpha((int) (max * 255.0f));
            this.x.draw(canvas);
            return drawChild;
        }
        if (this.y != null && c(view, 5)) {
            int intrinsicWidth2 = this.y.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.h.x(), 1.0f));
            this.y.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.y.setAlpha((int) (max2 * 255.0f));
            this.y.draw(canvas);
        }
        return drawChild;
    }

    public void e(View view, boolean z) {
        if (!B(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.m) {
            fVar.b = 0.0f;
            fVar.d = 0;
        } else if (z) {
            fVar.d |= 4;
            if (c(view, 3)) {
                this.g.Q(view, -view.getWidth(), view.getTop());
            } else {
                this.h.Q(view, getWidth(), view.getTop());
            }
        } else {
            F(view, 0.0f);
            R(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void f() {
        g(false);
    }

    void g(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            f fVar = (f) childAt.getLayoutParams();
            if (B(childAt) && (!z || fVar.c)) {
                z2 |= c(childAt, 3) ? this.g.Q(childAt, -childAt.getWidth(), childAt.getTop()) : this.h.Q(childAt, getWidth(), childAt.getTop());
                fVar.c = false;
            }
        }
        this.i.p();
        this.j.p();
        if (z2) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
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
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.d & 1) == 1) {
            fVar.d = 0;
            List<e> list = this.t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.t.get(size).b(view);
                }
            }
            Q(view, false);
            P(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void i(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.d & 1) == 0) {
            fVar.d = 1;
            List<e> list = this.t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.t.get(size).a(view);
                }
            }
            Q(view, true);
            P(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void j(View view, float f2) {
        List<e> list = this.t;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.t.get(size).d(view, f2);
            }
        }
    }

    View l(int i) {
        int b2 = C1790t.b(i, C1760d0.B(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((r(childAt) & 7) == b2) {
                return childAt;
            }
        }
        return null;
    }

    View m() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((f) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    View n() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (B(childAt) && C(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int o(int i) {
        int B = C1760d0.B(this);
        if (i == 3) {
            int i2 = this.n;
            if (i2 != 3) {
                return i2;
            }
            int i3 = B == 0 ? this.p : this.q;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 5) {
            int i4 = this.o;
            if (i4 != 3) {
                return i4;
            }
            int i5 = B == 0 ? this.q : this.p;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i == 8388611) {
            int i6 = this.p;
            if (i6 != 3) {
                return i6;
            }
            int i7 = B == 0 ? this.n : this.o;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i8 = this.q;
        if (i8 != 3) {
            return i8;
        }
        int i9 = B == 0 ? this.o : this.n;
        if (i9 != 3) {
            return i9;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.C || this.w == null) {
            return;
        }
        Object obj = this.B;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.w.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.w.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r0 != 3) goto L13;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            ax.l0.c r1 = r6.g
            boolean r1 = r1.P(r7)
            ax.l0.c r2 = r6.h
            boolean r2 = r2.P(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            ax.l0.c r7 = r6.g
            boolean r7 = r7.d(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$h r7 = r6.i
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$h r7 = r6.j
            r7.p()
            goto L36
        L31:
            r6.g(r2)
            r6.r = r3
        L36:
            r7 = 0
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.u = r0
            r6.v = r7
            float r4 = r6.e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            ax.l0.c r4 = r6.g
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.t(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.z(r7)
            if (r7 == 0) goto L5d
            r7 = 1
            goto L5e
        L5d:
            r7 = 0
        L5e:
            r6.r = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.w()
            if (r7 != 0) goto L70
            boolean r7 = r6.r
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            return r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !x()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View n = n();
        if (n != null && p(n) == 0) {
            f();
        }
        return n != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
    
        r1 = getRootWindowInsets();
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z = this.B != null && C1760d0.y(this);
        int B = C1760d0.B(this);
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z) {
                    int b2 = C1790t.b(fVar.a, B);
                    if (C1760d0.y(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.B;
                        if (b2 == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (b2 == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.B;
                        if (b2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (z(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else {
                    if (!B(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (O) {
                        float v = C1760d0.v(childAt);
                        float f2 = this.b;
                        if (v != f2) {
                            C1760d0.r0(childAt, f2);
                        }
                    }
                    int r = r(childAt) & 7;
                    boolean z4 = r == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + u(r) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.c + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View l;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        int i = gVar.d0;
        if (i != 0 && (l = l(i)) != null) {
            G(l);
        }
        int i2 = gVar.e0;
        if (i2 != 3) {
            N(i2, 3);
        }
        int i3 = gVar.f0;
        if (i3 != 3) {
            N(i3, 5);
        }
        int i4 = gVar.g0;
        if (i4 != 3) {
            N(i4, 8388611);
        }
        int i5 = gVar.h0;
        if (i5 != 3) {
            N(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        L();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            f fVar = (f) getChildAt(i).getLayoutParams();
            int i2 = fVar.d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                gVar.d0 = fVar.a;
                break;
            }
        }
        gVar.e0 = this.n;
        gVar.f0 = this.o;
        gVar.g0 = this.p;
        gVar.h0 = this.q;
        return gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (p(r7) != 2) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            ax.l0.c r0 = r6.g
            r0.F(r7)
            ax.l0.c r0 = r6.h
            r0.F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L70
        L1a:
            r6.g(r2)
            r6.r = r1
            goto L70
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            ax.l0.c r3 = r6.g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.t(r4, r5)
            if (r3 == 0) goto L5d
            boolean r3 = r6.z(r3)
            if (r3 == 0) goto L5d
            float r3 = r6.u
            float r0 = r0 - r3
            float r3 = r6.v
            float r7 = r7 - r3
            ax.l0.c r3 = r6.g
            int r3 = r3.z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5d
            android.view.View r7 = r6.m()
            if (r7 == 0) goto L5d
            int r7 = r6.p(r7)
            r0 = 2
            if (r7 != r0) goto L5e
        L5d:
            r1 = 1
        L5e:
            r6.g(r1)
            goto L70
        L62:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.u = r0
            r6.v = r7
            r6.r = r1
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public int p(View view) {
        if (B(view)) {
            return o(((f) view.getLayoutParams()).a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public CharSequence q(int i) {
        int b2 = C1790t.b(i, C1760d0.B(this));
        if (b2 == 3) {
            return this.z;
        }
        if (b2 == 5) {
            return this.A;
        }
        return null;
    }

    int r(View view) {
        return C1790t.b(((f) view.getLayoutParams()).a, C1760d0.B(this));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            g(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.l) {
            return;
        }
        super.requestLayout();
    }

    float s(View view) {
        return ((f) view.getLayoutParams()).b;
    }

    public void setDrawerElevation(float f2) {
        this.b = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (B(childAt)) {
                C1760d0.r0(childAt, this.b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.s;
        if (eVar2 != null) {
            I(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.s = eVar;
    }

    public void setDrawerLockMode(int i) {
        N(i, 3);
        N(i, 5);
    }

    public void setScrimColor(int i) {
        this.d = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.w = new ColorDrawable(i);
        invalidate();
    }

    boolean z(View view) {
        return ((f) view.getLayoutParams()).a == 0;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
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
        this.K = new a();
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.c = (int) ((64.0f * f2) + 0.5f);
        float f3 = f2 * 400.0f;
        h hVar = new h(3);
        this.i = hVar;
        h hVar2 = new h(5);
        this.j = hVar2;
        ax.l0.c n = ax.l0.c.n(this, 1.0f, hVar);
        this.g = n;
        n.M(1);
        n.N(f3);
        hVar.q(n);
        ax.l0.c n2 = ax.l0.c.n(this, 1.0f, hVar2);
        this.h = n2;
        n2.M(2);
        n2.N(f3);
        hVar2.q(n2);
        setFocusableInTouchMode(true);
        C1760d0.s0(this, 1);
        C1760d0.l0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (C1760d0.y(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(L);
            try {
                this.w = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C3042c.b, i, 0);
        try {
            int i2 = C3042c.c;
            if (obtainStyledAttributes2.hasValue(i2)) {
                this.b = obtainStyledAttributes2.getDimension(i2, 0.0f);
            } else {
                this.b = getResources().getDimension(C3041b.a);
            }
            obtainStyledAttributes2.recycle();
            this.H = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setStatusBarBackground(int i) {
        this.w = i != 0 ? ax.Q.b.e(getContext(), i) : null;
        invalidate();
    }

    public static class f extends ViewGroup.MarginLayoutParams {
        public int a;
        float b;
        boolean c;
        int d;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.M);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public f(int i, int i2) {
            super(i, i2);
            this.a = 0;
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.a = 0;
            this.a = fVar.a;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    protected static class g extends AbstractC2357a {
        public static final Parcelable.Creator<g> CREATOR = new a();
        int d0;
        int e0;
        int f0;
        int g0;
        int h0;

        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d0 = 0;
            this.d0 = parcel.readInt();
            this.e0 = parcel.readInt();
            this.f0 = parcel.readInt();
            this.g0 = parcel.readInt();
            this.h0 = parcel.readInt();
        }

        @Override // ax.k0.AbstractC2357a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d0);
            parcel.writeInt(this.e0);
            parcel.writeInt(this.f0);
            parcel.writeInt(this.g0);
            parcel.writeInt(this.h0);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
            this.d0 = 0;
        }
    }
}
