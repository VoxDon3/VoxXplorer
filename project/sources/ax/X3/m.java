package ax.X3;

import android.graphics.Bitmap;
import ax.P3.s;
import ax.X3.i;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class m implements ax.M3.k<InputStream, Bitmap> {
    private final i a;
    private final ax.Q3.b b;

    static class a implements i.b {
        private final l a;
        private final ax.k4.c b;

        public a(l lVar, ax.k4.c cVar) {
            this.a = lVar;
            this.b = cVar;
        }

        @Override // ax.X3.i.b
        public void a(ax.Q3.d dVar, Bitmap bitmap) throws IOException {
            IOException a = this.b.a();
            if (a != null) {
                if (bitmap == null) {
                    throw a;
                }
                dVar.c(bitmap);
                throw a;
            }
        }

        @Override // ax.X3.i.b
        public void b() {
            this.a.b();
        }
    }

    public m(i iVar, ax.Q3.b bVar) {
        this.a = iVar;
        this.b = bVar;
    }

    @Override // ax.M3.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public s<Bitmap> a(InputStream inputStream, int i, int i2, ax.M3.j jVar) throws IOException {
        l lVar;
        boolean z;
        if (inputStream instanceof l) {
            lVar = (l) inputStream;
            z = false;
        } else {
            lVar = new l(inputStream, this.b);
            z = true;
        }
        ax.k4.c b = ax.k4.c.b(lVar);
        try {
            s<Bitmap> d = this.a.d(new ax.k4.f(b), i, i2, jVar, new a(lVar, b));
            b.c();
            if (z) {
                lVar.c();
            }
            return d;
        } finally {
        }
    }

    @Override // ax.M3.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, ax.M3.j jVar) throws IOException {
        return this.a.k(inputStream);
    }
}
