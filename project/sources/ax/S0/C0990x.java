package ax.S0;

import android.media.MediaFormat;
import ax.P0.C0901j;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: ax.S0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0990x {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void b(MediaFormat mediaFormat, C0901j c0901j) {
        if (c0901j != null) {
            d(mediaFormat, "color-transfer", c0901j.c);
            d(mediaFormat, "color-standard", c0901j.a);
            d(mediaFormat, "color-range", c0901j.b);
            a(mediaFormat, "hdr-static-info", c0901j.d);
        }
    }

    public static void c(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void d(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(list.get(i)));
        }
    }
}
