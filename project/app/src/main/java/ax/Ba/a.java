/*
 * Decompiled with CFR 0.152.
 */
package ax.Ba;

import ax.Q8.m;
import ax.Q8.t;
import java.io.IOException;

public class a
extends IOException {
    private final m c0;
    private final long d0;
    private final ax.K8.a q;

    public a(t t8, String string) {
        super(String.format("%s returned %s (%d/%d): %s", new Object[]{t8.h(), t8.m(), t8.m(), t8.m(), string}));
        this.q = ax.K8.a.l(t8.m());
        this.d0 = t8.m();
        this.c0 = t8.h();
    }

    public ax.K8.a a() {
        return this.q;
    }
}

