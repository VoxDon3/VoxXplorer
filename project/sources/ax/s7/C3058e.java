package ax.s7;

import ax.q7.n;
import ax.u7.C3218f;
import ax.u7.h;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ax.s7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3058e extends FilterInputStream implements DataInput, InputStreamRetargetInterface {
    public C3058e(InputStream inputStream) {
        super((InputStream) n.n(inputStream));
    }

    private byte a() throws IOException, EOFException {
        int read = ((FilterInputStream) this).in.read();
        if (-1 != read) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws IOException {
        return readUnsignedByte() != 0;
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    public char readChar() throws IOException {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        C3055b.e(this, bArr);
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException {
        byte a = a();
        byte a2 = a();
        return C3218f.i(a(), a(), a2, a);
    }

    @Override // java.io.DataInput
    public String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException {
        byte a = a();
        byte a2 = a();
        byte a3 = a();
        byte a4 = a();
        byte a5 = a();
        byte a6 = a();
        return h.f(a(), a(), a6, a5, a4, a3, a2, a);
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public String readUTF() throws IOException {
        return new DataInputStream(((FilterInputStream) this).in).readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException {
        return C3218f.i((byte) 0, (byte) 0, a(), a());
    }

    @Override // java.io.DataInput
    public int skipBytes(int i) throws IOException {
        return (int) ((FilterInputStream) this).in.skip(i);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        C3055b.f(this, bArr, i, i2);
    }
}
