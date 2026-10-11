/*
 * Decompiled with CFR 0.152.
 */
package ax.Cc;

import ax.Cc.g;
import ax.Dc.L;
import ax.Dc.M;
import ax.Kc.n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class h {
    static final L a = M.a(null);
    static final L b = new L(){

        @Override
        public String a(byte[] byArray) {
            StringBuilder stringBuilder = new StringBuilder(byArray.length);
            for (byte by : byArray) {
                if (by == 0) break;
                stringBuilder.append((char)(by & 0xFF));
            }
            return stringBuilder.toString();
        }

        @Override
        public ByteBuffer b(String string) {
            int n8 = string.length();
            byte[] byArray = new byte[n8];
            for (int i8 = 0; i8 < n8; ++i8) {
                byArray[i8] = (byte)string.charAt(i8);
            }
            return ByteBuffer.wrap(byArray);
        }

        @Override
        public boolean c(String string) {
            return true;
        }
    };

    private static String a(byte[] object, int n8, int n9, int n10, byte by) {
        object = new String((byte[])object, n8, n9).replace("\u0000", "{NUL}");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid byte ");
        stringBuilder.append(by);
        stringBuilder.append(" at offset ");
        stringBuilder.append(n10 - n8);
        stringBuilder.append(" in '");
        stringBuilder.append((String)object);
        stringBuilder.append("' len=");
        stringBuilder.append(n9);
        return stringBuilder.toString();
    }

    private static long b(byte[] object, int n8, int n9, boolean bl) {
        int n10 = n9 - 1;
        Object object2 = new byte[n10];
        System.arraycopy(object, n8 + 1, object2, 0, n10);
        object = object2 = (Object)new BigInteger((byte[])object2);
        if (bl) {
            object = ((BigInteger)object2).add(BigInteger.valueOf(-1L)).not();
        }
        if (((BigInteger)object).bitLength() <= 63) {
            long l8;
            long l9 = l8 = ((BigInteger)object).longValue();
            if (bl) {
                l9 = -l8;
            }
            return l9;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("At offset ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(", ");
        ((StringBuilder)object).append(n9);
        ((StringBuilder)object).append(" byte binary number exceeds maximum signed long value");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    private static long c(byte[] object, int n8, int n9, boolean bl) {
        if (n9 < 9) {
            long l8 = 0L;
            for (int i8 = 1; i8 < n9; ++i8) {
                l8 = (l8 << 8) + (long)(object[n8 + i8] & 0xFF);
            }
            long l9 = l8;
            if (bl) {
                l9 = l8 - 1L ^ (long)Math.pow(2.0, (double)(n9 - 1) * 8.0) - 1L;
            }
            if (bl) {
                return -l9;
            }
            return l9;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("At offset ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(", ");
        ((StringBuilder)object).append(n9);
        ((StringBuilder)object).append(" byte binary number exceeds maximum signed long value");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public static boolean d(byte[] byArray, int n8) {
        return byArray[n8] == 1;
    }

    protected static List<g> e(String stringArray) throws IOException {
        ArrayList<g> arrayList = new ArrayList<g>();
        if ((stringArray = stringArray.split(",")).length % 2 != 1) {
            for (int i8 = 0; i8 < stringArray.length; i8 += 2) {
                block6: {
                    block7: {
                        long l8;
                        long l9;
                        try {
                            l9 = Long.parseLong(stringArray[i8]);
                            if (l9 < 0L) break block6;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw new IOException("Corrupted TAR archive. Sparse struct offset contains a non-numeric value");
                        }
                        try {
                            l8 = Long.parseLong(stringArray[i8 + 1]);
                            if (l8 < 0L) break block7;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw new IOException("Corrupted TAR archive. Sparse struct numbytes contains a non-numeric value");
                        }
                        arrayList.add(new g(l9, l8));
                        continue;
                    }
                    throw new IOException("Corrupted TAR archive. Sparse struct numbytes contains negative value");
                }
                throw new IOException("Corrupted TAR archive. Sparse struct offset contains negative value");
            }
            return java.util.DesugarCollections.unmodifiableList(arrayList);
        }
        throw new IOException("Corrupted TAR archive. Bad format in GNU.sparse.map PAX Header");
    }

    public static String f(byte[] object, int n8, int n9) {
        try {
            String string = h.g(object, n8, n9, a);
            return string;
        }
        catch (IOException iOException) {
            try {
                object = h.g(object, n8, n9, b);
                return object;
            }
            catch (IOException iOException2) {
                throw new RuntimeException(iOException2);
            }
        }
    }

    public static String g(byte[] byArray, int n8, int n9, L l8) throws IOException {
        int n10 = n8;
        int n11 = 0;
        while (n11 < n9 && byArray[n10] != 0) {
            ++n11;
            ++n10;
        }
        if (n11 > 0) {
            byte[] byArray2 = new byte[n11];
            System.arraycopy(byArray, n8, byArray2, 0, n11);
            return l8.a(byArray2);
        }
        return "";
    }

    public static long h(byte[] object, int n8, int n9) {
        int n10 = n8 + n9;
        if (n9 >= 2) {
            long l8;
            int n11;
            int n12 = object[n8];
            long l9 = 0L;
            if (n12 == 0) {
                return 0L;
            }
            for (n12 = n8; n12 < n10 && object[n12] == 32; ++n12) {
            }
            Object object2 = object[n10 - 1];
            while (true) {
                n11 = n12;
                l8 = l9;
                if (n12 >= n10) break;
                if (object2 != false) {
                    n11 = n12;
                    l8 = l9;
                    if (object2 != 32) break;
                }
                object2 = object[n10 - 2];
                --n10;
            }
            while (n11 < n10) {
                Object object3 = object[n11];
                if (object3 >= 48 && object3 <= 55) {
                    l8 = (l8 << 3) + (long)(object3 - 48);
                    ++n11;
                    continue;
                }
                throw new IllegalArgumentException(h.a((byte[])object, n8, n9, n11, (byte)object3));
            }
            return l8;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Length ");
        ((StringBuilder)object).append(n9);
        ((StringBuilder)object).append(" must be at least 2");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public static long i(byte[] byArray, int n8, int n9) {
        byte by = byArray[n8];
        if ((by & 0x80) == 0) {
            return h.h(byArray, n8, n9);
        }
        boolean bl = by == -1;
        if (n9 < 9) {
            return h.c(byArray, n8, n9, bl);
        }
        return h.b(byArray, n8, n9, bl);
    }

    protected static List<g> j(InputStream inputStream, int n8) throws IOException {
        ArrayList<g> arrayList = new ArrayList<g>();
        long[] lArray = h.m(inputStream);
        long l8 = lArray[0];
        if (l8 >= 0L) {
            long l9 = lArray[1];
            while (l8 > 0L) {
                lArray = h.m(inputStream);
                long l10 = lArray[0];
                if (l10 >= 0L) {
                    long l11 = lArray[1];
                    lArray = h.m(inputStream);
                    long l12 = lArray[0];
                    if (l12 >= 0L) {
                        l9 = l9 + l11 + lArray[1];
                        arrayList.add(new g(l10, l12));
                        --l8;
                        continue;
                    }
                    throw new IOException("Corrupted TAR archive. Sparse header block numbytes contains negative value");
                }
                throw new IOException("Corrupted TAR archive. Sparse header block offset contains negative value");
            }
            l8 = n8;
            n.i(inputStream, l8 - l9 % l8);
            return arrayList;
        }
        throw new IOException("Corrupted TAR archive. Negative value in sparse headers block");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected static Map<String, String> k(InputStream object, List<g> list, Map<String, String> map, long l8) throws IOException {
        int n8;
        HashMap<String, String> hashMap = new HashMap<String, String>(map);
        int n9 = 0;
        map = null;
        block4: do {
            int n10 = 0;
            int n11 = 0;
            while ((n8 = ((InputStream)object).read()) != -1) {
                ++n10;
                ++n9;
                if (n8 == 10) continue block4;
                if (n8 != 32) {
                    if (n8 >= 48 && n8 <= 57) {
                        n11 = n11 * 10 + (n8 - 48);
                        continue;
                    }
                    throw new IOException("Failed to read Paxheader. Encountered a non-number while reading length");
                }
                Object object2 = new ByteArrayOutputStream();
                n8 = n9;
                while (true) {
                    int n12;
                    block22: {
                        block20: {
                            String string;
                            block23: {
                                block21: {
                                    n12 = ((InputStream)object).read();
                                    n9 = n8++;
                                    if (n12 == -1) break block20;
                                    ++n10;
                                    n9 = n8;
                                    if (n8 < 0) break block20;
                                    long l9 = l8 - 0L;
                                    n9 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
                                    if (n9 >= 0 && (long)n8 >= l8) break block21;
                                    if (n12 != 61) break block22;
                                    string = ((ByteArrayOutputStream)object2).toString("UTF-8");
                                    if ((n11 -= n10) > 1) break block23;
                                    hashMap.remove(string);
                                }
                                n9 = n8;
                                break block20;
                            }
                            if (n9 >= 0 && (long)n11 > l8 - (long)n8) {
                                object = new StringBuilder();
                                ((StringBuilder)object).append("Paxheader value size ");
                                ((StringBuilder)object).append(n11);
                                ((StringBuilder)object).append(" exceeds size of header record");
                                throw new IOException(((StringBuilder)object).toString());
                            }
                            object2 = n.g((InputStream)object, n11);
                            n9 = ((Object)object2).length;
                            if (n9 != n11) {
                                object = new StringBuilder();
                                ((StringBuilder)object).append("Failed to read Paxheader. Expected ");
                                ((StringBuilder)object).append(n11);
                                ((StringBuilder)object).append(" bytes, read ");
                                ((StringBuilder)object).append(n9);
                                throw new IOException(((StringBuilder)object).toString());
                            }
                            n8 += n11;
                            n9 = n11 - 1;
                            if (object2[n9] != 10) {
                                throw new IOException("Failed to read Paxheader.Value should end with a newline");
                            }
                            String string2 = new String((byte[])object2, 0, n9, StandardCharsets.UTF_8);
                            hashMap.put(string, string2);
                            object2 = map;
                            if (string.equals("GNU.sparse.offset")) {
                                if (map != null) {
                                    list.add(new g((Long)((Object)map), 0L));
                                }
                                try {
                                    object2 = Long.valueOf(string2);
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw new IOException("Failed to read Paxheader.GNU.sparse.offset contains a non-numeric value");
                                }
                                if ((Long)object2 < 0L) {
                                    throw new IOException("Failed to read Paxheader.GNU.sparse.offset contains negative value");
                                }
                            }
                            n9 = n8;
                            map = object2;
                            if (string.equals("GNU.sparse.numbytes")) {
                                block19: {
                                    long l10;
                                    if (object2 == null) {
                                        throw new IOException("Failed to read Paxheader.GNU.sparse.offset is expected before GNU.sparse.numbytes shows up.");
                                    }
                                    try {
                                        l10 = Long.parseLong(string2);
                                        if (l10 < 0L) break block19;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw new IOException("Failed to read Paxheader.GNU.sparse.numbytes contains a non-numeric value.");
                                    }
                                    list.add(new g((Long)object2, l10));
                                    map = null;
                                    n9 = n8;
                                    break block20;
                                }
                                throw new IOException("Failed to read Paxheader.GNU.sparse.numbytes contains negative value");
                            }
                        }
                        n8 = n12;
                        continue block4;
                    }
                    ((ByteArrayOutputStream)object2).write((byte)n12);
                }
            }
        } while (n8 != -1);
        if (map != null) {
            list.add(new g((Long)((Object)map), 0L));
        }
        return hashMap;
    }

    public static g l(byte[] byArray, int n8) {
        return new g(h.i(byArray, n8, 12), h.i(byArray, n8 + 12, 12));
    }

    private static long[] m(InputStream inputStream) throws IOException {
        int n8;
        long l8 = 0L;
        long l9 = 0L;
        while ((n8 = inputStream.read()) != 10) {
            ++l8;
            if (n8 != -1) {
                if (n8 >= 48 && n8 <= 57) {
                    l9 = l9 * 10L + (long)(n8 - 48);
                    continue;
                }
                throw new IOException("Corrupted TAR archive. Non-numeric value in sparse headers block");
            }
            throw new IOException("Unexpected EOF when reading parse information of 1.X PAX format");
        }
        return new long[]{l9, l8 + 1L};
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static List<g> n(byte[] var0, int var1_2, int var2_3) throws IOException {
        var4_4 = new ArrayList<g>();
        for (var3_5 = 0; var3_5 < var2_3; ++var3_5) {
            block4: {
                try {
                    var5_6 = h.l(var0 /* !! */ , var3_5 * 24 + var1_2);
                    if (var5_6.b() < 0L) ** GOTO lbl17
                    if (var5_6.a() < 0L) break block4;
                    var4_4.add(var5_6);
                    continue;
                }
                catch (IllegalArgumentException var0_1) {
                    throw new IOException("Corrupted TAR archive, sparse entry is invalid", var0_1);
                }
            }
            var0 /* !! */  = (byte[])new IOException;
            var0 /* !! */ ("Corrupted TAR archive, sparse entry with negative numbytes");
            throw var0 /* !! */ ;
lbl17:
            // 1 sources

            var0 /* !! */  = (byte[])new IOException;
            var0 /* !! */ ("Corrupted TAR archive, sparse entry with negative offset");
            throw var0 /* !! */ ;
        }
        return java.util.DesugarCollections.unmodifiableList(var4_4);
    }

    public static boolean o(byte[] byArray) {
        long l8 = h.h(byArray, 148, 8);
        long l9 = 0L;
        long l10 = 0L;
        for (int i8 = 0; i8 < byArray.length; ++i8) {
            int n8;
            int n9 = n8 = byArray[i8];
            if (148 <= i8) {
                n9 = n8;
                if (i8 < 156) {
                    n9 = 32;
                }
            }
            l9 += (long)(n9 & 0xFF);
            l10 += (long)n9;
        }
        return l8 == l9 || l8 == l10;
        {
        }
    }
}

