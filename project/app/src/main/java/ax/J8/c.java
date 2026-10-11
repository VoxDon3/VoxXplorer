/*
 * Decompiled with CFR 0.152.
 */
package ax.J8;

import ax.J8.b;
import ax.Z8.a;
import java.util.UUID;

public class c {
    public static void a(b b8, a<?> a8) {
        long l8 = b8.a();
        a8.u(l8 & 0xFFFFFFFFL);
        a8.u(l8 >> 32 & 0xFFFFFFFFL);
    }

    public static void b(UUID uUID, a<?> a8) {
        long l8 = uUID.getLeastSignificantBits();
        long l9 = uUID.getMostSignificantBits();
        a8.u(l9 >>> 32);
        a8.s((int)(l9 >>> 16 & 0xFFFFL));
        a8.s((int)(l9 & 0xFFFFL));
        a8.l(l8, ax.Z8.b.c);
    }

    public static b c(a<?> a8) throws a.b {
        return new b(a8.N() | a8.N() << 32);
    }

    public static UUID d(a<?> a8) throws a.b {
        return new UUID((a8.N() << 16 | (long)a8.J()) << 16 | (long)a8.J(), a8.B(ax.Z8.b.c));
    }
}

