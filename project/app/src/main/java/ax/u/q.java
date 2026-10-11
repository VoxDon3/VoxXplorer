/*
 * Decompiled with CFR 0.152.
 */
package ax.u;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import ax.c0.n0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class q
extends ListView {
    private final Rect a = new Rect();
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f;
    private d g;
    private boolean h;
    private boolean i;
    private boolean j;
    private n0 k;
    private ax.h0.f l;
    f m;

    q(Context context, boolean bl) {
        super(context, null, ax.m.a.C);
        this.i = bl;
        this.setCacheColorHint(0);
    }

    private void a() {
        this.j = false;
        this.setPressed(false);
        this.drawableStateChanged();
        Object object = this.getChildAt(this.f - this.getFirstVisiblePosition());
        if (object != null) {
            object.setPressed(false);
        }
        if ((object = this.k) != null) {
            ((n0)object).c();
            this.k = null;
        }
    }

    private void b(View view, int n8) {
        this.performItemClick(view, n8, this.getItemIdAtPosition(n8));
    }

    private void c(Canvas canvas) {
        Drawable drawable;
        if (!this.a.isEmpty() && (drawable = this.getSelector()) != null) {
            drawable.setBounds(this.a);
            drawable.draw(canvas);
        }
    }

    private void f(int n8, View view) {
        Rect rect = this.a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.b;
        rect.top -= this.c;
        rect.right += this.d;
        rect.bottom += this.e;
        boolean bl = this.j();
        if (view.isEnabled() != bl) {
            this.k(bl ^ true);
            if (n8 != -1) {
                this.refreshDrawableState();
            }
        }
    }

    private void g(int n8, View view) {
        Drawable drawable = this.getSelector();
        boolean bl = true;
        boolean bl2 = drawable != null && n8 != -1;
        if (bl2) {
            drawable.setVisible(false, false);
        }
        this.f(n8, view);
        if (bl2) {
            view = this.a;
            float f8 = view.exactCenterX();
            float f9 = view.exactCenterY();
            if (this.getVisibility() != 0) {
                bl = false;
            }
            drawable.setVisible(bl, false);
            ax.U.a.k(drawable, f8, f9);
        }
    }

    private void h(int n8, View view, float f8, float f9) {
        this.g(n8, view);
        view = this.getSelector();
        if (view != null && n8 != -1) {
            ax.U.a.k((Drawable)view, f8, f9);
        }
    }

    private void i(View view, int n8, float f8, float f9) {
        View view2;
        this.j = true;
        ax.u.q$a.a((View)this, f8, f9);
        if (!this.isPressed()) {
            this.setPressed(true);
        }
        this.layoutChildren();
        int n9 = this.f;
        if (n9 != -1 && (view2 = this.getChildAt(n9 - this.getFirstVisiblePosition())) != null && view2 != view && view2.isPressed()) {
            view2.setPressed(false);
        }
        this.f = n8;
        ax.u.q$a.a(view, f8 - (float)view.getLeft(), f9 - (float)view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        this.h(n8, view, f8, f9);
        this.setSelectorEnabled(false);
        this.refreshDrawableState();
    }

    private boolean j() {
        if (Build.VERSION.SDK_INT >= 33) {
            return ax.u.q$c.a((AbsListView)this);
        }
        return ax.u.q$e.a((AbsListView)this);
    }

    private void k(boolean bl) {
        if (Build.VERSION.SDK_INT >= 33) {
            ax.u.q$c.b((AbsListView)this, bl);
            return;
        }
        ax.u.q$e.b((AbsListView)this, bl);
    }

    private boolean l() {
        return this.j;
    }

    private void m() {
        Drawable drawable = this.getSelector();
        if (drawable != null && this.l() && this.isPressed()) {
            drawable.setState(this.getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean bl) {
        d d8 = this.g;
        if (d8 != null) {
            d8.c(bl);
        }
    }

    public int d(int n8, int n9, int n10, int n11, int n12) {
        int n13 = this.getListPaddingTop();
        n9 = this.getListPaddingBottom();
        n10 = this.getDividerHeight();
        Drawable drawable = this.getDivider();
        ListAdapter listAdapter = this.getAdapter();
        if (listAdapter == null) {
            return n13 + n9;
        }
        n9 = n13 + n9;
        if (n10 <= 0 || drawable == null) {
            n10 = 0;
        }
        int n14 = listAdapter.getCount();
        drawable = null;
        int n15 = 0;
        n13 = 0;
        for (int i8 = 0; i8 < n14; ++i8) {
            int n16 = listAdapter.getItemViewType(i8);
            int n17 = n15;
            if (n16 != n15) {
                drawable = null;
                n17 = n16;
            }
            View view = listAdapter.getView(i8, (View)drawable, (ViewGroup)this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            drawable = layoutParams;
            if (layoutParams == null) {
                drawable = this.generateDefaultLayoutParams();
                view.setLayoutParams((ViewGroup.LayoutParams)drawable);
            }
            n15 = (n15 = drawable.height) > 0 ? View.MeasureSpec.makeMeasureSpec((int)n15, (int)0x40000000) : View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
            view.measure(n8, n15);
            view.forceLayout();
            n15 = n9;
            if (i8 > 0) {
                n15 = n9 + n10;
            }
            if ((n9 = n15 + view.getMeasuredHeight()) >= n11) {
                if (n12 >= 0 && i8 > n12 && n13 > 0 && n9 != n11) {
                    return n13;
                }
                return n11;
            }
            n16 = n13;
            if (n12 >= 0) {
                n16 = n13;
                if (i8 >= n12) {
                    n16 = n9;
                }
            }
            n15 = n17;
            drawable = view;
            n13 = n16;
        }
        return n9;
    }

    protected void dispatchDraw(Canvas canvas) {
        this.c(canvas);
        super.dispatchDraw(canvas);
    }

    protected void drawableStateChanged() {
        if (this.m != null) {
            return;
        }
        super.drawableStateChanged();
        this.setSelectorEnabled(true);
        this.m();
    }

    /*
     * Unable to fully structure code
     */
    public boolean e(MotionEvent var1_1, int var2_2) {
        block10: {
            block11: {
                var3_3 = var1_1.getActionMasked();
                if (var3_3 != 1) {
                    if (var3_3 != 2) {
                        if (var3_3 != 3) lbl-1000:
                        // 3 sources

                        {
                            while (true) {
                                var2_2 = 0;
                                var6_4 = true;
                                break block10;
                                break;
                            }
                        }
lbl9:
                        // 3 sources

                        while (true) {
                            var2_2 = 0;
                            var6_4 = false;
                            break block10;
                            break;
                        }
                    }
                    var6_4 = true;
                } else {
                    var6_4 = false;
                }
                ** while ((var4_5 = var1_1.findPointerIndex((int)var2_2)) < 0)
lbl17:
                // 1 sources

                var2_2 = (int)var1_1.getX(var4_5);
                if ((var4_5 = this.pointToPosition(var2_2, var5_6 = (int)var1_1.getY(var4_5))) != -1) break block11;
                var2_2 = 1;
                break block10;
            }
            var7_7 = this.getChildAt(var4_5 - this.getFirstVisiblePosition());
            this.i(var7_7, var4_5, var2_2, var5_6);
            if (var3_3 != 1) ** GOTO lbl-1000
            this.b(var7_7, var4_5);
            ** while (true)
        }
        if (!var6_4 || var2_2 != 0) {
            this.a();
        }
        if (var6_4) {
            if (this.l == null) {
                this.l = new ax.h0.f(this);
            }
            this.l.m(true);
            this.l.onTouch((View)this, (MotionEvent)var1_1);
            return var6_4;
        }
        var1_1 = this.l;
        if (var1_1 != null) {
            var1_1.m(false);
        }
        return var6_4;
    }

    public boolean hasFocus() {
        return this.i || super.hasFocus();
        {
        }
    }

    public boolean hasWindowFocus() {
        return this.i || super.hasWindowFocus();
        {
        }
    }

    public boolean isFocused() {
        return this.i || super.isFocused();
        {
        }
    }

    public boolean isInTouchMode() {
        return this.i && this.h || super.isInTouchMode();
    }

    protected void onDetachedFromWindow() {
        this.m = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int n9 = motionEvent.getActionMasked();
        if (n9 == 10 && this.m == null) {
            f f8;
            this.m = f8 = new f(this);
            f8.b();
        }
        boolean bl = super.onHoverEvent(motionEvent);
        if (n9 != 9 && n9 != 7) {
            this.setSelection(-1);
            return bl;
        }
        n9 = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
        if (n9 != -1 && n9 != this.getSelectedItemPosition()) {
            motionEvent = this.getChildAt(n9 - this.getFirstVisiblePosition());
            if (motionEvent.isEnabled()) {
                this.requestFocus();
                if (n8 >= 30 && ax.u.q$b.a()) {
                    ax.u.q$b.b(this, n9, (View)motionEvent);
                } else {
                    this.setSelectionFromTop(n9, motionEvent.getTop() - this.getTop());
                }
            }
            this.m();
        }
        return bl;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
        }
        f f8 = this.m;
        if (f8 != null) {
            f8.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean bl) {
        this.h = bl;
    }

    public void setSelector(Drawable drawable) {
        d d8 = drawable != null ? new d(drawable) : null;
        this.g = d8;
        super.setSelector((Drawable)d8);
        d8 = new Rect();
        if (drawable != null) {
            drawable.getPadding((Rect)d8);
        }
        this.b = ((Rect)d8).left;
        this.c = ((Rect)d8).top;
        this.d = ((Rect)d8).right;
        this.e = ((Rect)d8).bottom;
    }

    static class a {
        static void a(View view, float f8, float f9) {
            view.drawableHotspotChanged(f8, f9);
        }
    }

    static class b {
        private static Method a;
        private static Method b;
        private static Method c;
        private static boolean d;

        static {
            try {
                GenericDeclaration genericDeclaration = Integer.TYPE;
                Class<Boolean> clazz = Boolean.TYPE;
                GenericDeclaration genericDeclaration2 = Float.TYPE;
                genericDeclaration2 = AbsListView.class.getDeclaredMethod("positionSelector", new Class[]{genericDeclaration, View.class, clazz, genericDeclaration2, genericDeclaration2});
                a = genericDeclaration2;
                ((AccessibleObject)((Object)genericDeclaration2)).setAccessible(true);
                genericDeclaration2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[]{genericDeclaration});
                b = genericDeclaration2;
                ((AccessibleObject)((Object)genericDeclaration2)).setAccessible(true);
                genericDeclaration = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{genericDeclaration});
                c = genericDeclaration;
                ((AccessibleObject)((Object)genericDeclaration)).setAccessible(true);
                d = true;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                noSuchMethodException.printStackTrace();
            }
        }

        static boolean a() {
            return d;
        }

        @SuppressLint(value={"BanUncheckedReflection"})
        static void b(q q8, int n8, View view) {
            try {
                a.invoke((Object)q8, n8, view, Boolean.FALSE, -1, -1);
                b.invoke((Object)q8, n8);
                c.invoke((Object)q8, n8);
                return;
            }
            catch (InvocationTargetException invocationTargetException) {
                invocationTargetException.printStackTrace();
            }
            catch (IllegalAccessException illegalAccessException) {
                illegalAccessException.printStackTrace();
            }
        }
    }

    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean bl) {
            absListView.setSelectedChildViewEnabled(bl);
        }
    }

    private static class d
    extends ax.p.c {
        private boolean b = true;

        d(Drawable drawable) {
            super(drawable);
        }

        void c(boolean bl) {
            this.b = bl;
        }

        @Override
        public void draw(Canvas canvas) {
            if (this.b) {
                super.draw(canvas);
            }
        }

        @Override
        public void setHotspot(float f8, float f9) {
            if (this.b) {
                super.setHotspot(f8, f9);
            }
        }

        @Override
        public void setHotspotBounds(int n8, int n9, int n10, int n11) {
            if (this.b) {
                super.setHotspotBounds(n8, n9, n10, n11);
            }
        }

        @Override
        public boolean setState(int[] nArray) {
            if (this.b) {
                return super.setState(nArray);
            }
            return false;
        }

        @Override
        public boolean setVisible(boolean bl, boolean bl2) {
            if (this.b) {
                return super.setVisible(bl, bl2);
            }
            return false;
        }
    }

    static class e {
        private static final Field a;

        static {
            Field field;
            Field field2 = null;
            field2 = field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            try {
                ((AccessibleObject)field).setAccessible(true);
                field2 = field;
            }
            catch (NoSuchFieldException noSuchFieldException) {
                noSuchFieldException.printStackTrace();
            }
            a = field2;
        }

        static boolean a(AbsListView absListView) {
            Field field = a;
            if (field != null) {
                try {
                    boolean bl = field.getBoolean(absListView);
                    return bl;
                }
                catch (IllegalAccessException illegalAccessException) {
                    illegalAccessException.printStackTrace();
                }
            }
            return false;
        }

        static void b(AbsListView absListView, boolean bl) {
            Field field = a;
            if (field != null) {
                try {
                    field.set(absListView, bl);
                    return;
                }
                catch (IllegalAccessException illegalAccessException) {
                    illegalAccessException.printStackTrace();
                }
            }
        }
    }

    private class f
    implements Runnable {
        final q q;

        f(q q8) {
            this.q = q8;
        }

        public void a() {
            q q8 = this.q;
            q8.m = null;
            q8.removeCallbacks(this);
        }

        public void b() {
            this.q.post(this);
        }

        @Override
        public void run() {
            q q8 = this.q;
            q8.m = null;
            q8.drawableStateChanged();
        }
    }
}

