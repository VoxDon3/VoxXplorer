package ax.N1;

import ax.N1.t;
import ax.P0.C0912v;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class h implements t.a {
    @Override // ax.N1.t.a
    public int a(C0912v c0912v) {
        String str = c0912v.o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // ax.N1.t.a
    public boolean b(C0912v c0912v) {
        String str = c0912v.o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // ax.N1.t.a
    public t c(C0912v c0912v) {
        String str = c0912v.o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new ax.P1.a(c0912v.r);
                case "application/pgs":
                    return new ax.Q1.a();
                case "application/x-mp4-vtt":
                    return new ax.W1.a();
                case "text/vtt":
                    return new ax.W1.g();
                case "application/x-quicktime-tx3g":
                    return new ax.U1.a(c0912v.r);
                case "text/x-ssa":
                    return new ax.R1.b(c0912v.r);
                case "application/vobsub":
                    return new ax.V1.a(c0912v.r);
                case "application/x-subrip":
                    return new ax.S1.a();
                case "application/ttml+xml":
                    return new ax.T1.d();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
