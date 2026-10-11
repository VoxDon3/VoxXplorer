package ax.N3;

import ax.N3.c;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class i implements c<InputStream> {
    private final ax.X3.l a;

    public static final class a implements c.a<InputStream> {
        private final ax.Q3.b a;

        public a(ax.Q3.b bVar) {
            this.a = bVar;
        }

        @Override // ax.N3.c.a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // ax.N3.c.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c<InputStream> b(InputStream inputStream) {
            return new i(inputStream, this.a);
        }
    }

    i(InputStream inputStream, ax.Q3.b bVar) {
        ax.X3.l lVar = new ax.X3.l(inputStream, bVar);
        this.a = lVar;
        lVar.mark(5242880);
    }

    @Override // ax.N3.c
    public void b() {
        this.a.c();
    }

    @Override // ax.N3.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InputStream a() throws IOException {
        this.a.reset();
        return this.a;
    }
}
