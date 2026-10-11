/*
 * Decompiled with CFR 0.152.
 */
package ax.T;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import ax.T.l;
import ax.Z.k;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;

public class m {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static ByteBuffer b(Context object, Resources object2, int n8) {
        block5: {
            if ((object = m.e((Context)object)) == null) {
                return null;
            }
            boolean bl = m.c((File)object, object2, n8);
            if (bl) break block5;
            ((File)object).delete();
            return null;
        }
        try {
            object2 = m.g((File)object);
            return object2;
        }
        finally {
            ((File)object).delete();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean c(File object, Resources resources, int n8) {
        RuntimeException var1_4;
        block4: {
            boolean bl;
            InputStream inputStream;
            try {
                inputStream = resources.openRawResource(n8);
            }
            catch (Throwable throwable) {
                object = null;
                break block4;
            }
            try {
                bl = m.d((File)object, inputStream);
            }
            catch (Throwable throwable) {
                object = inputStream;
                break block4;
            }
            m.a(inputStream);
            return bl;
        }
        m.a((Closeable)object);
        throw var1_4;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean d(File object, InputStream inputStream) {
        RuntimeException var0_3;
        Object object2;
        StrictMode.ThreadPolicy threadPolicy;
        block8: {
            Object object3;
            block9: {
                threadPolicy = StrictMode.allowThreadDiskWrites();
                Object var5_9 = null;
                File file = null;
                object2 = file;
                try {
                    object2 = file;
                    object3 = new FileOutputStream((File)object, false);
                }
                catch (Throwable throwable) {
                    break block8;
                }
                catch (IOException iOException) {
                    object = var5_9;
                    break block9;
                }
                try {
                    int n8;
                    object = new byte[1024];
                    while ((n8 = inputStream.read((byte[])object)) != -1) {
                        ((FileOutputStream)object3).write((byte[])object, 0, n8);
                    }
                }
                catch (Throwable throwable) {
                    object2 = object3;
                    break block8;
                }
                catch (IOException iOException) {
                    object = object3;
                    break block9;
                }
                m.a((Closeable)object3);
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                return true;
            }
            object2 = object;
            {
                RuntimeException var1_7;
                object2 = object;
                object3 = new StringBuilder();
                object2 = object;
                ((StringBuilder)object3).append("Error copying resource contents to temp file: ");
                object2 = object;
                ((StringBuilder)object3).append(var1_7.getMessage());
                object2 = object;
                Log.e((String)"TypefaceCompatUtil", (String)((StringBuilder)object3).toString());
            }
            m.a((Closeable)object);
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            return false;
        }
        m.a(object2);
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        throw var0_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static File e(Context object) {
        File file = object.getCacheDir();
        if (file == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(".font");
        stringBuilder.append(Process.myPid());
        stringBuilder.append("-");
        stringBuilder.append(Process.myTid());
        stringBuilder.append("-");
        String string = stringBuilder.toString();
        int n8 = 0;
        while (n8 < 100) {
            Comparable<StringBuilder> comparable = new StringBuilder();
            ((StringBuilder)comparable).append(string);
            ((StringBuilder)comparable).append(n8);
            comparable = new File(file, ((StringBuilder)comparable).toString());
            try {
                boolean bl = ((File)comparable).createNewFile();
                if (bl) {
                    return comparable;
                }
            }
            catch (IOException iOException) {}
            ++n8;
        }
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ByteBuffer f(Context context, CancellationSignal object, Uri object2) {
        Throwable throwable422222;
        block14: {
            context = context.getContentResolver();
            context = context.openFileDescriptor((Uri)object2, "r", (CancellationSignal)object);
            if (context != null) break block14;
            if (context == null) return null;
            context.close();
            return null;
            {
                catch (IOException iOException) {
                    return null;
                }
            }
        }
        object = new FileInputStream(context.getFileDescriptor());
        object2 = l.a((FileInputStream)object);
        long l8 = ((FileChannel)object2).size();
        object2 = ((FileChannel)object2).map(FileChannel.MapMode.READ_ONLY, 0L, l8);
        ((FileInputStream)object).close();
        context.close();
        return object2;
        catch (Throwable throwable2) {
            try {
                ((FileInputStream)object).close();
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
            context.close();
            throw throwable422222;
        }
        catch (Throwable throwable5) {
            throwable422222.addSuppressed(throwable5);
            throw throwable422222;
        }
    }

    /*
     * Exception decompiling
     */
    private static ByteBuffer g(File var0) {
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

    public static Map<Uri, ByteBuffer> h(Context context, k.b[] bArray, CancellationSignal cancellationSignal) {
        HashMap<k.b, ByteBuffer> hashMap = new HashMap<k.b, ByteBuffer>();
        for (k.b b8 : bArray) {
            if (b8.b() != 0 || hashMap.containsKey(b8 = b8.d())) continue;
            hashMap.put(b8, m.f(context, cancellationSignal, (Uri)b8));
        }
        return java.util.DesugarCollections.unmodifiableMap(hashMap);
    }
}

