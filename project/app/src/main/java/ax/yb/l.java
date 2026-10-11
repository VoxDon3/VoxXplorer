/*
 * Decompiled with CFR 0.152.
 */
package ax.yb;

import ax.Gb.h;
import ax.Gb.w;
import ax.wb.e;
import ax.yb.d;

public abstract class l
extends d
implements h<Object> {
    private final int e0;

    public l(int n8, e<Object> e8) {
        super(e8);
        this.e0 = n8;
    }

    @Override
    public int getArity() {
        return this.e0;
    }

    @Override
    public String toString() {
        if (this.h() == null) {
            String string = w.f(this);
            ax.Gb.l.e(string, "renderLambdaToString(...)");
            return string;
        }
        return super.toString();
    }
}

