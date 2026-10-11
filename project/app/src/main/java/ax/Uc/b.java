/*
 * Decompiled with CFR 0.152.
 */
package ax.Uc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.nio.charset.StandardCharsets;

public final class b
extends PushbackInputStream
implements j.InputStreamRetargetInterface {
    static final boolean c0;
    static final String d0;
    static final byte[] e0;
    private int q;

    static {
        String string;
        d0 = string = System.lineSeparator();
        c0 = string.equals("\r\n");
        e0 = string.getBytes(StandardCharsets.US_ASCII);
    }

    public b(InputStream inputStream) {
        super(inputStream, e0.length + 1);
    }

    private int readInt() throws IOException {
        int n8;
        int n9 = n8 = super.read();
        if (n8 == 13) {
            n9 = super.read();
            if (n9 != 10) {
                if (n9 != -1) {
                    this.unread(n9);
                }
                return 13;
            }
            this.unread(e0);
            n9 = super.read();
            --this.q;
        }
        return n9;
    }

    @Override
    public int available() throws IOException {
        if (this.in != null) {
            return this.buf.length - this.pos + this.in.available();
        }
        throw new IOException("Stream closed");
    }

    @Override
    public int read() throws IOException {
        if (c0) {
            return super.read();
        }
        return this.readInt();
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        int n10;
        int n11;
        if (c0) {
            return super.read(byArray, n8, n9);
        }
        if (n9 < 1) {
            return 0;
        }
        this.q = n9 = Math.min(n9, this.available());
        if (n9 < 1) {
            this.q = 1;
        }
        if ((n11 = this.readInt()) == -1) {
            return -1;
        }
        n9 = n8;
        while (true) {
            n10 = n9 + 1;
            byArray[n9] = (byte)n11;
            this.q = n9 = this.q - 1;
            if (n9 <= 0 || (n11 = this.readInt()) == -1) break;
            n9 = n10;
        }
        return n10 - n8;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

