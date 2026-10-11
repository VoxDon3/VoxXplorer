/*
 * Decompiled with CFR 0.152.
 */
package ax.Uc;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class c
extends FilterInputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private final Socket q;

    public c(Socket socket, InputStream inputStream) {
        super(inputStream);
        this.q = socket;
    }

    @Override
    public void close() throws IOException {
        super.close();
        this.q.close();
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

