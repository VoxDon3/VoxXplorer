/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import ax.c0.F;
import ax.c0.G;

public final class l0 {
    public static boolean a(ViewParent viewParent, View object, float f8, float f9, boolean bl) {
        try {
            bl = a.a(viewParent, (View)object, f8, f9, bl);
            return bl;
        }
        catch (AbstractMethodError abstractMethodError) {
            object = new StringBuilder();
            ((StringBuilder)object).append("ViewParent ");
            ((StringBuilder)object).append(viewParent);
            ((StringBuilder)object).append(" does not implement interface method onNestedFling");
            Log.e((String)"ViewParentCompat", (String)((StringBuilder)object).toString(), (Throwable)abstractMethodError);
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View object, float f8, float f9) {
        try {
            boolean bl = a.b(viewParent, (View)object, f8, f9);
            return bl;
        }
        catch (AbstractMethodError abstractMethodError) {
            object = new StringBuilder();
            ((StringBuilder)object).append("ViewParent ");
            ((StringBuilder)object).append(viewParent);
            ((StringBuilder)object).append(" does not implement interface method onNestedPreFling");
            Log.e((String)"ViewParentCompat", (String)((StringBuilder)object).toString(), (Throwable)abstractMethodError);
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int n8, int n9, int[] object, int n10) {
        if (viewParent instanceof F) {
            ((F)viewParent).p(view, n8, n9, (int[])object, n10);
            return;
        }
        if (n10 == 0) {
            try {
                a.c(viewParent, view, n8, n9, (int[])object);
                return;
            }
            catch (AbstractMethodError abstractMethodError) {
                object = new StringBuilder();
                ((StringBuilder)object).append("ViewParent ");
                ((StringBuilder)object).append(viewParent);
                ((StringBuilder)object).append(" does not implement interface method onNestedPreScroll");
                Log.e((String)"ViewParentCompat", (String)((StringBuilder)object).toString(), (Throwable)abstractMethodError);
            }
        }
    }

    public static void d(ViewParent viewParent, View object, int n8, int n9, int n10, int n11, int n12, int[] nArray) {
        if (viewParent instanceof G) {
            ((G)viewParent).b((View)object, n8, n9, n10, n11, n12, nArray);
            return;
        }
        nArray[0] = nArray[0] + n10;
        nArray[1] = nArray[1] + n11;
        if (viewParent instanceof F) {
            ((F)viewParent).e((View)object, n8, n9, n10, n11, n12);
            return;
        }
        if (n12 == 0) {
            try {
                a.d(viewParent, (View)object, n8, n9, n10, n11);
                return;
            }
            catch (AbstractMethodError abstractMethodError) {
                object = new StringBuilder();
                ((StringBuilder)object).append("ViewParent ");
                ((StringBuilder)object).append(viewParent);
                ((StringBuilder)object).append(" does not implement interface method onNestedScroll");
                Log.e((String)"ViewParentCompat", (String)((StringBuilder)object).toString(), (Throwable)abstractMethodError);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View object, int n8, int n9) {
        if (viewParent instanceof F) {
            ((F)viewParent).h(view, (View)object, n8, n9);
            return;
        }
        if (n9 == 0) {
            try {
                a.e(viewParent, view, (View)object, n8);
                return;
            }
            catch (AbstractMethodError abstractMethodError) {
                object = new StringBuilder();
                ((StringBuilder)object).append("ViewParent ");
                ((StringBuilder)object).append(viewParent);
                ((StringBuilder)object).append(" does not implement interface method onNestedScrollAccepted");
                Log.e((String)"ViewParentCompat", (String)((StringBuilder)object).toString(), (Throwable)abstractMethodError);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View object, View view, int n8, int n9) {
        if (viewParent instanceof F) {
            return ((F)viewParent).f((View)object, view, n8, n9);
        }
        if (n9 == 0) {
            try {
                boolean bl = a.f(viewParent, (View)object, view, n8);
                return bl;
            }
            catch (AbstractMethodError abstractMethodError) {
                object = new StringBuilder();
                ((StringBuilder)object).append("ViewParent ");
                ((StringBuilder)object).append(viewParent);
                ((StringBuilder)object).append(" does not implement interface method onStartNestedScroll");
                Log.e((String)"ViewParentCompat", (String)((StringBuilder)object).toString(), (Throwable)abstractMethodError);
            }
        }
        return false;
    }

    public static void g(ViewParent viewParent, View object, int n8) {
        if (viewParent instanceof F) {
            ((F)viewParent).o((View)object, n8);
            return;
        }
        if (n8 == 0) {
            try {
                a.g(viewParent, (View)object);
                return;
            }
            catch (AbstractMethodError abstractMethodError) {
                object = new StringBuilder();
                ((StringBuilder)object).append("ViewParent ");
                ((StringBuilder)object).append(viewParent);
                ((StringBuilder)object).append(" does not implement interface method onStopNestedScroll");
                Log.e((String)"ViewParentCompat", (String)((StringBuilder)object).toString(), (Throwable)abstractMethodError);
            }
        }
    }

    static class a {
        static boolean a(ViewParent viewParent, View view, float f8, float f9, boolean bl) {
            return viewParent.onNestedFling(view, f8, f9, bl);
        }

        static boolean b(ViewParent viewParent, View view, float f8, float f9) {
            return viewParent.onNestedPreFling(view, f8, f9);
        }

        static void c(ViewParent viewParent, View view, int n8, int n9, int[] nArray) {
            viewParent.onNestedPreScroll(view, n8, n9, nArray);
        }

        static void d(ViewParent viewParent, View view, int n8, int n9, int n10, int n11) {
            viewParent.onNestedScroll(view, n8, n9, n10, n11);
        }

        static void e(ViewParent viewParent, View view, View view2, int n8) {
            viewParent.onNestedScrollAccepted(view, view2, n8);
        }

        static boolean f(ViewParent viewParent, View view, View view2, int n8) {
            return viewParent.onStartNestedScroll(view, view2, n8);
        }

        static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }
}

