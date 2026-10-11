/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import ax.c0.d0;
import ax.d0.H;
import ax.d0.K;
import java.util.Map;
import java.util.WeakHashMap;

public class q
extends ax.c0.a {
    final RecyclerView d;
    private final a e;

    public q(RecyclerView object) {
        this.d = object;
        object = this.n();
        if (object != null && object instanceof a) {
            this.e = (a)object;
            return;
        }
        this.e = new a(this);
    }

    @Override
    public void f(@SuppressLint(value={"InvalidNullabilityOverride"}) View object, @SuppressLint(value={"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.f((View)object, accessibilityEvent);
        if (object instanceof RecyclerView && !this.o() && ((RecyclerView)(object = (RecyclerView)object)).getLayoutManager() != null) {
            ((RecyclerView)object).getLayoutManager().P0(accessibilityEvent);
        }
    }

    @Override
    public void g(@SuppressLint(value={"InvalidNullabilityOverride"}) View view, @SuppressLint(value={"InvalidNullabilityOverride"}) H h8) {
        super.g(view, h8);
        if (!this.o() && this.d.getLayoutManager() != null) {
            this.d.getLayoutManager().S0(h8);
        }
    }

    @Override
    public boolean j(@SuppressLint(value={"InvalidNullabilityOverride"}) View view, int n8, @SuppressLint(value={"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.j(view, n8, bundle)) {
            return true;
        }
        if (!this.o() && this.d.getLayoutManager() != null) {
            return this.d.getLayoutManager().l1(n8, bundle);
        }
        return false;
    }

    public ax.c0.a n() {
        return this.e;
    }

    boolean o() {
        return this.d.v0();
    }

    public static class a
    extends ax.c0.a {
        final q d;
        private Map<View, ax.c0.a> e = new WeakHashMap<View, ax.c0.a>();

        public a(q q8) {
            this.d = q8;
        }

        @Override
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            ax.c0.a a8 = this.e.get(view);
            if (a8 != null) {
                return a8.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        @Override
        public K b(View view) {
            ax.c0.a a8 = this.e.get(view);
            if (a8 != null) {
                return a8.b(view);
            }
            return super.b(view);
        }

        @Override
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            ax.c0.a a8 = this.e.get(view);
            if (a8 != null) {
                a8.f(view, accessibilityEvent);
                return;
            }
            super.f(view, accessibilityEvent);
        }

        @Override
        public void g(@SuppressLint(value={"InvalidNullabilityOverride"}) View view, @SuppressLint(value={"InvalidNullabilityOverride"}) H h8) {
            if (!this.d.o() && this.d.d.getLayoutManager() != null) {
                this.d.d.getLayoutManager().T0(view, h8);
                ax.c0.a a8 = this.e.get(view);
                if (a8 != null) {
                    a8.g(view, h8);
                    return;
                }
                super.g(view, h8);
                return;
            }
            super.g(view, h8);
        }

        @Override
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            ax.c0.a a8 = this.e.get(view);
            if (a8 != null) {
                a8.h(view, accessibilityEvent);
                return;
            }
            super.h(view, accessibilityEvent);
        }

        @Override
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            ax.c0.a a8 = this.e.get(viewGroup);
            if (a8 != null) {
                return a8.i(viewGroup, view, accessibilityEvent);
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        @Override
        public boolean j(@SuppressLint(value={"InvalidNullabilityOverride"}) View view, int n8, @SuppressLint(value={"InvalidNullabilityOverride"}) Bundle bundle) {
            if (!this.d.o() && this.d.d.getLayoutManager() != null) {
                ax.c0.a a8 = this.e.get(view);
                if (a8 != null ? a8.j(view, n8, bundle) : super.j(view, n8, bundle)) {
                    return true;
                }
                return this.d.d.getLayoutManager().n1(view, n8, bundle);
            }
            return super.j(view, n8, bundle);
        }

        @Override
        public void l(View view, int n8) {
            ax.c0.a a8 = this.e.get(view);
            if (a8 != null) {
                a8.l(view, n8);
                return;
            }
            super.l(view, n8);
        }

        @Override
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            ax.c0.a a8 = this.e.get(view);
            if (a8 != null) {
                a8.m(view, accessibilityEvent);
                return;
            }
            super.m(view, accessibilityEvent);
        }

        ax.c0.a n(View view) {
            return this.e.remove(view);
        }

        void o(View view) {
            ax.c0.a a8 = d0.m(view);
            if (a8 != null && a8 != this) {
                this.e.put(view, a8);
            }
        }
    }
}

