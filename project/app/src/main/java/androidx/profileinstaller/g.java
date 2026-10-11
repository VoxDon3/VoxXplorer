/*
 * Decompiled with CFR 0.152.
 */
package androidx.profileinstaller;

import androidx.profileinstaller.c;
import androidx.profileinstaller.d;
import androidx.profileinstaller.e;
import androidx.profileinstaller.i;
import androidx.profileinstaller.j;
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

class g {
    static final byte[] a = new byte[]{112, 114, 111, 0};
    static final byte[] b = new byte[]{112, 114, 109, 0};

    private static void A(byte[] byArray, int n8, int n9, c c8) {
        n8 = g.m(n8, n9, c8.g);
        n9 = n8 / 8;
        byArray[n9] = (byte)(1 << n8 % 8 | byArray[n9]);
    }

    private static void B(InputStream inputStream) throws IOException {
        d.h(inputStream);
        int n8 = d.j(inputStream);
        if (n8 != 6) {
            if (n8 != 7) {
                for (int i8 = n8; i8 > 0; --i8) {
                    d.j(inputStream);
                    for (n8 = d.j(inputStream); n8 > 0; --n8) {
                        d.h(inputStream);
                    }
                }
            }
        }
    }

    static boolean C(OutputStream outputStream, byte[] byArray, c[] cArray) throws IOException {
        if (Arrays.equals(byArray, i.a)) {
            g.P(outputStream, cArray);
            return true;
        }
        if (Arrays.equals(byArray, i.b)) {
            g.O(outputStream, cArray);
            return true;
        }
        if (Arrays.equals(byArray, i.d)) {
            g.M(outputStream, cArray);
            return true;
        }
        if (Arrays.equals(byArray, i.c)) {
            g.N(outputStream, cArray);
            return true;
        }
        if (Arrays.equals(byArray, i.e)) {
            g.L(outputStream, cArray);
            return true;
        }
        return false;
    }

    private static void D(OutputStream outputStream, c object) throws IOException {
        object = ((c)object).h;
        int n8 = ((Object)object).length;
        Object object2 = false;
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object3 = object[i8];
            d.p(outputStream, (int)(object3 - object2));
            object2 = object3;
        }
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static j E(c[] object) throws IOException {
        Throwable throwable2;
        Object object2;
        int n8;
        ByteArrayOutputStream byteArrayOutputStream;
        block7: {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                d.p(byteArrayOutputStream, ((Object)object).length);
                n8 = 2;
                for (int i8 = 0; i8 < ((Object)object).length; ++i8) {
                    object2 = object[i8];
                    d.q(byteArrayOutputStream, ((c)object2).c);
                    d.q(byteArrayOutputStream, ((c)object2).d);
                    d.q(byteArrayOutputStream, ((c)object2).g);
                    object2 = g.j(((c)object2).a, ((c)object2).b, i.a);
                    int n9 = d.k((String)object2);
                    d.p(byteArrayOutputStream, n9);
                    n8 = n8 + 14 + n9;
                    d.n(byteArrayOutputStream, (String)object2);
                }
                object2 = byteArrayOutputStream.toByteArray();
                if (n8 != ((Object)object2).length) break block7;
                object = new j(e.c0, n8, (byte[])object2, false);
            }
            catch (Throwable throwable2) {}
            byteArrayOutputStream.close();
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Expected size ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(", does not match actual size ");
        ((StringBuilder)object).append(((Object)object2).length);
        throw d.c(((StringBuilder)object).toString());
        try {
            byteArrayOutputStream.close();
            throw throwable2;
        }
        catch (Throwable throwable3) {
            throwable2.addSuppressed(throwable3);
        }
        throw throwable2;
    }

    static void F(OutputStream outputStream, byte[] byArray) throws IOException {
        outputStream.write(a);
        outputStream.write(byArray);
    }

    private static void G(OutputStream outputStream, c c8) throws IOException {
        g.K(outputStream, c8);
        g.D(outputStream, c8);
        g.I(outputStream, c8);
    }

    private static void H(OutputStream outputStream, c c8, String string) throws IOException {
        d.p(outputStream, d.k(string));
        d.p(outputStream, c8.e);
        d.q(outputStream, c8.f);
        d.q(outputStream, c8.c);
        d.q(outputStream, c8.g);
        d.n(outputStream, string);
    }

    private static void I(OutputStream outputStream, c c8) throws IOException {
        byte[] byArray = new byte[g.k(c8.g)];
        for (Map.Entry<Integer, Integer> entry : c8.i.entrySet()) {
            int n8 = entry.getKey();
            int n9 = entry.getValue();
            if ((n9 & 2) != 0) {
                g.A(byArray, 2, n8, c8);
            }
            if ((n9 & 4) == 0) continue;
            g.A(byArray, 4, n8, c8);
        }
        outputStream.write(byArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void J(OutputStream outputStream, int n8, c c8) throws IOException {
        byte[] byArray = new byte[g.l(n8, c8.g)];
        Iterator<Map.Entry<Integer, Integer>> iterator = c8.i.entrySet().iterator();
        block0: while (true) {
            if (!iterator.hasNext()) {
                outputStream.write(byArray);
                return;
            }
            Map.Entry<Integer, Integer> entry = iterator.next();
            int n9 = entry.getKey();
            int n10 = entry.getValue();
            int n11 = 0;
            int n12 = 1;
            while (true) {
                if (n12 > 4) continue block0;
                if (n12 != 1 && (n12 & n8) != 0) {
                    if ((n12 & n10) == n12) {
                        int n13 = c8.g * n11 + n9;
                        int n14 = n13 / 8;
                        byArray[n14] = (byte)(1 << n13 % 8 | byArray[n14]);
                    }
                    ++n11;
                }
                n12 <<= 1;
            }
            break;
        }
    }

    private static void K(OutputStream outputStream, c object) throws IOException {
        Iterator<Map.Entry<Integer, Integer>> iterator = ((c)object).i.entrySet().iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            object = iterator.next();
            int n9 = (Integer)object.getKey();
            if (((Integer)object.getValue() & 1) == 0) continue;
            d.p(outputStream, n9 - n8);
            d.p(outputStream, 0);
            n8 = n9;
        }
    }

    private static void L(OutputStream outputStream, c[] cArray) throws IOException {
        d.p(outputStream, cArray.length);
        for (c c8 : cArray) {
            Object object = g.j(c8.a, c8.b, i.e);
            d.p(outputStream, d.k((String)object));
            d.p(outputStream, c8.i.size());
            d.p(outputStream, c8.h.length);
            d.q(outputStream, c8.c);
            d.n(outputStream, (String)object);
            object = c8.i.keySet().iterator();
            while (object.hasNext()) {
                d.p(outputStream, (Integer)object.next());
            }
            int[] object2 = c8.h;
            int n8 = object2.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                d.p(outputStream, object2[i8]);
            }
        }
    }

    private static void M(OutputStream outputStream, c[] cArray) throws IOException {
        d.r(outputStream, cArray.length);
        for (c c8 : cArray) {
            int n8 = c8.i.size();
            Object object = g.j(c8.a, c8.b, i.d);
            d.p(outputStream, d.k((String)object));
            d.p(outputStream, c8.h.length);
            d.q(outputStream, n8 * 4);
            d.q(outputStream, c8.c);
            d.n(outputStream, (String)object);
            object = c8.i.keySet().iterator();
            while (object.hasNext()) {
                d.p(outputStream, (Integer)object.next());
                d.p(outputStream, 0);
            }
            int[] object2 = c8.h;
            int n9 = object2.length;
            for (n8 = 0; n8 < n9; ++n8) {
                d.p(outputStream, object2[n8]);
            }
        }
    }

    private static void N(OutputStream outputStream, c[] cArray) throws IOException {
        byte[] byArray = g.b(cArray, i.c);
        d.r(outputStream, cArray.length);
        d.m(outputStream, byArray);
    }

    private static void O(OutputStream outputStream, c[] cArray) throws IOException {
        byte[] byArray = g.b(cArray, i.b);
        d.r(outputStream, cArray.length);
        d.m(outputStream, byArray);
    }

    private static void P(OutputStream outputStream, c[] cArray) throws IOException {
        g.Q(outputStream, cArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void Q(OutputStream outputStream, c[] cArray) throws IOException {
        int n8;
        ArrayList<j> arrayList = new ArrayList<j>(3);
        ArrayList<byte[]> arrayList2 = new ArrayList<byte[]>(3);
        arrayList.add(g.E(cArray));
        arrayList.add(g.c(cArray));
        arrayList.add(g.d(cArray));
        long l8 = (long)i.a.length + (long)a.length + 4L + (long)(arrayList.size() * 16);
        d.q(outputStream, arrayList.size());
        int n9 = 0;
        int n10 = 0;
        while (true) {
            n8 = n9;
            if (n10 >= arrayList.size()) break;
            j j8 = (j)arrayList.get(n10);
            d.q(outputStream, j8.a.h());
            d.q(outputStream, l8);
            if (j8.d) {
                byte[] byArray = j8.c;
                long l9 = byArray.length;
                byte[] byArray2 = d.b(byArray);
                arrayList2.add(byArray2);
                d.q(outputStream, byArray2.length);
                d.q(outputStream, l9);
                n8 = byArray2.length;
            } else {
                arrayList2.add(j8.c);
                d.q(outputStream, j8.c.length);
                d.q(outputStream, 0L);
                n8 = j8.c.length;
            }
            l8 += (long)n8;
            ++n10;
        }
        while (n8 < arrayList2.size()) {
            outputStream.write((byte[])arrayList2.get(n8));
            ++n8;
        }
        return;
    }

    private static int a(c object) {
        object = ((c)object).i.entrySet().iterator();
        int n8 = 0;
        while (object.hasNext()) {
            n8 |= ((Integer)((Map.Entry)object.next()).getValue()).intValue();
        }
        return n8;
    }

    private static byte[] b(c[] object, byte[] byArray) throws IOException {
        Object object2;
        int n8;
        int n9 = ((c[])object).length;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            object2 = object[n8];
            n12 += d.k(g.j(((c)object2).a, ((c)object2).b, byArray)) + 16 + ((c)object2).e * 2 + ((c)object2).f + g.k(((c)object2).g);
        }
        object2 = new ByteArrayOutputStream(n12);
        if (Arrays.equals(byArray, i.c)) {
            n10 = ((c[])object).length;
            for (n8 = n11; n8 < n10; ++n8) {
                c c8 = object[n8];
                g.H((OutputStream)object2, c8, g.j(c8.a, c8.b, byArray));
                g.G((OutputStream)object2, c8);
            }
        } else {
            for (c c9 : object) {
                g.H((OutputStream)object2, c9, g.j(c9.a, c9.b, byArray));
            }
            n11 = ((c[])object).length;
            for (n8 = n10; n8 < n11; ++n8) {
                g.G((OutputStream)object2, (c)object[n8]);
            }
        }
        if (((ByteArrayOutputStream)object2).size() == n12) {
            return ((ByteArrayOutputStream)object2).toByteArray();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("The bytes saved do not match expectation. actual=");
        ((StringBuilder)object).append(((ByteArrayOutputStream)object2).size());
        ((StringBuilder)object).append(" expected=");
        ((StringBuilder)object).append(n12);
        throw d.c(((StringBuilder)object).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static j c(c[] object) throws IOException {
        Throwable throwable2;
        Object object2;
        int n8;
        ByteArrayOutputStream byteArrayOutputStream;
        block8: {
            byteArrayOutputStream = new ByteArrayOutputStream();
            int n9 = 0;
            n8 = 0;
            while (true) {
                if (n9 >= ((c[])object).length) break;
                object2 = object[n9];
                d.p(byteArrayOutputStream, n9);
                d.p(byteArrayOutputStream, ((c)object2).e);
                n8 = n8 + 4 + ((c)object2).e * 2;
                g.D(byteArrayOutputStream, (c)object2);
                ++n9;
                continue;
                break;
            }
            try {
                object = byteArrayOutputStream.toByteArray();
                if (n8 != ((c[])object).length) break block8;
                object = new j(e.e0, n8, (byte[])object, true);
            }
            catch (Throwable throwable2) {}
            byteArrayOutputStream.close();
            return object;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Expected size ");
        ((StringBuilder)object2).append(n8);
        ((StringBuilder)object2).append(", does not match actual size ");
        ((StringBuilder)object2).append(((c[])object).length);
        throw d.c(((StringBuilder)object2).toString());
        try {
            byteArrayOutputStream.close();
            throw throwable2;
        }
        catch (Throwable throwable3) {
            throwable2.addSuppressed(throwable3);
        }
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static j d(c[] object) throws IOException {
        Throwable throwable2;
        Object object2;
        int n8;
        ByteArrayOutputStream byteArrayOutputStream;
        block8: {
            byteArrayOutputStream = new ByteArrayOutputStream();
            int n9 = 0;
            n8 = 0;
            while (true) {
                if (n9 >= ((c[])object).length) break;
                Object object3 = object[n9];
                int n10 = g.a((c)object3);
                object2 = g.e(n10, (c)object3);
                object3 = g.f((c)object3);
                d.p(byteArrayOutputStream, n9);
                int n11 = ((Object)object2).length + 2 + ((Object)object3).length;
                d.q(byteArrayOutputStream, n11);
                d.p(byteArrayOutputStream, n10);
                byteArrayOutputStream.write((byte[])object2);
                byteArrayOutputStream.write((byte[])object3);
                n8 = n8 + 6 + n11;
                ++n9;
                continue;
                break;
            }
            try {
                object = byteArrayOutputStream.toByteArray();
                if (n8 != ((c[])object).length) break block8;
                object = new j(e.f0, n8, (byte[])object, true);
            }
            catch (Throwable throwable2) {}
            byteArrayOutputStream.close();
            return object;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Expected size ");
        ((StringBuilder)object2).append(n8);
        ((StringBuilder)object2).append(", does not match actual size ");
        ((StringBuilder)object2).append(((c[])object).length);
        throw d.c(((StringBuilder)object2).toString());
        try {
            byteArrayOutputStream.close();
            throw throwable2;
        }
        catch (Throwable throwable3) {
            throwable2.addSuppressed(throwable3);
        }
        throw throwable2;
    }

    private static byte[] e(int n8, c object) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            g.J(byteArrayOutputStream, n8, (c)object);
            object = byteArrayOutputStream.toByteArray();
            return object;
        }
        finally {
            byteArrayOutputStream.close();
        }
    }

    private static byte[] f(c object) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            g.K(byteArrayOutputStream, (c)object);
            object = byteArrayOutputStream.toByteArray();
            return object;
        }
        finally {
            byteArrayOutputStream.close();
        }
    }

    private static String g(String string, String string2) {
        if ("!".equals(string2)) {
            return string.replace(":", "!");
        }
        String string3 = string;
        if (":".equals(string2)) {
            string3 = string.replace("!", ":");
        }
        return string3;
    }

    private static String h(String string) {
        int n8;
        int n9 = n8 = string.indexOf("!");
        if (n8 < 0) {
            n9 = string.indexOf(":");
        }
        String string2 = string;
        if (n9 > 0) {
            string2 = string.substring(n9 + 1);
        }
        return string2;
    }

    private static c i(c[] cArray, String string) {
        if (cArray.length <= 0) {
            return null;
        }
        string = g.h(string);
        for (int i8 = 0; i8 < cArray.length; ++i8) {
            if (!cArray[i8].b.equals(string)) continue;
            return cArray[i8];
        }
        return null;
    }

    private static String j(String string, String string2, byte[] byArray) {
        CharSequence charSequence = i.a(byArray);
        if (string.length() <= 0) {
            return g.g(string2, (String)charSequence);
        }
        if (string2.equals("classes.dex")) {
            return string;
        }
        if (!string2.contains("!") && !string2.contains(":")) {
            if (string2.endsWith(".apk")) {
                return string2;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(i.a(byArray));
            ((StringBuilder)charSequence).append(string2);
            return ((StringBuilder)charSequence).toString();
        }
        return g.g(string2, (String)charSequence);
    }

    private static int k(int n8) {
        return g.z(n8 * 2) / 8;
    }

    private static int l(int n8, int n9) {
        return g.z(Integer.bitCount(n8 & 0xFFFFFFFE) * n9) / 8;
    }

    private static int m(int n8, int n9, int n10) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 == 4) {
                    return n9 + n10;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected flag: ");
                stringBuilder.append(n8);
                throw d.c(stringBuilder.toString());
            }
            return n9;
        }
        throw d.c("HOT methods are not stored in the bitmap");
    }

    private static int[] n(InputStream inputStream, int n8) throws IOException {
        int[] nArray = new int[n8];
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            nArray[i8] = n9 += d.h(inputStream);
        }
        return nArray;
    }

    private static int o(BitSet bitSet, int n8, int n9) {
        int n10 = 2;
        if (!bitSet.get(g.m(2, n8, n9))) {
            n10 = 0;
        }
        if (bitSet.get(g.m(4, n8, n9))) {
            return n10 | 4;
        }
        return n10;
    }

    static byte[] p(InputStream inputStream, byte[] byArray) throws IOException {
        if (Arrays.equals(byArray, d.d(inputStream, byArray.length))) {
            return d.d(inputStream, i.b.length);
        }
        throw d.c("Invalid magic");
    }

    private static void q(InputStream inputStream, c c8) throws IOException {
        int n8 = inputStream.available() - c8.f;
        int n9 = 0;
        block0: while (inputStream.available() > n8) {
            int n10 = n9 + d.h(inputStream);
            c8.i.put(n10, 1);
            int n11 = d.h(inputStream);
            while (true) {
                n9 = n10;
                if (n11 <= 0) continue block0;
                g.B(inputStream);
                --n11;
            }
        }
        if (inputStream.available() == n8) {
            return;
        }
        throw d.c("Read too much data during profile line parse");
    }

    static c[] r(InputStream inputStream, byte[] byArray, byte[] byArray2, c[] cArray) throws IOException {
        if (Arrays.equals(byArray, i.f)) {
            if (!Arrays.equals(i.a, byArray2)) {
                return g.s(inputStream, byArray, cArray);
            }
            throw d.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (Arrays.equals(byArray, i.g)) {
            return g.u(inputStream, byArray2, cArray);
        }
        throw d.c("Unsupported meta version");
    }

    static c[] s(InputStream inputStream, byte[] objectArray, c[] cArray) throws IOException {
        if (Arrays.equals(objectArray, i.f)) {
            int n8 = d.j(inputStream);
            long l8 = d.i(inputStream);
            objectArray = d.e(inputStream, (int)d.i(inputStream), (int)l8);
            if (inputStream.read() <= 0) {
                inputStream = new ByteArrayInputStream((byte[])objectArray);
                try {
                    objectArray = g.t(inputStream, n8, cArray);
                    return objectArray;
                }
                finally {
                    inputStream.close();
                }
            }
            throw d.c("Content found after the end of file");
        }
        throw d.c("Unsupported meta version");
    }

    private static c[] t(InputStream inputStream, int n8, c[] cArray) throws IOException {
        int n9 = inputStream.available();
        int n10 = 0;
        if (n9 == 0) {
            return new c[0];
        }
        if (n8 == cArray.length) {
            String[] stringArray = new String[n8];
            int[] nArray = new int[n8];
            int n11 = 0;
            while (true) {
                if (n11 >= n8) break;
                n9 = d.h(inputStream);
                nArray[n11] = d.h(inputStream);
                stringArray[n11] = d.f(inputStream, n9);
                ++n11;
            }
            for (n9 = n10; n9 < n8; ++n9) {
                c c8 = cArray[n9];
                if (c8.b.equals(stringArray[n9])) {
                    c8.e = n11 = nArray[n9];
                    c8.h = g.n(inputStream, n11);
                    continue;
                }
                throw d.c("Order of dexfiles in metadata did not match baseline");
            }
            return cArray;
        }
        throw d.c("Mismatched number of dex files found in metadata");
    }

    static c[] u(InputStream inputStream, byte[] objectArray, c[] cArray) throws IOException {
        int n8 = d.h(inputStream);
        long l8 = d.i(inputStream);
        byte[] byArray = d.e(inputStream, (int)d.i(inputStream), (int)l8);
        if (inputStream.read() <= 0) {
            inputStream = new ByteArrayInputStream(byArray);
            try {
                objectArray = g.v(inputStream, objectArray, n8, cArray);
                return objectArray;
            }
            finally {
                inputStream.close();
            }
        }
        throw d.c("Content found after the end of file");
    }

    private static c[] v(InputStream object, byte[] byArray, int n8, c[] cArray) throws IOException {
        int n9 = ((InputStream)object).available();
        if (n9 == 0) {
            return new c[0];
        }
        if (n8 == cArray.length) {
            for (int i8 = 0; i8 < n8; ++i8) {
                d.h((InputStream)object);
                Object object2 = d.f((InputStream)object, d.h((InputStream)object));
                long l8 = d.i((InputStream)object);
                n9 = d.h((InputStream)object);
                c c8 = g.i(cArray, (String)object2);
                if (c8 != null) {
                    c8.d = l8;
                    object2 = g.n((InputStream)object, n9);
                    if (!Arrays.equals(byArray, i.e)) continue;
                    c8.e = n9;
                    c8.h = (int[])object2;
                    continue;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Missing profile key: ");
                ((StringBuilder)object).append((String)object2);
                throw d.c(((StringBuilder)object).toString());
            }
            return cArray;
        }
        throw d.c("Mismatched number of dex files found in metadata");
    }

    private static void w(InputStream object, c c8) throws IOException {
        int n8;
        BitSet bitSet = BitSet.valueOf(d.d((InputStream)object, d.a(c8.g * 2)));
        for (int i8 = 0; i8 < (n8 = c8.g); ++i8) {
            if ((n8 = g.o(bitSet, i8, n8)) == 0) continue;
            Integer n9 = c8.i.get(i8);
            object = n9;
            if (n9 == null) {
                object = 0;
            }
            c8.i.put(i8, n8 | (Integer)object);
        }
    }

    static c[] x(InputStream inputStream, byte[] objectArray, String string) throws IOException {
        if (Arrays.equals(objectArray, i.b)) {
            int n8 = d.j(inputStream);
            long l8 = d.i(inputStream);
            objectArray = d.e(inputStream, (int)d.i(inputStream), (int)l8);
            if (inputStream.read() <= 0) {
                inputStream = new ByteArrayInputStream((byte[])objectArray);
                try {
                    objectArray = g.y(inputStream, string, n8);
                    return objectArray;
                }
                finally {
                    inputStream.close();
                }
            }
            throw d.c("Content found after the end of file");
        }
        throw d.c("Unsupported version");
    }

    private static c[] y(InputStream inputStream, String object, int n8) throws IOException {
        int n9;
        int n10 = inputStream.available();
        int n11 = 0;
        if (n10 == 0) {
            return new c[0];
        }
        c[] cArray = new c[n8];
        n10 = 0;
        while (true) {
            if (n10 >= n8) break;
            int n12 = d.h(inputStream);
            n9 = d.h(inputStream);
            long l8 = d.i(inputStream);
            long l9 = d.i(inputStream);
            long l10 = d.i(inputStream);
            cArray[n10] = new c((String)object, d.f(inputStream, n12), l9, 0L, n9, (int)l8, (int)l10, new int[n9], new TreeMap<Integer, Integer>());
            ++n10;
        }
        for (n9 = n11; n9 < n8; ++n9) {
            object = cArray[n9];
            g.q(inputStream, (c)object);
            ((c)object).h = g.n(inputStream, ((c)object).e);
            g.w(inputStream, (c)object);
        }
        return cArray;
    }

    private static int z(int n8) {
        return n8 + 7 & 0xFFFFFFF8;
    }
}

