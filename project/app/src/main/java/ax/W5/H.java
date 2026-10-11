/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.util.Log;
import ax.W5.K;
import ax.W5.O;
import ax.W5.l;

final class H
extends O {
    H(K k8, String string, Boolean bl, boolean bl2) {
        super(k8, string, bl, true, null);
    }

    @Override
    final /* synthetic */ Object a(Object object) {
        if (l.c.matcher((CharSequence)object).matches()) {
            return Boolean.TRUE;
        }
        if (l.d.matcher((CharSequence)object).matches()) {
            return Boolean.FALSE;
        }
        String string = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid boolean value for ");
        stringBuilder.append(string);
        stringBuilder.append(": ");
        stringBuilder.append((String)object);
        Log.e((String)"PhenotypeFlag", (String)stringBuilder.toString());
        return null;
    }
}

