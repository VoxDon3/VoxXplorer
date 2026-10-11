package ax.c0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import ax.b0.C1446g;
import j$.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: ax.c0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1759d {
    private final f a;

    /* renamed from: ax.c0.d$a */
    public static final class a {
        private final c a;

        public a(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.a = new b(clipData, i);
            } else {
                this.a = new C0266d(clipData, i);
            }
        }

        public C1759d a() {
            return this.a.g();
        }

        public a b(Bundle bundle) {
            this.a.setExtras(bundle);
            return this;
        }

        public a c(int i) {
            this.a.f(i);
            return this;
        }

        public a d(Uri uri) {
            this.a.a(uri);
            return this;
        }
    }

    /* renamed from: ax.c0.d$b */
    private static final class b implements c {
        private final ContentInfo.Builder a;

        b(ClipData clipData, int i) {
            this.a = C1765g.a(clipData, i);
        }

        @Override // ax.c0.C1759d.c
        public void a(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // ax.c0.C1759d.c
        public void f(int i) {
            this.a.setFlags(i);
        }

        @Override // ax.c0.C1759d.c
        public C1759d g() {
            ContentInfo build;
            build = this.a.build();
            return new C1759d(new e(build));
        }

        @Override // ax.c0.C1759d.c
        public void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }
    }

    /* renamed from: ax.c0.d$c */
    private interface c {
        void a(Uri uri);

        void f(int i);

        C1759d g();

        void setExtras(Bundle bundle);
    }

    /* renamed from: ax.c0.d$d, reason: collision with other inner class name */
    private static final class C0266d implements c {
        ClipData a;
        int b;
        int c;
        Uri d;
        Bundle e;

        C0266d(ClipData clipData, int i) {
            this.a = clipData;
            this.b = i;
        }

        @Override // ax.c0.C1759d.c
        public void a(Uri uri) {
            this.d = uri;
        }

        @Override // ax.c0.C1759d.c
        public void f(int i) {
            this.c = i;
        }

        @Override // ax.c0.C1759d.c
        public C1759d g() {
            return new C1759d(new g(this));
        }

        @Override // ax.c0.C1759d.c
        public void setExtras(Bundle bundle) {
            this.e = bundle;
        }
    }

    /* renamed from: ax.c0.d$e */
    private static final class e implements f {
        private final ContentInfo a;

        e(ContentInfo contentInfo) {
            this.a = C1757c.a(C1446g.g(contentInfo));
        }

        @Override // ax.c0.C1759d.f
        public int a() {
            int source;
            source = this.a.getSource();
            return source;
        }

        @Override // ax.c0.C1759d.f
        public ClipData b() {
            ClipData clip;
            clip = this.a.getClip();
            return clip;
        }

        @Override // ax.c0.C1759d.f
        public ContentInfo c() {
            return this.a;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }

        @Override // ax.c0.C1759d.f
        public int y() {
            int flags;
            flags = this.a.getFlags();
            return flags;
        }
    }

    /* renamed from: ax.c0.d$f */
    private interface f {
        int a();

        ClipData b();

        ContentInfo c();

        int y();
    }

    /* renamed from: ax.c0.d$g */
    private static final class g implements f {
        private final ClipData a;
        private final int b;
        private final int c;
        private final Uri d;
        private final Bundle e;

        g(C0266d c0266d) {
            this.a = (ClipData) C1446g.g(c0266d.a);
            this.b = C1446g.c(c0266d.b, 0, 5, "source");
            this.c = C1446g.f(c0266d.c, 1);
            this.d = c0266d.d;
            this.e = c0266d.e;
        }

        @Override // ax.c0.C1759d.f
        public int a() {
            return this.b;
        }

        @Override // ax.c0.C1759d.f
        public ClipData b() {
            return this.a;
        }

        @Override // ax.c0.C1759d.f
        public ContentInfo c() {
            return null;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            sb.append(C1759d.e(this.b));
            sb.append(", flags=");
            sb.append(C1759d.a(this.c));
            Uri uri = this.d;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (uri == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str = ", hasLinkUri(" + this.d.toString().length() + ")";
            }
            sb.append(str);
            if (this.e != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }

        @Override // ax.c0.C1759d.f
        public int y() {
            return this.c;
        }
    }

    C1759d(f fVar) {
        this.a = fVar;
    }

    static String a(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    static String e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static C1759d g(ContentInfo contentInfo) {
        return new C1759d(new e(contentInfo));
    }

    public ClipData b() {
        return this.a.b();
    }

    public int c() {
        return this.a.y();
    }

    public int d() {
        return this.a.a();
    }

    public ContentInfo f() {
        ContentInfo c2 = this.a.c();
        Objects.requireNonNull(c2);
        return C1757c.a(c2);
    }

    public String toString() {
        return this.a.toString();
    }
}
