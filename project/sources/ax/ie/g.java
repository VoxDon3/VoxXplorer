package ax.ie;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class g extends e {
    private final OutputStream f;

    public g(OutputStream outputStream) {
        this.f = outputStream;
        l();
    }

    @Override // ax.ie.e
    void n(int i) throws IOException {
        this.f.write(i);
    }
}
