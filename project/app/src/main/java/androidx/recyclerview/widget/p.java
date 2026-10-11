/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.t;

public class p
extends t {
    private o d;
    private o e;

    private int k(View view, o o8) {
        return o8.g(view) + o8.e(view) / 2 - (o8.m() + o8.n() / 2);
    }

    private View l(RecyclerView.p p8, o o8) {
        int n8 = p8.P();
        View view = null;
        if (n8 == 0) {
            return null;
        }
        int n9 = o8.m();
        int n10 = o8.n() / 2;
        int n11 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < n8; ++i8) {
            View view2 = p8.O(i8);
            int n12 = Math.abs(o8.g(view2) + o8.e(view2) / 2 - (n9 + n10));
            int n13 = n11;
            if (n12 < n11) {
                view = view2;
                n13 = n12;
            }
            n11 = n13;
        }
        return view;
    }

    private o m(RecyclerView.p p8) {
        o o8 = this.e;
        if (o8 == null || o8.a != p8) {
            this.e = o.a(p8);
        }
        return this.e;
    }

    private o n(RecyclerView.p p8) {
        if (p8.r()) {
            return this.o(p8);
        }
        if (p8.q()) {
            return this.m(p8);
        }
        return null;
    }

    private o o(RecyclerView.p p8) {
        o o8 = this.d;
        if (o8 == null || o8.a != p8) {
            this.d = o.c(p8);
        }
        return this.d;
    }

    private boolean p(RecyclerView.p p8, int n8, int n9) {
        if (p8.q()) {
            return n8 > 0;
        }
        return n9 > 0;
    }

    private boolean q(RecyclerView.p p8) {
        int n8 = p8.f();
        if (p8 instanceof RecyclerView.A.b && (p8 = ((RecyclerView.A.b)((Object)p8)).c(n8 - 1)) != null) {
            return ((PointF)p8).x < 0.0f || ((PointF)p8).y < 0.0f;
            {
            }
        }
        return false;
    }

    @Override
    public int[] c(RecyclerView.p p8, View view) {
        int[] nArray = new int[2];
        nArray[0] = p8.q() ? this.k(view, this.m(p8)) : 0;
        if (p8.r()) {
            nArray[1] = this.k(view, this.o(p8));
            return nArray;
        }
        nArray[1] = 0;
        return nArray;
    }

    @Override
    protected RecyclerView.A d(RecyclerView.p p8) {
        if (!(p8 instanceof RecyclerView.A.b)) {
            return null;
        }
        return new l(this, this.a.getContext()){
            final p q;
            {
                this.q = p8;
                super(context);
            }

            @Override
            protected void o(View object, RecyclerView.B object2, RecyclerView.A.a a8) {
                object2 = this.q;
                object = ((p)object2).c(((t)object2).a.getLayoutManager(), (View)object);
                View view = object[0];
                View view2 = object[1];
                int n8 = this.w(Math.max(Math.abs((int)view), Math.abs((int)view2)));
                if (n8 > 0) {
                    a8.d((int)view, (int)view2, n8, (Interpolator)this.j);
                }
            }

            @Override
            protected float v(DisplayMetrics displayMetrics) {
                return 100.0f / (float)displayMetrics.densityDpi;
            }

            @Override
            protected int x(int n8) {
                return Math.min(100, super.x(n8));
            }
        };
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public View f(RecyclerView.p p8) {
        if (p8.r()) {
            return this.l(p8, this.o(p8));
        }
        if (p8.q()) {
            return this.l(p8, this.m(p8));
        }
        return null;
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public int g(RecyclerView.p p8, int n8, int n9) {
        int n10 = p8.f();
        if (n10 == 0) {
            return -1;
        }
        o o8 = this.n(p8);
        if (o8 == null) {
            return -1;
        }
        int n11 = p8.P();
        View view = null;
        View view2 = null;
        int n12 = Integer.MIN_VALUE;
        int n13 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < n11; ++i8) {
            int n14;
            View view3;
            View view4 = p8.O(i8);
            if (view4 == null) {
                view3 = view;
                n14 = n13;
            } else {
                int n15 = this.k(view4, o8);
                View view5 = view2;
                int n16 = n12;
                if (n15 <= 0) {
                    view5 = view2;
                    n16 = n12;
                    if (n15 > n12) {
                        view5 = view4;
                        n16 = n15;
                    }
                }
                view3 = view;
                view2 = view5;
                n12 = n16;
                n14 = n13;
                if (n15 >= 0) {
                    view3 = view;
                    view2 = view5;
                    n12 = n16;
                    n14 = n13;
                    if (n15 < n13) {
                        n14 = n15;
                        n12 = n16;
                        view2 = view5;
                        view3 = view4;
                    }
                }
            }
            view = view3;
            n13 = n14;
        }
        boolean bl = this.p(p8, n8, n9);
        if (bl && view != null) {
            return p8.m0(view);
        }
        if (!bl && view2 != null) {
            return p8.m0(view2);
        }
        if (bl) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        n9 = p8.m0(view);
        n8 = this.q(p8) == bl ? -1 : 1;
        if ((n8 = n9 + n8) >= 0 && n8 < n10) {
            return n8;
        }
        return -1;
    }
}

