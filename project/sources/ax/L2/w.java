package ax.L2;

/* loaded from: classes.dex */
public class w implements Runnable {
    private static final String e0 = ax.B2.i.i("StopWorkRunnable");
    private final ax.C2.v c0;
    private final boolean d0;
    private final ax.C2.D q;

    public w(ax.C2.D d, ax.C2.v vVar, boolean z) {
        this.q = d;
        this.c0 = vVar;
        this.d0 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean r = this.d0 ? this.q.l().r(this.c0) : this.q.l().s(this.c0);
        ax.B2.i.e().a(e0, "StopWorkRunnable for " + this.c0.a().b() + "; Processor.stopWork = " + r);
    }
}
