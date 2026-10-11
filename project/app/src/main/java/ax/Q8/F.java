/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.K8.a;
import ax.Q8.m;
import ax.Q8.t;
import ax.k9.d;

public class F
extends d {
    private final m c0;
    private long d0;

    public F(long l8, m m8, String string, Throwable throwable) {
        super(string, throwable);
        this.d0 = l8;
        this.c0 = m8;
    }

    public F(t t8, String string) {
        super(string);
        this.d0 = t8.m();
        this.c0 = t8.h();
    }

    public a a() {
        return a.l(this.d0);
    }

    public long b() {
        return this.d0;
    }

    @Override
    public String getMessage() {
        return String.format("%s (0x%08x): %s", this.a().name(), this.d0, super.getMessage());
    }
}

