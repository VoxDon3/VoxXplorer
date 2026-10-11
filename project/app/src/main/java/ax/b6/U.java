/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.A;
import ax.b6.Z2;
import ax.b6.n;
import ax.b6.s;
import java.util.List;

public final class U
extends A {
    @Override
    public final s b(String string, Z2 z22, List<s> list) {
        if (string != null && !string.isEmpty() && z22.g(string)) {
            s s8 = z22.c(string);
            if (s8 instanceof n) {
                return ((n)s8).a(z22, list);
            }
            throw new IllegalArgumentException(String.format("Function %s is not defined", string));
        }
        throw new IllegalArgumentException(String.format("Command not found: %s", string));
    }
}

