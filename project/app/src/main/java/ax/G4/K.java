/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.J;
import ax.p4.f;
import ax.p4.s;

public class K
extends f {
    public final J d0;

    public K(String string, String string2, s s8, J j8) {
        super(string2, s8, f.a(string, s8, j8));
        if (j8 != null) {
            this.d0 = j8;
            return;
        }
        throw new NullPointerException("errorValue");
    }
}

