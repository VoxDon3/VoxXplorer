/*
 * Decompiled with CFR 0.152.
 */
package ax.fc;

import ax.fc.d;

public interface a {
    public void a(d var1);

    public static final class a
    implements a {
        private final boolean a;

        public a() {
            this(false);
        }

        public a(boolean bl) {
            this.a = bl;
        }

        @Override
        public void a(d d8) {
            System.out.println(d8);
            if (this.a && d8.a() != null) {
                d8.a().printStackTrace();
            }
        }
    }
}

