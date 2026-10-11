package ax.W4;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* loaded from: classes.dex */
public final class n extends Writer implements AutoCloseable {
    private OutputStream c0;
    private byte[] d0;
    private final int e0;
    private int f0 = 0;
    private int g0;
    private final e q;

    public n(e eVar, OutputStream outputStream) {
        this.q = eVar;
        this.c0 = outputStream;
        this.d0 = eVar.h();
        this.e0 = r1.length - 4;
    }

    protected static void b(int i) throws IOException {
        throw new IOException(c(i));
    }

    protected static String c(int i) {
        if (i > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 4627";
        }
        if (i < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output";
        }
        if (i <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i) + ")";
        }
        return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i) + ")";
    }

    protected int a(int i) throws IOException {
        int i2 = this.g0;
        this.g0 = 0;
        if (i >= 56320 && i <= 57343) {
            return ((i2 - 55296) << 10) + 65536 + (i - 56320);
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i) + "; illegal combination");
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.c0;
        if (outputStream != null) {
            int i = this.f0;
            if (i > 0) {
                outputStream.write(this.d0, 0, i);
                this.f0 = 0;
            }
            OutputStream outputStream2 = this.c0;
            this.c0 = null;
            byte[] bArr = this.d0;
            if (bArr != null) {
                this.d0 = null;
                this.q.q(bArr);
            }
            outputStream2.close();
            int i2 = this.g0;
            this.g0 = 0;
            if (i2 > 0) {
                b(i2);
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.c0;
        if (outputStream != null) {
            int i = this.f0;
            if (i > 0) {
                outputStream.write(this.d0, 0, i);
                this.f0 = 0;
            }
            this.c0.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        write(c);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0025, code lost:
    
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(char[] r9, int r10, int r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.W4.n.write(char[], int, int):void");
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        int i2;
        if (this.g0 > 0) {
            i = a(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i > 56319) {
                b(i);
            }
            this.g0 = i;
            return;
        }
        int i3 = this.f0;
        if (i3 >= this.e0) {
            this.c0.write(this.d0, 0, i3);
            this.f0 = 0;
        }
        if (i < 128) {
            byte[] bArr = this.d0;
            int i4 = this.f0;
            this.f0 = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        int i5 = this.f0;
        if (i < 2048) {
            byte[] bArr2 = this.d0;
            int i6 = i5 + 1;
            bArr2[i5] = (byte) ((i >> 6) | 192);
            i2 = i5 + 2;
            bArr2[i6] = (byte) ((i & 63) | 128);
        } else if (i <= 65535) {
            byte[] bArr3 = this.d0;
            bArr3[i5] = (byte) ((i >> 12) | 224);
            int i7 = i5 + 2;
            bArr3[i5 + 1] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 3;
            bArr3[i7] = (byte) ((i & 63) | 128);
        } else {
            if (i > 1114111) {
                b(i);
            }
            byte[] bArr4 = this.d0;
            bArr4[i5] = (byte) ((i >> 18) | 240);
            bArr4[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
            int i8 = i5 + 3;
            bArr4[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 4;
            bArr4[i8] = (byte) ((i & 63) | 128);
        }
        this.f0 = i2;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0029, code lost:
    
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(java.lang.String r9, int r10, int r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.W4.n.write(java.lang.String, int, int):void");
    }
}
