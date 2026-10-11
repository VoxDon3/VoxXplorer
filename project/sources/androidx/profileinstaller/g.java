package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
class g {
    static final byte[] a = {112, 114, 111, 0};
    static final byte[] b = {112, 114, 109, 0};

    private static void A(byte[] bArr, int i, int i2, c cVar) {
        int m = m(i, i2, cVar.g);
        int i3 = m / 8;
        bArr[i3] = (byte) ((1 << (m % 8)) | bArr[i3]);
    }

    private static void B(InputStream inputStream) throws IOException {
        d.h(inputStream);
        int j = d.j(inputStream);
        if (j == 6 || j == 7) {
            return;
        }
        while (j > 0) {
            d.j(inputStream);
            for (int j2 = d.j(inputStream); j2 > 0; j2--) {
                d.h(inputStream);
            }
            j--;
        }
    }

    static boolean C(OutputStream outputStream, byte[] bArr, c[] cVarArr) throws IOException {
        if (Arrays.equals(bArr, i.a)) {
            P(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i.b)) {
            O(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i.d)) {
            M(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, i.c)) {
            N(outputStream, cVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, i.e)) {
            return false;
        }
        L(outputStream, cVarArr);
        return true;
    }

    private static void D(OutputStream outputStream, c cVar) throws IOException {
        int[] iArr = cVar.h;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            d.p(outputStream, i3 - i2);
            i++;
            i2 = i3;
        }
    }

    private static j E(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            d.p(byteArrayOutputStream, cVarArr.length);
            int i = 2;
            for (c cVar : cVarArr) {
                d.q(byteArrayOutputStream, cVar.c);
                d.q(byteArrayOutputStream, cVar.d);
                d.q(byteArrayOutputStream, cVar.g);
                String j = j(cVar.a, cVar.b, i.a);
                int k = d.k(j);
                d.p(byteArrayOutputStream, k);
                i = i + 14 + k;
                d.n(byteArrayOutputStream, j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                j jVar = new j(e.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return jVar;
            }
            throw d.c("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static void F(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(a);
        outputStream.write(bArr);
    }

    private static void G(OutputStream outputStream, c cVar) throws IOException {
        K(outputStream, cVar);
        D(outputStream, cVar);
        I(outputStream, cVar);
    }

    private static void H(OutputStream outputStream, c cVar, String str) throws IOException {
        d.p(outputStream, d.k(str));
        d.p(outputStream, cVar.e);
        d.q(outputStream, cVar.f);
        d.q(outputStream, cVar.c);
        d.q(outputStream, cVar.g);
        d.n(outputStream, str);
    }

    private static void I(OutputStream outputStream, c cVar) throws IOException {
        byte[] bArr = new byte[k(cVar.g)];
        for (Map.Entry<Integer, Integer> entry : cVar.i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                A(bArr, 2, intValue, cVar);
            }
            if ((intValue2 & 4) != 0) {
                A(bArr, 4, intValue, cVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void J(OutputStream outputStream, int i, c cVar) throws IOException {
        byte[] bArr = new byte[l(i, cVar.g)];
        for (Map.Entry<Integer, Integer> entry : cVar.i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int i2 = 0;
            for (int i3 = 1; i3 <= 4; i3 <<= 1) {
                if (i3 != 1 && (i3 & i) != 0) {
                    if ((i3 & intValue2) == i3) {
                        int i4 = (cVar.g * i2) + intValue;
                        int i5 = i4 / 8;
                        bArr[i5] = (byte) ((1 << (i4 % 8)) | bArr[i5]);
                    }
                    i2++;
                }
            }
        }
        outputStream.write(bArr);
    }

    private static void K(OutputStream outputStream, c cVar) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : cVar.i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                d.p(outputStream, intValue - i);
                d.p(outputStream, 0);
                i = intValue;
            }
        }
    }

    private static void L(OutputStream outputStream, c[] cVarArr) throws IOException {
        d.p(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            String j = j(cVar.a, cVar.b, i.e);
            d.p(outputStream, d.k(j));
            d.p(outputStream, cVar.i.size());
            d.p(outputStream, cVar.h.length);
            d.q(outputStream, cVar.c);
            d.n(outputStream, j);
            Iterator<Integer> it = cVar.i.keySet().iterator();
            while (it.hasNext()) {
                d.p(outputStream, it.next().intValue());
            }
            for (int i : cVar.h) {
                d.p(outputStream, i);
            }
        }
    }

    private static void M(OutputStream outputStream, c[] cVarArr) throws IOException {
        d.r(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            int size = cVar.i.size() * 4;
            String j = j(cVar.a, cVar.b, i.d);
            d.p(outputStream, d.k(j));
            d.p(outputStream, cVar.h.length);
            d.q(outputStream, size);
            d.q(outputStream, cVar.c);
            d.n(outputStream, j);
            Iterator<Integer> it = cVar.i.keySet().iterator();
            while (it.hasNext()) {
                d.p(outputStream, it.next().intValue());
                d.p(outputStream, 0);
            }
            for (int i : cVar.h) {
                d.p(outputStream, i);
            }
        }
    }

    private static void N(OutputStream outputStream, c[] cVarArr) throws IOException {
        byte[] b2 = b(cVarArr, i.c);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, b2);
    }

    private static void O(OutputStream outputStream, c[] cVarArr) throws IOException {
        byte[] b2 = b(cVarArr, i.b);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, b2);
    }

    private static void P(OutputStream outputStream, c[] cVarArr) throws IOException {
        Q(outputStream, cVarArr);
    }

    private static void Q(OutputStream outputStream, c[] cVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(E(cVarArr));
        arrayList.add(c(cVarArr));
        arrayList.add(d(cVarArr));
        long length2 = i.a.length + a.length + 4 + (arrayList.size() * 16);
        d.q(outputStream, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            j jVar = (j) arrayList.get(i);
            d.q(outputStream, jVar.a.h());
            d.q(outputStream, length2);
            if (jVar.d) {
                byte[] bArr = jVar.c;
                long length3 = bArr.length;
                byte[] b2 = d.b(bArr);
                arrayList2.add(b2);
                d.q(outputStream, b2.length);
                d.q(outputStream, length3);
                length = b2.length;
            } else {
                arrayList2.add(jVar.c);
                d.q(outputStream, jVar.c.length);
                d.q(outputStream, 0L);
                length = jVar.c.length;
            }
            length2 += length;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            outputStream.write((byte[]) arrayList2.get(i2));
        }
    }

    private static int a(c cVar) {
        Iterator<Map.Entry<Integer, Integer>> it = cVar.i.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= it.next().getValue().intValue();
        }
        return i;
    }

    private static byte[] b(c[] cVarArr, byte[] bArr) throws IOException {
        int i = 0;
        int i2 = 0;
        for (c cVar : cVarArr) {
            i2 += d.k(j(cVar.a, cVar.b, bArr)) + 16 + (cVar.e * 2) + cVar.f + k(cVar.g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, i.c)) {
            int length = cVarArr.length;
            while (i < length) {
                c cVar2 = cVarArr[i];
                H(byteArrayOutputStream, cVar2, j(cVar2.a, cVar2.b, bArr));
                G(byteArrayOutputStream, cVar2);
                i++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                H(byteArrayOutputStream, cVar3, j(cVar3.a, cVar3.b, bArr));
            }
            int length2 = cVarArr.length;
            while (i < length2) {
                G(byteArrayOutputStream, cVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw d.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    private static j c(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < cVarArr.length; i2++) {
            try {
                c cVar = cVarArr[i2];
                d.p(byteArrayOutputStream, i2);
                d.p(byteArrayOutputStream, cVar.e);
                i = i + 4 + (cVar.e * 2);
                D(byteArrayOutputStream, cVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            j jVar = new j(e.CLASSES, i, byteArray, true);
            byteArrayOutputStream.close();
            return jVar;
        }
        throw d.c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    private static j d(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < cVarArr.length; i2++) {
            try {
                c cVar = cVarArr[i2];
                int a2 = a(cVar);
                byte[] e = e(a2, cVar);
                byte[] f = f(cVar);
                d.p(byteArrayOutputStream, i2);
                int length = e.length + 2 + f.length;
                d.q(byteArrayOutputStream, length);
                d.p(byteArrayOutputStream, a2);
                byteArrayOutputStream.write(e);
                byteArrayOutputStream.write(f);
                i = i + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            j jVar = new j(e.METHODS, i, byteArray, true);
            byteArrayOutputStream.close();
            return jVar;
        }
        throw d.c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(int i, c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            J(byteArrayOutputStream, i, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] f(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            K(byteArrayOutputStream, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    private static String h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    private static c i(c[] cVarArr, String str) {
        if (cVarArr.length <= 0) {
            return null;
        }
        String h = h(str);
        for (int i = 0; i < cVarArr.length; i++) {
            if (cVarArr[i].b.equals(h)) {
                return cVarArr[i];
            }
        }
        return null;
    }

    private static String j(String str, String str2, byte[] bArr) {
        String a2 = i.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a2);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, a2);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + i.a(bArr) + str2;
    }

    private static int k(int i) {
        return z(i * 2) / 8;
    }

    private static int l(int i, int i2) {
        return z(Integer.bitCount(i & (-2)) * i2) / 8;
    }

    private static int m(int i, int i2, int i3) {
        if (i == 1) {
            throw d.c("HOT methods are not stored in the bitmap");
        }
        if (i == 2) {
            return i2;
        }
        if (i == 4) {
            return i2 + i3;
        }
        throw d.c("Unexpected flag: " + i);
    }

    private static int[] n(InputStream inputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += d.h(inputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    private static int o(BitSet bitSet, int i, int i2) {
        int i3 = bitSet.get(m(2, i, i2)) ? 2 : 0;
        return bitSet.get(m(4, i, i2)) ? i3 | 4 : i3;
    }

    static byte[] p(InputStream inputStream, byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, d.d(inputStream, bArr.length))) {
            return d.d(inputStream, i.b.length);
        }
        throw d.c("Invalid magic");
    }

    private static void q(InputStream inputStream, c cVar) throws IOException {
        int available = inputStream.available() - cVar.f;
        int i = 0;
        while (inputStream.available() > available) {
            i += d.h(inputStream);
            cVar.i.put(Integer.valueOf(i), 1);
            for (int h = d.h(inputStream); h > 0; h--) {
                B(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw d.c("Read too much data during profile line parse");
        }
    }

    static c[] r(InputStream inputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) throws IOException {
        if (Arrays.equals(bArr, i.f)) {
            if (Arrays.equals(i.a, bArr2)) {
                throw d.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return s(inputStream, bArr, cVarArr);
        }
        if (Arrays.equals(bArr, i.g)) {
            return u(inputStream, bArr2, cVarArr);
        }
        throw d.c("Unsupported meta version");
    }

    static c[] s(InputStream inputStream, byte[] bArr, c[] cVarArr) throws IOException {
        if (!Arrays.equals(bArr, i.f)) {
            throw d.c("Unsupported meta version");
        }
        int j = d.j(inputStream);
        byte[] e = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
        try {
            c[] t = t(byteArrayInputStream, j, cVarArr);
            byteArrayInputStream.close();
            return t;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static c[] t(InputStream inputStream, int i, c[] cVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i != cVarArr.length) {
            throw d.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int h = d.h(inputStream);
            iArr[i2] = d.h(inputStream);
            strArr[i2] = d.f(inputStream, h);
        }
        for (int i3 = 0; i3 < i; i3++) {
            c cVar = cVarArr[i3];
            if (!cVar.b.equals(strArr[i3])) {
                throw d.c("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            cVar.e = i4;
            cVar.h = n(inputStream, i4);
        }
        return cVarArr;
    }

    static c[] u(InputStream inputStream, byte[] bArr, c[] cVarArr) throws IOException {
        int h = d.h(inputStream);
        byte[] e = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
        try {
            c[] v = v(byteArrayInputStream, bArr, h, cVarArr);
            byteArrayInputStream.close();
            return v;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static c[] v(InputStream inputStream, byte[] bArr, int i, c[] cVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i != cVarArr.length) {
            throw d.c("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            d.h(inputStream);
            String f = d.f(inputStream, d.h(inputStream));
            long i3 = d.i(inputStream);
            int h = d.h(inputStream);
            c i4 = i(cVarArr, f);
            if (i4 == null) {
                throw d.c("Missing profile key: " + f);
            }
            i4.d = i3;
            int[] n = n(inputStream, h);
            if (Arrays.equals(bArr, i.e)) {
                i4.e = h;
                i4.h = n;
            }
        }
        return cVarArr;
    }

    private static void w(InputStream inputStream, c cVar) throws IOException {
        BitSet valueOf = BitSet.valueOf(d.d(inputStream, d.a(cVar.g * 2)));
        int i = 0;
        while (true) {
            int i2 = cVar.g;
            if (i >= i2) {
                return;
            }
            int o = o(valueOf, i, i2);
            if (o != 0) {
                Integer num = cVar.i.get(Integer.valueOf(i));
                if (num == null) {
                    num = 0;
                }
                cVar.i.put(Integer.valueOf(i), Integer.valueOf(o | num.intValue()));
            }
            i++;
        }
    }

    static c[] x(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, i.b)) {
            throw d.c("Unsupported version");
        }
        int j = d.j(inputStream);
        byte[] e = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
        try {
            c[] y = y(byteArrayInputStream, str, j);
            byteArrayInputStream.close();
            return y;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static c[] y(InputStream inputStream, String str, int i) throws IOException {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i];
        for (int i2 = 0; i2 < i; i2++) {
            int h = d.h(inputStream);
            int h2 = d.h(inputStream);
            long i3 = d.i(inputStream);
            cVarArr[i2] = new c(str, d.f(inputStream, h), d.i(inputStream), 0L, h2, (int) i3, (int) d.i(inputStream), new int[h2], new TreeMap());
        }
        for (int i4 = 0; i4 < i; i4++) {
            c cVar = cVarArr[i4];
            q(inputStream, cVar);
            cVar.h = n(inputStream, cVar.e);
            w(inputStream, cVar);
        }
        return cVarArr;
    }

    private static int z(int i) {
        return (i + 7) & (-8);
    }
}
