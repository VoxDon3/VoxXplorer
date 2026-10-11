package ax.Q2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import ax.W2.h;
import ax.c3.EnumC1837z;
import ax.v3.C3272a;
import com.voxdon.xplorer.file.AbstractC3595n;
import java.util.List;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class a {
    private static final Logger c = ax.Q2.g.a(a.class);
    private static a d;
    private Context a;
    private C3272a b;

    /* renamed from: ax.Q2.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0175a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.b.values().length];
            a = iArr;
            try {
                iArr[h.b.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h.b.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h.b.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[h.b.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class c {
        public static String a(h.b bVar) {
            int i = C0175a.a[bVar.ordinal()];
            return i != 2 ? i != 3 ? i != 4 ? "undefined" : "cancelled" : "failure" : "success";
        }
    }

    public class d {
        String a;
        boolean b;
        Bundle c = new Bundle();

        d(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public d a(String str, long j) {
            this.c.putLong(str, j);
            return this;
        }

        public d b(String str, String str2) {
            this.c.putString(str, str2);
            return this;
        }

        public void c() {
            if (!ax.Q2.c.a() && ax.t3.j.n(a.this.a) && this.b && a.this.b != null) {
                try {
                    a.this.b.c(this.a, this.c);
                } catch (Exception unused) {
                    a.c.severe("ERROR SEND APP EVENT");
                }
            }
        }
    }

    public static class e {
        public static String a(List<AbstractC3595n> list) {
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            char c = 0;
            for (int i = 0; i < list.size(); i++) {
                AbstractC3595n abstractC3595n = list.get(i);
                if (!abstractC3595n.isDirectory()) {
                    if (c == 0) {
                        c = 2;
                    } else if (c == 1) {
                        c = 3;
                    }
                    if (c == 2) {
                        EnumC1837z G = abstractC3595n.G();
                        String A = G == null ? abstractC3595n.A() : G.h();
                        if (TextUtils.isEmpty(str)) {
                            str = A;
                        } else if (!A.equals(str)) {
                            str = "file_mixed";
                        }
                    }
                } else if (c == 0) {
                    c = 1;
                } else if (c == 2) {
                    c = 3;
                }
            }
            return c != 0 ? c != 1 ? c != 2 ? c != 3 ? HttpUrl.FRAGMENT_ENCODE_SET : "mixed" : list.size() == 1 ? a.e("file", str) : a.e("files", str) : list.size() == 1 ? "dir" : "dirs" : "unknown";
        }
    }

    public static class f {
        public static String a(int i) {
            return i == 0 ? "0" : i < 100 ? "100" : i < 1000 ? "1000" : i < 2000 ? "2000" : i < 3000 ? "3000" : i < 5000 ? "5000" : i < 10000 ? "10000" : "More than 10000";
        }
    }

    public static class g {
        public static String a(long j) {
            long j2 = j / 1000;
            return j2 < 30 ? "30sec" : j2 < 60 ? "60sec" : j2 < 300 ? "5min" : j2 < 600 ? "10min" : j2 < 1800 ? "30min" : j2 < 3600 ? "60min" : "More than 60min";
        }
    }

    public static String e(String... strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(" : ");
            }
            stringBuffer.append(strArr[i]);
        }
        return stringBuffer.toString();
    }

    public static String g() {
        try {
            return h(Thread.currentThread().getStackTrace(), 1);
        } catch (Exception unused) {
            return "none";
        }
    }

    private static String h(StackTraceElement[] stackTraceElementArr, int i) {
        int i2 = i + 3;
        try {
            if (stackTraceElementArr.length <= i2) {
                return "none";
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            String substring = className.substring(className.lastIndexOf(46) + 1);
            String substring2 = className.substring(0, className.lastIndexOf(46));
            return substring2.substring(substring2.lastIndexOf(46) + 1) + "." + substring + ":" + stackTraceElement.getLineNumber();
        } catch (Exception unused) {
            return "none";
        }
    }

    public static a i() {
        if (d == null) {
            d = new a();
        }
        return d;
    }

    private void k() {
        if (this.b == null) {
            C3272a c3272a = new C3272a();
            this.b = c3272a;
            c3272a.b(this.a);
        }
    }

    public void f(boolean z) {
        C3272a c3272a = this.b;
        if (c3272a != null) {
            c3272a.a(z);
        }
    }

    synchronized void j(Context context) {
        this.a = context;
        l();
        k();
    }

    public b m(String str, String str2) {
        return new b(str, str2);
    }

    public b n(String str, String str2) {
        return new b(this, str, str2, true);
    }

    public d o(String str) {
        return new d(str, false);
    }

    public d p(String str) {
        return new d(str, true);
    }

    public void q(String str) {
        ax.Q2.c.a();
    }

    public class b {
        String a;
        String b;
        Bundle c;
        Long d;
        boolean e;

        public b(String str, String str2) {
            this.c = new Bundle();
            this.a = str;
            this.b = str2;
            this.e = false;
        }

        private String a() {
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            for (String str : this.c.keySet()) {
                int i2 = i + 1;
                if (i > 0) {
                    stringBuffer.append("|");
                }
                stringBuffer.append(str);
                stringBuffer.append(":");
                stringBuffer.append(String.valueOf(this.c.get(str)));
                i = i2;
            }
            return stringBuffer.toString();
        }

        public b b(String str, long j) {
            this.c.putLong(str, j);
            return this;
        }

        public b c(String str, String str2) {
            this.c.putString(str, str2);
            return this;
        }

        public b d(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        public void e() {
            if (!ax.Q2.c.a() && ax.t3.j.n(a.this.a) && this.e) {
                try {
                    a.this.r(this.a, this.b, a(), this.d);
                } catch (Exception unused) {
                    a.c.severe("ERROR SEND APP EVENT");
                }
            }
        }

        public b(a aVar, String str, String str2, boolean z) {
            this(str, str2);
            this.e = z;
        }
    }

    private void l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str, String str2, String str3, Long l) {
    }
}
