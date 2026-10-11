/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.y0;
import ax.p4.f;
import ax.p4.s;

public class z0
extends f {
    public final y0 d0;

    public z0(String string, String string2, s s8, y0 y02) {
        super(string2, s8, f.a(string, s8, y02));
        if (y02 != null) {
            this.d0 = y02;
            return;
        }
        throw new NullPointerException("errorValue");
    }
}

