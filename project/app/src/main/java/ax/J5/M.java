/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import ax.J5.L;
import ax.J5.O;
import java.util.concurrent.Callable;

final class M
extends O {
    private final Callable f;

    /* synthetic */ M(Callable callable, L l8) {
        super(false, 1, 5, null, null, null);
        this.f = callable;
    }

    @Override
    final String a() {
        try {
            String string = (String)this.f.call();
            return string;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}

