package ax.K7;

import java.io.File;

/* loaded from: classes3.dex */
public class e {
    private static final b c = new b();
    private final ax.O7.g a;
    private c b;

    public e(ax.O7.g gVar) {
        this.a = gVar;
        this.b = c;
    }

    private File d(String str) {
        return this.a.q(str, "userlog");
    }

    public void a() {
        this.b.d();
    }

    public byte[] b() {
        return this.b.c();
    }

    public String c() {
        return this.b.b();
    }

    public final void e(String str) {
        this.b.a();
        this.b = c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i) {
        this.b = new h(file, i);
    }

    public void g(long j, String str) {
        this.b.e(j, str);
    }

    public e(ax.O7.g gVar, String str) {
        this(gVar);
        e(str);
    }

    private static final class b implements c {
        private b() {
        }

        @Override // ax.K7.c
        public String b() {
            return null;
        }

        @Override // ax.K7.c
        public byte[] c() {
            return null;
        }

        @Override // ax.K7.c
        public void a() {
        }

        @Override // ax.K7.c
        public void d() {
        }

        @Override // ax.K7.c
        public void e(long j, String str) {
        }
    }
}
