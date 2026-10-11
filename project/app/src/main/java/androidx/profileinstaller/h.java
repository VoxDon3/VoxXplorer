/*
 * Decompiled with CFR 0.152.
 */
package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import ax.D.d;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class h {
    private static final d<c> a = d.G();
    private static final Object b = new Object();
    private static c c = null;

    private static long a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return androidx.profileinstaller.h$a.a((PackageManager)packageManager, (Context)context).lastUpdateTime;
        }
        return packageManager.getPackageInfo((String)context.getPackageName(), (int)0).lastUpdateTime;
    }

    private static c b(int n8, boolean bl, boolean bl2, boolean bl3) {
        c c8;
        c = c8 = new c(n8, bl, bl2, bl3);
        a.C(c8);
        return c;
    }

    /*
     * Exception decompiling
     */
    static c c(Context var0, boolean var1_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [3, 2 : 51->62)] java.lang.Throwable
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

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of((long)0L));
        }
    }

    static class b {
        final int a;
        final int b;
        final long c;
        final long d;

        b(int n8, int n9, long l8, long l9) {
            this.a = n8;
            this.b = n9;
            this.c = l8;
            this.d = l9;
        }

        static b a(File object) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream((File)object));
            try {
                object = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                return object;
            }
            finally {
                ((InputStream)dataInputStream).close();
            }
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.a);
                dataOutputStream.writeInt(this.b);
                dataOutputStream.writeLong(this.c);
                dataOutputStream.writeLong(this.d);
                return;
            }
            finally {
                ((OutputStream)dataOutputStream).close();
            }
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && object instanceof b) {
                object = (b)object;
                if (this.b == ((b)object).b && this.c == ((b)object).c && this.a == ((b)object).a && this.d == ((b)object).d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return j.Objects.hash((Object[])new Object[]{this.b, this.c, this.a, this.d});
        }
    }

    public static class c {
        final int a;
        private final boolean b;
        private final boolean c;
        private final boolean d;

        c(int n8, boolean bl, boolean bl2, boolean bl3) {
            this.a = n8;
            this.c = bl2;
            this.b = bl;
            this.d = bl3;
        }
    }
}

