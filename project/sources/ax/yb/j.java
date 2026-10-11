package ax.yb;

/* loaded from: classes3.dex */
public abstract class j extends AbstractC3520a {
    public j(ax.wb.e<Object> eVar) {
        super(eVar);
        if (eVar != null && eVar.b() != ax.wb.j.q) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // ax.wb.e
    public ax.wb.i b() {
        return ax.wb.j.q;
    }
}
