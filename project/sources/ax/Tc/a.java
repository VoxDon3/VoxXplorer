package ax.Tc;

/* loaded from: classes3.dex */
public class a extends ax.Sc.k {
    private final ax.Sc.j[] a;
    private ax.Sc.j b = null;

    public a(ax.Sc.j[] jVarArr) {
        this.a = jVarArr;
    }

    @Override // ax.Sc.j
    public ax.Sc.i c(String str) {
        ax.Sc.j jVar = this.b;
        if (jVar != null) {
            return jVar.c(str);
        }
        for (ax.Sc.j jVar2 : this.a) {
            ax.Sc.i c = jVar2.c(str);
            if (c != null) {
                this.b = jVar2;
                return c;
            }
        }
        return null;
    }
}
