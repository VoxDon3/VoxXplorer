/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.g;
import ax.Gb.l;
import ax.Ob.h;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.internal.Util;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class CacheControl {
    public static final Companion Companion = new Companion(null);
    public static final CacheControl FORCE_CACHE;
    public static final CacheControl FORCE_NETWORK;
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    static {
        FORCE_NETWORK = new Builder().noCache().build();
        FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();
    }

    private CacheControl(boolean bl, boolean bl2, int n8, int n9, boolean bl3, boolean bl4, boolean bl5, int n10, int n11, boolean bl6, boolean bl7, boolean bl8, String string) {
        this.noCache = bl;
        this.noStore = bl2;
        this.maxAgeSeconds = n8;
        this.sMaxAgeSeconds = n9;
        this.isPrivate = bl3;
        this.isPublic = bl4;
        this.mustRevalidate = bl5;
        this.maxStaleSeconds = n10;
        this.minFreshSeconds = n11;
        this.onlyIfCached = bl6;
        this.noTransform = bl7;
        this.immutable = bl8;
        this.headerValue = string;
    }

    public /* synthetic */ CacheControl(boolean bl, boolean bl2, int n8, int n9, boolean bl3, boolean bl4, boolean bl5, int n10, int n11, boolean bl6, boolean bl7, boolean bl8, String string, g g8) {
        this(bl, bl2, n8, n9, bl3, bl4, bl5, n10, n11, bl6, bl7, bl8, string);
    }

    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    public final boolean -deprecated_immutable() {
        return this.immutable;
    }

    public final int -deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int -deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int -deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean -deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean -deprecated_noCache() {
        return this.noCache;
    }

    public final boolean -deprecated_noStore() {
        return this.noStore;
    }

    public final boolean -deprecated_noTransform() {
        return this.noTransform;
    }

    public final boolean -deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int -deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        String string = this.headerValue;
        CharSequence charSequence = string;
        if (string == null) {
            charSequence = new StringBuilder();
            if (this.noCache) {
                ((StringBuilder)charSequence).append("no-cache, ");
            }
            if (this.noStore) {
                ((StringBuilder)charSequence).append("no-store, ");
            }
            if (this.maxAgeSeconds != -1) {
                ((StringBuilder)charSequence).append("max-age=");
                ((StringBuilder)charSequence).append(this.maxAgeSeconds);
                ((StringBuilder)charSequence).append(", ");
            }
            if (this.sMaxAgeSeconds != -1) {
                ((StringBuilder)charSequence).append("s-maxage=");
                ((StringBuilder)charSequence).append(this.sMaxAgeSeconds);
                ((StringBuilder)charSequence).append(", ");
            }
            if (this.isPrivate) {
                ((StringBuilder)charSequence).append("private, ");
            }
            if (this.isPublic) {
                ((StringBuilder)charSequence).append("public, ");
            }
            if (this.mustRevalidate) {
                ((StringBuilder)charSequence).append("must-revalidate, ");
            }
            if (this.maxStaleSeconds != -1) {
                ((StringBuilder)charSequence).append("max-stale=");
                ((StringBuilder)charSequence).append(this.maxStaleSeconds);
                ((StringBuilder)charSequence).append(", ");
            }
            if (this.minFreshSeconds != -1) {
                ((StringBuilder)charSequence).append("min-fresh=");
                ((StringBuilder)charSequence).append(this.minFreshSeconds);
                ((StringBuilder)charSequence).append(", ");
            }
            if (this.onlyIfCached) {
                ((StringBuilder)charSequence).append("only-if-cached, ");
            }
            if (this.noTransform) {
                ((StringBuilder)charSequence).append("no-transform, ");
            }
            if (this.immutable) {
                ((StringBuilder)charSequence).append("immutable, ");
            }
            if (charSequence.length() == 0) {
                return "";
            }
            ((StringBuilder)charSequence).delete(((StringBuilder)charSequence).length() - 2, ((StringBuilder)charSequence).length());
            charSequence = ((StringBuilder)charSequence).toString();
            l.e(charSequence, "StringBuilder().apply(builderAction).toString()");
            this.headerValue = charSequence;
        }
        return charSequence;
    }

    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long l8) {
            if (l8 > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return (int)l8;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder maxAge(int n8, TimeUnit object) {
            l.f(object, "timeUnit");
            if (n8 >= 0) {
                this.maxAgeSeconds = this.clampToInt(((TimeUnit)((Object)object)).toSeconds(n8));
                return this;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("maxAge < 0: ");
            ((StringBuilder)object).append(n8);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }

        public final Builder maxStale(int n8, TimeUnit object) {
            l.f(object, "timeUnit");
            if (n8 >= 0) {
                this.maxStaleSeconds = this.clampToInt(((TimeUnit)((Object)object)).toSeconds(n8));
                return this;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("maxStale < 0: ");
            ((StringBuilder)object).append(n8);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }

        public final Builder minFresh(int n8, TimeUnit object) {
            l.f(object, "timeUnit");
            if (n8 >= 0) {
                this.minFreshSeconds = this.clampToInt(((TimeUnit)((Object)object)).toSeconds(n8));
                return this;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("minFresh < 0: ");
            ((StringBuilder)object).append(n8);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        private final int indexOfElement(String string, String string2, int n8) {
            int n9 = string.length();
            while (n8 < n9) {
                if (h.L(string2, string.charAt(n8), false, 2, null)) {
                    return n8;
                }
                ++n8;
            }
            return string.length();
        }

        static /* synthetic */ int indexOfElement$default(Companion companion, String string, String string2, int n8, int n9, Object object) {
            if ((n9 & 2) != 0) {
                n8 = 0;
            }
            return companion.indexOfElement(string, string2, n8);
        }

        /*
         * Enabled aggressive block sorting
         */
        public final CacheControl parse(Headers headers) {
            l.f(headers, "headers");
            int n8 = headers.size();
            int n9 = 0;
            boolean bl = true;
            String string = null;
            boolean bl2 = false;
            boolean bl3 = false;
            int n10 = -1;
            int n11 = -1;
            boolean bl4 = false;
            boolean bl5 = false;
            boolean bl6 = false;
            int n12 = -1;
            int n13 = -1;
            boolean bl7 = false;
            boolean bl8 = false;
            boolean bl9 = false;
            while (true) {
                boolean bl10;
                boolean bl11;
                boolean bl12;
                int n14;
                int n15;
                boolean bl13;
                boolean bl14;
                boolean bl15;
                int n16;
                int n17;
                boolean bl16;
                boolean bl17;
                String string2;
                boolean bl18;
                int n18;
                block28: {
                    String string3;
                    String string4;
                    block27: {
                        block24: {
                            block26: {
                                block25: {
                                    if (n9 >= n8) break block24;
                                    string4 = headers.name(n9);
                                    string3 = headers.value(n9);
                                    if (!h.v(string4, "Cache-Control", true)) break block25;
                                    if (string != null) break block26;
                                    string4 = string3;
                                    break block27;
                                }
                                n18 = n8;
                                bl18 = bl;
                                string2 = string;
                                bl17 = bl2;
                                bl16 = bl3;
                                n17 = n10;
                                n16 = n11;
                                bl15 = bl4;
                                bl14 = bl5;
                                bl13 = bl6;
                                n15 = n12;
                                n14 = n13;
                                bl12 = bl7;
                                bl11 = bl8;
                                bl10 = bl9;
                                if (!h.v(string4, "Pragma", true)) break block28;
                            }
                            bl = false;
                            string4 = string;
                            break block27;
                        }
                        if (!bl) {
                            string = null;
                        }
                        return new CacheControl(bl2, bl3, n10, n11, bl4, bl5, bl6, n12, n13, bl7, bl8, bl9, string, null);
                    }
                    int n19 = 0;
                    string = string3;
                    while (true) {
                        n18 = n8;
                        bl18 = bl;
                        string2 = string4;
                        bl17 = bl2;
                        bl16 = bl3;
                        n17 = n10;
                        n16 = n11;
                        bl15 = bl4;
                        bl14 = bl5;
                        bl13 = bl6;
                        n15 = n12;
                        n14 = n13;
                        bl12 = bl7;
                        bl11 = bl8;
                        bl10 = bl9;
                        if (n19 >= string.length()) break;
                        n18 = this.indexOfElement(string, "=,;", n19);
                        string3 = string.substring(n19, n18);
                        l.e(string3, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                        string2 = ((Object)h.A0(string3)).toString();
                        if (n18 != string.length() && string.charAt(n18) != ',' && string.charAt(n18) != ';') {
                            if ((n18 = Util.indexOfNonWhitespace(string, n18 + 1)) < string.length() && string.charAt(n18) == '\"') {
                                n19 = n18 + 1;
                                n18 = h.U(string, '\"', n19, false, 4, null);
                                string3 = string.substring(n19, n18);
                                l.e(string3, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                                n19 = n18 + 1;
                            } else {
                                n19 = this.indexOfElement(string, ",;", n18);
                                string3 = string.substring(n18, n19);
                                l.e(string3, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                                string3 = ((Object)h.A0(string3)).toString();
                            }
                        } else {
                            n19 = n18 + 1;
                            string3 = null;
                        }
                        if (h.v("no-cache", string2, true)) {
                            bl2 = true;
                            continue;
                        }
                        if (h.v("no-store", string2, true)) {
                            bl3 = true;
                            continue;
                        }
                        if (h.v("max-age", string2, true)) {
                            n14 = Util.toNonNegativeInt(string3, -1);
                            n17 = n13;
                            n15 = n12;
                            n18 = n11;
                        } else if (h.v("s-maxage", string2, true)) {
                            n18 = Util.toNonNegativeInt(string3, -1);
                            n14 = n10;
                            n15 = n12;
                            n17 = n13;
                        } else {
                            if (h.v("private", string2, true)) {
                                bl4 = true;
                                continue;
                            }
                            if (h.v("public", string2, true)) {
                                bl5 = true;
                                continue;
                            }
                            if (h.v("must-revalidate", string2, true)) {
                                bl6 = true;
                                continue;
                            }
                            if (h.v("max-stale", string2, true)) {
                                n15 = Util.toNonNegativeInt(string3, Integer.MAX_VALUE);
                                n14 = n10;
                                n18 = n11;
                                n17 = n13;
                            } else if (h.v("min-fresh", string2, true)) {
                                n17 = Util.toNonNegativeInt(string3, -1);
                                n14 = n10;
                                n18 = n11;
                                n15 = n12;
                            } else {
                                if (h.v("only-if-cached", string2, true)) {
                                    bl7 = true;
                                    continue;
                                }
                                if (h.v("no-transform", string2, true)) {
                                    bl8 = true;
                                    continue;
                                }
                                n14 = n10;
                                n18 = n11;
                                n15 = n12;
                                n17 = n13;
                                if (h.v("immutable", string2, true)) {
                                    bl9 = true;
                                    continue;
                                }
                            }
                        }
                        n10 = n14;
                        n11 = n18;
                        n12 = n15;
                        n13 = n17;
                    }
                }
                ++n9;
                n8 = n18;
                bl = bl18;
                string = string2;
                bl2 = bl17;
                bl3 = bl16;
                n10 = n17;
                n11 = n16;
                bl4 = bl15;
                bl5 = bl14;
                bl6 = bl13;
                n12 = n15;
                n13 = n14;
                bl7 = bl12;
                bl8 = bl11;
                bl9 = bl10;
            }
        }
    }
}

