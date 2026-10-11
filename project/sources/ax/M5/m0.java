package ax.M5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes3.dex */
public final class m0 {
    private static final Uri f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    private final String a;
    private final String b;
    private final ComponentName c;
    private final int d;
    private final boolean e;

    public m0(ComponentName componentName, int i) {
        this.a = null;
        this.b = null;
        C0821p.l(componentName);
        this.c = componentName;
        this.d = 4225;
        this.e = false;
    }

    public final ComponentName a() {
        return this.c;
    }

    public final Intent b(Context context) {
        Bundle bundle;
        if (this.a == null) {
            return new Intent().setComponent(this.c);
        }
        if (this.e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.a);
            try {
                bundle = context.getContentResolver().call(f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
            }
            r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r2 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.a)));
            }
        }
        return r2 == null ? new Intent(this.a).setPackage(this.b) : r2;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return C0819n.b(this.a, m0Var.a) && C0819n.b(this.b, m0Var.b) && C0819n.b(this.c, m0Var.c) && this.e == m0Var.e;
    }

    public final int hashCode() {
        return C0819n.c(this.a, this.b, this.c, 4225, Boolean.valueOf(this.e));
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        C0821p.l(this.c);
        return this.c.flattenToString();
    }

    public m0(String str, String str2, int i, boolean z) {
        C0821p.f(str);
        this.a = str;
        C0821p.f(str2);
        this.b = str2;
        this.c = null;
        this.d = 4225;
        this.e = z;
    }
}
