/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.H;
import ax.be.I;
import ax.be.c;
import ax.be.f;
import ax.be.s;
import java.io.InputStream;

public class b
extends f {
    public b() {
        super(2);
    }

    @Override
    public InputStream c(InputStream inputStream, c c8) {
        return new H(inputStream, new ax.je.b(false, this.c0));
    }

    @Override
    public s f(s s8, c c8) {
        return new I(s8, new ax.je.b(true, this.c0));
    }
}

