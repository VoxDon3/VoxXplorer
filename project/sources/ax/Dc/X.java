package ax.Dc;

import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.OpenOption;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
class X extends OutputStream implements AutoCloseable {
    private File c0;
    private final long d0;
    private int e0;
    private long f0;
    private boolean g0;
    private final byte[] h0;
    private OutputStream q;

    private File a(Integer num) throws IOException {
        String str;
        int intValue = num == null ? this.e0 + 2 : num.intValue();
        String a = ax.Kc.l.a(this.c0.getName());
        if (intValue <= 9) {
            str = ".z0" + intValue;
        } else {
            str = ".z" + intValue;
        }
        File file = new File(this.c0.getParent(), a + str);
        if (!file.exists()) {
            return file;
        }
        throw new IOException("split zip segment " + a + str + " already exists");
    }

    private void b() throws IOException {
        if (this.g0) {
            throw new IOException("This archive has already been finished");
        }
        String a = ax.Kc.l.a(this.c0.getName());
        File file = new File(this.c0.getParentFile(), a + ".zip");
        this.q.close();
        if (this.c0.renameTo(file)) {
            this.g0 = true;
            return;
        }
        throw new IOException("Failed to rename " + this.c0 + " to " + file);
    }

    private void e() throws IOException {
        if (this.e0 == 0) {
            this.q.close();
            File a = a(1);
            if (!this.c0.renameTo(a)) {
                throw new IOException("Failed to rename " + this.c0 + " to " + a);
            }
        }
        File a2 = a(null);
        this.q.close();
        this.q = Files.newOutputStream(FileRetargetClass.toPath(a2), new OpenOption[0]);
        this.f0 = 0L;
        this.c0 = a2;
        this.e0++;
    }

    public long c() {
        return this.f0;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.g0) {
            return;
        }
        b();
    }

    public int d() {
        return this.e0;
    }

    public void f(long j) throws IllegalArgumentException, IOException {
        long j2 = this.d0;
        if (j > j2) {
            throw new IllegalArgumentException("The unsplittable content size is bigger than the split segment size");
        }
        if (j2 - this.f0 < j) {
            e();
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.h0;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i2 <= 0) {
            return;
        }
        long j = this.f0;
        long j2 = this.d0;
        if (j >= j2) {
            e();
            write(bArr, i, i2);
            return;
        }
        long j3 = i2;
        if (j + j3 > j2) {
            int i3 = ((int) j2) - ((int) j);
            write(bArr, i, i3);
            e();
            write(bArr, i + i3, i2 - i3);
            return;
        }
        this.q.write(bArr, i, i2);
        this.f0 += j3;
    }
}
