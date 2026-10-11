/*
 * Decompiled with CFR 0.152.
 */
package ax.C3;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import ax.A3.b;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

public class b {
    private static final Pattern a = Pattern.compile("^(?:.*;)?base64,.*");
    public static final c b = c.d0;

    public static d b(ContentResolver contentResolver, Uri uri) {
        if ("data".equals(uri.getScheme())) {
            return new b(contentResolver, uri);
        }
        return new a(contentResolver, uri);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b.a c(d var0, int var1_11, boolean var2_12) {
        var6_13 = new b.a();
        var7_14 = ax.C3.b.e((d)var0);
        if (var7_14 == null) {
            var6_13.e = 1;
            var6_13.h = var0 = new Exception("image bounds == null");
            return var6_13;
        }
        var8_15 = new BitmapFactory.Options();
        var8_15.inSampleSize = Math.max(var7_14.x / var1_11, var7_14.y / var1_11);
        var4_16 = null;
        var4_16 = var5_22 = var0.createInputStream();
        var4_16 = var5_22;
        var9_23 = new ax.y0.a(var5_22);
        var4_16 = var5_22;
        var3_24 = var9_23.y();
        var4_16 = var5_22;
        var4_16 = var5_22;
        var10_26 = new com.android.ex.photo.c();
        var4_16 = var5_22;
        var6_13.i = var10_26;
        var4_16 = var5_22;
        var10_26.j = var7_14.x;
        var4_16 = var5_22;
        var10_26.k = var7_14.y;
        var4_16 = var5_22;
        var10_26.a = false;
        var4_16 = var5_22;
        var10_26.h = var9_23;
        var1_11 = var3_24;
        if (var5_22 == null) ** GOTO lbl86
        var1_11 = var3_24;
        ** GOTO lbl60
        catch (Throwable var0_8) {
            ** GOTO lbl75
        }
        catch (RuntimeException var4_19) {
            var5_22 = null;
            ** GOTO lbl69
        }
        catch (OutOfMemoryError var0_1) {}
        var6_13.e = 2;
        var6_13.h = var0_1;
        return var6_13;
        catch (NullPointerException var0_2) {
        }
        catch (StringIndexOutOfBoundsException var0_3) {
        }
        catch (SecurityException var0_4) {}
        var6_13.e = 1;
        var6_13.h = var0_4;
        return var6_13;
        {
            block26: {
                catch (IOException var0_5) {}
                var6_13.e = 1;
                var6_13.h = var0_5;
                return var6_13;
                catch (FileNotFoundException var0_6) {}
                var6_13.e = 1;
                var6_13.h = var0_6;
                return var6_13;
lbl60:
                // 2 sources

                while (true) {
                    try {
                        var5_22.close();
                        break block26;
                    }
                    catch (IOException var4_17) {
                        break block26;
                    }
                    break;
                }
                catch (Throwable var0_7) {
                    ** GOTO lbl75
                }
                catch (RuntimeException var4_18) {}
lbl69:
                // 2 sources

                if (var5_22 == null) ** GOTO lbl79
                var4_16 = var5_22;
                {
                    block27: {
                        try {
                            var5_22.close();
                            break block27;
                        }
                        catch (IOException var4_20) {}
lbl75:
                        // 2 sources

                        if (var4_16 == null) throw var0;
                        var4_16.close();
                        throw var0;
                    }
                    var4_16 = var5_22;
                    var4_16 = var5_22 = var0.createInputStream();
                    var1_11 = var3_25 = ax.C3.a.a(var5_22, -1L);
                    if (var5_22 == null) break block26;
                    var1_11 = var3_25;
                    ** continue;
                }
            }
            if (!var2_12) ** GOTO lbl90
            ** try [egrp 6[TRYBLOCK] [59, 58, 57, 56, 55 : 315->362)] { 
lbl-1000:
            // 1 sources

            {
                var6_13.c = ax.C3.b.d((d)var0, null, var8_15, var1_11);
lbl90:
                // 2 sources

                var6_13.d = var1_11;
                var6_13.a = var7_14;
                var6_13.e = 0;
                return var6_13;
            }
            catch (IOException var4_21) {}
            {
                throw var0;
            }
        }
lbl96:
        // 3 sources

        catch (IllegalArgumentException var0_10) {
            return var6_13;
        }
        var6_13.e = 1;
        var6_13.h = var0_9;
        return var6_13;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Bitmap d(d object, Rect object2, BitmapFactory.Options options, int n8) throws IOException {
        RuntimeException var0_3;
        block15: {
            InputStream inputStream;
            block14: {
                inputStream = object.createInputStream();
                try {
                    object = BitmapFactory.decodeStream((InputStream)inputStream, (Rect)object2, (BitmapFactory.Options)options);
                    if (inputStream == null || object != null) break block14;
                }
                catch (Throwable throwable) {
                    object2 = inputStream;
                    break block15;
                }
                if (!options.inJustDecodeBounds) {
                    Log.w((String)"ImageUtils", (String)"ImageUtils#decodeStream(InputStream, Rect, Options): Image bytes cannot be decoded into a Bitmap");
                    object = new UnsupportedOperationException("Image bytes cannot be decoded into a Bitmap.");
                    throw object;
                }
            }
            if (inputStream != null) {
                inputStream.close();
            }
            return object;
            catch (Throwable throwable) {
                object2 = null;
            }
        }
        if (object2 != null) {
            ((InputStream)object2).close();
        }
        throw var0_3;
        catch (IOException iOException) {
            return object;
        }
        catch (IOException iOException) {
            throw var0_3;
        }
    }

    private static Point e(d d8) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ax.C3.b.d(d8, null, options, 0);
        return new Point(options.outWidth, options.outHeight);
    }

    private static class a
    implements d {
        protected final ContentResolver a;
        protected final Uri b;

        public a(ContentResolver contentResolver, Uri uri) {
            this.a = contentResolver;
            this.b = uri;
        }

        @Override
        public InputStream createInputStream() throws FileNotFoundException {
            return this.a.openInputStream(this.b);
        }
    }

    private static class b
    extends a {
        private byte[] c;

        public b(ContentResolver contentResolver, Uri uri) {
            super(contentResolver, uri);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private byte[] a(Uri object) {
            IllegalArgumentException illegalArgumentException2;
            block3: {
                object = object.getSchemeSpecificPart();
                try {
                    if (object.startsWith("base64,")) {
                        return Base64.decode((String)object.substring(7), (int)8);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException2) {
                    break block3;
                }
                if (!a.matcher((CharSequence)object).matches()) return null;
                return Base64.decode((String)object.substring(object.indexOf("base64,") + 7), (int)0);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Mailformed data URI: ");
            stringBuilder.append(illegalArgumentException2);
            Log.e((String)"ImageUtils", (String)stringBuilder.toString());
            return null;
        }

        @Override
        public InputStream createInputStream() throws FileNotFoundException {
            if (this.c == null) {
                byte[] byArray = this.a(this.b);
                this.c = byArray;
                if (byArray == null) {
                    return super.createInputStream();
                }
            }
            return new ByteArrayInputStream(this.c);
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        private static final c[] e0;
        public static final /* enum */ c q;

        static {
            q = new c();
            c0 = new c();
            d0 = new c();
            e0 = c.d();
        }

        private static /* synthetic */ c[] d() {
            return new c[]{q, c0, d0};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])e0.clone();
        }
    }

    public static interface d {
        public InputStream createInputStream() throws IOException;
    }
}

