package ax.i5;

import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
class i {
    private g a;
    private String b;

    private i() {
    }

    static void a(i iVar, i iVar2) {
        g c = iVar.c();
        g c2 = iVar.c();
        c2.F(c.h());
        c2.J(c.k());
        c2.K(c.l());
    }

    static i b(String str, k kVar) {
        i iVar = new i();
        iVar.b = str;
        g b = g.b();
        iVar.a = b;
        b.L(kVar);
        return iVar;
    }

    static i k(g gVar, List<g> list) {
        StringBuilder sb = new StringBuilder(list.size() * 13);
        if (list.size() <= 0) {
            return new i(gVar, null);
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).g(sb);
        }
        return new i(gVar, sb.toString());
    }

    g c() {
        return this.a;
    }

    int d() {
        String str = this.b;
        if (str == null) {
            return 1;
        }
        int length = str.length();
        int i = length / 13;
        return length % 13 != 0 ? i + 2 : i + 1;
    }

    long e() {
        return this.a.i();
    }

    String f() {
        return this.b;
    }

    String g() {
        String str;
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        String b = this.a.m().b();
        String[] split = b.split(".");
        if (split.length == 2) {
            b = split[0];
            str = b;
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (this.a.z()) {
            b = b.toLowerCase();
        }
        if (this.a.y()) {
            str = str.toLowerCase();
        }
        if (str.isEmpty()) {
            return b;
        }
        return b + "." + str;
    }

    String h() {
        return this.a.m().toString();
    }

    long i() {
        return this.a.n();
    }

    boolean j() {
        return this.a.t();
    }

    void l(ByteBuffer byteBuffer) {
        if (!TextUtils.isEmpty(this.b)) {
            byte a = this.a.m().a();
            int d = d();
            int i = d - 2;
            g.a(this.b, i * 13, a, d - 1, true).E(byteBuffer);
            while (true) {
                int i2 = i - 1;
                if (i <= 0) {
                    break;
                }
                g.a(this.b, i2 * 13, a, i, false).E(byteBuffer);
                i = i2;
            }
        }
        this.a.E(byteBuffer);
    }

    void m() {
        this.a.G();
    }

    void n(long j) {
        this.a.H(j);
    }

    void o() {
        this.a.J(System.currentTimeMillis());
    }

    void p() {
        this.a.K(System.currentTimeMillis());
    }

    void q(String str, k kVar) {
        this.b = str;
        this.a.L(kVar);
    }

    void r(long j) {
        this.a.M(j);
    }

    public String toString() {
        return "[FatLfnDirectoryEntry getName()=" + g() + "]";
    }

    private i(g gVar, String str) {
        this.a = gVar;
        this.b = str;
    }
}
