package ax.v2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import ax.v2.AbstractC3268k;

/* renamed from: ax.v2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3260c extends N {

    /* renamed from: ax.v2.c$a */
    private static class a extends AnimatorListenerAdapter implements AbstractC3268k.f {
        private final View a;
        private boolean b = false;

        a(View view) {
            this.a = view;
        }

        @Override // ax.v2.AbstractC3268k.f
        public /* synthetic */ void b(AbstractC3268k abstractC3268k, boolean z) {
            C3269l.a(this, abstractC3268k, z);
        }

        @Override // ax.v2.AbstractC3268k.f
        public void d(AbstractC3268k abstractC3268k) {
            this.a.setTag(C3265h.d, Float.valueOf(this.a.getVisibility() == 0 ? C3252A.b(this.a) : 0.0f));
        }

        @Override // ax.v2.AbstractC3268k.f
        public void f(AbstractC3268k abstractC3268k) {
            this.a.setTag(C3265h.d, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C3252A.e(this.a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.a.hasOverlappingRendering() && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (this.b) {
                this.a.setLayerType(0, null);
            }
            if (z) {
                return;
            }
            C3252A.e(this.a, 1.0f);
            C3252A.a(this.a);
        }

        @Override // ax.v2.AbstractC3268k.f
        public void a(AbstractC3268k abstractC3268k) {
        }

        @Override // ax.v2.AbstractC3268k.f
        public void e(AbstractC3268k abstractC3268k) {
        }

        @Override // ax.v2.AbstractC3268k.f
        public void g(AbstractC3268k abstractC3268k) {
        }

        @Override // ax.v2.AbstractC3268k.f
        public void c(AbstractC3268k abstractC3268k, boolean z) {
        }
    }

    public C3260c(int i) {
        t0(i);
    }

    private Animator v0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C3252A.e(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C3252A.b, f2);
        a aVar = new a(view);
        ofFloat.addListener(aVar);
        D().b(aVar);
        return ofFloat;
    }

    private static float w0(x xVar, float f) {
        Float f2;
        return (xVar == null || (f2 = (Float) xVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // ax.v2.N, ax.v2.AbstractC3268k
    public void l(x xVar) {
        super.l(xVar);
        Float f = (Float) xVar.b.getTag(C3265h.d);
        if (f == null) {
            f = xVar.b.getVisibility() == 0 ? Float.valueOf(C3252A.b(xVar.b)) : Float.valueOf(0.0f);
        }
        xVar.a.put("android:fade:transitionAlpha", f);
    }

    @Override // ax.v2.N
    public Animator p0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        C3252A.c(view);
        return v0(view, w0(xVar, 0.0f), 1.0f);
    }

    @Override // ax.v2.N
    public Animator r0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        C3252A.c(view);
        Animator v0 = v0(view, w0(xVar, 1.0f), 0.0f);
        if (v0 == null) {
            C3252A.e(view, w0(xVar2, 1.0f));
        }
        return v0;
    }

    public C3260c() {
    }
}
