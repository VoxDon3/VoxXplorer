/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ax.c0.d0;
import ax.d0.H;
import ax.d0.M;
import ax.l0.c;

public class SwipeDismissBehavior<V extends View>
extends CoordinatorLayout.c<V> {
    ax.l0.c a;
    c b;
    private boolean c;
    private boolean d;
    private float e = 0.0f;
    private boolean f;
    int g = 2;
    float h = 0.5f;
    float i = 0.0f;
    float j = 0.5f;
    private final c.c k = new c.c(this){
        private int a;
        private int b;
        final SwipeDismissBehavior c;
        {
            this.c = swipeDismissBehavior;
            this.b = -1;
        }

        private boolean n(View view, float f8) {
            float f9 = f8 - 0.0f;
            float f10 = f9 == 0.0f ? 0 : (f9 > 0.0f ? 1 : -1);
            if (f10 != false) {
                boolean bl = view.getLayoutDirection() == 1;
                int n8 = this.c.g;
                if (n8 == 2) {
                    return true;
                }
                if (n8 == 0) {
                    if (bl) {
                        return f8 < 0.0f;
                    }
                    return f10 > 0;
                }
                if (n8 == 1) {
                    if (bl) {
                        return f10 > 0;
                    }
                    if (f8 < 0.0f) {
                        return true;
                    }
                }
                return false;
            }
            f10 = view.getLeft();
            int n9 = this.a;
            int n10 = Math.round((float)view.getWidth() * this.c.h);
            return Math.abs((int)(f10 - n9)) >= n10;
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public int a(View view, int n8, int n9) {
            n9 = view.getLayoutDirection() == 1 ? 1 : 0;
            int n10 = this.c.g;
            if (n10 == 0) {
                if (n9 != 0) {
                    n10 = this.a - view.getWidth();
                    n9 = this.a;
                    return SwipeDismissBehavior.L(n10, n8, n9);
                }
                n10 = this.a;
                n9 = view.getWidth();
                return SwipeDismissBehavior.L(n10, n8, n9 += n10);
            } else {
                if (n10 != 1) {
                    n10 = this.a - view.getWidth();
                    n9 = this.a;
                    n9 = view.getWidth() + n9;
                    return SwipeDismissBehavior.L(n10, n8, n9);
                }
                if (n9 == 0) {
                    n10 = this.a - view.getWidth();
                    n9 = this.a;
                    return SwipeDismissBehavior.L(n10, n8, n9);
                }
                n10 = this.a;
                n9 = view.getWidth();
            }
            return SwipeDismissBehavior.L(n10, n8, n9 += n10);
        }

        @Override
        public int b(View view, int n8, int n9) {
            return view.getTop();
        }

        @Override
        public int d(View view) {
            return view.getWidth();
        }

        @Override
        public void i(View view, int n8) {
            this.b = n8;
            this.a = view.getLeft();
            if ((view = view.getParent()) != null) {
                SwipeDismissBehavior.I(this.c, true);
                view.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.I(this.c, false);
            }
        }

        @Override
        public void j(int n8) {
            c c8 = this.c.b;
            if (c8 != null) {
                c8.b(n8);
            }
        }

        @Override
        public void k(View view, int n8, int n9, int n10, int n11) {
            float f8 = (float)view.getWidth() * this.c.i;
            float f9 = (float)view.getWidth() * this.c.j;
            float f10 = Math.abs(n8 - this.a);
            if (f10 <= f8) {
                view.setAlpha(1.0f);
                return;
            }
            if (f10 >= f9) {
                view.setAlpha(0.0f);
                return;
            }
            view.setAlpha(SwipeDismissBehavior.K(0.0f, 1.0f - SwipeDismissBehavior.N(f8, f9, f10), 1.0f));
        }

        @Override
        public void l(View view, float f8, float f9) {
            c c8;
            boolean bl;
            int n8;
            this.b = -1;
            int n9 = view.getWidth();
            if (this.n(view, f8)) {
                int n10;
                n8 = !(f8 < 0.0f) && (n10 = view.getLeft()) >= (n8 = this.a) ? (n8 += n9) : this.a - n9;
                bl = true;
            } else {
                n8 = this.a;
                bl = false;
            }
            if (this.c.a.O(n8, view.getTop())) {
                view.postOnAnimation((Runnable)new d(this.c, view, bl));
                return;
            }
            if (bl && (c8 = this.c.b) != null) {
                c8.a(view);
            }
        }

        @Override
        public boolean m(View view, int n8) {
            int n9 = this.b;
            return (n9 == -1 || n9 == n8) && this.c.J(view);
        }
    };

    static /* synthetic */ boolean I(SwipeDismissBehavior swipeDismissBehavior, boolean bl) {
        swipeDismissBehavior.d = bl;
        return bl;
    }

    static float K(float f8, float f9, float f10) {
        return Math.min(Math.max(f8, f9), f10);
    }

    static int L(int n8, int n9, int n10) {
        return Math.min(Math.max(n8, n9), n10);
    }

    private void M(ViewGroup object) {
        if (this.a == null) {
            object = this.f ? ax.l0.c.n(object, this.e, this.k) : ax.l0.c.o(object, this.k);
            this.a = object;
        }
    }

    static float N(float f8, float f9, float f10) {
        return (f10 - f8) / (f9 - f8);
    }

    private void S(View view) {
        d0.f0(view, 0x100000);
        if (this.J(view)) {
            d0.h0(view, H.a.y, null, new M(this){
                final SwipeDismissBehavior a;
                {
                    this.a = swipeDismissBehavior;
                }

                @Override
                public boolean a(View view, M.a object) {
                    boolean bl = this.a.J(view);
                    int n8 = 0;
                    if (bl) {
                        int n9;
                        if (view.getLayoutDirection() == 1) {
                            n8 = 1;
                        }
                        n8 = (n9 = this.a.g) == 0 && n8 != 0 || n9 == 1 && n8 == 0 ? -view.getWidth() : view.getWidth();
                        d0.V(view, n8);
                        view.setAlpha(0.0f);
                        object = this.a.b;
                        if (object != null) {
                            object.a(view);
                        }
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    @Override
    public boolean H(CoordinatorLayout coordinatorLayout, V v8, MotionEvent motionEvent) {
        if (this.a != null) {
            if (!this.d || motionEvent.getActionMasked() != 3) {
                this.a.F(motionEvent);
            }
            return true;
        }
        return false;
    }

    public boolean J(View view) {
        return true;
    }

    public void O(float f8) {
        this.j = SwipeDismissBehavior.K(0.0f, f8, 1.0f);
    }

    public void P(c c8) {
        this.b = c8;
    }

    public void Q(float f8) {
        this.i = SwipeDismissBehavior.K(0.0f, f8, 1.0f);
    }

    public void R(int n8) {
        this.g = n8;
    }

    @Override
    public boolean o(CoordinatorLayout coordinatorLayout, V v8, MotionEvent motionEvent) {
        boolean bl = this.c;
        int n8 = motionEvent.getActionMasked();
        if (n8 != 0) {
            if (n8 == 1 || n8 == 3) {
                this.c = false;
            }
        } else {
            this.c = bl = coordinatorLayout.B((View)v8, (int)motionEvent.getX(), (int)motionEvent.getY());
        }
        if (bl) {
            this.M(coordinatorLayout);
            if (!this.d && this.a.P(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean p(CoordinatorLayout coordinatorLayout, V v8, int n8) {
        boolean bl = super.p(coordinatorLayout, v8, n8);
        if (v8.getImportantForAccessibility() == 0) {
            v8.setImportantForAccessibility(1);
            this.S((View)v8);
        }
        return bl;
    }

    public static interface c {
        public void a(View var1);

        public void b(int var1);
    }

    private class d
    implements Runnable {
        private final boolean c0;
        final SwipeDismissBehavior d0;
        private final View q;

        d(SwipeDismissBehavior swipeDismissBehavior, View view, boolean bl) {
            this.d0 = swipeDismissBehavior;
            this.q = view;
            this.c0 = bl;
        }

        @Override
        public void run() {
            Object object = this.d0.a;
            if (object != null && ((ax.l0.c)object).m(true)) {
                this.q.postOnAnimation((Runnable)this);
                return;
            }
            if (this.c0 && (object = this.d0.b) != null) {
                object.a(this.q);
            }
        }
    }
}

