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
import ax.P0.C0900i;
import ax.P0.C0906o;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.Z0.I1;
import ax.b1.E;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class O implements E {
    public static final E.c d = new E.c() { // from class: ax.b1.I
        @Override // ax.b1.E.c
        public final E a(UUID uuid) {
            return O.o(uuid);
        }
    };
    private final UUID a;
    private final MediaDrm b;
    private int c;

    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str, int i) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str, i);
            return requiresSecureDecoder;
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, I1 i1) {
            LogSessionId logSessionId;
            boolean equals;
            MediaDrm.PlaybackComponent playbackComponent;
            LogSessionId a = i1.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a.equals(logSessionId);
            if (equals) {
                return;
            }
            playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            L.a(C0968a.e(playbackComponent)).setLogSessionId(a);
        }
    }

    private O(UUID uuid) throws UnsupportedSchemeException {
        C0968a.e(uuid);
        C0968a.b(!C0900i.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm(v(uuid));
        this.b = mediaDrm;
        this.c = 1;
        if (C0900i.d.equals(uuid) && C()) {
            y(mediaDrm);
        }
    }

    private static C0906o.b A(UUID uuid, List<C0906o.b> list) {
        if (!C0900i.d.equals(uuid)) {
            return list.get(0);
        }
        if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
            C0906o.b bVar = list.get(0);
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                C0906o.b bVar2 = list.get(i2);
                byte[] bArr = (byte[]) C0968a.e(bVar2.f0);
                if (Objects.equals(bVar2.e0, bVar.e0) && Objects.equals(bVar2.d0, bVar.d0) && ax.K1.p.c(bArr)) {
                    i += bArr.length;
                }
            }
            byte[] bArr2 = new byte[i];
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                byte[] bArr3 = (byte[]) C0968a.e(list.get(i4).f0);
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i3, length);
                i3 += length;
            }
            return bVar.a(bArr2);
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            C0906o.b bVar3 = list.get(i5);
            int g = ax.K1.p.g((byte[]) C0968a.e(bVar3.f0));
            int i6 = Build.VERSION.SDK_INT;
            if ((i6 < 23 && g == 0) || (i6 >= 23 && g == 1)) {
                return bVar3;
            }
        }
        return list.get(0);
    }

    private boolean B() {
        if (!this.a.equals(C0900i.d)) {
            return this.a.equals(C0900i.c);
        }
        String z = z("version");
        return (z.startsWith("v5.") || z.startsWith("14.") || z.startsWith("15.") || z.startsWith("16.0")) ? false : true;
    }

    private static boolean C() {
        return "ASUS_Z00AD".equals(Build.MODEL);
    }

    public static O D(UUID uuid) throws U {
        try {
            return new O(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new U(1, e);
        } catch (Exception e2) {
            throw new U(2, e2);
        }
    }

    public static /* synthetic */ E o(UUID uuid) {
        try {
            return D(uuid);
        } catch (U unused) {
            C0987u.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new C1450B();
        }
    }

    public static /* synthetic */ void p(O o, E.b bVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        o.getClass();
        bVar.a(o, bArr, i, i2, bArr2);
    }

    private static byte[] q(byte[] bArr) {
        ax.S0.G g = new ax.S0.G(bArr);
        int z = g.z();
        short B = g.B();
        short B2 = g.B();
        if (B != 1 || B2 != 1) {
            C0987u.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short B3 = g.B();
        Charset charset = StandardCharsets.UTF_16LE;
        String K = g.K(B3, charset);
        if (K.contains("<LA_URL>")) {
            return bArr;
        }
        int indexOf = K.indexOf("</DATA>");
        if (indexOf == -1) {
            C0987u.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = K.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + K.substring(indexOf);
        int i = z + 52;
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i);
        allocate.putShort(B);
        allocate.putShort(B2);
        allocate.putShort((short) (str.length() * 2));
        allocate.put(str.getBytes(charset));
        return allocate.array();
    }

    private String r(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(str)) {
            String z = z("version");
            if (Objects.equals(z, "1.2") || Objects.equals(z, "aidl-1")) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
        }
        return str;
    }

    private static byte[] s(UUID uuid, byte[] bArr) {
        return C0900i.c.equals(uuid) ? C1452a.a(bArr) : bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if ("AFTT".equals(r0) == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] t(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = ax.P0.C0900i.e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = ax.K1.p.e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = q(r4)
            byte[] r4 = ax.K1.p.a(r0, r4)
        L18:
            boolean r1 = w(r3)
            if (r1 == 0) goto L2e
            ax.K1.p$a r1 = ax.K1.p.d(r4)
            if (r1 == 0) goto L2e
            java.util.UUID r4 = ax.P0.C0900i.b
            java.util.UUID[] r2 = r1.d
            byte[] r1 = r1.c
            byte[] r4 = ax.K1.p.b(r4, r2, r1)
        L2e:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 >= r2) goto L3c
            java.util.UUID r1 = ax.P0.C0900i.d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L6e
        L3c:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L75
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L75
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L6e
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L75
        L6e:
            byte[] r3 = ax.K1.p.e(r4, r3)
            if (r3 == 0) goto L75
            return r3
        L75:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.b1.O.t(java.util.UUID, byte[]):byte[]");
    }

    private static String u(UUID uuid, String str) {
        return (Build.VERSION.SDK_INT < 26 && C0900i.c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static UUID v(UUID uuid) {
        return w(uuid) ? C0900i.b : uuid;
    }

    private static boolean w(UUID uuid) {
        return Build.VERSION.SDK_INT < 27 && Objects.equals(uuid, C0900i.c);
    }

    private static void y(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    @Override // ax.b1.E
    public Map<String, String> a(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // ax.b1.E
    public E.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new E.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // ax.b1.E
    public synchronized void d() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override // ax.b1.E
    public byte[] e() throws MediaDrmException {
        return this.b.openSession();
    }

    @Override // ax.b1.E
    public boolean f(byte[] bArr, String str) {
        MediaCrypto mediaCrypto;
        int securityLevel;
        if (Build.VERSION.SDK_INT >= 31 && B()) {
            MediaDrm mediaDrm = this.b;
            securityLevel = mediaDrm.getSecurityLevel(bArr);
            return a.a(mediaDrm, str, securityLevel);
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto(v(this.a), bArr);
            } catch (Throwable th) {
                th = th;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean requiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return requiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z = !this.a.equals(C0900i.c);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }

    @Override // ax.b1.E
    public void g(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // ax.b1.E
    public void h(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // ax.b1.E
    public void i(byte[] bArr, I1 i1) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                a.b(this.b, bArr, i1);
            } catch (UnsupportedOperationException unused) {
                C0987u.h("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // ax.b1.E
    public byte[] j(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (C0900i.c.equals(this.a)) {
            bArr2 = C1452a.b(bArr2);
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // ax.b1.E
    public void k(final E.b bVar) {
        this.b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: ax.b1.J
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                O.p(O.this, bVar, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    @Override // ax.b1.E
    public void l(byte[] bArr) throws DeniedByServerException {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // ax.b1.E
    @SuppressLint({"WrongConstant"})
    public E.a m(byte[] bArr, List<C0906o.b> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException {
        C0906o.b bVar;
        byte[] bArr2;
        String str;
        if (list != null) {
            bVar = A(this.a, list);
            bArr2 = t(this.a, (byte[]) C0968a.e(bVar.f0));
            str = u(this.a, bVar.e0);
        } else {
            bVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.b.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] s = s(this.a, keyRequest.getData());
        String r = r(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(r) && bVar != null && !TextUtils.isEmpty(bVar.d0)) {
            r = bVar.d0;
        }
        return new E.a(s, r, Build.VERSION.SDK_INT >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // ax.b1.E
    public int n() {
        return 2;
    }

    @Override // ax.b1.E
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public F c(byte[] bArr) throws MediaCryptoException {
        return new F(v(this.a), bArr);
    }

    public String z(String str) {
        return this.b.getPropertyString(str);
    }
}
