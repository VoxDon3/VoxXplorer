/*
 * Decompiled with CFR 0.152.
 */
package ax.b4;

import android.util.Log;
import ax.M3.f;
import ax.M3.g;
import ax.M3.j;
import ax.M3.k;
import ax.P3.s;
import ax.Q3.b;
import ax.b4.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public class i
implements k<InputStream, c> {
    public static final ax.M3.i<Boolean> d = ax.M3.i.f("com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.DisableAnimation", Boolean.FALSE);
    private final List<f> a;
    private final k<ByteBuffer, c> b;
    private final b c;

    public i(List<f> list, k<ByteBuffer, c> k8, b b8) {
        this.a = list;
        this.b = k8;
        this.c = b8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] byArray = new byte[16384];
            while (true) {
                int n8;
                if ((n8 = inputStream.read(byArray)) == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(byArray, 0, n8);
            }
        }
        catch (IOException iOException) {
            if (Log.isLoggable((String)"StreamGifDecoder", (int)5)) {
                Log.w((String)"StreamGifDecoder", (String)"Error reading data from stream", (Throwable)iOException);
            }
            return null;
        }
    }

    public s<c> c(InputStream object, int n8, int n9, j j8) throws IOException {
        if ((object = (Object)i.e((InputStream)object)) == null) {
            return null;
        }
        object = ByteBuffer.wrap((byte[])object);
        return this.b.a((ByteBuffer)object, n8, n9, j8);
    }

    public boolean d(InputStream inputStream, j j8) throws IOException {
        return j8.c(d) == false && g.b(this.a, inputStream, this.c) == f.a.c0;
    }
}

