/*
 * Decompiled with CFR 0.152.
 */
package ax.fe;

import ax.be.P;
import ax.be.i;
import ax.ce.c;
import ax.ce.e;
import ax.fe.a;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

public class b
extends a {
    private c f;

    public b() {
        super(new i());
        try {
            e e8 = new e();
            this.f = e8;
            return;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            this.f = new ax.ce.a();
            return;
        }
    }

    @Override
    public void a(long l8, long l9) throws P {
        super.a(l8, l9);
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putLong(l8);
        byteBuffer.putLong(l9);
        this.f.e(byteBuffer.array());
    }

    public void f(InputStream object) throws IOException {
        CRC32 cRC32 = new CRC32();
        int n8 = 0;
        cRC32.update(0);
        CheckedInputStream checkedInputStream = new CheckedInputStream((InputStream)object, cRC32);
        if (ax.de.a.f(checkedInputStream) == this.e) {
            long l8;
            object = new b();
            for (l8 = 0L; l8 < this.e; ++l8) {
                block9: {
                    long l9 = ax.de.a.f(checkedInputStream);
                    long l10 = ax.de.a.f(checkedInputStream);
                    try {
                        ((b)object).a(l9, l10);
                        if (((a)object).b > this.b || ((a)object).c > this.c || ((a)object).d > this.d) break block9;
                        continue;
                    }
                    catch (P p8) {
                        throw new i("XZ Index is corrupt");
                    }
                }
                throw new i("XZ Index is corrupt");
            }
            if (((a)object).b == this.b && ((a)object).c == this.c && ((a)object).d == this.d && Arrays.equals(((b)object).f.a(), this.f.a())) {
                int n9;
                object = new DataInputStream(checkedInputStream);
                for (n9 = this.b(); n9 > 0; --n9) {
                    if (((DataInputStream)object).readUnsignedByte() == 0) {
                        continue;
                    }
                    throw new i("XZ Index is corrupt");
                }
                l8 = cRC32.getValue();
                for (n9 = n8; n9 < 4; ++n9) {
                    if ((l8 >>> n9 * 8 & 0xFFL) == (long)((DataInputStream)object).readUnsignedByte()) {
                        continue;
                    }
                    throw new i("XZ Index is corrupt");
                }
                return;
            }
            throw new i("XZ Index is corrupt");
        }
        throw new i("XZ Block Header or the start of XZ Index is corrupt");
    }
}

