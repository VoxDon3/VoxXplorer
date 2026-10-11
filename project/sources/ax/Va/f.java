package ax.Va;

import ax.s8.InterfaceC3061c;
import java.util.List;

/* loaded from: classes3.dex */
public class f {

    @InterfaceC3061c("sort")
    String a;

    @InterfaceC3061c("public_key")
    String b;

    @InterfaceC3061c("items")
    List<e> c;

    @InterfaceC3061c("path")
    String d;

    @InterfaceC3061c("limit")
    int e;

    @InterfaceC3061c("offset")
    int f;

    @InterfaceC3061c("total")
    int g;

    public List<e> a() {
        return this.c;
    }

    public int b() {
        return this.g;
    }

    public String toString() {
        return "ResourceList{sort='" + this.a + "', publicKey='" + this.b + "', items=" + this.c + ", path='" + this.d + "', limit=" + this.e + ", offset=" + this.f + ", total=" + this.g + '}';
    }
}
