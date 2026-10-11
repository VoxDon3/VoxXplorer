package ax.m8;

import java.io.IOException;

/* renamed from: ax.m8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2536a implements ax.V7.a {
    public static final ax.V7.a a = new C2536a();

    /* renamed from: ax.m8.a$a, reason: collision with other inner class name */
    private static final class C0375a implements ax.U7.d<d> {
        static final C0375a a = new C0375a();
        private static final ax.U7.c b = ax.U7.c.d("rolloutId");
        private static final ax.U7.c c = ax.U7.c.d("variantId");
        private static final ax.U7.c d = ax.U7.c.d("parameterKey");
        private static final ax.U7.c e = ax.U7.c.d("parameterValue");
        private static final ax.U7.c f = ax.U7.c.d("templateVersion");

        private C0375a() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d dVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, dVar.d());
            eVar.e(c, dVar.f());
            eVar.e(d, dVar.b());
            eVar.e(e, dVar.c());
            eVar.c(f, dVar.e());
        }
    }

    private C2536a() {
    }

    @Override // ax.V7.a
    public void a(ax.V7.b<?> bVar) {
        C0375a c0375a = C0375a.a;
        bVar.a(d.class, c0375a);
        bVar.a(b.class, c0375a);
    }
}
