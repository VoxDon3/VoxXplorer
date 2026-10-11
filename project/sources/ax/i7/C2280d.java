package ax.i7;

import ax.s7.C3055b;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ax.i7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2280d extends FilterInputStream implements InputStreamRetargetInterface, AutoCloseable {
    private boolean q;

    C2280d(InputStream inputStream) {
        super(inputStream);
        this.q = false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.q || ((FilterInputStream) this).in == null) {
            return;
        }
        try {
            C3055b.c(this);
            ((FilterInputStream) this).in.close();
        } finally {
            this.q = true;
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
