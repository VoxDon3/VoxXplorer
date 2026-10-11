/*
 * Decompiled with CFR 0.152.
 */
package ax.B7;

import android.os.Bundle;
import ax.B7.b;
import ax.B7.c;
import ax.e6.a;

final class e
implements a.a {
    private final c a;

    public e(c c8) {
        this.a = c8;
    }

    @Override
    public final void a(String string, String string2, Bundle bundle, long l8) {
        if (string != null && b.i(string2)) {
            string = new Bundle();
            string.putString("name", string2);
            string.putLong("timestampInMillis", l8);
            string.putBundle("params", bundle);
            c.a(this.a).a(3, (Bundle)string);
        }
    }
}

