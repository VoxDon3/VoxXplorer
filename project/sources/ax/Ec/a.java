package ax.Ec;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public abstract class a extends InputStream implements InputStreamRetargetInterface {
    private long q;

    protected void b(int i) {
        c(i);
    }

    protected void c(long j) {
        if (j != -1) {
            this.q += j;
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
