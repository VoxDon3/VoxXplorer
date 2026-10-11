package ax.I9;

/* loaded from: classes3.dex */
public abstract class v extends u implements y {
    public ax.H9.k h;
    public ax.H9.k i;
    public ax.H9.n j;
    public ax.H9.l k;

    public v() {
        ax.H9.k kVar = new ax.H9.k("Frequency");
        this.h = kVar;
        f(kVar);
        this.h.C(40.0d, 440.0d, 8000.0d);
        ax.H9.k kVar2 = new ax.H9.k("Amplitude", 1.0d);
        this.i = kVar2;
        f(kVar2);
        ax.H9.n nVar = new ax.H9.n("Phase");
        this.j = nVar;
        f(nVar);
        ax.H9.l lVar = new ax.H9.l("Output");
        this.k = lVar;
        f(lVar);
    }

    @Override // ax.I9.y
    public void a(double d, double d2, ax.Qa.c cVar) {
        this.h.v(d, cVar);
        this.i.v(d2, cVar);
    }

    @Override // ax.I9.w
    public ax.H9.l b() {
        return this.k;
    }

    @Override // ax.I9.y
    public void e(ax.Qa.c cVar) {
        this.i.v(0.0d, cVar);
    }

    public double z(double d) {
        try {
            double v = d * this.a.v();
            if (v > 1.0d) {
                return 1.0d;
            }
            if (v < -1.0d) {
                return -1.0d;
            }
            return v;
        } catch (NullPointerException unused) {
            throw new NullPointerException("Null Synth! You probably forgot to add this unit to the Synthesizer!");
        }
    }

    @Override // ax.I9.y
    public void c(int i) {
    }
}
