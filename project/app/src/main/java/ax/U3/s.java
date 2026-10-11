/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import android.util.Log;
import ax.M3.d;
import ax.M3.j;
import ax.Q3.b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class s
implements d<InputStream> {
    private final b a;

    public s(b b8) {
        this.a = b8;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean c(InputStream closeable, File file, j object) {
        RuntimeException var1_4;
        byte[] byArray;
        block18: {
            boolean bl;
            block17: {
                block15: {
                    block16: {
                        byArray = this.a.d(65536, byte[].class);
                        bl = false;
                        Object var7_15 = null;
                        Object var8_16 = null;
                        object = var8_16;
                        object = var8_16;
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            int n8;
                            while ((n8 = ((InputStream)closeable).read(byArray)) != -1) {
                                ((OutputStream)fileOutputStream).write(byArray, 0, n8);
                            }
                        }
                        catch (Throwable throwable) {
                            object = fileOutputStream;
                            break block15;
                        }
                        catch (IOException iOException) {
                            closeable = fileOutputStream;
                            break block16;
                        }
                        ((OutputStream)fileOutputStream).close();
                        try {
                            ((OutputStream)fileOutputStream).close();
                        }
                        catch (IOException iOException) {}
                        this.a.c(byArray, byte[].class);
                        return true;
                        catch (Throwable throwable) {
                            break block15;
                        }
                        catch (IOException iOException) {
                            closeable = var7_15;
                        }
                    }
                    object = closeable;
                    {
                        if (Log.isLoggable((String)"StreamEncoder", (int)3)) {
                            Throwable var2_10;
                            object = closeable;
                            Log.d((String)"StreamEncoder", (String)"Failed to encode data onto the OutputStream", (Throwable)var2_10);
                        }
                        if (closeable == null) break block17;
                    }
                    try {
                        ((OutputStream)closeable).close();
                        break block17;
                    }
                    catch (IOException iOException) {}
                }
                if (object == null) break block18;
                try {
                    ((OutputStream)object).close();
                    break block18;
                }
                catch (IOException iOException) {}
            }
            this.a.c(byArray, byte[].class);
            return bl;
        }
        this.a.c(byArray, byte[].class);
        throw var1_4;
    }
}

