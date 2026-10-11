package ax.de;

import ax.be.C1741i;
import ax.be.L;
import ax.be.N;
import ax.be.O;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

/* loaded from: classes3.dex */
public class a extends c {
    public static boolean b(b bVar, b bVar2) {
        return bVar.a == bVar2.a;
    }

    private static b c(byte[] bArr, int i) throws L {
        if (bArr[i] == 0) {
            int i2 = i + 1;
            if ((bArr[i2] & 255) < 16) {
                b bVar = new b();
                bVar.a = bArr[i2];
                return bVar;
            }
        }
        throw new L();
    }

    public static b d(byte[] bArr) throws IOException {
        byte b = bArr[10];
        byte[] bArr2 = N.b;
        if (b != bArr2[0] || bArr[11] != bArr2[1]) {
            throw new C1741i("XZ Stream Footer is corrupt");
        }
        if (!g(bArr, 4, 6, 0)) {
            throw new C1741i("XZ Stream Footer is corrupt");
        }
        try {
            b c = c(bArr, 8);
            c.b = 0L;
            for (int i = 0; i < 4; i++) {
                c.b |= (bArr[i + 4] & 255) << (i * 8);
            }
            c.b = (c.b + 1) * 4;
            return c;
        } catch (L unused) {
            throw new L("Unsupported options in XZ Stream Footer");
        }
    }

    public static b e(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = N.a;
            if (i >= bArr2.length) {
                if (!g(bArr, bArr2.length, 2, bArr2.length + 2)) {
                    throw new C1741i("XZ Stream Header is corrupt");
                }
                try {
                    return c(bArr, bArr2.length);
                } catch (L unused) {
                    throw new L("Unsupported options in XZ Stream Header");
                }
            }
            if (bArr[i] != bArr2[i]) {
                throw new O();
            }
            i++;
        }
    }

    public static long f(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read == -1) {
            throw new EOFException();
        }
        long j = read & 127;
        int i = 0;
        while ((read & 128) != 0) {
            i++;
            if (i >= 9) {
                throw new C1741i();
            }
            read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            }
            if (read == 0) {
                throw new C1741i();
            }
            j |= (read & 127) << (i * 7);
        }
        return j;
    }

    public static boolean g(byte[] bArr, int i, int i2, int i3) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        long value = crc32.getValue();
        for (int i4 = 0; i4 < 4; i4++) {
            if (((byte) (value >>> (i4 * 8))) != bArr[i3 + i4]) {
                return false;
            }
        }
        return true;
    }
}
