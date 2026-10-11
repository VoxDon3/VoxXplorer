package ax.Wc;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
abstract class Y0 extends InputStream implements InputStreamRetargetInterface {
    private int c0;
    protected final InputStream q;

    Y0(InputStream inputStream, int i) {
        this.q = inputStream;
        this.c0 = i;
    }

    int a() {
        return this.c0;
    }

    protected void b(boolean z) {
        InputStream inputStream = this.q;
        if (inputStream instanceof V0) {
            ((V0) inputStream).d(z);
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
