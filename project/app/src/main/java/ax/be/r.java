/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.c;
import ax.be.s;
import java.io.IOException;
import java.io.InputStream;

public abstract class r
implements Cloneable {
    r() {
    }

    public InputStream b(InputStream inputStream) throws IOException {
        return this.c(inputStream, c.b());
    }

    public abstract InputStream c(InputStream var1, c var2) throws IOException;

    public s d(s s8) {
        return this.f(s8, c.b());
    }

    public abstract s f(s var1, c var2);
}

