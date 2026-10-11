package ax.Tc;

import java.text.ParseException;
import java.util.Calendar;

/* loaded from: classes3.dex */
public abstract class b extends o implements ax.Sc.a {
    private final e d;

    public b(String str) {
        super(str);
        this.d = new f();
    }

    @Override // ax.Sc.a
    public void f(ax.Sc.f fVar) {
        if (this.d instanceof ax.Sc.a) {
            ax.Sc.f i = i();
            if (fVar == null) {
                ((ax.Sc.a) this.d).f(i);
                return;
            }
            if (fVar.b() == null) {
                fVar.k(i.b());
            }
            if (fVar.c() == null) {
                fVar.l(i.c());
            }
            ((ax.Sc.a) this.d).f(fVar);
        }
    }

    protected abstract ax.Sc.f i();

    public Calendar j(String str) throws ParseException {
        return this.d.a(str);
    }

    public b(String str, int i) {
        super(str, i);
        this.d = new f();
    }
}
