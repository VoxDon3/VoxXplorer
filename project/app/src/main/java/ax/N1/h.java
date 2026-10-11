/*
 * Decompiled with CFR 0.152.
 */
package ax.N1;

import ax.N1.t;
import ax.P0.v;
import ax.P1.a;
import ax.R1.b;
import ax.T1.d;
import ax.W1.g;

public final class h
implements t.a {
    @Override
    public int a(v object) {
        object = ((v)object).o;
        if (object != null) {
            int n8 = -1;
            switch (((String)object).hashCode()) {
                default: {
                    break;
                }
                case 1693976202: {
                    if (!((String)object).equals("application/ttml+xml")) break;
                    n8 = 8;
                    break;
                }
                case 1668750253: {
                    if (!((String)object).equals("application/x-subrip")) break;
                    n8 = 7;
                    break;
                }
                case 1157994102: {
                    if (!((String)object).equals("application/vobsub")) break;
                    n8 = 6;
                    break;
                }
                case 822864842: {
                    if (!((String)object).equals("text/x-ssa")) break;
                    n8 = 5;
                    break;
                }
                case 691401887: {
                    if (!((String)object).equals("application/x-quicktime-tx3g")) break;
                    n8 = 4;
                    break;
                }
                case -1004728940: {
                    if (!((String)object).equals("text/vtt")) break;
                    n8 = 3;
                    break;
                }
                case -1026075066: {
                    if (!((String)object).equals("application/x-mp4-vtt")) break;
                    n8 = 2;
                    break;
                }
                case -1248334819: {
                    if (!((String)object).equals("application/pgs")) break;
                    n8 = 1;
                    break;
                }
                case -1351681404: {
                    if (!((String)object).equals("application/dvbsubs")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    break;
                }
                case 7: 
                case 8: {
                    return 1;
                }
                case 6: {
                    return 2;
                }
                case 5: {
                    return 1;
                }
                case 4: {
                    return 2;
                }
                case 3: {
                    return 1;
                }
                case 0: 
                case 1: 
                case 2: {
                    return 2;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported MIME type: ");
        stringBuilder.append((String)object);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public boolean b(v object) {
        object = ((v)object).o;
        return j.Objects.equals((Object)object, (Object)"text/x-ssa") || j.Objects.equals((Object)object, (Object)"text/vtt") || j.Objects.equals((Object)object, (Object)"application/x-mp4-vtt") || j.Objects.equals((Object)object, (Object)"application/x-subrip") || j.Objects.equals((Object)object, (Object)"application/x-quicktime-tx3g") || j.Objects.equals((Object)object, (Object)"application/pgs") || j.Objects.equals((Object)object, (Object)"application/vobsub") || j.Objects.equals((Object)object, (Object)"application/dvbsubs") || j.Objects.equals((Object)object, (Object)"application/ttml+xml");
        {
        }
    }

    @Override
    public t c(v object) {
        String string = ((v)object).o;
        if (string != null) {
            int n8 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1693976202: {
                    if (!string.equals("application/ttml+xml")) break;
                    n8 = 8;
                    break;
                }
                case 1668750253: {
                    if (!string.equals("application/x-subrip")) break;
                    n8 = 7;
                    break;
                }
                case 1157994102: {
                    if (!string.equals("application/vobsub")) break;
                    n8 = 6;
                    break;
                }
                case 822864842: {
                    if (!string.equals("text/x-ssa")) break;
                    n8 = 5;
                    break;
                }
                case 691401887: {
                    if (!string.equals("application/x-quicktime-tx3g")) break;
                    n8 = 4;
                    break;
                }
                case -1004728940: {
                    if (!string.equals("text/vtt")) break;
                    n8 = 3;
                    break;
                }
                case -1026075066: {
                    if (!string.equals("application/x-mp4-vtt")) break;
                    n8 = 2;
                    break;
                }
                case -1248334819: {
                    if (!string.equals("application/pgs")) break;
                    n8 = 1;
                    break;
                }
                case -1351681404: {
                    if (!string.equals("application/dvbsubs")) break;
                    n8 = 0;
                }
            }
            switch (n8) {
                default: {
                    break;
                }
                case 8: {
                    return new d();
                }
                case 7: {
                    return new ax.S1.a();
                }
                case 6: {
                    return new ax.V1.a(((v)object).r);
                }
                case 5: {
                    return new b(((v)object).r);
                }
                case 4: {
                    return new ax.U1.a(((v)object).r);
                }
                case 3: {
                    return new g();
                }
                case 2: {
                    return new ax.W1.a();
                }
                case 1: {
                    return new ax.Q1.a();
                }
                case 0: {
                    return new a(((v)object).r);
                }
            }
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unsupported MIME type: ");
        ((StringBuilder)object).append(string);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }
}

