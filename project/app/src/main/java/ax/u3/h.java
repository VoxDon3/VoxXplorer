/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import android.content.Context;
import android.util.TypedValue;
import androidx.appcompat.app.a;
import ax.B6.b;
import ax.s.c;

public class h {
    public static a.a a(Context context) {
        return h.c(context, 2132017491);
    }

    public static a.a b(Context context) {
        return h.c(context, 2132017492);
    }

    private static a.a c(Context context, int n8) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130969280, typedValue, true);
        if (typedValue.data != 0) {
            return new b((Context)new c(context, 2132017493), n8);
        }
        return new b((Context)new c(context, 2132017490), n8);
    }
}

