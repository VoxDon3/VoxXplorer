package ax.L2;

import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public class v implements Runnable {
    private ax.C2.v c0;
    private WorkerParameters.a d0;
    private ax.C2.D q;

    public v(ax.C2.D d, ax.C2.v vVar, WorkerParameters.a aVar) {
        this.q = d;
        this.c0 = vVar;
        this.d0 = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.q.l().o(this.c0, this.d0);
    }
}
