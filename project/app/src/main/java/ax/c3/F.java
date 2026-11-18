/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.os.ParcelFileDescriptor;
import ax.Dc.I;
import ax.Dc.S;
import ax.Kc.o;
import ax.T.l;
import ax.X2.Q;
import ax.Z.f;
import ax.b3.a;
import ax.b3.j;
import ax.c3.B;
import ax.c3.G;
import ax.c3.b0;
import ax.c3.k;
import ax.g3.i;
import ax.u3.b;
import ax.u3.c;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.y;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

public class F {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable == null) return;
        try {
            f.a(autoCloseable);
            return;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        try {
            long l8 = F.c(inputStream, outputStream, -1L, null, null);
            return l8;
        }
        catch (a a8) {
            return -1L;
        }
    }

    public static long c(InputStream inputStream, OutputStream outputStream, long l8, c c8, i i8) throws a, IOException {
        return F.d(inputStream, outputStream, l8, new byte[8192], false, -1L, c8, i8);
    }

    public static long d(InputStream object, OutputStream outputStream, long l8, byte[] byArray, boolean bl, long l9, c c8, i i8) throws a, IOException {
        boolean bl2;
        if (Q.F() && (object instanceof ParcelFileDescriptor.AutoCloseInputStream || object instanceof b0.a)) {
            Q.l(37);
            bl2 = true;
        } else {
            bl2 = false;
        }
        long l10 = 0L;
        long l11 = 0L;
        while (true) {
            int n8;
            if (bl2) {
                try {
                    n8 = ((InputStream)object).read(byArray);
                }
                catch (IOException iOException) {
                    String string = iOException.getMessage();
                    if (string != null && string.contains("ENOENT")) {
                        n8 = ((InputStream)object).available();
                        if (n8 > 0) {
                            n8 = ((InputStream)object).read(byArray, 0, ((InputStream)object).available());
                        }
                        if (n8 == 0) {
                            n8 = -1;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("io utils error :");
                        ((StringBuilder)object).append(string);
                        b.e(((StringBuilder)object).toString());
                        throw iOException;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("io utils error :");
                    ((StringBuilder)object).append(string);
                    b.e(((StringBuilder)object).toString());
                    throw iOException;
                }
            } else {
                n8 = ((InputStream)object).read(byArray);
            }
            if (n8 < 0) {
                outputStream.flush();
                if (i8 != null) {
                    i8.a(l10, l8);
                }
                return l10;
            }
            if (n8 == 0) {
                try {
                    Thread.sleep(5L);
                }
                catch (InterruptedException interruptedException) {}
                continue;
            }
            outputStream.write(byArray, 0, n8);
            long l12 = l10 + (long)n8;
            long l13 = l11;
            if (l12 - l11 >= 262144L) {
                if (i8 != null) {
                    if (bl && object instanceof o) {
                        i8.a(((o)object).a(), l8);
                    } else {
                        i8.a(l12, l8);
                    }
                }
                if (c8 != null && c8.isCancelled()) {
                    throw new a();
                }
                l13 = l12;
            }
            l10 = l12;
            l11 = l13;
            if (l9 <= 0L) continue;
            if (l12 > l9) break;
            l10 = l12;
            l11 = l13;
        }
        throw new IOException("Size limit exceeded");
    }

    public static G e(byte[] byArray) {
        return new G(byArray){
            final byte[] a;
            {
                this.a = byArray;
            }

            @Override
            public boolean a() {
                return true;
            }

            @Override
            public InputStream c(long l8) throws j {
                IOException iOException2;
                block4: {
                    ByteArrayInputStream byteArrayInputStream;
                    block3: {
                        try {
                            byteArrayInputStream = new ByteArrayInputStream(this.a);
                            if (l8 <= 0L) break block3;
                        }
                        catch (IOException iOException2) {}
                        ((InputStream)byteArrayInputStream).skip(l8);
                        return byteArrayInputStream;
                        break block4;
                    }
                    return byteArrayInputStream;
                }
                throw new j(iOException2);
            }

            @Override
            public long d() {
                return this.a.length;
            }
        };
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void f(InputStream inputStream, File file, long l8, c object) throws IOException, a {
        RuntimeException var1_8;
        block20: {
            Object object2;
            Object object3;
            Object var7_12;
            block21: {
                block19: {
                    var7_12 = null;
                    object3 = null;
                    object3 = object2 = new FileOutputStream(file);
                    F.c(inputStream, (OutputStream)object2, l8, (c)object, null);
                    if (inputStream == null) break block19;
                    try {
                        inputStream.close();
                        break block19;
                    }
                    catch (IOException iOException) {}
                    catch (Throwable throwable) {
                        object = object3;
                        break block20;
                    }
                    catch (a a8) {
                        object = null;
                        break block21;
                    }
                }
                try {
                    ((OutputStream)object2).close();
                    return;
                }
                catch (IOException iOException) {
                    return;
                }
                catch (Throwable throwable) {
                    object = object3;
                    break block20;
                }
                catch (a a9) {
                    object = object2;
                    object2 = a9;
                }
            }
            object3 = object;
            try {
                ((OutputStream)object).close();
                object = var7_12;
            }
            catch (IOException iOException) {
                // empty catch block
            }
            try {
                if (!file.exists()) throw object2;
                file.delete();
                throw object2;
            }
            catch (Throwable throwable) {}
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        if (object == null) throw var1_8;
        try {
            ((OutputStream)object).close();
        }
        catch (IOException iOException) {
            throw var1_8;
        }
        throw var1_8;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] g(k object, String object2) throws j {
        Object object3;
        Object object4;
        block18: {
            Object object5;
            block19: {
                Object object6;
                block22: {
                    Object var6_11;
                    block20: {
                        block21: {
                            block17: {
                                block16: {
                                    object6 = null;
                                    object4 = null;
                                    object3 = null;
                                    var6_11 = null;
                                    try {
                                        if (!B.P((n)object)) break block16;
                                        object5 = new S(((y)object).K0());
                                        object4 = null;
                                        object = object5;
                                        break block17;
                                    }
                                    catch (Throwable throwable) {
                                        object4 = null;
                                        object2 = null;
                                        break block18;
                                    }
                                    catch (IOException iOException) {
                                        object2 = null;
                                        object = null;
                                        break block19;
                                    }
                                }
                                object = new FileInputStream(((com.voxdon.xplorer.file.i)object).e0(true).getFileDescriptor());
                                try {
                                    object5 = new S(l.a((FileInputStream)object));
                                    object4 = object;
                                    object = object5;
                                }
                                catch (Throwable throwable) {
                                    Object var4_13 = null;
                                    object2 = object;
                                    object = throwable;
                                    object4 = var4_13;
                                    break block18;
                                }
                                catch (IOException iOException) {
                                    object2 = null;
                                    break block19;
                                }
                            }
                            object3 = var6_11;
                            object5 = object6;
                            try {
                                object2 = ((S)object).g((String)object2);
                                if (object2 != null) break block20;
                                if (object4 == null) break block21;
                            }
                            catch (Throwable throwable) {
                                object5 = object;
                                object2 = object4;
                                object = throwable;
                                object4 = object5;
                                break block18;
                            }
                            catch (IOException iOException) {
                                object2 = object4;
                                object4 = object;
                                object = object2;
                                object2 = object5;
                                break block19;
                            }
                            F.a((AutoCloseable)object4);
                        }
                        F.a((AutoCloseable)object);
                        return null;
                    }
                    object3 = var6_11;
                    object5 = object6;
                    {
                        object3 = object2 = ((S)object).j((I)object2);
                        object5 = object2;
                        object3 = object2;
                        object5 = object2;
                        object6 = new ByteArrayOutputStream(8192);
                        object3 = object2;
                        object5 = object2;
                        F.b((InputStream)object2, (OutputStream)object6);
                        object3 = object2;
                        object5 = object2;
                        ((ByteArrayOutputStream)object6).close();
                        object3 = object2;
                        object5 = object2;
                        object6 = ((ByteArrayOutputStream)object6).toByteArray();
                        if (object2 == null) break block22;
                    }
                    F.a((AutoCloseable)object2);
                }
                if (object4 != null) {
                    F.a((AutoCloseable)object4);
                }
                F.a((AutoCloseable)object);
                return object6;
            }
            try {
                ((Throwable)object3).printStackTrace();
                object5 = new j((Throwable)object3);
                throw object5;
            }
            catch (Throwable throwable) {
                object3 = object2;
                object2 = object;
                object = throwable;
            }
        }
        if (object3 != null) {
            F.a((AutoCloseable)object3);
        }
        if (object2 != null) {
            F.a((AutoCloseable)object2);
        }
        if (object4 != null) {
            F.a(object4);
        }
        throw object;
    }

    public static byte[] h(InputStream inputStream, int n8) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n8);
        F.b(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static String i(InputStream inputStream, int n8) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n8);
        F.b(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toString("UTF-8");
    }

    public static String j(InputStream object, int n8, long l8) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n8);
        byte[] byArray = new byte[8192];
        try {
            F.d((InputStream)object, byteArrayOutputStream, -1L, byArray, false, l8, null, null);
            object = byteArrayOutputStream.toString("UTF-8");
            return object;
        }
        catch (a a8) {
            b.f();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean k(k var0, String var1_1, File var2_3) throws j {
        block29: {
            block32: {
                block30: {
                    block31: {
                        block27: {
                            block28: {
                                block26: {
                                    var5_5 = null;
                                    var3_7 = null;
                                    try {
                                        if (!B.P((n)var0)) break block26;
                                        var4_10 = new S(((y)var0).K0());
                                        var3_7 = null;
                                        var0 = var4_10;
                                        break block27;
                                    }
                                    catch (Throwable var3_8) {
                                        var1_1 = null;
                                        var0 = var2_3 = null;
                                        var4_10 = var5_5;
                                        break block28;
                                    }
                                    catch (IOException var4_11) {
                                        var1_1 = null;
                                        var0 = var2_3 = null;
                                        break block29;
                                    }
                                }
                                var0 = new FileInputStream(((com.voxdon.xplorer.file.i)var0).e0(true).getFileDescriptor());
                                var4_10 = new S(l.a((FileInputStream)var0));
                                var3_7 = var0;
                                var0 = var4_10;
                                break block27;
                            }
lbl26:
                            // 4 sources

                            while (true) {
                                if (var4_10 != null) {
                                    F.a((AutoCloseable)var4_10);
                                }
                                if (var0 != null) {
                                    F.a((AutoCloseable)var0);
                                }
                                if (var1_1 != null) {
                                    F.a((AutoCloseable)var1_1);
                                }
                                if (var2_3 != null) {
                                    F.a((AutoCloseable)var2_3);
                                }
                                throw var3_7;
                            }
                        }
                        var1_1 = var0.g((String)var1_1);
                        if (var1_1 != null) break block30;
                        if (var3_7 == null) break block31;
                        F.a((AutoCloseable)var3_7);
                    }
                    F.a((AutoCloseable)var0);
                    return false;
                }
                var1_1 = var0.j((I)var1_1);
                var4_10 = new FileOutputStream((File)var2_3);
                var2_3 = new BufferedOutputStream((OutputStream)var4_10, 8192);
                try {
                    F.b((InputStream)var1_1, (OutputStream)var2_3);
                    if (var1_1 == null) break block32;
                }
                catch (Throwable var4_12) {
                    var5_5 = var3_7;
                    var3_7 = var4_12;
                    var4_10 = var0;
                    var0 = var5_5;
lbl67:
                    // 3 sources

                    while (true) {
                        var5_5 = var1_1;
                        var1_1 = var4_10;
                        var4_10 = var5_5;
                        ** GOTO lbl26
                        break;
                    }
                }
                F.a((AutoCloseable)var1_1);
            }
            if (var3_7 != null) {
                F.a((AutoCloseable)var3_7);
            }
            F.a((AutoCloseable)var0);
            F.a((AutoCloseable)var2_3);
            return true;
            catch (Throwable var3_9) {
                var1_1 = null;
                var2_3 = null;
                var4_10 = var5_5;
                ** GOTO lbl26
            }
            catch (IOException var4_16) {
                var1_1 = null;
                var2_3 = null;
                break block29;
            }
            catch (Throwable var1_2) {
                var2_3 = var3_7;
                var3_7 = var1_2;
                var1_1 = var0;
                var6_17 = null;
                var4_10 = var5_5;
                var0 = var2_3;
                var2_3 = var6_17;
                ** continue;
            }
            catch (IOException var4_15) {
                var2_3 = null;
                var1_1 = var3_7;
                var5_5 = null;
                var3_7 = var0;
                var0 = var1_1;
                var1_1 = var5_5;
            }
            {
                break block29;
lbl98:
                // 2 sources

                while (true) {
                    var5_5 = var3_7;
                    var3_7 = var0;
                    var0 = var5_5;
                    break block29;
                    break;
                }
            }
            catch (Throwable var2_4) {
                var4_10 = var0;
                var0 = var3_7;
                var3_7 = var2_4;
                var2_3 = null;
                ** GOTO lbl67
            }
            catch (IOException var4_14) {
                var2_3 = null;
                ** GOTO lbl98
            }
            catch (IOException var4_13) {}
            ** while (true)
        }
        try {
            var4_10.printStackTrace();
            var5_5 = new j((Throwable)var4_10);
            throw var5_5;
        }
        catch (Throwable var5_6) {
            var4_10 = var3_7;
            var3_7 = var5_6;
            ** continue;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ax.B.b<String> l(k var0, File var1_3, ax.B.b<String> var2_9) throws j {
        block27: {
            block28: {
                block30: {
                    block29: {
                        block26: {
                            block25: {
                                if (!var1_3.exists()) {
                                    var1_3.mkdirs();
                                }
                                if ((var3_14 = var1_3.list()) != null && ((String[])var3_14).length != 0) {
                                    throw new j("Destination directory is not empty.");
                                }
                                var3_14 = null;
                                var7_15 = null;
                                var4_16 = null;
                                var6_17 = null;
                                var5_18 = var2_9 != null ? new ax.B.b<E>() : null;
                                try {
                                    if (!B.P((n)var0)) break block25;
                                    var3_14 = new S(((y)var0).K0());
                                    var0 = null;
                                    break block26;
                                }
                                catch (Throwable var0_1) {
                                    var3_14 = null;
                                    break block27;
                                }
                                catch (IOException var2_10) {
                                    var0 = null;
                                    var1_3 = var7_15;
                                    break block28;
                                }
                            }
                            var0 = new FileInputStream(((com.voxdon.xplorer.file.i)var0).e0(true).getFileDescriptor());
                            var4_16 = var3_14;
                            var3_14 = var0;
                            try {
                                var3_14 = var8_19 = new S(l.a((FileInputStream)var0));
                            }
                            catch (Throwable var0_2) {
                                break block27;
                            }
                            catch (IOException var2_12) {
                                var1_3 = var7_15;
                                break block28;
                            }
                        }
                        try {
                            var10_20 = var3_14.f();
lbl38:
                            // 5 sources

                            while (var10_20.hasMoreElements()) {
                                var4_16 = var10_20.nextElement();
                                var8_19 = var4_16.getName();
                                if (var2_9 != null && !var2_9.contains(var8_19)) continue;
                                var9_21 = new File((File)var1_3, (String)var8_19);
                                var7_15 = var9_21.getCanonicalPath();
                                var11_22 = new StringBuilder();
                                var11_22.append(var1_3.getCanonicalPath());
                                var11_22.append(File.separator);
                                if (!var7_15.startsWith(var11_22.toString())) break block29;
                                if (var4_16.isDirectory()) {
                                    var9_21.mkdirs();
                                    continue;
                                }
                                var7_15 = new File(var9_21.getParent());
                                var7_15.mkdirs();
                                ** GOTO lbl-1000
                            }
                            break block30;
                        }
                        catch (Throwable var1_4) {
                            var4_16 = var3_14;
                            var3_14 = var0;
                            var0 = var1_4;
                            break block27;
                        }
                        catch (IOException var2_11) {
                            var1_3 = var3_14;
                            break block28;
                        }
lbl-1000:
                        // 1 sources

                        {
                            var7_15 = var3_14.j((I)var4_16);
                        }
                        {
                            var4_16 = new FileOutputStream(var9_21);
                        }
                        {
                            F.b((InputStream)var7_15, (OutputStream)var4_16);
                        }
                        F.a((AutoCloseable)var4_16);
                        if (var7_15 != null) {
                            F.a((AutoCloseable)var7_15);
                        }
                        if (var5_18 == null) ** GOTO lbl38
                        var5_18.add(var8_19);
                        ** GOTO lbl38
                    }
                    var2_9 = new StringBuilder();
                    var2_9.append("Illegal name: ");
                    var2_9.append((String)var8_19);
                    var1_3 = new j(var2_9.toString());
                    throw var1_3;
                }
                F.a((AutoCloseable)var3_14);
                if (var0 != null) {
                    F.a((AutoCloseable)var0);
                }
                return var5_18;
            }
            var4_16 = var1_3;
            var3_14 = var0;
            {
                var2_13.printStackTrace();
                var4_16 = var1_3;
                var3_14 = var0;
                var4_16 = var1_3;
                var3_14 = var0;
                var5_18 = new j((Throwable)var2_13);
                var4_16 = var1_3;
                var3_14 = var0;
                throw var5_18;
            }
        }
        if (var4_16 != null) {
            F.a(var4_16);
        }
        if (var3_14 != null) {
            F.a((AutoCloseable)var3_14);
        }
        throw var0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void m(File file, String string) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(string);
            ((Writer)fileWriter).close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }
}

