/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import ax.m.g;
import ax.u.v;

final class l
extends h
implements PopupWindow.OnDismissListener,
AdapterView.OnItemClickListener,
j,
View.OnKeyListener {
    private static final int v = ax.m.g.m;
    private final Context b;
    private final e c;
    private final d d;
    private final boolean e;
    private final int f;
    private final int g;
    private final int h;
    final v i;
    final ViewTreeObserver.OnGlobalLayoutListener j = new ViewTreeObserver.OnGlobalLayoutListener(this){
        final l a;
        {
            this.a = l8;
        }

        public void onGlobalLayout() {
            if (this.a.b() && !this.a.i.B()) {
                View view = this.a.n;
                if (view != null && view.isShown()) {
                    this.a.i.c();
                    return;
                }
                this.a.dismiss();
            }
        }
    };
    private final View.OnAttachStateChangeListener k = new View.OnAttachStateChangeListener(this){
        final l a;
        {
            this.a = l8;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            Object object = this.a.p;
            if (object != null) {
                if (!object.isAlive()) {
                    this.a.p = view.getViewTreeObserver();
                }
                object = this.a;
                object.p.removeGlobalOnLayoutListener(object.j);
            }
            view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        }
    };
    private PopupWindow.OnDismissListener l;
    private View m;
    View n;
    private j.a o;
    ViewTreeObserver p;
    private boolean q;
    private boolean r;
    private int s;
    private int t = 0;
    private boolean u;

    public l(Context context, e e8, View view, int n8, int n9, boolean bl) {
        this.b = context;
        this.c = e8;
        this.e = bl;
        this.d = new d(e8, LayoutInflater.from((Context)context), bl, v);
        this.g = n8;
        this.h = n9;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(ax.m.d.d));
        this.m = view;
        this.i = new v(context, null, n8, n9);
        e8.c(this, context);
    }

    private boolean z() {
        View view;
        if (this.b()) {
            return true;
        }
        if (!this.q && (view = this.m) != null) {
            ViewTreeObserver viewTreeObserver;
            this.n = view;
            this.i.K(this);
            this.i.L(this);
            this.i.J(true);
            view = this.n;
            boolean bl = this.p == null;
            this.p = viewTreeObserver = view.getViewTreeObserver();
            if (bl) {
                viewTreeObserver.addOnGlobalLayoutListener(this.j);
            }
            view.addOnAttachStateChangeListener(this.k);
            this.i.D(view);
            this.i.G(this.t);
            if (!this.r) {
                this.s = androidx.appcompat.view.menu.h.o((ListAdapter)this.d, null, this.b, this.f);
                this.r = true;
            }
            this.i.F(this.s);
            this.i.I(2);
            this.i.H(this.n());
            this.i.c();
            ListView listView = this.i.j();
            listView.setOnKeyListener((View.OnKeyListener)this);
            if (this.u && this.c.x() != null) {
                view = (FrameLayout)LayoutInflater.from((Context)this.b).inflate(ax.m.g.l, (ViewGroup)listView, false);
                viewTreeObserver = (TextView)view.findViewById(16908310);
                if (viewTreeObserver != null) {
                    viewTreeObserver.setText(this.c.x());
                }
                view.setEnabled(false);
                listView.addHeaderView(view, null, false);
            }
            this.i.p((ListAdapter)this.d);
            this.i.c();
            return true;
        }
        return false;
    }

    @Override
    public void a(e e8, boolean bl) {
        if (e8 == this.c) {
            this.dismiss();
            j.a a8 = this.o;
            if (a8 != null) {
                a8.a(e8, bl);
            }
        }
    }

    @Override
    public boolean b() {
        return !this.q && this.i.b();
    }

    @Override
    public void c() {
        if (this.z()) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override
    public void d(boolean bl) {
        this.r = false;
        d d8 = this.d;
        if (d8 != null) {
            d8.notifyDataSetChanged();
        }
    }

    @Override
    public void dismiss() {
        if (this.b()) {
            this.i.dismiss();
        }
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public void h(j.a a8) {
        this.o = a8;
    }

    @Override
    public ListView j() {
        return this.i.j();
    }

    @Override
    public boolean k(m m8) {
        if (m8.hasVisibleItems()) {
            Object object = new i(this.b, m8, this.n, this.e, this.g, this.h);
            ((i)object).j(this.o);
            ((i)object).g(androidx.appcompat.view.menu.h.x(m8));
            ((i)object).i(this.l);
            this.l = null;
            this.c.e(false);
            int n8 = this.i.d();
            int n9 = this.i.o();
            int n10 = n8;
            if ((Gravity.getAbsoluteGravity((int)this.t, (int)this.m.getLayoutDirection()) & 7) == 5) {
                n10 = n8 + this.m.getWidth();
            }
            if (((i)object).o(n10, n9)) {
                object = this.o;
                if (object != null) {
                    object.b(m8);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public void l(e e8) {
    }

    public void onDismiss() {
        this.q = true;
        this.c.close();
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.p = this.n.getViewTreeObserver();
            }
            this.p.removeGlobalOnLayoutListener(this.j);
            this.p = null;
        }
        this.n.removeOnAttachStateChangeListener(this.k);
        viewTreeObserver = this.l;
        if (viewTreeObserver != null) {
            viewTreeObserver.onDismiss();
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
        this.m = view;
    }

    @Override
    public void r(boolean bl) {
        this.d.d(bl);
    }

    @Override
    public void s(int n8) {
        this.t = n8;
    }

    @Override
    public void t(int n8) {
        this.i.f(n8);
    }

    @Override
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    @Override
    public void v(boolean bl) {
        this.u = bl;
    }

    @Override
    public void w(int n8) {
        this.i.l(n8);
    }
}

