package ax.Gb;

/* loaded from: classes3.dex */
public class x {
    public ax.Mb.b b(Class cls) {
        return new e(cls);
    }

    public ax.Mb.c c(Class cls, String str) {
        return new n(cls, str);
    }

    public String f(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String g(m mVar) {
        return f(mVar);
    }

    public ax.Mb.d a(i iVar) {
        return iVar;
    }

    public ax.Mb.e d(o oVar) {
        return oVar;
    }

    public ax.Mb.f e(q qVar) {
        return qVar;
    }
}
