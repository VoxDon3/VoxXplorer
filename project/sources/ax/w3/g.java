package ax.w3;

import ax.C3.b;
import ax.y0.C3495a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import okhttp3.internal.ws.RealWebSocket;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
final class g {

    private static final class a {
        final long a;
        final long b;
        final String c;
        final long d;

        a(long j, long j2, String str, long j3) {
            this.a = j;
            this.b = j2;
            this.c = str;
            this.d = j3;
        }
    }

    static final class b {
        boolean a;
        boolean b;
        long c;
        long d;
        long e = -1;
        String f;

        b() {
        }
    }

    private static a a(b.d dVar, long j, long j2, String str, long j3) {
        if (j2 > 0 && j2 <= j) {
            long j4 = j - j2;
            if (g(dVar, j4, j2)) {
                if (str == null) {
                    str = "video/mp4";
                }
                return new a(j4, j2, str, j3);
            }
        }
        return null;
    }

    static void b(com.android.ex.photo.c cVar, b.d dVar, long j) {
        C3495a c3495a = cVar.h;
        d(cVar, dVar, j, c3495a == null ? null : c3495a.j("Xmp"));
    }

    static void c(com.android.ex.photo.c cVar, b.d dVar, long j, b bVar) {
        a aVar;
        if (j > 0 && !bVar.b) {
            if (bVar.a) {
                long j2 = bVar.d;
                if (j2 <= 0) {
                    j2 = bVar.c;
                }
                aVar = a(dVar, j, j2, bVar.f, bVar.e);
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = i(dVar, j, bVar.e);
            }
            if (aVar != null) {
                cVar.b = true;
                cVar.c = aVar.a;
                cVar.d = aVar.b;
                cVar.e = aVar.d;
                cVar.f = aVar.c;
            }
        }
    }

    static void d(com.android.ex.photo.c cVar, b.d dVar, long j, byte[] bArr) {
        c(cVar, dVar, j, j(bArr));
    }

    private static String e(String str, String str2) {
        return str != null ? str : str2;
    }

    private static String f(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(str, str2);
        if (attributeValue != null) {
            return attributeValue;
        }
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (str2.equals(xmlPullParser.getAttributeName(i))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    private static boolean g(b.d dVar, long j, long j2) {
        if (j >= 0 && j2 >= 12) {
            try {
                byte[] q = q(dVar, j, 12);
                long l = l(q, 0);
                if (h(q, 4, "ftyp")) {
                    if (l == 1) {
                        return true;
                    }
                    if (l >= 12 && l <= j2) {
                        return true;
                    }
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private static boolean h(byte[] bArr, int i, String str) {
        if (i < 0 || str.length() + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if ((bArr[i + i2] & 255) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    private static a i(b.d dVar, long j, long j2) {
        byte[] q;
        long j3;
        a aVar;
        long j4 = 8;
        int i = 8;
        a aVar2 = null;
        try {
            q = q(dVar, j - 8, 8);
        } catch (IOException | RuntimeException unused) {
        }
        if (!h(q, 4, "SEFT")) {
            return null;
        }
        int i2 = 0;
        long o = o(q, 0);
        if (o < 12 || o > 1048576 || o + 8 > j) {
            return null;
        }
        long j5 = (j - o) - 8;
        byte[] q2 = q(dVar, j5, (int) o);
        if (!h(q2, 0, "SEFH")) {
            return null;
        }
        long o2 = o(q2, 8);
        if (o2 > (q2.length - 12) / 12) {
            return null;
        }
        while (i2 < ((int) o2)) {
            int i3 = i2 * 12;
            int p = p(q2, i3 + 14);
            long o3 = o(q2, i3 + 16);
            long o4 = o(q2, i3 + 20);
            long j6 = j5 - o3;
            if (j6 < 0 || o4 < j4 || j6 + o4 > j5) {
                j3 = j4;
            } else {
                byte[] q3 = q(dVar, j6, i);
                j3 = j4;
                if (p(q3, 2) == p) {
                    long o5 = o(q3, 4);
                    if (o5 > 0 && o5 <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
                        if (o5 + j3 < o4) {
                            long j7 = j6 + j3;
                            aVar = aVar2;
                            try {
                                if ("MotionPhoto_Data".equals(new String(q(dVar, j7, (int) o5), StandardCharsets.UTF_8))) {
                                    long j8 = j7 + o5;
                                    long j9 = (o4 - j3) - o5;
                                    if (g(dVar, j8, j9)) {
                                        return new a(j8, j9, "video/mp4", j2);
                                    }
                                }
                                i2++;
                                aVar2 = aVar;
                                j4 = j3;
                                i = 8;
                            } catch (IOException | RuntimeException unused2) {
                                return aVar;
                            }
                        }
                    }
                }
            }
            aVar = aVar2;
            i2++;
            aVar2 = aVar;
            j4 = j3;
            i = 8;
        }
        return aVar2;
    }

    static b j(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new b();
        }
        try {
            return k(bArr, XmlPullParserFactory.newInstance().newPullParser());
        } catch (XmlPullParserException unused) {
            return new b();
        }
    }

    static b k(byte[] bArr, XmlPullParser xmlPullParser) {
        b bVar = new b();
        if (bArr != null && bArr.length != 0) {
            int length = bArr.length;
            while (length > 0 && bArr[length - 1] == 0) {
                length--;
            }
            try {
                xmlPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParser.setInput(new StringReader(new String(bArr, 0, length, StandardCharsets.UTF_8)));
                while (true) {
                    int next = xmlPullParser.next();
                    if (next == 1) {
                        break;
                    }
                    if (next == 2) {
                        if ("Description".equals(xmlPullParser.getName())) {
                            m(xmlPullParser, bVar);
                        } else if ("Item".equals(xmlPullParser.getName()) && "http://ns.google.com/photos/1.0/container/".equals(xmlPullParser.getNamespace())) {
                            n(xmlPullParser, bVar);
                        }
                    }
                }
            } catch (IOException | NumberFormatException | XmlPullParserException unused) {
                return new b();
            }
        }
        return bVar;
    }

    private static long l(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    private static void m(XmlPullParser xmlPullParser, b bVar) {
        String e = e(f(xmlPullParser, "http://ns.google.com/photos/1.0/camera/", "MotionPhoto"), f(xmlPullParser, "http://ns.google.com/photos/1.0/camera/", "MicroVideo"));
        if (e != null) {
            boolean equals = "1".equals(e);
            bVar.a = equals;
            bVar.b = !equals;
        }
        String e2 = e(f(xmlPullParser, "http://ns.google.com/photos/1.0/camera/", "MotionPhotoPresentationTimestampUs"), f(xmlPullParser, "http://ns.google.com/photos/1.0/camera/", "MicroVideoPresentationTimestampUs"));
        if (e2 != null) {
            long parseLong = Long.parseLong(e2);
            if (parseLong >= 0) {
                bVar.e = parseLong;
            }
        }
        String f = f(xmlPullParser, "http://ns.google.com/photos/1.0/camera/", "MicroVideoOffset");
        if (f != null) {
            bVar.c = Long.parseLong(f);
        }
    }

    private static void n(XmlPullParser xmlPullParser, b bVar) {
        String f;
        if ("MotionPhoto".equals(f(xmlPullParser, "http://ns.google.com/photos/1.0/container/item/", "Semantic")) && (f = f(xmlPullParser, "http://ns.google.com/photos/1.0/container/item/", "Length")) != null) {
            bVar.d = Long.parseLong(f);
            bVar.f = f(xmlPullParser, "http://ns.google.com/photos/1.0/container/item/", "Mime");
        }
    }

    private static long o(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static int p(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    private static byte[] q(b.d dVar, long j, int i) throws IOException {
        if (j < 0 || i < 0) {
            throw new EOFException();
        }
        InputStream createInputStream = dVar.createInputStream();
        try {
            r(createInputStream, j);
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = createInputStream.read(bArr, i2, i - i2);
                if (read < 0) {
                    throw new EOFException();
                }
                if (read == 0) {
                    int read2 = createInputStream.read();
                    if (read2 < 0) {
                        throw new EOFException();
                    }
                    bArr[i2] = (byte) read2;
                    i2++;
                } else {
                    i2 += read;
                }
            }
            if (createInputStream != null) {
                createInputStream.close();
            }
            return bArr;
        } catch (Throwable th) {
            if (createInputStream != null) {
                try {
                    createInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static void r(InputStream inputStream, long j) throws IOException {
        while (j > 0) {
            long skip = inputStream.skip(j);
            if (skip > 0) {
                j -= skip;
            } else {
                if (inputStream.read() < 0) {
                    throw new EOFException();
                }
                j--;
            }
        }
    }
}
