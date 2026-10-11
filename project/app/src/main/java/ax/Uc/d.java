/*
 * Decompiled with CFR 0.152.
 */
package ax.Uc;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class d
extends FilterOutputStream
implements AutoCloseable {
    private final Socket q;

    public d(Socket socket, OutputStream outputStream) {
        super(outputStream);
        this.q = socket;
    }

    @Override
    public void close() throws IOException {
        super.close();
        this.q.close();
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        this.out.write(byArray, n8, n9);
    }
}

