/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http;

import ax.Gb.l;
import ax.Ob.h;
import ax.tb.F;
import ax.xc.e;
import ax.xc.h;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

public final class HttpHeaders {
    private static final ax.xc.h QUOTED_STRING_DELIMITERS;
    private static final ax.xc.h TOKEN_DELIMITERS;

    static {
        h.a a8 = ax.xc.h.e0;
        QUOTED_STRING_DELIMITERS = a8.d("\"\\");
        TOKEN_DELIMITERS = a8.d("\t ,=");
    }

    public static final boolean hasBody(Response response) {
        l.f(response, "response");
        return HttpHeaders.promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String string) {
        l.f(headers, "<this>");
        l.f(string, "headerName");
        ArrayList<Challenge> arrayList = new ArrayList<Challenge>();
        int n8 = headers.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!h.v(string, headers.name(i8), true)) continue;
            e e8 = new e().r1(headers.value(i8));
            try {
                HttpHeaders.readChallengeHeader(e8, arrayList);
                continue;
            }
            catch (EOFException eOFException) {
                Platform.Companion.get().log("Unable to parse challenge", 5, eOFException);
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        l.f(response, "<this>");
        if (l.a(response.request().method(), "HEAD")) {
            return false;
        }
        int n8 = response.code();
        if ((n8 < 100 || n8 >= 200) && n8 != 204 && n8 != 304) {
            return true;
        }
        return Util.headersContentLength(response) != -1L || h.v("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true);
        {
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final void readChallengeHeader(e e8, List<Challenge> list) throws EOFException {
        block0: while (true) {
            Object object = null;
            while (true) {
                Object var6_16;
                String string = object;
                if (object == null) {
                    HttpHeaders.skipCommasAndWhitespace(e8);
                    object = HttpHeaders.readToken(e8);
                    string = object;
                    if (object == null) return;
                }
                boolean bl = HttpHeaders.skipCommasAndWhitespace(e8);
                String string2 = HttpHeaders.readToken(e8);
                if (string2 == null) {
                    if (!e8.P()) return;
                    list.add(new Challenge(string, F.<String, String>g()));
                    return;
                }
                int n8 = Util.skipAll(e8, (byte)61);
                boolean bl2 = HttpHeaders.skipCommasAndWhitespace(e8);
                if (!bl && (bl2 || e8.P())) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append(h.z("=", n8));
                    object = Collections.singletonMap(null, ((StringBuilder)object).toString());
                    l.e(object, "singletonMap<String, Str\u2026ek + \"=\".repeat(eqCount))");
                    list.add(new Challenge(string, (Map<String, String>)object));
                    continue block0;
                }
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
                n8 += Util.skipAll(e8, (byte)61);
                while (true) {
                    String var6_14;
                    Object var6_8;
                    object = var6_8;
                    if (var6_8 == null) {
                        object = HttpHeaders.readToken(e8);
                        CharSequence charSequence = object;
                        if (HttpHeaders.skipCommasAndWhitespace(e8)) break;
                        n8 = Util.skipAll(e8, (byte)61);
                    }
                    CharSequence charSequence = object;
                    if (n8 == 0) break;
                    if (n8 > 1 || HttpHeaders.skipCommasAndWhitespace(e8)) return;
                    if (HttpHeaders.startsWith(e8, (byte)34)) {
                        String string3 = HttpHeaders.readQuotedString(e8);
                    } else {
                        String string4 = HttpHeaders.readToken(e8);
                    }
                    if (var6_14 == null || linkedHashMap.put((String)object, (String)var6_14) != null || !HttpHeaders.skipCommasAndWhitespace(e8) && !e8.P()) {
                        return;
                    }
                    Object var6_15 = null;
                }
                list.add(new Challenge(string, linkedHashMap));
                object = var6_16;
            }
            break;
        }
    }

    private static final String readQuotedString(e e8) throws EOFException {
        if (e8.readByte() == 34) {
            e e9 = new e();
            while (true) {
                long l8;
                if ((l8 = e8.d0(QUOTED_STRING_DELIMITERS)) == -1L) {
                    return null;
                }
                if (e8.v(l8) == 34) {
                    e9.write(e8, l8);
                    e8.readByte();
                    return e9.Z0();
                }
                if (e8.size() == l8 + 1L) {
                    return null;
                }
                e9.write(e8, l8);
                e8.readByte();
                e9.write(e8, 1L);
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final String readToken(e e8) {
        long l8;
        long l9 = l8 = e8.d0(TOKEN_DELIMITERS);
        if (l8 == -1L) {
            l9 = e8.size();
        }
        if (l9 != 0L) {
            return e8.a1(l9);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers iterable) {
        l.f(cookieJar, "<this>");
        l.f(httpUrl, "url");
        l.f(iterable, "headers");
        if (cookieJar == CookieJar.NO_COOKIES || (iterable = Cookie.Companion.parseAll(httpUrl, (Headers)iterable)).isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, (List<Cookie>)iterable);
    }

    private static final boolean skipCommasAndWhitespace(e e8) {
        boolean bl = false;
        while (!e8.P()) {
            byte by = e8.v(0L);
            if (by == 44) {
                e8.readByte();
                bl = true;
                continue;
            }
            if (by != 32 && by != 9) break;
            e8.readByte();
        }
        return bl;
    }

    private static final boolean startsWith(e e8, byte by) {
        return !e8.P() && e8.v(0L) == by;
    }
}

