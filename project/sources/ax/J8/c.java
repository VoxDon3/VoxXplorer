package ax.J8;

import ax.Z8.a;
import java.util.UUID;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes3.dex */
public class c {
    public static void a(b bVar, ax.Z8.a<?> aVar) {
        long a = bVar.a();
        aVar.u(a & 4294967295L);
        aVar.u((a >> 32) & 4294967295L);
    }

    public static void b(UUID uuid, ax.Z8.a<?> aVar) {
        long leastSignificantBits = uuid.getLeastSignificantBits();
        long mostSignificantBits = uuid.getMostSignificantBits();
        aVar.u(mostSignificantBits >>> 32);
        aVar.s((int) ((mostSignificantBits >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        aVar.s((int) (mostSignificantBits & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        aVar.l(leastSignificantBits, ax.Z8.b.c);
    }

    public static b c(ax.Z8.a<?> aVar) throws a.b {
        return new b(aVar.N() | (aVar.N() << 32));
    }

    public static UUID d(ax.Z8.a<?> aVar) throws a.b {
        return new UUID((((aVar.N() << 16) | aVar.J()) << 16) | aVar.J(), aVar.B(ax.Z8.b.c));
    }
}
