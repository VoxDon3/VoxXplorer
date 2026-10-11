/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.util.Log;
import ax.b6.Y2;
import ax.b6.h3;

final class d3
extends Y2<Long> {
    d3(h3 h32, String string, Long l8, boolean bl) {
        super(h32, string, l8, true, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Long p(Object object) {
        if (object instanceof Long) {
            return (Long)object;
        }
        if (object instanceof String) {
            try {
                long l8 = Long.parseLong((String)object);
                return l8;
            }
            catch (NumberFormatException numberFormatException) {}
        }
        String string = super.k();
        String string2 = String.valueOf(object);
        object = new StringBuilder("Invalid long value for ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(": ");
        ((StringBuilder)object).append(string2);
        Log.e((String)"PhenotypeFlag", (String)((StringBuilder)object).toString());
        return null;
    }

    @Override
    final /* synthetic */ Object h(Object object) {
        return this.p(object);
    }
}

