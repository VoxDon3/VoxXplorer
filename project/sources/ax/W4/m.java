package ax.W4;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* loaded from: classes.dex */
public class m extends Reader implements AutoCloseable {
    protected InputStream c0;
    protected byte[] d0;
    protected int e0;
    protected int f0;
    protected final boolean g0;
    protected char h0 = 0;
    protected int i0;
    protected int j0;
    protected final boolean k0;
    protected char[] l0;
    protected final e q;

    public m(e eVar, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        this.q = eVar;
        this.c0 = inputStream;
        this.d0 = bArr;
        this.e0 = i;
        this.f0 = i2;
        this.g0 = z;
        this.k0 = inputStream != null;
    }

    private void a() {
        byte[] bArr = this.d0;
        if (bArr != null) {
            this.d0 = null;
            e eVar = this.q;
            if (eVar != null) {
                eVar.o(bArr);
            }
        }
    }

    private boolean b(int i) throws IOException {
        byte[] bArr;
        InputStream inputStream = this.c0;
        if (inputStream == null || (bArr = this.d0) == null) {
            return false;
        }
        this.j0 += this.f0 - i;
        if (i > 0) {
            int i2 = this.e0;
            if (i2 > 0) {
                System.arraycopy(bArr, i2, bArr, 0, i);
                this.e0 = 0;
            }
            this.f0 = i;
        } else {
            this.e0 = 0;
            int read = inputStream.read(bArr);
            if (read < 1) {
                this.f0 = 0;
                if (read < 0) {
                    if (this.k0) {
                        a();
                    }
                    return false;
                }
                e();
            }
            this.f0 = read;
        }
        while (true) {
            int i3 = this.f0;
            if (i3 >= 4) {
                return true;
            }
            InputStream inputStream2 = this.c0;
            byte[] bArr2 = this.d0;
            int read2 = inputStream2.read(bArr2, i3, bArr2.length - i3);
            if (read2 < 1) {
                if (read2 < 0) {
                    if (this.k0) {
                        a();
                    }
                    f(this.f0, 4);
                }
                e();
            }
            this.f0 += read2;
        }
    }

    private void c(char[] cArr, int i, int i2) throws IOException {
        throw new ArrayIndexOutOfBoundsException(String.format("read(buf,%d,%d), cbuf[%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(cArr.length)));
    }

    private void d(int i, int i2, String str) throws IOException {
        int i3 = (this.j0 + this.e0) - 1;
        throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(i) + str + " at char #" + (this.i0 + i2) + ", byte #" + i3 + ")");
    }

    private void e() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    private void f(int i, int i2) throws IOException {
        int i3 = this.j0 + i;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i + ", needed " + i2 + ", at char #" + this.i0 + ", byte #" + i3 + ")");
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.c0;
        if (inputStream != null) {
            this.c0 = null;
            a();
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this.l0 == null) {
            this.l0 = new char[1];
        }
        if (read(this.l0, 0, 1) < 1) {
            return -1;
        }
        return this.l0[0];
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        int i5;
        if (this.d0 == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || i + i2 > cArr.length) {
            c(cArr, i, i2);
        }
        int i6 = i2 + i;
        char c = this.h0;
        if (c != 0) {
            i3 = i + 1;
            cArr[i] = c;
            this.h0 = (char) 0;
        } else {
            int i7 = this.f0 - this.e0;
            if (i7 < 4 && !b(i7)) {
                if (i7 == 0) {
                    return -1;
                }
                f(this.f0 - this.e0, 4);
            }
            i3 = i;
        }
        int i8 = this.f0 - 4;
        while (true) {
            if (i3 >= i6) {
                break;
            }
            int i9 = this.e0;
            if (i9 > i8) {
                break;
            }
            if (this.g0) {
                byte[] bArr = this.d0;
                i4 = (bArr[i9] << 8) | (bArr[i9 + 1] & 255);
                i5 = (bArr[i9 + 3] & 255) | ((bArr[i9 + 2] & 255) << 8);
            } else {
                byte[] bArr2 = this.d0;
                int i10 = (bArr2[i9] & 255) | ((bArr2[i9 + 1] & 255) << 8);
                i4 = (bArr2[i9 + 3] << 8) | (bArr2[i9 + 2] & 255);
                i5 = i10;
            }
            this.e0 = i9 + 4;
            if (i4 != 0) {
                int i11 = 65535 & i4;
                int i12 = i5 | ((i11 - 1) << 16);
                if (i11 > 16) {
                    d(i12, i3 - i, String.format(" (above 0x%08x)", 1114111));
                }
                int i13 = i3 + 1;
                cArr[i3] = (char) ((i12 >> 10) + 55296);
                int i14 = (i12 & 1023) | 56320;
                if (i13 >= i6) {
                    this.h0 = (char) i12;
                    i3 = i13;
                    break;
                }
                i5 = i14;
                i3 = i13;
            }
            cArr[i3] = (char) i5;
            i3++;
        }
        int i15 = i3 - i;
        this.i0 += i15;
        return i15;
    }
}
