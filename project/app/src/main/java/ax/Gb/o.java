/*
 * Decompiled with CFR 0.152.
 */
package ax.Gb;

import ax.Gb.s;
import ax.Gb.w;
import ax.Mb.a;
import ax.Mb.e;

public abstract class o
extends s
implements e {
    public o(Object object, Class clazz, String string, String string2, int n8) {
        super(object, clazz, string, string2, n8);
    }

    @Override
    protected a b() {
        return w.d(this);
    }

    @Override
    public Object invoke() {
        return this.get();
    }
}

