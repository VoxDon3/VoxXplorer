package ax.pb;

import ax.qb.C2896d;
import ax.qb.C2897e;
import ax.rb.AbstractC3023b;
import ax.rb.InterfaceC3022a;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: ax.pb.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2818s extends AbstractC3023b implements InterfaceC3022a, Z {
    static C2897e A0 = C2897e.a();
    static final byte[] B0 = {-1, 83, 77, 66, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    byte d0;
    int f0;
    int g0;
    int i0;
    int j0;
    int k0;
    int m0;
    int n0;
    int o0;
    int p0;
    boolean q0;
    boolean r0;
    boolean s0;
    int u0;
    boolean v0;
    String x0;
    AbstractC2818s z0;
    long t0 = 1;
    r w0 = null;
    C2819t y0 = null;
    byte e0 = 24;
    int l0 = Z.H;
    int h0 = 0;

    AbstractC2818s() {
    }

    static void C(long j, byte[] bArr, int i) {
        if (j != 0) {
            j = (j + 11644473600000L) * 10000;
        }
        y(j, bArr, i);
    }

    static void D(long j, byte[] bArr, int i) {
        if (j == 0 || j == -1) {
            x(-1L, bArr, i);
            return;
        }
        TimeZone timeZone = Z.I;
        synchronized (timeZone) {
            try {
                if (timeZone.inDaylightTime(new Date())) {
                    if (!timeZone.inDaylightTime(new Date(j))) {
                        j -= 3600000;
                    }
                } else if (timeZone.inDaylightTime(new Date(j))) {
                    j += 3600000;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        x((int) (j / 1000), bArr, i);
    }

    static int i(byte[] bArr, int i) {
        return (bArr[i] & 255) + ((bArr[i + 1] & 255) << 8);
    }

    static int j(byte[] bArr, int i) {
        return (bArr[i] & 255) + ((bArr[i + 1] & 255) << 8) + ((bArr[i + 2] & 255) << 16) + ((bArr[i + 3] & 255) << 24);
    }

    static long k(byte[] bArr, int i) {
        return (j(bArr, i) & 4294967295L) + (j(bArr, i + 4) << 32);
    }

    static long q(byte[] bArr, int i) {
        return (((j(bArr, i + 4) << 32) | (j(bArr, i) & 4294967295L)) / 10000) - 11644473600000L;
    }

    static long r(byte[] bArr, int i) {
        return j(bArr, i) * 1000;
    }

    static void w(long j, byte[] bArr, int i) {
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
    }

    static void x(long j, byte[] bArr, int i) {
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
    }

    static void y(long j, byte[] bArr, int i) {
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
    }

    int A(String str, byte[] bArr, int i) {
        return B(str, bArr, i, this.q0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    int B(String str, byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        try {
            try {
                if (z != 0) {
                    if ((i - this.f0) % 2 != 0) {
                        i3 = i + 1;
                        bArr[i] = 0;
                    } else {
                        i3 = i;
                    }
                    System.arraycopy(str.getBytes("UTF-16LE"), 0, bArr, i3, str.length() * 2);
                    int length = i3 + (str.length() * 2);
                    int i4 = length + 1;
                    try {
                        bArr[length] = 0;
                        int i5 = length + 2;
                        bArr[i4] = 0;
                        i2 = i5;
                    } catch (UnsupportedEncodingException e) {
                        i2 = i4;
                        e = e;
                        if (C2897e.c0 > 1) {
                            e.printStackTrace(A0);
                        }
                        return i2 - i;
                    }
                } else {
                    byte[] bytes = str.getBytes(Z.K);
                    System.arraycopy(bytes, 0, bArr, i, bytes.length);
                    int length2 = bytes.length + i;
                    int i6 = length2 + 1;
                    bArr[length2] = 0;
                    i2 = i6;
                }
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                i2 = i;
            }
        } catch (UnsupportedEncodingException e3) {
            e = e3;
            i2 = z;
        }
        return i2 - i;
    }

    int d(byte[] bArr, int i) {
        this.f0 = i;
        int h = h(bArr, i) + i;
        int i2 = h + 1;
        byte b = bArr[h];
        this.o0 = b;
        if (b != 0) {
            int l = l(bArr, i2);
            if (l != this.o0 * 2 && C2897e.c0 >= 5) {
                A0.println("wordCount * 2=" + (this.o0 * 2) + " but readParameterWordsWireFormat returned " + l);
            }
            i2 += this.o0 * 2;
        }
        int i3 = i(bArr, i2);
        this.p0 = i3;
        int i4 = i2 + 2;
        if (i3 != 0) {
            int g = g(bArr, i4);
            if (g != this.p0 && C2897e.c0 >= 5) {
                A0.println("byteCount=" + this.p0 + " but readBytesWireFormat returned " + g);
            }
            i4 += this.p0;
        }
        int i5 = i4 - i;
        this.g0 = i5;
        return i5;
    }

    int e(byte[] bArr, int i) {
        AbstractC2818s abstractC2818s;
        this.f0 = i;
        int v = v(bArr, i) + i;
        int i2 = v + 1;
        int z = z(bArr, i2);
        this.o0 = z;
        bArr[v] = (byte) ((z / 2) & 255);
        int i3 = i2 + z;
        this.o0 = z / 2;
        int u = u(bArr, i3 + 2);
        this.p0 = u;
        bArr[i3] = (byte) (u & 255);
        bArr[i3 + 1] = (byte) ((u >> 8) & 255);
        int i4 = ((i3 + 2) + u) - i;
        this.g0 = i4;
        C2819t c2819t = this.y0;
        if (c2819t != null) {
            abstractC2818s = this;
            c2819t.b(bArr, this.f0, i4, abstractC2818s, this.z0);
        } else {
            abstractC2818s = this;
        }
        return abstractC2818s.g0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC2818s) && ((AbstractC2818s) obj).n0 == this.n0;
    }

    boolean f() {
        return (this.e0 & 128) == 128;
    }

    abstract int g(byte[] bArr, int i);

    int h(byte[] bArr, int i) {
        this.d0 = bArr[i + 4];
        this.i0 = j(bArr, i + 5);
        this.e0 = bArr[i + 9];
        this.j0 = i(bArr, i + 10);
        this.k0 = i(bArr, i + 24);
        this.l0 = i(bArr, i + 26);
        this.m0 = i(bArr, i + 28);
        this.n0 = i(bArr, i + 30);
        return 32;
    }

    public int hashCode() {
        return this.n0;
    }

    abstract int l(byte[] bArr, int i);

    String m(byte[] bArr, int i) {
        return o(bArr, i, 256, this.q0);
    }

    String n(byte[] bArr, int i, int i2, int i3, boolean z) {
        int i4 = 0;
        try {
            if (!z) {
                while (i < i2 && bArr[i + i4] != 0) {
                    if (i4 > i3) {
                        if (C2897e.c0 > 0) {
                            C2896d.a(System.err, bArr, i, i3 < 128 ? i3 + 8 : 128);
                        }
                        throw new RuntimeException("zero termination not found");
                    }
                    i4++;
                }
                return new String(bArr, i, i4, Z.K);
            }
            if ((i - this.f0) % 2 != 0) {
                i++;
            }
            while (true) {
                int i5 = i + i4;
                int i6 = i5 + 1;
                if (i6 >= i2 || (bArr[i5] == 0 && bArr[i6] == 0)) {
                    break;
                }
                if (i4 > i3) {
                    if (C2897e.c0 > 0) {
                        C2896d.a(System.err, bArr, i, i3 < 128 ? i3 + 8 : 128);
                    }
                    throw new RuntimeException("zero termination not found");
                }
                i4 += 2;
            }
            return new String(bArr, i, i4, "UTF-16LE");
        } catch (UnsupportedEncodingException e) {
            if (C2897e.c0 <= 1) {
                return null;
            }
            e.printStackTrace(A0);
            return null;
        }
    }

    String o(byte[] bArr, int i, int i2, boolean z) {
        int i3 = 0;
        try {
            if (!z) {
                while (bArr[i + i3] != 0) {
                    i3++;
                    if (i3 > i2) {
                        if (C2897e.c0 > 0) {
                            C2896d.a(System.err, bArr, i, i2 < 128 ? i2 + 8 : 128);
                        }
                        throw new RuntimeException("zero termination not found");
                    }
                }
                return new String(bArr, i, i3, Z.K);
            }
            if ((i - this.f0) % 2 != 0) {
                i++;
            }
            do {
                int i4 = i + i3;
                if (bArr[i4] == 0 && bArr[i4 + 1] == 0) {
                    return new String(bArr, i, i3, "UTF-16LE");
                }
                i3 += 2;
            } while (i3 <= i2);
            if (C2897e.c0 > 0) {
                C2896d.a(System.err, bArr, i, i2 < 128 ? i2 + 8 : 128);
            }
            throw new RuntimeException("zero termination not found");
        } catch (UnsupportedEncodingException e) {
            if (C2897e.c0 <= 1) {
                return null;
            }
            e.printStackTrace(A0);
            return null;
        }
    }

    int p(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (bArr[i + i3] != 0) {
            int i4 = i3 + 1;
            if (i3 > i2) {
                throw new RuntimeException("zero termination not found: " + this);
            }
            i3 = i4;
        }
        return i3;
    }

    void s() {
        this.e0 = (byte) 24;
        this.j0 = 0;
        this.i0 = 0;
        this.r0 = false;
        this.y0 = null;
    }

    int t(String str, int i) {
        int length = str.length() + 1;
        if (this.q0) {
            int length2 = str.length() * 2;
            length = length2 + 2;
            if (i % 2 != 0) {
                return length2 + 3;
            }
        }
        return length;
    }

    public String toString() {
        String str;
        byte b = this.d0;
        if (b == 0) {
            str = "SMB_COM_CREATE_DIRECTORY";
        } else if (b == 1) {
            str = "SMB_COM_DELETE_DIRECTORY";
        } else if (b == 4) {
            str = "SMB_COM_CLOSE";
        } else if (b == 16) {
            str = "SMB_COM_CHECK_DIRECTORY";
        } else if (b == 50) {
            str = "SMB_COM_TRANSACTION2";
        } else if (b == 52) {
            str = "SMB_COM_FIND_CLOSE2";
        } else if (b == 6) {
            str = "SMB_COM_DELETE";
        } else if (b == 7) {
            str = "SMB_COM_RENAME";
        } else if (b == 8) {
            str = "SMB_COM_QUERY_INFORMATION";
        } else if (b == 37) {
            str = "SMB_COM_TRANSACTION";
        } else if (b == 38) {
            str = "SMB_COM_TRANSACTION_SECONDARY";
        } else if (b == 42) {
            str = "SMB_COM_MOVE";
        } else if (b != 43) {
            switch (b) {
                case -96:
                    str = "SMB_COM_NT_TRANSACT";
                    break;
                case -95:
                    str = "SMB_COM_NT_TRANSACT_SECONDARY";
                    break;
                case -94:
                    str = "SMB_COM_NT_CREATE_ANDX";
                    break;
                default:
                    switch (b) {
                        case 45:
                            str = "SMB_COM_OPEN_ANDX";
                            break;
                        case 46:
                            str = "SMB_COM_READ_ANDX";
                            break;
                        case 47:
                            str = "SMB_COM_WRITE_ANDX";
                            break;
                        default:
                            switch (b) {
                                case 113:
                                    str = "SMB_COM_TREE_DISCONNECT";
                                    break;
                                case 114:
                                    str = "SMB_COM_NEGOTIATE";
                                    break;
                                case 115:
                                    str = "SMB_COM_SESSION_SETUP_ANDX";
                                    break;
                                case 116:
                                    str = "SMB_COM_LOGOFF_ANDX";
                                    break;
                                case 117:
                                    str = "SMB_COM_TREE_CONNECT_ANDX";
                                    break;
                                default:
                                    str = "UNKNOWN";
                                    break;
                            }
                    }
            }
        } else {
            str = "SMB_COM_ECHO";
        }
        int i = this.i0;
        return new String("command=" + str + ",received=" + this.r0 + ",errorCode=" + (i == 0 ? "0" : C2794a0.a(i)) + ",flags=0x" + C2896d.c(this.e0 & 255, 4) + ",flags2=0x" + C2896d.c(this.j0, 4) + ",signSeq=" + this.u0 + ",tid=" + this.k0 + ",pid=" + this.l0 + ",uid=" + this.m0 + ",mid=" + this.n0 + ",wordCount=" + this.o0 + ",byteCount=" + this.p0);
    }

    abstract int u(byte[] bArr, int i);

    int v(byte[] bArr, int i) {
        byte[] bArr2 = B0;
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
        bArr[i + 4] = this.d0;
        bArr[i + 9] = this.e0;
        w(this.j0, bArr, i + 10);
        w(this.k0, bArr, i + 24);
        w(this.l0, bArr, i + 26);
        w(this.m0, bArr, i + 28);
        w(this.n0, bArr, i + 30);
        return 32;
    }

    abstract int z(byte[] bArr, int i);
}
