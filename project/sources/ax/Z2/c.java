package ax.Z2;

import android.content.ComponentName;

/* loaded from: classes.dex */
public class c {
    public a a;
    public String b;
    public String c;
    public String d;
    public ComponentName e;
    public boolean f;

    public enum a {
        GENERAL("general"),
        IN_IMAGE_VIEWER("playvideo");

        private String q;

        a(String str) {
            this.q = str;
        }

        public static a h(String str) {
            for (a aVar : values()) {
                if (aVar.q.equals(str)) {
                    return aVar;
                }
            }
            return null;
        }

        public String j() {
            return this.q;
        }
    }

    public static c a(a aVar, String str, String str2, String str3, ComponentName componentName, boolean z) {
        c cVar = new c();
        cVar.a = aVar;
        cVar.b = str;
        cVar.c = str2;
        cVar.d = str3;
        cVar.e = componentName;
        cVar.f = z;
        return cVar;
    }

    public static c c(String str) {
        String[] split = str.split(":");
        if (split.length != 6) {
            throw new IllegalArgumentException();
        }
        c cVar = new c();
        a h = a.h(split[0]);
        cVar.a = h;
        if (h == null) {
            throw new IllegalArgumentException();
        }
        cVar.b = split[1];
        cVar.c = split[2];
        cVar.d = split[3];
        cVar.e = ComponentName.unflattenFromString(split[4]);
        cVar.f = Boolean.valueOf(split[5]).booleanValue();
        return cVar;
    }

    public String b() {
        return this.a.j() + ":" + this.b + ":" + this.c + ":" + this.d + ":" + this.e.flattenToString() + ":" + this.f;
    }
}
