package ax.ka;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class c {

    public interface a {
        boolean a(int i, int i2);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean b(InputStream inputStream, OutputStream outputStream, a aVar, int i) throws IOException {
        int available = inputStream.available();
        if (available <= 0) {
            available = 512000;
        }
        byte[] bArr = new byte[i];
        if (d(aVar, 0, available)) {
            return false;
        }
        int i2 = 0;
        do {
            int read = inputStream.read(bArr, 0, i);
            if (read == -1) {
                outputStream.flush();
                return true;
            }
            outputStream.write(bArr, 0, read);
            i2 += read;
        } while (!d(aVar, i2, available));
        return false;
    }

    public static void c(InputStream inputStream) {
        do {
            try {
            } catch (IOException unused) {
                return;
            } finally {
                a(inputStream);
            }
        } while (inputStream.read(new byte[32768], 0, 32768) != -1);
    }

    private static boolean d(a aVar, int i, int i2) {
        return (aVar == null || aVar.a(i, i2) || (i * 100) / i2 >= 75) ? false : true;
    }
}
