/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.i7.i;
import ax.m7.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class b
implements i {
    private String a;
    private boolean b = true;

    public b(String string) {
        this.g(string);
    }

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public void b(OutputStream outputStream) throws IOException {
        l.c(this.e(), outputStream, this.b);
        outputStream.flush();
    }

    public final boolean d() {
        return this.b;
    }

    public abstract InputStream e() throws IOException;

    public b f(boolean bl) {
        this.b = bl;
        return this;
    }

    public b g(String string) {
        this.a = string;
        return this;
    }
}

