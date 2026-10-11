/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.util.Log;
import ax.W5.K;
import ax.W5.O;

final class I
extends O {
    I(K k8, String string, Double d8, boolean bl) {
        super(k8, string, d8, true, null);
    }

    @Override
    final /* synthetic */ Object a(Object object) {
        double d8;
        try {
            d8 = Double.parseDouble((String)object);
        }
        catch (NumberFormatException numberFormatException) {
            String string = this.b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid double value for ");
            stringBuilder.append(string);
            stringBuilder.append(": ");
            stringBuilder.append((String)object);
            Log.e((String)"PhenotypeFlag", (String)stringBuilder.toString());
            return null;
        }
        return d8;
    }
}

