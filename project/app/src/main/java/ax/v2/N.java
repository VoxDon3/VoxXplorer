/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import ax.v2.A;
import ax.v2.h;
import ax.v2.k;
import ax.v2.l;
import ax.v2.w;
import ax.v2.x;
import ax.v2.z;

public abstract class N
extends k {
    private static final String[] O0 = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    private int N0 = 3;

    private void m0(x x8) {
        int n8 = x8.b.getVisibility();
        x8.a.put("android:visibility:visibility", n8);
        x8.a.put("android:visibility:parent", x8.b.getParent());
        int[] nArray = new int[2];
        x8.b.getLocationOnScreen(nArray);
        x8.a.put("android:visibility:screenLocation", nArray);
    }

    private c n0(x x8, x x9) {
        c c8 = new c();
        c8.a = false;
        c8.b = false;
        if (x8 != null && x8.a.containsKey("android:visibility:visibility")) {
            c8.c = (Integer)x8.a.get("android:visibility:visibility");
            c8.e = (ViewGroup)x8.a.get("android:visibility:parent");
        } else {
            c8.c = -1;
            c8.e = null;
        }
        if (x9 != null && x9.a.containsKey("android:visibility:visibility")) {
            c8.d = (Integer)x9.a.get("android:visibility:visibility");
            c8.f = (ViewGroup)x9.a.get("android:visibility:parent");
        } else {
            c8.d = -1;
            c8.f = null;
        }
        if (x8 != null && x9 != null) {
            int n8 = c8.c;
            int n9 = c8.d;
            if (n8 != n9 || c8.e != c8.f) {
                if (n8 != n9) {
                    if (n8 == 0) {
                        c8.b = false;
                        c8.a = true;
                        return c8;
                    }
                    if (n9 == 0) {
                        c8.b = true;
                        c8.a = true;
                        return c8;
                    }
                } else {
                    if (c8.f == null) {
                        c8.b = false;
                        c8.a = true;
                        return c8;
                    }
                    if (c8.e == null) {
                        c8.b = true;
                        c8.a = true;
                        return c8;
                    }
                }
            }
        } else {
            if (x8 == null && c8.d == 0) {
                c8.b = true;
                c8.a = true;
                return c8;
            }
            if (x9 == null && c8.c == 0) {
                c8.b = false;
                c8.a = true;
            }
        }
        return c8;
    }

    @Override
    public String[] K() {
        return O0;
    }

    @Override
    public boolean M(x object, x x8) {
        if (object == null && x8 == null) {
            return false;
        }
        if (object != null && x8 != null && x8.a.containsKey("android:visibility:visibility") != ((x)object).a.containsKey("android:visibility:visibility")) {
            return false;
        }
        object = this.n0((x)object, x8);
        return ((c)object).a && (((c)object).c == 0 || ((c)object).d == 0);
    }

    @Override
    public void i(x x8) {
        this.m0(x8);
    }

    @Override
    public void l(x x8) {
        this.m0(x8);
    }

    public abstract Animator p0(ViewGroup var1, View var2, x var3, x var4);

    public Animator q0(ViewGroup viewGroup, x x8, int n8, x x9, int n9) {
        if ((this.N0 & 1) == 1 && x9 != null) {
            if (x8 == null) {
                View view = (View)x9.b.getParent();
                if (this.n0((x)this.y((View)view, (boolean)false), (x)this.L((View)view, (boolean)false)).a) {
                    return null;
                }
            }
            return this.p0(viewGroup, x9.b, x8, x9);
        }
        return null;
    }

    @Override
    public Animator r(ViewGroup viewGroup, x x8, x x9) {
        c c8 = this.n0(x8, x9);
        if (c8.a && (c8.e != null || c8.f != null)) {
            if (c8.b) {
                return this.q0(viewGroup, x8, c8.c, x9, c8.d);
            }
            return this.s0(viewGroup, x8, c8.c, x9, c8.d);
        }
        return null;
    }

    public abstract Animator r0(ViewGroup var1, View var2, x var3, x var4);

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Animator s0(ViewGroup var1_1, x var2_2, int var3_3, x var4_4, int var5_5) {
        block15: {
            block18: {
                block19: {
                    block17: {
                        block14: {
                            block16: {
                                if ((this.N0 & 2) != 2) {
                                    return null;
                                }
                                if (var2_2 == null) {
                                    return null;
                                }
                                var11_6 = var2_2.b;
                                var9_7 /* !! */  = var4_4 != null ? var4_4.b : null;
                                var6_8 = h.a;
                                var8_9 = (View)var11_6.getTag(var6_8);
                                if (var8_9 == null) break block16;
                                var9_7 /* !! */  = null;
                                var3_3 = 1;
                                break block15;
                            }
                            if (var9_7 /* !! */  == null || var9_7 /* !! */ .getParent() == null) ** GOTO lbl25
                            if (var5_5 /* !! */  == 4 || var11_6 == var9_7 /* !! */ ) {
                                var8_9 = var9_7 /* !! */ ;
                                var3_3 = 0;
                                var9_7 /* !! */  = null;
                            } else {
                                while (true) {
                                    var9_7 /* !! */  = null;
                                    var8_9 = null;
                                    var3_3 = 1;
                                    break block14;
                                    break;
                                }
lbl25:
                                // 1 sources

                                if (var9_7 /* !! */  == null) ** continue;
                                var8_9 = null;
                                var3_3 = 0;
                            }
                        }
                        var10_10 = var9_7 /* !! */ ;
                        if (var3_3 == 0) break block17;
                        if (var11_6.getParent() == null) break block18;
                        var10_10 = var9_7 /* !! */ ;
                        if (!(var11_6.getParent() instanceof View)) break block17;
                        var12_11 = (View)var11_6.getParent();
                        if (this.n0((x)this.L((View)var12_11, (boolean)true), (x)this.y((View)var12_11, (boolean)true)).a) break block19;
                        var10_10 = w.a(var1_1 /* !! */ , var11_6, var12_11);
                    }
lbl38:
                    // 5 sources

                    while (true) {
                        var3_3 = 0;
                        var9_7 /* !! */  = var8_9;
                        var8_9 = var10_10;
                        break block15;
                        break;
                    }
                }
                var3_3 = var12_11.getId();
                var10_10 = var9_7 /* !! */ ;
                if (var12_11.getParent() != null) ** GOTO lbl38
                var10_10 = var9_7 /* !! */ ;
                if (var3_3 == -1) ** GOTO lbl38
                var10_10 = var9_7 /* !! */ ;
                if (var1_1 /* !! */ .findViewById(var3_3) == null) ** GOTO lbl38
                var10_10 = var9_7 /* !! */ ;
                if (this.x0) ** break;
                ** while (true)
            }
            var9_7 /* !! */  = var8_9;
            var3_3 = 0;
            var8_9 = var11_6;
        }
        if (var8_9 != null) {
            if (var3_3 == 0) {
                var9_7 /* !! */  = (View)((int[])var2_2.a.get("android:visibility:screenLocation"));
                var5_5 /* !! */  = (int)var9_7 /* !! */ [0];
                var7_12 = var9_7 /* !! */ [1];
                var9_7 /* !! */  = (View)new int[2];
                var1_1 /* !! */ .getLocationOnScreen((int[])var9_7 /* !! */ );
                var8_9.offsetLeftAndRight(var5_5 /* !! */  - var9_7 /* !! */ [0] - var8_9.getLeft());
                var8_9.offsetTopAndBottom((int)(var7_12 - var9_7 /* !! */ [1] - var8_9.getTop()));
                var1_1 /* !! */ .getOverlay().add(var8_9);
            }
            var2_2 = this.r0(var1_1 /* !! */ , var8_9, (x)var2_2, var4_4);
            if (var3_3 == 0) {
                if (var2_2 == null) {
                    var1_1 /* !! */ .getOverlay().remove(var8_9);
                    return var2_2;
                }
                var11_6.setTag(var6_8, (Object)var8_9);
                var1_1 /* !! */  = new b(this, var1_1 /* !! */ , var8_9, var11_6);
                var2_2.addListener((Animator.AnimatorListener)var1_1 /* !! */ );
                var2_2.addPauseListener((Animator.AnimatorPauseListener)var1_1 /* !! */ );
                this.D().b((k.f)var1_1 /* !! */ );
            }
            return var2_2;
        }
        if (var9_7 /* !! */  != null) {
            var3_3 = var9_7 /* !! */ .getVisibility();
            A.f(var9_7 /* !! */ , 0);
            var1_1 /* !! */  = this.r0(var1_1 /* !! */ , var9_7 /* !! */ , (x)var2_2, var4_4);
            if (var1_1 /* !! */  != null) {
                var2_2 = new a(var9_7 /* !! */ , var5_5 /* !! */ , true);
                var1_1 /* !! */ .addListener((Animator.AnimatorListener)var2_2);
                this.D().b((k.f)var2_2);
                return var1_1 /* !! */ ;
            }
            A.f(var9_7 /* !! */ , var3_3);
            return var1_1 /* !! */ ;
        }
        return null;
    }

    public void t0(int n8) {
        if ((n8 & 0xFFFFFFFC) == 0) {
            this.N0 = n8;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    private static class a
    extends AnimatorListenerAdapter
    implements k.f {
        private final View a;
        private final int b;
        private final ViewGroup c;
        private final boolean d;
        private boolean e;
        boolean f = false;

        a(View view, int n8, boolean bl) {
            this.a = view;
            this.b = n8;
            this.c = (ViewGroup)view.getParent();
            this.d = bl;
            this.i(true);
        }

        private void h() {
            if (!this.f) {
                A.f(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            this.i(false);
        }

        private void i(boolean bl) {
            ViewGroup viewGroup;
            if (this.d && this.e != bl && (viewGroup = this.c) != null) {
                this.e = bl;
                z.b(viewGroup, bl);
            }
        }

        @Override
        public void a(k k8) {
            k8.Z(this);
        }

        @Override
        public /* synthetic */ void b(k k8, boolean bl) {
            l.a(this, k8, bl);
        }

        @Override
        public /* synthetic */ void c(k k8, boolean bl) {
            l.b(this, k8, bl);
        }

        @Override
        public void d(k k8) {
            this.i(false);
            if (!this.f) {
                A.f(this.a, this.b);
            }
        }

        @Override
        public void e(k k8) {
        }

        @Override
        public void f(k k8) {
            this.i(true);
            if (!this.f) {
                A.f(this.a, 0);
            }
        }

        @Override
        public void g(k k8) {
        }

        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        public void onAnimationEnd(Animator animator) {
            this.h();
        }

        public void onAnimationEnd(Animator animator, boolean bl) {
            if (!bl) {
                this.h();
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onAnimationStart(Animator animator, boolean bl) {
            if (bl) {
                A.f(this.a, 0);
                animator = this.c;
                if (animator != null) {
                    animator.invalidate();
                }
            }
        }
    }

    private class b
    extends AnimatorListenerAdapter
    implements k.f {
        private final ViewGroup a;
        private final View b;
        private final View c;
        private boolean d;
        final N e;

        b(N n8, ViewGroup viewGroup, View view, View view2) {
            this.e = n8;
            this.d = true;
            this.a = viewGroup;
            this.b = view;
            this.c = view2;
        }

        private void h() {
            this.c.setTag(h.a, null);
            this.a.getOverlay().remove(this.b);
            this.d = false;
        }

        @Override
        public void a(k k8) {
            k8.Z(this);
        }

        @Override
        public /* synthetic */ void b(k k8, boolean bl) {
            l.a(this, k8, bl);
        }

        @Override
        public /* synthetic */ void c(k k8, boolean bl) {
            l.b(this, k8, bl);
        }

        @Override
        public void d(k k8) {
        }

        @Override
        public void e(k k8) {
            if (this.d) {
                this.h();
            }
        }

        @Override
        public void f(k k8) {
        }

        @Override
        public void g(k k8) {
        }

        public void onAnimationEnd(Animator animator) {
            this.h();
        }

        public void onAnimationEnd(Animator animator, boolean bl) {
            if (!bl) {
                this.h();
            }
        }

        public void onAnimationPause(Animator animator) {
            this.a.getOverlay().remove(this.b);
        }

        public void onAnimationResume(Animator animator) {
            if (this.b.getParent() == null) {
                this.a.getOverlay().add(this.b);
                return;
            }
            this.e.cancel();
        }

        public void onAnimationStart(Animator animator, boolean bl) {
            if (bl) {
                this.c.setTag(h.a, (Object)this.b);
                this.a.getOverlay().add(this.b);
                this.d = true;
            }
        }
    }

    private static class c {
        boolean a;
        boolean b;
        int c;
        int d;
        ViewGroup e;
        ViewGroup f;

        c() {
        }
    }
}

