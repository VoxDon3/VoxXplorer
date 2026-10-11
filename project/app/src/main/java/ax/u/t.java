/*
 * Decompiled with CFR 0.152.
 */
package ax.u;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import ax.m.j;
import ax.u.a;
import ax.u.q;
import java.lang.reflect.Method;

public class t
implements ax.t.e {
    private static Method G;
    private static Method H;
    private static Method I;
    private Runnable A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;
    private Context a;
    private ListAdapter b;
    q c;
    private int d = -2;
    private int e = -2;
    private int f;
    private int g;
    private int h = 1002;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l = 0;
    private boolean m = false;
    private boolean n = false;
    int o = Integer.MAX_VALUE;
    private View p;
    private int q = 0;
    private DataSetObserver r;
    private View s;
    private Drawable t;
    private AdapterView.OnItemClickListener u;
    private AdapterView.OnItemSelectedListener v;
    final i w = new i(this);
    private final h x = new h(this);
    private final g y = new g(this);
    private final e z = new e(this);

    static {
        int n8 = Build.VERSION.SDK_INT;
        Class<Boolean> clazz = Boolean.TYPE;
        if (n8 <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", clazz);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                Log.i((String)"ListPopupWindow", (String)"Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                Log.i((String)"ListPopupWindow", (String)"Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, clazz);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                Log.i((String)"ListPopupWindow", (String)"Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public t(Context context) {
        this(context, null, ax.m.a.G);
    }

    public t(Context context, AttributeSet attributeSet, int n8) {
        this(context, attributeSet, n8, 0);
    }

    public t(Context object, AttributeSet attributeSet, int n8, int n9) {
        int n10;
        this.C = new Rect();
        this.a = object;
        this.B = new Handler(object.getMainLooper());
        TypedArray typedArray = object.obtainStyledAttributes(attributeSet, ax.m.j.l1, n8, n9);
        this.f = typedArray.getDimensionPixelOffset(ax.m.j.m1, 0);
        this.g = n10 = typedArray.getDimensionPixelOffset(ax.m.j.n1, 0);
        if (n10 != 0) {
            this.i = true;
        }
        typedArray.recycle();
        object = new a((Context)object, attributeSet, n8, n9);
        this.F = object;
        object.setInputMethodMode(1);
    }

    private void C() {
        View view = this.p;
        if (view != null && (view = view.getParent()) instanceof ViewGroup) {
            ((ViewGroup)view).removeView(this.p);
        }
    }

    private void O(boolean bl) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = G;
            if (method != null) {
                try {
                    method.invoke(this.F, bl);
                    return;
                }
                catch (Exception exception) {
                    Log.i((String)"ListPopupWindow", (String)"Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
            return;
        }
        ax.u.t$d.b(this.F, bl);
    }

    private int q() {
        int n8;
        int n9;
        int n10;
        int n11;
        q q8 = this.c;
        boolean bl = true;
        if (q8 == null) {
            q8 = this.a;
            this.A = new Runnable(this){
                final t q;
                {
                    this.q = t8;
                }

                @Override
                public void run() {
                    View view = this.q.t();
                    if (view != null && view.getWindowToken() != null) {
                        this.q.c();
                    }
                }
            };
            Object object = this.s((Context)q8, this.E ^ true);
            this.c = object;
            Drawable drawable = this.t;
            if (drawable != null) {
                ((q)((Object)object)).setSelector(drawable);
            }
            this.c.setAdapter(this.b);
            this.c.setOnItemClickListener(this.u);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(this){
                final t a;
                {
                    this.a = t8;
                }

                public void onItemSelected(AdapterView<?> object, View view, int n8, long l8) {
                    if (n8 != -1 && (object = this.a.c) != null) {
                        ((q)((Object)object)).setListSelectionHidden(false);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            this.c.setOnScrollListener(this.y);
            object = this.v;
            if (object != null) {
                this.c.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)object);
            }
            object = this.c;
            drawable = this.p;
            if (drawable != null) {
                q8 = new LinearLayout((Context)q8);
                q8.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                n11 = this.q;
                if (n11 != 0) {
                    if (n11 != 1) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Invalid hint position ");
                        ((StringBuilder)object).append(this.q);
                        Log.e((String)"ListPopupWindow", (String)((StringBuilder)object).toString());
                    } else {
                        q8.addView((View)object, (ViewGroup.LayoutParams)layoutParams);
                        q8.addView((View)drawable);
                    }
                } else {
                    q8.addView((View)drawable);
                    q8.addView((View)object, (ViewGroup.LayoutParams)layoutParams);
                }
                n10 = this.e;
                if (n10 >= 0) {
                    n11 = Integer.MIN_VALUE;
                } else {
                    n10 = 0;
                    n11 = 0;
                }
                drawable.measure(View.MeasureSpec.makeMeasureSpec((int)n10, (int)n11), 0);
                object = (LinearLayout.LayoutParams)drawable.getLayoutParams();
                n11 = drawable.getMeasuredHeight() + ((LinearLayout.LayoutParams)object).topMargin + ((LinearLayout.LayoutParams)object).bottomMargin;
            } else {
                n11 = 0;
                q8 = object;
            }
            this.F.setContentView((View)q8);
        } else {
            q8 = (ViewGroup)this.F.getContentView();
            View view = this.p;
            if (view != null) {
                q8 = (LinearLayout.LayoutParams)view.getLayoutParams();
                n11 = view.getMeasuredHeight() + ((LinearLayout.LayoutParams)q8).topMargin + ((LinearLayout.LayoutParams)q8).bottomMargin;
            } else {
                n11 = 0;
            }
        }
        q8 = this.F.getBackground();
        if (q8 != null) {
            q8.getPadding(this.C);
            q8 = this.C;
            n9 = ((Rect)q8).top;
            n8 = n10 = ((Rect)q8).bottom + n9;
            if (!this.i) {
                this.g = -n9;
                n8 = n10;
            }
        } else {
            this.C.setEmpty();
            n8 = 0;
        }
        if (this.F.getInputMethodMode() != 2) {
            bl = false;
        }
        n9 = this.u(this.t(), this.g, bl);
        if (!this.m && this.d != -1) {
            n10 = this.e;
            if (n10 != -2) {
                if (n10 != -1) {
                    n10 = View.MeasureSpec.makeMeasureSpec((int)n10, (int)0x40000000);
                } else {
                    n10 = this.a.getResources().getDisplayMetrics().widthPixels;
                    q8 = this.C;
                    n10 = View.MeasureSpec.makeMeasureSpec((int)(n10 - (((Rect)q8).left + ((Rect)q8).right)), (int)0x40000000);
                }
            } else {
                n10 = this.a.getResources().getDisplayMetrics().widthPixels;
                q8 = this.C;
                n10 = View.MeasureSpec.makeMeasureSpec((int)(n10 - (((Rect)q8).left + ((Rect)q8).right)), (int)Integer.MIN_VALUE);
            }
            n9 = this.c.d(n10, 0, -1, n9 - n11, -1);
            n10 = n11;
            if (n9 > 0) {
                n10 = n11 + (n8 + (this.c.getPaddingTop() + this.c.getPaddingBottom()));
            }
            return n9 + n10;
        }
        return n9 + n8;
    }

    private int u(View view, int n8, boolean bl) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = H;
            if (method != null) {
                try {
                    int n9 = (Integer)method.invoke(this.F, view, n8, bl);
                    return n9;
                }
                catch (Exception exception) {
                    Log.i((String)"ListPopupWindow", (String)"Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.F.getMaxAvailableHeight(view, n8);
        }
        return ax.u.t$c.a(this.F, view, n8, bl);
    }

    public boolean A() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.E;
    }

    public void D(View view) {
        this.s = view;
    }

    public void E(int n8) {
        this.F.setAnimationStyle(n8);
    }

    public void F(int n8) {
        Drawable drawable = this.F.getBackground();
        if (drawable != null) {
            drawable.getPadding(this.C);
            drawable = this.C;
            this.e = drawable.left + drawable.right + n8;
            return;
        }
        this.R(n8);
    }

    public void G(int n8) {
        this.l = n8;
    }

    public void H(Rect object) {
        object = object != null ? new Rect(object) : null;
        this.D = object;
    }

    public void I(int n8) {
        this.F.setInputMethodMode(n8);
    }

    public void J(boolean bl) {
        this.E = bl;
        this.F.setFocusable(bl);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.u = onItemClickListener;
    }

    public void M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.v = onItemSelectedListener;
    }

    public void N(boolean bl) {
        this.k = true;
        this.j = bl;
    }

    public void P(int n8) {
        this.q = n8;
    }

    public void Q(int n8) {
        q q8 = this.c;
        if (this.b() && q8 != null) {
            q8.setListSelectionHidden(false);
            q8.setSelection(n8);
            if (q8.getChoiceMode() != 0) {
                q8.setItemChecked(n8, true);
            }
        }
    }

    public void R(int n8) {
        this.e = n8;
    }

    public void a(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    @Override
    public boolean b() {
        return this.F.isShowing();
    }

    @Override
    public void c() {
        int n8 = this.q();
        boolean bl = this.A();
        ax.h0.h.b(this.F, this.h);
        boolean bl2 = this.F.isShowing();
        boolean bl3 = true;
        if (bl2) {
            if (this.t().isAttachedToWindow()) {
                PopupWindow popupWindow;
                int n9;
                int n10 = this.e;
                if (n10 == -1) {
                    n9 = -1;
                } else {
                    n9 = n10;
                    if (n10 == -2) {
                        n9 = this.t().getWidth();
                    }
                }
                n10 = this.d;
                if (n10 == -1) {
                    if (!bl) {
                        n8 = -1;
                    }
                    if (bl) {
                        popupWindow = this.F;
                        n10 = this.e == -1 ? -1 : 0;
                        popupWindow.setWidth(n10);
                        this.F.setHeight(0);
                    } else {
                        popupWindow = this.F;
                        n10 = this.e == -1 ? -1 : 0;
                        popupWindow.setWidth(n10);
                        this.F.setHeight(-1);
                    }
                } else if (n10 != -2) {
                    n8 = n10;
                }
                popupWindow = this.F;
                if (this.n || this.m) {
                    bl3 = false;
                }
                popupWindow.setOutsideTouchable(bl3);
                PopupWindow popupWindow2 = this.F;
                popupWindow = this.t();
                n10 = this.f;
                int n11 = this.g;
                if (n9 < 0) {
                    n9 = -1;
                }
                if (n8 < 0) {
                    n8 = -1;
                }
                popupWindow2.update((View)popupWindow, n10, n11, n9, n8);
                return;
            }
        } else {
            int n12;
            int n13 = this.e;
            if (n13 == -1) {
                n12 = -1;
            } else {
                n12 = n13;
                if (n13 == -2) {
                    n12 = this.t().getWidth();
                }
            }
            n13 = this.d;
            if (n13 == -1) {
                n8 = -1;
            } else if (n13 != -2) {
                n8 = n13;
            }
            this.F.setWidth(n12);
            this.F.setHeight(n8);
            this.O(true);
            Object object = this.F;
            bl3 = !this.n && !this.m;
            object.setOutsideTouchable(bl3);
            this.F.setTouchInterceptor((View.OnTouchListener)this.x);
            if (this.k) {
                ax.h0.h.a(this.F, this.j);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                object = I;
                if (object != null) {
                    try {
                        ((Method)object).invoke(this.F, this.D);
                    }
                    catch (Exception exception) {
                        Log.e((String)"ListPopupWindow", (String)"Could not invoke setEpicenterBounds on PopupWindow", (Throwable)exception);
                    }
                }
            } else {
                ax.u.t$d.a(this.F, this.D);
            }
            ax.h0.h.c(this.F, this.t(), this.f, this.g, this.l);
            this.c.setSelection(-1);
            if (!this.E || this.c.isInTouchMode()) {
                this.r();
            }
            if (!this.E) {
                this.B.post((Runnable)this.z);
            }
        }
    }

    public int d() {
        return this.f;
    }

    @Override
    public void dismiss() {
        this.F.dismiss();
        this.C();
        this.F.setContentView(null);
        this.c = null;
        this.B.removeCallbacks((Runnable)this.w);
    }

    public void f(int n8) {
        this.f = n8;
    }

    public Drawable i() {
        return this.F.getBackground();
    }

    @Override
    public ListView j() {
        return this.c;
    }

    public void l(int n8) {
        this.g = n8;
        this.i = true;
    }

    public int o() {
        if (!this.i) {
            return 0;
        }
        return this.g;
    }

    public void p(ListAdapter object) {
        DataSetObserver dataSetObserver = this.r;
        if (dataSetObserver == null) {
            this.r = new f(this);
        } else {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                listAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = object;
        if (object != null) {
            object.registerDataSetObserver(this.r);
        }
        if ((object = this.c) != null) {
            object.setAdapter(this.b);
        }
    }

    public void r() {
        q q8 = this.c;
        if (q8 != null) {
            q8.setListSelectionHidden(true);
            q8.requestLayout();
        }
    }

    q s(Context context, boolean bl) {
        return new q(context, bl);
    }

    public View t() {
        return this.s;
    }

    public Object v() {
        if (!this.b()) {
            return null;
        }
        return this.c.getSelectedItem();
    }

    public long w() {
        if (!this.b()) {
            return Long.MIN_VALUE;
        }
        return this.c.getSelectedItemId();
    }

    public int x() {
        if (!this.b()) {
            return -1;
        }
        return this.c.getSelectedItemPosition();
    }

    public View y() {
        if (!this.b()) {
            return null;
        }
        return this.c.getSelectedView();
    }

    public int z() {
        return this.e;
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int n8, boolean bl) {
            return popupWindow.getMaxAvailableHeight(view, n8, bl);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean bl) {
            popupWindow.setIsClippedToScreen(bl);
        }
    }

    private class e
    implements Runnable {
        final t q;

        e(t t8) {
            this.q = t8;
        }

        @Override
        public void run() {
            this.q.r();
        }
    }

    private class f
    extends DataSetObserver {
        final t a;

        f(t t8) {
            this.a = t8;
        }

        public void onChanged() {
            if (this.a.b()) {
                this.a.c();
            }
        }

        public void onInvalidated() {
            this.a.dismiss();
        }
    }

    private class g
    implements AbsListView.OnScrollListener {
        final t a;

        g(t t8) {
            this.a = t8;
        }

        public void onScroll(AbsListView absListView, int n8, int n9, int n10) {
        }

        public void onScrollStateChanged(AbsListView object, int n8) {
            if (n8 == 1 && !this.a.A() && this.a.F.getContentView() != null) {
                object = this.a;
                object.B.removeCallbacks((Runnable)object.w);
                this.a.w.run();
            }
        }
    }

    private class h
    implements View.OnTouchListener {
        final t a;

        h(t t8) {
            this.a = t8;
        }

        public boolean onTouch(View object, MotionEvent motionEvent) {
            int n8 = motionEvent.getAction();
            int n9 = (int)motionEvent.getX();
            int n10 = (int)motionEvent.getY();
            if (n8 == 0 && (object = this.a.F) != null && object.isShowing() && n9 >= 0 && n9 < this.a.F.getWidth() && n10 >= 0 && n10 < this.a.F.getHeight()) {
                object = this.a;
                object.B.postDelayed((Runnable)object.w, 250L);
            } else if (n8 == 1) {
                object = this.a;
                object.B.removeCallbacks((Runnable)object.w);
            }
            return false;
        }
    }

    private class i
    implements Runnable {
        final t q;

        i(t t8) {
            this.q = t8;
        }

        @Override
        public void run() {
            Object object = this.q.c;
            if (object != null && object.isAttachedToWindow() && this.q.c.getCount() > this.q.c.getChildCount()) {
                int n8 = this.q.c.getChildCount();
                object = this.q;
                if (n8 <= ((t)object).o) {
                    ((t)object).F.setInputMethodMode(2);
                    this.q.c();
                }
            }
        }
    }
}

