/*
 * Decompiled with CFR 0.152.
 */
package ax.d4;

import android.content.Context;
import ax.Q.b;
import ax.d4.c;
import ax.d4.d;
import ax.d4.e;
import ax.d4.j;

public class f
implements d {
    @Override
    public c a(Context context, c.a a8) {
        if (b.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            return new e(context, a8);
        }
        return new j();
    }
}

