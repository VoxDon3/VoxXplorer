/*
 * Decompiled with CFR 0.152.
 */
package ax.Hc;

import ax.Hc.b;
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

public class a
extends ax.Ec.a
implements o {
    private final j c0;
    private final InputStream d0;
    private final boolean e0;
    private final byte[] f0 = new byte[8192];
    private int g0;
    private Inflater h0 = new Inflater(true);
    private final CRC32 i0 = new CRC32();
    private boolean j0;
    private final byte[] k0 = new byte[1];
    private final b l0 = new b();

    public a(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    public a(InputStream inputStream, boolean bl) throws IOException {
        inputStream = new j(inputStream);
        this.c0 = inputStream;
        this.d0 = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream);
        this.e0 = bl;
        this.e(true);
    }

    private boolean e(boolean bl) throws IOException {
        int n8 = this.d0.read();
        if (n8 == -1 && !bl) {
            return false;
        }
        if (n8 == 31 && this.d0.read() == 139) {
            Object object = new DataInputStream(this.d0);
            n8 = object.readUnsignedByte();
            if (n8 == 8) {
                int n9 = object.readUnsignedByte();
                if ((n9 & 0xE0) == 0) {
                    this.l0.e(f.b((DataInput)object, 4) * 1000L);
                    n8 = object.readUnsignedByte();
                    if (n8 != 2) {
                        if (n8 == 4) {
                            this.l0.c(1);
                        }
                    } else {
                        this.l0.c(9);
                    }
                    this.l0.f(object.readUnsignedByte());
                    if ((n9 & 4) != 0) {
                        n8 = object.readUnsignedByte();
                        for (n8 = object.readUnsignedByte() << 8 | n8; n8 > 0; --n8) {
                            object.readUnsignedByte();
                        }
                    }
                    if ((n9 & 8) != 0) {
                        this.l0.d(new String(a.f((DataInput)object), StandardCharsets.ISO_8859_1));
                    }
                    if ((n9 & 0x10) != 0) {
                        this.l0.b(new String(a.f((DataInput)object), StandardCharsets.ISO_8859_1));
                    }
                    if ((n9 & 2) != 0) {
                        object.readShort();
                    }
                    this.h0.reset();
                    this.i0.reset();
                    return true;
                }
                throw new IOException("Reserved flags are set in the .gz header");
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unsupported compression method ");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(" in the .gz header");
            throw new IOException(((StringBuilder)object).toString());
        }
        String string = bl ? "Input is not in the .gz format" : "Garbage after a valid .gz stream";
        throw new IOException(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static byte[] f(DataInput object) throws IOException {
        Throwable throwable2;
        ByteArrayOutputStream byteArrayOutputStream;
        block7: {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                int n8;
                while ((n8 = object.readUnsignedByte()) != 0) {
                    byteArrayOutputStream.write(n8);
                }
            }
            catch (Throwable throwable2) {
                break block7;
            }
            object = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return object;
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            try {
                byteArrayOutputStream.close();
                throw throwable3;
            }
            catch (Throwable throwable4) {
                throwable2.addSuppressed(throwable4);
            }
            throw throwable3;
        }
    }

    @Override
    public long a() {
        return this.c0.c();
    }

    @Override
    public void close() throws IOException {
        Object object = this.h0;
        if (object != null) {
            ((Inflater)object).end();
            this.h0 = null;
        }
        if ((object = this.d0) != System.in) {
            ((InputStream)object).close();
        }
    }

    public b d() {
        return this.l0;
    }

    @Override
    public int read() throws IOException {
        if (this.read(this.k0, 0, 1) == -1) {
            return -1;
        }
        return this.k0[0] & 0xFF;
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        if (n9 == 0) {
            return 0;
        }
        if (this.j0) {
            return -1;
        }
        int n10 = 0;
        while (n9 > 0) {
            InputStream inputStream;
            int n11;
            int n12;
            int n13;
            if (this.h0.needsInput()) {
                this.d0.mark(this.f0.length);
                this.g0 = n13 = this.d0.read(this.f0);
                if (n13 != -1) {
                    this.h0.setInput(this.f0, 0, n13);
                } else {
                    throw new EOFException();
                }
            }
            try {
                int n14 = this.h0.inflate(byArray, n8, n9);
                this.i0.update(byArray, n8, n14);
                n12 = n8 + n14;
                n11 = n9 - n14;
                n13 = n10 + n14;
                this.b(n14);
                n10 = n13;
                n8 = n12;
                n9 = n11;
                if (!this.h0.finished()) continue;
                this.d0.reset();
                n8 = this.g0;
                n9 = this.h0.getRemaining();
                inputStream = this.d0;
            }
            catch (DataFormatException dataFormatException) {
                throw new IOException("Gzip-compressed data is corrupt");
            }
            long l8 = n8 - n9;
            if (n.i(inputStream, l8) == l8) {
                this.g0 = 0;
                inputStream = new DataInputStream(this.d0);
                if (f.b((DataInput)((Object)inputStream), 4) == this.i0.getValue()) {
                    if (f.b((DataInput)((Object)inputStream), 4) == (this.h0.getBytesWritten() & 0xFFFFFFFFL)) {
                        if (this.e0) {
                            n10 = n13;
                            n8 = n12;
                            n9 = n11;
                            if (this.e(false)) continue;
                        }
                        this.h0.end();
                        this.h0 = null;
                        this.j0 = true;
                        if (n13 == 0) {
                            return -1;
                        }
                        return n13;
                    }
                    throw new IOException("Gzip-compressed data is corrupt(uncompressed size mismatch)");
                }
                throw new IOException("Gzip-compressed data is corrupt (CRC32 error)");
            }
            throw new IOException();
        }
        return n10;
    }
}

