/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.v0;
import ax.p4.f;
import ax.p4.s;

public class w0
extends f {
    public final v0 d0;

    public w0(String string, String string2, s s8, v0 v02) {
        super(string2, s8, f.a(string, s8, v02));
        if (v02 != null) {
            this.d0 = v02;
            return;
        }
        throw new NullPointerException("errorValue");
    }
}

