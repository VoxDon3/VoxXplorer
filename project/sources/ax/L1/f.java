package ax.L1;

import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.G;
import ax.q1.C2860u;
import ax.q1.InterfaceC2858s;
import java.io.IOException;

/* loaded from: classes.dex */
final class f {
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public final int[] j = new int[255];
    private final G k = new G(255);

    f() {
    }

    public boolean a(InterfaceC2858s interfaceC2858s, boolean z) throws IOException {
        b();
        this.k.X(27);
        if (!C2860u.c(interfaceC2858s, this.k.f(), 0, 27, z) || this.k.O() != 1332176723) {
            return false;
        }
        int M = this.k.M();
        this.a = M;
        if (M != 0) {
            if (z) {
                return false;
            }
            throw E.d("unsupported bit stream revision");
        }
        this.b = this.k.M();
        this.c = this.k.A();
        this.d = this.k.C();
        this.e = this.k.C();
        this.f = this.k.C();
        int M2 = this.k.M();
        this.g = M2;
        this.h = M2 + 27;
        this.k.X(M2);
        if (!C2860u.c(interfaceC2858s, this.k.f(), 0, this.g, z)) {
            return false;
        }
        for (int i = 0; i < this.g; i++) {
            this.j[i] = this.k.M();
            this.i += this.j[i];
        }
        return true;
    }

    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        return d(interfaceC2858s, -1L);
    }

    public boolean d(InterfaceC2858s interfaceC2858s, long j) throws IOException {
        C0968a.a(interfaceC2858s.getPosition() == interfaceC2858s.i());
        this.k.X(4);
        while (true) {
            if ((j == -1 || interfaceC2858s.getPosition() + 4 < j) && C2860u.c(interfaceC2858s, this.k.f(), 0, 4, true)) {
                this.k.b0(0);
                if (this.k.O() == 1332176723) {
                    interfaceC2858s.m();
                    return true;
                }
                interfaceC2858s.n(1);
            }
        }
        do {
            if (j != -1 && interfaceC2858s.getPosition() >= j) {
                break;
            }
        } while (interfaceC2858s.a(1) != -1);
        return false;
    }
}
