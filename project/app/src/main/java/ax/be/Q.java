/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.J;
import ax.be.O;
import ax.be.P;
import ax.be.c;
import ax.be.i;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Q
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private final int c0;
    private InputStream d0;
    private J e0;
    private final boolean f0;
    private boolean g0 = false;
    private IOException h0 = null;
    private final byte[] i0 = new byte[1];
    private final c q;

    public Q(InputStream inputStream, int n8) throws IOException {
        this(inputStream, n8, true);
    }

    public Q(InputStream inputStream, int n8, boolean bl) throws IOException {
        this(inputStream, n8, bl, c.b());
    }

    public Q(InputStream inputStream, int n8, boolean bl, c c8) throws IOException {
        this.q = c8;
        this.d0 = inputStream;
        this.c0 = n8;
        this.f0 = bl;
        this.e0 = new J(inputStream, n8, bl, c8);
    }

    private void b() throws IOException {
        InputStream inputStream = new DataInputStream(this.d0);
        byte[] byArray = new byte[12];
        do {
            if (inputStream.read(byArray, 0, 1) == -1) {
                this.g0 = true;
                return;
            }
            inputStream.readFully(byArray, 1, 3);
        } while (byArray[0] == 0 && byArray[1] == 0 && byArray[2] == 0 && byArray[3] == 0);
        inputStream.readFully(byArray, 4, 8);
        try {
            inputStream = new J(this.d0, this.c0, this.f0, byArray, this.q);
            this.e0 = inputStream;
            return;
        }
        catch (O o8) {
            throw new i("Garbage after a valid XZ Stream");
        }
    }

    public void a(boolean bl) throws IOException {
        if (this.d0 != null) {
            J j8 = this.e0;
            if (j8 != null) {
                j8.a(false);
                this.e0 = null;
            }
            if (bl) {
                try {
                    this.d0.close();
                }
                finally {
                    this.d0 = null;
                }
            }
        }
    }

    @Override
    public int available() throws IOException {
        if (this.d0 != null) {
            Object object = this.h0;
            if (object == null) {
                object = this.e0;
                if (object == null) {
                    return 0;
                }
                return ((J)object).available();
            }
            throw object;
        }
        throw new P("Stream closed");
    }

    @Override
    public void close() throws IOException {
        this.a(true);
    }

    @Override
    public int read() throws IOException {
        if (this.read(this.i0, 0, 1) == -1) {
            return -1;
        }
        return this.i0[0] & 0xFF;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        IOException iOException3;
        int n10;
        block9: {
            if (n8 < 0) throw new IndexOutOfBoundsException();
            if (n9 < 0) throw new IndexOutOfBoundsException();
            n10 = n8 + n9;
            if (n10 < 0) throw new IndexOutOfBoundsException();
            if (n10 > byArray.length) throw new IndexOutOfBoundsException();
            n10 = 0;
            if (n9 == 0) {
                return 0;
            }
            if (this.d0 == null) throw new P("Stream closed");
            IOException iOException2 = this.h0;
            if (iOException2 != null) throw iOException2;
            if (this.g0) {
                return -1;
            }
            while (n9 > 0) {
                int n11;
                block8: {
                    try {
                        if (this.e0 != null) break block8;
                        this.b();
                        if (this.g0) {
                            if (n10 != 0) return n10;
                            return -1;
                        }
                    }
                    catch (IOException iOException3) {
                        break block9;
                    }
                }
                if ((n11 = this.e0.read(byArray, n8, n9)) > 0) {
                    n10 += n11;
                    n8 += n11;
                    n9 -= n11;
                    continue;
                }
                if (n11 != -1) continue;
                this.e0 = null;
            }
            return n10;
        }
        this.h0 = iOException3;
        if (n10 == 0) throw iOException3;
        return n10;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

