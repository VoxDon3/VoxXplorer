/*
 * Decompiled with CFR 0.152.
 */
package ax.P2;

import android.content.Context;
import android.os.Build;
import ax.P2.b;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class a {
    private static final Logger a = Logger.getLogger("FileManager.FfmpegExtensionLoader");

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean a(String object) {
        ZipInputStream zipInputStream;
        block19: {
            RuntimeException var0_5;
            block18: {
                StringBuilder stringBuilder;
                Object var5_11;
                HashSet<Object> hashSet;
                List<String> list;
                block17: {
                    list = ax.P2.a.l();
                    hashSet = new HashSet<Object>();
                    var5_11 = null;
                    stringBuilder = null;
                    FileInputStream fileInputStream = new FileInputStream((String)object);
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                    zipInputStream = new ZipInputStream(bufferedInputStream);
                    object = zipInputStream.getNextEntry();
                    while (object != null) {
                        if (list.contains(object = ((ZipEntry)object).getName())) {
                            hashSet.add(object);
                        }
                        object = zipInputStream.getNextEntry();
                    }
                    zipInputStream.closeEntry();
                    zipInputStream.close();
                    int n8 = hashSet.size();
                    int n9 = list.size();
                    if (n8 != n9) break block17;
                    try {
                        zipInputStream.close();
                        return true;
                    }
                    catch (IOException iOException) {
                        return true;
                    }
                }
                try {
                    object = a;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("custom codec file is not valid :");
                    stringBuilder.append(hashSet.size());
                    stringBuilder.append(" != ");
                    stringBuilder.append(list.size());
                    ((Logger)object).severe(stringBuilder.toString());
                }
                catch (Throwable throwable) {
                    break block18;
                }
                catch (IOException iOException) {
                    break block19;
                }
                try {
                    zipInputStream.close();
                    return false;
                }
                catch (IOException iOException) {
                    return false;
                }
                catch (Throwable throwable) {
                    zipInputStream = stringBuilder;
                }
                catch (IOException iOException) {
                    zipInputStream = var5_11;
                    break block19;
                }
            }
            if (zipInputStream == null) throw var0_5;
            try {
                zipInputStream.close();
            }
            catch (IOException iOException) {
                throw var0_5;
            }
            throw var0_5;
        }
        if (zipInputStream == null) return false;
        try {
            zipInputStream.close();
            return false;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public static void b() {
        b.k(false);
    }

    public static int c(Context context) {
        if (b.g()) {
            return b.a();
        }
        if (ax.P2.a.k() == null) {
            return 0;
        }
        if (ax.P2.a.e(context).exists()) {
            return 3;
        }
        if (ax.P2.a.g(context).exists()) {
            return 2;
        }
        if (ax.P2.a.f(context).exists()) {
            return 1;
        }
        return 0;
    }

    private static File d(Context context, String string, String string2) {
        return new File(new File(ax.P2.a.j(context), string), string2);
    }

    public static File e(Context context) {
        return new File(ax.P2.a.j(context), "libffmpeg.exo-v3.so");
    }

    private static File f(Context context) {
        return new File(ax.P2.a.j(context), "libffmpeg.exo-v1.so");
    }

    private static File g(Context context) {
        return new File(ax.P2.a.j(context), "libffmpeg.exo-v2.so");
    }

    private static File h(Context object) {
        if (!((File)(object = new File(object.getFilesDir(), "libs"))).exists()) {
            ((File)object).mkdirs();
        }
        return object;
    }

    private static File i(Context context, String string, String string2) {
        return new File(new File(ax.P2.a.h(context), string), string2);
    }

    private static File j(Context object) {
        if (!((File)(object = new File(object.getFilesDir(), "codec"))).exists()) {
            ((File)object).mkdirs();
        }
        return object;
    }

    public static String k() {
        for (String string : Build.SUPPORTED_ABIS) {
            if (!ax.P2.a.u(string)) continue;
            return string;
        }
        return null;
    }

    private static List<String> l() {
        return Arrays.asList("arm64-v8a/libavcodec.so", "arm64-v8a/libavresample.so", "arm64-v8a/libavutil.so", "armeabi-v7a/libavcodec.so", "armeabi-v7a/libavresample.so", "armeabi-v7a/libavutil.so", "x86/libavcodec.so", "x86/libavresample.so", "x86/libavutil.so", "x86_64/libavcodec.so", "x86_64/libavresample.so", "x86_64/libavutil.so");
    }

    public static boolean m(Context context) {
        File file;
        String string;
        block6: {
            if (b.f()) {
                return true;
            }
            string = ax.P2.a.k();
            if (string == null) {
                return false;
            }
            file = ax.P2.a.i(context, string, "libex.ffmpeg.exo.so");
            if (!file.exists() && !ax.P2.a.p(context, string)) {
                return false;
            }
            try {
                if (ax.P2.a.r(context)) break block6;
                return false;
            }
            catch (Error error) {
                error.printStackTrace();
                a.severe("custom codec load error");
                return false;
            }
        }
        System.load(ax.P2.a.d(context, string, "libavutil.so").getAbsolutePath());
        System.load(ax.P2.a.d(context, string, "libavresample.so").getAbsolutePath());
        System.load(ax.P2.a.d(context, string, "libavcodec.so").getAbsolutePath());
        System.load(file.getAbsolutePath());
        b.k(true);
        a.fine("custom codec loaded");
        return true;
    }

    public static boolean n(Context context) {
        if (b.g()) {
            return true;
        }
        String string = ax.P2.a.k();
        if (string == null) {
            return false;
        }
        File file = ax.P2.a.e(context);
        if (file.exists() && ax.P2.a.v(file, 3)) {
            return true;
        }
        file = ax.P2.a.g(context);
        if (file.exists() && ax.P2.a.v(file, 2)) {
            return true;
        }
        return ax.P2.a.w(context, string);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean o(Context object, String string) {
        RuntimeException var1_9;
        Object object2;
        block16: {
            block17: {
                boolean bl;
                block19: {
                    block18: {
                        File file;
                        Context context;
                        String string2 = ax.P2.a.k();
                        if (string2 == null) {
                            return false;
                        }
                        if (!ax.P2.a.t((Context)object, string2) && !ax.P2.a.p((Context)object, string2)) {
                            return false;
                        }
                        Object var4_11 = null;
                        object2 = context = null;
                        try {
                            if (!ax.P2.a.a(string)) {
                                return false;
                            }
                            object2 = context;
                            file = ax.P2.a.j((Context)object);
                            object2 = context;
                            object2 = context;
                            object = new FileInputStream(string);
                        }
                        catch (Throwable throwable) {
                            break block16;
                        }
                        catch (Exception exception) {
                            object = var4_11;
                            break block17;
                        }
                        try {
                            bl = ax.P2.a.x((InputStream)object, file.getAbsolutePath(), string2);
                            if (!bl) break block18;
                            a.fine("custom codec installed");
                            break block19;
                        }
                        catch (Throwable throwable) {
                            object2 = object;
                            break block16;
                        }
                        catch (Exception exception) {
                            break block17;
                        }
                    }
                    a.fine("custom codec not installed");
                }
                try {
                    ((InputStream)object).close();
                    return bl;
                }
                catch (IOException iOException) {
                    return bl;
                }
            }
            object2 = object;
            {
                a.fine("custom codec not installed");
                object2 = object;
                ((Throwable)((Object)string)).printStackTrace();
                if (object == null) return false;
            }
            try {
                ((InputStream)object).close();
                return false;
            }
            catch (IOException iOException) {
                return false;
            }
        }
        if (object2 == null) throw var1_9;
        try {}
        catch (IOException iOException) {
            throw var1_9;
        }
        object2.close();
        throw var1_9;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean p(Context context, String string) {
        Throwable throwable222222;
        InputStream inputStream;
        InputStream inputStream2 = null;
        InputStream inputStream3 = null;
        inputStream3 = inputStream = context.getAssets().open("exolibs.zip");
        inputStream2 = inputStream;
        boolean bl = ax.P2.a.x(inputStream, ax.P2.a.h(context).getAbsolutePath(), string);
        if (inputStream == null) return bl;
        try {
            inputStream.close();
            return bl;
        }
        catch (IOException iOException) {
            return bl;
        }
        {
            block10: {
                catch (Throwable throwable222222) {
                    break block10;
                }
                catch (Exception exception) {}
                inputStream3 = inputStream2;
                {
                    exception.printStackTrace();
                    if (inputStream2 == null) return false;
                }
                inputStream2.close();
                return false;
            }
            if (inputStream3 == null) throw throwable222222;
            inputStream3.close();
        }
        catch (IOException iOException) {
            throw throwable222222;
        }
        {
            throw throwable222222;
            catch (IOException iOException) {
                return false;
            }
        }
    }

    public static boolean q(String string) {
        return b.d(string);
    }

    public static boolean r(Context context) {
        String string = ax.P2.a.k();
        if (string == null) {
            return false;
        }
        if (!ax.P2.a.d(context, string, "libavutil.so").exists()) {
            return false;
        }
        if (!ax.P2.a.d(context, string, "libavresample.so").exists()) {
            return false;
        }
        return ax.P2.a.d(context, string, "libavcodec.so").exists();
    }

    public static boolean s(Context context) {
        return ax.P2.a.e(context).exists();
    }

    public static boolean t(Context context, String string) {
        if (!ax.P2.a.i(context, string, "libfm.ffmpeg.exo.so").exists()) {
            return false;
        }
        return ax.P2.a.i(context, string, "libex.ffmpeg.exo.so").exists();
    }

    private static boolean u(String string) {
        return "armeabi-v7a".equals(string) || "x86".equals(string) || "arm64-v8a".equals(string) || "x86_64".equals(string);
        {
        }
    }

    private static boolean v(File object, int n8) {
        try {
            System.load(((File)object).getAbsolutePath());
            b.l(true);
            b.m(n8);
            object = a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("default external codec v");
            stringBuilder.append(n8);
            stringBuilder.append(" loaded");
            ((Logger)object).fine(stringBuilder.toString());
            return true;
        }
        catch (Error error) {
            error.printStackTrace();
            a.severe("default external codec load error");
            return false;
        }
    }

    private static boolean w(Context context, String string) {
        File file = ax.P2.a.f(context);
        if (file.exists()) {
            File file2 = ax.P2.a.i(context, string, "libfm.ffmpeg.exo.so");
            if (!file2.exists() && !ax.P2.a.p(context, string)) {
                return false;
            }
            try {
                System.load(file.getAbsolutePath());
                System.load(file2.getAbsolutePath());
                b.l(true);
                b.m(1);
                a.fine("default external codec v1 loaded");
                return true;
            }
            catch (Error error) {
                error.printStackTrace();
                a.severe("default external codec load error");
            }
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    private static boolean x(InputStream var0, String var1_7, String var2_11) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 18[TRYBLOCK] [37, 36 : 366->374)] java.lang.Throwable
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
}

