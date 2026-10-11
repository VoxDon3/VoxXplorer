/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.Fragment;
import ax.c0.L;

class g {
    private static int a(Fragment fragment, boolean bl, boolean bl2) {
        if (bl2) {
            if (bl) {
                return fragment.C0();
            }
            return fragment.D0();
        }
        if (bl) {
            return fragment.l0();
        }
        return fragment.o0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static a b(Context context, Fragment object, boolean bl, boolean bl2) {
        int n8;
        int n9 = ((Fragment)object).y0();
        int n10 = g.a((Fragment)object, bl, bl2);
        ((Fragment)object).u2(0, 0, 0, 0);
        ViewGroup viewGroup = ((Fragment)object).H;
        if (viewGroup != null && viewGroup.getTag(n8 = ax.z0.b.c) != null) {
            ((Fragment)object).H.setTag(n8, null);
        }
        if ((viewGroup = ((Fragment)object).H) != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        viewGroup = ((Fragment)object).o1(n9, bl, n10);
        if (viewGroup != null) {
            return new a((Animation)viewGroup);
        }
        if ((object = ((Fragment)object).p1(n9, bl, n10)) != null) {
            return new a((Animator)object);
        }
        n8 = n10;
        if (n10 == 0) {
            n8 = n10;
            if (n9 != 0) {
                n8 = g.d(context, n9, bl);
            }
        }
        if (n8 == 0) return null;
        bl = "anim".equals(context.getResources().getResourceTypeName(n8));
        if (bl) {
            try {
                object = AnimationUtils.loadAnimation((Context)context, (int)n8);
                if (object == null) return null;
                return new a((Animation)object);
            }
            catch (Resources.NotFoundException notFoundException) {
                throw notFoundException;
            }
            catch (RuntimeException runtimeException) {}
        }
        try {
            object = AnimatorInflater.loadAnimator((Context)context, (int)n8);
            if (object == null) return null;
            return new a((Animator)object);
        }
        catch (RuntimeException runtimeException) {
            if (bl) {
                throw runtimeException;
            }
            if ((context = AnimationUtils.loadAnimation((Context)context, (int)n8)) == null) return null;
            return new a((Animation)context);
        }
    }

    private static int c(Context context, int n8) {
        context = context.obtainStyledAttributes(0x1030001, new int[]{n8});
        n8 = context.getResourceId(0, -1);
        context.recycle();
        return n8;
    }

    private static int d(Context context, int n8, boolean bl) {
        if (n8 != 4097) {
            if (n8 != 8194) {
                if (n8 != 8197) {
                    if (n8 != 4099) {
                        if (n8 != 4100) {
                            return -1;
                        }
                        if (bl) {
                            return g.c(context, 16842936);
                        }
                        return g.c(context, 16842937);
                    }
                    if (bl) {
                        return ax.z0.a.c;
                    }
                    return ax.z0.a.d;
                }
                if (bl) {
                    return g.c(context, 16842938);
                }
                return g.c(context, 0x10100BB);
            }
            if (bl) {
                return ax.z0.a.a;
            }
            return ax.z0.a.b;
        }
        if (bl) {
            return ax.z0.a.e;
        }
        return ax.z0.a.f;
    }

    static class a {
        public final Animation a;
        public final Animator b;

        a(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator != null) {
                return;
            }
            throw new IllegalStateException("Animator cannot be null");
        }

        a(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation != null) {
                return;
            }
            throw new IllegalStateException("Animation cannot be null");
        }
    }

    static class b
    extends AnimationSet
    implements Runnable {
        private final View c0;
        private boolean d0;
        private boolean e0;
        private boolean f0 = true;
        private final ViewGroup q;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.q = viewGroup;
            this.c0 = view;
            this.addAnimation(animation);
            viewGroup.post((Runnable)this);
        }

        public boolean getTransformation(long l8, Transformation transformation) {
            this.f0 = true;
            if (this.d0) {
                return this.e0 ^ true;
            }
            if (!super.getTransformation(l8, transformation)) {
                this.d0 = true;
                L.a((View)this.q, this);
            }
            return true;
        }

        public boolean getTransformation(long l8, Transformation transformation, float f8) {
            this.f0 = true;
            if (this.d0) {
                return this.e0 ^ true;
            }
            if (!super.getTransformation(l8, transformation, f8)) {
                this.d0 = true;
                L.a((View)this.q, this);
            }
            return true;
        }

        @Override
        public void run() {
            if (!this.d0 && this.f0) {
                this.f0 = false;
                this.q.post((Runnable)this);
                return;
            }
            this.q.endViewTransition(this.c0);
            this.e0 = true;
        }
    }
}

