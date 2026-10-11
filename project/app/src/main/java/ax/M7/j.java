/*
 * Decompiled with CFR 0.152.
 */
package ax.M7;

import android.util.Base64;
import android.util.JsonReader;
import ax.L7.F;
import ax.M7.b;
import ax.M7.c;
import ax.M7.d;
import ax.M7.e;
import ax.M7.f;
import ax.M7.g;
import ax.M7.h;
import ax.M7.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class j {
    private static final ax.U7.a a = new ax.W7.d().j(ax.L7.a.a).k(true).i();

    private static F.e.d.f A(JsonReader jsonReader) throws IOException {
        F.e.d.f.a a8 = F.e.d.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            if (!string.equals("assignments")) {
                jsonReader.skipValue();
                continue;
            }
            a8.b(j.n(jsonReader, new f()));
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static F.e.d.a.b.d B(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.d.a a8 = F.e.d.a.b.d.a();
        jsonReader.beginObject();
        block10: while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 3373707: {
                    if (!string.equals("name")) break;
                    n8 = 2;
                    break;
                }
                case 3059181: {
                    if (!string.equals("code")) break;
                    n8 = 1;
                    break;
                }
                case -1147692044: {
                    if (!string.equals("address")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    jsonReader.skipValue();
                    continue block10;
                }
                case 2: {
                    a8.d(jsonReader.nextString());
                    continue block10;
                }
                case 1: {
                    a8.c(jsonReader.nextString());
                    continue block10;
                }
                case 0: 
            }
            a8.b(jsonReader.nextLong());
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static F.e.d.a.b.e C(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.e.a a8 = F.e.d.a.b.e.a();
        jsonReader.beginObject();
        block10: while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 2125650548: {
                    if (!string.equals("importance")) break;
                    n8 = 2;
                    break;
                }
                case 3373707: {
                    if (!string.equals("name")) break;
                    n8 = 1;
                    break;
                }
                case -1266514778: {
                    if (!string.equals("frames")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    jsonReader.skipValue();
                    continue block10;
                }
                case 2: {
                    a8.c(jsonReader.nextInt());
                    continue block10;
                }
                case 1: {
                    a8.d(jsonReader.nextString());
                    continue block10;
                }
                case 0: 
            }
            a8.b(j.n(jsonReader, new i()));
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static F.d.b D(JsonReader jsonReader) throws IOException {
        F.d.b.a a8 = F.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            if (!string.equals("filename")) {
                if (!string.equals("contents")) {
                    jsonReader.skipValue();
                    continue;
                }
                a8.b(Base64.decode((String)jsonReader.nextString(), (int)2));
                continue;
            }
            a8.c(jsonReader.nextString());
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static F.d E(JsonReader jsonReader) throws IOException {
        F.d.a a8 = F.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            if (!string.equals("files")) {
                if (!string.equals("orgId")) {
                    jsonReader.skipValue();
                    continue;
                }
                a8.c(jsonReader.nextString());
                continue;
            }
            a8.b(j.n(jsonReader, new e()));
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static F.e.e F(JsonReader jsonReader) throws IOException {
        F.e.e.a a8 = F.e.e.a();
        jsonReader.beginObject();
        block12: while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1874684019: {
                    if (!string.equals("platform")) break;
                    n8 = 3;
                    break;
                }
                case 351608024: {
                    if (!string.equals("version")) break;
                    n8 = 2;
                    break;
                }
                case -293026577: {
                    if (!string.equals("jailbroken")) break;
                    n8 = 1;
                    break;
                }
                case -911706486: {
                    if (!string.equals("buildVersion")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    jsonReader.skipValue();
                    continue block12;
                }
                case 3: {
                    a8.d(jsonReader.nextInt());
                    continue block12;
                }
                case 2: {
                    a8.e(jsonReader.nextString());
                    continue block12;
                }
                case 1: {
                    a8.c(jsonReader.nextBoolean());
                    continue block12;
                }
                case 0: 
            }
            a8.b(jsonReader.nextString());
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static F.e.d.a.c G(JsonReader jsonReader) throws IOException {
        F.e.d.a.c.a a8 = F.e.d.a.c.a();
        jsonReader.beginObject();
        block12: while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 2125650548: {
                    if (!string.equals("importance")) break;
                    n8 = 3;
                    break;
                }
                case 1694598382: {
                    if (!string.equals("defaultProcess")) break;
                    n8 = 2;
                    break;
                }
                case 202325402: {
                    if (!string.equals("processName")) break;
                    n8 = 1;
                    break;
                }
                case 110987: {
                    if (!string.equals("pid")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    jsonReader.skipValue();
                    continue block12;
                }
                case 3: {
                    a8.c(jsonReader.nextInt());
                    continue block12;
                }
                case 2: {
                    a8.b(jsonReader.nextBoolean());
                    continue block12;
                }
                case 1: {
                    a8.e(jsonReader.nextString());
                    continue block12;
                }
                case 0: 
            }
            a8.d(jsonReader.nextInt());
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static F H(JsonReader jsonReader) throws IOException {
        F.b b8 = F.b();
        jsonReader.beginObject();
        block28: while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1984987798: {
                    if (!string.equals("session")) break;
                    n8 = 11;
                    break;
                }
                case 1975623094: {
                    if (!string.equals("displayVersion")) break;
                    n8 = 10;
                    break;
                }
                case 1874684019: {
                    if (!string.equals("platform")) break;
                    n8 = 9;
                    break;
                }
                case 1047652060: {
                    if (!string.equals("firebaseInstallationId")) break;
                    n8 = 8;
                    break;
                }
                case 719853845: {
                    if (!string.equals("installationUuid")) break;
                    n8 = 7;
                    break;
                }
                case 344431858: {
                    if (!string.equals("gmpAppId")) break;
                    n8 = 6;
                    break;
                }
                case -401988390: {
                    if (!string.equals("firebaseAuthenticationToken")) break;
                    n8 = 5;
                    break;
                }
                case -911706486: {
                    if (!string.equals("buildVersion")) break;
                    n8 = 4;
                    break;
                }
                case -1375141843: {
                    if (!string.equals("appExitInfo")) break;
                    n8 = 3;
                    break;
                }
                case -1907185581: {
                    if (!string.equals("appQualitySessionId")) break;
                    n8 = 2;
                    break;
                }
                case -1962630338: {
                    if (!string.equals("sdkVersion")) break;
                    n8 = 1;
                    break;
                }
                case -2118372775: {
                    if (!string.equals("ndkPayload")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    jsonReader.skipValue();
                    continue block28;
                }
                case 11: {
                    b8.m(j.J(jsonReader));
                    continue block28;
                }
                case 10: {
                    b8.e(jsonReader.nextString());
                    continue block28;
                }
                case 9: {
                    b8.k(jsonReader.nextInt());
                    continue block28;
                }
                case 8: {
                    b8.g(jsonReader.nextString());
                    continue block28;
                }
                case 7: {
                    b8.i(jsonReader.nextString());
                    continue block28;
                }
                case 6: {
                    b8.h(jsonReader.nextString());
                    continue block28;
                }
                case 5: {
                    b8.f(jsonReader.nextString());
                    continue block28;
                }
                case 4: {
                    b8.d(jsonReader.nextString());
                    continue block28;
                }
                case 3: {
                    b8.b(j.m(jsonReader));
                    continue block28;
                }
                case 2: {
                    b8.c(jsonReader.nextString());
                    continue block28;
                }
                case 1: {
                    b8.l(jsonReader.nextString());
                    continue block28;
                }
                case 0: 
            }
            b8.j(j.E(jsonReader));
        }
        jsonReader.endObject();
        return b8.a();
    }

    private static F.e.d.e.b I(JsonReader jsonReader) throws IOException {
        F.e.d.e.b.a a8 = F.e.d.e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            if (!string.equals("variantId")) {
                if (!string.equals("rolloutId")) {
                    jsonReader.skipValue();
                    continue;
                }
                a8.b(jsonReader.nextString());
                continue;
            }
            a8.c(jsonReader.nextString());
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static F.e J(JsonReader jsonReader) throws IOException {
        F.e.b b8 = F.e.a();
        jsonReader.beginObject();
        block28: while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 2047016109: {
                    if (!string.equals("generatorType")) break;
                    n8 = 11;
                    break;
                }
                case 1025385094: {
                    if (!string.equals("crashed")) break;
                    n8 = 10;
                    break;
                }
                case 286956243: {
                    if (!string.equals("generator")) break;
                    n8 = 9;
                    break;
                }
                case 3599307: {
                    if (!string.equals("user")) break;
                    n8 = 8;
                    break;
                }
                case 96801: {
                    if (!string.equals("app")) break;
                    n8 = 7;
                    break;
                }
                case 3556: {
                    if (!string.equals("os")) break;
                    n8 = 6;
                    break;
                }
                case -1291329255: {
                    if (!string.equals("events")) break;
                    n8 = 5;
                    break;
                }
                case -1335157162: {
                    if (!string.equals("device")) break;
                    n8 = 4;
                    break;
                }
                case -1606742899: {
                    if (!string.equals("endedAt")) break;
                    n8 = 3;
                    break;
                }
                case -1618432855: {
                    if (!string.equals("identifier")) break;
                    n8 = 2;
                    break;
                }
                case -1907185581: {
                    if (!string.equals("appQualitySessionId")) break;
                    n8 = 1;
                    break;
                }
                case -2128794476: {
                    if (!string.equals("startedAt")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    jsonReader.skipValue();
                    continue block28;
                }
                case 11: {
                    b8.i(jsonReader.nextInt());
                    continue block28;
                }
                case 10: {
                    b8.d(jsonReader.nextBoolean());
                    continue block28;
                }
                case 9: {
                    b8.h(jsonReader.nextString());
                    continue block28;
                }
                case 8: {
                    b8.n(j.K(jsonReader));
                    continue block28;
                }
                case 7: {
                    b8.b(j.l(jsonReader));
                    continue block28;
                }
                case 6: {
                    b8.l(j.F(jsonReader));
                    continue block28;
                }
                case 5: {
                    b8.g(j.n(jsonReader, new d()));
                    continue block28;
                }
                case 4: {
                    b8.e(j.q(jsonReader));
                    continue block28;
                }
                case 3: {
                    b8.f(jsonReader.nextLong());
                    continue block28;
                }
                case 2: {
                    b8.k(Base64.decode((String)jsonReader.nextString(), (int)2));
                    continue block28;
                }
                case 1: {
                    b8.c(jsonReader.nextString());
                    continue block28;
                }
                case 0: 
            }
            b8.m(jsonReader.nextLong());
        }
        jsonReader.endObject();
        return b8.a();
    }

    private static F.e.f K(JsonReader jsonReader) throws IOException {
        F.e.f.a a8 = F.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                a8.b(jsonReader.nextString());
                continue;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return a8.a();
    }

    public static /* synthetic */ F.e.d.e a(JsonReader jsonReader) {
        return j.z(jsonReader);
    }

    public static /* synthetic */ F.a.a b(JsonReader jsonReader) {
        return j.o(jsonReader);
    }

    public static /* synthetic */ F.e.d.a.b.e.b c(JsonReader jsonReader) {
        return j.x(jsonReader);
    }

    public static /* synthetic */ F.c d(JsonReader jsonReader) {
        return j.p(jsonReader);
    }

    public static /* synthetic */ F.e.d.a.b.a e(JsonReader jsonReader) {
        return j.t(jsonReader);
    }

    public static /* synthetic */ F.e.d.a.b.e f(JsonReader jsonReader) {
        return j.C(jsonReader);
    }

    public static /* synthetic */ F.d.b g(JsonReader jsonReader) {
        return j.D(jsonReader);
    }

    public static /* synthetic */ F.e.d.a.c h(JsonReader jsonReader) {
        return j.G(jsonReader);
    }

    public static /* synthetic */ F.e.d i(JsonReader jsonReader) {
        return j.r(jsonReader);
    }

    private static F.e.a l(JsonReader jsonReader) throws IOException {
        F.e.a.a a8 = F.e.a.a();
        jsonReader.beginObject();
        block16: while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1975623094: {
                    if (!string.equals("displayVersion")) break;
                    n8 = 5;
                    break;
                }
                case 719853845: {
                    if (!string.equals("installationUuid")) break;
                    n8 = 4;
                    break;
                }
                case 351608024: {
                    if (!string.equals("version")) break;
                    n8 = 3;
                    break;
                }
                case 213652010: {
                    if (!string.equals("developmentPlatformVersion")) break;
                    n8 = 2;
                    break;
                }
                case -519438642: {
                    if (!string.equals("developmentPlatform")) break;
                    n8 = 1;
                    break;
                }
                case -1618432855: {
                    if (!string.equals("identifier")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    jsonReader.skipValue();
                    continue block16;
                }
                case 5: {
                    a8.d(jsonReader.nextString());
                    continue block16;
                }
                case 4: {
                    a8.f(jsonReader.nextString());
                    continue block16;
                }
                case 3: {
                    a8.g(jsonReader.nextString());
                    continue block16;
                }
                case 2: {
                    a8.c(jsonReader.nextString());
                    continue block16;
                }
                case 1: {
                    a8.b(jsonReader.nextString());
                    continue block16;
                }
                case 0: 
            }
            a8.e(jsonReader.nextString());
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static F.a m(JsonReader jsonReader) throws IOException {
        F.a.b b8 = F.a.a();
        jsonReader.beginObject();
        block22: while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 2125650548: {
                    if (!string.equals("importance")) break;
                    n8 = 8;
                    break;
                }
                case 723857505: {
                    if (!string.equals("traceFile")) break;
                    n8 = 7;
                    break;
                }
                case 722137681: {
                    if (!string.equals("reasonCode")) break;
                    n8 = 6;
                    break;
                }
                case 202325402: {
                    if (!string.equals("processName")) break;
                    n8 = 5;
                    break;
                }
                case 55126294: {
                    if (!string.equals("timestamp")) break;
                    n8 = 4;
                    break;
                }
                case 113234: {
                    if (!string.equals("rss")) break;
                    n8 = 3;
                    break;
                }
                case 111312: {
                    if (!string.equals("pss")) break;
                    n8 = 2;
                    break;
                }
                case 110987: {
                    if (!string.equals("pid")) break;
                    n8 = 1;
                    break;
                }
                case -1516200806: {
                    if (!string.equals("buildIdMappingForArch")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    jsonReader.skipValue();
                    continue block22;
                }
                case 8: {
                    b8.c(jsonReader.nextInt());
                    continue block22;
                }
                case 7: {
                    b8.j(jsonReader.nextString());
                    continue block22;
                }
                case 6: {
                    b8.g(jsonReader.nextInt());
                    continue block22;
                }
                case 5: {
                    b8.e(jsonReader.nextString());
                    continue block22;
                }
                case 4: {
                    b8.i(jsonReader.nextLong());
                    continue block22;
                }
                case 3: {
                    b8.h(jsonReader.nextLong());
                    continue block22;
                }
                case 2: {
                    b8.f(jsonReader.nextLong());
                    continue block22;
                }
                case 1: {
                    b8.d(jsonReader.nextInt());
                    continue block22;
                }
                case 0: 
            }
            b8.b(j.n(jsonReader, new ax.M7.a()));
        }
        jsonReader.endObject();
        return b8.a();
    }

    private static <T> List<T> n(JsonReader jsonReader, a<T> a8) throws IOException {
        ArrayList<T> arrayList = new ArrayList<T>();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(a8.a(jsonReader));
        }
        jsonReader.endArray();
        return java.util.DesugarCollections.unmodifiableList(arrayList);
    }

    private static F.a.a o(JsonReader jsonReader) throws IOException {
        F.a.a.a a8 = F.a.a.a();
        jsonReader.beginObject();
        block10: while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 230943785: {
                    if (!string.equals("buildId")) break;
                    n8 = 2;
                    break;
                }
                case 3002454: {
                    if (!string.equals("arch")) break;
                    n8 = 1;
                    break;
                }
                case -609862170: {
                    if (!string.equals("libraryName")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    jsonReader.skipValue();
                    continue block10;
                }
                case 2: {
                    a8.c(jsonReader.nextString());
                    continue block10;
                }
                case 1: {
                    a8.b(jsonReader.nextString());
                    continue block10;
                }
                case 0: 
            }
            a8.d(jsonReader.nextString());
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static F.c p(JsonReader jsonReader) throws IOException {
        F.c.a a8 = F.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            if (!string.equals("key")) {
                if (!string.equals("value")) {
                    jsonReader.skipValue();
                    continue;
                }
                a8.c(jsonReader.nextString());
                continue;
            }
            a8.b(jsonReader.nextString());
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static F.e.c q(JsonReader jsonReader) throws IOException {
        F.e.c.a a8 = F.e.c.a();
        jsonReader.beginObject();
        block22: while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 2078953423: {
                    if (!string.equals("modelClass")) break;
                    n8 = 8;
                    break;
                }
                case 109757585: {
                    if (!string.equals("state")) break;
                    n8 = 7;
                    break;
                }
                case 104069929: {
                    if (!string.equals("model")) break;
                    n8 = 6;
                    break;
                }
                case 94848180: {
                    if (!string.equals("cores")) break;
                    n8 = 5;
                    break;
                }
                case 81784169: {
                    if (!string.equals("diskSpace")) break;
                    n8 = 4;
                    break;
                }
                case 3002454: {
                    if (!string.equals("arch")) break;
                    n8 = 3;
                    break;
                }
                case 112670: {
                    if (!string.equals("ram")) break;
                    n8 = 2;
                    break;
                }
                case -1969347631: {
                    if (!string.equals("manufacturer")) break;
                    n8 = 1;
                    break;
                }
                case -1981332476: {
                    if (!string.equals("simulator")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    jsonReader.skipValue();
                    continue block22;
                }
                case 8: {
                    a8.g(jsonReader.nextString());
                    continue block22;
                }
                case 7: {
                    a8.j(jsonReader.nextInt());
                    continue block22;
                }
                case 6: {
                    a8.f(jsonReader.nextString());
                    continue block22;
                }
                case 5: {
                    a8.c(jsonReader.nextInt());
                    continue block22;
                }
                case 4: {
                    a8.d(jsonReader.nextLong());
                    continue block22;
                }
                case 3: {
                    a8.b(jsonReader.nextInt());
                    continue block22;
                }
                case 2: {
                    a8.h(jsonReader.nextLong());
                    continue block22;
                }
                case 1: {
                    a8.e(jsonReader.nextString());
                    continue block22;
                }
                case 0: 
            }
            a8.i(jsonReader.nextBoolean());
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static F.e.d r(JsonReader jsonReader) throws IOException {
        F.e.d.b b8 = F.e.d.a();
        jsonReader.beginObject();
        block16: while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 55126294: {
                    if (!string.equals("timestamp")) break;
                    n8 = 5;
                    break;
                }
                case 3575610: {
                    if (!string.equals("type")) break;
                    n8 = 4;
                    break;
                }
                case 107332: {
                    if (!string.equals("log")) break;
                    n8 = 3;
                    break;
                }
                case 96801: {
                    if (!string.equals("app")) break;
                    n8 = 2;
                    break;
                }
                case -259312414: {
                    if (!string.equals("rollouts")) break;
                    n8 = 1;
                    break;
                }
                case -1335157162: {
                    if (!string.equals("device")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    jsonReader.skipValue();
                    continue block16;
                }
                case 5: {
                    b8.f(jsonReader.nextLong());
                    continue block16;
                }
                case 4: {
                    b8.g(jsonReader.nextString());
                    continue block16;
                }
                case 3: {
                    b8.d(j.y(jsonReader));
                    continue block16;
                }
                case 2: {
                    b8.b(j.s(jsonReader));
                    continue block16;
                }
                case 1: {
                    b8.e(j.A(jsonReader));
                    continue block16;
                }
                case 0: 
            }
            b8.c(j.u(jsonReader));
        }
        jsonReader.endObject();
        return b8.a();
    }

    private static F.e.d.a s(JsonReader jsonReader) throws IOException {
        F.e.d.a.a a8 = F.e.d.a.a();
        jsonReader.beginObject();
        block18: while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1847730860: {
                    if (!string.equals("currentProcessDetails")) break;
                    n8 = 6;
                    break;
                }
                case 928737948: {
                    if (!string.equals("uiOrientation")) break;
                    n8 = 5;
                    break;
                }
                case 555169704: {
                    if (!string.equals("customAttributes")) break;
                    n8 = 4;
                    break;
                }
                case -80231855: {
                    if (!string.equals("internalKeys")) break;
                    n8 = 3;
                    break;
                }
                case -1090974952: {
                    if (!string.equals("execution")) break;
                    n8 = 2;
                    break;
                }
                case -1332194002: {
                    if (!string.equals("background")) break;
                    n8 = 1;
                    break;
                }
                case -1405314732: {
                    if (!string.equals("appProcessDetails")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    jsonReader.skipValue();
                    continue block18;
                }
                case 6: {
                    a8.d(j.G(jsonReader));
                    continue block18;
                }
                case 5: {
                    a8.h(jsonReader.nextInt());
                    continue block18;
                }
                case 4: {
                    a8.e(j.n(jsonReader, new b()));
                    continue block18;
                }
                case 3: {
                    a8.g(j.n(jsonReader, new b()));
                    continue block18;
                }
                case 2: {
                    a8.f(j.v(jsonReader));
                    continue block18;
                }
                case 1: {
                    a8.c(jsonReader.nextBoolean());
                    continue block18;
                }
                case 0: 
            }
            a8.b(j.n(jsonReader, new c()));
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static F.e.d.a.b.a t(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.a.a a8 = F.e.d.a.b.a.a();
        jsonReader.beginObject();
        block12: while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1153765347: {
                    if (!string.equals("baseAddress")) break;
                    n8 = 3;
                    break;
                }
                case 3601339: {
                    if (!string.equals("uuid")) break;
                    n8 = 2;
                    break;
                }
                case 3530753: {
                    if (!string.equals("size")) break;
                    n8 = 1;
                    break;
                }
                case 3373707: {
                    if (!string.equals("name")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    jsonReader.skipValue();
                    continue block12;
                }
                case 3: {
                    a8.b(jsonReader.nextLong());
                    continue block12;
                }
                case 2: {
                    a8.f(Base64.decode((String)jsonReader.nextString(), (int)2));
                    continue block12;
                }
                case 1: {
                    a8.d(jsonReader.nextLong());
                    continue block12;
                }
                case 0: 
            }
            a8.c(jsonReader.nextString());
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static F.e.d.c u(JsonReader jsonReader) throws IOException {
        F.e.d.c.a a8 = F.e.d.c.a();
        jsonReader.beginObject();
        block16: while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1516795582: {
                    if (!string.equals("proximityOn")) break;
                    n8 = 5;
                    break;
                }
                case 976541947: {
                    if (!string.equals("ramUsed")) break;
                    n8 = 4;
                    break;
                }
                case 279795450: {
                    if (!string.equals("diskUsed")) break;
                    n8 = 3;
                    break;
                }
                case -1439500848: {
                    if (!string.equals("orientation")) break;
                    n8 = 2;
                    break;
                }
                case -1455558134: {
                    if (!string.equals("batteryVelocity")) break;
                    n8 = 1;
                    break;
                }
                case -1708606089: {
                    if (!string.equals("batteryLevel")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    jsonReader.skipValue();
                    continue block16;
                }
                case 5: {
                    a8.f(jsonReader.nextBoolean());
                    continue block16;
                }
                case 4: {
                    a8.g(jsonReader.nextLong());
                    continue block16;
                }
                case 3: {
                    a8.d(jsonReader.nextLong());
                    continue block16;
                }
                case 2: {
                    a8.e(jsonReader.nextInt());
                    continue block16;
                }
                case 1: {
                    a8.c(jsonReader.nextInt());
                    continue block16;
                }
                case 0: 
            }
            a8.b(jsonReader.nextDouble());
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static F.e.d.a.b v(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.b b8 = F.e.d.a.b.a();
        jsonReader.beginObject();
        block14: while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1481625679: {
                    if (!string.equals("exception")) break;
                    n8 = 4;
                    break;
                }
                case 937615455: {
                    if (!string.equals("binaries")) break;
                    n8 = 3;
                    break;
                }
                case -902467928: {
                    if (!string.equals("signal")) break;
                    n8 = 2;
                    break;
                }
                case -1337936983: {
                    if (!string.equals("threads")) break;
                    n8 = 1;
                    break;
                }
                case -1375141843: {
                    if (!string.equals("appExitInfo")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    jsonReader.skipValue();
                    continue block14;
                }
                case 4: {
                    b8.d(j.w(jsonReader));
                    continue block14;
                }
                case 3: {
                    b8.c(j.n(jsonReader, new h()));
                    continue block14;
                }
                case 2: {
                    b8.e(j.B(jsonReader));
                    continue block14;
                }
                case 1: {
                    b8.f(j.n(jsonReader, new g()));
                    continue block14;
                }
                case 0: 
            }
            b8.b(j.m(jsonReader));
        }
        jsonReader.endObject();
        return b8.a();
    }

    private static F.e.d.a.b.c w(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.c.a a8 = F.e.d.a.b.c.a();
        jsonReader.beginObject();
        block14: while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 581754413: {
                    if (!string.equals("overflowCount")) break;
                    n8 = 4;
                    break;
                }
                case 91997906: {
                    if (!string.equals("causedBy")) break;
                    n8 = 3;
                    break;
                }
                case 3575610: {
                    if (!string.equals("type")) break;
                    n8 = 2;
                    break;
                }
                case -934964668: {
                    if (!string.equals("reason")) break;
                    n8 = 1;
                    break;
                }
                case -1266514778: {
                    if (!string.equals("frames")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    jsonReader.skipValue();
                    continue block14;
                }
                case 4: {
                    a8.d(jsonReader.nextInt());
                    continue block14;
                }
                case 3: {
                    a8.b(j.w(jsonReader));
                    continue block14;
                }
                case 2: {
                    a8.f(jsonReader.nextString());
                    continue block14;
                }
                case 1: {
                    a8.e(jsonReader.nextString());
                    continue block14;
                }
                case 0: 
            }
            a8.c(j.n(jsonReader, new i()));
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static F.e.d.a.b.e.b x(JsonReader jsonReader) throws IOException {
        F.e.d.a.b.e.b.a a8 = F.e.d.a.b.e.b.a();
        jsonReader.beginObject();
        block14: while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 2125650548: {
                    if (!string.equals("importance")) break;
                    n8 = 4;
                    break;
                }
                case 3143036: {
                    if (!string.equals("file")) break;
                    n8 = 3;
                    break;
                }
                case 3571: {
                    if (!string.equals("pc")) break;
                    n8 = 2;
                    break;
                }
                case -887523944: {
                    if (!string.equals("symbol")) break;
                    n8 = 1;
                    break;
                }
                case -1019779949: {
                    if (!string.equals("offset")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    jsonReader.skipValue();
                    continue block14;
                }
                case 4: {
                    a8.c(jsonReader.nextInt());
                    continue block14;
                }
                case 3: {
                    a8.b(jsonReader.nextString());
                    continue block14;
                }
                case 2: {
                    a8.e(jsonReader.nextLong());
                    continue block14;
                }
                case 1: {
                    a8.f(jsonReader.nextString());
                    continue block14;
                }
                case 0: 
            }
            a8.d(jsonReader.nextLong());
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static F.e.d.d y(JsonReader jsonReader) throws IOException {
        F.e.d.d.a a8 = F.e.d.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                a8.b(jsonReader.nextString());
                continue;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return a8.a();
    }

    private static F.e.d.e z(JsonReader jsonReader) throws IOException {
        F.e.d.e.a a8 = F.e.d.e.a();
        jsonReader.beginObject();
        block12: while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.getClass();
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1124454216: {
                    if (!string.equals("parameterValue")) break;
                    n8 = 3;
                    break;
                }
                case 1098747284: {
                    if (!string.equals("rolloutVariant")) break;
                    n8 = 2;
                    break;
                }
                case -1027290370: {
                    if (!string.equals("templateVersion")) break;
                    n8 = 1;
                    break;
                }
                case -1536268810: {
                    if (!string.equals("parameterKey")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    jsonReader.skipValue();
                    continue block12;
                }
                case 3: {
                    a8.c(jsonReader.nextString());
                    continue block12;
                }
                case 2: {
                    a8.d(j.I(jsonReader));
                    continue block12;
                }
                case 1: {
                    a8.e(jsonReader.nextLong());
                    continue block12;
                }
                case 0: 
            }
            a8.b(jsonReader.nextString());
        }
        jsonReader.endObject();
        return a8.a();
    }

    /*
     * Exception decompiling
     */
    public F L(String var1_1) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 42->49)] java.lang.IllegalStateException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    public String M(F f8) {
        return a.b(f8);
    }

    /*
     * Exception decompiling
     */
    public F.e.d j(String var1_1) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 42->49)] java.lang.IllegalStateException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
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

    public String k(F.e.d d8) {
        return a.b(d8);
    }

    private static interface a<T> {
        public T a(JsonReader var1) throws IOException;
    }
}

