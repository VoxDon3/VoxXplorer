/*
 * Decompiled with CFR 0.152.
 */
package ax.N1;

import ax.R0.a;
import ax.r7.z;
import java.util.List;

public class e {
    public final z<a> a;
    public final long b;
    public final long c;
    public final long d;

    public e(List<a> list, long l8, long l9) {
        long l10;
        this.a = z.u(list);
        this.b = l8;
        this.c = l9;
        long l11 = l10 = -9223372036854775807L;
        if (l8 != -9223372036854775807L) {
            l11 = l9 == -9223372036854775807L ? l10 : l8 + l9;
        }
        this.d = l11;
    }
}

