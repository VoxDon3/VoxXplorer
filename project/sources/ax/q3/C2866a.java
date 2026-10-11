package ax.q3;

import java.io.IOException;
import java.io.Reader;

/* renamed from: ax.q3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2866a extends Reader implements AutoCloseable {
    private static int l0 = 8192;
    private static int m0 = 80;
    private char[] c0;
    private int d0;
    private int e0;
    private int f0;
    private int g0;
    private boolean h0;
    private boolean i0;
    private boolean j0;
    private boolean k0;
    private Reader q;

    public C2866a(Reader reader, int i) {
        super(reader);
        this.f0 = -1;
        this.g0 = 0;
        this.h0 = false;
        this.i0 = false;
        this.j0 = false;
        this.k0 = false;
        if (i <= 0) {
            throw new IllegalArgumentException("Buffer size <= 0");
        }
        this.q = reader;
        this.c0 = new char[i];
        this.d0 = 0;
        this.e0 = 0;
    }

    private void b() throws IOException {
        if (this.q == null) {
            throw new IOException("Stream closed");
        }
    }

    private void c() throws IOException {
        int read;
        int i = this.f0;
        int i2 = 0;
        if (i > -1) {
            int i3 = this.e0 - i;
            int i4 = this.g0;
            if (i3 >= i4) {
                this.f0 = -2;
                this.g0 = 0;
            } else {
                char[] cArr = this.c0;
                if (i4 <= cArr.length) {
                    System.arraycopy(cArr, i, cArr, 0, i3);
                    this.f0 = 0;
                } else {
                    int length = cArr.length * 2;
                    if (length <= i4) {
                        i4 = length;
                    }
                    char[] cArr2 = new char[i4];
                    System.arraycopy(cArr, i, cArr2, 0, i3);
                    this.c0 = cArr2;
                    this.f0 = 0;
                }
                this.d0 = i3;
                this.e0 = i3;
                i2 = i3;
            }
        }
        do {
            Reader reader = this.q;
            char[] cArr3 = this.c0;
            read = reader.read(cArr3, i2, cArr3.length - i2);
        } while (read == 0);
        if (read > 0) {
            this.d0 = read + i2;
            this.e0 = i2;
        }
    }

    private int d(char[] cArr, int i, int i2) throws IOException {
        if (this.e0 >= this.d0) {
            if (i2 >= this.c0.length && this.f0 <= -1 && !this.h0) {
                return this.q.read(cArr, i, i2);
            }
            c();
        }
        int i3 = this.e0;
        int i4 = this.d0;
        if (i3 >= i4) {
            return -1;
        }
        if (this.h0) {
            this.h0 = false;
            if (this.c0[i3] == '\n') {
                int i5 = i3 + 1;
                this.e0 = i5;
                if (i5 >= i4) {
                    c();
                }
                if (this.e0 >= this.d0) {
                    return -1;
                }
            }
        }
        int min = Math.min(i2, this.d0 - this.e0);
        System.arraycopy(this.c0, this.e0, cArr, i, min);
        this.e0 += min;
        return min;
    }

    public boolean a() {
        return this.j0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (((Reader) this).lock) {
            Reader reader = this.q;
            if (reader == null) {
                return;
            }
            try {
                reader.close();
            } finally {
                this.q = null;
                this.c0 = null;
            }
        }
    }

    public String e() throws IOException {
        return f(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0015, B:11:0x001b, B:13:0x0021, B:14:0x0024, B:53:0x002a, B:55:0x002e, B:57:0x0034, B:58:0x0038, B:60:0x003a, B:18:0x0040, B:20:0x0046, B:21:0x004a, B:22:0x004f, B:24:0x0055, B:27:0x005e, B:31:0x0064, B:40:0x006c, B:41:0x007f, B:43:0x0086, B:44:0x0088, B:45:0x008a, B:48:0x0075, B:34:0x008e, B:36:0x0095), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String f(boolean r10) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.Object r0 = r9.lock
            monitor-enter(r0)
            r9.b()     // Catch: java.lang.Throwable -> L11
            r1 = 0
            r2 = 1
            if (r10 != 0) goto L14
            boolean r10 = r9.h0     // Catch: java.lang.Throwable -> L11
            if (r10 == 0) goto Lf
            goto L14
        Lf:
            r10 = 0
            goto L15
        L11:
            r10 = move-exception
            goto L9e
        L14:
            r10 = 1
        L15:
            r9.j0 = r1     // Catch: java.lang.Throwable -> L11
            r9.k0 = r1     // Catch: java.lang.Throwable -> L11
            r3 = 0
            r4 = r3
        L1b:
            int r5 = r9.e0     // Catch: java.lang.Throwable -> L11
            int r6 = r9.d0     // Catch: java.lang.Throwable -> L11
            if (r5 < r6) goto L24
            r9.c()     // Catch: java.lang.Throwable -> L11
        L24:
            int r5 = r9.e0     // Catch: java.lang.Throwable -> L11
            int r6 = r9.d0     // Catch: java.lang.Throwable -> L11
            if (r5 < r6) goto L3c
            r9.k0 = r2     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L3a
            int r10 = r4.length()     // Catch: java.lang.Throwable -> L11
            if (r10 <= 0) goto L3a
            java.lang.String r10 = r4.toString()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r10
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r3
        L3c:
            r6 = 10
            if (r10 == 0) goto L4a
            char[] r10 = r9.c0     // Catch: java.lang.Throwable -> L11
            char r10 = r10[r5]     // Catch: java.lang.Throwable -> L11
            if (r10 != r6) goto L4a
            int r5 = r5 + 1
            r9.e0 = r5     // Catch: java.lang.Throwable -> L11
        L4a:
            r9.h0 = r1     // Catch: java.lang.Throwable -> L11
            int r10 = r9.e0     // Catch: java.lang.Throwable -> L11
            r5 = 0
        L4f:
            int r7 = r9.d0     // Catch: java.lang.Throwable -> L11
            r8 = 13
            if (r10 >= r7) goto L63
            char[] r5 = r9.c0     // Catch: java.lang.Throwable -> L11
            char r5 = r5[r10]     // Catch: java.lang.Throwable -> L11
            if (r5 == r6) goto L61
            if (r5 != r8) goto L5e
            goto L61
        L5e:
            int r10 = r10 + 1
            goto L4f
        L61:
            r6 = 1
            goto L64
        L63:
            r6 = 0
        L64:
            int r7 = r9.e0     // Catch: java.lang.Throwable -> L11
            r9.e0 = r10     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L8c
            if (r4 != 0) goto L75
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L11
            char[] r3 = r9.c0     // Catch: java.lang.Throwable -> L11
            int r10 = r10 - r7
            r1.<init>(r3, r7, r10)     // Catch: java.lang.Throwable -> L11
            goto L7f
        L75:
            char[] r1 = r9.c0     // Catch: java.lang.Throwable -> L11
            int r10 = r10 - r7
            r4.append(r1, r7, r10)     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L11
        L7f:
            int r10 = r9.e0     // Catch: java.lang.Throwable -> L11
            int r10 = r10 + r2
            r9.e0 = r10     // Catch: java.lang.Throwable -> L11
            if (r5 != r8) goto L88
            r9.h0 = r2     // Catch: java.lang.Throwable -> L11
        L88:
            r9.j0 = r2     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L8c:
            if (r4 != 0) goto L95
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L11
            int r5 = ax.q3.C2866a.m0     // Catch: java.lang.Throwable -> L11
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L11
        L95:
            char[] r5 = r9.c0     // Catch: java.lang.Throwable -> L11
            int r10 = r10 - r7
            r4.append(r5, r7, r10)     // Catch: java.lang.Throwable -> L11
            r10 = 0
            goto L1b
        L9e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.q3.C2866a.f(boolean):java.lang.String");
    }

    @Override // java.io.Reader
    public void mark(int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Read-ahead limit < 0");
        }
        synchronized (((Reader) this).lock) {
            b();
            this.g0 = i;
            this.f0 = this.e0;
            this.i0 = this.h0;
        }
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        synchronized (((Reader) this).lock) {
            try {
                b();
                while (true) {
                    if (this.e0 >= this.d0) {
                        c();
                        if (this.e0 >= this.d0) {
                            return -1;
                        }
                    }
                    if (!this.h0) {
                        break;
                    }
                    this.h0 = false;
                    char[] cArr = this.c0;
                    int i = this.e0;
                    if (cArr[i] != '\n') {
                        break;
                    }
                    this.e0 = i + 1;
                }
                char[] cArr2 = this.c0;
                int i2 = this.e0;
                this.e0 = i2 + 1;
                return cArr2[i2];
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        boolean z;
        synchronized (((Reader) this).lock) {
            try {
                b();
                if (this.h0) {
                    if (this.e0 >= this.d0 && this.q.ready()) {
                        c();
                    }
                    int i = this.e0;
                    if (i < this.d0) {
                        if (this.c0[i] == '\n') {
                            this.e0 = i + 1;
                        }
                        this.h0 = false;
                    }
                }
                z = this.e0 < this.d0 || this.q.ready();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
        synchronized (((Reader) this).lock) {
            try {
                b();
                int i = this.f0;
                if (i < 0) {
                    throw new IOException(this.f0 == -2 ? "Mark invalid" : "Stream not marked");
                }
                this.e0 = i;
                this.h0 = this.i0;
            } finally {
            }
        }
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        long j2;
        long j3 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("skip value is negative");
        }
        synchronized (((Reader) this).lock) {
            try {
                b();
                long j4 = j;
                while (j4 > 0) {
                    if (this.e0 >= this.d0) {
                        c();
                    }
                    int i = this.e0;
                    int i2 = this.d0;
                    if (i >= i2) {
                        break;
                    }
                    if (this.h0) {
                        this.h0 = false;
                        if (this.c0[i] == '\n') {
                            this.e0 = i + 1;
                        }
                    }
                    int i3 = this.e0;
                    long j5 = i2 - i3;
                    if (j4 <= j5) {
                        this.e0 = (int) (i3 + j4);
                        break;
                    }
                    j4 -= j5;
                    this.e0 = i2;
                }
                j3 = j4;
                j2 = j - j3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2;
    }

    public C2866a(Reader reader) {
        this(reader, l0);
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        synchronized (((Reader) this).lock) {
            try {
                b();
                if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) > cArr.length || i3 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                if (i2 == 0) {
                    return 0;
                }
                int d = d(cArr, i, i2);
                if (d <= 0) {
                    return d;
                }
                while (d < i2 && this.q.ready()) {
                    int d2 = d(cArr, i + d, i2 - d);
                    if (d2 > 0) {
                        d += d2;
                    }
                }
                return d;
            } finally {
            }
        }
    }
}
