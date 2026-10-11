/*
 * Decompiled with CFR 0.152.
 */
package ax.pa;

import ax.pa.f;
import java.io.IOException;
import java.io.OutputStream;

public class d
extends f {
    private int c = 131072;

    public d(OutputStream outputStream) {
        super(outputStream);
    }

    public void f() throws IOException {
        this.c(0);
    }

    public void g() throws IOException {
        int n8 = this.c;
        this.c = n8 + 4;
        this.c(n8);
    }

    public boolean h(Object object) throws IOException {
        if (object == null) {
            this.f();
            return false;
        }
        this.g();
        return true;
    }
}

