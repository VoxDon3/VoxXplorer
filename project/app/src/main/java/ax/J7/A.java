/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import ax.J7.F;
import ax.L7.F;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

class A
implements F {
    private final File a;
    private final String b;
    private final String c;

    A(String string, String string2, File file) {
        this.b = string;
        this.c = string2;
        this.a = file;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private byte[] c() {
        Throwable throwable622222;
        Throwable throwable2222222;
        Throwable throwable3222222;
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        block24: {
            byte[] byArray;
            block23: {
                byArray = new byte[8192];
                inputStream = this.j();
                byteArrayOutputStream = new ByteArrayOutputStream();
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                if (inputStream != null) break block23;
                ((OutputStream)gZIPOutputStream).close();
                byteArrayOutputStream.close();
                if (inputStream == null) return null;
                inputStream.close();
                return null;
            }
            try {
                int n8;
                while ((n8 = inputStream.read(byArray)) > 0) {
                    gZIPOutputStream.write(byArray, 0, n8);
                }
            }
            catch (Throwable throwable3222222) {
                break block24;
            }
            gZIPOutputStream.finish();
            byArray = byteArrayOutputStream.toByteArray();
            ((OutputStream)gZIPOutputStream).close();
            byteArrayOutputStream.close();
            inputStream.close();
            return byArray;
            {
                catch (IOException iOException) {
                    return null;
                }
            }
        }
        try {
            ((OutputStream)gZIPOutputStream).close();
            throw throwable3222222;
        }
        catch (Throwable throwable4) {
            try {
                throwable3222222.addSuppressed(throwable4);
                throw throwable3222222;
            }
            catch (Throwable throwable2222222) {}
        }
        try {
            byteArrayOutputStream.close();
            throw throwable2222222;
        }
        catch (Throwable throwable5) {
            try {
                throwable2222222.addSuppressed(throwable5);
                throw throwable2222222;
            }
            catch (Throwable throwable622222) {}
        }
        if (inputStream == null) throw throwable622222;
        try {
            inputStream.close();
            throw throwable622222;
        }
        catch (Throwable throwable7) {
            throwable622222.addSuppressed(throwable7);
            throw throwable622222;
        }
    }

    @Override
    public String a() {
        return this.c;
    }

    @Override
    public F.d.b b() {
        byte[] byArray = this.c();
        if (byArray != null) {
            return F.d.b.a().b(byArray).c(this.b).a();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public InputStream j() {
        if (!this.a.exists()) return null;
        if (!this.a.isFile()) {
            return null;
        }
        try {
            return new FileInputStream(this.a);
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
    }
}

