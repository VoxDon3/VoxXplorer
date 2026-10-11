package ax.Sa;

import okhttp3.RequestBody;

/* loaded from: classes3.dex */
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

        public b b(Integer num) {
            this.g = num;
            return this;
        }

        public b c(Integer num) {
            this.h = num;
            return this;
        }

        public b d(String str) {
            this.a = str;
            return this;
        }

        public b e(String str) {
            this.d = str;
            return this;
        }
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
        return "ResourcesArgs{path='" + this.a + "', fields='" + this.b + "', limit=" + this.g + ", offset=" + this.h + ", sort='" + this.c + "', previewSize='" + this.d + "', previewCrop=" + this.i + ", publicKey=" + this.e + ", mediaType=" + this.f + ", body=" + this.j + ", parsingHandler=false}";
    }

    private g(String str, String str2, String str3, String str4, Integer num, Integer num2, Boolean bool, String str5, String str6, RequestBody requestBody, h hVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.g = num;
        this.h = num2;
        this.i = bool;
        this.e = str5;
        this.f = str6;
        this.j = requestBody;
    }
}
