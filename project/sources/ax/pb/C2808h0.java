package ax.pb;

import ax.qb.C2894b;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import okhttp3.HttpUrl;

/* renamed from: ax.pb.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2808h0 implements DataOutput, DataInput {
    private long c0;
    private int d0;
    private int e0;
    private int f0;
    private int g0;
    private int h0;
    private byte[] i0 = new byte[8];
    private X j0;
    private C2796b0 q;

    public C2808h0(C2796b0 c2796b0, String str) throws C2794a0, MalformedURLException, UnknownHostException {
        this.e0 = 0;
        this.h0 = 0;
        this.j0 = null;
        this.q = c2796b0;
        if (str.equals("r")) {
            this.d0 = 17;
        } else {
            if (!str.equals("rw")) {
                throw new IllegalArgumentException("Invalid mode");
            }
            this.d0 = 23;
            this.j0 = new X();
            this.h0 = 2114;
            this.e0 = 3;
        }
        c2796b0.Q(this.d0, this.e0, 128, this.h0);
        k0 k0Var = c2796b0.o0.f.h;
        this.f0 = k0Var.A0 - 70;
        this.g0 = k0Var.z0 - 70;
        this.c0 = 0L;
    }

    public void a() throws C2794a0 {
        this.q.d();
    }

    public int b() {
        return this.f0;
    }

    public long c() throws C2794a0 {
        return this.q.L();
    }

    public int d() throws C2794a0 {
        if (e(this.i0, 0, 1) == -1) {
            return -1;
        }
        return this.i0[0] & 255;
    }

    public int e(byte[] bArr, int i, int i2) throws C2794a0 {
        int i3;
        int i4;
        long j;
        if (i2 <= 0) {
            return 0;
        }
        long j2 = this.c0;
        if (!this.q.I()) {
            this.q.Q(this.d0, 0, 128, this.h0);
        }
        L l = new L(bArr, i);
        do {
            int i5 = this.f0;
            i3 = i2 > i5 ? i5 : i2;
            this.q.Y(new K(this.q.q0, this.c0, i3, null), l);
            i4 = l.I0;
            if (i4 > 0) {
                j = this.c0 + i4;
                this.c0 = j;
                i2 -= i4;
                l.G0 += i4;
                if (i2 <= 0) {
                    break;
                }
            } else {
                long j3 = this.c0;
                return (int) (j3 - j2 > 0 ? j3 - j2 : -1L);
            }
        } while (i4 == i3);
        return (int) (j - j2);
    }

    public void f(long j) throws C2794a0 {
        this.c0 = j;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() throws C2794a0 {
        if (e(this.i0, 0, 1) >= 0) {
            return this.i0[0] != 0;
        }
        throw new C2794a0("EOF");
    }

    @Override // java.io.DataInput
    public final byte readByte() throws C2794a0 {
        if (e(this.i0, 0, 1) >= 0) {
            return this.i0[0];
        }
        throw new C2794a0("EOF");
    }

    @Override // java.io.DataInput
    public final char readChar() throws C2794a0 {
        if (e(this.i0, 0, 2) >= 0) {
            return (char) C2894b.c(this.i0, 0);
        }
        throw new C2794a0("EOF");
    }

    @Override // java.io.DataInput
    public final double readDouble() throws C2794a0 {
        if (e(this.i0, 0, 8) >= 0) {
            return C2894b.a(this.i0, 0);
        }
        throw new C2794a0("EOF");
    }

    @Override // java.io.DataInput
    public final float readFloat() throws C2794a0 {
        if (e(this.i0, 0, 4) >= 0) {
            return C2894b.b(this.i0, 0);
        }
        throw new C2794a0("EOF");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws C2794a0 {
        readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final int readInt() throws C2794a0 {
        if (e(this.i0, 0, 4) >= 0) {
            return C2894b.e(this.i0, 0);
        }
        throw new C2794a0("EOF");
    }

    @Override // java.io.DataInput
    public final String readLine() throws C2794a0 {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        int i = -1;
        while (!z) {
            i = d();
            if (i != -1 && i != 10) {
                if (i != 13) {
                    stringBuffer.append((char) i);
                } else {
                    long j = this.c0;
                    if (d() != 10) {
                        this.c0 = j;
                    }
                }
            }
            z = true;
        }
        if (i == -1 && stringBuffer.length() == 0) {
            return null;
        }
        return stringBuffer.toString();
    }

    @Override // java.io.DataInput
    public final long readLong() throws C2794a0 {
        if (e(this.i0, 0, 8) >= 0) {
            return C2894b.g(this.i0, 0);
        }
        throw new C2794a0("EOF");
    }

    @Override // java.io.DataInput
    public final short readShort() throws C2794a0 {
        if (e(this.i0, 0, 2) >= 0) {
            return C2894b.c(this.i0, 0);
        }
        throw new C2794a0("EOF");
    }

    @Override // java.io.DataInput
    public final String readUTF() throws C2794a0 {
        int readUnsignedShort = readUnsignedShort();
        byte[] bArr = new byte[readUnsignedShort];
        e(bArr, 0, readUnsignedShort);
        try {
            return C2894b.h(bArr, 0, readUnsignedShort);
        } catch (IOException e) {
            throw new C2794a0(HttpUrl.FRAGMENT_ENCODE_SET, e);
        }
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws C2794a0 {
        if (e(this.i0, 0, 1) >= 0) {
            return this.i0[0] & 255;
        }
        throw new C2794a0("EOF");
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws C2794a0 {
        if (e(this.i0, 0, 2) >= 0) {
            return C2894b.c(this.i0, 0) & 65535;
        }
        throw new C2794a0("EOF");
    }

    @Override // java.io.DataInput
    public int skipBytes(int i) throws C2794a0 {
        if (i <= 0) {
            return 0;
        }
        this.c0 += i;
        return i;
    }

    @Override // java.io.DataOutput
    public void write(int i) throws C2794a0 {
        byte[] bArr = this.i0;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z) throws C2794a0 {
        byte[] bArr = this.i0;
        bArr[0] = z ? (byte) 1 : (byte) 0;
        write(bArr, 0, 1);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i) throws C2794a0 {
        byte[] bArr = this.i0;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.DataOutput
    public final void writeBytes(String str) throws C2794a0 {
        byte[] bytes = str.getBytes();
        write(bytes, 0, bytes.length);
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i) throws C2794a0 {
        C2894b.k((short) i, this.i0, 0);
        write(this.i0, 0, 2);
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) throws C2794a0 {
        int length = str.length();
        int i = length * 2;
        byte[] bArr = new byte[i];
        char[] cArr = new char[length];
        str.getChars(0, length, cArr, 0);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i2 + 1;
            char c = cArr[i3];
            bArr[i2] = (byte) (c >>> '\b');
            i2 += 2;
            bArr[i4] = (byte) c;
        }
        write(bArr, 0, i);
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d) throws C2794a0 {
        C2894b.i(d, this.i0, 0);
        write(this.i0, 0, 8);
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f) throws C2794a0 {
        C2894b.j(f, this.i0, 0);
        write(this.i0, 0, 4);
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i) throws C2794a0 {
        C2894b.m(i, this.i0, 0);
        write(this.i0, 0, 4);
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j) throws C2794a0 {
        C2894b.o(j, this.i0, 0);
        write(this.i0, 0, 8);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i) throws C2794a0 {
        C2894b.k((short) i, this.i0, 0);
        write(this.i0, 0, 2);
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) throws C2794a0 {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            i += charAt > 127 ? charAt > 2047 ? 3 : 2 : 1;
        }
        byte[] bArr = new byte[i];
        writeShort(i);
        try {
            C2894b.q(str, bArr, 0, i);
            write(bArr, 0, i);
        } catch (IOException e) {
            throw new C2794a0(HttpUrl.FRAGMENT_ENCODE_SET, e);
        }
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws C2794a0 {
        int i3 = 0;
        do {
            int e = e(bArr, i + i3, i2 - i3);
            if (e < 0) {
                throw new C2794a0("EOF");
            }
            i3 += e;
            this.c0 += e;
        } while (i3 < i2);
    }

    @Override // java.io.DataOutput
    public void write(byte[] bArr) throws C2794a0 {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.DataOutput
    public void write(byte[] bArr, int i, int i2) throws C2794a0 {
        if (i2 <= 0) {
            return;
        }
        if (!this.q.I()) {
            this.q.Q(this.d0, 0, 128, this.h0);
        }
        int i3 = i;
        int i4 = i2;
        do {
            int i5 = this.g0;
            int i6 = i4 > i5 ? i5 : i4;
            this.q.Y(new W(this.q.q0, this.c0, i4 - i6, bArr, i3, i6, null), this.j0);
            long j = this.c0;
            long j2 = this.j0.F0;
            this.c0 = j + j2;
            i4 = (int) (i4 - j2);
            i3 = (int) (i3 + j2);
        } while (i4 > 0);
    }
}
