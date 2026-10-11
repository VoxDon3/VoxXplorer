/*
 * Decompiled with CFR 0.152.
 */
package ax.Gb;

import ax.Gb.h;
import ax.Gb.l;
import ax.Gb.w;
import java.io.Serializable;

public abstract class m<R>
implements h<R>,
Serializable {
    private final int arity;

    public m(int n8) {
        this.arity = n8;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String string = w.g(this);
        l.e(string, "renderLambdaToString(...)");
        return string;
    }
}

