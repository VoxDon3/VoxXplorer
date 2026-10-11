/*
 * Decompiled with CFR 0.152.
 */
package ax.Q2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import ax.W2.h;
import ax.c3.z;
import ax.t3.j;
import com.alphainventor.filemanager.file.n;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class a {
    private static final Logger c = ax.Q2.g.a(a.class);
    private static a d;
    private Context a;
    private ax.v3.a b;

    public static String e(String ... stringArray) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i8 = 0; i8 < stringArray.length; ++i8) {
            if (i8 > 0) {
                stringBuffer.append(" : ");
            }
            stringBuffer.append(stringArray[i8]);
        }
        return stringBuffer.toString();
    }

    public static String g() {
        try {
            String string = ax.Q2.a.h(Thread.currentThread().getStackTrace(), 1);
            return string;
        }
        catch (Exception exception) {
            return "none";
        }
    }

    private static String h(StackTraceElement[] object, int n8) {
        block3: {
            n8 += 3;
            try {
                if (((StackTraceElement[])object).length > n8) break block3;
                return "none";
            }
            catch (Exception exception) {
                return "none";
            }
        }
        StackTraceElement stackTraceElement = object[n8];
        CharSequence charSequence = stackTraceElement.getClassName();
        object = ((String)charSequence).substring(((String)charSequence).lastIndexOf(46) + 1);
        charSequence = ((String)charSequence).substring(0, ((String)charSequence).lastIndexOf(46));
        String string = ((String)charSequence).substring(((String)charSequence).lastIndexOf(46) + 1);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append(".");
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append(":");
        ((StringBuilder)charSequence).append(stackTraceElement.getLineNumber());
        object = ((StringBuilder)charSequence).toString();
        return object;
    }

    public static a i() {
        if (d == null) {
            d = new a();
        }
        return d;
    }

    private void k() {
        if (this.b == null) {
            ax.v3.a a8;
            this.b = a8 = new ax.v3.a();
            a8.b(this.a);
        }
    }

    private void l() {
    }

    private void r(String string, String string2, String string3, Long l8) {
    }

    public void f(boolean bl) {
        ax.v3.a a8 = this.b;
        if (a8 != null) {
            a8.a(bl);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void j(Context context) {
        synchronized (this) {
            this.a = context;
            this.l();
            this.k();
            return;
        }
    }

    public b m(String string, String string2) {
        return new b(this, string, string2);
    }

    public b n(String string, String string2) {
        return new b(this, string, string2, true);
    }

    public d o(String string) {
        return new d(this, string, false);
    }

    public d p(String string) {
        return new d(this, string, true);
    }

    public void q(String string) {
        ax.Q2.c.a();
    }

    public class b {
        String a;
        String b;
        Bundle c;
        Long d;
        boolean e;
        final a f;

        public b(a a8, String string, String string2) {
            this.f = a8;
            this.c = new Bundle();
            this.a = string;
            this.b = string2;
            this.e = false;
        }

        public b(a a8, String string, String string2, boolean bl) {
            this(a8, string, string2);
            this.e = bl;
        }

        private String a() {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator iterator = this.c.keySet().iterator();
            int n8 = 0;
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                if (n8 > 0) {
                    stringBuffer.append("|");
                }
                stringBuffer.append(string);
                stringBuffer.append(":");
                stringBuffer.append(String.valueOf(this.c.get(string)));
                ++n8;
            }
            return stringBuffer.toString();
        }

        public b b(String string, long l8) {
            this.c.putLong(string, l8);
            return this;
        }

        public b c(String string, String string2) {
            this.c.putString(string, string2);
            return this;
        }

        public b d(long l8) {
            this.d = l8;
            return this;
        }

        public void e() {
            if (!ax.Q2.c.a() && j.n(this.f.a) && this.e) {
                try {
                    this.f.r(this.a, this.b, this.a(), this.d);
                    return;
                }
                catch (Exception exception) {
                    c.severe("ERROR SEND APP EVENT");
                }
            }
        }
    }

    public static class c {
        public static String a(h.b b8) {
            int n8 = ax.Q2.a$a.a[b8.ordinal()];
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        return "undefined";
                    }
                    return "cancelled";
                }
                return "failure";
            }
            return "success";
        }
    }

    public class d {
        String a;
        boolean b;
        Bundle c;
        final a d;

        d(a a8, String string, boolean bl) {
            this.d = a8;
            this.a = string;
            this.c = new Bundle();
            this.b = bl;
        }

        public d a(String string, long l8) {
            this.c.putLong(string, l8);
            return this;
        }

        public d b(String string, String string2) {
            this.c.putString(string, string2);
            return this;
        }

        public void c() {
            if (!ax.Q2.c.a() && j.n(this.d.a) && this.b && this.d.b != null) {
                try {
                    this.d.b.c(this.a, this.c);
                    return;
                }
                catch (Exception exception) {
                    c.severe("ERROR SEND APP EVENT");
                }
            }
        }
    }

    public static class e {
        public static String a(List<n> list) {
            String string = "";
            int n8 = 0;
            for (int i8 = 0; i8 < list.size(); ++i8) {
                Object object;
                int n9;
                Object object2 = list.get(i8);
                if (object2.isDirectory()) {
                    if (n8 == 0) {
                        n9 = 1;
                        object = string;
                    } else {
                        n9 = n8;
                        object = string;
                        if (n8 == 2) {
                            n9 = 3;
                            object = string;
                        }
                    }
                } else {
                    int n10;
                    if (n8 == 0) {
                        n10 = 2;
                    } else {
                        n10 = n8;
                        if (n8 == 1) {
                            n10 = 3;
                        }
                    }
                    n9 = n10;
                    object = string;
                    if (n10 == 2) {
                        object = ((n)object2).G();
                        object2 = object == null ? ((n)object2).A() : ((z)((Object)object)).h();
                        if (TextUtils.isEmpty((CharSequence)string)) {
                            object = object2;
                            n9 = n10;
                        } else {
                            n9 = n10;
                            object = string;
                            if (!((String)object2).equals(string)) {
                                object = "file_mixed";
                                n9 = n10;
                            }
                        }
                    }
                }
                n8 = n9;
                string = object;
            }
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            return "";
                        }
                        return "mixed";
                    }
                    if (list.size() == 1) {
                        return ax.Q2.a.e("file", string);
                    }
                    return ax.Q2.a.e("files", string);
                }
                if (list.size() == 1) {
                    return "dir";
                }
                return "dirs";
            }
            return "unknown";
        }
    }

    public static class f {
        public static String a(int n8) {
            if (n8 == 0) {
                return "0";
            }
            if (n8 < 100) {
                return "100";
            }
            if (n8 < 1000) {
                return "1000";
            }
            if (n8 < 2000) {
                return "2000";
            }
            if (n8 < 3000) {
                return "3000";
            }
            if (n8 < 5000) {
                return "5000";
            }
            if (n8 < 10000) {
                return "10000";
            }
            return "More than 10000";
        }
    }

    public static class g {
        public static String a(long l8) {
            if ((l8 /= 1000L) < 30L) {
                return "30sec";
            }
            if (l8 < 60L) {
                return "60sec";
            }
            if (l8 < 300L) {
                return "5min";
            }
            if (l8 < 600L) {
                return "10min";
            }
            if (l8 < 1800L) {
                return "30min";
            }
            if (l8 < 3600L) {
                return "60min";
            }
            return "More than 60min";
        }
    }
}

