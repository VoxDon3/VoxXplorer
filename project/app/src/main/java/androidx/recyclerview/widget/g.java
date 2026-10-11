/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ax.c0.d0;

class g
extends RecyclerView.o
implements RecyclerView.t {
    private static final int[] D = new int[]{16842919};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.u C;
    private final int a;
    private final int b;
    final StateListDrawable c;
    final Drawable d;
    private final int e;
    private final int f;
    private final StateListDrawable g;
    private final Drawable h;
    private final int i;
    private final int j;
    int k;
    int l;
    float m;
    int n;
    int o;
    float p;
    private int q = 0;
    private int r = 0;
    private RecyclerView s;
    private boolean t = false;
    private boolean u = false;
    private int v = 0;
    private int w = 0;
    private final int[] x = new int[2];
    private final int[] y = new int[2];
    final ValueAnimator z;

    g(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int n8, int n9, int n10) {
        ValueAnimator valueAnimator;
        this.z = valueAnimator = ValueAnimator.ofFloat((float[])new float[]{0.0f, 1.0f});
        this.A = 0;
        this.B = new Runnable(this){
            final g q;
            {
                this.q = g8;
            }

            @Override
            public void run() {
                this.q.s(500);
            }
        };
        this.C = new RecyclerView.u(this){
            final g a;
            {
                this.a = g8;
            }

            @Override
            public void b(RecyclerView recyclerView, int n8, int n9) {
                this.a.D(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
            }
        };
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(n8, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(n8, drawable.getIntrinsicWidth());
        this.i = Math.max(n8, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(n8, drawable2.getIntrinsicWidth());
        this.a = n9;
        this.b = n10;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimator.addListener((Animator.AnimatorListener)new c(this));
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new d(this));
        this.l(recyclerView);
    }

    private void B() {
        this.s.j(this);
        this.s.m(this);
        this.s.n(this.C);
    }

    private void E(float f8) {
        int[] nArray = this.r();
        f8 = Math.max((float)nArray[0], Math.min((float)nArray[1], f8));
        if (Math.abs((float)this.l - f8) < 2.0f) {
            return;
        }
        int n8 = this.z(this.m, f8, nArray, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
        if (n8 != 0) {
            this.s.scrollBy(0, n8);
        }
        this.m = f8;
    }

    private void m() {
        this.s.removeCallbacks(this.B);
    }

    private void n() {
        this.s.k1(this);
        this.s.m1(this);
        this.s.n1(this.C);
        this.m();
    }

    private void o(Canvas canvas) {
        int n8 = this.r;
        int n9 = this.i;
        int n10 = n8 - n9;
        int n11 = this.o;
        n8 = this.n;
        this.g.setBounds(0, 0, n8, n9);
        this.h.setBounds(0, 0, this.q, this.j);
        canvas.translate(0.0f, (float)n10);
        this.h.draw(canvas);
        canvas.translate((float)(n11 -= n8 / 2), 0.0f);
        this.g.draw(canvas);
        canvas.translate((float)(-n11), (float)(-n10));
    }

    private void p(Canvas canvas) {
        int n8 = this.q;
        int n9 = this.e;
        int n10 = n8 - n9;
        int n11 = this.l;
        n8 = this.k;
        n11 -= n8 / 2;
        this.c.setBounds(0, 0, n9, n8);
        this.d.setBounds(0, 0, this.f, this.r);
        if (this.u()) {
            this.d.draw(canvas);
            canvas.translate((float)this.e, (float)n11);
            canvas.scale(-1.0f, 1.0f);
            this.c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate((float)(-this.e), (float)(-n11));
            return;
        }
        canvas.translate((float)n10, 0.0f);
        this.d.draw(canvas);
        canvas.translate(0.0f, (float)n11);
        this.c.draw(canvas);
        canvas.translate((float)(-n10), (float)(-n11));
    }

    private int[] q() {
        int n8;
        int[] nArray = this.y;
        nArray[0] = n8 = this.b;
        nArray[1] = this.q - n8;
        return nArray;
    }

    private int[] r() {
        int n8;
        int[] nArray = this.x;
        nArray[0] = n8 = this.b;
        nArray[1] = this.r - n8;
        return nArray;
    }

    private void t(float f8) {
        int[] nArray = this.q();
        f8 = Math.max((float)nArray[0], Math.min((float)nArray[1], f8));
        if (Math.abs((float)this.o - f8) < 2.0f) {
            return;
        }
        int n8 = this.z(this.p, f8, nArray, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
        if (n8 != 0) {
            this.s.scrollBy(n8, 0);
        }
        this.p = f8;
    }

    private boolean u() {
        return d0.B((View)this.s) == 1;
    }

    private void y(int n8) {
        this.m();
        this.s.postDelayed(this.B, n8);
    }

    private int z(float f8, float f9, int[] nArray, int n8, int n9, int n10) {
        int n11 = nArray[1] - nArray[0];
        if (n11 == 0) {
            return 0;
        }
        if ((n9 += (n8 = (int)((f8 = (f9 - f8) / (float)n11) * (float)(n10 = n8 - n10)))) < n10 && n9 >= 0) {
            return n8;
        }
        return 0;
    }

    void A(int n8) {
        if (n8 == 2 && this.v != 2) {
            this.c.setState(D);
            this.m();
        }
        if (n8 == 0) {
            this.x();
        } else {
            this.C();
        }
        if (this.v == 2 && n8 != 2) {
            this.c.setState(E);
            this.y(1200);
        } else if (n8 == 1) {
            this.y(1500);
        }
        this.v = n8;
    }

    public void C() {
        int n8 = this.A;
        if (n8 != 0) {
            if (n8 != 3) {
                return;
            }
            this.z.cancel();
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(new float[]{((Float)valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.z.setDuration(500L);
        this.z.setStartDelay(0L);
        this.z.start();
    }

    void D(int n8, int n9) {
        block9: {
            block8: {
                float f8;
                float f9;
                boolean bl;
                int n10;
                int n11;
                int n12;
                int n13;
                block7: {
                    n13 = this.s.computeVerticalScrollRange();
                    boolean bl2 = n13 - (n12 = this.r) > 0 && n12 >= this.a;
                    this.t = bl2;
                    n11 = this.s.computeHorizontalScrollRange();
                    n10 = this.q;
                    bl2 = n11 - n10 > 0 && n10 >= this.a;
                    this.u = bl2;
                    bl = this.t;
                    if (bl || bl2) break block7;
                    if (this.v != 0) {
                        this.A(0);
                        return;
                    }
                    break block8;
                }
                if (bl) {
                    f9 = n9;
                    f8 = n12;
                    this.l = (int)(f8 * (f9 + f8 / 2.0f) / (float)n13);
                    this.k = Math.min(n12, n12 * n12 / n13);
                }
                if (this.u) {
                    f8 = n8;
                    f9 = n10;
                    this.o = (int)(f9 * (f8 + f9 / 2.0f) / (float)n11);
                    this.n = Math.min(n10, n10 * n10 / n11);
                }
                if ((n8 = this.v) == 0 || n8 == 1) break block9;
            }
            return;
        }
        this.A(1);
    }

    @Override
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean bl = this.w(motionEvent.getX(), motionEvent.getY());
                boolean bl2 = this.v(motionEvent.getX(), motionEvent.getY());
                if (bl || bl2) {
                    if (bl2) {
                        this.w = 1;
                        this.p = (int)motionEvent.getX();
                    } else if (bl) {
                        this.w = 2;
                        this.m = (int)motionEvent.getY();
                    }
                    this.A(2);
                    return;
                }
            } else {
                if (motionEvent.getAction() == 1 && this.v == 2) {
                    this.m = 0.0f;
                    this.p = 0.0f;
                    this.A(1);
                    this.w = 0;
                    return;
                }
                if (motionEvent.getAction() == 2 && this.v == 2) {
                    this.C();
                    if (this.w == 1) {
                        this.t(motionEvent.getX());
                    }
                    if (this.w == 2) {
                        this.E(motionEvent.getY());
                    }
                }
            }
        }
    }

    @Override
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int n8 = this.v;
        if (n8 == 1) {
            boolean bl = this.w(motionEvent.getX(), motionEvent.getY());
            boolean bl2 = this.v(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (bl || bl2)) {
                if (bl2) {
                    this.w = 1;
                    this.p = (int)motionEvent.getX();
                } else if (bl) {
                    this.w = 2;
                    this.m = (int)motionEvent.getY();
                }
                this.A(2);
                return true;
            }
            return false;
        }
        return n8 == 2;
    }

    @Override
    public void e(boolean bl) {
    }

    @Override
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b8) {
        if (this.q == this.s.getWidth() && this.r == this.s.getHeight()) {
            if (this.A != 0) {
                if (this.t) {
                    this.p(canvas);
                }
                if (this.u) {
                    this.o(canvas);
                }
            }
            return;
        }
        this.q = this.s.getWidth();
        this.r = this.s.getHeight();
        this.A(0);
    }

    public void l(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                this.n();
            }
            this.s = recyclerView;
            if (recyclerView != null) {
                this.B();
            }
        }
    }

    void s(int n8) {
        int n9 = this.A;
        if (n9 != 1) {
            if (n9 != 2) {
                return;
            }
        } else {
            this.z.cancel();
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(new float[]{((Float)valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.z.setDuration((long)n8);
        this.z.start();
    }

    boolean v(float f8, float f9) {
        int n8;
        int n9;
        return f9 >= (float)(this.r - this.i) && f8 >= (float)((n9 = this.o) - (n8 = this.n) / 2) && f8 <= (float)(n9 + n8 / 2);
    }

    boolean w(float f8, float f9) {
        int n8;
        int n9;
        return (this.u() ? f8 <= (float)this.e : f8 >= (float)(this.q - this.e)) && f9 >= (float)((n9 = this.l) - (n8 = this.k) / 2) && f9 <= (float)(n9 + n8 / 2);
    }

    void x() {
        this.s.invalidate();
    }

    private class c
    extends AnimatorListenerAdapter {
        private boolean a;
        final g b;

        c(g g8) {
            this.b = g8;
            this.a = false;
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator object) {
            if (this.a) {
                this.a = false;
                return;
            }
            if (((Float)this.b.z.getAnimatedValue()).floatValue() == 0.0f) {
                object = this.b;
                ((g)object).A = 0;
                ((g)object).A(0);
                return;
            }
            object = this.b;
            ((g)object).A = 2;
            ((g)object).x();
        }
    }

    private class d
    implements ValueAnimator.AnimatorUpdateListener {
        final g a;

        d(g g8) {
            this.a = g8;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int n8 = (int)(((Float)valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            this.a.c.setAlpha(n8);
            this.a.d.setAlpha(n8);
            this.a.x();
        }
    }
}

