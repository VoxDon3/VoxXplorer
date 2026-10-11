/*
 * Decompiled with CFR 0.152.
 */
package ax.ie;

import ax.ie.e;
import java.io.IOException;
import java.io.OutputStream;

public final class g
extends e {
    private final OutputStream f;

    public g(OutputStream outputStream) {
        this.f = outputStream;
        this.l();
    }

    @Override
    void n(int n8) throws IOException {
        this.f.write(n8);
    }
}

