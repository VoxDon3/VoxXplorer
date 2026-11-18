/*
 * Decompiled with CFR 0.152.
 */
package ax.r3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import ax.Q2.d;
import ax.Z2.a;
import ax.c3.F;
import ax.c3.d0;
import ax.o4.g;
import ax.o4.j;
import ax.u3.z;
import com.voxdon.xplorer.file.y;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class c {
    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String a(byte[] var0) {
        try {
            var4_2 = new ByteArrayInputStream((byte[])var0);
            var0 = XmlPullParserFactory.newInstance();
            var0.setNamespaceAware(false);
            var5_3 = var0.newPullParser();
            var5_3.setInput((InputStream)var4_2, null);
            var0 = null;
        }
        catch (IOException | XmlPullParserException var0_1) {
            return null;
        }
        block13: while (true) {
            block22: {
                do {
                    if (var5_3.next() == 1) return null;
                } while (var5_3.getEventType() != 2);
                var4_2 = var5_3.getName();
                if (var0 != null) break block22;
                if (!"meta".equals(var4_2)) continue;
                var3_6 = 0;
                var2_5 = 0;
                while (true) {
                    block23: {
                        if (var3_6 >= var5_3.getAttributeCount()) break;
                        var1_4 = var2_5;
                        if (!"name".equals(var5_3.getAttributeName(var3_6))) break block23;
                        var1_4 = var2_5;
                        if (!"cover".equals(var5_3.getAttributeValue(var3_6))) break block23;
                        var1_4 = 1;
                    }
                    ++var3_6;
                    var2_5 = var1_4;
                }
                if (var2_5 == 0) continue;
                var1_4 = 0;
                var4_2 = var0;
                while (true) {
                    var0 = var4_2;
                    if (var1_4 >= var5_3.getAttributeCount()) continue block13;
                    if ("content".equals(var5_3.getAttributeName(var1_4))) {
                        var4_2 = var5_3.getAttributeValue(var1_4);
                    }
                    ++var1_4;
                    continue;
                    break;
                }
            }
            if (!"item".equals(var4_2)) continue;
            var2_5 = 0;
            var1_4 = 0;
            while (true) {
                block24: {
                    if (var2_5 >= var5_3.getAttributeCount()) break;
                    var3_6 = var1_4;
                    if (!"id".equals(var5_3.getAttributeName(var2_5))) break block24;
                    var3_6 = var1_4;
                    if (!var0.equals(var5_3.getAttributeValue(var2_5))) break block24;
                    var3_6 = 1;
                }
                ++var2_5;
                var1_4 = var3_6;
            }
            if (var1_4 == 0) continue;
            var1_4 = 0;
            while (true) {
                if (var1_4 < var5_3.getAttributeCount()) ** break;
                continue block13;
                if ("href".equals(var5_3.getAttributeName(var1_4))) {
                    return var5_3.getAttributeValue(var1_4);
                }
                ++var1_4;
                continue;
                break;
            }
            break;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String b(byte[] var0) {
        try {
            var4_2 = new ByteArrayInputStream(var0 /* !! */ );
            var0 /* !! */  = (byte[])XmlPullParserFactory.newInstance();
            var0 /* !! */ .setNamespaceAware(false);
            var0 /* !! */  = (byte[])var0 /* !! */ .newPullParser();
            var0 /* !! */ .setInput((InputStream)var4_2, null);
lbl7:
            // 2 sources

            while (true) {
                if (var0 /* !! */ .next() == 1) return null;
                if (var0 /* !! */ .getEventType() != 2 || !"item".equals(var0 /* !! */ .getName())) continue;
                var1_3 = 0;
                for (var3_5 = 0; var3_5 < var0 /* !! */ .getAttributeCount(); ++var3_5) {
                    var2_4 = var1_3;
                    if ("properties".equals(var0 /* !! */ .getAttributeName(var3_5))) {
                        var2_4 = var1_3;
                        if ("cover-image".equals(var0 /* !! */ .getAttributeValue(var3_5))) {
                            var2_4 = 1;
                        }
                    }
                    var1_3 = var2_4;
                }
                if (var1_3 == 0) continue;
                var1_3 = 0;
                break;
            }
        }
        catch (IOException | XmlPullParserException var0_1) {
            return null;
        }
        {
            while (true) {
                if (var1_3 < var0 /* !! */ .getAttributeCount()) ** break;
                ** continue;
                if ("href".equals(var0 /* !! */ .getAttributeName(var1_3))) {
                    return (byte[])var0 /* !! */ .getAttributeValue(var1_3);
                }
                ++var1_3;
            }
        }
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static InputStream c(Context object, String object2) {
        RuntimeException var0_5;
        block13: {
            Exception exception22222;
            Object object3;
            y y8;
            Object object4;
            block12: {
                object4 = new File(a.m(object, "thumb-tmp"), String.valueOf(((String)object2).hashCode()));
                try {
                    y8 = y.I0((String)object2);
                    object = F.g(y8, "META-INF/container.xml");
                    if (object == null) {
                        return null;
                    }
                    object3 = c.d((byte[])object);
                    if (object3 == null) {
                        return null;
                    }
                    byte[] byArray = F.g(y8, (String)object3);
                    if (byArray == null) {
                        return null;
                    }
                    object2 = c.a(byArray);
                    object = object2;
                    if (object2 != null) break block12;
                    object = c.b(byArray);
                }
                catch (Exception exception22222) {
                }
                catch (FileNotFoundException fileNotFoundException) {
                    break block13;
                }
                catch (ax.b3.j j8) {
                    break block13;
                }
            }
            if (object == null) {
                return null;
            }
            object2 = d0.R(d0.u((String)object3), (String)object);
            object = d0.i((String)object2);
            if (!((File)object4).exists()) {
                ((File)object4).mkdirs();
            }
            if (!F.k(y8, (String)object2, (File)(object3 = new File((File)object4, (String)object)))) {
                return null;
            }
            object2 = new File((File)object4, (String)object);
            if (!((File)object2).exists()) {
                return null;
            }
            object4 = new FileInputStream((File)object2);
            object = new BufferedInputStream((InputStream)object4, 32768);
            return new ax.ca.a((InputStream)object, (int)((File)object2).length());
            catch (Throwable throwable) {
                throw throwable;
            }
            d.c("genepubthumbnail", exception22222);
            return null;
        }
        var0_5.printStackTrace();
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String d(byte[] var0) {
        try {
            var2_2 = new ByteArrayInputStream(var0 /* !! */ );
            var0 /* !! */  = (byte[])XmlPullParserFactory.newInstance();
            var0 /* !! */ .setNamespaceAware(false);
            var0 /* !! */  = (byte[])var0 /* !! */ .newPullParser();
            var0 /* !! */ .setInput((InputStream)var2_2, null);
            block2: while (true) {
                if (var0 /* !! */ .next() == 1) return null;
                if (var0 /* !! */ .getEventType() != 2 || !"rootfile".equals(var0 /* !! */ .getName())) continue;
                var1_3 = 0;
                while (true) {
                    if (var1_3 < var0 /* !! */ .getAttributeCount()) ** break;
                    continue block2;
                    if ("full-path".equals(var0 /* !! */ .getAttributeName(var1_3))) {
                        return (byte[])var0 /* !! */ .getAttributeValue(var1_3);
                    }
                    ++var1_3;
                }
                break;
            }
        }
        catch (IOException | XmlPullParserException var0_1) {
            return null;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static InputStream e(InputStream inputStream, int n8) {
        Exception exception222;
        block11: {
            float f8;
            float f9;
            float f10;
            Canvas canvas;
            Bitmap bitmap;
            g g8;
            block10: {
                block9: {
                    block12: {
                        if (inputStream == null) {
                            return null;
                        }
                        g8 = g.l(inputStream);
                        inputStream = g8.o();
                        bitmap = Bitmap.createBitmap((int)n8, (int)n8, (Bitmap.Config)Bitmap.Config.ARGB_8888);
                        canvas = new Canvas(bitmap);
                        canvas.drawColor(-1);
                        f10 = (float)inputStream.getWidth() / (float)inputStream.getHeight();
                        if (f10 > 1.0f) {
                            f9 = (float)canvas.getHeight() / f10;
                            f9 = ((float)canvas.getHeight() - f9) / 2.0f;
                            break block9;
                        }
                        if (!(f10 < 1.0f)) break block12;
                        try {
                            f9 = canvas.getWidth();
                            f8 = ((float)canvas.getWidth() - f9 * f10) / 2.0f;
                            f9 = 0.0f;
                            break block10;
                        }
                        catch (Exception exception222) {
                            break block11;
                        }
                    }
                    f9 = 0.0f;
                }
                f8 = 0.0f;
            }
            canvas.translate(f8, f9);
            if (g8.h() > g8.f()) {
                g8 = new RectF(0.0f, 0.0f, (float)canvas.getWidth(), (float)canvas.getWidth() / f10);
                canvas.drawPicture((Picture)inputStream, (RectF)g8);
                return new ByteArrayInputStream(z.d(bitmap));
            } else {
                g8 = new RectF(0.0f, 0.0f, (float)canvas.getWidth() * f10, (float)canvas.getWidth());
                canvas.drawPicture((Picture)inputStream, (RectF)g8);
            }
            return new ByteArrayInputStream(z.d(bitmap));
        }
        d.c("gensvgthumbnail", exception222);
        return null;
        catch (j j8) {
            return null;
        }
    }
}

