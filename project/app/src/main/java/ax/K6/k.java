/*
 * Decompiled with CFR 0.152.
 */
package ax.K6;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import ax.K6.h;
import ax.K6.i;
import ax.K6.j;
import ax.W.a;

public class k {
    public static Typeface a(Context context, Typeface typeface) {
        return k.b(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface b(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 31 && h.a(configuration) != Integer.MAX_VALUE && h.a(configuration) != 0 && typeface != null) {
            return j.a(typeface, a.b(i.a(typeface) + h.a(configuration), 1, 1000), typeface.isItalic());
        }
        return null;
    }
}

