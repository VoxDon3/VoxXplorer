/*
 * Decompiled with CFR 0.152.
 */
package ax.X2;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import android.system.StructStatVfs;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import ax.Ha.c;
import ax.Q2.d;
import ax.X2.L;
import ax.X2.M;
import ax.X2.Q;
import ax.X2.r;
import ax.X2.s;
import ax.X2.t;
import ax.X2.u;
import ax.b3.j;
import ax.c3.F;
import ax.c3.l;
import java.io.FileNotFoundException;
import java.io.IOException;

@TargetApi(value=21)
public class v {
    static int a = 0;
    static int b = 1;
    static int c = -1;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(Context context, Uri object) throws j {
        Throwable throwable2222;
        block7: {
            Exception exception2;
            Object object2;
            block6: {
                Object object3;
                block5: {
                    boolean bl;
                    object3 = context.getContentResolver();
                    object2 = null;
                    context = null;
                    try {
                        object = object3.query(object, new String[]{"document_id"}, null, null, null);
                        if (object == null) break block5;
                        context = object;
                        object2 = object;
                        int n8 = object.getCount();
                        bl = n8 > 0;
                    }
                    catch (Exception exception2) {
                        break block6;
                    }
                    F.a((AutoCloseable)object);
                    return bl;
                    catch (Throwable throwable2222) {
                        break block7;
                    }
                }
                context = object;
                object2 = object;
                {
                    context = object;
                    object2 = object;
                    object3 = new j("cursor is null");
                    context = object;
                    object2 = object;
                    throw object3;
                }
            }
            context = object2;
            exception2.printStackTrace();
            context = object2;
            context = object2;
            object = new j(exception2);
            context = object2;
            throw object;
        }
        F.a((AutoCloseable)context);
        throw throwable2222;
    }

    /*
     * Exception decompiling
     */
    public static Uri b(ContentResolver var0, Uri var1_11, String var2_17, long var3_18, long var5_19) throws j {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [21, 20, 19 : 126->136)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static Uri c(Uri uri, String string) {
        return DocumentsContract.buildDocumentUriUsingTree((Uri)uri, (String)string);
    }

    /*
     * Exception decompiling
     */
    public static Uri d(ContentResolver var0, Uri var1_10, String var2_16, String var3_18) throws j {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 8[TRYBLOCK] [24, 23, 22 : 128->137)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static Uri e(ContentResolver contentResolver, Uri uri, String string) throws j {
        return v.d(contentResolver, uri, "vnd.android.document/directory", string);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void f(ContentResolver var0, Uri var1_4) throws j {
        block26: {
            block25: {
                var6_12 = var0 /* !! */ .acquireUnstableContentProviderClient(var1_4 /* !! */ .getAuthority());
                var5_13 = null;
                var3_14 = null;
                var4_15 = null;
                var2_16 = var4_15;
                ** try [egrp 1[TRYBLOCK] [2, 1 : 21->89)] { 
lbl8:
                // 1 sources

                break block26;
lbl9:
                // 1 sources

                catch (Throwable var0_1) {
                    break block25;
                }
lbl11:
                // 1 sources

                catch (Exception var1_5) {
                    var0 /* !! */  = var3_14;
                }
lbl13:
                // 2 sources

                while (true) {
                    var2_16 = var0 /* !! */ ;
                    {
                        var2_16 = var0 /* !! */ ;
                        var2_16 = var0 /* !! */ ;
                        var4_15 = new StringBuilder();
                        var2_16 = var0 /* !! */ ;
                        var4_15.append("delete document exception : ");
                        var2_16 = var0 /* !! */ ;
                        var4_15.append(var1_9.getClass().getSimpleName());
                        var2_16 = var0 /* !! */ ;
                        var4_15.append(":");
                        var2_16 = var0 /* !! */ ;
                        var4_15.append(var1_9.getMessage());
                        var2_16 = var0 /* !! */ ;
                        var3_14 = new j(var4_15.toString());
                        var2_16 = var0 /* !! */ ;
                        throw var3_14;
                    }
                    break;
                }
            }
lbl35:
            // 2 sources

            while (true) {
                if (var6_12 != null) {
                    try {
                        var6_12.release();
                    }
                    catch (Exception var1_10) {
                        // empty catch block
                    }
                }
                if (var2_16 == null) throw var0 /* !! */ ;
                var2_16.release();
                throw var0 /* !! */ ;
                break;
            }
            catch (SecurityException var0_2) {
                throw new j(var0_2);
            }
        }
        var2_16 = var4_15;
        var7_18 = new Bundle();
        var2_16 = var4_15;
        var7_18.putParcelable("uri", (Parcelable)var1_4 /* !! */ );
        var2_16 = var4_15;
        try {
            var6_12.call("android:deleteDocument", null, var7_18);
            var0 /* !! */  = var5_13;
        }
        catch (DeadObjectException | NullPointerException var2_17) {
            var2_16 = var4_15;
            var0 /* !! */  = var0 /* !! */ .acquireContentProviderClient(var1_4 /* !! */ .getAuthority());
            if (var0 /* !! */  != null) {
                try {
                    var0 /* !! */ .call("android:deleteDocument", null, var7_18);
                    ax.Ha.c.h().f().c("DeadObjectException RETRY SUCCESS").g("DELETE").h();
                }
                catch (Throwable var1_7) {
                    var2_16 = var0 /* !! */ ;
                    var0 /* !! */  = var1_7;
                    ** continue;
                }
                catch (Exception var1_8) {
                    ** continue;
                }
            }
            ** GOTO lbl-1000
        }
        if (var6_12 != null) {
            try {
                var6_12.release();
            }
            catch (Exception var1_6) {
                // empty catch block
            }
        }
        if (var0 /* !! */  == null) return;
        {
            var0 /* !! */ .release();
            return;
        }
lbl-1000:
        // 1 sources

        {
            var1_4 /* !! */  = new j("ContentProviderClient for documentFile == null");
            throw var1_4 /* !! */ ;
        }
        catch (Exception var1_11) {
            throw var0 /* !! */ ;
        }
    }

    public static String g(Uri uri) {
        return DocumentsContract.getDocumentId((Uri)uri);
    }

    public static String h(Uri uri) {
        return DocumentsContract.getTreeDocumentId((Uri)uri);
    }

    private static Uri i(Uri object, String string) {
        if (DocumentsContract.getTreeDocumentId((Uri)object).equals(DocumentsContract.getDocumentId((Uri)object))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(object.toString());
            stringBuilder.append(string);
            object = stringBuilder.toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("/");
            stringBuilder.append(string);
            string = Uri.encode((String)stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append(object.toString());
            stringBuilder.append(string);
            object = stringBuilder.toString();
        }
        return Uri.parse((String)object);
    }

    private static Uri j(Uri uri, String string) {
        CharSequence charSequence = DocumentsContract.getTreeDocumentId((Uri)uri);
        String string2 = DocumentsContract.getDocumentId((Uri)uri);
        uri = DocumentsContract.buildTreeDocumentUri((String)uri.getAuthority(), (String)charSequence);
        int n8 = Math.max(string2.lastIndexOf("/"), string2.lastIndexOf(":"));
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string2.substring(0, n8 + 1));
        ((StringBuilder)charSequence).append(string);
        return DocumentsContract.buildDocumentUriUsingTree((Uri)uri, (String)((StringBuilder)charSequence).toString());
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static a k(ContentResolver contentResolver, Uri uri) {
        RuntimeException var1_8;
        block15: {
            Object object;
            block17: {
                block16: {
                    block18: {
                        block13: {
                            block14: {
                                object = null;
                                uri = contentResolver.query(uri, l.g, null, null, null);
                                if (uri != null) break block13;
                                contentResolver = uri;
                                try {}
                                catch (IllegalArgumentException illegalArgumentException) {}
                                catch (Exception exception) {}
                                finally {
                                    break block14;
                                }
                                catch (Throwable throwable) {
                                    contentResolver = object;
                                    break block15;
                                }
                                catch (Exception exception) {
                                    uri = null;
                                    break block16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    uri = null;
                                    break block17;
                                }
                            }
                            object = new a(c, null);
                            F.a((AutoCloseable)uri);
                            return object;
                        }
                        contentResolver = uri;
                        {
                            if (!uri.moveToFirst()) break block18;
                            contentResolver = uri;
                            contentResolver = uri;
                            object = new l((Cursor)uri);
                            contentResolver = uri;
                            object = new a(a, (l)object);
                        }
                        F.a((AutoCloseable)uri);
                        return object;
                    }
                    contentResolver = uri;
                    {
                        object = new a(b, null);
                    }
                    F.a((AutoCloseable)uri);
                    return object;
                }
                contentResolver = uri;
                {
                    object = new a(c, null);
                }
                F.a((AutoCloseable)uri);
                return object;
            }
            contentResolver = uri;
            {
                object = new a(b, null);
            }
            F.a((AutoCloseable)uri);
            return object;
        }
        F.a((AutoCloseable)contentResolver);
        throw var1_8;
    }

    public static L l(String string, L l8) throws IOException {
        boolean bl;
        block6: {
            string = Os.stat((String)string);
            bl = true;
            l8.e = true;
            l8.a = ((StructStat)string).st_size;
            if ((((StructStat)string).st_mode & 0xF000) == 16384) break block6;
            bl = false;
        }
        try {
            l8.b = bl;
            l8.c = v.n((StructStat)string);
            l8.d = v.m((StructStat)string);
            return l8;
        }
        catch (ErrnoException errnoException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException(illegalArgumentException);
        }
        if (errnoException.errno == OsConstants.ENOENT) {
            l8.e = false;
            l8.a = 0L;
            l8.b = false;
            l8.c = 0L;
            l8.d = 0L;
            return l8;
        }
        errnoException.printStackTrace();
        throw new IOException(errnoException);
    }

    public static long m(StructStat structStat) {
        if (Q.M1() && u.a(structStat) != null) {
            if (Q.O0()) {
                return s.a(u.a(structStat)) * 1000L + t.a(u.a(structStat)) / 1000000L;
            }
            return structStat.st_atime * 1000L;
        }
        return structStat.st_atime * 1000L;
    }

    public static long n(StructStat structStat) {
        if (Q.M1() && r.a(structStat) != null) {
            if (Q.O0()) {
                return s.a(r.a(structStat)) * 1000L + t.a(r.a(structStat)) / 1000000L;
            }
            return structStat.st_mtime * 1000L;
        }
        return structStat.st_mtime * 1000L;
    }

    public static M o(String object) throws IOException {
        try {
            object = Os.statvfs((String)object);
            object = new M(((StructStatVfs)object).f_bsize, ((StructStatVfs)object).f_blocks, ((StructStatVfs)object).f_bavail, ((StructStatVfs)object).f_bfree);
            return object;
        }
        catch (ErrnoException errnoException) {
            errnoException.printStackTrace();
            throw new IOException(errnoException);
        }
    }

    public static AssetFileDescriptor p(Context context, Uri uri) throws FileNotFoundException {
        return context.getContentResolver().openAssetFileDescriptor(uri, "wt", null);
    }

    public static void q(ValueCallback<Boolean> valueCallback) {
        CookieManager.getInstance().removeAllCookies(valueCallback);
    }

    public static void r(Window window, int n8) {
        window.setNavigationBarColor(n8);
    }

    public static void s(Window window, int n8) {
        window.addFlags(Integer.MIN_VALUE);
        try {
            window.setStatusBarColor(n8);
            return;
        }
        catch (Exception exception) {
            d.c("setStatusBar", exception);
            return;
        }
    }

    public static void t(Context context, Intent intent) {
        int n8 = intent.getFlags();
        context.getContentResolver().takePersistableUriPermission(intent.getData(), n8 & 3);
    }

    public static class a {
        public int a;
        public l b;

        a(int n8, l l8) {
            this.a = n8;
            this.b = l8;
        }
    }
}

