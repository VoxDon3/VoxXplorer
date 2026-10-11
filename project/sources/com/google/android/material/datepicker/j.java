package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.C1442c;
import ax.c0.C1753a;
import ax.c0.C1760d0;
import ax.d0.H;
import ax.k6.C2404e;
import ax.k6.C2406g;
import ax.k6.C2407h;
import ax.k6.C2408i;
import ax.k6.C2410k;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class j<S> extends p<S> {
    static final Object t0 = "MONTHS_VIEW_GROUP_TAG";
    static final Object u0 = "NAVIGATION_PREV_TAG";
    static final Object v0 = "NAVIGATION_NEXT_TAG";
    static final Object w0 = "SELECTOR_TOGGLE_TAG";
    private int e0;
    private ax.A6.d<S> f0;
    private com.google.android.material.datepicker.a g0;
    private ax.A6.f h0;
    private com.google.android.material.datepicker.m i0;
    private l j0;
    private com.google.android.material.datepicker.c k0;
    private RecyclerView l0;
    private RecyclerView m0;
    private View n0;
    private View o0;
    private View p0;
    private View q0;
    private MaterialButton r0;
    private AccessibilityManager s0;

    class a implements View.OnClickListener {
        final /* synthetic */ o a;

        a(o oVar) {
            this.a = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.h3(this.a.O(j.this.d3().f2() - 1));
        }
    }

    class b implements Runnable {
        final /* synthetic */ int q;

        b(int i) {
            this.q = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.m0.F1(this.q);
        }
    }

    class c extends C1753a {
        c() {
        }

        @Override // ax.c0.C1753a
        public void g(View view, H h) {
            super.g(view, h);
            h.o0(null);
        }
    }

    class d extends r {
        final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.I = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void R1(RecyclerView.B b, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = j.this.m0.getWidth();
                iArr[1] = j.this.m0.getWidth();
            } else {
                iArr[0] = j.this.m0.getHeight();
                iArr[1] = j.this.m0.getHeight();
            }
        }
    }

    class e implements m {
        e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.j.m
        public void a(long j) {
            if (j.this.g0.g().t(j)) {
                j.this.f0.A(j);
                Iterator<ax.A6.k<S>> it = j.this.d0.iterator();
                while (it.hasNext()) {
                    it.next().b(j.this.f0.x());
                }
                j.this.m0.getAdapter().r();
                if (j.this.l0 != null) {
                    j.this.l0.getAdapter().r();
                }
            }
        }
    }

    class f extends C1753a {
        f() {
        }

        @Override // ax.c0.C1753a
        public void g(View view, H h) {
            super.g(view, h);
            h.G0(false);
        }
    }

    class g extends RecyclerView.o {
        private final Calendar a = t.r();
        private final Calendar b = t.r();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b) {
            if ((recyclerView.getAdapter() instanceof u) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                u uVar = (u) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C1442c<Long, Long> c1442c : j.this.f0.l()) {
                    Long l = c1442c.a;
                    if (l != null && c1442c.b != null) {
                        this.a.setTimeInMillis(l.longValue());
                        this.b.setTimeInMillis(c1442c.b.longValue());
                        int P = uVar.P(this.a.get(1));
                        int P2 = uVar.P(this.b.get(1));
                        View I = gridLayoutManager.I(P);
                        View I2 = gridLayoutManager.I(P2);
                        int Z2 = P / gridLayoutManager.Z2();
                        int Z22 = P2 / gridLayoutManager.Z2();
                        int i = Z2;
                        while (i <= Z22) {
                            if (gridLayoutManager.I(gridLayoutManager.Z2() * i) != null) {
                                canvas.drawRect((i != Z2 || I == null) ? 0 : I.getLeft() + (I.getWidth() / 2), r9.getTop() + j.this.k0.d.c(), (i != Z22 || I2 == null) ? recyclerView.getWidth() : I2.getLeft() + (I2.getWidth() / 2), r9.getBottom() - j.this.k0.d.b(), j.this.k0.h);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    class h extends C1753a {
        h() {
        }

        @Override // ax.c0.C1753a
        public void g(View view, H h) {
            super.g(view, h);
            h.b(new H.a(16, j.this.q0.getVisibility() == 0 ? j.this.M0(C2410k.O) : j.this.M0(C2410k.M)));
        }
    }

    class i extends RecyclerView.u {
        final /* synthetic */ o a;

        i(o oVar) {
            this.a = oVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i, int i2) {
            int d2 = i < 0 ? j.this.d3().d2() : j.this.d3().f2();
            com.google.android.material.datepicker.m O = this.a.O(d2);
            j.this.i0 = O;
            j.this.r0.setText(this.a.P(d2));
            j.this.l3(this.a.Q(O));
        }
    }

    /* renamed from: com.google.android.material.datepicker.j$j, reason: collision with other inner class name */
    class ViewOnClickListenerC0554j implements View.OnClickListener {
        ViewOnClickListenerC0554j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.k3();
        }
    }

    class k implements View.OnClickListener {
        final /* synthetic */ o a;

        k(o oVar) {
            this.a = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.h3(this.a.O(j.this.d3().d2() + 1));
        }
    }

    enum l {
        DAY,
        YEAR
    }

    interface m {
        void a(long j);
    }

    private void V2(View view, o oVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C2406g.t);
        this.r0 = materialButton;
        materialButton.setTag(w0);
        C1760d0.l0(this.r0, new h());
        View findViewById = view.findViewById(C2406g.v);
        this.n0 = findViewById;
        findViewById.setTag(u0);
        View findViewById2 = view.findViewById(C2406g.u);
        this.o0 = findViewById2;
        findViewById2.setTag(v0);
        this.p0 = view.findViewById(C2406g.C);
        this.q0 = view.findViewById(C2406g.x);
        i3(l.DAY);
        this.r0.setText(this.i0.G());
        this.m0.n(new i(oVar));
        this.r0.setOnClickListener(new ViewOnClickListenerC0554j());
        this.o0.setOnClickListener(new k(oVar));
        this.n0.setOnClickListener(new a(oVar));
        l3(oVar.Q(this.i0));
    }

    private RecyclerView.o W2() {
        return new g();
    }

    static int b3(Context context) {
        return context.getResources().getDimensionPixelSize(C2404e.c0);
    }

    private static int c3(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C2404e.k0) + resources.getDimensionPixelOffset(C2404e.l0) + resources.getDimensionPixelOffset(C2404e.j0);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C2404e.e0);
        int i2 = n.g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C2404e.c0) * i2) + ((i2 - 1) * resources.getDimensionPixelOffset(C2404e.i0)) + resources.getDimensionPixelOffset(C2404e.a0);
    }

    public static <T> j<T> e3(ax.A6.d<T> dVar, int i2, com.google.android.material.datepicker.a aVar, ax.A6.f fVar) {
        j<T> jVar = new j<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", fVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.m());
        jVar.v2(bundle);
        return jVar;
    }

    private void f3(int i2) {
        this.m0.post(new b(i2));
    }

    private void j3() {
        C1760d0.l0(this.m0, new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3(int i2) {
        this.o0.setEnabled(i2 + 1 < this.m0.getAdapter().l());
        this.n0.setEnabled(i2 - 1 >= 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void I1(Bundle bundle) {
        super.I1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.e0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.g0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.h0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.i0);
    }

    @Override // com.google.android.material.datepicker.p
    public boolean K2(ax.A6.k<S> kVar) {
        return super.K2(kVar);
    }

    com.google.android.material.datepicker.a X2() {
        return this.g0;
    }

    com.google.android.material.datepicker.c Y2() {
        return this.k0;
    }

    com.google.android.material.datepicker.m Z2() {
        return this.i0;
    }

    public ax.A6.d<S> a3() {
        return this.f0;
    }

    LinearLayoutManager d3() {
        return (LinearLayoutManager) this.m0.getLayoutManager();
    }

    void g3() {
        MaterialButton materialButton = this.r0;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }

    void h3(com.google.android.material.datepicker.m mVar) {
        o oVar = (o) this.m0.getAdapter();
        int Q = oVar.Q(mVar);
        AccessibilityManager accessibilityManager = this.s0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int Q2 = Q - oVar.Q(this.i0);
            boolean z = Math.abs(Q2) > 3;
            boolean z2 = Q2 > 0;
            this.i0 = mVar;
            if (z && z2) {
                this.m0.w1(Q - 3);
                f3(Q);
            } else if (z) {
                this.m0.w1(Q + 3);
                f3(Q);
            } else {
                f3(Q);
            }
        } else {
            this.i0 = mVar;
            this.m0.w1(Q);
        }
        l3(Q);
    }

    void i3(l lVar) {
        this.j0 = lVar;
        if (lVar == l.YEAR) {
            this.l0.getLayoutManager().C1(((u) this.l0.getAdapter()).P(this.i0.d0));
            this.p0.setVisibility(0);
            this.q0.setVisibility(8);
            this.n0.setVisibility(8);
            this.o0.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.p0.setVisibility(8);
            this.q0.setVisibility(0);
            this.n0.setVisibility(0);
            this.o0.setVisibility(0);
            h3(this.i0);
        }
    }

    void k3() {
        l lVar = this.j0;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            i3(l.DAY);
            this.m0.announceForAccessibility(M0(C2410k.P));
        } else if (lVar == l.DAY) {
            i3(lVar2);
            this.l0.announceForAccessibility(M0(C2410k.Q));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        super.n1(bundle);
        if (bundle == null) {
            bundle = j0();
        }
        this.e0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f0 = (ax.A6.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.g0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.h0 = (ax.A6.f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.i0 = (com.google.android.material.datepicker.m) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(b(), this.e0);
        this.k0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.s0 = (AccessibilityManager) p2().getSystemService("accessibility");
        com.google.android.material.datepicker.m o = this.g0.o();
        if (com.google.android.material.datepicker.k.t3(contextThemeWrapper)) {
            i2 = C2408i.t;
            i3 = 1;
        } else {
            i2 = C2408i.r;
            i3 = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        inflate.setMinimumHeight(c3(p2()));
        GridView gridView = (GridView) inflate.findViewById(C2406g.y);
        C1760d0.l0(gridView, new c());
        int j = this.g0.j();
        gridView.setAdapter((ListAdapter) (j > 0 ? new com.google.android.material.datepicker.i(j) : new com.google.android.material.datepicker.i()));
        gridView.setNumColumns(o.e0);
        gridView.setEnabled(false);
        this.m0 = (RecyclerView) inflate.findViewById(C2406g.B);
        this.m0.setLayoutManager(new d(b(), i3, false, i3));
        this.m0.setTag(t0);
        o oVar = new o(contextThemeWrapper, this.f0, this.g0, this.h0, new e());
        this.m0.setAdapter(oVar);
        int integer = contextThemeWrapper.getResources().getInteger(C2407h.c);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C2406g.C);
        this.l0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.l0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.l0.setAdapter(new u(this));
            this.l0.j(W2());
        }
        if (inflate.findViewById(C2406g.t) != null) {
            V2(inflate, oVar);
        }
        if (!com.google.android.material.datepicker.k.t3(contextThemeWrapper)) {
            new androidx.recyclerview.widget.p().b(this.m0);
        }
        this.m0.w1(oVar.Q(this.i0));
        j3();
        return inflate;
    }
}
