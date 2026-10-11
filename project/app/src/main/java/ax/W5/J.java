/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.util.Base64;
import android.util.Log;
import ax.W5.K;
import ax.W5.O;
import ax.W5.g2;
import ax.W5.m2;
import java.io.IOException;

final class J
extends O {
    final m2 l;

    J(K k8, String string, Object object, boolean bl, m2 m22) {
        this.l = m22;
        super(k8, "getTokenRefactor__blocked_packages", object, true, null);
    }

    @Override
    final Object a(Object object) {
        try {
            g2 g22 = g2.r(Base64.decode((String)((String)object), (int)3));
            return g22;
        }
        catch (IOException | IllegalArgumentException exception) {
            String string = this.b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid byte[] value for ");
            stringBuilder.append(string);
            stringBuilder.append(": ");
            stringBuilder.append((String)object);
            Log.e((String)"PhenotypeFlag", (String)stringBuilder.toString());
            return null;
        }
    }
}

