/*
 * Decompiled with CFR 0.152.
 */
package ax.xd;

import ax.Dd.k;
import ax.Nd.h;
import ax.vd.d;
import ax.vd.f;
import ax.vd.n;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public class a
implements ax.vd.a {
    private static final byte[] e = new byte[]{99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, -128, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};
    private static final byte[] f = new byte[]{82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, 16, 89, 39, -128, -20, 95, 96, 81, 127, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};
    private static final int[] g = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, 125, 250, 239, 197, 145};
    private static final int[] h = ax.xd.a.$d2j$hex$f61987cd$decode_I("c66363a5f87c7c84ee777799f67b7b8dfff2f20dd66b6bbdde6f6fb191c5c5546030305002010103ce6767a9562b2b7de7fefe19b5d7d7624dababe6ec76769a8fcaca451f82829d89c9c940fa7d7d87effafa15b25959eb8e4747c9fbf0f00b41adadecb3d4d4675fa2a2fd45afafea239c9cbf53a4a4f7e47272969bc0c05b75b7b7c2e1fdfd1c3d9393ae4c26266a6c36365a7e3f3f41f5f7f70283cccc4f6834345c51a5a5f4d1e5e534f9f1f108e2717193abd8d873623131532a15153f0804040c95c7c752462323659dc3c35e30181828379696a10a05050f2f9a9ab50e070709241212361b80809bdfe2e23dcdebeb264e2727697fb2b2cdea75759f1209091b1d83839e582c2c74341a1a2e361b1b2ddc6e6eb2b45a5aee5ba0a0fba45252f6763b3b4db7d6d6617db3b3ce5229297bdde3e33e5e2f2f7113848497a65353f5b9d1d16800000000c1eded2c40202060e3fcfc1f79b1b1c8b65b5bedd46a6abe8dcbcb4667bebed97239394b944a4ade984c4cd4b05858e885cfcf4abbd0d06bc5efef2a4faaaae5edfbfb16864343c59a4d4dd766333355118585948a4545cfe9f9f91004020206fe7f7f81a05050f0783c3c44259f9fba4ba8a8e3a25151f35da3a3fe804040c0058f8f8a3f9292ad219d9dbc70383848f1f5f50463bcbcdf77b6b6c1afdada754221216320101030e5ffff1afdf3f30ebfd2d26d81cdcd4c180c0c1426131335c3ecec2fbe5f5fe1359797a2884444cc2e17173993c4c45755a7a7f2fc7e7e827a3d3d47c86464acba5d5de73219192be6737395c06060a0198181989e4f4fd1a3dcdc7f44222266542a2a7e3b9090ab0b8888838c4646cac7eeee296bb8b8d32814143ca7dede79bc5e5ee2160b0b1daddbdb76dbe0e03b64323256743a3a4e140a0a1e924949db0c06060a4824246cb85c5ce49fc2c25dbdd3d36e43acacefc46262a6399191a8319595a4d3e4e437f279798bd5e7e7328bc8c8436e373759da6d6db7018d8d8cb1d5d5649c4e4ed249a9a9e0d86c6cb4ac5656faf3f4f407cfeaea25ca6565aff47a7a8e47aeaee9100808186fbabad5f07878884a25256f5c2e2e72381c1c2457a6a6f173b4b4c797c6c651cbe8e823a1dddd7ce874749c3e1f1f21964b4bdd61bdbddc0d8b8b860f8a8a85e07070907c3e3e4271b5b5c4cc6666aa904848d806030305f7f6f6011c0e0e12c26161a36a35355fae5757f969b9b9d01786869199c1c1583a1d1d27279e9eb9d9e1e138ebf8f8132b9898b322111133d26969bba9d9d970078e8e89339494a72d9b9bb63c1e1e2215878792c9e9e92087cece49aa5555ff50282878a5dfdf7a038c8c8f59a1a1f8098989801a0d0d1765bfbfdad7e6e631844242c6d06868b8824141c3299999b05a2d2d771e0f0f117bb0b0cba85454fc6dbbbbd62c16163a");
    private static final int[] i = ax.xd.a.$d2j$hex$f61987cd$decode_I("51f4a7507e4165531a17a4c33a275e963bab6bcb1f9d45f1acfa58ab4be303932030fa55ad766df688cc7691f5024c254fe5d7fcc52acbd726354480b562a38fdeb15a4925ba1b6745ea0e985dfec0e1c32f7502814cf0128d4697a36bd3f9c6038f5fe715929c95bf6d7aeb955259dad4be832d587421d349e069298ec9c84475c2896af48e797899583e6b27b971ddbee14fb6f088ad17c920ac667dce3ab463df4a18e51a31829751336062537f45b16477e0bb6bae84fe81a01cf9082b94704868588f45fd1994de6c87527bf8b7ab73d323724b02e2e31f8f576655ab2ab2eb28072fb5c20386c57b9ad33708a5302887f223bfa5b202036abaed16825c8acf1c2ba779b492f307f2f04e69e2a165daf4cd0605bed5d134621fc4a6fe8a342e539da2f355a0058ae132a4f6eb750b83ec394060efaa5e719f06bd6e10513e218af996dd063ddd3e05ae4de6bd4691548db571c45d050406d46f605015ff1998fb24d6bde997894043cc67d99e77b0e842bd07898b88e7195b3879c8eedba17c0a477c420fe9f8841ec90000000009808683322bed481e1170ac6c5a724efd0efffb0f8538563daed51e362d39270a0fd964685ca6219b5b54d124362e3a0c0a67b19357e70fb4ee96d21b9b919e80c0c54f61dc20a25a774b691c121a16e293ba0ac0a02ae53c22e043121b171d0e090d0bf28bc7ad2db6a8b9141ea9c857f11985af75074cee99ddbba37f60fdf701269f5c72f5bc44663bc55bfb7e348b432976cb23c6dcb6edfc68b8e4f163d731dcca426385101397224084c61120854a247dd2bb3df8aef93211c729a16d1d9e2f4bdcb230f30d8652ec77c1e3d02bb3166ca970b999119448fa47e96422a8fc8cc4a0f03f1a567d2cd8223390ef87494ec7d938d1c18ccaa2fe98d40b36a6f581cfa57ade28dab78e263fadbfa42c3a9de45078920d6a5fcc9b547e4662f68d13c290d8b8e82e39f75e82c3aff59f5d80be69d0937c6fd52da9cf2512b3c8ac993b10187da7e89c636edb3bbb7bcd2678096e5918f4ec9ab701834f9aa8e6956e65aaffe67e21bccf08ef15e8e6bae79bd94a6f36ceea9f09d429b07cd631a4b2af2a3f2331c6a5943035a266c0744ebc37fc82caa6e090d0b033a7d815f104984a41ecdaf77fcd500e1791f62f764dd68d43efb04dccaa4d54e49604df9ed1b5e34c6a881bc12c1fb84665517f9d5eea04018c355dfa877473fb0b412eb3671d5a92dbd252e91056336dd647139ad7618c37a10c7a59f8148eeb133c89cea927eeb761c935e11ce5ed7a47b13c9cd2df5955f2733f1814ce7973c737bf53f7cdea5ffdaa5bdf3d6f147844db86caaff381b968c43e3824342cc2a3405f161dc372bce2250c283c498bff0d954139a80171080cb3ded8b4e49c6456c1907bcb8461d532b670486c5c74d0b85742");
    private int a;
    private int[][] b = null;
    private boolean c;
    private byte[] d;

    private static int b(int n8) {
        return ((n8 & 0x80808080) >>> 7) * 27 ^ (0x7F7F7F7F & n8) << 1;
    }

    private static int c(int n8) {
        int n9 = n8 & 0xC0C0C0C0;
        n9 ^= n9 >>> 1;
        return n9 >>> 5 ^ ((0x3F3F3F3F & n8) << 2 ^ n9 >>> 2);
    }

    private void g(byte[] objectArray, int n8, byte[] byArray, int n9, int[][] object) {
        int n10;
        int n11;
        byte by;
        int n12;
        int n13;
        Object object2;
        Object object3;
        int n14;
        int n15;
        int n16;
        Object object4;
        int n17;
        int n18;
        int n19;
        int n20;
        int n21 = ax.Nd.h.h(objectArray, n8);
        Object object5 = ax.Nd.h.h(objectArray, n8 + 4);
        int n22 = ax.Nd.h.h(objectArray, n8 + 8);
        int n23 = ax.Nd.h.h(objectArray, n8 + 12);
        n8 = this.a;
        objectArray = object[n8];
        n21 ^= objectArray[0];
        object5 ^= objectArray[1];
        n22 ^= objectArray[2];
        --n8;
        n23 ^= objectArray[3];
        while (n8 > 1) {
            objectArray = i;
            n20 = objectArray[n21 & 0xFF] ^ ax.xd.a.l(objectArray[n23 >> 8 & 0xFF], 24) ^ ax.xd.a.l(objectArray[n22 >> 16 & 0xFF], 16) ^ ax.xd.a.l(objectArray[object5 >> 24 & 0xFF], 8) ^ object[n8][0];
            n19 = objectArray[object5 & 0xFF] ^ ax.xd.a.l(objectArray[n21 >> 8 & 0xFF], 24) ^ ax.xd.a.l(objectArray[n23 >> 16 & 0xFF], 16) ^ ax.xd.a.l(objectArray[n22 >> 24 & 0xFF], 8) ^ object[n8][1];
            n18 = objectArray[n22 & 0xFF] ^ ax.xd.a.l(objectArray[object5 >> 8 & 0xFF], 24) ^ ax.xd.a.l(objectArray[n21 >> 16 & 0xFF], 16) ^ ax.xd.a.l(objectArray[n23 >> 24 & 0xFF], 8) ^ object[n8][2];
            n23 = objectArray[n23 & 0xFF];
            n22 = ax.xd.a.l(objectArray[n22 >> 8 & 0xFF], 24);
            object5 = ax.xd.a.l(objectArray[object5 >> 16 & 0xFF], 16);
            n17 = ax.xd.a.l(objectArray[n21 >> 24 & 0xFF], 8);
            n21 = n8 - 1;
            n23 = n23 ^ n22 ^ object5 ^ n17 ^ object[n8][3];
            object4 = objectArray[n20 & 0xFF];
            n16 = ax.xd.a.l(objectArray[n23 >> 8 & 0xFF], 24);
            int n24 = ax.xd.a.l(objectArray[n18 >> 16 & 0xFF], 16);
            n15 = ax.xd.a.l(objectArray[n19 >> 24 & 0xFF], 8);
            n14 = object[n21][0];
            object5 = objectArray[n19 & 0xFF];
            object3 = ax.xd.a.l(objectArray[n20 >> 8 & 0xFF], 24);
            object2 = ax.xd.a.l(objectArray[n23 >> 16 & 0xFF], 16);
            n13 = ax.xd.a.l(objectArray[n18 >> 24 & 0xFF], 8);
            n12 = object[n21][1];
            by = objectArray[n18 & 0xFF];
            n11 = ax.xd.a.l(objectArray[n19 >> 8 & 0xFF], 24);
            n22 = ax.xd.a.l(objectArray[n20 >> 16 & 0xFF], 16);
            n10 = ax.xd.a.l(objectArray[n23 >> 24 & 0xFF], 8);
            n17 = object[n21][2];
            n23 = objectArray[n23 & 0xFF];
            n18 = ax.xd.a.l(objectArray[n18 >> 8 & 0xFF], 24);
            n19 = ax.xd.a.l(objectArray[n19 >> 16 & 0xFF], 16);
            n20 = ax.xd.a.l(objectArray[n20 >> 24 & 0xFF], 8);
            n8 -= 2;
            n23 = n23 ^ n18 ^ n19 ^ n20 ^ object[n21][3];
            n21 = object4 ^ n16 ^ n24 ^ n15 ^ n14;
            object5 = object5 ^ object3 ^ object2 ^ n13 ^ n12;
            n22 = by ^ n11 ^ n22 ^ n10 ^ n17;
        }
        objectArray = i;
        n20 = objectArray[n21 & 0xFF] ^ ax.xd.a.l(objectArray[n23 >> 8 & 0xFF], 24) ^ ax.xd.a.l(objectArray[n22 >> 16 & 0xFF], 16) ^ ax.xd.a.l(objectArray[object5 >> 24 & 0xFF], 8) ^ object[n8][0];
        n19 = objectArray[object5 & 0xFF] ^ ax.xd.a.l(objectArray[n21 >> 8 & 0xFF], 24) ^ ax.xd.a.l(objectArray[n23 >> 16 & 0xFF], 16) ^ ax.xd.a.l(objectArray[n22 >> 24 & 0xFF], 8) ^ object[n8][1];
        n18 = objectArray[n22 & 0xFF] ^ ax.xd.a.l(objectArray[object5 >> 8 & 0xFF], 24) ^ ax.xd.a.l(objectArray[n21 >> 16 & 0xFF], 16) ^ ax.xd.a.l(objectArray[n23 >> 24 & 0xFF], 8) ^ object[n8][2];
        n14 = objectArray[n23 & 0xFF] ^ ax.xd.a.l(objectArray[n22 >> 8 & 0xFF], 24) ^ ax.xd.a.l(objectArray[object5 >> 16 & 0xFF], 16) ^ ax.xd.a.l(objectArray[n21 >> 24 & 0xFF], 8) ^ object[n8][3];
        objectArray = f;
        n15 = objectArray[n20 & 0xFF];
        byte[] byArray2 = this.d;
        n23 = byArray2[n14 >> 8 & 0xFF];
        n12 = byArray2[n18 >> 16 & 0xFF];
        n22 = objectArray[n19 >> 24 & 0xFF];
        object = object[0];
        object3 = object[0];
        n13 = byArray2[n19 & 0xFF];
        n16 = byArray2[n20 >> 8 & 0xFF];
        n11 = objectArray[n14 >> 16 & 0xFF];
        by = byArray2[n18 >> 24 & 0xFF];
        object2 = object[1];
        n8 = byArray2[n18 & 0xFF];
        n10 = objectArray[n19 >> 8 & 0xFF];
        n17 = objectArray[n20 >> 16 & 0xFF];
        n21 = byArray2[n14 >> 24 & 0xFF];
        object5 = object[2];
        n14 = objectArray[n14 & 0xFF];
        n18 = byArray2[n18 >> 8 & 0xFF];
        n19 = byArray2[n19 >> 16 & 0xFF];
        n20 = byArray2[n20 >> 24 & 0xFF];
        object4 = object[3];
        ax.Nd.h.f(n15 & 0xFF ^ (n23 & 0xFF) << 8 ^ (n12 & 0xFF) << 16 ^ n22 << 24 ^ object3, byArray, n9);
        ax.Nd.h.f(n13 & 0xFF ^ (n16 & 0xFF) << 8 ^ (n11 & 0xFF) << 16 ^ by << 24 ^ object2, byArray, n9 + 4);
        ax.Nd.h.f(n8 & 0xFF ^ (n10 & 0xFF) << 8 ^ (n17 & 0xFF) << 16 ^ n21 << 24 ^ object5, byArray, n9 + 8);
        ax.Nd.h.f(n14 & 0xFF ^ (n18 & 0xFF) << 8 ^ (n19 & 0xFF) << 16 ^ n20 << 24 ^ object4, byArray, n9 + 12);
    }

    private void i(byte[] objectArray, int object, byte[] byArray, int n8, int[][] object2) {
        Object object3;
        int n9;
        Object object4;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        byte by;
        int n17;
        Object object5;
        int n18;
        int n19;
        int n20 = ax.Nd.h.h(objectArray, object);
        int n21 = ax.Nd.h.h(objectArray, object + 4);
        int n22 = ax.Nd.h.h(objectArray, object + 8);
        object = ax.Nd.h.h(objectArray, object + 12);
        objectArray = object2[0];
        n20 ^= objectArray[0];
        n21 ^= objectArray[1];
        n22 ^= objectArray[2];
        int n23 = object ^ objectArray[3];
        for (object = 1; object < this.a - 1; object += 2) {
            objectArray = h;
            n19 = objectArray[n20 & 0xFF] ^ ax.xd.a.l(objectArray[n21 >> 8 & 0xFF], 24) ^ ax.xd.a.l(objectArray[n22 >> 16 & 0xFF], 16) ^ ax.xd.a.l(objectArray[n23 >> 24 & 0xFF], 8) ^ object2[object][0];
            n18 = objectArray[n21 & 0xFF] ^ ax.xd.a.l(objectArray[n22 >> 8 & 0xFF], 24) ^ ax.xd.a.l(objectArray[n23 >> 16 & 0xFF], 16) ^ ax.xd.a.l(objectArray[n20 >> 24 & 0xFF], 8) ^ object2[object][1];
            object5 = objectArray[n22 & 0xFF] ^ ax.xd.a.l(objectArray[n23 >> 8 & 0xFF], 24) ^ ax.xd.a.l(objectArray[n20 >> 16 & 0xFF], 16) ^ ax.xd.a.l(objectArray[n21 >> 24 & 0xFF], 8) ^ object2[object][2];
            n23 = objectArray[n23 & 0xFF];
            n20 = ax.xd.a.l(objectArray[n20 >> 8 & 0xFF], 24);
            n21 = ax.xd.a.l(objectArray[n21 >> 16 & 0xFF], 16);
            n17 = ax.xd.a.l(objectArray[n22 >> 24 & 0xFF], 8);
            n22 = object + 1;
            n23 = n23 ^ n20 ^ n21 ^ n17 ^ object2[object][3];
            by = objectArray[n19 & 0xFF];
            n20 = ax.xd.a.l(objectArray[n18 >> 8 & 0xFF], 24);
            n16 = ax.xd.a.l(objectArray[object5 >> 16 & 0xFF], 16);
            n15 = ax.xd.a.l(objectArray[n23 >> 24 & 0xFF], 8);
            int n24 = object2[n22][0];
            n21 = objectArray[n18 & 0xFF];
            n14 = ax.xd.a.l(objectArray[object5 >> 8 & 0xFF], 24);
            n13 = ax.xd.a.l(objectArray[n23 >> 16 & 0xFF], 16);
            n12 = ax.xd.a.l(objectArray[n19 >> 24 & 0xFF], 8);
            n11 = object2[n22][1];
            n17 = objectArray[object5 & 0xFF];
            n10 = ax.xd.a.l(objectArray[n23 >> 8 & 0xFF], 24);
            object4 = ax.xd.a.l(objectArray[n19 >> 16 & 0xFF], 16);
            n9 = ax.xd.a.l(objectArray[n18 >> 24 & 0xFF], 8);
            object3 = object2[n22][2];
            n23 = objectArray[n23 & 0xFF];
            n19 = ax.xd.a.l(objectArray[n19 >> 8 & 0xFF], 24);
            n18 = ax.xd.a.l(objectArray[n18 >> 16 & 0xFF], 16);
            object5 = ax.xd.a.l(objectArray[object5 >> 24 & 0xFF], 8);
            n23 = n23 ^ n19 ^ n18 ^ object5 ^ object2[n22][3];
            n20 = by ^ n20 ^ n16 ^ n15 ^ n24;
            n21 = n21 ^ n14 ^ n13 ^ n12 ^ n11;
            n22 = n17 ^ n10 ^ object4 ^ n9 ^ object3;
        }
        objectArray = h;
        n19 = objectArray[n20 & 0xFF] ^ ax.xd.a.l(objectArray[n21 >> 8 & 0xFF], 24) ^ ax.xd.a.l(objectArray[n22 >> 16 & 0xFF], 16) ^ ax.xd.a.l(objectArray[n23 >> 24 & 0xFF], 8) ^ object2[object][0];
        n18 = objectArray[n21 & 0xFF] ^ ax.xd.a.l(objectArray[n22 >> 8 & 0xFF], 24) ^ ax.xd.a.l(objectArray[n23 >> 16 & 0xFF], 16) ^ ax.xd.a.l(objectArray[n20 >> 24 & 0xFF], 8) ^ object2[object][1];
        object5 = objectArray[n22 & 0xFF] ^ ax.xd.a.l(objectArray[n23 >> 8 & 0xFF], 24) ^ ax.xd.a.l(objectArray[n20 >> 16 & 0xFF], 16) ^ ax.xd.a.l(objectArray[n21 >> 24 & 0xFF], 8) ^ object2[object][2];
        n15 = objectArray[n23 & 0xFF] ^ ax.xd.a.l(objectArray[n20 >> 8 & 0xFF], 24) ^ ax.xd.a.l(objectArray[n21 >> 16 & 0xFF], 16) ^ ax.xd.a.l(objectArray[n22 >> 24 & 0xFF], 8) ^ object2[object][3];
        objectArray = e;
        n23 = objectArray[n19 & 0xFF];
        n22 = objectArray[n18 >> 8 & 0xFF];
        byte[] byArray2 = this.d;
        n21 = byArray2[object5 >> 16 & 0xFF];
        n20 = byArray2[n15 >> 24 & 0xFF];
        object2 = object2[object + 1];
        object = object2[0];
        n13 = byArray2[n18 & 0xFF];
        n17 = objectArray[object5 >> 8 & 0xFF];
        n16 = objectArray[n15 >> 16 & 0xFF];
        n11 = byArray2[n19 >> 24 & 0xFF];
        object3 = object2[1];
        n9 = byArray2[object5 & 0xFF];
        n14 = objectArray[n15 >> 8 & 0xFF];
        n10 = objectArray[n19 >> 16 & 0xFF];
        n12 = objectArray[n18 >> 24 & 0xFF];
        object4 = object2[2];
        n15 = byArray2[n15 & 0xFF];
        n19 = byArray2[n19 >> 8 & 0xFF];
        n18 = byArray2[n18 >> 16 & 0xFF];
        by = objectArray[object5 >> 24 & 0xFF];
        object5 = object2[3];
        ax.Nd.h.f(n23 & 0xFF ^ (n22 & 0xFF) << 8 ^ (n21 & 0xFF) << 16 ^ n20 << 24 ^ object, byArray, n8);
        ax.Nd.h.f(n13 & 0xFF ^ (n17 & 0xFF) << 8 ^ (n16 & 0xFF) << 16 ^ n11 << 24 ^ object3, byArray, n8 + 4);
        ax.Nd.h.f(n9 & 0xFF ^ (n14 & 0xFF) << 8 ^ (n10 & 0xFF) << 16 ^ n12 << 24 ^ object4, byArray, n8 + 8);
        ax.Nd.h.f(n15 & 0xFF ^ (n19 & 0xFF) << 8 ^ (n18 & 0xFF) << 16 ^ by << 24 ^ object5, byArray, n8 + 12);
    }

    private int[][] j(byte[] objectArray, boolean bl) {
        int n8 = objectArray.length;
        if (n8 >= 16 && n8 <= 32 && (n8 & 7) == 0) {
            int n9;
            int[][] nArray;
            block12: {
                int n10;
                int n11;
                int n12;
                this.a = (n8 >>>= 2) + 6;
                nArray = new int[n8 + 7][4];
                if (n8 != 4) {
                    int n13;
                    int n14;
                    int n15;
                    int n16;
                    int n17;
                    if (n8 != 6) {
                        if (n8 == 8) {
                            nArray[0][0] = n17 = ax.Nd.h.h(objectArray, 0);
                            nArray[0][1] = n16 = ax.Nd.h.h(objectArray, 4);
                            nArray[0][2] = n12 = ax.Nd.h.h(objectArray, 8);
                            nArray[0][3] = n15 = ax.Nd.h.h(objectArray, 12);
                            nArray[1][0] = n14 = ax.Nd.h.h(objectArray, 16);
                            nArray[1][1] = n11 = ax.Nd.h.h(objectArray, 20);
                            nArray[1][2] = n10 = ax.Nd.h.h(objectArray, 24);
                            nArray[1][3] = n13 = ax.Nd.h.h(objectArray, 28);
                            n8 = 1;
                            n9 = 2;
                            while (true) {
                                int n18 = n8;
                                int n19 = ax.xd.a.m(ax.xd.a.l(n13, 8));
                                n8 = n18 << 1;
                                objectArray = nArray[n9];
                                objectArray[0] = n17 ^= n19 ^ n18;
                                objectArray[1] = n16 ^= n17;
                                objectArray[2] = n12 ^= n16;
                                objectArray[3] = n15 ^= n12;
                                n18 = n9 + 1;
                                if (n18 < 15) {
                                    objectArray = nArray[n18];
                                    objectArray[0] = n14 ^= ax.xd.a.m(n15);
                                    objectArray[1] = n11 ^= n14;
                                    objectArray[2] = n10 ^= n11;
                                    objectArray[3] = n13 ^= n10;
                                    n9 += 2;
                                    continue;
                                }
                                break block12;
                                break;
                            }
                        }
                        throw new IllegalStateException("Should never get here");
                    }
                    nArray[0][0] = n14 = ax.Nd.h.h(objectArray, 0);
                    nArray[0][1] = n15 = ax.Nd.h.h(objectArray, 4);
                    nArray[0][2] = n16 = ax.Nd.h.h(objectArray, 8);
                    nArray[0][3] = n12 = ax.Nd.h.h(objectArray, 12);
                    n11 = ax.Nd.h.h(objectArray, 16);
                    n10 = ax.Nd.h.h(objectArray, 20);
                    n9 = 1;
                    n8 = 1;
                    while (true) {
                        n13 = n8;
                        objectArray = nArray[n9];
                        objectArray[0] = n11;
                        objectArray[1] = n10;
                        objectArray = nArray[n9];
                        objectArray[2] = n14 ^= ax.xd.a.m(ax.xd.a.l(n10, 8)) ^ n13;
                        objectArray[3] = n15 ^= n14;
                        objectArray = nArray[n9 + 1];
                        objectArray[0] = n16 ^= n15;
                        objectArray[1] = n12 ^= n16;
                        objectArray[2] = n11 ^= n12;
                        objectArray[3] = n10 ^= n11;
                        n17 = ax.xd.a.m(ax.xd.a.l(n10, 8));
                        n8 = n13 << 2;
                        objectArray = nArray[n9 + 2];
                        objectArray[0] = n14 ^= n17 ^ n13 << 1;
                        objectArray[1] = n15 ^= n14;
                        objectArray[2] = n16 ^= n15;
                        objectArray[3] = n12 ^= n16;
                        if ((n9 += 3) < 13) {
                            n10 ^= (n11 ^= n12);
                            continue;
                        }
                        break block12;
                        break;
                    }
                }
                nArray[0][0] = n11 = ax.Nd.h.h(objectArray, 0);
                nArray[0][1] = n10 = ax.Nd.h.h(objectArray, 4);
                nArray[0][2] = n9 = ax.Nd.h.h(objectArray, 8);
                nArray[0][3] = n12 = ax.Nd.h.h(objectArray, 12);
                for (n8 = 1; n8 <= 10; ++n8) {
                    objectArray = nArray[n8];
                    objectArray[0] = n11 ^= ax.xd.a.m(ax.xd.a.l(n12, 8)) ^ g[n8 - 1];
                    objectArray[1] = n10 ^= n11;
                    objectArray[2] = n9 ^= n10;
                    objectArray[3] = n12 ^= n9;
                }
            }
            if (!bl) {
                for (n8 = 1; n8 < this.a; ++n8) {
                    for (n9 = 0; n9 < 4; ++n9) {
                        objectArray = nArray[n8];
                        objectArray[n9] = ax.xd.a.k(objectArray[n9]);
                    }
                }
            }
            return nArray;
        }
        throw new IllegalArgumentException("Key length not 128/192/256 bits.");
    }

    private static int k(int n8) {
        int n9 = ax.xd.a.l(n8, 8) ^ n8;
        n8 ^= ax.xd.a.b(n9);
        return n8 ^ ((n9 ^= ax.xd.a.c(n8)) ^ ax.xd.a.l(n9, 16));
    }

    private static int l(int n8, int n9) {
        return n8 << -n9 | n8 >>> n9;
    }

    private static int m(int n8) {
        byte[] byArray = e;
        byte by = byArray[n8 & 0xFF];
        byte by2 = byArray[n8 >> 8 & 0xFF];
        byte by3 = byArray[n8 >> 16 & 0xFF];
        return byArray[n8 >> 24 & 0xFF] << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
    }

    @Override
    public void a() {
    }

    @Override
    public int d() {
        return 16;
    }

    @Override
    public void e(boolean bl, d d8) {
        if (d8 instanceof k) {
            this.b = this.j(((k)d8).a(), bl);
            this.c = bl;
            if (bl) {
                this.d = ax.Nd.a.d(e);
                return;
            }
            this.d = ax.Nd.a.d(f);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("invalid parameter passed to AES init - ");
        stringBuilder.append(d8.getClass().getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public String f() {
        return "AES";
    }

    @Override
    public int h(byte[] byArray, int n8, byte[] byArray2, int n9) {
        int[][] nArray = this.b;
        if (nArray != null) {
            if (n8 <= byArray.length - 16) {
                if (n9 <= byArray2.length - 16) {
                    if (this.c) {
                        this.i(byArray, n8, byArray2, n9, nArray);
                    } else {
                        this.g(byArray, n8, byArray2, n9, nArray);
                    }
                    return 16;
                }
                throw new n("output buffer too short");
            }
            throw new f("input buffer too short");
        }
        throw new IllegalStateException("AES engine not initialised");
    }

    private static long[] $d2j$hex$f61987cd$decode_J(String src) {
        byte[] d8 = ax.xd.a.$d2j$hex$f61987cd$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        LongBuffer s8 = b8.asLongBuffer();
        long[] data = new long[d8.length / 8];
        s8.get(data);
        return data;
    }

    private static int[] $d2j$hex$f61987cd$decode_I(String src) {
        byte[] d8 = ax.xd.a.$d2j$hex$f61987cd$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer s8 = b8.asIntBuffer();
        int[] data = new int[d8.length / 4];
        s8.get(data);
        return data;
    }

    private static short[] $d2j$hex$f61987cd$decode_S(String src) {
        byte[] d8 = ax.xd.a.$d2j$hex$f61987cd$decode_B(src);
        ByteBuffer b8 = ByteBuffer.wrap(d8);
        b8.order(ByteOrder.LITTLE_ENDIAN);
        ShortBuffer s8 = b8.asShortBuffer();
        short[] data = new short[d8.length / 2];
        s8.get(data);
        return data;
    }

    private static byte[] $d2j$hex$f61987cd$decode_B(String src) {
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

