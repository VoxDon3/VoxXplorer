package ax.b1;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.os.Build;
import ax.S0.d0;
import ax.U0.k;
import ax.Z0.s1;
import ax.b1.C1459h;
import ax.s7.C3055b;
import java.util.List;
import java.util.Map;

/* renamed from: ax.b1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1449A {

    /* renamed from: ax.b1.A$a */
    private static final class a {
        public static boolean a(Throwable th) {
            return s1.a(th);
        }
    }

    public static byte[] a(ax.U0.g gVar, String str, byte[] bArr, Map<String, String> map) throws T {
        ax.U0.y yVar = new ax.U0.y(gVar);
        ax.U0.k a2 = new k.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i = 0;
        ax.U0.k kVar = a2;
        while (true) {
            try {
                ax.U0.i iVar = new ax.U0.i(yVar, kVar);
                try {
                    try {
                        byte[] g = C3055b.g(iVar);
                        d0.n(iVar);
                        return g;
                    } catch (ax.U0.u e) {
                        String c = c(e, i);
                        if (c == null) {
                            throw e;
                        }
                        i++;
                        kVar = kVar.a().j(c).a();
                        d0.n(iVar);
                    }
                } catch (Throwable th) {
                    d0.n(iVar);
                    throw th;
                }
            } catch (Exception e2) {
                throw new T(a2, yVar.r(), yVar.l(), yVar.q(), e2);
            }
        }
    }

    public static int b(Throwable th, int i) {
        if (th instanceof MediaDrm.MediaDrmStateException) {
            return d0.b0(d0.c0(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
        if (Build.VERSION.SDK_INT >= 23 && a.a(th)) {
            return 6006;
        }
        if ((th instanceof NotProvisionedException) || d(th)) {
            return 6002;
        }
        if (th instanceof DeniedByServerException) {
            return 6007;
        }
        if (th instanceof U) {
            return 6001;
        }
        if (th instanceof C1459h.e) {
            return 6003;
        }
        if (th instanceof Q) {
            return 6008;
        }
        if (i == 1) {
            return 6006;
        }
        if (i == 2) {
            return 6004;
        }
        if (i == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    private static String c(ax.U0.u uVar, int i) {
        Map<String, List<String>> map;
        List<String> list;
        int i2 = uVar.e0;
        if ((i2 != 307 && i2 != 308) || i >= 5 || (map = uVar.g0) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static boolean d(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean e(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
