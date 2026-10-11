package ax.g0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: ax.g0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2101f {
    private final c a;

    /* renamed from: ax.g0.f$c */
    private interface c {
        Uri a();

        void b();

        Uri c();

        ClipDescription d();

        Object e();
    }

    public C2101f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new a(uri, clipDescription, uri2);
        } else {
            this.a = new b(uri, clipDescription, uri2);
        }
    }

    public static C2101f f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C2101f(new a(obj));
        }
        return null;
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

    /* renamed from: ax.g0.f$a */
    private static final class a implements c {
        final InputContentInfo a;

        a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        @Override // ax.g0.C2101f.c
        public Uri a() {
            return this.a.getContentUri();
        }

        @Override // ax.g0.C2101f.c
        public void b() {
            this.a.requestPermission();
        }

        @Override // ax.g0.C2101f.c
        public Uri c() {
            return this.a.getLinkUri();
        }

        @Override // ax.g0.C2101f.c
        public ClipDescription d() {
            return this.a.getDescription();
        }

        @Override // ax.g0.C2101f.c
        public Object e() {
            return this.a;
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private C2101f(c cVar) {
        this.a = cVar;
    }

    /* renamed from: ax.g0.f$b */
    private static final class b implements c {
        private final Uri a;
        private final ClipDescription b;
        private final Uri c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        @Override // ax.g0.C2101f.c
        public Uri a() {
            return this.a;
        }

        @Override // ax.g0.C2101f.c
        public Uri c() {
            return this.c;
        }

        @Override // ax.g0.C2101f.c
        public ClipDescription d() {
            return this.b;
        }

        @Override // ax.g0.C2101f.c
        public Object e() {
            return null;
        }

        @Override // ax.g0.C2101f.c
        public void b() {
        }
    }
}
