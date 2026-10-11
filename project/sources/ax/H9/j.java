package ax.H9;

import ax.I9.u;

/* loaded from: classes3.dex */
public class j extends k {
    private boolean i;
    private boolean j;
    private boolean k;
    private u l;

    class a implements ax.Qa.a {
        final /* synthetic */ boolean q;

        a(boolean z) {
            this.q = z;
        }

        @Override // ax.Qa.a
        public void run() {
            j.this.N(this.q);
        }
    }

    public j(String str) {
        super(str);
        this.i = false;
        this.j = false;
        this.k = true;
    }

    private u H() {
        u uVar = this.l;
        return uVar == null ? d() : uVar;
    }

    private void M(boolean z, ax.Qa.c cVar) {
        f(cVar, new a(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(boolean z) {
        if (z) {
            P();
        }
        o(z ? 1.0d : 0.0d);
    }

    private void P() {
        H().w(true);
        this.j = true;
    }

    public void F() {
        if (this.i) {
            H().w(false);
        }
    }

    public boolean G(int i) {
        double[] l = l();
        boolean z = this.j;
        this.j = false;
        if (this.k) {
            if (l[i] >= 0.01d) {
                this.k = false;
                return true;
            }
        } else if (l[i] < 0.01d) {
            this.k = true;
        }
        return z;
    }

    public boolean I() {
        return this.k;
    }

    public void J(ax.Qa.c cVar) {
        M(false, cVar);
    }

    public void K(ax.Qa.c cVar) {
        M(true, cVar);
    }

    public void L(boolean z) {
        this.i = z;
    }

    public void O(u uVar) {
        this.l = uVar;
        L(true);
        this.l.w(false);
    }
}
