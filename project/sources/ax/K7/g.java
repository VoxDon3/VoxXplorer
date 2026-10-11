package ax.K7;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.nio.channels.DesugarChannels;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
class g implements Closeable, AutoCloseable {
    private static final Logger h0 = Logger.getLogger(g.class.getName());
    int c0;
    private int d0;
    private b e0;
    private b f0;
    private final byte[] g0 = new byte[16];
    private final RandomAccessFile q;

    class a implements d {
        boolean a = true;
        final /* synthetic */ StringBuilder b;

        a(StringBuilder sb) {
            this.b = sb;
        }

        @Override // ax.K7.g.d
        public void a(InputStream inputStream, int i) throws IOException {
            if (this.a) {
                this.a = false;
            } else {
                this.b.append(", ");
            }
            this.b.append(i);
        }
    }

    static class b {
        static final b c = new b(0, 0);
        final int a;
        final int b;

        b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.a + ", length = " + this.b + "]";
        }
    }

    private final class c extends InputStream implements InputStreamRetargetInterface {
        private int c0;
        private int q;

        /* synthetic */ c(g gVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            g.q(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.c0;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            g.this.W(this.q, bArr, i, i2);
            this.q = g.this.u0(this.q + i2);
            this.c0 -= i2;
            return i2;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        private c(b bVar) {
            this.q = g.this.u0(bVar.a + 4);
            this.c0 = bVar.b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.c0 == 0) {
                return -1;
            }
            g.this.q.seek(this.q);
            int read = g.this.q.read();
            this.q = g.this.u0(this.q + 1);
            this.c0--;
            return read;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i) throws IOException;
    }

    public g(File file) throws IOException {
        if (!file.exists()) {
            o(file);
        }
        this.q = u(file);
        A();
    }

    private void A() throws IOException {
        this.q.seek(0L);
        this.q.readFully(this.g0);
        int F = F(this.g0, 0);
        this.c0 = F;
        if (F <= this.q.length()) {
            this.d0 = F(this.g0, 4);
            int F2 = F(this.g0, 8);
            int F3 = F(this.g0, 12);
            this.e0 = v(F2);
            this.f0 = v(F3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.c0 + ", Actual length: " + this.q.length());
    }

    private void A0(int i, int i2, int i3, int i4) throws IOException {
        D0(this.g0, i, i2, i3, i4);
        this.q.seek(0L);
        this.q.write(this.g0);
    }

    private static void C0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static void D0(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            C0(bArr, i, i2);
            i += 4;
        }
    }

    private static int F(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    private int H() {
        return this.c0 - s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i, byte[] bArr, int i2, int i3) throws IOException {
        int u0 = u0(i);
        int i4 = u0 + i3;
        int i5 = this.c0;
        if (i4 <= i5) {
            this.q.seek(u0);
            this.q.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - u0;
        this.q.seek(u0);
        this.q.readFully(bArr, i2, i6);
        this.q.seek(16L);
        this.q.readFully(bArr, i2 + i6, i3 - i6);
    }

    private void d0(int i, byte[] bArr, int i2, int i3) throws IOException {
        int u0 = u0(i);
        int i4 = u0 + i3;
        int i5 = this.c0;
        if (i4 <= i5) {
            this.q.seek(u0);
            this.q.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - u0;
        this.q.seek(u0);
        this.q.write(bArr, i2, i6);
        this.q.seek(16L);
        this.q.write(bArr, i2 + i6, i3 - i6);
    }

    private void j(int i) throws IOException {
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        int i2 = i + 4;
        int H = H();
        if (H >= i2) {
            return;
        }
        int i3 = this.c0;
        do {
            H += i3;
            i3 <<= 1;
        } while (H < i2);
        o0(i3);
        b bVar = this.f0;
        int u0 = u0(bVar.a + 4 + bVar.b);
        if (u0 < this.e0.a) {
            convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.q.getChannel());
            convertMaybeLegacyFileChannelFromLibrary.position(this.c0);
            long j = u0 - 4;
            if (convertMaybeLegacyFileChannelFromLibrary.transferTo(16L, j, convertMaybeLegacyFileChannelFromLibrary) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f0.a;
        int i5 = this.e0.a;
        if (i4 < i5) {
            int i6 = (this.c0 + i4) - 16;
            A0(i3, this.d0, i5, i6);
            this.f0 = new b(i6, this.f0.b);
        } else {
            A0(i3, this.d0, i5, i4);
        }
        this.c0 = i3;
    }

    private static void o(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile u = u(file2);
        try {
            u.setLength(4096L);
            u.seek(0L);
            byte[] bArr = new byte[16];
            D0(bArr, 4096, 0, 0, 0);
            u.write(bArr);
            u.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            u.close();
            throw th;
        }
    }

    private void o0(int i) throws IOException {
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        this.q.setLength(i);
        convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.q.getChannel());
        convertMaybeLegacyFileChannelFromLibrary.force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T q(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile u(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int u0(int i) {
        int i2 = this.c0;
        return i < i2 ? i : (i + 16) - i2;
    }

    private b v(int i) throws IOException {
        if (i == 0) {
            return b.c;
        }
        this.q.seek(i);
        return new b(i, this.q.readInt());
    }

    public synchronized void L() throws IOException {
        try {
            if (p()) {
                throw new NoSuchElementException();
            }
            if (this.d0 == 1) {
                g();
            } else {
                b bVar = this.e0;
                int u0 = u0(bVar.a + 4 + bVar.b);
                W(u0, this.g0, 0, 4);
                int F = F(this.g0, 0);
                A0(this.c0, this.d0 - 1, u0, this.f0.a);
                this.d0--;
                this.e0 = new b(u0, F);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.q.close();
    }

    public void e(byte[] bArr) throws IOException {
        f(bArr, 0, bArr.length);
    }

    public synchronized void f(byte[] bArr, int i, int i2) throws IOException {
        int u0;
        try {
            q(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            j(i2);
            boolean p = p();
            if (p) {
                u0 = 16;
            } else {
                b bVar = this.f0;
                u0 = u0(bVar.a + 4 + bVar.b);
            }
            b bVar2 = new b(u0, i2);
            C0(this.g0, 0, i2);
            d0(bVar2.a, this.g0, 0, 4);
            d0(bVar2.a + 4, bArr, i, i2);
            A0(this.c0, this.d0 + 1, p ? bVar2.a : this.e0.a, bVar2.a);
            this.f0 = bVar2;
            this.d0++;
            if (p) {
                this.e0 = bVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void g() throws IOException {
        try {
            A0(4096, 0, 0, 0);
            this.d0 = 0;
            b bVar = b.c;
            this.e0 = bVar;
            this.f0 = bVar;
            if (this.c0 > 4096) {
                o0(4096);
            }
            this.c0 = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void m(d dVar) throws IOException {
        int i = this.e0.a;
        for (int i2 = 0; i2 < this.d0; i2++) {
            b v = v(i);
            dVar.a(new c(this, v, null), v.b);
            i = u0(v.a + 4 + v.b);
        }
    }

    public synchronized boolean p() {
        return this.d0 == 0;
    }

    public int s0() {
        if (this.d0 == 0) {
            return 16;
        }
        b bVar = this.f0;
        int i = bVar.a;
        int i2 = this.e0.a;
        return i >= i2 ? (i - i2) + 4 + bVar.b + 16 : (((i + 4) + bVar.b) + this.c0) - i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.c0);
        sb.append(", size=");
        sb.append(this.d0);
        sb.append(", first=");
        sb.append(this.e0);
        sb.append(", last=");
        sb.append(this.f0);
        sb.append(", element lengths=[");
        try {
            m(new a(sb));
        } catch (IOException e) {
            h0.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
