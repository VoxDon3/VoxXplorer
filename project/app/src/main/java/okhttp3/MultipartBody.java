/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.g;
import ax.Gb.l;
import ax.xc.e;
import ax.xc.f;
import ax.xc.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class MultipartBody
extends RequestBody {
    public static final MediaType ALTERNATIVE;
    private static final byte[] COLONSPACE;
    private static final byte[] CRLF;
    public static final Companion Companion;
    private static final byte[] DASHDASH;
    public static final MediaType DIGEST;
    public static final MediaType FORM;
    public static final MediaType MIXED;
    public static final MediaType PARALLEL;
    private final h boundaryByteString;
    private long contentLength;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;

    static {
        Companion = new Companion(null);
        MediaType.Companion companion = MediaType.Companion;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
        COLONSPACE = new byte[]{58, 32};
        CRLF = new byte[]{13, 10};
        DASHDASH = new byte[]{45, 45};
    }

    public MultipartBody(h object, MediaType mediaType, List<Part> object2) {
        l.f(object, "boundaryByteString");
        l.f(mediaType, "type");
        l.f(object2, "parts");
        this.boundaryByteString = object;
        this.type = mediaType;
        this.parts = object2;
        object = MediaType.Companion;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(mediaType);
        ((StringBuilder)object2).append("; boundary=");
        ((StringBuilder)object2).append(this.boundary());
        this.contentType = ((MediaType.Companion)object).get(((StringBuilder)object2).toString());
        this.contentLength = -1L;
    }

    private final long writeOrCountBytes(f f8, boolean bl) throws IOException {
        long l8;
        Object object;
        f f9 = bl ? (f8 = new e()) : null;
        int n8 = this.parts.size();
        long l9 = 0L;
        for (int i8 = 0; i8 < n8; ++i8) {
            object = this.parts.get(i8);
            Object object2 = ((Part)object).headers();
            object = ((Part)object).body();
            l.c(f8);
            f8.write(DASHDASH);
            f8.I0(this.boundaryByteString);
            f8.write(CRLF);
            if (object2 != null) {
                int n9 = ((Headers)object2).size();
                for (int i9 = 0; i9 < n9; ++i9) {
                    f8.f0(((Headers)object2).name(i9)).write(COLONSPACE).f0(((Headers)object2).value(i9)).write(CRLF);
                }
            }
            if ((object2 = ((RequestBody)object).contentType()) != null) {
                f8.f0("Content-Type: ").f0(((MediaType)object2).toString()).write(CRLF);
            }
            if ((l8 = ((RequestBody)object).contentLength()) != -1L) {
                f8.f0("Content-Length: ").Q0(l8).write(CRLF);
            } else if (bl) {
                l.c(f9);
                ((e)f9).b();
                return -1L;
            }
            object2 = CRLF;
            f8.write((byte[])object2);
            if (bl) {
                l9 += l8;
            } else {
                ((RequestBody)object).writeTo(f8);
            }
            f8.write((byte[])object2);
        }
        l.c(f8);
        object = DASHDASH;
        f8.write((byte[])object);
        f8.I0(this.boundaryByteString);
        f8.write((byte[])object);
        f8.write(CRLF);
        l8 = l9;
        if (bl) {
            l.c(f9);
            l8 = l9 + ((e)f9).size();
            ((e)f9).b();
        }
        return l8;
    }

    public final String -deprecated_boundary() {
        return this.boundary();
    }

    public final List<Part> -deprecated_parts() {
        return this.parts;
    }

    public final int -deprecated_size() {
        return this.size();
    }

    public final MediaType -deprecated_type() {
        return this.type;
    }

    public final String boundary() {
        return this.boundaryByteString.K();
    }

    @Override
    public long contentLength() throws IOException {
        long l8;
        long l9 = l8 = this.contentLength;
        if (l8 == -1L) {
            this.contentLength = l9 = this.writeOrCountBytes(null, true);
        }
        return l9;
    }

    @Override
    public MediaType contentType() {
        return this.contentType;
    }

    public final Part part(int n8) {
        return this.parts.get(n8);
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final int size() {
        return this.parts.size();
    }

    public final MediaType type() {
        return this.type;
    }

    @Override
    public void writeTo(f f8) throws IOException {
        l.f(f8, "sink");
        this.writeOrCountBytes(f8, false);
    }

    public static final class Builder {
        private final h boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this(null, 1, null);
        }

        public Builder(String string) {
            l.f(string, "boundary");
            this.boundary = h.e0.d(string);
            this.type = MIXED;
            this.parts = new ArrayList<Part>();
        }

        public /* synthetic */ Builder(String string, int n8, g g8) {
            if ((n8 & 1) != 0) {
                string = UUID.randomUUID().toString();
                l.e(string, "randomUUID().toString()");
            }
            this(string);
        }

        public final Builder addFormDataPart(String string, String string2) {
            l.f(string, "name");
            l.f(string2, "value");
            this.addPart(Part.Companion.createFormData(string, string2));
            return this;
        }

        public final Builder addFormDataPart(String string, String string2, RequestBody requestBody) {
            l.f(string, "name");
            l.f(requestBody, "body");
            this.addPart(Part.Companion.createFormData(string, string2, requestBody));
            return this;
        }

        public final Builder addPart(Headers headers, RequestBody requestBody) {
            l.f(requestBody, "body");
            this.addPart(Part.Companion.create(headers, requestBody));
            return this;
        }

        public final Builder addPart(Part part) {
            l.f(part, "part");
            ((Collection)this.parts).add(part);
            return this;
        }

        public final Builder addPart(RequestBody requestBody) {
            l.f(requestBody, "body");
            this.addPart(Part.Companion.create(requestBody));
            return this;
        }

        public final MultipartBody build() {
            if (!((Collection)this.parts).isEmpty()) {
                return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        public final Builder setType(MediaType mediaType) {
            l.f(mediaType, "type");
            if (l.a(mediaType.type(), "multipart")) {
                this.type = mediaType;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("multipart != ");
            stringBuilder.append(mediaType);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final void appendQuotedString$okhttp(StringBuilder stringBuilder, String string) {
            l.f(stringBuilder, "<this>");
            l.f(string, "key");
            stringBuilder.append('\"');
            int n8 = string.length();
            for (int i8 = 0; i8 < n8; ++i8) {
                char c8 = string.charAt(i8);
                if (c8 == '\n') {
                    stringBuilder.append("%0A");
                    continue;
                }
                if (c8 == '\r') {
                    stringBuilder.append("%0D");
                    continue;
                }
                if (c8 == '\"') {
                    stringBuilder.append("%22");
                    continue;
                }
                stringBuilder.append(c8);
            }
            stringBuilder.append('\"');
        }
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    public static final class Part {
        public static final Companion Companion = new Companion(null);
        private final RequestBody body;
        private final Headers headers;

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, g g8) {
            this(headers, requestBody);
        }

        public static final Part create(Headers headers, RequestBody requestBody) {
            return Companion.create(headers, requestBody);
        }

        public static final Part create(RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        public static final Part createFormData(String string, String string2) {
            return Companion.createFormData(string, string2);
        }

        public static final Part createFormData(String string, String string2, RequestBody requestBody) {
            return Companion.createFormData(string, string2, requestBody);
        }

        public final RequestBody -deprecated_body() {
            return this.body;
        }

        public final Headers -deprecated_headers() {
            return this.headers;
        }

        public final RequestBody body() {
            return this.body;
        }

        public final Headers headers() {
            return this.headers;
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g g8) {
                this();
            }

            public final Part create(Headers headers, RequestBody requestBody) {
                l.f(requestBody, "body");
                String string = headers != null ? headers.get("Content-Type") : null;
                if (string == null) {
                    string = headers != null ? headers.get("Content-Length") : null;
                    if (string == null) {
                        return new Part(headers, requestBody, null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }

            public final Part create(RequestBody requestBody) {
                l.f(requestBody, "body");
                return this.create(null, requestBody);
            }

            public final Part createFormData(String string, String string2) {
                l.f(string, "name");
                l.f(string2, "value");
                return this.createFormData(string, null, RequestBody.Companion.create$default(RequestBody.Companion, string2, null, 1, null));
            }

            public final Part createFormData(String string, String string2, RequestBody requestBody) {
                l.f(string, "name");
                l.f(requestBody, "body");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("form-data; name=");
                okhttp3.MultipartBody$Companion companion = MultipartBody.Companion;
                companion.appendQuotedString$okhttp(stringBuilder, string);
                if (string2 != null) {
                    stringBuilder.append("; filename=");
                    companion.appendQuotedString$okhttp(stringBuilder, string2);
                }
                string = stringBuilder.toString();
                l.e(string, "StringBuilder().apply(builderAction).toString()");
                return this.create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", string).build(), requestBody);
            }
        }
    }
}

