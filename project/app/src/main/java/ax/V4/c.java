/*
 * Decompiled with CFR 0.152.
 */
package ax.V4;

import ax.T4.h;
import ax.T4.j;
import ax.T4.k;

public abstract class c
extends k {
    protected transient j c0;

    protected c(j j8, String string) {
        h h8 = j8 == null ? null : j8.f();
        super(string, h8);
        this.c0 = j8;
    }

    protected c(j j8, String string, Throwable throwable) {
        h h8 = j8 == null ? null : j8.f();
        super(string, h8, throwable);
        this.c0 = j8;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

