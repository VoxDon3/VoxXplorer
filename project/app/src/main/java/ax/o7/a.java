/*
 * Decompiled with CFR 0.152.
 */
package ax.o7;

import ax.h7.a;
import ax.i7.D;
import ax.i7.g;
import ax.i7.r;
import ax.i7.s;
import ax.i7.w;
import ax.m7.n;
import ax.m7.v;
import ax.p7.d;
import com.google.api.client.googleapis.GoogleUtils;
import java.io.IOException;
import java.io.InputStream;

public class a
extends ax.h7.a {
    static {
        Integer n8;
        boolean bl = GoogleUtils.b == 1 && ((n8 = GoogleUtils.c) >= 32 || n8 == 31 && GoogleUtils.d >= 1);
        v.h(bl, "You are currently running with version %s of google-api-client. You need at least version 1.31.1 of google-api-client to run version 1.32.1 of the Drive API library.", GoogleUtils.a);
    }

    a(b b8) {
        super(b8);
    }

    @Override
    protected void h(ax.g7.b<?> b8) throws IOException {
        super.h(b8);
    }

    public a m() {
        return new a(this);
    }

    public c n() {
        return new c(this);
    }

    public class ax.o7.a$a {
        final ax.o7.a a;

        public ax.o7.a$a(ax.o7.a a8) {
            this.a = a8;
        }

        public a a() throws IOException {
            a a8 = new a(this);
            this.a.h(a8);
            return a8;
        }

        public class a
        extends ax.o7.b<ax.p7.a> {
            final ax.o7.a$a s0;

            protected a(ax.o7.a$a a8) {
                this.s0 = a8;
                super(a8.a, "GET", "about", (Object)null, ax.p7.a.class);
            }

            public a G(String string, Object object) {
                return (a)super.E(string, object);
            }

            public a H(String string) {
                return (a)super.F(string);
            }
        }
    }

    public static final class b
    extends a.a {
        public b(w w8, ax.l7.c c8, r r8) {
            super(w8, c8, b.i(w8), "drive/v3/", r8, false);
            this.k("batch/drive/v3");
        }

        private static String i(w w8) {
            String string;
            String string2 = string = System.getenv("GOOGLE_API_USE_MTLS_ENDPOINT");
            if (string == null) {
                string2 = "auto";
            }
            if (!("always".equals(string2) || "auto".equals(string2) && w8 != null && w8.e())) {
                return "https://www.googleapis.com/";
            }
            return "https://www.mtls.googleapis.com/";
        }

        public a h() {
            return new a(this);
        }

        public b j(String string) {
            return (b)super.e(string);
        }

        public b k(String string) {
            return (b)super.b(string);
        }

        public b l(String string) {
            return (b)super.f(string);
        }

        public b m(String string) {
            return (b)super.g(string);
        }
    }

    public class ax.o7.a$c {
        final ax.o7.a a;

        public ax.o7.a$c(ax.o7.a a8) {
            this.a = a8;
        }

        public a a(String object, ax.p7.c c8) throws IOException {
            object = new a(this, (String)object, c8);
            this.a.h((ax.g7.b<?>)object);
            return object;
        }

        public b b(ax.p7.c k8) throws IOException {
            k8 = new b(this, (ax.p7.c)k8);
            this.a.h((ax.g7.b<?>)k8);
            return k8;
        }

        public b c(ax.p7.c k8, ax.i7.b b8) throws IOException {
            k8 = new b(this, (ax.p7.c)k8, b8);
            this.a.h((ax.g7.b<?>)k8);
            return k8;
        }

        public c d(String object) throws IOException {
            object = new c(this, (String)object);
            this.a.h((ax.g7.b<?>)object);
            return object;
        }

        public d e() throws IOException {
            d d8 = new d(this);
            this.a.h(d8);
            return d8;
        }

        public e f(String object, ax.p7.c c8) throws IOException {
            object = new e(this, (String)object, c8);
            this.a.h((ax.g7.b<?>)object);
            return object;
        }

        public e g(String object, ax.p7.c c8, ax.i7.b b8) throws IOException {
            object = new e(this, (String)object, c8, b8);
            this.a.h((ax.g7.b<?>)object);
            return object;
        }

        public class a
        extends ax.o7.b<ax.p7.c> {
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
            final ax.o7.a$c s0;
            @n
            private Boolean supportsAllDrives;
            @n
            private Boolean supportsTeamDrives;

            protected a(ax.o7.a$c c8, String string, ax.p7.c c9) {
                this.s0 = c8;
                super(c8.a, "POST", "files/{fileId}/copy", (Object)c9, ax.p7.c.class);
                this.fileId = v.e(string, "Required parameter fileId must be specified.");
            }

            public a G(String string, Object object) {
                return (a)super.E(string, object);
            }
        }

        public class b
        extends ax.o7.b<ax.p7.c> {
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
            final ax.o7.a$c s0;
            @n
            private Boolean supportsAllDrives;
            @n
            private Boolean supportsTeamDrives;
            @n
            private Boolean useContentAsIndexableText;

            protected b(ax.o7.a$c c8, ax.p7.c c9) {
                this.s0 = c8;
                super(c8.a, "POST", "files", (Object)c9, ax.p7.c.class);
            }

            protected b(ax.o7.a$c c8, ax.p7.c c9, ax.i7.b b8) {
                this.s0 = c8;
                ax.o7.a a8 = c8.a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("/upload/");
                stringBuilder.append(c8.a.g());
                stringBuilder.append("files");
                super(a8, "POST", stringBuilder.toString(), (Object)c9, ax.p7.c.class);
                this.w(b8);
            }

            public b G(String string, Object object) {
                return (b)super.E(string, object);
            }
        }

        public class c
        extends ax.o7.b<ax.p7.c> {
            @n
            private Boolean acknowledgeAbuse;
            @n
            private String fileId;
            @n
            private String includeLabels;
            @n
            private String includePermissionsForView;
            final ax.o7.a$c s0;
            @n
            private Boolean supportsAllDrives;
            @n
            private Boolean supportsTeamDrives;

            protected c(ax.o7.a$c c8, String string) {
                this.s0 = c8;
                super(c8.a, "GET", "files/{fileId}", (Object)null, ax.p7.c.class);
                this.fileId = v.e(string, "Required parameter fileId must be specified.");
                this.v();
            }

            public c G(String string, Object object) {
                return (c)super.E(string, object);
            }

            public c H(String string) {
                return (c)super.F(string);
            }

            @Override
            public g j() {
                CharSequence charSequence;
                if ("media".equals(this.get("alt")) && this.r() == null) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(this.s0.a.f());
                    ((StringBuilder)charSequence).append("download/");
                    ((StringBuilder)charSequence).append(this.s0.a.g());
                    charSequence = ((StringBuilder)charSequence).toString();
                } else {
                    charSequence = this.s0.a.b();
                }
                return new g(D.c((String)charSequence, this.t(), this, true));
            }

            @Override
            public s k() throws IOException {
                return super.k();
            }

            @Override
            public InputStream l() throws IOException {
                return super.l();
            }
        }

        public class d
        extends ax.o7.b<ax.p7.d> {
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
            final ax.o7.a$c s0;
            @n
            private String spaces;
            @n
            private Boolean supportsAllDrives;
            @n
            private Boolean supportsTeamDrives;
            @n
            private String teamDriveId;

            protected d(ax.o7.a$c c8) {
                this.s0 = c8;
                super(c8.a, "GET", "files", (Object)null, ax.p7.d.class);
            }

            public String G() {
                return this.pageToken;
            }

            public d H(String string, Object object) {
                return (d)super.E(string, object);
            }

            public d I(String string) {
                return (d)super.F(string);
            }

            public d J(String string) {
                this.pageToken = string;
                return this;
            }

            public d K(String string) {
                this.q = string;
                return this;
            }
        }

        public class e
        extends ax.o7.b<ax.p7.c> {
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
            final ax.o7.a$c s0;
            @n
            private Boolean supportsAllDrives;
            @n
            private Boolean supportsTeamDrives;
            @n
            private Boolean useContentAsIndexableText;

            protected e(ax.o7.a$c c8, String string, ax.p7.c c9) {
                this.s0 = c8;
                super(c8.a, "PATCH", "files/{fileId}", (Object)c9, ax.p7.c.class);
                this.fileId = v.e(string, "Required parameter fileId must be specified.");
            }

            protected e(ax.o7.a$c c8, String string, ax.p7.c c9, ax.i7.b b8) {
                this.s0 = c8;
                ax.o7.a a8 = c8.a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("/upload/");
                stringBuilder.append(c8.a.g());
                stringBuilder.append("files/{fileId}");
                super(a8, "PATCH", stringBuilder.toString(), (Object)c9, ax.p7.c.class);
                this.fileId = v.e(string, "Required parameter fileId must be specified.");
                this.w(b8);
            }

            public e G(String string, Object object) {
                return (e)super.E(string, object);
            }

            public e H(String string) {
                this.addParents = string;
                return this;
            }

            public e I(String string) {
                return (e)super.F(string);
            }

            public e J(String string) {
                this.removeParents = string;
                return this;
            }
        }
    }
}

