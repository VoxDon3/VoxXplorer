package ax.R0;

import android.os.Bundle;
import ax.S0.C0968a;
import ax.S0.d0;

/* loaded from: classes.dex */
public final class j {
    private static final String b = d0.G0(0);
    public final String a;

    public j(String str) {
        this.a = str;
    }

    public static j a(Bundle bundle) {
        return new j((String) C0968a.e(bundle.getString(b)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(b, this.a);
        return bundle;
    }
}
