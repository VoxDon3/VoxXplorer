/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.S;
import ax.W5.V;
import java.io.Serializable;

public abstract class U
implements Serializable {
    U() {
    }

    public static U c() {
        return S.q;
    }

    public static U d(Object object) {
        return new V(object);
    }

    public abstract Object a();

    public abstract boolean b();
}

