package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import ax.c0.L;
import ax.z0.C3535a;
import ax.z0.C3536b;

/* loaded from: classes.dex */
class g {
    private static int a(Fragment fragment, boolean z, boolean z2) {
        return z2 ? z ? fragment.C0() : fragment.D0() : z ? fragment.l0() : fragment.o0();
    }

    static a b(Context context, Fragment fragment, boolean z, boolean z2) {
        int y0 = fragment.y0();
        int a2 = a(fragment, z, z2);
        fragment.u2(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.H;
        if (viewGroup != null) {
            int i = C3536b.c;
            if (viewGroup.getTag(i) != null) {
                fragment.H.setTag(i, null);
            }
        }
        ViewGroup viewGroup2 = fragment.H;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation o1 = fragment.o1(y0, z, a2);
        if (o1 != null) {
            return new a(o1);
        }
        Animator p1 = fragment.p1(y0, z, a2);
        if (p1 != null) {
            return new a(p1);
        }
        if (a2 == 0 && y0 != 0) {
            a2 = d(context, y0, z);
        }
        if (a2 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a2));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a2);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, a2);
                if (loadAnimator != null) {
                    return new a(loadAnimator);
                }
            } catch (RuntimeException e2) {
                if (equals) {
                    throw e2;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a2);
                if (loadAnimation2 != null) {
                    return new a(loadAnimation2);
                }
            }
        }
        return null;
    }

    private static int c(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i, boolean z) {
        if (i == 4097) {
            return z ? C3535a.e : C3535a.f;
        }
        if (i == 8194) {
            return z ? C3535a.a : C3535a.b;
        }
        if (i == 8197) {
            return z ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i == 4099) {
            return z ? C3535a.c : C3535a.d;
        }
        if (i != 4100) {
            return -1;
        }
        return z ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    static class a {
        public final Animation a;
        public final Animator b;

        a(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    static class b extends AnimationSet implements Runnable {
        private final View c0;
        private boolean d0;
        private boolean e0;
        private boolean f0;
        private final ViewGroup q;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f0 = true;
            this.q = viewGroup;
            this.c0 = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f0 = true;
            if (this.d0) {
                return !this.e0;
            }
            if (!super.getTransformation(j, transformation)) {
                this.d0 = true;
                L.a(this.q, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.d0 || !this.f0) {
                this.q.endViewTransition(this.c0);
                this.e0 = true;
            } else {
                this.f0 = false;
                this.q.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f0 = true;
            if (this.d0) {
                return !this.e0;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.d0 = true;
                L.a(this.q, this);
            }
            return true;
        }
    }
}
