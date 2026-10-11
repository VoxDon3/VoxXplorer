/*
 * Decompiled with CFR 0.152.
 */
package ax.X9;

import android.graphics.Bitmap;
import ax.X9.a;
import ax.ka.c;
import ax.ka.d;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class b
implements ax.V9.a {
    public static final Bitmap.CompressFormat g = Bitmap.CompressFormat.PNG;
    protected a a;
    private File b;
    protected final ax.Y9.a c;
    protected int d = 32768;
    protected Bitmap.CompressFormat e = g;
    protected int f = 100;

    public b(File file, File file2, ax.Y9.a a8, long l8, int n8) throws IOException {
        if (file != null) {
            long l9 = l8 - 0L;
            long l10 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
            if (l10 >= 0) {
                if (n8 >= 0) {
                    if (a8 != null) {
                        if (l10 == false) {
                            l8 = Long.MAX_VALUE;
                        }
                        if (n8 == 0) {
                            n8 = Integer.MAX_VALUE;
                        }
                        this.b = file2;
                        this.c = a8;
                        this.d(file, file2, l8, n8);
                        return;
                    }
                    throw new IllegalArgumentException("fileNameGenerator argument must be not null");
                }
                throw new IllegalArgumentException("cacheMaxFileCount argument must be positive number");
            }
            throw new IllegalArgumentException("cacheMaxSize argument must be positive number");
        }
        throw new IllegalArgumentException("cacheDir argument must be not null");
    }

    private String c(String string) {
        return this.c.a(string);
    }

    private void d(File file, File file2, long l8, int n8) throws IOException {
        try {
            this.a = ax.X9.a.L(file, 1, 1, l8, n8);
            return;
        }
        catch (IOException iOException) {
            ax.ka.d.c(iOException);
            if (file2 != null) {
                this.d(file2, null, l8, n8);
            }
            if (this.a != null) {
                return;
            }
            throw iOException;
        }
    }

    @Override
    public boolean a(String object, InputStream inputStream, c.a a8) throws IOException {
        boolean bl;
        if ((object = this.a.v(this.c((String)object))) == null) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(((a.c)object).f(0), this.d);
        try {
            bl = ax.ka.c.b(inputStream, bufferedOutputStream, a8, this.d);
        }
        catch (Throwable throwable) {
            ax.ka.c.a(bufferedOutputStream);
            ((a.c)object).a();
            throw throwable;
        }
        ax.ka.c.a(bufferedOutputStream);
        if (bl) {
            ((a.c)object).e();
            return bl;
        }
        ((a.c)object).a();
        return bl;
    }

    @Override
    public boolean b(String object, Bitmap bitmap) throws IOException {
        a.c c8 = this.a.v(this.c((String)object));
        if (c8 == null) {
            return false;
        }
        object = new BufferedOutputStream(c8.f(0), this.d);
        try {
            boolean bl = bitmap.compress(this.e, this.f, (OutputStream)object);
            if (bl) {
                c8.e();
                return bl;
            }
            c8.a();
            return bl;
        }
        finally {
            ax.ka.c.a((Closeable)object);
        }
    }

    @Override
    public void close() {
        try {
            this.a.close();
        }
        catch (IOException iOException) {
            ax.ka.d.c(iOException);
        }
        this.a = null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public File i(String object) {
        RuntimeException var2_9;
        block14: {
            a.e e8;
            block15: {
                block12: {
                    File file;
                    block13: {
                        file = null;
                        e8 = this.a.F(this.c((String)object));
                        if (e8 == null) {
                            object = file;
                            break block12;
                        }
                        object = e8;
                        try {}
                        catch (IOException iOException) {}
                        finally {
                            break block13;
                        }
                        catch (Throwable throwable) {
                            object = null;
                            break block14;
                        }
                        catch (IOException iOException) {
                            e8 = null;
                            break block15;
                        }
                    }
                    file = e8.a(0);
                    object = file;
                }
                if (e8 != null) {
                    e8.close();
                }
                return object;
            }
            object = e8;
            {
                Throwable var3_5;
                ax.ka.d.c((Throwable)var3_5);
                if (e8 != null) {
                    e8.close();
                }
                return null;
            }
        }
        if (object != null) {
            ((a.e)object).close();
        }
        throw var2_9;
    }
}

