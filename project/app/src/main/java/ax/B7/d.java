/*
 * Decompiled with CFR 0.152.
 */
package ax.B7;

import android.os.Bundle;
import ax.B7.a;
import ax.B7.b;
import ax.e6.a;

final class d
implements a.a {
    private final a a;

    public d(a a8) {
        this.a = a8;
    }

    @Override
    public final void a(String string, String string2, Bundle bundle, long l8) {
        if (!this.a.a.contains(string2)) {
            return;
        }
        string = new Bundle();
        string.putString("events", b.c(string2));
        ax.B7.a.a(this.a).a(2, (Bundle)string);
    }
}

