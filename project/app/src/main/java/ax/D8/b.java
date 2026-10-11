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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class b
extends ax.C8.b<Set<ax.C8.b>>
implements Iterable {
    private final Set<ax.C8.b> c0;
    private byte[] d0;

    private b(Set<ax.C8.b> set, byte[] byArray) {
        super(ax.C8.c.m);
        this.c0 = set;
        this.d0 = byArray;
    }

    static /* synthetic */ byte[] k(b b8, byte[] byArray) {
        b8.d0 = byArray;
        return byArray;
    }

    public Iterator<ax.C8.b> iterator() {
        return new HashSet<ax.C8.b>(this.c0).iterator();
    }

    public Set<ax.C8.b> l() {
        return new HashSet<ax.C8.b>(this.c0);
    }

    public static class b
    extends d<b> {
        public b(a a8) {
            super(a8);
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public b b(ax.C8.c<b> object, byte[] byArray) throws ax.y8.c {
            HashSet<ax.C8.b> hashSet = new HashSet<ax.C8.b>();
            object = new ax.y8.a(this.a, byArray);
            {
                Throwable throwable2222222;
                block9: {
                    catch (IOException iOException) {
                        throw new ax.y8.c(iOException, "Could not parse ASN.1 SET contents.", new Object[0]);
                    }
                    try {
                        Iterator<ax.C8.b> iterator = ((ax.y8.a)object).iterator();
                        while (iterator.hasNext()) {
                            hashSet.add(iterator.next());
                        }
                    }
                    catch (Throwable throwable2222222) {
                        break block9;
                    }
                    {
                        ((InputStream)object).close();
                        return new b(hashSet, byArray);
                    }
                }
                try {
                    ((InputStream)object).close();
                    throw throwable2222222;
                }
                catch (Throwable throwable3) {}
                {
                    throwable2222222.addSuppressed(throwable3);
                    throw throwable2222222;
                }
            }
        }
    }

    public static class c
    extends e<b> {
        public c(ax.z8.b b8) {
            super(b8);
        }

        private void c(b b8) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ax.y8.b b9 = new ax.y8.b(this.a, byteArrayOutputStream);
            Iterator<ax.C8.b> iterator = b8.iterator();
            while (iterator.hasNext()) {
                b9.c(iterator.next());
            }
            b.k(b8, byteArrayOutputStream.toByteArray());
        }

        public void d(b object, ax.y8.b b8) throws IOException {
            if (((b)object).d0 != null) {
                ((OutputStream)b8).write(((b)object).d0);
                return;
            }
            object = ((b)object).iterator();
            while (object.hasNext()) {
                b8.c((ax.C8.b)object.next());
            }
        }

        public int e(b b8) throws IOException {
            if (b8.d0 == null) {
                this.c(b8);
            }
            return b8.d0.length;
        }
    }
}

