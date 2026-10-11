/*
 * Decompiled with CFR 0.152.
 */
package ax.tc;

import ax.oc.a;
import ax.sc.c;
import ax.tc.b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class e {
    public static byte[] a(char[] cArray, boolean bl) {
        if (bl) {
            return e.c(cArray);
        }
        return e.b(cArray);
    }

    private static byte[] b(char[] cArray) {
        byte[] byArray = new byte[cArray.length];
        for (int i8 = 0; i8 < cArray.length; ++i8) {
            byArray[i8] = (byte)cArray[i8];
        }
        return byArray;
    }

    private static byte[] c(char[] cArray) {
        try {
            ByteBuffer byteBuffer = b.b.encode(CharBuffer.wrap(cArray));
            byte[] byArray = new byte[byteBuffer.limit()];
            byteBuffer.get(byArray);
            return byArray;
        }
        catch (Exception exception) {
            return e.b(cArray);
        }
    }

    public static c d(ax.rc.b b8) throws a {
        if (b8.d() != c.e0) {
            return b8.d();
        }
        if (b8.b() != null) {
            return b8.b().d();
        }
        throw new a("AesExtraDataRecord not present in local header for aes encrypted data");
    }

    public static int e(InputStream inputStream, byte[] byArray) throws IOException {
        int n8 = inputStream.read(byArray);
        if (n8 != -1) {
            if (n8 != byArray.length) {
                if ((n8 = e.g(inputStream, byArray, n8)) == byArray.length) {
                    return n8;
                }
                throw new IOException("Cannot read fully into byte buffer");
            }
            return n8;
        }
        throw new IOException("Unexpected EOF reached when trying to read stream");
    }

    public static int f(InputStream inputStream, byte[] byArray, int n8, int n9) throws IOException {
        if (n8 >= 0) {
            if (n9 >= 0) {
                if (n9 == 0) {
                    return 0;
                }
                if (n8 + n9 <= byArray.length) {
                    int n10;
                    int n11;
                    for (n10 = 0; n10 != n9; n10 += n11) {
                        n11 = inputStream.read(byArray, n8 + n10, n9 - n10);
                        if (n11 != -1) continue;
                        if (n10 != 0) break;
                        return -1;
                    }
                    return n10;
                }
                throw new IllegalArgumentException("Length greater than buffer size");
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IllegalArgumentException("Negative offset");
    }

    private static int g(InputStream inputStream, byte[] byArray, int n8) throws IOException {
        if (n8 >= 0) {
            int n9 = 0;
            if (n8 == 0) {
                return 0;
            }
            int n10 = byArray.length - n8;
            int n11 = 1;
            int n12 = n8;
            for (n8 = n11; n12 < byArray.length && n9 != -1 && n8 < 15; ++n8) {
                n9 = inputStream.read(byArray, n12, n10);
                int n13 = n10;
                n11 = n12;
                if (n9 > 0) {
                    n11 = n12 + n9;
                    n13 = n10 - n9;
                }
                n10 = n13;
                n12 = n11;
            }
            return n12;
        }
        throw new IOException("Invalid readLength");
    }
}

