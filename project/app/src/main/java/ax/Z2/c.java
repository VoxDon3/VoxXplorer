/*
 * Decompiled with CFR 0.152.
 */
package ax.Z2;

import android.content.ComponentName;

public class c {
    public a a;
    public String b;
    public String c;
    public String d;
    public ComponentName e;
    public boolean f;

    public static c a(a a8, String string, String string2, String string3, ComponentName componentName, boolean bl) {
        c c8 = new c();
        c8.a = a8;
        c8.b = string;
        c8.c = string2;
        c8.d = string3;
        c8.e = componentName;
        c8.f = bl;
        return c8;
    }

    public static c c(String stringArray) {
        if ((stringArray = stringArray.split(":")).length == 6) {
            a a8;
            c c8 = new c();
            c8.a = a8 = ax.Z2.c$a.h(stringArray[0]);
            if (a8 != null) {
                c8.b = stringArray[1];
                c8.c = stringArray[2];
                c8.d = stringArray[3];
                c8.e = ComponentName.unflattenFromString((String)stringArray[4]);
                c8.f = Boolean.valueOf(stringArray[5]);
                return c8;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public String b() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.j());
        stringBuilder.append(":");
        stringBuilder.append(this.b);
        stringBuilder.append(":");
        stringBuilder.append(this.c);
        stringBuilder.append(":");
        stringBuilder.append(this.d);
        stringBuilder.append(":");
        stringBuilder.append(this.e.flattenToString());
        stringBuilder.append(":");
        stringBuilder.append(this.f);
        return stringBuilder.toString();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0 = new a("general");
        public static final /* enum */ a d0 = new a("playvideo");
        private static final a[] e0 = ax.Z2.c$a.d();
        private String q;

        private a(String string2) {
            this.q = string2;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{c0, d0};
        }

        public static a h(String string) {
            for (a a8 : ax.Z2.c$a.values()) {
                if (!a8.q.equals(string)) continue;
                return a8;
            }
            return null;
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])e0.clone();
        }

        public String j() {
            return this.q;
        }
    }
}

