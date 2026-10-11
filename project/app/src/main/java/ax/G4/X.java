/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.W;
import ax.p4.f;
import ax.p4.s;

public class X
extends f {
    public final W d0;

    public X(String string, String string2, s s8, W w8) {
        super(string2, s8, f.a(string, s8, w8));
        if (w8 != null) {
            this.d0 = w8;
            return;
        }
        throw new NullPointerException("errorValue");
    }
}

