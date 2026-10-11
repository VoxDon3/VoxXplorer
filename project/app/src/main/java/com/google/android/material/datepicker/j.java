/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcelable;
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
import ax.A6.d;
import ax.A6.f;
import ax.c0.d0;
import ax.d0.H;
import ax.k6.e;
import ax.k6.g;
import ax.k6.h;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.a;
import com.google.android.material.datepicker.c;
import com.google.android.material.datepicker.i;
import com.google.android.material.datepicker.k;
import com.google.android.material.datepicker.n;
import com.google.android.material.datepicker.o;
import com.google.android.material.datepicker.p;
import com.google.android.material.datepicker.r;
import com.google.android.material.datepicker.t;
import com.google.android.material.datepicker.u;
import java.util.AbstractCollection;
import java.util.Calendar;
import java.util.Iterator;

public final class j<S>
extends p<S> {
    static final Object t0 = "MONTHS_VIEW_GROUP_TAG";
    static final Object u0 = "NAVIGATION_PREV_TAG";
    static final Object v0 = "NAVIGATION_NEXT_TAG";
    static final Object w0 = "SELECTOR_TOGGLE_TAG";
    private int e0;
    private d<S> f0;
    private a g0;
    private f h0;
    private com.google.android.material.datepicker.m i0;
    private l j0;
    private c k0;
    private RecyclerView l0;
    private RecyclerView m0;
    private View n0;
    private View o0;
    private View p0;
    private View q0;
    private MaterialButton r0;
    private AccessibilityManager s0;

    static /* synthetic */ com.google.android.material.datepicker.m S2(j j8, com.google.android.material.datepicker.m m8) {
        j8.i0 = m8;
        return m8;
    }

    private void V2(View view, o o8) {
        MaterialButton materialButton;
        this.r0 = materialButton = (MaterialButton)view.findViewById(g.t);
        materialButton.setTag(w0);
        ax.c0.d0.l0((View)this.r0, new ax.c0.a(this){
            final j d;
            {
                this.d = j8;
            }

            @Override
            public void g(View object, H h8) {
                super.g((View)object, h8);
                object = this.d.q0.getVisibility() == 0 ? this.d.M0(ax.k6.k.O) : this.d.M0(ax.k6.k.M);
                h8.b(new H.a(16, (CharSequence)object));
            }
        });
        materialButton = view.findViewById(g.v);
        this.n0 = materialButton;
        materialButton.setTag(u0);
        materialButton = view.findViewById(g.u);
        this.o0 = materialButton;
        materialButton.setTag(v0);
        this.p0 = view.findViewById(g.C);
        this.q0 = view.findViewById(g.x);
        this.i3(l.q);
        this.r0.setText(this.i0.G());
        this.m0.n(new RecyclerView.u(this, o8){
            final o a;
            final j b;
            {
                this.b = j8;
                this.a = o8;
            }

            @Override
            public void b(RecyclerView object, int n8, int n9) {
                n8 = n8 < 0 ? this.b.d3().d2() : this.b.d3().f2();
                object = this.a.O(n8);
                j.S2(this.b, (com.google.android.material.datepicker.m)object);
                this.b.r0.setText(this.a.P(n8));
                n8 = this.a.Q((com.google.android.material.datepicker.m)object);
                this.b.l3(n8);
            }
        });
        this.r0.setOnClickListener(new View.OnClickListener(this){
            final j a;
            {
                this.a = j8;
            }

            public void onClick(View view) {
                this.a.k3();
            }
        });
        this.o0.setOnClickListener(new View.OnClickListener(){
            final o a;
            final j b;
            {
                this.b = j8;
                this.a = o8;
            }

            public void onClick(View view) {
                int n8 = this.b.d3().d2();
                this.b.h3(this.a.O(n8 + 1));
            }
        });
        this.n0.setOnClickListener(new View.OnClickListener(){
            final o a;
            final j b;
            {
                this.b = j8;
                this.a = o8;
            }

            public void onClick(View view) {
                int n8 = this.b.d3().f2();
                this.b.h3(this.a.O(n8 - 1));
            }
        });
        this.l3(o8.Q(this.i0));
    }

    private RecyclerView.o W2() {
        return new RecyclerView.o(this){
            private final Calendar a;
            private final Calendar b;
            final j c;
            {
                this.c = j8;
                this.a = t.r();
                this.b = t.r();
            }

            @Override
            public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.B object) {
                if (recyclerView.getAdapter() instanceof u && recyclerView.getLayoutManager() instanceof GridLayoutManager) {
                    u u8 = (u)recyclerView.getAdapter();
                    object = (GridLayoutManager)recyclerView.getLayoutManager();
                    for (ax.b0.c<Long, Long> c8 : this.c.f0.l()) {
                        Object object2 = c8.a;
                        if (object2 == null || c8.b == null) continue;
                        this.a.setTimeInMillis((Long)object2);
                        this.b.setTimeInMillis((Long)c8.b);
                        int n8 = u8.P(this.a.get(1));
                        int n9 = u8.P(this.b.get(1));
                        View view = ((LinearLayoutManager)object).I(n8);
                        object2 = ((LinearLayoutManager)object).I(n9);
                        int n10 = n8 / ((GridLayoutManager)object).Z2();
                        int n11 = n9 / ((GridLayoutManager)object).Z2();
                        for (n9 = n10; n9 <= n11; ++n9) {
                            View view2 = ((LinearLayoutManager)object).I(((GridLayoutManager)object).Z2() * n9);
                            if (view2 == null) continue;
                            int n12 = view2.getTop();
                            int n13 = ((j)this.c).k0.d.c();
                            int n14 = view2.getBottom();
                            int n15 = ((j)this.c).k0.d.b();
                            n8 = n9 == n10 && view != null ? view.getLeft() + view.getWidth() / 2 : 0;
                            int n16 = n9 == n11 && object2 != null ? object2.getLeft() + object2.getWidth() / 2 : recyclerView.getWidth();
                            canvas.drawRect((float)n8, (float)(n12 + n13), (float)n16, (float)(n14 - n15), ((j)this.c).k0.h);
                        }
                    }
                }
            }
        };
    }

    static int b3(Context context) {
        return context.getResources().getDimensionPixelSize(e.c0);
    }

    private static int c3(Context context) {
        context = context.getResources();
        int n8 = context.getDimensionPixelSize(e.k0);
        int n9 = context.getDimensionPixelOffset(e.l0);
        int n10 = context.getDimensionPixelOffset(e.j0);
        int n11 = context.getDimensionPixelSize(e.e0);
        int n12 = n.g;
        return n8 + n9 + n10 + n11 + (context.getDimensionPixelSize(e.c0) * n12 + (n12 - 1) * context.getDimensionPixelOffset(e.i0)) + context.getDimensionPixelOffset(e.a0);
    }

    public static <T> j<T> e3(d<T> d8, int n8, a a8, f f8) {
        j j8 = new j();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", n8);
        bundle.putParcelable("GRID_SELECTOR_KEY", d8);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)a8);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable)f8);
        bundle.putParcelable("CURRENT_MONTH_KEY", (Parcelable)a8.m());
        j8.v2(bundle);
        return j8;
    }

    private void f3(int n8) {
        this.m0.post(new Runnable(){
            final j c0;
            final int q;
            {
                this.c0 = j8;
                this.q = n8;
            }

            @Override
            public void run() {
                this.c0.m0.F1(this.q);
            }
        });
    }

    private void j3() {
        ax.c0.d0.l0((View)this.m0, new ax.c0.a(this){
            final j d;
            {
                this.d = j8;
            }

            @Override
            public void g(View view, H h8) {
                super.g(view, h8);
                h8.G0(false);
            }
        });
    }

    private void l3(int n8) {
        View view = this.o0;
        int n9 = this.m0.getAdapter().l();
        boolean bl = false;
        boolean bl2 = n8 + 1 < n9;
        view.setEnabled(bl2);
        view = this.n0;
        bl2 = bl;
        if (n8 - 1 >= 0) {
            bl2 = true;
        }
        view.setEnabled(bl2);
    }

    @Override
    public void I1(Bundle bundle) {
        super.I1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.e0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)this.g0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable)this.h0);
        bundle.putParcelable("CURRENT_MONTH_KEY", (Parcelable)this.i0);
    }

    @Override
    public boolean K2(ax.A6.k<S> k8) {
        return super.K2(k8);
    }

    a X2() {
        return this.g0;
    }

    c Y2() {
        return this.k0;
    }

    com.google.android.material.datepicker.m Z2() {
        return this.i0;
    }

    public d<S> a3() {
        return this.f0;
    }

    LinearLayoutManager d3() {
        return (LinearLayoutManager)this.m0.getLayoutManager();
    }

    void g3() {
        MaterialButton materialButton = this.r0;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }

    void h3(com.google.android.material.datepicker.m m8) {
        o o8 = (o)this.m0.getAdapter();
        int n8 = o8.Q(m8);
        AccessibilityManager accessibilityManager = this.s0;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            this.i0 = m8;
            this.m0.w1(n8);
        } else {
            int n9 = n8 - o8.Q(this.i0);
            int n10 = Math.abs(n9);
            boolean bl = false;
            n10 = n10 > 3 ? 1 : 0;
            if (n9 > 0) {
                bl = true;
            }
            this.i0 = m8;
            if (n10 != 0 && bl) {
                this.m0.w1(n8 - 3);
                this.f3(n8);
            } else if (n10 != 0) {
                this.m0.w1(n8 + 3);
                this.f3(n8);
            } else {
                this.f3(n8);
            }
        }
        this.l3(n8);
    }

    void i3(l l8) {
        this.j0 = l8;
        if (l8 == l.c0) {
            this.l0.getLayoutManager().C1(((u)this.l0.getAdapter()).P(this.i0.d0));
            this.p0.setVisibility(0);
            this.q0.setVisibility(8);
            this.n0.setVisibility(8);
            this.o0.setVisibility(8);
            return;
        }
        if (l8 == l.q) {
            this.p0.setVisibility(8);
            this.q0.setVisibility(0);
            this.n0.setVisibility(0);
            this.o0.setVisibility(0);
            this.h3(this.i0);
        }
    }

    void k3() {
        l l8 = this.j0;
        l l9 = l.c0;
        if (l8 == l9) {
            this.i3(l.q);
            this.m0.announceForAccessibility(this.M0(ax.k6.k.P));
            return;
        }
        if (l8 == l.q) {
            this.i3(l9);
            this.l0.announceForAccessibility(this.M0(ax.k6.k.Q));
        }
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = this.j0();
        }
        this.e0 = bundle2.getInt("THEME_RES_ID_KEY");
        this.f0 = (d)bundle2.getParcelable("GRID_SELECTOR_KEY");
        this.g0 = (a)bundle2.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.h0 = (f)bundle2.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.i0 = (com.google.android.material.datepicker.m)bundle2.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override
    public View r1(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        int n8;
        int n9;
        bundle = new ContextThemeWrapper(this.b(), this.e0);
        this.k0 = new c((Context)bundle);
        layoutInflater = layoutInflater.cloneInContext((Context)bundle);
        this.s0 = (AccessibilityManager)this.p2().getSystemService("accessibility");
        Object object2 = this.g0.o();
        if (k.t3((Context)bundle)) {
            n9 = ax.k6.i.t;
            n8 = 1;
        } else {
            n9 = ax.k6.i.r;
            n8 = 0;
        }
        layoutInflater = layoutInflater.inflate(n9, (ViewGroup)object, false);
        layoutInflater.setMinimumHeight(j.c3(this.p2()));
        GridView gridView = (GridView)layoutInflater.findViewById(g.y);
        ax.c0.d0.l0((View)gridView, new ax.c0.a(this){
            final j d;
            {
                this.d = j8;
            }

            @Override
            public void g(View view, H h8) {
                super.g(view, h8);
                h8.o0(null);
            }
        });
        n9 = this.g0.j();
        object = n9 > 0 ? new i(n9) : new i();
        gridView.setAdapter((ListAdapter)object);
        gridView.setNumColumns(((com.google.android.material.datepicker.m)object2).e0);
        gridView.setEnabled(false);
        this.m0 = (RecyclerView)layoutInflater.findViewById(g.B);
        object = new r(this, this.b(), n8, false, n8){
            final int I;
            final j J;
            {
                this.J = j8;
                this.I = n9;
                super(context, n8, bl);
            }

            @Override
            protected void R1(RecyclerView.B b8, int[] nArray) {
                if (this.I == 0) {
                    nArray[0] = this.J.m0.getWidth();
                    nArray[1] = this.J.m0.getWidth();
                    return;
                }
                nArray[0] = this.J.m0.getHeight();
                nArray[1] = this.J.m0.getHeight();
            }
        };
        this.m0.setLayoutManager((RecyclerView.p)object);
        this.m0.setTag(t0);
        object2 = new o((Context)bundle, this.f0, this.g0, this.h0, new m(this){
            final j a;
            {
                this.a = j8;
            }

            @Override
            public void a(long l8) {
                if (this.a.g0.g().t(l8)) {
                    this.a.f0.A(l8);
                    Iterator iterator = ((AbstractCollection)this.a.d0).iterator();
                    while (iterator.hasNext()) {
                        ((ax.A6.k)iterator.next()).b(this.a.f0.x());
                    }
                    this.a.m0.getAdapter().r();
                    if (this.a.l0 != null) {
                        this.a.l0.getAdapter().r();
                    }
                }
            }
        });
        this.m0.setAdapter((RecyclerView.h)object2);
        n8 = bundle.getResources().getInteger(h.c);
        object = (RecyclerView)layoutInflater.findViewById(g.C);
        this.l0 = object;
        if (object != null) {
            ((RecyclerView)object).setHasFixedSize(true);
            this.l0.setLayoutManager(new GridLayoutManager((Context)bundle, n8, 1, false));
            this.l0.setAdapter(new u(this));
            this.l0.j(this.W2());
        }
        if (layoutInflater.findViewById(g.t) != null) {
            this.V2((View)layoutInflater, (o)object2);
        }
        if (!k.t3((Context)bundle)) {
            new androidx.recyclerview.widget.p().b(this.m0);
        }
        this.m0.w1(((o)object2).Q(this.i0));
        this.j3();
        return layoutInflater;
    }

    static final class l
    extends Enum<l> {
        public static final /* enum */ l c0;
        private static final l[] d0;
        public static final /* enum */ l q;

        static {
            q = new l();
            c0 = new l();
            d0 = l.d();
        }

        private static /* synthetic */ l[] d() {
            return new l[]{q, c0};
        }

        public static l valueOf(String string) {
            return Enum.valueOf(l.class, string);
        }

        public static l[] values() {
            return (l[])d0.clone();
        }
    }

    static interface m {
        public void a(long var1);
    }
}

