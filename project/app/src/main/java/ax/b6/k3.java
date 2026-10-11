/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.m3;
import ax.b6.n3;
import ax.q7.n;
import ax.r7.B;

public final class k3 {
    private final boolean a;

    public k3(n3 n32) {
        n.o(n32, "BuildInfo must be non-null");
        this.a = n32.a() ^ true;
    }

    public final boolean a(String string) {
        n.o(string, "flagName must not be null");
        if (!this.a) {
            return true;
        }
        return ((B)m3.a.get()).d(string);
    }
}

