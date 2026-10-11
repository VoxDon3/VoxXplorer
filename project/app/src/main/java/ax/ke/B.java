/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.xc.e;
import ax.xc.f;
import java.io.IOException;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

final class B {
    private static final char[] l = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    private final String a;
    private final HttpUrl b;
    private String c;
    private HttpUrl.Builder d;
    private final Request.Builder e;
    private final Headers.Builder f;
    private MediaType g;
    private final boolean h;
    private MultipartBody.Builder i;
    private FormBody.Builder j;
    private RequestBody k;

    B(String object, HttpUrl httpUrl, String string, Headers headers, MediaType mediaType, boolean bl, boolean bl2, boolean bl3) {
        this.a = object;
        this.b = httpUrl;
        this.c = string;
        this.e = new Request.Builder();
        this.g = mediaType;
        this.h = bl;
        this.f = headers != null ? headers.newBuilder() : new Headers.Builder();
        if (bl2) {
            this.j = new FormBody.Builder();
            return;
        }
        if (bl3) {
            this.i = object = new MultipartBody.Builder();
            ((MultipartBody.Builder)object).setType(MultipartBody.FORM);
        }
    }

    private static String i(String string, boolean bl) {
        Object object;
        block1: {
            int n8 = string.length();
            int n9 = 0;
            while (true) {
                object = string;
                if (n9 >= n8) break block1;
                int n10 = string.codePointAt(n9);
                if (n10 < 32 || n10 >= 127 || " \"<>^`{}|\\?#".indexOf(n10) != -1 || !bl && (n10 == 47 || n10 == 37)) break;
                n9 += Character.charCount(n10);
            }
            object = new e();
            ((e)object).s1(string, 0, n9);
            B.j((e)object, string, n9, n8, bl);
            object = ((e)object).Z0();
        }
        return object;
    }

    /*
     * Exception decompiling
     */
    private static void j(e var0, String var1_1, int var2_2, int var3_3, boolean var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    void a(String string, String string2, boolean bl) {
        if (bl) {
            this.j.addEncoded(string, string2);
            return;
        }
        this.j.add(string, string2);
    }

    void b(String string, String string2) {
        if ("Content-Type".equalsIgnoreCase(string)) {
            try {
                this.g = MediaType.get(string2);
                return;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Malformed content type: ");
                stringBuilder.append(string2);
                throw new IllegalArgumentException(stringBuilder.toString(), illegalArgumentException);
            }
        }
        this.f.add(string, string2);
    }

    void c(Headers headers) {
        this.f.addAll(headers);
    }

    void d(Headers headers, RequestBody requestBody) {
        this.i.addPart(headers, requestBody);
    }

    void e(MultipartBody.Part part) {
        this.i.addPart(part);
    }

    void f(String charSequence, String string, boolean bl) {
        if (this.c != null) {
            String string2 = B.i(string, bl);
            String string3 = this.c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("{");
            stringBuilder.append((String)charSequence);
            stringBuilder.append("}");
            charSequence = string3.replace(stringBuilder.toString(), string2);
            if (!m.matcher(charSequence).matches()) {
                this.c = charSequence;
                return;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("@Path parameters shouldn't perform path traversal ('.' or '..'): ");
            ((StringBuilder)charSequence).append(string);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
        }
        throw new AssertionError();
    }

    void g(String charSequence, String string, boolean bl) {
        Object object = this.c;
        if (object != null) {
            this.d = object = this.b.newBuilder((String)object);
            if (object != null) {
                this.c = null;
            } else {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Malformed URL. Base: ");
                ((StringBuilder)charSequence).append(this.b);
                ((StringBuilder)charSequence).append(", Relative: ");
                ((StringBuilder)charSequence).append(this.c);
                throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
            }
        }
        if (bl) {
            this.d.addEncodedQueryParameter((String)charSequence, string);
            return;
        }
        this.d.addQueryParameter((String)charSequence, string);
    }

    <T> void h(Class<T> clazz, T t8) {
        this.e.tag(clazz, t8);
    }

    Request.Builder k() {
        Object object;
        block14: {
            Object object2;
            HttpUrl httpUrl;
            block13: {
                block12: {
                    object = this.d;
                    if (object == null) break block12;
                    httpUrl = ((HttpUrl.Builder)object).build();
                    break block13;
                }
                httpUrl = this.b.resolve(this.c);
                if (httpUrl == null) break block14;
            }
            object = object2 = this.k;
            if (object2 == null) {
                object = this.j;
                if (object != null) {
                    object = ((FormBody.Builder)object).build();
                } else {
                    object = this.i;
                    if (object != null) {
                        object = ((MultipartBody.Builder)object).build();
                    } else {
                        object = object2;
                        if (this.h) {
                            object = RequestBody.create(null, new byte[0]);
                        }
                    }
                }
            }
            MediaType mediaType = this.g;
            object2 = object;
            if (mediaType != null) {
                if (object != null) {
                    object2 = new a((RequestBody)object, mediaType);
                } else {
                    this.f.add("Content-Type", mediaType.toString());
                    object2 = object;
                }
            }
            return this.e.url(httpUrl).headers(this.f.build()).method(this.a, (RequestBody)object2);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Malformed URL. Base: ");
        ((StringBuilder)object).append(this.b);
        ((StringBuilder)object).append(", Relative: ");
        ((StringBuilder)object).append(this.c);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    void l(RequestBody requestBody) {
        this.k = requestBody;
    }

    void m(Object object) {
        this.c = object.toString();
    }

    private static class a
    extends RequestBody {
        private final RequestBody a;
        private final MediaType b;

        a(RequestBody requestBody, MediaType mediaType) {
            this.a = requestBody;
            this.b = mediaType;
        }

        @Override
        public long contentLength() throws IOException {
            return this.a.contentLength();
        }

        @Override
        public MediaType contentType() {
            return this.b;
        }

        @Override
        public void writeTo(f f8) throws IOException {
            this.a.writeTo(f8);
        }
    }
}

