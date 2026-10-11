package ax.M3;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface f {

    public enum a {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);

        private final boolean q;

        a(boolean z) {
            this.q = z;
        }

        public boolean d() {
            return this.q;
        }
    }

    a a(ByteBuffer byteBuffer) throws IOException;

    int b(InputStream inputStream, ax.Q3.b bVar) throws IOException;

    a c(InputStream inputStream) throws IOException;
}
