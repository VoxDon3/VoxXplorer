/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import ax.M5.n;
import ax.M5.p;

public final class m0 {
    private static final Uri f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    private final String a;
    private final String b;
    private final ComponentName c;
    private final int d;
    private final boolean e;

    public m0(ComponentName componentName, int n8) {
        this.a = null;
        this.b = null;
        p.l(componentName);
        this.c = componentName;
        this.d = 4225;
        this.e = false;
    }

    public m0(String string, String string2, int n8, boolean bl) {
        p.f(string);
        this.a = string;
        p.f(string2);
        this.b = string2;
        this.c = null;
        this.d = 4225;
        this.e = bl;
    }

    public final ComponentName a() {
        return this.c;
    }

    public final Intent b(Context object) {
        if (this.a != null) {
            boolean bl = this.e;
            Bundle bundle = null;
            Object var4_5 = null;
            if (bl) {
                bundle = new Bundle();
                bundle.putString("serviceActionBundleKey", this.a);
                try {
                    object = object.getContentResolver().call(f, "serviceIntentCall", null, bundle);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    Log.w((String)"ConnectionStatusConfig", (String)"Dynamic intent resolution failed: ".concat(((Object)illegalArgumentException).toString()));
                    object = null;
                }
                object = object == null ? var4_5 : (Intent)object.getParcelable("serviceResponseIntentKey");
                bundle = object;
                if (object == null) {
                    Log.w((String)"ConnectionStatusConfig", (String)"Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.a)));
                    bundle = object;
                }
            }
            if (bundle == null) {
                return new Intent(this.a).setPackage(this.b);
            }
            return bundle;
        }
        return new Intent().setComponent(this.c);
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof m0)) {
            return false;
        }
        object = (m0)object;
        return n.b(this.a, ((m0)object).a) && n.b(this.b, ((m0)object).b) && n.b(this.c, ((m0)object).c) && this.e == ((m0)object).e;
    }

    public final int hashCode() {
        return n.c(this.a, this.b, this.c, 4225, this.e);
    }

    public final String toString() {
        String string;
        String string2 = string = this.a;
        if (string == null) {
            p.l(this.c);
            string2 = this.c.flattenToString();
        }
        return string2;
    }
}

