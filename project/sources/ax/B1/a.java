package ax.B1;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.C0912v;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements C.a {
    private static final C0912v g = new C0912v.b().y0("application/id3").P();
    private static final C0912v h = new C0912v.b().y0("application/x-scte35").P();
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    private int f;

    public a(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // ax.P0.C.a
    public C0912v a() {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    @Override // ax.P0.C.a
    public /* synthetic */ void b(A.b bVar) {
        B.c(this, bVar);
    }

    @Override // ax.P0.C.a
    public byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.c == aVar.c && this.d == aVar.d && Objects.equals(this.a, aVar.a) && Objects.equals(this.b, aVar.b) && Arrays.equals(this.e, aVar.e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f == 0) {
            String str = this.a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.b;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.c;
            int i = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.f = ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.e);
        }
        return this.f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
