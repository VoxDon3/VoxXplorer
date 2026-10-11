package ax.b1;

import android.net.Uri;
import android.text.TextUtils;
import ax.P0.C0900i;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.U0.g;
import ax.U0.k;
import ax.b1.E;
import ax.r7.AbstractC2962A;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class P implements S {
    private final g.a a;
    private final String b;
    private final boolean c;
    private final Map<String, String> d;

    public P(String str, boolean z, g.a aVar) {
        C0968a.a((z && TextUtils.isEmpty(str)) ? false : true);
        this.a = aVar;
        this.b = str;
        this.c = z;
        this.d = new HashMap();
    }

    @Override // ax.b1.S
    public byte[] a(UUID uuid, E.d dVar) throws T {
        return C1449A.a(this.a.a(), dVar.b() + "&signedRequest=" + d0.H(dVar.a()), null, Collections.EMPTY_MAP);
    }

    @Override // ax.b1.S
    public byte[] b(UUID uuid, E.a aVar) throws T {
        String b = aVar.b();
        if (this.c || TextUtils.isEmpty(b)) {
            b = this.b;
        }
        if (TextUtils.isEmpty(b)) {
            k.b bVar = new k.b();
            Uri uri = Uri.EMPTY;
            throw new T(bVar.i(uri).a(), uri, AbstractC2962A.k(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = C0900i.e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : C0900i.c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.d) {
            hashMap.putAll(this.d);
        }
        return C1449A.a(this.a.a(), b, aVar.a(), hashMap);
    }

    public void c(String str, String str2) {
        C0968a.e(str);
        C0968a.e(str2);
        synchronized (this.d) {
            this.d.put(str, str2);
        }
    }
}
