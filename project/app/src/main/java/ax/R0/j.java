/*
 * Decompiled with CFR 0.152.
 */
package ax.R0;

import android.os.Bundle;
import ax.S0.a;
import ax.S0.d0;

public final class j {
    private static final String b = d0.G0(0);
    public final String a;

    public j(String string) {
        this.a = string;
    }

    public static j a(Bundle bundle) {
        return new j(ax.S0.a.e(bundle.getString(b)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(b, this.a);
        return bundle;
    }
}

