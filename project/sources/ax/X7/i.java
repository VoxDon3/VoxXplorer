package ax.X7;

import java.io.IOException;

/* loaded from: classes3.dex */
class i implements ax.U7.g {
    private boolean a = false;
    private boolean b = false;
    private ax.U7.c c;
    private final f d;

    i(f fVar) {
        this.d = fVar;
    }

    private void a() {
        if (this.a) {
            throw new ax.U7.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
    }

    void b(ax.U7.c cVar, boolean z) {
        this.a = false;
        this.c = cVar;
        this.b = z;
    }

    @Override // ax.U7.g
    public ax.U7.g f(String str) throws IOException {
        a();
        this.d.i(this.c, str, this.b);
        return this;
    }

    @Override // ax.U7.g
    public ax.U7.g g(boolean z) throws IOException {
        a();
        this.d.o(this.c, z, this.b);
        return this;
    }
}
