/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.media.MediaFormat;
import ax.P0.j;
import java.nio.ByteBuffer;
import java.util.List;

public final class x {
    public static void a(MediaFormat mediaFormat, String string, byte[] byArray) {
        if (byArray != null) {
            mediaFormat.setByteBuffer(string, ByteBuffer.wrap(byArray));
        }
    }

    public static void b(MediaFormat mediaFormat, j j8) {
        if (j8 != null) {
            x.d(mediaFormat, "color-transfer", j8.c);
            x.d(mediaFormat, "color-standard", j8.a);
            x.d(mediaFormat, "color-range", j8.b);
            x.a(mediaFormat, "hdr-static-info", j8.d);
        }
    }

    public static void c(MediaFormat mediaFormat, String string, float f8) {
        if (f8 != -1.0f) {
            mediaFormat.setFloat(string, f8);
        }
    }

    public static void d(MediaFormat mediaFormat, String string, int n8) {
        if (n8 != -1) {
            mediaFormat.setInteger(string, n8);
        }
    }

    public static void e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("csd-");
            stringBuilder.append(i8);
            mediaFormat.setByteBuffer(stringBuilder.toString(), ByteBuffer.wrap(list.get(i8)));
        }
    }
}

