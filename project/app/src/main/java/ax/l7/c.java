/*
 * Decompiled with CFR 0.152.
 */
package ax.l7;

import ax.l7.d;
import ax.l7.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public abstract class c {
    private ByteArrayOutputStream e(Object object, boolean bl) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d d8 = this.a(byteArrayOutputStream, StandardCharsets.UTF_8);
        if (bl) {
            d8.a();
        }
        d8.b(object);
        d8.flush();
        return byteArrayOutputStream;
    }

    private String h(Object object, boolean bl) throws IOException {
        return this.e(object, bl).toString("UTF-8");
    }

    public abstract d a(OutputStream var1, Charset var2) throws IOException;

    public abstract f b(InputStream var1) throws IOException;

    public abstract f c(InputStream var1, Charset var2) throws IOException;

    public abstract f d(String var1) throws IOException;

    public final String f(Object object) throws IOException {
        return this.h(object, true);
    }

    public final String g(Object object) throws IOException {
        return this.h(object, false);
    }
}

