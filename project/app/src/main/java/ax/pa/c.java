/*
 * Decompiled with CFR 0.152.
 */
package ax.pa;

import ax.pa.e;
import ax.qa.b;
import java.io.IOException;
import java.io.InputStream;

public class c
extends e {
    public c(InputStream inputStream) {
        super(inputStream);
    }

    public int j() throws IOException {
        return this.f();
    }

    public <T extends b> T k(T t8) throws IOException {
        t8.b(this);
        t8.c(this);
        t8.a(this);
        return t8;
    }
}

