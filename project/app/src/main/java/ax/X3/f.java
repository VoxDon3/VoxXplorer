/*
 * Decompiled with CFR 0.152.
 */
package ax.X3;

import android.graphics.Bitmap;
import ax.M3.j;
import ax.M3.k;
import ax.P3.s;
import ax.X3.i;
import ax.k4.a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class f
implements k<ByteBuffer, Bitmap> {
    private final i a;

    public f(i i8) {
        this.a = i8;
    }

    public s<Bitmap> c(ByteBuffer object, int n8, int n9, j j8) throws IOException {
        object = ax.k4.a.e((ByteBuffer)object);
        return this.a.c((InputStream)object, n8, n9, j8);
    }

    public boolean d(ByteBuffer byteBuffer, j j8) throws IOException {
        return this.a.l(byteBuffer);
    }
}

