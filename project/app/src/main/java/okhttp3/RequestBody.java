/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Db.a;
import ax.Gb.g;
import ax.Gb.l;
import ax.Ob.d;
import ax.xc.C;
import ax.xc.f;
import ax.xc.h;
import ax.xc.p;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.internal.Util;

public abstract class RequestBody {
    public static final Companion Companion = new Companion(null);

    public static final RequestBody create(h h8, MediaType mediaType) {
        return Companion.create(h8, mediaType);
    }

    public static final RequestBody create(File file, MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    public static final RequestBody create(String string, MediaType mediaType) {
        return Companion.create(string, mediaType);
    }

    public static final RequestBody create(MediaType mediaType, h h8) {
        return Companion.create(mediaType, h8);
    }

    public static final RequestBody create(MediaType mediaType, File file) {
        return Companion.create(mediaType, file);
    }

    public static final RequestBody create(MediaType mediaType, String string) {
        return Companion.create(mediaType, string);
    }

    public static final RequestBody create(MediaType mediaType, byte[] byArray) {
        return Companion.create(mediaType, byArray);
    }

    public static final RequestBody create(MediaType mediaType, byte[] byArray, int n8) {
        return Companion.create(mediaType, byArray, n8);
    }

    public static final RequestBody create(MediaType mediaType, byte[] byArray, int n8, int n9) {
        return Companion.create(mediaType, byArray, n8, n9);
    }

    public static final RequestBody create(byte[] byArray) {
        return Companion.create(byArray);
    }

    public static final RequestBody create(byte[] byArray, MediaType mediaType) {
        return Companion.create(byArray, mediaType);
    }

    public static final RequestBody create(byte[] byArray, MediaType mediaType, int n8) {
        return Companion.create(byArray, mediaType, n8);
    }

    public static final RequestBody create(byte[] byArray, MediaType mediaType, int n8, int n9) {
        return Companion.create(byArray, mediaType, n8, n9);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(f var1) throws IOException;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, h h8, MediaType mediaType, int n8, Object object) {
            if ((n8 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(h8, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int n8, Object object) {
            if ((n8 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String string, MediaType mediaType, int n8, Object object) {
            if ((n8 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(string, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] byArray, int n8, int n9, int n10, Object object) {
            if ((n10 & 4) != 0) {
                n8 = 0;
            }
            if ((n10 & 8) != 0) {
                n9 = byArray.length;
            }
            return companion.create(mediaType, byArray, n8, n9);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] byArray, MediaType mediaType, int n8, int n9, int n10, Object object) {
            if ((n10 & 1) != 0) {
                mediaType = null;
            }
            if ((n10 & 2) != 0) {
                n8 = 0;
            }
            if ((n10 & 4) != 0) {
                n9 = byArray.length;
            }
            return companion.create(byArray, mediaType, n8, n9);
        }

        public final RequestBody create(h h8, MediaType mediaType) {
            l.f(h8, "<this>");
            return new RequestBody(mediaType, h8){
                final MediaType $contentType;
                final h $this_toRequestBody;
                {
                    this.$contentType = mediaType;
                    this.$this_toRequestBody = h8;
                }

                public long contentLength() {
                    return this.$this_toRequestBody.G();
                }

                public MediaType contentType() {
                    return this.$contentType;
                }

                public void writeTo(f f8) {
                    l.f(f8, "sink");
                    f8.I0(this.$this_toRequestBody);
                }
            };
        }

        public final RequestBody create(File file, MediaType mediaType) {
            l.f(file, "<this>");
            return new RequestBody(mediaType, file){
                final MediaType $contentType;
                final File $this_asRequestBody;
                {
                    this.$contentType = mediaType;
                    this.$this_asRequestBody = file;
                }

                public long contentLength() {
                    return this.$this_asRequestBody.length();
                }

                public MediaType contentType() {
                    return this.$contentType;
                }

                public void writeTo(f f8) {
                    l.f(f8, "sink");
                    C c8 = p.j(this.$this_asRequestBody);
                    try {
                        f8.M(c8);
                    }
                    catch (Throwable throwable) {
                        try {
                            throw throwable;
                        }
                        catch (Throwable throwable2) {
                            a.a(c8, throwable);
                            throw throwable2;
                        }
                    }
                    a.a(c8, null);
                }
            };
        }

        public final RequestBody create(String object, MediaType mediaType) {
            l.f(object, "<this>");
            Charset charset = d.b;
            Comparable<Charset> comparable = charset;
            Object object2 = mediaType;
            if (mediaType != null) {
                comparable = MediaType.charset$default(mediaType, null, 1, null);
                if (comparable == null) {
                    object2 = MediaType.Companion;
                    comparable = new StringBuilder();
                    ((StringBuilder)comparable).append(mediaType);
                    ((StringBuilder)comparable).append("; charset=utf-8");
                    object2 = ((MediaType.Companion)object2).parse(((StringBuilder)comparable).toString());
                    comparable = charset;
                } else {
                    object2 = mediaType;
                }
            }
            object = ((String)object).getBytes((Charset)comparable);
            l.e(object, "this as java.lang.String).getBytes(charset)");
            return this.create((byte[])object, (MediaType)object2, 0, ((Object)object).length);
        }

        public final RequestBody create(MediaType mediaType, h h8) {
            l.f(h8, "content");
            return this.create(h8, mediaType);
        }

        public final RequestBody create(MediaType mediaType, File file) {
            l.f(file, "file");
            return this.create(file, mediaType);
        }

        public final RequestBody create(MediaType mediaType, String string) {
            l.f(string, "content");
            return this.create(string, mediaType);
        }

        public final RequestBody create(MediaType mediaType, byte[] byArray) {
            l.f(byArray, "content");
            return okhttp3.RequestBody$Companion.create$default(this, mediaType, byArray, 0, 0, 12, null);
        }

        public final RequestBody create(MediaType mediaType, byte[] byArray, int n8) {
            l.f(byArray, "content");
            return okhttp3.RequestBody$Companion.create$default(this, mediaType, byArray, n8, 0, 8, null);
        }

        public final RequestBody create(MediaType mediaType, byte[] byArray, int n8, int n9) {
            l.f(byArray, "content");
            return this.create(byArray, mediaType, n8, n9);
        }

        public final RequestBody create(byte[] byArray) {
            l.f(byArray, "<this>");
            return okhttp3.RequestBody$Companion.create$default(this, byArray, null, 0, 0, 7, null);
        }

        public final RequestBody create(byte[] byArray, MediaType mediaType) {
            l.f(byArray, "<this>");
            return okhttp3.RequestBody$Companion.create$default(this, byArray, mediaType, 0, 0, 6, null);
        }

        public final RequestBody create(byte[] byArray, MediaType mediaType, int n8) {
            l.f(byArray, "<this>");
            return okhttp3.RequestBody$Companion.create$default(this, byArray, mediaType, n8, 0, 4, null);
        }

        public final RequestBody create(byte[] byArray, MediaType mediaType, int n8, int n9) {
            l.f(byArray, "<this>");
            Util.checkOffsetAndCount(byArray.length, n8, n9);
            return new RequestBody(mediaType, n9, byArray, n8){
                final int $byteCount;
                final MediaType $contentType;
                final int $offset;
                final byte[] $this_toRequestBody;
                {
                    this.$contentType = mediaType;
                    this.$byteCount = n8;
                    this.$this_toRequestBody = byArray;
                    this.$offset = n9;
                }

                public long contentLength() {
                    return this.$byteCount;
                }

                public MediaType contentType() {
                    return this.$contentType;
                }

                public void writeTo(f f8) {
                    l.f(f8, "sink");
                    f8.write(this.$this_toRequestBody, this.$offset, this.$byteCount);
                }
            };
        }
    }
}

