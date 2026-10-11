package ax.c0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: ax.c0.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1780n0 {
    private final WeakReference<View> a;

    /* renamed from: ax.c0.n0$a */
    class a extends AnimatorListenerAdapter {
        final /* synthetic */ InterfaceC1782o0 a;
        final /* synthetic */ View b;

        a(InterfaceC1782o0 interfaceC1782o0, View view) {
            this.a = interfaceC1782o0;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    C1780n0(View view) {
        this.a = new WeakReference<>(view);
    }

    private void h(View view, InterfaceC1782o0 interfaceC1782o0) {
        if (interfaceC1782o0 != null) {
            view.animate().setListener(new a(interfaceC1782o0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public C1780n0 b(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void c() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public C1780n0 e(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public C1780n0 f(Interpolator interpolator) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public C1780n0 g(InterfaceC1782o0 interfaceC1782o0) {
        View view = this.a.get();
        if (view != null) {
            h(view, interfaceC1782o0);
        }
        return this;
    }

    public C1780n0 i(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public C1780n0 j(final InterfaceC1786q0 interfaceC1786q0) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC1786q0 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: ax.c0.m0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    InterfaceC1786q0.this.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C1780n0 l(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
