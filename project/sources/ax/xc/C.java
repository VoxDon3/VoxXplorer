package ax.xc;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface C extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(C3487e c3487e, long j) throws IOException;

    D timeout();
}
