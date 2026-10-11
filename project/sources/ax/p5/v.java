package ax.p5;

import android.content.Context;
import ax.x5.InterfaceC3444d;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
abstract class v implements Closeable, AutoCloseable {

    interface a {
        a a(Context context);

        v g();
    }

    v() {
    }

    abstract InterfaceC3444d a();

    abstract u b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}
