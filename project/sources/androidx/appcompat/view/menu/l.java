package androidx.appcompat.view.menu;

import android.R;
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
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import ax.u.v;

/* loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {
    private static final int v = ax.m.g.m;
    private final Context b;
    private final e c;
    private final d d;
    private final boolean e;
    private final int f;
    private final int g;
    private final int h;
    final v i;
    private PopupWindow.OnDismissListener l;
    private View m;
    View n;
    private j.a o;
    ViewTreeObserver p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean u;
    final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    private final View.OnAttachStateChangeListener k = new b();
    private int t = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.b() || l.this.i.B()) {
                return;
            }
            View view = l.this.n;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.i.c();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.p.removeGlobalOnLayoutListener(lVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i, int i2, boolean z) {
        this.b = context;
        this.c = eVar;
        this.e = z;
        this.d = new d(eVar, LayoutInflater.from(context), z, v);
        this.g = i;
        this.h = i2;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(ax.m.d.d));
        this.m = view;
        this.i = new v(context, null, i, i2);
        eVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (b()) {
            return true;
        }
        if (this.q || (view = this.m) == null) {
            return false;
        }
        this.n = view;
        this.i.K(this);
        this.i.L(this);
        this.i.J(true);
        View view2 = this.n;
        boolean z = this.p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.p = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j);
        }
        view2.addOnAttachStateChangeListener(this.k);
        this.i.D(view2);
        this.i.G(this.t);
        if (!this.r) {
            this.s = h.o(this.d, null, this.b, this.f);
            this.r = true;
        }
        this.i.F(this.s);
        this.i.I(2);
        this.i.H(n());
        this.i.c();
        ListView j = this.i.j();
        j.setOnKeyListener(this);
        if (this.u && this.c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.b).inflate(ax.m.g.l, (ViewGroup) j, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.c.x());
            }
            frameLayout.setEnabled(false);
            j.addHeaderView(frameLayout, null, false);
        }
        this.i.p(this.d);
        this.i.c();
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z) {
        if (eVar != this.c) {
            return;
        }
        dismiss();
        j.a aVar = this.o;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    @Override // ax.t.InterfaceC3093e
    public boolean b() {
        return !this.q && this.i.b();
    }

    @Override // ax.t.InterfaceC3093e
    public void c() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z) {
        this.r = false;
        d dVar = this.d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // ax.t.InterfaceC3093e
    public void dismiss() {
        if (b()) {
            this.i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.o = aVar;
    }

    @Override // ax.t.InterfaceC3093e
    public ListView j() {
        return this.i.j();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.b, mVar, this.n, this.e, this.g, this.h);
            iVar.j(this.o);
            iVar.g(h.x(mVar));
            iVar.i(this.l);
            this.l = null;
            this.c.e(false);
            int d = this.i.d();
            int o = this.i.o();
            if ((Gravity.getAbsoluteGravity(this.t, this.m.getLayoutDirection()) & 7) == 5) {
                d += this.m.getWidth();
            }
            if (iVar.o(d, o)) {
                j.a aVar = this.o;
                if (aVar == null) {
                    return true;
                }
                aVar.b(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
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
        PopupWindow.OnDismissListener onDismissListener = this.l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void p(View view) {
        this.m = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z) {
        this.d.d(z);
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i) {
        this.t = i;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i) {
        this.i.f(i);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z) {
        this.u = z;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i) {
        this.i.l(i);
    }
}
