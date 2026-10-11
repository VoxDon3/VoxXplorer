/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z;
import ax.b6.Z2;
import ax.b6.s;
import ax.b6.y2;
import java.util.ArrayList;
import java.util.List;

public abstract class A {
    final List<Z> a = new ArrayList<Z>();

    protected A() {
    }

    final s a(String string) {
        if (this.a.contains((Object)y2.c(string))) {
            StringBuilder stringBuilder = new StringBuilder("Command not implemented: ");
            stringBuilder.append(string);
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("Command not supported");
    }

    public abstract s b(String var1, Z2 var2, List<s> var3);
}

