/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import ax.v2.A;
import ax.v2.f;
import ax.v2.k;
import ax.v2.l;
import ax.v2.s;
import ax.v2.w;
import ax.v2.x;
import ax.v2.z;

public class b
extends k {
    private static final String[] O0 = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<i, PointF> P0 = new Property<i, PointF>(PointF.class, "topLeft"){

        public PointF a(i i8) {
            return null;
        }

        public void b(i i8, PointF pointF) {
            i8.c(pointF);
        }
    };
    private static final Property<i, PointF> Q0 = new Property<i, PointF>(PointF.class, "bottomRight"){

        public PointF a(i i8) {
            return null;
        }

        public void b(i i8, PointF pointF) {
            i8.a(pointF);
        }
    };
    private static final Property<View, PointF> R0 = new Property<View, PointF>(PointF.class, "bottomRight"){

        public PointF a(View view) {
            return null;
        }

        public void b(View view, PointF pointF) {
            A.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };
    private static final Property<View, PointF> S0 = new Property<View, PointF>(PointF.class, "topLeft"){

        public PointF a(View view) {
            return null;
        }

        public void b(View view, PointF pointF) {
            A.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };
    private static final Property<View, PointF> T0 = new Property<View, PointF>(PointF.class, "position"){

        public PointF a(View view) {
            return null;
        }

        public void b(View view, PointF pointF) {
            int n8 = Math.round(pointF.x);
            int n9 = Math.round(pointF.y);
            A.d(view, n8, n9, view.getWidth() + n8, view.getHeight() + n9);
        }
    };
    private static final ax.v2.i U0 = new ax.v2.i();
    private boolean N0 = false;

    private void m0(x x8) {
        View view = x8.b;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            x8.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            x8.a.put("android:changeBounds:parent", x8.b.getParent());
            if (this.N0) {
                x8.a.put("android:changeBounds:clip", view.getClipBounds());
            }
        }
    }

    @Override
    public String[] K() {
        return O0;
    }

    @Override
    public void i(x x8) {
        this.m0(x8);
    }

    @Override
    public void l(x x8) {
        Rect rect;
        this.m0(x8);
        if (this.N0 && (rect = (Rect)x8.b.getTag(ax.v2.h.b)) != null) {
            x8.a.put("android:changeBounds:clip", rect);
        }
    }

    @Override
    public Animator r(ViewGroup object, x object2, x x8) {
        block22: {
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            int n19;
            int n20;
            View view;
            ViewGroup viewGroup;
            block27: {
                int n21;
                block26: {
                    block25: {
                        block23: {
                            block24: {
                                if (object2 == null || x8 == null) break block22;
                                viewGroup = ((x)object2).a;
                                object = x8.a;
                                viewGroup = (ViewGroup)viewGroup.get("android:changeBounds:parent");
                                object = (ViewGroup)object.get("android:changeBounds:parent");
                                if (viewGroup == null || object == null) break block22;
                                view = x8.b;
                                object = (Rect)((x)object2).a.get("android:changeBounds:bounds");
                                viewGroup = (Rect)x8.a.get("android:changeBounds:bounds");
                                n20 = ((Rect)object).left;
                                n19 = viewGroup.left;
                                n18 = ((Rect)object).top;
                                n17 = viewGroup.top;
                                n16 = ((Rect)object).right;
                                n15 = viewGroup.right;
                                n14 = ((Rect)object).bottom;
                                n13 = viewGroup.bottom;
                                n12 = n16 - n20;
                                n11 = n14 - n18;
                                n10 = n15 - n19;
                                n9 = n13 - n17;
                                object2 = (Rect)((x)object2).a.get("android:changeBounds:clip");
                                x8 = (Rect)x8.a.get("android:changeBounds:clip");
                                if ((n12 == 0 || n11 == 0) && (n10 == 0 || n9 == 0)) break block23;
                                n8 = n20 == n19 && n18 == n17 ? 0 : 1;
                                if (n16 != n15) break block24;
                                n21 = n8;
                                if (n14 == n13) break block25;
                            }
                            n21 = n8 + 1;
                            break block25;
                        }
                        n21 = 0;
                    }
                    if (object2 != null && !object2.equals((Object)x8)) break block26;
                    n8 = n21;
                    if (object2 != null) break block27;
                    n8 = n21;
                    if (x8 == null) break block27;
                }
                n8 = n21 + 1;
            }
            if (n8 > 0) {
                if (!this.N0) {
                    A.d(view, n20, n18, n16, n14);
                    if (n8 == 2) {
                        if (n12 == n10 && n11 == n9) {
                            object = this.B().a(n20, n18, n19, n17);
                            object = f.a(view, T0, (Path)object);
                        } else {
                            object2 = new i(view);
                            object = this.B().a(n20, n18, n19, n17);
                            x8 = f.a(object2, P0, (Path)object);
                            object = this.B().a(n16, n14, n15, n13);
                            viewGroup = f.a(object2, Q0, (Path)object);
                            object = new AnimatorSet();
                            object.playTogether(new Animator[]{x8, viewGroup});
                            object.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, (i)object2){
                                final i a;
                                final b b;
                                private final i mViewBounds;
                                {
                                    this.b = b8;
                                    this.a = i8;
                                    this.mViewBounds = i8;
                                }
                            });
                        }
                    } else if (n20 == n19 && n18 == n17) {
                        object = this.B().a(n16, n14, n15, n13);
                        object = f.a(view, R0, (Path)object);
                    } else {
                        object = this.B().a(n20, n18, n19, n17);
                        object = f.a(view, S0, (Path)object);
                    }
                } else {
                    boolean bl;
                    A.d(view, n20, n18, Math.max(n12, n10) + n20, n18 + Math.max(n11, n9));
                    if (n20 == n19 && n18 == n17) {
                        object = null;
                    } else {
                        object = this.B().a(n20, n18, n19, n17);
                        object = f.a(view, T0, (Path)object);
                    }
                    boolean bl2 = object2 == null;
                    if (bl2) {
                        object2 = new Rect(0, 0, n12, n11);
                    }
                    if (bl = x8 == null) {
                        x8 = new Rect(0, 0, n10, n9);
                    }
                    if (!object2.equals((Object)x8)) {
                        view.setClipBounds((Rect)object2);
                        viewGroup = ObjectAnimator.ofObject((Object)view, (String)"clipBounds", (TypeEvaluator)U0, (Object[])new Object[]{object2, x8});
                        object2 = new g(view, (Rect)object2, bl2, (Rect)x8, bl, n20, n18, n16, n14, n19, n17, n15, n13);
                        viewGroup.addListener((Animator.AnimatorListener)object2);
                        this.b((k.f)object2);
                        object2 = viewGroup;
                    } else {
                        object2 = null;
                    }
                    object = w.c((Animator)object, (Animator)object2);
                }
                if (view.getParent() instanceof ViewGroup) {
                    object2 = (ViewGroup)view.getParent();
                    z.b((ViewGroup)object2, true);
                    this.D().b(new h((ViewGroup)object2));
                }
                return object;
            }
        }
        return null;
    }

    private static class g
    extends AnimatorListenerAdapter
    implements k.f {
        private final View a;
        private final Rect b;
        private final boolean c;
        private final Rect d;
        private final boolean e;
        private final int f;
        private final int g;
        private final int h;
        private final int i;
        private final int j;
        private final int k;
        private final int l;
        private final int m;
        private boolean n;

        g(View view, Rect rect, boolean bl, Rect rect2, boolean bl2, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
            this.a = view;
            this.b = rect;
            this.c = bl;
            this.d = rect2;
            this.e = bl2;
            this.f = n8;
            this.g = n9;
            this.h = n10;
            this.i = n11;
            this.j = n12;
            this.k = n13;
            this.l = n14;
            this.m = n15;
        }

        @Override
        public void a(k k8) {
        }

        @Override
        public /* synthetic */ void b(k k8, boolean bl) {
            ax.v2.l.a(this, k8, bl);
        }

        @Override
        public /* synthetic */ void c(k k8, boolean bl) {
            ax.v2.l.b(this, k8, bl);
        }

        @Override
        public void d(k k8) {
            k8 = this.a.getClipBounds();
            this.a.setTag(ax.v2.h.b, (Object)k8);
            k8 = this.e ? null : this.d;
            this.a.setClipBounds((Rect)k8);
        }

        @Override
        public void e(k k8) {
            this.n = true;
        }

        @Override
        public void f(k k8) {
            k8 = this.a;
            int n8 = ax.v2.h.b;
            k8 = (Rect)k8.getTag(n8);
            this.a.setTag(n8, null);
            this.a.setClipBounds((Rect)k8);
        }

        @Override
        public void g(k k8) {
        }

        public void onAnimationEnd(Animator animator) {
            this.onAnimationEnd(animator, false);
        }

        public void onAnimationEnd(Animator animator, boolean bl) {
            if (this.n) {
                return;
            }
            animator = null;
            if (bl) {
                if (!this.c) {
                    animator = this.b;
                }
            } else if (!this.e) {
                animator = this.d;
            }
            this.a.setClipBounds((Rect)animator);
            if (bl) {
                A.d(this.a, this.f, this.g, this.h, this.i);
                return;
            }
            A.d(this.a, this.j, this.k, this.l, this.m);
        }

        public void onAnimationStart(Animator animator) {
            this.onAnimationStart(animator, false);
        }

        public void onAnimationStart(Animator animator, boolean bl) {
            int n8 = Math.max(this.h - this.f, this.l - this.j);
            int n9 = Math.max(this.i - this.g, this.m - this.k);
            int n10 = bl ? this.j : this.f;
            int n11 = bl ? this.k : this.g;
            A.d(this.a, n10, n11, n8 + n10, n9 + n11);
            animator = bl ? this.d : this.b;
            this.a.setClipBounds((Rect)animator);
        }
    }

    private static class h
    extends s {
        boolean a = false;
        final ViewGroup b;

        h(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override
        public void a(k k8) {
            if (!this.a) {
                z.b(this.b, false);
            }
            k8.Z(this);
        }

        @Override
        public void d(k k8) {
            z.b(this.b, false);
        }

        @Override
        public void e(k k8) {
            z.b(this.b, false);
            this.a = true;
        }

        @Override
        public void f(k k8) {
            z.b(this.b, true);
        }
    }

    private static class i {
        private int a;
        private int b;
        private int c;
        private int d;
        private final View e;
        private int f;
        private int g;

        i(View view) {
            this.e = view;
        }

        private void b() {
            A.d(this.e, this.a, this.b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }

        void a(PointF pointF) {
            int n8;
            this.c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            this.g = n8 = this.g + 1;
            if (this.f == n8) {
                this.b();
            }
        }

        void c(PointF pointF) {
            int n8;
            this.a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            this.f = n8 = this.f + 1;
            if (n8 == this.g) {
                this.b();
            }
        }
    }
}

