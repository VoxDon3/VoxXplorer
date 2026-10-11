/*
 * Decompiled with CFR 0.152.
 */
package ax.X7;

import ax.U7.b;
import ax.U7.c;
import ax.U7.g;
import ax.X7.f;
import java.io.IOException;

class i
implements g {
    private boolean a = false;
    private boolean b = false;
    private c c;
    private final f d;

    i(f f8) {
        this.d = f8;
    }

    private void a() {
        if (!this.a) {
            this.a = true;
            return;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }

    void b(c c8, boolean bl) {
        this.a = false;
        this.c = c8;
        this.b = bl;
    }

    @Override
    public g f(String string) throws IOException {
        this.a();
        this.d.i(this.c, string, this.b);
        return this;
    }

    @Override
    public g g(boolean bl) throws IOException {
        this.a();
        this.d.o(this.c, bl, this.b);
        return this;
    }
}

