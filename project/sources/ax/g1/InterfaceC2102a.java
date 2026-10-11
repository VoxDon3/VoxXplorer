package ax.g1;

import ax.E1.h;
import ax.P0.C0912v;
import ax.z1.InterfaceC3538a;

/* renamed from: ax.g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2102a {
    public static final InterfaceC2102a a = new C0313a();

    /* renamed from: ax.g1.a$a, reason: collision with other inner class name */
    class C0313a implements InterfaceC2102a {
        C0313a() {
        }

        @Override // ax.g1.InterfaceC2102a
        public InterfaceC3538a a(C0912v c0912v) {
            String str = c0912v.o;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new ax.A1.b();
                    case "application/x-icy":
                        return new ax.D1.a();
                    case "application/id3":
                        return new h();
                    case "application/x-emsg":
                        return new ax.B1.b();
                    case "application/x-scte35":
                        return new ax.G1.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }

        @Override // ax.g1.InterfaceC2102a
        public boolean b(C0912v c0912v) {
            String str = c0912v.o;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }

    InterfaceC3538a a(C0912v c0912v);

    boolean b(C0912v c0912v);
}
