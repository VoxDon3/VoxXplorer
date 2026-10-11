package ax.Dc;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: ax.Dc.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C0669d extends ax.Kc.b {
    C0669d(InputStream inputStream) {
        super(inputStream, ByteOrder.LITTLE_ENDIAN);
    }

    int o() throws IOException {
        return (int) j(1);
    }

    long p(int i) throws IOException {
        if (i >= 0 && i <= 8) {
            return j(i);
        }
        throw new IOException("Trying to read " + i + " bits, at most 8 are allowed");
    }

    int q() throws IOException {
        return (int) j(8);
    }
}
