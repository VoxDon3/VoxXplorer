/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.text.TextUtils;
import ax.K1.p;
import ax.P0.i;
import ax.P0.o;
import ax.S0.u;
import ax.Z0.G1;
import ax.Z0.H1;
import ax.Z0.I1;
import ax.b1.B;
import ax.b1.E;
import ax.b1.F;
import ax.b1.G;
import ax.b1.H;
import ax.b1.I;
import ax.b1.J;
import ax.b1.K;
import ax.b1.L;
import ax.b1.M;
import ax.b1.N;
import ax.b1.U;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class O
implements E {
    public static final E.c d = new I();
    private final UUID a;
    private final MediaDrm b;
    private int c;

    private O(UUID uUID) throws UnsupportedSchemeException {
        MediaDrm mediaDrm;
        ax.S0.a.e(uUID);
        ax.S0.a.b(i.b.equals(uUID) ^ true, "Use C.CLEARKEY_UUID instead");
        this.a = uUID;
        this.b = mediaDrm = new MediaDrm(O.v(uUID));
        this.c = 1;
        if (i.d.equals(uUID) && O.C()) {
            O.y(mediaDrm);
        }
    }

    private static o.b A(UUID object, List<o.b> list) {
        int n8;
        int n9;
        block6: {
            if (!i.d.equals(object)) {
                return list.get(0);
            }
            if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
                byte[] byArray;
                Object object2;
                object = list.get(0);
                n9 = 0;
                for (n8 = 0; n8 < list.size(); ++n8) {
                    object2 = list.get(n8);
                    byArray = ax.S0.a.e(((o.b)object2).f0);
                    if (j.Objects.equals((Object)((o.b)object2).e0, (Object)((o.b)object).e0) && j.Objects.equals((Object)((o.b)object2).d0, (Object)((o.b)object).d0) && p.c(byArray)) {
                        n9 += byArray.length;
                        continue;
                    }
                    break block6;
                }
                byArray = new byte[n9];
                n8 = 0;
                for (n9 = 0; n9 < list.size(); ++n9) {
                    object2 = ax.S0.a.e(list.get((int)n9).f0);
                    int n10 = ((Object)object2).length;
                    System.arraycopy(object2, 0, byArray, n8, n10);
                    n8 += n10;
                }
                return ((o.b)object).a(byArray);
            }
        }
        for (n9 = 0; n9 < list.size(); ++n9) {
            object = list.get(n9);
            n8 = p.g(ax.S0.a.e(((o.b)object).f0));
            int n11 = Build.VERSION.SDK_INT;
            if ((n11 >= 23 || n8 != 0) && (n11 < 23 || n8 != 1)) continue;
            return object;
        }
        return list.get(0);
    }

    private boolean B() {
        if (this.a.equals(i.d)) {
            String string = this.z("version");
            return !string.startsWith("v5.") && !string.startsWith("14.") && !string.startsWith("15.") && !string.startsWith("16.0");
        }
        return this.a.equals(i.c);
    }

    private static boolean C() {
        return "ASUS_Z00AD".equals(Build.MODEL);
    }

    public static O D(UUID object) throws U {
        try {
            object = new O((UUID)object);
            return object;
        }
        catch (Exception exception) {
            throw new U(2, exception);
        }
        catch (UnsupportedSchemeException unsupportedSchemeException) {
            throw new U(1, (Exception)((Object)unsupportedSchemeException));
        }
    }

    public static /* synthetic */ E o(UUID uUID) {
        try {
            O o8 = O.D(uUID);
            return o8;
        }
        catch (U u8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
            stringBuilder.append(uUID);
            stringBuilder.append(".");
            u.c("FrameworkMediaDrm", stringBuilder.toString());
            return new B();
        }
    }

    public static /* synthetic */ void p(O o8, E.b b8, MediaDrm mediaDrm, byte[] byArray, int n8, int n9, byte[] byArray2) {
        o8.getClass();
        b8.a(o8, byArray, n8, n9, byArray2);
    }

    private static byte[] q(byte[] object) {
        Object object2 = new ax.S0.G((byte[])object);
        int n8 = ((ax.S0.G)object2).z();
        short s8 = ((ax.S0.G)object2).B();
        short s9 = ((ax.S0.G)object2).B();
        if (s8 == 1 && s9 == 1) {
            Charset charset;
            int n9 = ((ax.S0.G)object2).B();
            if (((String)(object2 = ((ax.S0.G)object2).K(n9, charset = StandardCharsets.UTF_16LE))).contains("<LA_URL>")) {
                return object;
            }
            n9 = ((String)object2).indexOf("</DATA>");
            if (n9 == -1) {
                u.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(((String)object2).substring(0, n9));
            ((StringBuilder)object).append("<LA_URL>https://x</LA_URL>");
            ((StringBuilder)object).append(((String)object2).substring(n9));
            object2 = ((StringBuilder)object).toString();
            object = ByteBuffer.allocate(n8 += 52);
            ((ByteBuffer)object).order(ByteOrder.LITTLE_ENDIAN);
            ((ByteBuffer)object).putInt(n8);
            ((ByteBuffer)object).putShort(s8);
            ((ByteBuffer)object).putShort(s9);
            ((ByteBuffer)object).putShort((short)(((String)object2).length() * 2));
            ((ByteBuffer)object).put(((String)object2).getBytes(charset));
            return ((ByteBuffer)object).array();
        }
        u.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return object;
    }

    private String r(String string) {
        String string2;
        if ("<LA_URL>https://x</LA_URL>".equals(string)) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(string) && (j.Objects.equals((Object)(string2 = this.z("version")), (Object)"1.2") || j.Objects.equals((Object)string2, (Object)"aidl-1"))) {
            return "";
        }
        return string;
    }

    private static byte[] s(UUID uUID, byte[] byArray) {
        if (i.c.equals(uUID)) {
            return ax.b1.a.a(byArray);
        }
        return byArray;
    }

    private static byte[] t(UUID object, byte[] byArray) {
        UUID uUID = i.e;
        Object object2 = byArray;
        if (uUID.equals(object)) {
            object2 = p.e(byArray, (UUID)object);
            if (object2 != null) {
                byArray = object2;
            }
            object2 = p.a(uUID, O.q(byArray));
        }
        byArray = object2;
        if (O.w((UUID)object)) {
            p.a a8 = p.d(object2);
            byArray = object2;
            if (a8 != null) {
                byArray = p.b(i.b, a8.d, a8.c);
            }
        }
        if ((Build.VERSION.SDK_INT < 23 && i.d.equals(object) || uUID.equals(object) && "Amazon".equals(Build.MANUFACTURER) && ("AFTB".equals(object2 = (Object)Build.MODEL) || "AFTS".equals(object2) || "AFTM".equals(object2) || "AFTT".equals(object2))) && (object = (Object)p.e(byArray, (UUID)object)) != null) {
            return object;
        }
        return byArray;
    }

    private static String u(UUID uUID, String string) {
        if (Build.VERSION.SDK_INT < 26 && i.c.equals(uUID) && ("video/mp4".equals(string) || "audio/mp4".equals(string))) {
            return "cenc";
        }
        return string;
    }

    private static UUID v(UUID uUID) {
        UUID uUID2 = uUID;
        if (O.w(uUID)) {
            uUID2 = i.b;
        }
        return uUID2;
    }

    private static boolean w(UUID uUID) {
        return Build.VERSION.SDK_INT < 27 && j.Objects.equals((Object)uUID, (Object)i.c);
    }

    private static void y(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    @Override
    public Map<String, String> a(byte[] byArray) {
        return this.b.queryKeyStatus(byArray);
    }

    @Override
    public E.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new E.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void d() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        int n8;
                        this.c = n8 = this.c - 1;
                        if (n8 != 0) break block4;
                        this.b.release();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public byte[] e() throws MediaDrmException {
        return this.b.openSession();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean f(byte[] object, String string) {
        RuntimeException var1_5;
        Object object2;
        block9: {
            boolean bl;
            block11: {
                block10: {
                    boolean bl2;
                    MediaCrypto mediaCrypto;
                    byte[] byArray;
                    if (Build.VERSION.SDK_INT >= 31 && this.B()) {
                        MediaDrm mediaDrm = this.b;
                        return ax.b1.O$a.a(mediaDrm, string, H.a(mediaDrm, object));
                    }
                    Object var6_10 = null;
                    object2 = byArray = null;
                    try {
                        object2 = byArray;
                        mediaCrypto = new MediaCrypto(O.v(this.a), object);
                    }
                    catch (Throwable throwable) {
                        break block9;
                    }
                    catch (MediaCryptoException mediaCryptoException) {
                        object = var6_10;
                        break block10;
                    }
                    try {
                        bl2 = mediaCrypto.requiresSecureDecoderComponent(string);
                    }
                    catch (Throwable throwable) {
                        object2 = mediaCrypto;
                        break block9;
                    }
                    catch (MediaCryptoException mediaCryptoException) {
                        object = mediaCrypto;
                        break block10;
                    }
                    mediaCrypto.release();
                    return bl2;
                }
                object2 = object;
                {
                    bl = this.a.equals(i.c);
                    if (object == null) break block11;
                }
                object.release();
            }
            return bl ^ true;
        }
        if (object2 != null) {
            object2.release();
        }
        throw var1_5;
    }

    @Override
    public void g(byte[] byArray, byte[] byArray2) {
        this.b.restoreKeys(byArray, byArray2);
    }

    @Override
    public void h(byte[] byArray) {
        this.b.closeSession(byArray);
    }

    @Override
    public void i(byte[] byArray, I1 i12) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                ax.b1.O$a.b(this.b, byArray, i12);
                return;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                u.h("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override
    public byte[] j(byte[] byArray, byte[] byArray2) throws NotProvisionedException, DeniedByServerException {
        byte[] byArray3 = byArray2;
        if (i.c.equals(this.a)) {
            byArray3 = ax.b1.a.b(byArray2);
        }
        return this.b.provideKeyResponse(byArray, byArray3);
    }

    @Override
    public void k(E.b object) {
        MediaDrm mediaDrm = this.b;
        object = object == null ? null : new J(this, (E.b)object);
        mediaDrm.setOnEventListener((MediaDrm.OnEventListener)object);
    }

    @Override
    public void l(byte[] byArray) throws DeniedByServerException {
        this.b.provideProvisionResponse(byArray);
    }

    @Override
    @SuppressLint(value={"WrongConstant"})
    public E.a m(byte[] object, List<o.b> object2, int n8, HashMap<String, String> object3) throws NotProvisionedException {
        Object object4;
        byte[] byArray;
        if (object2 != null) {
            object2 = O.A(this.a, object2);
            byArray = O.t(this.a, ax.S0.a.e(((o.b)object2).f0));
            object4 = O.u(this.a, ((o.b)object2).e0);
        } else {
            object2 = null;
            byArray = null;
            object4 = null;
        }
        object4 = this.b.getKeyRequest(object, byArray, object4, n8, object3);
        byArray = O.s(this.a, object4.getData());
        object3 = this.r(object4.getDefaultUrl());
        object = object3;
        if (TextUtils.isEmpty((CharSequence)object3)) {
            object = object3;
            if (object2 != null) {
                object = object3;
                if (!TextUtils.isEmpty((CharSequence)((o.b)object2).d0)) {
                    object = ((o.b)object2).d0;
                }
            }
        }
        n8 = Build.VERSION.SDK_INT >= 23 ? G.a(object4) : Integer.MIN_VALUE;
        return new E.a(byArray, (String)object, n8);
    }

    @Override
    public int n() {
        return 2;
    }

    public F x(byte[] byArray) throws MediaCryptoException {
        return new F(O.v(this.a), byArray);
    }

    public String z(String string) {
        return this.b.getPropertyString(string);
    }

    private static class a {
        public static boolean a(MediaDrm mediaDrm, String string, int n8) {
            return N.a(mediaDrm, string, n8);
        }

        public static void b(MediaDrm mediaDrm, byte[] byArray, I1 i12) {
            if (!H1.a((LogSessionId)(i12 = i12.a()), G1.a())) {
                M.a(L.a(ax.S0.a.e(K.a(mediaDrm, byArray))), (LogSessionId)i12);
            }
        }
    }
}

