/*
 * Decompiled with CFR 0.152.
 */
package ax.x7;

import ax.M5.p;

public class l
extends Exception {
    @Deprecated
    protected l() {
    }

    public l(String string) {
        p.g(string, "Detail message must not be empty");
        super(string);
    }

    public l(String string, Throwable throwable) {
        p.g(string, "Detail message must not be empty");
        super(string, throwable);
    }
}

