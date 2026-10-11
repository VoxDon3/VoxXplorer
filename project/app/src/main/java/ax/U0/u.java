/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import ax.U0.k;
import ax.U0.s;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class u
extends s {
    public final int e0;
    public final String f0;
    public final Map<String, List<String>> g0;
    public final byte[] h0;

    public u(int n8, String string, IOException iOException, Map<String, List<String>> map, k k8, byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Response code: ");
        stringBuilder.append(n8);
        super(stringBuilder.toString(), iOException, k8, 2004, 1);
        this.e0 = n8;
        this.f0 = string;
        this.g0 = map;
        this.h0 = byArray;
    }
}

