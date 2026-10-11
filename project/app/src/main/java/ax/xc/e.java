/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.Ob.d;
import ax.tb.i;
import ax.xc.A;
import ax.xc.C;
import ax.xc.D;
import ax.xc.b;
import ax.xc.f;
import ax.xc.g;
import ax.xc.h;
import ax.xc.p;
import ax.xc.s;
import ax.xc.u;
import ax.xc.x;
import ax.xc.y;
import ax.xc.z;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

public final class e
implements g,
f,
Cloneable,
ByteChannel,
AutoCloseable {
    private long c0;
    public x q;

    public static /* synthetic */ a L0(e e8, a a8, int n8, Object object) {
        if ((n8 & 1) != 0) {
            a8 = b.d();
        }
        return e8.G0(a8);
    }

    public OutputStream A0() {
        return new AutoCloseable(this){
            final e q;
            {
                this.q = e8;
            }

            @Override
            public void close() {
            }

            @Override
            public void flush() {
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.q);
                stringBuilder.append(".outputStream()");
                return stringBuilder.toString();
            }

            @Override
            public void write(int n8) {
                this.q.j1(n8);
            }

            @Override
            public void write(byte[] byArray, int n8, int n9) {
                l.f(byArray, "data");
                this.q.i1(byArray, n8, n9);
            }
        };
    }

    @Override
    public h B(long l8) throws EOFException {
        if (l8 >= 0L && l8 <= Integer.MAX_VALUE) {
            if (this.size() >= l8) {
                if (l8 >= 4096L) {
                    h h8 = this.d1((int)l8);
                    this.skip(l8);
                    return h8;
                }
                return new h(this.y0(l8));
            }
            throw new EOFException();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("byteCount: ");
        stringBuilder.append(l8);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public boolean C0(long l8, h h8, int n8, int n9) {
        l.f(h8, "bytes");
        if (l8 >= 0L && n8 >= 0 && n9 >= 0 && this.size() - l8 >= (long)n9 && h8.G() - n8 >= n9) {
            for (int i8 = 0; i8 < n9; ++i8) {
                if (this.v((long)i8 + l8) == h8.n(n8 + i8)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public int D0(byte[] byArray, int n8, int n9) {
        l.f(byArray, "sink");
        b.b(byArray.length, n8, n9);
        x x8 = this.q;
        if (x8 == null) {
            return -1;
        }
        int n10 = Math.min(n9, x8.c - x8.b);
        byte[] byArray2 = x8.a;
        n9 = x8.b;
        i.d(byArray2, byArray, n8, n9, n9 + n10);
        x8.b += n10;
        this.b1(this.size() - (long)n10);
        if (x8.b == x8.c) {
            this.q = x8.b();
            y.b(x8);
        }
        return n10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public long F(byte by, long l8, long l9) {
        long l10 = 0L;
        if (0L <= l8 && l8 <= l9) {
            int n8;
            long l11 = l9;
            if (l9 > this.size()) {
                l11 = this.size();
            }
            if (l8 == l11) {
                return -1L;
            }
            Object object = this.q;
            if (object == null) {
                return -1L;
            }
            l9 = l10;
            Object object2 = object;
            if (this.size() - l8 < l8) {
                long l12;
                l10 = this.size();
                while (true) {
                    l9 = l10;
                    object2 = object;
                    l12 = l8;
                    if (l10 <= l8) break;
                    object = ((x)object).g;
                    l.c(object);
                    l10 -= (long)(((x)object).c - ((x)object).b);
                }
                while (l9 < l11) {
                    object = ((x)object2).a;
                    int n9 = (int)Math.min((long)((x)object2).c, (long)((x)object2).b + l11 - l9);
                    for (n8 = (int)((long)((x)object2).b + l12 - l9); n8 < n9; ++n8) {
                        if (object[n8] != by) continue;
                        return (long)(n8 - ((x)object2).b) + l9;
                    }
                    object2 = ((x)object2).f;
                    l.c(object2);
                    l12 = l9 += (long)(((x)object2).c - ((x)object2).b);
                }
                return -1L;
            }
            while (true) {
                long l13 = (long)(((x)object2).c - ((x)object2).b) + l9;
                object = object2;
                l10 = l8;
                if (l13 > l8) break;
                object2 = ((x)object2).f;
                l.c(object2);
                l9 = l13;
            }
            while (l9 < l11) {
                object2 = ((x)object).a;
                int n10 = (int)Math.min((long)((x)object).c, (long)((x)object).b + l11 - l9);
                for (n8 = (int)((long)((x)object).b + l10 - l9); n8 < n10; ++n8) {
                    if (object2[n8] != by) continue;
                    object2 = object;
                    return (long)(n8 - ((x)object2).b) + l9;
                }
                object = ((x)object).f;
                l.c(object);
                l10 = l9 += (long)(((x)object).c - ((x)object).b);
            }
            return -1L;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size=");
        stringBuilder.append(this.size());
        stringBuilder.append(" fromIndex=");
        stringBuilder.append(l8);
        stringBuilder.append(" toIndex=");
        stringBuilder.append(l9);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public final a G0(a a8) {
        l.f(a8, "unsafeCursor");
        return ax.yc.a.a(this, a8);
    }

    public long H(h h8) throws IOException {
        l.f(h8, "bytes");
        return this.L(h8, 0L);
    }

    @Override
    public long J0(A a8) throws IOException {
        l.f(a8, "sink");
        long l8 = this.size();
        if (l8 > 0L) {
            a8.write(this, l8);
        }
        return l8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public long L(h object, long l8) throws IOException {
        int n8;
        long l9;
        l.f(object, "bytes");
        if (((h)object).G() <= 0) throw new IllegalArgumentException("bytes is empty");
        long l10 = 0L;
        if (l8 < 0L) {
            object = new StringBuilder();
            ((StringBuilder)object).append("fromIndex < 0: ");
            ((StringBuilder)object).append(l8);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }
        Object object2 = this.q;
        if (object2 == null) {
            return -1L;
        }
        if (this.size() - l8 >= l8) {
            while ((l9 = (long)(((x)object2).c - ((x)object2).b) + l10) <= l8) {
                object2 = ((x)object2).f;
                l.c(object2);
                l10 = l9;
            }
        } else {
            for (l10 = this.size(); l10 > l8; l10 -= (long)(((x)object2).c - ((x)object2).b)) {
                object2 = ((x)object2).g;
                l.c(object2);
            }
            byte[] byArray = ((h)object).u();
            byte by = byArray[0];
            int n9 = ((h)object).G();
            long l11 = this.size() - (long)n9 + 1L;
            while (l10 < l11) {
                object = ((x)object2).a;
                n8 = ((x)object2).c;
                long l12 = ((x)object2).b;
                int n10 = (int)Math.min((long)n8, l12 + l11 - l10);
                for (n8 = (int)((long)((x)object2).b + l8 - l10); n8 < n10; ++n8) {
                    if (object[n8] != by || !ax.yc.a.c((x)object2, n8 + 1, byArray, 1, n9)) continue;
                    object = object2;
                    return (long)(n8 - ((x)object).b) + l10;
                }
                object2 = ((x)object2).f;
                l.c(object2);
                l8 = l10 += (long)(((x)object2).c - ((x)object2).b);
            }
            return -1L;
        }
        byte[] byArray = ((h)object).u();
        byte by = byArray[0];
        int n11 = ((h)object).G();
        l9 = this.size() - (long)n11 + 1L;
        object = object2;
        while (l10 < l9) {
            object2 = ((x)object).a;
            n8 = ((x)object).c;
            long l13 = ((x)object).b;
            int n12 = (int)Math.min((long)n8, l13 + l9 - l10);
            for (n8 = (int)((long)((x)object).b + l8 - l10); n8 < n12; ++n8) {
                if (object2[n8] != by || !ax.yc.a.c((x)object, n8 + 1, byArray, 1, n11)) continue;
                return (long)(n8 - ((x)object).b) + l10;
            }
            object = ((x)object).f;
            l.c(object);
            l8 = l10 += (long)(((x)object).c - ((x)object).b);
        }
        return -1L;
    }

    @Override
    public long M(C c8) throws IOException {
        long l8;
        l.f(c8, "source");
        long l9 = 0L;
        while ((l8 = c8.read(this, 8192L)) != -1L) {
            l9 += l8;
        }
        return l9;
    }

    public int M0() throws EOFException {
        return b.h(this.readInt());
    }

    @Override
    public byte[] O() {
        return this.y0(this.size());
    }

    @Override
    public int O0(s s8) {
        l.f(s8, "options");
        int n8 = ax.yc.a.f(this, s8, false, 2, null);
        if (n8 == -1) {
            return -1;
        }
        this.skip(s8.n()[n8].G());
        return n8;
    }

    @Override
    public boolean P() {
        return this.c0 == 0L;
    }

    @Override
    public void P0(long l8) throws EOFException {
        if (this.c0 >= l8) {
            return;
        }
        throw new EOFException();
    }

    @Override
    public long S() throws EOFException {
        block10: {
            Object object;
            Object object2;
            long l8 = this.size();
            long l9 = 0L;
            if (l8 == 0L) break block10;
            int n8 = 0;
            long l10 = 0L;
            l8 = -7L;
            boolean bl = false;
            int n9 = 0;
            do {
                object2 = this.q;
                l.c(object2);
                object = ((x)object2).a;
                int n10 = ((x)object2).b;
                int n11 = ((x)object2).c;
                while (n10 < n11) {
                    block14: {
                        block13: {
                            byte by;
                            block11: {
                                block12: {
                                    by = object[n10];
                                    if (by < 48 || by > 57) break block11;
                                    int n12 = 48 - by;
                                    long l11 = l10 - -922337203685477580L;
                                    long l12 = l11 == 0L ? 0 : (l11 < 0L ? -1 : 1);
                                    if (l12 < 0 || l12 == false && (long)n12 < l8) break block12;
                                    l10 = l10 * 10L + (long)n12;
                                    break block13;
                                }
                                object = new e().k1(l10).j1(by);
                                if (!bl) {
                                    ((e)object).readByte();
                                }
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append("Number too large: ");
                                ((StringBuilder)object2).append(((e)object).Z0());
                                throw new NumberFormatException(((StringBuilder)object2).toString());
                            }
                            if (by != 45 || n8 != 0) break block14;
                            --l8;
                            bl = true;
                        }
                        ++n10;
                        ++n8;
                        continue;
                    }
                    n9 = 1;
                    break;
                }
                if (n10 == n11) {
                    this.q = ((x)object2).b();
                    y.b((x)object2);
                    continue;
                }
                ((x)object2).b = n10;
            } while (n9 == 0 && this.q != null);
            this.b1(this.size() - (long)n8);
            n9 = bl ? 2 : 1;
            if (n8 < n9) {
                if (this.size() != l9) {
                    object = bl ? (Object)"Expected a digit" : (Object)"Expected a digit or '-'";
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append(" but was 0x");
                    ((StringBuilder)object2).append(b.j(this.v(l9)));
                    throw new NumberFormatException(((StringBuilder)object2).toString());
                }
                throw new EOFException();
            }
            if (bl) {
                return l10;
            }
            return -l10;
        }
        throw new EOFException();
    }

    @Override
    public void T(e e8, long l8) throws EOFException {
        l.f(e8, "sink");
        if (this.size() >= l8) {
            e8.write(this, l8);
            return;
        }
        e8.write(this, this.size());
        throw new EOFException();
    }

    public short T0() throws EOFException {
        return b.i(this.readShort());
    }

    @Override
    public String U(long l8) throws EOFException {
        if (l8 >= 0L) {
            long l9 = Long.MAX_VALUE;
            if (l8 != Long.MAX_VALUE) {
                l9 = l8 + 1L;
            }
            long l10 = this.F((byte)10, 0L, l9);
            if (l10 != -1L) {
                return ax.yc.a.d(this, l10);
            }
            if (l9 < this.size() && this.v(l9 - 1L) == 13 && this.v(l9) == 10) {
                return ax.yc.a.d(this, l9);
            }
            e e8 = new e();
            l9 = this.size();
            this.j(e8, 0L, Math.min((long)32, l9));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\\n not found: limit=");
            stringBuilder.append(Math.min(this.size(), l8));
            stringBuilder.append(" content=");
            stringBuilder.append(e8.m0().t());
            stringBuilder.append('\u2026');
            throw new EOFException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("limit < 0: ");
        stringBuilder.append(l8);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    @Override
    public long U0() throws EOFException {
        if (this.size() != 0L) {
            int n8;
            long l8;
            int n9 = 0;
            long l9 = 0L;
            boolean bl = false;
            do {
                boolean bl2;
                int n10;
                int n11;
                Object object;
                block11: {
                    byte by;
                    Object object2;
                    block12: {
                        object = this.q;
                        l.c(object);
                        object2 = ((x)object).a;
                        n11 = ((x)object).b;
                        n10 = ((x)object).c;
                        l8 = l9;
                        n8 = n9;
                        while (true) {
                            bl2 = bl;
                            if (n11 >= n10) break block11;
                            by = object2[n11];
                            if (by >= 48 && by <= 57) {
                                n9 = by - 48;
                            } else if (by >= 97 && by <= 102) {
                                n9 = by - 87;
                            } else {
                                if (by < 65 || by > 70) break block12;
                                n9 = by - 55;
                            }
                            if ((0xF000000000000000L & l8) != 0L) break;
                            l8 = l8 << 4 | (long)n9;
                            ++n11;
                            ++n8;
                        }
                        object2 = new e().l1(l8).j1(by);
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Number too large: ");
                        ((StringBuilder)object).append(((e)object2).Z0());
                        throw new NumberFormatException(((StringBuilder)object).toString());
                    }
                    if (n8 != 0) {
                        bl2 = true;
                    } else {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Expected leading [0-9a-fA-F] character but was 0x");
                        ((StringBuilder)object2).append(b.j(by));
                        throw new NumberFormatException(((StringBuilder)object2).toString());
                    }
                }
                if (n11 == n10) {
                    this.q = ((x)object).b();
                    y.b((x)object);
                } else {
                    ((x)object).b = n11;
                }
                if (bl2) break;
                n9 = n8;
                bl = bl2;
                l9 = l8;
            } while (this.q != null);
            this.b1(this.size() - (long)n8);
            return l8;
        }
        throw new EOFException();
    }

    @Override
    public InputStream V0() {
        return new j.InputStreamRetargetInterface(this){
            final e q;
            {
                this.q = e8;
            }

            @Override
            public int available() {
                return (int)Math.min(this.q.size(), (long)Integer.MAX_VALUE);
            }

            @Override
            public void close() {
            }

            @Override
            public int read() {
                if (this.q.size() > 0L) {
                    return this.q.readByte() & 0xFF;
                }
                return -1;
            }

            @Override
            public int read(byte[] byArray, int n8, int n9) {
                l.f(byArray, "sink");
                return this.q.D0(byArray, n8, n9);
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.q);
                stringBuilder.append(".inputStream()");
                return stringBuilder.toString();
            }

            @Override
            public /* synthetic */ long transferTo(OutputStream outputStream) {
                return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
            }
        };
    }

    public String Y0(long l8, Charset object) throws EOFException {
        l.f(object, "charset");
        long l9 = l8 - 0L;
        long l10 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
        if (l10 >= 0 && l8 <= Integer.MAX_VALUE) {
            if (this.c0 >= l8) {
                if (l10 == false) {
                    return "";
                }
                x x8 = this.q;
                l.c(x8);
                l10 = x8.b;
                if ((long)l10 + l8 > (long)x8.c) {
                    return new String(this.y0(l8), (Charset)object);
                }
                byte[] byArray = x8.a;
                int n8 = (int)l8;
                object = new String(byArray, (int)l10, n8, (Charset)object);
                l10 = x8.b + n8;
                x8.b = (int)l10;
                this.c0 -= l8;
                if (l10 == x8.c) {
                    this.q = x8.b();
                    y.b(x8);
                }
                return object;
            }
            throw new EOFException();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("byteCount: ");
        ((StringBuilder)object).append(l8);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    public String Z0() {
        return this.Y0(this.c0, d.b);
    }

    public String a1(long l8) throws EOFException {
        return this.Y0(l8, d.b);
    }

    public final void b() {
        this.skip(this.size());
    }

    public final void b1(long l8) {
        this.c0 = l8;
    }

    public e c() {
        return this.f();
    }

    public final h c1() {
        if (this.size() <= Integer.MAX_VALUE) {
            return this.d1((int)this.size());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("size > Int.MAX_VALUE: ");
        stringBuilder.append(this.size());
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    @Override
    public void close() {
    }

    public final long d() {
        long l8 = this.size();
        if (l8 == 0L) {
            return 0L;
        }
        x x8 = this.q;
        l.c(x8);
        x8 = x8.g;
        l.c(x8);
        int n8 = x8.c;
        long l9 = l8;
        if (n8 < 8192) {
            l9 = l8;
            if (x8.e) {
                l9 = l8 - (long)(n8 - x8.b);
            }
        }
        return l9;
    }

    public long d0(h h8) {
        l.f(h8, "targetBytes");
        return this.s0(h8, 0L);
    }

    public final h d1(int n8) {
        if (n8 == 0) {
            return h.f0;
        }
        b.b(this.size(), 0L, n8);
        x x8 = this.q;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        while (n10 < n8) {
            l.c(x8);
            int n12 = x8.c;
            int n13 = x8.b;
            if (n12 != n13) {
                n10 += n12 - n13;
                ++n11;
                x8 = x8.f;
                continue;
            }
            throw new AssertionError((Object)"s.limit == s.pos");
        }
        byte[][] byArrayArray = new byte[n11][];
        int[] nArray = new int[n11 * 2];
        x8 = this.q;
        n10 = 0;
        while (n9 < n8) {
            l.c(x8);
            byArrayArray[n10] = x8.a;
            nArray[n10] = Math.min(n9 += x8.c - x8.b, n8);
            nArray[n10 + n11] = x8.b;
            x8.d = true;
            ++n10;
            x8 = x8.f;
        }
        return new z(byArrayArray, nArray);
    }

    public final x e1(int n8) {
        if (n8 >= 1 && n8 <= 8192) {
            x x8 = this.q;
            if (x8 == null) {
                this.q = x8 = y.c();
                x8.g = x8;
                x8.f = x8;
                return x8;
            }
            l.c(x8);
            x8 = x8.g;
            l.c(x8);
            if (x8.c + n8 <= 8192 && x8.e) {
                return x8;
            }
            return x8.c(y.c());
        }
        throw new IllegalArgumentException("unexpected capacity");
    }

    public boolean equals(Object object) {
        long l8;
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        long l9 = this.size();
        if (l9 != ((e)(object = (e)object)).size()) {
            return false;
        }
        if (this.size() == 0L) {
            return true;
        }
        Object object2 = this.q;
        l.c(object2);
        x x8 = ((e)object).q;
        l.c(x8);
        int n8 = ((x)object2).b;
        int n9 = x8.b;
        for (l9 = 0L; l9 < this.size(); l9 += l8) {
            l8 = Math.min(((x)object2).c - n8, x8.c - n9);
            long l10 = 0L;
            int n10 = n8;
            while (l10 < l8) {
                if (((x)object2).a[n10] != x8.a[n9]) {
                    return false;
                }
                ++l10;
                ++n10;
                ++n9;
            }
            object = object2;
            n8 = n10;
            if (n10 == ((x)object2).c) {
                object = ((x)object2).f;
                l.c(object);
                n8 = ((x)object).b;
            }
            object2 = x8;
            n10 = n9;
            if (n9 == x8.c) {
                object2 = x8.f;
                l.c(object2);
                n10 = ((x)object2).b;
            }
            x8 = object2;
            object2 = object;
            n9 = n10;
        }
        return true;
    }

    public final e f() {
        x x8;
        e e8 = new e();
        if (this.size() == 0L) {
            return e8;
        }
        x x9 = this.q;
        l.c(x9);
        e8.q = x8 = x9.d();
        x8.g = x8;
        x8.f = x8;
        x x10 = x9.f;
        while (x10 != x9) {
            x x11 = x8.g;
            l.c(x11);
            l.c(x10);
            x11.c(x10.d());
            x10 = x10.f;
        }
        e8.b1(this.size());
        return e8;
    }

    public e f1(h h8) {
        l.f(h8, "byteString");
        h8.L(this, 0, h8.G());
        return this;
    }

    @Override
    public void flush() {
    }

    public e g1(C c8, long l8) throws IOException {
        l.f(c8, "source");
        while (l8 > 0L) {
            long l9 = c8.read(this, l8);
            if (l9 != -1L) {
                l8 -= l9;
                continue;
            }
            throw new EOFException();
        }
        return this;
    }

    public e h1(byte[] byArray) {
        l.f(byArray, "source");
        return this.i1(byArray, 0, byArray.length);
    }

    public int hashCode() {
        int n8;
        x x8;
        x x9 = this.q;
        if (x9 == null) {
            return 0;
        }
        int n9 = 1;
        do {
            int n10 = x9.c;
            n8 = n9;
            for (int i8 = x9.b; i8 < n10; ++i8) {
                n8 = n8 * 31 + x9.a[i8];
            }
            x8 = x9.f;
            l.c(x8);
            x9 = x8;
            n9 = n8;
        } while (x8 != this.q);
        return n8;
    }

    @Override
    public String i0(Charset charset) {
        l.f(charset, "charset");
        return this.Y0(this.c0, charset);
    }

    public e i1(byte[] byArray, int n8, int n9) {
        l.f(byArray, "source");
        long l8 = byArray.length;
        long l9 = n8;
        long l10 = n9;
        b.b(l8, l9, l10);
        int n10 = n9 + n8;
        while (n8 < n10) {
            x x8 = this.e1(1);
            int n11 = Math.min(n10 - n8, 8192 - x8.c);
            byte[] byArray2 = x8.a;
            int n12 = x8.c;
            n9 = n8 + n11;
            i.d(byArray, byArray2, n12, n8, n9);
            x8.c += n11;
            n8 = n9;
        }
        this.b1(this.size() + l10);
        return this;
    }

    @Override
    public boolean isOpen() {
        return true;
    }

    public final e j(e e8, long l8, long l9) {
        l.f(e8, "out");
        long l10 = this.size();
        b.b(l10, l8, l9);
        if (l9 != 0L) {
            int n8;
            e8.b1(e8.size() + l9);
            x x8 = this.q;
            while (true) {
                l.c(x8);
                int n9 = x8.c;
                n8 = x8.b;
                if (l8 < (long)(n9 - n8)) break;
                l8 -= (long)(n9 - n8);
                x8 = x8.f;
            }
            while (l9 > 0L) {
                l.c(x8);
                x x9 = x8.d();
                x9.b = n8 = x9.b + (int)l8;
                x9.c = Math.min(n8 + (int)l9, x9.c);
                x x10 = e8.q;
                if (x10 == null) {
                    x9.g = x9;
                    x9.f = x9;
                    e8.q = x9;
                } else {
                    l.c(x10);
                    x10 = x10.g;
                    l.c(x10);
                    x10.c(x9);
                }
                l9 -= (long)(x9.c - x9.b);
                x8 = x8.f;
                l8 = 0L;
            }
        }
        return this;
    }

    public e j1(int n8) {
        x x8 = this.e1(1);
        byte[] byArray = x8.a;
        int n9 = x8.c;
        x8.c = n9 + 1;
        byArray[n9] = (byte)n8;
        this.b1(this.size() + 1L);
        return this;
    }

    @Override
    public e k() {
        return this;
    }

    public e k1(long l8) {
        long l9 = l8 - 0L;
        long l10 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
        if (l10 == false) {
            return this.j1(48);
        }
        int n8 = 1;
        if (l10 < 0) {
            if ((l8 = -l8) < 0L) {
                return this.r1("-9223372036854775808");
            }
            l10 = 1;
        } else {
            l10 = 0;
        }
        if (l8 < 100000000L) {
            if (l8 < 10000L) {
                if (l8 < 100L) {
                    if (l8 >= 10L) {
                        n8 = 2;
                    }
                } else {
                    n8 = l8 < 1000L ? 3 : 4;
                }
            } else {
                n8 = l8 < 1000000L ? (l8 < 100000L ? 5 : 6) : (l8 < 10000000L ? 7 : 8);
            }
        } else {
            n8 = l8 < 1000000000000L ? (l8 < 10000000000L ? (l8 < 1000000000L ? 9 : 10) : (l8 < 100000000000L ? 11 : 12)) : (l8 < 1000000000000000L ? (l8 < 10000000000000L ? 13 : (l8 < 100000000000000L ? 14 : 15)) : (l8 < 100000000000000000L ? (l8 < 10000000000000000L ? 16 : 17) : (l8 < 1000000000000000000L ? 18 : 19)));
        }
        int n9 = n8;
        if (l10 != false) {
            n9 = n8 + 1;
        }
        x x8 = this.e1(n9);
        byte[] byArray = x8.a;
        n8 = x8.c + n9;
        while (l8 != 0L) {
            long l11 = 10;
            int n10 = (int)(l8 % l11);
            byArray[--n8] = ax.yc.a.b()[n10];
            l8 /= l11;
        }
        if (l10 != false) {
            byArray[n8 - 1] = 45;
        }
        x8.c += n9;
        this.b1(this.size() + (long)n9);
        return this;
    }

    public e l1(long l8) {
        if (l8 == 0L) {
            return this.j1(48);
        }
        long l9 = l8 >>> 1 | l8;
        l9 |= l9 >>> 2;
        l9 |= l9 >>> 4;
        l9 |= l9 >>> 8;
        l9 |= l9 >>> 16;
        l9 |= l9 >>> 32;
        l9 -= l9 >>> 1 & 0x5555555555555555L;
        l9 = (l9 >>> 2 & 0x3333333333333333L) + (l9 & 0x3333333333333333L);
        l9 = (l9 >>> 4) + l9 & 0xF0F0F0F0F0F0F0FL;
        l9 += l9 >>> 8;
        l9 += l9 >>> 16;
        int n8 = (int)(((l9 & 0x3FL) + (l9 >>> 32 & 0x3FL) + (long)3) / (long)4);
        x x8 = this.e1(n8);
        byte[] byArray = x8.a;
        int n9 = x8.c;
        for (int i8 = n9 + n8 - 1; i8 >= n9; --i8) {
            byArray[i8] = ax.yc.a.b()[(int)(0xFL & l8)];
            l8 >>>= 4;
        }
        x8.c += n8;
        this.b1(this.size() + (long)n8);
        return this;
    }

    public e m() {
        return this;
    }

    @Override
    public h m0() {
        return this.B(this.size());
    }

    public e m1(int n8) {
        x x8 = this.e1(4);
        byte[] byArray = x8.a;
        int n9 = x8.c;
        byArray[n9] = (byte)(n8 >>> 24 & 0xFF);
        byArray[n9 + 1] = (byte)(n8 >>> 16 & 0xFF);
        byArray[n9 + 2] = (byte)(n8 >>> 8 & 0xFF);
        byArray[n9 + 3] = (byte)(n8 & 0xFF);
        x8.c = n9 + 4;
        this.b1(this.size() + 4L);
        return this;
    }

    public e n1(long l8) {
        x x8 = this.e1(8);
        byte[] byArray = x8.a;
        int n8 = x8.c;
        byArray[n8] = (byte)(l8 >>> 56 & 0xFFL);
        byArray[n8 + 1] = (byte)(l8 >>> 48 & 0xFFL);
        byArray[n8 + 2] = (byte)(l8 >>> 40 & 0xFFL);
        byArray[n8 + 3] = (byte)(l8 >>> 32 & 0xFFL);
        byArray[n8 + 4] = (byte)(l8 >>> 24 & 0xFFL);
        byArray[n8 + 5] = (byte)(l8 >>> 16 & 0xFFL);
        byArray[n8 + 6] = (byte)(l8 >>> 8 & 0xFFL);
        byArray[n8 + 7] = (byte)(l8 & 0xFFL);
        x8.c = n8 + 8;
        this.b1(this.size() + 8L);
        return this;
    }

    public e o() {
        return this;
    }

    public e o1(int n8) {
        x x8 = this.e1(2);
        byte[] byArray = x8.a;
        int n9 = x8.c;
        byArray[n9] = (byte)(n8 >>> 8 & 0xFF);
        byArray[n9 + 1] = (byte)(n8 & 0xFF);
        x8.c = n9 + 2;
        this.b1(this.size() + 2L);
        return this;
    }

    public e p1(String object, int n8, int n9, Charset comparable) {
        l.f(object, "string");
        l.f(comparable, "charset");
        if (n8 >= 0) {
            if (n9 >= n8) {
                if (n9 <= ((String)object).length()) {
                    if (l.a(comparable, d.b)) {
                        return this.s1((String)object, n8, n9);
                    }
                    object = ((String)object).substring(n8, n9);
                    l.e(object, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                    object = ((String)object).getBytes((Charset)comparable);
                    l.e(object, "this as java.lang.String).getBytes(charset)");
                    return this.i1((byte[])object, 0, ((Object)object).length);
                }
                comparable = new StringBuilder();
                ((StringBuilder)comparable).append("endIndex > string.length: ");
                ((StringBuilder)comparable).append(n9);
                ((StringBuilder)comparable).append(" > ");
                ((StringBuilder)comparable).append(((String)object).length());
                throw new IllegalArgumentException(((StringBuilder)comparable).toString().toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("endIndex < beginIndex: ");
            ((StringBuilder)object).append(n9);
            ((StringBuilder)object).append(" < ");
            ((StringBuilder)object).append(n8);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("beginIndex < 0: ");
        ((StringBuilder)object).append(n8);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    @Override
    public g peek() {
        return p.d(new u(this));
    }

    public e q1(String string, Charset charset) {
        l.f(string, "string");
        l.f(charset, "charset");
        return this.p1(string, 0, string.length(), charset);
    }

    @Override
    public boolean r0(long l8) {
        return this.c0 >= l8;
    }

    public e r1(String string) {
        l.f(string, "string");
        return this.s1(string, 0, string.length());
    }

    @Override
    public int read(ByteBuffer byteBuffer) throws IOException {
        int n8;
        l.f(byteBuffer, "sink");
        x x8 = this.q;
        if (x8 == null) {
            return -1;
        }
        int n9 = Math.min(byteBuffer.remaining(), x8.c - x8.b);
        byteBuffer.put(x8.a, x8.b, n9);
        x8.b = n8 = x8.b + n9;
        this.c0 -= (long)n9;
        if (n8 == x8.c) {
            this.q = x8.b();
            y.b(x8);
        }
        return n9;
    }

    @Override
    public long read(e object, long l8) {
        l.f(object, "sink");
        if (l8 >= 0L) {
            if (this.size() == 0L) {
                return -1L;
            }
            long l9 = l8;
            if (l8 > this.size()) {
                l9 = this.size();
            }
            ((e)object).write(this, l9);
            return l9;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("byteCount < 0: ");
        ((StringBuilder)object).append(l8);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    @Override
    public byte readByte() throws EOFException {
        if (this.size() != 0L) {
            x x8 = this.q;
            l.c(x8);
            int n8 = x8.b;
            int n9 = x8.c;
            byte[] byArray = x8.a;
            int n10 = n8 + 1;
            byte by = byArray[n8];
            this.b1(this.size() - 1L);
            if (n10 == n9) {
                this.q = x8.b();
                y.b(x8);
                return by;
            }
            x8.b = n10;
            return by;
        }
        throw new EOFException();
    }

    @Override
    public void readFully(byte[] byArray) throws EOFException {
        int n8;
        l.f(byArray, "sink");
        for (int i8 = 0; i8 < byArray.length; i8 += n8) {
            n8 = this.D0(byArray, i8, byArray.length - i8);
            if (n8 != -1) {
                continue;
            }
            throw new EOFException();
        }
    }

    @Override
    public int readInt() throws EOFException {
        if (this.size() >= 4L) {
            x x8 = this.q;
            l.c(x8);
            int n8 = x8.b;
            int n9 = x8.c;
            if ((long)(n9 - n8) < 4L) {
                return (this.readByte() & 0xFF) << 24 | (this.readByte() & 0xFF) << 16 | (this.readByte() & 0xFF) << 8 | this.readByte() & 0xFF;
            }
            byte[] byArray = x8.a;
            byte by = byArray[n8];
            int n10 = byArray[n8 + 1];
            byte by2 = byArray[n8 + 2];
            int n11 = n8 + 4;
            n10 = byArray[n8 + 3] & 0xFF | ((n10 & 0xFF) << 16 | (by & 0xFF) << 24 | (by2 & 0xFF) << 8);
            this.b1(this.size() - 4L);
            if (n11 == n9) {
                this.q = x8.b();
                y.b(x8);
                return n10;
            }
            x8.b = n11;
            return n10;
        }
        throw new EOFException();
    }

    @Override
    public long readLong() throws EOFException {
        if (this.size() >= 8L) {
            x x8 = this.q;
            l.c(x8);
            int n8 = x8.b;
            int n9 = x8.c;
            if ((long)(n9 - n8) < 8L) {
                return ((long)this.readInt() & 0xFFFFFFFFL) << 32 | 0xFFFFFFFFL & (long)this.readInt();
            }
            byte[] byArray = x8.a;
            long l8 = byArray[n8];
            long l9 = byArray[n8 + 1];
            long l10 = byArray[n8 + 2];
            long l11 = byArray[n8 + 3];
            long l12 = byArray[n8 + 4];
            long l13 = byArray[n8 + 5];
            long l14 = byArray[n8 + 6];
            int n10 = n8 + 8;
            l13 = (l11 & 0xFFL) << 32 | ((l8 & 0xFFL) << 56 | (l9 & 0xFFL) << 48 | (l10 & 0xFFL) << 40) | (l12 & 0xFFL) << 24 | (l13 & 0xFFL) << 16 | (l14 & 0xFFL) << 8 | (long)byArray[n8 + 7] & 0xFFL;
            this.b1(this.size() - 8L);
            if (n10 == n9) {
                this.q = x8.b();
                y.b(x8);
                return l13;
            }
            x8.b = n10;
            return l13;
        }
        throw new EOFException();
    }

    @Override
    public short readShort() throws EOFException {
        if (this.size() >= 2L) {
            x x8 = this.q;
            l.c(x8);
            int n8 = x8.b;
            int n9 = x8.c;
            if (n9 - n8 < 2) {
                return (short)((this.readByte() & 0xFF) << 8 | this.readByte() & 0xFF);
            }
            byte[] byArray = x8.a;
            byte by = byArray[n8];
            int n10 = n8 + 2;
            n8 = byArray[n8 + 1];
            this.b1(this.size() - 2L);
            if (n10 == n9) {
                this.q = x8.b();
                y.b(x8);
            } else {
                x8.b = n10;
            }
            return (short)(n8 & 0xFF | (by & 0xFF) << 8);
        }
        throw new EOFException();
    }

    /*
     * Enabled aggressive block sorting
     */
    public long s0(h object, long l8) {
        int n8;
        int n9;
        x x8;
        long l9;
        block20: {
            Object object2;
            block25: {
                block19: {
                    block24: {
                        block23: {
                            block22: {
                                long l10;
                                block21: {
                                    l.f(object, "targetBytes");
                                    l9 = 0L;
                                    if (l8 < 0L) {
                                        object = new StringBuilder();
                                        ((StringBuilder)object).append("fromIndex < 0: ");
                                        ((StringBuilder)object).append(l8);
                                        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
                                    }
                                    object2 = this.q;
                                    if (object2 == null) {
                                        return -1L;
                                    }
                                    x8 = object2;
                                    if (this.size() - l8 >= l8) break block21;
                                    x8 = object2;
                                    for (l9 = this.size(); l9 > l8; l9 -= (long)(x8.c - x8.b)) {
                                        x8 = x8.g;
                                        l.c(x8);
                                    }
                                    if (((h)object).G() == 2) break block22;
                                    break block23;
                                }
                                while ((l10 = (long)(x8.c - x8.b) + l9) <= l8) {
                                    x8 = x8.f;
                                    l.c(x8);
                                    l9 = l10;
                                }
                                if (((h)object).G() == 2) break block24;
                                break block25;
                            }
                            byte by = ((h)object).n(0);
                            byte by2 = ((h)object).n(1);
                            while (l9 < this.size()) {
                                object2 = x8.a;
                                n9 = (int)((long)x8.b + l8 - l9);
                                int n10 = x8.c;
                                while (n9 < n10) {
                                    Object object3 = object2[n9];
                                    l8 = l9;
                                    object = x8;
                                    n8 = n9++;
                                    if (object3 != by) {
                                        if (object3 != by2) continue;
                                        l8 = l9;
                                        object = x8;
                                        n8 = n9;
                                    }
                                    break block19;
                                }
                                x8 = x8.f;
                                l.c(x8);
                                l8 = l9 += (long)(x8.c - x8.b);
                            }
                            return -1L;
                        }
                        object = ((h)object).u();
                        while (l9 < this.size()) {
                            object2 = x8.a;
                            int n11 = x8.c;
                            for (n8 = (int)((long)x8.b + l8 - l9); n8 < n11; ++n8) {
                                Object object4 = object2[n8];
                                int n12 = ((Object)object).length;
                                for (n9 = 0; n9 < n12; ++n9) {
                                    if (object4 != object[n9]) {
                                        continue;
                                    }
                                    break block20;
                                }
                            }
                            x8 = x8.f;
                            l.c(x8);
                            l8 = l9 += (long)(x8.c - x8.b);
                        }
                        return -1L;
                    }
                    byte by = ((h)object).n(0);
                    byte by3 = ((h)object).n(1);
                    while (l9 < this.size()) {
                        object2 = x8.a;
                        n9 = (int)((long)x8.b + l8 - l9);
                        int n13 = x8.c;
                        while (n9 < n13) {
                            Object object5 = object2[n9];
                            l8 = l9;
                            object = x8;
                            n8 = n9++;
                            if (object5 != by) {
                                if (object5 != by3) continue;
                                l8 = l9;
                                object = x8;
                                n8 = n9;
                            }
                            break block19;
                        }
                        x8 = x8.f;
                        l.c(x8);
                        l8 = l9 += (long)(x8.c - x8.b);
                    }
                    return -1L;
                }
                n9 = ((x)object).b;
                return (long)(n8 - n9) + l8;
            }
            object = ((h)object).u();
            block9: while (true) {
                if (l9 >= this.size()) return -1L;
                object2 = x8.a;
                n8 = (int)((long)x8.b + l8 - l9);
                int n14 = x8.c;
                while (true) {
                    int n15;
                    Object object6;
                    if (n8 < n14) {
                        object6 = object2[n8];
                        n15 = ((Object)object).length;
                    } else {
                        x8 = x8.f;
                        l.c(x8);
                        l8 = l9 += (long)(x8.c - x8.b);
                        continue block9;
                    }
                    for (n9 = 0; n9 < n15; ++n9) {
                        if (object6 == object[n9]) break block9;
                    }
                    ++n8;
                }
                break;
            }
        }
        n9 = x8.b;
        l8 = l9;
        return (long)(n8 - n9) + l8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public e s1(String charSequence, int n8, int n9) {
        l.f(charSequence, "string");
        if (n8 < 0) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("beginIndex < 0: ");
            ((StringBuilder)charSequence).append(n8);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
        }
        if (n9 < n8) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("endIndex < beginIndex: ");
            ((StringBuilder)charSequence).append(n9);
            ((StringBuilder)charSequence).append(" < ");
            ((StringBuilder)charSequence).append(n8);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
        }
        if (n9 > ((String)charSequence).length()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("endIndex > string.length: ");
            stringBuilder.append(n9);
            stringBuilder.append(" > ");
            stringBuilder.append(((String)charSequence).length());
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
        while (n8 < n9) {
            int n10;
            int n11;
            Object object;
            char c8 = ((String)charSequence).charAt(n8);
            if (c8 < '\u0080') {
                object = this.e1(1);
                byte[] byArray = ((x)object).a;
                n11 = ((x)object).c - n8;
                int n12 = Math.min(n9, 8192 - n11);
                n10 = n8 + 1;
                byArray[n8 + n11] = (byte)c8;
                n8 = n10;
                while (n8 < n12 && (c8 = ((String)charSequence).charAt(n8)) < '\u0080') {
                    n10 = n8 + 1;
                    byArray[n8 + n11] = (byte)c8;
                    n8 = n10;
                }
                n10 = ((x)object).c;
                n11 = n11 + n8 - n10;
                ((x)object).c = n10 + n11;
                this.b1(this.size() + (long)n11);
                continue;
            }
            if (c8 < '\u0800') {
                x x8 = this.e1(2);
                object = x8.a;
                n10 = x8.c;
                object[n10] = (byte)(c8 >> 6 | 0xC0);
                object[n10 + 1] = (byte)(c8 & 0x3F | 0x80);
                x8.c = n10 + 2;
                this.b1(this.size() + 2L);
            } else {
                if (c8 >= '\ud800' && c8 <= '\udfff') {
                    n11 = n8 + 1;
                    n10 = n11 < n9 ? (int)((String)charSequence).charAt(n11) : 0;
                    if (c8 <= '\udbff' && 56320 <= n10 && n10 < 57344) {
                        n11 = ((c8 & 0x3FF) << 10 | n10 & 0x3FF) + 65536;
                        object = this.e1(4);
                        byte[] byArray = ((x)object).a;
                        n10 = ((x)object).c;
                        byArray[n10] = (byte)(n11 >> 18 | 0xF0);
                        byArray[n10 + 1] = (byte)(n11 >> 12 & 0x3F | 0x80);
                        byArray[n10 + 2] = (byte)(n11 >> 6 & 0x3F | 0x80);
                        byArray[n10 + 3] = (byte)(n11 & 0x3F | 0x80);
                        ((x)object).c = n10 + 4;
                        this.b1(this.size() + 4L);
                        n8 += 2;
                        continue;
                    }
                    this.j1(63);
                    n8 = n11;
                    continue;
                }
                x x9 = this.e1(3);
                object = x9.a;
                n10 = x9.c;
                object[n10] = (byte)(c8 >> 12 | 0xE0);
                object[n10 + 1] = (byte)(0x3F & c8 >> 6 | 0x80);
                object[n10 + 2] = (byte)(c8 & 0x3F | 0x80);
                x9.c = n10 + 3;
                this.b1(this.size() + 3L);
            }
            ++n8;
        }
        return this;
    }

    public final long size() {
        return this.c0;
    }

    @Override
    public void skip(long l8) throws EOFException {
        while (l8 > 0L) {
            x x8 = this.q;
            if (x8 != null) {
                int n8 = (int)Math.min(l8, (long)(x8.c - x8.b));
                long l9 = this.size();
                long l10 = n8;
                this.b1(l9 - l10);
                l9 = l8 - l10;
                x8.b = n8 = x8.b + n8;
                l8 = l9;
                if (n8 != x8.c) continue;
                this.q = x8.b();
                y.b(x8);
                l8 = l9;
                continue;
            }
            throw new EOFException();
        }
    }

    public e t1(int n8) {
        if (n8 < 128) {
            this.j1(n8);
            return this;
        }
        if (n8 < 2048) {
            x x8 = this.e1(2);
            byte[] byArray = x8.a;
            int n9 = x8.c;
            byArray[n9] = (byte)(n8 >> 6 | 0xC0);
            byArray[n9 + 1] = (byte)(n8 & 0x3F | 0x80);
            x8.c = n9 + 2;
            this.b1(this.size() + 2L);
            return this;
        }
        if (55296 <= n8 && n8 < 57344) {
            this.j1(63);
            return this;
        }
        if (n8 < 65536) {
            x x9 = this.e1(3);
            byte[] byArray = x9.a;
            int n10 = x9.c;
            byArray[n10] = (byte)(n8 >> 12 | 0xE0);
            byArray[n10 + 1] = (byte)(n8 >> 6 & 0x3F | 0x80);
            byArray[n10 + 2] = (byte)(n8 & 0x3F | 0x80);
            x9.c = n10 + 3;
            this.b1(this.size() + 3L);
            return this;
        }
        if (n8 <= 0x10FFFF) {
            x x10 = this.e1(4);
            byte[] byArray = x10.a;
            int n11 = x10.c;
            byArray[n11] = (byte)(n8 >> 18 | 0xF0);
            byArray[n11 + 1] = (byte)(n8 >> 12 & 0x3F | 0x80);
            byArray[n11 + 2] = (byte)(n8 >> 6 & 0x3F | 0x80);
            byArray[n11 + 3] = (byte)(n8 & 0x3F | 0x80);
            x10.c = n11 + 4;
            this.b1(this.size() + 4L);
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected code point: 0x");
        stringBuilder.append(b.k(n8));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public D timeout() {
        return D.NONE;
    }

    public String toString() {
        return this.c1().toString();
    }

    public final byte v(long l8) {
        b.b(this.size(), l8, 1L);
        x x8 = this.q;
        if (x8 != null) {
            long l9;
            if (this.size() - l8 < l8) {
                long l10;
                for (l10 = this.size(); l10 > l8; l10 -= (long)(x8.c - x8.b)) {
                    x8 = x8.g;
                    l.c(x8);
                }
                l.c(x8);
                return x8.a[(int)((long)x8.b + l8 - l10)];
            }
            long l11 = 0L;
            while ((l9 = (long)(x8.c - x8.b) + l11) <= l8) {
                x8 = x8.f;
                l.c(x8);
                l11 = l9;
            }
            l.c(x8);
            return x8.a[(int)((long)x8.b + l8 - l11)];
        }
        l.c(null);
        throw null;
    }

    @Override
    public String v0() throws EOFException {
        return this.U(Long.MAX_VALUE);
    }

    @Override
    public int write(ByteBuffer byteBuffer) throws IOException {
        int n8;
        l.f(byteBuffer, "source");
        int n9 = n8 = byteBuffer.remaining();
        while (n9 > 0) {
            x x8 = this.e1(1);
            int n10 = Math.min(n9, 8192 - x8.c);
            byteBuffer.get(x8.a, x8.c, n10);
            n9 -= n10;
            x8.c += n10;
        }
        this.c0 += (long)n8;
        return n8;
    }

    @Override
    public void write(e e8, long l8) {
        l.f(e8, "source");
        if (e8 != this) {
            b.b(e8.size(), 0L, l8);
            while (l8 > 0L) {
                x x8;
                long l9;
                x x9 = e8.q;
                l.c(x9);
                int n8 = x9.c;
                x9 = e8.q;
                l.c(x9);
                if (l8 < (long)(n8 - x9.b)) {
                    x9 = this.q;
                    if (x9 != null) {
                        l.c(x9);
                        x9 = x9.g;
                    } else {
                        x9 = null;
                    }
                    if (x9 != null && x9.e && (l9 = (long)x9.c) + l8 - (long)(n8 = x9.d ? 0 : x9.b) <= 8192L) {
                        x8 = e8.q;
                        l.c(x8);
                        x8.g(x9, (int)l8);
                        e8.b1(e8.size() - l8);
                        this.b1(this.size() + l8);
                        return;
                    }
                    x9 = e8.q;
                    l.c(x9);
                    e8.q = x9.e((int)l8);
                }
                x9 = e8.q;
                l.c(x9);
                l9 = x9.c - x9.b;
                e8.q = x9.b();
                x8 = this.q;
                if (x8 == null) {
                    this.q = x9;
                    x9.g = x9;
                    x9.f = x9;
                } else {
                    l.c(x8);
                    x8 = x8.g;
                    l.c(x8);
                    x8.c(x9).a();
                }
                e8.b1(e8.size() - l9);
                this.b1(this.size() + l9);
                l8 -= l9;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override
    public boolean x0(long l8, h h8) {
        l.f(h8, "bytes");
        return this.C0(l8, h8, 0, h8.G());
    }

    @Override
    public byte[] y0(long l8) throws EOFException {
        if (l8 >= 0L && l8 <= Integer.MAX_VALUE) {
            if (this.size() >= l8) {
                byte[] byArray = new byte[(int)l8];
                this.readFully(byArray);
                return byArray;
            }
            throw new EOFException();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("byteCount: ");
        stringBuilder.append(l8);
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public static final class a
    implements Closeable,
    AutoCloseable {
        public boolean c0;
        private x d0;
        public long e0 = -1L;
        public byte[] f0;
        public int g0 = -1;
        public int h0 = -1;
        public e q;

        public final x a() {
            return this.d0;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final int b() {
            long l8 = this.e0;
            e e8 = this.q;
            l.c(e8);
            if (l8 == e8.size()) throw new IllegalStateException("no more bytes");
            l8 = this.e0;
            if (l8 == -1L) {
                l8 = 0L;
                return this.d(l8);
            }
            l8 += (long)(this.h0 - this.g0);
            return this.d(l8);
        }

        /*
         * Enabled aggressive block sorting
         */
        public final long c(long l8) {
            Object object = this.q;
            if (object == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.c0) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long l9 = ((e)object).size();
            long l10 = l8 - l9;
            long l11 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
            if (l11 <= 0) {
                long l12;
                if (l8 < 0L) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("newSize < 0: ");
                    ((StringBuilder)object).append(l8);
                    throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
                }
                for (long i8 = l9 - l8; i8 > 0L; i8 -= l12) {
                    x x8 = ((e)object).q;
                    l.c(x8);
                    x8 = x8.g;
                    l.c(x8);
                    l11 = x8.c;
                    l12 = l11 - x8.b;
                    if (l12 <= i8) {
                        ((e)object).q = x8.b();
                        y.b(x8);
                        continue;
                    }
                    x8.c = (int)(l11 - (int)i8);
                    break;
                }
                this.e(null);
                this.e0 = l8;
                this.f0 = null;
                this.g0 = -1;
                this.h0 = -1;
            } else if (l11 > 0) {
                long l13 = l8 - l9;
                l11 = 1;
                while (l13 > 0L) {
                    x x9 = ((e)object).e1(1);
                    int n8 = (int)Math.min(l13, (long)(8192 - x9.c));
                    x9.c += n8;
                    l13 -= (long)n8;
                    long l14 = l11;
                    if (l11 != false) {
                        this.e(x9);
                        this.e0 = l9;
                        this.f0 = x9.a;
                        l11 = x9.c;
                        this.g0 = (int)(l11 - n8);
                        this.h0 = (int)l11;
                        l14 = 0;
                    }
                    l11 = l14;
                }
            }
            ((e)object).b1(l8);
            return l9;
        }

        @Override
        public void close() {
            if (this.q != null) {
                this.q = null;
                this.e(null);
                this.e0 = -1L;
                this.f0 = null;
                this.g0 = -1;
                this.h0 = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        public final int d(long l8) {
            e e8 = this.q;
            if (e8 != null) {
                long l9 = l8 - -1L;
                long l10 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
                if (l10 >= 0 && l8 <= e8.size()) {
                    if (l10 != false && l8 != e8.size()) {
                        int n8;
                        long l11;
                        long l12 = e8.size();
                        x x8 = e8.q;
                        x x9 = this.a();
                        long l13 = 0L;
                        if (x9 != null) {
                            l11 = this.e0;
                            l10 = this.g0;
                            x9 = this.a();
                            l.c(x9);
                            if ((l11 -= (long)(l10 - x9.b)) > l8) {
                                x x10 = this.a();
                                x9 = x8;
                                x8 = x10;
                            } else {
                                x9 = this.a();
                                l13 = l11;
                                l11 = l12;
                            }
                        } else {
                            x9 = x8;
                            l11 = l12;
                        }
                        if (l11 - l8 > l8 - l13) {
                            x8 = x9;
                            while (true) {
                                l.c(x8);
                                n8 = x8.c;
                                l10 = x8.b;
                                x9 = x8;
                                l11 = l13;
                                if (l8 >= (long)(n8 - l10) + l13) {
                                    l13 += (long)(n8 - l10);
                                    x8 = x8.f;
                                    continue;
                                }
                                break;
                            }
                        } else {
                            for (l12 = l11; l12 > l8; l12 -= (long)(x8.c - x8.b)) {
                                l.c(x8);
                                x8 = x8.g;
                                l.c(x8);
                            }
                            l11 = l12;
                            x9 = x8;
                        }
                        x8 = x9;
                        if (this.c0) {
                            l.c(x9);
                            x8 = x9;
                            if (x9.d) {
                                x8 = x9.f();
                                if (e8.q == x9) {
                                    e8.q = x8;
                                }
                                x8 = x9.c(x8);
                                x9 = x8.g;
                                l.c(x9);
                                x9.b();
                            }
                        }
                        this.e(x8);
                        this.e0 = l8;
                        l.c(x8);
                        this.f0 = x8.a;
                        this.g0 = n8 = x8.b + (int)(l8 - l11);
                        l10 = x8.c;
                        this.h0 = (int)l10;
                        return (int)(l10 - n8);
                    }
                    this.e(null);
                    this.e0 = l8;
                    this.f0 = null;
                    this.g0 = -1;
                    this.h0 = -1;
                    return -1;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("offset=");
                stringBuilder.append(l8);
                stringBuilder.append(" > size=");
                stringBuilder.append(e8.size());
                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        public final void e(x x8) {
            this.d0 = x8;
        }
    }
}

