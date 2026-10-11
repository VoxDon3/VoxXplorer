/*
 * Decompiled with CFR 0.152.
 */
package ax.X3;

import android.graphics.Bitmap;
import ax.M3.j;
import ax.M3.k;
import ax.P3.s;
import ax.Q3.b;
import ax.Q3.d;
import ax.X3.i;
import ax.X3.l;
import ax.k4.c;
import ax.k4.f;
import java.io.IOException;
import java.io.InputStream;

public class m
implements k<InputStream, Bitmap> {
    private final i a;
    private final b b;

    public m(i i8, b b8) {
        this.a = i8;
        this.b = b8;
    }

    public s<Bitmap> c(InputStream inputStream, int n8, int n9, j object) throws IOException {
        boolean bl;
        if (inputStream instanceof l) {
            inputStream = (l)inputStream;
            bl = false;
        } else {
            inputStream = new l(inputStream, this.b);
            bl = true;
        }
        c c8 = c.b(inputStream);
        f f8 = new f(c8);
        a a8 = new a((l)inputStream, c8);
        try {
            object = this.a.d(f8, n8, n9, (j)object, a8);
            return object;
        }
        finally {
            c8.c();
            if (bl) {
                ((l)inputStream).c();
            }
        }
    }

    public boolean d(InputStream inputStream, j j8) throws IOException {
        return this.a.k(inputStream);
    }

    static class a
    implements i.b {
        private final l a;
        private final c b;

        public a(l l8, c c8) {
            this.a = l8;
            this.b = c8;
        }

        @Override
        public void a(d d8, Bitmap bitmap) throws IOException {
            IOException iOException = this.b.a();
            if (iOException != null) {
                if (bitmap != null) {
                    d8.c(bitmap);
                }
                throw iOException;
            }
        }

        @Override
        public void b() {
            this.a.b();
        }
    }
}

