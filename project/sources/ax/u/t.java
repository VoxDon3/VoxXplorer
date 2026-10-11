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
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import ax.m.C2506a;
import ax.t.InterfaceC3093e;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class t implements InterfaceC3093e {
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
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private boolean m;
    private boolean n;
    int o;
    private View p;
    private int q;
    private DataSetObserver r;
    private View s;
    private Drawable t;
    private AdapterView.OnItemClickListener u;
    private AdapterView.OnItemSelectedListener v;
    final i w;
    private final h x;
    private final g y;
    private final e z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View t = t.this.t();
            if (t == null || t.getWindowToken() == null) {
                return;
            }
            t.this.c();
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t.this.r();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (t.this.b()) {
                t.this.c();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            t.this.dismiss();
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = t.this.F) != null && popupWindow.isShowing() && x >= 0 && x < t.this.F.getWidth() && y >= 0 && y < t.this.F.getHeight()) {
                t tVar = t.this;
                tVar.B.postDelayed(tVar.w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            t tVar2 = t.this;
            tVar2.B.removeCallbacks(tVar2.w);
            return false;
        }
    }

    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q qVar = t.this.c;
            if (qVar == null || !qVar.isAttachedToWindow() || t.this.c.getCount() <= t.this.c.getChildCount()) {
                return;
            }
            int childCount = t.this.c.getChildCount();
            t tVar = t.this;
            if (childCount <= tVar.o) {
                tVar.F.setInputMethodMode(2);
                t.this.c();
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i2 <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public t(Context context) {
        this(context, null, C2506a.G);
    }

    private void C() {
        View view = this.p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.p);
            }
        }
    }

    private void O(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.F, z);
            return;
        }
        Method method = G;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int q() {
        int i2;
        int i3;
        int makeMeasureSpec;
        int i4;
        if (this.c == null) {
            Context context = this.a;
            this.A = new a();
            q s = s(context, !this.E);
            this.c = s;
            Drawable drawable = this.t;
            if (drawable != null) {
                s.setSelector(drawable);
            }
            this.c.setAdapter(this.b);
            this.c.setOnItemClickListener(this.u);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new b());
            this.c.setOnScrollListener(this.y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.v;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.c;
            View view2 = this.p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i5 = this.q;
                if (i5 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i5 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.q);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i6 = this.e;
                if (i6 >= 0) {
                    i4 = Integer.MIN_VALUE;
                } else {
                    i6 = 0;
                    i4 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i6, i4), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i2 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i2 = 0;
            }
            this.F.setContentView(view);
        } else {
            View view3 = this.p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i2 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i2 = 0;
            }
        }
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            int i7 = rect.top;
            i3 = rect.bottom + i7;
            if (!this.i) {
                this.g = -i7;
            }
        } else {
            this.C.setEmpty();
            i3 = 0;
        }
        int u = u(t(), this.g, this.F.getInputMethodMode() == 2);
        if (this.m || this.d == -1) {
            return u + i3;
        }
        int i8 = this.e;
        if (i8 == -2) {
            int i9 = this.a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.C;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i8 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        } else {
            int i10 = this.a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.C;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - (rect3.left + rect3.right), 1073741824);
        }
        int d2 = this.c.d(makeMeasureSpec, 0, -1, u - i2, -1);
        if (d2 > 0) {
            i2 += i3 + this.c.getPaddingTop() + this.c.getPaddingBottom();
        }
        return d2 + i2;
    }

    private int u(View view, int i2, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return c.a(this.F, view, i2, z);
        }
        Method method = H;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.F, view, Integer.valueOf(i2), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.F.getMaxAvailableHeight(view, i2);
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

    public void E(int i2) {
        this.F.setAnimationStyle(i2);
    }

    public void F(int i2) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            R(i2);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.e = rect.left + rect.right + i2;
    }

    public void G(int i2) {
        this.l = i2;
    }

    public void H(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void I(int i2) {
        this.F.setInputMethodMode(i2);
    }

    public void J(boolean z) {
        this.E = z;
        this.F.setFocusable(z);
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

    public void N(boolean z) {
        this.k = true;
        this.j = z;
    }

    public void P(int i2) {
        this.q = i2;
    }

    public void Q(int i2) {
        q qVar = this.c;
        if (!b() || qVar == null) {
            return;
        }
        qVar.setListSelectionHidden(false);
        qVar.setSelection(i2);
        if (qVar.getChoiceMode() != 0) {
            qVar.setItemChecked(i2, true);
        }
    }

    public void R(int i2) {
        this.e = i2;
    }

    public void a(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    @Override // ax.t.InterfaceC3093e
    public boolean b() {
        return this.F.isShowing();
    }

    @Override // ax.t.InterfaceC3093e
    public void c() {
        int q = q();
        boolean A = A();
        ax.h0.h.b(this.F, this.h);
        if (this.F.isShowing()) {
            if (t().isAttachedToWindow()) {
                int i2 = this.e;
                if (i2 == -1) {
                    i2 = -1;
                } else if (i2 == -2) {
                    i2 = t().getWidth();
                }
                int i3 = this.d;
                if (i3 == -1) {
                    if (!A) {
                        q = -1;
                    }
                    if (A) {
                        this.F.setWidth(this.e == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.e == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i3 != -2) {
                    q = i3;
                }
                this.F.setOutsideTouchable((this.n || this.m) ? false : true);
                this.F.update(t(), this.f, this.g, i2 < 0 ? -1 : i2, q < 0 ? -1 : q);
                return;
            }
            return;
        }
        int i4 = this.e;
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = t().getWidth();
        }
        int i5 = this.d;
        if (i5 == -1) {
            q = -1;
        } else if (i5 != -2) {
            q = i5;
        }
        this.F.setWidth(i4);
        this.F.setHeight(q);
        O(true);
        this.F.setOutsideTouchable((this.n || this.m) ? false : true);
        this.F.setTouchInterceptor(this.x);
        if (this.k) {
            ax.h0.h.a(this.F, this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = I;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            d.a(this.F, this.D);
        }
        ax.h0.h.c(this.F, t(), this.f, this.g, this.l);
        this.c.setSelection(-1);
        if (!this.E || this.c.isInTouchMode()) {
            r();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.z);
    }

    public int d() {
        return this.f;
    }

    @Override // ax.t.InterfaceC3093e
    public void dismiss() {
        this.F.dismiss();
        C();
        this.F.setContentView(null);
        this.c = null;
        this.B.removeCallbacks(this.w);
    }

    public void f(int i2) {
        this.f = i2;
    }

    public Drawable i() {
        return this.F.getBackground();
    }

    @Override // ax.t.InterfaceC3093e
    public ListView j() {
        return this.c;
    }

    public void l(int i2) {
        this.g = i2;
        this.i = true;
    }

    public int o() {
        if (this.i) {
            return this.g;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.r;
        if (dataSetObserver == null) {
            this.r = new f();
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.r);
        }
        q qVar = this.c;
        if (qVar != null) {
            qVar.setAdapter(this.b);
        }
    }

    public void r() {
        q qVar = this.c;
        if (qVar != null) {
            qVar.setListSelectionHidden(true);
            qVar.requestLayout();
        }
    }

    q s(Context context, boolean z) {
        return new q(context, z);
    }

    public View t() {
        return this.s;
    }

    public Object v() {
        if (b()) {
            return this.c.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (b()) {
            return this.c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (b()) {
            return this.c.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (b()) {
            return this.c.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.e;
    }

    public t(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public t(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.d = -2;
        this.e = -2;
        this.h = 1002;
        this.l = 0;
        this.m = false;
        this.n = false;
        this.o = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.q = 0;
        this.w = new i();
        this.x = new h();
        this.y = new g();
        this.z = new e();
        this.C = new Rect();
        this.a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ax.m.j.l1, i2, i3);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(ax.m.j.m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(ax.m.j.n1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        C3156a c3156a = new C3156a(context, attributeSet, i2, i3);
        this.F = c3156a;
        c3156a.setInputMethodMode(1);
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            q qVar;
            if (i == -1 || (qVar = t.this.c) == null) {
                return;
            }
            qVar.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || t.this.A() || t.this.F.getContentView() == null) {
                return;
            }
            t tVar = t.this;
            tVar.B.removeCallbacks(tVar.w);
            t.this.w.run();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }
    }
}
