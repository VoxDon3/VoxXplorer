package ax.fe;

import ax.be.C1741i;
import ax.be.P;
import ax.ce.c;
import ax.ce.e;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

/* loaded from: classes3.dex */
public class b extends a {
    private c f;

    public b() {
        super(new C1741i());
        try {
            this.f = new e();
        } catch (NoSuchAlgorithmException unused) {
            this.f = new ax.ce.a();
        }
    }

    @Override // ax.fe.a
    public void a(long j, long j2) throws P {
        super.a(j, j2);
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.putLong(j);
        allocate.putLong(j2);
        this.f.e(allocate.array());
    }

    @Override // ax.fe.a
    public /* bridge */ /* synthetic */ long c() {
        return super.c();
    }

    @Override // ax.fe.a
    public /* bridge */ /* synthetic */ long d() {
        return super.d();
    }

    public void f(InputStream inputStream) throws IOException {
        CRC32 crc32 = new CRC32();
        crc32.update(0);
        CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, crc32);
        if (ax.de.a.f(checkedInputStream) != this.e) {
            throw new C1741i("XZ Block Header or the start of XZ Index is corrupt");
        }
        b bVar = new b();
        for (long j = 0; j < this.e; j++) {
            try {
                bVar.a(ax.de.a.f(checkedInputStream), ax.de.a.f(checkedInputStream));
                if (bVar.b > this.b || bVar.c > this.c || bVar.d > this.d) {
                    throw new C1741i("XZ Index is corrupt");
                }
            } catch (P unused) {
                throw new C1741i("XZ Index is corrupt");
            }
        }
        if (bVar.b != this.b || bVar.c != this.c || bVar.d != this.d || !Arrays.equals(bVar.f.a(), this.f.a())) {
            throw new C1741i("XZ Index is corrupt");
        }
        DataInputStream dataInputStream = new DataInputStream(checkedInputStream);
        for (int b = b(); b > 0; b--) {
            if (dataInputStream.readUnsignedByte() != 0) {
                throw new C1741i("XZ Index is corrupt");
            }
        }
        long value = crc32.getValue();
        for (int i = 0; i < 4; i++) {
            if (((value >>> (i * 8)) & 255) != dataInputStream.readUnsignedByte()) {
                throw new C1741i("XZ Index is corrupt");
            }
        }
    }
}
