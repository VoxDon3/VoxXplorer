/*
 * Decompiled with CFR 0.152.
 */
package ax.c4;

import android.graphics.Bitmap;
import ax.P3.s;
import ax.Y3.b;
import ax.c4.d;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class a
implements d<Bitmap, byte[]> {
    private final Bitmap.CompressFormat a;
    private final int b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public a(Bitmap.CompressFormat compressFormat, int n8) {
        this.a = compressFormat;
        this.b = n8;
    }

    @Override
    public s<byte[]> a(s<Bitmap> s8) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        s8.get().compress(this.a, this.b, (OutputStream)byteArrayOutputStream);
        s8.recycle();
        return new b(byteArrayOutputStream.toByteArray());
    }
}

