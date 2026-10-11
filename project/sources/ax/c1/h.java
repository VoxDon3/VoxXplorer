package ax.c1;

import android.text.TextUtils;
import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.C0912v;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class h implements C.a {
    public final String a;
    public final String b;
    public final List<a> c;

    public static final class a {
        public final int a;
        public final int b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public a(int i, int i2, String str, String str2, String str3, String str4) {
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.b == aVar.b && TextUtils.equals(this.c, aVar.c) && TextUtils.equals(this.d, aVar.d) && TextUtils.equals(this.e, aVar.e) && TextUtils.equals(this.f, aVar.f)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public h(String str, String str2, List<a> list) {
        this.a = str;
        this.b = str2;
        this.c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override // ax.P0.C.a
    public /* synthetic */ C0912v a() {
        return B.b(this);
    }

    @Override // ax.P0.C.a
    public /* synthetic */ void b(A.b bVar) {
        B.c(this, bVar);
    }

    @Override // ax.P0.C.a
    public /* synthetic */ byte[] c() {
        return B.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (TextUtils.equals(this.a, hVar.a) && TextUtils.equals(this.b, hVar.b) && this.c.equals(hVar.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HlsTrackMetadataEntry");
        if (this.a != null) {
            str = " [" + this.a + ", " + this.b + "]";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        return sb.toString();
    }
}
