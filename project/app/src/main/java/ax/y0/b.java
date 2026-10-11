/*
 * Decompiled with CFR 0.152.
 */
package ax.y0;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class b {
    static void a(FileDescriptor fileDescriptor) {
        try {
            Os.close((FileDescriptor)fileDescriptor);
            return;
        }
        catch (ErrnoException errnoException) {
            Log.e((String)"ExifInterfaceUtils", (String)"Error closing fd.", (Throwable)errnoException);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void b(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (Exception exception) {
            return;
        }
    }

    static long[] c(Object object) {
        if (object instanceof int[]) {
            int[] nArray = (int[])object;
            object = new long[nArray.length];
            for (int i8 = 0; i8 < nArray.length; ++i8) {
                object[i8] = (long)nArray[i8];
            }
            return object;
        }
        if (object instanceof long[]) {
            return (long[])object;
        }
        return null;
    }

    static int d(InputStream inputStream, OutputStream outputStream) throws IOException {
        int n8;
        byte[] byArray = new byte[8192];
        int n9 = 0;
        while ((n8 = inputStream.read(byArray)) != -1) {
            n9 += n8;
            outputStream.write(byArray, 0, n8);
        }
        return n9;
    }

    static void e(InputStream inputStream, OutputStream outputStream, int n8) throws IOException {
        byte[] byArray = new byte[8192];
        while (n8 > 0) {
            int n9 = Math.min(n8, 8192);
            int n10 = inputStream.read(byArray, 0, n9);
            if (n10 == n9) {
                n8 -= n10;
                outputStream.write(byArray, 0, n10);
                continue;
            }
            throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
        }
    }

    static long f(String string) {
        long l8;
        int n8;
        try {
            l8 = Long.parseLong(string.substring(0, n8));
        }
        catch (NumberFormatException numberFormatException) {
            return 0L;
        }
        for (n8 = Math.min(string.length(), 3); n8 < 3; ++n8) {
            l8 *= 10L;
        }
        return l8;
    }

    static boolean g(byte[] byArray, byte[] byArray2) {
        if (byArray != null && byArray2 != null) {
            if (byArray.length < byArray2.length) {
                return false;
            }
            for (int i8 = 0; i8 < byArray2.length; ++i8) {
                if (byArray[i8] == byArray2[i8]) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    static class a {
        static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }
}

