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

/* renamed from: ax.m2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2513c {
    @SuppressLint({"LambdaLast"})
    public static final void a(ReadableByteChannel readableByteChannel, FileChannel fileChannel) throws IOException {
        ReadableByteChannel readableByteChannel2;
        FileChannel fileChannel2;
        l.f(readableByteChannel, "input");
        l.f(fileChannel, "output");
        try {
        } catch (Throwable th) {
            th = th;
            readableByteChannel2 = readableByteChannel;
            fileChannel2 = fileChannel;
        }
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                readableByteChannel2 = readableByteChannel;
                fileChannel2 = fileChannel;
                InputStream newInputStream = Channels.newInputStream(readableByteChannel2);
                OutputStream newOutputStream = Channels.newOutputStream(fileChannel2);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    } else {
                        newOutputStream.write(bArr, 0, read);
                    }
                }
            } else {
                readableByteChannel2 = readableByteChannel;
                fileChannel2 = fileChannel;
                fileChannel2.transferFrom(readableByteChannel2, 0L, Long.MAX_VALUE);
            }
            fileChannel2.force(false);
            readableByteChannel2.close();
            fileChannel2.close();
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            readableByteChannel2.close();
            fileChannel2.close();
            throw th3;
        }
    }
}
