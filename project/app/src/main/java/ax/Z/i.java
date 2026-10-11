/*
 * Decompiled with CFR 0.152.
 */
package ax.Z;

import android.util.Base64;
import ax.b0.g;
import java.util.List;

public final class i {
    private final String a;
    private final String b;
    private final String c;
    private final List<List<byte[]>> d;
    private final int e;
    private final String f;

    public i(String string, String string2, String string3, List<List<byte[]>> list) {
        this.a = g.g(string);
        this.b = g.g(string2);
        this.c = g.g(string3);
        this.d = g.g(list);
        this.e = 0;
        this.f = this.a(string, string2, string3);
    }

    private String a(String string, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("-");
        stringBuilder.append(string2);
        stringBuilder.append("-");
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public List<List<byte[]>> b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    String d() {
        return this.f;
    }

    public String e() {
        return this.a;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = new StringBuilder();
        ((StringBuilder)object).append("FontRequest {mProviderAuthority: ");
        ((StringBuilder)object).append(this.a);
        ((StringBuilder)object).append(", mProviderPackage: ");
        ((StringBuilder)object).append(this.b);
        ((StringBuilder)object).append(", mQuery: ");
        ((StringBuilder)object).append(this.c);
        ((StringBuilder)object).append(", mCertificates:");
        stringBuilder.append(((StringBuilder)object).toString());
        for (int i8 = 0; i8 < this.d.size(); ++i8) {
            stringBuilder.append(" [");
            object = this.d.get(i8);
            for (int i9 = 0; i9 < object.size(); ++i9) {
                stringBuilder.append(" \"");
                stringBuilder.append(Base64.encodeToString((byte[])((byte[])object.get(i9)), (int)0));
                stringBuilder.append("\"");
            }
            stringBuilder.append(" ]");
        }
        stringBuilder.append("}");
        object = new StringBuilder();
        ((StringBuilder)object).append("mCertificatesArray: ");
        ((StringBuilder)object).append(this.e);
        stringBuilder.append(((StringBuilder)object).toString());
        return stringBuilder.toString();
    }
}

