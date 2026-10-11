/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.H;
import ax.p4.f;
import ax.p4.s;

public class I
extends f {
    public final H d0;

    public I(String string, String string2, s s8, H h8) {
        super(string2, s8, f.a(string, s8, h8));
        if (h8 != null) {
            this.d0 = h8;
            return;
        }
        throw new NullPointerException("errorValue");
    }
}

