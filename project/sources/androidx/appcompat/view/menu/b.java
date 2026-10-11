package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
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
import androidx.appcompat.view.menu.j;
import ax.c0.C1790t;
import ax.u.u;
import ax.u.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class b extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int B = ax.m.g.e;
    boolean A;
    private final Context b;
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;
    final Handler g;
    private View o;
    View p;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private boolean w;
    private j.a x;
    ViewTreeObserver y;
    private PopupWindow.OnDismissListener z;
    private final List<e> h = new ArrayList();
    final List<d> i = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    private final View.OnAttachStateChangeListener k = new ViewOnAttachStateChangeListenerC0008b();
    private final u l = new c();
    private int m = 0;
    private int n = 0;
    private boolean v = false;
    private int q = D();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.b() || b.this.i.size() <= 0 || b.this.i.get(0).a.B()) {
                return;
            }
            View view = b.this.p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator<d> it = b.this.i.iterator();
            while (it.hasNext()) {
                it.next().a.c();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0008b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0008b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.y.removeGlobalOnLayoutListener(bVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements u {

        class a implements Runnable {
            final /* synthetic */ MenuItem c0;
            final /* synthetic */ e d0;
            final /* synthetic */ d q;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.q = dVar;
                this.c0 = menuItem;
                this.d0 = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.q;
                if (dVar != null) {
                    b.this.A = true;
                    dVar.b.e(false);
                    b.this.A = false;
                }
                if (this.c0.isEnabled() && this.c0.hasSubMenu()) {
                    this.d0.M(this.c0, 4);
                }
            }
        }

        c() {
        }

        @Override // ax.u.u
        public void e(e eVar, MenuItem menuItem) {
            b.this.g.removeCallbacksAndMessages(null);
            int size = b.this.i.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (eVar == b.this.i.get(i).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            b.this.g.postAtTime(new a(i2 < b.this.i.size() ? b.this.i.get(i2) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // ax.u.u
        public void h(e eVar, MenuItem menuItem) {
            b.this.g.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {
        public final v a;
        public final e b;
        public final int c;

        public d(v vVar, e eVar, int i) {
            this.a = vVar;
            this.b = eVar;
            this.c = i;
        }

        public ListView a() {
            return this.a.j();
        }
    }

    public b(Context context, View view, int i, int i2, boolean z) {
        this.b = context;
        this.o = view;
        this.d = i;
        this.e = i2;
        this.f = z;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(ax.m.d.d));
        this.g = new Handler();
    }

    private int A(e eVar) {
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            if (eVar == this.i.get(i).b) {
                return i;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int i;
        int firstVisiblePosition;
        MenuItem B2 = B(dVar.b, eVar);
        if (B2 == null) {
            return null;
        }
        ListView a2 = dVar.a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (B2 == dVar2.getItem(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return this.o.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int E(int i) {
        List<d> list = this.i;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.p.getWindowVisibleDisplayFrame(rect);
        return this.q == 1 ? (iArr[0] + a2.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    private void F(e eVar) {
        d dVar;
        View view;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.f, B);
        if (!b() && this.v) {
            dVar2.d(true);
        } else if (b()) {
            dVar2.d(h.x(eVar));
        }
        int o = h.o(dVar2, null, this.b, this.c);
        v z = z();
        z.p(dVar2);
        z.F(o);
        z.G(this.n);
        if (this.i.size() > 0) {
            List<d> list = this.i;
            dVar = list.get(list.size() - 1);
            view = C(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z.V(false);
            z.S(null);
            int E = E(o);
            boolean z2 = E == 1;
            this.q = E;
            if (Build.VERSION.SDK_INT >= 26) {
                z.D(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.n & 7) == 5) {
                    iArr[0] = iArr[0] + this.o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.n & 5) == 5) {
                if (!z2) {
                    o = view.getWidth();
                    i3 = i - o;
                }
                i3 = i + o;
            } else {
                if (z2) {
                    o = view.getWidth();
                    i3 = i + o;
                }
                i3 = i - o;
            }
            z.f(i3);
            z.N(true);
            z.l(i2);
        } else {
            if (this.r) {
                z.f(this.t);
            }
            if (this.s) {
                z.l(this.u);
            }
            z.H(n());
        }
        this.i.add(new d(z, eVar, this.q));
        z.c();
        ListView j = z.j();
        j.setOnKeyListener(this);
        if (dVar == null && this.w && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(ax.m.g.l, (ViewGroup) j, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            j.addHeaderView(frameLayout, null, false);
            z.c();
        }
    }

    private v z() {
        v vVar = new v(this.b, null, this.d, this.e);
        vVar.U(this.l);
        vVar.L(this);
        vVar.K(this);
        vVar.D(this.o);
        vVar.G(this.n);
        vVar.J(true);
        vVar.I(2);
        return vVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z) {
        int A = A(eVar);
        if (A < 0) {
            return;
        }
        int i = A + 1;
        if (i < this.i.size()) {
            this.i.get(i).b.e(false);
        }
        d remove = this.i.remove(A);
        remove.b.P(this);
        if (this.A) {
            remove.a.T(null);
            remove.a.E(0);
        }
        remove.a.dismiss();
        int size = this.i.size();
        if (size > 0) {
            this.q = this.i.get(size - 1).c;
        } else {
            this.q = D();
        }
        if (size != 0) {
            if (z) {
                this.i.get(0).b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.x;
        if (aVar != null) {
            aVar.a(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.y.removeGlobalOnLayoutListener(this.j);
            }
            this.y = null;
        }
        this.p.removeOnAttachStateChangeListener(this.k);
        this.z.onDismiss();
    }

    @Override // ax.t.InterfaceC3093e
    public boolean b() {
        return this.i.size() > 0 && this.i.get(0).a.b();
    }

    @Override // ax.t.InterfaceC3093e
    public void c() {
        if (b()) {
            return;
        }
        Iterator<e> it = this.h.iterator();
        while (it.hasNext()) {
            F(it.next());
        }
        this.h.clear();
        View view = this.o;
        this.p = view;
        if (view != null) {
            boolean z = this.y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.y = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.j);
            }
            this.p.addOnAttachStateChangeListener(this.k);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z) {
        Iterator<d> it = this.i.iterator();
        while (it.hasNext()) {
            h.y(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // ax.t.InterfaceC3093e
    public void dismiss() {
        int size = this.i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.i.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.a.b()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.x = aVar;
    }

    @Override // ax.t.InterfaceC3093e
    public ListView j() {
        if (this.i.isEmpty()) {
            return null;
        }
        return this.i.get(r0.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        for (d dVar : this.i) {
            if (mVar == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        l(mVar);
        j.a aVar = this.x;
        if (aVar != null) {
            aVar.b(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
        eVar.c(this, this.b);
        if (b()) {
            F(eVar);
        } else {
            this.h.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.i.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.i.get(i);
            if (!dVar.a.b()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.b.e(false);
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
        if (this.o != view) {
            this.o = view;
            this.n = C1790t.b(this.m, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z) {
        this.v = z;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i) {
        if (this.m != i) {
            this.m = i;
            this.n = C1790t.b(i, this.o.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i) {
        this.r = true;
        this.t = i;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z) {
        this.w = z;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i) {
        this.s = true;
        this.u = i;
    }
}
