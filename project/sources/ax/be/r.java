package ax.be;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class r implements Cloneable {
    r() {
    }

    public InputStream b(InputStream inputStream) throws IOException {
        return c(inputStream, C1735c.b());
    }

    public abstract InputStream c(InputStream inputStream, C1735c c1735c) throws IOException;

    public s d(s sVar) {
        return f(sVar, C1735c.b());
    }

    public abstract s f(s sVar, C1735c c1735c);
}
