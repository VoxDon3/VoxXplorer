package ax.M8;

import ax.L8.c;
import ax.Y8.b;
import ax.Y8.c;
import ax.Z8.a;

/* loaded from: classes3.dex */
public class a {
    private int a;
    private c b;
    private String c;

    public int a() {
        return this.a;
    }

    public void b(ax.Z8.a<?> aVar) throws a.b {
        this.a = aVar.P();
        this.b = (c) c.a.f(aVar.N(), ax.L8.c.class, null);
        this.c = aVar.H(b.c, ((int) aVar.N()) / 2);
    }

    public String toString() {
        return "FileNotifyInformation{action=" + this.b + ", fileName='" + this.c + "'}";
    }
}
