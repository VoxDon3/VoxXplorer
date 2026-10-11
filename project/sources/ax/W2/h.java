package ax.W2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class h {
    private a a;
    private c b = c.NOT_FILLED;
    private long c;

    public interface a {
        void a(b bVar, String str, String str2, ArrayList<String> arrayList, Object obj);

        void b();
    }

    public enum b {
        UNDEFINED,
        SUCCESS,
        FAILURE,
        CANCELLED
    }

    public enum c {
        NOT_FILLED,
        FILLED,
        CLEARED
    }

    public h() {
        h();
    }

    private void h() {
        this.c = i.b(this);
    }

    public j a() {
        j b2 = b();
        b2.o0(e());
        d();
        return b2;
    }

    protected abstract j b();

    protected boolean c() {
        return false;
    }

    public void d() {
        j(c.CLEARED);
        this.a = null;
        if (c()) {
            h();
        }
    }

    public long e() {
        return this.c;
    }

    public a f() {
        return this.a;
    }

    public c g() {
        return this.b;
    }

    public void i(a aVar) {
        this.a = aVar;
    }

    public void j(c cVar) {
        this.b = cVar;
    }
}
