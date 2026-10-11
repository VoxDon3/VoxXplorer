/*
 * Decompiled with CFR 0.152.
 */
package ax.o3;

import android.net.Uri;
import android.text.TextUtils;
import ax.Ha.b;
import ax.Q2.f;
import ax.Q2.g;
import ax.Ya.a;
import ax.Z2.k;
import ax.b3.j;
import ax.c3.d0;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import java.io.InputStream;
import java.util.Map;
import java.util.logging.Logger;

public class c
extends ax.Ya.a {
    private static final Logger n = g.a(c.class);
    private final boolean l;
    private com.alphainventor.filemanager.service.b m;

    public c(com.alphainventor.filemanager.service.b b8, int n8) {
        super(n8);
        this.l = true;
        this.s(new a(this));
        this.m = b8;
    }

    private static String B(f f8, int n8, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/");
        stringBuilder.append(f8.I());
        stringBuilder.append("/");
        stringBuilder.append(n8);
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static String C(n n8) {
        return c.B(n8.P(), n8.L(), n8.E());
    }

    private o F(f f8, int n8) {
        return this.m.g(f8, n8);
    }

    private a.o G(Map<String, String> object, a.m object2, String object3) {
        object2 = object3 = ((String)object3).trim();
        if (((String)object3).indexOf(63) >= 0) {
            object2 = ((String)object3).substring(0, ((String)object3).indexOf(63));
        }
        if ((object3 = c.z((String)object2)) == null) {
            return this.E();
        }
        o o8 = this.F(((k)object3).b(), ((k)object3).c());
        if (o8 == null) {
            return this.D("Internal Error : Invalid Location");
        }
        if (!this.m.j(((k)object3).toString())) {
            return this.A("");
        }
        Object object4 = ((k)object3).e();
        if (TextUtils.isEmpty((CharSequence)object4)) {
            object = ax.Ha.c.h().f().c("HTTP SERVER EMPTY PATH");
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("uri:");
            ((StringBuilder)object3).append((String)object2);
            ((b)object).g(((StringBuilder)object3).toString()).h();
            return this.E();
        }
        object3 = object4;
        if (!d0.B((String)object4)) {
            object3 = d0.U((String)object4);
        }
        if (!o8.a()) {
            String string = d0.f((String)object3);
            boolean bl = o8.i(0L);
            if (!bl) {
                object4 = ax.Ha.c.h().f().b("HTTP SERVER NOT CONNECTED");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("loc:");
                stringBuilder.append(o8.S().I());
                stringBuilder.append(",ext:");
                stringBuilder.append(string);
                stringBuilder.append(",connected:");
                stringBuilder.append(bl);
                ((b)object4).g(stringBuilder.toString()).h();
            }
        }
        try {
            object3 = o8.z((String)object3);
            if (object3 != null && object3.n()) {
                if (object3.isDirectory()) {
                    return this.A("No directory listing.");
                }
                if ((object = this.H(o8, (String)object2, (Map<String, String>)object, (n)object3, object3.s())) != null) {
                    return object;
                }
                return this.E();
            }
            return this.E();
        }
        catch (j j8) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Internal Error : ");
            ((StringBuilder)object2).append(j8.getMessage());
            return this.D(((StringBuilder)object2).toString());
        }
    }

    public static a.o o(a.o.c object, String string, String string2) {
        object = ax.Ya.a.o((a.o.c)object, string, string2);
        ((a.o)object).b("Accept-Ranges", "bytes");
        return object;
    }

    private static String y(String string) {
        String string2;
        if (string == null) {
            return null;
        }
        String string3 = "/";
        int n8 = string.indexOf("/");
        if (n8 < 0) {
            return null;
        }
        String string4 = string.substring(0, n8);
        int n9 = n8 + 1;
        if ((n8 = string.indexOf("/", n9)) < 0) {
            string = string.substring(n9);
        } else {
            string2 = string.substring(n9, n8);
            string3 = string.substring(n8);
            string = string2;
        }
        try {
            Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        string2 = new Uri.Builder();
        string2.scheme(string4);
        string2.authority(string);
        string2.path(string3);
        return string2.build().toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static k z(String string) {
        if (string == null) {
            return null;
        }
        try {
            if (!TextUtils.isEmpty((CharSequence)string) && string.length() > 0 && string.startsWith("/")) {
                String string2 = c.y(string.substring(1));
                if (string2 == null) {
                    return null;
                }
                return k.a(Uri.parse((String)string2));
            }
            b b8 = ax.Ha.c.h().f().d("INVALID URI 2");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(string);
            b8.g(stringBuilder.toString()).h();
            return null;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            b b9 = ax.Ha.c.h().f().d("INVALID URI 3");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(string);
            b9.g(stringBuilder.toString()).h();
            return null;
        }
    }

    protected a.o A(String string) {
        a.o.d d8 = a.o.d.r0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FORBIDDEN: ");
        stringBuilder.append(string);
        return ax.Ya.a.o(d8, "text/plain", stringBuilder.toString());
    }

    protected a.o D(String string) {
        a.o.d d8 = a.o.d.F0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("INTERNAL ERROR: ");
        stringBuilder.append(string);
        return ax.Ya.a.o(d8, "text/plain", stringBuilder.toString());
    }

    protected a.o E() {
        return ax.Ya.a.o(a.o.d.s0, "text/plain", "Error 404, file not found.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    a.o H(o object, String charSequence, Map<String, String> object2, n n8, String string) {
        j j82;
        block21: {
            boolean bl;
            long l8;
            int n9;
            String string2;
            long l9;
            block16: {
                long l10;
                long l11;
                block17: {
                    String string3;
                    boolean bl2;
                    block20: {
                        block19: {
                            block18: {
                                block15: {
                                    try {
                                        bl2 = n8.c0();
                                        if (!bl2) break block15;
                                    }
                                    catch (j j82) {}
                                    try {
                                        ((o)object).r(n8);
                                    }
                                    catch (j j9) {}
                                }
                                l9 = n8.p();
                                charSequence = new StringBuilder();
                                ((StringBuilder)charSequence).append(n8.E());
                                ((StringBuilder)charSequence).append(n8.q());
                                ((StringBuilder)charSequence).append("");
                                ((StringBuilder)charSequence).append(l9);
                                string2 = Integer.toHexString(((StringBuilder)charSequence).toString().hashCode());
                                charSequence = (String)object2.get("range");
                                l11 = -1L;
                                if (charSequence == null || !((String)charSequence).startsWith("bytes=")) break block18;
                                n9 = ((String)(charSequence = ((String)charSequence).substring(6))).indexOf(45);
                                if (n9 <= 0) break block19;
                                try {
                                    l8 = Long.parseLong(((String)charSequence).substring(0, n9));
                                }
                                catch (NumberFormatException numberFormatException) {}
                                try {
                                    l11 = l10 = Long.parseLong(((String)charSequence).substring(n9 + 1));
                                }
                                catch (NumberFormatException numberFormatException) {}
                            }
                            l8 = 0L;
                            break block20;
                        }
                        l8 = 0L;
                    }
                    n9 = (string3 = (String)object2.get("if-range")) != null && !string2.equals(string3) ? 0 : 1;
                    object2 = (String)object2.get("if-none-match");
                    bl = object2 != null && ("*".equals(object2) || (bl2 = ((String)object2).equals(string2)));
                    l10 = l11;
                    if (n9 == 0 || charSequence == null || l8 < 0L || l8 >= l9) break block16;
                    if (bl) {
                        object = c.o(a.o.d.n0, string, "");
                        ((a.o)object).b("ETag", string2);
                        return object;
                    }
                    l11 = l10;
                    if (l10 < 0L) {
                        l11 = l9 - 1L;
                    }
                    if ((l10 = l11 - l8 + 1L) >= 0L) break block17;
                    l10 = 0L;
                }
                object = ((o)object).J(n8, l8);
                object = ax.Ya.a.n(a.o.d.i0, string, (InputStream)object, l10);
                ((a.o)object).b("Accept-Ranges", "bytes");
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("");
                ((StringBuilder)charSequence).append(l10);
                ((a.o)object).b("Content-Length", ((StringBuilder)charSequence).toString());
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("bytes ");
                ((StringBuilder)charSequence).append(l8);
                ((StringBuilder)charSequence).append("-");
                ((StringBuilder)charSequence).append(l11);
                ((StringBuilder)charSequence).append("/");
                ((StringBuilder)charSequence).append(l9);
                ((a.o)object).b("Content-Range", ((StringBuilder)charSequence).toString());
                ((a.o)object).b("ETag", string2);
                return object;
                break block21;
            }
            if (n9 != 0 && charSequence != null && l8 >= l9) {
                object = c.o(a.o.d.C0, "text/plain", "");
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("bytes */");
                ((StringBuilder)charSequence).append(l9);
                ((a.o)object).b("Content-Range", ((StringBuilder)charSequence).toString());
                ((a.o)object).b("ETag", string2);
                n.fine("HTTP response : Range not satisfiable");
                return object;
            }
            if (charSequence == null && bl) {
                object = c.o(a.o.d.n0, string, "");
                ((a.o)object).b("ETag", string2);
                n.fine("HTTP response : Not modified");
                return object;
            }
            if (n9 == 0 && bl) {
                object = c.o(a.o.d.n0, string, "");
                ((a.o)object).b("ETag", string2);
                n.fine("HTTP response : Not modified");
                return object;
            }
            object = ((o)object).J(n8, 0L);
            object = ax.Ya.a.n(a.o.d.e0, string, (InputStream)object, l9);
            ((a.o)object).b("Accept-Ranges", "bytes");
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("");
            ((StringBuilder)charSequence).append(l9);
            ((a.o)object).b("Content-Length", ((StringBuilder)charSequence).toString());
            ((a.o)object).b("ETag", string2);
            return object;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Reading file failed : ");
        ((StringBuilder)charSequence).append(j82.getMessage());
        return this.A(((StringBuilder)charSequence).toString());
    }

    @Override
    public a.o q(a.m m8) {
        Map<String, String> map = m8.a();
        m8.d();
        String string = m8.b();
        return this.G(java.util.DesugarCollections.unmodifiableMap(map), m8, string);
    }

    class a
    extends a.g {
        final c c;

        a(c c8) {
            this.c = c8;
        }

        @Override
        public void a(a.c c8) {
            super.a(c8);
            this.c.m.m(this.d().size());
        }

        @Override
        public void c(a.c c8) {
            super.c(c8);
            this.c.m.m(this.d().size());
        }
    }
}

