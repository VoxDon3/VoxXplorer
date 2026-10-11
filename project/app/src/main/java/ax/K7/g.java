/*
 * Decompiled with CFR 0.152.
 */
package ax.K7;

import ax.u3.w;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

class g
implements Closeable,
AutoCloseable {
    private static final Logger h0 = Logger.getLogger(g.class.getName());
    int c0;
    private int d0;
    private b e0;
    private b f0;
    private final byte[] g0 = new byte[16];
    private final RandomAccessFile q;

    public g(File file) throws IOException {
        if (!file.exists()) {
            g.o(file);
        }
        this.q = g.u(file);
        this.A();
    }

    private void A() throws IOException {
        int n8;
        this.q.seek(0L);
        this.q.readFully(this.g0);
        this.c0 = n8 = g.F(this.g0, 0);
        if ((long)n8 <= this.q.length()) {
            this.d0 = g.F(this.g0, 4);
            int n9 = g.F(this.g0, 8);
            n8 = g.F(this.g0, 12);
            this.e0 = this.v(n9);
            this.f0 = this.v(n8);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("File is truncated. Expected length: ");
        stringBuilder.append(this.c0);
        stringBuilder.append(", Actual length: ");
        stringBuilder.append(this.q.length());
        throw new IOException(stringBuilder.toString());
    }

    private void A0(int n8, int n9, int n10, int n11) throws IOException {
        g.D0(this.g0, n8, n9, n10, n11);
        this.q.seek(0L);
        this.q.write(this.g0);
    }

    private static void C0(byte[] byArray, int n8, int n9) {
        byArray[n8] = (byte)(n9 >> 24);
        byArray[n8 + 1] = (byte)(n9 >> 16);
        byArray[n8 + 2] = (byte)(n9 >> 8);
        byArray[n8 + 3] = (byte)n9;
    }

    private static void D0(byte[] byArray, int ... nArray) {
        int n8 = nArray.length;
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            g.C0(byArray, n9, nArray[i8]);
            n9 += 4;
        }
    }

    private static int F(byte[] byArray, int n8) {
        return ((byArray[n8] & 0xFF) << 24) + ((byArray[n8 + 1] & 0xFF) << 16) + ((byArray[n8 + 2] & 0xFF) << 8) + (byArray[n8 + 3] & 0xFF);
    }

    private int H() {
        return this.c0 - this.s0();
    }

    private void W(int n8, byte[] byArray, int n9, int n10) throws IOException {
        int n11;
        if ((n8 = this.u0(n8)) + n10 <= (n11 = this.c0)) {
            this.q.seek(n8);
            this.q.readFully(byArray, n9, n10);
            return;
        }
        this.q.seek(n8);
        this.q.readFully(byArray, n9, n11 -= n8);
        this.q.seek(16L);
        this.q.readFully(byArray, n9 + n11, n10 - n11);
    }

    private void d0(int n8, byte[] byArray, int n9, int n10) throws IOException {
        int n11;
        if ((n8 = this.u0(n8)) + n10 <= (n11 = this.c0)) {
            this.q.seek(n8);
            this.q.write(byArray, n9, n10);
            return;
        }
        this.q.seek(n8);
        this.q.write(byArray, n9, n11 -= n8);
        this.q.seek(16L);
        this.q.write(byArray, n9 + n11, n10 - n11);
    }

    private void j(int n8) throws IOException {
        int n9;
        int n10;
        int n11 = n8 + 4;
        int n12 = this.H();
        if (n12 >= n11) {
            return;
        }
        n8 = this.c0;
        do {
            n10 = n12 + n8;
            n9 = n8 << 1;
            n12 = n10;
            n8 = n9;
        } while (n10 < n11);
        this.o0(n9);
        Object object = this.f0;
        n8 = this.u0(((b)object).a + 4 + ((b)object).b);
        if (n8 < this.e0.a) {
            object = w.a(this.q);
            ((FileChannel)object).position(this.c0);
            long l8 = n8 - 4;
            if (((FileChannel)object).transferTo(16L, l8, (WritableByteChannel)object) != l8) {
                throw new AssertionError((Object)"Copied insufficient number of bytes!");
            }
        }
        if ((n12 = this.f0.a) < (n8 = this.e0.a)) {
            n12 = this.c0 + n12 - 16;
            this.A0(n9, this.d0, n8, n12);
            this.f0 = new b(n12, this.f0.b);
        } else {
            this.A0(n9, this.d0, n8, n12);
        }
        this.c0 = n9;
    }

    private static void o(File file) throws IOException {
        Object object = new StringBuilder();
        ((StringBuilder)object).append(file.getPath());
        ((StringBuilder)object).append(".tmp");
        File file2 = new File(((StringBuilder)object).toString());
        object = g.u(file2);
        try {
            ((RandomAccessFile)object).setLength(4096L);
            ((RandomAccessFile)object).seek(0L);
            byte[] byArray = new byte[16];
            g.D0(byArray, 4096, 0, 0, 0);
            ((RandomAccessFile)object).write(byArray);
            if (file2.renameTo(file)) {
                return;
            }
            throw new IOException("Rename failed!");
        }
        finally {
            ((RandomAccessFile)object).close();
        }
    }

    private void o0(int n8) throws IOException {
        this.q.setLength(n8);
        w.a(this.q).force(true);
    }

    private static <T> T q(T t8, String string) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(string);
    }

    private static RandomAccessFile u(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private int u0(int n8) {
        int n9 = this.c0;
        if (n8 < n9) {
            return n8;
        }
        return n8 + 16 - n9;
    }

    private b v(int n8) throws IOException {
        if (n8 == 0) {
            return b.c;
        }
        this.q.seek(n8);
        return new b(n8, this.q.readInt());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void L() throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    block4: {
                        try {
                            if (this.p()) {
                                NoSuchElementException noSuchElementException = new NoSuchElementException();
                                throw noSuchElementException;
                            }
                            if (this.d0 != 1) break block4;
                            this.g();
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    b b8 = this.e0;
                    int n8 = this.u0(b8.a + 4 + b8.b);
                    this.W(n8, this.g0, 0, 4);
                    int n9 = g.F(this.g0, 0);
                    this.A0(this.c0, this.d0 - 1, n8, this.f0.a);
                    --this.d0;
                    this.e0 = b8 = new b(n8, n9);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        synchronized (this) {
            this.q.close();
            return;
        }
    }

    public void e(byte[] byArray) throws IOException {
        this.f(byArray, 0, byArray.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f(byte[] object, int n8, int n9) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block7: {
                    b b8;
                    boolean bl;
                    try {
                        g.q(object, "buffer");
                        if ((n8 | n9) >= 0 && n9 <= ((byte[])object).length - n8) {
                            int n10;
                            this.j(n9);
                            bl = this.p();
                            if (bl) {
                                n10 = 16;
                            } else {
                                b8 = this.f0;
                                n10 = this.u0(b8.a + 4 + b8.b);
                            }
                            b8 = new b(n10, n9);
                            g.C0(this.g0, 0, n9);
                            this.d0(b8.a, this.g0, 0, 4);
                            this.d0(b8.a + 4, (byte[])object, n8, n9);
                            n8 = bl ? b8.a : this.e0.a;
                        }
                        break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                    this.A0(this.c0, this.d0 + 1, n8, b8.a);
                    this.f0 = b8;
                    ++this.d0;
                    if (bl) {
                        this.e0 = b8;
                    }
                    return;
                }
                object = new IndexOutOfBoundsException;
                object();
                throw object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g() throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        b b8;
                        this.A0(4096, 0, 0, 0);
                        this.d0 = 0;
                        this.e0 = b8 = b.c;
                        this.f0 = b8;
                        if (this.c0 <= 4096) break block3;
                        this.o0(4096);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.c0 = 4096;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void m(d d8) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    int n8 = this.e0.a;
                    for (int i8 = 0; i8 < this.d0; ++i8) {
                        b b8 = this.v(n8);
                        c c8 = new c(this, b8);
                        d8.a(c8, b8.b);
                        n8 = this.u0(b8.a + 4 + b8.b);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean p() {
        synchronized (this) {
            int n8 = this.d0;
            if (n8 != 0) return false;
            return true;
        }
    }

    public int s0() {
        if (this.d0 == 0) {
            return 16;
        }
        b b8 = this.f0;
        int n8 = b8.a;
        int n9 = this.e0.a;
        if (n8 >= n9) {
            return n8 - n9 + 4 + b8.b + 16;
        }
        return n8 + 4 + b8.b + this.c0 - n9;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append('[');
        stringBuilder.append("fileLength=");
        stringBuilder.append(this.c0);
        stringBuilder.append(", size=");
        stringBuilder.append(this.d0);
        stringBuilder.append(", first=");
        stringBuilder.append(this.e0);
        stringBuilder.append(", last=");
        stringBuilder.append(this.f0);
        stringBuilder.append(", element lengths=[");
        try {
            d d8 = new d(){
                boolean a;
                final StringBuilder b;
                final g c;
                {
                    this.c = g8;
                    this.b = stringBuilder;
                    this.a = true;
                }

                @Override
                public void a(InputStream inputStream, int n8) throws IOException {
                    if (this.a) {
                        this.a = false;
                    } else {
                        this.b.append(", ");
                    }
                    this.b.append(n8);
                }
            };
            this.m(d8);
        }
        catch (IOException iOException) {
            h0.log(Level.WARNING, "read error", iOException);
        }
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }

    static class b {
        static final b c = new b(0, 0);
        final int a;
        final int b;

        b(int n8, int n9) {
            this.a = n8;
            this.b = n9;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getClass().getSimpleName());
            stringBuilder.append("[position = ");
            stringBuilder.append(this.a);
            stringBuilder.append(", length = ");
            stringBuilder.append(this.b);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    private final class c
    extends InputStream
    implements j.InputStreamRetargetInterface {
        private int c0;
        final g d0;
        private int q;

        private c(g g8, b b8) {
            this.d0 = g8;
            this.q = g8.u0(b8.a + 4);
            this.c0 = b8.b;
        }

        @Override
        public int read() throws IOException {
            if (this.c0 == 0) {
                return -1;
            }
            this.d0.q.seek(this.q);
            int n8 = this.d0.q.read();
            this.q = this.d0.u0(this.q + 1);
            --this.c0;
            return n8;
        }

        @Override
        public int read(byte[] byArray, int n8, int n9) throws IOException {
            g.q(byArray, "buffer");
            if ((n8 | n9) >= 0 && n9 <= byArray.length - n8) {
                int n10 = this.c0;
                if (n10 > 0) {
                    int n11 = n9;
                    if (n9 > n10) {
                        n11 = n10;
                    }
                    this.d0.W(this.q, byArray, n8, n11);
                    this.q = this.d0.u0(this.q + n11);
                    this.c0 -= n11;
                    return n11;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        @Override
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
        }
    }

    public static interface d {
        public void a(InputStream var1, int var2) throws IOException;
    }
}

