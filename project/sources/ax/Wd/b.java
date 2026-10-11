package ax.Wd;

/* loaded from: classes3.dex */
public class b {
    protected m a;
    protected int b = 0;
    protected int c;
    protected int d;

    public b(m mVar) {
        this.a = mVar;
    }

    public String a() {
        return this.a.c();
    }

    public int b() {
        return this.c;
    }

    public int c(byte b) {
        int b2 = this.a.b(b);
        if (this.b == 0) {
            this.d = 0;
            this.c = this.a.a(b2);
        }
        int d = this.a.d(b2, this.b);
        this.b = d;
        this.d++;
        return d;
    }

    public void d() {
        this.b = 0;
    }
}
