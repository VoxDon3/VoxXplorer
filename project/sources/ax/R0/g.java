package ax.R0;

import android.os.Bundle;
import ax.S0.C0968a;
import ax.S0.d0;

/* loaded from: classes.dex */
public final class g implements f {
    private static final String c = d0.G0(0);
    private static final String d = d0.G0(1);
    public final String a;
    public final int b;

    public g(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static g a(Bundle bundle) {
        return new g((String) C0968a.e(bundle.getString(c)), bundle.getInt(d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(c, this.a);
        bundle.putInt(d, this.b);
        return bundle;
    }
}
