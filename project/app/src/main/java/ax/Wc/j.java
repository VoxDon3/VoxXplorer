/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import java.io.IOException;

public class j
extends IOException {
    private Throwable q;

    j(String string) {
        super(string);
    }

    j(String string, Throwable throwable) {
        super(string);
        this.q = throwable;
    }

    @Override
    public Throwable getCause() {
        return this.q;
    }
}

