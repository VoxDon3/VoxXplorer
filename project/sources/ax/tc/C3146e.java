package ax.tc;

import ax.oc.C2743a;
import ax.rc.AbstractC3027b;
import ax.sc.EnumC3086c;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/* renamed from: ax.tc.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3146e {
    public static byte[] a(char[] cArr, boolean z) {
        return z ? c(cArr) : b(cArr);
    }

    private static byte[] b(char[] cArr) {
        byte[] bArr = new byte[cArr.length];
        for (int i = 0; i < cArr.length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    private static byte[] c(char[] cArr) {
        try {
            ByteBuffer encode = C3143b.b.encode(CharBuffer.wrap(cArr));
            byte[] bArr = new byte[encode.limit()];
            encode.get(bArr);
            return bArr;
        } catch (Exception unused) {
            return b(cArr);
        }
    }

    public static EnumC3086c d(AbstractC3027b abstractC3027b) throws C2743a {
        if (abstractC3027b.d() != EnumC3086c.AES_INTERNAL_ONLY) {
            return abstractC3027b.d();
        }
        if (abstractC3027b.b() != null) {
            return abstractC3027b.b().d();
        }
        throw new C2743a("AesExtraDataRecord not present in local header for aes encrypted data");
    }

    public static int e(InputStream inputStream, byte[] bArr) throws IOException {
        int read = inputStream.read(bArr);
        if (read == -1) {
            throw new IOException("Unexpected EOF reached when trying to read stream");
        }
        if (read == bArr.length) {
            return read;
        }
        int g = g(inputStream, bArr, read);
        if (g == bArr.length) {
            return g;
        }
        throw new IOException("Cannot read fully into byte buffer");
    }

    public static int f(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Negative offset");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (i + i2 > bArr.length) {
            throw new IllegalArgumentException("Length greater than buffer size");
        }
        while (true) {
            if (i3 == i2) {
                break;
            }
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                i3 += read;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    private static int g(InputStream inputStream, byte[] bArr, int i) throws IOException {
        if (i < 0) {
            throw new IOException("Invalid readLength");
        }
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int length = bArr.length - i;
        for (int i3 = 1; i < bArr.length && i2 != -1 && i3 < 15; i3++) {
            i2 = inputStream.read(bArr, i, length);
            if (i2 > 0) {
                i += i2;
                length -= i2;
            }
        }
        return i;
    }
}
