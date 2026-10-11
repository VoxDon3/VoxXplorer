/*
 * Decompiled with CFR 0.152.
 */
package ax.nc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public class a {
    private static final byte[] g = new byte[]{99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, -128, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};
    private static final int[] h = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, 125, 250, 239, 197, 145};
    private static final int[] i = ax.nc.a.$d2j$hex$a6c600d4$decode_I("c66363a5f87c7c84ee777799f67b7b8dfff2f20dd66b6bbdde6f6fb191c5c5546030305002010103ce6767a9562b2b7de7fefe19b5d7d7624dababe6ec76769a8fcaca451f82829d89c9c940fa7d7d87effafa15b25959eb8e4747c9fbf0f00b41adadecb3d4d4675fa2a2fd45afafea239c9cbf53a4a4f7e47272969bc0c05b75b7b7c2e1fdfd1c3d9393ae4c26266a6c36365a7e3f3f41f5f7f70283cccc4f6834345c51a5a5f4d1e5e534f9f1f108e2717193abd8d873623131532a15153f0804040c95c7c752462323659dc3c35e30181828379696a10a05050f2f9a9ab50e070709241212361b80809bdfe2e23dcdebeb264e2727697fb2b2cdea75759f1209091b1d83839e582c2c74341a1a2e361b1b2ddc6e6eb2b45a5aee5ba0a0fba45252f6763b3b4db7d6d6617db3b3ce5229297bdde3e33e5e2f2f7113848497a65353f5b9d1d16800000000c1eded2c40202060e3fcfc1f79b1b1c8b65b5bedd46a6abe8dcbcb4667bebed97239394b944a4ade984c4cd4b05858e885cfcf4abbd0d06bc5efef2a4faaaae5edfbfb16864343c59a4d4dd766333355118585948a4545cfe9f9f91004020206fe7f7f81a05050f0783c3c44259f9fba4ba8a8e3a25151f35da3a3fe804040c0058f8f8a3f9292ad219d9dbc70383848f1f5f50463bcbcdf77b6b6c1afdada754221216320101030e5ffff1afdf3f30ebfd2d26d81cdcd4c180c0c1426131335c3ecec2fbe5f5fe1359797a2884444cc2e17173993c4c45755a7a7f2fc7e7e827a3d3d47c86464acba5d5de73219192be6737395c06060a0198181989e4f4fd1a3dcdc7f44222266542a2a7e3b9090ab0b8888838c4646cac7eeee296bb8b8d32814143ca7dede79bc5e5ee2160b0b1daddbdb76dbe0e03b64323256743a3a4e140a0a1e924949db0c06060a4824246cb85c5ce49fc2c25dbdd3d36e43acacefc46262a6399191a8319595a4d3e4e437f279798bd5e7e7328bc8c8436e373759da6d6db7018d8d8cb1d5d5649c4e4ed249a9a9e0d86c6cb4ac5656faf3f4f407cfeaea25ca6565aff47a7a8e47aeaee9100808186fbabad5f07878884a25256f5c2e2e72381c1c2457a6a6f173b4b4c797c6c651cbe8e823a1dddd7ce874749c3e1f1f21964b4bdd61bdbddc0d8b8b860f8a8a85e07070907c3e3e4271b5b5c4cc6666aa904848d806030305f7f6f6011c0e0e12c26161a36a35355fae5757f969b9b9d01786869199c1c1583a1d1d27279e9eb9d9e1e138ebf8f8132b9898b322111133d26969bba9d9d970078e8e89339494a72d9b9bb63c1e1e2215878792c9e9e92087cece49aa5555ff50282878a5dfdf7a038c8c8f59a1a1f8098989801a0d0d1765bfbfdad7e6e631844242c6d06868b8824141c3299999b05a2d2d771e0f0f117bb0b0cba85454fc6dbbbbd62c16163a");
    private int a;
    private int[][] b = null;
    private int c;
    private int d;
    private int e;
    private int f;

    public a(byte[] byArray) throws ax.oc.a {
        this.c(byArray);
    }

    private void a(int[][] object) {
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16 = this.c;
        Object[] objectArray = object[0];
        this.c = n16 ^ objectArray[0];
        this.d ^= objectArray[1];
        this.e ^= objectArray[2];
        this.f ^= objectArray[3];
        for (n16 = 1; n16 < this.a - 1; n16 += 2) {
            objectArray = i;
            n15 = objectArray[this.c & 0xFF] ^ this.f(objectArray[this.d >> 8 & 0xFF], 24) ^ this.f(objectArray[this.e >> 16 & 0xFF], 16) ^ this.f(objectArray[this.f >> 24 & 0xFF], 8) ^ object[n16][0];
            n14 = objectArray[this.d & 0xFF] ^ this.f(objectArray[this.e >> 8 & 0xFF], 24) ^ this.f(objectArray[this.f >> 16 & 0xFF], 16) ^ this.f(objectArray[this.c >> 24 & 0xFF], 8) ^ object[n16][1];
            n13 = objectArray[this.e & 0xFF] ^ this.f(objectArray[this.f >> 8 & 0xFF], 24) ^ this.f(objectArray[this.c >> 16 & 0xFF], 16) ^ this.f(objectArray[this.d >> 24 & 0xFF], 8) ^ object[n16][2];
            n12 = objectArray[this.f & 0xFF];
            n11 = this.f(objectArray[this.c >> 8 & 0xFF], 24);
            n10 = this.f(objectArray[this.d >> 16 & 0xFF], 16);
            n9 = this.f(objectArray[this.e >> 24 & 0xFF], 8);
            n8 = n16 + 1;
            n9 = n12 ^ n11 ^ n10 ^ n9 ^ object[n16][3];
            n12 = objectArray[n15 & 0xFF];
            this.c = this.f(objectArray[n14 >> 8 & 0xFF], 24) ^ n12 ^ this.f(objectArray[n13 >> 16 & 0xFF], 16) ^ this.f(objectArray[n9 >> 24 & 0xFF], 8) ^ object[n8][0];
            this.d = objectArray[n14 & 0xFF] ^ this.f(objectArray[n13 >> 8 & 0xFF], 24) ^ this.f(objectArray[n9 >> 16 & 0xFF], 16) ^ this.f(objectArray[n15 >> 24 & 0xFF], 8) ^ object[n8][1];
            this.e = objectArray[n13 & 0xFF] ^ this.f(objectArray[n9 >> 8 & 0xFF], 24) ^ this.f(objectArray[n15 >> 16 & 0xFF], 16) ^ this.f(objectArray[n14 >> 24 & 0xFF], 8) ^ object[n8][2];
            n9 = objectArray[n9 & 0xFF];
            n15 = this.f(objectArray[n15 >> 8 & 0xFF], 24);
            n14 = this.f(objectArray[n14 >> 16 & 0xFF], 16);
            n13 = this.f(objectArray[n13 >> 24 & 0xFF], 8);
            this.f = n9 ^ n15 ^ n14 ^ n13 ^ object[n8][3];
        }
        objectArray = i;
        n8 = objectArray[this.c & 0xFF] ^ this.f(objectArray[this.d >> 8 & 0xFF], 24) ^ this.f(objectArray[this.e >> 16 & 0xFF], 16) ^ this.f(objectArray[this.f >> 24 & 0xFF], 8) ^ object[n16][0];
        n14 = objectArray[this.d & 0xFF] ^ this.f(objectArray[this.e >> 8 & 0xFF], 24) ^ this.f(objectArray[this.f >> 16 & 0xFF], 16) ^ this.f(objectArray[this.c >> 24 & 0xFF], 8) ^ object[n16][1];
        n13 = objectArray[this.e & 0xFF] ^ this.f(objectArray[this.f >> 8 & 0xFF], 24) ^ this.f(objectArray[this.c >> 16 & 0xFF], 16) ^ this.f(objectArray[this.d >> 24 & 0xFF], 8) ^ object[n16][2];
        n10 = objectArray[this.f & 0xFF];
        n12 = this.f(objectArray[this.c >> 8 & 0xFF], 24);
        n9 = this.f(objectArray[this.d >> 16 & 0xFF], 16);
        n15 = this.f(objectArray[this.e >> 24 & 0xFF], 8);
        n15 = object[n16][3] ^ (n15 ^ (n10 ^ n12 ^ n9));
        objectArray = g;
        n12 = objectArray[n8 & 0xFF];
        n9 = objectArray[n14 >> 8 & 0xFF];
        n10 = objectArray[n13 >> 16 & 0xFF];
        n11 = objectArray[n15 >> 24 & 0xFF];
        object = object[n16 + 1];
        this.c = n12 & 0xFF ^ (n9 & 0xFF) << 8 ^ (n10 & 0xFF) << 16 ^ n11 << 24 ^ object[0];
        n16 = objectArray[n14 & 0xFF];
        n10 = objectArray[n13 >> 8 & 0xFF];
        n9 = objectArray[n15 >> 16 & 0xFF];
        n12 = objectArray[n8 >> 24 & 0xFF];
        this.d = object[1] ^ (n16 & 0xFF ^ (n10 & 0xFF) << 8 ^ (n9 & 0xFF) << 16 ^ n12 << 24);
        this.e = objectArray[n13 & 0xFF] & 0xFF ^ (objectArray[n15 >> 8 & 0xFF] & 0xFF) << 8 ^ (objectArray[n8 >> 16 & 0xFF] & 0xFF) << 16 ^ objectArray[n14 >> 24 & 0xFF] << 24 ^ object[2];
        this.f = objectArray[n15 & 0xFF] & 0xFF ^ (objectArray[n8 >> 8 & 0xFF] & 0xFF) << 8 ^ (objectArray[n14 >> 16 & 0xFF] & 0xFF) << 16 ^ objectArray[n13 >> 24 & 0xFF] << 24 ^ object[3];
    }

    private int[][] b(byte[] objectArray) throws ax.oc.a {
        int n8 = objectArray.length / 4;
        if ((n8 == 4 || n8 == 6 || n8 == 8) && n8 * 4 == objectArray.length) {
            this.a = n8 + 6;
            int n9 = 0;
            int[][] nArray = new int[n8 + 7][4];
            int n10 = 0;
            while (n9 < objectArray.length) {
                nArray[n10 >> 2][n10 & 3] = objectArray[n9] & 0xFF | (objectArray[n9 + 1] & 0xFF) << 8 | (objectArray[n9 + 2] & 0xFF) << 16 | objectArray[n9 + 3] << 24;
                n9 += 4;
                ++n10;
            }
            int n11 = this.a;
            for (n10 = n8; n10 < n11 + 1 << 2; ++n10) {
                n9 = n10 - 1;
                int n12 = nArray[n9 >> 2][n9 & 3];
                int n13 = n10 % n8;
                if (n13 == 0) {
                    n9 = this.i(this.f(n12, 8)) ^ h[n10 / n8 - 1];
                } else {
                    n9 = n12;
                    if (n8 > 6) {
                        n9 = n12;
                        if (n13 == 4) {
                            n9 = this.i(n12);
                        }
                    }
                }
                objectArray = nArray[n10 >> 2];
                n12 = n10 - n8;
                objectArray[n10 & 3] = n9 ^ nArray[n12 >> 2][n12 & 3];
            }
            return nArray;
        }
        throw new ax.oc.a("invalid key length (not 128/192/256)");
    }

    private void c(byte[] byArray) throws ax.oc.a {
        this.b = this.b(byArray);
    }

    private int f(int n8, int n9) {
        return n8 << -n9 | n8 >>> n9;
    }

    private void g(byte[] byArray, int n8) {
        int n9;
        this.c = n9 = byArray[n8] & 0xFF;
        this.c = n9 = (byArray[n8 + 1] & 0xFF) << 8 | n9;
        this.c = n9 |= (byArray[n8 + 2] & 0xFF) << 16;
        this.c = n9 | byArray[n8 + 3] << 24;
        this.d = n9 = byArray[n8 + 4] & 0xFF;
        this.d = n9 = (byArray[n8 + 5] & 0xFF) << 8 | n9;
        this.d = n9 |= (byArray[n8 + 6] & 0xFF) << 16;
        this.d = n9 | byArray[n8 + 7] << 24;
        this.e = n9 = byArray[n8 + 8] & 0xFF;
        this.e = n9 = (byArray[n8 + 9] & 0xFF) << 8 | n9;
        this.e = n9 |= (byArray[n8 + 10] & 0xFF) << 16;
        this.e = n9 | byArray[n8 + 11] << 24;
        this.f = n9 = byArray[n8 + 12] & 0xFF;
        this.f = n9 = (byArray[n8 + 13] & 0xFF) << 8 | n9;
        this.f = n9 |= (byArray[n8 + 14] & 0xFF) << 16;
        this.f = byArray[n8 + 15] << 24 | n9;
    }

    private void h(byte[] byArray, int n8) {
        int n9 = this.c;
        byArray[n8] = (byte)n9;
        byArray[n8 + 1] = (byte)(n9 >> 8);
        byArray[n8 + 2] = (byte)(n9 >> 16);
        byArray[n8 + 3] = (byte)(n9 >> 24);
        n9 = this.d;
        byArray[n8 + 4] = (byte)n9;
        byArray[n8 + 5] = (byte)(n9 >> 8);
        byArray[n8 + 6] = (byte)(n9 >> 16);
        byArray[n8 + 7] = (byte)(n9 >> 24);
        n9 = this.e;
        byArray[n8 + 8] = (byte)n9;
        byArray[n8 + 9] = (byte)(n9 >> 8);
        byArray[n8 + 10] = (byte)(n9 >> 16);
        byArray[n8 + 11] = (byte)(n9 >> 24);
        n9 = this.f;
        byArray[n8 + 12] = (byte)n9;
        byArray[n8 + 13] = (byte)(n9 >> 8);
        byArray[n8 + 14] = (byte)(n9 >> 16);
        byArray[n8 + 15] = (byte)(n9 >> 24);
    }

    private int i(int n8) {
        byte[] byArray = g;
        byte by = byArray[n8 & 0xFF];
        byte by2 = byArray[n8 >> 8 & 0xFF];
        byte by3 = byArray[n8 >> 16 & 0xFF];
        return byArray[n8 >> 24 & 0xFF] << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
    }

    public int d(byte[] byArray, int n8, byte[] byArray2, int n9) throws ax.oc.a {
        if (this.b != null) {
            if (n8 + 16 <= byArray.length) {
                if (n9 + 16 <= byArray2.length) {
                    this.g(byArray, n8);
                    this.a(this.b);
                    this.h(byArray2, n9);
                    return 16;
                }
                throw new ax.oc.a("output buffer too short");
            }
            throw new ax.oc.a("input buffer too short");
        }
        throw new ax.oc.a("AES engine not initialised");
    }

    public int e(byte[] byArray, byte[] byArray2) throws ax.oc.a {
        return this.d(byArray, 0, byArray2, 0);
    }

    private static long[] $d2j$hex$a6c600d4$decode_J(String src) {
        byte[] d8 = ax.nc.a.$d2j$hex$a6c600d4$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s8 = b8.asLongBuffer();
        long[] data = new long[d8.length / 8];
        s8.get(data);
        return data;
    }

    private static int[] $d2j$hex$a6c600d4$decode_I(String src) {
        byte[] d8 = ax.nc.a.$d2j$hex$a6c600d4$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s8 = b8.asIntBuffer();
        int[] data = new int[d8.length / 4];
        s8.get(data);
        return data;
    }

    private static short[] $d2j$hex$a6c600d4$decode_S(String src) {
        byte[] d8 = ax.nc.a.$d2j$hex$a6c600d4$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s8 = b8.asShortBuffer();
        short[] data = new short[d8.length / 2];
        s8.get(data);
        return data;
    }

    private static byte[] $d2j$hex$a6c600d4$decode_B(String src) {
        char[] d8 = src.toCharArray();
        byte[] ret = new byte[src.length() / 2];
        for (int i8 = 0; i8 < ret.length; ++i8) {
            int ll;
            int hh;
            char h8 = d8[2 * i8];
            char l8 = d8[2 * i8 + 1];
            if (h8 >= '0' && h8 <= '9') {
                hh = h8 - 48;
            } else if (h8 >= 'a' && h8 <= 'f') {
                hh = h8 - 97 + 10;
            } else if (h8 >= 'A' && h8 <= 'F') {
                hh = h8 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            if (l8 >= '0' && l8 <= '9') {
                ll = l8 - 48;
            } else if (l8 >= 'a' && l8 <= 'f') {
                ll = l8 - 97 + 10;
            } else if (l8 >= 'A' && l8 <= 'F') {
                ll = l8 - 65 + 10;
            } else {
                throw new RuntimeException();
            }
            ret[i8] = (byte)(hh << 4 | ll);
        }
        return ret;
    }
}

