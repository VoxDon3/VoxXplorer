/*
 * Decompiled with CFR 0.152.
 */
package ax.m7;

import ax.m7.q;
import ax.m7.y;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class r
implements y {
    private final y a;
    private final int b;
    private final Level c;
    private final Logger d;

    public r(y y8, Logger logger, Level level, int n8) {
        this.a = y8;
        this.d = logger;
        this.c = level;
        this.b = n8;
    }

    @Override
    public void b(OutputStream outputStream) throws IOException {
        q q8 = new q(outputStream, this.d, this.c, this.b);
        try {
            this.a.b(q8);
            outputStream.flush();
            return;
        }
        finally {
            q8.a().close();
        }
    }
}

