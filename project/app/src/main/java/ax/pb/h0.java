/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.K;
import ax.pb.L;
import ax.pb.W;
import ax.pb.X;
import ax.pb.a0;
import ax.pb.b0;
import ax.pb.k0;
import ax.pb.s;
import ax.qb.b;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

public class h0
implements DataOutput,
DataInput {
    private long c0;
    private int d0;
    private int e0;
    private int f0;
    private int g0;
    private int h0;
    private byte[] i0;
    private X j0;
    private b0 q;

    public h0(b0 z8, String string) throws a0, MalformedURLException, UnknownHostException {
        block4: {
            block3: {
                block2: {
                    this.e0 = 0;
                    this.h0 = 0;
                    this.i0 = new byte[8];
                    this.j0 = null;
                    this.q = z8;
                    if (!string.equals("r")) break block2;
                    this.d0 = 17;
                    break block3;
                }
                if (!string.equals("rw")) break block4;
                this.d0 = 23;
                this.j0 = new X();
                this.h0 = 2114;
                this.e0 = 3;
            }
            z8.Q(this.d0, this.e0, 128, this.h0);
            z8 = z8.o0.f.h;
            this.f0 = ((k0)z8).A0 - 70;
            this.g0 = ((k0)z8).z0 - 70;
            this.c0 = 0L;
            return;
        }
        throw new IllegalArgumentException("Invalid mode");
    }

    public void a() throws a0 {
        this.q.d();
    }

    public int b() {
        return this.f0;
    }

    public long c() throws a0 {
        return this.q.L();
    }

    public int d() throws a0 {
        if (this.e(this.i0, 0, 1) == -1) {
            return -1;
        }
        return this.i0[0] & 0xFF;
    }

    public int e(byte[] object, int n8, int n9) throws a0 {
        long l8;
        int n10;
        if (n9 <= 0) {
            return 0;
        }
        long l9 = this.c0;
        if (!this.q.I()) {
            this.q.Q(this.d0, 0, 128, this.h0);
        }
        object = new L((byte[])object, n8);
        do {
            if (n9 <= (n8 = this.f0)) {
                n8 = n9;
            }
            this.q.Y(new K(this.q.q0, this.c0, n8, null), (s)object);
            n10 = object.I0;
            if (n10 <= 0) {
                l8 = this.c0;
                l9 = l8 - l9 > 0L ? l8 - l9 : -1L;
                return (int)l9;
            }
            this.c0 = l8 = this.c0 + (long)n10;
            object.G0 += n10;
        } while ((n9 -= n10) > 0 && n10 == n8);
        return (int)(l8 - l9);
    }

    public void f(long l8) throws a0 {
        this.c0 = l8;
    }

    @Override
    public final boolean readBoolean() throws a0 {
        if (this.e(this.i0, 0, 1) >= 0) {
            return this.i0[0] != 0;
        }
        throw new a0("EOF");
    }

    @Override
    public final byte readByte() throws a0 {
        if (this.e(this.i0, 0, 1) >= 0) {
            return this.i0[0];
        }
        throw new a0("EOF");
    }

    @Override
    public final char readChar() throws a0 {
        if (this.e(this.i0, 0, 2) >= 0) {
            return (char)b.c(this.i0, 0);
        }
        throw new a0("EOF");
    }

    @Override
    public final double readDouble() throws a0 {
        if (this.e(this.i0, 0, 8) >= 0) {
            return b.a(this.i0, 0);
        }
        throw new a0("EOF");
    }

    @Override
    public final float readFloat() throws a0 {
        if (this.e(this.i0, 0, 4) >= 0) {
            return b.b(this.i0, 0);
        }
        throw new a0("EOF");
    }

    @Override
    public final void readFully(byte[] byArray) throws a0 {
        this.readFully(byArray, 0, byArray.length);
    }

    @Override
    public final void readFully(byte[] byArray, int n8, int n9) throws a0 {
        int n10;
        int n11 = 0;
        while ((n10 = this.e(byArray, n8 + n11, n9 - n11)) >= 0) {
            int n12 = n11 + n10;
            this.c0 += (long)n10;
            n11 = n12;
            if (n12 < n9) continue;
            return;
        }
        throw new a0("EOF");
    }

    @Override
    public final int readInt() throws a0 {
        if (this.e(this.i0, 0, 4) >= 0) {
            return b.e(this.i0, 0);
        }
        throw new a0("EOF");
    }

    @Override
    public final String readLine() throws a0 {
        StringBuffer stringBuffer = new StringBuffer();
        boolean bl = false;
        int n8 = -1;
        while (!bl) {
            n8 = this.d();
            if (n8 != -1 && n8 != 10) {
                if (n8 != 13) {
                    stringBuffer.append((char)n8);
                    continue;
                }
                long l8 = this.c0;
                if (this.d() != 10) {
                    this.c0 = l8;
                }
            }
            bl = true;
        }
        if (n8 == -1 && stringBuffer.length() == 0) {
            return null;
        }
        return stringBuffer.toString();
    }

    @Override
    public final long readLong() throws a0 {
        if (this.e(this.i0, 0, 8) >= 0) {
            return b.g(this.i0, 0);
        }
        throw new a0("EOF");
    }

    @Override
    public final short readShort() throws a0 {
        if (this.e(this.i0, 0, 2) >= 0) {
            return b.c(this.i0, 0);
        }
        throw new a0("EOF");
    }

    @Override
    public final String readUTF() throws a0 {
        int n8 = this.readUnsignedShort();
        Object object = new byte[n8];
        this.e((byte[])object, 0, n8);
        try {
            object = b.h(object, 0, n8);
            return object;
        }
        catch (IOException iOException) {
            throw new a0("", (Throwable)iOException);
        }
    }

    @Override
    public final int readUnsignedByte() throws a0 {
        if (this.e(this.i0, 0, 1) >= 0) {
            return this.i0[0] & 0xFF;
        }
        throw new a0("EOF");
    }

    @Override
    public final int readUnsignedShort() throws a0 {
        if (this.e(this.i0, 0, 2) >= 0) {
            return b.c(this.i0, 0) & 0xFFFF;
        }
        throw new a0("EOF");
    }

    @Override
    public int skipBytes(int n8) throws a0 {
        if (n8 > 0) {
            this.c0 += (long)n8;
            return n8;
        }
        return 0;
    }

    @Override
    public void write(int n8) throws a0 {
        byte[] byArray = this.i0;
        byArray[0] = (byte)n8;
        this.write(byArray, 0, 1);
    }

    @Override
    public void write(byte[] byArray) throws a0 {
        this.write(byArray, 0, byArray.length);
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws a0 {
        if (n9 > 0) {
            if (!this.q.I()) {
                this.q.Q(this.d0, 0, 128, this.h0);
            }
            int n10 = n9;
            n9 = n8;
            n8 = n10;
            do {
                if (n8 <= (n10 = this.g0)) {
                    n10 = n8;
                }
                this.q.Y(new W(this.q.q0, this.c0, n8 - n10, byArray, n9, n10, null), this.j0);
                long l8 = this.c0;
                long l9 = this.j0.F0;
                this.c0 = l8 + l9;
                n10 = (int)((long)n8 - l9);
                n9 = (int)((long)n9 + l9);
                n8 = n10;
            } while (n10 > 0);
        }
    }

    @Override
    public final void writeBoolean(boolean bl) throws a0 {
        byte[] byArray = this.i0;
        byArray[0] = (byte)(bl ? 1 : 0);
        this.write(byArray, 0, 1);
    }

    @Override
    public final void writeByte(int n8) throws a0 {
        byte[] byArray = this.i0;
        byArray[0] = (byte)n8;
        this.write(byArray, 0, 1);
    }

    @Override
    public final void writeBytes(String object) throws a0 {
        object = ((String)object).getBytes();
        this.write((byte[])object, 0, ((Object)object).length);
    }

    @Override
    public final void writeChar(int n8) throws a0 {
        b.k((short)n8, this.i0, 0);
        this.write(this.i0, 0, 2);
    }

    @Override
    public final void writeChars(String string) throws a0 {
        int n8 = string.length();
        int n9 = n8 * 2;
        byte[] byArray = new byte[n9];
        char[] cArray = new char[n8];
        string.getChars(0, n8, cArray, 0);
        int n10 = 0;
        int n11 = 0;
        while (true) {
            int n12 = n11;
            if (n10 >= n8) break;
            char c8 = cArray[n10];
            byArray[n12] = (byte)(c8 >>> 8);
            n11 = n12 + 2;
            byArray[n12 + 1] = (byte)c8;
            ++n10;
        }
        this.write(byArray, 0, n9);
    }

    @Override
    public final void writeDouble(double d8) throws a0 {
        b.i(d8, this.i0, 0);
        this.write(this.i0, 0, 8);
    }

    @Override
    public final void writeFloat(float f8) throws a0 {
        b.j(f8, this.i0, 0);
        this.write(this.i0, 0, 4);
    }

    @Override
    public final void writeInt(int n8) throws a0 {
        b.m(n8, this.i0, 0);
        this.write(this.i0, 0, 4);
    }

    @Override
    public final void writeLong(long l8) throws a0 {
        b.o(l8, this.i0, 0);
        this.write(this.i0, 0, 8);
    }

    @Override
    public final void writeShort(int n8) throws a0 {
        b.k((short)n8, this.i0, 0);
        this.write(this.i0, 0, 2);
    }

    @Override
    public final void writeUTF(String string) throws a0 {
        int n8 = string.length();
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n10 = string.charAt(i8);
            n10 = n10 > 127 ? (n10 > 2047 ? 3 : 2) : 1;
            n9 += n10;
        }
        byte[] byArray = new byte[n9];
        this.writeShort(n9);
        try {
            b.q(string, byArray, 0, n9);
        }
        catch (IOException iOException) {
            throw new a0("", (Throwable)iOException);
        }
        this.write(byArray, 0, n9);
    }
}

