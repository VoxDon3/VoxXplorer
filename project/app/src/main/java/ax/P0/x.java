/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.os.Bundle;
import ax.S0.a;
import ax.S0.d0;

public class x {
    private static final String c = d0.G0(0);
    private static final String d = d0.G0(1);
    public final String a;
    public final String b;

    public x(String string, String string2) {
        this.a = d0.d1(string);
        this.b = string2;
    }

    public static x a(Bundle bundle) {
        return new x(bundle.getString(c), ax.S0.a.e(bundle.getString(d)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        String string = this.a;
        if (string != null) {
            bundle.putString(c, string);
        }
        bundle.putString(d, this.b);
        return bundle;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (x)object;
            if (j.Objects.equals((Object)this.a, (Object)((x)object).a) && j.Objects.equals((Object)this.b, (Object)((x)object).b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.b.hashCode();
        String string = this.a;
        int n9 = string != null ? string.hashCode() : 0;
        return n8 * 31 + n9;
    }
}

