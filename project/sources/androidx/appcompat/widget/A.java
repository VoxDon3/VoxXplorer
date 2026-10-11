package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class A {
    private static final int[] a = {R.attr.state_checked};
    private static final int[] b = new int[0];
    public static final Rect c = new Rect();

    static class a {
        private static final boolean a;
        private static final Method b;
        private static final Field c;
        private static final Field d;
        private static final Field e;
        private static final Field f;

        /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L46 java.lang.ClassNotFoundException -> L4a java.lang.NoSuchMethodException -> L4e
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.reflect.Method r4 = r4.getMethod(r5, r1)     // Catch: java.lang.NoSuchFieldException -> L46 java.lang.ClassNotFoundException -> L4a java.lang.NoSuchMethodException -> L4e
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L3a java.lang.ClassNotFoundException -> L3e java.lang.NoSuchMethodException -> L42
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L30 java.lang.ClassNotFoundException -> L34 java.lang.NoSuchMethodException -> L37
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L2b
                r8 = 1
                goto L54
            L2b:
                goto L52
            L2d:
                r7 = r1
                goto L52
            L30:
                r6 = r1
            L32:
                r7 = r6
                goto L52
            L34:
                r6 = r1
                goto L32
            L37:
                r6 = r1
                goto L32
            L3a:
                r5 = r1
            L3c:
                r6 = r5
                goto L32
            L3e:
                r5 = r1
            L40:
                r6 = r5
                goto L32
            L42:
                r5 = r1
            L44:
                r6 = r5
                goto L32
            L46:
                r4 = r1
                r5 = r4
                goto L3c
            L4a:
                r4 = r1
                r5 = r4
                goto L40
            L4e:
                r4 = r1
                r5 = r4
                goto L44
            L52:
                r3 = r1
                r8 = 0
            L54:
                if (r8 == 0) goto L63
                androidx.appcompat.widget.A.a.b = r4
                androidx.appcompat.widget.A.a.c = r5
                androidx.appcompat.widget.A.a.d = r6
                androidx.appcompat.widget.A.a.e = r7
                androidx.appcompat.widget.A.a.f = r3
                androidx.appcompat.widget.A.a.a = r0
                goto L6f
            L63:
                androidx.appcompat.widget.A.a.b = r1
                androidx.appcompat.widget.A.a.c = r1
                androidx.appcompat.widget.A.a.d = r1
                androidx.appcompat.widget.A.a.e = r1
                androidx.appcompat.widget.A.a.f = r1
                androidx.appcompat.widget.A.a.a = r2
            L6f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.A.a.<clinit>():void");
        }

        static Rect a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && a) {
                try {
                    Object invoke = b.invoke(drawable, null);
                    if (invoke != null) {
                        return new Rect(c.getInt(invoke), d.getInt(invoke), e.getInt(invoke), f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return A.c;
        }
    }

    static class b {
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    @Deprecated
    public static boolean a(Drawable drawable) {
        return true;
    }

    static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            c(drawable);
        } else {
            if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                return;
            }
            c(drawable);
        }
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(a);
        } else {
            drawable.setState(b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        int i;
        int i2;
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(ax.U.a.q(drawable));
        }
        Insets a2 = b.a(drawable);
        i = a2.left;
        i2 = a2.top;
        i3 = a2.right;
        i4 = a2.bottom;
        return new Rect(i, i2, i3, i4);
    }

    public static PorterDuff.Mode e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
