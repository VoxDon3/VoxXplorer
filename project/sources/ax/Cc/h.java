package ax.Cc;

import ax.Dc.L;
import ax.Dc.M;
import ax.Kc.n;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class h {
    static final L a = M.a(null);
    static final L b = new a();

    static class a implements L {
        a() {
        }

        @Override // ax.Dc.L
        public String a(byte[] bArr) {
            StringBuilder sb = new StringBuilder(bArr.length);
            for (byte b : bArr) {
                if (b == 0) {
                    break;
                }
                sb.append((char) (b & 255));
            }
            return sb.toString();
        }

        @Override // ax.Dc.L
        public ByteBuffer b(String str) {
            int length = str.length();
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr[i] = (byte) str.charAt(i);
            }
            return ByteBuffer.wrap(bArr);
        }

        @Override // ax.Dc.L
        public boolean c(String str) {
            return true;
        }
    }

    private static String a(byte[] bArr, int i, int i2, int i3, byte b2) {
        return "Invalid byte " + ((int) b2) + " at offset " + (i3 - i) + " in '" + new String(bArr, i, i2).replace("\u0000", "{NUL}") + "' len=" + i2;
    }

    private static long b(byte[] bArr, int i, int i2, boolean z) {
        int i3 = i2 - 1;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i + 1, bArr2, 0, i3);
        BigInteger bigInteger = new BigInteger(bArr2);
        if (z) {
            bigInteger = bigInteger.add(BigInteger.valueOf(-1L)).not();
        }
        if (bigInteger.bitLength() <= 63) {
            long longValue = bigInteger.longValue();
            return z ? -longValue : longValue;
        }
        throw new IllegalArgumentException("At offset " + i + ", " + i2 + " byte binary number exceeds maximum signed long value");
    }

    private static long c(byte[] bArr, int i, int i2, boolean z) {
        if (i2 >= 9) {
            throw new IllegalArgumentException("At offset " + i + ", " + i2 + " byte binary number exceeds maximum signed long value");
        }
        long j = 0;
        for (int i3 = 1; i3 < i2; i3++) {
            j = (j << 8) + (bArr[i + i3] & 255);
        }
        if (z) {
            j = (j - 1) ^ (((long) Math.pow(2.0d, (i2 - 1) * 8.0d)) - 1);
        }
        return z ? -j : j;
    }

    public static boolean d(byte[] bArr, int i) {
        return bArr[i] == 1;
    }

    protected static List<g> e(String str) throws IOException {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split(",");
        if (split.length % 2 == 1) {
            throw new IOException("Corrupted TAR archive. Bad format in GNU.sparse.map PAX Header");
        }
        for (int i = 0; i < split.length; i += 2) {
            try {
                long parseLong = Long.parseLong(split[i]);
                if (parseLong < 0) {
                    throw new IOException("Corrupted TAR archive. Sparse struct offset contains negative value");
                }
                try {
                    long parseLong2 = Long.parseLong(split[i + 1]);
                    if (parseLong2 < 0) {
                        throw new IOException("Corrupted TAR archive. Sparse struct numbytes contains negative value");
                    }
                    arrayList.add(new g(parseLong, parseLong2));
                } catch (NumberFormatException unused) {
                    throw new IOException("Corrupted TAR archive. Sparse struct numbytes contains a non-numeric value");
                }
            } catch (NumberFormatException unused2) {
                throw new IOException("Corrupted TAR archive. Sparse struct offset contains a non-numeric value");
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static String f(byte[] bArr, int i, int i2) {
        try {
            try {
                return g(bArr, i, i2, a);
            } catch (IOException unused) {
                return g(bArr, i, i2, b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String g(byte[] bArr, int i, int i2, L l) throws IOException {
        int i3 = 0;
        for (int i4 = i; i3 < i2 && bArr[i4] != 0; i4++) {
            i3++;
        }
        if (i3 <= 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return l.a(bArr2);
    }

    public static long h(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        if (i2 < 2) {
            throw new IllegalArgumentException("Length " + i2 + " must be at least 2");
        }
        long j = 0;
        if (bArr[i] == 0) {
            return 0L;
        }
        int i4 = i;
        while (i4 < i3 && bArr[i4] == 32) {
            i4++;
        }
        byte b2 = bArr[i3 - 1];
        while (i4 < i3 && (b2 == 0 || b2 == 32)) {
            b2 = bArr[i3 - 2];
            i3--;
        }
        while (i4 < i3) {
            byte b3 = bArr[i4];
            if (b3 < 48 || b3 > 55) {
                throw new IllegalArgumentException(a(bArr, i, i2, i4, b3));
            }
            j = (j << 3) + (b3 - 48);
            i4++;
        }
        return j;
    }

    public static long i(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i];
        if ((b2 & 128) == 0) {
            return h(bArr, i, i2);
        }
        boolean z = b2 == -1;
        return i2 < 9 ? c(bArr, i, i2, z) : b(bArr, i, i2, z);
    }

    protected static List<g> j(InputStream inputStream, int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        long[] m = m(inputStream);
        long j = m[0];
        if (j < 0) {
            throw new IOException("Corrupted TAR archive. Negative value in sparse headers block");
        }
        long j2 = m[1];
        while (true) {
            long j3 = j - 1;
            if (j <= 0) {
                long j4 = i;
                n.i(inputStream, j4 - (j2 % j4));
                return arrayList;
            }
            long[] m2 = m(inputStream);
            long j5 = m2[0];
            if (j5 < 0) {
                throw new IOException("Corrupted TAR archive. Sparse header block offset contains negative value");
            }
            long j6 = j2 + m2[1];
            long[] m3 = m(inputStream);
            long j7 = m3[0];
            if (j7 < 0) {
                throw new IOException("Corrupted TAR archive. Sparse header block numbytes contains negative value");
            }
            j2 = j6 + m3[1];
            arrayList.add(new g(j5, j7));
            j = j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0159, code lost:
    
        throw new java.io.IOException("Failed to read Paxheader. Encountered a non-number while reading length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0108, code lost:
    
        r2 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static java.util.Map<java.lang.String, java.lang.String> k(java.io.InputStream r18, java.util.List<ax.Cc.g> r19, java.util.Map<java.lang.String, java.lang.String> r20, long r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Cc.h.k(java.io.InputStream, java.util.List, java.util.Map, long):java.util.Map");
    }

    public static g l(byte[] bArr, int i) {
        return new g(i(bArr, i, 12), i(bArr, i + 12, 12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        throw new java.io.IOException("Corrupted TAR archive. Non-numeric value in sparse headers block");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long[] m(java.io.InputStream r9) throws java.io.IOException {
        /*
            r0 = 48
            r1 = 0
            r3 = r1
        L5:
            int r5 = r9.read()
            r6 = 10
            r7 = 1
            if (r5 == r6) goto L31
            long r1 = r1 + r7
            r6 = -1
            if (r5 == r6) goto L29
            if (r5 < r0) goto L21
            r6 = 57
            if (r5 > r6) goto L21
            r6 = 10
            long r3 = r3 * r6
            int r5 = r5 - r0
            long r5 = (long) r5
            long r3 = r3 + r5
            goto L5
        L21:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Corrupted TAR archive. Non-numeric value in sparse headers block"
            r9.<init>(r0)
            throw r9
        L29:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Unexpected EOF when reading parse information of 1.X PAX format"
            r9.<init>(r0)
            throw r9
        L31:
            long r1 = r1 + r7
            r9 = 2
            long[] r9 = new long[r9]
            r0 = 0
            r9[r0] = r3
            r0 = 1
            r9[r0] = r1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Cc.h.m(java.io.InputStream):long[]");
    }

    static List<g> n(byte[] bArr, int i, int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            try {
                g l = l(bArr, (i3 * 24) + i);
                if (l.b() < 0) {
                    throw new IOException("Corrupted TAR archive, sparse entry with negative offset");
                }
                if (l.a() < 0) {
                    throw new IOException("Corrupted TAR archive, sparse entry with negative numbytes");
                }
                arrayList.add(l);
            } catch (IllegalArgumentException e) {
                throw new IOException("Corrupted TAR archive, sparse entry is invalid", e);
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean o(byte[] bArr) {
        long h = h(bArr, 148, 8);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            if (148 <= i && i < 156) {
                b2 = 32;
            }
            j += b2 & 255;
            j2 += b2;
        }
        return h == j || h == j2;
    }
}
