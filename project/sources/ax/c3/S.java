package ax.c3;

import android.content.Context;

/* loaded from: classes.dex */
public class S implements ax.M9.g {
    private ax.K9.a a;
    private ax.L9.d b;
    private ax.P9.n c;
    private ax.Q9.b d;
    private com.microsoft.graph.serializer.b e;
    private Context f;

    class a extends S {
        a(Context context) {
            super(context);
        }
    }

    public S(Context context) {
        this.f = context;
    }

    public static ax.M9.g f(Context context, ax.K9.a aVar) {
        a aVar2 = new a(context);
        ((S) aVar2).a = aVar;
        aVar2.a().a("Using provided auth provider " + aVar.getClass().getSimpleName());
        return aVar2;
    }

    @Override // ax.M9.g
    public ax.Q9.b a() {
        if (this.d == null) {
            ax.Q9.a aVar = new ax.Q9.a();
            this.d = aVar;
            aVar.a("Created DefaultLogger");
        }
        return this.d;
    }

    @Override // ax.M9.g
    public ax.P9.n b() {
        if (this.c == null) {
            this.c = new com.voxdon.xplorer.file.G(this.f, d(), c(), e(), a());
            this.d.a("Created DefaultHttpProvider");
        }
        return this.c;
    }

    @Override // ax.M9.g
    public ax.K9.a c() {
        return this.a;
    }

    @Override // ax.M9.g
    public ax.T9.e d() {
        if (this.e == null) {
            this.e = new com.microsoft.graph.serializer.b(a());
            this.d.a("Created DefaultSerializer");
        }
        return this.e;
    }

    @Override // ax.M9.g
    public ax.L9.d e() {
        if (this.b == null) {
            this.b = new ax.L9.b(a());
            this.d.a("Created DefaultExecutors");
        }
        return this.b;
    }
}
