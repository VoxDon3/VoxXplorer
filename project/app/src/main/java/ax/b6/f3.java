/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.util.Log;
import ax.b6.Y2;
import ax.b6.h3;

final class f3
extends Y2<Double> {
    f3(h3 h32, String string, Double d8, boolean bl) {
        super(h32, string, d8, true, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Double p(Object object) {
        if (object instanceof Double) {
            return (Double)object;
        }
        if (object instanceof Float) {
            return ((Float)object).doubleValue();
        }
        if (object instanceof String) {
            try {
                double d8 = Double.parseDouble((String)object);
                return d8;
            }
            catch (NumberFormatException numberFormatException) {}
        }
        String string = super.k();
        String string2 = String.valueOf(object);
        object = new StringBuilder("Invalid double value for ");
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

