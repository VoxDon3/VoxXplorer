package ax.c3;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class g0 extends com.voxdon.xplorer.file.T {
    @Override // com.voxdon.xplorer.file.T
    public void g(int i, String str) {
        a aVar = new a();
        ax.Z2.o k = k(i);
        k.q(str);
        l(i, k, aVar, false);
    }

    public abstract ax.Z2.o k(int i);

    public abstract void l(int i, ax.Z2.o oVar, ax.g3.k kVar, boolean z);

    class a implements ax.g3.k {
        a() {
        }

        @Override // ax.g3.k
        public void b(ax.Q2.f fVar) {
        }

        @Override // ax.g3.k
        public void c(ax.Q2.f fVar, int i) {
        }

        @Override // ax.g3.k
        public void d(ax.Q2.f fVar, int i, Map<String, Object> map) {
        }

        @Override // ax.g3.k
        public void a(ax.Q2.f fVar, String str, int i, String str2, String str3) {
        }
    }
}
