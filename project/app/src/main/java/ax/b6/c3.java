/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.util.Log;
import ax.b6.Y2;
import ax.b6.h3;
import ax.b6.w2;

final class c3
extends Y2<Boolean> {
    c3(h3 h32, String string, Boolean bl, boolean bl2) {
        super(h32, string, bl, true, null);
    }

    @Override
    final /* synthetic */ Object h(Object object) {
        String string;
        if (object instanceof Boolean) {
            return (Boolean)object;
        }
        if (object instanceof String) {
            string = (String)object;
            if (w2.c.matcher(string).matches()) {
                return Boolean.TRUE;
            }
            if (w2.d.matcher(string).matches()) {
                return Boolean.FALSE;
            }
        }
        string = super.k();
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("Invalid boolean value for ");
        stringBuilder.append(string);
        stringBuilder.append(": ");
        stringBuilder.append((String)object);
        Log.e((String)"PhenotypeFlag", (String)stringBuilder.toString());
        return null;
    }
}

