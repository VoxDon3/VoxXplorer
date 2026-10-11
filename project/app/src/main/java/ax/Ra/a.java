/*
 * Decompiled with CFR 0.152.
 */
package ax.Ra;

import ax.Ra.d;
import ax.Ra.e;
import ax.r8.j;
import ax.r8.r;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;

public class a {
    private final Gson a;
    private final d b;
    private final e.g c;

    a(Gson gson, d d8, e.g g8) {
        if (d8 != null) {
            this.a = gson;
            this.b = d8;
            this.c = g8;
            return;
        }
        throw new NullPointerException("XmlParserCreator is null");
    }

    private static void a(Object object, JsonReader jsonReader) {
        if (object != null) {
            try {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    object = new j("JSON document was not fully consumed.");
                    throw object;
                }
            }
            catch (IOException iOException) {
                throw new j(iOException);
            }
            catch (MalformedJsonException malformedJsonException) {
                throw new r(malformedJsonException);
            }
        }
    }

    public <T> T b(e e8, Type type) throws j, r {
        return this.a.h(e8, type);
    }

    public <T> T c(Reader closeable, Class<T> clazz) throws r, j {
        closeable = new e((Reader)closeable, this.b, this.c);
        T t8 = this.b((e)closeable, clazz);
        ax.Ra.a.a(t8, (JsonReader)closeable);
        return ax.t8.j.b(clazz).cast(t8);
    }

    public String toString() {
        return this.a.toString();
    }
}

