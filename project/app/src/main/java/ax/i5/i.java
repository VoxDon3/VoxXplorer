/*
 * Decompiled with CFR 0.152.
 */
package ax.i5;

import android.text.TextUtils;
import ax.i5.g;
import ax.i5.k;
import java.nio.ByteBuffer;
import java.util.List;

class i {
    private g a;
    private String b;

    private i() {
    }

    private i(g g8, String string) {
        this.a = g8;
        this.b = string;
    }

    static void a(i object, i object2) {
        object2 = ((i)object).c();
        object = ((i)object).c();
        ((g)object).F(((g)object2).h());
        ((g)object).J(((g)object2).k());
        ((g)object).K(((g)object2).l());
    }

    static i b(String object, k k8) {
        i i8 = new i();
        i8.b = object;
        i8.a = object = g.b();
        ((g)object).L(k8);
        return i8;
    }

    static i k(g g8, List<g> list) {
        StringBuilder stringBuilder = new StringBuilder(list.size() * 13);
        if (list.size() > 0) {
            for (int i8 = list.size() - 1; i8 >= 0; --i8) {
                list.get(i8).g(stringBuilder);
            }
            return new i(g8, stringBuilder.toString());
        }
        return new i(g8, null);
    }

    g c() {
        return this.a;
    }

    int d() {
        String string = this.b;
        if (string != null) {
            int n8 = string.length();
            int n9 = n8 / 13;
            if (n8 % 13 != 0) {
                return n9 + 2;
            }
            return n9 + 1;
        }
        return 1;
    }

    long e() {
        return this.a.i();
    }

    String f() {
        return this.b;
    }

    String g() {
        Object object;
        if (!TextUtils.isEmpty((CharSequence)this.b)) {
            return this.b;
        }
        String string = this.a.m().b();
        Object object2 = string.split(".");
        if (((String[])object2).length == 2) {
            string = object2[0];
            object = string;
        } else {
            object = "";
        }
        object2 = string;
        if (this.a.z()) {
            object2 = string.toLowerCase();
        }
        string = object;
        if (this.a.y()) {
            string = ((String)object).toLowerCase();
        }
        object = object2;
        if (!string.isEmpty()) {
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(".");
            ((StringBuilder)object).append(string);
            object = ((StringBuilder)object).toString();
        }
        return object;
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
        if (!TextUtils.isEmpty((CharSequence)this.b)) {
            byte by = this.a.m().a();
            int n8 = this.d();
            int n9 = n8 - 2;
            g.a(this.b, n9 * 13, by, n8 - 1, true).E(byteBuffer);
            while (true) {
                n8 = n9 - 1;
                if (n9 <= 0) break;
                g.a(this.b, n8 * 13, by, n9, false).E(byteBuffer);
                n9 = n8;
            }
        }
        this.a.E(byteBuffer);
    }

    void m() {
        this.a.G();
    }

    void n(long l8) {
        this.a.H(l8);
    }

    void o() {
        this.a.J(System.currentTimeMillis());
    }

    void p() {
        this.a.K(System.currentTimeMillis());
    }

    void q(String string, k k8) {
        this.b = string;
        this.a.L(k8);
    }

    void r(long l8) {
        this.a.M(l8);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[FatLfnDirectoryEntry getName()=");
        stringBuilder.append(this.g());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

