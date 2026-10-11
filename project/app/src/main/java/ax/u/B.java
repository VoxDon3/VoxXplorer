/*
 * Decompiled with CFR 0.152.
 */
package ax.u;

import android.os.Build;
import android.view.View;
import ax.u.E;

public class B {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
            return;
        }
        E.g(view, charSequence);
    }

    static class a {
        static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }
}

