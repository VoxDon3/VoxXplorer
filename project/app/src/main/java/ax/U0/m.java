/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import android.content.Context;
import ax.U0.g;
import ax.U0.l;
import ax.U0.n;
import ax.U0.z;

@Deprecated
public final class m
implements g.a {
    private final Context a;
    private final z b;
    private final g.a c;

    public m(Context context, z z8, g.a a8) {
        this.a = context.getApplicationContext();
        this.b = z8;
        this.c = a8;
    }

    public m(Context context, String string) {
        this(context, string, null);
    }

    public m(Context context, String string, z z8) {
        this(context, z8, new n.b().c(string));
    }

    public l b() {
        l l8 = new l(this.a, this.c.a());
        z z8 = this.b;
        if (z8 != null) {
            l8.d(z8);
        }
        return l8;
    }
}

