/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import ax.c0.h;
import ax.c0.i;
import ax.c0.j;
import ax.c0.k;
import ax.c0.l;

public final class d {
    private final f a;

    d(f f8) {
        this.a = f8;
    }

    static String a(int n8) {
        if ((n8 & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(n8);
    }

    static String e(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 != 5) {
                                return String.valueOf(n8);
                            }
                            return "SOURCE_PROCESS_TEXT";
                        }
                        return "SOURCE_AUTOFILL";
                    }
                    return "SOURCE_DRAG_AND_DROP";
                }
                return "SOURCE_INPUT_METHOD";
            }
            return "SOURCE_CLIPBOARD";
        }
        return "SOURCE_APP";
    }

    public static d g(ContentInfo contentInfo) {
        return new d(new e(contentInfo));
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
        ContentInfo contentInfo = this.a.c();
        j.Objects.requireNonNull((Object)contentInfo);
        return ax.c0.c.a(contentInfo);
    }

    public String toString() {
        return this.a.toString();
    }

    public static final class a {
        private final c a;

        public a(ClipData clipData, int n8) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.a = new b(clipData, n8);
                return;
            }
            this.a = new d(clipData, n8);
        }

        public d a() {
            return this.a.g();
        }

        public a b(Bundle bundle) {
            this.a.setExtras(bundle);
            return this;
        }

        public a c(int n8) {
            this.a.f(n8);
            return this;
        }

        public a d(Uri uri) {
            this.a.a(uri);
            return this;
        }
    }

    private static final class b
    implements c {
        private final ContentInfo.Builder a;

        b(ClipData clipData, int n8) {
            this.a = ax.c0.g.a(clipData, n8);
        }

        @Override
        public void a(Uri uri) {
            h.a(this.a, uri);
        }

        @Override
        public void f(int n8) {
            ax.c0.f.a(this.a, n8);
        }

        @Override
        public d g() {
            return new d(new e(ax.c0.e.a(this.a)));
        }

        @Override
        public void setExtras(Bundle bundle) {
            i.a(this.a, bundle);
        }
    }

    private static interface c {
        public void a(Uri var1);

        public void f(int var1);

        public d g();

        public void setExtras(Bundle var1);
    }

    private static final class d
    implements c {
        ClipData a;
        int b;
        int c;
        Uri d;
        Bundle e;

        d(ClipData clipData, int n8) {
            this.a = clipData;
            this.b = n8;
        }

        @Override
        public void a(Uri uri) {
            this.d = uri;
        }

        @Override
        public void f(int n8) {
            this.c = n8;
        }

        @Override
        public d g() {
            return new d(new g(this));
        }

        @Override
        public void setExtras(Bundle bundle) {
            this.e = bundle;
        }
    }

    private static final class e
    implements f {
        private final ContentInfo a;

        e(ContentInfo contentInfo) {
            this.a = ax.c0.c.a(ax.b0.g.g(contentInfo));
        }

        @Override
        public int a() {
            return l.a(this.a);
        }

        @Override
        public ClipData b() {
            return j.a(this.a);
        }

        @Override
        public ContentInfo c() {
            return this.a;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ContentInfoCompat{");
            stringBuilder.append(this.a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        @Override
        public int y() {
            return k.a(this.a);
        }
    }

    private static interface f {
        public int a();

        public ClipData b();

        public ContentInfo c();

        public int y();
    }

    private static final class g
    implements f {
        private final ClipData a;
        private final int b;
        private final int c;
        private final Uri d;
        private final Bundle e;

        g(d d8) {
            this.a = ax.b0.g.g(d8.a);
            this.b = ax.b0.g.c(d8.b, 0, 5, "source");
            this.c = ax.b0.g.f(d8.c, 1);
            this.d = d8.d;
            this.e = d8.e;
        }

        @Override
        public int a() {
            return this.b;
        }

        @Override
        public ClipData b() {
            return this.a;
        }

        @Override
        public ContentInfo c() {
            return null;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ContentInfoCompat{clip=");
            stringBuilder.append(this.a.getDescription());
            stringBuilder.append(", source=");
            stringBuilder.append(ax.c0.d.e(this.b));
            stringBuilder.append(", flags=");
            stringBuilder.append(ax.c0.d.a(this.c));
            Object object = this.d;
            String string = "";
            if (object == null) {
                object = "";
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append(", hasLinkUri(");
                ((StringBuilder)object).append(this.d.toString().length());
                ((StringBuilder)object).append(")");
                object = ((StringBuilder)object).toString();
            }
            stringBuilder.append((String)object);
            object = this.e == null ? string : ", hasExtras";
            stringBuilder.append((String)object);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        @Override
        public int y() {
            return this.c;
        }
    }
}

