package okhttp3.internal.http;

import ax.Gb.l;
import ax.xc.C3487e;
import ax.xc.h;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* loaded from: classes3.dex */
public final class HttpHeaders {
    private static final h QUOTED_STRING_DELIMITERS;
    private static final h TOKEN_DELIMITERS;

    static {
        h.a aVar = h.e0;
        QUOTED_STRING_DELIMITERS = aVar.d("\"\\");
        TOKEN_DELIMITERS = aVar.d("\t ,=");
    }

    public static final boolean hasBody(Response response) {
        l.f(response, "response");
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        l.f(headers, "<this>");
        l.f(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (ax.Ob.h.v(str, headers.name(i), true)) {
                try {
                    readChallengeHeader(new C3487e().f0(headers.value(i)), arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        l.f(response, "<this>");
        if (l.a(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1 && !ax.Ob.h.v("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bc, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void readChallengeHeader(ax.xc.C3487e r7, java.util.List<okhttp3.Challenge> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Lf
            goto Lb9
        Lf:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2e
            boolean r7 = r7.P()
            if (r7 != 0) goto L21
            goto Lb9
        L21:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            java.util.Map r0 = ax.tb.C3115F.g()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2e:
            r4 = 61
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L69
            if (r6 != 0) goto L42
            boolean r2 = r7.P()
            if (r2 == 0) goto L69
        L42:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = ax.Ob.h.z(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            ax.Gb.l.e(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L69:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.Util.skipAll(r7, r4)
            int r5 = r5 + r6
        L73:
            if (r3 != 0) goto L83
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 != 0) goto Lbc
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
        L83:
            if (r5 == 0) goto Lbc
            r6 = 1
            if (r5 <= r6) goto L89
            goto Lb9
        L89:
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r6 == 0) goto L90
            goto Lb9
        L90:
            r6 = 34
            boolean r6 = startsWith(r7, r6)
            if (r6 == 0) goto L9d
            java.lang.String r6 = readQuotedString(r7)
            goto La1
        L9d:
            java.lang.String r6 = readToken(r7)
        La1:
            if (r6 != 0) goto La4
            goto Lb9
        La4:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lad
            goto Lb9
        Lad:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lba
            boolean r3 = r7.P()
            if (r3 != 0) goto Lba
        Lb9:
            return
        Lba:
            r3 = r0
            goto L73
        Lbc:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(ax.xc.e, java.util.List):void");
    }

    private static final String readQuotedString(C3487e c3487e) throws EOFException {
        if (c3487e.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C3487e c3487e2 = new C3487e();
        while (true) {
            long d0 = c3487e.d0(QUOTED_STRING_DELIMITERS);
            if (d0 == -1) {
                return null;
            }
            if (c3487e.v(d0) == 34) {
                c3487e2.write(c3487e, d0);
                c3487e.readByte();
                return c3487e2.Z0();
            }
            if (c3487e.size() == d0 + 1) {
                return null;
            }
            c3487e2.write(c3487e, d0);
            c3487e.readByte();
            c3487e2.write(c3487e, 1L);
        }
    }

    private static final String readToken(C3487e c3487e) {
        long d0 = c3487e.d0(TOKEN_DELIMITERS);
        if (d0 == -1) {
            d0 = c3487e.size();
        }
        if (d0 != 0) {
            return c3487e.a1(d0);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        l.f(cookieJar, "<this>");
        l.f(httpUrl, "url");
        l.f(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.Companion.parseAll(httpUrl, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, parseAll);
    }

    private static final boolean skipCommasAndWhitespace(C3487e c3487e) {
        boolean z = false;
        while (!c3487e.P()) {
            byte v = c3487e.v(0L);
            if (v == 44) {
                c3487e.readByte();
                z = true;
            } else {
                if (v != 32 && v != 9) {
                    break;
                }
                c3487e.readByte();
            }
        }
        return z;
    }

    private static final boolean startsWith(C3487e c3487e, byte b) {
        return !c3487e.P() && c3487e.v(0L) == b;
    }
}
