/*
 * Decompiled with CFR 0.152.
 */
package ax.G4;

import ax.G4.A;
import ax.p4.f;
import ax.p4.s;

public class B
extends f {
    public final A d0;

    public B(String string, String string2, s s8, A a8) {
        super(string2, s8, f.a(string, s8, a8));
        if (a8 != null) {
            this.d0 = a8;
            return;
        }
        throw new NullPointerException("errorValue");
    }
}

