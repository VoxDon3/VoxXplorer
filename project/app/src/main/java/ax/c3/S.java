/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.content.Context;
import ax.K9.a;
import ax.L9.b;
import ax.L9.d;
import ax.M9.g;
import ax.P9.n;
import ax.T9.e;
import com.voxdon.xplorer.file.G;

public class S
implements g {
    private a a;
    private d b;
    private n c;
    private ax.Q9.b d;
    private com.microsoft.graph.serializer.b e;
    private Context f;

    public S(Context context) {
        this.f = context;
    }

    public static g f(Context object, a a8) {
        S s8 = new S((Context)object){};
        s8.a = a8;
        object = s8.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Using provided auth provider ");
        stringBuilder.append(a8.getClass().getSimpleName());
        object.a(stringBuilder.toString());
        return s8;
    }

    @Override
    public ax.Q9.b a() {
        if (this.d == null) {
            ax.Q9.a a8 = new ax.Q9.a();
            this.d = a8;
            a8.a("Created DefaultLogger");
        }
        return this.d;
    }

    @Override
    public n b() {
        if (this.c == null) {
            this.c = new G(this.f, this.d(), this.c(), this.e(), this.a());
            this.d.a("Created DefaultHttpProvider");
        }
        return this.c;
    }

    @Override
    public a c() {
        return this.a;
    }

    @Override
    public e d() {
        if (this.e == null) {
            this.e = new com.microsoft.graph.serializer.b(this.a());
            this.d.a("Created DefaultSerializer");
        }
        return this.e;
    }

    @Override
    public d e() {
        if (this.b == null) {
            this.b = new b(this.a());
            this.d.a("Created DefaultExecutors");
        }
        return this.b;
    }
}

