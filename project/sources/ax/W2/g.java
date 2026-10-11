package ax.W2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.system.StructStat;
import android.text.TextUtils;
import android.util.Patterns;
import ax.X2.Q;
import ax.c3.d0;
import ax.u3.C3180B;
import ax.u3.C3184b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class g {
    public String a;
    public byte[] b;
    public Uri c;
    public String d;
    public AssetFileDescriptor e;
    public Long f;
    public String g;

    public g(String str, String str2) {
        this.a = str;
        this.b = str.getBytes(Charset.defaultCharset());
        this.g = "text/plain";
        this.d = str2;
        e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[Catch: RuntimeException -> 0x0042, FileNotFoundException -> 0x00f1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {FileNotFoundException -> 0x00f1, blocks: (B:8:0x0016, B:12:0x0029, B:19:0x0080, B:24:0x0087, B:26:0x008a, B:31:0x0097, B:40:0x0047, B:42:0x0055), top: B:7:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087 A[Catch: RuntimeException -> 0x0094, FileNotFoundException -> 0x00f1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {FileNotFoundException -> 0x00f1, blocks: (B:8:0x0016, B:12:0x0029, B:19:0x0080, B:24:0x0087, B:26:0x008a, B:31:0x0097, B:40:0x0047, B:42:0x0055), top: B:7:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[Catch: RuntimeException -> 0x0091, FileNotFoundException -> 0x00f1, TRY_LEAVE, TryCatch #0 {FileNotFoundException -> 0x00f1, blocks: (B:8:0x0016, B:12:0x0029, B:19:0x0080, B:24:0x0087, B:26:0x008a, B:31:0x0097, B:40:0x0047, B:42:0x0055), top: B:7:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r9, java.util.List<ax.W2.g> r10, android.net.Uri r11) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.W2.g.a(android.content.Context, java.util.List, android.net.Uri):void");
    }

    public static List<g> b(Context context, Intent intent, Uri uri) {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        intent.getAction();
        if ("android.intent.action.SEND".equals(intent.getAction())) {
            if (intent.hasExtra("android.intent.extra.STREAM")) {
                Uri uri2 = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
                if (uri2 != null) {
                    a(context, arrayList, uri2);
                    return arrayList;
                }
            } else {
                CharSequence charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.TEXT");
                if (charSequenceExtra != null) {
                    String charSequence = charSequenceExtra.toString();
                    if (!s(charSequence)) {
                        arrayList.add(new g(charSequence, q(context, intent, uri) + ".txt"));
                        return arrayList;
                    }
                    arrayList.add(new g(g(charSequence), r(context, intent, uri) + ".url"));
                    return arrayList;
                }
            }
        } else {
            if (!"android.intent.action.SEND_MULTIPLE".equals(intent.getAction())) {
                C3184b.g("INVALID ARGUMENT");
                return arrayList;
            }
            if (intent.hasExtra("android.intent.extra.STREAM")) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                if (parcelableArrayListExtra != null) {
                    int size = parcelableArrayListExtra.size();
                    while (i < size) {
                        Object obj = parcelableArrayListExtra.get(i);
                        i++;
                        Uri uri3 = (Uri) obj;
                        if (uri3 != null) {
                            a(context, arrayList, uri3);
                        }
                    }
                }
            } else {
                ArrayList<CharSequence> charSequenceArrayListExtra = intent.getCharSequenceArrayListExtra("android.intent.extra.TEXT");
                String q = q(context, intent, uri);
                if (charSequenceArrayListExtra != null) {
                    int size2 = charSequenceArrayListExtra.size();
                    int i2 = 1;
                    int i3 = 0;
                    while (i3 < size2) {
                        CharSequence charSequence2 = charSequenceArrayListExtra.get(i3);
                        i3++;
                        CharSequence charSequence3 = charSequence2;
                        if (charSequence3 != null) {
                            arrayList.add(new g(charSequence3.toString(), q + String.format(Locale.US, "%02d", Integer.valueOf(i2)) + ".txt"));
                            i2++;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private void e() {
        if (TextUtils.isEmpty(this.d)) {
            this.d = "unknown_shared_file";
            ax.Ha.c.h().b("Save filename empty").j().g(this.c.toString() + " , " + this.g).h();
        }
    }

    private static String g(String str) {
        return "[InternetShortcut]\r\nURL=" + str + "\r\n";
    }

    private static String j(Context context, Intent intent, Uri uri, String str, String str2) {
        CharSequence charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.SUBJECT");
        if (charSequenceExtra != null) {
            return d0.y(charSequenceExtra.toString());
        }
        if (uri != null) {
            String o = o(context, uri);
            if (!TextUtils.isEmpty(o)) {
                return o + str2;
            }
        }
        return str;
    }

    private static String o(Context context, Uri uri) {
        PackageInfo w;
        ApplicationInfo applicationInfo;
        String scheme = uri.getScheme();
        if (!"android-app".equals(scheme)) {
            if ("http".equals(scheme) || "https".equals(scheme)) {
                return uri.getHost();
            }
            return null;
        }
        String host = uri.getHost();
        if (TextUtils.isEmpty(host) || (w = C3180B.w(context, host)) == null || (applicationInfo = w.applicationInfo) == null) {
            return null;
        }
        return applicationInfo.loadLabel(context.getPackageManager()).toString();
    }

    private static String q(Context context, Intent intent, Uri uri) {
        return j(context, intent, uri, "shared_text", " shared text");
    }

    private static String r(Context context, Intent intent, Uri uri) {
        return j(context, intent, uri, "shared_link", " shared link");
    }

    private static boolean s(String str) {
        if (!str.startsWith("http:") && !str.startsWith("https:")) {
            return false;
        }
        try {
            return Patterns.WEB_URL.matcher(str).matches();
        } catch (RuntimeException unused) {
            return false;
        }
    }

    boolean c() {
        return this.b != null;
    }

    boolean d() {
        AssetFileDescriptor assetFileDescriptor = this.e;
        return assetFileDescriptor != null && assetFileDescriptor.getDeclaredLength() < 0;
    }

    void f() {
        AssetFileDescriptor assetFileDescriptor = this.e;
        if (assetFileDescriptor != null) {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    String h() {
        return this.d;
    }

    long i() {
        Long l = this.f;
        if (l != null) {
            return l.longValue();
        }
        if (this.c != null) {
            AssetFileDescriptor assetFileDescriptor = this.e;
            if (assetFileDescriptor != null) {
                this.f = Long.valueOf(assetFileDescriptor.getLength());
            } else {
                this.f = -1L;
            }
        } else {
            this.f = Long.valueOf(this.b.length);
        }
        return this.f.longValue();
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

    Long l() {
        AssetFileDescriptor assetFileDescriptor;
        if (!Q.P1() || (assetFileDescriptor = this.e) == null) {
            return null;
        }
        try {
            StructStat fstat = Os.fstat(assetFileDescriptor.getParcelFileDescriptor().getFileDescriptor());
            if (fstat == null || fstat.st_size == 0) {
                return null;
            }
            long n = ax.X2.v.n(fstat);
            if (n > 0) {
                return Long.valueOf(n);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    String m() {
        return this.g;
    }

    ParcelFileDescriptor n() {
        if (d()) {
            return this.e.getParcelFileDescriptor();
        }
        return null;
    }

    String p() {
        Uri uri = this.c;
        return uri != null ? uri.getPath() : this.d;
    }

    public g(Uri uri, String str, String str2) {
        this.c = uri;
        if (str == null) {
            this.g = "application/octet-stream";
        } else {
            this.g = str;
        }
        this.d = str2;
        e();
    }

    public g(Uri uri, AssetFileDescriptor assetFileDescriptor, String str, String str2, long j) {
        this(uri, str, str2);
        this.e = assetFileDescriptor;
        if (j != -1) {
            this.f = Long.valueOf(j);
        }
    }
}
