package ax.M7;

import android.util.Base64;
import android.util.JsonReader;
import ax.L7.C0799a;
import ax.L7.F;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class j {
    private static final ax.U7.a a = new ax.W7.d().j(C0799a.a).k(true).i();

    /* JADX INFO: Access modifiers changed from: private */
    interface a<T> {
        T a(JsonReader jsonReader) throws IOException;
    }

    private static F.e.d.f A(JsonReader jsonReader) throws IOException {
        F.e.d.f.a a2 = F.e.d.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("assignments")) {
                a2.b(n(jsonReader, new a() { // from class: ax.M7.f
                    @Override // ax.M7.j.a
                    public final Object a(JsonReader jsonReader2) {
                        F.e.d.AbstractC0138e z;
                        z = j.z(jsonReader2);
                        return z;
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static F.e.d.a.b.AbstractC0130d B(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0130d.AbstractC0131a a2 = F.e.d.a.b.AbstractC0130d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "address":
                    a2.b(jsonReader.nextLong());
                    break;
                case "code":
                    a2.c(jsonReader.nextString());
                    break;
                case "name":
                    a2.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F.e.d.a.b.AbstractC0132e C(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0132e.AbstractC0133a a2 = F.e.d.a.b.AbstractC0132e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "frames":
                    a2.b(n(jsonReader, new i()));
                    break;
                case "name":
                    a2.d(jsonReader.nextString());
                    break;
                case "importance":
                    a2.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F.d.b D(JsonReader jsonReader) throws IOException {
        F.d.b.a a2 = F.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("filename")) {
                a2.c(jsonReader.nextString());
            } else if (nextName.equals("contents")) {
                a2.b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static F.d E(JsonReader jsonReader) throws IOException {
        F.d.a a2 = F.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("files")) {
                a2.b(n(jsonReader, new a() { // from class: ax.M7.e
                    @Override // ax.M7.j.a
                    public final Object a(JsonReader jsonReader2) {
                        F.d.b D;
                        D = j.D(jsonReader2);
                        return D;
                    }
                }));
            } else if (nextName.equals("orgId")) {
                a2.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static F.e.AbstractC0139e F(JsonReader jsonReader) throws IOException {
        F.e.AbstractC0139e.a a2 = F.e.AbstractC0139e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "buildVersion":
                    a2.b(jsonReader.nextString());
                    break;
                case "jailbroken":
                    a2.c(jsonReader.nextBoolean());
                    break;
                case "version":
                    a2.e(jsonReader.nextString());
                    break;
                case "platform":
                    a2.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F.e.d.a.c G(JsonReader jsonReader) throws IOException {
        F.e.d.a.c.AbstractC0136a a2 = F.e.d.a.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "pid":
                    a2.d(jsonReader.nextInt());
                    break;
                case "processName":
                    a2.e(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    a2.b(jsonReader.nextBoolean());
                    break;
                case "importance":
                    a2.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static F H(JsonReader jsonReader) throws IOException {
        F.b b = F.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "ndkPayload":
                    b.j(E(jsonReader));
                    break;
                case "sdkVersion":
                    b.l(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    b.c(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    b.b(m(jsonReader));
                    break;
                case "buildVersion":
                    b.d(jsonReader.nextString());
                    break;
                case "firebaseAuthenticationToken":
                    b.f(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    b.h(jsonReader.nextString());
                    break;
                case "installationUuid":
                    b.i(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    b.g(jsonReader.nextString());
                    break;
                case "platform":
                    b.k(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    b.e(jsonReader.nextString());
                    break;
                case "session":
                    b.m(J(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b.a();
    }

    private static F.e.d.AbstractC0138e.b I(JsonReader jsonReader) throws IOException {
        F.e.d.AbstractC0138e.b.a a2 = F.e.d.AbstractC0138e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("variantId")) {
                a2.c(jsonReader.nextString());
            } else if (nextName.equals("rolloutId")) {
                a2.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static F.e J(JsonReader jsonReader) throws IOException {
        F.e.b a2 = F.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "startedAt":
                    a2.m(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    a2.c(jsonReader.nextString());
                    break;
                case "identifier":
                    a2.k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    a2.f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    a2.e(q(jsonReader));
                    break;
                case "events":
                    a2.g(n(jsonReader, new a() { // from class: ax.M7.d
                        @Override // ax.M7.j.a
                        public final Object a(JsonReader jsonReader2) {
                            F.e.d r;
                            r = j.r(jsonReader2);
                            return r;
                        }
                    }));
                    break;
                case "os":
                    a2.l(F(jsonReader));
                    break;
                case "app":
                    a2.b(l(jsonReader));
                    break;
                case "user":
                    a2.n(K(jsonReader));
                    break;
                case "generator":
                    a2.h(jsonReader.nextString());
                    break;
                case "crashed":
                    a2.d(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    a2.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static F.e.f K(JsonReader jsonReader) throws IOException {
        F.e.f.a a2 = F.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                a2.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static F.e.a l(JsonReader jsonReader) throws IOException {
        F.e.a.AbstractC0124a a2 = F.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "identifier":
                    a2.e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    a2.b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    a2.c(jsonReader.nextString());
                    break;
                case "version":
                    a2.g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    a2.f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    a2.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static F.a m(JsonReader jsonReader) throws IOException {
        F.a.b a2 = F.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "buildIdMappingForArch":
                    a2.b(n(jsonReader, new a() { // from class: ax.M7.a
                        @Override // ax.M7.j.a
                        public final Object a(JsonReader jsonReader2) {
                            F.a.AbstractC0122a o;
                            o = j.o(jsonReader2);
                            return o;
                        }
                    }));
                    break;
                case "pid":
                    a2.d(jsonReader.nextInt());
                    break;
                case "pss":
                    a2.f(jsonReader.nextLong());
                    break;
                case "rss":
                    a2.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    a2.i(jsonReader.nextLong());
                    break;
                case "processName":
                    a2.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    a2.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    a2.j(jsonReader.nextString());
                    break;
                case "importance":
                    a2.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static <T> List<T> n(JsonReader jsonReader, a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F.a.AbstractC0122a o(JsonReader jsonReader) throws IOException {
        F.a.AbstractC0122a.AbstractC0123a a2 = F.a.AbstractC0122a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "libraryName":
                    a2.d(jsonReader.nextString());
                    break;
                case "arch":
                    a2.b(jsonReader.nextString());
                    break;
                case "buildId":
                    a2.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F.c p(JsonReader jsonReader) throws IOException {
        F.c.a a2 = F.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("key")) {
                a2.b(jsonReader.nextString());
            } else if (nextName.equals("value")) {
                a2.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static F.e.c q(JsonReader jsonReader) throws IOException {
        F.e.c.a a2 = F.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "simulator":
                    a2.i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    a2.e(jsonReader.nextString());
                    break;
                case "ram":
                    a2.h(jsonReader.nextLong());
                    break;
                case "arch":
                    a2.b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    a2.d(jsonReader.nextLong());
                    break;
                case "cores":
                    a2.c(jsonReader.nextInt());
                    break;
                case "model":
                    a2.f(jsonReader.nextString());
                    break;
                case "state":
                    a2.j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    a2.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F.e.d r(JsonReader jsonReader) throws IOException {
        F.e.d.b a2 = F.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "device":
                    a2.c(u(jsonReader));
                    break;
                case "rollouts":
                    a2.e(A(jsonReader));
                    break;
                case "app":
                    a2.b(s(jsonReader));
                    break;
                case "log":
                    a2.d(y(jsonReader));
                    break;
                case "type":
                    a2.g(jsonReader.nextString());
                    break;
                case "timestamp":
                    a2.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static F.e.d.a s(JsonReader jsonReader) throws IOException {
        F.e.d.a.AbstractC0125a a2 = F.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "appProcessDetails":
                    a2.b(n(jsonReader, new a() { // from class: ax.M7.c
                        @Override // ax.M7.j.a
                        public final Object a(JsonReader jsonReader2) {
                            F.e.d.a.c G;
                            G = j.G(jsonReader2);
                            return G;
                        }
                    }));
                    break;
                case "background":
                    a2.c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    a2.f(v(jsonReader));
                    break;
                case "internalKeys":
                    a2.g(n(jsonReader, new a() { // from class: ax.M7.b
                        @Override // ax.M7.j.a
                        public final Object a(JsonReader jsonReader2) {
                            F.c p;
                            p = j.p(jsonReader2);
                            return p;
                        }
                    }));
                    break;
                case "customAttributes":
                    a2.e(n(jsonReader, new a() { // from class: ax.M7.b
                        @Override // ax.M7.j.a
                        public final Object a(JsonReader jsonReader2) {
                            F.c p;
                            p = j.p(jsonReader2);
                            return p;
                        }
                    }));
                    break;
                case "uiOrientation":
                    a2.h(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    a2.d(G(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F.e.d.a.b.AbstractC0126a t(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0126a.AbstractC0127a a2 = F.e.d.a.b.AbstractC0126a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "name":
                    a2.c(jsonReader.nextString());
                    break;
                case "size":
                    a2.d(jsonReader.nextLong());
                    break;
                case "uuid":
                    a2.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    a2.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static F.e.d.c u(JsonReader jsonReader) throws IOException {
        F.e.d.c.a a2 = F.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "batteryLevel":
                    a2.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    a2.c(jsonReader.nextInt());
                    break;
                case "orientation":
                    a2.e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    a2.d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    a2.g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    a2.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static F.e.d.a.b v(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0128b a2 = F.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "appExitInfo":
                    a2.b(m(jsonReader));
                    break;
                case "threads":
                    a2.f(n(jsonReader, new a() { // from class: ax.M7.g
                        @Override // ax.M7.j.a
                        public final Object a(JsonReader jsonReader2) {
                            F.e.d.a.b.AbstractC0132e C;
                            C = j.C(jsonReader2);
                            return C;
                        }
                    }));
                    break;
                case "signal":
                    a2.e(B(jsonReader));
                    break;
                case "binaries":
                    a2.c(n(jsonReader, new a() { // from class: ax.M7.h
                        @Override // ax.M7.j.a
                        public final Object a(JsonReader jsonReader2) {
                            F.e.d.a.b.AbstractC0126a t;
                            t = j.t(jsonReader2);
                            return t;
                        }
                    }));
                    break;
                case "exception":
                    a2.d(w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static F.e.d.a.b.c w(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.c.AbstractC0129a a2 = F.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "frames":
                    a2.c(n(jsonReader, new i()));
                    break;
                case "reason":
                    a2.e(jsonReader.nextString());
                    break;
                case "type":
                    a2.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    a2.b(w(jsonReader));
                    break;
                case "overflowCount":
                    a2.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F.e.d.a.b.AbstractC0132e.AbstractC0134b x(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.AbstractC0132e.AbstractC0134b.AbstractC0135a a2 = F.e.d.a.b.AbstractC0132e.AbstractC0134b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "offset":
                    a2.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    a2.f(jsonReader.nextString());
                    break;
                case "pc":
                    a2.e(jsonReader.nextLong());
                    break;
                case "file":
                    a2.b(jsonReader.nextString());
                    break;
                case "importance":
                    a2.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    private static F.e.d.AbstractC0137d y(JsonReader jsonReader) throws IOException {
        F.e.d.AbstractC0137d.a a2 = F.e.d.AbstractC0137d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                a2.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static F.e.d.AbstractC0138e z(JsonReader jsonReader) throws IOException {
        F.e.d.AbstractC0138e.a a2 = F.e.d.AbstractC0138e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "parameterKey":
                    a2.b(jsonReader.nextString());
                    break;
                case "templateVersion":
                    a2.e(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    a2.d(I(jsonReader));
                    break;
                case "parameterValue":
                    a2.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a2.a();
    }

    public F L(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                F H = H(jsonReader);
                jsonReader.close();
                return H;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    public String M(F f) {
        return a.b(f);
    }

    public F.e.d j(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                F.e.d r = r(jsonReader);
                jsonReader.close();
                return r;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    public String k(F.e.d dVar) {
        return a.b(dVar);
    }
}
