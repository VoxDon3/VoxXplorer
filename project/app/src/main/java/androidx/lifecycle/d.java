/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import ax.Gb.g;
import ax.Gb.l;
import java.util.concurrent.atomic.AtomicReference;

public abstract class d {
    private AtomicReference<Object> a = new AtomicReference();

    public abstract void a(ax.G0.g var1);

    public abstract b b();

    public abstract void c(ax.G0.g var1);

    public static final class androidx.lifecycle.d$a
    extends Enum<androidx.lifecycle.d$a> {
        private static final androidx.lifecycle.d$a[] $VALUES;
        public static final a Companion;
        public static final /* enum */ androidx.lifecycle.d$a ON_ANY;
        public static final /* enum */ androidx.lifecycle.d$a ON_CREATE;
        public static final /* enum */ androidx.lifecycle.d$a ON_DESTROY;
        public static final /* enum */ androidx.lifecycle.d$a ON_PAUSE;
        public static final /* enum */ androidx.lifecycle.d$a ON_RESUME;
        public static final /* enum */ androidx.lifecycle.d$a ON_START;
        public static final /* enum */ androidx.lifecycle.d$a ON_STOP;

        static {
            ON_CREATE = new androidx.lifecycle.d$a();
            ON_START = new androidx.lifecycle.d$a();
            ON_RESUME = new androidx.lifecycle.d$a();
            ON_PAUSE = new androidx.lifecycle.d$a();
            ON_STOP = new androidx.lifecycle.d$a();
            ON_DESTROY = new androidx.lifecycle.d$a();
            ON_ANY = new androidx.lifecycle.d$a();
            $VALUES = androidx.lifecycle.d$a.d();
            Companion = new a(null);
        }

        private static final /* synthetic */ androidx.lifecycle.d$a[] d() {
            return new androidx.lifecycle.d$a[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
        }

        public static final androidx.lifecycle.d$a h(androidx.lifecycle.d$b b8) {
            return Companion.a(b8);
        }

        public static final androidx.lifecycle.d$a l(androidx.lifecycle.d$b b8) {
            return Companion.c(b8);
        }

        public static androidx.lifecycle.d$a valueOf(String string) {
            return Enum.valueOf(androidx.lifecycle.d$a.class, string);
        }

        public static androidx.lifecycle.d$a[] values() {
            return (androidx.lifecycle.d$a[])$VALUES.clone();
        }

        public final androidx.lifecycle.d$b j() {
            switch (b.a[this.ordinal()]) {
                default: {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((Object)this);
                    stringBuilder.append(" has no target state");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                case 6: {
                    return androidx.lifecycle.d$b.q;
                }
                case 5: {
                    return androidx.lifecycle.d$b.f0;
                }
                case 3: 
                case 4: {
                    return androidx.lifecycle.d$b.e0;
                }
                case 1: 
                case 2: 
            }
            return androidx.lifecycle.d$b.d0;
        }

        public static final class androidx.lifecycle.d$a$a {
            private androidx.lifecycle.d$a$a() {
            }

            public /* synthetic */ androidx.lifecycle.d$a$a(g g8) {
                this();
            }

            public final androidx.lifecycle.d$a a(androidx.lifecycle.d$b b8) {
                l.f((Object)b8, "state");
                int n8 = a.a[b8.ordinal()];
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            return null;
                        }
                        return ON_PAUSE;
                    }
                    return ON_STOP;
                }
                return ON_DESTROY;
            }

            public final androidx.lifecycle.d$a b(androidx.lifecycle.d$b b8) {
                l.f((Object)b8, "state");
                int n8 = a.a[b8.ordinal()];
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 5) {
                            return null;
                        }
                        return ON_CREATE;
                    }
                    return ON_RESUME;
                }
                return ON_START;
            }

            public final androidx.lifecycle.d$a c(androidx.lifecycle.d$b b8) {
                l.f((Object)b8, "state");
                int n8 = a.a[b8.ordinal()];
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            return null;
                        }
                        return ON_RESUME;
                    }
                    return ON_START;
                }
                return ON_CREATE;
            }

            public final class a {
                public static final int[] a;

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                static {
                    int[] nArray = new int[androidx.lifecycle.d$b.values().length];
                    try {
                        nArray[androidx.lifecycle.d$b.d0.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError noSuchFieldError) {}
                    try {
                        nArray[androidx.lifecycle.d$b.e0.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError noSuchFieldError) {}
                    try {
                        nArray[androidx.lifecycle.d$b.f0.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError noSuchFieldError) {}
                    try {
                        nArray[androidx.lifecycle.d$b.q.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError noSuchFieldError) {}
                    try {
                        nArray[androidx.lifecycle.d$b.c0.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError noSuchFieldError) {}
                    a = nArray;
                }
            }
        }

        public final class b {
            public static final int[] a;

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            static {
                int[] nArray = new int[androidx.lifecycle.d$a.values().length];
                try {
                    nArray[androidx.lifecycle.d$a.ON_CREATE.ordinal()] = 1;
                }
                catch (NoSuchFieldError noSuchFieldError) {}
                try {
                    nArray[androidx.lifecycle.d$a.ON_STOP.ordinal()] = 2;
                }
                catch (NoSuchFieldError noSuchFieldError) {}
                try {
                    nArray[androidx.lifecycle.d$a.ON_START.ordinal()] = 3;
                }
                catch (NoSuchFieldError noSuchFieldError) {}
                try {
                    nArray[androidx.lifecycle.d$a.ON_PAUSE.ordinal()] = 4;
                }
                catch (NoSuchFieldError noSuchFieldError) {}
                try {
                    nArray[androidx.lifecycle.d$a.ON_RESUME.ordinal()] = 5;
                }
                catch (NoSuchFieldError noSuchFieldError) {}
                try {
                    nArray[androidx.lifecycle.d$a.ON_DESTROY.ordinal()] = 6;
                }
                catch (NoSuchFieldError noSuchFieldError) {}
                try {
                    nArray[androidx.lifecycle.d$a.ON_ANY.ordinal()] = 7;
                }
                catch (NoSuchFieldError noSuchFieldError) {}
                a = nArray;
            }
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        public static final /* enum */ b f0;
        private static final b[] g0;
        public static final /* enum */ b q;

        static {
            q = new b();
            c0 = new b();
            d0 = new b();
            e0 = new b();
            f0 = new b();
            g0 = b.d();
        }

        private static final /* synthetic */ b[] d() {
            return new b[]{q, c0, d0, e0, f0};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])g0.clone();
        }

        public final boolean h(b b8) {
            l.f((Object)b8, "state");
            return this.compareTo(b8) >= 0;
        }
    }
}

