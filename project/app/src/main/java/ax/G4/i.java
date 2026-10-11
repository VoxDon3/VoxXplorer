/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.h;
import ax.p4.f;
import ax.p4.s;

public class i
extends f {
    public final h d0;

    public i(String string, String string2, s s8, h h8) {
        super(string2, s8, f.a(string, s8, h8));
        if (h8 != null) {
            this.d0 = h8;
            return;
        }
        throw new NullPointerException("errorValue");
    }
}

