package ax.k9;

import ax.Y8.f;
import ax.x9.C3476a;

/* loaded from: classes3.dex */
public class e {
    private final String a;
    private final String b;
    private final String c;

    public e(String str) {
        this(str, null, null);
    }

    public static e f(String str) {
        String[] split = g(str).split("\\\\", 3);
        return split.length == 1 ? new e(split[0]) : split.length == 2 ? new e(split[0], split[1]) : new e(split[0], split[1], split[2]);
    }

    private static String g(String str) {
        if (!C3476a.a(str)) {
            return str;
        }
        String replace = str.replace('/', '\\');
        return replace.charAt(0) == '\\' ? (replace.length() <= 1 || replace.charAt(1) != '\\') ? replace.substring(1) : replace.substring(2) : replace;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public boolean d(e eVar) {
        return eVar != null && f.a(this.a, eVar.a);
    }

    public boolean e(e eVar) {
        return d(eVar) && f.a(this.b, eVar.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (f.a(this.a, eVar.a) && f.a(this.b, eVar.b) && f.a(this.c, eVar.c)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        StringBuilder sb = new StringBuilder("\\\\");
        sb.append(this.a);
        String str = this.b;
        if (str != null && !str.isEmpty()) {
            if (this.b.charAt(0) != '\\') {
                sb.append("\\");
            }
            sb.append(this.b);
            if (C3476a.a(this.c)) {
                sb.append("\\");
                sb.append(this.c);
            }
        }
        return sb.toString();
    }

    public int hashCode() {
        return f.b(this.a, this.b, this.c);
    }

    public String toString() {
        return h();
    }

    public e(String str, String str2) {
        this(str, str2, null);
    }

    public e(String str, String str2, String str3) {
        this.b = str2;
        this.a = str;
        this.c = g(str3);
    }

    public e(e eVar, String str) {
        this.a = eVar.a;
        if (C3476a.a(eVar.b)) {
            this.b = eVar.b;
            if (C3476a.a(eVar.c)) {
                this.c = eVar.c + "\\" + g(str);
                return;
            }
            this.c = g(str);
            return;
        }
        throw new IllegalArgumentException("Can only make child SmbPath of fully specified SmbPath");
    }
}
