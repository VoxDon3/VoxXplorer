package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.c0.C1760d0;
import ax.d0.H;
import ax.d0.M;
import ax.l0.c;

/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    ax.l0.c a;
    c b;
    private boolean c;
    private boolean d;
    private boolean f;
    private float e = 0.0f;
    int g = 2;
    float h = 0.5f;
    float i = 0.0f;
    float j = 0.5f;
    private final c.AbstractC0359c k = new a();

    class a extends c.AbstractC0359c {
        private int a;
        private int b = -1;

        a() {
        }

        private boolean n(View view, float f) {
            if (f == 0.0f) {
                return Math.abs(view.getLeft() - this.a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.h);
            }
            boolean z = view.getLayoutDirection() == 1;
            int i = SwipeDismissBehavior.this.g;
            if (i == 2) {
                return true;
            }
            if (i == 0) {
                return z ? f < 0.0f : f > 0.0f;
            }
            if (i == 1) {
                if (z) {
                    return f > 0.0f;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // ax.l0.c.AbstractC0359c
        public int a(View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            boolean z = view.getLayoutDirection() == 1;
            int i3 = SwipeDismissBehavior.this.g;
            if (i3 == 0) {
                if (z) {
                    width = this.a - view.getWidth();
                    width2 = this.a;
                } else {
                    width = this.a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.a - view.getWidth();
                width2 = view.getWidth() + this.a;
            } else if (z) {
                width = this.a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.a - view.getWidth();
                width2 = this.a;
            }
            return SwipeDismissBehavior.L(width, i, width2);
        }

        @Override // ax.l0.c.AbstractC0359c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // ax.l0.c.AbstractC0359c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // ax.l0.c.AbstractC0359c
        public void i(View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.d = false;
            }
        }

        @Override // ax.l0.c.AbstractC0359c
        public void j(int i) {
            c cVar = SwipeDismissBehavior.this.b;
            if (cVar != null) {
                cVar.b(i);
            }
        }

        @Override // ax.l0.c.AbstractC0359c
        public void k(View view, int i, int i2, int i3, int i4) {
            float width = view.getWidth() * SwipeDismissBehavior.this.i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.j;
            float abs = Math.abs(i - this.a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.K(0.0f, 1.0f - SwipeDismissBehavior.N(width, width2, abs), 1.0f));
            }
        }

        @Override // ax.l0.c.AbstractC0359c
        public void l(View view, float f, float f2) {
            int i;
            boolean z;
            c cVar;
            this.b = -1;
            int width = view.getWidth();
            if (n(view, f)) {
                if (f >= 0.0f) {
                    int left = view.getLeft();
                    int i2 = this.a;
                    if (left >= i2) {
                        i = i2 + width;
                        z = true;
                    }
                }
                i = this.a - width;
                z = true;
            } else {
                i = this.a;
                z = false;
            }
            if (SwipeDismissBehavior.this.a.O(i, view.getTop())) {
                view.postOnAnimation(new d(view, z));
            } else {
                if (!z || (cVar = SwipeDismissBehavior.this.b) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // ax.l0.c.AbstractC0359c
        public boolean m(View view, int i) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.J(view);
        }
    }

    class b implements M {
        b() {
        }

        @Override // ax.d0.M
        public boolean a(View view, M.a aVar) {
            if (!SwipeDismissBehavior.this.J(view)) {
                return false;
            }
            boolean z = view.getLayoutDirection() == 1;
            int i = SwipeDismissBehavior.this.g;
            C1760d0.V(view, (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i);
    }

    private class d implements Runnable {
        private final boolean c0;
        private final View q;

        d(View view, boolean z) {
            this.q = view;
            this.c0 = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            ax.l0.c cVar2 = SwipeDismissBehavior.this.a;
            if (cVar2 != null && cVar2.m(true)) {
                this.q.postOnAnimation(this);
            } else {
                if (!this.c0 || (cVar = SwipeDismissBehavior.this.b) == null) {
                    return;
                }
                cVar.a(this.q);
            }
        }
    }

    static float K(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    static int L(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    private void M(ViewGroup viewGroup) {
        if (this.a == null) {
            this.a = this.f ? ax.l0.c.n(viewGroup, this.e, this.k) : ax.l0.c.o(viewGroup, this.k);
        }
    }

    static float N(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    private void S(View view) {
        C1760d0.f0(view, 1048576);
        if (J(view)) {
            C1760d0.h0(view, H.a.y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.F(motionEvent);
        return true;
    }

    public boolean J(View view) {
        return true;
    }

    public void O(float f) {
        this.j = K(0.0f, f, 1.0f);
    }

    public void P(c cVar) {
        this.b = cVar;
    }

    public void Q(float f) {
        this.i = K(0.0f, f, 1.0f);
    }

    public void R(int i) {
        this.g = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.B(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (z) {
            M(coordinatorLayout);
            if (!this.d && this.a.P(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean p = super.p(coordinatorLayout, v, i);
        if (v.getImportantForAccessibility() == 0) {
            v.setImportantForAccessibility(1);
            S(v);
        }
        return p;
    }
}
