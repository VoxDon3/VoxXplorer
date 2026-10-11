/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import ax.P0.E;
import ax.y0.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c {
    public static Bitmap a(byte[] object, int n8, BitmapFactory.Options options, int n9) throws IOException {
        Object object2;
        Object object3 = options;
        if (n9 != -1) {
            object2 = options;
            if (options == null) {
                object2 = new BitmapFactory.Options();
            }
            ((BitmapFactory.Options)object2).inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)n8, (BitmapFactory.Options)object2);
            int n10 = Math.max(((BitmapFactory.Options)object2).outWidth, ((BitmapFactory.Options)object2).outHeight);
            ((BitmapFactory.Options)object2).inJustDecodeBounds = false;
            ((BitmapFactory.Options)object2).inSampleSize = 1;
            while (true) {
                object3 = object2;
                if (n10 <= n9) break;
                ((BitmapFactory.Options)object2).inSampleSize *= 2;
                n10 /= 2;
            }
        }
        options = BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)n8, (BitmapFactory.Options)object3);
        if (object3 != null) {
            object3.inSampleSize = 1;
        }
        if (options != null) {
            block10: {
                object = new ByteArrayInputStream((byte[])object);
                object2 = new a((InputStream)object);
                n8 = ((a)object2).y();
                if (n8 == 0) break block10;
                object = new Matrix();
                object.postRotate((float)n8);
                return Bitmap.createBitmap((Bitmap)options, (int)0, (int)0, (int)options.getWidth(), (int)options.getHeight(), (Matrix)object, (boolean)false);
            }
            return options;
            finally {
                ((InputStream)object).close();
            }
        }
        throw E.a("Could not decode image data", new IllegalStateException());
    }
}

