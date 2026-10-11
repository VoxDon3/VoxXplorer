package ax.H9;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public class c implements ax.H9.a {
    private double[] a = new double[8];
    private ArrayList<c> b = new ArrayList<>();
    private g c;

    class a implements ax.Qa.a {
        final /* synthetic */ c q;

        a(c cVar) {
            this.q = cVar;
        }

        @Override // ax.Qa.a
        public void run() {
            c.this.g(this.q);
        }
    }

    class b implements ax.Qa.a {
        b() {
        }

        @Override // ax.Qa.a
        public void run() {
            c.this.i();
        }
    }

    protected c(g gVar, double d) {
        this.c = gVar;
        q(d);
    }

    private void d(c cVar) {
        if (this.b.contains(cVar)) {
            return;
        }
        this.b.add(cVar);
    }

    private void e(c cVar) {
        ax.D9.b c = this.c.c();
        ax.D9.b c2 = cVar.c.c();
        if (c != c2 && c != null && c2 != null) {
            throw new RuntimeException("Connection between units on different synths.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(c cVar) {
        d(cVar);
        cVar.d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        ArrayList<c> arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            c cVar = arrayList.get(i);
            i++;
            cVar.p(this);
        }
        this.b.clear();
    }

    private void p(c cVar) {
        this.b.remove(cVar);
    }

    @Override // ax.H9.a
    public void a(long j, int i, int i2) {
        for (int i3 = 0; i3 < l(); i3++) {
            k(i3).m().d().u(j, i, i2);
        }
    }

    protected void f(c cVar) {
        e(cVar);
        this.c.e(new a(cVar));
    }

    protected void h() {
        this.c.e(new b());
    }

    protected void j() {
        double d = this.a[r0.length - 1];
        int i = 0;
        while (true) {
            double[] dArr = this.a;
            if (i >= dArr.length - 1) {
                return;
            }
            dArr[i] = d;
            i++;
        }
    }

    public c k(int i) {
        return this.b.get(i);
    }

    public int l() {
        return this.b.size();
    }

    protected g m() {
        return this.c;
    }

    public double n() {
        return this.a[0];
    }

    public double[] o() {
        return this.a;
    }

    protected void q(double d) {
        int i = 0;
        while (true) {
            double[] dArr = this.a;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = d;
            i++;
        }
    }
}
