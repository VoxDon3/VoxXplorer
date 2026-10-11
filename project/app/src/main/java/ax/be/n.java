/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.L;
import ax.be.c;
import ax.be.m;
import ax.be.o;
import ax.be.r;
import ax.be.s;
import java.io.InputStream;

public class n
extends r {
    private int q = 1;

    public n(int n8) throws L {
        this.i(n8);
    }

    @Override
    public InputStream c(InputStream inputStream, c c8) {
        return new m(inputStream, this.q);
    }

    public Object clone() {
        try {
            Object object = super.clone();
            return object;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException();
        }
    }

    @Override
    public s f(s s8, c c8) {
        return new o(s8, this);
    }

    public int h() {
        return this.q;
    }

    public void i(int n8) throws L {
        if (n8 >= 1 && n8 <= 256) {
            this.q = n8;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Delta distance must be in the range [1, 256]: ");
        stringBuilder.append(n8);
        throw new L(stringBuilder.toString());
    }
}

