/*
 * Decompiled with CFR 0.152.
 */
package ax.x4;

import ax.p4.f;
import ax.p4.j;
import ax.p4.o;
import java.io.IOException;
import java.io.InputStream;

public abstract class e<R, E, X extends f> {
    public abstract o<R, E, X> a() throws j;

    public R b(InputStream inputStream) throws X, j, IOException {
        return this.a().d(inputStream);
    }

    public R c(InputStream inputStream, long l8) throws X, j, IOException {
        return this.a().e(inputStream, l8);
    }
}

