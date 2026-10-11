/*
 * Decompiled with CFR 0.152.
 */
package ax.td;

import java.io.IOException;

public class a
extends IOException {
    private Throwable q;

    public a(String string, Throwable throwable) {
        super(string);
        this.q = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.q;
    }
}

