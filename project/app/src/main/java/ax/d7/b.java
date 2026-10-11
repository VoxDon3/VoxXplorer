/*
 * Decompiled with CFR 0.152.
 */
package ax.d7;

import ax.D5.a;
import ax.m7.v;
import java.io.IOException;

public class b
extends IOException {
    public b(a a8) {
        this.initCause(v.d(a8));
    }

    public a a() {
        return (a)super.getCause();
    }
}

