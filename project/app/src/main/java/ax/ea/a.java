/*
 * Decompiled with CFR 0.152.
 */
package ax.ea;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import ax.ca.d;
import ax.ca.e;
import ax.ca.h;
import ax.ea.c;
import ax.ga.b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public class a
implements ax.ea.b {
    protected final boolean a;

    public a(boolean bl) {
        this.a = bl;
    }

    private boolean b(String string, String string2) {
        return "image/jpeg".equalsIgnoreCase(string2) && b.a.l(string) == b.a.f0;
    }

    @Override
    public Bitmap a(c c8) throws IOException {
        b b8;
        InputStream inputStream = this.f(c8);
        if (inputStream == null) {
            ax.ka.d.b("No stream for image [%s]", c8.g());
            return null;
        }
        Object object = inputStream;
        try {
            b8 = this.e(inputStream, c8);
            object = inputStream;
        }
        catch (Throwable throwable) {
            ax.ka.c.a((Closeable)object);
            throw throwable;
        }
        inputStream = this.h(inputStream, c8);
        object = inputStream;
        Bitmap bitmap = BitmapFactory.decodeStream((InputStream)inputStream, null, (BitmapFactory.Options)this.g(b8.a, c8));
        ax.ka.c.a(inputStream);
        if (bitmap == null) {
            ax.ka.d.b("Image can't be decoded [%s]", c8.g());
            return bitmap;
        }
        object = b8.b;
        return this.c(bitmap, c8, ((a)object).a, ((a)object).b);
    }

    protected Bitmap c(Bitmap bitmap, c c8, int n8, boolean bl) {
        boolean bl2;
        h h8;
        e e8;
        e e9;
        float f8;
        Matrix matrix = new Matrix();
        d d8 = c8.h();
        if ((d8 == d.f0 || d8 == d.g0) && Float.compare(f8 = ax.ka.b.b(e9 = new e(bitmap.getWidth(), bitmap.getHeight(), n8), e8 = c8.j(), h8 = c8.k(), bl2 = d8 == d.g0), 1.0f) != 0) {
            matrix.setScale(f8, f8);
            if (this.a) {
                ax.ka.d.a("Scale subsampled image (%1$s) to %2$s (scale = %3$.5f) [%4$s]", e9, e9.c(f8), Float.valueOf(f8), c8.g());
            }
        }
        if (bl) {
            matrix.postScale(-1.0f, 1.0f);
            if (this.a) {
                ax.ka.d.a("Flip image horizontally [%s]", c8.g());
            }
        }
        if (n8 != 0) {
            matrix.postRotate((float)n8);
            if (this.a) {
                ax.ka.d.a("Rotate image on %1$d\u00b0 [%2$s]", n8, c8.g());
            }
        }
        if ((c8 = Bitmap.createBitmap((Bitmap)bitmap, (int)0, (int)0, (int)bitmap.getWidth(), (int)bitmap.getHeight(), (Matrix)matrix, (boolean)true)) != bitmap) {
            bitmap.recycle();
        }
        return c8;
    }

    /*
     * Unable to fully structure code
     */
    protected a d(String var1_1) {
        var7_2 = true;
        var8_3 = true;
        var5_4 = true;
        var6_5 = true;
        var3_6 = 0;
        var9_7 = new ExifInterface(b.a.f0.j(var1_1));
        var4_9 = var9_7.getAttributeInt("Orientation", 1);
        var2_10 = var3_6;
        switch (var4_9) {
            default: {
                ** GOTO lbl34
            }
            case 8: {
                var7_2 = false;
                ** GOTO lbl22
            }
            case 6: {
                var6_5 = false;
            }
            case 7: {
                var2_10 = 90;
                var5_4 = var6_5;
                break;
            }
lbl22:
            // 2 sources

            case 5: {
                var2_10 = 270;
                var5_4 = var7_2;
                break;
            }
            case 3: {
                var8_3 = false;
            }
            case 4: {
                var2_10 = 180;
                var5_4 = var8_3;
                break;
            }
            catch (IOException var9_8) {
                ax.ka.d.f("Can't read EXIF tags from file [%s]", new Object[]{var1_1});
            }
lbl34:
            // 3 sources

            case 1: {
                var5_4 = false;
                var2_10 = var3_6;
            }
            case 2: 
        }
        return new a(var2_10, var5_4);
    }

    protected b e(InputStream object, c c8) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream((InputStream)object, null, (BitmapFactory.Options)options);
        object = c8.i();
        object = c8.l() && this.b((String)object, options.outMimeType) ? this.d((String)object) : new a();
        return new b(new e(options.outWidth, options.outHeight, ((a)object).a), (a)object);
    }

    protected InputStream f(c c8) throws IOException {
        return c8.e().a(c8.i(), c8.f());
    }

    protected BitmapFactory.Options g(e e8, c c8) {
        int n8;
        d d8 = c8.h();
        if (d8 == d.q) {
            n8 = 1;
        } else if (d8 == d.c0) {
            n8 = ax.ka.b.c(e8);
        } else {
            e e9 = c8.j();
            boolean bl = d8 == d.d0;
            n8 = ax.ka.b.a(e8, e9, c8.k(), bl);
        }
        if (n8 > 1 && this.a) {
            ax.ka.d.a("Subsample original image (%1$s) to %2$s (scale = %3$d) [%4$s]", e8, e8.d(n8), n8, c8.g());
        }
        e8 = c8.d();
        ((BitmapFactory.Options)e8).inSampleSize = n8;
        return e8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected InputStream h(InputStream inputStream, c c8) throws IOException {
        if (inputStream.markSupported()) {
            try {
                inputStream.reset();
                return inputStream;
            }
            catch (IOException iOException) {}
        }
        ax.ka.c.a(inputStream);
        return this.f(c8);
    }

    protected static class a {
        public final int a;
        public final boolean b;

        protected a() {
            this.a = 0;
            this.b = false;
        }

        protected a(int n8, boolean bl) {
            this.a = n8;
            this.b = bl;
        }
    }

    protected static class b {
        public final e a;
        public final a b;

        protected b(e e8, a a8) {
            this.a = e8;
            this.b = a8;
        }
    }
}

