package ax.W2;

import ax.c3.K;
import java.util.Set;

/* loaded from: classes.dex */
public class w {
    private static w d;
    public String a;
    public K b;
    public Set<String> c;

    public static w c() {
        if (d == null) {
            d = new w();
        }
        return d;
    }

    public void a() {
        this.a = null;
        this.c = null;
    }

    public Set<String> b() {
        return this.c;
    }

    public K d() {
        return this.b;
    }

    public String e() {
        return this.a;
    }

    public boolean f() {
        return (this.a == null || this.c == null) ? false : true;
    }

    public void g(K k, String str, Set<String> set) {
        if (str == null) {
            return;
        }
        this.b = k;
        this.a = str;
        this.c = set;
    }
}
