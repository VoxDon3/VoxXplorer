package ax.b4;

import android.util.Log;
import ax.M3.f;
import ax.M3.j;
import ax.M3.k;
import ax.P3.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public class i implements k<InputStream, c> {
    public static final ax.M3.i<Boolean> d = ax.M3.i.f("com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder.DisableAnimation", Boolean.FALSE);
    private final List<ax.M3.f> a;
    private final k<ByteBuffer, c> b;
    private final ax.Q3.b c;

    public i(List<ax.M3.f> list, k<ByteBuffer, c> kVar, ax.Q3.b bVar) {
        this.a = list;
        this.b = kVar;
        this.c = bVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e);
            return null;
        }
    }

    @Override // ax.M3.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public s<c> a(InputStream inputStream, int i, int i2, j jVar) throws IOException {
        byte[] e = e(inputStream);
        if (e == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(e), i, i2, jVar);
    }

    @Override // ax.M3.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, j jVar) throws IOException {
        return !((Boolean) jVar.c(d)).booleanValue() && ax.M3.g.b(this.a, inputStream, this.c) == f.a.GIF;
    }
}
