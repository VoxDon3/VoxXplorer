package ax.E5;

@Deprecated
/* loaded from: classes3.dex */
public final class f {
    protected Boolean a;
    protected String b;

    public f() {
        this.a = Boolean.FALSE;
    }

    public final f a(String str) {
        this.b = str;
        return this;
    }

    public f(g gVar) {
        boolean z;
        String str;
        this.a = Boolean.FALSE;
        g.b(gVar);
        z = gVar.c0;
        this.a = Boolean.valueOf(z);
        str = gVar.d0;
        this.b = str;
    }
}
