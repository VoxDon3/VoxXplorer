/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.media.MediaDataSource;
import ax.b3.j;
import ax.u3.c;
import com.alphainventor.filemanager.file.m;
import com.alphainventor.filemanager.file.n;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

public class f0
extends MediaDataSource
implements AutoCloseable {
    private static final Logger i0 = Logger.getLogger("FileManager.RemoteMediaDataSource");
    private long c0;
    private long d0;
    private int e0;
    private m f0;
    private n g0;
    private c h0;
    private a q;

    public f0(m m8, n n8, c c8) {
        this.f0 = m8;
        this.g0 = n8;
        this.h0 = c8;
    }

    private void a(long l8) throws IOException, j {
        a a8 = this.q;
        if (a8 != null) {
            ((InputStream)a8).close();
            this.q = null;
        }
        ++this.e0;
        this.q = a8 = new a(this.f0.J(this.g0, l8), 147456);
        ((InputStream)a8).mark(147456);
        this.d0 = l8;
        this.c0 = l8;
    }

    private void b() {
        int n8;
        a a8 = this.q;
        if (a8 != null && !a8.a() && (n8 = this.q.b()) >= 0) {
            this.c0 = this.d0 - (long)n8;
        }
    }

    private long c(long l8) throws IOException {
        long l9;
        if (this.q == null) {
            return 0L;
        }
        long l10 = 0L;
        int n8 = 0;
        do {
            long l11 = ((InputStream)this.q).skip(l8 - l10);
            long l12 = l11 - 0L;
            long l13 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            l9 = l10;
            if (l13 < 0) break;
            if (l13 == false) {
                if (++n8 > 10) {
                    throw new IOException("Too many skip zero");
                }
            } else {
                n8 = 0;
            }
            l10 = l9 = l10 + l11;
        } while (l9 < l8);
        this.d0 += l9;
        return l9;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        a a8 = this.q;
        if (a8 != null) {
            try {
                ((InputStream)a8).close();
            }
            catch (Exception exception) {}
            this.q = null;
        }
    }

    public long getSize() throws IOException {
        return this.g0.p();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int readAt(long l8, byte[] object, int n8, int n9) throws IOException {
        int n10;
        int n11;
        block11: {
            long l9;
            Object object2;
            block10: {
                object2 = this.h0;
                if (object2 != null && object2.isCancelled()) {
                    object = this.q;
                    if (object == null) throw new IOException("cancelled");
                    ((InputStream)object).close();
                    this.q = null;
                    throw new IOException("cancelled");
                }
                try {
                    object2 = this.q;
                    if (object2 == null || l8 <= (l9 = this.d0) || l8 - l9 >= 147456L) break block10;
                    l9 = l8 - l9;
                }
                catch (j j8) {
                    throw new IOException(j8);
                }
                if (l9 == this.c(l9)) {
                    this.b();
                    break block11;
                } else {
                    this.a(l8);
                }
                break block11;
            }
            if (object2 != null && l8 < this.d0 && l8 >= this.c0 && ((a)object2).a()) {
                ((InputStream)this.q).reset();
                this.d0 = l9 = this.c0;
                this.c(l8 - l9);
            } else if (this.d0 != l8 || this.q == null) {
                this.a(l8);
            }
        }
        int n12 = 0;
        do {
            n10 = ((InputStream)this.q).read((byte[])object, n8 + n12, n9 - n12);
            n11 = n12;
            if (n10 < 0) break;
            n12 = n11 = n12 + n10;
        } while (n11 < n9);
        if (n11 <= 0) return n10;
        this.d0 += (long)n11;
        this.b();
        return n11;
    }

    static class a
    extends BufferedInputStream
    implements j.InputStreamRetargetInterface {
        public a(InputStream inputStream, int n8) {
            super(inputStream, n8);
        }

        boolean a() {
            return this.markpos >= 0;
        }

        int b() {
            if (this.markpos < 0) {
                this.markpos = 0;
                return this.pos;
            }
            return -1;
        }

        @Override
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
        }
    }
}

