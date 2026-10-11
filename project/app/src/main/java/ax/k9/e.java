/*
 * Decompiled with CFR 0.152.
 */
package ax.k9;

import ax.Y8.f;
import ax.x9.a;

public class e {
    private final String a;
    private final String b;
    private final String c;

    public e(e e8, String string) {
        this.a = e8.a;
        if (ax.x9.a.a(e8.b)) {
            this.b = e8.b;
            if (ax.x9.a.a(e8.c)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(e8.c);
                stringBuilder.append("\\");
                stringBuilder.append(e.g(string));
                this.c = stringBuilder.toString();
                return;
            }
            this.c = e.g(string);
            return;
        }
        throw new IllegalArgumentException("Can only make child SmbPath of fully specified SmbPath");
    }

    public e(String string) {
        this(string, null, null);
    }

    public e(String string, String string2) {
        this(string, string2, null);
    }

    public e(String string, String string2, String string3) {
        this.b = string2;
        this.a = string;
        this.c = e.g(string3);
    }

    public static e f(String stringArray) {
        if ((stringArray = e.g((String)stringArray).split("\\\\", 3)).length == 1) {
            return new e(stringArray[0]);
        }
        if (stringArray.length == 2) {
            return new e(stringArray[0], stringArray[1]);
        }
        return new e(stringArray[0], stringArray[1], stringArray[2]);
    }

    private static String g(String string) {
        String string2 = string;
        if (ax.x9.a.a(string)) {
            string2 = string = string.replace('/', '\\');
            if (string.charAt(0) == '\\') {
                if (string.length() > 1 && string.charAt(1) == '\\') {
                    return string.substring(2);
                }
                string2 = string.substring(1);
            }
        }
        return string2;
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

    public boolean d(e e8) {
        return e8 != null && f.a(this.a, e8.a);
    }

    public boolean e(e e8) {
        return this.d(e8) && f.a(this.b, e8.b);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (e)object;
            if (f.a(this.a, ((e)object).a) && f.a(this.b, ((e)object).b) && f.a(this.c, ((e)object).c)) {
                return true;
            }
        }
        return false;
    }

    public String h() {
        StringBuilder stringBuilder = new StringBuilder("\\\\");
        stringBuilder.append(this.a);
        String string = this.b;
        if (string != null && !string.isEmpty()) {
            if (this.b.charAt(0) != '\\') {
                stringBuilder.append("\\");
            }
            stringBuilder.append(this.b);
            if (ax.x9.a.a(this.c)) {
                stringBuilder.append("\\");
                stringBuilder.append(this.c);
            }
        }
        return stringBuilder.toString();
    }

    public int hashCode() {
        return f.b(this.a, this.b, this.c);
    }

    public String toString() {
        return this.h();
    }
}

