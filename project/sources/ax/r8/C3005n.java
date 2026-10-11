package ax.r8;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* renamed from: ax.r8.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3005n {
    @Deprecated
    public C3005n() {
    }

    public static AbstractC3000i b(JsonReader jsonReader) throws C3001j, C3009r {
        boolean isLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            try {
                return ax.t8.l.a(jsonReader);
            } catch (OutOfMemoryError e) {
                throw new C3004m("Failed parsing JSON source: " + jsonReader + " to Json", e);
            } catch (StackOverflowError e2) {
                throw new C3004m("Failed parsing JSON source: " + jsonReader + " to Json", e2);
            }
        } finally {
            jsonReader.setLenient(isLenient);
        }
    }

    public static AbstractC3000i c(Reader reader) throws C3001j, C3009r {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            AbstractC3000i b = b(jsonReader);
            if (!b.n() && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new C3009r("Did not consume the entire document.");
            }
            return b;
        } catch (MalformedJsonException e) {
            throw new C3009r(e);
        } catch (IOException e2) {
            throw new C3001j(e2);
        } catch (NumberFormatException e3) {
            throw new C3009r(e3);
        }
    }

    public static AbstractC3000i d(String str) throws C3009r {
        return c(new StringReader(str));
    }

    @Deprecated
    public AbstractC3000i a(String str) throws C3009r {
        return d(str);
    }
}
