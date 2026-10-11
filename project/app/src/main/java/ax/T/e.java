/*
 * Decompiled with CFR 0.152.
 */
package ax.T;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import ax.S.e;
import ax.S.h;
import ax.T.f;
import ax.T.g;
import ax.T.h;
import ax.T.i;
import ax.T.j;
import ax.T.k;
import ax.Z.k;

public class e {
    private static final k a;
    private static final ax.B.j<String, Typeface> b;

    static {
        int n8 = Build.VERSION.SDK_INT;
        a = n8 >= 29 ? new j() : (n8 >= 28 ? new i() : (n8 >= 26 ? new h() : (n8 >= 24 && g.j() ? new g() : new f())));
        b = new ax.B.j(16);
    }

    public static Typeface a(Context context, Typeface typeface, int n8) {
        if (context != null) {
            return Typeface.create((Typeface)typeface, (int)n8);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bArray, int n8) {
        return a.b(context, cancellationSignal, bArray, n8);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static Typeface c(Context object, e.b b8, Resources resources, int n8, String string, int n9, int n10, h.e object2, Handler handler, boolean bl) {
        Typeface var0_5;
        Resources var2_7;
        Resources var6_11;
        Handler handler2;
        a a8;
        e.e e8;
        if (e8 instanceof e.e) {
            Object var9_14;
            Typeface typeface = e.g((e8 = (e.e)e8).c());
            if (typeface != null) {
                if (a8 != null) {
                    ((h.e)((Object)a8)).d(typeface, handler2);
                }
                return typeface;
            }
            boolean bl2 = var9_14 != false ? e8.a() == 0 : a8 == null;
            int n11 = var9_14 != false ? e8.d() : -1;
            handler2 = h.e.e(handler2);
            a8 = new a((h.e)((Object)a8));
            Typeface typeface2 = ax.Z.k.c(object, e8.b(), (int)var6_11, bl2, n11, handler2, a8);
        } else {
            e.e e9 = e8 = a.a((Context)object, (e.c)((Object)e8), (Resources)var2_7, (int)var6_11);
            if (a8 != null) {
                if (e8 != null) {
                    ((h.e)((Object)a8)).d((Typeface)e8, handler2);
                    e.e e10 = e8;
                } else {
                    ((h.e)((Object)a8)).c(-3, handler2);
                    e.e e11 = e8;
                }
            }
        }
        if (var0_5 != null) {
            Typeface var5_10;
            Typeface var4_9;
            Resources var3_8;
            b.d(e.e((Resources)var2_7, (int)var3_8, (String)var4_9, (int)var5_10, (int)var6_11), (Typeface)var0_5);
        }
        return var0_5;
    }

    public static Typeface d(Context context, Resources object, int n8, String string, int n9, int n10) {
        if ((context = a.d(context, (Resources)object, n8, string, n10)) != null) {
            object = e.e(object, n8, string, n9, n10);
            b.d((String)object, (Typeface)context);
        }
        return context;
    }

    private static String e(Resources resources, int n8, String string, int n9, int n10) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(resources.getResourcePackageName(n8));
        stringBuilder.append('-');
        stringBuilder.append(string);
        stringBuilder.append('-');
        stringBuilder.append(n9);
        stringBuilder.append('-');
        stringBuilder.append(n8);
        stringBuilder.append('-');
        stringBuilder.append(n10);
        return stringBuilder.toString();
    }

    public static Typeface f(Resources resources, int n8, String string, int n9, int n10) {
        return b.c(e.e(resources, n8, string, n9, n10));
    }

    private static Typeface g(String string) {
        if (string != null && !string.isEmpty()) {
            string = Typeface.create((String)string, (int)0);
            Typeface typeface = Typeface.create((Typeface)Typeface.DEFAULT, (int)0);
            if (string != null && !string.equals((Object)typeface)) {
                return string;
            }
        }
        return null;
    }

    public static class a
    extends k.c {
        private h.e a;

        public a(h.e e8) {
            this.a = e8;
        }

        @Override
        public void a(int n8) {
            h.e e8 = this.a;
            if (e8 != null) {
                e8.f(n8);
            }
        }

        @Override
        public void b(Typeface typeface) {
            h.e e8 = this.a;
            if (e8 != null) {
                e8.g(typeface);
            }
        }
    }
}

