/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import ax.J7.F;
import ax.L7.F;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

class g
implements F {
    private final byte[] a;
    private final String b;
    private final String c;

    g(String string, String string2, byte[] byArray) {
        this.b = string;
        this.c = string2;
        this.a = byArray;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private byte[] c() {
        Throwable throwable422222;
        if (this.d()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        {
            catch (IOException iOException) {
                return null;
            }
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        ((OutputStream)gZIPOutputStream).write(this.a);
        gZIPOutputStream.finish();
        byte[] byArray = byteArrayOutputStream.toByteArray();
        ((OutputStream)gZIPOutputStream).close();
        byteArrayOutputStream.close();
        return byArray;
        catch (Throwable throwable2) {
            try {
                ((OutputStream)gZIPOutputStream).close();
                throw throwable2;
            }
            catch (Throwable throwable3) {
                try {
                    throwable2.addSuppressed(throwable3);
                    throw throwable2;
                }
                catch (Throwable throwable422222) {}
            }
        }
        try {
            byteArrayOutputStream.close();
            throw throwable422222;
        }
        catch (Throwable throwable5) {
            throwable422222.addSuppressed(throwable5);
            throw throwable422222;
        }
    }

    private boolean d() {
        byte[] byArray = this.a;
        return byArray == null || byArray.length == 0;
        {
        }
    }

    @Override
    public String a() {
        return this.c;
    }

    @Override
    public F.d.b b() {
        byte[] byArray = this.c();
        if (byArray == null) {
            return null;
        }
        return F.d.b.a().b(byArray).c(this.b).a();
    }

    @Override
    public InputStream j() {
        if (this.d()) {
            return null;
        }
        return new ByteArrayInputStream(this.a);
    }
}

