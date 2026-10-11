package ax.o7;

import ax.g7.AbstractC2128b;
import ax.h7.AbstractC2164a;
import ax.i7.AbstractC2278b;
import ax.i7.D;
import ax.i7.g;
import ax.i7.r;
import ax.i7.s;
import ax.i7.w;
import ax.l7.AbstractC2475c;
import ax.m7.n;
import ax.m7.v;
import ax.p7.C2777a;
import ax.p7.C2779c;
import ax.p7.C2780d;
import com.google.api.client.googleapis.GoogleUtils;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ax.o7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2730a extends AbstractC2164a {

    /* renamed from: ax.o7.a$a, reason: collision with other inner class name */
    public class C0402a {

        /* renamed from: ax.o7.a$a$a, reason: collision with other inner class name */
        public class C0403a extends AbstractC2731b<C2777a> {
            protected C0403a() {
                super(C2730a.this, "GET", "about", null, C2777a.class);
            }

            @Override // ax.o7.AbstractC2731b, ax.h7.AbstractC2165b, ax.g7.AbstractC2128b
            /* renamed from: G, reason: merged with bridge method [inline-methods] */
            public C0403a f(String str, Object obj) {
                return (C0403a) super.f(str, obj);
            }

            public C0403a H(String str) {
                return (C0403a) super.F(str);
            }
        }

        public C0402a() {
        }

        public C0403a a() throws IOException {
            C0403a c0403a = new C0403a();
            C2730a.this.h(c0403a);
            return c0403a;
        }
    }

    /* renamed from: ax.o7.a$b */
    public static final class b extends AbstractC2164a.AbstractC0324a {
        public b(w wVar, AbstractC2475c abstractC2475c, r rVar) {
            super(wVar, abstractC2475c, i(wVar), "drive/v3/", rVar, false);
            k("batch/drive/v3");
        }

        private static String i(w wVar) {
            String str = System.getenv("GOOGLE_API_USE_MTLS_ENDPOINT");
            if (str == null) {
                str = "auto";
            }
            return !"always".equals(str) ? ("auto".equals(str) && wVar != null && wVar.e()) ? "https://www.mtls.googleapis.com/" : "https://www.googleapis.com/" : "https://www.mtls.googleapis.com/";
        }

        public C2730a h() {
            return new C2730a(this);
        }

        public b j(String str) {
            return (b) super.e(str);
        }

        public b k(String str) {
            return (b) super.b(str);
        }

        @Override // ax.h7.AbstractC2164a.AbstractC0324a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public b c(String str) {
            return (b) super.c(str);
        }

        @Override // ax.h7.AbstractC2164a.AbstractC0324a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public b d(String str) {
            return (b) super.d(str);
        }
    }

    /* renamed from: ax.o7.a$c */
    public class c {

        /* renamed from: ax.o7.a$c$a, reason: collision with other inner class name */
        public class C0404a extends AbstractC2731b<C2779c> {

            @n
            private Boolean enforceSingleParent;

            @n
            private String fileId;

            @n
            private Boolean ignoreDefaultVisibility;

            @n
            private String includeLabels;

            @n
            private String includePermissionsForView;

            @n
            private Boolean keepRevisionForever;

            @n
            private String ocrLanguage;

            @n
            private Boolean supportsAllDrives;

            @n
            private Boolean supportsTeamDrives;

            protected C0404a(String str, C2779c c2779c) {
                super(C2730a.this, "POST", "files/{fileId}/copy", c2779c, C2779c.class);
                this.fileId = (String) v.e(str, "Required parameter fileId must be specified.");
            }

            @Override // ax.o7.AbstractC2731b, ax.h7.AbstractC2165b, ax.g7.AbstractC2128b
            /* renamed from: G, reason: merged with bridge method [inline-methods] */
            public C0404a f(String str, Object obj) {
                return (C0404a) super.f(str, obj);
            }
        }

        /* renamed from: ax.o7.a$c$c, reason: collision with other inner class name */
        public class C0405c extends AbstractC2731b<C2779c> {

            @n
            private Boolean acknowledgeAbuse;

            @n
            private String fileId;

            @n
            private String includeLabels;

            @n
            private String includePermissionsForView;

            @n
            private Boolean supportsAllDrives;

            @n
            private Boolean supportsTeamDrives;

            protected C0405c(String str) {
                super(C2730a.this, "GET", "files/{fileId}", null, C2779c.class);
                this.fileId = (String) v.e(str, "Required parameter fileId must be specified.");
                v();
            }

            @Override // ax.o7.AbstractC2731b, ax.h7.AbstractC2165b, ax.g7.AbstractC2128b
            /* renamed from: G, reason: merged with bridge method [inline-methods] */
            public C0405c f(String str, Object obj) {
                return (C0405c) super.f(str, obj);
            }

            public C0405c H(String str) {
                return (C0405c) super.F(str);
            }

            @Override // ax.g7.AbstractC2128b
            public g j() {
                String b;
                if ("media".equals(get("alt")) && r() == null) {
                    b = C2730a.this.f() + "download/" + C2730a.this.g();
                } else {
                    b = C2730a.this.b();
                }
                return new g(D.c(b, t(), this, true));
            }

            @Override // ax.g7.AbstractC2128b
            public s k() throws IOException {
                return super.k();
            }

            @Override // ax.g7.AbstractC2128b
            public InputStream l() throws IOException {
                return super.l();
            }
        }

        /* renamed from: ax.o7.a$c$d */
        public class d extends AbstractC2731b<C2780d> {

            @n
            private String corpora;

            @n
            private String corpus;

            @n
            private String driveId;

            @n
            private Boolean includeItemsFromAllDrives;

            @n
            private String includeLabels;

            @n
            private String includePermissionsForView;

            @n
            private Boolean includeTeamDriveItems;

            @n
            private String orderBy;

            @n
            private Integer pageSize;

            @n
            private String pageToken;

            @n
            private String q;

            @n
            private String spaces;

            @n
            private Boolean supportsAllDrives;

            @n
            private Boolean supportsTeamDrives;

            @n
            private String teamDriveId;

            protected d() {
                super(C2730a.this, "GET", "files", null, C2780d.class);
            }

            public String G() {
                return this.pageToken;
            }

            @Override // ax.o7.AbstractC2731b, ax.h7.AbstractC2165b, ax.g7.AbstractC2128b
            /* renamed from: H, reason: merged with bridge method [inline-methods] */
            public d f(String str, Object obj) {
                return (d) super.f(str, obj);
            }

            public d I(String str) {
                return (d) super.F(str);
            }

            public d J(String str) {
                this.pageToken = str;
                return this;
            }

            public d K(String str) {
                this.q = str;
                return this;
            }
        }

        public c() {
        }

        public C0404a a(String str, C2779c c2779c) throws IOException {
            C0404a c0404a = new C0404a(str, c2779c);
            C2730a.this.h(c0404a);
            return c0404a;
        }

        public b b(C2779c c2779c) throws IOException {
            b bVar = new b(c2779c);
            C2730a.this.h(bVar);
            return bVar;
        }

        public b c(C2779c c2779c, AbstractC2278b abstractC2278b) throws IOException {
            b bVar = new b(c2779c, abstractC2278b);
            C2730a.this.h(bVar);
            return bVar;
        }

        public C0405c d(String str) throws IOException {
            C0405c c0405c = new C0405c(str);
            C2730a.this.h(c0405c);
            return c0405c;
        }

        public d e() throws IOException {
            d dVar = new d();
            C2730a.this.h(dVar);
            return dVar;
        }

        public e f(String str, C2779c c2779c) throws IOException {
            e eVar = new e(str, c2779c);
            C2730a.this.h(eVar);
            return eVar;
        }

        public e g(String str, C2779c c2779c, AbstractC2278b abstractC2278b) throws IOException {
            e eVar = new e(str, c2779c, abstractC2278b);
            C2730a.this.h(eVar);
            return eVar;
        }

        /* renamed from: ax.o7.a$c$b */
        public class b extends AbstractC2731b<C2779c> {

            @n
            private Boolean enforceSingleParent;

            @n
            private Boolean ignoreDefaultVisibility;

            @n
            private String includeLabels;

            @n
            private String includePermissionsForView;

            @n
            private Boolean keepRevisionForever;

            @n
            private String ocrLanguage;

            @n
            private Boolean supportsAllDrives;

            @n
            private Boolean supportsTeamDrives;

            @n
            private Boolean useContentAsIndexableText;

            protected b(C2779c c2779c) {
                super(C2730a.this, "POST", "files", c2779c, C2779c.class);
            }

            @Override // ax.o7.AbstractC2731b, ax.h7.AbstractC2165b, ax.g7.AbstractC2128b
            /* renamed from: G, reason: merged with bridge method [inline-methods] */
            public b f(String str, Object obj) {
                return (b) super.f(str, obj);
            }

            protected b(C2779c c2779c, AbstractC2278b abstractC2278b) {
                super(C2730a.this, "POST", "/upload/" + C2730a.this.g() + "files", c2779c, C2779c.class);
                w(abstractC2278b);
            }
        }

        /* renamed from: ax.o7.a$c$e */
        public class e extends AbstractC2731b<C2779c> {

            @n
            private String addParents;

            @n
            private Boolean enforceSingleParent;

            @n
            private String fileId;

            @n
            private String includeLabels;

            @n
            private String includePermissionsForView;

            @n
            private Boolean keepRevisionForever;

            @n
            private String ocrLanguage;

            @n
            private String removeParents;

            @n
            private Boolean supportsAllDrives;

            @n
            private Boolean supportsTeamDrives;

            @n
            private Boolean useContentAsIndexableText;

            protected e(String str, C2779c c2779c) {
                super(C2730a.this, "PATCH", "files/{fileId}", c2779c, C2779c.class);
                this.fileId = (String) v.e(str, "Required parameter fileId must be specified.");
            }

            @Override // ax.o7.AbstractC2731b, ax.h7.AbstractC2165b, ax.g7.AbstractC2128b
            /* renamed from: G, reason: merged with bridge method [inline-methods] */
            public e f(String str, Object obj) {
                return (e) super.f(str, obj);
            }

            public e H(String str) {
                this.addParents = str;
                return this;
            }

            public e I(String str) {
                return (e) super.F(str);
            }

            public e J(String str) {
                this.removeParents = str;
                return this;
            }

            protected e(String str, C2779c c2779c, AbstractC2278b abstractC2278b) {
                super(C2730a.this, "PATCH", "/upload/" + C2730a.this.g() + "files/{fileId}", c2779c, C2779c.class);
                this.fileId = (String) v.e(str, "Required parameter fileId must be specified.");
                w(abstractC2278b);
            }
        }
    }

    static {
        boolean z;
        if (GoogleUtils.b.intValue() == 1) {
            Integer num = GoogleUtils.c;
            if (num.intValue() >= 32 || (num.intValue() == 31 && GoogleUtils.d.intValue() >= 1)) {
                z = true;
                v.h(z, "You are currently running with version %s of google-api-client. You need at least version 1.31.1 of google-api-client to run version 1.32.1 of the Drive API library.", GoogleUtils.a);
            }
        }
        z = false;
        v.h(z, "You are currently running with version %s of google-api-client. You need at least version 1.31.1 of google-api-client to run version 1.32.1 of the Drive API library.", GoogleUtils.a);
    }

    C2730a(b bVar) {
        super(bVar);
    }

    @Override // ax.g7.AbstractC2127a
    protected void h(AbstractC2128b<?> abstractC2128b) throws IOException {
        super.h(abstractC2128b);
    }

    public C0402a m() {
        return new C0402a();
    }

    public c n() {
        return new c();
    }
}
