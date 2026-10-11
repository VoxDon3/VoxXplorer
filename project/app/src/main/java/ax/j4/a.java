/*
 * Decompiled with CFR 0.152.
 */
package ax.j4;

import ax.M3.h;
import java.security.MessageDigest;

public final class a
implements h {
    private static final a b = new a();

    private a() {
    }

    public static a c() {
        return b;
    }

    @Override
    public void a(MessageDigest messageDigest) {
    }

    public String toString() {
        return "EmptySignature";
    }
}

