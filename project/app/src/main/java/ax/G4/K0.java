/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.J0;
import ax.p4.f;
import ax.p4.s;

public class K0
extends f {
    public final J0 d0;

    public K0(String string, String string2, s s8, J0 j02) {
        super(string2, s8, f.a(string, s8, (Object)j02));
        if (j02 != null) {
            this.d0 = j02;
            return;
        }
        throw new NullPointerException("errorValue");
    }
}

