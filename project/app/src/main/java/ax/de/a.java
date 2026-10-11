/*
 * Decompiled with CFR 0.152.
 */
package ax.de;

import ax.be.L;
import ax.be.N;
import ax.be.O;
import ax.be.i;
import ax.de.b;
import ax.de.c;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

public class a
extends c {
    public static boolean b(b b8, b b9) {
        return b8.a == b9.a;
    }

    private static b c(byte[] byArray, int n8) throws L {
        if (byArray[n8] == 0 && (byArray[++n8] & 0xFF) < 16) {
            b b8 = new b();
            b8.a = byArray[n8];
            return b8;
        }
        throw new L();
    }

    public static b d(byte[] byArray) throws IOException {
        byte by = byArray[10];
        Object object = N.b;
        if (by == object[0] && byArray[11] == object[1]) {
            if (a.g(byArray, 4, 6, 0)) {
                try {
                    object = a.c(byArray, 8);
                    object.b = 0L;
                }
                catch (L l8) {
                    throw new L("Unsupported options in XZ Stream Footer");
                }
                for (int i8 = 0; i8 < 4; ++i8) {
                    object.b |= (long)((byArray[i8 + 4] & 0xFF) << i8 * 8);
                }
                object.b = (object.b + 1L) * 4L;
                return object;
            }
            throw new i("XZ Stream Footer is corrupt");
        }
        throw new i("XZ Stream Footer is corrupt");
    }

    public static b e(byte[] object) throws IOException {
        byte[] byArray;
        for (int i8 = 0; i8 < (byArray = N.a).length; ++i8) {
            if (object[i8] == byArray[i8]) {
                continue;
            }
            throw new O();
        }
        if (a.g(object, byArray.length, 2, byArray.length + 2)) {
            try {
                object = a.c(object, byArray.length);
                return object;
            }
            catch (L l8) {
                throw new L("Unsupported options in XZ Stream Header");
            }
        }
        throw new i("XZ Stream Header is corrupt");
    }

    public static long f(InputStream inputStream) throws IOException {
        int n8 = inputStream.read();
        if (n8 != -1) {
            long l8 = n8 & 0x7F;
            int n9 = 0;
            while ((n8 & 0x80) != 0) {
                if (++n9 < 9) {
                    n8 = inputStream.read();
                    if (n8 != -1) {
                        if (n8 != 0) {
                            l8 |= (long)(n8 & 0x7F) << n9 * 7;
                            continue;
                        }
                        throw new i();
                    }
                    throw new EOFException();
                }
                throw new i();
            }
            return l8;
        }
        throw new EOFException();
    }

    public static boolean g(byte[] byArray, int n8, int n9, int n10) {
        CRC32 cRC32 = new CRC32();
        cRC32.update(byArray, n8, n9);
        long l8 = cRC32.getValue();
        for (n8 = 0; n8 < 4; ++n8) {
            if ((byte)(l8 >>> n8 * 8) == byArray[n10 + n8]) continue;
            return false;
        }
        return true;
    }
}

