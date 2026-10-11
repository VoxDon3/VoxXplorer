package ax.xc;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: ax.xc.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3482A extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    void close() throws IOException;

    void flush() throws IOException;

    D timeout();

    void write(C3487e c3487e, long j) throws IOException;
}
