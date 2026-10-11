/*
 * Decompiled with CFR 0.152.
 */
package ax.W9;

import android.graphics.Bitmap;
import ax.ka.c;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class a
implements ax.V9.a {
    public static final Bitmap.CompressFormat g = Bitmap.CompressFormat.PNG;
    protected final File a;
    protected final File b;
    protected final ax.Y9.a c;
    protected int d = 32768;
    protected Bitmap.CompressFormat e = g;
    protected int f = 100;

    public a(File file, File file2, ax.Y9.a a8) {
        if (file != null) {
            if (a8 != null) {
                this.a = file;
                this.b = file2;
                this.c = a8;
                return;
            }
            throw new IllegalArgumentException("fileNameGenerator argument must be not null");
        }
        throw new IllegalArgumentException("cacheDir argument must be not null");
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     */
    @Override
    public boolean a(String object, InputStream inputStream, c.a a8) throws IOException {
        RuntimeException var1_4;
        boolean bl;
        boolean bl2;
        File file;
        File file2;
        block11: {
            block10: {
                file2 = this.c((String)object);
                object = new StringBuilder();
                ((StringBuilder)object).append(file2.getAbsolutePath());
                ((StringBuilder)object).append(".tmp");
                file = new File(((StringBuilder)object).toString());
                bl2 = false;
                boolean bl3 = false;
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                object = new BufferedOutputStream(fileOutputStream, this.d);
                bl = ax.ka.c.b(inputStream, (OutputStream)object, a8, this.d);
                try {
                    ax.ka.c.a((Closeable)object);
                    if (bl && !file.renameTo(file2)) {
                        bl = bl3;
                    }
                    if (bl) break block10;
                    file.delete();
                }
                catch (Throwable throwable) {}
            }
            return bl;
            break block11;
            catch (Throwable throwable) {
                try {
                    ax.ka.c.a((Closeable)object);
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    bl = false;
                }
            }
        }
        if (bl && !file.renameTo(file2)) {
            bl = bl2;
        }
        if (!bl) {
            file.delete();
        }
        throw var1_4;
    }

    @Override
    public boolean b(String object, Bitmap bitmap) throws IOException {
        boolean bl;
        object = this.c((String)object);
        Comparable<StringBuilder> comparable = new StringBuilder();
        ((StringBuilder)comparable).append(((File)object).getAbsolutePath());
        ((StringBuilder)comparable).append(".tmp");
        comparable = new File(((StringBuilder)comparable).toString());
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream((File)comparable), this.d);
        try {
            bl = bitmap.compress(this.e, this.f, (OutputStream)bufferedOutputStream);
        }
        catch (Throwable throwable) {
            ax.ka.c.a(bufferedOutputStream);
            ((File)comparable).delete();
            throw throwable;
        }
        ax.ka.c.a(bufferedOutputStream);
        boolean bl2 = bl;
        if (bl) {
            bl2 = bl;
            if (!((File)comparable).renameTo((File)object)) {
                bl2 = false;
            }
        }
        if (!bl2) {
            ((File)comparable).delete();
        }
        bitmap.recycle();
        return bl2;
    }

    protected File c(String object) {
        String string;
        block2: {
            block3: {
                string = this.c.a((String)object);
                File file = this.a;
                object = file;
                if (file.exists()) break block2;
                object = file;
                if (this.a.mkdirs()) break block2;
                File file2 = this.b;
                object = file;
                if (file2 == null) break block2;
                if (file2.exists()) break block3;
                object = file;
                if (!this.b.mkdirs()) break block2;
            }
            object = this.b;
        }
        return new File((File)object, string);
    }

    @Override
    public void close() {
    }

    public void d(Bitmap.CompressFormat compressFormat) {
        this.e = compressFormat;
    }

    @Override
    public File i(String string) {
        return this.c(string);
    }
}

