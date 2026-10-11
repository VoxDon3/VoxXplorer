package ax.k1;

import ax.N1.l;
import ax.N1.t;
import ax.P0.C0912v;
import j$.util.Objects;

/* renamed from: ax.k1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2364g {
    public static final InterfaceC2364g a = new a();

    /* renamed from: ax.k1.g$a */
    class a implements InterfaceC2364g {
        private final ax.N1.h b = new ax.N1.h();

        a() {
        }

        @Override // ax.k1.InterfaceC2364g
        public l a(C0912v c0912v) {
            String str = c0912v.o;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new ax.O1.a(str, c0912v.L, 16000L);
                    case "application/cea-708":
                        return new ax.O1.c(c0912v.L, c0912v.r);
                }
            }
            if (!this.b.b(c0912v)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            t c = this.b.c(c0912v);
            return new C2359b(c.getClass().getSimpleName() + "Decoder", c);
        }

        @Override // ax.k1.InterfaceC2364g
        public boolean b(C0912v c0912v) {
            String str = c0912v.o;
            return this.b.b(c0912v) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }
    }

    l a(C0912v c0912v);

    boolean b(C0912v c0912v);
}
