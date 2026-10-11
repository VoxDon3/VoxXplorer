/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.W;
import ax.W5.X;
import ax.W5.Z;
import ax.W5.a0;
import java.io.Serializable;

public final class b0 {
    public static W a(W w8) {
        if (!(w8 instanceof Z)) {
            if (w8 instanceof X) {
                return w8;
            }
            if (w8 instanceof Serializable) {
                return new X(w8);
            }
            return new Z(w8);
        }
        return w8;
    }

    public static W b(Object object) {
        return new a0(object);
    }
}

