package ax.r3;

import android.content.Context;
import ax.b3.C1495j;
import ax.c3.F;
import ax.c3.d0;
import ax.ca.C1852a;
import com.voxdon.xplorer.file.C3605y;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: ax.r3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2946c {
    private static String a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(false);
            XmlPullParser newPullParser = newInstance.newPullParser();
            newPullParser.setInput(byteArrayInputStream, null);
            String str = null;
            while (newPullParser.next() != 1) {
                if (newPullParser.getEventType() == 2) {
                    String name = newPullParser.getName();
                    if (str == null) {
                        if ("meta".equals(name)) {
                            boolean z = false;
                            for (int i = 0; i < newPullParser.getAttributeCount(); i++) {
                                if ("name".equals(newPullParser.getAttributeName(i)) && "cover".equals(newPullParser.getAttributeValue(i))) {
                                    z = true;
                                }
                            }
                            if (z) {
                                for (int i2 = 0; i2 < newPullParser.getAttributeCount(); i2++) {
                                    if ("content".equals(newPullParser.getAttributeName(i2))) {
                                        str = newPullParser.getAttributeValue(i2);
                                    }
                                }
                            }
                        }
                    } else if ("item".equals(name)) {
                        boolean z2 = false;
                        for (int i3 = 0; i3 < newPullParser.getAttributeCount(); i3++) {
                            if ("id".equals(newPullParser.getAttributeName(i3)) && str.equals(newPullParser.getAttributeValue(i3))) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            for (int i4 = 0; i4 < newPullParser.getAttributeCount(); i4++) {
                                if ("href".equals(newPullParser.getAttributeName(i4))) {
                                    return newPullParser.getAttributeValue(i4);
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        return null;
    }

    private static String b(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(false);
            XmlPullParser newPullParser = newInstance.newPullParser();
            newPullParser.setInput(byteArrayInputStream, null);
            while (newPullParser.next() != 1) {
                if (newPullParser.getEventType() == 2 && "item".equals(newPullParser.getName())) {
                    boolean z = false;
                    for (int i = 0; i < newPullParser.getAttributeCount(); i++) {
                        if ("properties".equals(newPullParser.getAttributeName(i)) && "cover-image".equals(newPullParser.getAttributeValue(i))) {
                            z = true;
                        }
                    }
                    if (z) {
                        for (int i2 = 0; i2 < newPullParser.getAttributeCount(); i2++) {
                            if ("href".equals(newPullParser.getAttributeName(i2))) {
                                return newPullParser.getAttributeValue(i2);
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        return null;
    }

    public static InputStream c(Context context, String str) {
        String d;
        byte[] g;
        File file = new File(ax.Z2.a.m(context, "thumb-tmp"), String.valueOf(str.hashCode()));
        try {
            C3605y I0 = C3605y.I0(str);
            byte[] g2 = F.g(I0, "META-INF/container.xml");
            if (g2 == null || (d = d(g2)) == null || (g = F.g(I0, d)) == null) {
                return null;
            }
            String a = a(g);
            if (a == null) {
                a = b(g);
            }
            if (a == null) {
                return null;
            }
            String R = d0.R(d0.u(d), a);
            String i = d0.i(R);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (!F.k(I0, R, new File(file, i))) {
                return null;
            }
            File file2 = new File(file, i);
            if (file2.exists()) {
                return new C1852a(new BufferedInputStream(new FileInputStream(file2), 32768), (int) file2.length());
            }
            return null;
        } catch (C1495j e) {
            e = e;
            e.printStackTrace();
            return null;
        } catch (FileNotFoundException e2) {
            e = e2;
            e.printStackTrace();
            return null;
        } catch (Exception e3) {
            ax.Q2.d.c("genepubthumbnail", e3);
            return null;
        }
    }

    private static String d(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(false);
            XmlPullParser newPullParser = newInstance.newPullParser();
            newPullParser.setInput(byteArrayInputStream, null);
            while (newPullParser.next() != 1) {
                if (newPullParser.getEventType() == 2 && "rootfile".equals(newPullParser.getName())) {
                    for (int i = 0; i < newPullParser.getAttributeCount(); i++) {
                        if ("full-path".equals(newPullParser.getAttributeName(i))) {
                            return newPullParser.getAttributeValue(i);
                        }
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066 A[Catch: Exception -> 0x003f, j -> 0x009d, TryCatch #2 {j -> 0x009d, Exception -> 0x003f, blocks: (B:6:0x0004, B:8:0x002f, B:10:0x0057, B:12:0x0066, B:13:0x008e, B:16:0x007a, B:19:0x0045), top: B:5:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a A[Catch: Exception -> 0x003f, j -> 0x009d, TryCatch #2 {j -> 0x009d, Exception -> 0x003f, blocks: (B:6:0x0004, B:8:0x002f, B:10:0x0057, B:12:0x0066, B:13:0x008e, B:16:0x007a, B:19:0x0045), top: B:5:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.InputStream e(java.io.InputStream r8, int r9) {
        /*
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            ax.o4.g r8 = ax.o4.C2695g.l(r8)     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            android.graphics.Picture r1 = r8.o()     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r9, r2)     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            r2.<init>(r9)     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            r3 = -1
            r2.drawColor(r3)     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            int r3 = r1.getWidth()     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r3 = (float) r3     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            int r4 = r1.getHeight()     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r4 = (float) r4     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r3 = r3 / r4
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L41
            int r5 = r2.getHeight()     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r5 = (float) r5     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r5 = r5 / r3
            int r7 = r2.getHeight()     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r7 = (float) r7     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r7 = r7 - r5
            float r7 = r7 / r4
            r4 = r7
        L3d:
            r7 = 0
            goto L57
        L3f:
            r8 = move-exception
            goto L98
        L41:
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L55
            int r5 = r2.getWidth()     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r5 = (float) r5     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r5 = r5 * r3
            int r7 = r2.getWidth()     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r7 = (float) r7     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r7 = r7 - r5
            float r7 = r7 / r4
            r4 = 0
            goto L57
        L55:
            r4 = 0
            goto L3d
        L57:
            r2.translate(r7, r4)     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r4 = r8.h()     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r8 = r8.f()     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 <= 0) goto L7a
            android.graphics.RectF r8 = new android.graphics.RectF     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            int r4 = r2.getWidth()     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r4 = (float) r4     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            int r5 = r2.getWidth()     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r5 = (float) r5     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r5 = r5 / r3
            r8.<init>(r6, r6, r4, r5)     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            r2.drawPicture(r1, r8)     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            goto L8e
        L7a:
            android.graphics.RectF r8 = new android.graphics.RectF     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            int r4 = r2.getWidth()     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r4 = (float) r4     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r4 = r4 * r3
            int r3 = r2.getWidth()     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            float r3 = (float) r3     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            r8.<init>(r6, r6, r4, r3)     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            r2.drawPicture(r1, r8)     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
        L8e:
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            byte[] r9 = ax.u3.z.d(r9)     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            r8.<init>(r9)     // Catch: java.lang.Exception -> L3f ax.o4.j -> L9d
            return r8
        L98:
            java.lang.String r9 = "gensvgthumbnail"
            ax.Q2.d.c(r9, r8)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.r3.C2946c.e(java.io.InputStream, int):java.io.InputStream");
    }
}
