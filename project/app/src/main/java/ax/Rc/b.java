/*
 * Decompiled with CFR 0.152.
 */
package ax.Rc;

import java.util.EventObject;

public class b
extends EventObject {
    private final boolean c0;
    private final String d0;
    private final String e0;
    private final int q;

    public b(Object object, int n8, String string) {
        super(object);
        this.q = n8;
        this.d0 = string;
        this.c0 = false;
        this.e0 = null;
    }

    public b(Object object, String string, String string2) {
        super(object);
        this.q = 0;
        this.d0 = string2;
        this.c0 = true;
        this.e0 = string;
    }
}

