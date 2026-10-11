/*
 * Decompiled with CFR 0.152.
 */
package ax.q3;

import java.io.IOException;
import java.io.Reader;

public class a
extends Reader
implements AutoCloseable {
    private static int l0 = 8192;
    private static int m0 = 80;
    private char[] c0;
    private int d0;
    private int e0;
    private int f0 = -1;
    private int g0 = 0;
    private boolean h0 = false;
    private boolean i0 = false;
    private boolean j0 = false;
    private boolean k0 = false;
    private Reader q;

    public a(Reader reader) {
        this(reader, l0);
    }

    public a(Reader reader, int n8) {
        super(reader);
        if (n8 > 0) {
            this.q = reader;
            this.c0 = new char[n8];
            this.d0 = 0;
            this.e0 = 0;
            return;
        }
        throw new IllegalArgumentException("Buffer size <= 0");
    }

    private void b() throws IOException {
        if (this.q != null) {
            return;
        }
        throw new IOException("Stream closed");
    }

    private void c() throws IOException {
        char[] cArray;
        Object object;
        int n8;
        int n9;
        int n10 = this.f0;
        int n11 = 0;
        if (n10 <= -1) {
            n9 = n11;
        } else {
            n8 = this.e0 - n10;
            n9 = this.g0;
            if (n8 >= n9) {
                this.f0 = -2;
                this.g0 = 0;
                n9 = n11;
            } else {
                object = this.c0;
                if (n9 <= ((Object)object).length) {
                    System.arraycopy(object, n10, object, 0, n8);
                    this.f0 = 0;
                } else {
                    n11 = ((Object)object).length * 2;
                    if (n11 <= n9) {
                        n9 = n11;
                    }
                    cArray = new char[n9];
                    System.arraycopy(object, n10, cArray, 0, n8);
                    this.c0 = cArray;
                    this.f0 = 0;
                }
                this.d0 = n8;
                this.e0 = n8;
                n9 = n8;
            }
        }
        while ((n8 = ((Reader)(object = this.q)).read(cArray = this.c0, n9, cArray.length - n9)) == 0) {
        }
        if (n8 > 0) {
            this.d0 = n8 + n9;
            this.e0 = n9;
        }
    }

    private int d(char[] cArray, int n8, int n9) throws IOException {
        int n10;
        int n11;
        if (this.e0 >= this.d0) {
            if (n9 >= this.c0.length && this.f0 <= -1 && !this.h0) {
                return this.q.read(cArray, n8, n9);
            }
            this.c();
        }
        if ((n11 = this.e0) >= (n10 = this.d0)) {
            return -1;
        }
        if (this.h0) {
            this.h0 = false;
            if (this.c0[n11] == '\n') {
                this.e0 = ++n11;
                if (n11 >= n10) {
                    this.c();
                }
                if (this.e0 >= this.d0) {
                    return -1;
                }
            }
        }
        n9 = Math.min(n9, this.d0 - this.e0);
        System.arraycopy(this.c0, this.e0, cArray, n8, n9);
        this.e0 += n9;
        return n9;
    }

    public boolean a() {
        return this.j0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        Object object = this.lock;
        synchronized (object) {
            Throwable throwable2;
            block8: {
                Reader reader;
                try {
                    reader = this.q;
                    if (reader == null) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                try {
                    reader.close();
                }
                finally {
                    this.q = null;
                    this.c0 = null;
                }
                return;
            }
            throw throwable2;
        }
    }

    public String e() throws IOException {
        return this.f(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    String f(boolean bl) throws IOException {
        Object object = this.lock;
        synchronized (object) {
            CharSequence charSequence;
            char c8;
            try {
                this.b();
                c8 = !bl && !this.h0 ? (char)'\u0000' : '\u0001';
                this.j0 = false;
                this.k0 = false;
                charSequence = null;
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (true) {
                CharSequence charSequence2;
                boolean bl2;
                int n8;
                block15: {
                    if (this.e0 >= this.d0) {
                        this.c();
                    }
                    if ((n8 = this.e0) >= this.d0) {
                        this.k0 = true;
                        if (charSequence == null) return null;
                        if (charSequence.length() <= 0) return null;
                        return charSequence.toString();
                    }
                    if (c8 != '\u0000' && this.c0[n8] == '\n') {
                        this.e0 = n8 + 1;
                    }
                    this.h0 = false;
                    c8 = '\u0000';
                    for (n8 = this.e0; n8 < this.d0; ++n8) {
                        c8 = this.c0[n8];
                        if (c8 != '\n' && c8 != '\r') {
                            continue;
                        }
                        bl2 = true;
                        break block15;
                    }
                    bl2 = false;
                }
                int n9 = this.e0;
                this.e0 = n8;
                if (bl2) {
                    if (charSequence == null) {
                        charSequence2 = new String(this.c0, n9, n8 - n9);
                    } else {
                        charSequence.append(this.c0, n9, n8 - n9);
                        charSequence2 = charSequence.toString();
                    }
                    ++this.e0;
                    if (c8 == '\r') {
                        this.h0 = true;
                    }
                    this.j0 = true;
                    return charSequence2;
                }
                charSequence2 = charSequence;
                if (charSequence == null) {
                    charSequence2 = new StringBuffer(m0);
                }
                ((StringBuffer)charSequence2).append(this.c0, n9, n8 - n9);
                c8 = '\u0000';
                charSequence = charSequence2;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void mark(int n8) throws IOException {
        if (n8 >= 0) {
            Object object = this.lock;
            synchronized (object) {
                this.b();
                this.g0 = n8;
                this.f0 = this.e0;
                this.i0 = this.h0;
                return;
            }
        }
        throw new IllegalArgumentException("Read-ahead limit < 0");
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read() throws IOException {
        var2_1 = this.lock;
        synchronized (var2_1) {
            block8: {
                try {
                    this.b();
lbl5:
                    // 2 sources

                    while (true) {
                        if (this.e0 < this.d0) break;
                        this.c();
                        if (this.e0 >= this.d0) {
                            return -1;
                        }
                        break;
                    }
                }
                catch (Throwable var3_4) {
                    break block8;
                }
                if (!this.h0) ** GOTO lbl21
                this.h0 = false;
                var3_3 = this.c0;
                var1_2 = this.e0;
                if (var3_3[var1_2] != '\n') ** GOTO lbl21
                {
                    this.e0 = var1_2 + 1;
                    ** continue;
lbl21:
                    // 2 sources

                    var3_3 = this.c0;
                    var1_2 = this.e0;
                    this.e0 = var1_2 + 1;
                }
                return var3_3[var1_2];
            }
            throw var3_4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int read(char[] object, int n8, int n9) throws IOException {
        Object object2 = this.lock;
        synchronized (object2) {
            int n10;
            int n11;
            block8: {
                Throwable throwable2;
                block7: {
                    block6: {
                        try {
                            this.b();
                            if (n8 < 0 || n8 > ((char[])object).length || n9 < 0 || (n11 = n8 + n9) > ((char[])object).length || n11 < 0) break block6;
                            if (n9 == 0) {
                                return 0;
                            }
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                        if (n10 <= 0) {
                            return n10;
                        }
                        break block8;
                    }
                    object = new IndexOutOfBoundsException;
                    object();
                    throw object;
                }
                throw throwable2;
            }
            for (n11 = n10 = this.d((char[])object, n8, n9); n11 < n9 && this.q.ready() && (n10 = this.d((char[])object, n8 + n11, n9 - n11)) > 0; n11 += n10) {
            }
            return n11;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean ready() throws IOException {
        Object object = this.lock;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                boolean bl;
                block5: {
                    int n8;
                    block6: {
                        try {
                            this.b();
                            boolean bl2 = this.h0;
                            bl = false;
                            if (!bl2) break block5;
                            if (this.e0 < this.d0 || !this.q.ready()) break block6;
                            this.c();
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    if ((n8 = this.e0) < this.d0) {
                        if (this.c0[n8] == '\n') {
                            this.e0 = n8 + 1;
                        }
                        this.h0 = false;
                    }
                }
                if (this.e0 < this.d0) return true;
                if (!this.q.ready()) return bl;
                return true;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void reset() throws IOException {
        Object object = this.lock;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                String string;
                try {
                    this.b();
                    int n8 = this.f0;
                    if (n8 >= 0) {
                        this.e0 = n8;
                        this.h0 = this.i0;
                        return;
                    }
                    string = this.f0 == -2 ? "Mark invalid" : "Stream not marked";
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                IOException iOException = new IOException(string);
                throw iOException;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public long skip(long var1_1) throws IOException {
        var7_2 = 0L;
        if (var1_1 < 0L) {
            throw new IllegalArgumentException("skip value is negative");
        }
        var12_3 = this.lock;
        synchronized (var12_3) {
            block11: {
                block12: {
                    block10: {
                        try {
                            this.b();
                            var5_4 = var1_1;
lbl9:
                            // 2 sources

                            while (var5_4 > 0L) {
                                if (this.e0 < this.d0) break block10;
                                this.c();
                                break block10;
                            }
                            ** GOTO lbl30
                        }
                        catch (Throwable var11_8) {
                            break block11;
                        }
                    }
                    if ((var4_6 = this.e0) >= (var3_5 = this.d0)) ** GOTO lbl30
                    if (this.h0) {
                        this.h0 = false;
                        if (this.c0[var4_6] == '\n') {
                            this.e0 = var4_6 + 1;
                        }
                    }
                    if (var5_4 > (var9_7 = (long)(var3_5 - (var4_6 = this.e0)))) break block12;
                    {
                        this.e0 = (int)((long)var4_6 + var5_4);
                        var5_4 = var7_2;
                        ** GOTO lbl30
                    }
                }
                var5_4 -= var9_7;
                {
                    this.e0 = var3_5;
                    ** GOTO lbl9
lbl30:
                    // 3 sources

                    return var1_1 - var5_4;
                }
            }
            throw var11_8;
        }
    }
}

