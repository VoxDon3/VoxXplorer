package ax.i7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ax.i7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2278b implements i {
    private String a;
    private boolean b = true;

    public AbstractC2278b(String str) {
        g(str);
    }

    @Override // ax.i7.i
    public String a() {
        return this.a;
    }

    @Override // ax.m7.y
    public void b(OutputStream outputStream) throws IOException {
        ax.m7.l.c(e(), outputStream, this.b);
        outputStream.flush();
    }

    public final boolean d() {
        return this.b;
    }

    public abstract InputStream e() throws IOException;

    public AbstractC2278b f(boolean z) {
        this.b = z;
        return this;
    }

    public AbstractC2278b g(String str) {
        this.a = str;
        return this;
    }
}
