package ax.Ra;

import ax.Ra.e;
import ax.r8.C3001j;
import ax.r8.C3009r;
import ax.t8.j;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public class a {
    private final Gson a;
    private final d b;
    private final e.g c;

    a(Gson gson, d dVar, e.g gVar) {
        if (dVar == null) {
            throw new NullPointerException("XmlParserCreator is null");
        }
        this.a = gson;
        this.b = dVar;
        this.c = gVar;
    }

    private static void a(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                } else {
                    throw new C3001j("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new C3009r(e);
            } catch (IOException e2) {
                throw new C3001j(e2);
            }
        }
    }

    public <T> T b(e eVar, Type type) throws C3001j, C3009r {
        return (T) this.a.h(eVar, type);
    }

    public <T> T c(Reader reader, Class<T> cls) throws C3009r, C3001j {
        e eVar = new e(reader, this.b, this.c);
        Object b = b(eVar, cls);
        a(b, eVar);
        return (T) j.b(cls).cast(b);
    }

    public String toString() {
        return this.a.toString();
    }
}
