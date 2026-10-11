/*
 * Decompiled with CFR 0.152.
 */
package ax.K7;

import ax.J7.i;
import ax.K7.c;
import ax.K7.g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

class h
implements c {
    private static final Charset d = Charset.forName("UTF-8");
    private final File a;
    private final int b;
    private g c;

    h(File file, int n8) {
        this.a = file;
        this.b = n8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void f(long l8, String object) {
        IOException iOException2;
        block6: {
            block5: {
                if (this.c == null) {
                    return;
                }
                String string = object;
                if (object == null) {
                    string = "null";
                }
                try {
                    int n8 = this.b / 4;
                    object = string;
                    if (string.length() <= n8) break block5;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("...");
                    ((StringBuilder)object).append(string.substring(string.length() - n8));
                    object = ((StringBuilder)object).toString();
                }
                catch (IOException iOException2) {
                    break block6;
                }
            }
            object = ((String)object).replaceAll("\r", " ").replaceAll("\n", " ");
            object = String.format(Locale.US, "%d %s%n", l8, object).getBytes(d);
            this.c.e((byte[])object);
            while (!this.c.p()) {
                if (this.c.s0() <= this.b) return;
                this.c.L();
            }
            return;
        }
        ax.G7.g.f().e("There was a problem writing to the Crashlytics log.", iOException2);
    }

    private b g() {
        if (!this.a.exists()) {
            return null;
        }
        this.h();
        Object object = this.c;
        if (object == null) {
            return null;
        }
        int[] nArray = new int[]{0};
        object = new byte[((g)object).s0()];
        try {
            g g8 = this.c;
            g.d d8 = new g.d(){
                final byte[] a;
                final int[] b;
                final h c;
                {
                    this.c = h8;
                    this.a = byArray;
                    this.b = nArray;
                }

                @Override
                public void a(InputStream inputStream, int n8) throws IOException {
                    int[] nArray;
                    try {
                        inputStream.read(this.a, this.b[0], n8);
                        nArray = this.b;
                    }
                    catch (Throwable throwable) {
                        inputStream.close();
                        throw throwable;
                    }
                    nArray[0] = nArray[0] + n8;
                    inputStream.close();
                }
            };
            g8.m(d8);
        }
        catch (IOException iOException) {
            ax.G7.g.f().e("A problem occurred while reading the Crashlytics log file.", iOException);
        }
        return new b((byte[])object, nArray[0]);
    }

    private void h() {
        if (this.c == null) {
            try {
                g g8;
                this.c = g8 = new g(this.a);
                return;
            }
            catch (IOException iOException) {
                ax.G7.g g9 = ax.G7.g.f();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not open log file: ");
                stringBuilder.append(this.a);
                g9.e(stringBuilder.toString(), iOException);
            }
        }
    }

    @Override
    public void a() {
        i.f(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    @Override
    public String b() {
        byte[] byArray = this.c();
        if (byArray != null) {
            return new String(byArray, d);
        }
        return null;
    }

    @Override
    public byte[] c() {
        b b8 = this.g();
        if (b8 == null) {
            return null;
        }
        int n8 = b8.b;
        byte[] byArray = new byte[n8];
        System.arraycopy(b8.a, 0, byArray, 0, n8);
        return byArray;
    }

    @Override
    public void d() {
        this.a();
        this.a.delete();
    }

    @Override
    public void e(long l8, String string) {
        this.h();
        this.f(l8, string);
    }

    private static class b {
        public final byte[] a;
        public final int b;

        b(byte[] byArray, int n8) {
            this.a = byArray;
            this.b = n8;
        }
    }
}

