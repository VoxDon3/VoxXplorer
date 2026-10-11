package ax.a7;

import android.annotation.TargetApi;
import android.util.JsonReader;
import android.util.JsonWriter;
import ax.l7.AbstractC2475c;
import ax.l7.AbstractC2476d;
import ax.l7.AbstractC2478f;
import ax.m7.C2530e;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;

@TargetApi(11)
/* renamed from: ax.a7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1427a extends AbstractC2475c {
    public C1427a() {
        ax.Z6.a.a(11);
    }

    @Override // ax.l7.AbstractC2475c
    public AbstractC2476d a(OutputStream outputStream, Charset charset) {
        return i(new OutputStreamWriter(outputStream, charset));
    }

    @Override // ax.l7.AbstractC2475c
    public AbstractC2478f b(InputStream inputStream) {
        return j(new InputStreamReader(inputStream, C2530e.a));
    }

    @Override // ax.l7.AbstractC2475c
    public AbstractC2478f c(InputStream inputStream, Charset charset) {
        return charset == null ? b(inputStream) : j(new InputStreamReader(inputStream, charset));
    }

    @Override // ax.l7.AbstractC2475c
    public AbstractC2478f d(String str) {
        return j(new StringReader(str));
    }

    public AbstractC2476d i(Writer writer) {
        return new C1428b(this, new JsonWriter(writer));
    }

    public AbstractC2478f j(Reader reader) {
        return new C1429c(this, new JsonReader(reader));
    }
}
