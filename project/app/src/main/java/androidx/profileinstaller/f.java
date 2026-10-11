/*
 * Decompiled with CFR 0.152.
 */
package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.profileinstaller.b;
import androidx.profileinstaller.h;
import ax.f2.m;
import ax.g2.d;
import java.io.File;
import java.util.concurrent.Executor;

public class f {
    private static final c a = new c(){

        @Override
        public void a(int n8, Object object) {
        }

        @Override
        public void b(int n8, Object object) {
        }
    };
    static final c b = new c(){

        @Override
        public void a(int n8, Object object) {
            object = n8 != 1 ? (n8 != 2 ? (n8 != 3 ? (n8 != 4 ? (n8 != 5 ? "" : "DIAGNOSTIC_PROFILE_IS_COMPRESSED") : "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST") : "DIAGNOSTIC_REF_PROFILE_EXISTS") : "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST") : "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
            Log.d((String)"ProfileInstaller", (String)object);
        }

        @Override
        public void b(int n8, Object object) {
            String string;
            switch (n8) {
                default: {
                    string = "";
                    break;
                }
                case 11: {
                    string = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
                }
                case 10: {
                    string = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                }
                case 8: {
                    string = "RESULT_PARSE_EXCEPTION";
                    break;
                }
                case 7: {
                    string = "RESULT_IO_EXCEPTION";
                    break;
                }
                case 6: {
                    string = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                }
                case 5: {
                    string = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                }
                case 4: {
                    string = "RESULT_NOT_WRITABLE";
                    break;
                }
                case 3: {
                    string = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                }
                case 2: {
                    string = "RESULT_ALREADY_INSTALLED";
                    break;
                }
                case 1: {
                    string = "RESULT_INSTALL_SUCCESS";
                }
            }
            if (n8 != 6 && n8 != 7 && n8 != 8) {
                Log.d((String)"ProfileInstaller", (String)string);
                return;
            }
            Log.e((String)"ProfileInstaller", (String)string, (Throwable)((Throwable)object));
        }
    };

    public static /* synthetic */ void a(c c8, int n8, Object object) {
        c8.b(n8, object);
    }

    static boolean b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    static void c(Context context, Executor executor, c c8) {
        f.b(context.getFilesDir());
        f.f(executor, c8, 11, null);
    }

    /*
     * Exception decompiling
     */
    static boolean d(PackageInfo var0, File var1_3, c var2_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    /*
     * Exception decompiling
     */
    static void e(PackageInfo var0, File var1_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    static void f(Executor executor, c c8, int n8, Object object) {
        executor.execute(new d(c8, n8, object));
    }

    private static boolean g(AssetManager object, String string, PackageInfo packageInfo, File file, String string2, Executor executor, c c8) {
        if (!((b)(object = new b((AssetManager)object, executor, c8, string2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", string), "primary.prof")))).e()) {
            return false;
        }
        boolean bl = ((b)object).h().l().m();
        if (bl) {
            f.e(packageInfo, file);
        }
        return bl;
    }

    public static void h(Context context) {
        f.i(context, new m(), a);
    }

    public static void i(Context context, Executor executor, c c8) {
        f.j(context, executor, c8, false);
    }

    static void j(Context context, Executor object, c c8, boolean bl) {
        PackageInfo packageInfo;
        Context context2 = context.getApplicationContext();
        String string = context2.getPackageName();
        Object object2 = context2.getApplicationInfo();
        context2 = context2.getAssets();
        object2 = new File(object2.sourceDir).getName();
        Object object3 = context.getPackageManager();
        boolean bl2 = false;
        try {
            packageInfo = object3.getPackageInfo(string, 0);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            c8.b(7, (Object)nameNotFoundException);
            h.c(context, false);
            return;
        }
        object3 = context.getFilesDir();
        if (!bl && f.d(packageInfo, (File)object3, c8)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Skipping profile installation for ");
            ((StringBuilder)object).append(context.getPackageName());
            Log.d((String)"ProfileInstaller", (String)((StringBuilder)object).toString());
            h.c(context, false);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Installing profile for ");
        stringBuilder.append(context.getPackageName());
        Log.d((String)"ProfileInstaller", (String)stringBuilder.toString());
        boolean bl3 = bl2;
        if (f.g((AssetManager)context2, string, packageInfo, (File)object3, (String)object2, (Executor)object, c8)) {
            bl3 = bl2;
            if (bl) {
                bl3 = true;
            }
        }
        h.c(context, bl3);
    }

    static void k(Context context, Executor executor, c c8) {
        String string = context.getApplicationContext().getPackageName();
        PackageManager packageManager = context.getPackageManager();
        try {
            packageManager = packageManager.getPackageInfo(string, 0);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            f.f(executor, c8, 7, (Object)nameNotFoundException);
            return;
        }
        f.e((PackageInfo)packageManager, context.getFilesDir());
        f.f(executor, c8, 10, null);
    }

    public static interface c {
        public void a(int var1, Object var2);

        public void b(int var1, Object var2);
    }
}

