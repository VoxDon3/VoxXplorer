package ax.Z4;

import java.util.HashSet;

/* loaded from: classes.dex */
public class b {
    protected final Object a;
    protected String b;
    protected String c;
    protected HashSet<String> d;

    private b(Object obj) {
        this.a = obj;
    }

    public static b e(ax.T4.g gVar) {
        return new b(gVar);
    }

    public static b f(ax.T4.j jVar) {
        return new b(jVar);
    }

    public b a() {
        return new b(this.a);
    }

    public Object b() {
        return this.a;
    }

    public boolean c(String str) throws ax.T4.i {
        String str2 = this.b;
        if (str2 == null) {
            this.b = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = this.c;
        if (str3 == null) {
            this.c = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (this.d == null) {
            HashSet<String> hashSet = new HashSet<>(16);
            this.d = hashSet;
            hashSet.add(this.b);
            this.d.add(this.c);
        }
        return !this.d.add(str);
    }

    public void d() {
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
