package ax.Uc;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public final class b extends PushbackInputStream implements InputStreamRetargetInterface {
    static final boolean c0;
    static final String d0;
    static final byte[] e0;
    private int q;

    static {
        String lineSeparator = System.lineSeparator();
        d0 = lineSeparator;
        c0 = lineSeparator.equals("\r\n");
        e0 = lineSeparator.getBytes(StandardCharsets.US_ASCII);
    }

    public b(InputStream inputStream) {
        super(inputStream, e0.length + 1);
    }

    private int readInt() throws IOException {
        int read = super.read();
        if (read != 13) {
            return read;
        }
        int read2 = super.read();
        if (read2 != 10) {
            if (read2 != -1) {
                unread(read2);
            }
            return 13;
        }
        unread(e0);
        this.q--;
        return super.read();
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        if (((PushbackInputStream) this).in != null) {
            return (((PushbackInputStream) this).buf.length - ((PushbackInputStream) this).pos) + ((PushbackInputStream) this).in.available();
        }
        throw new IOException("Stream closed");
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        return c0 ? super.read() : readInt();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (c0) {
            return super.read(bArr, i, i2);
        }
        if (i2 < 1) {
            return 0;
        }
        int min = Math.min(i2, available());
        this.q = min;
        if (min < 1) {
            this.q = 1;
        }
        int readInt = readInt();
        if (readInt == -1) {
            return -1;
        }
        int i4 = i;
        while (true) {
            i3 = i4 + 1;
            bArr[i4] = (byte) readInt;
            int i5 = this.q - 1;
            this.q = i5;
            if (i5 <= 0 || (readInt = readInt()) == -1) {
                break;
            }
            i4 = i3;
        }
        return i3 - i;
    }
}
