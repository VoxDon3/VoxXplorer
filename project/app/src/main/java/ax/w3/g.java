/*
 * Decompiled with CFR 0.152.
 */
package ax.w3;

import ax.C3.b;
import com.android.ex.photo.c;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

final class g {
    private static a a(b.d d8, long l8, long l9, String string, long l10) {
        if (l9 > 0L && l9 <= l8 && g.g(d8, l8 -= l9, l9)) {
            if (string == null) {
                string = "video/mp4";
            }
            return new a(l8, l9, string, l10);
        }
        return null;
    }

    static void b(c c8, b.d d8, long l8) {
        Object object = c8.h;
        object = object == null ? null : (Object)((ax.y0.a)object).j("Xmp");
        g.d(c8, d8, l8, (byte[])object);
    }

    static void c(c c8, b.d d8, long l8, b b8) {
        if (l8 > 0L && !b8.b) {
            a a8;
            if (b8.a) {
                long l9 = b8.d;
                if (l9 <= 0L) {
                    l9 = b8.c;
                }
                a8 = g.a(d8, l8, l9, b8.f, b8.e);
            } else {
                a8 = null;
            }
            a a9 = a8;
            if (a8 == null) {
                a9 = g.i(d8, l8, b8.e);
            }
            if (a9 != null) {
                c8.b = true;
                c8.c = a9.a;
                c8.d = a9.b;
                c8.e = a9.d;
                c8.f = a9.c;
            }
        }
    }

    static void d(c c8, b.d d8, long l8, byte[] byArray) {
        g.c(c8, d8, l8, g.j(byArray));
    }

    private static String e(String string, String string2) {
        if (string != null) {
            return string;
        }
        return string2;
    }

    private static String f(XmlPullParser xmlPullParser, String string, String string2) {
        if ((string = xmlPullParser.getAttributeValue(string, string2)) != null) {
            return string;
        }
        for (int i8 = 0; i8 < xmlPullParser.getAttributeCount(); ++i8) {
            if (!string2.equals(xmlPullParser.getAttributeName(i8))) continue;
            return xmlPullParser.getAttributeValue(i8);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean g(b.d object, long l8, long l9) {
        if (l8 < 0L) return false;
        if (l9 < 12L) {
            return false;
        }
        try {
            object = g.q((b.d)object, l8, 12);
            l8 = g.l((byte[])object, 0);
            boolean bl = g.h((byte[])object, 4, "ftyp");
            if (!bl) return false;
            if (l8 == 1L) return true;
            if (l8 < 12L) return false;
            if (l8 > l9) return false;
            return true;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    private static boolean h(byte[] byArray, int n8, String string) {
        if (n8 >= 0 && string.length() + n8 <= byArray.length) {
            for (int i8 = 0; i8 < string.length(); ++i8) {
                if ((byArray[n8 + i8] & 0xFF) == string.charAt(i8)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static a i(b.d object, long l8, long l9) {
        long l10;
        long l11;
        int n8;
        byte[] byArray;
        Object var19_11;
        Object var18_10;
        long l12;
        block24: {
            l12 = 8L;
            Object var20_6 = null;
            var18_10 = null;
            var19_11 = var20_6;
            byArray = g.q((b.d)object, l8 - 8L, 8);
            var19_11 = var20_6;
            if (!g.h(byArray, 4, "SEFT")) {
                return null;
            }
            n8 = 0;
            var19_11 = var20_6;
            l11 = g.o(byArray, 0);
            if (l11 < 12L) return null;
            if (l11 > 0x100000L) return null;
            if (l11 + 8L > l8) {
                return null;
            }
            l10 = l8 - l11 - 8L;
            var19_11 = var20_6;
            byArray = g.q((b.d)object, l10, (int)l11);
            var19_11 = var20_6;
            if (!g.h(byArray, 0, "SEFH")) {
                return null;
            }
            var19_11 = var20_6;
            l11 = g.o(byArray, 8);
            l8 = l12;
            var19_11 = var20_6;
            try {
                if (l11 <= (long)((byArray.length - 12) / 12)) break block24;
                return null;
            }
            catch (IOException | RuntimeException exception) {
                return var19_11;
            }
        }
        while (true) {
            block25: {
                var19_11 = var18_10;
                if (n8 >= (int)l11) return var19_11;
                int n9 = n8 * 12;
                var19_11 = var18_10;
                int n10 = g.p(byArray, n9 + 14);
                var19_11 = var18_10;
                long l13 = g.o(byArray, n9 + 16);
                var19_11 = var18_10;
                l12 = g.o(byArray, n9 + 20);
                long l14 = l10 - l13;
                if (l14 < 0L || l12 < l8 || l14 + l12 > l10) break block25;
                var19_11 = var18_10;
                byte[] byArray2 = g.q((b.d)object, l14, 8);
                var19_11 = var18_10;
                if (g.p(byArray2, 2) != n10) break block25;
                var19_11 = var18_10;
                l13 = g.o(byArray2, 4);
                if (l13 <= 0L || l13 > 1024L || l13 + l8 >= l12) break block25;
                l14 += l8;
                var19_11 = var18_10;
                byte[] byArray3 = g.q((b.d)object, l14, (int)l13);
                var19_11 = var18_10;
                var19_11 = var18_10;
                String string = new String(byArray3, StandardCharsets.UTF_8);
                if (!"MotionPhoto_Data".equals(string)) break block25;
                l14 += l13;
                l12 = l12 - l8 - l13;
                if (!g.g((b.d)object, l14, l12)) break block25;
                return new a(l14, l12, "video/mp4", l9);
            }
            ++n8;
        }
        catch (IOException | RuntimeException exception) {
            return var19_11;
        }
    }

    static b j(byte[] object) {
        if (object != null && ((byte[])object).length != 0) {
            try {
                object = g.k(object, XmlPullParserFactory.newInstance().newPullParser());
                return object;
            }
            catch (XmlPullParserException xmlPullParserException) {
                return new b();
            }
        }
        return new b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static b k(byte[] byArray, XmlPullParser xmlPullParser) {
        int n8;
        b b8 = new b();
        if (byArray == null) return b8;
        if (byArray.length == 0) {
            return b8;
        }
        for (n8 = byArray.length; n8 > 0 && byArray[n8 - 1] == 0; --n8) {
        }
        try {
            xmlPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            String string = new String(byArray, 0, n8, StandardCharsets.UTF_8);
            StringReader stringReader = new StringReader(string);
            xmlPullParser.setInput((Reader)stringReader);
            while ((n8 = xmlPullParser.next()) != 1) {
                if (n8 != 2) continue;
                if ("Description".equals(xmlPullParser.getName())) {
                    g.m(xmlPullParser, b8);
                    continue;
                }
                if (!"Item".equals(xmlPullParser.getName()) || !"http://ns.google.com/photos/1.0/container/".equals(xmlPullParser.getNamespace())) continue;
                g.n(xmlPullParser, b8);
            }
            return b8;
        }
        catch (IOException | NumberFormatException | XmlPullParserException throwable) {
            return new b();
        }
    }

    private static long l(byte[] byArray, int n8) {
        long l8 = byArray[n8];
        long l9 = byArray[n8 + 1];
        long l10 = byArray[n8 + 2];
        return (long)byArray[n8 + 3] & 0xFFL | ((l8 & 0xFFL) << 24 | (l9 & 0xFFL) << 16 | (l10 & 0xFFL) << 8);
    }

    private static void m(XmlPullParser object, b b8) {
        long l8;
        String string = g.e(g.f(object, "http://ns.google.com/photos/1.0/camera/", "MotionPhoto"), g.f(object, "http://ns.google.com/photos/1.0/camera/", "MicroVideo"));
        if (string != null) {
            boolean bl;
            b8.a = bl = "1".equals(string);
            b8.b = bl ^ true;
        }
        if ((string = g.e(g.f(object, "http://ns.google.com/photos/1.0/camera/", "MotionPhotoPresentationTimestampUs"), g.f(object, "http://ns.google.com/photos/1.0/camera/", "MicroVideoPresentationTimestampUs"))) != null && (l8 = Long.parseLong(string)) >= 0L) {
            b8.e = l8;
        }
        if ((object = g.f(object, "http://ns.google.com/photos/1.0/camera/", "MicroVideoOffset")) != null) {
            b8.c = Long.parseLong((String)object);
        }
    }

    private static void n(XmlPullParser xmlPullParser, b b8) {
        String string;
        if ("MotionPhoto".equals(g.f(xmlPullParser, "http://ns.google.com/photos/1.0/container/item/", "Semantic")) && (string = g.f(xmlPullParser, "http://ns.google.com/photos/1.0/container/item/", "Length")) != null) {
            b8.d = Long.parseLong(string);
            b8.f = g.f(xmlPullParser, "http://ns.google.com/photos/1.0/container/item/", "Mime");
        }
    }

    private static long o(byte[] byArray, int n8) {
        long l8 = byArray[n8];
        long l9 = byArray[n8 + 1];
        long l10 = byArray[n8 + 2];
        return ((long)byArray[n8 + 3] & 0xFFL) << 24 | (l8 & 0xFFL | (l9 & 0xFFL) << 8 | (l10 & 0xFFL) << 16);
    }

    private static int p(byte[] byArray, int n8) {
        byte by = byArray[n8];
        return (byArray[n8 + 1] & 0xFF) << 8 | by & 0xFF;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static byte[] q(b.d var0, long var1_2, int var3_3) throws IOException {
        block9: {
            block8: {
                block7: {
                    if (var1_2 < 0L) throw new EOFException();
                    if (var3_3 < 0) throw new EOFException();
                    var0 = var0.createInputStream();
                    try {
                        g.r((InputStream)var0, var1_2);
                        var6_4 /* !! */  = new byte[var3_3];
                        var4_6 = 0;
lbl8:
                        // 3 sources

                        while (var4_6 < var3_3) {
                            var5_7 = var0.read(var6_4 /* !! */ , var4_6, var3_3 - var4_6);
                            if (var5_7 < 0) ** GOTO lbl28
                            if (var5_7 != 0) ** GOTO lbl26
                            var5_7 = var0.read();
                            if (var5_7 >= 0) {
                                break block7;
                            }
                            ** GOTO lbl-1000
                        }
                        break block8;
                    }
                    catch (Throwable var6_5) {
                        break block9;
                    }
                }
                var6_4 /* !! */ [var4_6] = (byte)var5_7;
                ++var4_6;
                ** GOTO lbl8
lbl-1000:
                // 1 sources

                {
                    var6_4 /* !! */  = (byte[])new EOFException;
                    var6_4 /* !! */ ();
                    throw var6_4 /* !! */ ;
lbl26:
                    // 1 sources

                    var4_6 += var5_7;
                    ** GOTO lbl8
lbl28:
                    // 1 sources

                    var6_4 /* !! */  = (byte[])new EOFException;
                    var6_4 /* !! */ ();
                    throw var6_4 /* !! */ ;
                }
            }
            if (var0 == null) return var6_4 /* !! */ ;
            var0.close();
            return var6_4 /* !! */ ;
        }
        if (var0 == null) throw var6_5;
        try {
            var0.close();
            throw var6_5;
        }
        catch (Throwable var0_1) {
            var6_5.addSuppressed(var0_1);
        }
        throw var6_5;
    }

    private static void r(InputStream inputStream, long l8) throws IOException {
        while (l8 > 0L) {
            long l9 = inputStream.skip(l8);
            if (l9 > 0L) {
                l8 -= l9;
                continue;
            }
            if (inputStream.read() >= 0) {
                --l8;
                continue;
            }
            throw new EOFException();
        }
    }

    private static final class a {
        final long a;
        final long b;
        final String c;
        final long d;

        a(long l8, long l9, String string, long l10) {
            this.a = l8;
            this.b = l9;
            this.c = string;
            this.d = l10;
        }
    }

    static final class b {
        boolean a;
        boolean b;
        long c;
        long d;
        long e = -1L;
        String f;

        b() {
        }
    }
}

