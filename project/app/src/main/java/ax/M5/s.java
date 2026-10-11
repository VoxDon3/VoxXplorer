/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.content.Context;
import android.content.res.Resources;
import ax.J5.o;
import ax.M5.p;

public class s {
    private final Resources a;
    private final String b;

    public s(Context context) {
        p.l(context);
        context = context.getResources();
        this.a = context;
        this.b = context.getResourcePackageName(o.a);
    }

    public String a(String string) {
        String string2 = this.b;
        int n8 = this.a.getIdentifier(string, "string", string2);
        if (n8 == 0) {
            return null;
        }
        return this.a.getString(n8);
    }
}

