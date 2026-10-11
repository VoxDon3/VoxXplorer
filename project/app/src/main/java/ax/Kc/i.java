/*
 * Decompiled with CFR 0.152.
 */
package ax.Kc;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class i
extends FilterInputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    public i(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public void close() throws IOException {
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

