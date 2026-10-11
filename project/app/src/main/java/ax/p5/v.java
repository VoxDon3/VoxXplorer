/*
 * Decompiled with CFR 0.152.
 */
package ax.p5;

import android.content.Context;
import ax.p5.u;
import ax.x5.d;
import java.io.Closeable;
import java.io.IOException;

abstract class v
implements Closeable,
AutoCloseable {
    v() {
    }

    abstract d a();

    abstract u b();

    @Override
    public void close() throws IOException {
        this.a().close();
    }

    static interface a {
        public a a(Context var1);

        public v g();
    }
}

