package ax.m7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class o extends ByteArrayOutputStream implements AutoCloseable {
    private final int c0;
    private boolean d0;
    private final Level e0;
    private final Logger f0;
    private int q;

    public o(Logger logger, Level level, int i) {
        this.f0 = (Logger) v.d(logger);
        this.e0 = (Level) v.d(level);
        v.a(i >= 0);
        this.c0 = i;
    }

    private static void a(StringBuilder sb, int i) {
        if (i == 1) {
            sb.append("1 byte");
        } else {
            sb.append(NumberFormat.getInstance().format(i));
            sb.append(" bytes");
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (!this.d0) {
                if (this.q != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Total: ");
                    a(sb, this.q);
                    int i = ((ByteArrayOutputStream) this).count;
                    if (i != 0 && i < this.q) {
                        sb.append(" (logging first ");
                        a(sb, ((ByteArrayOutputStream) this).count);
                        sb.append(")");
                    }
                    this.f0.config(sb.toString());
                    if (((ByteArrayOutputStream) this).count != 0) {
                        this.f0.log(this.e0, toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                    }
                }
                this.d0 = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        v.a(!this.d0);
        this.q++;
        if (((ByteArrayOutputStream) this).count < this.c0) {
            super.write(i);
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        v.a(!this.d0);
        this.q += i2;
        int i3 = ((ByteArrayOutputStream) this).count;
        int i4 = this.c0;
        if (i3 < i4) {
            int i5 = i3 + i2;
            if (i5 > i4) {
                i2 += i4 - i5;
            }
            super.write(bArr, i, i2);
        }
    }
}
