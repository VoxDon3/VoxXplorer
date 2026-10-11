package ax.X9;

import android.graphics.Bitmap;
import ax.X9.a;
import ax.ka.c;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class b implements ax.V9.a {
    public static final Bitmap.CompressFormat g = Bitmap.CompressFormat.PNG;
    protected a a;
    private File b;
    protected final ax.Y9.a c;
    protected int d = 32768;
    protected Bitmap.CompressFormat e = g;
    protected int f = 100;

    public b(File file, File file2, ax.Y9.a aVar, long j, int i) throws IOException {
        if (file == null) {
            throw new IllegalArgumentException("cacheDir argument must be not null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("cacheMaxSize argument must be positive number");
        }
        if (i < 0) {
            throw new IllegalArgumentException("cacheMaxFileCount argument must be positive number");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("fileNameGenerator argument must be not null");
        }
        long j2 = j == 0 ? Long.MAX_VALUE : j;
        int i2 = i == 0 ? SubsamplingScaleImageView.TILE_SIZE_AUTO : i;
        this.b = file2;
        this.c = aVar;
        d(file, file2, j2, i2);
    }

    private String c(String str) {
        return this.c.a(str);
    }

    private void d(File file, File file2, long j, int i) throws IOException {
        b bVar;
        try {
            this.a = a.L(file, 1, 1, j, i);
        } catch (IOException e) {
            ax.ka.d.c(e);
            if (file2 != null) {
                bVar = this;
                bVar.d(file2, null, j, i);
            } else {
                bVar = this;
            }
            if (bVar.a == null) {
                throw e;
            }
        }
    }

    @Override // ax.V9.a
    public boolean a(String str, InputStream inputStream, c.a aVar) throws IOException {
        a.c v = this.a.v(c(str));
        if (v == null) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(v.f(0), this.d);
        try {
            boolean b = ax.ka.c.b(inputStream, bufferedOutputStream, aVar, this.d);
            ax.ka.c.a(bufferedOutputStream);
            if (b) {
                v.e();
                return b;
            }
            v.a();
            return b;
        } catch (Throwable th) {
            ax.ka.c.a(bufferedOutputStream);
            v.a();
            throw th;
        }
    }

    @Override // ax.V9.a
    public boolean b(String str, Bitmap bitmap) throws IOException {
        a.c v = this.a.v(c(str));
        if (v == null) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(v.f(0), this.d);
        try {
            boolean compress = bitmap.compress(this.e, this.f, bufferedOutputStream);
            if (compress) {
                v.e();
                return compress;
            }
            v.a();
            return compress;
        } finally {
            ax.ka.c.a(bufferedOutputStream);
        }
    }

    @Override // ax.V9.a
    public void close() {
        try {
            this.a.close();
        } catch (IOException e) {
            ax.ka.d.c(e);
        }
        this.a = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [ax.X9.a$e] */
    @Override // ax.V9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.File i(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            ax.X9.a r1 = r3.a     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L22
            java.lang.String r4 = r3.c(r4)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L22
            ax.X9.a$e r4 = r1.F(r4)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L22
            if (r4 != 0) goto Le
            goto L13
        Le:
            r1 = 0
            java.io.File r0 = r4.a(r1)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
        L13:
            if (r4 == 0) goto L18
            r4.close()
        L18:
            return r0
        L19:
            r0 = move-exception
            goto L2d
        L1b:
            r1 = move-exception
            goto L24
        L1d:
            r4 = move-exception
            r2 = r0
            r0 = r4
            r4 = r2
            goto L2d
        L22:
            r1 = move-exception
            r4 = r0
        L24:
            ax.ka.d.c(r1)     // Catch: java.lang.Throwable -> L19
            if (r4 == 0) goto L2c
            r4.close()
        L2c:
            return r0
        L2d:
            if (r4 == 0) goto L32
            r4.close()
        L32:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X9.b.i(java.lang.String):java.io.File");
    }
}
