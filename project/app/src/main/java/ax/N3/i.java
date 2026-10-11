/*
 * Decompiled with CFR 0.152.
 */
package ax.N3;

import ax.N3.c;
import ax.Q3.b;
import ax.X3.l;
import java.io.IOException;
import java.io.InputStream;

public final class i
implements c<InputStream> {
    private final l a;

    i(InputStream inputStream, b b8) {
        inputStream = new l(inputStream, b8);
        this.a = inputStream;
        ((l)inputStream).mark(0x500000);
    }

    @Override
    public void b() {
        this.a.c();
    }

    public InputStream c() throws IOException {
        this.a.reset();
        return this.a;
    }

    public static final class a
    implements c.a<InputStream> {
        private final b a;

        public a(b b8) {
            this.a = b8;
        }

        @Override
        public Class<InputStream> a() {
            return InputStream.class;
        }

        public c<InputStream> c(InputStream inputStream) {
            return new i(inputStream, this.a);
        }
    }
}

