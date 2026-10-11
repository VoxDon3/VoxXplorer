/*
 * Decompiled with CFR 0.152.
 */
package ax.D8;

import ax.y8.d;
import ax.y8.e;
import ax.z8.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

public class c
extends ax.C8.b<ax.C8.b>
implements Iterable {
    private final ax.C8.b c0;
    private byte[] d0;
    private a e0;
    private boolean f0;

    public c(ax.C8.c c8, ax.C8.b b8) {
        this(c8, b8, true);
    }

    public c(ax.C8.c c8, ax.C8.b b8, boolean bl) {
        c8 = bl ? c8.c() : c8.b(b8.e().f());
        super(c8);
        this.c0 = b8;
        this.f0 = bl;
        this.d0 = null;
    }

    private c(ax.C8.c c8, byte[] byArray, a a8) {
        super(c8);
        this.f0 = true;
        this.d0 = byArray;
        this.e0 = a8;
        this.c0 = null;
    }

    static /* synthetic */ byte[] k(c c8, byte[] byArray) {
        c8.d0 = byArray;
        return byArray;
    }

    public Iterator<ax.C8.b> iterator() {
        return this.q(ax.C8.c.n).iterator();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ax.C8.b p() {
        ax.y8.c c8222222;
        Object object = this.c0;
        if (object != null) {
            return object;
        }
        object = new ax.y8.a(this.e0, this.d0);
        Object t8 = ((ax.y8.a)object).g();
        ((InputStream)object).close();
        return t8;
        catch (Throwable throwable) {
            try {
                ((InputStream)object).close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                try {
                    throwable.addSuppressed(throwable2);
                    throw throwable;
                }
                catch (IOException iOException) {
                    throw new ax.y8.c(iOException, "Could not parse the inputstream", new Object[0]);
                }
                catch (ax.y8.c c8222222) {}
            }
        }
        throw new ax.y8.c(c8222222, "Unable to parse the explicit Tagged Object with %s, it might be implicit", this.q);
    }

    public <T extends ax.C8.b> T q(ax.C8.c<T> c8) {
        ax.C8.b b8 = this.c0;
        if (b8 != null && b8.e().equals(c8)) {
            return (T)this.c0;
        }
        if (this.c0 == null && this.d0 != null) {
            return c8.j(this.e0).a(c8, this.d0);
        }
        throw new ax.y8.c("Unable to parse the implicit Tagged Object with %s, it is explicit", c8);
    }

    public int r() {
        return this.q.h();
    }

    public ax.C8.b s() {
        return this.p();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append("[");
        stringBuilder.append(this.q);
        if (this.c0 != null) {
            stringBuilder.append(",");
            stringBuilder.append(this.c0);
        } else {
            stringBuilder.append(",<unknown>");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static class b
    extends d<c> {
        public b(a a8) {
            super(a8);
        }

        public c b(ax.C8.c<c> c8, byte[] byArray) {
            return new c(c8, byArray, this.a);
        }
    }

    public static class c
    extends e<c> {
        public c(ax.z8.b b8) {
            super(b8);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void c(c c8) throws IOException {
            Throwable throwable2;
            ax.y8.b b8;
            block6: {
                ByteArrayOutputStream byteArrayOutputStream;
                block5: {
                    ax.C8.b b9;
                    block4: {
                        b9 = c8.c0;
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        b8 = new ax.y8.b(this.a, byteArrayOutputStream);
                        try {
                            if (!c8.f0) break block4;
                            b8.c(b9);
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    b9.e().k(this.a).a(b9, b8);
                }
                c.k(c8, byteArrayOutputStream.toByteArray());
                ((OutputStream)b8).close();
                return;
            }
            try {
                ((OutputStream)b8).close();
                throw throwable2;
            }
            catch (Throwable throwable3) {
                throwable2.addSuppressed(throwable3);
            }
            throw throwable2;
        }

        public void d(c c8, ax.y8.b b8) throws IOException {
            if (c8.d0 == null) {
                this.c(c8);
            }
            ((OutputStream)b8).write(c8.d0);
        }

        public int e(c c8) throws IOException {
            if (c8.d0 == null) {
                this.c(c8);
            }
            return c8.d0.length;
        }
    }
}

