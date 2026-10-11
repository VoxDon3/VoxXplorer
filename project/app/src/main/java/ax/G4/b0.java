/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.a0;
import ax.p4.f;
import ax.p4.s;

public class b0
extends f {
    public final a0 d0;

    public b0(String string, String string2, s s8, a0 a02) {
        super(string2, s8, f.a(string, s8, a02));
        if (a02 != null) {
            this.d0 = a02;
            return;
        }
        throw new NullPointerException("errorValue");
    }
}

