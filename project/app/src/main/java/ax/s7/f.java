/*
 * Decompiled with CFR 0.152.
 */
package ax.s7;

import ax.q7.n;
import ax.u7.h;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class f
extends FilterOutputStream
implements DataOutput,
AutoCloseable {
    public f(OutputStream outputStream) {
        super(new DataOutputStream(n.n(outputStream)));
    }

    @Override
    public void close() throws IOException {
        this.out.close();
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        this.out.write(byArray, n8, n9);
    }

    @Override
    public void writeBoolean(boolean bl) throws IOException {
        ((DataOutputStream)this.out).writeBoolean(bl);
    }

    @Override
    public void writeByte(int n8) throws IOException {
        ((DataOutputStream)this.out).writeByte(n8);
    }

    @Override
    @Deprecated
    public void writeBytes(String string) throws IOException {
        ((DataOutputStream)this.out).writeBytes(string);
    }

    @Override
    public void writeChar(int n8) throws IOException {
        this.writeShort(n8);
    }

    @Override
    public void writeChars(String string) throws IOException {
        for (int i8 = 0; i8 < string.length(); ++i8) {
            this.writeChar(string.charAt(i8));
        }
    }

    @Override
    public void writeDouble(double d8) throws IOException {
        this.writeLong(Double.doubleToLongBits(d8));
    }

    @Override
    public void writeFloat(float f8) throws IOException {
        this.writeInt(Float.floatToIntBits(f8));
    }

    @Override
    public void writeInt(int n8) throws IOException {
        this.out.write(n8 & 0xFF);
        this.out.write(n8 >> 8 & 0xFF);
        this.out.write(n8 >> 16 & 0xFF);
        this.out.write(n8 >> 24 & 0xFF);
    }

    @Override
    public void writeLong(long l8) throws IOException {
        byte[] byArray = h.l(Long.reverseBytes(l8));
        this.write(byArray, 0, byArray.length);
    }

    @Override
    public void writeShort(int n8) throws IOException {
        this.out.write(n8 & 0xFF);
        this.out.write(n8 >> 8 & 0xFF);
    }

    @Override
    public void writeUTF(String string) throws IOException {
        ((DataOutputStream)this.out).writeUTF(string);
    }
}

