package ax.be;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ax.be.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1740h extends FilterInputStream implements InputStreamRetargetInterface, AutoCloseable {
    public C1740h(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
