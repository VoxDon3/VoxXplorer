/*
 * Decompiled with CFR 0.152.
 */
package ax.yb;

import ax.Gb.h;
import ax.Gb.l;
import ax.Gb.w;
import ax.wb.e;
import ax.yb.j;

public abstract class k
extends j
implements h<Object> {
    private final int c0;

    public k(int n8, e<Object> e8) {
        super(e8);
        this.c0 = n8;
    }

    @Override
    public int getArity() {
        return this.c0;
    }

    @Override
    public String toString() {
        if (this.h() == null) {
            String string = w.f(this);
            l.e(string, "renderLambdaToString(...)");
            return string;
        }
        return super.toString();
    }
}

