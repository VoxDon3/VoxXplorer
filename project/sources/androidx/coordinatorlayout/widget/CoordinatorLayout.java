package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import ax.b0.C1441b;
import ax.b0.C1445f;
import ax.b0.InterfaceC1443d;
import ax.c0.C1760d0;
import ax.c0.C1790t;
import ax.c0.F;
import ax.c0.F0;
import ax.c0.G;
import ax.c0.H;
import ax.c0.I;
import ax.k0.AbstractC2357a;
import j$.util.DesugarCollections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements F, G {
    static final String u;
    static final Class<?>[] v;
    static final ThreadLocal<Map<String, Constructor<c>>> w;
    static final Comparator<View> x;
    private static final InterfaceC1443d<Rect> y;
    private final List<View> a;
    private final ax.N.b<View> b;
    private final List<View> c;
    private final List<View> d;
    private Paint e;
    private final int[] f;
    private final int[] g;
    private boolean h;
    private boolean i;
    private int[] j;
    private View k;
    private View l;
    private g m;
    private boolean n;
    private F0 o;
    private boolean p;
    private Drawable q;
    ViewGroup.OnHierarchyChangeListener r;
    private I s;
    private final H t;

    class a implements I {
        a() {
        }

        @Override // ax.c0.I
        public F0 a(View view, F0 f0) {
            return CoordinatorLayout.this.W(f0);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable C(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean D(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return D(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        public void F(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void G(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                F(coordinatorLayout, v, view);
            }
        }

        public boolean H(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v) {
            return h(coordinatorLayout, v) > 0.0f;
        }

        public boolean f(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int g(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float h(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void k(f fVar) {
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void m(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void n() {
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean q(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean s(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        public void u(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                t(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void v(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void w(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                v(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        public void x(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            w(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        public void y(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public void z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                y(coordinatorLayout, v, view, view2, i);
            }
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public F0 j(CoordinatorLayout coordinatorLayout, V v, F0 f0) {
            return f0;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    static class i implements Comparator<View> {
        i() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float M = C1760d0.M(view);
            float M2 = C1760d0.M(view2);
            if (M > M2) {
                return -1;
            }
            return M < M2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        u = r0 != null ? r0.getName() : null;
        x = new i();
        v = new Class[]{Context.class, AttributeSet.class};
        w = new ThreadLocal<>();
        y = new C1445f(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.M.a.a);
    }

    private boolean A(View view) {
        return this.b.j(view);
    }

    private void C(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        Rect a2 = a();
        a2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.o != null && C1760d0.y(this) && !C1760d0.y(view)) {
            a2.left += this.o.j();
            a2.top += this.o.l();
            a2.right -= this.o.k();
            a2.bottom -= this.o.i();
        }
        Rect a3 = a();
        C1790t.a(S(fVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), a2, a3, i2);
        view.layout(a3.left, a3.top, a3.right, a3.bottom);
        O(a2);
        O(a3);
    }

    private void D(View view, View view2, int i2) {
        Rect a2 = a();
        Rect a3 = a();
        try {
            t(view2, a2);
            u(view, i2, a2, a3);
            view.layout(a3.left, a3.top, a3.right, a3.bottom);
        } finally {
            O(a2);
            O(a3);
        }
    }

    private void E(View view, int i2, int i3) {
        f fVar = (f) view.getLayoutParams();
        int b2 = C1790t.b(T(fVar.c), i3);
        int i4 = b2 & 7;
        int i5 = b2 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 == 1) {
            i2 = width - i2;
        }
        int w2 = w(i2) - measuredWidth;
        if (i4 == 1) {
            w2 += measuredWidth / 2;
        } else if (i4 == 5) {
            w2 += measuredWidth;
        }
        int i6 = i5 != 16 ? i5 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(w2, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void F(View view, Rect rect, int i2) {
        boolean z;
        boolean z2;
        int width;
        int i3;
        int i4;
        int i5;
        int height;
        int i6;
        int i7;
        int i8;
        if (C1760d0.R(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f2 = fVar.f();
            Rect a2 = a();
            Rect a3 = a();
            a3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f2 == null || !f2.f(this, view, a2)) {
                a2.set(a3);
            } else if (!a3.contains(a2)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a2.toShortString() + " | Bounds:" + a3.toShortString());
            }
            O(a3);
            if (a2.isEmpty()) {
                O(a2);
                return;
            }
            int b2 = C1790t.b(fVar.h, i2);
            boolean z3 = true;
            if ((b2 & 48) != 48 || (i7 = (a2.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.j) >= (i8 = rect.top)) {
                z = false;
            } else {
                V(view, i8 - i7);
                z = true;
            }
            if ((b2 & 80) == 80 && (height = ((getHeight() - a2.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.j) < (i6 = rect.bottom)) {
                V(view, height - i6);
                z = true;
            }
            if (!z) {
                V(view, 0);
            }
            if ((b2 & 3) != 3 || (i4 = (a2.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.i) >= (i5 = rect.left)) {
                z2 = false;
            } else {
                U(view, i5 - i4);
                z2 = true;
            }
            if ((b2 & 5) != 5 || (width = ((getWidth() - a2.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.i) >= (i3 = rect.right)) {
                z3 = z2;
            } else {
                U(view, width - i3);
            }
            if (!z3) {
                U(view, 0);
            }
            O(a2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = w;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    private boolean L(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.c;
        z(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            f fVar = (f) view.getLayoutParams();
            c f2 = fVar.f();
            if (!(z || z2) || actionMasked == 0) {
                if (!z && f2 != null) {
                    if (i2 == 0) {
                        z = f2.o(this, view, motionEvent);
                    } else if (i2 == 1) {
                        z = f2.H(this, view, motionEvent);
                    }
                    if (z) {
                        this.k = view;
                    }
                }
                boolean c2 = fVar.c();
                boolean i4 = fVar.i(this, view);
                z2 = i4 && !c2;
                if (i4 && !z2) {
                    break;
                }
            } else if (f2 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    f2.o(this, view, motionEvent2);
                } else if (i2 == 1) {
                    f2.H(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z;
    }

    private void M() {
        this.a.clear();
        this.b.c();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            f y2 = y(childAt);
            y2.d(this, childAt);
            this.b.b(childAt);
            for (int i3 = 0; i3 < childCount; i3++) {
                if (i3 != i2) {
                    View childAt2 = getChildAt(i3);
                    if (y2.b(this, childAt, childAt2)) {
                        if (!this.b.d(childAt2)) {
                            this.b.b(childAt2);
                        }
                        this.b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.a.addAll(this.b.i());
        Collections.reverse(this.a);
    }

    private static void O(Rect rect) {
        rect.setEmpty();
        y.a(rect);
    }

    private void Q(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c f2 = ((f) childAt.getLayoutParams()).f();
            if (f2 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    f2.o(this, childAt, obtain);
                } else {
                    f2.H(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).m();
        }
        this.k = null;
        this.h = false;
    }

    private static int R(int i2) {
        if (i2 == 0) {
            return 17;
        }
        return i2;
    }

    private static int S(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int T(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private void U(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.i;
        if (i3 != i2) {
            C1760d0.V(view, i2 - i3);
            fVar.i = i2;
        }
    }

    private void V(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.j;
        if (i3 != i2) {
            C1760d0.W(view, i2 - i3);
            fVar.j = i2;
        }
    }

    private void X() {
        if (!C1760d0.y(this)) {
            C1760d0.v0(this, null);
            return;
        }
        if (this.s == null) {
            this.s = new a();
        }
        C1760d0.v0(this, this.s);
        setSystemUiVisibility(1280);
    }

    private static Rect a() {
        Rect b2 = y.b();
        return b2 == null ? new Rect() : b2;
    }

    private static int d(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    private void g(f fVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    private F0 i(F0 f0) {
        c f2;
        if (f0.o()) {
            return f0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (C1760d0.y(childAt) && (f2 = ((f) childAt.getLayoutParams()).f()) != null) {
                f0 = f2.j(this, childAt, f0);
                if (f0.o()) {
                    return f0;
                }
            }
        }
        return f0;
    }

    private void v(View view, int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int b2 = C1790t.b(R(fVar.c), i2);
        int b3 = C1790t.b(S(fVar.d), i2);
        int i5 = b2 & 7;
        int i6 = b2 & 112;
        int i7 = b3 & 7;
        int i8 = b3 & 112;
        int width = i7 != 1 ? i7 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i8 != 16 ? i8 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i5 == 1) {
            width -= i3 / 2;
        } else if (i5 != 5) {
            width -= i3;
        }
        if (i6 == 16) {
            height -= i4 / 2;
        } else if (i6 != 80) {
            height -= i4;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    private int w(int i2) {
        int[] iArr = this.j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    private void z(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public boolean B(View view, int i2, int i3) {
        Rect a2 = a();
        t(view, a2);
        try {
            return a2.contains(i2, i3);
        } finally {
            O(a2);
        }
    }

    void G(View view, int i2) {
        c f2;
        f fVar = (f) view.getLayoutParams();
        if (fVar.k != null) {
            Rect a2 = a();
            Rect a3 = a();
            Rect a4 = a();
            t(fVar.k, a2);
            q(view, false, a3);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            v(view, i2, a2, a4, fVar, measuredWidth, measuredHeight);
            boolean z = (a4.left == a3.left && a4.top == a3.top) ? false : true;
            g(fVar, a4, measuredWidth, measuredHeight);
            int i3 = a4.left - a3.left;
            int i4 = a4.top - a3.top;
            if (i3 != 0) {
                C1760d0.V(view, i3);
            }
            if (i4 != 0) {
                C1760d0.W(view, i4);
            }
            if (z && (f2 = fVar.f()) != null) {
                f2.l(this, view, fVar.k);
            }
            O(a2);
            O(a3);
            O(a4);
        }
    }

    final void H(int i2) {
        boolean z;
        int B = C1760d0.B(this);
        int size = this.a.size();
        Rect a2 = a();
        Rect a3 = a();
        Rect a4 = a();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.a.get(i3);
            f fVar = (f) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (fVar.l == this.a.get(i4)) {
                        G(view, B);
                    }
                }
                q(view, true, a3);
                if (fVar.g != 0 && !a3.isEmpty()) {
                    int b2 = C1790t.b(fVar.g, B);
                    int i5 = b2 & 112;
                    if (i5 == 48) {
                        a2.top = Math.max(a2.top, a3.bottom);
                    } else if (i5 == 80) {
                        a2.bottom = Math.max(a2.bottom, getHeight() - a3.top);
                    }
                    int i6 = b2 & 7;
                    if (i6 == 3) {
                        a2.left = Math.max(a2.left, a3.right);
                    } else if (i6 == 5) {
                        a2.right = Math.max(a2.right, getWidth() - a3.left);
                    }
                }
                if (fVar.h != 0 && view.getVisibility() == 0) {
                    F(view, a2, B);
                }
                if (i2 != 2) {
                    x(view, a4);
                    if (!a4.equals(a3)) {
                        N(view, a3);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.a.get(i7);
                    f fVar2 = (f) view2.getLayoutParams();
                    c f2 = fVar2.f();
                    if (f2 != null && f2.i(this, view2, view)) {
                        if (i2 == 0 && fVar2.g()) {
                            fVar2.k();
                        } else {
                            if (i2 != 2) {
                                z = f2.l(this, view2, view);
                            } else {
                                f2.m(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                fVar2.p(z);
                            }
                        }
                    }
                }
            }
        }
        O(a2);
        O(a3);
        O(a4);
    }

    public void I(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.k;
        if (view2 != null) {
            D(view, view2, i2);
            return;
        }
        int i3 = fVar.e;
        if (i3 >= 0) {
            E(view, i3, i2);
        } else {
            C(view, i2);
        }
    }

    public void J(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    void N(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    void P() {
        if (this.i && this.m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        this.n = false;
    }

    final F0 W(F0 f0) {
        if (C1441b.a(this.o, f0)) {
            return f0;
        }
        this.o = f0;
        boolean z = false;
        boolean z2 = f0 != null && f0.l() > 0;
        this.p = z2;
        if (!z2 && getBackground() == null) {
            z = true;
        }
        setWillNotDraw(z);
        F0 i2 = i(f0);
        requestLayout();
        return i2;
    }

    @Override // ax.c0.G
    public void b(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c f2;
        int childCount = getChildCount();
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i6) && (f2 = fVar.f()) != null) {
                    int[] iArr2 = this.f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f2.x(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    int[] iArr3 = this.f;
                    i7 = i4 > 0 ? Math.max(i7, iArr3[0]) : Math.min(i7, iArr3[0]);
                    int[] iArr4 = this.f;
                    i8 = i5 > 0 ? Math.max(i8, iArr4[1]) : Math.min(i8, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z) {
            H(1);
        }
    }

    void c() {
        if (this.i) {
            if (this.m == null) {
                this.m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        this.n = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.a;
        if (cVar != null) {
            float h2 = cVar.h(this, view);
            if (h2 > 0.0f) {
                if (this.e == null) {
                    this.e = new Paint();
                }
                this.e.setColor(fVar.a.g(this, view));
                this.e.setAlpha(d(Math.round(h2 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.e);
                canvas.restoreToCount(save);
                return super.drawChild(canvas, view, j);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.q;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // ax.c0.F
    public void e(View view, int i2, int i3, int i4, int i5, int i6) {
        b(view, i2, i3, i4, i5, 0, this.g);
    }

    @Override // ax.c0.F
    public boolean f(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f2 = fVar.f();
                if (f2 != null) {
                    boolean E = f2.E(this, childAt, view, view2, i2, i3);
                    z |= E;
                    fVar.r(i3, E);
                } else {
                    fVar.r(i3, false);
                }
            }
        }
        return z;
    }

    final List<View> getDependencySortedChildren() {
        M();
        return DesugarCollections.unmodifiableList(this.a);
    }

    public final F0 getLastWindowInsets() {
        return this.o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.q;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // ax.c0.F
    public void h(View view, View view2, int i2, int i3) {
        c f2;
        View view3;
        View view4;
        int i4;
        int i5;
        this.t.c(view, view2, i2, i3);
        this.l = view2;
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i3) && (f2 = fVar.f()) != null) {
                view3 = view;
                view4 = view2;
                i4 = i2;
                i5 = i3;
                f2.z(this, childAt, view3, view4, i4, i5);
            } else {
                view3 = view;
                view4 = view2;
                i4 = i2;
                i5 = i3;
            }
            i6++;
            view = view3;
            view2 = view4;
            i2 = i4;
            i3 = i5;
        }
    }

    public void j(View view) {
        List g2 = this.b.g(view);
        if (g2 == null || g2.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < g2.size(); i2++) {
            View view2 = (View) g2.get(i2);
            c f2 = ((f) view2.getLayoutParams()).f();
            if (f2 != null) {
                f2.l(this, view2, view);
            }
        }
    }

    void k() {
        int childCount = getChildCount();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            if (A(getChildAt(i2))) {
                z = true;
                break;
            }
            i2++;
        }
        if (z != this.n) {
            if (z) {
                c();
            } else {
                P();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    @Override // ax.c0.F
    public void o(View view, int i2) {
        this.t.e(view, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i2)) {
                c f2 = fVar.f();
                if (f2 != null) {
                    f2.G(this, childAt, view, i2);
                }
                fVar.l(i2);
                fVar.k();
            }
        }
        this.l = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.n) {
            if (this.m == null) {
                this.m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.m);
        }
        if (this.o == null && C1760d0.y(this)) {
            C1760d0.i0(this);
        }
        this.i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.n && this.m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.m);
        }
        View view = this.l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.p || this.q == null) {
            return;
        }
        F0 f0 = this.o;
        int l = f0 != null ? f0.l() : 0;
        if (l > 0) {
            this.q.setBounds(0, 0, getWidth(), l);
            this.q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Q(true);
        }
        boolean L = L(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return L;
        }
        Q(true);
        return L;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        c f2;
        int B = C1760d0.B(this);
        int size = this.a.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.a.get(i6);
            if (view.getVisibility() != 8 && ((f2 = ((f) view.getLayoutParams()).f()) == null || !f2.p(this, view, B))) {
                I(view, B);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        c f4;
        View view2;
        float f5;
        float f6;
        boolean z2;
        int childCount = getChildCount();
        int i2 = 0;
        boolean z3 = false;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f4 = fVar.f()) != null) {
                    view2 = view;
                    f5 = f2;
                    f6 = f3;
                    z2 = z;
                    z3 |= f4.r(this, childAt, view2, f5, f6, z2);
                    i2++;
                    view = view2;
                    f2 = f5;
                    f3 = f6;
                    z = z2;
                }
            }
            view2 = view;
            f5 = f2;
            f6 = f3;
            z2 = z;
            i2++;
            view = view2;
            f2 = f5;
            f3 = f6;
            z = z2;
        }
        if (z3) {
            H(1);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        c f4;
        View view2;
        float f5;
        float f6;
        int childCount = getChildCount();
        int i2 = 0;
        boolean z = false;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f4 = fVar.f()) != null) {
                    view2 = view;
                    f5 = f2;
                    f6 = f3;
                    z |= f4.s(this, childAt, view2, f5, f6);
                    i2++;
                    view = view2;
                    f2 = f5;
                    f3 = f6;
                }
            }
            view2 = view;
            f5 = f2;
            f6 = f3;
            i2++;
            view = view2;
            f2 = f5;
            f3 = f6;
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        p(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        e(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        h(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray<Parcelable> sparseArray = hVar.d0;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c f2 = y(childAt).f();
            if (id != -1 && f2 != null && (parcelable2 = sparseArray.get(id)) != null) {
                f2.B(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable C;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c f2 = ((f) childAt.getLayoutParams()).f();
            if (id != -1 && f2 != null && (C = f2.C(this, childAt)) != null) {
                sparseArray.append(id, C);
            }
        }
        hVar.d0 = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        o(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.L(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = 0
            goto L2c
        L17:
            r3 = 0
        L18:
            android.view.View r6 = r0.k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.k
            boolean r6 = r6.H(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.k
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L56
            r1 = 3
            if (r2 != r1) goto L55
            goto L56
        L55:
            return r6
        L56:
            r0.Q(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // ax.c0.F
    public void p(View view, int i2, int i3, int[] iArr, int i4) {
        c f2;
        int childCount = getChildCount();
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i4) && (f2 = fVar.f()) != null) {
                    int[] iArr2 = this.f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f2.u(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.f;
                    i5 = i2 > 0 ? Math.max(i5, iArr3[0]) : Math.min(i5, iArr3[0]);
                    int[] iArr4 = this.f;
                    i6 = i3 > 0 ? Math.max(i6, iArr4[1]) : Math.min(i6, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z) {
            H(1);
        }
    }

    void q(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> r(View view) {
        List<View> h2 = this.b.h(view);
        this.d.clear();
        if (h2 != null) {
            this.d.addAll(h2);
        }
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        c f2 = ((f) view.getLayoutParams()).f();
        if (f2 == null || !f2.A(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.h) {
            return;
        }
        Q(false);
        this.h = true;
    }

    public List<View> s(View view) {
        List g2 = this.b.g(view);
        this.d.clear();
        if (g2 != null) {
            this.d.addAll(g2);
        }
        return this.d;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.q = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.q.setState(getDrawableState());
                }
                ax.U.a.m(this.q, C1760d0.B(this));
                this.q.setVisible(getVisibility() == 0, false);
                this.q.setCallback(this);
            }
            C1760d0.c0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? ax.Q.b.e(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.q;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.q.setVisible(z, false);
    }

    void t(View view, Rect rect) {
        ax.N.c.a(this, view, rect);
    }

    void u(View view, int i2, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        v(view, i2, rect, rect2, fVar, measuredWidth, measuredHeight);
        g(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    void x(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    f y(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                dVar = (d) cls.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.o(dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            fVar.b = true;
        }
        return fVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        CoordinatorLayout coordinatorLayout;
        Context context2;
        this.a = new ArrayList();
        this.b = new ax.N.b<>();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = new int[2];
        this.g = new int[2];
        this.t = new H(this);
        TypedArray obtainStyledAttributes = i2 == 0 ? context.obtainStyledAttributes(attributeSet, ax.M.c.b, 0, ax.M.b.a) : context.obtainStyledAttributes(attributeSet, ax.M.c.b, i2, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i2 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, ax.M.c.b, attributeSet, obtainStyledAttributes, 0, ax.M.b.a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, ax.M.c.b, attributeSet, obtainStyledAttributes, i2, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(ax.M.c.c, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.j = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.j.length;
            for (int i3 = 0; i3 < length; i3++) {
                coordinatorLayout.j[i3] = (int) (r12[i3] * f2);
            }
        }
        coordinatorLayout.q = obtainStyledAttributes.getDrawable(ax.M.c.d);
        obtainStyledAttributes.recycle();
        X();
        super.setOnHierarchyChangeListener(new e());
        if (C1760d0.z(this) == 0) {
            C1760d0.s0(this, 1);
        }
    }

    protected static class h extends AbstractC2357a {
        public static final Parcelable.Creator<h> CREATOR = new a();
        SparseArray<Parcelable> d0;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i) {
                return new h[i];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.d0 = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.d0.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // ax.k0.AbstractC2357a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.d0;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.d0.keyAt(i2);
                parcelableArr[i2] = this.d0.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {
        c a;
        boolean b;
        public int c;
        public int d;
        public int e;
        int f;
        public int g;
        public int h;
        int i;
        int j;
        View k;
        View l;
        private boolean m;
        private boolean n;
        private boolean o;
        private boolean p;
        final Rect q;
        Object r;

        public f(int i, int i2) {
            super(i, i2);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f);
            this.k = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.l = null;
                    this.k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f) + " to anchor view " + view);
            }
            if (findViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.l = null;
                this.k = null;
                return;
            }
            for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.l = null;
                    this.k = null;
                    return;
                }
                if (parent instanceof View) {
                    findViewById = parent;
                }
            }
            this.l = findViewById;
        }

        private boolean s(View view, int i) {
            int b = C1790t.b(((f) view.getLayoutParams()).g, i);
            return b != 0 && (C1790t.b(this.h, i) & b) == b;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.k.getId() != this.f) {
                return false;
            }
            View view2 = this.k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.l = null;
                    this.k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.l = view2;
            return true;
        }

        boolean a() {
            return this.k == null && this.f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.l || s(view2, C1760d0.B(coordinatorLayout))) {
                return true;
            }
            c cVar = this.a;
            return cVar != null && cVar.i(coordinatorLayout, view, view2);
        }

        boolean c() {
            if (this.a == null) {
                this.m = false;
            }
            return this.m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f == -1) {
                this.l = null;
                this.k = null;
                return null;
            }
            if (this.k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.k;
        }

        public int e() {
            return this.f;
        }

        public c f() {
            return this.a;
        }

        boolean g() {
            return this.p;
        }

        Rect h() {
            return this.q;
        }

        boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.m;
            if (z) {
                return true;
            }
            c cVar = this.a;
            boolean e = (cVar != null ? cVar.e(coordinatorLayout, view) : false) | z;
            this.m = e;
            return e;
        }

        boolean j(int i) {
            if (i == 0) {
                return this.n;
            }
            if (i != 1) {
                return false;
            }
            return this.o;
        }

        void k() {
            this.p = false;
        }

        void l(int i) {
            r(i, false);
        }

        void m() {
            this.m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.n();
                }
                this.a = cVar;
                this.r = null;
                this.b = true;
                if (cVar != null) {
                    cVar.k(this);
                }
            }
        }

        void p(boolean z) {
            this.p = z;
        }

        void q(Rect rect) {
            this.q.set(rect);
        }

        void r(int i, boolean z) {
            if (i == 0) {
                this.n = z;
            } else {
                if (i != 1) {
                    return;
                }
                this.o = z;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ax.M.c.e);
            this.c = obtainStyledAttributes.getInteger(ax.M.c.f, 0);
            this.f = obtainStyledAttributes.getResourceId(ax.M.c.g, -1);
            this.d = obtainStyledAttributes.getInteger(ax.M.c.h, 0);
            this.e = obtainStyledAttributes.getInteger(ax.M.c.l, -1);
            this.g = obtainStyledAttributes.getInt(ax.M.c.k, 0);
            this.h = obtainStyledAttributes.getInt(ax.M.c.j, 0);
            int i = ax.M.c.i;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.b = hasValue;
            if (hasValue) {
                this.a = CoordinatorLayout.K(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.a;
            if (cVar != null) {
                cVar.k(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }
    }
}
