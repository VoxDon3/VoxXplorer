/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import android.util.Log;
import ax.Gb.l;
import ax.Ob.d;
import ax.n5.b;
import ax.n5.c;
import ax.n8.A;
import ax.n8.B;
import ax.n8.g;
import ax.n8.i;

public final class h
implements i {
    public static final a b = new a(null);
    private final ax.a8.b<ax.n5.i> a;

    public h(ax.a8.b<ax.n5.i> b8) {
        l.f(b8, "transportFactoryProvider");
        this.a = b8;
    }

    public static /* synthetic */ byte[] b(h h8, A a8) {
        return h8.c(a8);
    }

    private final byte[] c(A object) {
        object = B.a.c().b(object);
        l.e(object, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Session Event: ");
        stringBuilder.append((String)object);
        Log.d((String)"EventGDTLogger", (String)stringBuilder.toString());
        object = ((String)object).getBytes(d.b);
        l.e(object, "this as java.lang.String).getBytes(charset)");
        return object;
    }

    @Override
    public void a(A a8) {
        l.f(a8, "sessionEvent");
        this.a.get().a("FIREBASE_APPQUALITY_SESSION", A.class, ax.n5.b.b("json"), new g(this)).a(c.f(a8));
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ax.Gb.g g8) {
            this();
        }
    }
}

