package ax.T8;

import ax.W8.i;
import java.util.Random;

/* loaded from: classes3.dex */
public class a {
    private i a;
    private String b;
    private boolean c;
    private boolean d;
    private byte[] e;

    public static class b {
        private a a;

        public b(Random random) {
            a aVar = new a();
            this.a = aVar;
            aVar.a = new i(i.b.WINDOWS_MAJOR_VERSION_6, i.c.WINDOWS_MINOR_VERSION_1, 7600, i.a.NTLMSSP_REVISION_W2K3);
            this.a.c = true;
            this.a.d = false;
            this.a.e = new byte[32];
            random.nextBytes(this.a.e);
        }

        public a a() {
            return new a();
        }

        public b b(boolean z) {
            this.a.c = z;
            return this;
        }
    }

    public static b f(Random random) {
        return new b(random);
    }

    public i g() {
        return this.a;
    }

    public String h() {
        return this.b;
    }

    public boolean i() {
        return this.c;
    }

    public boolean j() {
        return this.d;
    }

    private a() {
    }

    private a(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
    }
}
