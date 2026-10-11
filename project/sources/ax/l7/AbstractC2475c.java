package ax.l7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: ax.l7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2475c {
    private ByteArrayOutputStream e(Object obj, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AbstractC2476d a = a(byteArrayOutputStream, StandardCharsets.UTF_8);
        if (z) {
            a.a();
        }
        a.b(obj);
        a.flush();
        return byteArrayOutputStream;
    }

    private String h(Object obj, boolean z) throws IOException {
        return e(obj, z).toString("UTF-8");
    }

    public abstract AbstractC2476d a(OutputStream outputStream, Charset charset) throws IOException;

    public abstract AbstractC2478f b(InputStream inputStream) throws IOException;

    public abstract AbstractC2478f c(InputStream inputStream, Charset charset) throws IOException;

    public abstract AbstractC2478f d(String str) throws IOException;

    public final String f(Object obj) throws IOException {
        return h(obj, true);
    }

    public final String g(Object obj) throws IOException {
        return h(obj, false);
    }
}
