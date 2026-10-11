package ax.m7;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public interface t {
    <T> T a(InputStream inputStream, Charset charset, Class<T> cls) throws IOException;
}
