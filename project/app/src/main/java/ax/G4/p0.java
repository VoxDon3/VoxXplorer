/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.o0;
import ax.p4.f;
import ax.p4.s;

public class p0
extends f {
    public final o0 d0;

    public p0(String string, String string2, s s8, o0 o02) {
        super(string2, s8, f.a(string, s8, o02));
        if (o02 != null) {
            this.d0 = o02;
            return;
        }
        throw new NullPointerException("errorValue");
    }
}

