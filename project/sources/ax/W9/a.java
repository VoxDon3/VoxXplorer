package ax.W9;

import android.graphics.Bitmap;
import ax.ka.c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class a implements ax.V9.a {
    public static final Bitmap.CompressFormat g = Bitmap.CompressFormat.PNG;
    protected final File a;
    protected final File b;
    protected final ax.Y9.a c;
    protected int d = 32768;
    protected Bitmap.CompressFormat e = g;
    protected int f = 100;

    public a(File file, File file2, ax.Y9.a aVar) {
        if (file == null) {
            throw new IllegalArgumentException("cacheDir argument must be not null");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("fileNameGenerator argument must be not null");
        }
        this.a = file;
        this.b = file2;
        this.c = aVar;
    }

    @Override // ax.V9.a
    public boolean a(String str, InputStream inputStream, c.a aVar) throws IOException {
        boolean z;
        File c = c(str);
        File file = new File(c.getAbsolutePath() + ".tmp");
        try {
            try {
                z = c.b(inputStream, new BufferedOutputStream(new FileOutputStream(file), this.d), aVar, this.d);
                try {
                    boolean z2 = (!z || file.renameTo(c)) ? z : false;
                    if (!z2) {
                        file.delete();
                    }
                    return z2;
                } catch (Throwable th) {
                    th = th;
                    if (!((!z || file.renameTo(c)) ? z : false)) {
                        file.delete();
                    }
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    @Override // ax.V9.a
    public boolean b(String str, Bitmap bitmap) throws IOException {
        File c = c(str);
        File file = new File(c.getAbsolutePath() + ".tmp");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), this.d);
        try {
            boolean compress = bitmap.compress(this.e, this.f, bufferedOutputStream);
            c.a(bufferedOutputStream);
            if (compress && !file.renameTo(c)) {
                compress = false;
            }
            if (!compress) {
                file.delete();
            }
            bitmap.recycle();
            return compress;
        } catch (Throwable th) {
            c.a(bufferedOutputStream);
            file.delete();
            throw th;
        }
    }

    protected File c(String str) {
        File file;
        String a = this.c.a(str);
        File file2 = this.a;
        if (!file2.exists() && !this.a.mkdirs() && (file = this.b) != null && (file.exists() || this.b.mkdirs())) {
            file2 = this.b;
        }
        return new File(file2, a);
    }

    public void d(Bitmap.CompressFormat compressFormat) {
        this.e = compressFormat;
    }

    @Override // ax.V9.a
    public File i(String str) {
        return c(str);
    }

    @Override // ax.V9.a
    public void close() {
    }
}
