/*
 * Decompiled with CFR 0.152.
 */
package ax.a7;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonWriter;
import ax.a7.b;
import ax.a7.c;
import ax.l7.d;
import ax.l7.f;
import ax.m7.e;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;

@TargetApi(value=11)
public class a
extends ax.l7.c {
    public a() {
        ax.Z6.a.a(11);
    }

    @Override
    public d a(OutputStream outputStream, Charset charset) {
        return this.i(new OutputStreamWriter(outputStream, charset));
    }

    @Override
    public f b(InputStream inputStream) {
        return this.j(new InputStreamReader(inputStream, e.a));
    }

    @Override
    public f c(InputStream inputStream, Charset charset) {
        if (charset == null) {
            return this.b(inputStream);
        }
        return this.j(new InputStreamReader(inputStream, charset));
    }

    @Override
    public f d(String string) {
        return this.j(new StringReader(string));
    }

    public d i(Writer writer) {
        return new b(this, new JsonWriter(writer));
    }

    public f j(Reader reader) {
        return new c(this, new JsonReader(reader));
    }
}

