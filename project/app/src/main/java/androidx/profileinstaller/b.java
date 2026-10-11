/*
 * Decompiled with CFR 0.152.
 */
package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import androidx.profileinstaller.d;
import androidx.profileinstaller.f;
import androidx.profileinstaller.g;
import androidx.profileinstaller.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;

public class b {
    private final AssetManager a;
    private final Executor b;
    private final f.c c;
    private final byte[] d;
    private final File e;
    private final String f;
    private final String g;
    private final String h;
    private boolean i = false;
    private c[] j;
    private byte[] k;

    public b(AssetManager assetManager, Executor executor, f.c c8, String string, String string2, String string3, File file) {
        this.a = assetManager;
        this.b = executor;
        this.c = c8;
        this.f = string;
        this.g = string2;
        this.h = string3;
        this.e = file;
        this.d = androidx.profileinstaller.b.d();
    }

    public static /* synthetic */ void a(b b8, int n8, Object object) {
        b8.c.b(n8, object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private b b(c[] cArray, byte[] byArray) {
        FileNotFoundException fileNotFoundException2;
        block13: {
            IOException iOException2;
            block12: {
                IllegalStateException illegalStateException2;
                block11: {
                    InputStream inputStream;
                    block10: {
                        inputStream = this.g(this.a, this.h);
                        if (inputStream == null) break block10;
                        try {
                            this.j = androidx.profileinstaller.g.r(inputStream, androidx.profileinstaller.g.p(inputStream, androidx.profileinstaller.g.b), byArray, cArray);
                        }
                        catch (Throwable throwable) {
                            try {
                                inputStream.close();
                                throw throwable;
                            }
                            catch (Throwable throwable2) {
                                try {
                                    throwable.addSuppressed(throwable2);
                                    throw throwable;
                                }
                                catch (IllegalStateException illegalStateException2) {
                                    break block11;
                                }
                                catch (IOException iOException2) {
                                    break block12;
                                }
                                catch (FileNotFoundException fileNotFoundException2) {
                                    break block13;
                                }
                            }
                        }
                        inputStream.close();
                        return this;
                    }
                    if (inputStream == null) return null;
                    inputStream.close();
                    return null;
                }
                this.j = null;
                this.c.b(8, illegalStateException2);
                return null;
            }
            this.c.b(7, iOException2);
            return null;
        }
        this.c.b(9, fileNotFoundException2);
        return null;
    }

    private void c() {
        if (this.i) {
            return;
        }
        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    }

    private static byte[] d() {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 < 24) {
            return null;
        }
        if (n8 >= 31) {
            return androidx.profileinstaller.i.a;
        }
        switch (n8) {
            default: {
                return null;
            }
            case 28: 
            case 29: 
            case 30: {
                return androidx.profileinstaller.i.b;
            }
            case 27: {
                return androidx.profileinstaller.i.c;
            }
            case 26: {
                return androidx.profileinstaller.i.d;
            }
            case 24: 
            case 25: 
        }
        return androidx.profileinstaller.i.e;
    }

    private InputStream f(AssetManager object) {
        block4: {
            FileNotFoundException fileNotFoundException2;
            block3: {
                try {
                    object = this.g((AssetManager)object, this.g);
                    return object;
                }
                catch (IOException iOException) {
                }
                catch (FileNotFoundException fileNotFoundException2) {
                    break block3;
                }
                this.c.b(7, iOException);
                break block4;
            }
            this.c.b(6, fileNotFoundException2);
        }
        return null;
    }

    private InputStream g(AssetManager object, String string) throws IOException {
        try {
            object = object.openFd(string).createInputStream();
            return object;
        }
        catch (FileNotFoundException fileNotFoundException) {
            String string2 = fileNotFoundException.getMessage();
            if (string2 != null && string2.contains("compressed")) {
                this.c.a(5, null);
            }
            return null;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private c[] i(InputStream var1_1) {
        block13: {
            try {
                var2_5 = androidx.profileinstaller.g.x((InputStream)var1_1, androidx.profileinstaller.g.p((InputStream)var1_1, androidx.profileinstaller.g.a), this.f);
            }
            catch (Throwable var2_6) {
                break block13;
            }
            catch (IllegalStateException var2_7) {
                ** GOTO lbl-1000
            }
            catch (IOException var2_8) {
                ** GOTO lbl-1000
            }
            try {
                var1_1.close();
                return var2_5;
            }
            catch (IOException var1_2) {
                this.c.b(7, var1_2);
                return var2_5;
            }
lbl-1000:
            // 1 sources

            {
                this.c.b(8, var2_7);
            }
            try {
                var1_1.close();
                return null;
            }
            catch (IOException var1_3) {
                this.c.b(7, var1_3);
            }
            return null;
lbl-1000:
            // 1 sources

            {
                this.c.b(7, var2_8);
            }
            {
                var1_1.close();
            }
            return null;
        }
        try {
            var1_1.close();
            throw var2_6;
        }
        catch (IOException var1_4) {
            this.c.b(7, var1_4);
        }
        throw var2_6;
    }

    private static boolean j() {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 < 24) {
            return false;
        }
        if (n8 >= 31) {
            return true;
        }
        return n8 == 24 || n8 == 25;
    }

    private void k(int n8, Object object) {
        this.b.execute(new ax.g2.c(this, n8, object));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean e() {
        if (this.d == null) {
            this.k(3, Build.VERSION.SDK_INT);
            return false;
        }
        if (this.e.exists()) {
            if (!this.e.canWrite()) {
                this.k(4, null);
                return false;
            }
        } else {
            try {
                if (!this.e.createNewFile()) {
                    this.k(4, null);
                    return false;
                }
            }
            catch (IOException iOException) {
                this.k(4, null);
                return false;
            }
        }
        this.i = true;
        return true;
    }

    public b h() {
        this.c();
        if (this.d != null) {
            Object object = this.f(this.a);
            if (object != null) {
                this.j = this.i((InputStream)object);
            }
            if ((object = this.j) != null && androidx.profileinstaller.b.j() && (object = this.b((c[])object, this.d)) != null) {
                return object;
            }
        }
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public b l() {
        block13: {
            IOException iOException2;
            block15: {
                IllegalStateException illegalStateException2;
                Throwable throwable2;
                ByteArrayOutputStream byteArrayOutputStream;
                block16: {
                    block12: {
                        c[] cArray = this.j;
                        byte[] byArray = this.d;
                        if (cArray == null) return this;
                        if (byArray == null) {
                            return this;
                        }
                        this.c();
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            androidx.profileinstaller.g.F(byteArrayOutputStream, byArray);
                            if (androidx.profileinstaller.g.C(byteArrayOutputStream, byArray, cArray)) break block12;
                            this.c.b(5, null);
                            this.j = null;
                        }
                        catch (Throwable throwable2) {}
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.k = byteArrayOutputStream.toByteArray();
                    break block16;
                    byteArrayOutputStream.close();
                    break block13;
                }
                try {
                    byteArrayOutputStream.close();
                    throw throwable2;
                }
                catch (Throwable throwable3) {
                    try {
                        throwable2.addSuppressed(throwable3);
                        throw throwable2;
                    }
                    catch (IllegalStateException illegalStateException2) {
                    }
                    catch (IOException iOException2) {
                        break block15;
                    }
                }
                this.c.b(8, illegalStateException2);
                break block13;
            }
            this.c.b(7, iOException2);
        }
        this.j = null;
        return this;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean m() {
        block32: {
            var2_1 /* !! */  = this.k;
            if (var2_1 /* !! */  == null) {
                return false;
            }
            this.c();
            var1_4 = new ByteArrayInputStream(var2_1 /* !! */ );
            var2_1 /* !! */  = (byte[])new FileOutputStream;
            var2_1 /* !! */ (this.e);
            {
                catch (Throwable var2_2) {}
            }
            var3_9 = ax.g2.b.a((FileOutputStream)var2_1 /* !! */ );
            var5_12 = var3_9.tryLock();
            androidx.profileinstaller.d.l(var1_4, (OutputStream)var2_1 /* !! */ , var5_12);
            this.k(1, null);
            if (var5_12 == null) break block32;
            var5_12.close();
        }
        var3_9.close();
        var2_1 /* !! */ .close();
        var1_4.close();
        this.k = null;
        this.j = null;
        return true;
        catch (Throwable var4_15) {
            if (var5_12 == null) throw var4_15;
            try {
                var5_12.close();
                throw var4_15;
            }
            catch (Throwable var5_13) {
                try {
                    var4_15.addSuppressed(var5_13);
                    throw var4_15;
                }
                catch (Throwable var4_14) {}
            }
        }
        if (var3_9 == null) throw var4_14;
        try {
            var3_9.close();
            throw var4_14;
        }
        catch (Throwable var3_11) {
            try {
                var4_14.addSuppressed(var3_11);
                throw var4_14;
            }
            catch (Throwable var3_10) {}
        }
        try {
            var2_1 /* !! */ .close();
            throw var3_10;
        }
        catch (Throwable var2_3) {
            var3_10.addSuppressed(var2_3);
            throw var3_10;
        }
        try {
            var1_4.close();
            throw var2_2;
        }
        catch (Throwable var1_8) {
            try {
                var2_2.addSuppressed(var1_8);
                throw var2_2;
            }
            catch (Throwable var1_5) {}
            catch (IOException var1_6) {}
            catch (FileNotFoundException var1_7) {}
        }
        ** finally { 
lbl69:
        // 1 sources

        this.k = null;
        this.j = null;
        throw var1_5;
    }
}

