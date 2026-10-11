package ax.u;

import android.os.Build;
import android.view.View;

/* renamed from: ax.u.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3151B {

    /* renamed from: ax.u.B$a */
    static class a {
        static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
        } else {
            ViewOnLongClickListenerC3154E.g(view, charSequence);
        }
    }
}
