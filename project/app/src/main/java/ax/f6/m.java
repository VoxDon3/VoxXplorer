/*
 * Decompiled with CFR 0.152.
 */
package ax.f6;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import ax.J5.o;
import ax.M5.p;

public final class m {
    private final Resources a;
    private final String b;

    public m(Context context, String string) {
        p.l(context);
        this.a = context.getResources();
        if (!TextUtils.isEmpty((CharSequence)string)) {
            this.b = string;
            return;
        }
        this.b = m.a(context);
    }

    public static String a(Context context) {
        try {
            String string = context.getResources().getResourcePackageName(o.a);
            return string;
        }
        catch (Resources.NotFoundException notFoundException) {
            return context.getPackageName();
        }
    }

    public final String b(String string) {
        int n8 = this.a.getIdentifier(string, "string", this.b);
        if (n8 == 0) {
            return null;
        }
        try {
            string = this.a.getString(n8);
            return string;
        }
        catch (Resources.NotFoundException notFoundException) {
            return null;
        }
    }
}

