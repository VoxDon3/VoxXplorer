package ax.R0;

import android.os.Bundle;
import ax.S0.d0;

/* loaded from: classes.dex */
public final class i implements f {
    private static final String d = d0.G0(0);
    private static final String e = d0.G0(1);
    private static final String f = d0.G0(2);
    public int a;
    public int b;
    public final int c;

    public i(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static i a(Bundle bundle) {
        return new i(bundle.getInt(d), bundle.getInt(e), bundle.getInt(f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.a);
        bundle.putInt(e, this.b);
        bundle.putInt(f, this.c);
        return bundle;
    }
}
