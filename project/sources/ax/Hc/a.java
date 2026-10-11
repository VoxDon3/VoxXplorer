package ax.Hc;

import ax.Kc.f;
import ax.Kc.j;
import ax.Kc.n;
import ax.Kc.o;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public class a extends ax.Ec.a implements o {
    private final j c0;
    private final InputStream d0;
    private final boolean e0;
    private final byte[] f0;
    private int g0;
    private Inflater h0;
    private final CRC32 i0;
    private boolean j0;
    private final byte[] k0;
    private final b l0;

    public a(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    private boolean e(boolean z) throws IOException {
        int read = this.d0.read();
        if (read == -1 && !z) {
            return false;
        }
        if (read != 31 || this.d0.read() != 139) {
            throw new IOException(z ? "Input is not in the .gz format" : "Garbage after a valid .gz stream");
        }
        DataInputStream dataInputStream = new DataInputStream(this.d0);
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if (readUnsignedByte != 8) {
            throw new IOException("Unsupported compression method " + readUnsignedByte + " in the .gz header");
        }
        int readUnsignedByte2 = dataInputStream.readUnsignedByte();
        if ((readUnsignedByte2 & 224) != 0) {
            throw new IOException("Reserved flags are set in the .gz header");
        }
        this.l0.e(f.b(dataInputStream, 4) * 1000);
        int readUnsignedByte3 = dataInputStream.readUnsignedByte();
        if (readUnsignedByte3 == 2) {
            this.l0.c(9);
        } else if (readUnsignedByte3 == 4) {
            this.l0.c(1);
        }
        this.l0.f(dataInputStream.readUnsignedByte());
        if ((readUnsignedByte2 & 4) != 0) {
            int readUnsignedByte4 = (dataInputStream.readUnsignedByte() << 8) | dataInputStream.readUnsignedByte();
            while (true) {
                int i = readUnsignedByte4 - 1;
                if (readUnsignedByte4 <= 0) {
                    break;
                }
                dataInputStream.readUnsignedByte();
                readUnsignedByte4 = i;
            }
        }
        if ((readUnsignedByte2 & 8) != 0) {
            this.l0.d(new String(f(dataInputStream), StandardCharsets.ISO_8859_1));
        }
        if ((readUnsignedByte2 & 16) != 0) {
            this.l0.b(new String(f(dataInputStream), StandardCharsets.ISO_8859_1));
        }
        if ((readUnsignedByte2 & 2) != 0) {
            dataInputStream.readShort();
        }
        this.h0.reset();
        this.i0.reset();
        return true;
    }

    private static byte[] f(DataInput dataInput) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int readUnsignedByte = dataInput.readUnsignedByte();
                if (readUnsignedByte == 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(readUnsignedByte);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // ax.Kc.o
    public long a() {
        return this.c0.c();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Inflater inflater = this.h0;
        if (inflater != null) {
            inflater.end();
            this.h0 = null;
        }
        InputStream inputStream = this.d0;
        if (inputStream != System.in) {
            inputStream.close();
        }
    }

    public b d() {
        return this.l0;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.k0, 0, 1) == -1) {
            return -1;
        }
        return this.k0[0] & 255;
    }

    public a(InputStream inputStream, boolean z) throws IOException {
        this.f0 = new byte[8192];
        this.h0 = new Inflater(true);
        this.i0 = new CRC32();
        this.k0 = new byte[1];
        this.l0 = new b();
        j jVar = new j(inputStream);
        this.c0 = jVar;
        if (jVar.markSupported()) {
            this.d0 = jVar;
        } else {
            this.d0 = new BufferedInputStream(jVar);
        }
        this.e0 = z;
        e(true);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.j0) {
            return -1;
        }
        int i3 = 0;
        while (i2 > 0) {
            if (this.h0.needsInput()) {
                this.d0.mark(this.f0.length);
                int read = this.d0.read(this.f0);
                this.g0 = read;
                if (read == -1) {
                    throw new EOFException();
                }
                this.h0.setInput(this.f0, 0, read);
            }
            try {
                int inflate = this.h0.inflate(bArr, i, i2);
                this.i0.update(bArr, i, inflate);
                i += inflate;
                i2 -= inflate;
                i3 += inflate;
                b(inflate);
                if (this.h0.finished()) {
                    this.d0.reset();
                    long remaining = this.g0 - this.h0.getRemaining();
                    if (n.i(this.d0, remaining) != remaining) {
                        throw new IOException();
                    }
                    this.g0 = 0;
                    DataInputStream dataInputStream = new DataInputStream(this.d0);
                    if (f.b(dataInputStream, 4) != this.i0.getValue()) {
                        throw new IOException("Gzip-compressed data is corrupt (CRC32 error)");
                    }
                    if (f.b(dataInputStream, 4) != (this.h0.getBytesWritten() & 4294967295L)) {
                        throw new IOException("Gzip-compressed data is corrupt(uncompressed size mismatch)");
                    }
                    if (!this.e0 || !e(false)) {
                        this.h0.end();
                        this.h0 = null;
                        this.j0 = true;
                        if (i3 == 0) {
                            return -1;
                        }
                        return i3;
                    }
                }
            } catch (DataFormatException unused) {
                throw new IOException("Gzip-compressed data is corrupt");
            }
        }
        return i3;
    }
}
