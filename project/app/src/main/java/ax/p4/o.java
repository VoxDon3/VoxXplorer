/*
 * Decompiled with CFR 0.152.
 */
package ax.p4;

import ax.T4.k;
import ax.p4.e;
import ax.p4.f;
import ax.p4.j;
import ax.p4.n;
import ax.p4.p;
import ax.p4.t;
import ax.s4.a;
import ax.v4.c;
import ax.w4.c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public abstract class o<R, E, X extends f>
implements Closeable,
AutoCloseable {
    private final c<R> c0;
    private final c<E> d0;
    private boolean e0;
    private boolean f0;
    private final String g0;
    private final a.c q;

    protected o(a.c c8, c<R> c9, c<E> c10, String string) {
        this.q = c8;
        this.c0 = c9;
        this.d0 = c10;
        this.e0 = false;
        this.f0 = false;
        this.g0 = string;
    }

    private void a() {
        if (!this.e0) {
            if (!this.f0) {
                return;
            }
            throw new IllegalStateException("This uploader is already finished and cannot be used to upload more data.");
        }
        throw new IllegalStateException("This uploader is already closed.");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public R b() throws X, j {
        Throwable throwable2;
        a.b b8;
        block14: {
            IOException iOException2;
            a.b b9;
            block13: {
                k k82;
                a.b b10;
                block12: {
                    block10: {
                        R r8;
                        this.a();
                        b9 = null;
                        b8 = null;
                        try {
                            b8 = b10 = this.q.b();
                            b9 = b10;
                            try {
                                if (b10.d() != 200) break block10;
                                b8 = b10;
                                b9 = b10;
                                r8 = this.c0.b(b10.b());
                            }
                            catch (k k82) {
                                break block12;
                            }
                        }
                        catch (IOException iOException2) {
                            break block13;
                        }
                        ax.w4.c.b(b10.b());
                        this.f0 = true;
                        return r8;
                        catch (Throwable throwable2) {
                            break block14;
                        }
                    }
                    b8 = b10;
                    b9 = b10;
                    {
                        if (b10.d() == 409) {
                            b8 = b10;
                            b9 = b10;
                            throw this.c(p.c(this.d0, b10, this.g0));
                        }
                        b8 = b10;
                        b9 = b10;
                        throw n.A(b10);
                    }
                }
                b8 = b10;
                b9 = b10;
                String string = n.q(b10);
                b8 = b10;
                b9 = b10;
                b8 = b10;
                b9 = b10;
                b8 = b10;
                b9 = b10;
                StringBuilder stringBuilder = new StringBuilder();
                b8 = b10;
                b9 = b10;
                stringBuilder.append("Bad JSON in response: ");
                b8 = b10;
                b9 = b10;
                stringBuilder.append(k82);
                b8 = b10;
                b9 = b10;
                e e8 = new e(string, stringBuilder.toString(), k82);
                b8 = b10;
                b9 = b10;
                throw e8;
            }
            b8 = b9;
            b8 = b9;
            t t8 = new t(iOException2);
            b8 = b9;
            throw t8;
        }
        if (b8 != null) {
            ax.w4.c.b(b8.b());
        }
        this.f0 = true;
        throw throwable2;
    }

    protected abstract X c(p var1);

    @Override
    public void close() {
        if (!this.e0) {
            this.q.a();
            this.e0 = true;
        }
    }

    public R d(InputStream inputStream) throws X, j, IOException {
        return this.f(inputStream, null);
    }

    public R e(InputStream inputStream, long l8) throws X, j, IOException {
        return this.d(ax.w4.c.f(inputStream, l8));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public R f(InputStream inputStream, c.d object) throws X, j, IOException {
        try {
            try {
                this.q.d((c.d)object);
                this.q.e(inputStream);
            }
            catch (IOException iOException) {
            }
            catch (c.e e8) {
                throw e8.a();
            }
            inputStream = this.b();
            this.close();
            return (R)inputStream;
            object = new t(iOException);
            throw object;
        }
        catch (Throwable throwable) {}
        this.close();
        throw throwable;
    }
}

