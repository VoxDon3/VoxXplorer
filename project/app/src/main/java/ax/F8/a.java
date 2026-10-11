/*
 * Decompiled with CFR 0.152.
 */
package ax.F8;

import ax.y8.d;
import ax.y8.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class a
extends ax.F8.c<boolean[]> {
    private int d0;
    private boolean[] e0;

    private a(ax.C8.c<a> c8, byte[] byArray, int n8) {
        super(c8, byArray);
        this.d0 = n8;
        this.e0 = this.k();
    }

    private boolean[] k() {
        int n8 = this.p();
        boolean[] blArray = new boolean[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            blArray[i8] = this.n(i8);
        }
        return blArray;
    }

    @Override
    protected String h() {
        return Arrays.toString(this.e0);
    }

    public boolean[] l() {
        boolean[] blArray = this.e0;
        return Arrays.copyOf(blArray, blArray.length);
    }

    public boolean n(int n8) {
        int n9 = n8 / 8;
        return (1 << 7 - n8 % 8 & this.c0[n9]) != 0;
    }

    public int p() {
        return this.c0.length * 8 - this.d0;
    }

    public static class b
    extends d<a> {
        public b(ax.z8.a a8) {
            super(a8);
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public a b(ax.C8.c<a> object, byte[] object2) {
            Throwable throwable222222;
            ax.y8.a a8;
            block11: {
                Object object3;
                Object object4;
                if (!((ax.C8.c)object).i()) {
                    Object object5 = object2[0];
                    return new a((ax.C8.c)object, Arrays.copyOfRange((byte[])object2, 1, ((Object)object2).length), (int)object5);
                }
                a8 = new ax.y8.a(this.a, (byte[])object2);
                try {
                    object2 = new ByteArrayOutputStream();
                    object4 = 0;
                    while (((InputStream)a8).available() > 0) {
                        object3 = a8.p();
                        boolean bl = ((ax.C8.c)object3).h() == ((ax.C8.c)object).h();
                        ax.G8.a.b(bl, "Expected an ASN.1 BIT STRING as Constructed object, got: %s", object3);
                        object3 = a8.q(a8.e());
                        ((ByteArrayOutputStream)object2).write((byte[])object3, 1, ((Object)object3).length - 1);
                        if (((InputStream)a8).available() > 0) continue;
                    }
                }
                catch (Throwable throwable222222) {}
                {
                    object4 = object3[0];
                    continue;
                }
                object = new a((ax.C8.c)object, ((ByteArrayOutputStream)object2).toByteArray(), (int)object4);
                break block11;
                ((InputStream)a8).close();
                return object;
                {
                    catch (IOException iOException) {
                        throw new ax.y8.c(iOException, "Unable to parse Constructed ASN.1 BIT STRING", new Object[0]);
                    }
                }
            }
            try {
                ((InputStream)a8).close();
                throw throwable222222;
            }
            catch (Throwable throwable3) {
                throwable222222.addSuppressed(throwable3);
                throw throwable222222;
            }
        }
    }

    public static class c
    extends e<a> {
        public c(ax.z8.b b8) {
            super(b8);
        }

        public void c(a a8, ax.y8.b b8) throws IOException {
            ((OutputStream)b8).write(a8.d0);
            ((OutputStream)b8).write(a8.c0);
        }

        public int d(a a8) {
            return a8.c0.length + 1;
        }
    }
}

