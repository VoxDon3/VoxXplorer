/*
 * Decompiled with CFR 0.152.
 */
package ax.b3;

import ax.b3.A;
import ax.b3.j;

public class i
extends j
implements A {
    private String q;

    public i(String string, Throwable throwable) {
        super(throwable);
        this.q = string;
    }

    @Override
    public String e() {
        return this.q;
    }
}

