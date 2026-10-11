/*
 * Decompiled with CFR 0.152.
 */
package ax.R0;

import android.os.Bundle;
import ax.R0.f;
import ax.S0.a;
import ax.S0.d0;

public final class g
implements f {
    private static final String c = d0.G0(0);
    private static final String d = d0.G0(1);
    public final String a;
    public final int b;

    public g(String string, int n8) {
        this.a = string;
        this.b = n8;
    }

    public static g a(Bundle bundle) {
        return new g(ax.S0.a.e(bundle.getString(c)), bundle.getInt(d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(c, this.a);
        bundle.putInt(d, this.b);
        return bundle;
    }
}

