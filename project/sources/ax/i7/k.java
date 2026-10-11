package ax.i7;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class k implements ax.m7.y {
    private final ax.m7.y a;
    private final j b;

    public k(ax.m7.y yVar, j jVar) {
        this.a = (ax.m7.y) ax.m7.v.d(yVar);
        this.b = (j) ax.m7.v.d(jVar);
    }

    @Override // ax.m7.y
    public void b(OutputStream outputStream) throws IOException {
        this.b.a(this.a, outputStream);
    }
}
