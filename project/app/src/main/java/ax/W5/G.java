/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.util.Log;
import ax.W5.K;
import ax.W5.O;

final class G
extends O {
    G(K k8, String string, Long l8, boolean bl) {
        super(k8, string, l8, true, null);
    }

    @Override
    final /* synthetic */ Object a(Object object) {
        long l8;
        try {
            l8 = Long.parseLong((String)object);
        }
        catch (NumberFormatException numberFormatException) {
            String string = this.b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid long value for ");
            stringBuilder.append(string);
            stringBuilder.append(": ");
            stringBuilder.append((String)object);
            Log.e((String)"PhenotypeFlag", (String)stringBuilder.toString());
            return null;
        }
        return l8;
    }
}

