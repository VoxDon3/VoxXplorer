/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.P;
import ax.be.c;
import ax.be.i;
import ax.ge.e;
import ax.he.b;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class y
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private DataInputStream c0;
    private e d0;
    private ax.ie.c e0;
    private b f0;
    private int g0 = 0;
    private boolean h0 = false;
    private boolean i0 = true;
    private boolean j0 = true;
    private boolean k0 = false;
    private IOException l0 = null;
    private final byte[] m0 = new byte[1];
    private final c q;

    public y(InputStream inputStream, int n8) {
        this(inputStream, n8, null);
    }

    public y(InputStream inputStream, int n8, byte[] byArray) {
        this(inputStream, n8, byArray, c.b());
    }

    y(InputStream inputStream, int n8, byte[] byArray, c c8) {
        inputStream.getClass();
        this.q = c8;
        this.c0 = new DataInputStream(inputStream);
        this.e0 = new ax.ie.c(65536, c8);
        this.d0 = new e(y.c(n8), byArray, c8);
        if (byArray != null && byArray.length > 0) {
            this.i0 = false;
        }
    }

    private void a() throws IOException {
        int n8;
        block10: {
            block13: {
                int n9;
                block12: {
                    block11: {
                        n8 = this.c0.readUnsignedByte();
                        if (n8 == 0) {
                            this.k0 = true;
                            this.e();
                            return;
                        }
                        if (n8 < 224 && n8 != 1) {
                            if (this.i0) {
                                throw new i();
                            }
                        } else {
                            this.j0 = true;
                            this.i0 = false;
                            this.d0.k();
                        }
                        if (n8 < 128) break block10;
                        this.h0 = true;
                        this.g0 = n9 = (n8 & 0x1F) << 16;
                        this.g0 = n9 + (this.c0.readUnsignedShort() + 1);
                        n9 = this.c0.readUnsignedShort();
                        if (n8 < 192) break block11;
                        this.j0 = false;
                        this.b();
                        break block12;
                    }
                    if (this.j0) break block13;
                    if (n8 >= 160) {
                        this.f0.b();
                    }
                }
                this.e0.h(this.c0, n9 + 1);
                return;
            }
            throw new i();
        }
        if (n8 <= 2) {
            this.h0 = false;
            this.g0 = this.c0.readUnsignedShort() + 1;
            return;
        }
        throw new i();
    }

    private void b() throws IOException {
        int n8 = this.c0.readUnsignedByte();
        if (n8 <= 224) {
            int n9 = n8 / 45;
            int n10 = n8 - n9 * 45;
            if ((n10 -= (n8 = n10 / 9) * 9) + n8 <= 4) {
                this.f0 = new b(this.d0, this.e0, n10, n8, n9);
                return;
            }
            throw new i();
        }
        throw new i();
    }

    private static int c(int n8) {
        if (n8 >= 4096 && n8 <= 0x7FFFFFF0) {
            return n8 + 15 & 0xFFFFFFF0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported dictionary size ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int d(int n8) {
        return y.c(n8) / 1024 + 104;
    }

    private void e() {
        e e8 = this.d0;
        if (e8 != null) {
            e8.g(this.q);
            this.d0 = null;
            this.e0.i(this.q);
            this.e0 = null;
        }
    }

    @Override
    public int available() throws IOException {
        DataInputStream dataInputStream = this.c0;
        if (dataInputStream != null) {
            IOException iOException = this.l0;
            if (iOException == null) {
                if (this.h0) {
                    return this.g0;
                }
                return Math.min(this.g0, ((InputStream)dataInputStream).available());
            }
            throw iOException;
        }
        throw new P("Stream closed");
    }

    @Override
    public void close() throws IOException {
        if (this.c0 != null) {
            this.e();
            try {
                ((InputStream)this.c0).close();
                return;
            }
            finally {
                this.c0 = null;
            }
        }
    }

    @Override
    public int read() throws IOException {
        if (this.read(this.m0, 0, 1) == -1) {
            return -1;
        }
        return this.m0[0] & 0xFF;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read(byte[] object, int n8, int n9) throws IOException {
        int n10;
        if (n8 >= 0 && n9 >= 0 && (n10 = n8 + n9) >= 0 && n10 <= ((byte[])object).length) {
            n10 = 0;
            if (n9 == 0) {
                return 0;
            }
            if (this.c0 == null) {
                throw new P("Stream closed");
            }
            IOException iOException = this.l0;
            if (iOException != null) {
                throw iOException;
            }
            if (this.k0) {
                return -1;
            }
            while (n9 > 0) {
                IOException iOException22;
                block14: {
                    block13: {
                        try {
                            if (this.g0 != 0) break block13;
                            this.a();
                            if (this.k0) {
                                if (n10 != 0) break;
                                return -1;
                            }
                        }
                        catch (IOException iOException22) {
                            break block14;
                        }
                    }
                    int n11 = Math.min(this.g0, n9);
                    if (!this.h0) {
                        this.d0.a(this.c0, n11);
                    } else {
                        this.d0.l(n11);
                        this.f0.e();
                    }
                    int n12 = this.d0.b((byte[])object, n8);
                    n11 = n8 + n12;
                    int n13 = n9 - n12;
                    int n14 = n10 + n12;
                    this.g0 = n12 = this.g0 - n12;
                    n10 = n14;
                    n8 = n11;
                    n9 = n13;
                    if (n12 != 0) continue;
                    if (this.e0.g() && !this.d0.e()) {
                        n10 = n14;
                        n8 = n11;
                        n9 = n13;
                        continue;
                    }
                    object = new i;
                    object();
                    throw object;
                }
                this.l0 = iOException22;
                throw iOException22;
            }
            return n10;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

