/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.os.Build;
import ax.S0.d0;
import ax.U0.g;
import ax.U0.i;
import ax.U0.k;
import ax.U0.u;
import ax.U0.y;
import ax.Z0.s1;
import ax.b1.Q;
import ax.b1.T;
import ax.b1.U;
import ax.b1.h;
import ax.s7.b;
import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public final class A {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static byte[] a(g object, String object2, byte[] object3, Map<String, String> object4) throws T {
        Throwable throwable22;
        y y8 = new y((g)object);
        object2 = new k.b().j((String)object2).e((Map<String, String>)object4).d(2).c((byte[])object3).b(1).a();
        int n8 = 0;
        object = object2;
        while (true) {
            object3 = new i;
            object3(y8, (k)object);
            {
                catch (Exception exception) {
                    throw new T((k)object2, y8.r(), y8.l(), y8.q(), exception);
                }
            }
            object4 = b.g((InputStream)object3);
            d0.n((Closeable)object3);
            return object4;
            {
                catch (Throwable throwable22) {
                    break;
                }
                catch (u u8) {}
                {
                    object4 = A.c(u8, n8);
                    if (object4 == null) throw u8;
                    ++n8;
                }
                {
                    object = ((k)object).a().j((String)object4).a();
                }
                {
                    d0.n((Closeable)object3);
                    continue;
                }
            }
            break;
        }
        {
            d0.n((Closeable)object3);
            throw throwable22;
        }
    }

    public static int b(Throwable throwable, int n8) {
        if (throwable instanceof MediaDrm.MediaDrmStateException) {
            return d0.b0(d0.c0(((MediaDrm.MediaDrmStateException)throwable).getDiagnosticInfo()));
        }
        if (Build.VERSION.SDK_INT >= 23 && a.a(throwable)) {
            return 6006;
        }
        if (!(throwable instanceof NotProvisionedException) && !A.d(throwable)) {
            if (throwable instanceof DeniedByServerException) {
                return 6007;
            }
            if (throwable instanceof U) {
                return 6001;
            }
            if (throwable instanceof h.e) {
                return 6003;
            }
            if (throwable instanceof Q) {
                return 6008;
            }
            if (n8 == 1) {
                return 6006;
            }
            if (n8 == 2) {
                return 6004;
            }
            if (n8 == 3) {
                return 6002;
            }
            throw new IllegalArgumentException();
        }
        return 6002;
    }

    private static String c(u object, int n8) {
        int n9 = ((u)object).e0;
        if (!(n9 != 307 && n9 != 308 || n8 >= 5 || (object = ((u)object).g0) == null || (object = (List)object.get("Location")) == null || object.isEmpty())) {
            return (String)object.get(0);
        }
        return null;
    }

    public static boolean d(Throwable throwable) {
        return Build.VERSION.SDK_INT == 34 && throwable instanceof NoSuchMethodError && throwable.getMessage() != null && throwable.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean e(Throwable throwable) {
        return Build.VERSION.SDK_INT == 34 && throwable instanceof NoSuchMethodError && throwable.getMessage() != null && throwable.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    private static final class a {
        public static boolean a(Throwable throwable) {
            return s1.a(throwable);
        }
    }
}

