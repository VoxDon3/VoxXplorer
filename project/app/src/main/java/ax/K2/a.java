/*
 * Decompiled with CFR 0.152.
 */
package ax.K2;

import ax.Gb.l;

public final class a {
    private final String a;
    private final String b;

    public a(String string, String string2) {
        l.f(string, "workSpecId");
        l.f(string2, "prerequisiteId");
        this.a = string;
        this.b = string2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }
}

