/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.c;
import ax.p4.f;
import ax.p4.s;

public class d
extends f {
    public final c d0;

    public d(String string, String string2, s s8, c c8) {
        super(string2, s8, f.a(string, s8, c8));
        if (c8 != null) {
            this.d0 = c8;
            return;
        }
        throw new NullPointerException("errorValue");
    }
}

