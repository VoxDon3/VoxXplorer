package okhttp3;

import ax.Db.a;
import ax.Gb.k;
import ax.Gb.l;
import ax.Ob.d;
import ax.sb.t;
import ax.xc.C3487e;
import ax.xc.g;
import ax.xc.h;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.internal.Util;

/* loaded from: classes3.dex */
public abstract class ResponseBody implements Closeable, AutoCloseable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    public static final class BomAwareReader extends Reader implements AutoCloseable {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final g source;

        public BomAwareReader(g gVar, Charset charset) {
            l.f(gVar, "source");
            l.f(charset, "charset");
            this.source = gVar;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            t tVar;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                tVar = t.a;
            } else {
                tVar = null;
            }
            if (tVar == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            l.f(cArr, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.delegate;
            if (reader == null) {
                reader = new InputStreamReader(this.source.V0(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = reader;
            }
            return reader.read(cArr, i, i2);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(ax.Gb.g gVar) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            l.f(str, "<this>");
            Charset charset = d.b;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charset$default;
                }
            }
            C3487e q1 = new C3487e().q1(str, charset);
            return create(q1, mediaType, q1.size());
        }

        private Companion() {
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, h hVar, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(hVar, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, g gVar, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(gVar, mediaType, j);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            l.f(bArr, "<this>");
            return create(new C3487e().write(bArr), mediaType, bArr.length);
        }

        public final ResponseBody create(h hVar, MediaType mediaType) {
            l.f(hVar, "<this>");
            return create(new C3487e().I0(hVar), mediaType, hVar.G());
        }

        public final ResponseBody create(final g gVar, final MediaType mediaType, final long j) {
            l.f(gVar, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                public g source() {
                    return gVar;
                }
            };
        }

        public final ResponseBody create(MediaType mediaType, String str) {
            l.f(str, "content");
            return create(str, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            l.f(bArr, "content");
            return create(bArr, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, h hVar) {
            l.f(hVar, "content");
            return create(hVar, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, long j, g gVar) {
            l.f(gVar, "content");
            return create(gVar, mediaType, j);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType contentType = contentType();
        return (contentType == null || (charset = contentType.charset(d.b)) == null) ? d.b : charset;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(ax.Fb.l<? super g, ? extends T> lVar, ax.Fb.l<? super T, Integer> lVar2) {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
        g source = source();
        try {
            T invoke = lVar.invoke(source);
            k.b(1);
            a.a(source, null);
            k.a(1);
            int intValue = lVar2.invoke(invoke).intValue();
            if (contentLength == -1 || contentLength == intValue) {
                return invoke;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + intValue + ") disagree");
        } finally {
        }
    }

    public static final ResponseBody create(g gVar, MediaType mediaType, long j) {
        return Companion.create(gVar, mediaType, j);
    }

    public final InputStream byteStream() {
        return source().V0();
    }

    public final h byteString() throws IOException {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
        g source = source();
        try {
            h m0 = source.m0();
            a.a(source, null);
            int G = m0.G();
            if (contentLength == -1 || contentLength == G) {
                return m0;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + G + ") disagree");
        } finally {
        }
    }

    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
        g source = source();
        try {
            byte[] O = source.O();
            a.a(source, null);
            int length = O.length;
            if (contentLength == -1 || contentLength == length) {
                return O;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract g source();

    public final String string() throws IOException {
        g source = source();
        try {
            String i0 = source.i0(Util.readBomAsCharset(source, charset()));
            a.a(source, null);
            return i0;
        } finally {
        }
    }

    public static final ResponseBody create(h hVar, MediaType mediaType) {
        return Companion.create(hVar, mediaType);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, long j, g gVar) {
        return Companion.create(mediaType, j, gVar);
    }

    public static final ResponseBody create(MediaType mediaType, h hVar) {
        return Companion.create(mediaType, hVar);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }
}
