/*
 * Decompiled with CFR 0.152.
 */
package ax.D8;

import ax.y8.d;
import ax.y8.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
extends ax.C8.b<List<ax.C8.b>>
implements Iterable {
    private final List<ax.C8.b> c0;
    private byte[] d0;

    public a(List<ax.C8.b> list) {
        super(ax.C8.c.n);
        this.c0 = list;
    }

    private a(List<ax.C8.b> list, byte[] byArray) {
        super(ax.C8.c.n);
        this.c0 = list;
        this.d0 = byArray;
    }

    static /* synthetic */ byte[] k(a a8, byte[] byArray) {
        a8.d0 = byArray;
        return byArray;
    }

    public Iterator<ax.C8.b> iterator() {
        return new ArrayList<ax.C8.b>(this.c0).iterator();
    }

    public ax.C8.b l(int n8) {
        return this.c0.get(n8);
    }

    public List<ax.C8.b> n() {
        return new ArrayList<ax.C8.b>(this.c0);
    }

    public static class b
    extends d<a> {
        public b(ax.z8.a a8) {
            super(a8);
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public a b(ax.C8.c<a> object, byte[] byArray) throws ax.y8.c {
            ArrayList<ax.C8.b> arrayList = new ArrayList<ax.C8.b>();
            object = new ax.y8.a(this.a, byArray);
            {
                Throwable throwable2222222;
                block9: {
                    catch (IOException iOException) {
                        throw new ax.y8.c(iOException, "Unable to parse the ASN.1 SEQUENCE contents.", new Object[0]);
                    }
                    try {
                        Iterator<ax.C8.b> iterator = ((ax.y8.a)object).iterator();
                        while (iterator.hasNext()) {
                            arrayList.add(iterator.next());
                        }
                    }
                    catch (Throwable throwable2222222) {
                        break block9;
                    }
                    {
                        ((InputStream)object).close();
                        return new a(arrayList, byArray);
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
    extends e<a> {
        public c(ax.z8.b b8) {
            super(b8);
        }

        private void c(a a8) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ax.y8.b b8 = new ax.y8.b(this.a, byteArrayOutputStream);
            Iterator<ax.C8.b> iterator = a8.iterator();
            while (iterator.hasNext()) {
                b8.c(iterator.next());
            }
            a.k(a8, byteArrayOutputStream.toByteArray());
        }

        public void d(a object, ax.y8.b b8) throws IOException {
            if (((a)object).d0 != null) {
                ((OutputStream)b8).write(((a)object).d0);
                return;
            }
            object = ((a)object).iterator();
            while (object.hasNext()) {
                b8.c((ax.C8.b)object.next());
            }
        }

        public int e(a a8) throws IOException {
            if (a8.d0 == null) {
                this.c(a8);
            }
            return a8.d0.length;
        }
    }
}

