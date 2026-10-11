/*
 * Decompiled with CFR 0.152.
 */
package ax.D7;

import ax.D7.c;
import ax.D7.t;
import java.util.Arrays;
import java.util.List;

public class s
extends t {
    private final List<c<?>> q;

    public s(List<c<?>> list) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Dependency cycle detected: ");
        stringBuilder.append(Arrays.toString(list.toArray()));
        super(stringBuilder.toString());
        this.q = list;
    }
}

