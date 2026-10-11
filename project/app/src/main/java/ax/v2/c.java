/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import ax.v2.A;
import ax.v2.N;
import ax.v2.h;
import ax.v2.k;
import ax.v2.l;
import ax.v2.x;

public class c
extends N {
    public c() {
    }

    public c(int n8) {
        this.t0(n8);
    }

    private Animator v0(View object, float f8, float f9) {
        if (f8 == f9) {
            return null;
        }
        A.e(object, f8);
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat((Object)object, A.b, (float[])new float[]{f9});
        object = new a((View)object);
        objectAnimator.addListener((Animator.AnimatorListener)object);
        this.D().b((k.f)object);
        return objectAnimator;
    }

    private static float w0(x object, float f8) {
        if (object != null && (object = (Float)((x)object).a.get("android:fade:transitionAlpha")) != null) {
            return ((Float)object).floatValue();
        }
        return f8;
    }

    @Override
    public void l(x x8) {
        Float f8;
        super.l(x8);
        Float f9 = f8 = (Float)x8.b.getTag(h.d);
        if (f8 == null) {
            f9 = x8.b.getVisibility() == 0 ? Float.valueOf(A.b(x8.b)) : Float.valueOf(0.0f);
        }
        x8.a.put("android:fade:transitionAlpha", f9);
    }

    @Override
    public Animator p0(ViewGroup viewGroup, View view, x x8, x x9) {
        A.c(view);
        return this.v0(view, c.w0(x8, 0.0f), 1.0f);
    }

    @Override
    public Animator r0(ViewGroup viewGroup, View view, x x8, x x9) {
        A.c(view);
        viewGroup = this.v0(view, c.w0(x8, 1.0f), 0.0f);
        if (viewGroup == null) {
            A.e(view, c.w0(x9, 1.0f));
        }
        return viewGroup;
    }

    private static class a
    extends AnimatorListenerAdapter
    implements k.f {
        private final View a;
        private boolean b = false;

        a(View view) {
            this.a = view;
        }

        @Override
        public void a(k k8) {
        }

        @Override
        public /* synthetic */ void b(k k8, boolean bl) {
            l.a(this, k8, bl);
        }

        @Override
        public void c(k k8, boolean bl) {
        }

        @Override
        public void d(k k8) {
            float f8 = this.a.getVisibility() == 0 ? A.b(this.a) : 0.0f;
            this.a.setTag(h.d, (Object)Float.valueOf(f8));
        }

        @Override
        public void e(k k8) {
        }

        @Override
        public void f(k k8) {
            this.a.setTag(h.d, null);
        }

        @Override
        public void g(k k8) {
        }

        public void onAnimationCancel(Animator animator) {
            A.e(this.a, 1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.onAnimationEnd(animator, false);
        }

        public void onAnimationEnd(Animator animator, boolean bl) {
            if (this.b) {
                this.a.setLayerType(0, null);
            }
            if (!bl) {
                A.e(this.a, 1.0f);
                A.a(this.a);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.a.hasOverlappingRendering() && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }
    }
}

