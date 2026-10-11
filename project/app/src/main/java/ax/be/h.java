/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class h
extends FilterInputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    public h(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public void close() {
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

