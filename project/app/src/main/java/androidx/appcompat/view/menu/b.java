/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import ax.c0.t;
import ax.m.g;
import ax.u.u;
import ax.u.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class b
extends h
implements j,
View.OnKeyListener,
PopupWindow.OnDismissListener {
    private static final int B = ax.m.g.e;
    boolean A;
    private final Context b;
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;
    final Handler g;
    private final List<e> h = new ArrayList<e>();
    final List<d> i = new ArrayList<d>();
    final ViewTreeObserver.OnGlobalLayoutListener j = new ViewTreeObserver.OnGlobalLayoutListener(this){
        final b a;
        {
            this.a = b8;
        }

        public void onGlobalLayout() {
            if (this.a.b() && this.a.i.size() > 0 && !this.a.i.get((int)0).a.B()) {
                Object object = this.a.p;
                if (object != null && object.isShown()) {
                    object = this.a.i.iterator();
                    while (object.hasNext()) {
                        ((d)object.next()).a.c();
                    }
                } else {
                    this.a.dismiss();
                }
            }
        }
    };
    private final View.OnAttachStateChangeListener k = new View.OnAttachStateChangeListener(this){
        final b a;
        {
            this.a = b8;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            Object object = this.a.y;
            if (object != null) {
                if (!object.isAlive()) {
                    this.a.y = view.getViewTreeObserver();
                }
                object = this.a;
                object.y.removeGlobalOnLayoutListener(object.j);
            }
            view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        }
    };
    private final u l = new u(this){
        final b a;
        {
            this.a = b8;
        }

        @Override
        public void e(e e8, MenuItem object) {
            int n8;
            d d8;
            block4: {
                Handler handler = this.a.g;
                d8 = null;
                handler.removeCallbacksAndMessages(null);
                int n9 = this.a.i.size();
                for (n8 = 0; n8 < n9; ++n8) {
                    if (e8 != this.a.i.get((int)n8).b) {
                        continue;
                    }
                    break block4;
                }
                n8 = -1;
            }
            if (n8 == -1) {
                return;
            }
            if (++n8 < this.a.i.size()) {
                d8 = this.a.i.get(n8);
            }
            object = new Runnable(){
                final MenuItem c0;
                final e d0;
                final c e0;
                final d q;
                {
                    this.e0 = c8;
                    this.q = d8;
                    this.c0 = menuItem;
                    this.d0 = e8;
                }

                @Override
                public void run() {
                    d d8 = this.q;
                    if (d8 != null) {
                        this.e0.a.A = true;
                        d8.b.e(false);
                        this.e0.a.A = false;
                    }
                    if (this.c0.isEnabled() && this.c0.hasSubMenu()) {
                        this.d0.M(this.c0, 4);
                    }
                }
            };
            long l8 = SystemClock.uptimeMillis();
            this.a.g.postAtTime((Runnable)object, (Object)e8, l8 + 200L);
        }

        @Override
        public void h(e e8, MenuItem menuItem) {
            this.a.g.removeCallbacksAndMessages((Object)e8);
        }
    };
    private int m = 0;
    private int n = 0;
    private View o;
    View p;
    private int q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private j.a x;
    ViewTreeObserver y;
    private PopupWindow.OnDismissListener z;

    public b(Context context, View view, int n8, int n9, boolean bl) {
        this.b = context;
        this.o = view;
        this.d = n8;
        this.e = n9;
        this.f = bl;
        this.v = false;
        this.q = this.D();
        context = context.getResources();
        this.c = Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(ax.m.d.d));
        this.g = new Handler();
    }

    private int A(e e8) {
        int n8 = this.i.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (e8 != this.i.get((int)i8).b) continue;
            return i8;
        }
        return -1;
    }

    private MenuItem B(e e8, e e9) {
        int n8 = e8.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            MenuItem menuItem = e8.getItem(i8);
            if (!menuItem.hasSubMenu() || e9 != menuItem.getSubMenu()) continue;
            return menuItem;
        }
        return null;
    }

    private View C(d object, e e8) {
        int n8;
        int n9;
        ListView listView;
        block7: {
            if ((e8 = this.B(((d)object).b, e8)) == null) {
                return null;
            }
            listView = ((d)object).a();
            object = listView.getAdapter();
            boolean bl = object instanceof HeaderViewListAdapter;
            n9 = 0;
            if (bl) {
                object = (HeaderViewListAdapter)object;
                n8 = object.getHeadersCount();
                object = (androidx.appcompat.view.menu.d)object.getWrappedAdapter();
            } else {
                object = (androidx.appcompat.view.menu.d)((Object)object);
                n8 = 0;
            }
            int n10 = ((androidx.appcompat.view.menu.d)((Object)object)).getCount();
            while (n9 < n10) {
                if (e8 != ((androidx.appcompat.view.menu.d)((Object)object)).c(n9)) {
                    ++n9;
                    continue;
                }
                break block7;
            }
            n9 = -1;
        }
        if (n9 == -1) {
            return null;
        }
        if ((n9 = n9 + n8 - listView.getFirstVisiblePosition()) >= 0 && n9 < listView.getChildCount()) {
            return listView.getChildAt(n9);
        }
        return null;
    }

    private int D() {
        if (this.o.getLayoutDirection() == 1) {
            return 0;
        }
        return 1;
    }

    private int E(int n8) {
        ListView listView = this.i;
        listView = listView.get(listView.size() - 1).a();
        int[] nArray = new int[2];
        listView.getLocationOnScreen(nArray);
        Rect rect = new Rect();
        this.p.getWindowVisibleDisplayFrame(rect);
        if (this.q == 1) {
            if (nArray[0] + listView.getWidth() + n8 > rect.right) {
                return 0;
            }
            return 1;
        }
        if (nArray[0] - n8 < 0) {
            return 1;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void F(e var1_1) {
        var9_2 = LayoutInflater.from((Context)this.b);
        var6_3 = new androidx.appcompat.view.menu.d(var1_1, var9_2, this.f, androidx.appcompat.view.menu.b.B);
        if (!this.b() && this.v) {
            var6_3.d(true);
        } else if (this.b()) {
            var6_3.d(androidx.appcompat.view.menu.h.x(var1_1));
        }
        var3_4 = androidx.appcompat.view.menu.h.o((ListAdapter)var6_3, null, this.b, this.c);
        var8_5 = this.z();
        var8_5.p((ListAdapter)var6_3);
        var8_5.F(var3_4);
        var8_5.G(this.n);
        if (this.i.size() > 0) {
            var6_3 = this.i;
            var6_3 = (d)var6_3.get(var6_3.size() - 1);
            var7_6 /* !! */  = this.C((d)var6_3, var1_1);
        } else {
            var6_3 = null;
            var7_6 /* !! */  = null;
        }
        if (var7_6 /* !! */  != null) {
            block17: {
                var8_5.V(false);
                var8_5.S(null);
                var2_7 = this.E(var3_4);
                var4_8 = var2_7 == 1;
                this.q = var2_7;
                if (Build.VERSION.SDK_INT >= 26) {
                    var8_5.D(var7_6 /* !! */ );
                    var2_7 = 0;
                    var5_9 = 0;
                } else {
                    var11_10 = new int[2];
                    this.o.getLocationOnScreen(var11_10);
                    var10_11 = new int[2];
                    var7_6 /* !! */ .getLocationOnScreen(var10_11);
                    if ((this.n & 7) == 5) {
                        var11_10[0] = var11_10[0] + this.o.getWidth();
                        var10_11[0] = var10_11[0] + var7_6 /* !! */ .getWidth();
                    }
                    var5_9 = var10_11[0] - var11_10[0];
                    var2_7 = var10_11[1] - var11_10[1];
                }
                if ((this.n & 5) == 5) {
                    if (var4_8) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var3_4 = var5_9 + var3_4;
                            break block17;
                            break;
                        }
                    }
                    var3_4 = var7_6 /* !! */ .getWidth();
                    while (true) {
                        var3_4 = var5_9 - var3_4;
                        break block17;
                        break;
                    }
                }
                if (!var4_8) ** continue;
                var3_4 = var7_6 /* !! */ .getWidth();
                ** continue;
            }
            var8_5.f(var3_4);
            var8_5.N(true);
            var8_5.l(var2_7);
        } else {
            if (this.r) {
                var8_5.f(this.t);
            }
            if (this.s) {
                var8_5.l(this.u);
            }
            var8_5.H(this.n());
        }
        var7_6 /* !! */  = new d(var8_5, var1_1, this.q);
        this.i.add((d)var7_6 /* !! */ );
        var8_5.c();
        var7_6 /* !! */  = var8_5.j();
        var7_6 /* !! */ .setOnKeyListener((View.OnKeyListener)this);
        if (var6_3 == null && this.w && var1_1.x() != null) {
            var9_2 = (FrameLayout)var9_2.inflate(ax.m.g.l, (ViewGroup)var7_6 /* !! */ , false);
            var6_3 = (TextView)var9_2.findViewById(16908310);
            var9_2.setEnabled(false);
            var6_3.setText(var1_1.x());
            var7_6 /* !! */ .addHeaderView((View)var9_2, null, false);
            var8_5.c();
        }
    }

    private v z() {
        v v8 = new v(this.b, null, this.d, this.e);
        v8.U(this.l);
        v8.L(this);
        v8.K(this);
        v8.D(this.o);
        v8.G(this.n);
        v8.J(true);
        v8.I(2);
        return v8;
    }

    @Override
    public void a(e e8, boolean bl) {
        int n8 = this.A(e8);
        if (n8 >= 0) {
            int n9 = n8 + 1;
            if (n9 < this.i.size()) {
                this.i.get((int)n9).b.e(false);
            }
            Object object = this.i.remove(n8);
            ((d)object).b.P(this);
            if (this.A) {
                ((d)object).a.T(null);
                ((d)object).a.E(0);
            }
            ((d)object).a.dismiss();
            n9 = this.i.size();
            this.q = n9 > 0 ? this.i.get((int)(n9 - 1)).c : this.D();
            if (n9 == 0) {
                this.dismiss();
                object = this.x;
                if (object != null) {
                    object.a(e8, true);
                }
                if ((e8 = this.y) != null) {
                    if (e8.isAlive()) {
                        this.y.removeGlobalOnLayoutListener(this.j);
                    }
                    this.y = null;
                }
                this.p.removeOnAttachStateChangeListener(this.k);
                this.z.onDismiss();
                return;
            }
            if (bl) {
                this.i.get((int)0).b.e(false);
            }
        }
    }

    @Override
    public boolean b() {
        return this.i.size() > 0 && this.i.get((int)0).a.b();
    }

    @Override
    public void c() {
        if (!this.b()) {
            View view = this.h.iterator();
            while (view.hasNext()) {
                this.F(view.next());
            }
            this.h.clear();
            this.p = view = this.o;
            if (view != null) {
                boolean bl = this.y == null;
                view = view.getViewTreeObserver();
                this.y = view;
                if (bl) {
                    view.addOnGlobalLayoutListener(this.j);
                }
                this.p.addOnAttachStateChangeListener(this.k);
            }
        }
    }

    @Override
    public void d(boolean bl) {
        Iterator<d> iterator = this.i.iterator();
        while (iterator.hasNext()) {
            androidx.appcompat.view.menu.h.y(iterator.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override
    public void dismiss() {
        int n8 = this.i.size();
        if (n8 > 0) {
            d[] dArray = this.i.toArray(new d[n8]);
            --n8;
            while (n8 >= 0) {
                d d8 = dArray[n8];
                if (d8.a.b()) {
                    d8.a.dismiss();
                }
                --n8;
            }
        }
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public void h(j.a a8) {
        this.x = a8;
    }

    @Override
    public ListView j() {
        if (this.i.isEmpty()) {
            return null;
        }
        List<d> list = this.i;
        return list.get(list.size() - 1).a();
    }

    @Override
    public boolean k(m m8) {
        for (d object : this.i) {
            if (m8 != object.b) continue;
            object.a().requestFocus();
            return true;
        }
        if (m8.hasVisibleItems()) {
            this.l(m8);
            j.a a8 = this.x;
            if (a8 != null) {
                a8.b(m8);
            }
            return true;
        }
        return false;
    }

    @Override
    public void l(e e8) {
        e8.c(this, this.b);
        if (this.b()) {
            this.F(e8);
            return;
        }
        this.h.add(e8);
    }

    @Override
    protected boolean m() {
        return false;
    }

    public void onDismiss() {
        d d8;
        block3: {
            int n8 = this.i.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                d8 = this.i.get(i8);
                if (d8.a.b()) {
                    continue;
                }
                break block3;
            }
            d8 = null;
        }
        if (d8 != null) {
            d8.b.e(false);
        }
    }

    public boolean onKey(View view, int n8, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && n8 == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }

    @Override
    public void p(View view) {
        if (this.o != view) {
            this.o = view;
            this.n = ax.c0.t.b(this.m, view.getLayoutDirection());
        }
    }

    @Override
    public void r(boolean bl) {
        this.v = bl;
    }

    @Override
    public void s(int n8) {
        if (this.m != n8) {
            this.m = n8;
            this.n = ax.c0.t.b(n8, this.o.getLayoutDirection());
        }
    }

    @Override
    public void t(int n8) {
        this.r = true;
        this.t = n8;
    }

    @Override
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override
    public void v(boolean bl) {
        this.w = bl;
    }

    @Override
    public void w(int n8) {
        this.s = true;
        this.u = n8;
    }

    private static class d {
        public final v a;
        public final e b;
        public final int c;

        public d(v v8, e e8, int n8) {
            this.a = v8;
            this.b = e8;
            this.c = n8;
        }

        public ListView a() {
            return this.a.j();
        }
    }
}

