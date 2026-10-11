/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import ax.S0.d0;
import ax.T.l;
import ax.U0.b;
import ax.U0.h;
import ax.U0.k;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class x
extends b {
    private final Context e;
    private k f;
    private AssetFileDescriptor g;
    private InputStream h;
    private long i;
    private boolean j;

    public x(Context context) {
        super(false);
        this.e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("rawresource:///");
        stringBuilder.append(n8);
        return Uri.parse((String)stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static AssetFileDescriptor u(Context object, k object2) throws a {
        int n8;
        Uri uri = ((k)object2).a.normalizeScheme();
        if (TextUtils.equals((CharSequence)"rawresource", (CharSequence)uri.getScheme())) {
            object = object.getResources();
            object2 = uri.getPathSegments();
            if (object2.size() != 1) {
                object = new StringBuilder();
                ((StringBuilder)object).append("rawresource:// URI must have exactly one path element, found ");
                ((StringBuilder)object).append(object2.size());
                throw new a(((StringBuilder)object).toString());
            }
            n8 = x.v((String)object2.get(0));
        } else {
            if (!TextUtils.equals((CharSequence)"android.resource", (CharSequence)uri.getScheme())) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Unsupported URI scheme (");
                ((StringBuilder)object).append(uri.getScheme());
                ((StringBuilder)object).append("). Only ");
                ((StringBuilder)object).append("android.resource");
                ((StringBuilder)object).append(" is supported.");
                throw new a(((StringBuilder)object).toString(), null, 1004);
            }
            String string = ax.S0.a.e(uri.getPath());
            object2 = string;
            if (string.startsWith("/")) {
                object2 = string.substring(1);
            }
            if ((string = TextUtils.isEmpty((CharSequence)uri.getHost()) ? object.getPackageName() : uri.getHost()).equals(object.getPackageName())) {
                object = object.getResources();
            } else {
                try {
                    object = object.getPackageManager().getResourcesForApplication(string);
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    throw new a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", nameNotFoundException, 2005);
                }
            }
            if (((String)object2).matches("\\d+")) {
                n8 = x.v((String)object2);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(":");
                stringBuilder.append((String)object2);
                n8 = object.getIdentifier(stringBuilder.toString(), "raw", null);
                if (n8 == 0) {
                    throw new a("Resource not found.", null, 2005);
                }
            }
        }
        try {
            object = object.openRawResourceFd(n8);
            if (object != null) {
                return object;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Resource is compressed: ");
        }
        catch (Resources.NotFoundException notFoundException) {
            throw new a(null, notFoundException, 2005);
        }
        ((StringBuilder)object).append(uri);
        throw new a(((StringBuilder)object).toString(), null, 2000);
    }

    private static int v(String string) throws a {
        try {
            int n8 = Integer.parseInt(string);
            return n8;
        }
        catch (NumberFormatException numberFormatException) {
            throw new a("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override
    public Uri b() {
        k k8 = this.f;
        if (k8 != null) {
            return k8.a;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public int c(byte[] var1_1, int var2_3, int var3_4) throws a {
        block5: {
            block6: {
                if (var3_4 == 0) {
                    return 0;
                }
                var4_5 = this.i;
                if (var4_5 == 0L) {
                    return -1;
                }
                if (var4_5 == -1L) ** GOTO lbl10
                var6_6 = var3_4;
                try {
                    var3_4 = (int)Math.min(var4_5, var6_6);
lbl10:
                    // 2 sources

                    var2_3 = d0.i(this.h).read(var1_1, var2_3, var3_4);
                    if (var2_3 != -1) break block5;
                    if (this.i != -1L) break block6;
                    return -1;
                }
                catch (IOException var1_2) {
                    throw new a(null, var1_2, 2000);
                }
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        var4_5 = this.i;
        if (var4_5 != -1L) {
            this.i = var4_5 - (long)var2_3;
        }
        this.q(var2_3);
        return var2_3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws a {
        Throwable throwable422222;
        block21: {
            Throwable throwable2222222;
            IOException iOException322222;
            block20: {
                Throwable throwable3222222;
                Object object;
                block19: {
                    block18: {
                        this.f = null;
                        object = this.h;
                        if (object != null) {
                            ((InputStream)object).close();
                        }
                        this.h = null;
                        object = this.g;
                        if (object != null) {
                            object.close();
                        }
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            this.r();
                        }
                        return;
                        catch (Throwable throwable3222222) {
                            break block18;
                        }
                        catch (IOException iOException2) {}
                        {
                            a a8 = new a(null, iOException2, 2000);
                            throw a8;
                        }
                    }
                    this.h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.g = null;
                        if (!this.j) break block19;
                        this.j = false;
                        this.r();
                    }
                    catch (Throwable throwable422222) {
                        break block21;
                    }
                    catch (IOException iOException322222) {}
                }
                throw throwable3222222;
                catch (Throwable throwable2222222) {
                    break block20;
                }
                catch (IOException iOException4) {}
                {
                    object = new a(null, iOException4, 2000);
                    throw object;
                }
            }
            this.g = null;
            if (this.j) {
                this.j = false;
                this.r();
            }
            throw throwable2222222;
            {
                a a9 = new a(null, iOException322222, 2000);
                throw a9;
            }
        }
        this.g = null;
        if (this.j) {
            this.j = false;
            this.r();
        }
        throw throwable422222;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public long f(k var1_1) throws a {
        block12: {
            block13: {
                this.f = var1_1;
                this.s((k)var1_1);
                var7_4 = x.u(this.e, (k)var1_1);
                this.g = var7_4;
                var3_5 = var7_4.getLength();
                var7_4 = new FileInputStream(this.g.getFileDescriptor());
                this.h = var7_4;
                cfr_temp_0 = var3_5 - -1L;
                var2_6 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                if (var2_6 != false) {
                    try {
                        if (var1_1.g > var3_5) {
                            var1_1 = new a(null, null, 2008);
                            throw var1_1;
                        }
                    }
                    catch (IOException var1_2) {
                        throw new a(null, var1_2, 2000);
                    }
                    catch (a var1_3) {
                        throw var1_3;
                    }
                }
                var5_7 = this.g.getStartOffset();
                if ((var5_7 = var7_4.skip(var1_1.g + var5_7) - var5_7) != var1_1.g) ** GOTO lbl48
                if (var2_6 != false) break block13;
                if ((var7_4 = l.a((FileInputStream)var7_4)).size() == 0L) {
                    this.i = -1L;
                    break block12;
                } else {
                    this.i = var3_5 = var7_4.size() - var7_4.position();
                    if (var3_5 < 0L) {
                        var1_1 = new a(null, null, 2008);
                        throw var1_1;
                    }
                }
                break block12;
            }
            this.i = var3_5 -= var5_7;
            if (var3_5 < 0L) ** GOTO lbl-1000
        }
        var3_5 = var1_1.h;
        if (var3_5 != -1L) {
            var5_7 = this.i;
            if (var5_7 != -1L) {
                var3_5 = Math.min(var5_7, var3_5);
            }
            this.i = var3_5;
        }
        this.j = true;
        this.t((k)var1_1);
        var3_5 = var1_1.h;
        if (var3_5 == -1L) return this.i;
        return var3_5;
lbl-1000:
        // 1 sources

        {
            var1_1 = new h(2008);
            throw var1_1;
lbl48:
            // 1 sources

            var1_1 = new a(null, null, 2008);
            throw var1_1;
        }
    }

    public static class a
    extends h {
        @Deprecated
        public a(String string) {
            super(string, null, 2000);
        }

        public a(String string, Throwable throwable, int n8) {
            super(string, throwable, n8);
        }
    }
}

