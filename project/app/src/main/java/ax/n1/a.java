/*
 * Decompiled with CFR 0.152.
 */
package ax.n1;

import android.os.SystemClock;
import android.text.TextUtils;
import ax.P0.A;
import ax.P0.C;
import ax.P0.F;
import ax.P0.G;
import ax.P0.H;
import ax.P0.N;
import ax.P0.T;
import ax.P0.V;
import ax.P0.a0;
import ax.P0.n;
import ax.P0.v;
import ax.P0.y;
import ax.S0.d0;
import ax.S0.u;
import ax.Y0.b;
import ax.Y0.c;
import ax.Z0.c;
import ax.a1.B;
import ax.i1.B;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Locale;

public class a
implements ax.Z0.c {
    private static final NumberFormat e;
    private final String a;
    private final N.c b;
    private final N.b c;
    private final long d;

    static {
        NumberFormat numberFormat;
        e = numberFormat = NumberFormat.getInstance(Locale.US);
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    @Deprecated
    public a(ax.l1.G g8) {
        this("EventLogger");
    }

    public a(String string) {
        this.a = string;
        this.b = new N.c();
        this.c = new N.b();
        this.d = SystemClock.elapsedRealtime();
    }

    private static String A0(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        if (n8 != 5) {
                            return "?";
                        }
                        return "END_OF_MEDIA_ITEM";
                    }
                    return "REMOTE";
                }
                return "AUDIO_BECOMING_NOISY";
            }
            return "AUDIO_FOCUS_LOSS";
        }
        return "USER_REQUEST";
    }

    private static String B0(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        return "?";
                    }
                    return "SCRUBBING";
                }
                return "UNSUITABLE_AUDIO_OUTPUT";
            }
            return "TRANSIENT_AUDIO_FOCUS_LOSS";
        }
        return "NONE";
    }

    private static String C0(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    return "?";
                }
                return "ALL";
            }
            return "ONE";
        }
        return "OFF";
    }

    private static String D0(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        return "?";
                    }
                    return "ENDED";
                }
                return "READY";
            }
            return "BUFFERING";
        }
        return "IDLE";
    }

    private static String E0(long l8) {
        if (l8 == -9223372036854775807L) {
            return "?";
        }
        return e.format((float)l8 / 1000.0f);
    }

    private static String F0(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                return "?";
            }
            return "SOURCE_UPDATE";
        }
        return "PLAYLIST_CHANGED";
    }

    private static String G0(boolean bl) {
        if (bl) {
            return "[X]";
        }
        return "[ ]";
    }

    private String H(c.a object, String object2, String string, Throwable throwable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object2);
        stringBuilder.append(" [");
        stringBuilder.append(this.J((c.a)object));
        object2 = object = stringBuilder.toString();
        if (throwable instanceof F) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(", errorCode=");
            ((StringBuilder)object2).append(((F)throwable).a());
            object2 = ((StringBuilder)object2).toString();
        }
        object = object2;
        if (string != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(", ");
            ((StringBuilder)object).append(string);
            object = ((StringBuilder)object).toString();
        }
        string = u.e(throwable);
        object2 = object;
        if (!TextUtils.isEmpty((CharSequence)string)) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append("\n  ");
            ((StringBuilder)object2).append(string.replace("\n", "\n  "));
            ((StringBuilder)object2).append('\n');
            object2 = ((StringBuilder)object2).toString();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append("]");
        return ((StringBuilder)object).toString();
    }

    private void H0(c.a a8, String string) {
        this.J0(this.H(a8, string, null, null));
    }

    private void I0(c.a a8, String string, String string2) {
        this.J0(this.H(a8, string, string2, null));
    }

    private String J(c.a a8) {
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("window=");
        ((StringBuilder)charSequence).append(a8.c);
        CharSequence charSequence2 = ((StringBuilder)charSequence).toString();
        charSequence = charSequence2;
        if (a8.d != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)charSequence2);
            ((StringBuilder)charSequence).append(", period=");
            ((StringBuilder)charSequence).append(a8.b.b(a8.d.a));
            charSequence2 = ((StringBuilder)charSequence).toString();
            charSequence = charSequence2;
            if (a8.d.b()) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)charSequence2);
                ((StringBuilder)charSequence).append(", adGroup=");
                ((StringBuilder)charSequence).append(a8.d.b);
                charSequence2 = ((StringBuilder)charSequence).toString();
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)charSequence2);
                ((StringBuilder)charSequence).append(", ad=");
                ((StringBuilder)charSequence).append(a8.d.c);
                charSequence = ((StringBuilder)charSequence).toString();
            }
        }
        charSequence2 = new StringBuilder();
        ((StringBuilder)charSequence2).append("eventTime=");
        ((StringBuilder)charSequence2).append(ax.n1.a.E0(a8.a - this.d));
        ((StringBuilder)charSequence2).append(", mediaPos=");
        ((StringBuilder)charSequence2).append(ax.n1.a.E0(a8.e));
        ((StringBuilder)charSequence2).append(", ");
        ((StringBuilder)charSequence2).append((String)charSequence);
        return ((StringBuilder)charSequence2).toString();
    }

    private void K0(c.a a8, String string, String string2, Throwable throwable) {
        this.M0(this.H(a8, string, string2, throwable));
    }

    private void L0(c.a a8, String string, Throwable throwable) {
        this.M0(this.H(a8, string, null, throwable));
    }

    private void N0(c.a a8, String string, Exception exception) {
        this.K0(a8, "internalError", string, exception);
    }

    private void O0(C c8, String string) {
        for (int i8 = 0; i8 < c8.e(); ++i8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(c8.d(i8));
            this.J0(stringBuilder.toString());
        }
    }

    private static String o(B.a a8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a8.a);
        stringBuilder.append(",");
        stringBuilder.append(a8.c);
        stringBuilder.append(",");
        stringBuilder.append(a8.b);
        stringBuilder.append(",");
        stringBuilder.append(a8.d);
        stringBuilder.append(",");
        stringBuilder.append(a8.e);
        stringBuilder.append(",");
        stringBuilder.append(a8.f);
        return stringBuilder.toString();
    }

    private static String y(int n8) {
        switch (n8) {
            default: {
                return "?";
            }
            case 6: {
                return "SILENCE_SKIP";
            }
            case 5: {
                return "INTERNAL";
            }
            case 4: {
                return "REMOVE";
            }
            case 3: {
                return "SKIP";
            }
            case 2: {
                return "SEEK_ADJUSTMENT";
            }
            case 1: {
                return "SEEK";
            }
            case 0: 
        }
        return "AUTO_TRANSITION";
    }

    private static String z0(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        return "?";
                    }
                    return "PLAYLIST_CHANGED";
                }
                return "SEEK";
            }
            return "AUTO";
        }
        return "REPEAT";
    }

    @Override
    public void A(c.a a8) {
        this.H0(a8, "drmKeysRestored");
    }

    @Override
    public void B(c.a a8, int n8) {
        this.I0(a8, "audioSessionId", Integer.toString(n8));
    }

    @Override
    public void C(c.a a8, long l8) {
        long l9 = System.currentTimeMillis();
        long l10 = SystemClock.elapsedRealtime();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("since ");
        stringBuilder.append(ax.n1.a.E0(l8 - l9 + l10 - this.d));
        this.I0(a8, "audioPositionAdvancing", stringBuilder.toString());
    }

    @Override
    public void D(c.a object, V object2) {
        int n8;
        int n9;
        Object object3 = new StringBuilder();
        ((StringBuilder)object3).append("tracks [");
        ((StringBuilder)object3).append(this.J((c.a)object));
        this.J0(((StringBuilder)object3).toString());
        object = ((V)object2).a();
        for (n9 = 0; n9 < ((AbstractCollection)object).size(); ++n9) {
            object2 = (V.a)object.get(n9);
            object3 = new StringBuilder();
            ((StringBuilder)object3).append("  group [ id=");
            ((StringBuilder)object3).append(((V.a)object2).a().b);
            this.J0(((StringBuilder)object3).toString());
            for (n8 = 0; n8 < ((V.a)object2).a; ++n8) {
                String string = ax.n1.a.G0(((V.a)object2).i(n8));
                String string2 = d0.d0(((V.a)object2).c(n8));
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("    ");
                ((StringBuilder)object3).append(string);
                ((StringBuilder)object3).append(" Track:");
                ((StringBuilder)object3).append(n8);
                ((StringBuilder)object3).append(", ");
                ((StringBuilder)object3).append(v.l(((V.a)object2).b(n8)));
                ((StringBuilder)object3).append(", supported=");
                ((StringBuilder)object3).append(string2);
                this.J0(((StringBuilder)object3).toString());
            }
            this.J0("  ]");
        }
        boolean bl = false;
        for (n9 = 0; !bl && n9 < ((AbstractCollection)object).size(); ++n9) {
            object3 = (V.a)object.get(n9);
            for (n8 = 0; !bl && n8 < ((V.a)object3).a; ++n8) {
                boolean bl2 = bl;
                if (((V.a)object3).i(n8)) {
                    object2 = ((V.a)object3).b((int)n8).l;
                    bl2 = bl;
                    if (object2 != null) {
                        bl2 = bl;
                        if (((C)object2).e() > 0) {
                            this.J0("  Metadata [");
                            this.O0((C)object2, "    ");
                            this.J0("  ]");
                            bl2 = true;
                        }
                    }
                }
                bl = bl2;
            }
        }
        this.J0("]");
    }

    @Override
    public void E(c.a a8, b b8) {
        this.H0(a8, "videoEnabled");
    }

    @Override
    public void F(c.a a8, ax.i1.y y8, B b8, IOException iOException, boolean bl) {
        this.N0(a8, "loadError", iOException);
    }

    @Override
    public void G(c.a a8, y object, int n8) {
        object = new StringBuilder();
        ((StringBuilder)object).append("mediaItem [");
        ((StringBuilder)object).append(this.J(a8));
        ((StringBuilder)object).append(", reason=");
        ((StringBuilder)object).append(ax.n1.a.z0(n8));
        ((StringBuilder)object).append("]");
        this.J0(((StringBuilder)object).toString());
    }

    @Override
    public void I(c.a a8, int n8) {
        this.I0(a8, "repeatMode", ax.n1.a.C0(n8));
    }

    protected void J0(String string) {
        u.b(this.a, string);
    }

    @Override
    public void K(c.a a8) {
        this.H0(a8, "drmSessionReleased");
    }

    @Override
    public /* synthetic */ void L(c.a a8, ax.R0.c c8) {
        ax.Z0.b.q(this, a8, c8);
    }

    @Override
    public /* synthetic */ void M(c.a a8) {
        ax.Z0.b.x(this, a8);
    }

    protected void M0(String string) {
        u.c(this.a, string);
    }

    @Override
    public /* synthetic */ void N(c.a a8, ax.i1.y y8, B b8, int n8) {
        ax.Z0.b.I(this, a8, y8, b8, n8);
    }

    @Override
    public void O(c.a a8, int n8) {
        int n9 = a8.b.i();
        int n10 = a8.b.p();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("timeline [");
        stringBuilder.append(this.J(a8));
        stringBuilder.append(", periodCount=");
        stringBuilder.append(n9);
        stringBuilder.append(", windowCount=");
        stringBuilder.append(n10);
        stringBuilder.append(", reason=");
        stringBuilder.append(ax.n1.a.F0(n8));
        this.J0(stringBuilder.toString());
        int n11 = 0;
        for (n8 = 0; n8 < Math.min(n9, 3); ++n8) {
            a8.b.f(n8, this.c);
            stringBuilder = new StringBuilder();
            stringBuilder.append("  period [");
            stringBuilder.append(ax.n1.a.E0(this.c.j()));
            stringBuilder.append("]");
            this.J0(stringBuilder.toString());
        }
        n8 = n11;
        if (n9 > 3) {
            this.J0("  ...");
            n8 = n11;
        }
        while (n8 < Math.min(n10, 3)) {
            a8.b.n(n8, this.b);
            stringBuilder = new StringBuilder();
            stringBuilder.append("  window [");
            stringBuilder.append(ax.n1.a.E0(this.b.d()));
            stringBuilder.append(", seekable=");
            stringBuilder.append(this.b.h);
            stringBuilder.append(", dynamic=");
            stringBuilder.append(this.b.i);
            stringBuilder.append("]");
            this.J0(stringBuilder.toString());
            ++n8;
        }
        if (n10 > 3) {
            this.J0("  ...");
        }
        this.J0("]");
    }

    @Override
    public void P(c.a a8, boolean bl) {
        this.I0(a8, "isPlaying", Boolean.toString(bl));
    }

    @Override
    public void Q(c.a a8, int n8, long l8, long l9) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n8);
        stringBuilder.append(", ");
        stringBuilder.append(l8);
        stringBuilder.append(", ");
        stringBuilder.append(l9);
        this.K0(a8, "audioTrackUnderrun", stringBuilder.toString(), null);
    }

    @Override
    public /* synthetic */ void R(c.a a8, ax.i1.y y8, B b8) {
        ax.Z0.b.H(this, a8, y8, b8);
    }

    @Override
    public /* synthetic */ void S(c.a a8, ax.i1.y y8, B b8) {
        ax.Z0.b.G(this, a8, y8, b8);
    }

    @Override
    public void T(c.a a8, int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state=");
        stringBuilder.append(n8);
        this.I0(a8, "drmSessionAcquired", stringBuilder.toString());
    }

    @Override
    public /* synthetic */ void U(c.a a8, ax.i1.y y8, B b8) {
        ax.Z0.b.F(this, a8, y8, b8);
    }

    @Override
    public void V(c.a a8, String string, long l8, long l9) {
        this.I0(a8, "videoDecoderInitialized", string);
    }

    @Override
    public /* synthetic */ void W(c.a a8, T t8) {
        ax.Z0.b.d0(this, a8, t8);
    }

    @Override
    public void X(c.a a8, B.a a9) {
        this.I0(a8, "audioTrackInit", ax.n1.a.o(a9));
    }

    @Override
    public /* synthetic */ void Y(c.a a8, int n8, boolean bl) {
        ax.Z0.b.t(this, a8, n8, bl);
    }

    @Override
    public /* synthetic */ void Z(c.a a8, long l8, int n8) {
        ax.Z0.b.l0(this, a8, l8, n8);
    }

    @Override
    public void a(c.a a8, B b8) {
        this.I0(a8, "downstreamFormat", v.l(b8.c));
    }

    @Override
    public void a0(c.a a8, a0 a02) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("w=");
        stringBuilder.append(a02.a);
        stringBuilder.append(", h=");
        stringBuilder.append(a02.b);
        stringBuilder = new StringBuilder(stringBuilder.toString());
        if (a02.d != 1.0f) {
            stringBuilder.append(", par=");
            stringBuilder.append(a02.d);
        }
        this.I0(a8, "videoSize", stringBuilder.toString());
    }

    @Override
    public void b(c.a a8, String string) {
        this.I0(a8, "audioDecoderReleased", string);
    }

    @Override
    public void b0(c.a a8, H.e e8, H.e e9, int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("reason=");
        stringBuilder.append(ax.n1.a.y(n8));
        stringBuilder.append(", PositionInfo:old [");
        stringBuilder.append(e8);
        stringBuilder.append("], PositionInfo:new [");
        stringBuilder.append(e9);
        stringBuilder.append("]");
        this.I0(a8, "positionDiscontinuity", stringBuilder.toString());
    }

    @Override
    public /* synthetic */ void c(c.a a8) {
        ax.Z0.b.Y(this, a8);
    }

    @Override
    public void c0(c.a a8, G g8) {
        this.I0(a8, "playbackParameters", g8.toString());
    }

    @Override
    public /* synthetic */ void d(c.a a8, n n8) {
        ax.Z0.b.s(this, a8, n8);
    }

    @Override
    public /* synthetic */ void d0(H h8, c.b b8) {
        ax.Z0.b.C(this, h8, b8);
    }

    @Override
    public /* synthetic */ void e(c.a a8, Exception exception) {
        ax.Z0.b.k(this, a8, exception);
    }

    @Override
    public void e0(c.a a8, B.a a9) {
        this.I0(a8, "audioTrackReleased", ax.n1.a.o(a9));
    }

    @Override
    public void f(c.a a8, int n8, int n9) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("w=");
        stringBuilder.append(n8);
        stringBuilder.append(", h=");
        stringBuilder.append(n9);
        this.I0(a8, "surfaceSize", stringBuilder.toString());
    }

    @Override
    public /* synthetic */ void f0(c.a a8, A a9) {
        ax.Z0.b.L(this, a8, a9);
    }

    @Override
    public /* synthetic */ void g(c.a a8) {
        ax.Z0.b.S(this, a8);
    }

    @Override
    public void g0(c.a a8, Object object, long l8) {
        this.I0(a8, "renderedFirstFrame", String.valueOf(object));
    }

    @Override
    public void h(c.a a8, B b8) {
        this.I0(a8, "upstreamDiscarded", v.l(b8.c));
    }

    @Override
    public void h0(c.a a8, float f8) {
        this.I0(a8, "volume", Float.toString(f8));
    }

    @Override
    public void i(c.a a8) {
        this.H0(a8, "drmKeysRemoved");
    }

    @Override
    public /* synthetic */ void i0(c.a a8, String string, long l8) {
        ax.Z0.b.c(this, a8, string, l8);
    }

    @Override
    public void j(c.a a8, ax.P0.c c8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c8.a);
        stringBuilder.append(",");
        stringBuilder.append(c8.b);
        stringBuilder.append(",");
        stringBuilder.append(c8.c);
        stringBuilder.append(",");
        stringBuilder.append(c8.d);
        this.I0(a8, "audioAttributes", stringBuilder.toString());
    }

    @Override
    public /* synthetic */ void j0(c.a a8, F f8) {
        ax.Z0.b.R(this, a8, f8);
    }

    public /* synthetic */ void k(c.a a8, List list) {
        ax.Z0.b.r(this, a8, list);
    }

    @Override
    public void k0(c.a a8, v v8, c c8) {
        this.I0(a8, "videoInputFormat", v.l(v8));
    }

    @Override
    public /* synthetic */ void l(c.a a8, String string, long l8) {
        ax.Z0.b.h0(this, a8, string, l8);
    }

    @Override
    public void l0(c.a a8, int n8, int n9, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("rendererIndex=");
        stringBuilder.append(n8);
        stringBuilder.append(", ");
        stringBuilder.append(d0.v0(n9));
        stringBuilder.append(", ");
        stringBuilder.append(bl);
        this.I0(a8, "rendererReady", stringBuilder.toString());
    }

    @Override
    public void m(c.a a8, v v8, c c8) {
        this.I0(a8, "audioInputFormat", v.l(v8));
    }

    @Override
    public /* synthetic */ void m0(c.a a8, boolean bl, int n8) {
        ax.Z0.b.T(this, a8, bl, n8);
    }

    @Override
    public void n(c.a a8, boolean bl) {
        this.I0(a8, "skipSilenceEnabled", Boolean.toString(bl));
    }

    @Override
    public /* synthetic */ void n0(c.a a8, boolean bl) {
        ax.Z0.b.J(this, a8, bl);
    }

    @Override
    public void o0(c.a a8, boolean bl) {
        this.I0(a8, "loading", Boolean.toString(bl));
    }

    @Override
    public void p(c.a a8, F f8) {
        this.L0(a8, "playerFailed", f8);
    }

    @Override
    public void p0(c.a a8, String string, long l8, long l9) {
        this.I0(a8, "audioDecoderInitialized", string);
    }

    @Override
    public /* synthetic */ void q(c.a a8, Exception exception) {
        ax.Z0.b.g0(this, a8, exception);
    }

    @Override
    public void q0(c.a a8, C c8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("metadata [");
        stringBuilder.append(this.J(a8));
        this.J0(stringBuilder.toString());
        this.O0(c8, "  ");
        this.J0("]");
    }

    @Override
    public void r(c.a a8, b b8) {
        this.H0(a8, "audioEnabled");
    }

    @Override
    public /* synthetic */ void r0(c.a a8, int n8) {
        ax.Z0.b.U(this, a8, n8);
    }

    @Override
    public /* synthetic */ void s(c.a a8, int n8, int n9, int n10, float f8) {
        ax.Z0.b.n0(this, a8, n8, n9, n10, f8);
    }

    @Override
    public /* synthetic */ void s0(c.a a8, H.b b8) {
        ax.Z0.b.o(this, a8, b8);
    }

    @Override
    public /* synthetic */ void t(c.a a8, Exception exception) {
        ax.Z0.b.b(this, a8, exception);
    }

    @Override
    public void t0(c.a a8, String string) {
        this.I0(a8, "videoDecoderReleased", string);
    }

    @Override
    public void u(c.a a8, b b8) {
        this.H0(a8, "audioDisabled");
    }

    @Override
    public void u0(c.a a8, Exception exception) {
        this.N0(a8, "drmSessionManagerError", exception);
    }

    @Override
    public void v(c.a a8, boolean bl, int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bl);
        stringBuilder.append(", ");
        stringBuilder.append(ax.n1.a.A0(n8));
        this.I0(a8, "playWhenReady", stringBuilder.toString());
    }

    @Override
    public void v0(c.a a8, b b8) {
        this.H0(a8, "videoDisabled");
    }

    @Override
    public void w(c.a a8, int n8) {
        this.I0(a8, "state", ax.n1.a.D0(n8));
    }

    @Override
    public /* synthetic */ void w0(c.a a8, int n8, long l8, long l9) {
        ax.Z0.b.p(this, a8, n8, l8, l9);
    }

    @Override
    public void x(c.a a8, boolean bl) {
        this.I0(a8, "shuffleModeEnabled", Boolean.toString(bl));
    }

    @Override
    public void x0(c.a a8, int n8) {
        this.I0(a8, "playbackSuppressionReason", ax.n1.a.B0(n8));
    }

    @Override
    public void y0(c.a a8) {
        this.H0(a8, "drmKeysLoaded");
    }

    @Override
    public void z(c.a a8, int n8, long l8) {
        this.I0(a8, "droppedFrames", Integer.toString(n8));
    }
}

