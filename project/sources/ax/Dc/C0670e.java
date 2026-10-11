package ax.Dc;

import ax.Dc.I;
import j$.nio.channels.DesugarChannels;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.zip.ZipException;

/* renamed from: ax.Dc.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0670e implements Closeable, AutoCloseable {
    private static final Logger r0 = ax.Q2.g.a(C0670e.class);
    private static final byte[] s0 = new byte[1];
    private static final long t0 = U.h(J.J0);
    private final Map<String, LinkedList<I>> c0;
    private final ax.Rd.c d0;
    private Charset e0;
    private final String f0;
    private final FileChannel g0;
    private Closeable h0;
    private final boolean i0;
    private volatile boolean j0;
    private final byte[] k0;
    private final byte[] l0;
    private final byte[] m0;
    private final byte[] n0;
    private final ByteBuffer o0;
    private final ByteBuffer p0;
    private final List<I> q;
    private final ByteBuffer q0;

    /* renamed from: ax.Dc.e$b */
    private static class b extends I {
        b() {
        }

        @Override // ax.Dc.I
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                b bVar = (b) obj;
                if (t() == bVar.t() && k() == bVar.k()) {
                    return true;
                }
            }
            return false;
        }

        @Override // ax.Dc.I, java.util.zip.ZipEntry
        public int hashCode() {
            return (super.hashCode() * 3) + ((int) t()) + ((int) (t() >> 32));
        }
    }

    /* renamed from: ax.Dc.e$c */
    private static final class c {
        private final byte[] a;
        private final byte[] b;

        private c(byte[] bArr, byte[] bArr2) {
            this.a = bArr;
            this.b = bArr2;
        }
    }

    C0670e(File file) throws IOException {
        this(file, "UTF8", true);
    }

    public static Charset a(File file) {
        C0670e c0670e;
        C0670e c0670e2 = null;
        try {
            try {
                c0670e = new C0670e(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        } catch (RuntimeException unused) {
        }
        try {
            Charset c2 = c0670e.c();
            try {
                c0670e.close();
            } catch (IOException unused2) {
            }
            return c2;
        } catch (IOException e2) {
            e = e2;
            c0670e2 = c0670e;
            e.printStackTrace();
            Charset defaultCharset = Charset.defaultCharset();
            if (c0670e2 != null) {
                try {
                    c0670e2.close();
                } catch (IOException unused3) {
                }
            }
            return defaultCharset;
        } catch (RuntimeException unused4) {
            c0670e2 = c0670e;
            Charset defaultCharset2 = Charset.defaultCharset();
            if (c0670e2 != null) {
                try {
                    c0670e2.close();
                } catch (IOException unused5) {
                }
            }
            return defaultCharset2;
        } catch (Throwable th2) {
            th = th2;
            c0670e2 = c0670e;
            if (c0670e2 != null) {
                try {
                    c0670e2.close();
                } catch (IOException unused6) {
                }
            }
            throw th;
        }
    }

    public static Charset b(FileDescriptor fileDescriptor) {
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        Throwable th;
        C0670e c0670e;
        IOException e;
        FileInputStream fileInputStream = new FileInputStream(fileDescriptor);
        convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
        C0670e c0670e2 = null;
        try {
            try {
                try {
                    c0670e = new C0670e(convertMaybeLegacyFileChannelFromLibrary);
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            c0670e2.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (convertMaybeLegacyFileChannelFromLibrary != null) {
                        try {
                            convertMaybeLegacyFileChannelFromLibrary.close();
                        } catch (IOException unused2) {
                        }
                    }
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (IOException unused3) {
                        throw th;
                    }
                }
            } catch (IOException e2) {
                c0670e = null;
                e = e2;
            } catch (RuntimeException unused4) {
            }
            try {
                Charset c2 = c0670e.c();
                try {
                    c0670e.close();
                } catch (IOException unused5) {
                }
                if (convertMaybeLegacyFileChannelFromLibrary != null) {
                    try {
                        convertMaybeLegacyFileChannelFromLibrary.close();
                    } catch (IOException unused6) {
                    }
                }
                try {
                    fileInputStream.close();
                } catch (IOException unused7) {
                }
                return c2;
            } catch (IOException e3) {
                e = e3;
                e.printStackTrace();
                Charset defaultCharset = Charset.defaultCharset();
                if (c0670e != null) {
                    try {
                        c0670e.close();
                    } catch (IOException unused8) {
                    }
                }
                if (convertMaybeLegacyFileChannelFromLibrary != null) {
                    try {
                        convertMaybeLegacyFileChannelFromLibrary.close();
                    } catch (IOException unused9) {
                    }
                }
                try {
                    fileInputStream.close();
                } catch (IOException unused10) {
                }
                return defaultCharset;
            } catch (RuntimeException unused11) {
                c0670e2 = c0670e;
                Charset defaultCharset2 = Charset.defaultCharset();
                if (c0670e2 != null) {
                    try {
                        c0670e2.close();
                    } catch (IOException unused12) {
                    }
                }
                if (convertMaybeLegacyFileChannelFromLibrary != null) {
                    try {
                        convertMaybeLegacyFileChannelFromLibrary.close();
                    } catch (IOException unused13) {
                    }
                }
                try {
                    fileInputStream.close();
                } catch (IOException unused14) {
                }
                return defaultCharset2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private Map<I, c> d() throws IOException {
        HashMap hashMap = new HashMap();
        e();
        this.p0.rewind();
        ax.Kc.n.f(this.g0, this.p0);
        long h = U.h(this.l0);
        if (h != t0 && q()) {
            throw new IOException("central directory is empty, can't expand corrupt archive.");
        }
        while (h == t0) {
            m(hashMap);
            if (this.d0.c() != null) {
                break;
            }
            this.p0.rewind();
            ax.Kc.n.f(this.g0, this.p0);
            h = U.h(this.l0);
        }
        this.d0.a();
        String c2 = this.d0.c();
        if (c2 != null) {
            r0.fine("zip file encoding detected :" + c2);
            try {
                this.e0 = Charset.forName(c2);
            } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
            }
        }
        return hashMap;
    }

    private void e() throws IOException {
        j();
        boolean z = false;
        boolean z2 = this.g0.position() > 20;
        if (z2) {
            FileChannel fileChannel = this.g0;
            fileChannel.position(fileChannel.position() - 20);
            this.p0.rewind();
            ax.Kc.n.f(this.g0, this.p0);
            z = Arrays.equals(J.M0, this.l0);
        }
        if (z) {
            g();
            return;
        }
        if (z2) {
            p(16);
        }
        f();
    }

    private void f() throws IOException {
        p(16);
        this.p0.rewind();
        ax.Kc.n.f(this.g0, this.p0);
        this.g0.position(U.h(this.l0));
    }

    private void g() throws IOException {
        p(4);
        this.o0.rewind();
        ax.Kc.n.f(this.g0, this.o0);
        this.g0.position(K.e(this.k0));
        this.p0.rewind();
        ax.Kc.n.f(this.g0, this.p0);
        if (!Arrays.equals(this.l0, J.L0)) {
            throw new ZipException("archive's ZIP64 end of central directory locator is corrupt.");
        }
        p(44);
        this.o0.rewind();
        ax.Kc.n.f(this.g0, this.o0);
        this.g0.position(K.e(this.k0));
    }

    private void j() throws IOException {
        if (!u(22L, 65557L, J.K0)) {
            throw new ZipException("archive is not a ZIP archive");
        }
    }

    private void m(Map<I, c> map) throws IOException {
        this.q0.rewind();
        ax.Kc.n.f(this.g0, this.q0);
        b bVar = new b();
        int h = W.h(this.m0, 0);
        bVar.R(h);
        bVar.O((h >> 8) & 15);
        bVar.S(W.h(this.m0, 2));
        C0675j f = C0675j.f(this.m0, 4);
        boolean m = f.m();
        if (m) {
            bVar.N(I.d.NAME_WITH_EFS_FLAG);
        }
        bVar.I(f);
        bVar.P(W.h(this.m0, 4));
        bVar.setMethod(W.h(this.m0, 6));
        bVar.setTime(Z.d(U.i(this.m0, 8)));
        bVar.setCrc(U.i(this.m0, 12));
        bVar.setCompressedSize(U.i(this.m0, 16));
        bVar.setSize(U.i(this.m0, 20));
        int h2 = W.h(this.m0, 24);
        int h3 = W.h(this.m0, 26);
        int h4 = W.h(this.m0, 28);
        int h5 = W.h(this.m0, 30);
        bVar.J(W.h(this.m0, 32));
        bVar.F(U.i(this.m0, 34));
        byte[] bArr = new byte[h2];
        ax.Kc.n.f(this.g0, ByteBuffer.wrap(bArr));
        this.d0.d(bArr, 0, h2);
        bVar.K(U.i(this.m0, 38));
        this.q.add(bVar);
        byte[] bArr2 = new byte[h3];
        ax.Kc.n.f(this.g0, ByteBuffer.wrap(bArr2));
        bVar.B(bArr2);
        o(bVar, h5);
        byte[] bArr3 = new byte[h4];
        ax.Kc.n.f(this.g0, ByteBuffer.wrap(bArr3));
        if (m || !this.i0) {
            return;
        }
        map.put(bVar, new c(bArr, bArr3));
    }

    private void o(I i, int i2) throws IOException {
        F f = (F) i.n(F.g0);
        if (f != null) {
            boolean z = i.getSize() == 4294967295L;
            boolean z2 = i.getCompressedSize() == 4294967295L;
            boolean z3 = i.t() == 4294967295L;
            f.m(z, z2, z3, i2 == 65535);
            if (z) {
                i.setSize(f.l().d());
            } else if (z2) {
                f.q(new K(i.getSize()));
            }
            if (z2) {
                i.setCompressedSize(f.e().d());
            } else if (z) {
                f.n(new K(i.getCompressedSize()));
            }
            if (z3) {
                i.K(f.k().d());
            }
        }
    }

    private void p(int i) throws IOException {
        long position = this.g0.position() + i;
        if (position > this.g0.size()) {
            throw new EOFException();
        }
        this.g0.position(position);
    }

    private boolean q() throws IOException {
        this.g0.position(0L);
        this.p0.rewind();
        ax.Kc.n.f(this.g0, this.p0);
        return Arrays.equals(this.l0, J.H0);
    }

    private boolean u(long j, long j2, byte[] bArr) throws IOException {
        long size = this.g0.size() - j;
        long max = Math.max(0L, this.g0.size() - j2);
        boolean z = false;
        if (size >= 0) {
            while (true) {
                if (size < max) {
                    break;
                }
                this.g0.position(size);
                try {
                    this.p0.rewind();
                    ax.Kc.n.f(this.g0, this.p0);
                    this.p0.flip();
                    if (this.p0.get() == bArr[0] && this.p0.get() == bArr[1] && this.p0.get() == bArr[2] && this.p0.get() == bArr[3]) {
                        z = true;
                        break;
                    }
                    size--;
                } catch (EOFException unused) {
                }
            }
        }
        if (z) {
            this.g0.position(size);
        }
        return z;
    }

    public Charset c() {
        Charset charset = this.e0;
        return charset != null ? charset : Charset.defaultCharset();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.j0 = true;
        this.g0.close();
        Closeable closeable = this.h0;
        if (closeable != null) {
            closeable.close();
        }
    }

    protected void finalize() throws Throwable {
        try {
            if (!this.j0) {
                System.err.println("Cleaning up unclosed ZipFile for archive " + this.f0);
                close();
            }
        } finally {
            super.finalize();
        }
    }

    public C0670e(File file, String str, boolean z) throws IOException {
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        this.q = new LinkedList();
        this.c0 = new HashMap(509);
        this.j0 = true;
        byte[] bArr = new byte[8];
        this.k0 = bArr;
        byte[] bArr2 = new byte[4];
        this.l0 = bArr2;
        byte[] bArr3 = new byte[42];
        this.m0 = bArr3;
        this.n0 = new byte[2];
        this.o0 = ByteBuffer.wrap(bArr);
        this.p0 = ByteBuffer.wrap(bArr2);
        this.q0 = ByteBuffer.wrap(bArr3);
        this.d0 = new ax.Rd.c(null);
        String absolutePath = file.getAbsolutePath();
        FileInputStream fileInputStream = new FileInputStream(file);
        this.h0 = fileInputStream;
        convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
        this.f0 = absolutePath;
        this.i0 = z;
        this.g0 = convertMaybeLegacyFileChannelFromLibrary;
        try {
            d();
            this.j0 = false;
        } catch (Throwable th) {
            this.j0 = true;
            ax.Kc.n.a(this.g0);
            throw th;
        }
    }

    public C0670e(FileChannel fileChannel) throws IOException {
        this(fileChannel, "unknown archive", "UTF8", true, false);
    }

    private C0670e(FileChannel fileChannel, String str, String str2, boolean z, boolean z2) throws IOException {
        this.q = new LinkedList();
        this.c0 = new HashMap(509);
        this.j0 = true;
        byte[] bArr = new byte[8];
        this.k0 = bArr;
        byte[] bArr2 = new byte[4];
        this.l0 = bArr2;
        byte[] bArr3 = new byte[42];
        this.m0 = bArr3;
        this.n0 = new byte[2];
        this.o0 = ByteBuffer.wrap(bArr);
        this.p0 = ByteBuffer.wrap(bArr2);
        this.q0 = ByteBuffer.wrap(bArr3);
        this.d0 = new ax.Rd.c(null);
        this.f0 = str;
        this.i0 = z;
        this.g0 = fileChannel;
        try {
            d();
            this.j0 = false;
        } catch (Throwable th) {
            this.j0 = true;
            if (z2) {
                ax.Kc.n.a(this.g0);
            }
            throw th;
        }
    }
}
