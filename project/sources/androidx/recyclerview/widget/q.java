package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import ax.c0.C1753a;
import ax.c0.C1760d0;
import ax.d0.H;
import ax.d0.K;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class q extends C1753a {
    final RecyclerView d;
    private final a e;

    public static class a extends C1753a {
        final q d;
        private Map<View, C1753a> e = new WeakHashMap();

        public a(q qVar) {
            this.d = qVar;
        }

        @Override // ax.c0.C1753a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            C1753a c1753a = this.e.get(view);
            return c1753a != null ? c1753a.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // ax.c0.C1753a
        public K b(View view) {
            C1753a c1753a = this.e.get(view);
            return c1753a != null ? c1753a.b(view) : super.b(view);
        }

        @Override // ax.c0.C1753a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            C1753a c1753a = this.e.get(view);
            if (c1753a != null) {
                c1753a.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // ax.c0.C1753a
        public void g(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) H h) {
            if (this.d.o() || this.d.d.getLayoutManager() == null) {
                super.g(view, h);
                return;
            }
            this.d.d.getLayoutManager().T0(view, h);
            C1753a c1753a = this.e.get(view);
            if (c1753a != null) {
                c1753a.g(view, h);
            } else {
                super.g(view, h);
            }
        }

        @Override // ax.c0.C1753a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            C1753a c1753a = this.e.get(view);
            if (c1753a != null) {
                c1753a.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // ax.c0.C1753a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C1753a c1753a = this.e.get(viewGroup);
            return c1753a != null ? c1753a.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // ax.c0.C1753a
        public boolean j(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            if (this.d.o() || this.d.d.getLayoutManager() == null) {
                return super.j(view, i, bundle);
            }
            C1753a c1753a = this.e.get(view);
            if (c1753a != null) {
                if (c1753a.j(view, i, bundle)) {
                    return true;
                }
            } else if (super.j(view, i, bundle)) {
                return true;
            }
            return this.d.d.getLayoutManager().n1(view, i, bundle);
        }

        @Override // ax.c0.C1753a
        public void l(View view, int i) {
            C1753a c1753a = this.e.get(view);
            if (c1753a != null) {
                c1753a.l(view, i);
            } else {
                super.l(view, i);
            }
        }

        @Override // ax.c0.C1753a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            C1753a c1753a = this.e.get(view);
            if (c1753a != null) {
                c1753a.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        C1753a n(View view) {
            return this.e.remove(view);
        }

        void o(View view) {
            C1753a m = C1760d0.m(view);
            if (m == null || m == this) {
                return;
            }
            this.e.put(view, m);
        }
    }

    public q(RecyclerView recyclerView) {
        this.d = recyclerView;
        C1753a n = n();
        if (n == null || !(n instanceof a)) {
            this.e = new a(this);
        } else {
            this.e = (a) n;
        }
    }

    @Override // ax.c0.C1753a
    public void f(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().P0(accessibilityEvent);
        }
    }

    @Override // ax.c0.C1753a
    public void g(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) H h) {
        super.g(view, h);
        if (o() || this.d.getLayoutManager() == null) {
            return;
        }
        this.d.getLayoutManager().S0(h);
    }

    @Override // ax.c0.C1753a
    public boolean j(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        if (o() || this.d.getLayoutManager() == null) {
            return false;
        }
        return this.d.getLayoutManager().l1(i, bundle);
    }

    public C1753a n() {
        return this.e;
    }

    boolean o() {
        return this.d.v0();
    }
}
