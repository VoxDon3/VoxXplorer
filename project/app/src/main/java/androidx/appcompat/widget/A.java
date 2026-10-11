/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import ax.u.m;
import ax.u.n;
import ax.u.o;
import ax.u.p;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class A {
    private static final int[] a = new int[]{0x10100A0};
    private static final int[] b = new int[0];
    public static final Rect c = new Rect();

    @Deprecated
    public static boolean a(Drawable drawable) {
        return true;
    }

    static void b(Drawable drawable) {
        String string = drawable.getClass().getName();
        int n8 = Build.VERSION.SDK_INT;
        if (n8 == 21 && "android.graphics.drawable.VectorDrawable".equals(string)) {
            A.c(drawable);
            return;
        }
        if (n8 >= 29 && n8 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(string)) {
            A.c(drawable);
        }
    }

    private static void c(Drawable drawable) {
        int[] nArray = drawable.getState();
        if (nArray != null && nArray.length != 0) {
            drawable.setState(b);
        } else {
            drawable.setState(a);
        }
        drawable.setState(nArray);
    }

    public static Rect d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            drawable = androidx.appcompat.widget.A$b.a(drawable);
            return new Rect(m.a((Insets)drawable), n.a((Insets)drawable), o.a((Insets)drawable), p.a((Insets)drawable));
        }
        return androidx.appcompat.widget.A$a.a(ax.U.a.q(drawable));
    }

    public static PorterDuff.Mode e(int n8, PorterDuff.Mode mode) {
        if (n8 != 3) {
            if (n8 != 5) {
                if (n8 != 9) {
                    switch (n8) {
                        default: {
                            return mode;
                        }
                        case 16: {
                            return PorterDuff.Mode.ADD;
                        }
                        case 15: {
                            return PorterDuff.Mode.SCREEN;
                        }
                        case 14: 
                    }
                    return PorterDuff.Mode.MULTIPLY;
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    static class a {
        private static final boolean a;
        private static final Method b;
        private static final Field c;
        private static final Field d;
        private static final Field e;
        private static final Field f;

        /*
         * Unable to fully structure code
         * Could not resolve type clashes
         */
        static {
            block22: {
                block23: {
                    var3 /* !! */  = Class.forName("android.graphics.Insets");
                    var1_6 /* !! */  = Drawable.class.getMethod("getOpticalInsets", null);
                    var2_10 = var3 /* !! */ .getField("left");
                    var4_14 = var3 /* !! */ .getField("top");
                    var5_15 = var3 /* !! */ .getField("right");
                    try {
                        var3 /* !! */  = var3 /* !! */ .getField("bottom");
                        var0_16 = true;
                        var6_17 = var1_6 /* !! */ ;
                        var1_6 /* !! */  = var5_15;
                        break block22;
                    }
                    catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException var3_1) {
                        var3 /* !! */  = var1_6 /* !! */ ;
                        var1_6 /* !! */  = var5_15;
                        break block23;
                    }
                    catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException var3_2) {
                        var5_15 = null;
                        var3 /* !! */  = var1_6 /* !! */ ;
                        var1_6 /* !! */  = var5_15;
                        break block23;
                    }
                    catch (NoSuchFieldException var3_3) lbl-1000:
                    // 6 sources

                    {
                        while (true) {
                            var4_14 = null;
                            var5_15 = null;
                            var3 /* !! */  = var1_6 /* !! */ ;
                            var1_6 /* !! */  = var5_15;
                            break block23;
                            break;
                        }
                    }
                    catch (ClassNotFoundException var3_4) {
                        ** GOTO lbl-1000
                    }
                    catch (NoSuchMethodException var3_5) {
                        ** GOTO lbl-1000
                    }
                    catch (NoSuchFieldException var2_11) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var2_10 = null;
                            ** GOTO lbl-1000
                            break;
                        }
                    }
                    catch (ClassNotFoundException var2_12) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var2_10 = null;
                            ** GOTO lbl-1000
                            break;
                        }
                    }
                    catch (NoSuchMethodException var2_13) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var2_10 = null;
                            ** continue;
                            break;
                        }
                    }
                    catch (NoSuchFieldException var1_7) {
                        var1_6 /* !! */  = null;
                        ** continue;
                    }
                    catch (ClassNotFoundException var1_8) {
                        var1_6 /* !! */  = null;
                        ** continue;
                    }
                    catch (NoSuchMethodException var1_9) {
                        var1_6 /* !! */  = null;
                        ** continue;
                    }
                }
                var5_15 = null;
                var0_16 = false;
                var6_17 = var3 /* !! */ ;
                var3 /* !! */  = var5_15;
            }
            if (var0_16) {
                androidx.appcompat.widget.A$a.b = var6_17;
                androidx.appcompat.widget.A$a.c = var2_10;
                androidx.appcompat.widget.A$a.d = var4_14;
                androidx.appcompat.widget.A$a.e = var1_6 /* !! */ ;
                androidx.appcompat.widget.A$a.f = var3 /* !! */ ;
                androidx.appcompat.widget.A$a.a = true;
            } else {
                androidx.appcompat.widget.A$a.b = null;
                androidx.appcompat.widget.A$a.c = null;
                androidx.appcompat.widget.A$a.d = null;
                androidx.appcompat.widget.A$a.e = null;
                androidx.appcompat.widget.A$a.f = null;
                androidx.appcompat.widget.A$a.a = false;
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        static Rect a(Drawable object) {
            if (Build.VERSION.SDK_INT >= 29) return c;
            if (!a) return c;
            Object object2 = b.invoke(object, null);
            if (object2 == null) return c;
            try {
                return new Rect(c.getInt(object2), d.getInt(object2), e.getInt(object2), f.getInt(object2));
            }
            catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
                return c;
            }
        }
    }

    static class b {
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }
}

