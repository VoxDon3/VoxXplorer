package ax.Va;

import ax.s8.InterfaceC3061c;

/* loaded from: classes3.dex */
public class d {

    @InterfaceC3061c("status")
    String a;

    public String a() {
        return this.a;
    }

    public boolean b() {
        return "in-progress".equals(this.a);
    }

    public boolean c() {
        return "success".equals(this.a);
    }

    public String toString() {
        return "Operation{status='" + this.a + "'}";
    }
}
