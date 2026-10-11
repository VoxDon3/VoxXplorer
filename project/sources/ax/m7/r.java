package ax.m7;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class r implements y {
    private final y a;
    private final int b;
    private final Level c;
    private final Logger d;

    public r(y yVar, Logger logger, Level level, int i) {
        this.a = yVar;
        this.d = logger;
        this.c = level;
        this.b = i;
    }

    @Override // ax.m7.y
    public void b(OutputStream outputStream) throws IOException {
        q qVar = new q(outputStream, this.d, this.c, this.b);
        try {
            this.a.b(qVar);
            qVar.a().close();
            outputStream.flush();
        } catch (Throwable th) {
            qVar.a().close();
            throw th;
        }
    }
}
