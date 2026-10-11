package ax.Va;

import ax.s8.InterfaceC3061c;

/* loaded from: classes3.dex */
public class c {
    public static final c e = new a();
    b a;

    @InterfaceC3061c("href")
    String b;

    @InterfaceC3061c("method")
    String c;

    @InterfaceC3061c("templated")
    boolean d;

    class a extends c {
        a() {
            this.a = b.done;
        }
    }

    public enum b {
        done,
        inProgress,
        error
    }

    public String a() {
        return this.b;
    }

    public b b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    public void d(b bVar) {
        this.a = bVar;
    }

    public String toString() {
        return "Link{href='" + this.b + "', method='" + this.c + "', templated=" + this.d + ", httpStatus=" + this.a + '}';
    }
}
