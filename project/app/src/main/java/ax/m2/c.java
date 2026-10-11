/*
 * Decompiled with CFR 0.152.
 */
package ax.m2;

import android.annotation.SuppressLint;
import android.os.Build;
import ax.Gb.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public final class c {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"LambdaLast"})
    public static final void a(ReadableByteChannel readableByteChannel, FileChannel fileChannel) throws IOException {
        RuntimeException var3_4;
        block6: {
            block7: {
                int n8;
                block5: {
                    l.f(readableByteChannel, "input");
                    l.f(fileChannel, "output");
                    try {
                        n8 = Build.VERSION.SDK_INT;
                        if (n8 <= 23) break block5;
                    }
                    catch (Throwable throwable) {
                        break block6;
                    }
                    try {
                        fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
                        break block7;
                    }
                    catch (Throwable throwable) {
                        break block6;
                    }
                }
                InputStream inputStream = Channels.newInputStream(readableByteChannel);
                OutputStream outputStream = Channels.newOutputStream(fileChannel);
                byte[] byArray = new byte[4096];
                while ((n8 = inputStream.read(byArray)) > 0) {
                    outputStream.write(byArray, 0, n8);
                }
            }
            fileChannel.force(false);
            readableByteChannel.close();
            fileChannel.close();
            return;
        }
        readableByteChannel.close();
        fileChannel.close();
        throw var3_4;
    }
}

