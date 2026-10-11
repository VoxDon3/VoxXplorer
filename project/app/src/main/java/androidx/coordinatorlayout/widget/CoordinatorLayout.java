/*
 * Decompiled with CFR 0.152.
 */
package androidx.coordinatorlayout.widget;

import android.content.Context;
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
import ax.N.a;
import ax.c0.F;
import ax.c0.F0;
import ax.c0.G;
import ax.c0.H;
import ax.c0.I;
import ax.c0.d0;
import ax.c0.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout
extends ViewGroup
implements F,
G {
    static final String u;
    static final Class<?>[] v;
    static final ThreadLocal<Map<String, Constructor<c>>> w;
    static final Comparator<View> x;
    private static final ax.b0.d<Rect> y;
    private final List<View> a = new ArrayList<View>();
    private final ax.N.b<View> b = new ax.N.b();
    private final List<View> c = new ArrayList<View>();
    private final List<View> d = new ArrayList<View>();
    private Paint e;
    private final int[] f = new int[2];
    private final int[] g = new int[2];
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
    private final H t = new H(this);

    static {
        Object object = CoordinatorLayout.class.getPackage();
        object = object != null ? ((Package)object).getName() : null;
        u = object;
        x = new i();
        v = new Class[]{Context.class, AttributeSet.class};
        w = new ThreadLocal();
        y = new ax.b0.f<Rect>(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.M.a.a);
    }

    public CoordinatorLayout(Context object, AttributeSet attributeSet, int n8) {
        super(object, attributeSet, n8);
        int n9 = 0;
        TypedArray typedArray = n8 == 0 ? object.obtainStyledAttributes(attributeSet, ax.M.c.b, 0, ax.M.b.a) : object.obtainStyledAttributes(attributeSet, ax.M.c.b, n8, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            if (n8 == 0) {
                ax.N.a.a(this, object, ax.M.c.b, attributeSet, typedArray, 0, ax.M.b.a);
            } else {
                ax.N.a.a(this, object, ax.M.c.b, attributeSet, typedArray, n8, 0);
            }
        }
        if ((n8 = typedArray.getResourceId(ax.M.c.c, 0)) != 0) {
            object = object.getResources();
            this.j = object.getIntArray(n8);
            float f8 = object.getDisplayMetrics().density;
            int n10 = this.j.length;
            for (n8 = n9; n8 < n10; ++n8) {
                object = this.j;
                object[n8] = (Context)((int)((float)object[n8] * f8));
            }
        }
        this.q = typedArray.getDrawable(ax.M.c.d);
        typedArray.recycle();
        this.X();
        super.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener)new e(this));
        if (d0.z((View)this) == 0) {
            d0.s0((View)this, 1);
        }
    }

    private boolean A(View view) {
        return this.b.j(view);
    }

    private void C(View view, int n8) {
        f f8 = (f)view.getLayoutParams();
        Rect rect = CoordinatorLayout.a();
        rect.set(this.getPaddingLeft() + f8.leftMargin, this.getPaddingTop() + f8.topMargin, this.getWidth() - this.getPaddingRight() - f8.rightMargin, this.getHeight() - this.getPaddingBottom() - f8.bottomMargin);
        if (this.o != null && d0.y((View)this) && !d0.y(view)) {
            rect.left += this.o.j();
            rect.top += this.o.l();
            rect.right -= this.o.k();
            rect.bottom -= this.o.i();
        }
        Rect rect2 = CoordinatorLayout.a();
        ax.c0.t.a(CoordinatorLayout.S(f8.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, n8);
        view.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        CoordinatorLayout.O(rect);
        CoordinatorLayout.O(rect2);
    }

    private void D(View view, View view2, int n8) {
        Rect rect = CoordinatorLayout.a();
        Rect rect2 = CoordinatorLayout.a();
        try {
            this.t(view2, rect);
            this.u(view, n8, rect, rect2);
            view.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            return;
        }
        finally {
            CoordinatorLayout.O(rect);
            CoordinatorLayout.O(rect2);
        }
    }

    private void E(View view, int n8, int n9) {
        f f8 = (f)view.getLayoutParams();
        int n10 = ax.c0.t.b(CoordinatorLayout.T(f8.c), n9);
        int n11 = n10 & 7;
        int n12 = n10 & 0x70;
        int n13 = this.getWidth();
        int n14 = this.getHeight();
        int n15 = view.getMeasuredWidth();
        int n16 = view.getMeasuredHeight();
        n10 = n8;
        if (n9 == 1) {
            n10 = n13 - n8;
        }
        n8 = this.w(n10) - n15;
        if (n11 != 1) {
            if (n11 == 5) {
                n8 += n15;
            }
        } else {
            n8 += n15 / 2;
        }
        n9 = n12 != 16 ? (n12 != 80 ? 0 : n16) : n16 / 2;
        n8 = Math.max(this.getPaddingLeft() + f8.leftMargin, Math.min(n8, n13 - this.getPaddingRight() - n15 - f8.rightMargin));
        n9 = Math.max(this.getPaddingTop() + f8.topMargin, Math.min(n9, n14 - this.getPaddingBottom() - n16 - f8.bottomMargin));
        view.layout(n8, n9, n15 + n8, n16 + n9);
    }

    private void F(View object, Rect rect, int n8) {
        if (d0.R((View)object) && object.getWidth() > 0 && object.getHeight() > 0) {
            int n9;
            f f8 = (f)object.getLayoutParams();
            c c8 = f8.f();
            Rect rect2 = CoordinatorLayout.a();
            Rect rect3 = CoordinatorLayout.a();
            rect3.set(object.getLeft(), object.getTop(), object.getRight(), object.getBottom());
            if (c8 != null && c8.f(this, object, rect2)) {
                if (!rect3.contains(rect2)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Rect should be within the child's bounds. Rect:");
                    ((StringBuilder)object).append(rect2.toShortString());
                    ((StringBuilder)object).append(" | Bounds:");
                    ((StringBuilder)object).append(rect3.toShortString());
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
            } else {
                rect2.set(rect3);
            }
            CoordinatorLayout.O(rect3);
            if (rect2.isEmpty()) {
                CoordinatorLayout.O(rect2);
                return;
            }
            int n10 = ax.c0.t.b(f8.h, n8);
            int n11 = 1;
            if ((n10 & 0x30) == 48 && (n9 = rect2.top - f8.topMargin - f8.j) < (n8 = rect.top)) {
                this.V((View)object, n8 - n9);
                n8 = 1;
            } else {
                n8 = 0;
            }
            n9 = n8;
            if ((n10 & 0x50) == 80) {
                int n12 = this.getHeight() - rect2.bottom - f8.bottomMargin + f8.j;
                int n13 = rect.bottom;
                n9 = n8;
                if (n12 < n13) {
                    this.V((View)object, n12 - n13);
                    n9 = 1;
                }
            }
            if (n9 == 0) {
                this.V((View)object, 0);
            }
            if ((n10 & 3) == 3 && (n9 = rect2.left - f8.leftMargin - f8.i) < (n8 = rect.left)) {
                this.U((View)object, n8 - n9);
                n8 = 1;
            } else {
                n8 = 0;
            }
            if ((n10 & 5) == 5 && (n10 = this.getWidth() - rect2.right - f8.rightMargin + f8.i) < (n9 = rect.right)) {
                this.U((View)object, n10 - n9);
                n8 = n11;
            }
            if (n8 == 0) {
                this.U((View)object, 0);
            }
            CoordinatorLayout.O(rect2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static c K(Context object, AttributeSet object2, String hashMap) {
        Exception exception2;
        CharSequence charSequence;
        block10: {
            Object object3;
            Constructor<?> constructor;
            block9: {
                if (TextUtils.isEmpty((CharSequence)((Object)hashMap))) {
                    return null;
                }
                if (((String)((Object)hashMap)).startsWith(".")) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(object.getPackageName());
                    ((StringBuilder)charSequence).append((String)((Object)hashMap));
                    charSequence = ((StringBuilder)charSequence).toString();
                } else if (((String)((Object)hashMap)).indexOf(46) >= 0) {
                    charSequence = hashMap;
                } else {
                    constructor = u;
                    charSequence = hashMap;
                    if (!TextUtils.isEmpty((CharSequence)((Object)constructor))) {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append((String)((Object)constructor));
                        ((StringBuilder)charSequence).append('.');
                        ((StringBuilder)charSequence).append((String)((Object)hashMap));
                        charSequence = ((StringBuilder)charSequence).toString();
                    }
                }
                try {
                    object3 = w;
                    constructor = ((ThreadLocal)object3).get();
                    hashMap = constructor;
                    if (constructor != null) break block9;
                    hashMap = new HashMap();
                    ((ThreadLocal)object3).set(hashMap);
                }
                catch (Exception exception2) {
                    break block10;
                }
            }
            object3 = (Constructor)hashMap.get(charSequence);
            constructor = object3;
            if (object3 == null) {
                constructor = Class.forName((String)charSequence, false, object.getClassLoader()).getConstructor(v);
                ((AccessibleObject)constructor).setAccessible(true);
                hashMap.put(charSequence, constructor);
            }
            return (c)constructor.newInstance(object, object2);
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Could not inflate Behavior subclass ");
        ((StringBuilder)object2).append((String)charSequence);
        throw new RuntimeException(((StringBuilder)object2).toString(), exception2);
    }

    private boolean L(MotionEvent motionEvent, int n8) {
        boolean bl;
        int n9 = motionEvent.getActionMasked();
        List<View> list = this.c;
        this.z(list);
        int n10 = list.size();
        f f8 = null;
        int n11 = 0;
        boolean bl2 = false;
        boolean bl3 = false;
        while (true) {
            boolean bl4;
            boolean bl5;
            bl = bl2;
            if (n11 >= n10) break;
            View view = list.get(n11);
            f f9 = (f)view.getLayoutParams();
            c c8 = f9.f();
            if ((bl2 || bl3) && n9 != 0) {
                f9 = f8;
                bl5 = bl2;
                bl4 = bl3;
                if (c8 != null) {
                    f9 = f8;
                    if (f8 == null) {
                        long l8 = SystemClock.uptimeMillis();
                        f9 = MotionEvent.obtain((long)l8, (long)l8, (int)3, (float)0.0f, (float)0.0f, (int)0);
                    }
                    if (n8 != 0) {
                        if (n8 != 1) {
                            bl5 = bl2;
                            bl4 = bl3;
                        } else {
                            c8.H(this, view, (MotionEvent)f9);
                            bl5 = bl2;
                            bl4 = bl3;
                        }
                    } else {
                        c8.o(this, view, (MotionEvent)f9);
                        bl5 = bl2;
                        bl4 = bl3;
                    }
                }
            } else {
                bl = bl2;
                if (!bl2) {
                    bl = bl2;
                    if (c8 != null) {
                        if (n8 != 0) {
                            if (n8 == 1) {
                                bl2 = c8.H(this, view, motionEvent);
                            }
                        } else {
                            bl2 = c8.o(this, view, motionEvent);
                        }
                        bl = bl2;
                        if (bl2) {
                            this.k = view;
                            bl = bl2;
                        }
                    }
                }
                bl5 = f9.c();
                bl2 = f9.i(this, view);
                bl3 = bl2 && !bl5;
                f9 = f8;
                bl5 = bl;
                bl4 = bl3;
                if (bl2) {
                    f9 = f8;
                    bl5 = bl;
                    bl4 = bl3;
                    if (!bl3) break;
                }
            }
            ++n11;
            f8 = f9;
            bl2 = bl5;
            bl3 = bl4;
        }
        list.clear();
        return bl;
    }

    private void M() {
        this.a.clear();
        this.b.c();
        int n8 = this.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = this.getChildAt(i8);
            f f8 = this.y(view);
            f8.d(this, view);
            this.b.b(view);
            for (int i9 = 0; i9 < n8; ++i9) {
                View view2;
                if (i9 == i8 || !f8.b(this, view, view2 = this.getChildAt(i9))) continue;
                if (!this.b.d(view2)) {
                    this.b.b(view2);
                }
                this.b.a(view2, view);
            }
        }
        this.a.addAll(this.b.i());
        Collections.reverse(this.a);
    }

    private static void O(Rect rect) {
        rect.setEmpty();
        y.a(rect);
    }

    private void Q(boolean bl) {
        int n8;
        int n9 = this.getChildCount();
        for (n8 = 0; n8 < n9; ++n8) {
            View view = this.getChildAt(n8);
            c c8 = ((f)view.getLayoutParams()).f();
            if (c8 == null) continue;
            long l8 = SystemClock.uptimeMillis();
            MotionEvent motionEvent = MotionEvent.obtain((long)l8, (long)l8, (int)3, (float)0.0f, (float)0.0f, (int)0);
            if (bl) {
                c8.o(this, view, motionEvent);
            } else {
                c8.H(this, view, motionEvent);
            }
            motionEvent.recycle();
        }
        for (n8 = 0; n8 < n9; ++n8) {
            ((f)this.getChildAt(n8).getLayoutParams()).m();
        }
        this.k = null;
        this.h = false;
    }

    private static int R(int n8) {
        int n9 = n8;
        if (n8 == 0) {
            n9 = 17;
        }
        return n9;
    }

    private static int S(int n8) {
        int n9 = n8;
        if ((n8 & 7) == 0) {
            n9 = n8 | 0x800003;
        }
        n8 = n9;
        if ((n9 & 0x70) == 0) {
            n8 = n9 | 0x30;
        }
        return n8;
    }

    private static int T(int n8) {
        int n9 = n8;
        if (n8 == 0) {
            n9 = 8388661;
        }
        return n9;
    }

    private void U(View view, int n8) {
        f f8 = (f)view.getLayoutParams();
        int n9 = f8.i;
        if (n9 != n8) {
            d0.V(view, n8 - n9);
            f8.i = n8;
        }
    }

    private void V(View view, int n8) {
        f f8 = (f)view.getLayoutParams();
        int n9 = f8.j;
        if (n9 != n8) {
            d0.W(view, n8 - n9);
            f8.j = n8;
        }
    }

    private void X() {
        if (d0.y((View)this)) {
            if (this.s == null) {
                this.s = new I(this){
                    final CoordinatorLayout a;
                    {
                        this.a = coordinatorLayout;
                    }

                    @Override
                    public F0 a(View view, F0 f02) {
                        return this.a.W(f02);
                    }
                };
            }
            d0.v0((View)this, this.s);
            this.setSystemUiVisibility(1280);
            return;
        }
        d0.v0((View)this, null);
    }

    private static Rect a() {
        Rect rect;
        Rect rect2 = rect = y.b();
        if (rect == null) {
            rect2 = new Rect();
        }
        return rect2;
    }

    private static int d(int n8, int n9, int n10) {
        if (n8 < n9) {
            return n9;
        }
        if (n8 > n10) {
            return n10;
        }
        return n8;
    }

    private void g(f f8, Rect rect, int n8, int n9) {
        int n10 = this.getWidth();
        int n11 = this.getHeight();
        n10 = Math.max(this.getPaddingLeft() + f8.leftMargin, Math.min(rect.left, n10 - this.getPaddingRight() - n8 - f8.rightMargin));
        n11 = Math.max(this.getPaddingTop() + f8.topMargin, Math.min(rect.top, n11 - this.getPaddingBottom() - n9 - f8.bottomMargin));
        rect.set(n10, n11, n8 + n10, n9 + n11);
    }

    private F0 i(F0 f02) {
        if (f02.o()) {
            return f02;
        }
        int n8 = this.getChildCount();
        F0 f03 = f02;
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = this.getChildAt(i8);
            f02 = f03;
            if (d0.y(view)) {
                c c8 = ((f)view.getLayoutParams()).f();
                f02 = f03;
                if (c8 != null) {
                    f02 = f03 = c8.j(this, view, f03);
                    if (f03.o()) {
                        return f03;
                    }
                }
            }
            f03 = f02;
        }
        return f03;
    }

    private void v(View view, int n8, Rect rect, Rect rect2, f f8, int n9, int n10) {
        int n11 = ax.c0.t.b(CoordinatorLayout.R(f8.c), n8);
        int n12 = ax.c0.t.b(CoordinatorLayout.S(f8.d), n8);
        int n13 = n11 & 7;
        int n14 = n11 & 0x70;
        n8 = n12 & 7;
        n12 &= 0x70;
        n8 = n8 != 1 ? (n8 != 5 ? rect.left : rect.right) : rect.left + rect.width() / 2;
        n12 = n12 != 16 ? (n12 != 80 ? rect.top : rect.bottom) : rect.top + rect.height() / 2;
        if (n13 != 1) {
            n11 = n8;
            if (n13 != 5) {
                n11 = n8 - n9;
            }
        } else {
            n11 = n8 - n9 / 2;
        }
        if (n14 != 16) {
            n8 = n12;
            if (n14 != 80) {
                n8 = n12 - n10;
            }
        } else {
            n8 = n12 - n10 / 2;
        }
        rect2.set(n11, n8, n9 + n11, n10 + n8);
    }

    private int w(int n8) {
        Object object = this.j;
        if (object == null) {
            object = new StringBuilder();
            object.append("No keylines defined for ");
            object.append(this);
            object.append(" - attempted index lookup ");
            object.append(n8);
            Log.e((String)"CoordinatorLayout", (String)object.toString());
            return 0;
        }
        if (n8 >= 0 && n8 < ((int[])object).length) {
            return object[n8];
        }
        object = new StringBuilder();
        object.append("Keyline index ");
        object.append(n8);
        object.append(" out of range for ");
        object.append(this);
        Log.e((String)"CoordinatorLayout", (String)object.toString());
        return 0;
    }

    private void z(List<View> list) {
        list.clear();
        boolean bl = this.isChildrenDrawingOrderEnabled();
        int n8 = this.getChildCount();
        for (int i8 = n8 - 1; i8 >= 0; --i8) {
            int n9 = bl ? this.getChildDrawingOrder(n8, i8) : i8;
            list.add(this.getChildAt(n9));
        }
        Comparator<View> comparator = x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public boolean B(View view, int n8, int n9) {
        Rect rect = CoordinatorLayout.a();
        this.t(view, rect);
        try {
            boolean bl = rect.contains(n8, n9);
            return bl;
        }
        finally {
            CoordinatorLayout.O(rect);
        }
    }

    void G(View view, int n8) {
        block6: {
            c c8;
            int n9;
            int n10;
            int n11;
            Rect rect;
            Rect rect2;
            Rect rect3;
            f f8;
            block8: {
                block7: {
                    f8 = (f)view.getLayoutParams();
                    if (f8.k == null) break block6;
                    rect3 = CoordinatorLayout.a();
                    rect2 = CoordinatorLayout.a();
                    rect = CoordinatorLayout.a();
                    this.t(f8.k, rect3);
                    n11 = 0;
                    this.q(view, false, rect2);
                    n10 = view.getMeasuredWidth();
                    n9 = view.getMeasuredHeight();
                    this.v(view, n8, rect3, rect, f8, n10, n9);
                    if (rect.left != rect2.left) break block7;
                    n8 = n11;
                    if (rect.top == rect2.top) break block8;
                }
                n8 = 1;
            }
            this.g(f8, rect, n10, n9);
            n11 = rect.left - rect2.left;
            n10 = rect.top - rect2.top;
            if (n11 != 0) {
                d0.V(view, n11);
            }
            if (n10 != 0) {
                d0.W(view, n10);
            }
            if (n8 != 0 && (c8 = f8.f()) != null) {
                c8.l(this, view, f8.k);
            }
            CoordinatorLayout.O(rect3);
            CoordinatorLayout.O(rect2);
            CoordinatorLayout.O(rect);
            return;
        }
    }

    final void H(int n8) {
        int n9 = d0.B((View)this);
        int n10 = this.a.size();
        Rect rect = CoordinatorLayout.a();
        Rect rect2 = CoordinatorLayout.a();
        Rect rect3 = CoordinatorLayout.a();
        for (int i8 = 0; i8 < n10; ++i8) {
            Object object;
            int n11;
            View view = this.a.get(i8);
            Object object2 = (f)view.getLayoutParams();
            if (n8 == 0 && view.getVisibility() == 8) continue;
            for (n11 = 0; n11 < i8; ++n11) {
                object = this.a.get(n11);
                if (((f)((Object)object2)).l != object) continue;
                this.G(view, n9);
            }
            this.q(view, true, rect2);
            if (((f)((Object)object2)).g != 0 && !rect2.isEmpty()) {
                n11 = ax.c0.t.b(((f)((Object)object2)).g, n9);
                int n12 = n11 & 0x70;
                if (n12 != 48) {
                    if (n12 == 80) {
                        rect.bottom = Math.max(rect.bottom, this.getHeight() - rect2.top);
                    }
                } else {
                    rect.top = Math.max(rect.top, rect2.bottom);
                }
                if ((n11 &= 7) != 3) {
                    if (n11 == 5) {
                        rect.right = Math.max(rect.right, this.getWidth() - rect2.left);
                    }
                } else {
                    rect.left = Math.max(rect.left, rect2.right);
                }
            }
            if (((f)((Object)object2)).h != 0 && view.getVisibility() == 0) {
                this.F(view, rect, n9);
            }
            if (n8 != 2) {
                this.x(view, rect3);
                if (rect3.equals((Object)rect2)) continue;
                this.N(view, rect2);
            }
            for (n11 = i8 + 1; n11 < n10; ++n11) {
                boolean bl;
                View view2 = this.a.get(n11);
                object = (f)view2.getLayoutParams();
                object2 = object.f();
                if (object2 == null || !((c)object2).i(this, view2, view)) continue;
                if (n8 == 0 && object.g()) {
                    object.k();
                    continue;
                }
                if (n8 != 2) {
                    bl = ((c)object2).l(this, view2, view);
                } else {
                    ((c)object2).m(this, view2, view);
                    bl = true;
                }
                if (n8 != 1) continue;
                object.p(bl);
            }
        }
        CoordinatorLayout.O(rect);
        CoordinatorLayout.O(rect2);
        CoordinatorLayout.O(rect3);
    }

    public void I(View view, int n8) {
        f f8 = (f)view.getLayoutParams();
        if (!f8.a()) {
            View view2 = f8.k;
            if (view2 != null) {
                this.D(view, view2, n8);
                return;
            }
            int n9 = f8.e;
            if (n9 >= 0) {
                this.E(view, n9, n8);
                return;
            }
            this.C(view, n8);
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public void J(View view, int n8, int n9, int n10, int n11) {
        this.measureChildWithMargins(view, n8, n9, n10, n11);
    }

    void N(View view, Rect rect) {
        ((f)view.getLayoutParams()).q(rect);
    }

    void P() {
        if (this.i && this.m != null) {
            this.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this.m);
        }
        this.n = false;
    }

    final F0 W(F0 f02) {
        F0 f03 = f02;
        if (!ax.b0.b.a(this.o, f02)) {
            this.o = f02;
            boolean bl = false;
            boolean bl2 = f02 != null && f02.l() > 0;
            this.p = bl2;
            boolean bl3 = bl;
            if (!bl2) {
                bl3 = bl;
                if (this.getBackground() == null) {
                    bl3 = true;
                }
            }
            this.setWillNotDraw(bl3);
            f03 = this.i(f02);
            this.requestLayout();
        }
        return f03;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void b(View view, int n8, int n9, int n10, int n11, int n12, int[] nArray) {
        int n13 = this.getChildCount();
        boolean bl = false;
        int n14 = 0;
        int n15 = 0;
        for (int i8 = 0; i8 < n13; ++i8) {
            int n16;
            int n17;
            View view2 = this.getChildAt(i8);
            if (view2.getVisibility() == 8) {
                n17 = n14;
                n16 = n15;
            } else {
                f f8 = (f)view2.getLayoutParams();
                if (!f8.j(n12)) {
                    n17 = n14;
                    n16 = n15;
                } else {
                    c c8 = f8.f();
                    n17 = n14;
                    n16 = n15;
                    if (c8 != null) {
                        int[] nArray2 = this.f;
                        nArray2[0] = 0;
                        nArray2[1] = 0;
                        c8.x(this, view2, view, n8, n9, n10, n11, n12, nArray2);
                        int[] nArray3 = this.f;
                        n16 = n10 > 0 ? Math.max(n14, nArray3[0]) : Math.min(n14, nArray3[0]);
                        n17 = n16;
                        int[] nArray4 = this.f;
                        n16 = n11 > 0 ? Math.max(n15, nArray4[1]) : Math.min(n15, nArray4[1]);
                        bl = true;
                    }
                }
            }
            n14 = n17;
            n15 = n16;
        }
        nArray[0] = nArray[0] + n14;
        nArray[1] = nArray[1] + n15;
        if (bl) {
            this.H(1);
        }
    }

    void c() {
        if (this.i) {
            if (this.m == null) {
                this.m = new g(this);
            }
            this.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this.m);
        }
        this.n = true;
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f && super.checkLayoutParams(layoutParams);
    }

    protected boolean drawChild(Canvas canvas, View view, long l8) {
        block2: {
            float f8;
            f f9 = (f)view.getLayoutParams();
            c c8 = f9.a;
            if (c8 == null || !((f8 = c8.h(this, view)) > 0.0f)) break block2;
            if (this.e == null) {
                this.e = new Paint();
            }
            this.e.setColor(f9.a.g(this, view));
            this.e.setAlpha(CoordinatorLayout.d(Math.round(f8 * 255.0f), 0, 255));
            int n8 = canvas.save();
            if (view.isOpaque()) {
                canvas.clipRect((float)view.getLeft(), (float)view.getTop(), (float)view.getRight(), (float)view.getBottom(), Region.Op.DIFFERENCE);
            }
            canvas.drawRect((float)this.getPaddingLeft(), (float)this.getPaddingTop(), (float)(this.getWidth() - this.getPaddingRight()), (float)(this.getHeight() - this.getPaddingBottom()), this.e);
            canvas.restoreToCount(n8);
        }
        return super.drawChild(canvas, view, l8);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] nArray = this.getDrawableState();
        Drawable drawable = this.q;
        boolean bl = drawable != null && drawable.isStateful() ? drawable.setState(nArray) : false;
        if (bl) {
            this.invalidate();
        }
    }

    @Override
    public void e(View view, int n8, int n9, int n10, int n11, int n12) {
        this.b(view, n8, n9, n10, n11, 0, this.g);
    }

    @Override
    public boolean f(View view, View view2, int n8, int n9) {
        int n10 = this.getChildCount();
        boolean bl = false;
        for (int i8 = 0; i8 < n10; ++i8) {
            View view3 = this.getChildAt(i8);
            if (view3.getVisibility() == 8) continue;
            f f8 = (f)view3.getLayoutParams();
            c c8 = f8.f();
            if (c8 != null) {
                boolean bl2 = c8.E(this, view3, view, view2, n8, n9);
                bl |= bl2;
                f8.r(n9, bl2);
                continue;
            }
            f8.r(n9, false);
        }
        return bl;
    }

    final List<View> getDependencySortedChildren() {
        this.M();
        return java.util.DesugarCollections.unmodifiableList(this.a);
    }

    public final F0 getLastWindowInsets() {
        return this.o;
    }

    public int getNestedScrollAxes() {
        return this.t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.q;
    }

    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), this.getPaddingTop() + this.getPaddingBottom());
    }

    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), this.getPaddingLeft() + this.getPaddingRight());
    }

    @Override
    public void h(View view, View view2, int n8, int n9) {
        this.t.c(view, view2, n8, n9);
        this.l = view2;
        int n10 = this.getChildCount();
        for (int i8 = 0; i8 < n10; ++i8) {
            View view3 = this.getChildAt(i8);
            Object object = (f)view3.getLayoutParams();
            if (!object.j(n9) || (object = object.f()) == null) continue;
            ((c)object).z(this, view3, view, view2, n8, n9);
        }
    }

    public void j(View view) {
        List list = this.b.g(view);
        if (list != null && !list.isEmpty()) {
            for (int i8 = 0; i8 < list.size(); ++i8) {
                View view2 = (View)list.get(i8);
                c c8 = ((f)view2.getLayoutParams()).f();
                if (c8 == null) continue;
                c8.l(this, view2, view);
            }
        }
    }

    void k() {
        boolean bl;
        int n8 = this.getChildCount();
        boolean bl2 = false;
        int n9 = 0;
        while (true) {
            bl = bl2;
            if (n9 >= n8) break;
            if (this.A(this.getChildAt(n9))) {
                bl = true;
                break;
            }
            ++n9;
        }
        if (bl != this.n) {
            if (bl) {
                this.c();
                return;
            }
            this.P();
        }
    }

    protected f l() {
        return new f(-2, -2);
    }

    public f m(AttributeSet attributeSet) {
        return new f(this.getContext(), attributeSet);
    }

    protected f n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f)layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams)layoutParams);
        }
        return new f(layoutParams);
    }

    @Override
    public void o(View view, int n8) {
        this.t.e(view, n8);
        int n9 = this.getChildCount();
        for (int i8 = 0; i8 < n9; ++i8) {
            View view2 = this.getChildAt(i8);
            f f8 = (f)view2.getLayoutParams();
            if (!f8.j(n8)) continue;
            c c8 = f8.f();
            if (c8 != null) {
                c8.G(this, view2, view, n8);
            }
            f8.l(n8);
            f8.k();
        }
        this.l = null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q(false);
        if (this.n) {
            if (this.m == null) {
                this.m = new g(this);
            }
            this.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this.m);
        }
        if (this.o == null && d0.y((View)this)) {
            d0.i0((View)this);
        }
        this.i = true;
    }

    public void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.Q(false);
        if (this.n && this.m != null) {
            this.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this.m);
        }
        if ((view = this.l) != null) {
            this.onStopNestedScroll(view);
        }
        this.i = false;
    }

    public void onDraw(Canvas canvas) {
        F0 f02;
        int n8;
        super.onDraw(canvas);
        if (this.p && this.q != null && (n8 = (f02 = this.o) != null ? f02.l() : 0) > 0) {
            this.q.setBounds(0, 0, this.getWidth(), n8);
            this.q.draw(canvas);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int n8 = motionEvent.getActionMasked();
        if (n8 == 0) {
            this.Q(true);
        }
        boolean bl = this.L(motionEvent, 0);
        if (n8 != 1 && n8 != 3) {
            return bl;
        }
        this.Q(true);
        return bl;
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        n10 = d0.B((View)this);
        n9 = this.a.size();
        for (n8 = 0; n8 < n9; ++n8) {
            c c8;
            View view = this.a.get(n8);
            if (view.getVisibility() == 8 || (c8 = ((f)view.getLayoutParams()).f()) != null && c8.p(this, view, n10)) continue;
            this.I(view, n10);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void onMeasure(int var1_1, int var2_2) {
        var27_3 = this;
        var27_3.M();
        var27_3.k();
        var17_4 = var27_3.getPaddingLeft();
        var20_5 = var27_3.getPaddingTop();
        var16_6 = var27_3.getPaddingRight();
        var19_7 = var27_3.getPaddingBottom();
        var9_8 = d0.B((View)var27_3);
        var7_9 = var9_8 == 1;
        var23_10 = View.MeasureSpec.getMode((int)var1_1);
        var22_11 = View.MeasureSpec.getSize((int)var1_1);
        var21_12 = View.MeasureSpec.getMode((int)var2_2);
        var24_13 = View.MeasureSpec.getSize((int)var2_2);
        var4_14 = var27_3.getSuggestedMinimumWidth();
        var12_15 = var27_3.getSuggestedMinimumHeight();
        var8_16 = var27_3.o != null && d0.y((View)var27_3) != false;
        var10_17 = var27_3.a.size();
        var3_18 = 0;
        var11_19 = 0;
        var6_20 = var16_6;
        var5_21 = var17_4;
        while (true) {
            block9: {
                block8: {
                    var13_22 = var5_21;
                    if (var3_18 >= var10_17) break;
                    var26_27 /* !! */  = var27_3.a.get(var3_18);
                    if (var26_27 /* !! */ .getVisibility() != 8) break block8;
                    var5_21 = var3_18;
                    var26_27 /* !! */  = var27_3;
                    break block9;
                }
                var28_28 = (f)var26_27 /* !! */ .getLayoutParams();
                var5_21 = var28_28.e;
                if (var5_21 < 0 || var23_10 == 0) ** GOTO lbl-1000
                var5_21 = var27_3.w(var5_21);
                var14_23 = ax.c0.t.b(CoordinatorLayout.T(var28_28.c), var9_8) & 7;
                if (var14_23 == 3 && !var7_9 || var14_23 == 5 && var7_9) {
                    var5_21 = Math.max(0, var22_11 - var6_20 - var5_21);
                } else if (var14_23 == 5 && !var7_9 || var14_23 == 3 && var7_9) {
                    var5_21 = Math.max(0, var5_21 - var13_22);
                } else lbl-1000:
                // 2 sources

                {
                    var5_21 = 0;
                }
                if (var8_16 && !d0.y(var26_27 /* !! */ )) {
                    var25_26 = var27_3.o.j();
                    var14_23 = var27_3.o.k();
                    var18_25 = var27_3.o.l();
                    var15_24 = var27_3.o.i();
                    var14_23 = View.MeasureSpec.makeMeasureSpec((int)(var22_11 - (var25_26 + var14_23)), (int)var23_10);
                    var15_24 = View.MeasureSpec.makeMeasureSpec((int)(var24_13 - (var18_25 + var15_24)), (int)var21_12);
                } else {
                    var14_23 = var1_1;
                    var15_24 = var2_2;
                }
                var18_25 = var3_18;
                var29_29 = var28_28.f();
                if (var29_29 == null || !var29_29.q(this, var27_3 = var26_27 /* !! */ , var14_23, var5_21, var15_24, 0)) {
                    this.J(var26_27 /* !! */ , var14_23, var5_21, var15_24, 0);
                    var27_3 = var26_27 /* !! */ ;
                }
                var27_3 = var26_27 /* !! */ ;
                var26_27 /* !! */  = this;
                var4_14 = Math.max(var4_14, var17_4 + var16_6 + var27_3.getMeasuredWidth() + var28_28.leftMargin + var28_28.rightMargin);
                var12_15 = Math.max(var12_15, var20_5 + var19_7 + var27_3.getMeasuredHeight() + var28_28.topMargin + var28_28.bottomMargin);
                var11_19 = View.combineMeasuredStates((int)var11_19, (int)var27_3.getMeasuredState());
            }
            ++var3_18;
            var5_21 = var13_22;
            var27_3 = var26_27 /* !! */ ;
        }
        var27_3.setMeasuredDimension(View.resolveSizeAndState((int)var4_14, (int)var1_1, (int)(-16777216 & var11_19)), View.resolveSizeAndState((int)var12_15, (int)var2_2, (int)(var11_19 << 16)));
    }

    public boolean onNestedFling(View view, float f8, float f9, boolean bl) {
        int n8 = this.getChildCount();
        boolean bl2 = false;
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object;
            View view2 = this.getChildAt(i8);
            if (view2.getVisibility() == 8 || !((f)((Object)(object = (f)view2.getLayoutParams()))).j(0) || (object = ((f)((Object)object)).f()) == null) continue;
            bl2 |= ((c)object).r(this, view2, view, f8, f9, bl);
        }
        if (bl2) {
            this.H(1);
        }
        return bl2;
    }

    public boolean onNestedPreFling(View view, float f8, float f9) {
        int n8 = this.getChildCount();
        boolean bl = false;
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object;
            View view2 = this.getChildAt(i8);
            if (view2.getVisibility() == 8 || !((f)((Object)(object = (f)view2.getLayoutParams()))).j(0) || (object = ((f)((Object)object)).f()) == null) continue;
            bl |= ((c)object).s(this, view2, view, f8, f9);
        }
        return bl;
    }

    public void onNestedPreScroll(View view, int n8, int n9, int[] nArray) {
        this.p(view, n8, n9, nArray, 0);
    }

    public void onNestedScroll(View view, int n8, int n9, int n10, int n11) {
        this.e(view, n8, n9, n10, n11, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int n8) {
        this.h(view, view2, n8, 0);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (h)parcelable;
        super.onRestoreInstanceState(parcelable.a());
        SparseArray<Parcelable> sparseArray = parcelable.d0;
        int n8 = this.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = this.getChildAt(i8);
            int n9 = view.getId();
            c c8 = this.y(view).f();
            if (n9 == -1 || c8 == null || (parcelable = (Parcelable)sparseArray.get(n9)) == null) continue;
            c8.B(this, view, parcelable);
        }
    }

    protected Parcelable onSaveInstanceState() {
        h h8 = new h(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int n8 = this.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = this.getChildAt(i8);
            int n9 = view.getId();
            c c8 = ((f)view.getLayoutParams()).f();
            if (n9 == -1 || c8 == null || (c8 = c8.C(this, view)) == null) continue;
            sparseArray.append(n9, (Object)c8);
        }
        h8.d0 = sparseArray;
        return h8;
    }

    public boolean onStartNestedScroll(View view, View view2, int n8) {
        return this.f(view, view2, n8, 0);
    }

    public void onStopNestedScroll(View view) {
        this.o(view, 0);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean onTouchEvent(MotionEvent var1_1) {
        block9: {
            var2_2 = var1_1 /* !! */ .getActionMasked();
            if (this.k == null) {
                var4_4 = var3_3 = this.L(var1_1 /* !! */ , 1);
                if (!var3_3) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var5_6 = false;
                        var3_3 = var4_4;
                        var4_4 = var5_6;
                        break block9;
                        break;
                    }
                }
            } else {
                var3_3 = false;
            }
            var8_5 = ((f)this.k.getLayoutParams()).f();
            var4_4 = var3_3;
            ** while (var8_5 == null)
lbl15:
            // 1 sources

            var4_4 = var8_5.H(this, this.k, var1_1 /* !! */ );
        }
        var9_7 = this.k;
        var8_5 = null;
        if (var9_7 == null) {
            var5_6 = var4_4 | super.onTouchEvent(var1_1 /* !! */ );
            var1_1 /* !! */  = var8_5;
        } else {
            var5_6 = var4_4;
            var1_1 /* !! */  = var8_5;
            if (var3_3) {
                var6_8 = SystemClock.uptimeMillis();
                var1_1 /* !! */  = MotionEvent.obtain((long)var6_8, (long)var6_8, (int)3, (float)0.0f, (float)0.0f, (int)0);
                super.onTouchEvent(var1_1 /* !! */ );
                var5_6 = var4_4;
            }
        }
        if (var1_1 /* !! */  != null) {
            var1_1 /* !! */ .recycle();
        }
        if (var2_2 != 1 && var2_2 != 3) {
            return var5_6;
        }
        this.Q(false);
        return var5_6;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void p(View view, int n8, int n9, int[] nArray, int n10) {
        int n11 = this.getChildCount();
        boolean bl = false;
        int n12 = 0;
        int n13 = 0;
        for (int i8 = 0; i8 < n11; ++i8) {
            int n14;
            int n15;
            View view2 = this.getChildAt(i8);
            if (view2.getVisibility() == 8) {
                n15 = n12;
                n14 = n13;
            } else {
                f f8 = (f)view2.getLayoutParams();
                if (!f8.j(n10)) {
                    n15 = n12;
                    n14 = n13;
                } else {
                    c c8 = f8.f();
                    n15 = n12;
                    n14 = n13;
                    if (c8 != null) {
                        int[] nArray2 = this.f;
                        nArray2[0] = 0;
                        nArray2[1] = 0;
                        c8.u(this, view2, view, n8, n9, nArray2, n10);
                        int[] nArray3 = this.f;
                        n14 = n8 > 0 ? Math.max(n12, nArray3[0]) : Math.min(n12, nArray3[0]);
                        n12 = n14;
                        int[] nArray4 = this.f;
                        n14 = n9 > 0 ? Math.max(n13, nArray4[1]) : Math.min(n13, nArray4[1]);
                        bl = true;
                        n15 = n12;
                    }
                }
            }
            n12 = n15;
            n13 = n14;
        }
        nArray[0] = n12;
        nArray[1] = n13;
        if (bl) {
            this.H(1);
        }
    }

    void q(View view, boolean bl, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (bl) {
                this.t(view, rect);
                return;
            }
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            return;
        }
        rect.setEmpty();
    }

    public List<View> r(View object) {
        object = this.b.h((View)object);
        this.d.clear();
        if (object != null) {
            this.d.addAll((Collection<View>)object);
        }
        return this.d;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean bl) {
        c c8 = ((f)view.getLayoutParams()).f();
        if (c8 != null && c8.A(this, view, rect, bl)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, bl);
    }

    public void requestDisallowInterceptTouchEvent(boolean bl) {
        super.requestDisallowInterceptTouchEvent(bl);
        if (bl && !this.h) {
            this.Q(false);
            this.h = true;
        }
    }

    public List<View> s(View object) {
        object = this.b.g((View)object);
        this.d.clear();
        if (object != null) {
            this.d.addAll((Collection<View>)object);
        }
        return this.d;
    }

    public void setFitsSystemWindows(boolean bl) {
        super.setFitsSystemWindows(bl);
        this.X();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.q = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.q.setState(this.getDrawableState());
                }
                ax.U.a.m(this.q, d0.B((View)this));
                drawable = this.q;
                boolean bl = this.getVisibility() == 0;
                drawable.setVisible(bl, false);
                this.q.setCallback((Drawable.Callback)this);
            }
            d0.c0((View)this);
        }
    }

    public void setStatusBarBackgroundColor(int n8) {
        this.setStatusBarBackground((Drawable)new ColorDrawable(n8));
    }

    public void setStatusBarBackgroundResource(int n8) {
        Drawable drawable = n8 != 0 ? ax.Q.b.e(this.getContext(), n8) : null;
        this.setStatusBarBackground(drawable);
    }

    public void setVisibility(int n8) {
        super.setVisibility(n8);
        boolean bl = n8 == 0;
        Drawable drawable = this.q;
        if (drawable != null && drawable.isVisible() != bl) {
            this.q.setVisible(bl, false);
        }
    }

    void t(View view, Rect rect) {
        ax.N.c.a(this, view, rect);
    }

    void u(View view, int n8, Rect rect, Rect rect2) {
        f f8 = (f)view.getLayoutParams();
        int n9 = view.getMeasuredWidth();
        int n10 = view.getMeasuredHeight();
        this.v(view, n8, rect, rect2, f8, n9, n10);
        this.g(f8, rect2, n9, n10);
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
        {
        }
    }

    void x(View view, Rect rect) {
        rect.set(((f)view.getLayoutParams()).h());
    }

    f y(View object) {
        f f8 = (f)object.getLayoutParams();
        if (!f8.b) {
            Object object2;
            if (object instanceof b) {
                if ((object = ((b)object).getBehavior()) == null) {
                    Log.e((String)"CoordinatorLayout", (String)"Attached behavior class is null");
                }
                f8.o((c)object);
                f8.b = true;
                return f8;
            }
            Class<?> clazz = object.getClass();
            object = null;
            while (clazz != null) {
                object = object2 = clazz.getAnnotation(d.class);
                if (object2 != null) break;
                clazz = clazz.getSuperclass();
                object = object2;
            }
            if (object != null) {
                try {
                    f8.o(object.value().getDeclaredConstructor(null).newInstance(null));
                }
                catch (Exception exception) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Default behavior class ");
                    ((StringBuilder)object2).append(object.value().getName());
                    ((StringBuilder)object2).append(" could not be instantiated. Did you forget a default constructor?");
                    Log.e((String)"CoordinatorLayout", (String)((StringBuilder)object2).toString(), (Throwable)exception);
                }
            }
            f8.b = true;
        }
        return f8;
    }

    public static interface b {
        public c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v8, Rect rect, boolean bl) {
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, V v8, Parcelable parcelable) {
        }

        public Parcelable C(CoordinatorLayout coordinatorLayout, V v8) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean D(CoordinatorLayout coordinatorLayout, V v8, View view, View view2, int n8) {
            return false;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, V v8, View view, View view2, int n8, int n9) {
            if (n9 == 0) {
                return this.D(coordinatorLayout, v8, view, view2, n8);
            }
            return false;
        }

        @Deprecated
        public void F(CoordinatorLayout coordinatorLayout, V v8, View view) {
        }

        public void G(CoordinatorLayout coordinatorLayout, V v8, View view, int n8) {
            if (n8 == 0) {
                this.F(coordinatorLayout, v8, view);
            }
        }

        public boolean H(CoordinatorLayout coordinatorLayout, V v8, MotionEvent motionEvent) {
            return false;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v8) {
            return this.h(coordinatorLayout, v8) > 0.0f;
        }

        public boolean f(CoordinatorLayout coordinatorLayout, V v8, Rect rect) {
            return false;
        }

        public int g(CoordinatorLayout coordinatorLayout, V v8) {
            return -16777216;
        }

        public float h(CoordinatorLayout coordinatorLayout, V v8) {
            return 0.0f;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, V v8, View view) {
            return false;
        }

        public F0 j(CoordinatorLayout coordinatorLayout, V v8, F0 f02) {
            return f02;
        }

        public void k(f f8) {
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v8, View view) {
            return false;
        }

        public void m(CoordinatorLayout coordinatorLayout, V v8, View view) {
        }

        public void n() {
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v8, MotionEvent motionEvent) {
            return false;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v8, int n8) {
            return false;
        }

        public boolean q(CoordinatorLayout coordinatorLayout, V v8, int n8, int n9, int n10, int n11) {
            return false;
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v8, View view, float f8, float f9, boolean bl) {
            return false;
        }

        public boolean s(CoordinatorLayout coordinatorLayout, V v8, View view, float f8, float f9) {
            return false;
        }

        @Deprecated
        public void t(CoordinatorLayout coordinatorLayout, V v8, View view, int n8, int n9, int[] nArray) {
        }

        public void u(CoordinatorLayout coordinatorLayout, V v8, View view, int n8, int n9, int[] nArray, int n10) {
            if (n10 == 0) {
                this.t(coordinatorLayout, v8, view, n8, n9, nArray);
            }
        }

        @Deprecated
        public void v(CoordinatorLayout coordinatorLayout, V v8, View view, int n8, int n9, int n10, int n11) {
        }

        @Deprecated
        public void w(CoordinatorLayout coordinatorLayout, V v8, View view, int n8, int n9, int n10, int n11, int n12) {
            if (n12 == 0) {
                this.v(coordinatorLayout, v8, view, n8, n9, n10, n11);
            }
        }

        public void x(CoordinatorLayout coordinatorLayout, V v8, View view, int n8, int n9, int n10, int n11, int n12, int[] nArray) {
            nArray[0] = nArray[0] + n10;
            nArray[1] = nArray[1] + n11;
            this.w(coordinatorLayout, v8, view, n8, n9, n10, n11, n12);
        }

        @Deprecated
        public void y(CoordinatorLayout coordinatorLayout, V v8, View view, View view2, int n8) {
        }

        public void z(CoordinatorLayout coordinatorLayout, V v8, View view, View view2, int n8, int n9) {
            if (n9 == 0) {
                this.y(coordinatorLayout, v8, view, view2, n8);
            }
        }
    }

    @Deprecated
    @Retention(value=RetentionPolicy.RUNTIME)
    public static @interface d {
        public Class<? extends c> value();
    }

    private class e
    implements ViewGroup.OnHierarchyChangeListener {
        final CoordinatorLayout a;

        e(CoordinatorLayout coordinatorLayout) {
            this.a = coordinatorLayout;
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a.r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            this.a.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a.r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class f
    extends ViewGroup.MarginLayoutParams {
        c a;
        boolean b = false;
        public int c = 0;
        public int d = 0;
        public int e = -1;
        int f = -1;
        public int g = 0;
        public int h = 0;
        int i;
        int j;
        View k;
        View l;
        private boolean m;
        private boolean n;
        private boolean o;
        private boolean p;
        final Rect q = new Rect();
        Object r;

        public f(int n8, int n9) {
            super(n8, n9);
        }

        f(Context object, AttributeSet attributeSet) {
            super((Context)object, attributeSet);
            boolean bl;
            TypedArray typedArray = object.obtainStyledAttributes(attributeSet, ax.M.c.e);
            this.c = typedArray.getInteger(ax.M.c.f, 0);
            this.f = typedArray.getResourceId(ax.M.c.g, -1);
            this.d = typedArray.getInteger(ax.M.c.h, 0);
            this.e = typedArray.getInteger(ax.M.c.l, -1);
            this.g = typedArray.getInt(ax.M.c.k, 0);
            this.h = typedArray.getInt(ax.M.c.j, 0);
            int n8 = ax.M.c.i;
            this.b = bl = typedArray.hasValue(n8);
            if (bl) {
                this.a = CoordinatorLayout.K((Context)object, attributeSet, typedArray.getString(n8));
            }
            typedArray.recycle();
            object = this.a;
            if (object != null) {
                ((c)object).k(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(f f8) {
            super((ViewGroup.MarginLayoutParams)f8);
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View view2;
            this.k = view2 = coordinatorLayout.findViewById(this.f);
            if (view2 != null) {
                if (view2 == coordinatorLayout) {
                    if (coordinatorLayout.isInEditMode()) {
                        this.l = null;
                        this.k = null;
                        return;
                    }
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                for (ViewParent viewParent = view2.getParent(); viewParent != coordinatorLayout && viewParent != null; viewParent = viewParent.getParent()) {
                    if (viewParent == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.l = null;
                            this.k = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (!(viewParent instanceof View)) continue;
                    view2 = (View)viewParent;
                }
                this.l = view2;
                return;
            }
            if (coordinatorLayout.isInEditMode()) {
                this.l = null;
                this.k = null;
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not find CoordinatorLayout descendant view with id ");
            stringBuilder.append(coordinatorLayout.getResources().getResourceName(this.f));
            stringBuilder.append(" to anchor view ");
            stringBuilder.append(view);
            throw new IllegalStateException(stringBuilder.toString());
        }

        private boolean s(View view, int n8) {
            int n9 = ax.c0.t.b(((f)view.getLayoutParams()).g, n8);
            return n9 != 0 && (ax.c0.t.b(this.h, n8) & n9) == n9;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.k.getId() != this.f) {
                return false;
            }
            View view2 = this.k;
            for (ViewParent viewParent = view2.getParent(); viewParent != coordinatorLayout; viewParent = viewParent.getParent()) {
                if (viewParent != null && viewParent != view) {
                    if (!(viewParent instanceof View)) continue;
                    view2 = (View)viewParent;
                    continue;
                }
                this.l = null;
                this.k = null;
                return false;
            }
            this.l = view2;
            return true;
        }

        boolean a() {
            return this.k == null && this.f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c c8;
            return view2 == this.l || this.s(view2, d0.B((View)coordinatorLayout)) || (c8 = this.a) != null && c8.i(coordinatorLayout, view, view2);
            {
            }
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
            if (this.k == null || !this.t(view, coordinatorLayout)) {
                this.n(view, coordinatorLayout);
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
            boolean bl = this.m;
            if (bl) {
                return true;
            }
            c c8 = this.a;
            boolean bl2 = c8 != null ? c8.e(coordinatorLayout, view) : false;
            this.m = bl2 |= bl;
            return bl2;
        }

        boolean j(int n8) {
            if (n8 != 0) {
                if (n8 != 1) {
                    return false;
                }
                return this.o;
            }
            return this.n;
        }

        void k() {
            this.p = false;
        }

        void l(int n8) {
            this.r(n8, false);
        }

        void m() {
            this.m = false;
        }

        public void o(c c8) {
            c c9 = this.a;
            if (c9 != c8) {
                if (c9 != null) {
                    c9.n();
                }
                this.a = c8;
                this.r = null;
                this.b = true;
                if (c8 != null) {
                    c8.k(this);
                }
            }
        }

        void p(boolean bl) {
            this.p = bl;
        }

        void q(Rect rect) {
            this.q.set(rect);
        }

        void r(int n8, boolean bl) {
            if (n8 != 0) {
                if (n8 != 1) {
                    return;
                }
                this.o = bl;
                return;
            }
            this.n = bl;
        }
    }

    class g
    implements ViewTreeObserver.OnPreDrawListener {
        final CoordinatorLayout a;

        g(CoordinatorLayout coordinatorLayout) {
            this.a = coordinatorLayout;
        }

        public boolean onPreDraw() {
            this.a.H(0);
            return true;
        }
    }

    protected static class h
    extends ax.k0.a {
        public static final Parcelable.Creator<h> CREATOR = new Parcelable.ClassLoaderCreator<h>(){

            public h a(Parcel parcel) {
                return new h(parcel, null);
            }

            public h b(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            public h[] c(int n8) {
                return new h[n8];
            }
        };
        SparseArray<Parcelable> d0;

        public h(Parcel parcelableArray, ClassLoader classLoader) {
            super((Parcel)parcelableArray, classLoader);
            int n8 = parcelableArray.readInt();
            int[] nArray = new int[n8];
            parcelableArray.readIntArray(nArray);
            parcelableArray = parcelableArray.readParcelableArray(classLoader);
            this.d0 = new SparseArray(n8);
            for (int i8 = 0; i8 < n8; ++i8) {
                this.d0.append(nArray[i8], (Object)parcelableArray[i8]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override
        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            Parcelable[] parcelableArray = this.d0;
            int n9 = parcelableArray != null ? parcelableArray.size() : 0;
            parcel.writeInt(n9);
            int[] nArray = new int[n9];
            parcelableArray = new Parcelable[n9];
            for (int i8 = 0; i8 < n9; ++i8) {
                nArray[i8] = this.d0.keyAt(i8);
                parcelableArray[i8] = (Parcelable)this.d0.valueAt(i8);
            }
            parcel.writeIntArray(nArray);
            parcel.writeParcelableArray(parcelableArray, n8);
        }
    }

    static class i
    implements Comparator<View> {
        i() {
        }

        public int a(View view, View view2) {
            float f8;
            float f9 = d0.M(view);
            if (f9 > (f8 = d0.M(view2))) {
                return -1;
            }
            if (f9 < f8) {
                return 1;
            }
            return 0;
        }
    }
}

