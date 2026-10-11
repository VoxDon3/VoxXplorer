/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Db.a;
import ax.Gb.g;
import ax.Gb.k;
import ax.Gb.l;
import ax.Ob.d;
import ax.sb.t;
import ax.xc.e;
import ax.xc.h;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.internal.Util;

public abstract class ResponseBody
implements Closeable,
AutoCloseable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    private final Charset charset() {
        Object object = this.contentType();
        if (object != null && (object = ((MediaType)object).charset(d.b)) != null) {
            return object;
        }
        return d.b;
    }

    private final <T> T consumeSource(ax.Fb.l<? super ax.xc.g, ? extends T> object, ax.Fb.l<? super T, Integer> l8) {
        long l9 = this.contentLength();
        if (l9 <= Integer.MAX_VALUE) {
            ax.xc.g g8 = this.source();
            try {
                object = object.invoke(g8);
            }
            catch (Throwable throwable) {
                try {
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    k.b(1);
                    a.a(g8, throwable);
                    k.a(1);
                    throw throwable2;
                }
            }
            k.b(1);
            a.a(g8, null);
            k.a(1);
            int n8 = ((Number)l8.invoke(object)).intValue();
            if (l9 != -1L && l9 != (long)n8) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Content-Length (");
                ((StringBuilder)object).append(l9);
                ((StringBuilder)object).append(") and stream length (");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append(") disagree");
                throw new IOException(((StringBuilder)object).toString());
            }
            return (T)object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Cannot buffer entire body for content length: ");
        ((StringBuilder)object).append(l9);
        throw new IOException(((StringBuilder)object).toString());
    }

    public static final ResponseBody create(ax.xc.g g8, MediaType mediaType, long l8) {
        return Companion.create(g8, mediaType, l8);
    }

    public static final ResponseBody create(h h8, MediaType mediaType) {
        return Companion.create(h8, mediaType);
    }

    public static final ResponseBody create(String string, MediaType mediaType) {
        return Companion.create(string, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, long l8, ax.xc.g g8) {
        return Companion.create(mediaType, l8, g8);
    }

    public static final ResponseBody create(MediaType mediaType, h h8) {
        return Companion.create(mediaType, h8);
    }

    public static final ResponseBody create(MediaType mediaType, String string) {
        return Companion.create(mediaType, string);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] byArray) {
        return Companion.create(mediaType, byArray);
    }

    public static final ResponseBody create(byte[] byArray, MediaType mediaType) {
        return Companion.create(byArray, mediaType);
    }

    public final InputStream byteStream() {
        return this.source().V0();
    }

    public final h byteString() throws IOException {
        long l8 = this.contentLength();
        if (l8 <= Integer.MAX_VALUE) {
            h h8;
            Object object = this.source();
            try {
                h8 = object.m0();
            }
            catch (Throwable throwable) {
                try {
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    a.a((Closeable)object, throwable);
                    throw throwable2;
                }
            }
            a.a((Closeable)object, null);
            int n8 = h8.G();
            if (l8 != -1L && l8 != (long)n8) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Content-Length (");
                ((StringBuilder)object).append(l8);
                ((StringBuilder)object).append(") and stream length (");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append(") disagree");
                throw new IOException(((StringBuilder)object).toString());
            }
            return h8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot buffer entire body for content length: ");
        stringBuilder.append(l8);
        throw new IOException(stringBuilder.toString());
    }

    public final byte[] bytes() throws IOException {
        long l8 = this.contentLength();
        if (l8 <= Integer.MAX_VALUE) {
            byte[] byArray;
            Object object = this.source();
            try {
                byArray = object.O();
            }
            catch (Throwable throwable) {
                try {
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    a.a((Closeable)object, throwable);
                    throw throwable2;
                }
            }
            a.a((Closeable)object, null);
            int n8 = byArray.length;
            if (l8 != -1L && l8 != (long)n8) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Content-Length (");
                ((StringBuilder)object).append(l8);
                ((StringBuilder)object).append(") and stream length (");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append(") disagree");
                throw new IOException(((StringBuilder)object).toString());
            }
            return byArray;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot buffer entire body for content length: ");
        stringBuilder.append(l8);
        throw new IOException(stringBuilder.toString());
    }

    public final Reader charStream() {
        Reader reader;
        Reader reader2 = reader = this.reader;
        if (reader == null) {
            this.reader = reader2 = new BomAwareReader(this.source(), this.charset());
        }
        return reader2;
    }

    @Override
    public void close() {
        Util.closeQuietly(this.source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract ax.xc.g source();

    public final String string() throws IOException {
        String string;
        ax.xc.g g8 = this.source();
        try {
            string = g8.i0(Util.readBomAsCharset(g8, this.charset()));
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                a.a(g8, throwable);
                throw throwable2;
            }
        }
        a.a(g8, null);
        return string;
    }

    public static final class BomAwareReader
    extends Reader
    implements AutoCloseable {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final ax.xc.g source;

        public BomAwareReader(ax.xc.g g8, Charset charset) {
            l.f(g8, "source");
            l.f(charset, "charset");
            this.source = g8;
            this.charset = charset;
        }

        @Override
        public void close() throws IOException {
            this.closed = true;
            Object object = this.delegate;
            if (object != null) {
                ((Reader)object).close();
                object = t.a;
            } else {
                object = null;
            }
            if (object == null) {
                this.source.close();
            }
        }

        @Override
        public int read(char[] cArray, int n8, int n9) throws IOException {
            l.f(cArray, "cbuf");
            if (!this.closed) {
                Reader reader;
                Reader reader2 = reader = this.delegate;
                if (reader == null) {
                    this.delegate = reader2 = new InputStreamReader(this.source.V0(), Util.readBomAsCharset(this.source, this.charset));
                }
                return reader2.read(cArray, n8, n9);
            }
            throw new IOException("Stream closed");
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, ax.xc.g g8, MediaType mediaType, long l8, int n8, Object object) {
            if ((n8 & 1) != 0) {
                mediaType = null;
            }
            if ((n8 & 2) != 0) {
                l8 = -1L;
            }
            return companion.create(g8, mediaType, l8);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, h h8, MediaType mediaType, int n8, Object object) {
            if ((n8 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(h8, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String string, MediaType mediaType, int n8, Object object) {
            if ((n8 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(string, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] byArray, MediaType mediaType, int n8, Object object) {
            if ((n8 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(byArray, mediaType);
        }

        public final ResponseBody create(ax.xc.g g8, MediaType mediaType, long l8) {
            l.f(g8, "<this>");
            return new ResponseBody(mediaType, l8, g8){
                final long $contentLength;
                final MediaType $contentType;
                final ax.xc.g $this_asResponseBody;
                {
                    this.$contentType = mediaType;
                    this.$contentLength = l8;
                    this.$this_asResponseBody = g8;
                }

                public long contentLength() {
                    return this.$contentLength;
                }

                public MediaType contentType() {
                    return this.$contentType;
                }

                public ax.xc.g source() {
                    return this.$this_asResponseBody;
                }
            };
        }

        public final ResponseBody create(h h8, MediaType mediaType) {
            l.f(h8, "<this>");
            return this.create(new e().f1(h8), mediaType, h8.G());
        }

        public final ResponseBody create(String object, MediaType mediaType) {
            l.f(object, "<this>");
            Charset charset = d.b;
            Object object2 = charset;
            Object object3 = mediaType;
            if (mediaType != null) {
                object2 = MediaType.charset$default(mediaType, null, 1, null);
                if (object2 == null) {
                    object2 = MediaType.Companion;
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append(mediaType);
                    ((StringBuilder)object3).append("; charset=utf-8");
                    object3 = ((MediaType.Companion)object2).parse(((StringBuilder)object3).toString());
                    object2 = charset;
                } else {
                    object3 = mediaType;
                }
            }
            object = new e().q1((String)object, (Charset)object2);
            return this.create((ax.xc.g)object, (MediaType)object3, ((e)object).size());
        }

        public final ResponseBody create(MediaType mediaType, long l8, ax.xc.g g8) {
            l.f(g8, "content");
            return this.create(g8, mediaType, l8);
        }

        public final ResponseBody create(MediaType mediaType, h h8) {
            l.f(h8, "content");
            return this.create(h8, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, String string) {
            l.f(string, "content");
            return this.create(string, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] byArray) {
            l.f(byArray, "content");
            return this.create(byArray, mediaType);
        }

        public final ResponseBody create(byte[] byArray, MediaType mediaType) {
            l.f(byArray, "<this>");
            return this.create(new e().h1(byArray), mediaType, byArray.length);
        }
    }
}

