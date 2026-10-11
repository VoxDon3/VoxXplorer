/*
 * Decompiled with CFR 0.152.
 */
package ax.W4;

import ax.W4.e;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class m
extends Reader
implements AutoCloseable {
    protected InputStream c0;
    protected byte[] d0;
    protected int e0;
    protected int f0;
    protected final boolean g0;
    protected char h0;
    protected int i0;
    protected int j0;
    protected final boolean k0;
    protected char[] l0;
    protected final e q;

    public m(e e8, InputStream inputStream, byte[] byArray, int n8, int n9, boolean bl) {
        boolean bl2 = false;
        this.h0 = '\u0000';
        this.q = e8;
        this.c0 = inputStream;
        this.d0 = byArray;
        this.e0 = n8;
        this.f0 = n9;
        this.g0 = bl;
        bl = bl2;
        if (inputStream != null) {
            bl = true;
        }
        this.k0 = bl;
    }

    private void a() {
        byte[] byArray = this.d0;
        if (byArray != null) {
            this.d0 = null;
            e e8 = this.q;
            if (e8 != null) {
                e8.o(byArray);
            }
        }
    }

    private boolean b(int n8) throws IOException {
        Object object;
        Object object2 = this.c0;
        if (object2 != null && (object = this.d0) != null) {
            this.j0 += this.f0 - n8;
            if (n8 > 0) {
                int n9 = this.e0;
                if (n9 > 0) {
                    System.arraycopy(object, n9, object, 0, n8);
                    this.e0 = 0;
                }
                this.f0 = n8;
            } else {
                this.e0 = 0;
                n8 = ((InputStream)object2).read((byte[])object);
                if (n8 < 1) {
                    this.f0 = 0;
                    if (n8 < 0) {
                        if (this.k0) {
                            this.a();
                        }
                        return false;
                    }
                    this.e();
                }
                this.f0 = n8;
            }
            while ((n8 = this.f0) < 4) {
                object = this.c0;
                object2 = this.d0;
                if ((n8 = ((InputStream)object).read((byte[])object2, n8, ((Object)object2).length - n8)) < 1) {
                    if (n8 < 0) {
                        if (this.k0) {
                            this.a();
                        }
                        this.f(this.f0, 4);
                    }
                    this.e();
                }
                this.f0 += n8;
            }
            return true;
        }
        return false;
    }

    private void c(char[] cArray, int n8, int n9) throws IOException {
        throw new ArrayIndexOutOfBoundsException(String.format("read(buf,%d,%d), cbuf[%d]", n8, n9, cArray.length));
    }

    private void d(int n8, int n9, String string) throws IOException {
        int n10 = this.j0;
        int n11 = this.e0;
        int n12 = this.i0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid UTF-32 character 0x");
        stringBuilder.append(Integer.toHexString(n8));
        stringBuilder.append(string);
        stringBuilder.append(" at char #");
        stringBuilder.append(n12 + n9);
        stringBuilder.append(", byte #");
        stringBuilder.append(n10 + n11 - 1);
        stringBuilder.append(")");
        throw new CharConversionException(stringBuilder.toString());
    }

    private void e() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    private void f(int n8, int n9) throws IOException {
        int n10 = this.j0;
        int n11 = this.i0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ");
        stringBuilder.append(n8);
        stringBuilder.append(", needed ");
        stringBuilder.append(n9);
        stringBuilder.append(", at char #");
        stringBuilder.append(n11);
        stringBuilder.append(", byte #");
        stringBuilder.append(n10 + n8);
        stringBuilder.append(")");
        throw new CharConversionException(stringBuilder.toString());
    }

    @Override
    public void close() throws IOException {
        InputStream inputStream = this.c0;
        if (inputStream != null) {
            this.c0 = null;
            this.a();
            inputStream.close();
        }
    }

    @Override
    public int read() throws IOException {
        if (this.l0 == null) {
            this.l0 = new char[1];
        }
        if (this.read(this.l0, 0, 1) < 1) {
            return -1;
        }
        return this.l0[0];
    }

    @Override
    public int read(char[] cArray, int n8, int n9) throws IOException {
        int n10;
        if (this.d0 == null) {
            return -1;
        }
        if (n9 < 1) {
            return n9;
        }
        if (n8 < 0 || n8 + n9 > cArray.length) {
            this.c(cArray, n8, n9);
        }
        int n11 = n9 + n8;
        char c8 = this.h0;
        if (c8 != '\u0000') {
            n9 = n8 + 1;
            cArray[n8] = c8;
            this.h0 = '\u0000';
        } else {
            n9 = this.f0 - this.e0;
            if (n9 < 4 && !this.b(n9)) {
                if (n9 == 0) {
                    return -1;
                }
                this.f(this.f0 - this.e0, 4);
            }
            n9 = n8;
        }
        int n12 = this.f0;
        while (true) {
            int n13;
            int n14;
            byte[] byArray;
            n10 = n9;
            if (n9 >= n11) break;
            int n15 = this.e0;
            n10 = n9;
            if (n15 > n12 - 4) break;
            if (this.g0) {
                byArray = this.d0;
                n14 = byArray[n15] << 8 | byArray[n15 + 1] & 0xFF;
                n10 = byArray[n15 + 2];
                n10 = byArray[n15 + 3] & 0xFF | (n10 & 0xFF) << 8;
            } else {
                byArray = this.d0;
                n10 = byArray[n15];
                n13 = byArray[n15 + 1];
                n14 = byArray[n15 + 2];
                n14 = byArray[n15 + 3] << 8 | n14 & 0xFF;
                n10 = n10 & 0xFF | (n13 & 0xFF) << 8;
            }
            this.e0 = n15 + 4;
            n13 = n9;
            n15 = n10;
            if (n14 != 0) {
                n14 = 0xFFFF & n14;
                n15 = n10 | n14 - 1 << 16;
                if (n14 > 16) {
                    this.d(n15, n9 - n8, String.format(" (above 0x%08x)", 0x10FFFF));
                }
                n10 = n9 + 1;
                cArray[n9] = (char)((n15 >> 10) + 55296);
                if (n10 >= n11) {
                    this.h0 = (char)n15;
                    break;
                }
                n15 = n15 & 0x3FF | 0xDC00;
                n13 = n10;
            }
            cArray[n13] = (char)n15;
            n9 = n13 + 1;
        }
        n8 = n10 - n8;
        this.i0 += n8;
        return n8;
    }
}

