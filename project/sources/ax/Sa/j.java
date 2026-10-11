package ax.Sa;

import ax.Ua.m;
import ax.Ua.o;
import ax.Ua.p;
import ax.Va.c;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
class j {
    private static final ax.Xd.d c = ax.Xd.f.k(j.class);
    private static final Pattern d = Pattern.compile("bytes\\D+(\\d+)-\\d+/(\\d+)");
    private OkHttpClient a;
    private List<b> b;

    j(OkHttpClient okHttpClient, List<b> list) {
        this.a = okHttpClient;
        this.b = list;
    }

    private Request.Builder a() {
        Request.Builder builder = new Request.Builder();
        for (b bVar : this.b) {
            builder.addHeader(bVar.a(), bVar.b());
        }
        return builder;
    }

    private Response b(String str, String str2) throws IOException {
        return this.a.newCall(a().method(str, "PUT".equals(str) ? RequestBody.create(new byte[0], (MediaType) null) : null).url(str2).build()).execute();
    }

    private void c(Response response) throws IOException {
        ResponseBody body;
        if (response == null || (body = response.body()) == null) {
            return;
        }
        body.close();
    }

    private <T> T g(Response response, Class<T> cls) throws IOException {
        ResponseBody responseBody;
        try {
            responseBody = response.body();
            try {
                T t = (T) new Gson().i(responseBody.charStream(), cls);
                responseBody.close();
                return t;
            } catch (Throwable th) {
                th = th;
                if (responseBody != null) {
                    responseBody.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            responseBody = null;
        }
    }

    private static void h(InputStream inputStream, long j) throws IOException {
        while (j > 0) {
            long skip = inputStream.skip(j);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    throw new IOException("Unable to seek response stream");
                }
                skip = 1;
            }
            j -= skip;
        }
    }

    private void i(String str, long j, long j2, RequestBody requestBody) throws IOException, ax.Ua.g {
        ax.Xd.d dVar = c;
        dVar.n("uploadFile: put to url: " + str);
        Request.Builder put = a().removeHeader("Authorization").url(str).put(requestBody);
        if (j2 > 0) {
            String str2 = "bytes " + j2 + "-" + (j - 1) + "/" + j;
            dVar.n("Content-Range: " + str2);
            put.addHeader("Content-Range", str2);
        }
        Response execute = this.a.newCall(put.build()).execute();
        try {
            int code = execute.code();
            if (code == 201 || code == 202) {
                dVar.n("uploadFile: uploaded successfully");
                execute.close();
                return;
            }
            if (code == 404) {
                throw new m(code, null);
            }
            if (code == 409) {
                throw new ax.Ua.c(code, null);
            }
            if (code == 503) {
                throw new p(code, null);
            }
            if (code == 507) {
                throw new ax.Ua.h(code, null);
            }
            if (code == 412) {
                throw new o(code, null);
            }
            if (code == 413) {
                throw new ax.Ua.d(code, null);
            }
            throw new ax.Ua.g(code);
        } catch (Throwable th) {
            if (execute != null) {
                try {
                    execute.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    ax.Va.c d(String str) throws IOException, ax.Ta.d {
        try {
            Response b = b("DELETE", str);
            int code = b.code();
            if (code == 202) {
                ax.Va.c cVar = (ax.Va.c) g(b, ax.Va.c.class);
                cVar.d(c.b.inProgress);
                c(b);
                return cVar;
            }
            if (code != 204) {
                throw ax.Wa.b.b(b.code(), b.body().byteStream());
            }
            c(b);
            ax.Va.c cVar2 = ax.Va.c.e;
            c(b);
            return cVar2;
        } catch (Throwable th) {
            c(null);
            throw th;
        }
    }

    InputStream e(String str, long j) throws IOException, ax.Ua.g {
        if (j < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        Request.Builder url = a().url(str);
        if (j > 0) {
            url.header("Range", "bytes=" + j + "-");
        }
        Response execute = this.a.newCall(url.build()).execute();
        int code = execute.code();
        if (code != 200 && code != 206) {
            try {
                ResponseBody body = execute.body();
                if (body == null) {
                    throw new ax.Ua.g(code);
                }
                throw ax.Wa.b.b(code, body.byteStream());
            } catch (Throwable th) {
                execute.close();
                throw th;
            }
        }
        ResponseBody body2 = execute.body();
        if (body2 == null) {
            execute.close();
            throw new IOException("Empty response body");
        }
        InputStream byteStream = body2.byteStream();
        if (j <= 0 || code != 200) {
            return byteStream;
        }
        try {
            h(byteStream, j);
            return byteStream;
        } catch (IOException e) {
            execute.close();
            throw e;
        }
    }

    ax.Va.d f(String str) throws IOException, ax.Ua.g {
        Response b = b("GET", str);
        try {
            int code = b.code();
            if (!b.isSuccessful()) {
                throw new ax.Ua.g(code);
            }
            ax.Va.d dVar = (ax.Va.d) g(b, ax.Va.d.class);
            b.close();
            return dVar;
        } catch (Throwable th) {
            if (b != null) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    void j(String str, k kVar, d dVar) throws IOException, ax.Ua.g {
        i(str, kVar.length(), 0L, f.b(MediaType.get("application/octet-stream"), kVar, 0L, dVar));
    }
}
