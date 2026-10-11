/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.E;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.M;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.x;
import ax.c0.B;
import ax.c0.d0;
import ax.c0.t;
import ax.c0.w;
import ax.m.j;
import ax.n.a;
import ax.o.a;
import ax.s.b;
import ax.s.d;
import ax.u.A;
import ax.u.l;
import ax.u.y;
import ax.u.z;
import java.util.ArrayList;
import java.util.List;

public class Toolbar
extends ViewGroup
implements w {
    private ColorStateList A;
    private boolean B;
    private boolean C;
    private final ArrayList<View> D = new ArrayList();
    private final ArrayList<View> E = new ArrayList();
    private final int[] F = new int[2];
    final ax.c0.z G = new ax.c0.z(new z(this));
    private ArrayList<MenuItem> H = new ArrayList();
    h I;
    private final ActionMenuView.e J = new ActionMenuView.e(this){
        final Toolbar a;
        {
            this.a = toolbar;
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (this.a.G.h(menuItem)) {
                return true;
            }
            h h8 = this.a.I;
            if (h8 != null) {
                return h8.onMenuItemClick(menuItem);
            }
            return false;
        }
    };
    private M K;
    private c L;
    private f M;
    private j.a N;
    e.a O;
    private boolean P;
    private OnBackInvokedCallback Q;
    private OnBackInvokedDispatcher R;
    private boolean S;
    private final Runnable T = new Runnable(this){
        final Toolbar q;
        {
            this.q = toolbar;
        }

        @Override
        public void run() {
            this.q.R();
        }
    };
    ActionMenuView a;
    private TextView b;
    private TextView c;
    private ImageButton d;
    private ImageView e;
    private Drawable f;
    private CharSequence g;
    ImageButton h;
    View i;
    private Context j;
    private int k;
    private int l;
    private int m;
    int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private E t;
    private int u;
    private int v;
    private int w = 8388627;
    private CharSequence x;
    private CharSequence y;
    private ColorStateList z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.m.a.R);
    }

    public Toolbar(Context object, AttributeSet attributeSet, int n8) {
        super(object, attributeSet, n8);
        Object object2 = this.getContext();
        int[] nArray = ax.m.j.S2;
        object2 = androidx.appcompat.widget.L.v((Context)object2, attributeSet, nArray, n8, 0);
        d0.j0((View)this, object, nArray, attributeSet, ((L)object2).r(), n8, 0);
        this.l = ((L)object2).n(ax.m.j.u3, 0);
        this.m = ((L)object2).n(ax.m.j.l3, 0);
        this.w = ((L)object2).l(ax.m.j.T2, this.w);
        this.n = ((L)object2).l(ax.m.j.U2, 48);
        int n9 = ((L)object2).e(ax.m.j.o3, 0);
        int n10 = ax.m.j.t3;
        n8 = n9;
        if (((L)object2).s(n10)) {
            n8 = ((L)object2).e(n10, n9);
        }
        this.s = n8;
        this.r = n8;
        this.q = n8;
        this.p = n8;
        n8 = ((L)object2).e(ax.m.j.r3, -1);
        if (n8 >= 0) {
            this.p = n8;
        }
        if ((n8 = ((L)object2).e(ax.m.j.q3, -1)) >= 0) {
            this.q = n8;
        }
        if ((n8 = ((L)object2).e(ax.m.j.s3, -1)) >= 0) {
            this.r = n8;
        }
        if ((n8 = ((L)object2).e(ax.m.j.p3, -1)) >= 0) {
            this.s = n8;
        }
        this.o = ((L)object2).f(ax.m.j.f3, -1);
        n9 = ((L)object2).e(ax.m.j.b3, Integer.MIN_VALUE);
        int n11 = ((L)object2).e(ax.m.j.X2, Integer.MIN_VALUE);
        n8 = ((L)object2).f(ax.m.j.Z2, 0);
        n10 = ((L)object2).f(ax.m.j.a3, 0);
        this.h();
        this.t.e(n8, n10);
        if (n9 != Integer.MIN_VALUE || n11 != Integer.MIN_VALUE) {
            this.t.g(n9, n11);
        }
        this.u = ((L)object2).e(ax.m.j.c3, Integer.MIN_VALUE);
        this.v = ((L)object2).e(ax.m.j.Y2, Integer.MIN_VALUE);
        this.f = ((L)object2).g(ax.m.j.W2);
        this.g = ((L)object2).p(ax.m.j.V2);
        object = ((L)object2).p(ax.m.j.n3);
        if (!TextUtils.isEmpty((CharSequence)object)) {
            this.setTitle((CharSequence)object);
        }
        if (!TextUtils.isEmpty((CharSequence)(object = ((L)object2).p(ax.m.j.k3)))) {
            this.setSubtitle((CharSequence)object);
        }
        this.j = this.getContext();
        this.setPopupTheme(((L)object2).n(ax.m.j.j3, 0));
        object = ((L)object2).g(ax.m.j.i3);
        if (object != null) {
            this.setNavigationIcon((Drawable)object);
        }
        if (!TextUtils.isEmpty((CharSequence)(object = ((L)object2).p(ax.m.j.h3)))) {
            this.setNavigationContentDescription((CharSequence)object);
        }
        if ((object = ((L)object2).g(ax.m.j.d3)) != null) {
            this.setLogo((Drawable)object);
        }
        if (!TextUtils.isEmpty((CharSequence)(object = ((L)object2).p(ax.m.j.e3)))) {
            this.setLogoDescription((CharSequence)object);
        }
        if (((L)object2).s(n8 = ax.m.j.v3)) {
            this.setTitleTextColor(((L)object2).c(n8));
        }
        if (((L)object2).s(n8 = ax.m.j.m3)) {
            this.setSubtitleTextColor(((L)object2).c(n8));
        }
        if (((L)object2).s(n8 = ax.m.j.g3)) {
            this.x(((L)object2).n(n8, 0));
        }
        ((L)object2).x();
    }

    private int C(View view, int n8, int[] nArray, int n9) {
        g g8 = (g)view.getLayoutParams();
        int n10 = g8.leftMargin - nArray[0];
        n8 += Math.max(0, n10);
        nArray[0] = Math.max(0, -n10);
        n9 = this.q(view, n9);
        n10 = view.getMeasuredWidth();
        view.layout(n8, n9, n8 + n10, view.getMeasuredHeight() + n9);
        return n8 + (n10 + g8.rightMargin);
    }

    private int D(View view, int n8, int[] nArray, int n9) {
        g g8 = (g)view.getLayoutParams();
        int n10 = g8.rightMargin - nArray[1];
        n8 -= Math.max(0, n10);
        nArray[1] = Math.max(0, -n10);
        n9 = this.q(view, n9);
        n10 = view.getMeasuredWidth();
        view.layout(n8 - n10, n9, n8, view.getMeasuredHeight() + n9);
        return n8 - (n10 + g8.leftMargin);
    }

    private int E(View view, int n8, int n9, int n10, int n11, int[] nArray) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n12 = marginLayoutParams.leftMargin - nArray[0];
        int n13 = marginLayoutParams.rightMargin - nArray[1];
        int n14 = Math.max(0, n12) + Math.max(0, n13);
        nArray[0] = Math.max(0, -n12);
        nArray[1] = Math.max(0, -n13);
        view.measure(ViewGroup.getChildMeasureSpec((int)n8, (int)(this.getPaddingLeft() + this.getPaddingRight() + n14 + n9), (int)marginLayoutParams.width), ViewGroup.getChildMeasureSpec((int)n10, (int)(this.getPaddingTop() + this.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + n11), (int)marginLayoutParams.height));
        return view.getMeasuredWidth() + n14;
    }

    private void F(View view, int n8, int n9, int n10, int n11, int n12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n13 = ViewGroup.getChildMeasureSpec((int)n8, (int)(this.getPaddingLeft() + this.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + n9), (int)marginLayoutParams.width);
        n9 = ViewGroup.getChildMeasureSpec((int)n10, (int)(this.getPaddingTop() + this.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + n11), (int)marginLayoutParams.height);
        n10 = View.MeasureSpec.getMode((int)n9);
        n8 = n9;
        if (n10 != 0x40000000) {
            n8 = n9;
            if (n12 >= 0) {
                n8 = n12;
                if (n10 != 0) {
                    n8 = Math.min(View.MeasureSpec.getSize((int)n9), n12);
                }
                n8 = View.MeasureSpec.makeMeasureSpec((int)n8, (int)0x40000000);
            }
        }
        view.measure(n13, n8);
    }

    private void G() {
        Object object = this.getMenu();
        ArrayList<MenuItem> arrayList = this.getCurrentMenuItems();
        this.G.f((Menu)object, this.getMenuInflater());
        object = this.getCurrentMenuItems();
        ((ArrayList)object).removeAll(arrayList);
        this.H = object;
    }

    private void H() {
        this.removeCallbacks(this.T);
        this.post(this.T);
    }

    private boolean P() {
        if (!this.P) {
            return false;
        }
        int n8 = this.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = this.getChildAt(i8);
            if (!this.Q(view) || view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) continue;
            return false;
        }
        return true;
    }

    private boolean Q(View view) {
        return view != null && view.getParent() == this && view.getVisibility() != 8;
    }

    private void b(List<View> list, int n8) {
        int n9 = this.getLayoutDirection();
        int n10 = 0;
        n9 = n9 == 1 ? 1 : 0;
        int n11 = this.getChildCount();
        int n12 = ax.c0.t.b(n8, this.getLayoutDirection());
        list.clear();
        if (n9 != 0) {
            for (n8 = n11 - 1; n8 >= 0; --n8) {
                View view = this.getChildAt(n8);
                g g8 = (g)view.getLayoutParams();
                if (g8.b != 0 || !this.Q(view) || this.p(g8.a) != n12) continue;
                list.add(view);
            }
        } else {
            for (n8 = n10; n8 < n11; ++n8) {
                View view = this.getChildAt(n8);
                g g9 = (g)view.getLayoutParams();
                if (g9.b != 0 || !this.Q(view) || this.p(g9.a) != n12) continue;
                list.add(view);
            }
        }
    }

    private void c(View view, boolean bl) {
        Object object = view.getLayoutParams();
        object = object == null ? this.m() : (!this.checkLayoutParams((ViewGroup.LayoutParams)object) ? this.o((ViewGroup.LayoutParams)object) : (g)((Object)object));
        object.b = 1;
        if (bl && this.i != null) {
            view.setLayoutParams(object);
            this.E.add(view);
            return;
        }
        this.addView(view, (ViewGroup.LayoutParams)object);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<MenuItem>();
        Menu menu = this.getMenu();
        for (int i8 = 0; i8 < menu.size(); ++i8) {
            arrayList.add(menu.getItem(i8));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new d(this.getContext());
    }

    private void h() {
        if (this.t == null) {
            this.t = new E();
        }
    }

    private void i() {
        if (this.e == null) {
            this.e = new AppCompatImageView(this.getContext());
        }
    }

    private void j() {
        this.k();
        if (this.a.N() == null) {
            androidx.appcompat.view.menu.e e8 = (androidx.appcompat.view.menu.e)this.a.getMenu();
            if (this.M == null) {
                this.M = new f(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            e8.c(this.M, this.j);
            this.S();
        }
    }

    private void k() {
        if (this.a == null) {
            Object object;
            this.a = object = new ActionMenuView(this.getContext());
            object.setPopupTheme(this.k);
            this.a.setOnMenuItemClickListener(this.J);
            this.a.O(this.N, new e.a(this){
                final Toolbar a;
                {
                    this.a = toolbar;
                }

                @Override
                public boolean a(androidx.appcompat.view.menu.e e8, MenuItem menuItem) {
                    e.a a8 = this.a.O;
                    return a8 != null && a8.a(e8, menuItem);
                }

                @Override
                public void b(androidx.appcompat.view.menu.e e8) {
                    e.a a8;
                    if (!this.a.a.J()) {
                        this.a.G.i(e8);
                    }
                    if ((a8 = this.a.O) != null) {
                        a8.b(e8);
                    }
                }
            });
            object = this.m();
            ((a.a)((Object)object)).a = this.n & 0x70 | 0x800005;
            this.a.setLayoutParams((ViewGroup.LayoutParams)object);
            this.c((View)this.a, false);
        }
    }

    private void l() {
        if (this.d == null) {
            this.d = new p(this.getContext(), null, ax.m.a.Q);
            g g8 = this.m();
            g8.a = this.n & 0x70 | 0x800003;
            this.d.setLayoutParams((ViewGroup.LayoutParams)g8);
        }
    }

    private int p(int n8) {
        int n9 = this.getLayoutDirection();
        if ((n8 = ax.c0.t.b(n8, n9) & 7) != 1 && n8 != 3 && n8 != 5) {
            if (n9 == 1) {
                return 5;
            }
            return 3;
        }
        return n8;
    }

    private int q(View view, int n8) {
        g g8 = (g)view.getLayoutParams();
        int n9 = view.getMeasuredHeight();
        n8 = n8 > 0 ? (n9 - n8) / 2 : 0;
        int n10 = this.r(g8.a);
        if (n10 != 48) {
            if (n10 != 80) {
                int n11 = this.getPaddingTop();
                int n12 = this.getPaddingBottom();
                int n13 = this.getHeight();
                n10 = (n13 - n11 - n12 - n9) / 2;
                if (n10 >= (n8 = g8.topMargin)) {
                    n9 = n13 - n12 - n9 - n10 - n11;
                    n13 = g8.bottomMargin;
                    n8 = n10;
                    if (n9 < n13) {
                        n8 = Math.max(0, n10 - (n13 - n9));
                    }
                }
                return n11 + n8;
            }
            return this.getHeight() - this.getPaddingBottom() - n9 - g8.bottomMargin - n8;
        }
        return this.getPaddingTop() - n8;
    }

    private int r(int n8) {
        int n9;
        n8 = n9 = n8 & 0x70;
        if (n9 != 16) {
            n8 = n9;
            if (n9 != 48) {
                n8 = n9;
                if (n9 != 80) {
                    n8 = this.w & 0x70;
                }
            }
        }
        return n8;
    }

    private int s(View view) {
        view = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        return view.getMarginStart() + view.getMarginEnd();
    }

    private int t(View view) {
        view = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        return view.topMargin + view.bottomMargin;
    }

    private int u(List<View> list, int[] object) {
        int n8 = object[0];
        int n9 = object[1];
        int n10 = list.size();
        int n11 = 0;
        for (int i8 = 0; i8 < n10; ++i8) {
            object = list.get(i8);
            g g8 = (g)object.getLayoutParams();
            n8 = g8.leftMargin - n8;
            n9 = g8.rightMargin - n9;
            int n12 = Math.max(0, n8);
            int n13 = Math.max(0, n9);
            n8 = Math.max(0, -n8);
            n9 = Math.max(0, -n9);
            n11 += n12 + object.getMeasuredWidth() + n13;
        }
        return n11;
    }

    private boolean z(View view) {
        return view.getParent() == this || this.E.contains(view);
        {
        }
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.J();
    }

    void I() {
        for (int i8 = this.getChildCount() - 1; i8 >= 0; --i8) {
            View view = this.getChildAt(i8);
            if (((g)view.getLayoutParams()).b == 2 || view == this.a) continue;
            this.removeViewAt(i8);
            this.E.add(view);
        }
    }

    public void J(int n8, int n9) {
        this.h();
        this.t.e(n8, n9);
    }

    public void K(int n8, int n9) {
        this.h();
        this.t.g(n8, n9);
    }

    public void L(androidx.appcompat.view.menu.e e8, c c8) {
        androidx.appcompat.view.menu.e e9;
        block8: {
            block7: {
                if (e8 == null && this.a == null) break block7;
                this.k();
                e9 = this.a.N();
                if (e9 != e8) break block8;
            }
            return;
        }
        if (e9 != null) {
            e9.P(this.L);
            e9.P(this.M);
        }
        if (this.M == null) {
            this.M = new f(this);
        }
        c8.G(true);
        if (e8 != null) {
            e8.c(c8, this.j);
            e8.c(this.M, this.j);
        } else {
            c8.i(this.j, null);
            this.M.i(this.j, null);
            c8.d(true);
            this.M.d(true);
        }
        this.a.setPopupTheme(this.k);
        this.a.setPresenter(c8);
        this.L = c8;
        this.S();
    }

    public void M(j.a a8, e.a a9) {
        this.N = a8;
        this.O = a9;
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            actionMenuView.O(a8, a9);
        }
    }

    public void N(Context context, int n8) {
        this.m = n8;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextAppearance(context, n8);
        }
    }

    public void O(Context context, int n8) {
        this.l = n8;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextAppearance(context, n8);
        }
    }

    public boolean R() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.P();
    }

    void S() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = androidx.appcompat.widget.Toolbar$e.a((View)this);
            boolean bl = this.v() && onBackInvokedDispatcher != null && this.isAttachedToWindow() && this.S;
            if (bl && this.R == null) {
                if (this.Q == null) {
                    this.Q = androidx.appcompat.widget.Toolbar$e.b(new y(this));
                }
                androidx.appcompat.widget.Toolbar$e.c(onBackInvokedDispatcher, this.Q);
                this.R = onBackInvokedDispatcher;
                return;
            }
            if (!bl && (onBackInvokedDispatcher = this.R) != null) {
                androidx.appcompat.widget.Toolbar$e.d(onBackInvokedDispatcher, this.Q);
                this.R = null;
            }
        }
    }

    void a() {
        for (int i8 = this.E.size() - 1; i8 >= 0; --i8) {
            this.addView(this.E.get(i8));
        }
        this.E.clear();
    }

    @Override
    public void addMenuProvider(B b8) {
        this.G.c(b8);
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && layoutParams instanceof g;
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return this.getVisibility() == 0 && (actionMenuView = this.a) != null && actionMenuView.K();
    }

    public void e() {
        Object object = this.M;
        object = object == null ? null : ((f)object).b;
        if (object != null) {
            ((androidx.appcompat.view.menu.g)object).collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    void g() {
        if (this.h == null) {
            Object object = new p(this.getContext(), null, ax.m.a.Q);
            this.h = object;
            object.setImageDrawable(this.f);
            this.h.setContentDescription(this.g);
            object = this.m();
            ((a.a)((Object)object)).a = this.n & 0x70 | 0x800003;
            ((g)((Object)object)).b = 2;
            this.h.setLayoutParams((ViewGroup.LayoutParams)object);
            this.h.setOnClickListener(new View.OnClickListener(this){
                final Toolbar a;
                {
                    this.a = toolbar;
                }

                public void onClick(View view) {
                    this.a.e();
                }
            });
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        E e8 = this.t;
        if (e8 != null) {
            return e8.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int n8 = this.v;
        if (n8 != Integer.MIN_VALUE) {
            return n8;
        }
        return this.getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        E e8 = this.t;
        if (e8 != null) {
            return e8.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        E e8 = this.t;
        if (e8 != null) {
            return e8.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        E e8 = this.t;
        if (e8 != null) {
            return e8.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int n8 = this.u;
        if (n8 != Integer.MIN_VALUE) {
            return n8;
        }
        return this.getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        Object object = this.a;
        if (object != null && (object = ((ActionMenuView)object).N()) != null && ((androidx.appcompat.view.menu.e)object).hasVisibleItems()) {
            return Math.max(this.getContentInsetEnd(), Math.max(this.v, 0));
        }
        return this.getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (this.getLayoutDirection() == 1) {
            return this.getCurrentContentInsetEnd();
        }
        return this.getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (this.getLayoutDirection() == 1) {
            return this.getCurrentContentInsetStart();
        }
        return this.getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (this.getNavigationIcon() != null) {
            return Math.max(this.getContentInsetStart(), Math.max(this.u, 0));
        }
        return this.getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        this.j();
        return this.a.getMenu();
    }

    View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    c getOuterActionMenuPresenter() {
        return this.L;
    }

    public Drawable getOverflowIcon() {
        this.j();
        return this.a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.x;
    }

    public int getTitleMarginBottom() {
        return this.s;
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public int getTitleMarginTop() {
        return this.r;
    }

    final TextView getTitleTextView() {
        return this.b;
    }

    public l getWrapper() {
        if (this.K == null) {
            this.K = new M(this, true);
        }
        return this.K;
    }

    protected g m() {
        return new g(-2, -2);
    }

    public g n(AttributeSet attributeSet) {
        return new g(this.getContext(), attributeSet);
    }

    protected g o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g)layoutParams);
        }
        if (layoutParams instanceof a.a) {
            return new g((a.a)layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g((ViewGroup.MarginLayoutParams)layoutParams);
        }
        return new g(layoutParams);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.T);
        this.S();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int n8 = motionEvent.getActionMasked();
        if (n8 == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean bl = super.onHoverEvent(motionEvent);
            if (n8 == 9 && !bl) {
                this.C = true;
            }
        }
        if (n8 == 10 || n8 == 3) {
            this.C = false;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void onLayout(boolean var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        block44: {
            var8_6 = this.getLayoutDirection() == 1 ? 1 : 0;
            var12_7 = this.getWidth();
            var14_8 = this.getHeight();
            var7_9 = this.getPaddingLeft();
            var11_10 = this.getPaddingRight();
            var13_11 = this.getPaddingTop();
            var15_12 = this.getPaddingBottom();
            var9_13 = var12_7 - var11_10;
            var20_14 = this.F;
            var20_14[1] = 0;
            var20_14[0] = 0;
            var2_2 = d0.C((View)this);
            var6_15 = var2_2 >= 0 ? Math.min(var2_2, var5_5 - var3_3) : 0;
            if (!this.Q((View)this.d)) ** GOTO lbl23
            if (var8_6 != 0) {
                var5_5 = this.D((View)this.d, var9_13, var20_14, var6_15);
                var4_4 = var7_9;
            } else {
                var4_4 = this.C((View)this.d, var7_9, var20_14, var6_15);
lbl20:
                // 2 sources

                while (true) {
                    var5_5 = var9_13;
                    break block44;
                    break;
                }
lbl23:
                // 1 sources

                var4_4 = var7_9;
                ** continue;
            }
        }
        var2_2 = var4_4;
        var3_3 = var5_5;
        if (this.Q((View)this.h)) {
            if (var8_6 != 0) {
                var3_3 = this.D((View)this.h, var5_5, var20_14, var6_15);
                var2_2 = var4_4;
            } else {
                var2_2 = this.C((View)this.h, var4_4, var20_14, var6_15);
                var3_3 = var5_5;
            }
        }
        var5_5 = var2_2;
        var4_4 = var3_3;
        if (this.Q((View)this.a)) {
            if (var8_6 != 0) {
                var5_5 = this.C((View)this.a, var2_2, var20_14, var6_15);
                var4_4 = var3_3;
            } else {
                var4_4 = this.D((View)this.a, var3_3, var20_14, var6_15);
                var5_5 = var2_2;
            }
        }
        var3_3 = this.getCurrentContentInsetLeft();
        var2_2 = this.getCurrentContentInsetRight();
        var20_14[0] = Math.max(0, var3_3 - var5_5);
        var20_14[1] = Math.max(0, var2_2 - (var9_13 - var4_4));
        var3_3 = Math.max(var5_5, var3_3);
        var4_4 = Math.min(var4_4, var9_13 - var2_2);
        var2_2 = var3_3;
        var5_5 = var4_4;
        if (this.Q(this.i)) {
            if (var8_6 != 0) {
                var5_5 = this.D(this.i, var4_4, var20_14, var6_15);
                var2_2 = var3_3;
            } else {
                var2_2 = this.C(this.i, var3_3, var20_14, var6_15);
                var5_5 = var4_4;
            }
        }
        var4_4 = var2_2;
        var3_3 = var5_5;
        if (this.Q((View)this.e)) {
            if (var8_6 != 0) {
                var3_3 = this.D((View)this.e, var5_5, var20_14, var6_15);
                var4_4 = var2_2;
            } else {
                var4_4 = this.C((View)this.e, var2_2, var20_14, var6_15);
                var3_3 = var5_5;
            }
        }
        var1_1 = this.Q((View)this.b);
        var17_16 = this.Q((View)this.c);
        if (var1_1) {
            var18_17 = (g)this.b.getLayoutParams();
            var5_5 = var18_17.topMargin;
            var2_2 = this.b.getMeasuredHeight();
            var2_2 = var18_17.bottomMargin + (var5_5 + var2_2);
        } else {
            var2_2 = 0;
        }
        if (var17_16) {
            var18_17 = (g)this.c.getLayoutParams();
            var9_13 = var2_2 + (var18_17.topMargin + this.c.getMeasuredHeight() + var18_17.bottomMargin);
        } else {
            var9_13 = var2_2;
        }
        if (var1_1) ** GOTO lbl-1000
        var2_2 = var4_4;
        var5_5 = var3_3;
        if (!var17_16) lbl-1000:
        // 2 sources

        {
            while (true) {
                var4_4 = var5_5;
                break;
            }
        } else lbl-1000:
        // 2 sources

        {
            var18_17 = var1_1 != false ? this.b : this.c;
            var19_20 /* !! */  = var17_16 != false ? this.c : this.b;
            var18_17 = (g)var18_17.getLayoutParams();
            var19_20 /* !! */  = (g)var19_20 /* !! */ .getLayoutParams();
            var5_5 = var1_1 != false && this.b.getMeasuredWidth() > 0 || var17_16 != false && this.c.getMeasuredWidth() > 0 ? 1 : 0;
            var2_2 = this.w & 112;
            if (var2_2 != 48) {
                if (var2_2 != 80) {
                    var10_18 = (var14_8 - var13_11 - var15_12 - var9_13) / 2;
                    var16_19 = var18_17.topMargin;
                    var2_2 = this.r;
                    if (var10_18 < var16_19 + var2_2) {
                        var2_2 = var16_19 + var2_2;
                    } else {
                        var14_8 = var14_8 - var15_12 - var9_13 - var10_18 - var13_11;
                        var15_12 = var18_17.bottomMargin;
                        var9_13 = this.s;
                        var2_2 = var10_18;
                        if (var14_8 < var15_12 + var9_13) {
                            var2_2 = Math.max(0, var10_18 - (var19_20 /* !! */ .bottomMargin + var9_13 - var14_8));
                        }
                    }
                    var2_2 = var13_11 + var2_2;
                } else {
                    var2_2 = var14_8 - var15_12 - var19_20 /* !! */ .bottomMargin - this.s - var9_13;
                }
            } else {
                var2_2 = this.getPaddingTop() + var18_17.topMargin + this.r;
            }
            if (var8_6 != 0) {
                var8_6 = var5_5 != 0 ? this.p : 0;
                var3_3 -= Math.max(0, var8_6 -= var20_14[1]);
                var20_14[1] = Math.max(0, -var8_6);
                if (var1_1) {
                    var18_17 = (g)this.b.getLayoutParams();
                    var9_13 = var3_3 - this.b.getMeasuredWidth();
                    var8_6 = this.b.getMeasuredHeight() + var2_2;
                    this.b.layout(var9_13, var2_2, var3_3, var8_6);
                    var2_2 = var9_13 - this.q;
                    var9_13 = var8_6 + var18_17.bottomMargin;
                } else {
                    var8_6 = var3_3;
                    var9_13 = var2_2;
                    var2_2 = var8_6;
                }
                if (var17_16) {
                    var10_18 = var9_13 + ((g)this.c.getLayoutParams()).topMargin;
                    var8_6 = this.c.getMeasuredWidth();
                    var9_13 = this.c.getMeasuredHeight();
                    this.c.layout(var3_3 - var8_6, var10_18, var3_3, var9_13 + var10_18);
                    var8_6 = var3_3 - this.q;
                } else {
                    var8_6 = var3_3;
                }
                if (var5_5 != 0) {
                    var3_3 = Math.min(var2_2, var8_6);
                }
                var2_2 = var4_4;
                var5_5 = var3_3;
                ** continue;
            }
            var8_6 = var5_5 != 0 ? this.p : 0;
            var4_4 += Math.max(0, var8_6 -= var20_14[0]);
            var20_14[0] = Math.max(0, -var8_6);
            if (var1_1) {
                var18_17 = (g)this.b.getLayoutParams();
                var8_6 = this.b.getMeasuredWidth() + var4_4;
                var9_13 = this.b.getMeasuredHeight() + var2_2;
                this.b.layout(var4_4, var2_2, var8_6, var9_13);
                var8_6 += this.q;
                var2_2 = var9_13 + var18_17.bottomMargin;
            } else {
                var8_6 = var4_4;
            }
            if (var17_16) {
                var9_13 = var2_2 + ((g)this.c.getLayoutParams()).topMargin;
                var10_18 = this.c.getMeasuredWidth() + var4_4;
                var2_2 = this.c.getMeasuredHeight();
                this.c.layout(var4_4, var9_13, var10_18, var2_2 + var9_13);
                var9_13 = var10_18 + this.q;
            } else {
                var9_13 = var4_4;
            }
            var2_2 = var4_4;
            var4_4 = var3_3;
            if (var5_5 != 0) {
                var2_2 = Math.max(var8_6, var9_13);
                var4_4 = var3_3;
            }
        }
        var5_5 = 0;
        this.b(this.D, 3);
        var8_6 = this.D.size();
        for (var3_3 = 0; var3_3 < var8_6; ++var3_3) {
            var2_2 = this.C(this.D.get(var3_3), var2_2, var20_14, var6_15);
        }
        this.b(this.D, 5);
        var8_6 = this.D.size();
        for (var3_3 = 0; var3_3 < var8_6; ++var3_3) {
            var4_4 = this.D(this.D.get(var3_3), var4_4, var20_14, var6_15);
        }
        this.b(this.D, 1);
        var8_6 = this.u(this.D, var20_14);
        var3_3 = var7_9 + (var12_7 - var7_9 - var11_10) / 2 - var8_6 / 2;
        var7_9 = var8_6 + var3_3;
        if (var3_3 >= var2_2) {
            var2_2 = var7_9 > var4_4 ? var3_3 - (var7_9 - var4_4) : var3_3;
        }
        var4_4 = this.D.size();
        var3_3 = var2_2;
        for (var2_2 = var5_5; var2_2 < var4_4; ++var2_2) {
            var3_3 = this.C(this.D.get(var2_2), var3_3, var20_14, var6_15);
        }
        this.D.clear();
    }

    protected void onMeasure(int n8, int n9) {
        int n10;
        int n11;
        int n12;
        int n13;
        int[] nArray = this.F;
        int n132 = androidx.appcompat.widget.O.b((View)this);
        int n14 = 0;
        if (this.Q((View)this.d)) {
            this.F((View)this.d, n8, 0, n9, 0, this.o);
            n13 = this.d.getMeasuredWidth() + this.s((View)this.d);
            n12 = Math.max(0, this.d.getMeasuredHeight() + this.t((View)this.d));
            n11 = View.combineMeasuredStates((int)0, (int)this.d.getMeasuredState());
        } else {
            n13 = 0;
            n12 = 0;
            n11 = 0;
        }
        int n15 = n13;
        int n16 = n12;
        n13 = n11;
        if (this.Q((View)this.h)) {
            this.F((View)this.h, n8, 0, n9, 0, this.o);
            n15 = this.h.getMeasuredWidth() + this.s((View)this.h);
            n16 = Math.max(n12, this.h.getMeasuredHeight() + this.t((View)this.h));
            n13 = View.combineMeasuredStates((int)n11, (int)this.h.getMeasuredState());
        }
        n11 = this.getCurrentContentInsetStart();
        n12 = Math.max(n11, n15);
        nArray[n132] = Math.max(0, n11 - n15);
        if (this.Q((View)this.a)) {
            this.F((View)this.a, n8, n12, n9, 0, this.o);
            n11 = this.a.getMeasuredWidth() + this.s((View)this.a);
            n16 = Math.max(n16, this.a.getMeasuredHeight() + this.t((View)this.a));
            n13 = View.combineMeasuredStates((int)n13, (int)this.a.getMeasuredState());
        } else {
            n11 = 0;
        }
        n15 = this.getCurrentContentInsetEnd();
        int n17 = n12 + Math.max(n15, n11);
        nArray[n132 ^ 1] = Math.max(0, n15 - n11);
        if (this.Q(this.i)) {
            n17 += this.E(this.i, n8, n17, n9, 0, nArray);
            n15 = Math.max(n16, this.i.getMeasuredHeight() + this.t(this.i));
            n11 = View.combineMeasuredStates((int)n13, (int)this.i.getMeasuredState());
        } else {
            n11 = n13;
            n15 = n16;
        }
        n13 = n17;
        n12 = n15;
        n16 = n11;
        if (this.Q((View)this.e)) {
            n13 = n17 + this.E((View)this.e, n8, n17, n9, 0, nArray);
            n12 = Math.max(n15, this.e.getMeasuredHeight() + this.t((View)this.e));
            n16 = View.combineMeasuredStates((int)n11, (int)this.e.getMeasuredState());
        }
        n17 = this.getChildCount();
        n15 = n12;
        for (n11 = 0; n11 < n17; ++n11) {
            View view = this.getChildAt(n11);
            if (((g)view.getLayoutParams()).b != 0 || !this.Q(view)) continue;
            n13 += this.E(view, n8, n13, n9, 0, nArray);
            n15 = Math.max(n15, view.getMeasuredHeight() + this.t(view));
            n16 = View.combineMeasuredStates((int)n16, (int)view.getMeasuredState());
        }
        int n18 = this.r + this.s;
        int n19 = this.p + this.q;
        if (this.Q((View)this.b)) {
            this.E((View)this.b, n8, n13 + n19, n9, n18, nArray);
            int n20 = this.b.getMeasuredWidth();
            n12 = this.s((View)this.b);
            n11 = this.b.getMeasuredHeight();
            n17 = this.t((View)this.b);
            n16 = View.combineMeasuredStates((int)n16, (int)this.b.getMeasuredState());
            n12 = n20 + n12;
            n11 += n17;
        } else {
            n12 = 0;
            n11 = 0;
        }
        int n21 = n12;
        int n22 = n11;
        n17 = n16;
        if (this.Q((View)this.c)) {
            n10 = Math.max(n12, this.E((View)this.c, n8, n13 + n19, n9, n18 + n11, nArray));
            n22 = n11 + (this.c.getMeasuredHeight() + this.t((View)this.c));
            n17 = View.combineMeasuredStates((int)n16, (int)this.c.getMeasuredState());
        }
        n11 = Math.max(n15, n22);
        n22 = this.getPaddingLeft();
        n15 = this.getPaddingRight();
        n12 = this.getPaddingTop();
        n16 = this.getPaddingBottom();
        n13 = View.resolveSizeAndState((int)Math.max(n13 + n10 + (n22 + n15), this.getSuggestedMinimumWidth()), (int)n8, (int)(0xFF000000 & n17));
        n8 = View.resolveSizeAndState((int)Math.max(n11 + (n12 + n16), this.getSuggestedMinimumHeight()), (int)n9, (int)(n17 << 16));
        if (this.P()) {
            n8 = n14;
        }
        this.setMeasuredDimension(n13, n8);
    }

    protected void onRestoreInstanceState(Parcelable object) {
        if (!(object instanceof i)) {
            super.onRestoreInstanceState((Parcelable)object);
            return;
        }
        i i8 = (i)object;
        super.onRestoreInstanceState(i8.a());
        object = this.a;
        object = object != null ? ((ActionMenuView)object).N() : null;
        int n8 = i8.d0;
        if (n8 != 0 && this.M != null && object != null && (object = object.findItem(n8)) != null) {
            object.expandActionView();
        }
        if (i8.e0) {
            this.H();
        }
    }

    public void onRtlPropertiesChanged(int n8) {
        super.onRtlPropertiesChanged(n8);
        this.h();
        E e8 = this.t;
        boolean bl = true;
        if (n8 != 1) {
            bl = false;
        }
        e8.f(bl);
    }

    protected Parcelable onSaveInstanceState() {
        i i8 = new i(super.onSaveInstanceState());
        Object object = this.M;
        if (object != null && (object = ((f)object).b) != null) {
            i8.d0 = ((androidx.appcompat.view.menu.g)object).getItemId();
        }
        i8.e0 = this.B();
        return i8;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n8 = motionEvent.getActionMasked();
        if (n8 == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean bl = super.onTouchEvent(motionEvent);
            if (n8 == 0 && !bl) {
                this.B = true;
            }
        }
        if (n8 == 1 || n8 == 3) {
            this.B = false;
        }
        return true;
    }

    @Override
    public void removeMenuProvider(B b8) {
        this.G.j(b8);
    }

    public void setBackInvokedCallbackEnabled(boolean bl) {
        if (this.S != bl) {
            this.S = bl;
            this.S();
        }
    }

    public void setCollapseContentDescription(int n8) {
        CharSequence charSequence = n8 != 0 ? this.getContext().getText(n8) : null;
        this.setCollapseContentDescription(charSequence);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        ImageButton imageButton;
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            this.g();
        }
        if ((imageButton = this.h) != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int n8) {
        this.setCollapseIcon(ax.o.a.b(this.getContext(), n8));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            this.g();
            this.h.setImageDrawable(drawable);
            return;
        }
        drawable = this.h;
        if (drawable != null) {
            drawable.setImageDrawable(this.f);
        }
    }

    public void setCollapsible(boolean bl) {
        this.P = bl;
        this.requestLayout();
    }

    public void setContentInsetEndWithActions(int n8) {
        int n9 = n8;
        if (n8 < 0) {
            n9 = Integer.MIN_VALUE;
        }
        if (n9 != this.v) {
            this.v = n9;
            if (this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int n8) {
        int n9 = n8;
        if (n8 < 0) {
            n9 = Integer.MIN_VALUE;
        }
        if (n9 != this.u) {
            this.u = n9;
            if (this.getNavigationIcon() != null) {
                this.requestLayout();
            }
        }
    }

    public void setLogo(int n8) {
        this.setLogo(ax.o.a.b(this.getContext(), n8));
    }

    public void setLogo(Drawable drawable) {
        ImageView imageView;
        if (drawable != null) {
            this.i();
            if (!this.z((View)this.e)) {
                this.c((View)this.e, true);
            }
        } else {
            imageView = this.e;
            if (imageView != null && this.z((View)imageView)) {
                this.removeView((View)this.e);
                this.E.remove(this.e);
            }
        }
        if ((imageView = this.e) != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int n8) {
        this.setLogoDescription(this.getContext().getText(n8));
    }

    public void setLogoDescription(CharSequence charSequence) {
        ImageView imageView;
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            this.i();
        }
        if ((imageView = this.e) != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int n8) {
        CharSequence charSequence = n8 != 0 ? this.getContext().getText(n8) : null;
        this.setNavigationContentDescription(charSequence);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        ImageButton imageButton;
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            this.l();
        }
        if ((imageButton = this.d) != null) {
            imageButton.setContentDescription(charSequence);
            ax.u.B.a((View)this.d, charSequence);
        }
    }

    public void setNavigationIcon(int n8) {
        this.setNavigationIcon(ax.o.a.b(this.getContext(), n8));
    }

    public void setNavigationIcon(Drawable drawable) {
        ImageButton imageButton;
        if (drawable != null) {
            this.l();
            if (!this.z((View)this.d)) {
                this.c((View)this.d, true);
            }
        } else {
            imageButton = this.d;
            if (imageButton != null && this.z((View)imageButton)) {
                this.removeView((View)this.d);
                this.E.remove(this.d);
            }
        }
        if ((imageButton = this.d) != null) {
            imageButton.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        this.l();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h h8) {
        this.I = h8;
    }

    public void setOverflowIcon(Drawable drawable) {
        this.j();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int n8) {
        if (this.k != n8) {
            this.k = n8;
            if (n8 == 0) {
                this.j = this.getContext();
                return;
            }
            this.j = new ContextThemeWrapper(this.getContext(), n8);
        }
    }

    public void setSubtitle(int n8) {
        this.setSubtitle(this.getContext().getText(n8));
    }

    public void setSubtitle(CharSequence charSequence) {
        TextView textView;
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            if (this.c == null) {
                textView = this.getContext();
                x x8 = new x((Context)textView);
                this.c = x8;
                x8.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int n8 = this.m;
                if (n8 != 0) {
                    this.c.setTextAppearance((Context)textView, n8);
                }
                if ((textView = this.A) != null) {
                    this.c.setTextColor((ColorStateList)textView);
                }
            }
            if (!this.z((View)this.c)) {
                this.c((View)this.c, true);
            }
        } else {
            textView = this.c;
            if (textView != null && this.z((View)textView)) {
                this.removeView((View)this.c);
                this.E.remove(this.c);
            }
        }
        if ((textView = this.c) != null) {
            textView.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setSubtitleTextColor(int n8) {
        this.setSubtitleTextColor(ColorStateList.valueOf((int)n8));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int n8) {
        this.setTitle(this.getContext().getText(n8));
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            if (this.b == null) {
                Context context = this.getContext();
                this.b = textView = new x(context);
                textView.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int n8 = this.l;
                if (n8 != 0) {
                    this.b.setTextAppearance(context, n8);
                }
                if ((textView = this.z) != null) {
                    this.b.setTextColor((ColorStateList)textView);
                }
            }
            if (!this.z((View)this.b)) {
                this.c((View)this.b, true);
            }
        } else {
            textView = this.b;
            if (textView != null && this.z((View)textView)) {
                this.removeView((View)this.b);
                this.E.remove(this.b);
            }
        }
        if ((textView = this.b) != null) {
            textView.setText(charSequence);
        }
        this.x = charSequence;
    }

    public void setTitleMarginBottom(int n8) {
        this.s = n8;
        this.requestLayout();
    }

    public void setTitleMarginEnd(int n8) {
        this.q = n8;
        this.requestLayout();
    }

    public void setTitleMarginStart(int n8) {
        this.p = n8;
        this.requestLayout();
    }

    public void setTitleMarginTop(int n8) {
        this.r = n8;
        this.requestLayout();
    }

    public void setTitleTextColor(int n8) {
        this.setTitleTextColor(ColorStateList.valueOf((int)n8));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean v() {
        f f8 = this.M;
        return f8 != null && f8.b != null;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int n8) {
        this.getMenuInflater().inflate(n8, this.getMenu());
    }

    public void y() {
        ArrayList<MenuItem> arrayList = this.H;
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            MenuItem menuItem = arrayList.get(i8);
            this.getMenu().removeItem(menuItem.getItemId());
        }
        this.G();
    }

    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Runnable runnable2) {
            j.Objects.requireNonNull((Object)runnable2);
            return new A(runnable2);
        }

        static void c(Object object, Object object2) {
            ((OnBackInvokedDispatcher)object).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback)object2);
        }

        static void d(Object object, Object object2) {
            ((OnBackInvokedDispatcher)object).unregisterOnBackInvokedCallback((OnBackInvokedCallback)object2);
        }
    }

    private class f
    implements androidx.appcompat.view.menu.j {
        androidx.appcompat.view.menu.e a;
        androidx.appcompat.view.menu.g b;
        final Toolbar c;

        f(Toolbar toolbar) {
            this.c = toolbar;
        }

        @Override
        public void a(androidx.appcompat.view.menu.e e8, boolean bl) {
        }

        @Override
        public void d(boolean bl) {
            if (this.b != null) {
                androidx.appcompat.view.menu.e e8 = this.a;
                if (e8 != null) {
                    int n8 = e8.size();
                    for (int i8 = 0; i8 < n8; ++i8) {
                        if (this.a.getItem(i8) != this.b) continue;
                        return;
                    }
                }
                this.f(this.a, this.b);
            }
        }

        @Override
        public boolean e() {
            return false;
        }

        @Override
        public boolean f(androidx.appcompat.view.menu.e object, androidx.appcompat.view.menu.g g8) {
            object = this.c.i;
            if (object instanceof b) {
                ((b)object).f();
            }
            object = this.c;
            object.removeView(((Toolbar)object).i);
            object = this.c;
            object.removeView((View)((Toolbar)object).h);
            object = this.c;
            ((Toolbar)object).i = null;
            ((Toolbar)object).a();
            this.b = null;
            this.c.requestLayout();
            g8.r(false);
            this.c.S();
            return true;
        }

        @Override
        public boolean g(androidx.appcompat.view.menu.e object, androidx.appcompat.view.menu.g g8) {
            this.c.g();
            Object object2 = this.c.h.getParent();
            object = this.c;
            if (object2 != object) {
                if (object2 instanceof ViewGroup) {
                    ((ViewGroup)object2).removeView((View)((Toolbar)object).h);
                }
                object = this.c;
                object.addView((View)((Toolbar)object).h);
            }
            this.c.i = g8.getActionView();
            this.b = g8;
            object = this.c.i.getParent();
            if (object != (object2 = this.c)) {
                if (object instanceof ViewGroup) {
                    ((ViewGroup)object).removeView(object2.i);
                }
                object2 = this.c.m();
                object = this.c;
                object2.a = ((Toolbar)object).n & 0x70 | 0x800003;
                object2.b = 2;
                ((Toolbar)object).i.setLayoutParams((ViewGroup.LayoutParams)object2);
                object = this.c;
                object.addView(((Toolbar)object).i);
            }
            this.c.I();
            this.c.requestLayout();
            g8.r(true);
            object = this.c.i;
            if (object instanceof b) {
                ((b)object).c();
            }
            this.c.S();
            return true;
        }

        @Override
        public void i(Context object, androidx.appcompat.view.menu.e e8) {
            androidx.appcompat.view.menu.e e9 = this.a;
            if (e9 != null && (object = this.b) != null) {
                e9.f((androidx.appcompat.view.menu.g)object);
            }
            this.a = e8;
        }

        @Override
        public boolean k(m m8) {
            return false;
        }
    }

    public static class g
    extends a.a {
        int b = 0;

        public g(int n8, int n9) {
            super(n8, n9);
            this.a = 8388627;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams)marginLayoutParams);
            this.a(marginLayoutParams);
        }

        public g(g g8) {
            super(g8);
            this.b = g8.b;
        }

        public g(a.a a8) {
            super(a8);
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public static interface h {
        public boolean onMenuItemClick(MenuItem var1);
    }

    public static class i
    extends ax.k0.a {
        public static final Parcelable.Creator<i> CREATOR = new Parcelable.ClassLoaderCreator<i>(){

            public i a(Parcel parcel) {
                return new i(parcel, null);
            }

            public i b(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            public i[] c(int n8) {
                return new i[n8];
            }
        };
        int d0;
        boolean e0;

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d0 = parcel.readInt();
            boolean bl = parcel.readInt() != 0;
            this.e0 = bl;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override
        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeInt(this.d0);
            parcel.writeInt(this.e0 ? 1 : 0);
        }
    }
}

