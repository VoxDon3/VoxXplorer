/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.o;
import ax.p4.f;
import ax.p4.s;

public class p
extends f {
    public final o d0;

    public p(String string, String string2, s s8, o o8) {
        super(string2, s8, f.a(string, s8, o8));
        if (o8 != null) {
            this.d0 = o8;
            return;
        }
        throw new NullPointerException("errorValue");
    }
}

