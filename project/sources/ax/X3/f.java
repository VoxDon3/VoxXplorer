package ax.X3;

import android.graphics.Bitmap;
import ax.P3.s;
import ax.k4.C2397a;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class f implements ax.M3.k<ByteBuffer, Bitmap> {
    private final i a;

    public f(i iVar) {
        this.a = iVar;
    }

    @Override // ax.M3.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public s<Bitmap> a(ByteBuffer byteBuffer, int i, int i2, ax.M3.j jVar) throws IOException {
        return this.a.c(C2397a.e(byteBuffer), i, i2, jVar);
    }

    @Override // ax.M3.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, ax.M3.j jVar) throws IOException {
        return this.a.l(byteBuffer);
    }
}
