/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.view.View;

public final class a {
    public final View a;
    public final int b;
    public final String c;

    @Deprecated
    public a(View view, int n8, String string) {
        this.a = view;
        this.b = n8;
        this.c = string;
    }

    public static final class a {
        private final View a;
        private final int b;
        private String c;

        public a(View view, int n8) {
            this.a = view;
            this.b = n8;
        }

        public a a() {
            return new a(this.a, this.b, this.c);
        }

        public a b(String string) {
            this.c = string;
            return this;
        }
    }
}

