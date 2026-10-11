/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.ke.D;

public class m
extends RuntimeException {
    private final String c0;
    private final transient D<?> d0;
    private final int q;

    public m(D<?> d8) {
        super(m.a(d8));
        this.q = d8.b();
        this.c0 = d8.f();
        this.d0 = d8;
    }

    private static String a(D<?> d8) {
        j.Objects.requireNonNull(d8, (String)"response == null");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HTTP ");
        stringBuilder.append(d8.b());
        stringBuilder.append(" ");
        stringBuilder.append(d8.f());
        return stringBuilder.toString();
    }
}

