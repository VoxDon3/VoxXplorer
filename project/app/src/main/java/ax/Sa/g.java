/*
 * Decompiled with CFR 0.152.
 */
package ax.Sa;

import ax.Sa.h;
import okhttp3.RequestBody;

public class g {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private Integer g;
    private Integer h;
    private Boolean i;
    private RequestBody j;

    private g(String string, String string2, String string3, String string4, Integer n8, Integer n9, Boolean bl, String string5, String string6, RequestBody requestBody, h h8) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.g = n8;
        this.h = n9;
        this.i = bl;
        this.e = string5;
        this.f = string6;
        this.j = requestBody;
    }

    public String a() {
        return this.b;
    }

    public Integer b() {
        return this.g;
    }

    public Integer c() {
        return this.h;
    }

    public h d() {
        return null;
    }

    public String e() {
        return this.a;
    }

    public Boolean f() {
        return this.i;
    }

    public String g() {
        return this.d;
    }

    public String h() {
        return this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ResourcesArgs{path='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append(", fields='");
        stringBuilder.append(this.b);
        stringBuilder.append('\'');
        stringBuilder.append(", limit=");
        stringBuilder.append(this.g);
        stringBuilder.append(", offset=");
        stringBuilder.append(this.h);
        stringBuilder.append(", sort='");
        stringBuilder.append(this.c);
        stringBuilder.append('\'');
        stringBuilder.append(", previewSize='");
        stringBuilder.append(this.d);
        stringBuilder.append('\'');
        stringBuilder.append(", previewCrop=");
        stringBuilder.append(this.i);
        stringBuilder.append(", publicKey=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mediaType=");
        stringBuilder.append(this.f);
        stringBuilder.append(", body=");
        stringBuilder.append(this.j);
        stringBuilder.append(", parsingHandler=");
        stringBuilder.append(false);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static class b {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private Integer g;
        private Integer h;
        private Boolean i;
        private RequestBody j;

        public g a() {
            return new g(this.a, this.b, this.c, this.d, this.g, this.h, this.i, this.e, this.f, this.j, null);
        }

        public b b(Integer n8) {
            this.g = n8;
            return this;
        }

        public b c(Integer n8) {
            this.h = n8;
            return this;
        }

        public b d(String string) {
            this.a = string;
            return this;
        }

        public b e(String string) {
            this.d = string;
            return this;
        }
    }
}

