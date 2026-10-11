/*
 * Decompiled with CFR 0.152.
 */
package ax.p4;

import ax.p4.j;
import java.util.concurrent.TimeUnit;

public class x
extends j {
    private final long c0;

    public x(String string, String string2) {
        this(string, string2, 0L, TimeUnit.MILLISECONDS);
    }

    public x(String string, String string2, long l8, TimeUnit timeUnit) {
        super(string, string2);
        this.c0 = timeUnit.toMillis(l8);
    }

    public long a() {
        return this.c0;
    }
}

