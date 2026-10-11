package ax.r8;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: ax.r8.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3000i {
    public boolean e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public C2997f g() {
        if (l()) {
            return (C2997f) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public C3003l h() {
        if (p()) {
            return (C3003l) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public C3006o i() {
        if (q()) {
            return (C3006o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean l() {
        return this instanceof C2997f;
    }

    public boolean n() {
        return this instanceof C3002k;
    }

    public boolean p() {
        return this instanceof C3003l;
    }

    public boolean q() {
        return this instanceof C3006o;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            ax.t8.l.b(this, jsonWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
