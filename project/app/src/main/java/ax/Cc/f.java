/*
 * Decompiled with CFR 0.152.
 */
package ax.Cc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class f
extends InputStream
implements j.InputStreamRetargetInterface {
    f() {
    }

    @Override
    public int read() throws IOException {
        return 0;
    }

    @Override
    public long skip(long l8) {
        return l8;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

