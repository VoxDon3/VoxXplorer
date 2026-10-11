/*
 * Decompiled with CFR 0.152.
 */
package ax.Ma;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class b
extends FilterInputStream
implements j.InputStreamRetargetInterface {
    private Long q;

    public b(InputStream inputStream, Long l8) {
        super(inputStream);
        this.q = l8;
    }

    @Override
    public int read() throws IOException {
        return this.in.read();
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        return this.in.read(byArray);
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        return this.in.read(byArray, n8, n9);
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

