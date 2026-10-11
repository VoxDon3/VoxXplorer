/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.net.Uri;
import ax.B.k;
import ax.b6.S2;

public final class N2
implements S2 {
    private final k<String, k<String, String>> a;

    N2(k<String, k<String, String>> k8) {
        this.a = k8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final String a(Uri object, String charSequence, String string, String string2) {
        if (object != null) {
            charSequence = object.toString();
        } else if (charSequence == null) return null;
        object = this.a;
        if (object == null) {
            return null;
        }
        object = (k)((k)object).get(charSequence);
        if (object == null) {
            return null;
        }
        charSequence = string2;
        if (string == null) return (String)((k)object).get(charSequence);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append(string2);
        charSequence = ((StringBuilder)charSequence).toString();
        return (String)((k)object).get(charSequence);
    }
}

