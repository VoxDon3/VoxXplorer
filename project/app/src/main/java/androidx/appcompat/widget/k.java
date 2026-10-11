/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.J;
import ax.T.a;
import ax.m.c;
import ax.m.d;
import ax.m.e;

public final class k {
    private static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    private static k c;
    private C a;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static k b() {
        synchronized (k.class) {
            try {
                if (c != null) return c;
                k.h();
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static PorterDuffColorFilter e(int n8, PorterDuff.Mode mode) {
        synchronized (k.class) {
            return C.l(n8, mode);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void h() {
        synchronized (k.class) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (c != null) break block4;
                        C.f f8 = new k();
                        c = f8;
                        ((k)((Object)f8)).a = C.h();
                        C c8 = k.c.a;
                        f8 = new C.f(){
                            private final int[] a = new int[]{e.R, e.P, e.a};
                            private final int[] b = new int[]{e.o, e.B, e.t, e.p, e.q, e.s, e.r};
                            private final int[] c = new int[]{e.O, e.Q, e.k, e.K, e.L, e.M, e.N};
                            private final int[] d = new int[]{e.w, e.i, e.v};
                            private final int[] e = new int[]{e.J, e.S};
                            private final int[] f = new int[]{e.c, e.g, e.d, e.h};

                            private boolean f(int[] nArray, int n8) {
                                int n9 = nArray.length;
                                for (int i8 = 0; i8 < n9; ++i8) {
                                    if (nArray[i8] != n8) continue;
                                    return true;
                                }
                                return false;
                            }

                            private ColorStateList g(Context context) {
                                return this.h(context, 0);
                            }

                            private ColorStateList h(Context object, int n8) {
                                int n9 = H.c(object, ax.m.a.w);
                                int n10 = H.b(object, ax.m.a.u);
                                int[] nArray = H.b;
                                object = H.e;
                                int n11 = ax.T.a.g(n9, n8);
                                int[] nArray2 = H.c;
                                n9 = ax.T.a.g(n9, n8);
                                return new ColorStateList((int[][])new int[][]{nArray, (int[])object, nArray2, H.i}, new int[]{n10, n11, n9, n8});
                            }

                            private ColorStateList i(Context context) {
                                return this.h(context, H.c(context, ax.m.a.t));
                            }

                            private ColorStateList j(Context context) {
                                return this.h(context, H.c(context, ax.m.a.u));
                            }

                            private ColorStateList k(Context context) {
                                int[][] nArrayArray = new int[3][];
                                int[] nArray = new int[3];
                                int n8 = ax.m.a.A;
                                ColorStateList colorStateList = H.e(context, n8);
                                if (colorStateList != null && colorStateList.isStateful()) {
                                    int[] nArray2 = H.b;
                                    nArrayArray[0] = nArray2;
                                    nArray[0] = colorStateList.getColorForState(nArray2, 0);
                                    nArrayArray[1] = H.f;
                                    nArray[1] = H.c(context, ax.m.a.v);
                                    nArrayArray[2] = H.i;
                                    nArray[2] = colorStateList.getDefaultColor();
                                } else {
                                    nArrayArray[0] = H.b;
                                    nArray[0] = H.b(context, n8);
                                    nArrayArray[1] = H.f;
                                    nArray[1] = H.c(context, ax.m.a.v);
                                    nArrayArray[2] = H.i;
                                    nArray[2] = H.c(context, n8);
                                }
                                return new ColorStateList((int[][])nArrayArray, nArray);
                            }

                            private LayerDrawable l(C c8, Context context, int n8) {
                                n8 = context.getResources().getDimensionPixelSize(n8);
                                Drawable drawable = c8.j(context, e.F);
                                Drawable drawable2 = c8.j(context, e.G);
                                if (drawable instanceof BitmapDrawable && drawable.getIntrinsicWidth() == n8 && drawable.getIntrinsicHeight() == n8) {
                                    c8 = (BitmapDrawable)drawable;
                                    context = new BitmapDrawable(c8.getBitmap());
                                } else {
                                    context = Bitmap.createBitmap((int)n8, (int)n8, (Bitmap.Config)Bitmap.Config.ARGB_8888);
                                    c8 = new Canvas((Bitmap)context);
                                    drawable.setBounds(0, 0, n8, n8);
                                    drawable.draw((Canvas)c8);
                                    c8 = new BitmapDrawable((Bitmap)context);
                                    context = new BitmapDrawable((Bitmap)context);
                                }
                                context.setTileModeX(Shader.TileMode.REPEAT);
                                if (drawable2 instanceof BitmapDrawable && drawable2.getIntrinsicWidth() == n8 && drawable2.getIntrinsicHeight() == n8) {
                                    drawable2 = (BitmapDrawable)drawable2;
                                } else {
                                    Bitmap bitmap = Bitmap.createBitmap((int)n8, (int)n8, (Bitmap.Config)Bitmap.Config.ARGB_8888);
                                    drawable = new Canvas(bitmap);
                                    drawable2.setBounds(0, 0, n8, n8);
                                    drawable2.draw((Canvas)drawable);
                                    drawable2 = new BitmapDrawable(bitmap);
                                }
                                c8 = new LayerDrawable(new Drawable[]{c8, drawable2, context});
                                c8.setId(0, 0x1020000);
                                c8.setId(1, 16908303);
                                c8.setId(2, 16908301);
                                return c8;
                            }

                            private void m(Drawable drawable, int n8, PorterDuff.Mode mode) {
                                Drawable drawable2 = drawable.mutate();
                                drawable = mode;
                                if (mode == null) {
                                    drawable = b;
                                }
                                drawable2.setColorFilter((ColorFilter)k.e(n8, (PorterDuff.Mode)drawable));
                            }

                            /*
                             * Unable to fully structure code
                             */
                            @Override
                            public boolean a(Context var1_1, int var2_2, Drawable var3_3) {
                                block8: {
                                    block9: {
                                        var6_4 = k.a();
                                        if (this.f(this.a, var2_2)) {
                                            var5_5 = ax.m.a.x;
lbl4:
                                            // 3 sources

                                            while (true) {
                                                var2_2 = -1;
                                                var4_6 = true;
                                                break block8;
                                                break;
                                            }
                                        }
                                        if (!this.f(this.c, var2_2)) break block9;
                                        var5_5 = ax.m.a.v;
                                        ** GOTO lbl4
                                    }
                                    if (this.f(this.d, var2_2)) {
                                        var6_4 = PorterDuff.Mode.MULTIPLY;
                                        while (true) {
                                            var5_5 = 0x1010031;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    if (var2_2 == e.u) {
                                        var2_2 = Math.round(40.8f);
                                        var4_6 = true;
                                        var5_5 = 0x1010030;
                                    } else {
                                        if (var2_2 == e.l) ** continue;
                                        var5_5 = 0;
                                        var2_2 = -1;
                                        var4_6 = false;
                                    }
                                }
                                if (var4_6) {
                                    var3_3 = var3_3.mutate();
                                    var3_3.setColorFilter((ColorFilter)k.e(H.c(var1_1, var5_5), var6_4));
                                    if (var2_2 != -1) {
                                        var3_3.setAlpha(var2_2);
                                    }
                                    return true;
                                }
                                return false;
                            }

                            @Override
                            public PorterDuff.Mode b(int n8) {
                                if (n8 == e.H) {
                                    return PorterDuff.Mode.MULTIPLY;
                                }
                                return null;
                            }

                            @Override
                            public Drawable c(C c8, Context context, int n8) {
                                if (n8 == e.j) {
                                    return new LayerDrawable(new Drawable[]{c8.j(context, e.i), c8.j(context, e.k)});
                                }
                                if (n8 == e.y) {
                                    return this.l(c8, context, d.g);
                                }
                                if (n8 == e.x) {
                                    return this.l(c8, context, d.h);
                                }
                                if (n8 == e.z) {
                                    return this.l(c8, context, d.i);
                                }
                                return null;
                            }

                            @Override
                            public ColorStateList d(Context context, int n8) {
                                if (n8 == e.m) {
                                    return ax.o.a.a(context, ax.m.c.e);
                                }
                                if (n8 == e.I) {
                                    return ax.o.a.a(context, ax.m.c.h);
                                }
                                if (n8 == e.H) {
                                    return this.k(context);
                                }
                                if (n8 == e.f) {
                                    return this.j(context);
                                }
                                if (n8 == e.b) {
                                    return this.g(context);
                                }
                                if (n8 == e.e) {
                                    return this.i(context);
                                }
                                if (n8 != e.D && n8 != e.E) {
                                    if (this.f(this.b, n8)) {
                                        return H.e(context, ax.m.a.x);
                                    }
                                    if (this.f(this.e, n8)) {
                                        return ax.o.a.a(context, ax.m.c.d);
                                    }
                                    if (this.f(this.f, n8)) {
                                        return ax.o.a.a(context, ax.m.c.c);
                                    }
                                    if (n8 == e.A) {
                                        return ax.o.a.a(context, ax.m.c.f);
                                    }
                                    return null;
                                }
                                return ax.o.a.a(context, ax.m.c.g);
                            }

                            @Override
                            public boolean e(Context context, int n8, Drawable drawable) {
                                if (n8 == e.C) {
                                    LayerDrawable layerDrawable = (LayerDrawable)drawable;
                                    drawable = layerDrawable.findDrawableByLayerId(0x1020000);
                                    n8 = ax.m.a.x;
                                    this.m(drawable, H.c(context, n8), b);
                                    this.m(layerDrawable.findDrawableByLayerId(16908303), H.c(context, n8), b);
                                    this.m(layerDrawable.findDrawableByLayerId(16908301), H.c(context, ax.m.a.v), b);
                                    return true;
                                }
                                if (n8 != e.y && n8 != e.x && n8 != e.z) {
                                    return false;
                                }
                                drawable = (LayerDrawable)drawable;
                                this.m(drawable.findDrawableByLayerId(0x1020000), H.b(context, ax.m.a.x), b);
                                Drawable drawable2 = drawable.findDrawableByLayerId(16908303);
                                n8 = ax.m.a.v;
                                this.m(drawable2, H.c(context, n8), b);
                                this.m(drawable.findDrawableByLayerId(16908301), H.c(context, n8), b);
                                return true;
                            }
                        };
                        c8.u(f8);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    static void i(Drawable drawable, J j8, int[] nArray) {
        C.w(drawable, j8, nArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Drawable c(Context context, int n8) {
        synchronized (this) {
            return this.a.j(context, n8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    Drawable d(Context context, int n8, boolean bl) {
        synchronized (this) {
            return this.a.k(context, n8, bl);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    ColorStateList f(Context context, int n8) {
        synchronized (this) {
            return this.a.m(context, n8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g(Context context) {
        synchronized (this) {
            this.a.s(context);
            return;
        }
    }
}

