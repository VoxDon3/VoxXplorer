/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.s7.b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class d
extends FilterInputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private boolean q = false;

    d(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public void close() throws IOException {
        if (!this.q && this.in != null) {
            try {
                b.c(this);
                this.in.close();
                return;
            }
            finally {
                this.q = true;
            }
        }
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

