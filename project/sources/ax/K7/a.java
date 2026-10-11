package ax.K7;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class a implements ax.V7.a {
    public static final ax.V7.a a = new a();

    /* renamed from: ax.K7.a$a, reason: collision with other inner class name */
    private static final class C0111a implements ax.U7.d<i> {
        static final C0111a a = new C0111a();
        private static final ax.U7.c b = ax.U7.c.d("rolloutId");
        private static final ax.U7.c c = ax.U7.c.d("parameterKey");
        private static final ax.U7.c d = ax.U7.c.d("parameterValue");
        private static final ax.U7.c e = ax.U7.c.d("variantId");
        private static final ax.U7.c f = ax.U7.c.d("templateVersion");

        private C0111a() {
        }

        @Override // ax.U7.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(i iVar, ax.U7.e eVar) throws IOException {
            eVar.e(b, iVar.e());
            eVar.e(c, iVar.c());
            eVar.e(d, iVar.d());
            eVar.e(e, iVar.g());
            eVar.c(f, iVar.f());
        }
    }

    private a() {
    }

    @Override // ax.V7.a
    public void a(ax.V7.b<?> bVar) {
        C0111a c0111a = C0111a.a;
        bVar.a(i.class, c0111a);
        bVar.a(b.class, c0111a);
    }
}
