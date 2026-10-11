/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.D0;
import ax.p4.f;
import ax.p4.s;

public class E0
extends f {
    public final D0 d0;

    public E0(String string, String string2, s s8, D0 d02) {
        super(string2, s8, f.a(string, s8, d02));
        if (d02 != null) {
            this.d0 = d02;
            return;
        }
        throw new NullPointerException("errorValue");
    }
}

