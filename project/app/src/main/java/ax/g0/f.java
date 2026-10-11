/*
 * Decompiled with CFR 0.152.
 */
package ax.g0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

public final class f {
    private final c a;

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new a(uri, clipDescription, uri2);
            return;
        }
        this.a = new b(uri, clipDescription, uri2);
    }

    private f(c c8) {
        this.a = c8;
    }

    public static f f(Object object) {
        if (object == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 25) {
            return null;
        }
        return new f(new a(object));
    }

    public Uri a() {
        return this.a.a();
    }

    public ClipDescription b() {
        return this.a.d();
    }

    public Uri c() {
        return this.a.c();
    }

    public void d() {
        this.a.b();
    }

    public Object e() {
        return this.a.e();
    }

    private static final class a
    implements c {
        final InputContentInfo a;

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }

        a(Object object) {
            this.a = (InputContentInfo)object;
        }

        @Override
        public Uri a() {
            return this.a.getContentUri();
        }

        @Override
        public void b() {
            this.a.requestPermission();
        }

        @Override
        public Uri c() {
            return this.a.getLinkUri();
        }

        @Override
        public ClipDescription d() {
            return this.a.getDescription();
        }

        @Override
        public Object e() {
            return this.a;
        }
    }

    private static final class b
    implements c {
        private final Uri a;
        private final ClipDescription b;
        private final Uri c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        @Override
        public Uri a() {
            return this.a;
        }

        @Override
        public void b() {
        }

        @Override
        public Uri c() {
            return this.c;
        }

        @Override
        public ClipDescription d() {
            return this.b;
        }

        @Override
        public Object e() {
            return null;
        }
    }

    private static interface c {
        public Uri a();

        public void b();

        public Uri c();

        public ClipDescription d();

        public Object e();
    }
}

