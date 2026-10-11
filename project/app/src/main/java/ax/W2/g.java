/*
 * Decompiled with CFR 0.152.
 */
package ax.W2;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.system.StructStat;
import android.text.TextUtils;
import android.util.Patterns;
import ax.Ha.c;
import ax.X2.Q;
import ax.X2.v;
import ax.c3.d0;
import ax.u3.B;
import ax.u3.b;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class g {
    public String a;
    public byte[] b;
    public Uri c;
    public String d;
    public AssetFileDescriptor e;
    public Long f;
    public String g;

    public g(Uri uri, AssetFileDescriptor assetFileDescriptor, String string, String string2, long l8) {
        this(uri, string, string2);
        this.e = assetFileDescriptor;
        if (l8 != -1L) {
            this.f = l8;
        }
    }

    public g(Uri uri, String string, String string2) {
        this.c = uri;
        this.g = string == null ? "application/octet-stream" : string;
        this.d = string2;
        this.e();
    }

    public g(String string, String string2) {
        this.a = string;
        this.b = string.getBytes(Charset.defaultCharset());
        this.g = "text/plain";
        this.d = string2;
        this.e();
    }

    /*
     * Exception decompiling
     */
    public static void a(Context var0, List<g> var1_8, Uri var2_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [7, 6 : 131->136)] java.lang.RuntimeException
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static List<g> b(Context object, Intent object2, Uri object3) {
        Object object4;
        Object object5;
        int n8 = 0;
        ArrayList<g> arrayList = new ArrayList<g>();
        object5.getAction();
        if ("android.intent.action.SEND".equals(object5.getAction())) {
            if (object5.hasExtra("android.intent.extra.STREAM")) {
                if ((object5 = (Uri)object5.getParcelableExtra("android.intent.extra.STREAM")) == null) return arrayList;
                ax.W2.g.a(object, arrayList, (Uri)object5);
                return arrayList;
            }
            CharSequence charSequence = object5.getCharSequenceExtra("android.intent.extra.TEXT");
            if (charSequence == null) return arrayList;
            if (ax.W2.g.s((String)(charSequence = charSequence.toString()))) {
                String string = ax.W2.g.g((String)charSequence);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(ax.W2.g.r(object, (Intent)object5, object4));
                ((StringBuilder)charSequence).append(".url");
                arrayList.add(new g(string, ((StringBuilder)charSequence).toString()));
                return arrayList;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ax.W2.g.q(object, (Intent)object5, (Uri)object4));
            stringBuilder.append(".txt");
            arrayList.add(new g((String)charSequence, stringBuilder.toString()));
            return arrayList;
        }
        if ("android.intent.action.SEND_MULTIPLE".equals(object5.getAction())) {
            if (object5.hasExtra("android.intent.extra.STREAM")) {
                if ((object5 = object5.getParcelableArrayListExtra("android.intent.extra.STREAM")) == null) return arrayList;
                int n9 = ((ArrayList)object5).size();
                while (n8 < n9) {
                    object4 = ((ArrayList)object5).get(n8);
                    int n10 = n8 + 1;
                    object4 = (Uri)object4;
                    n8 = n10;
                    if (object4 == null) continue;
                    ax.W2.g.a(object, arrayList, object4);
                    n8 = n10;
                }
                return arrayList;
            } else {
                ArrayList arrayList2 = object5.getCharSequenceArrayListExtra("android.intent.extra.TEXT");
                String string = ax.W2.g.q(object, (Intent)object5, (Uri)object4);
                if (arrayList2 == null) return arrayList;
                int n11 = arrayList2.size();
                n8 = 1;
                int n12 = 0;
                while (n12 < n11) {
                    object5 = arrayList2.get(n12);
                    int n13 = n12 + 1;
                    object5 = (CharSequence)object5;
                    n12 = n13;
                    if (object5 == null) continue;
                    object4 = new StringBuilder();
                    ((StringBuilder)object4).append(string);
                    ((StringBuilder)object4).append(String.format(Locale.US, "%02d", n8));
                    ((StringBuilder)object4).append(".txt");
                    object4 = ((StringBuilder)object4).toString();
                    arrayList.add(new g(object5.toString(), (String)object4));
                    ++n8;
                    n12 = n13;
                }
            }
            return arrayList;
        }
        ax.u3.b.g("INVALID ARGUMENT");
        return arrayList;
    }

    private void e() {
        if (TextUtils.isEmpty((CharSequence)this.d)) {
            this.d = "unknown_shared_file";
            ax.Ha.b b8 = ax.Ha.c.h().b("Save filename empty").j();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.c.toString());
            stringBuilder.append(" , ");
            stringBuilder.append(this.g);
            b8.g(stringBuilder.toString()).h();
        }
    }

    private static String g(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[InternetShortcut]\r\nURL=");
        stringBuilder.append(string);
        stringBuilder.append("\r\n");
        return stringBuilder.toString();
    }

    private static String j(Context object, Intent object2, Uri uri, String string, String string2) {
        if ((object2 = object2.getCharSequenceExtra("android.intent.extra.SUBJECT")) != null) {
            return d0.y(object2.toString());
        }
        if (uri != null && !TextUtils.isEmpty((CharSequence)(object = ax.W2.g.o(object, uri)))) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(string2);
            return ((StringBuilder)object2).toString();
        }
        return string;
    }

    private static String o(Context context, Uri object) {
        block7: {
            block6: {
                String string;
                block5: {
                    string = object.getScheme();
                    if (!"android-app".equals(string)) break block5;
                    if (!TextUtils.isEmpty((CharSequence)(object = object.getHost())) && (object = B.w(context, (String)object)) != null && (object = object.applicationInfo) != null) {
                        return object.loadLabel(context.getPackageManager()).toString();
                    }
                    break block6;
                }
                if ("http".equals(string) || "https".equals(string)) break block7;
            }
            return null;
        }
        return object.getHost();
    }

    private static String q(Context context, Intent intent, Uri uri) {
        return ax.W2.g.j(context, intent, uri, "shared_text", " shared text");
    }

    private static String r(Context context, Intent intent, Uri uri) {
        return ax.W2.g.j(context, intent, uri, "shared_link", " shared link");
    }

    private static boolean s(String string) {
        if (!string.startsWith("http:") && !string.startsWith("https:")) {
            return false;
        }
        try {
            boolean bl = Patterns.WEB_URL.matcher(string).matches();
            return bl;
        }
        catch (RuntimeException runtimeException) {
            return false;
        }
    }

    boolean c() {
        return this.b != null;
    }

    boolean d() {
        AssetFileDescriptor assetFileDescriptor = this.e;
        return assetFileDescriptor != null && assetFileDescriptor.getDeclaredLength() < 0L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void f() {
        AssetFileDescriptor assetFileDescriptor = this.e;
        if (assetFileDescriptor == null) return;
        try {
            assetFileDescriptor.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    String h() {
        return this.d;
    }

    long i() {
        Long l8 = this.f;
        if (l8 != null) {
            return l8;
        }
        this.f = this.c != null ? ((l8 = this.e) != null ? Long.valueOf(l8.getLength()) : Long.valueOf(-1L)) : Long.valueOf(this.b.length);
        return this.f;
    }

    InputStream k(Context context) throws IOException {
        if (this.e != null) {
            return new AssetFileDescriptor.AutoCloseInputStream(this.e);
        }
        if (this.c == null) {
            return new ByteArrayInputStream(this.b);
        }
        throw new IOException("no asset file descriptor");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    Long l() {
        if (!Q.P1()) return null;
        AssetFileDescriptor assetFileDescriptor = this.e;
        if (assetFileDescriptor == null) return null;
        try {
            assetFileDescriptor = Os.fstat((FileDescriptor)assetFileDescriptor.getParcelFileDescriptor().getFileDescriptor());
            if (assetFileDescriptor == null) return null;
            if (assetFileDescriptor.st_size == 0L) return null;
            long l8 = v.n((StructStat)assetFileDescriptor);
            if (l8 <= 0L) return null;
            return l8;
        }
        catch (Exception exception) {
            return null;
        }
    }

    String m() {
        return this.g;
    }

    ParcelFileDescriptor n() {
        if (this.d()) {
            return this.e.getParcelFileDescriptor();
        }
        return null;
    }

    String p() {
        Uri uri = this.c;
        if (uri != null) {
            return uri.getPath();
        }
        return this.d;
    }
}

