/*
 * Decompiled with CFR 0.152.
 */
package ax.s7;

import ax.q7.n;
import ax.s7.b;
import ax.u7.f;
import ax.u7.h;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class e
extends FilterInputStream
implements DataInput,
j.InputStreamRetargetInterface {
    public e(InputStream inputStream) {
        super(n.n(inputStream));
    }

    private byte a() throws IOException, EOFException {
        int n8 = this.in.read();
        if (-1 != n8) {
            return (byte)n8;
        }
        throw new EOFException();
    }

    @Override
    public boolean readBoolean() throws IOException {
        return this.readUnsignedByte() != 0;
    }

    @Override
    public byte readByte() throws IOException {
        return (byte)this.readUnsignedByte();
    }

    @Override
    public char readChar() throws IOException {
        return (char)this.readUnsignedShort();
    }

    @Override
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(this.readLong());
    }

    @Override
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(this.readInt());
    }

    @Override
    public void readFully(byte[] byArray) throws IOException {
        b.e(this, byArray);
    }

    @Override
    public void readFully(byte[] byArray, int n8, int n9) throws IOException {
        b.f(this, byArray, n8, n9);
    }

    @Override
    public int readInt() throws IOException {
        byte by = this.a();
        byte by2 = this.a();
        byte by3 = this.a();
        return f.i(this.a(), by3, by2, by);
    }

    @Override
    public String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override
    public long readLong() throws IOException {
        byte by = this.a();
        byte by2 = this.a();
        byte by3 = this.a();
        byte by4 = this.a();
        byte by5 = this.a();
        byte by6 = this.a();
        byte by7 = this.a();
        return h.f(this.a(), by7, by6, by5, by4, by3, by2, by);
    }

    @Override
    public short readShort() throws IOException {
        return (short)this.readUnsignedShort();
    }

    @Override
    public String readUTF() throws IOException {
        return new DataInputStream(this.in).readUTF();
    }

    @Override
    public int readUnsignedByte() throws IOException {
        int n8 = this.in.read();
        if (n8 >= 0) {
            return n8;
        }
        throw new EOFException();
    }

    @Override
    public int readUnsignedShort() throws IOException {
        byte by = this.a();
        return f.i((byte)0, (byte)0, this.a(), by);
    }

    @Override
    public int skipBytes(int n8) throws IOException {
        return (int)this.in.skip(n8);
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

