package ax.P0;

import android.view.View;

/* renamed from: ax.P0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0892a {
    public final View a;
    public final int b;
    public final String c;

    /* renamed from: ax.P0.a$a, reason: collision with other inner class name */
    public static final class C0165a {
        private final View a;
        private final int b;
        private String c;

        public C0165a(View view, int i) {
            this.a = view;
            this.b = i;
        }

        public C0892a a() {
            return new C0892a(this.a, this.b, this.c);
        }

        public C0165a b(String str) {
            this.c = str;
            return this;
        }
    }

    @Deprecated
    public C0892a(View view, int i, String str) {
        this.a = view;
        this.b = i;
        this.c = str;
    }
}
