/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.g;
import ax.Gb.l;
import ax.xc.e;
import ax.xc.f;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class FormBody
extends RequestBody {
    private static final MediaType CONTENT_TYPE;
    public static final Companion Companion;
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    static {
        Companion = new Companion(null);
        CONTENT_TYPE = MediaType.Companion.get("application/x-www-form-urlencoded");
    }

    public FormBody(List<String> list, List<String> list2) {
        l.f(list, "encodedNames");
        l.f(list2, "encodedValues");
        this.encodedNames = Util.toImmutableList(list);
        this.encodedValues = Util.toImmutableList(list2);
    }

    private final long writeOrCountBytes(f f8, boolean bl) {
        if (bl) {
            f8 = new e();
        } else {
            l.c(f8);
            f8 = f8.k();
        }
        int n8 = this.encodedNames.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (i8 > 0) {
                ((e)f8).j1(38);
            }
            ((e)f8).r1(this.encodedNames.get(i8));
            ((e)f8).j1(61);
            ((e)f8).r1(this.encodedValues.get(i8));
        }
        if (bl) {
            long l8 = ((e)f8).size();
            ((e)f8).b();
            return l8;
        }
        return 0L;
    }

    public final int -deprecated_size() {
        return this.size();
    }

    @Override
    public long contentLength() {
        return this.writeOrCountBytes(null, true);
    }

    @Override
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public final String encodedName(int n8) {
        return this.encodedNames.get(n8);
    }

    public final String encodedValue(int n8) {
        return this.encodedValues.get(n8);
    }

    public final String name(int n8) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, this.encodedName(n8), 0, 0, true, 3, null);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    public final String value(int n8) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, this.encodedValue(n8), 0, 0, true, 3, null);
    }

    @Override
    public void writeTo(f f8) throws IOException {
        l.f(f8, "sink");
        this.writeOrCountBytes(f8, false);
    }

    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
            this(null, 1, null);
        }

        public Builder(Charset charset) {
            this.charset = charset;
            this.names = new ArrayList<String>();
            this.values = new ArrayList<String>();
        }

        public /* synthetic */ Builder(Charset charset, int n8, g g8) {
            if ((n8 & 1) != 0) {
                charset = null;
            }
            this(charset);
        }

        public final Builder add(String string, String string2) {
            l.f(string, "name");
            l.f(string2, "value");
            Collection collection = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            collection.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, string, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.charset, 91, null));
            ((Collection)this.values).add(HttpUrl.Companion.canonicalize$okhttp$default(companion, string2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.charset, 91, null));
            return this;
        }

        public final Builder addEncoded(String string, String string2) {
            l.f(string, "name");
            l.f(string2, "value");
            Collection collection = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            collection.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, string, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.charset, 83, null));
            ((Collection)this.values).add(HttpUrl.Companion.canonicalize$okhttp$default(companion, string2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.charset, 83, null));
            return this;
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }
    }
}

