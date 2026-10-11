package ax.n8;

import android.util.Log;
import ax.n5.AbstractC2581c;
import ax.n5.C2580b;

/* renamed from: ax.n8.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2605h implements InterfaceC2606i {
    public static final a b = new a(null);
    private final ax.a8.b<ax.n5.i> a;

    /* renamed from: ax.n8.h$a */
    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    public C2605h(ax.a8.b<ax.n5.i> bVar) {
        ax.Gb.l.f(bVar, "transportFactoryProvider");
        this.a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(C2587A c2587a) {
        String b2 = C2588B.a.c().b(c2587a);
        ax.Gb.l.e(b2, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: " + b2);
        byte[] bytes = b2.getBytes(ax.Ob.d.b);
        ax.Gb.l.e(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // ax.n8.InterfaceC2606i
    public void a(C2587A c2587a) {
        ax.Gb.l.f(c2587a, "sessionEvent");
        this.a.get().a("FIREBASE_APPQUALITY_SESSION", C2587A.class, C2580b.b("json"), new ax.n5.g() { // from class: ax.n8.g
            @Override // ax.n5.g
            public final Object apply(Object obj) {
                byte[] c;
                c = C2605h.this.c((C2587A) obj);
                return c;
            }
        }).a(AbstractC2581c.f(c2587a));
    }
}
