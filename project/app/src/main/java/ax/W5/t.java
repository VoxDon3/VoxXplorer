/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.net.Uri;
import ax.B.k;

public final class t {
    private final k a;

    t(k k8) {
        this.a = k8;
    }

    public final String a(Uri object, String string, String string2, String string3) {
        if (object != null) {
            object = object.toString();
            object = (k)this.a.get(object);
        } else {
            object = null;
        }
        if (object == null) {
            return null;
        }
        return (String)object.get("".concat(string3));
    }
}

