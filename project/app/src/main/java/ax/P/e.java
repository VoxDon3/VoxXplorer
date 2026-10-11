/*
 * Decompiled with CFR 0.152.
 */
package ax.P;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

public class e {
    private static final Object a = new Object();

    /*
     * Exception decompiling
     */
    public static void a(Context var0, String var1_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [2 : 29->41)] java.lang.Throwable
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String b(Context var0) {
        var6_4 = e.a;
        synchronized (var6_4) {
            var4_5 = "";
            try {
                var7_7 = var0.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            }
            catch (Throwable var0_2) {
                ** GOTO lbl53
            }
lbl-1000:
            // 3 sources

            {
                while (true) {
                    if (!var5_8.isEmpty()) return var5_8;
                    var0.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    return var5_8;
                }
                catch (FileNotFoundException var0_3) {
                    return "";
                }
                var5_8 = Xml.newPullParser();
                var5_8.setInput((InputStream)var7_7, "UTF-8");
                var1_9 = var5_8.getDepth();
                while (true) {
                    var2_10 = var5_8.next();
                    var3_11 = var4_5;
                    if (var2_10 != 1) {
                        if (var2_10 != 3) continue;
                        var3_11 = var4_5;
                        if (var5_8.getDepth() > var1_9) {
                            continue;
                        }
                    }
                    ** GOTO lbl33
                    break;
                }
                {
                    catch (Throwable var0_1) {
                    }
                    if (var2_10 == 3 || var2_10 == 4 || !var5_8.getName().equals("locales")) ** continue;
                    var3_11 = var5_8.getAttributeValue(null, "application_locales");
lbl33:
                    // 2 sources

                    var5_8 = var3_11;
                    if (var7_7 == null) ** GOTO lbl-1000
lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var7_7.close();
                            var5_8 = var3_11;
                            ** GOTO lbl-1000
                            break;
                        }
                    }
                    catch (IOException | XmlPullParserException var3_12) {}
                    {
                        Log.w((String)"AppLocalesStorageHelper", (String)"Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        var5_8 = var4_5;
                        if (var7_7 != null) ** break;
                        ** continue;
                        var3_11 = var4_5;
                        ** continue;
                    }
                }
                if (var7_7 == null) throw var0_1;
                try {
                    var7_7.close();
                    throw var0_1;
                }
                catch (IOException var3_13) {
                    throw var0_1;
                }
lbl53:
                // 1 sources

                throw var0_2;
            }
        }
    }
}

