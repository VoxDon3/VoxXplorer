/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.Z3;
import ax.b6.n;
import ax.b6.s;
import java.util.List;
import java.util.concurrent.Callable;

public final class I7
extends n {
    private final Callable<Object> d0;

    public I7(String string, Callable<Object> callable) {
        super(string);
        this.d0 = callable;
    }

    @Override
    public final s a(Z2 object, List<s> list) {
        try {
            object = Z3.b(this.d0.call());
            return object;
        }
        catch (Exception exception) {
            return s.f;
        }
    }
}

