.class public Lax/y0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/y0/a$e;,
        Lax/y0/a$d;,
        Lax/y0/a$f;,
        Lax/y0/a$g;,
        Lax/y0/a$b;,
        Lax/y0/a$c;
    }
.end annotation


# static fields
.field public static final A:[I

.field public static final B:[I

.field public static final C:[I

.field static final D:[B

.field private static final E:[B

.field private static final F:[B

.field private static final G:[B

.field private static final H:[B

.field private static final I:[B

.field private static final J:[B

.field private static final K:[B

.field private static final L:[B

.field static final M:[B

.field private static final N:[B

.field private static final O:[B

.field private static final P:[B

.field private static final Q:[B

.field private static final R:[B

.field private static final S:[B

.field private static final T:[B

.field private static final U:[B

.field private static final V:[B

.field private static final W:Ljava/text/SimpleDateFormat;

.field private static final X:Ljava/text/SimpleDateFormat;

.field private static final Y:[Ljava/lang/String;

.field private static final Z:[I

.field private static final a0:[B

.field private static final b0:[Lax/y0/a$e;

.field private static final c0:[Lax/y0/a$e;

.field private static final d0:[Lax/y0/a$e;

.field private static final e0:[Lax/y0/a$e;

.field private static final f0:[Lax/y0/a$e;

.field private static final g0:Lax/y0/a$e;

.field private static final h0:[Lax/y0/a$e;

.field private static final i0:[Lax/y0/a$e;

.field private static final j0:[Lax/y0/a$e;

.field private static final k0:[Lax/y0/a$e;

.field static final l0:[[Lax/y0/a$e;

.field private static final m0:[Lax/y0/a$e;

.field private static final n0:[Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lax/y0/a$e;",
            ">;"
        }
    .end annotation
.end field

.field private static final o0:[Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lax/y0/a$e;",
            ">;"
        }
    .end annotation
.end field

.field private static final p0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final q0:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final r0:Ljava/nio/charset/Charset;

.field static final s0:[B

.field private static final t0:[B

.field private static final u0:Ljava/util/regex/Pattern;

.field private static final v0:Ljava/util/regex/Pattern;

.field private static final w0:Ljava/util/regex/Pattern;

.field private static final x:Z

.field private static final x0:Ljava/util/regex/Pattern;

.field private static final y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/io/FileDescriptor;

.field private c:Landroid/content/res/AssetManager$AssetInputStream;

.field private d:I

.field private e:Z

.field private final f:[Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lax/y0/a$d;",
            ">;"
        }
    .end annotation
.end field

.field private g:Z

.field private h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/nio/ByteOrder;

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:I

.field private n:I

.field private o:[B

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:Z

.field private v:Lax/y0/a$d;

.field private w:Z


# direct methods
.method static constructor <clinit>()V
    .registers 113

    .line 1
    const-string v0, "ExifInterface"

    const/4 v1, 0x3

    .line 2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 3
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Lax/y0/a;->x:Z

    const/4 v0, 0x1

    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x6

    .line 5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v6, 0x8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x4

    new-array v9, v8, [Ljava/lang/Integer;

    const/4 v10, 0x0

    aput-object v3, v9, v10

    aput-object v5, v9, v0

    const/4 v5, 0x2

    aput-object v2, v9, v5

    aput-object v7, v9, v1

    .line 6
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    sput-object v9, Lax/y0/a;->y:Ljava/util/List;

    .line 7
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v11, 0x7

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/4 v14, 0x5

    .line 8
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    const/16 v16, 0x0

    new-array v10, v8, [Ljava/lang/Integer;

    aput-object v9, v10, v16

    aput-object v12, v10, v0

    aput-object v13, v10, v5

    aput-object v15, v10, v1

    .line 9
    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    sput-object v10, Lax/y0/a;->z:Ljava/util/List;

    .line 10
    filled-new-array {v6, v6, v6}, [I

    move-result-object v10

    sput-object v10, Lax/y0/a;->A:[I

    .line 11
    filled-new-array {v8}, [I

    move-result-object v10

    sput-object v10, Lax/y0/a;->B:[I

    .line 12
    filled-new-array {v6}, [I

    move-result-object v10

    sput-object v10, Lax/y0/a;->C:[I

    .line 13
    new-array v10, v1, [B

    fill-array-data v10, :array_ec0

    sput-object v10, Lax/y0/a;->D:[B

    .line 14
    new-array v10, v8, [B

    fill-array-data v10, :array_ec6

    sput-object v10, Lax/y0/a;->E:[B

    .line 15
    new-array v10, v8, [B

    fill-array-data v10, :array_ecc

    sput-object v10, Lax/y0/a;->F:[B

    .line 16
    new-array v10, v8, [B

    fill-array-data v10, :array_ed2

    sput-object v10, Lax/y0/a;->G:[B

    .line 17
    new-array v10, v8, [B

    fill-array-data v10, :array_ed8

    sput-object v10, Lax/y0/a;->H:[B

    .line 18
    new-array v10, v8, [B

    fill-array-data v10, :array_ede

    sput-object v10, Lax/y0/a;->I:[B

    .line 19
    new-array v10, v4, [B

    fill-array-data v10, :array_ee4

    sput-object v10, Lax/y0/a;->J:[B

    const/16 v13, 0xa

    const/16 v17, 0x49

    .line 20
    new-array v10, v13, [B

    fill-array-data v10, :array_eec

    sput-object v10, Lax/y0/a;->K:[B

    const/16 v18, 0x1a

    const/16 v19, 0xd

    .line 21
    new-array v10, v6, [B

    fill-array-data v10, :array_ef6

    sput-object v10, Lax/y0/a;->L:[B

    .line 22
    const-string v10, "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000"

    const/16 v20, 0xa

    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    sput-object v10, Lax/y0/a;->M:[B

    .line 23
    new-array v10, v8, [B

    fill-array-data v10, :array_efe

    sput-object v10, Lax/y0/a;->N:[B

    .line 24
    new-array v10, v8, [B

    fill-array-data v10, :array_f04

    sput-object v10, Lax/y0/a;->O:[B

    .line 25
    new-array v10, v8, [B

    fill-array-data v10, :array_f0a

    sput-object v10, Lax/y0/a;->P:[B

    .line 26
    new-array v10, v1, [B

    fill-array-data v10, :array_f10

    sput-object v10, Lax/y0/a;->Q:[B

    .line 27
    const-string v10, "VP8X"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    sput-object v10, Lax/y0/a;->R:[B

    .line 28
    const-string v10, "VP8L"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    sput-object v10, Lax/y0/a;->S:[B

    .line 29
    const-string v10, "VP8 "

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    sput-object v10, Lax/y0/a;->T:[B

    .line 30
    const-string v10, "ANIM"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    sput-object v10, Lax/y0/a;->U:[B

    .line 31
    const-string v10, "ANMF"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    sput-object v10, Lax/y0/a;->V:[B

    .line 32
    const-string v33, "DOUBLE"

    const-string v34, "IFD"

    const-string v21, ""

    const-string v22, "BYTE"

    const-string v23, "STRING"

    const-string v24, "USHORT"

    const-string v25, "ULONG"

    const-string v26, "URATIONAL"

    const-string v27, "SBYTE"

    const-string v28, "UNDEFINED"

    const-string v29, "SSHORT"

    const-string v30, "SLONG"

    const-string v31, "SRATIONAL"

    const-string v32, "SINGLE"

    filled-new-array/range {v21 .. v34}, [Ljava/lang/String;

    move-result-object v10

    sput-object v10, Lax/y0/a;->Y:[Ljava/lang/String;

    const/16 v10, 0xe

    .line 33
    new-array v13, v10, [I

    fill-array-data v13, :array_f16

    sput-object v13, Lax/y0/a;->Z:[I

    .line 34
    new-array v13, v6, [B

    fill-array-data v13, :array_f36

    sput-object v13, Lax/y0/a;->a0:[B

    .line 35
    new-instance v13, Lax/y0/a$e;

    const/16 v21, 0xe

    const-string v10, "NewSubfileType"

    const/16 v22, 0x8

    const/16 v6, 0xfe

    invoke-direct {v13, v10, v6, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v6, Lax/y0/a$e;

    const-string v10, "SubfileType"

    const/16 v0, 0xff

    invoke-direct {v6, v10, v0, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v10, "ImageWidth"

    const/16 v11, 0x100

    invoke-direct {v0, v10, v11, v1, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v10, Lax/y0/a$e;

    const-string v11, "ImageLength"

    const/16 v4, 0x101

    invoke-direct {v10, v11, v4, v1, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v11, Lax/y0/a$e;

    const-string v4, "BitsPerSample"

    const/16 v14, 0x102

    invoke-direct {v11, v4, v14, v1}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v4, Lax/y0/a$e;

    const-string v14, "Compression"

    const/16 v8, 0x103

    invoke-direct {v4, v14, v8, v1}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "PhotometricInterpretation"

    const/16 v5, 0x106

    invoke-direct {v8, v14, v5, v1}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "ImageDescription"

    const/16 v1, 0x10e

    move-object/from16 v33, v0

    const/4 v0, 0x2

    invoke-direct {v5, v14, v1, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v1, Lax/y0/a$e;

    const-string v14, "Make"

    move-object/from16 v34, v4

    const/16 v4, 0x10f

    invoke-direct {v1, v14, v4, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v4, Lax/y0/a$e;

    const-string v14, "Model"

    move-object/from16 v35, v1

    const/16 v1, 0x110

    invoke-direct {v4, v14, v1, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v1, "StripOffsets"

    const/16 v14, 0x111

    move-object/from16 v36, v4

    move-object/from16 v37, v5

    const/4 v4, 0x3

    const/4 v5, 0x4

    invoke-direct {v0, v1, v14, v4, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "Orientation"

    move-object/from16 v38, v0

    const/16 v0, 0x112

    invoke-direct {v5, v14, v0, v4}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "SamplesPerPixel"

    move-object/from16 v39, v5

    const/16 v5, 0x115

    invoke-direct {v0, v14, v5, v4}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "RowsPerStrip"

    move-object/from16 v40, v0

    const/16 v0, 0x116

    move-object/from16 v41, v6

    const/4 v6, 0x4

    invoke-direct {v5, v14, v0, v4, v6}, Lax/y0/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "StripByteCounts"

    move-object/from16 v42, v5

    const/16 v5, 0x117

    invoke-direct {v0, v14, v5, v4, v6}, Lax/y0/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v4, Lax/y0/a$e;

    const-string v5, "XResolution"

    const/16 v6, 0x11a

    const/4 v14, 0x5

    invoke-direct {v4, v5, v6, v14}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v6, "YResolution"

    move-object/from16 v43, v0

    const/16 v0, 0x11b

    invoke-direct {v5, v6, v0, v14}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v6, "PlanarConfiguration"

    const/16 v14, 0x11c

    move-object/from16 v44, v4

    const/4 v4, 0x3

    invoke-direct {v0, v6, v14, v4}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v6, Lax/y0/a$e;

    const-string v14, "ResolutionUnit"

    move-object/from16 v45, v0

    const/16 v0, 0x128

    invoke-direct {v6, v14, v0, v4}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "TransferFunction"

    move-object/from16 v46, v5

    const/16 v5, 0x12d

    invoke-direct {v0, v14, v5, v4}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v4, Lax/y0/a$e;

    const-string v5, "Software"

    const/16 v14, 0x131

    move-object/from16 v47, v0

    const/4 v0, 0x2

    invoke-direct {v4, v5, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "DateTime"

    move-object/from16 v48, v4

    const/16 v4, 0x132

    invoke-direct {v5, v14, v4, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v4, Lax/y0/a$e;

    const-string v14, "Artist"

    move-object/from16 v49, v5

    const/16 v5, 0x13b

    invoke-direct {v4, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v5, "WhitePoint"

    const/16 v14, 0x13e

    move-object/from16 v50, v4

    const/4 v4, 0x5

    invoke-direct {v0, v5, v14, v4}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "PrimaryChromaticities"

    move-object/from16 v51, v0

    const/16 v0, 0x13f

    invoke-direct {v5, v14, v0, v4}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v4, "SubIFDPointer"

    const/16 v14, 0x14a

    move-object/from16 v52, v5

    const/4 v5, 0x4

    invoke-direct {v0, v4, v14, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v14, Lax/y0/a$e;

    move-object/from16 v53, v0

    const-string v0, "JPEGInterchangeFormat"

    move-object/from16 v54, v6

    const/16 v6, 0x201

    invoke-direct {v14, v0, v6, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v6, "JPEGInterchangeFormatLength"

    move-object/from16 v55, v8

    const/16 v8, 0x202

    invoke-direct {v0, v6, v8, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v6, "YCbCrCoefficients"

    const/16 v8, 0x211

    move-object/from16 v56, v0

    const/4 v0, 0x5

    invoke-direct {v5, v6, v8, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v6, "YCbCrSubSampling"

    const/16 v8, 0x212

    move-object/from16 v57, v5

    const/4 v5, 0x3

    invoke-direct {v0, v6, v8, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v6, Lax/y0/a$e;

    const-string v8, "YCbCrPositioning"

    move-object/from16 v58, v0

    const/16 v0, 0x213

    invoke-direct {v6, v8, v0, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v5, "ReferenceBlackWhite"

    const/16 v8, 0x214

    move-object/from16 v59, v6

    const/4 v6, 0x5

    invoke-direct {v0, v5, v8, v6}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v6, "Copyright"

    const v8, 0x8298

    move-object/from16 v60, v0

    const/4 v0, 0x2

    invoke-direct {v5, v6, v8, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v6, "ExifIFDPointer"

    const v8, 0x8769

    move-object/from16 v61, v5

    const/4 v5, 0x4

    invoke-direct {v0, v6, v8, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    move-object/from16 v62, v0

    const-string v0, "GPSInfoIFDPointer"

    move-object/from16 v63, v10

    const v10, 0x8825

    invoke-direct {v8, v0, v10, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v10, "SensorTopBorder"

    invoke-direct {v0, v10, v5, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v10, Lax/y0/a$e;

    move-object/from16 v64, v0

    const-string v0, "SensorLeftBorder"

    move-object/from16 v65, v8

    const/4 v8, 0x5

    invoke-direct {v10, v0, v8, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v8, "SensorBottomBorder"

    move-object/from16 v66, v10

    const/4 v10, 0x6

    invoke-direct {v0, v8, v10, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v10, "SensorRightBorder"

    move-object/from16 v67, v0

    const/4 v0, 0x7

    invoke-direct {v8, v10, v0, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v10, "ISO"

    const/16 v0, 0x17

    move-object/from16 v68, v8

    const/4 v8, 0x3

    invoke-direct {v5, v10, v0, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v10, "JpgFromRaw"

    const/16 v69, 0x17

    const/16 v0, 0x2e

    move-object/from16 v70, v5

    const/4 v5, 0x7

    invoke-direct {v8, v10, v0, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v5, "Xmp"

    const/16 v10, 0x2bc

    move-object/from16 v71, v8

    const/4 v8, 0x1

    invoke-direct {v0, v5, v10, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    const/16 v5, 0x2a

    new-array v5, v5, [Lax/y0/a$e;

    aput-object v13, v5, v16

    aput-object v41, v5, v8

    const/16 v31, 0x2

    aput-object v33, v5, v31

    const/16 v32, 0x3

    aput-object v63, v5, v32

    const/16 v30, 0x4

    aput-object v11, v5, v30

    const/16 v28, 0x5

    aput-object v34, v5, v28

    const/16 v26, 0x6

    aput-object v55, v5, v26

    const/16 v24, 0x7

    aput-object v37, v5, v24

    aput-object v35, v5, v22

    const/16 v8, 0x9

    aput-object v36, v5, v8

    aput-object v38, v5, v20

    const/16 v10, 0xb

    aput-object v39, v5, v10

    const/16 v11, 0xc

    aput-object v40, v5, v11

    aput-object v42, v5, v19

    aput-object v43, v5, v21

    const/16 v13, 0xf

    aput-object v44, v5, v13

    const/16 v33, 0xf

    const/16 v13, 0x10

    aput-object v46, v5, v13

    const/16 v34, 0x10

    const/16 v13, 0x11

    aput-object v45, v5, v13

    const/16 v35, 0x11

    const/16 v13, 0x12

    aput-object v54, v5, v13

    const/16 v36, 0x13

    aput-object v47, v5, v36

    const/16 v36, 0x14

    aput-object v48, v5, v36

    const/16 v36, 0x15

    aput-object v49, v5, v36

    const/16 v36, 0x16

    aput-object v50, v5, v36

    aput-object v51, v5, v69

    const/16 v36, 0x18

    aput-object v52, v5, v36

    const/16 v36, 0x19

    aput-object v53, v5, v36

    aput-object v14, v5, v18

    const/16 v14, 0x1b

    aput-object v56, v5, v14

    const/16 v14, 0x1c

    aput-object v57, v5, v14

    const/16 v14, 0x1d

    aput-object v58, v5, v14

    const/16 v14, 0x1e

    aput-object v59, v5, v14

    const/16 v14, 0x1f

    aput-object v60, v5, v14

    const/16 v14, 0x20

    aput-object v61, v5, v14

    const/16 v14, 0x21

    aput-object v62, v5, v14

    const/16 v14, 0x22

    aput-object v65, v5, v14

    const/16 v14, 0x23

    aput-object v64, v5, v14

    const/16 v14, 0x24

    aput-object v66, v5, v14

    const/16 v14, 0x25

    aput-object v67, v5, v14

    const/16 v14, 0x26

    aput-object v68, v5, v14

    const/16 v14, 0x27

    aput-object v70, v5, v14

    const/16 v14, 0x28

    aput-object v71, v5, v14

    const/16 v14, 0x29

    aput-object v0, v5, v14

    sput-object v5, Lax/y0/a;->b0:[Lax/y0/a$e;

    .line 36
    new-instance v0, Lax/y0/a$e;

    const-string v14, "ExposureTime"

    const/16 v36, 0x12

    const v13, 0x829a

    const/4 v11, 0x5

    const/16 v37, 0xc

    invoke-direct {v0, v14, v13, v11}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v13, Lax/y0/a$e;

    const-string v14, "FNumber"

    const/16 v38, 0xb

    const v10, 0x829d

    invoke-direct {v13, v14, v10, v11}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v10, Lax/y0/a$e;

    const-string v11, "ExposureProgram"

    const v14, 0x8822

    const/4 v8, 0x3

    const/16 v39, 0x9

    invoke-direct {v10, v11, v14, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lax/y0/a$e;

    const-string v14, "SpectralSensitivity"

    const v8, 0x8824

    move-object/from16 v40, v0

    const/4 v0, 0x2

    invoke-direct {v11, v14, v8, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v8, "PhotographicSensitivity"

    const v14, 0x8827

    move-object/from16 v41, v5

    const/4 v5, 0x3

    invoke-direct {v0, v8, v14, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "OECF"

    const v5, 0x8828

    move-object/from16 v42, v0

    const/4 v0, 0x7

    invoke-direct {v8, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v5, "SensitivityType"

    const v14, 0x8830

    move-object/from16 v43, v8

    const/4 v8, 0x3

    invoke-direct {v0, v5, v14, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v8, "StandardOutputSensitivity"

    const v14, 0x8831

    move-object/from16 v44, v0

    const/4 v0, 0x4

    invoke-direct {v5, v8, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "RecommendedExposureIndex"

    move-object/from16 v45, v5

    const v5, 0x8832

    invoke-direct {v8, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "ISOSpeed"

    move-object/from16 v46, v8

    const v8, 0x8833

    invoke-direct {v5, v14, v8, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "ISOSpeedLatitudeyyy"

    move-object/from16 v47, v5

    const v5, 0x8834

    invoke-direct {v8, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "ISOSpeedLatitudezzz"

    move-object/from16 v48, v8

    const v8, 0x8835

    invoke-direct {v5, v14, v8, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v8, "ExifVersion"

    const v14, 0x9000

    move-object/from16 v49, v5

    const/4 v5, 0x2

    invoke-direct {v0, v8, v14, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "DateTimeOriginal"

    move-object/from16 v50, v0

    const v0, 0x9003

    invoke-direct {v8, v14, v0, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "DateTimeDigitized"

    move-object/from16 v51, v8

    const v8, 0x9004

    invoke-direct {v0, v14, v8, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "OffsetTime"

    move-object/from16 v52, v0

    const v0, 0x9010

    invoke-direct {v8, v14, v0, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "OffsetTimeOriginal"

    move-object/from16 v53, v8

    const v8, 0x9011

    invoke-direct {v0, v14, v8, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "OffsetTimeDigitized"

    move-object/from16 v54, v0

    const v0, 0x9012

    invoke-direct {v8, v14, v0, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v5, "ComponentsConfiguration"

    const v14, 0x9101

    move-object/from16 v55, v8

    const/4 v8, 0x7

    invoke-direct {v0, v5, v14, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v8, "CompressedBitsPerPixel"

    const v14, 0x9102

    move-object/from16 v56, v0

    const/4 v0, 0x5

    invoke-direct {v5, v8, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "ShutterSpeedValue"

    const v0, 0x9201

    move-object/from16 v57, v5

    const/16 v5, 0xa

    invoke-direct {v8, v14, v0, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "ApertureValue"

    const v5, 0x9202

    move-object/from16 v58, v8

    const/4 v8, 0x5

    invoke-direct {v0, v14, v5, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v8, "BrightnessValue"

    const v14, 0x9203

    move-object/from16 v59, v0

    const/16 v0, 0xa

    invoke-direct {v5, v8, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "ExposureBiasValue"

    move-object/from16 v60, v5

    const v5, 0x9204

    invoke-direct {v8, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v5, "MaxApertureValue"

    const v14, 0x9205

    move-object/from16 v61, v8

    const/4 v8, 0x5

    invoke-direct {v0, v5, v14, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "SubjectDistance"

    move-object/from16 v62, v0

    const v0, 0x9206

    invoke-direct {v5, v14, v0, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v8, "MeteringMode"

    const v14, 0x9207

    move-object/from16 v63, v5

    const/4 v5, 0x3

    invoke-direct {v0, v8, v14, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "LightSource"

    move-object/from16 v64, v0

    const v0, 0x9208

    invoke-direct {v8, v14, v0, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "Flash"

    move-object/from16 v65, v8

    const v8, 0x9209

    invoke-direct {v0, v14, v8, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "FocalLength"

    const v5, 0x920a

    move-object/from16 v66, v0

    const/4 v0, 0x5

    invoke-direct {v8, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v5, "SubjectArea"

    const v14, 0x9214

    move-object/from16 v67, v8

    const/4 v8, 0x3

    invoke-direct {v0, v5, v14, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v8, "MakerNote"

    const v14, 0x927c

    move-object/from16 v68, v0

    const/4 v0, 0x7

    invoke-direct {v5, v8, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "UserComment"

    move-object/from16 v70, v5

    const v5, 0x9286

    invoke-direct {v8, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v5, "SubSecTime"

    const v14, 0x9290

    move-object/from16 v71, v8

    const/4 v8, 0x2

    invoke-direct {v0, v5, v14, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "SubSecTimeOriginal"

    move-object/from16 v72, v0

    const v0, 0x9291

    invoke-direct {v5, v14, v0, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "SubSecTimeDigitized"

    move-object/from16 v73, v5

    const v5, 0x9292

    invoke-direct {v0, v14, v5, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v8, "FlashpixVersion"

    const v14, 0xa000

    move-object/from16 v74, v0

    const/4 v0, 0x7

    invoke-direct {v5, v8, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v8, "ColorSpace"

    const v14, 0xa001

    move-object/from16 v75, v5

    const/4 v5, 0x3

    invoke-direct {v0, v8, v14, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "PixelXDimension"

    move-object/from16 v76, v0

    const v0, 0xa002

    move-object/from16 v77, v10

    const/4 v10, 0x4

    invoke-direct {v8, v14, v0, v5, v10}, Lax/y0/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "PixelYDimension"

    move-object/from16 v78, v8

    const v8, 0xa003

    invoke-direct {v0, v14, v8, v5, v10}, Lax/y0/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v5, Lax/y0/a$e;

    const-string v8, "RelatedSoundFile"

    const v14, 0xa004

    const/4 v10, 0x2

    invoke-direct {v5, v8, v14, v10}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v10, "InteroperabilityIFDPointer"

    const v14, 0xa005

    move-object/from16 v79, v0

    const/4 v0, 0x4

    invoke-direct {v8, v10, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v10, "FlashEnergy"

    const v14, 0xa20b

    move-object/from16 v80, v5

    const/4 v5, 0x5

    invoke-direct {v0, v10, v14, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v10, Lax/y0/a$e;

    const-string v14, "SpatialFrequencyResponse"

    const v5, 0xa20c

    move-object/from16 v81, v0

    const/4 v0, 0x7

    invoke-direct {v10, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v5, "FocalPlaneXResolution"

    const v14, 0xa20e

    move-object/from16 v82, v8

    const/4 v8, 0x5

    invoke-direct {v0, v5, v14, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "FocalPlaneYResolution"

    move-object/from16 v83, v0

    const v0, 0xa20f

    invoke-direct {v5, v14, v0, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v8, "FocalPlaneResolutionUnit"

    const v14, 0xa210

    move-object/from16 v84, v5

    const/4 v5, 0x3

    invoke-direct {v0, v8, v14, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "SubjectLocation"

    move-object/from16 v85, v0

    const v0, 0xa214

    invoke-direct {v8, v14, v0, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "ExposureIndex"

    const v5, 0xa215

    move-object/from16 v86, v8

    const/4 v8, 0x5

    invoke-direct {v0, v14, v5, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v8, "SensingMethod"

    const v14, 0xa217

    move-object/from16 v87, v0

    const/4 v0, 0x3

    invoke-direct {v5, v8, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v8, "FileSource"

    const v14, 0xa300

    move-object/from16 v88, v5

    const/4 v5, 0x7

    invoke-direct {v0, v8, v14, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "SceneType"

    move-object/from16 v89, v0

    const v0, 0xa301

    invoke-direct {v8, v14, v0, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "CFAPattern"

    move-object/from16 v90, v8

    const v8, 0xa302

    invoke-direct {v0, v14, v8, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v8, "CustomRendered"

    const v14, 0xa401

    move-object/from16 v91, v0

    const/4 v0, 0x3

    invoke-direct {v5, v8, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "ExposureMode"

    move-object/from16 v92, v5

    const v5, 0xa402

    invoke-direct {v8, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "WhiteBalance"

    move-object/from16 v93, v8

    const v8, 0xa403

    invoke-direct {v5, v14, v8, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "DigitalZoomRatio"

    const v0, 0xa404

    move-object/from16 v94, v5

    const/4 v5, 0x5

    invoke-direct {v8, v14, v0, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v5, "FocalLengthIn35mmFilm"

    const v14, 0xa405

    move-object/from16 v95, v8

    const/4 v8, 0x3

    invoke-direct {v0, v5, v14, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "SceneCaptureType"

    move-object/from16 v96, v0

    const v0, 0xa406

    invoke-direct {v5, v14, v0, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "GainControl"

    move-object/from16 v97, v5

    const v5, 0xa407

    invoke-direct {v0, v14, v5, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "Contrast"

    move-object/from16 v98, v0

    const v0, 0xa408

    invoke-direct {v5, v14, v0, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "Saturation"

    move-object/from16 v99, v5

    const v5, 0xa409

    invoke-direct {v0, v14, v5, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "Sharpness"

    move-object/from16 v100, v0

    const v0, 0xa40a

    invoke-direct {v5, v14, v0, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "DeviceSettingDescription"

    const v8, 0xa40b

    move-object/from16 v101, v5

    const/4 v5, 0x7

    invoke-direct {v0, v14, v8, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v8, "SubjectDistanceRange"

    const v14, 0xa40c

    move-object/from16 v102, v0

    const/4 v0, 0x3

    invoke-direct {v5, v8, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v8, "ImageUniqueID"

    const v14, 0xa420

    move-object/from16 v103, v5

    const/4 v5, 0x2

    invoke-direct {v0, v8, v14, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "CameraOwnerName"

    move-object/from16 v104, v0

    const v0, 0xa430

    invoke-direct {v8, v14, v0, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "BodySerialNumber"

    move-object/from16 v105, v8

    const v8, 0xa431

    invoke-direct {v0, v14, v8, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "LensSpecification"

    const v5, 0xa432

    move-object/from16 v106, v0

    const/4 v0, 0x5

    invoke-direct {v8, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v5, "LensMake"

    const v14, 0xa433

    move-object/from16 v107, v8

    const/4 v8, 0x2

    invoke-direct {v0, v5, v14, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "LensModel"

    move-object/from16 v108, v0

    const v0, 0xa434

    invoke-direct {v5, v14, v0, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v8, "Gamma"

    const v14, 0xa500

    move-object/from16 v109, v5

    const/4 v5, 0x5

    invoke-direct {v0, v8, v14, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v8, "DNGVersion"

    const v14, 0xc612

    move-object/from16 v110, v0

    const/4 v0, 0x1

    invoke-direct {v5, v8, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "DefaultCropSize"

    const/16 v23, 0x1

    const v0, 0xc620

    move-object/from16 v111, v5

    move-object/from16 v112, v10

    const/4 v5, 0x3

    const/4 v10, 0x4

    invoke-direct {v8, v14, v0, v5, v10}, Lax/y0/a$e;-><init>(Ljava/lang/String;III)V

    const/16 v0, 0x4a

    new-array v0, v0, [Lax/y0/a$e;

    aput-object v40, v0, v16

    aput-object v13, v0, v23

    const/16 v31, 0x2

    aput-object v77, v0, v31

    aput-object v11, v0, v5

    aput-object v42, v0, v10

    const/16 v28, 0x5

    aput-object v43, v0, v28

    const/16 v26, 0x6

    aput-object v44, v0, v26

    const/16 v24, 0x7

    aput-object v45, v0, v24

    aput-object v46, v0, v22

    aput-object v47, v0, v39

    const/16 v20, 0xa

    aput-object v48, v0, v20

    aput-object v49, v0, v38

    aput-object v50, v0, v37

    aput-object v51, v0, v19

    aput-object v52, v0, v21

    aput-object v53, v0, v33

    aput-object v54, v0, v34

    aput-object v55, v0, v35

    aput-object v56, v0, v36

    const/16 v5, 0x13

    aput-object v57, v0, v5

    const/16 v5, 0x14

    aput-object v58, v0, v5

    const/16 v5, 0x15

    aput-object v59, v0, v5

    const/16 v5, 0x16

    aput-object v60, v0, v5

    aput-object v61, v0, v69

    const/16 v5, 0x18

    aput-object v62, v0, v5

    const/16 v5, 0x19

    aput-object v63, v0, v5

    aput-object v64, v0, v18

    const/16 v5, 0x1b

    aput-object v65, v0, v5

    const/16 v5, 0x1c

    aput-object v66, v0, v5

    const/16 v5, 0x1d

    aput-object v67, v0, v5

    const/16 v5, 0x1e

    aput-object v68, v0, v5

    const/16 v5, 0x1f

    aput-object v70, v0, v5

    const/16 v5, 0x20

    aput-object v71, v0, v5

    const/16 v5, 0x21

    aput-object v72, v0, v5

    const/16 v5, 0x22

    aput-object v73, v0, v5

    const/16 v5, 0x23

    aput-object v74, v0, v5

    const/16 v5, 0x24

    aput-object v75, v0, v5

    const/16 v5, 0x25

    aput-object v76, v0, v5

    const/16 v5, 0x26

    aput-object v78, v0, v5

    const/16 v5, 0x27

    aput-object v79, v0, v5

    const/16 v5, 0x28

    aput-object v80, v0, v5

    const/16 v5, 0x29

    aput-object v82, v0, v5

    const/16 v5, 0x2a

    aput-object v81, v0, v5

    const/16 v5, 0x2b

    aput-object v112, v0, v5

    const/16 v5, 0x2c

    aput-object v83, v0, v5

    const/16 v5, 0x2d

    aput-object v84, v0, v5

    const/16 v5, 0x2e

    aput-object v85, v0, v5

    const/16 v5, 0x2f

    aput-object v86, v0, v5

    const/16 v5, 0x30

    aput-object v87, v0, v5

    const/16 v5, 0x31

    aput-object v88, v0, v5

    const/16 v5, 0x32

    aput-object v89, v0, v5

    const/16 v5, 0x33

    aput-object v90, v0, v5

    const/16 v5, 0x34

    aput-object v91, v0, v5

    const/16 v5, 0x35

    aput-object v92, v0, v5

    const/16 v5, 0x36

    aput-object v93, v0, v5

    const/16 v5, 0x37

    aput-object v94, v0, v5

    const/16 v5, 0x38

    aput-object v95, v0, v5

    const/16 v5, 0x39

    aput-object v96, v0, v5

    const/16 v5, 0x3a

    aput-object v97, v0, v5

    const/16 v5, 0x3b

    aput-object v98, v0, v5

    const/16 v5, 0x3c

    aput-object v99, v0, v5

    const/16 v5, 0x3d

    aput-object v100, v0, v5

    const/16 v5, 0x3e

    aput-object v101, v0, v5

    const/16 v5, 0x3f

    aput-object v102, v0, v5

    const/16 v5, 0x40

    aput-object v103, v0, v5

    const/16 v5, 0x41

    aput-object v104, v0, v5

    const/16 v5, 0x42

    aput-object v105, v0, v5

    const/16 v5, 0x43

    aput-object v106, v0, v5

    const/16 v5, 0x44

    aput-object v107, v0, v5

    const/16 v5, 0x45

    aput-object v108, v0, v5

    const/16 v5, 0x46

    aput-object v109, v0, v5

    const/16 v5, 0x47

    aput-object v110, v0, v5

    const/16 v5, 0x48

    aput-object v111, v0, v5

    aput-object v8, v0, v17

    sput-object v0, Lax/y0/a;->c0:[Lax/y0/a$e;

    .line 37
    new-instance v5, Lax/y0/a$e;

    const-string v8, "GPSVersionID"

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-direct {v5, v8, v11, v10}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v11, "GPSLatitudeRef"

    const/4 v13, 0x2

    invoke-direct {v8, v11, v10, v13}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v10, Lax/y0/a$e;

    const-string v11, "GPSLatitude"

    move-object/from16 v17, v0

    const/4 v14, 0x5

    const/16 v0, 0xa

    invoke-direct {v10, v11, v13, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v11, Lax/y0/a$e;

    const-string v0, "GPSLongitudeRef"

    const/4 v14, 0x3

    invoke-direct {v11, v0, v14, v13}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v13, "GPSLongitude"

    move-object/from16 v40, v5

    move-object/from16 v42, v8

    const/4 v5, 0x4

    const/16 v8, 0xa

    const/4 v14, 0x5

    invoke-direct {v0, v13, v5, v14, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v5, Lax/y0/a$e;

    const-string v8, "GPSAltitudeRef"

    const/4 v13, 0x1

    invoke-direct {v5, v8, v14, v13}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v13, "GPSAltitude"

    move-object/from16 v43, v0

    const/4 v0, 0x6

    invoke-direct {v8, v13, v0, v14}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v13, "GPSTimeStamp"

    move-object/from16 v44, v5

    const/4 v5, 0x7

    invoke-direct {v0, v13, v5, v14}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v13, "GPSSatellites"

    move-object/from16 v45, v0

    const/4 v0, 0x2

    const/16 v14, 0x8

    invoke-direct {v5, v13, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v13, Lax/y0/a$e;

    const-string v14, "GPSStatus"

    move-object/from16 v46, v5

    const/16 v5, 0x9

    invoke-direct {v13, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "GPSMeasureMode"

    move-object/from16 v47, v8

    const/16 v8, 0xa

    invoke-direct {v5, v14, v8, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "GPSDOP"

    move-object/from16 v48, v5

    const/4 v0, 0x5

    const/16 v5, 0xb

    invoke-direct {v8, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "GPSSpeedRef"

    move-object/from16 v49, v8

    const/4 v0, 0x2

    const/16 v8, 0xc

    invoke-direct {v5, v14, v8, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "GPSSpeed"

    move-object/from16 v50, v5

    const/4 v0, 0x5

    const/16 v5, 0xd

    invoke-direct {v8, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "GPSTrackRef"

    move-object/from16 v51, v8

    const/4 v0, 0x2

    const/16 v8, 0xe

    invoke-direct {v5, v14, v8, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "GPSTrack"

    move-object/from16 v52, v5

    const/4 v0, 0x5

    const/16 v5, 0xf

    invoke-direct {v8, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "GPSImgDirectionRef"

    move-object/from16 v53, v8

    const/4 v0, 0x2

    const/16 v8, 0x10

    invoke-direct {v5, v14, v8, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "GPSImgDirection"

    move-object/from16 v54, v5

    const/4 v0, 0x5

    const/16 v5, 0x11

    invoke-direct {v8, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "GPSMapDatum"

    move-object/from16 v55, v8

    const/4 v0, 0x2

    const/16 v8, 0x12

    invoke-direct {v5, v14, v8, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "GPSDestLatitudeRef"

    move-object/from16 v56, v5

    const/16 v5, 0x13

    invoke-direct {v8, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "GPSDestLatitude"

    const/16 v0, 0x14

    move-object/from16 v57, v8

    const/4 v8, 0x5

    invoke-direct {v5, v14, v0, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "GPSDestLongitudeRef"

    const/16 v8, 0x15

    move-object/from16 v58, v5

    const/4 v5, 0x2

    invoke-direct {v0, v14, v8, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "GPSDestLongitude"

    const/16 v5, 0x16

    move-object/from16 v59, v0

    const/4 v0, 0x5

    invoke-direct {v8, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "GPSDestBearingRef"

    move-object/from16 v60, v8

    const/16 v0, 0x17

    const/4 v8, 0x2

    invoke-direct {v5, v14, v0, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "GPSDestBearing"

    const/16 v8, 0x18

    move-object/from16 v61, v5

    const/4 v5, 0x5

    invoke-direct {v0, v14, v8, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "GPSDestDistanceRef"

    const/16 v5, 0x19

    move-object/from16 v62, v0

    const/4 v0, 0x2

    invoke-direct {v8, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v5, "GPSDestDistance"

    move-object/from16 v63, v8

    const/16 v8, 0x1a

    const/4 v14, 0x5

    invoke-direct {v0, v5, v8, v14}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v8, "GPSProcessingMethod"

    const/16 v14, 0x1b

    move-object/from16 v64, v0

    const/4 v0, 0x7

    invoke-direct {v5, v8, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "GPSAreaInformation"

    move-object/from16 v65, v5

    const/16 v5, 0x1c

    invoke-direct {v8, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v5, "GPSDateStamp"

    const/16 v14, 0x1d

    move-object/from16 v66, v8

    const/4 v8, 0x2

    invoke-direct {v0, v5, v14, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v8, "GPSDifferential"

    const/16 v14, 0x1e

    move-object/from16 v67, v0

    const/4 v0, 0x3

    invoke-direct {v5, v8, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "GPSHPositioningError"

    const/16 v32, 0x3

    const/16 v0, 0x1f

    move-object/from16 v68, v5

    const/4 v5, 0x5

    invoke-direct {v8, v14, v0, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    const/16 v0, 0x20

    new-array v0, v0, [Lax/y0/a$e;

    const/16 v16, 0x0

    aput-object v40, v0, v16

    const/16 v23, 0x1

    aput-object v42, v0, v23

    const/16 v31, 0x2

    aput-object v10, v0, v31

    aput-object v11, v0, v32

    const/16 v30, 0x4

    aput-object v43, v0, v30

    aput-object v44, v0, v5

    const/16 v26, 0x6

    aput-object v47, v0, v26

    const/16 v24, 0x7

    aput-object v45, v0, v24

    const/16 v22, 0x8

    aput-object v46, v0, v22

    const/16 v39, 0x9

    aput-object v13, v0, v39

    const/16 v20, 0xa

    aput-object v48, v0, v20

    const/16 v38, 0xb

    aput-object v49, v0, v38

    const/16 v37, 0xc

    aput-object v50, v0, v37

    const/16 v19, 0xd

    aput-object v51, v0, v19

    const/16 v21, 0xe

    aput-object v52, v0, v21

    const/16 v33, 0xf

    aput-object v53, v0, v33

    const/16 v34, 0x10

    aput-object v54, v0, v34

    const/16 v35, 0x11

    aput-object v55, v0, v35

    const/16 v36, 0x12

    aput-object v56, v0, v36

    const/16 v5, 0x13

    aput-object v57, v0, v5

    const/16 v5, 0x14

    aput-object v58, v0, v5

    const/16 v5, 0x15

    aput-object v59, v0, v5

    const/16 v5, 0x16

    aput-object v60, v0, v5

    const/16 v69, 0x17

    aput-object v61, v0, v69

    const/16 v5, 0x18

    aput-object v62, v0, v5

    const/16 v5, 0x19

    aput-object v63, v0, v5

    const/16 v18, 0x1a

    aput-object v64, v0, v18

    const/16 v5, 0x1b

    aput-object v65, v0, v5

    const/16 v5, 0x1c

    aput-object v66, v0, v5

    const/16 v5, 0x1d

    aput-object v67, v0, v5

    const/16 v5, 0x1e

    aput-object v68, v0, v5

    const/16 v5, 0x1f

    aput-object v8, v0, v5

    sput-object v0, Lax/y0/a;->d0:[Lax/y0/a$e;

    .line 38
    new-instance v5, Lax/y0/a$e;

    const-string v8, "InteroperabilityIndex"

    const/4 v10, 0x1

    const/4 v13, 0x2

    invoke-direct {v5, v8, v10, v13}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-array v8, v10, [Lax/y0/a$e;

    const/16 v16, 0x0

    aput-object v5, v8, v16

    sput-object v8, Lax/y0/a;->e0:[Lax/y0/a$e;

    .line 39
    new-instance v5, Lax/y0/a$e;

    const-string v10, "NewSubfileType"

    const/16 v11, 0xfe

    const/4 v13, 0x4

    invoke-direct {v5, v10, v11, v13}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v10, Lax/y0/a$e;

    const-string v11, "SubfileType"

    const/16 v14, 0xff

    invoke-direct {v10, v11, v14, v13}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lax/y0/a$e;

    const-string v14, "ThumbnailImageWidth"

    move-object/from16 v40, v0

    move-object/from16 v42, v5

    const/4 v0, 0x3

    const/16 v5, 0x100

    invoke-direct {v11, v14, v5, v0, v13}, Lax/y0/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "ThumbnailImageLength"

    move-object/from16 v43, v8

    const/16 v8, 0x101

    invoke-direct {v5, v14, v8, v0, v13}, Lax/y0/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v8, Lax/y0/a$e;

    const-string v13, "BitsPerSample"

    const/16 v14, 0x102

    invoke-direct {v8, v13, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v13, Lax/y0/a$e;

    const-string v14, "Compression"

    move-object/from16 v44, v5

    const/16 v5, 0x103

    invoke-direct {v13, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "PhotometricInterpretation"

    move-object/from16 v45, v8

    const/16 v8, 0x106

    invoke-direct {v5, v14, v8, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v8, "ImageDescription"

    const/16 v14, 0x10e

    move-object/from16 v46, v5

    const/4 v5, 0x2

    invoke-direct {v0, v8, v14, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "Make"

    move-object/from16 v47, v0

    const/16 v0, 0x10f

    invoke-direct {v8, v14, v0, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "Model"

    move-object/from16 v48, v8

    const/16 v8, 0x110

    invoke-direct {v0, v14, v8, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    move-object/from16 v49, v0

    const/4 v0, 0x4

    const/4 v8, 0x3

    const/16 v14, 0x111

    invoke-direct {v5, v1, v14, v8, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "ThumbnailOrientation"

    move-object/from16 v50, v5

    const/16 v5, 0x112

    invoke-direct {v0, v14, v5, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "SamplesPerPixel"

    move-object/from16 v51, v0

    const/16 v0, 0x115

    invoke-direct {v5, v14, v0, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "RowsPerStrip"

    move-object/from16 v52, v5

    const/16 v5, 0x116

    move-object/from16 v53, v10

    const/4 v10, 0x4

    invoke-direct {v0, v14, v5, v8, v10}, Lax/y0/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "StripByteCounts"

    move-object/from16 v54, v0

    const/16 v0, 0x117

    invoke-direct {v5, v14, v0, v8, v10}, Lax/y0/a$e;-><init>(Ljava/lang/String;III)V

    new-instance v0, Lax/y0/a$e;

    const-string v8, "XResolution"

    const/16 v10, 0x11a

    const/4 v14, 0x5

    invoke-direct {v0, v8, v10, v14}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v10, "YResolution"

    move-object/from16 v55, v0

    const/16 v0, 0x11b

    invoke-direct {v8, v10, v0, v14}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v10, "PlanarConfiguration"

    const/16 v14, 0x11c

    move-object/from16 v56, v5

    const/4 v5, 0x3

    invoke-direct {v0, v10, v14, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v10, Lax/y0/a$e;

    const-string v14, "ResolutionUnit"

    move-object/from16 v57, v0

    const/16 v0, 0x128

    invoke-direct {v10, v14, v0, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v14, "TransferFunction"

    move-object/from16 v58, v8

    const/16 v8, 0x12d

    invoke-direct {v0, v14, v8, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v8, "Software"

    const/16 v14, 0x131

    move-object/from16 v59, v0

    const/4 v0, 0x2

    invoke-direct {v5, v8, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "DateTime"

    move-object/from16 v60, v5

    const/16 v5, 0x132

    invoke-direct {v8, v14, v5, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "Artist"

    move-object/from16 v61, v8

    const/16 v8, 0x13b

    invoke-direct {v5, v14, v8, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v8, "WhitePoint"

    const/16 v14, 0x13e

    move-object/from16 v62, v5

    const/4 v5, 0x5

    invoke-direct {v0, v8, v14, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "PrimaryChromaticities"

    move-object/from16 v63, v0

    const/16 v0, 0x13f

    invoke-direct {v8, v14, v0, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const/16 v5, 0x14a

    const/4 v14, 0x4

    invoke-direct {v0, v4, v5, v14}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    move-object/from16 v64, v0

    const-string v0, "JPEGInterchangeFormat"

    move-object/from16 v65, v8

    const/16 v8, 0x201

    invoke-direct {v5, v0, v8, v14}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v8, "JPEGInterchangeFormatLength"

    move-object/from16 v66, v5

    const/16 v5, 0x202

    invoke-direct {v0, v8, v5, v14}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v8, "YCbCrCoefficients"

    const/16 v14, 0x211

    move-object/from16 v67, v0

    const/4 v0, 0x5

    invoke-direct {v5, v8, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v8, "YCbCrSubSampling"

    const/16 v14, 0x212

    move-object/from16 v68, v5

    const/4 v5, 0x3

    invoke-direct {v0, v8, v14, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v14, "YCbCrPositioning"

    move-object/from16 v70, v0

    const/16 v0, 0x213

    invoke-direct {v8, v14, v0, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v5, "ReferenceBlackWhite"

    const/16 v14, 0x214

    move-object/from16 v71, v8

    const/4 v8, 0x5

    invoke-direct {v0, v5, v14, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v8, "Copyright"

    const v14, 0x8298

    move-object/from16 v72, v0

    const/4 v0, 0x2

    invoke-direct {v5, v8, v14, v0}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const v8, 0x8769

    const/4 v14, 0x4

    invoke-direct {v0, v6, v8, v14}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    move-object/from16 v73, v0

    const-string v0, "GPSInfoIFDPointer"

    move-object/from16 v74, v5

    const v5, 0x8825

    invoke-direct {v8, v0, v5, v14}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v0, Lax/y0/a$e;

    const-string v5, "DNGVersion"

    const v14, 0xc612

    move-object/from16 v75, v8

    const/4 v8, 0x1

    invoke-direct {v0, v5, v14, v8}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v14, "DefaultCropSize"

    const/16 v23, 0x1

    const v8, 0xc620

    move-object/from16 v76, v0

    move-object/from16 v77, v10

    const/4 v0, 0x3

    const/4 v10, 0x4

    invoke-direct {v5, v14, v8, v0, v10}, Lax/y0/a$e;-><init>(Ljava/lang/String;III)V

    const/16 v8, 0x25

    new-array v8, v8, [Lax/y0/a$e;

    const/16 v16, 0x0

    aput-object v42, v8, v16

    aput-object v53, v8, v23

    const/16 v31, 0x2

    aput-object v11, v8, v31

    aput-object v44, v8, v0

    aput-object v45, v8, v10

    const/16 v28, 0x5

    aput-object v13, v8, v28

    const/16 v26, 0x6

    aput-object v46, v8, v26

    const/16 v24, 0x7

    aput-object v47, v8, v24

    const/16 v22, 0x8

    aput-object v48, v8, v22

    const/16 v39, 0x9

    aput-object v49, v8, v39

    const/16 v20, 0xa

    aput-object v50, v8, v20

    const/16 v38, 0xb

    aput-object v51, v8, v38

    const/16 v37, 0xc

    aput-object v52, v8, v37

    const/16 v19, 0xd

    aput-object v54, v8, v19

    const/16 v21, 0xe

    aput-object v56, v8, v21

    const/16 v33, 0xf

    aput-object v55, v8, v33

    const/16 v34, 0x10

    aput-object v58, v8, v34

    const/16 v35, 0x11

    aput-object v57, v8, v35

    const/16 v36, 0x12

    aput-object v77, v8, v36

    const/16 v0, 0x13

    aput-object v59, v8, v0

    const/16 v0, 0x14

    aput-object v60, v8, v0

    const/16 v0, 0x15

    aput-object v61, v8, v0

    const/16 v0, 0x16

    aput-object v62, v8, v0

    const/16 v69, 0x17

    aput-object v63, v8, v69

    const/16 v0, 0x18

    aput-object v65, v8, v0

    const/16 v0, 0x19

    aput-object v64, v8, v0

    const/16 v18, 0x1a

    aput-object v66, v8, v18

    const/16 v0, 0x1b

    aput-object v67, v8, v0

    const/16 v0, 0x1c

    aput-object v68, v8, v0

    const/16 v0, 0x1d

    aput-object v70, v8, v0

    const/16 v0, 0x1e

    aput-object v71, v8, v0

    const/16 v0, 0x1f

    aput-object v72, v8, v0

    const/16 v0, 0x20

    aput-object v74, v8, v0

    const/16 v0, 0x21

    aput-object v73, v8, v0

    const/16 v0, 0x22

    aput-object v75, v8, v0

    const/16 v0, 0x23

    aput-object v76, v8, v0

    const/16 v0, 0x24

    aput-object v5, v8, v0

    sput-object v8, Lax/y0/a;->f0:[Lax/y0/a$e;

    .line 40
    new-instance v0, Lax/y0/a$e;

    const/4 v5, 0x3

    const/16 v14, 0x111

    invoke-direct {v0, v1, v14, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lax/y0/a;->g0:Lax/y0/a$e;

    .line 41
    new-instance v0, Lax/y0/a$e;

    const-string v1, "ThumbnailImage"

    const/4 v5, 0x7

    const/16 v10, 0x100

    invoke-direct {v0, v1, v10, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v1, Lax/y0/a$e;

    const-string v5, "CameraSettingsIFDPointer"

    const/16 v10, 0x2020

    const/4 v14, 0x4

    invoke-direct {v1, v5, v10, v14}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v10, "ImageProcessingIFDPointer"

    const/16 v11, 0x2040

    invoke-direct {v5, v10, v11, v14}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    const/4 v10, 0x3

    new-array v11, v10, [Lax/y0/a$e;

    const/16 v16, 0x0

    aput-object v0, v11, v16

    const/4 v10, 0x1

    aput-object v1, v11, v10

    const/4 v0, 0x2

    aput-object v5, v11, v0

    sput-object v11, Lax/y0/a;->h0:[Lax/y0/a$e;

    .line 42
    new-instance v1, Lax/y0/a$e;

    const-string v5, "PreviewImageStart"

    const/16 v13, 0x101

    invoke-direct {v1, v5, v13, v14}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v13, "PreviewImageLength"

    const/16 v10, 0x102

    const/16 v23, 0x1

    invoke-direct {v5, v13, v10, v14}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-array v10, v0, [Lax/y0/a$e;

    aput-object v1, v10, v16

    aput-object v5, v10, v23

    sput-object v10, Lax/y0/a;->i0:[Lax/y0/a$e;

    .line 43
    new-instance v0, Lax/y0/a$e;

    const-string v1, "AspectFrame"

    const/16 v5, 0x1113

    const/4 v14, 0x3

    invoke-direct {v0, v1, v5, v14}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    const/4 v13, 0x1

    new-array v1, v13, [Lax/y0/a$e;

    aput-object v0, v1, v16

    sput-object v1, Lax/y0/a;->j0:[Lax/y0/a$e;

    .line 44
    new-instance v0, Lax/y0/a$e;

    const-string v5, "ColorSpace"

    move-object/from16 v18, v1

    const/16 v1, 0x37

    invoke-direct {v0, v5, v1, v14}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-array v1, v13, [Lax/y0/a$e;

    aput-object v0, v1, v16

    sput-object v1, Lax/y0/a;->k0:[Lax/y0/a$e;

    const/16 v0, 0xa

    .line 45
    new-array v0, v0, [[Lax/y0/a$e;

    aput-object v41, v0, v16

    aput-object v17, v0, v13

    const/16 v31, 0x2

    aput-object v40, v0, v31

    aput-object v43, v0, v14

    const/4 v5, 0x4

    aput-object v8, v0, v5

    const/16 v28, 0x5

    aput-object v41, v0, v28

    const/16 v26, 0x6

    aput-object v11, v0, v26

    const/16 v24, 0x7

    aput-object v10, v0, v24

    const/16 v22, 0x8

    aput-object v18, v0, v22

    const/16 v39, 0x9

    aput-object v1, v0, v39

    sput-object v0, Lax/y0/a;->l0:[[Lax/y0/a$e;

    .line 46
    new-instance v1, Lax/y0/a$e;

    const/16 v8, 0x14a

    invoke-direct {v1, v4, v8, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v4, Lax/y0/a$e;

    const v8, 0x8769

    invoke-direct {v4, v6, v8, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v6, Lax/y0/a$e;

    const-string v8, "GPSInfoIFDPointer"

    const v10, 0x8825

    invoke-direct {v6, v8, v10, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v8, Lax/y0/a$e;

    const-string v10, "InteroperabilityIFDPointer"

    const v11, 0xa005

    invoke-direct {v8, v10, v11, v5}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lax/y0/a$e;

    const-string v10, "CameraSettingsIFDPointer"

    const/16 v11, 0x2020

    const/4 v13, 0x1

    invoke-direct {v5, v10, v11, v13}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    new-instance v10, Lax/y0/a$e;

    const-string v11, "ImageProcessingIFDPointer"

    const/16 v14, 0x2040

    invoke-direct {v10, v11, v14, v13}, Lax/y0/a$e;-><init>(Ljava/lang/String;II)V

    const/4 v11, 0x6

    new-array v11, v11, [Lax/y0/a$e;

    const/16 v16, 0x0

    aput-object v1, v11, v16

    aput-object v4, v11, v13

    const/16 v31, 0x2

    aput-object v6, v11, v31

    const/16 v32, 0x3

    aput-object v8, v11, v32

    const/16 v30, 0x4

    aput-object v5, v11, v30

    const/16 v28, 0x5

    aput-object v10, v11, v28

    sput-object v11, Lax/y0/a;->m0:[Lax/y0/a$e;

    .line 47
    array-length v1, v0

    new-array v1, v1, [Ljava/util/HashMap;

    sput-object v1, Lax/y0/a;->n0:[Ljava/util/HashMap;

    .line 48
    array-length v0, v0

    new-array v0, v0, [Ljava/util/HashMap;

    sput-object v0, Lax/y0/a;->o0:[Ljava/util/HashMap;

    .line 49
    new-instance v0, Ljava/util/HashSet;

    const-string v1, "ExposureTime"

    const-string v4, "SubjectDistance"

    const-string v5, "FNumber"

    const-string v6, "DigitalZoomRatio"

    filled-new-array {v5, v6, v1, v4}, [Ljava/lang/String;

    move-result-object v1

    .line 50
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 51
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lax/y0/a;->p0:Ljava/util/Set;

    .line 52
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lax/y0/a;->q0:Ljava/util/HashMap;

    .line 53
    const-string v0, "US-ASCII"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lax/y0/a;->r0:Ljava/nio/charset/Charset;

    .line 54
    const-string v1, "Exif\u0000\u0000"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    sput-object v1, Lax/y0/a;->s0:[B

    .line 55
    const-string v1, "http://ns.adobe.com/xap/1.0/\u0000"

    .line 56
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, Lax/y0/a;->t0:[B

    .line 57
    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "yyyy:MM:dd HH:mm:ss"

    invoke-direct {v0, v4, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lax/y0/a;->W:Ljava/text/SimpleDateFormat;

    .line 58
    const-string v4, "UTC"

    invoke-static {v4}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 59
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v0, v4, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lax/y0/a;->X:Ljava/text/SimpleDateFormat;

    .line 60
    const-string v1, "UTC"

    invoke-static {v1}, Lj$/util/DesugarTimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    const/4 v11, 0x0

    .line 61
    :goto_e0e
    sget-object v0, Lax/y0/a;->l0:[[Lax/y0/a$e;

    array-length v1, v0

    if-ge v11, v1, :cond_e4d

    .line 62
    sget-object v1, Lax/y0/a;->n0:[Ljava/util/HashMap;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    aput-object v4, v1, v11

    .line 63
    sget-object v1, Lax/y0/a;->o0:[Ljava/util/HashMap;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    aput-object v4, v1, v11

    .line 64
    aget-object v0, v0, v11

    array-length v1, v0

    const/4 v4, 0x0

    :goto_e29
    if-ge v4, v1, :cond_e48

    aget-object v5, v0, v4

    .line 65
    sget-object v6, Lax/y0/a;->n0:[Ljava/util/HashMap;

    aget-object v6, v6, v11

    iget v8, v5, Lax/y0/a$e;->a:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v8, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    sget-object v6, Lax/y0/a;->o0:[Ljava/util/HashMap;

    aget-object v6, v6, v11

    iget-object v8, v5, Lax/y0/a$e;->b:Ljava/lang/String;

    invoke-virtual {v6, v8, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v23, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_e29

    :cond_e48
    const/16 v23, 0x1

    add-int/lit8 v11, v11, 0x1

    goto :goto_e0e

    :cond_e4d
    const/16 v23, 0x1

    .line 67
    sget-object v0, Lax/y0/a;->q0:Ljava/util/HashMap;

    sget-object v1, Lax/y0/a;->m0:[Lax/y0/a$e;

    const/16 v16, 0x0

    aget-object v4, v1, v16

    iget v4, v4, Lax/y0/a$e;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    aget-object v4, v1, v23

    iget v4, v4, Lax/y0/a$e;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v31, 0x2

    .line 69
    aget-object v3, v1, v31

    iget v3, v3, Lax/y0/a$e;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v32, 0x3

    .line 70
    aget-object v3, v1, v32

    iget v3, v3, Lax/y0/a$e;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v30, 0x4

    .line 71
    aget-object v2, v1, v30

    iget v2, v2, Lax/y0/a$e;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v28, 0x5

    .line 72
    aget-object v1, v1, v28

    iget v1, v1, Lax/y0/a$e;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    const-string v0, ".*[1-9].*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lax/y0/a;->u0:Ljava/util/regex/Pattern;

    .line 74
    const-string v0, "^(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 75
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lax/y0/a;->v0:Ljava/util/regex/Pattern;

    .line 76
    const-string v0, "^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 77
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lax/y0/a;->w0:Ljava/util/regex/Pattern;

    .line 78
    const-string v0, "^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$"

    .line 79
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lax/y0/a;->x0:Ljava/util/regex/Pattern;

    return-void

    :array_ec0
    .array-data 1
        -0x1t
        -0x28t
        -0x1t
    .end array-data

    :array_ec6
    .array-data 1
        0x66t
        0x74t
        0x79t
        0x70t
    .end array-data

    :array_ecc
    .array-data 1
        0x6dt
        0x69t
        0x66t
        0x31t
    .end array-data

    :array_ed2
    .array-data 1
        0x68t
        0x65t
        0x69t
        0x63t
    .end array-data

    :array_ed8
    .array-data 1
        0x61t
        0x76t
        0x69t
        0x66t
    .end array-data

    :array_ede
    .array-data 1
        0x61t
        0x76t
        0x69t
        0x73t
    .end array-data

    :array_ee4
    .array-data 1
        0x4ft
        0x4ct
        0x59t
        0x4dt
        0x50t
        0x0t
    .end array-data

    nop

    :array_eec
    .array-data 1
        0x4ft
        0x4ct
        0x59t
        0x4dt
        0x50t
        0x55t
        0x53t
        0x0t
        0x49t
        0x49t
    .end array-data

    nop

    :array_ef6
    .array-data 1
        -0x77t
        0x50t
        0x4et
        0x47t
        0xdt
        0xat
        0x1at
        0xat
    .end array-data

    :array_efe
    .array-data 1
        0x52t
        0x49t
        0x46t
        0x46t
    .end array-data

    :array_f04
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x50t
    .end array-data

    :array_f0a
    .array-data 1
        0x45t
        0x58t
        0x49t
        0x46t
    .end array-data

    :array_f10
    .array-data 1
        -0x63t
        0x1t
        0x2at
    .end array-data

    :array_f16
    .array-data 4
        0x0
        0x1
        0x1
        0x2
        0x4
        0x8
        0x1
        0x1
        0x2
        0x4
        0x8
        0x4
        0x8
        0x1
    .end array-data

    :array_f36
    .array-data 1
        0x41t
        0x53t
        0x43t
        0x49t
        0x49t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Ljava/io/FileDescriptor;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    sget-object v0, Lax/y0/a;->l0:[[Lax/y0/a$e;

    array-length v1, v0

    new-array v1, v1, [Ljava/util/HashMap;

    iput-object v1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 9
    new-instance v1, Ljava/util/HashSet;

    array-length v0, v0

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(I)V

    iput-object v1, p0, Lax/y0/a;->h:Ljava/util/Set;

    .line 10
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    iput-object v0, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    if-eqz p1, :cond_57

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lax/y0/a;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 12
    iput-object v0, p0, Lax/y0/a;->a:Ljava/lang/String;

    .line 13
    invoke-static {p1}, Lax/y0/a;->P(Ljava/io/FileDescriptor;)Z

    move-result v1

    if-eqz v1, :cond_34

    .line 14
    iput-object p1, p0, Lax/y0/a;->b:Ljava/io/FileDescriptor;

    .line 15
    :try_start_25
    invoke-static {p1}, Landroid/system/Os;->dup(Ljava/io/FileDescriptor;)Ljava/io/FileDescriptor;

    move-result-object p1
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_29} :catch_2b

    const/4 v1, 0x1

    goto :goto_37

    :catch_2b
    move-exception p1

    .line 16
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to duplicate file descriptor"

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 17
    :cond_34
    iput-object v0, p0, Lax/y0/a;->b:Ljava/io/FileDescriptor;

    const/4 v1, 0x0

    .line 18
    :goto_37
    :try_start_37
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_3c
    .catchall {:try_start_37 .. :try_end_3c} :catchall_4a

    .line 19
    :try_start_3c
    invoke-direct {p0, v2}, Lax/y0/a;->V(Ljava/io/InputStream;)V
    :try_end_3f
    .catchall {:try_start_3c .. :try_end_3f} :catchall_48

    .line 20
    invoke-static {v2}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    if-eqz v1, :cond_47

    .line 21
    invoke-static {p1}, Lax/y0/b;->a(Ljava/io/FileDescriptor;)V

    :cond_47
    return-void

    :catchall_48
    move-exception v0

    goto :goto_4e

    :catchall_4a
    move-exception v2

    move-object v3, v2

    move-object v2, v0

    move-object v0, v3

    .line 22
    :goto_4e
    invoke-static {v2}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    if-eqz v1, :cond_56

    .line 23
    invoke-static {p1}, Lax/y0/b;->a(Ljava/io/FileDescriptor;)V

    .line 24
    :cond_56
    throw v0

    .line 25
    :cond_57
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "fileDescriptor cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, p1, v0}, Lax/y0/a;-><init>(Ljava/io/InputStream;I)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    sget-object v0, Lax/y0/a;->l0:[[Lax/y0/a$e;

    array-length v1, v0

    new-array v1, v1, [Ljava/util/HashMap;

    iput-object v1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 29
    new-instance v1, Ljava/util/HashSet;

    array-length v0, v0

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(I)V

    iput-object v1, p0, Lax/y0/a;->h:Ljava/util/Set;

    .line 30
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    iput-object v0, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    if-eqz p1, :cond_57

    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lax/y0/a;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-ne p2, v1, :cond_1f

    goto :goto_20

    :cond_1f
    const/4 v1, 0x0

    .line 32
    :goto_20
    iput-boolean v1, p0, Lax/y0/a;->e:Z

    if-eqz v1, :cond_29

    .line 33
    iput-object v0, p0, Lax/y0/a;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 34
    iput-object v0, p0, Lax/y0/a;->b:Ljava/io/FileDescriptor;

    goto :goto_53

    .line 35
    :cond_29
    instance-of p2, p1, Landroid/content/res/AssetManager$AssetInputStream;

    if-eqz p2, :cond_35

    .line 36
    move-object p2, p1

    check-cast p2, Landroid/content/res/AssetManager$AssetInputStream;

    iput-object p2, p0, Lax/y0/a;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 37
    iput-object v0, p0, Lax/y0/a;->b:Ljava/io/FileDescriptor;

    goto :goto_53

    .line 38
    :cond_35
    instance-of p2, p1, Ljava/io/FileInputStream;

    if-eqz p2, :cond_4f

    move-object p2, p1

    check-cast p2, Ljava/io/FileInputStream;

    .line 39
    invoke-virtual {p2}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-static {v1}, Lax/y0/a;->P(Ljava/io/FileDescriptor;)Z

    move-result v1

    if-eqz v1, :cond_4f

    .line 40
    iput-object v0, p0, Lax/y0/a;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 41
    invoke-virtual {p2}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object p2

    iput-object p2, p0, Lax/y0/a;->b:Ljava/io/FileDescriptor;

    goto :goto_53

    .line 42
    :cond_4f
    iput-object v0, p0, Lax/y0/a;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 43
    iput-object v0, p0, Lax/y0/a;->b:Ljava/io/FileDescriptor;

    .line 44
    :goto_53
    invoke-direct {p0, p1}, Lax/y0/a;->V(Ljava/io/InputStream;)V

    return-void

    .line 45
    :cond_57
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "inputStream cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lax/y0/a;->l0:[[Lax/y0/a$e;

    array-length v1, v0

    new-array v1, v1, [Ljava/util/HashMap;

    iput-object v1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 3
    new-instance v1, Ljava/util/HashSet;

    array-length v0, v0

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(I)V

    iput-object v1, p0, Lax/y0/a;->h:Ljava/util/Set;

    .line 4
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    iput-object v0, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    if-eqz p1, :cond_1c

    .line 5
    invoke-direct {p0, p1}, Lax/y0/a;->I(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_1c
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "filename cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private A(Lax/y0/a$g;)Z
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lax/y0/a;->s0:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    new-array v1, v1, [B

    .line 5
    .line 6
    invoke-virtual {p1, v1}, Lax/y0/a$b;->readFully([B)V

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_17

    .line 15
    .line 16
    const-string p1, "ExifInterface"

    .line 17
    .line 18
    const-string v0, "Given data is not EXIF-only."

    .line 19
    .line 20
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    return v2

    .line 24
    :cond_17
    invoke-virtual {p1}, Lax/y0/a$b;->c()[B

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    array-length v0, v0

    .line 29
    iput v0, p0, Lax/y0/a;->q:I

    .line 30
    .line 31
    invoke-direct {p0, p1, v2}, Lax/y0/a;->a0([BI)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    return p1
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private D(Lax/y0/a$b;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-boolean v0, Lax/y0/a;->x:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1a

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "getWebpAttributes starting with: "

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "ExifInterface"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_1a
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lax/y0/a$b;->e(Ljava/nio/ByteOrder;)V

    .line 30
    .line 31
    .line 32
    sget-object v0, Lax/y0/a;->N:[B

    .line 33
    .line 34
    array-length v0, v0

    .line 35
    invoke-virtual {p1, v0}, Lax/y0/a$b;->f(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lax/y0/a$b;->readInt()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/lit8 v0, v0, 0x8

    .line 43
    .line 44
    sget-object v1, Lax/y0/a;->O:[B

    .line 45
    .line 46
    array-length v2, v1

    .line 47
    invoke-virtual {p1, v2}, Lax/y0/a$b;->f(I)V

    .line 48
    .line 49
    .line 50
    array-length v1, v1

    .line 51
    add-int/lit8 v1, v1, 0x8

    .line 52
    .line 53
    :goto_34
    const/4 v2, 0x4

    .line 54
    :try_start_35
    new-array v2, v2, [B

    .line 55
    .line 56
    invoke-virtual {p1, v2}, Lax/y0/a$b;->readFully([B)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lax/y0/a$b;->readInt()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    add-int/lit8 v1, v1, 0x8

    .line 64
    .line 65
    sget-object v4, Lax/y0/a;->P:[B

    .line 66
    .line 67
    invoke-static {v4, v2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_6c

    .line 72
    .line 73
    new-array v0, v3, [B

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Lax/y0/a$b;->readFully([B)V

    .line 76
    .line 77
    .line 78
    sget-object p1, Lax/y0/a;->s0:[B

    .line 79
    .line 80
    invoke-static {v0, p1}, Lax/y0/b;->g([B[B)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_5d

    .line 85
    .line 86
    array-length p1, p1

    .line 87
    invoke-static {v0, p1, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    goto :goto_5d

    .line 92
    :catch_5b
    move-exception p1

    .line 93
    goto :goto_85

    .line 94
    :cond_5d
    :goto_5d
    iput v1, p0, Lax/y0/a;->q:I

    .line 95
    .line 96
    const/4 p1, 0x0

    .line 97
    invoke-direct {p0, v0, p1}, Lax/y0/a;->a0([BI)V

    .line 98
    .line 99
    .line 100
    new-instance p1, Lax/y0/a$b;

    .line 101
    .line 102
    invoke-direct {p1, v0}, Lax/y0/a$b;-><init>([B)V

    .line 103
    .line 104
    .line 105
    invoke-direct {p0, p1}, Lax/y0/a;->n0(Lax/y0/a$b;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_6c
    rem-int/lit8 v2, v3, 0x2

    .line 110
    .line 111
    const/4 v4, 0x1

    .line 112
    if-ne v2, v4, :cond_73

    .line 113
    .line 114
    add-int/lit8 v3, v3, 0x1

    .line 115
    .line 116
    :cond_73
    add-int/2addr v1, v3

    .line 117
    if-ne v1, v0, :cond_77

    .line 118
    .line 119
    return-void

    .line 120
    :cond_77
    if-gt v1, v0, :cond_7d

    .line 121
    .line 122
    invoke-virtual {p1, v3}, Lax/y0/a$b;->f(I)V

    .line 123
    .line 124
    .line 125
    goto :goto_34

    .line 126
    :cond_7d
    new-instance p1, Ljava/io/IOException;

    .line 127
    .line 128
    const-string v0, "Encountered WebP file with invalid chunk size"

    .line 129
    .line 130
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw p1
    :try_end_85
    .catch Ljava/io/EOFException; {:try_start_35 .. :try_end_85} :catch_5b

    .line 134
    :goto_85
    new-instance v0, Ljava/io/IOException;

    .line 135
    .line 136
    const-string v1, "Encountered corrupt WebP file."

    .line 137
    .line 138
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    throw v0
    .line 142
    .line 143
.end method

.method private static E(I)I
    .registers 2

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eq p0, v0, :cond_17

    .line 3
    .line 4
    const/16 v0, 0x9

    .line 5
    .line 6
    if-eq p0, v0, :cond_15

    .line 7
    .line 8
    const/16 v0, 0xf

    .line 9
    .line 10
    if-eq p0, v0, :cond_15

    .line 11
    .line 12
    const/16 v0, 0xc

    .line 13
    .line 14
    if-eq p0, v0, :cond_15

    .line 15
    .line 16
    const/16 v0, 0xd

    .line 17
    .line 18
    if-eq p0, v0, :cond_15

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_15
    const/4 p0, 0x2

    .line 23
    return p0

    .line 24
    :cond_17
    const/4 p0, 0x3

    .line 25
    return p0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static F(Ljava/lang/String;)Landroid/util/Pair;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, ","

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x2

    .line 10
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    const/4 v6, -0x1

    .line 15
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    if-eqz v1, :cond_a6

    .line 20
    .line 21
    invoke-virtual {p0, v0, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    aget-object v0, p0, v2

    .line 26
    .line 27
    invoke-static {v0}, Lax/y0/a;->F(Ljava/lang/String;)Landroid/util/Pair;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-ne v1, v4, :cond_29

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_29
    :goto_29
    array-length v1, p0

    .line 43
    if-ge v3, v1, :cond_a5

    .line 44
    .line 45
    aget-object v1, p0, v3

    .line 46
    .line 47
    invoke-static {v1}, Lax/y0/a;->F(Ljava/lang/String;)Landroid/util/Pair;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Ljava/lang/Integer;

    .line 54
    .line 55
    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 56
    .line 57
    invoke-virtual {v2, v4}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_4d

    .line 62
    .line 63
    iget-object v2, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Ljava/lang/Integer;

    .line 66
    .line 67
    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 68
    .line 69
    invoke-virtual {v2, v4}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_4b

    .line 74
    .line 75
    goto :goto_4d

    .line 76
    :cond_4b
    const/4 v2, -0x1

    .line 77
    goto :goto_55

    .line 78
    :cond_4d
    :goto_4d
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    :goto_55
    iget-object v4, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v4, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eq v4, v6, :cond_80

    .line 95
    .line 96
    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v4, Ljava/lang/Integer;

    .line 99
    .line 100
    iget-object v8, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-virtual {v4, v8}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-nez v4, :cond_77

    .line 107
    .line 108
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Ljava/lang/Integer;

    .line 111
    .line 112
    iget-object v4, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 113
    .line 114
    invoke-virtual {v1, v4}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_80

    .line 119
    .line 120
    :cond_77
    iget-object v1, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v1, Ljava/lang/Integer;

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    goto :goto_81

    .line 129
    :cond_80
    const/4 v1, -0x1

    .line 130
    :goto_81
    if-ne v2, v6, :cond_8b

    .line 131
    .line 132
    if-ne v1, v6, :cond_8b

    .line 133
    .line 134
    new-instance p0, Landroid/util/Pair;

    .line 135
    .line 136
    invoke-direct {p0, v5, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    return-object p0

    .line 140
    :cond_8b
    if-ne v2, v6, :cond_97

    .line 141
    .line 142
    new-instance v0, Landroid/util/Pair;

    .line 143
    .line 144
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-direct {v0, v1, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto :goto_a2

    .line 152
    :cond_97
    if-ne v1, v6, :cond_a2

    .line 153
    .line 154
    new-instance v0, Landroid/util/Pair;

    .line 155
    .line 156
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-direct {v0, v1, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :cond_a2
    :goto_a2
    add-int/lit8 v3, v3, 0x1

    .line 164
    .line 165
    goto :goto_29

    .line 166
    :cond_a5
    return-object v0

    .line 167
    :cond_a6
    const-string v0, "/"

    .line 168
    .line 169
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    const-wide/16 v8, 0x0

    .line 174
    .line 175
    if-eqz v1, :cond_105

    .line 176
    .line 177
    invoke-virtual {p0, v0, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    array-length v0, p0

    .line 182
    if-ne v0, v4, :cond_ff

    .line 183
    .line 184
    :try_start_b7
    aget-object v0, p0, v2

    .line 185
    .line 186
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 187
    .line 188
    .line 189
    move-result-wide v0

    .line 190
    double-to-long v0, v0

    .line 191
    aget-object p0, p0, v3

    .line 192
    .line 193
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 194
    .line 195
    .line 196
    move-result-wide v2

    .line 197
    double-to-long v2, v2

    .line 198
    const/16 p0, 0xa

    .line 199
    .line 200
    cmp-long v4, v0, v8

    .line 201
    .line 202
    if-ltz v4, :cond_f5

    .line 203
    .line 204
    cmp-long v4, v2, v8

    .line 205
    .line 206
    if-gez v4, :cond_d0

    .line 207
    .line 208
    goto :goto_f5

    .line 209
    :cond_d0
    const/4 v4, 0x5

    .line 210
    const-wide/32 v8, 0x7fffffff

    .line 211
    .line 212
    .line 213
    cmp-long v6, v0, v8

    .line 214
    .line 215
    if-gtz v6, :cond_eb

    .line 216
    .line 217
    cmp-long v0, v2, v8

    .line 218
    .line 219
    if-lez v0, :cond_dd

    .line 220
    .line 221
    goto :goto_eb

    .line 222
    :cond_dd
    new-instance v0, Landroid/util/Pair;

    .line 223
    .line 224
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-direct {v0, p0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    return-object v0

    .line 236
    :cond_eb
    :goto_eb
    new-instance p0, Landroid/util/Pair;

    .line 237
    .line 238
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-direct {p0, v0, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    return-object p0

    .line 246
    :cond_f5
    :goto_f5
    new-instance v0, Landroid/util/Pair;

    .line 247
    .line 248
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-direct {v0, p0, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_fe
    .catch Ljava/lang/NumberFormatException; {:try_start_b7 .. :try_end_fe} :catch_ff

    .line 253
    .line 254
    .line 255
    return-object v0

    .line 256
    :catch_ff
    :cond_ff
    new-instance p0, Landroid/util/Pair;

    .line 257
    .line 258
    invoke-direct {p0, v5, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    return-object p0

    .line 262
    :cond_105
    :try_start_105
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 263
    .line 264
    .line 265
    move-result-wide v0

    .line 266
    const/4 v2, 0x4

    .line 267
    cmp-long v3, v0, v8

    .line 268
    .line 269
    if-ltz v3, :cond_124

    .line 270
    .line 271
    const-wide/32 v8, 0xffff

    .line 272
    .line 273
    .line 274
    cmp-long v4, v0, v8

    .line 275
    .line 276
    if-gtz v4, :cond_124

    .line 277
    .line 278
    new-instance v0, Landroid/util/Pair;

    .line 279
    .line 280
    const/4 v1, 0x3

    .line 281
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    return-object v0

    .line 293
    :cond_124
    if-gez v3, :cond_132

    .line 294
    .line 295
    new-instance v0, Landroid/util/Pair;

    .line 296
    .line 297
    const/16 v1, 0x9

    .line 298
    .line 299
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-direct {v0, v1, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    return-object v0

    .line 307
    :cond_132
    new-instance v0, Landroid/util/Pair;

    .line 308
    .line 309
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-direct {v0, v1, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_13b
    .catch Ljava/lang/NumberFormatException; {:try_start_105 .. :try_end_13b} :catch_13c

    .line 314
    .line 315
    .line 316
    return-object v0

    .line 317
    :catch_13c
    :try_start_13c
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 318
    .line 319
    .line 320
    new-instance p0, Landroid/util/Pair;

    .line 321
    .line 322
    const/16 v0, 0xc

    .line 323
    .line 324
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-direct {p0, v0, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_14a
    .catch Ljava/lang/NumberFormatException; {:try_start_13c .. :try_end_14a} :catch_14b

    .line 329
    .line 330
    .line 331
    return-object p0

    .line 332
    :catch_14b
    new-instance p0, Landroid/util/Pair;

    .line 333
    .line 334
    invoke-direct {p0, v5, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    return-object p0
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method private G(Lax/y0/a$b;Ljava/util/HashMap;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/y0/a$b;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lax/y0/a$d;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "JPEGInterchangeFormat"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/y0/a$d;

    .line 8
    .line 9
    const-string v1, "JPEGInterchangeFormatLength"

    .line 10
    .line 11
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Lax/y0/a$d;

    .line 16
    .line 17
    if-eqz v0, :cond_6b

    .line 18
    .line 19
    if-eqz p2, :cond_6b

    .line 20
    .line 21
    iget-object v1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lax/y0/a$d;->m(Ljava/nio/ByteOrder;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 28
    .line 29
    invoke-virtual {p2, v1}, Lax/y0/a$d;->m(Ljava/nio/ByteOrder;)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iget v1, p0, Lax/y0/a;->d:I

    .line 34
    .line 35
    const/4 v2, 0x7

    .line 36
    if-ne v1, v2, :cond_28

    .line 37
    .line 38
    iget v1, p0, Lax/y0/a;->r:I

    .line 39
    .line 40
    add-int/2addr v0, v1

    .line 41
    :cond_28
    if-lez v0, :cond_49

    .line 42
    .line 43
    if-lez p2, :cond_49

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    iput-boolean v1, p0, Lax/y0/a;->j:Z

    .line 47
    .line 48
    iget-object v1, p0, Lax/y0/a;->a:Ljava/lang/String;

    .line 49
    .line 50
    if-nez v1, :cond_45

    .line 51
    .line 52
    iget-object v1, p0, Lax/y0/a;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 53
    .line 54
    if-nez v1, :cond_45

    .line 55
    .line 56
    iget-object v1, p0, Lax/y0/a;->b:Ljava/io/FileDescriptor;

    .line 57
    .line 58
    if-nez v1, :cond_45

    .line 59
    .line 60
    new-array v1, p2, [B

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Lax/y0/a$b;->f(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v1}, Lax/y0/a$b;->readFully([B)V

    .line 66
    .line 67
    .line 68
    iput-object v1, p0, Lax/y0/a;->o:[B

    .line 69
    .line 70
    :cond_45
    iput v0, p0, Lax/y0/a;->m:I

    .line 71
    .line 72
    iput p2, p0, Lax/y0/a;->n:I

    .line 73
    .line 74
    :cond_49
    sget-boolean p1, Lax/y0/a;->x:Z

    .line 75
    .line 76
    if-eqz p1, :cond_6b

    .line 77
    .line 78
    new-instance p1, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v1, "Setting thumbnail attributes with offset: "

    .line 84
    .line 85
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v0, ", length: "

    .line 92
    .line 93
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    const-string p2, "ExifInterface"

    .line 104
    .line 105
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    :cond_6b
    return-void
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method private H(Lax/y0/a$b;Ljava/util/HashMap;)V
    .registers 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/y0/a$b;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lax/y0/a$d;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, " bytes."

    .line 8
    .line 9
    const-string v4, "StripOffsets"

    .line 10
    .line 11
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Lax/y0/a$d;

    .line 16
    .line 17
    const-string v5, "StripByteCounts"

    .line 18
    .line 19
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lax/y0/a$d;

    .line 24
    .line 25
    if-eqz v4, :cond_ea

    .line 26
    .line 27
    if-eqz v2, :cond_ea

    .line 28
    .line 29
    iget-object v5, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 30
    .line 31
    invoke-virtual {v4, v5}, Lax/y0/a$d;->o(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-static {v4}, Lax/y0/b;->c(Ljava/lang/Object;)[J

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    iget-object v5, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 40
    .line 41
    invoke-virtual {v2, v5}, Lax/y0/a$d;->o(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2}, Lax/y0/b;->c(Ljava/lang/Object;)[J

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const-string v5, "ExifInterface"

    .line 50
    .line 51
    if-eqz v4, :cond_e5

    .line 52
    .line 53
    array-length v6, v4

    .line 54
    if-nez v6, :cond_39

    .line 55
    .line 56
    goto/16 :goto_e5

    .line 57
    .line 58
    :cond_39
    if-eqz v2, :cond_df

    .line 59
    .line 60
    array-length v6, v2

    .line 61
    if-nez v6, :cond_40

    .line 62
    .line 63
    goto/16 :goto_df

    .line 64
    .line 65
    :cond_40
    array-length v6, v4

    .line 66
    array-length v7, v2

    .line 67
    if-eq v6, v7, :cond_4a

    .line 68
    .line 69
    const-string v1, "stripOffsets and stripByteCounts should have same length."

    .line 70
    .line 71
    invoke-static {v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_4a
    array-length v6, v2

    .line 76
    const-wide/16 v8, 0x0

    .line 77
    .line 78
    const/4 v10, 0x0

    .line 79
    :goto_4e
    if-ge v10, v6, :cond_56

    .line 80
    .line 81
    aget-wide v11, v2, v10

    .line 82
    .line 83
    add-long/2addr v8, v11

    .line 84
    add-int/lit8 v10, v10, 0x1

    .line 85
    .line 86
    goto :goto_4e

    .line 87
    :cond_56
    long-to-int v6, v8

    .line 88
    new-array v8, v6, [B

    .line 89
    .line 90
    const/4 v9, 0x1

    .line 91
    iput-boolean v9, v0, Lax/y0/a;->l:Z

    .line 92
    .line 93
    iput-boolean v9, v0, Lax/y0/a;->k:Z

    .line 94
    .line 95
    iput-boolean v9, v0, Lax/y0/a;->j:Z

    .line 96
    .line 97
    const/4 v10, 0x0

    .line 98
    const/4 v11, 0x0

    .line 99
    const/4 v12, 0x0

    .line 100
    :goto_63
    array-length v13, v4

    .line 101
    if-ge v10, v13, :cond_cf

    .line 102
    .line 103
    aget-wide v13, v4, v10

    .line 104
    .line 105
    long-to-int v14, v13

    .line 106
    move-object v13, v8

    .line 107
    aget-wide v7, v2, v10

    .line 108
    .line 109
    long-to-int v8, v7

    .line 110
    array-length v7, v4

    .line 111
    sub-int/2addr v7, v9

    .line 112
    if-ge v10, v7, :cond_81

    .line 113
    .line 114
    add-int v7, v14, v8

    .line 115
    .line 116
    move v15, v10

    .line 117
    int-to-long v9, v7

    .line 118
    add-int/lit8 v7, v15, 0x1

    .line 119
    .line 120
    aget-wide v16, v4, v7

    .line 121
    .line 122
    cmp-long v7, v9, v16

    .line 123
    .line 124
    if-eqz v7, :cond_82

    .line 125
    .line 126
    const/4 v7, 0x0

    .line 127
    iput-boolean v7, v0, Lax/y0/a;->l:Z

    .line 128
    .line 129
    goto :goto_82

    .line 130
    :cond_81
    move v15, v10

    .line 131
    :cond_82
    :goto_82
    sub-int/2addr v14, v11

    .line 132
    if-gez v14, :cond_8b

    .line 133
    .line 134
    const-string v1, "Invalid strip offset value"

    .line 135
    .line 136
    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_8b
    :try_start_8b
    invoke-virtual {v1, v14}, Lax/y0/a$b;->f(I)V
    :try_end_8e
    .catch Ljava/io/EOFException; {:try_start_8b .. :try_end_8e} :catch_b7

    .line 141
    .line 142
    .line 143
    add-int/2addr v11, v14

    .line 144
    new-array v7, v8, [B

    .line 145
    .line 146
    :try_start_91
    invoke-virtual {v1, v7}, Lax/y0/a$b;->readFully([B)V
    :try_end_94
    .catch Ljava/io/EOFException; {:try_start_91 .. :try_end_94} :catch_9f

    .line 147
    .line 148
    .line 149
    add-int/2addr v11, v8

    .line 150
    const/4 v9, 0x0

    .line 151
    invoke-static {v7, v9, v13, v12, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 152
    .line 153
    .line 154
    add-int/2addr v12, v8

    .line 155
    add-int/lit8 v10, v15, 0x1

    .line 156
    .line 157
    move-object v8, v13

    .line 158
    const/4 v9, 0x1

    .line 159
    goto :goto_63

    .line 160
    :catch_9f
    new-instance v1, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 163
    .line 164
    .line 165
    const-string v2, "Failed to read "

    .line 166
    .line 167
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :catch_b7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 187
    .line 188
    .line 189
    const-string v2, "Failed to skip "

    .line 190
    .line 191
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :cond_cf
    move-object v13, v8

    .line 209
    iput-object v13, v0, Lax/y0/a;->o:[B

    .line 210
    .line 211
    iget-boolean v1, v0, Lax/y0/a;->l:Z

    .line 212
    .line 213
    if-eqz v1, :cond_ea

    .line 214
    .line 215
    const/4 v7, 0x0

    .line 216
    aget-wide v1, v4, v7

    .line 217
    .line 218
    long-to-int v2, v1

    .line 219
    iput v2, v0, Lax/y0/a;->m:I

    .line 220
    .line 221
    iput v6, v0, Lax/y0/a;->n:I

    .line 222
    .line 223
    return-void

    .line 224
    :cond_df
    :goto_df
    const-string v1, "stripByteCounts should not be null or have zero length."

    .line 225
    .line 226
    invoke-static {v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :cond_e5
    :goto_e5
    const-string v1, "stripOffsets should not be null or have zero length."

    .line 231
    .line 232
    invoke-static {v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 233
    .line 234
    .line 235
    :cond_ea
    return-void
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private I(Ljava/lang/String;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_2e

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lax/y0/a;->c:Landroid/content/res/AssetManager$AssetInputStream;

    .line 5
    .line 6
    iput-object p1, p0, Lax/y0/a;->a:Ljava/lang/String;

    .line 7
    .line 8
    :try_start_7
    new-instance v1, Ljava/io/FileInputStream;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_7 .. :try_end_c} :catchall_29

    .line 11
    .line 12
    .line 13
    :try_start_c
    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Lax/y0/a;->P(Ljava/io/FileDescriptor;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_20

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lax/y0/a;->b:Ljava/io/FileDescriptor;

    .line 28
    .line 29
    goto :goto_22

    .line 30
    :catchall_1d
    move-exception p1

    .line 31
    move-object v0, v1

    .line 32
    goto :goto_2a

    .line 33
    :cond_20
    iput-object v0, p0, Lax/y0/a;->b:Ljava/io/FileDescriptor;

    .line 34
    .line 35
    :goto_22
    invoke-direct {p0, v1}, Lax/y0/a;->V(Ljava/io/InputStream;)V
    :try_end_25
    .catchall {:try_start_c .. :try_end_25} :catchall_1d

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_29
    move-exception p1

    .line 43
    :goto_2a
    invoke-static {v0}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_2e
    new-instance p1, Ljava/lang/NullPointerException;

    .line 48
    .line 49
    const-string v0, "filename cannot be null"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private J([B)I
    .registers 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_2
    new-instance v2, Lax/y0/a$b;

    .line 4
    .line 5
    invoke-direct {v2, p1}, Lax/y0/a$b;-><init>([B)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_7} :catch_a9
    .catchall {:try_start_2 .. :try_end_7} :catchall_a7

    .line 6
    .line 7
    .line 8
    :try_start_7
    invoke-virtual {v2}, Lax/y0/a$b;->readInt()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    int-to-long v3, v1

    .line 13
    const/4 v1, 0x4

    .line 14
    new-array v5, v1, [B

    .line 15
    .line 16
    invoke-virtual {v2, v5}, Lax/y0/a$b;->readFully([B)V

    .line 17
    .line 18
    .line 19
    sget-object v6, Lax/y0/a;->E:[B

    .line 20
    .line 21
    invoke-static {v5, v6}, Ljava/util/Arrays;->equals([B[B)Z

    .line 22
    .line 23
    .line 24
    move-result v5
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_18} :catch_38
    .catchall {:try_start_7 .. :try_end_18} :catchall_34

    .line 25
    if-nez v5, :cond_1e

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 28
    .line 29
    .line 30
    return v0

    .line 31
    :cond_1e
    const-wide/16 v5, 0x8

    .line 32
    .line 33
    const-wide/16 v7, 0x1

    .line 34
    .line 35
    cmp-long v9, v3, v7

    .line 36
    .line 37
    if-nez v9, :cond_3c

    .line 38
    .line 39
    :try_start_26
    invoke-virtual {v2}, Lax/y0/a$b;->readLong()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3
    :try_end_2a
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_2a} :catch_38
    .catchall {:try_start_26 .. :try_end_2a} :catchall_34

    .line 43
    const-wide/16 v9, 0x10

    .line 44
    .line 45
    cmp-long v11, v3, v9

    .line 46
    .line 47
    if-gez v11, :cond_3d

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 50
    .line 51
    .line 52
    return v0

    .line 53
    :catchall_34
    move-exception p1

    .line 54
    move-object v1, v2

    .line 55
    goto/16 :goto_bb

    .line 56
    .line 57
    :catch_38
    move-exception p1

    .line 58
    move-object v1, v2

    .line 59
    goto/16 :goto_aa

    .line 60
    .line 61
    :cond_3c
    move-wide v9, v5

    .line 62
    :cond_3d
    :try_start_3d
    array-length v11, p1

    .line 63
    int-to-long v11, v11

    .line 64
    cmp-long v13, v3, v11

    .line 65
    .line 66
    if-lez v13, :cond_45

    .line 67
    .line 68
    array-length p1, p1
    :try_end_44
    .catch Ljava/lang/Exception; {:try_start_3d .. :try_end_44} :catch_38
    .catchall {:try_start_3d .. :try_end_44} :catchall_34

    .line 69
    int-to-long v3, p1

    .line 70
    :cond_45
    sub-long/2addr v3, v9

    .line 71
    cmp-long p1, v3, v5

    .line 72
    .line 73
    if-gez p1, :cond_4e

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 76
    .line 77
    .line 78
    return v0

    .line 79
    :cond_4e
    :try_start_4e
    new-array p1, v1, [B

    .line 80
    .line 81
    const-wide/16 v5, 0x0

    .line 82
    .line 83
    const/4 v1, 0x0

    .line 84
    const/4 v9, 0x0

    .line 85
    const/4 v10, 0x0

    .line 86
    :goto_55
    const-wide/16 v11, 0x4

    .line 87
    .line 88
    div-long v11, v3, v11
    :try_end_59
    .catch Ljava/lang/Exception; {:try_start_4e .. :try_end_59} :catch_38
    .catchall {:try_start_4e .. :try_end_59} :catchall_34

    .line 89
    .line 90
    cmp-long v13, v5, v11

    .line 91
    .line 92
    if-gez v13, :cond_a3

    .line 93
    .line 94
    :try_start_5d
    invoke-virtual {v2, p1}, Lax/y0/a$b;->readFully([B)V
    :try_end_60
    .catch Ljava/io/EOFException; {:try_start_5d .. :try_end_60} :catch_9f
    .catch Ljava/lang/Exception; {:try_start_5d .. :try_end_60} :catch_38
    .catchall {:try_start_5d .. :try_end_60} :catchall_34

    .line 95
    .line 96
    .line 97
    cmp-long v11, v5, v7

    .line 98
    .line 99
    if-nez v11, :cond_65

    .line 100
    .line 101
    goto :goto_9d

    .line 102
    :cond_65
    :try_start_65
    sget-object v11, Lax/y0/a;->F:[B

    .line 103
    .line 104
    invoke-static {p1, v11}, Ljava/util/Arrays;->equals([B[B)Z

    .line 105
    .line 106
    .line 107
    move-result v11

    .line 108
    const/4 v12, 0x1

    .line 109
    if-eqz v11, :cond_70

    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    goto :goto_8b

    .line 113
    :cond_70
    sget-object v11, Lax/y0/a;->G:[B

    .line 114
    .line 115
    invoke-static {p1, v11}, Ljava/util/Arrays;->equals([B[B)Z

    .line 116
    .line 117
    .line 118
    move-result v11

    .line 119
    if-eqz v11, :cond_7a

    .line 120
    .line 121
    const/4 v9, 0x1

    .line 122
    goto :goto_8b

    .line 123
    :cond_7a
    sget-object v11, Lax/y0/a;->H:[B

    .line 124
    .line 125
    invoke-static {p1, v11}, Ljava/util/Arrays;->equals([B[B)Z

    .line 126
    .line 127
    .line 128
    move-result v11

    .line 129
    if-nez v11, :cond_8a

    .line 130
    .line 131
    sget-object v11, Lax/y0/a;->I:[B

    .line 132
    .line 133
    invoke-static {p1, v11}, Ljava/util/Arrays;->equals([B[B)Z

    .line 134
    .line 135
    .line 136
    move-result v11
    :try_end_88
    .catch Ljava/lang/Exception; {:try_start_65 .. :try_end_88} :catch_38
    .catchall {:try_start_65 .. :try_end_88} :catchall_34

    .line 137
    if-eqz v11, :cond_8b

    .line 138
    .line 139
    :cond_8a
    const/4 v10, 0x1

    .line 140
    :cond_8b
    :goto_8b
    if-eqz v1, :cond_9d

    .line 141
    .line 142
    if-eqz v9, :cond_95

    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 145
    .line 146
    .line 147
    const/16 p1, 0xc

    .line 148
    .line 149
    return p1

    .line 150
    :cond_95
    if-eqz v10, :cond_9d

    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 153
    .line 154
    .line 155
    const/16 p1, 0xf

    .line 156
    .line 157
    return p1

    .line 158
    :cond_9d
    :goto_9d
    add-long/2addr v5, v7

    .line 159
    goto :goto_55

    .line 160
    :catch_9f
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 161
    .line 162
    .line 163
    return v0

    .line 164
    :cond_a3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 165
    .line 166
    .line 167
    goto :goto_ba

    .line 168
    :catchall_a7
    move-exception p1

    .line 169
    goto :goto_bb

    .line 170
    :catch_a9
    move-exception p1

    .line 171
    :goto_aa
    :try_start_aa
    sget-boolean v2, Lax/y0/a;->x:Z

    .line 172
    .line 173
    if-eqz v2, :cond_b5

    .line 174
    .line 175
    const-string v2, "ExifInterface"

    .line 176
    .line 177
    const-string v3, "Exception parsing HEIF file type box."

    .line 178
    .line 179
    invoke-static {v2, v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_b5
    .catchall {:try_start_aa .. :try_end_b5} :catchall_a7

    .line 180
    .line 181
    .line 182
    :cond_b5
    if-eqz v1, :cond_ba

    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 185
    .line 186
    .line 187
    :cond_ba
    :goto_ba
    return v0

    .line 188
    :goto_bb
    if-eqz v1, :cond_c0

    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 191
    .line 192
    .line 193
    :cond_c0
    throw p1
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method private static K([B)Z
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    sget-object v2, Lax/y0/a;->D:[B

    .line 4
    .line 5
    array-length v3, v2

    .line 6
    if-ge v1, v3, :cond_11

    .line 7
    .line 8
    aget-byte v3, p0, v1

    .line 9
    .line 10
    aget-byte v2, v2, v1

    .line 11
    .line 12
    if-eq v3, v2, :cond_e

    .line 13
    .line 14
    return v0

    .line 15
    :cond_e
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_11
    const/4 p0, 0x1

    .line 19
    return p0
    .line 20
    .line 21
    .line 22
.end method

.method private L([B)Z
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_2
    new-instance v2, Lax/y0/a$b;

    .line 4
    .line 5
    invoke-direct {v2, p1}, Lax/y0/a$b;-><init>([B)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_7} :catch_29
    .catchall {:try_start_2 .. :try_end_7} :catchall_27

    .line 6
    .line 7
    .line 8
    :try_start_7
    invoke-direct {p0, v2}, Lax/y0/a;->Z(Lax/y0/a$b;)Ljava/nio/ByteOrder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 13
    .line 14
    invoke-virtual {v2, p1}, Lax/y0/a$b;->e(Ljava/nio/ByteOrder;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lax/y0/a$b;->readShort()S

    .line 18
    .line 19
    .line 20
    move-result p1
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_14} :catch_24
    .catchall {:try_start_7 .. :try_end_14} :catchall_21

    .line 21
    const/16 v1, 0x4f52

    .line 22
    .line 23
    if-eq p1, v1, :cond_1c

    .line 24
    .line 25
    const/16 v1, 0x5352

    .line 26
    .line 27
    if-ne p1, v1, :cond_1d

    .line 28
    .line 29
    :cond_1c
    const/4 v0, 0x1

    .line 30
    :cond_1d
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 31
    .line 32
    .line 33
    return v0

    .line 34
    :catchall_21
    move-exception p1

    .line 35
    move-object v1, v2

    .line 36
    goto :goto_2b

    .line 37
    :catch_24
    nop

    .line 38
    move-object v1, v2

    .line 39
    goto :goto_31

    .line 40
    :catchall_27
    move-exception p1

    .line 41
    goto :goto_2b

    .line 42
    :catch_29
    nop

    .line 43
    goto :goto_31

    .line 44
    :goto_2b
    if-eqz v1, :cond_30

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 47
    .line 48
    .line 49
    :cond_30
    throw p1

    .line 50
    :goto_31
    if-eqz v1, :cond_36

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 53
    .line 54
    .line 55
    :cond_36
    return v0
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private M([B)Z
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    sget-object v2, Lax/y0/a;->L:[B

    .line 4
    .line 5
    array-length v3, v2

    .line 6
    if-ge v1, v3, :cond_11

    .line 7
    .line 8
    aget-byte v3, p1, v1

    .line 9
    .line 10
    aget-byte v2, v2, v1

    .line 11
    .line 12
    if-eq v3, v2, :cond_e

    .line 13
    .line 14
    return v0

    .line 15
    :cond_e
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_11
    const/4 p1, 0x1

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
.end method

.method private N([B)Z
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "FUJIFILMCCD-RAW"

    .line 2
    .line 3
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_c
    array-length v3, v0

    .line 14
    if-ge v2, v3, :cond_19

    .line 15
    .line 16
    aget-byte v3, p1, v2

    .line 17
    .line 18
    aget-byte v4, v0, v2

    .line 19
    .line 20
    if-eq v3, v4, :cond_16

    .line 21
    .line 22
    return v1

    .line 23
    :cond_16
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_c

    .line 26
    :cond_19
    const/4 p1, 0x1

    .line 27
    return p1
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private O([B)Z
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_2
    new-instance v2, Lax/y0/a$b;

    .line 4
    .line 5
    invoke-direct {v2, p1}, Lax/y0/a$b;-><init>([B)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_7} :catch_25
    .catchall {:try_start_2 .. :try_end_7} :catchall_23

    .line 6
    .line 7
    .line 8
    :try_start_7
    invoke-direct {p0, v2}, Lax/y0/a;->Z(Lax/y0/a$b;)Ljava/nio/ByteOrder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 13
    .line 14
    invoke-virtual {v2, p1}, Lax/y0/a$b;->e(Ljava/nio/ByteOrder;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lax/y0/a$b;->readShort()S

    .line 18
    .line 19
    .line 20
    move-result p1
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_14} :catch_20
    .catchall {:try_start_7 .. :try_end_14} :catchall_1d

    .line 21
    const/16 v1, 0x55

    .line 22
    .line 23
    if-ne p1, v1, :cond_19

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    :cond_19
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 27
    .line 28
    .line 29
    return v0

    .line 30
    :catchall_1d
    move-exception p1

    .line 31
    move-object v1, v2

    .line 32
    goto :goto_27

    .line 33
    :catch_20
    nop

    .line 34
    move-object v1, v2

    .line 35
    goto :goto_2d

    .line 36
    :catchall_23
    move-exception p1

    .line 37
    goto :goto_27

    .line 38
    :catch_25
    nop

    .line 39
    goto :goto_2d

    .line 40
    :goto_27
    if-eqz v1, :cond_2c

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 43
    .line 44
    .line 45
    :cond_2c
    throw p1

    .line 46
    :goto_2d
    if-eqz v1, :cond_32

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 49
    .line 50
    .line 51
    :cond_32
    return v0
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static P(Ljava/io/FileDescriptor;)Z
    .registers 4

    .line 1
    :try_start_0
    sget v0, Landroid/system/OsConstants;->SEEK_CUR:I

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-static {p0, v1, v2, v0}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_7} :catch_9

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :catch_9
    nop

    .line 11
    sget-boolean p0, Lax/y0/a;->x:Z

    .line 12
    .line 13
    if-eqz p0, :cond_15

    .line 14
    .line 15
    const-string p0, "ExifInterface"

    .line 16
    .line 17
    const-string v0, "The file descriptor for the given input is not seekable"

    .line 18
    .line 19
    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    :cond_15
    const/4 p0, 0x0

    .line 23
    return p0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private Q(Ljava/util/HashMap;)Z
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lax/y0/a$d;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "BitsPerSample"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/y0/a$d;

    .line 8
    .line 9
    if-eqz v0, :cond_45

    .line 10
    .line 11
    iget-object v1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lax/y0/a$d;->o(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, [I

    .line 18
    .line 19
    sget-object v1, Lax/y0/a;->A:[I

    .line 20
    .line 21
    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([I[I)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x1

    .line 26
    if-eqz v2, :cond_1c

    .line 27
    .line 28
    return v3

    .line 29
    :cond_1c
    iget v2, p0, Lax/y0/a;->d:I

    .line 30
    .line 31
    const/4 v4, 0x3

    .line 32
    if-ne v2, v4, :cond_45

    .line 33
    .line 34
    const-string v2, "PhotometricInterpretation"

    .line 35
    .line 36
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lax/y0/a$d;

    .line 41
    .line 42
    if-eqz p1, :cond_45

    .line 43
    .line 44
    iget-object v2, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 45
    .line 46
    invoke-virtual {p1, v2}, Lax/y0/a$d;->m(Ljava/nio/ByteOrder;)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-ne p1, v3, :cond_3b

    .line 51
    .line 52
    sget-object v2, Lax/y0/a;->C:[I

    .line 53
    .line 54
    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([I[I)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_44

    .line 59
    .line 60
    :cond_3b
    const/4 v2, 0x6

    .line 61
    if-ne p1, v2, :cond_45

    .line 62
    .line 63
    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([I[I)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_45

    .line 68
    .line 69
    :cond_44
    return v3

    .line 70
    :cond_45
    sget-boolean p1, Lax/y0/a;->x:Z

    .line 71
    .line 72
    if-eqz p1, :cond_50

    .line 73
    .line 74
    const-string p1, "ExifInterface"

    .line 75
    .line 76
    const-string v0, "Unsupported data type value"

    .line 77
    .line 78
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    :cond_50
    const/4 p1, 0x0

    .line 82
    return p1
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method private static R(I)Z
    .registers 2

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eq p0, v0, :cond_e

    .line 3
    .line 4
    const/16 v0, 0xd

    .line 5
    .line 6
    if-eq p0, v0, :cond_e

    .line 7
    .line 8
    const/16 v0, 0xe

    .line 9
    .line 10
    if-ne p0, v0, :cond_c

    .line 11
    .line 12
    goto :goto_e

    .line 13
    :cond_c
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_e
    :goto_e
    const/4 p0, 0x1

    .line 16
    return p0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static S(Ljava/lang/String;)Z
    .registers 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p0, :cond_d5

    .line 4
    .line 5
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-virtual {p0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 v2, -0x1

    .line 15
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    sparse-switch v3, :sswitch_data_de

    .line 20
    .line 21
    .line 22
    goto/16 :goto_d0

    .line 23
    .line 24
    :sswitch_17
    const-string v3, "image/x-canon-cr2"

    .line 25
    .line 26
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_21

    .line 31
    .line 32
    goto/16 :goto_d0

    .line 33
    .line 34
    :cond_21
    const/16 v2, 0xe

    .line 35
    .line 36
    goto/16 :goto_d0

    .line 37
    .line 38
    :sswitch_25
    const-string v3, "image/x-nikon-nrw"

    .line 39
    .line 40
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-nez p0, :cond_2f

    .line 45
    .line 46
    goto/16 :goto_d0

    .line 47
    .line 48
    :cond_2f
    const/16 v2, 0xd

    .line 49
    .line 50
    goto/16 :goto_d0

    .line 51
    .line 52
    :sswitch_33
    const-string v3, "image/x-nikon-nef"

    .line 53
    .line 54
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-nez p0, :cond_3d

    .line 59
    .line 60
    goto/16 :goto_d0

    .line 61
    .line 62
    :cond_3d
    const/16 v2, 0xc

    .line 63
    .line 64
    goto/16 :goto_d0

    .line 65
    .line 66
    :sswitch_41
    const-string v3, "image/x-olympus-orf"

    .line 67
    .line 68
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-nez p0, :cond_4b

    .line 73
    .line 74
    goto/16 :goto_d0

    .line 75
    .line 76
    :cond_4b
    const/16 v2, 0xb

    .line 77
    .line 78
    goto/16 :goto_d0

    .line 79
    .line 80
    :sswitch_4f
    const-string v3, "image/x-pentax-pef"

    .line 81
    .line 82
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-nez p0, :cond_59

    .line 87
    .line 88
    goto/16 :goto_d0

    .line 89
    .line 90
    :cond_59
    const/16 v2, 0xa

    .line 91
    .line 92
    goto/16 :goto_d0

    .line 93
    .line 94
    :sswitch_5d
    const-string v3, "image/png"

    .line 95
    .line 96
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-nez p0, :cond_67

    .line 101
    .line 102
    goto/16 :goto_d0

    .line 103
    .line 104
    :cond_67
    const/16 v2, 0x9

    .line 105
    .line 106
    goto/16 :goto_d0

    .line 107
    .line 108
    :sswitch_6b
    const-string v3, "image/x-panasonic-rw2"

    .line 109
    .line 110
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-nez p0, :cond_75

    .line 115
    .line 116
    goto/16 :goto_d0

    .line 117
    .line 118
    :cond_75
    const/16 v2, 0x8

    .line 119
    .line 120
    goto/16 :goto_d0

    .line 121
    .line 122
    :sswitch_79
    const-string v3, "image/x-adobe-dng"

    .line 123
    .line 124
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-nez p0, :cond_82

    .line 129
    .line 130
    goto :goto_d0

    .line 131
    :cond_82
    const/4 v2, 0x7

    .line 132
    goto :goto_d0

    .line 133
    :sswitch_84
    const-string v3, "image/webp"

    .line 134
    .line 135
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-nez p0, :cond_8d

    .line 140
    .line 141
    goto :goto_d0

    .line 142
    :cond_8d
    const/4 v2, 0x6

    .line 143
    goto :goto_d0

    .line 144
    :sswitch_8f
    const-string v3, "image/jpeg"

    .line 145
    .line 146
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-nez p0, :cond_98

    .line 151
    .line 152
    goto :goto_d0

    .line 153
    :cond_98
    const/4 v2, 0x5

    .line 154
    goto :goto_d0

    .line 155
    :sswitch_9a
    const-string v3, "image/heif"

    .line 156
    .line 157
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    if-nez p0, :cond_a3

    .line 162
    .line 163
    goto :goto_d0

    .line 164
    :cond_a3
    const/4 v2, 0x4

    .line 165
    goto :goto_d0

    .line 166
    :sswitch_a5
    const-string v3, "image/heic"

    .line 167
    .line 168
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    if-nez p0, :cond_ae

    .line 173
    .line 174
    goto :goto_d0

    .line 175
    :cond_ae
    const/4 v2, 0x3

    .line 176
    goto :goto_d0

    .line 177
    :sswitch_b0
    const-string v3, "image/x-sony-arw"

    .line 178
    .line 179
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    if-nez p0, :cond_b9

    .line 184
    .line 185
    goto :goto_d0

    .line 186
    :cond_b9
    const/4 v2, 0x2

    .line 187
    goto :goto_d0

    .line 188
    :sswitch_bb
    const-string v3, "image/x-samsung-srw"

    .line 189
    .line 190
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result p0

    .line 194
    if-nez p0, :cond_c4

    .line 195
    .line 196
    goto :goto_d0

    .line 197
    :cond_c4
    const/4 v2, 0x1

    .line 198
    goto :goto_d0

    .line 199
    :sswitch_c6
    const-string v3, "image/x-fuji-raf"

    .line 200
    .line 201
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    if-nez p0, :cond_cf

    .line 206
    .line 207
    goto :goto_d0

    .line 208
    :cond_cf
    const/4 v2, 0x0

    .line 209
    :goto_d0
    packed-switch v2, :pswitch_data_11c

    .line 210
    .line 211
    .line 212
    return v1

    .line 213
    :pswitch_d4
    return v0

    .line 214
    :cond_d5
    new-instance p0, Ljava/lang/NullPointerException;

    .line 215
    .line 216
    const-string v0, "mimeType shouldn\'t be null"

    .line 217
    .line 218
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw p0

    .line 222
    nop

    .line 223
    :sswitch_data_de
    .sparse-switch
        -0x6fc6acff -> :sswitch_c6
        -0x617ac9e4 -> :sswitch_bb
        -0x5f082c57 -> :sswitch_b0
        -0x58a8e8f5 -> :sswitch_a5
        -0x58a8e8f2 -> :sswitch_9a
        -0x58a7d764 -> :sswitch_8f
        -0x58a21830 -> :sswitch_84
        -0x54d6098a -> :sswitch_79
        -0x3ab85cc1 -> :sswitch_6b
        -0x34686c8b -> :sswitch_5d
        -0x13d592a1 -> :sswitch_4f
        0x52243d4a -> :sswitch_41
        0x7d1e84e8 -> :sswitch_33
        0x7d1e868c -> :sswitch_25
        0x7dd6e2bc -> :sswitch_17
    .end sparse-switch

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    :pswitch_data_11c
    .packed-switch 0x0
        :pswitch_d4
        :pswitch_d4
        :pswitch_d4
        :pswitch_d4
        :pswitch_d4
        :pswitch_d4
        :pswitch_d4
        :pswitch_d4
        :pswitch_d4
        :pswitch_d4
        :pswitch_d4
        :pswitch_d4
        :pswitch_d4
        :pswitch_d4
        :pswitch_d4
    .end packed-switch
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method private T(Ljava/util/HashMap;)Z
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lax/y0/a$d;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "ImageLength"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/y0/a$d;

    .line 8
    .line 9
    const-string v1, "ImageWidth"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lax/y0/a$d;

    .line 16
    .line 17
    if-eqz v0, :cond_28

    .line 18
    .line 19
    if-eqz p1, :cond_28

    .line 20
    .line 21
    iget-object v1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lax/y0/a$d;->m(Ljava/nio/ByteOrder;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Lax/y0/a$d;->m(Ljava/nio/ByteOrder;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/16 v1, 0x200

    .line 34
    .line 35
    if-gt v0, v1, :cond_28

    .line 36
    .line 37
    if-gt p1, v1, :cond_28

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_28
    const/4 p1, 0x0

    .line 42
    return p1
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private U([B)Z
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    sget-object v2, Lax/y0/a;->N:[B

    .line 4
    .line 5
    array-length v3, v2

    .line 6
    if-ge v1, v3, :cond_11

    .line 7
    .line 8
    aget-byte v3, p1, v1

    .line 9
    .line 10
    aget-byte v2, v2, v1

    .line 11
    .line 12
    if-eq v3, v2, :cond_e

    .line 13
    .line 14
    return v0

    .line 15
    :cond_e
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_11
    const/4 v1, 0x0

    .line 19
    :goto_12
    sget-object v2, Lax/y0/a;->O:[B

    .line 20
    .line 21
    array-length v3, v2

    .line 22
    if-ge v1, v3, :cond_27

    .line 23
    .line 24
    sget-object v3, Lax/y0/a;->N:[B

    .line 25
    .line 26
    array-length v3, v3

    .line 27
    add-int/2addr v3, v1

    .line 28
    add-int/lit8 v3, v3, 0x4

    .line 29
    .line 30
    aget-byte v3, p1, v3

    .line 31
    .line 32
    aget-byte v2, v2, v1

    .line 33
    .line 34
    if-eq v3, v2, :cond_24

    .line 35
    .line 36
    return v0

    .line 37
    :cond_24
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_12

    .line 40
    :cond_27
    const/4 p1, 0x1

    .line 41
    return p1
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private V(Ljava/io/InputStream;)V
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    :try_start_2
    sget-object v2, Lax/y0/a;->l0:[[Lax/y0/a$e;

    .line 4
    .line 5
    array-length v2, v2

    .line 6
    if-ge v1, v2, :cond_1c

    .line 7
    .line 8
    iget-object v2, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 9
    .line 10
    new-instance v3, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    aput-object v3, v2, v1

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :catchall_13
    move-exception p1

    .line 21
    goto/16 :goto_bf

    .line 22
    .line 23
    :catch_16
    move-exception p1

    .line 24
    goto/16 :goto_ab

    .line 25
    .line 26
    :catch_19
    move-exception p1

    .line 27
    goto/16 :goto_ab

    .line 28
    .line 29
    :cond_1c
    iget-boolean v1, p0, Lax/y0/a;->e:Z

    .line 30
    .line 31
    if-nez v1, :cond_2e

    .line 32
    .line 33
    new-instance v1, Ljava/io/BufferedInputStream;

    .line 34
    .line 35
    const/16 v2, 0x1388

    .line 36
    .line 37
    invoke-direct {v1, p1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0, v1}, Lax/y0/a;->t(Ljava/io/BufferedInputStream;)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    iput p1, p0, Lax/y0/a;->d:I

    .line 45
    .line 46
    move-object p1, v1

    .line 47
    :cond_2e
    iget v1, p0, Lax/y0/a;->d:I

    .line 48
    .line 49
    invoke-static {v1}, Lax/y0/a;->o0(I)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_7b

    .line 54
    .line 55
    new-instance v0, Lax/y0/a$g;

    .line 56
    .line 57
    invoke-direct {v0, p1}, Lax/y0/a$g;-><init>(Ljava/io/InputStream;)V

    .line 58
    .line 59
    .line 60
    iget-boolean p1, p0, Lax/y0/a;->e:Z

    .line 61
    .line 62
    if-eqz p1, :cond_50

    .line 63
    .line 64
    invoke-direct {p0, v0}, Lax/y0/a;->A(Lax/y0/a$g;)Z

    .line 65
    .line 66
    .line 67
    move-result p1
    :try_end_43
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_43} :catch_19
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_2 .. :try_end_43} :catch_16
    .catchall {:try_start_2 .. :try_end_43} :catchall_13

    .line 68
    if-nez p1, :cond_71

    .line 69
    .line 70
    invoke-direct {p0}, Lax/y0/a;->e()V

    .line 71
    .line 72
    .line 73
    sget-boolean p1, Lax/y0/a;->x:Z

    .line 74
    .line 75
    if-eqz p1, :cond_be

    .line 76
    .line 77
    invoke-direct {p0}, Lax/y0/a;->Y()V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_50
    :try_start_50
    iget p1, p0, Lax/y0/a;->d:I

    .line 82
    .line 83
    const/16 v1, 0xc

    .line 84
    .line 85
    if-eq p1, v1, :cond_6e

    .line 86
    .line 87
    const/16 v1, 0xf

    .line 88
    .line 89
    if-ne p1, v1, :cond_5b

    .line 90
    .line 91
    goto :goto_6e

    .line 92
    :cond_5b
    const/4 v1, 0x7

    .line 93
    if-ne p1, v1, :cond_62

    .line 94
    .line 95
    invoke-direct {p0, v0}, Lax/y0/a;->u(Lax/y0/a$g;)V

    .line 96
    .line 97
    .line 98
    goto :goto_71

    .line 99
    :cond_62
    const/16 v1, 0xa

    .line 100
    .line 101
    if-ne p1, v1, :cond_6a

    .line 102
    .line 103
    invoke-direct {p0, v0}, Lax/y0/a;->z(Lax/y0/a$g;)V

    .line 104
    .line 105
    .line 106
    goto :goto_71

    .line 107
    :cond_6a
    invoke-direct {p0, v0}, Lax/y0/a;->x(Lax/y0/a$g;)V

    .line 108
    .line 109
    .line 110
    goto :goto_71

    .line 111
    :cond_6e
    :goto_6e
    invoke-direct {p0, v0, p1}, Lax/y0/a;->q(Lax/y0/a$g;I)V

    .line 112
    .line 113
    .line 114
    :cond_71
    :goto_71
    iget p1, p0, Lax/y0/a;->q:I

    .line 115
    .line 116
    int-to-long v1, p1

    .line 117
    invoke-virtual {v0, v1, v2}, Lax/y0/a$g;->g(J)V

    .line 118
    .line 119
    .line 120
    invoke-direct {p0, v0}, Lax/y0/a;->n0(Lax/y0/a$b;)V

    .line 121
    .line 122
    .line 123
    goto :goto_a0

    .line 124
    :cond_7b
    new-instance v1, Lax/y0/a$b;

    .line 125
    .line 126
    invoke-direct {v1, p1}, Lax/y0/a$b;-><init>(Ljava/io/InputStream;)V

    .line 127
    .line 128
    .line 129
    iget p1, p0, Lax/y0/a;->d:I

    .line 130
    .line 131
    const/4 v2, 0x4

    .line 132
    if-ne p1, v2, :cond_89

    .line 133
    .line 134
    invoke-direct {p0, v1, v0, v0}, Lax/y0/a;->r(Lax/y0/a$b;II)V

    .line 135
    .line 136
    .line 137
    goto :goto_a0

    .line 138
    :cond_89
    const/16 v0, 0xd

    .line 139
    .line 140
    if-ne p1, v0, :cond_91

    .line 141
    .line 142
    invoke-direct {p0, v1}, Lax/y0/a;->v(Lax/y0/a$b;)V

    .line 143
    .line 144
    .line 145
    goto :goto_a0

    .line 146
    :cond_91
    const/16 v0, 0x9

    .line 147
    .line 148
    if-ne p1, v0, :cond_99

    .line 149
    .line 150
    invoke-direct {p0, v1}, Lax/y0/a;->w(Lax/y0/a$b;)V

    .line 151
    .line 152
    .line 153
    goto :goto_a0

    .line 154
    :cond_99
    const/16 v0, 0xe

    .line 155
    .line 156
    if-ne p1, v0, :cond_a0

    .line 157
    .line 158
    invoke-direct {p0, v1}, Lax/y0/a;->D(Lax/y0/a$b;)V
    :try_end_a0
    .catch Ljava/io/IOException; {:try_start_50 .. :try_end_a0} :catch_19
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_50 .. :try_end_a0} :catch_16
    .catchall {:try_start_50 .. :try_end_a0} :catchall_13

    .line 159
    .line 160
    .line 161
    :cond_a0
    :goto_a0
    invoke-direct {p0}, Lax/y0/a;->e()V

    .line 162
    .line 163
    .line 164
    sget-boolean p1, Lax/y0/a;->x:Z

    .line 165
    .line 166
    if-eqz p1, :cond_be

    .line 167
    .line 168
    invoke-direct {p0}, Lax/y0/a;->Y()V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :goto_ab
    :try_start_ab
    sget-boolean v0, Lax/y0/a;->x:Z

    .line 173
    .line 174
    if-eqz v0, :cond_b6

    .line 175
    .line 176
    const-string v1, "ExifInterface"

    .line 177
    .line 178
    const-string v2, "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."

    .line 179
    .line 180
    invoke-static {v1, v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_b6
    .catchall {:try_start_ab .. :try_end_b6} :catchall_13

    .line 181
    .line 182
    .line 183
    :cond_b6
    invoke-direct {p0}, Lax/y0/a;->e()V

    .line 184
    .line 185
    .line 186
    if-eqz v0, :cond_be

    .line 187
    .line 188
    invoke-direct {p0}, Lax/y0/a;->Y()V

    .line 189
    .line 190
    .line 191
    :cond_be
    return-void

    .line 192
    :goto_bf
    invoke-direct {p0}, Lax/y0/a;->e()V

    .line 193
    .line 194
    .line 195
    sget-boolean v0, Lax/y0/a;->x:Z

    .line 196
    .line 197
    if-eqz v0, :cond_c9

    .line 198
    .line 199
    invoke-direct {p0}, Lax/y0/a;->Y()V

    .line 200
    .line 201
    .line 202
    :cond_c9
    throw p1
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method private static W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;
    .registers 13

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_86

    .line 3
    .line 4
    sget-object v1, Lax/y0/a;->u0:Ljava/util/regex/Pattern;

    .line 5
    .line 6
    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_11

    .line 15
    .line 16
    goto/16 :goto_86

    .line 17
    .line 18
    :cond_11
    new-instance v1, Ljava/text/ParsePosition;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, v2}, Ljava/text/ParsePosition;-><init>(I)V

    .line 22
    .line 23
    .line 24
    :try_start_17
    sget-object v3, Lax/y0/a;->W:Ljava/text/SimpleDateFormat;

    .line 25
    .line 26
    invoke-virtual {v3, p0, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-nez v3, :cond_28

    .line 31
    .line 32
    sget-object v3, Lax/y0/a;->X:Ljava/text/SimpleDateFormat;

    .line 33
    .line 34
    invoke-virtual {v3, p0, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    if-nez v3, :cond_28

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_28
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    if-eqz p2, :cond_7a

    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    invoke-virtual {p2, v2, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const/4 v2, 0x3

    .line 53
    invoke-virtual {p2, p0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    const/4 v6, 0x6

    .line 62
    const/4 v7, 0x4

    .line 63
    invoke-virtual {p2, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    const-string v8, "+"

    .line 72
    .line 73
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v8
    :try_end_4c
    .catch Ljava/lang/IllegalArgumentException; {:try_start_17 .. :try_end_4c} :catch_86

    .line 77
    const-string v9, "-"

    .line 78
    .line 79
    if-nez v8, :cond_56

    .line 80
    .line 81
    :try_start_50
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-eqz v8, :cond_7a

    .line 86
    .line 87
    :cond_56
    const-string v8, ":"

    .line 88
    .line 89
    invoke-virtual {p2, v2, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {v8, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    if-eqz p2, :cond_7a

    .line 98
    .line 99
    const/16 p2, 0xe

    .line 100
    .line 101
    if-gt v5, p2, :cond_7a

    .line 102
    .line 103
    mul-int/lit8 v5, v5, 0x3c

    .line 104
    .line 105
    add-int/2addr v5, v6

    .line 106
    const p2, 0xea60

    .line 107
    .line 108
    .line 109
    mul-int v5, v5, p2

    .line 110
    .line 111
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    if-eqz p2, :cond_75

    .line 116
    .line 117
    goto :goto_76

    .line 118
    :cond_75
    const/4 p0, -0x1

    .line 119
    :goto_76
    mul-int v5, v5, p0

    .line 120
    .line 121
    int-to-long v1, v5

    .line 122
    add-long/2addr v3, v1

    .line 123
    :cond_7a
    if-eqz p1, :cond_81

    .line 124
    .line 125
    invoke-static {p1}, Lax/y0/b;->f(Ljava/lang/String;)J

    .line 126
    .line 127
    .line 128
    move-result-wide p0

    .line 129
    add-long/2addr v3, p0

    .line 130
    :cond_81
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 131
    .line 132
    .line 133
    move-result-object p0
    :try_end_85
    .catch Ljava/lang/IllegalArgumentException; {:try_start_50 .. :try_end_85} :catch_86

    .line 134
    return-object p0

    .line 135
    :catch_86
    :cond_86
    :goto_86
    return-object v0
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method

.method private X(Lax/y0/a$b;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lax/y0/a;->Z(Lax/y0/a$b;)Ljava/nio/ByteOrder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lax/y0/a$b;->e(Ljava/nio/ByteOrder;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lax/y0/a$b;->readUnsignedShort()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v1, p0, Lax/y0/a;->d:I

    .line 15
    .line 16
    const/4 v2, 0x7

    .line 17
    if-eq v1, v2, :cond_36

    .line 18
    .line 19
    const/16 v2, 0xa

    .line 20
    .line 21
    if-eq v1, v2, :cond_36

    .line 22
    .line 23
    const/16 v1, 0x2a

    .line 24
    .line 25
    if-ne v0, v1, :cond_1b

    .line 26
    .line 27
    goto :goto_36

    .line 28
    :cond_1b
    new-instance p1, Ljava/io/IOException;

    .line 29
    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v2, "Invalid start code: "

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_36
    :goto_36
    invoke-virtual {p1}, Lax/y0/a$b;->readInt()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    const/16 v1, 0x8

    .line 60
    .line 61
    if-lt v0, v1, :cond_46

    .line 62
    .line 63
    add-int/lit8 v0, v0, -0x8

    .line 64
    .line 65
    if-lez v0, :cond_45

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lax/y0/a$b;->f(I)V

    .line 68
    .line 69
    .line 70
    :cond_45
    return-void

    .line 71
    :cond_46
    new-instance p1, Ljava/io/IOException;

    .line 72
    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v2, "Invalid first Ifd offset: "

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method private Y()V
    .registers 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    iget-object v1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 3
    .line 4
    array-length v1, v1

    .line 5
    if-ge v0, v1, :cond_88

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v2, "The size of tag group["

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, "]: "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 26
    .line 27
    aget-object v2, v2, v0

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v2, "ExifInterface"

    .line 41
    .line 42
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 46
    .line 47
    aget-object v1, v1, v0

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    :goto_38
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_84

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Ljava/util/Map$Entry;

    .line 68
    .line 69
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Lax/y0/a$d;

    .line 74
    .line 75
    new-instance v5, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v6, "tagName: "

    .line 81
    .line 82
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v3, ", tagType: "

    .line 95
    .line 96
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4}, Lax/y0/a$d;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v3, ", tagValue: \'"

    .line 107
    .line 108
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    iget-object v3, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 112
    .line 113
    invoke-virtual {v4, v3}, Lax/y0/a$d;->n(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v3, "\'"

    .line 121
    .line 122
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    goto :goto_38

    .line 133
    :cond_84
    add-int/lit8 v0, v0, 0x1

    .line 134
    .line 135
    goto/16 :goto_1

    .line 136
    .line 137
    :cond_88
    return-void
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method private Z(Lax/y0/a$b;)Ljava/nio/ByteOrder;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/y0/a$b;->readShort()S

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/16 v0, 0x4949

    .line 6
    .line 7
    const-string v1, "ExifInterface"

    .line 8
    .line 9
    if-eq p1, v0, :cond_35

    .line 10
    .line 11
    const/16 v0, 0x4d4d

    .line 12
    .line 13
    if-ne p1, v0, :cond_1a

    .line 14
    .line 15
    sget-boolean p1, Lax/y0/a;->x:Z

    .line 16
    .line 17
    if-eqz p1, :cond_17

    .line 18
    .line 19
    const-string p1, "readExifSegment: Byte Align MM"

    .line 20
    .line 21
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_17
    sget-object p1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1a
    new-instance v0, Ljava/io/IOException;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v2, "Invalid byte order: "

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_35
    sget-boolean p1, Lax/y0/a;->x:Z

    .line 55
    .line 56
    if-eqz p1, :cond_3e

    .line 57
    .line 58
    const-string p1, "readExifSegment: Byte Align II"

    .line 59
    .line 60
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    :cond_3e
    sget-object p1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 64
    .line 65
    return-object p1
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method static synthetic a()[I
    .registers 1

    .line 1
    sget-object v0, Lax/y0/a;->Z:[I

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private a0([BI)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/y0/a$g;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lax/y0/a$g;-><init>([B)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lax/y0/a;->X(Lax/y0/a$b;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0, p2}, Lax/y0/a;->b0(Lax/y0/a$g;I)V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method static synthetic b()Ljava/nio/charset/Charset;
    .registers 1

    .line 1
    sget-object v0, Lax/y0/a;->r0:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private b0(Lax/y0/a$g;I)V
    .registers 35
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    const/4 v5, 0x5

    .line 8
    iget-object v9, v0, Lax/y0/a;->h:Ljava/util/Set;

    .line 9
    .line 10
    invoke-virtual {v1}, Lax/y0/a$b;->b()I

    .line 11
    .line 12
    .line 13
    move-result v10

    .line 14
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v10

    .line 18
    invoke-interface {v9, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lax/y0/a$b;->readShort()S

    .line 22
    .line 23
    .line 24
    move-result v9

    .line 25
    sget-boolean v10, Lax/y0/a;->x:Z

    .line 26
    .line 27
    const-string v11, "ExifInterface"

    .line 28
    .line 29
    if-eqz v10, :cond_32

    .line 30
    .line 31
    new-instance v10, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v12, "numberOfDirectoryEntry: "

    .line 37
    .line 38
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v10

    .line 48
    invoke-static {v11, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    :cond_32
    if-gtz v9, :cond_36

    .line 52
    .line 53
    goto/16 :goto_3f0

    .line 54
    .line 55
    :cond_36
    const/4 v10, 0x0

    .line 56
    :goto_37
    if-ge v10, v9, :cond_36f

    .line 57
    .line 58
    invoke-virtual {v1}, Lax/y0/a$b;->readUnsignedShort()I

    .line 59
    .line 60
    .line 61
    move-result v14

    .line 62
    invoke-virtual {v1}, Lax/y0/a$b;->readUnsignedShort()I

    .line 63
    .line 64
    .line 65
    move-result v15

    .line 66
    const/16 v22, 0x0

    .line 67
    .line 68
    invoke-virtual {v1}, Lax/y0/a$b;->readInt()I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    const-wide/16 v16, 0x0

    .line 73
    .line 74
    invoke-virtual {v1}, Lax/y0/a$b;->b()I

    .line 75
    .line 76
    .line 77
    move-result v12

    .line 78
    int-to-long v12, v12

    .line 79
    const-wide/16 v18, 0x4

    .line 80
    .line 81
    add-long v12, v12, v18

    .line 82
    .line 83
    sget-object v20, Lax/y0/a;->n0:[Ljava/util/HashMap;

    .line 84
    .line 85
    const/16 v23, 0x1

    .line 86
    .line 87
    aget-object v8, v20, v2

    .line 88
    .line 89
    const/16 v24, 0x2

    .line 90
    .line 91
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {v8, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    check-cast v4, Lax/y0/a$e;

    .line 100
    .line 101
    sget-boolean v8, Lax/y0/a;->x:Z

    .line 102
    .line 103
    if-eqz v8, :cond_98

    .line 104
    .line 105
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v20

    .line 109
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v21

    .line 113
    const/16 v25, 0x4

    .line 114
    .line 115
    if-eqz v4, :cond_77

    .line 116
    .line 117
    iget-object v6, v4, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 118
    .line 119
    goto :goto_78

    .line 120
    :cond_77
    const/4 v6, 0x0

    .line 121
    :goto_78
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v26

    .line 125
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v27

    .line 129
    const/16 v28, 0x3

    .line 130
    .line 131
    new-array v3, v5, [Ljava/lang/Object;

    .line 132
    .line 133
    aput-object v20, v3, v22

    .line 134
    .line 135
    aput-object v21, v3, v23

    .line 136
    .line 137
    aput-object v6, v3, v24

    .line 138
    .line 139
    aput-object v26, v3, v28

    .line 140
    .line 141
    aput-object v27, v3, v25

    .line 142
    .line 143
    const-string v6, "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"

    .line 144
    .line 145
    invoke-static {v6, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-static {v11, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    goto :goto_9c

    .line 153
    :cond_98
    const/16 v25, 0x4

    .line 154
    .line 155
    const/16 v28, 0x3

    .line 156
    .line 157
    :goto_9c
    const/4 v3, 0x7

    .line 158
    if-nez v4, :cond_bd

    .line 159
    .line 160
    if-eqz v8, :cond_ba

    .line 161
    .line 162
    new-instance v6, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    .line 166
    .line 167
    const/16 v26, 0x5

    .line 168
    .line 169
    const-string v5, "Skip the tag entry since tag number is not defined: "

    .line 170
    .line 171
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    invoke-static {v11, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    :cond_b7
    :goto_b7
    move-object v6, v4

    .line 185
    goto/16 :goto_143

    .line 186
    .line 187
    :cond_ba
    const/16 v26, 0x5

    .line 188
    .line 189
    goto :goto_b7

    .line 190
    :cond_bd
    const/16 v26, 0x5

    .line 191
    .line 192
    if-lez v15, :cond_c6

    .line 193
    .line 194
    sget-object v5, Lax/y0/a;->Z:[I

    .line 195
    .line 196
    array-length v6, v5

    .line 197
    if-lt v15, v6, :cond_c8

    .line 198
    .line 199
    :cond_c6
    move-object v6, v4

    .line 200
    goto :goto_12d

    .line 201
    :cond_c8
    invoke-virtual {v4, v15}, Lax/y0/a$e;->a(I)Z

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    if-nez v6, :cond_f3

    .line 206
    .line 207
    if-eqz v8, :cond_b7

    .line 208
    .line 209
    new-instance v5, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 212
    .line 213
    .line 214
    const-string v6, "Skip the tag entry since data format ("

    .line 215
    .line 216
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    sget-object v6, Lax/y0/a;->Y:[Ljava/lang/String;

    .line 220
    .line 221
    aget-object v6, v6, v15

    .line 222
    .line 223
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    const-string v6, ") is unexpected for tag: "

    .line 227
    .line 228
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    iget-object v6, v4, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 232
    .line 233
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    invoke-static {v11, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 241
    .line 242
    .line 243
    goto :goto_b7

    .line 244
    :cond_f3
    if-ne v15, v3, :cond_f7

    .line 245
    .line 246
    iget v15, v4, Lax/y0/a$e;->c:I

    .line 247
    .line 248
    :cond_f7
    move-object v6, v4

    .line 249
    int-to-long v3, v7

    .line 250
    aget v5, v5, v15

    .line 251
    .line 252
    move-wide/from16 v29, v3

    .line 253
    .line 254
    int-to-long v3, v5

    .line 255
    mul-long v3, v3, v29

    .line 256
    .line 257
    cmp-long v5, v3, v16

    .line 258
    .line 259
    if-ltz v5, :cond_10e

    .line 260
    .line 261
    const-wide/32 v29, 0x7fffffff

    .line 262
    .line 263
    .line 264
    cmp-long v5, v3, v29

    .line 265
    .line 266
    if-lez v5, :cond_10c

    .line 267
    .line 268
    goto :goto_10e

    .line 269
    :cond_10c
    const/4 v5, 0x1

    .line 270
    goto :goto_146

    .line 271
    :cond_10e
    :goto_10e
    if-eqz v8, :cond_127

    .line 272
    .line 273
    new-instance v5, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 276
    .line 277
    .line 278
    move-wide/from16 v29, v3

    .line 279
    .line 280
    const-string v3, "Skip the tag entry since the number of components is invalid: "

    .line 281
    .line 282
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    invoke-static {v11, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 293
    .line 294
    .line 295
    goto :goto_129

    .line 296
    :cond_127
    move-wide/from16 v29, v3

    .line 297
    .line 298
    :goto_129
    move-wide/from16 v3, v29

    .line 299
    .line 300
    :goto_12b
    const/4 v5, 0x0

    .line 301
    goto :goto_146

    .line 302
    :goto_12d
    if-eqz v8, :cond_143

    .line 303
    .line 304
    new-instance v3, Ljava/lang/StringBuilder;

    .line 305
    .line 306
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 307
    .line 308
    .line 309
    const-string v4, "Skip the tag entry since data format is invalid: "

    .line 310
    .line 311
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    invoke-static {v11, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 322
    .line 323
    .line 324
    :cond_143
    :goto_143
    move-wide/from16 v3, v16

    .line 325
    .line 326
    goto :goto_12b

    .line 327
    :goto_146
    if-nez v5, :cond_152

    .line 328
    .line 329
    invoke-virtual {v1, v12, v13}, Lax/y0/a$g;->g(J)V

    .line 330
    .line 331
    .line 332
    move/from16 v27, v9

    .line 333
    .line 334
    move/from16 v29, v10

    .line 335
    .line 336
    :goto_14f
    const/4 v9, 0x3

    .line 337
    goto/16 :goto_365

    .line 338
    .line 339
    :cond_152
    const-string v5, "Compression"

    .line 340
    .line 341
    cmp-long v21, v3, v18

    .line 342
    .line 343
    if-lez v21, :cond_1e4

    .line 344
    .line 345
    move-object/from16 v18, v6

    .line 346
    .line 347
    invoke-virtual {v1}, Lax/y0/a$b;->readInt()I

    .line 348
    .line 349
    .line 350
    move-result v6

    .line 351
    move/from16 v19, v8

    .line 352
    .line 353
    if-eqz v8, :cond_179

    .line 354
    .line 355
    new-instance v8, Ljava/lang/StringBuilder;

    .line 356
    .line 357
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 358
    .line 359
    .line 360
    move/from16 v27, v9

    .line 361
    .line 362
    const-string v9, "seek to data offset: "

    .line 363
    .line 364
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v8

    .line 374
    invoke-static {v11, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 375
    .line 376
    .line 377
    goto :goto_17b

    .line 378
    :cond_179
    move/from16 v27, v9

    .line 379
    .line 380
    :goto_17b
    iget v8, v0, Lax/y0/a;->d:I

    .line 381
    .line 382
    const/4 v9, 0x7

    .line 383
    if-ne v8, v9, :cond_1d9

    .line 384
    .line 385
    move-object/from16 v8, v18

    .line 386
    .line 387
    iget-object v9, v8, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 388
    .line 389
    move/from16 v29, v10

    .line 390
    .line 391
    const-string v10, "MakerNote"

    .line 392
    .line 393
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v9

    .line 397
    if-eqz v9, :cond_193

    .line 398
    .line 399
    iput v6, v0, Lax/y0/a;->r:I

    .line 400
    .line 401
    :cond_190
    move-wide/from16 v30, v12

    .line 402
    .line 403
    goto :goto_1df

    .line 404
    :cond_193
    const/4 v9, 0x6

    .line 405
    if-ne v2, v9, :cond_190

    .line 406
    .line 407
    const-string v10, "ThumbnailImage"

    .line 408
    .line 409
    iget-object v9, v8, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 410
    .line 411
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v9

    .line 415
    if-eqz v9, :cond_190

    .line 416
    .line 417
    iput v6, v0, Lax/y0/a;->s:I

    .line 418
    .line 419
    iput v7, v0, Lax/y0/a;->t:I

    .line 420
    .line 421
    iget-object v9, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 422
    .line 423
    const/4 v10, 0x6

    .line 424
    invoke-static {v10, v9}, Lax/y0/a$d;->j(ILjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 425
    .line 426
    .line 427
    move-result-object v9

    .line 428
    iget v10, v0, Lax/y0/a;->s:I

    .line 429
    .line 430
    move-wide/from16 v30, v12

    .line 431
    .line 432
    int-to-long v12, v10

    .line 433
    iget-object v10, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 434
    .line 435
    invoke-static {v12, v13, v10}, Lax/y0/a$d;->f(JLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 436
    .line 437
    .line 438
    move-result-object v10

    .line 439
    iget v12, v0, Lax/y0/a;->t:I

    .line 440
    .line 441
    int-to-long v12, v12

    .line 442
    iget-object v2, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 443
    .line 444
    invoke-static {v12, v13, v2}, Lax/y0/a$d;->f(JLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    iget-object v12, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 449
    .line 450
    aget-object v12, v12, v25

    .line 451
    .line 452
    invoke-virtual {v12, v5, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    iget-object v9, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 456
    .line 457
    aget-object v9, v9, v25

    .line 458
    .line 459
    const-string v12, "JPEGInterchangeFormat"

    .line 460
    .line 461
    invoke-virtual {v9, v12, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    iget-object v9, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 465
    .line 466
    aget-object v9, v9, v25

    .line 467
    .line 468
    const-string v10, "JPEGInterchangeFormatLength"

    .line 469
    .line 470
    invoke-virtual {v9, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    goto :goto_1df

    .line 474
    :cond_1d9
    move/from16 v29, v10

    .line 475
    .line 476
    move-wide/from16 v30, v12

    .line 477
    .line 478
    move-object/from16 v8, v18

    .line 479
    .line 480
    :goto_1df
    int-to-long v9, v6

    .line 481
    invoke-virtual {v1, v9, v10}, Lax/y0/a$g;->g(J)V

    .line 482
    .line 483
    .line 484
    goto :goto_1ed

    .line 485
    :cond_1e4
    move/from16 v19, v8

    .line 486
    .line 487
    move/from16 v27, v9

    .line 488
    .line 489
    move/from16 v29, v10

    .line 490
    .line 491
    move-wide/from16 v30, v12

    .line 492
    .line 493
    move-object v8, v6

    .line 494
    :goto_1ed
    sget-object v2, Lax/y0/a;->q0:Ljava/util/HashMap;

    .line 495
    .line 496
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 497
    .line 498
    .line 499
    move-result-object v6

    .line 500
    invoke-virtual {v2, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    check-cast v2, Ljava/lang/Integer;

    .line 505
    .line 506
    if-eqz v19, :cond_217

    .line 507
    .line 508
    new-instance v6, Ljava/lang/StringBuilder;

    .line 509
    .line 510
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 511
    .line 512
    .line 513
    const-string v9, "nextIfdType: "

    .line 514
    .line 515
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    const-string v9, " byteCount: "

    .line 522
    .line 523
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v6

    .line 533
    invoke-static {v11, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 534
    .line 535
    .line 536
    :cond_217
    const/16 v6, 0x8

    .line 537
    .line 538
    if-eqz v2, :cond_2ec

    .line 539
    .line 540
    const/4 v9, 0x3

    .line 541
    if-eq v15, v9, :cond_23e

    .line 542
    .line 543
    const/4 v3, 0x4

    .line 544
    if-eq v15, v3, :cond_239

    .line 545
    .line 546
    if-eq v15, v6, :cond_234

    .line 547
    .line 548
    const/16 v3, 0x9

    .line 549
    .line 550
    if-eq v15, v3, :cond_22e

    .line 551
    .line 552
    const/16 v3, 0xd

    .line 553
    .line 554
    if-eq v15, v3, :cond_22e

    .line 555
    .line 556
    const-wide/16 v3, -0x1

    .line 557
    .line 558
    goto :goto_243

    .line 559
    :cond_22e
    invoke-virtual {v1}, Lax/y0/a$b;->readInt()I

    .line 560
    .line 561
    .line 562
    move-result v3

    .line 563
    :goto_232
    int-to-long v3, v3

    .line 564
    goto :goto_243

    .line 565
    :cond_234
    invoke-virtual {v1}, Lax/y0/a$b;->readShort()S

    .line 566
    .line 567
    .line 568
    move-result v3

    .line 569
    goto :goto_232

    .line 570
    :cond_239
    invoke-virtual {v1}, Lax/y0/a$b;->d()J

    .line 571
    .line 572
    .line 573
    move-result-wide v3

    .line 574
    goto :goto_243

    .line 575
    :cond_23e
    invoke-virtual {v1}, Lax/y0/a$b;->readUnsignedShort()I

    .line 576
    .line 577
    .line 578
    move-result v3

    .line 579
    goto :goto_232

    .line 580
    :goto_243
    if-eqz v19, :cond_25c

    .line 581
    .line 582
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 583
    .line 584
    .line 585
    move-result-object v5

    .line 586
    iget-object v6, v8, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 587
    .line 588
    const/4 v9, 0x2

    .line 589
    new-array v7, v9, [Ljava/lang/Object;

    .line 590
    .line 591
    aput-object v5, v7, v22

    .line 592
    .line 593
    aput-object v6, v7, v23

    .line 594
    .line 595
    const-string v5, "Offset: %d, tagName: %s"

    .line 596
    .line 597
    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v5

    .line 601
    invoke-static {v11, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 602
    .line 603
    .line 604
    goto :goto_25d

    .line 605
    :cond_25c
    const/4 v9, 0x2

    .line 606
    :goto_25d
    const-string v5, ")"

    .line 607
    .line 608
    const/4 v6, -0x1

    .line 609
    cmp-long v7, v3, v16

    .line 610
    .line 611
    if-lez v7, :cond_2af

    .line 612
    .line 613
    invoke-virtual {v1}, Lax/y0/a$b;->a()I

    .line 614
    .line 615
    .line 616
    move-result v7

    .line 617
    if-eq v7, v6, :cond_273

    .line 618
    .line 619
    invoke-virtual {v1}, Lax/y0/a$b;->a()I

    .line 620
    .line 621
    .line 622
    move-result v7

    .line 623
    int-to-long v7, v7

    .line 624
    cmp-long v10, v3, v7

    .line 625
    .line 626
    if-gez v10, :cond_2af

    .line 627
    .line 628
    :cond_273
    iget-object v6, v0, Lax/y0/a;->h:Ljava/util/Set;

    .line 629
    .line 630
    long-to-int v7, v3

    .line 631
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 632
    .line 633
    .line 634
    move-result-object v7

    .line 635
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 636
    .line 637
    .line 638
    move-result v6

    .line 639
    if-nez v6, :cond_28d

    .line 640
    .line 641
    invoke-virtual {v1, v3, v4}, Lax/y0/a$g;->g(J)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 645
    .line 646
    .line 647
    move-result v2

    .line 648
    invoke-direct {v0, v1, v2}, Lax/y0/a;->b0(Lax/y0/a$g;I)V

    .line 649
    .line 650
    .line 651
    :cond_28a
    :goto_28a
    move-wide/from16 v12, v30

    .line 652
    .line 653
    goto :goto_2e7

    .line 654
    :cond_28d
    if-eqz v19, :cond_28a

    .line 655
    .line 656
    new-instance v6, Ljava/lang/StringBuilder;

    .line 657
    .line 658
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 659
    .line 660
    .line 661
    const-string v7, "Skip jump into the IFD since it has already been read: IfdType "

    .line 662
    .line 663
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 667
    .line 668
    .line 669
    const-string v2, " (at "

    .line 670
    .line 671
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    invoke-static {v11, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 685
    .line 686
    .line 687
    goto :goto_28a

    .line 688
    :cond_2af
    if-eqz v19, :cond_28a

    .line 689
    .line 690
    new-instance v2, Ljava/lang/StringBuilder;

    .line 691
    .line 692
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 693
    .line 694
    .line 695
    const-string v7, "Skip jump into the IFD since its offset is invalid: "

    .line 696
    .line 697
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    invoke-virtual {v1}, Lax/y0/a$b;->a()I

    .line 708
    .line 709
    .line 710
    move-result v3

    .line 711
    if-eq v3, v6, :cond_2e3

    .line 712
    .line 713
    new-instance v3, Ljava/lang/StringBuilder;

    .line 714
    .line 715
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 719
    .line 720
    .line 721
    const-string v2, " (total length: "

    .line 722
    .line 723
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v1}, Lax/y0/a$b;->a()I

    .line 727
    .line 728
    .line 729
    move-result v2

    .line 730
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v2

    .line 740
    :cond_2e3
    invoke-static {v11, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 741
    .line 742
    .line 743
    goto :goto_28a

    .line 744
    :goto_2e7
    invoke-virtual {v1, v12, v13}, Lax/y0/a$g;->g(J)V

    .line 745
    .line 746
    .line 747
    goto/16 :goto_14f

    .line 748
    .line 749
    :cond_2ec
    move-wide/from16 v12, v30

    .line 750
    .line 751
    const/4 v9, 0x2

    .line 752
    invoke-virtual {v1}, Lax/y0/a$b;->b()I

    .line 753
    .line 754
    .line 755
    move-result v2

    .line 756
    iget v10, v0, Lax/y0/a;->q:I

    .line 757
    .line 758
    add-int/2addr v2, v10

    .line 759
    long-to-int v4, v3

    .line 760
    new-array v3, v4, [B

    .line 761
    .line 762
    invoke-virtual {v1, v3}, Lax/y0/a$b;->readFully([B)V

    .line 763
    .line 764
    .line 765
    new-instance v16, Lax/y0/a$d;

    .line 766
    .line 767
    int-to-long v9, v2

    .line 768
    move-object/from16 v21, v3

    .line 769
    .line 770
    move/from16 v18, v7

    .line 771
    .line 772
    move-wide/from16 v19, v9

    .line 773
    .line 774
    move/from16 v17, v15

    .line 775
    .line 776
    invoke-direct/range {v16 .. v21}, Lax/y0/a$d;-><init>(IIJ[B)V

    .line 777
    .line 778
    .line 779
    move-object/from16 v2, v16

    .line 780
    .line 781
    iget-object v3, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 782
    .line 783
    aget-object v3, v3, p2

    .line 784
    .line 785
    iget-object v4, v8, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 786
    .line 787
    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    const-string v3, "DNGVersion"

    .line 791
    .line 792
    iget-object v4, v8, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 793
    .line 794
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 795
    .line 796
    .line 797
    move-result v3

    .line 798
    const/4 v9, 0x3

    .line 799
    if-eqz v3, :cond_322

    .line 800
    .line 801
    iput v9, v0, Lax/y0/a;->d:I

    .line 802
    .line 803
    :cond_322
    const-string v3, "Make"

    .line 804
    .line 805
    iget-object v4, v8, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 806
    .line 807
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 808
    .line 809
    .line 810
    move-result v3

    .line 811
    if-nez v3, :cond_336

    .line 812
    .line 813
    const-string v3, "Model"

    .line 814
    .line 815
    iget-object v4, v8, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 816
    .line 817
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 818
    .line 819
    .line 820
    move-result v3

    .line 821
    if-eqz v3, :cond_344

    .line 822
    .line 823
    :cond_336
    iget-object v3, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 824
    .line 825
    invoke-virtual {v2, v3}, Lax/y0/a$d;->n(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v3

    .line 829
    const-string v4, "PENTAX"

    .line 830
    .line 831
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 832
    .line 833
    .line 834
    move-result v3

    .line 835
    if-nez v3, :cond_357

    .line 836
    .line 837
    :cond_344
    iget-object v3, v8, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 838
    .line 839
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 840
    .line 841
    .line 842
    move-result v3

    .line 843
    if-eqz v3, :cond_359

    .line 844
    .line 845
    iget-object v3, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 846
    .line 847
    invoke-virtual {v2, v3}, Lax/y0/a$d;->m(Ljava/nio/ByteOrder;)I

    .line 848
    .line 849
    .line 850
    move-result v2

    .line 851
    const v3, 0xffff

    .line 852
    .line 853
    .line 854
    if-ne v2, v3, :cond_359

    .line 855
    .line 856
    :cond_357
    iput v6, v0, Lax/y0/a;->d:I

    .line 857
    .line 858
    :cond_359
    invoke-virtual {v1}, Lax/y0/a$b;->b()I

    .line 859
    .line 860
    .line 861
    move-result v2

    .line 862
    int-to-long v2, v2

    .line 863
    cmp-long v4, v2, v12

    .line 864
    .line 865
    if-eqz v4, :cond_365

    .line 866
    .line 867
    invoke-virtual {v1, v12, v13}, Lax/y0/a$g;->g(J)V

    .line 868
    .line 869
    .line 870
    :cond_365
    :goto_365
    add-int/lit8 v10, v29, 0x1

    .line 871
    .line 872
    int-to-short v10, v10

    .line 873
    move/from16 v2, p2

    .line 874
    .line 875
    move/from16 v9, v27

    .line 876
    .line 877
    const/4 v5, 0x5

    .line 878
    goto/16 :goto_37

    .line 879
    .line 880
    :cond_36f
    const-wide/16 v16, 0x0

    .line 881
    .line 882
    const/16 v22, 0x0

    .line 883
    .line 884
    const/16 v23, 0x1

    .line 885
    .line 886
    const/16 v26, 0x5

    .line 887
    .line 888
    invoke-virtual {v1}, Lax/y0/a$b;->readInt()I

    .line 889
    .line 890
    .line 891
    move-result v2

    .line 892
    sget-boolean v3, Lax/y0/a;->x:Z

    .line 893
    .line 894
    if-eqz v3, :cond_391

    .line 895
    .line 896
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 897
    .line 898
    .line 899
    move-result-object v4

    .line 900
    const/4 v5, 0x1

    .line 901
    new-array v5, v5, [Ljava/lang/Object;

    .line 902
    .line 903
    aput-object v4, v5, v22

    .line 904
    .line 905
    const-string v4, "nextIfdOffset: %d"

    .line 906
    .line 907
    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object v4

    .line 911
    invoke-static {v11, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 912
    .line 913
    .line 914
    :cond_391
    int-to-long v4, v2

    .line 915
    cmp-long v6, v4, v16

    .line 916
    .line 917
    if-lez v6, :cond_3da

    .line 918
    .line 919
    iget-object v6, v0, Lax/y0/a;->h:Ljava/util/Set;

    .line 920
    .line 921
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 922
    .line 923
    .line 924
    move-result-object v7

    .line 925
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 926
    .line 927
    .line 928
    move-result v6

    .line 929
    if-nez v6, :cond_3c3

    .line 930
    .line 931
    invoke-virtual {v1, v4, v5}, Lax/y0/a$g;->g(J)V

    .line 932
    .line 933
    .line 934
    iget-object v2, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 935
    .line 936
    const/4 v3, 0x4

    .line 937
    aget-object v2, v2, v3

    .line 938
    .line 939
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 940
    .line 941
    .line 942
    move-result v2

    .line 943
    if-eqz v2, :cond_3b4

    .line 944
    .line 945
    invoke-direct {v0, v1, v3}, Lax/y0/a;->b0(Lax/y0/a$g;I)V

    .line 946
    .line 947
    .line 948
    return-void

    .line 949
    :cond_3b4
    iget-object v2, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 950
    .line 951
    aget-object v2, v2, v26

    .line 952
    .line 953
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 954
    .line 955
    .line 956
    move-result v2

    .line 957
    if-eqz v2, :cond_3f0

    .line 958
    .line 959
    const/4 v2, 0x5

    .line 960
    invoke-direct {v0, v1, v2}, Lax/y0/a;->b0(Lax/y0/a$g;I)V

    .line 961
    .line 962
    .line 963
    return-void

    .line 964
    :cond_3c3
    if-eqz v3, :cond_3f0

    .line 965
    .line 966
    new-instance v1, Ljava/lang/StringBuilder;

    .line 967
    .line 968
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 969
    .line 970
    .line 971
    const-string v3, "Stop reading file since re-reading an IFD may cause an infinite loop: "

    .line 972
    .line 973
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 974
    .line 975
    .line 976
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 977
    .line 978
    .line 979
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    move-result-object v1

    .line 983
    invoke-static {v11, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 984
    .line 985
    .line 986
    return-void

    .line 987
    :cond_3da
    if-eqz v3, :cond_3f0

    .line 988
    .line 989
    new-instance v1, Ljava/lang/StringBuilder;

    .line 990
    .line 991
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 992
    .line 993
    .line 994
    const-string v3, "Stop reading file since a wrong offset may cause an infinite loop: "

    .line 995
    .line 996
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 997
    .line 998
    .line 999
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v1

    .line 1006
    invoke-static {v11, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1007
    .line 1008
    .line 1009
    :cond_3f0
    :goto_3f0
    return-void
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
.end method

.method static synthetic c()[Ljava/lang/String;
    .registers 1

    .line 1
    sget-object v0, Lax/y0/a;->Y:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private c0(Ljava/lang/String;)V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    sget-object v1, Lax/y0/a;->l0:[[Lax/y0/a$e;

    .line 3
    .line 4
    array-length v1, v1

    .line 5
    if-ge v0, v1, :cond_10

    .line 6
    .line 7
    iget-object v1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 8
    .line 9
    aget-object v1, v1, v0

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_10
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method static synthetic d()[B
    .registers 1

    .line 1
    sget-object v0, Lax/y0/a;->a0:[B

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private d0(ILjava/lang/String;Ljava/lang/String;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_28

    .line 10
    .line 11
    iget-object v0, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 12
    .line 13
    aget-object v0, v0, p1

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_28

    .line 20
    .line 21
    iget-object v0, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 22
    .line 23
    aget-object v0, v0, p1

    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lax/y0/a$d;

    .line 30
    .line 31
    invoke-virtual {v0, p3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    iget-object p3, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 35
    .line 36
    aget-object p1, p3, p1

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :cond_28
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private e()V
    .registers 7

    .line 1
    const-string v0, "DateTimeOriginal"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1c

    .line 9
    .line 10
    const-string v2, "DateTime"

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-nez v3, :cond_1c

    .line 17
    .line 18
    iget-object v3, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 19
    .line 20
    aget-object v3, v3, v1

    .line 21
    .line 22
    invoke-static {v0}, Lax/y0/a$d;->e(Ljava/lang/String;)Lax/y0/a$d;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v3, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_1c
    const-string v0, "ImageWidth"

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-wide/16 v3, 0x0

    .line 36
    .line 37
    if-nez v2, :cond_33

    .line 38
    .line 39
    iget-object v2, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 40
    .line 41
    aget-object v2, v2, v1

    .line 42
    .line 43
    iget-object v5, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 44
    .line 45
    invoke-static {v3, v4, v5}, Lax/y0/a$d;->f(JLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v2, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_33
    const-string v0, "ImageLength"

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-nez v2, :cond_48

    .line 59
    .line 60
    iget-object v2, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 61
    .line 62
    aget-object v2, v2, v1

    .line 63
    .line 64
    iget-object v5, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 65
    .line 66
    invoke-static {v3, v4, v5}, Lax/y0/a$d;->f(JLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-virtual {v2, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :cond_48
    const-string v0, "Orientation"

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-nez v2, :cond_5d

    .line 80
    .line 81
    iget-object v2, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 82
    .line 83
    aget-object v1, v2, v1

    .line 84
    .line 85
    iget-object v2, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 86
    .line 87
    invoke-static {v3, v4, v2}, Lax/y0/a$d;->f(JLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    :cond_5d
    const-string v0, "LightSource"

    .line 95
    .line 96
    invoke-virtual {p0, v0}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    if-nez v1, :cond_73

    .line 101
    .line 102
    iget-object v1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 103
    .line 104
    const/4 v2, 0x1

    .line 105
    aget-object v1, v1, v2

    .line 106
    .line 107
    iget-object v2, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 108
    .line 109
    invoke-static {v3, v4, v2}, Lax/y0/a$d;->f(JLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    :cond_73
    return-void
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method private e0(ILjava/lang/String;Ljava/lang/String;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_21

    .line 10
    .line 11
    iget-object v0, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 12
    .line 13
    aget-object v0, v0, p1

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_21

    .line 20
    .line 21
    iget-object v0, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 22
    .line 23
    aget-object p1, v0, p1

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, Lax/y0/a$d;

    .line 30
    .line 31
    invoke-virtual {p1, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    :cond_21
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private static f(Ljava/lang/String;Ljava/lang/String;)D
    .registers 13

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    :try_start_2
    const-string v1, ","

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v1, 0x0

    .line 11
    aget-object v3, p0, v1

    .line 12
    .line 13
    invoke-virtual {v3, v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    aget-object v4, v3, v1

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    const/4 v6, 0x1

    .line 28
    aget-object v3, v3, v6

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 35
    .line 36
    .line 37
    move-result-wide v7

    .line 38
    div-double/2addr v4, v7

    .line 39
    aget-object v3, p0, v6

    .line 40
    .line 41
    invoke-virtual {v3, v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    aget-object v7, v3, v1

    .line 46
    .line 47
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-static {v7}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 52
    .line 53
    .line 54
    move-result-wide v7

    .line 55
    aget-object v3, v3, v6

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 62
    .line 63
    .line 64
    move-result-wide v9

    .line 65
    div-double/2addr v7, v9

    .line 66
    const/4 v3, 0x2

    .line 67
    aget-object p0, p0, v3

    .line 68
    .line 69
    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    aget-object v0, p0, v1

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    aget-object p0, p0, v6

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 90
    .line 91
    .line 92
    move-result-wide v2

    .line 93
    div-double/2addr v0, v2

    .line 94
    const-wide/high16 v2, 0x404e000000000000L    # 60.0

    .line 95
    .line 96
    div-double/2addr v7, v2

    .line 97
    add-double/2addr v4, v7

    .line 98
    const-wide v2, 0x40ac200000000000L    # 3600.0

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    div-double/2addr v0, v2

    .line 104
    add-double/2addr v4, v0

    .line 105
    const-string p0, "S"

    .line 106
    .line 107
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-nez p0, :cond_91

    .line 112
    .line 113
    const-string p0, "W"

    .line 114
    .line 115
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-eqz p0, :cond_79

    .line 120
    .line 121
    goto :goto_91

    .line 122
    :cond_79
    const-string p0, "N"

    .line 123
    .line 124
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-nez p0, :cond_90

    .line 129
    .line 130
    const-string p0, "E"

    .line 131
    .line 132
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-eqz p0, :cond_8a

    .line 137
    .line 138
    goto :goto_90

    .line 139
    :cond_8a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 140
    .line 141
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 142
    .line 143
    .line 144
    throw p0
    :try_end_90
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_90} :catch_93
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_90} :catch_93

    .line 145
    :cond_90
    :goto_90
    return-wide v4

    .line 146
    :cond_91
    :goto_91
    neg-double p0, v4

    .line 147
    return-wide p0

    .line 148
    :catch_93
    move-exception p0

    .line 149
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 150
    .line 151
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    throw p1
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private g(Lax/y0/a$b;Lax/y0/a$c;[B[B)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :cond_0
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    invoke-virtual {p1, v0}, Lax/y0/a$b;->readFully([B)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2, v0}, Lax/y0/a;->h(Lax/y0/a$b;Lax/y0/a$c;[B)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_17

    .line 15
    .line 16
    if-eqz p4, :cond_0

    .line 17
    .line 18
    invoke-static {v0, p4}, Ljava/util/Arrays;->equals([B[B)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    :cond_17
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method private g0(Lax/y0/a$g;I)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v0, v0, p2

    .line 4
    .line 5
    const-string v1, "ImageLength"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lax/y0/a$d;

    .line 12
    .line 13
    iget-object v1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 14
    .line 15
    aget-object v1, v1, p2

    .line 16
    .line 17
    const-string v2, "ImageWidth"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lax/y0/a$d;

    .line 24
    .line 25
    if-eqz v0, :cond_1c

    .line 26
    .line 27
    if-nez v1, :cond_55

    .line 28
    .line 29
    :cond_1c
    iget-object v0, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 30
    .line 31
    aget-object v0, v0, p2

    .line 32
    .line 33
    const-string v1, "JPEGInterchangeFormat"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lax/y0/a$d;

    .line 40
    .line 41
    iget-object v1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 42
    .line 43
    aget-object v1, v1, p2

    .line 44
    .line 45
    const-string v2, "JPEGInterchangeFormatLength"

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Lax/y0/a$d;

    .line 52
    .line 53
    if-eqz v0, :cond_55

    .line 54
    .line 55
    if-eqz v1, :cond_55

    .line 56
    .line 57
    iget-object v1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lax/y0/a$d;->m(Ljava/nio/ByteOrder;)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iget-object v2, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Lax/y0/a$d;->m(Ljava/nio/ByteOrder;)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    int-to-long v2, v1

    .line 70
    invoke-virtual {p1, v2, v3}, Lax/y0/a$g;->g(J)V

    .line 71
    .line 72
    .line 73
    new-array v0, v0, [B

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Lax/y0/a$b;->readFully([B)V

    .line 76
    .line 77
    .line 78
    new-instance p1, Lax/y0/a$b;

    .line 79
    .line 80
    invoke-direct {p1, v0}, Lax/y0/a$b;-><init>([B)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p0, p1, v1, p2}, Lax/y0/a;->r(Lax/y0/a$b;II)V

    .line 84
    .line 85
    .line 86
    :cond_55
    return-void
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method private h(Lax/y0/a$b;Lax/y0/a$c;[B)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lax/y0/a$b;->readInt()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p2, p3}, Lax/y0/a$c;->write([B)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2, v0}, Lax/y0/a$c;->c(I)V

    .line 9
    .line 10
    .line 11
    rem-int/lit8 p3, v0, 0x2

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne p3, v1, :cond_11

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    :cond_11
    invoke-static {p1, p2, v0}, Lax/y0/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method private j0(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .registers 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-boolean v0, Lax/y0/a;->x:Z

    .line 2
    .line 3
    if-eqz v0, :cond_27

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "saveJpegAttributes starting with (inputStream: "

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ", outputStream: "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ")"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "ExifInterface"

    .line 36
    .line 37
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    :cond_27
    new-instance v0, Lax/y0/a$b;

    .line 41
    .line 42
    invoke-direct {v0, p1}, Lax/y0/a$b;-><init>(Ljava/io/InputStream;)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Lax/y0/a$c;

    .line 46
    .line 47
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 48
    .line 49
    invoke-direct {p1, p2, v1}, Lax/y0/a$c;-><init>(Ljava/io/OutputStream;Ljava/nio/ByteOrder;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lax/y0/a$b;->readByte()B

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    const-string v1, "Invalid marker"

    .line 57
    .line 58
    const/4 v2, -0x1

    .line 59
    if-ne p2, v2, :cond_131

    .line 60
    .line 61
    invoke-virtual {p1, v2}, Lax/y0/a$c;->b(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lax/y0/a$b;->readByte()B

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    const/16 v3, -0x28

    .line 69
    .line 70
    if-ne p2, v3, :cond_12b

    .line 71
    .line 72
    invoke-virtual {p1, v3}, Lax/y0/a$c;->b(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v2}, Lax/y0/a$c;->b(I)V

    .line 76
    .line 77
    .line 78
    const/16 p2, -0x1f

    .line 79
    .line 80
    invoke-virtual {p1, p2}, Lax/y0/a$c;->b(I)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p0, p1}, Lax/y0/a;->t0(Lax/y0/a$c;)I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    iput v3, p0, Lax/y0/a;->q:I

    .line 88
    .line 89
    iget-object v3, p0, Lax/y0/a;->v:Lax/y0/a$d;

    .line 90
    .line 91
    if-eqz v3, :cond_7d

    .line 92
    .line 93
    invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p2}, Lax/y0/a$c;->b(I)V

    .line 97
    .line 98
    .line 99
    sget-object v3, Lax/y0/a;->t0:[B

    .line 100
    .line 101
    array-length v4, v3

    .line 102
    add-int/lit8 v4, v4, 0x2

    .line 103
    .line 104
    iget-object v5, p0, Lax/y0/a;->v:Lax/y0/a$d;

    .line 105
    .line 106
    iget-object v5, v5, Lax/y0/a$d;->d:[B

    .line 107
    .line 108
    array-length v5, v5

    .line 109
    add-int/2addr v4, v5

    .line 110
    invoke-virtual {p1, v4}, Lax/y0/a$c;->f(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v3}, Lax/y0/a$c;->write([B)V

    .line 114
    .line 115
    .line 116
    iget-object v3, p0, Lax/y0/a;->v:Lax/y0/a$d;

    .line 117
    .line 118
    iget-object v3, v3, Lax/y0/a$d;->d:[B

    .line 119
    .line 120
    invoke-virtual {p1, v3}, Lax/y0/a$c;->write([B)V

    .line 121
    .line 122
    .line 123
    const/4 v3, 0x1

    .line 124
    iput-boolean v3, p0, Lax/y0/a;->w:Z

    .line 125
    .line 126
    :cond_7d
    const/16 v3, 0x1000

    .line 127
    .line 128
    new-array v4, v3, [B

    .line 129
    .line 130
    :cond_81
    :goto_81
    invoke-virtual {v0}, Lax/y0/a$b;->readByte()B

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-ne v5, v2, :cond_125

    .line 135
    .line 136
    invoke-virtual {v0}, Lax/y0/a$b;->readByte()B

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    const/16 v6, -0x27

    .line 141
    .line 142
    if-eq v5, v6, :cond_11b

    .line 143
    .line 144
    const/16 v6, -0x26

    .line 145
    .line 146
    if-eq v5, v6, :cond_11b

    .line 147
    .line 148
    const-string v6, "Invalid length"

    .line 149
    .line 150
    const/4 v7, 0x0

    .line 151
    if-eq v5, p2, :cond_c0

    .line 152
    .line 153
    invoke-virtual {p1, v2}, Lax/y0/a$c;->b(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, v5}, Lax/y0/a$c;->b(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Lax/y0/a$b;->readUnsignedShort()I

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    invoke-virtual {p1, v5}, Lax/y0/a$c;->f(I)V

    .line 164
    .line 165
    .line 166
    add-int/lit8 v5, v5, -0x2

    .line 167
    .line 168
    if-ltz v5, :cond_ba

    .line 169
    .line 170
    :goto_a9
    if-lez v5, :cond_81

    .line 171
    .line 172
    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    invoke-virtual {v0, v4, v7, v6}, Lax/y0/a$b;->read([BII)I

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    if-ltz v6, :cond_81

    .line 181
    .line 182
    invoke-virtual {p1, v4, v7, v6}, Lax/y0/a$c;->write([BII)V

    .line 183
    .line 184
    .line 185
    sub-int/2addr v5, v6

    .line 186
    goto :goto_a9

    .line 187
    :cond_ba
    new-instance p1, Ljava/io/IOException;

    .line 188
    .line 189
    invoke-direct {p1, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw p1

    .line 193
    :cond_c0
    invoke-virtual {v0}, Lax/y0/a$b;->readUnsignedShort()I

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    add-int/lit8 v9, v8, -0x2

    .line 198
    .line 199
    if-ltz v9, :cond_115

    .line 200
    .line 201
    sget-object v6, Lax/y0/a;->t0:[B

    .line 202
    .line 203
    array-length v10, v6

    .line 204
    if-lt v9, v10, :cond_d1

    .line 205
    .line 206
    array-length v10, v6

    .line 207
    new-array v10, v10, [B

    .line 208
    .line 209
    goto :goto_db

    .line 210
    :cond_d1
    sget-object v10, Lax/y0/a;->s0:[B

    .line 211
    .line 212
    array-length v11, v10

    .line 213
    if-lt v9, v11, :cond_da

    .line 214
    .line 215
    array-length v10, v10

    .line 216
    new-array v10, v10, [B

    .line 217
    .line 218
    goto :goto_db

    .line 219
    :cond_da
    const/4 v10, 0x0

    .line 220
    :goto_db
    if-eqz v10, :cond_f4

    .line 221
    .line 222
    invoke-virtual {v0, v10}, Lax/y0/a$b;->readFully([B)V

    .line 223
    .line 224
    .line 225
    sget-object v11, Lax/y0/a;->s0:[B

    .line 226
    .line 227
    invoke-static {v10, v11}, Lax/y0/b;->g([B[B)Z

    .line 228
    .line 229
    .line 230
    move-result v11

    .line 231
    if-nez v11, :cond_ee

    .line 232
    .line 233
    invoke-static {v10, v6}, Lax/y0/b;->g([B[B)Z

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    if-eqz v6, :cond_f4

    .line 238
    .line 239
    :cond_ee
    array-length v5, v10

    .line 240
    sub-int/2addr v9, v5

    .line 241
    invoke-virtual {v0, v9}, Lax/y0/a$b;->f(I)V

    .line 242
    .line 243
    .line 244
    goto :goto_81

    .line 245
    :cond_f4
    invoke-virtual {p1, v2}, Lax/y0/a$c;->b(I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, v5}, Lax/y0/a$c;->b(I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1, v8}, Lax/y0/a$c;->f(I)V

    .line 252
    .line 253
    .line 254
    if-eqz v10, :cond_104

    .line 255
    .line 256
    array-length v5, v10

    .line 257
    sub-int/2addr v9, v5

    .line 258
    invoke-virtual {p1, v10}, Lax/y0/a$c;->write([B)V

    .line 259
    .line 260
    .line 261
    :cond_104
    :goto_104
    if-lez v9, :cond_81

    .line 262
    .line 263
    invoke-static {v9, v3}, Ljava/lang/Math;->min(II)I

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    invoke-virtual {v0, v4, v7, v5}, Lax/y0/a$b;->read([BII)I

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    if-ltz v5, :cond_81

    .line 272
    .line 273
    invoke-virtual {p1, v4, v7, v5}, Lax/y0/a$c;->write([BII)V

    .line 274
    .line 275
    .line 276
    sub-int/2addr v9, v5

    .line 277
    goto :goto_104

    .line 278
    :cond_115
    new-instance p1, Ljava/io/IOException;

    .line 279
    .line 280
    invoke-direct {p1, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw p1

    .line 284
    :cond_11b
    invoke-virtual {p1, v2}, Lax/y0/a$c;->b(I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1, v5}, Lax/y0/a$c;->b(I)V

    .line 288
    .line 289
    .line 290
    invoke-static {v0, p1}, Lax/y0/b;->d(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :cond_125
    new-instance p1, Ljava/io/IOException;

    .line 295
    .line 296
    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw p1

    .line 300
    :cond_12b
    new-instance p1, Ljava/io/IOException;

    .line 301
    .line 302
    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    throw p1

    .line 306
    :cond_131
    new-instance p1, Ljava/io/IOException;

    .line 307
    .line 308
    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw p1
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private k0(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-boolean v0, Lax/y0/a;->x:Z

    .line 2
    .line 3
    if-eqz v0, :cond_27

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "savePngAttributes starting with (inputStream: "

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ", outputStream: "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ")"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "ExifInterface"

    .line 36
    .line 37
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    :cond_27
    new-instance v0, Lax/y0/a$b;

    .line 41
    .line 42
    invoke-direct {v0, p1}, Lax/y0/a$b;-><init>(Ljava/io/InputStream;)V

    .line 43
    .line 44
    .line 45
    new-instance p1, Lax/y0/a$c;

    .line 46
    .line 47
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 48
    .line 49
    invoke-direct {p1, p2, v1}, Lax/y0/a$c;-><init>(Ljava/io/OutputStream;Ljava/nio/ByteOrder;)V

    .line 50
    .line 51
    .line 52
    sget-object p2, Lax/y0/a;->L:[B

    .line 53
    .line 54
    array-length p2, p2

    .line 55
    invoke-static {v0, p1, p2}, Lax/y0/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    .line 56
    .line 57
    .line 58
    iget-object p2, p0, Lax/y0/a;->v:Lax/y0/a$d;

    .line 59
    .line 60
    const/4 v1, 0x1

    .line 61
    const/4 v2, 0x0

    .line 62
    if-nez p2, :cond_43

    .line 63
    .line 64
    iget-boolean p2, p0, Lax/y0/a;->w:Z

    .line 65
    .line 66
    if-eqz p2, :cond_78

    .line 67
    .line 68
    :cond_43
    const/4 p2, 0x1

    .line 69
    :cond_44
    :goto_44
    if-nez v1, :cond_4d

    .line 70
    .line 71
    if-eqz p2, :cond_49

    .line 72
    .line 73
    goto :goto_4d

    .line 74
    :cond_49
    invoke-static {v0, p1}, Lax/y0/b;->d(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_4d
    :goto_4d
    invoke-virtual {v0}, Lax/y0/a$b;->readInt()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-virtual {v0}, Lax/y0/a$b;->readInt()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    const v5, 0x49484452

    .line 87
    .line 88
    .line 89
    if-ne v4, v5, :cond_7a

    .line 90
    .line 91
    invoke-virtual {p1, v3}, Lax/y0/a$c;->c(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v4}, Lax/y0/a$c;->c(I)V

    .line 95
    .line 96
    .line 97
    add-int/lit8 v3, v3, 0x4

    .line 98
    .line 99
    invoke-static {v0, p1, v3}, Lax/y0/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    .line 100
    .line 101
    .line 102
    iget v3, p0, Lax/y0/a;->q:I

    .line 103
    .line 104
    if-nez v3, :cond_6d

    .line 105
    .line 106
    invoke-direct {p0, p1}, Lax/y0/a;->u0(Lax/y0/a$c;)V

    .line 107
    .line 108
    .line 109
    const/4 v1, 0x0

    .line 110
    :cond_6d
    iget-object v3, p0, Lax/y0/a;->v:Lax/y0/a$d;

    .line 111
    .line 112
    if-eqz v3, :cond_44

    .line 113
    .line 114
    iget-boolean v3, p0, Lax/y0/a;->w:Z

    .line 115
    .line 116
    if-nez v3, :cond_44

    .line 117
    .line 118
    invoke-direct {p0, p1}, Lax/y0/a;->v0(Lax/y0/a$c;)V

    .line 119
    .line 120
    .line 121
    :cond_78
    :goto_78
    const/4 p2, 0x0

    .line 122
    goto :goto_44

    .line 123
    :cond_7a
    const v5, 0x65584966

    .line 124
    .line 125
    .line 126
    if-ne v4, v5, :cond_8b

    .line 127
    .line 128
    if-eqz v1, :cond_8b

    .line 129
    .line 130
    invoke-direct {p0, p1}, Lax/y0/a;->u0(Lax/y0/a$c;)V

    .line 131
    .line 132
    .line 133
    add-int/lit8 v3, v3, 0x4

    .line 134
    .line 135
    invoke-virtual {v0, v3}, Lax/y0/a$b;->f(I)V

    .line 136
    .line 137
    .line 138
    const/4 v1, 0x0

    .line 139
    goto :goto_44

    .line 140
    :cond_8b
    const v5, 0x69545874

    .line 141
    .line 142
    .line 143
    if-ne v4, v5, :cond_bd

    .line 144
    .line 145
    sget-object v5, Lax/y0/a;->M:[B

    .line 146
    .line 147
    array-length v6, v5

    .line 148
    if-lt v3, v6, :cond_bd

    .line 149
    .line 150
    array-length v6, v5

    .line 151
    new-array v7, v6, [B

    .line 152
    .line 153
    invoke-virtual {v0, v7}, Lax/y0/a$b;->readFully([B)V

    .line 154
    .line 155
    .line 156
    sub-int v6, v3, v6

    .line 157
    .line 158
    add-int/lit8 v6, v6, 0x4

    .line 159
    .line 160
    invoke-static {v7, v5}, Ljava/util/Arrays;->equals([B[B)Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-eqz v5, :cond_b0

    .line 165
    .line 166
    iget-object p2, p0, Lax/y0/a;->v:Lax/y0/a$d;

    .line 167
    .line 168
    if-eqz p2, :cond_ac

    .line 169
    .line 170
    invoke-direct {p0, p1}, Lax/y0/a;->v0(Lax/y0/a$c;)V

    .line 171
    .line 172
    .line 173
    :cond_ac
    invoke-virtual {v0, v6}, Lax/y0/a$b;->f(I)V

    .line 174
    .line 175
    .line 176
    goto :goto_78

    .line 177
    :cond_b0
    invoke-virtual {p1, v3}, Lax/y0/a$c;->c(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, v4}, Lax/y0/a$c;->c(I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, v7}, Lax/y0/a$c;->write([B)V

    .line 184
    .line 185
    .line 186
    invoke-static {v0, p1, v6}, Lax/y0/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    .line 187
    .line 188
    .line 189
    goto :goto_44

    .line 190
    :cond_bd
    invoke-virtual {p1, v3}, Lax/y0/a$c;->c(I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, v4}, Lax/y0/a$c;->c(I)V

    .line 194
    .line 195
    .line 196
    add-int/lit8 v3, v3, 0x4

    .line 197
    .line 198
    invoke-static {v0, p1, v3}, Lax/y0/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    .line 199
    .line 200
    .line 201
    goto/16 :goto_44
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private l0(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .registers 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    sget-boolean v3, Lax/y0/a;->x:Z

    .line 8
    .line 9
    if-eqz v3, :cond_2d

    .line 10
    .line 11
    new-instance v3, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v4, "saveWebpAttributes starting with (inputStream: "

    .line 17
    .line 18
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v4, ", outputStream: "

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v4, ")"

    .line 33
    .line 34
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const-string v4, "ExifInterface"

    .line 42
    .line 43
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    :cond_2d
    new-instance v3, Lax/y0/a$b;

    .line 47
    .line 48
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 49
    .line 50
    invoke-direct {v3, v0, v4}, Lax/y0/a$b;-><init>(Ljava/io/InputStream;Ljava/nio/ByteOrder;)V

    .line 51
    .line 52
    .line 53
    new-instance v0, Lax/y0/a$c;

    .line 54
    .line 55
    invoke-direct {v0, v2, v4}, Lax/y0/a$c;-><init>(Ljava/io/OutputStream;Ljava/nio/ByteOrder;)V

    .line 56
    .line 57
    .line 58
    sget-object v2, Lax/y0/a;->N:[B

    .line 59
    .line 60
    array-length v5, v2

    .line 61
    invoke-static {v3, v0, v5}, Lax/y0/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Lax/y0/a$b;->readInt()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    sget-object v6, Lax/y0/a;->O:[B

    .line 69
    .line 70
    array-length v7, v6

    .line 71
    invoke-virtual {v3, v7}, Lax/y0/a$b;->f(I)V

    .line 72
    .line 73
    .line 74
    const/4 v7, 0x0

    .line 75
    :try_start_4a
    new-instance v8, Ljava/io/ByteArrayOutputStream;

    .line 76
    .line 77
    invoke-direct {v8}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_4f
    .catch Ljava/lang/Exception; {:try_start_4a .. :try_end_4f} :catch_225
    .catchall {:try_start_4a .. :try_end_4f} :catchall_223

    .line 78
    .line 79
    .line 80
    :try_start_4f
    new-instance v9, Lax/y0/a$c;

    .line 81
    .line 82
    invoke-direct {v9, v8, v4}, Lax/y0/a$c;-><init>(Ljava/io/OutputStream;Ljava/nio/ByteOrder;)V

    .line 83
    .line 84
    .line 85
    iget v4, v1, Lax/y0/a;->q:I

    .line 86
    .line 87
    const/4 v11, 0x4

    .line 88
    const/16 v12, 0x8

    .line 89
    .line 90
    if-eqz v4, :cond_86

    .line 91
    .line 92
    array-length v2, v2

    .line 93
    add-int/2addr v2, v11

    .line 94
    array-length v6, v6

    .line 95
    add-int/2addr v2, v6

    .line 96
    sub-int/2addr v4, v2

    .line 97
    sub-int/2addr v4, v12

    .line 98
    invoke-static {v3, v9, v4}, Lax/y0/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v11}, Lax/y0/a$b;->f(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Lax/y0/a$b;->readInt()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    rem-int/lit8 v4, v2, 0x2

    .line 109
    .line 110
    if-eqz v4, :cond_71

    .line 111
    .line 112
    add-int/lit8 v2, v2, 0x1

    .line 113
    .line 114
    :cond_71
    invoke-virtual {v3, v2}, Lax/y0/a$b;->f(I)V

    .line 115
    .line 116
    .line 117
    invoke-direct {v1, v9}, Lax/y0/a;->t0(Lax/y0/a$c;)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    :goto_78
    const/16 p2, 0x8

    .line 122
    .line 123
    :goto_7a
    const/16 v16, -0x1

    .line 124
    .line 125
    goto/16 :goto_1f5

    .line 126
    .line 127
    :catchall_7e
    move-exception v0

    .line 128
    move-object v7, v8

    .line 129
    goto/16 :goto_22e

    .line 130
    .line 131
    :catch_82
    move-exception v0

    .line 132
    move-object v7, v8

    .line 133
    goto/16 :goto_226

    .line 134
    .line 135
    :cond_86
    new-array v2, v11, [B

    .line 136
    .line 137
    invoke-virtual {v3, v2}, Lax/y0/a$b;->readFully([B)V

    .line 138
    .line 139
    .line 140
    sget-object v4, Lax/y0/a;->R:[B

    .line 141
    .line 142
    invoke-static {v2, v4}, Ljava/util/Arrays;->equals([B[B)Z

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    const/4 v13, 0x0

    .line 147
    const/4 v14, 0x1

    .line 148
    if-eqz v6, :cond_e7

    .line 149
    .line 150
    invoke-virtual {v3}, Lax/y0/a$b;->readInt()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    rem-int/lit8 v6, v2, 0x2

    .line 155
    .line 156
    if-ne v6, v14, :cond_a0

    .line 157
    .line 158
    add-int/lit8 v6, v2, 0x1

    .line 159
    .line 160
    goto :goto_a1

    .line 161
    :cond_a0
    move v6, v2

    .line 162
    :goto_a1
    new-array v6, v6, [B

    .line 163
    .line 164
    invoke-virtual {v3, v6}, Lax/y0/a$b;->readFully([B)V

    .line 165
    .line 166
    .line 167
    aget-byte v15, v6, v13

    .line 168
    .line 169
    or-int/2addr v15, v12

    .line 170
    int-to-byte v15, v15

    .line 171
    aput-byte v15, v6, v13

    .line 172
    .line 173
    shr-int/2addr v15, v14

    .line 174
    and-int/2addr v15, v14

    .line 175
    if-ne v15, v14, :cond_b1

    .line 176
    .line 177
    const/4 v13, 0x1

    .line 178
    :cond_b1
    invoke-virtual {v9, v4}, Lax/y0/a$c;->write([B)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v9, v2}, Lax/y0/a$c;->c(I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v9, v6}, Lax/y0/a$c;->write([B)V

    .line 185
    .line 186
    .line 187
    if-eqz v13, :cond_db

    .line 188
    .line 189
    sget-object v2, Lax/y0/a;->U:[B

    .line 190
    .line 191
    invoke-direct {v1, v3, v9, v2, v7}, Lax/y0/a;->g(Lax/y0/a$b;Lax/y0/a$c;[B[B)V

    .line 192
    .line 193
    .line 194
    :goto_c1
    new-array v2, v11, [B
    :try_end_c3
    .catch Ljava/lang/Exception; {:try_start_4f .. :try_end_c3} :catch_82
    .catchall {:try_start_4f .. :try_end_c3} :catchall_7e

    .line 195
    .line 196
    :try_start_c3
    invoke-virtual {v3, v2}, Lax/y0/a$b;->readFully([B)V

    .line 197
    .line 198
    .line 199
    sget-object v4, Lax/y0/a;->V:[B

    .line 200
    .line 201
    invoke-static {v2, v4}, Ljava/util/Arrays;->equals([B[B)Z

    .line 202
    .line 203
    .line 204
    move-result v4
    :try_end_cc
    .catch Ljava/io/EOFException; {:try_start_c3 .. :try_end_cc} :catch_ce
    .catch Ljava/lang/Exception; {:try_start_c3 .. :try_end_cc} :catch_82
    .catchall {:try_start_c3 .. :try_end_cc} :catchall_7e

    .line 205
    xor-int/2addr v4, v14

    .line 206
    goto :goto_d0

    .line 207
    :catch_ce
    nop

    .line 208
    const/4 v4, 0x1

    .line 209
    :goto_d0
    if-eqz v4, :cond_d7

    .line 210
    .line 211
    :try_start_d2
    invoke-direct {v1, v9}, Lax/y0/a;->t0(Lax/y0/a$c;)I

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    goto :goto_78

    .line 216
    :cond_d7
    invoke-direct {v1, v3, v9, v2}, Lax/y0/a;->h(Lax/y0/a$b;Lax/y0/a$c;[B)V

    .line 217
    .line 218
    .line 219
    goto :goto_c1

    .line 220
    :cond_db
    sget-object v2, Lax/y0/a;->T:[B

    .line 221
    .line 222
    sget-object v4, Lax/y0/a;->S:[B

    .line 223
    .line 224
    invoke-direct {v1, v3, v9, v2, v4}, Lax/y0/a;->g(Lax/y0/a$b;Lax/y0/a$c;[B[B)V

    .line 225
    .line 226
    .line 227
    invoke-direct {v1, v9}, Lax/y0/a;->t0(Lax/y0/a$c;)I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    goto :goto_78

    .line 232
    :cond_e7
    sget-object v6, Lax/y0/a;->T:[B

    .line 233
    .line 234
    invoke-static {v2, v6}, Ljava/util/Arrays;->equals([B[B)Z

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    if-nez v7, :cond_fd

    .line 239
    .line 240
    sget-object v7, Lax/y0/a;->S:[B

    .line 241
    .line 242
    invoke-static {v2, v7}, Ljava/util/Arrays;->equals([B[B)Z

    .line 243
    .line 244
    .line 245
    move-result v7

    .line 246
    if-eqz v7, :cond_f8

    .line 247
    .line 248
    goto :goto_fd

    .line 249
    :cond_f8
    const/16 p2, 0x8

    .line 250
    .line 251
    const/4 v2, -0x1

    .line 252
    goto/16 :goto_7a

    .line 253
    .line 254
    :cond_fd
    :goto_fd
    invoke-virtual {v3}, Lax/y0/a$b;->readInt()I

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    rem-int/lit8 v15, v7, 0x2

    .line 259
    .line 260
    if-ne v15, v14, :cond_10a

    .line 261
    .line 262
    add-int/lit8 v15, v7, 0x1

    .line 263
    .line 264
    :goto_107
    const/16 p1, 0x4

    .line 265
    .line 266
    goto :goto_10c

    .line 267
    :cond_10a
    move v15, v7

    .line 268
    goto :goto_107

    .line 269
    :goto_10c
    const/4 v11, 0x3

    .line 270
    const/16 p2, 0x8

    .line 271
    .line 272
    new-array v12, v11, [B

    .line 273
    .line 274
    invoke-static {v2, v6}, Ljava/util/Arrays;->equals([B[B)Z

    .line 275
    .line 276
    .line 277
    move-result v16

    .line 278
    const/16 v17, 0x0

    .line 279
    .line 280
    const/16 v13, 0x2f

    .line 281
    .line 282
    if-eqz v16, :cond_146

    .line 283
    .line 284
    invoke-virtual {v3, v12}, Lax/y0/a$b;->readFully([B)V

    .line 285
    .line 286
    .line 287
    new-array v11, v11, [B

    .line 288
    .line 289
    invoke-virtual {v3, v11}, Lax/y0/a$b;->readFully([B)V

    .line 290
    .line 291
    .line 292
    sget-object v14, Lax/y0/a;->Q:[B

    .line 293
    .line 294
    invoke-static {v14, v11}, Ljava/util/Arrays;->equals([B[B)Z

    .line 295
    .line 296
    .line 297
    move-result v11

    .line 298
    if-eqz v11, :cond_13e

    .line 299
    .line 300
    invoke-virtual {v3}, Lax/y0/a$b;->readInt()I

    .line 301
    .line 302
    .line 303
    move-result v11

    .line 304
    and-int/lit16 v14, v11, 0x3fff

    .line 305
    .line 306
    const/16 v16, -0x1

    .line 307
    .line 308
    shr-int/lit8 v10, v11, 0x10

    .line 309
    .line 310
    and-int/lit16 v10, v10, 0x3fff

    .line 311
    .line 312
    add-int/lit8 v15, v15, -0xa

    .line 313
    .line 314
    move/from16 v20, v15

    .line 315
    .line 316
    move v15, v14

    .line 317
    const/4 v14, 0x0

    .line 318
    goto :goto_184

    .line 319
    :cond_13e
    new-instance v0, Ljava/io/IOException;

    .line 320
    .line 321
    const-string v2, "Error checking VP8 signature"

    .line 322
    .line 323
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    throw v0

    .line 327
    :cond_146
    const/16 v16, -0x1

    .line 328
    .line 329
    sget-object v10, Lax/y0/a;->S:[B

    .line 330
    .line 331
    invoke-static {v2, v10}, Ljava/util/Arrays;->equals([B[B)Z

    .line 332
    .line 333
    .line 334
    move-result v10

    .line 335
    if-eqz v10, :cond_17e

    .line 336
    .line 337
    invoke-virtual {v3}, Lax/y0/a$b;->readByte()B

    .line 338
    .line 339
    .line 340
    move-result v10

    .line 341
    if-ne v10, v13, :cond_176

    .line 342
    .line 343
    invoke-virtual {v3}, Lax/y0/a$b;->readInt()I

    .line 344
    .line 345
    .line 346
    move-result v11

    .line 347
    and-int/lit16 v10, v11, 0x3fff

    .line 348
    .line 349
    add-int/2addr v10, v14

    .line 350
    const v18, 0xfffc000

    .line 351
    .line 352
    .line 353
    and-int v18, v11, v18

    .line 354
    .line 355
    ushr-int/lit8 v18, v18, 0xe

    .line 356
    .line 357
    add-int/lit8 v18, v18, 0x1

    .line 358
    .line 359
    const/high16 v19, 0x10000000

    .line 360
    .line 361
    and-int v19, v11, v19

    .line 362
    .line 363
    if-eqz v19, :cond_16d

    .line 364
    .line 365
    goto :goto_16e

    .line 366
    :cond_16d
    const/4 v14, 0x0

    .line 367
    :goto_16e
    add-int/lit8 v15, v15, -0x5

    .line 368
    .line 369
    move/from16 v20, v15

    .line 370
    .line 371
    move v15, v10

    .line 372
    move/from16 v10, v18

    .line 373
    .line 374
    goto :goto_184

    .line 375
    :cond_176
    new-instance v0, Ljava/io/IOException;

    .line 376
    .line 377
    const-string v2, "Error checking VP8L signature"

    .line 378
    .line 379
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    throw v0

    .line 383
    :cond_17e
    move/from16 v20, v15

    .line 384
    .line 385
    const/4 v10, 0x0

    .line 386
    const/4 v11, 0x0

    .line 387
    const/4 v14, 0x0

    .line 388
    const/4 v15, 0x0

    .line 389
    :goto_184
    invoke-virtual {v9, v4}, Lax/y0/a$c;->write([B)V

    .line 390
    .line 391
    .line 392
    const/16 v4, 0xa

    .line 393
    .line 394
    invoke-virtual {v9, v4}, Lax/y0/a$c;->c(I)V

    .line 395
    .line 396
    .line 397
    new-array v4, v4, [B

    .line 398
    .line 399
    if-eqz v14, :cond_197

    .line 400
    .line 401
    aget-byte v14, v4, v17

    .line 402
    .line 403
    or-int/lit8 v14, v14, 0x10

    .line 404
    .line 405
    int-to-byte v14, v14

    .line 406
    aput-byte v14, v4, v17

    .line 407
    .line 408
    :cond_197
    aget-byte v14, v4, v17

    .line 409
    .line 410
    or-int/lit8 v14, v14, 0x8

    .line 411
    .line 412
    int-to-byte v14, v14

    .line 413
    aput-byte v14, v4, v17

    .line 414
    .line 415
    add-int/lit8 v15, v15, -0x1

    .line 416
    .line 417
    add-int/lit8 v10, v10, -0x1

    .line 418
    .line 419
    int-to-byte v14, v15

    .line 420
    aput-byte v14, v4, p1

    .line 421
    .line 422
    shr-int/lit8 v14, v15, 0x8

    .line 423
    .line 424
    int-to-byte v14, v14

    .line 425
    const/16 v17, 0x5

    .line 426
    .line 427
    aput-byte v14, v4, v17

    .line 428
    .line 429
    shr-int/lit8 v14, v15, 0x10

    .line 430
    .line 431
    int-to-byte v14, v14

    .line 432
    const/4 v15, 0x6

    .line 433
    aput-byte v14, v4, v15

    .line 434
    .line 435
    const/4 v14, 0x7

    .line 436
    int-to-byte v15, v10

    .line 437
    aput-byte v15, v4, v14

    .line 438
    .line 439
    shr-int/lit8 v14, v10, 0x8

    .line 440
    .line 441
    int-to-byte v14, v14

    .line 442
    aput-byte v14, v4, p2

    .line 443
    .line 444
    shr-int/lit8 v10, v10, 0x10

    .line 445
    .line 446
    int-to-byte v10, v10

    .line 447
    const/16 v14, 0x9

    .line 448
    .line 449
    aput-byte v10, v4, v14

    .line 450
    .line 451
    invoke-virtual {v9, v4}, Lax/y0/a$c;->write([B)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v9, v2}, Lax/y0/a$c;->write([B)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v9, v7}, Lax/y0/a$c;->c(I)V

    .line 458
    .line 459
    .line 460
    invoke-static {v2, v6}, Ljava/util/Arrays;->equals([B[B)Z

    .line 461
    .line 462
    .line 463
    move-result v4

    .line 464
    if-eqz v4, :cond_1df

    .line 465
    .line 466
    invoke-virtual {v9, v12}, Lax/y0/a$c;->write([B)V

    .line 467
    .line 468
    .line 469
    sget-object v2, Lax/y0/a;->Q:[B

    .line 470
    .line 471
    invoke-virtual {v9, v2}, Lax/y0/a$c;->write([B)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v9, v11}, Lax/y0/a$c;->c(I)V

    .line 475
    .line 476
    .line 477
    :cond_1dc
    :goto_1dc
    move/from16 v15, v20

    .line 478
    .line 479
    goto :goto_1ee

    .line 480
    :cond_1df
    sget-object v4, Lax/y0/a;->S:[B

    .line 481
    .line 482
    invoke-static {v2, v4}, Ljava/util/Arrays;->equals([B[B)Z

    .line 483
    .line 484
    .line 485
    move-result v2

    .line 486
    if-eqz v2, :cond_1dc

    .line 487
    .line 488
    invoke-virtual {v9, v13}, Ljava/io/OutputStream;->write(I)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v9, v11}, Lax/y0/a$c;->c(I)V

    .line 492
    .line 493
    .line 494
    goto :goto_1dc

    .line 495
    :goto_1ee
    invoke-static {v3, v9, v15}, Lax/y0/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    .line 496
    .line 497
    .line 498
    invoke-direct {v1, v9}, Lax/y0/a;->t0(Lax/y0/a$c;)I

    .line 499
    .line 500
    .line 501
    move-result v2

    .line 502
    :goto_1f5
    add-int/lit8 v5, v5, 0x8

    .line 503
    .line 504
    invoke-virtual {v3}, Lax/y0/a$b;->b()I

    .line 505
    .line 506
    .line 507
    move-result v4

    .line 508
    sub-int/2addr v5, v4

    .line 509
    invoke-static {v3, v9, v5}, Lax/y0/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->size()I

    .line 513
    .line 514
    .line 515
    move-result v4

    .line 516
    sget-object v5, Lax/y0/a;->O:[B

    .line 517
    .line 518
    array-length v6, v5

    .line 519
    add-int/2addr v4, v6

    .line 520
    invoke-virtual {v0, v4}, Lax/y0/a$c;->c(I)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v0, v5}, Lax/y0/a$c;->write([B)V

    .line 524
    .line 525
    .line 526
    const/4 v4, -0x1

    .line 527
    if-eq v2, v4, :cond_219

    .line 528
    .line 529
    iget-object v4, v0, Lax/y0/a$c;->q:Ljava/io/DataOutputStream;

    .line 530
    .line 531
    invoke-virtual {v4}, Ljava/io/DataOutputStream;->size()I

    .line 532
    .line 533
    .line 534
    move-result v4

    .line 535
    add-int/2addr v4, v2

    .line 536
    iput v4, v1, Lax/y0/a;->q:I

    .line 537
    .line 538
    :cond_219
    invoke-virtual {v8, v0}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    .line 539
    .line 540
    .line 541
    invoke-static {v3, v0}, Lax/y0/b;->d(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    :try_end_21f
    .catch Ljava/lang/Exception; {:try_start_d2 .. :try_end_21f} :catch_82
    .catchall {:try_start_d2 .. :try_end_21f} :catchall_7e

    .line 542
    .line 543
    .line 544
    invoke-static {v8}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 545
    .line 546
    .line 547
    return-void

    .line 548
    :catchall_223
    move-exception v0

    .line 549
    goto :goto_22e

    .line 550
    :catch_225
    move-exception v0

    .line 551
    :goto_226
    :try_start_226
    new-instance v2, Ljava/io/IOException;

    .line 552
    .line 553
    const-string v3, "Failed to save WebP file"

    .line 554
    .line 555
    invoke-direct {v2, v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 556
    .line 557
    .line 558
    throw v2
    :try_end_22e
    .catchall {:try_start_226 .. :try_end_22e} :catchall_223

    .line 559
    :goto_22e
    invoke-static {v7}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 560
    .line 561
    .line 562
    throw v0
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
.end method

.method private n0(Lax/y0/a$b;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    const-string v1, "Compression"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lax/y0/a$d;

    .line 13
    .line 14
    const/4 v2, 0x6

    .line 15
    if-eqz v1, :cond_2f

    .line 16
    .line 17
    iget-object v3, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Lax/y0/a$d;->m(Ljava/nio/ByteOrder;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iput v1, p0, Lax/y0/a;->p:I

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    if-eq v1, v3, :cond_25

    .line 27
    .line 28
    if-eq v1, v2, :cond_21

    .line 29
    .line 30
    const/4 v2, 0x7

    .line 31
    if-eq v1, v2, :cond_25

    .line 32
    .line 33
    goto :goto_2e

    .line 34
    :cond_21
    invoke-direct {p0, p1, v0}, Lax/y0/a;->G(Lax/y0/a$b;Ljava/util/HashMap;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_25
    invoke-direct {p0, v0}, Lax/y0/a;->Q(Ljava/util/HashMap;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2e

    .line 43
    .line 44
    invoke-direct {p0, p1, v0}, Lax/y0/a;->H(Lax/y0/a$b;Ljava/util/HashMap;)V

    .line 45
    .line 46
    .line 47
    :cond_2e
    :goto_2e
    return-void

    .line 48
    :cond_2f
    iput v2, p0, Lax/y0/a;->p:I

    .line 49
    .line 50
    invoke-direct {p0, p1, v0}, Lax/y0/a;->G(Lax/y0/a$b;Ljava/util/HashMap;)V

    .line 51
    .line 52
    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static o0(I)Z
    .registers 2

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eq p0, v0, :cond_12

    .line 3
    .line 4
    const/16 v0, 0x9

    .line 5
    .line 6
    if-eq p0, v0, :cond_12

    .line 7
    .line 8
    const/16 v0, 0xd

    .line 9
    .line 10
    if-eq p0, v0, :cond_12

    .line 11
    .line 12
    const/16 v0, 0xe

    .line 13
    .line 14
    if-ne p0, v0, :cond_10

    .line 15
    .line 16
    goto :goto_12

    .line 17
    :cond_10
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_12
    :goto_12
    const/4 p0, 0x0

    .line 20
    return p0
    .line 21
    .line 22
.end method

.method private p(Ljava/lang/String;)Lax/y0/a$d;
    .registers 5

    .line 1
    if-eqz p1, :cond_50

    .line 2
    .line 3
    const-string v0, "ISOSpeedRatings"

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_17

    .line 10
    .line 11
    sget-boolean p1, Lax/y0/a;->x:Z

    .line 12
    .line 13
    if-eqz p1, :cond_15

    .line 14
    .line 15
    const-string p1, "ExifInterface"

    .line 16
    .line 17
    const-string v0, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."

    .line 18
    .line 19
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    :cond_15
    const-string p1, "PhotographicSensitivity"

    .line 23
    .line 24
    :cond_17
    const-string v0, "Xmp"

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2d

    .line 31
    .line 32
    iget v1, p0, Lax/y0/a;->d:I

    .line 33
    .line 34
    invoke-static {v1}, Lax/y0/a;->E(I)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v2, 0x2

    .line 39
    if-ne v1, v2, :cond_2d

    .line 40
    .line 41
    iget-object v1, p0, Lax/y0/a;->v:Lax/y0/a$d;

    .line 42
    .line 43
    if-eqz v1, :cond_2d

    .line 44
    .line 45
    return-object v1

    .line 46
    :cond_2d
    const/4 v1, 0x0

    .line 47
    :goto_2e
    sget-object v2, Lax/y0/a;->l0:[[Lax/y0/a$e;

    .line 48
    .line 49
    array-length v2, v2

    .line 50
    if-ge v1, v2, :cond_43

    .line 51
    .line 52
    iget-object v2, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 53
    .line 54
    aget-object v2, v2, v1

    .line 55
    .line 56
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Lax/y0/a$d;

    .line 61
    .line 62
    if-eqz v2, :cond_40

    .line 63
    .line 64
    return-object v2

    .line 65
    :cond_40
    add-int/lit8 v1, v1, 0x1

    .line 66
    .line 67
    goto :goto_2e

    .line 68
    :cond_43
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_4e

    .line 73
    .line 74
    iget-object p1, p0, Lax/y0/a;->v:Lax/y0/a$d;

    .line 75
    .line 76
    if-eqz p1, :cond_4e

    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_4e
    const/4 p1, 0x0

    .line 80
    return-object p1

    .line 81
    :cond_50
    new-instance p1, Ljava/lang/NullPointerException;

    .line 82
    .line 83
    const-string v0, "tag shouldn\'t be null"

    .line 84
    .line 85
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method private p0(II)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v0, v0, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, "ExifInterface"

    .line 10
    .line 11
    if-nez v0, :cond_8e

    .line 12
    .line 13
    iget-object v0, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 14
    .line 15
    aget-object v0, v0, p2

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_18

    .line 22
    .line 23
    goto/16 :goto_8e

    .line 24
    .line 25
    :cond_18
    iget-object v0, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 26
    .line 27
    aget-object v0, v0, p1

    .line 28
    .line 29
    const-string v2, "ImageLength"

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lax/y0/a$d;

    .line 36
    .line 37
    iget-object v3, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 38
    .line 39
    aget-object v3, v3, p1

    .line 40
    .line 41
    const-string v4, "ImageWidth"

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Lax/y0/a$d;

    .line 48
    .line 49
    iget-object v5, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 50
    .line 51
    aget-object v5, v5, p2

    .line 52
    .line 53
    invoke-virtual {v5, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lax/y0/a$d;

    .line 58
    .line 59
    iget-object v5, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 60
    .line 61
    aget-object v5, v5, p2

    .line 62
    .line 63
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Lax/y0/a$d;

    .line 68
    .line 69
    if-eqz v0, :cond_84

    .line 70
    .line 71
    if-nez v3, :cond_49

    .line 72
    .line 73
    goto :goto_84

    .line 74
    :cond_49
    if-eqz v2, :cond_7a

    .line 75
    .line 76
    if-nez v4, :cond_4e

    .line 77
    .line 78
    goto :goto_7a

    .line 79
    :cond_4e
    iget-object v1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Lax/y0/a$d;->m(Ljava/nio/ByteOrder;)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget-object v1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 86
    .line 87
    invoke-virtual {v3, v1}, Lax/y0/a$d;->m(Ljava/nio/ByteOrder;)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    iget-object v3, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 92
    .line 93
    invoke-virtual {v2, v3}, Lax/y0/a$d;->m(Ljava/nio/ByteOrder;)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    iget-object v3, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 98
    .line 99
    invoke-virtual {v4, v3}, Lax/y0/a$d;->m(Ljava/nio/ByteOrder;)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-ge v0, v2, :cond_97

    .line 104
    .line 105
    if-ge v1, v3, :cond_97

    .line 106
    .line 107
    iget-object v0, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 108
    .line 109
    aget-object v1, v0, p1

    .line 110
    .line 111
    aget-object v2, v0, p2

    .line 112
    .line 113
    aput-object v2, v0, p1

    .line 114
    .line 115
    aput-object v1, v0, p2

    .line 116
    .line 117
    if-nez p1, :cond_97

    .line 118
    .line 119
    const/4 p1, 0x1

    .line 120
    iput-boolean p1, p0, Lax/y0/a;->g:Z

    .line 121
    .line 122
    return-void

    .line 123
    :cond_7a
    :goto_7a
    sget-boolean p1, Lax/y0/a;->x:Z

    .line 124
    .line 125
    if-eqz p1, :cond_97

    .line 126
    .line 127
    const-string p1, "Second image does not contain valid size information"

    .line 128
    .line 129
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_84
    :goto_84
    sget-boolean p1, Lax/y0/a;->x:Z

    .line 134
    .line 135
    if-eqz p1, :cond_97

    .line 136
    .line 137
    const-string p1, "First image does not contain valid size information"

    .line 138
    .line 139
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_8e
    :goto_8e
    sget-boolean p1, Lax/y0/a;->x:Z

    .line 144
    .line 145
    if-eqz p1, :cond_97

    .line 146
    .line 147
    const-string p1, "Cannot perform swap since only one image data exists"

    .line 148
    .line 149
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    :cond_97
    return-void
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private q(Lax/y0/a$g;I)V
    .registers 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const-string v0, "yes"

    .line 2
    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v2, 0x1c

    .line 6
    .line 7
    if-lt v1, v2, :cond_171

    .line 8
    .line 9
    const/16 v2, 0xf

    .line 10
    .line 11
    const/16 v3, 0x1f

    .line 12
    .line 13
    if-ne p2, v2, :cond_19

    .line 14
    .line 15
    if-lt v1, v3, :cond_11

    .line 16
    .line 17
    goto :goto_19

    .line 18
    :cond_11
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 19
    .line 20
    const-string p2, "Reading EXIF from AVIF files is supported from SDK 31 and above"

    .line 21
    .line 22
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_19
    :goto_19
    new-instance p2, Landroid/media/MediaMetadataRetriever;

    .line 27
    .line 28
    invoke-direct {p2}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 29
    .line 30
    .line 31
    :try_start_1e
    new-instance v1, Lax/y0/a$a;

    .line 32
    .line 33
    invoke-direct {v1, p0, p1}, Lax/y0/a$a;-><init>(Lax/y0/a;Lax/y0/a$g;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p2, v1}, Lax/y0/b$a;->a(Landroid/media/MediaMetadataRetriever;Landroid/media/MediaDataSource;)V

    .line 37
    .line 38
    .line 39
    const/16 v1, 0x21

    .line 40
    .line 41
    invoke-virtual {p2, v1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const/16 v2, 0x22

    .line 46
    .line 47
    invoke-virtual {p2, v2}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const/16 v4, 0x1a

    .line 52
    .line 53
    invoke-virtual {p2, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    const/16 v5, 0x11

    .line 58
    .line 59
    invoke-virtual {p2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_5d

    .line 68
    .line 69
    const/16 v0, 0x1d

    .line 70
    .line 71
    invoke-virtual {p2, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const/16 v4, 0x1e

    .line 76
    .line 77
    invoke-virtual {p2, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {p2, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    goto :goto_79

    .line 86
    :catchall_55
    move-exception v0

    .line 87
    move-object p1, v0

    .line 88
    goto/16 :goto_16d

    .line 89
    .line 90
    :catch_59
    move-exception v0

    .line 91
    move-object p1, v0

    .line 92
    goto/16 :goto_165

    .line 93
    .line 94
    :cond_5d
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_76

    .line 99
    .line 100
    const/16 v0, 0x12

    .line 101
    .line 102
    invoke-virtual {p2, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const/16 v3, 0x13

    .line 107
    .line 108
    invoke-virtual {p2, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    const/16 v3, 0x18

    .line 113
    .line 114
    invoke-virtual {p2, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    goto :goto_79

    .line 119
    :cond_76
    const/4 v0, 0x0

    .line 120
    move-object v3, v0

    .line 121
    move-object v4, v3

    .line 122
    :goto_79
    const/4 v5, 0x0

    .line 123
    if-eqz v0, :cond_8f

    .line 124
    .line 125
    iget-object v6, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 126
    .line 127
    aget-object v6, v6, v5

    .line 128
    .line 129
    const-string v7, "ImageWidth"

    .line 130
    .line 131
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    iget-object v9, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 136
    .line 137
    invoke-static {v8, v9}, Lax/y0/a$d;->j(ILjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    :cond_8f
    if-eqz v4, :cond_a4

    .line 145
    .line 146
    iget-object v6, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 147
    .line 148
    aget-object v6, v6, v5

    .line 149
    .line 150
    const-string v7, "ImageLength"

    .line 151
    .line 152
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    iget-object v9, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 157
    .line 158
    invoke-static {v8, v9}, Lax/y0/a$d;->j(ILjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    invoke-virtual {v6, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    :cond_a4
    const/4 v6, 0x1

    .line 166
    const/4 v7, 0x6

    .line 167
    if-eqz v3, :cond_cf

    .line 168
    .line 169
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    const/16 v9, 0x5a

    .line 174
    .line 175
    if-eq v8, v9, :cond_bf

    .line 176
    .line 177
    const/16 v9, 0xb4

    .line 178
    .line 179
    if-eq v8, v9, :cond_bd

    .line 180
    .line 181
    const/16 v9, 0x10e

    .line 182
    .line 183
    if-eq v8, v9, :cond_ba

    .line 184
    .line 185
    const/4 v8, 0x1

    .line 186
    goto :goto_c0

    .line 187
    :cond_ba
    const/16 v8, 0x8

    .line 188
    .line 189
    goto :goto_c0

    .line 190
    :cond_bd
    const/4 v8, 0x3

    .line 191
    goto :goto_c0

    .line 192
    :cond_bf
    const/4 v8, 0x6

    .line 193
    :goto_c0
    iget-object v9, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 194
    .line 195
    aget-object v9, v9, v5

    .line 196
    .line 197
    const-string v10, "Orientation"

    .line 198
    .line 199
    iget-object v11, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 200
    .line 201
    invoke-static {v8, v11}, Lax/y0/a$d;->j(ILjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    invoke-virtual {v9, v10, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    :cond_cf
    if-eqz v1, :cond_10c

    .line 209
    .line 210
    if-eqz v2, :cond_10c

    .line 211
    .line 212
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-le v2, v7, :cond_104

    .line 221
    .line 222
    int-to-long v8, v1

    .line 223
    invoke-virtual {p1, v8, v9}, Lax/y0/a$g;->g(J)V

    .line 224
    .line 225
    .line 226
    new-array v8, v7, [B

    .line 227
    .line 228
    invoke-virtual {p1, v8}, Lax/y0/a$b;->readFully([B)V

    .line 229
    .line 230
    .line 231
    add-int/2addr v1, v7

    .line 232
    add-int/lit8 v2, v2, -0x6

    .line 233
    .line 234
    sget-object v7, Lax/y0/a;->s0:[B

    .line 235
    .line 236
    invoke-static {v8, v7}, Ljava/util/Arrays;->equals([B[B)Z

    .line 237
    .line 238
    .line 239
    move-result v7

    .line 240
    if-eqz v7, :cond_fc

    .line 241
    .line 242
    new-array v2, v2, [B

    .line 243
    .line 244
    invoke-virtual {p1, v2}, Lax/y0/a$b;->readFully([B)V

    .line 245
    .line 246
    .line 247
    iput v1, p0, Lax/y0/a;->q:I

    .line 248
    .line 249
    invoke-direct {p0, v2, v5}, Lax/y0/a;->a0([BI)V

    .line 250
    .line 251
    .line 252
    goto :goto_10c

    .line 253
    :cond_fc
    new-instance p1, Ljava/io/IOException;

    .line 254
    .line 255
    const-string v0, "Invalid identifier"

    .line 256
    .line 257
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw p1

    .line 261
    :cond_104
    new-instance p1, Ljava/io/IOException;

    .line 262
    .line 263
    const-string v0, "Invalid exif length"

    .line 264
    .line 265
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw p1

    .line 269
    :cond_10c
    :goto_10c
    const/16 v1, 0x29

    .line 270
    .line 271
    invoke-virtual {p2, v1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    const/16 v2, 0x2a

    .line 276
    .line 277
    invoke-virtual {p2, v2}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    if-eqz v1, :cond_137

    .line 282
    .line 283
    if-eqz v2, :cond_137

    .line 284
    .line 285
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 290
    .line 291
    .line 292
    move-result v9

    .line 293
    int-to-long v10, v1

    .line 294
    invoke-virtual {p1, v10, v11}, Lax/y0/a$g;->g(J)V

    .line 295
    .line 296
    .line 297
    new-array v12, v9, [B

    .line 298
    .line 299
    invoke-virtual {p1, v12}, Lax/y0/a$b;->readFully([B)V

    .line 300
    .line 301
    .line 302
    new-instance v7, Lax/y0/a$d;

    .line 303
    .line 304
    const/4 v8, 0x1

    .line 305
    invoke-direct/range {v7 .. v12}, Lax/y0/a$d;-><init>(IIJ[B)V

    .line 306
    .line 307
    .line 308
    iput-object v7, p0, Lax/y0/a;->v:Lax/y0/a$d;

    .line 309
    .line 310
    iput-boolean v6, p0, Lax/y0/a;->w:Z

    .line 311
    .line 312
    :cond_137
    sget-boolean p1, Lax/y0/a;->x:Z

    .line 313
    .line 314
    if-eqz p1, :cond_161

    .line 315
    .line 316
    const-string p1, "ExifInterface"

    .line 317
    .line 318
    new-instance v1, Ljava/lang/StringBuilder;

    .line 319
    .line 320
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 321
    .line 322
    .line 323
    const-string v2, "Heif meta: "

    .line 324
    .line 325
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    const-string v0, "x"

    .line 332
    .line 333
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    const-string v0, ", rotation "

    .line 340
    .line 341
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_161
    .catch Ljava/lang/RuntimeException; {:try_start_1e .. :try_end_161} :catch_59
    .catchall {:try_start_1e .. :try_end_161} :catchall_55

    .line 352
    .line 353
    .line 354
    :cond_161
    :try_start_161
    invoke-virtual {p2}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_164
    .catch Ljava/io/IOException; {:try_start_161 .. :try_end_164} :catch_164

    .line 355
    .line 356
    .line 357
    :catch_164
    return-void

    .line 358
    :goto_165
    :try_start_165
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 359
    .line 360
    const-string v1, "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."

    .line 361
    .line 362
    invoke-direct {v0, v1, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 363
    .line 364
    .line 365
    throw v0
    :try_end_16d
    .catchall {:try_start_165 .. :try_end_16d} :catchall_55

    .line 366
    :goto_16d
    :try_start_16d
    invoke-virtual {p2}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_170
    .catch Ljava/io/IOException; {:try_start_16d .. :try_end_170} :catch_170

    .line 367
    .line 368
    .line 369
    :catch_170
    throw p1

    .line 370
    :cond_171
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 371
    .line 372
    const-string p2, "Reading EXIF from HEIC files is supported from SDK 28 and above"

    .line 373
    .line 374
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    throw p1
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private static q0(Ljava/util/zip/CRC32;I)V
    .registers 3

    .line 1
    ushr-int/lit8 v0, p1, 0x18

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/util/zip/CRC32;->update(I)V

    .line 4
    .line 5
    .line 6
    ushr-int/lit8 v0, p1, 0x10

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/util/zip/CRC32;->update(I)V

    .line 9
    .line 10
    .line 11
    ushr-int/lit8 v0, p1, 0x8

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/util/zip/CRC32;->update(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/util/zip/CRC32;->update(I)V

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private r(Lax/y0/a$b;II)V
    .registers 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    sget-boolean v3, Lax/y0/a;->x:Z

    .line 8
    .line 9
    const-string v4, "ExifInterface"

    .line 10
    .line 11
    if-eqz v3, :cond_20

    .line 12
    .line 13
    new-instance v3, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v5, "getJpegAttributes starting with: "

    .line 19
    .line 20
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    :cond_20
    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Lax/y0/a$b;->e(Ljava/nio/ByteOrder;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lax/y0/a$b;->readByte()B

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const-string v5, "Invalid marker: "

    .line 43
    .line 44
    const/4 v6, -0x1

    .line 45
    if-ne v3, v6, :cond_1a9

    .line 46
    .line 47
    invoke-virtual {v1}, Lax/y0/a$b;->readByte()B

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    const/16 v8, -0x28

    .line 52
    .line 53
    if-ne v7, v8, :cond_18e

    .line 54
    .line 55
    const/4 v3, 0x2

    .line 56
    :goto_37
    invoke-virtual {v1}, Lax/y0/a$b;->readByte()B

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-ne v5, v6, :cond_171

    .line 61
    .line 62
    invoke-virtual {v1}, Lax/y0/a$b;->readByte()B

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    sget-boolean v7, Lax/y0/a;->x:Z

    .line 67
    .line 68
    if-eqz v7, :cond_5f

    .line 69
    .line 70
    new-instance v8, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v9, "Found JPEG segment indicator: "

    .line 76
    .line 77
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    and-int/lit16 v9, v5, 0xff

    .line 81
    .line 82
    invoke-static {v9}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-static {v4, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    :cond_5f
    const/16 v8, -0x27

    .line 97
    .line 98
    if-eq v5, v8, :cond_16b

    .line 99
    .line 100
    const/16 v8, -0x26

    .line 101
    .line 102
    if-ne v5, v8, :cond_69

    .line 103
    .line 104
    goto/16 :goto_16b

    .line 105
    .line 106
    :cond_69
    invoke-virtual {v1}, Lax/y0/a$b;->readUnsignedShort()I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    add-int/lit8 v9, v8, -0x2

    .line 111
    .line 112
    const/4 v10, 0x4

    .line 113
    add-int/2addr v3, v10

    .line 114
    if-eqz v7, :cond_9a

    .line 115
    .line 116
    new-instance v7, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    const-string v11, "JPEG segment: "

    .line 122
    .line 123
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    and-int/lit16 v11, v5, 0xff

    .line 127
    .line 128
    invoke-static {v11}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v11

    .line 132
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v11, " (length: "

    .line 136
    .line 137
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v11, ")"

    .line 144
    .line 145
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    invoke-static {v4, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    :cond_9a
    const-string v7, "Invalid length"

    .line 156
    .line 157
    if-ltz v9, :cond_165

    .line 158
    .line 159
    const/16 v11, -0x1f

    .line 160
    .line 161
    const/4 v12, 0x0

    .line 162
    const/4 v13, 0x1

    .line 163
    if-eq v5, v11, :cond_10e

    .line 164
    .line 165
    const/4 v11, -0x2

    .line 166
    if-eq v5, v11, :cond_ed

    .line 167
    .line 168
    packed-switch v5, :pswitch_data_1c4

    .line 169
    .line 170
    .line 171
    packed-switch v5, :pswitch_data_1d0

    .line 172
    .line 173
    .line 174
    packed-switch v5, :pswitch_data_1da

    .line 175
    .line 176
    .line 177
    packed-switch v5, :pswitch_data_1e4

    .line 178
    .line 179
    .line 180
    goto/16 :goto_157

    .line 181
    .line 182
    :pswitch_b5
    invoke-virtual {v1, v13}, Lax/y0/a$b;->f(I)V

    .line 183
    .line 184
    .line 185
    iget-object v5, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 186
    .line 187
    aget-object v5, v5, v2

    .line 188
    .line 189
    if-eq v2, v10, :cond_c1

    .line 190
    .line 191
    const-string v9, "ImageLength"

    .line 192
    .line 193
    goto :goto_c3

    .line 194
    :cond_c1
    const-string v9, "ThumbnailImageLength"

    .line 195
    .line 196
    :goto_c3
    invoke-virtual {v1}, Lax/y0/a$b;->readUnsignedShort()I

    .line 197
    .line 198
    .line 199
    move-result v11

    .line 200
    int-to-long v11, v11

    .line 201
    iget-object v13, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 202
    .line 203
    invoke-static {v11, v12, v13}, Lax/y0/a$d;->f(JLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 204
    .line 205
    .line 206
    move-result-object v11

    .line 207
    invoke-virtual {v5, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    iget-object v5, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 211
    .line 212
    aget-object v5, v5, v2

    .line 213
    .line 214
    if-eq v2, v10, :cond_da

    .line 215
    .line 216
    const-string v9, "ImageWidth"

    .line 217
    .line 218
    goto :goto_dc

    .line 219
    :cond_da
    const-string v9, "ThumbnailImageWidth"

    .line 220
    .line 221
    :goto_dc
    invoke-virtual {v1}, Lax/y0/a$b;->readUnsignedShort()I

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    int-to-long v10, v10

    .line 226
    iget-object v12, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 227
    .line 228
    invoke-static {v10, v11, v12}, Lax/y0/a$d;->f(JLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 229
    .line 230
    .line 231
    move-result-object v10

    .line 232
    invoke-virtual {v5, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    add-int/lit8 v9, v8, -0x7

    .line 236
    .line 237
    goto :goto_157

    .line 238
    :cond_ed
    new-array v5, v9, [B

    .line 239
    .line 240
    invoke-virtual {v1, v5}, Lax/y0/a$b;->readFully([B)V

    .line 241
    .line 242
    .line 243
    const-string v8, "UserComment"

    .line 244
    .line 245
    invoke-virtual {v0, v8}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    if-nez v9, :cond_10c

    .line 250
    .line 251
    iget-object v9, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 252
    .line 253
    aget-object v9, v9, v13

    .line 254
    .line 255
    new-instance v10, Ljava/lang/String;

    .line 256
    .line 257
    sget-object v11, Lax/y0/a;->r0:Ljava/nio/charset/Charset;

    .line 258
    .line 259
    invoke-direct {v10, v5, v11}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 260
    .line 261
    .line 262
    invoke-static {v10}, Lax/y0/a$d;->e(Ljava/lang/String;)Lax/y0/a$d;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    invoke-virtual {v9, v8, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    :cond_10c
    :goto_10c
    const/4 v9, 0x0

    .line 270
    goto :goto_157

    .line 271
    :cond_10e
    new-array v5, v9, [B

    .line 272
    .line 273
    invoke-virtual {v1, v5}, Lax/y0/a$b;->readFully([B)V

    .line 274
    .line 275
    .line 276
    add-int v8, v3, v9

    .line 277
    .line 278
    sget-object v10, Lax/y0/a;->s0:[B

    .line 279
    .line 280
    invoke-static {v5, v10}, Lax/y0/b;->g([B[B)Z

    .line 281
    .line 282
    .line 283
    move-result v11

    .line 284
    if-eqz v11, :cond_134

    .line 285
    .line 286
    array-length v11, v10

    .line 287
    invoke-static {v5, v11, v9}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    add-int v3, p2, v3

    .line 292
    .line 293
    array-length v9, v10

    .line 294
    add-int/2addr v3, v9

    .line 295
    iput v3, v0, Lax/y0/a;->q:I

    .line 296
    .line 297
    invoke-direct {v0, v5, v2}, Lax/y0/a;->a0([BI)V

    .line 298
    .line 299
    .line 300
    new-instance v3, Lax/y0/a$b;

    .line 301
    .line 302
    invoke-direct {v3, v5}, Lax/y0/a$b;-><init>([B)V

    .line 303
    .line 304
    .line 305
    invoke-direct {v0, v3}, Lax/y0/a;->n0(Lax/y0/a$b;)V

    .line 306
    .line 307
    .line 308
    goto :goto_155

    .line 309
    :cond_134
    sget-object v10, Lax/y0/a;->t0:[B

    .line 310
    .line 311
    invoke-static {v5, v10}, Lax/y0/b;->g([B[B)Z

    .line 312
    .line 313
    .line 314
    move-result v11

    .line 315
    if-eqz v11, :cond_155

    .line 316
    .line 317
    array-length v11, v10

    .line 318
    add-int/2addr v3, v11

    .line 319
    array-length v10, v10

    .line 320
    invoke-static {v5, v10, v9}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 321
    .line 322
    .line 323
    move-result-object v5

    .line 324
    new-instance v14, Lax/y0/a$d;

    .line 325
    .line 326
    array-length v9, v5

    .line 327
    int-to-long v10, v3

    .line 328
    const/4 v15, 0x1

    .line 329
    move-object/from16 v19, v5

    .line 330
    .line 331
    move/from16 v16, v9

    .line 332
    .line 333
    move-wide/from16 v17, v10

    .line 334
    .line 335
    invoke-direct/range {v14 .. v19}, Lax/y0/a$d;-><init>(IIJ[B)V

    .line 336
    .line 337
    .line 338
    iput-object v14, v0, Lax/y0/a;->v:Lax/y0/a$d;

    .line 339
    .line 340
    iput-boolean v13, v0, Lax/y0/a;->w:Z

    .line 341
    .line 342
    :cond_155
    :goto_155
    move v3, v8

    .line 343
    goto :goto_10c

    .line 344
    :goto_157
    if-ltz v9, :cond_15f

    .line 345
    .line 346
    invoke-virtual {v1, v9}, Lax/y0/a$b;->f(I)V

    .line 347
    .line 348
    .line 349
    add-int/2addr v3, v9

    .line 350
    goto/16 :goto_37

    .line 351
    .line 352
    :cond_15f
    new-instance v1, Ljava/io/IOException;

    .line 353
    .line 354
    invoke-direct {v1, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    throw v1

    .line 358
    :cond_165
    new-instance v1, Ljava/io/IOException;

    .line 359
    .line 360
    invoke-direct {v1, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    throw v1

    .line 364
    :cond_16b
    :goto_16b
    iget-object v2, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 365
    .line 366
    invoke-virtual {v1, v2}, Lax/y0/a$b;->e(Ljava/nio/ByteOrder;)V

    .line 367
    .line 368
    .line 369
    return-void

    .line 370
    :cond_171
    new-instance v1, Ljava/io/IOException;

    .line 371
    .line 372
    new-instance v2, Ljava/lang/StringBuilder;

    .line 373
    .line 374
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 375
    .line 376
    .line 377
    const-string v3, "Invalid marker:"

    .line 378
    .line 379
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    and-int/lit16 v3, v5, 0xff

    .line 383
    .line 384
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    throw v1

    .line 399
    :cond_18e
    new-instance v1, Ljava/io/IOException;

    .line 400
    .line 401
    new-instance v2, Ljava/lang/StringBuilder;

    .line 402
    .line 403
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    and-int/lit16 v3, v3, 0xff

    .line 410
    .line 411
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    throw v1

    .line 426
    :cond_1a9
    new-instance v1, Ljava/io/IOException;

    .line 427
    .line 428
    new-instance v2, Ljava/lang/StringBuilder;

    .line 429
    .line 430
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    and-int/lit16 v3, v3, 0xff

    .line 437
    .line 438
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    throw v1

    .line 453
    :pswitch_data_1c4
    .packed-switch -0x40
        :pswitch_b5
        :pswitch_b5
        :pswitch_b5
        :pswitch_b5
    .end packed-switch

    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    :pswitch_data_1d0
    .packed-switch -0x3b
        :pswitch_b5
        :pswitch_b5
        :pswitch_b5
    .end packed-switch

    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    :pswitch_data_1da
    .packed-switch -0x37
        :pswitch_b5
        :pswitch_b5
        :pswitch_b5
    .end packed-switch

    :pswitch_data_1e4
    .packed-switch -0x33
        :pswitch_b5
        :pswitch_b5
        :pswitch_b5
    .end packed-switch
.end method

.method private r0(Lax/y0/a$g;I)V
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v0, v0, p2

    .line 4
    .line 5
    const-string v1, "DefaultCropSize"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lax/y0/a$d;

    .line 12
    .line 13
    iget-object v1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 14
    .line 15
    aget-object v1, v1, p2

    .line 16
    .line 17
    const-string v2, "SensorTopBorder"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lax/y0/a$d;

    .line 24
    .line 25
    iget-object v2, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 26
    .line 27
    aget-object v2, v2, p2

    .line 28
    .line 29
    const-string v3, "SensorLeftBorder"

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lax/y0/a$d;

    .line 36
    .line 37
    iget-object v3, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 38
    .line 39
    aget-object v3, v3, p2

    .line 40
    .line 41
    const-string v4, "SensorBottomBorder"

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Lax/y0/a$d;

    .line 48
    .line 49
    iget-object v4, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 50
    .line 51
    aget-object v4, v4, p2

    .line 52
    .line 53
    const-string v5, "SensorRightBorder"

    .line 54
    .line 55
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Lax/y0/a$d;

    .line 60
    .line 61
    const-string v5, "ImageLength"

    .line 62
    .line 63
    const-string v6, "ImageWidth"

    .line 64
    .line 65
    if-eqz v0, :cond_c8

    .line 66
    .line 67
    iget p1, v0, Lax/y0/a$d;->a:I

    .line 68
    .line 69
    const/4 v1, 0x5

    .line 70
    const-string v2, "Invalid crop size values. cropSize="

    .line 71
    .line 72
    const-string v3, "ExifInterface"

    .line 73
    .line 74
    const/4 v4, 0x1

    .line 75
    const/4 v7, 0x0

    .line 76
    const/4 v8, 0x2

    .line 77
    if-ne p1, v1, :cond_84

    .line 78
    .line 79
    iget-object p1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 80
    .line 81
    invoke-virtual {v0, p1}, Lax/y0/a$d;->o(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, [Lax/y0/a$f;

    .line 86
    .line 87
    if-eqz p1, :cond_6d

    .line 88
    .line 89
    array-length v0, p1

    .line 90
    if-eq v0, v8, :cond_5c

    .line 91
    .line 92
    goto :goto_6d

    .line 93
    :cond_5c
    aget-object v0, p1, v7

    .line 94
    .line 95
    iget-object v1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 96
    .line 97
    invoke-static {v0, v1}, Lax/y0/a$d;->h(Lax/y0/a$f;Ljava/nio/ByteOrder;)Lax/y0/a$d;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    aget-object p1, p1, v4

    .line 102
    .line 103
    iget-object v1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 104
    .line 105
    invoke-static {p1, v1}, Lax/y0/a$d;->h(Lax/y0/a$f;Ljava/nio/ByteOrder;)Lax/y0/a$d;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    goto :goto_a2

    .line 110
    :cond_6d
    :goto_6d
    new-instance p2, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_84
    iget-object p1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 134
    .line 135
    invoke-virtual {v0, p1}, Lax/y0/a$d;->o(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    check-cast p1, [I

    .line 140
    .line 141
    if-eqz p1, :cond_b1

    .line 142
    .line 143
    array-length v0, p1

    .line 144
    if-eq v0, v8, :cond_92

    .line 145
    .line 146
    goto :goto_b1

    .line 147
    :cond_92
    aget v0, p1, v7

    .line 148
    .line 149
    iget-object v1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 150
    .line 151
    invoke-static {v0, v1}, Lax/y0/a$d;->j(ILjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    aget p1, p1, v4

    .line 156
    .line 157
    iget-object v1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 158
    .line 159
    invoke-static {p1, v1}, Lax/y0/a$d;->j(ILjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    :goto_a2
    iget-object v1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 164
    .line 165
    aget-object v1, v1, p2

    .line 166
    .line 167
    invoke-virtual {v1, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    iget-object v0, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 171
    .line 172
    aget-object p2, v0, p2

    .line 173
    .line 174
    invoke-virtual {p2, v5, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_b1
    :goto_b1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :cond_c8
    if-eqz v1, :cond_109

    .line 202
    .line 203
    if-eqz v2, :cond_109

    .line 204
    .line 205
    if-eqz v3, :cond_109

    .line 206
    .line 207
    if-eqz v4, :cond_109

    .line 208
    .line 209
    iget-object p1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 210
    .line 211
    invoke-virtual {v1, p1}, Lax/y0/a$d;->m(Ljava/nio/ByteOrder;)I

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    iget-object v0, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 216
    .line 217
    invoke-virtual {v3, v0}, Lax/y0/a$d;->m(Ljava/nio/ByteOrder;)I

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    iget-object v1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 222
    .line 223
    invoke-virtual {v4, v1}, Lax/y0/a$d;->m(Ljava/nio/ByteOrder;)I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    iget-object v3, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 228
    .line 229
    invoke-virtual {v2, v3}, Lax/y0/a$d;->m(Ljava/nio/ByteOrder;)I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-le v0, p1, :cond_108

    .line 234
    .line 235
    if-le v1, v2, :cond_108

    .line 236
    .line 237
    sub-int/2addr v0, p1

    .line 238
    sub-int/2addr v1, v2

    .line 239
    iget-object p1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 240
    .line 241
    invoke-static {v0, p1}, Lax/y0/a$d;->j(ILjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    iget-object v0, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 246
    .line 247
    invoke-static {v1, v0}, Lax/y0/a$d;->j(ILjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    iget-object v1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 252
    .line 253
    aget-object v1, v1, p2

    .line 254
    .line 255
    invoke-virtual {v1, v5, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    iget-object p1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 259
    .line 260
    aget-object p1, p1, p2

    .line 261
    .line 262
    invoke-virtual {p1, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    :cond_108
    return-void

    .line 266
    :cond_109
    invoke-direct {p0, p1, p2}, Lax/y0/a;->g0(Lax/y0/a$g;I)V

    .line 267
    .line 268
    .line 269
    return-void
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
.end method

.method private s0()V
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x5

    .line 3
    invoke-direct {p0, v0, v1}, Lax/y0/a;->p0(II)V

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x4

    .line 7
    invoke-direct {p0, v0, v2}, Lax/y0/a;->p0(II)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v1, v2}, Lax/y0/a;->p0(II)V

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    aget-object v3, v3, v4

    .line 17
    .line 18
    const-string v5, "PixelXDimension"

    .line 19
    .line 20
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lax/y0/a$d;

    .line 25
    .line 26
    iget-object v5, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 27
    .line 28
    aget-object v4, v5, v4

    .line 29
    .line 30
    const-string v5, "PixelYDimension"

    .line 31
    .line 32
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Lax/y0/a$d;

    .line 37
    .line 38
    const-string v5, "ImageLength"

    .line 39
    .line 40
    const-string v6, "ImageWidth"

    .line 41
    .line 42
    if-eqz v3, :cond_3b

    .line 43
    .line 44
    if-eqz v4, :cond_3b

    .line 45
    .line 46
    iget-object v7, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 47
    .line 48
    aget-object v7, v7, v0

    .line 49
    .line 50
    invoke-virtual {v7, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object v3, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 54
    .line 55
    aget-object v3, v3, v0

    .line 56
    .line 57
    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    :cond_3b
    iget-object v3, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 61
    .line 62
    aget-object v3, v3, v2

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_5c

    .line 69
    .line 70
    iget-object v3, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 71
    .line 72
    aget-object v3, v3, v1

    .line 73
    .line 74
    invoke-direct {p0, v3}, Lax/y0/a;->T(Ljava/util/HashMap;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_5c

    .line 79
    .line 80
    iget-object v3, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 81
    .line 82
    aget-object v4, v3, v1

    .line 83
    .line 84
    aput-object v4, v3, v2

    .line 85
    .line 86
    new-instance v4, Ljava/util/HashMap;

    .line 87
    .line 88
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 89
    .line 90
    .line 91
    aput-object v4, v3, v1

    .line 92
    .line 93
    :cond_5c
    iget-object v3, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 94
    .line 95
    aget-object v3, v3, v2

    .line 96
    .line 97
    invoke-direct {p0, v3}, Lax/y0/a;->T(Ljava/util/HashMap;)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-nez v3, :cond_6d

    .line 102
    .line 103
    const-string v3, "ExifInterface"

    .line 104
    .line 105
    const-string v4, "No image meets the size requirements of a thumbnail image."

    .line 106
    .line 107
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    :cond_6d
    const-string v3, "ThumbnailOrientation"

    .line 111
    .line 112
    const-string v4, "Orientation"

    .line 113
    .line 114
    invoke-direct {p0, v0, v3, v4}, Lax/y0/a;->d0(ILjava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    const-string v7, "ThumbnailImageLength"

    .line 118
    .line 119
    invoke-direct {p0, v0, v7, v5}, Lax/y0/a;->d0(ILjava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    const-string v8, "ThumbnailImageWidth"

    .line 123
    .line 124
    invoke-direct {p0, v0, v8, v6}, Lax/y0/a;->d0(ILjava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-direct {p0, v1, v3, v4}, Lax/y0/a;->d0(ILjava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-direct {p0, v1, v7, v5}, Lax/y0/a;->d0(ILjava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {p0, v1, v8, v6}, Lax/y0/a;->d0(ILjava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    iget-boolean v0, p0, Lax/y0/a;->g:Z

    .line 137
    .line 138
    if-eqz v0, :cond_8f

    .line 139
    .line 140
    invoke-direct {p0, v2, v4, v3}, Lax/y0/a;->e0(ILjava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    goto :goto_92

    .line 144
    :cond_8f
    invoke-direct {p0, v2, v4, v3}, Lax/y0/a;->d0(ILjava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :goto_92
    invoke-direct {p0, v2, v5, v7}, Lax/y0/a;->d0(ILjava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-direct {p0, v2, v6, v8}, Lax/y0/a;->d0(ILjava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    return-void
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method private t(Ljava/io/BufferedInputStream;)I
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/16 v0, 0x1388

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 4
    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->reset()V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lax/y0/a;->K([B)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_15

    .line 19
    .line 20
    const/4 p1, 0x4

    .line 21
    return p1

    .line 22
    :cond_15
    invoke-direct {p0, v0}, Lax/y0/a;->N([B)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1e

    .line 27
    .line 28
    const/16 p1, 0x9

    .line 29
    .line 30
    return p1

    .line 31
    :cond_1e
    invoke-direct {p0, v0}, Lax/y0/a;->J([B)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_25

    .line 36
    .line 37
    return p1

    .line 38
    :cond_25
    invoke-direct {p0, v0}, Lax/y0/a;->L([B)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_2d

    .line 43
    .line 44
    const/4 p1, 0x7

    .line 45
    return p1

    .line 46
    :cond_2d
    invoke-direct {p0, v0}, Lax/y0/a;->O([B)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_36

    .line 51
    .line 52
    const/16 p1, 0xa

    .line 53
    .line 54
    return p1

    .line 55
    :cond_36
    invoke-direct {p0, v0}, Lax/y0/a;->M([B)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_3f

    .line 60
    .line 61
    const/16 p1, 0xd

    .line 62
    .line 63
    return p1

    .line 64
    :cond_3f
    invoke-direct {p0, v0}, Lax/y0/a;->U([B)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_48

    .line 69
    .line 70
    const/16 p1, 0xe

    .line 71
    .line 72
    return p1

    .line 73
    :cond_48
    const/4 p1, 0x0

    .line 74
    return p1
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method private t0(Lax/y0/a$c;)I
    .registers 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v3, 0x4

    .line 6
    const/4 v6, 0x1

    .line 7
    sget-object v7, Lax/y0/a;->l0:[[Lax/y0/a$e;

    .line 8
    .line 9
    array-length v8, v7

    .line 10
    new-array v8, v8, [I

    .line 11
    .line 12
    array-length v7, v7

    .line 13
    new-array v7, v7, [I

    .line 14
    .line 15
    sget-object v9, Lax/y0/a;->m0:[Lax/y0/a$e;

    .line 16
    .line 17
    array-length v10, v9

    .line 18
    const/4 v11, 0x0

    .line 19
    const/4 v12, 0x0

    .line 20
    :goto_13
    if-ge v12, v10, :cond_1e

    .line 21
    .line 22
    aget-object v13, v9, v12

    .line 23
    .line 24
    iget-object v13, v13, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {v0, v13}, Lax/y0/a;->c0(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    add-int/2addr v12, v6

    .line 30
    goto :goto_13

    .line 31
    :cond_1e
    iget-boolean v9, v0, Lax/y0/a;->j:Z

    .line 32
    .line 33
    const-string v10, "JPEGInterchangeFormatLength"

    .line 34
    .line 35
    const-string v12, "StripByteCounts"

    .line 36
    .line 37
    const-string v13, "JPEGInterchangeFormat"

    .line 38
    .line 39
    const-string v14, "StripOffsets"

    .line 40
    .line 41
    if-eqz v9, :cond_3b

    .line 42
    .line 43
    iget-boolean v9, v0, Lax/y0/a;->k:Z

    .line 44
    .line 45
    if-eqz v9, :cond_35

    .line 46
    .line 47
    invoke-direct {v0, v14}, Lax/y0/a;->c0(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v12}, Lax/y0/a;->c0(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_3b

    .line 54
    :cond_35
    invoke-direct {v0, v13}, Lax/y0/a;->c0(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v0, v10}, Lax/y0/a;->c0(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_3b
    :goto_3b
    const/4 v9, 0x0

    .line 61
    :goto_3c
    sget-object v15, Lax/y0/a;->l0:[[Lax/y0/a$e;

    .line 62
    .line 63
    array-length v15, v15

    .line 64
    if-ge v9, v15, :cond_65

    .line 65
    .line 66
    iget-object v15, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 67
    .line 68
    aget-object v15, v15, v9

    .line 69
    .line 70
    invoke-virtual {v15}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object v15

    .line 74
    invoke-interface {v15}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v15

    .line 78
    :cond_4d
    :goto_4d
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v16

    .line 82
    if-eqz v16, :cond_63

    .line 83
    .line 84
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v16

    .line 88
    check-cast v16, Ljava/util/Map$Entry;

    .line 89
    .line 90
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v16

    .line 94
    if-nez v16, :cond_4d

    .line 95
    .line 96
    invoke-interface {v15}, Ljava/util/Iterator;->remove()V

    .line 97
    .line 98
    .line 99
    goto :goto_4d

    .line 100
    :cond_63
    add-int/2addr v9, v6

    .line 101
    goto :goto_3c

    .line 102
    :cond_65
    iget-object v9, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 103
    .line 104
    aget-object v9, v9, v6

    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/util/HashMap;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    const/4 v15, 0x3

    .line 111
    const/16 v16, 0x2

    .line 112
    .line 113
    const-wide/16 v4, 0x0

    .line 114
    .line 115
    if-nez v9, :cond_8c

    .line 116
    .line 117
    iget-object v9, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 118
    .line 119
    aget-object v9, v9, v11

    .line 120
    .line 121
    sget-object v17, Lax/y0/a;->m0:[Lax/y0/a$e;

    .line 122
    .line 123
    const/16 v18, 0x8

    .line 124
    .line 125
    aget-object v2, v17, v6

    .line 126
    .line 127
    iget-object v2, v2, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 128
    .line 129
    const/16 v17, 0x3

    .line 130
    .line 131
    iget-object v15, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 132
    .line 133
    invoke-static {v4, v5, v15}, Lax/y0/a$d;->f(JLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 134
    .line 135
    .line 136
    move-result-object v15

    .line 137
    invoke-virtual {v9, v2, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    goto :goto_90

    .line 141
    :cond_8c
    const/16 v17, 0x3

    .line 142
    .line 143
    const/16 v18, 0x8

    .line 144
    .line 145
    :goto_90
    iget-object v2, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 146
    .line 147
    aget-object v2, v2, v16

    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-nez v2, :cond_ad

    .line 154
    .line 155
    iget-object v2, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 156
    .line 157
    aget-object v2, v2, v11

    .line 158
    .line 159
    sget-object v9, Lax/y0/a;->m0:[Lax/y0/a$e;

    .line 160
    .line 161
    aget-object v9, v9, v16

    .line 162
    .line 163
    iget-object v9, v9, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 164
    .line 165
    iget-object v15, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 166
    .line 167
    invoke-static {v4, v5, v15}, Lax/y0/a$d;->f(JLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 168
    .line 169
    .line 170
    move-result-object v15

    .line 171
    invoke-virtual {v2, v9, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    :cond_ad
    iget-object v2, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 175
    .line 176
    aget-object v2, v2, v17

    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-nez v2, :cond_ca

    .line 183
    .line 184
    iget-object v2, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 185
    .line 186
    aget-object v2, v2, v6

    .line 187
    .line 188
    sget-object v9, Lax/y0/a;->m0:[Lax/y0/a$e;

    .line 189
    .line 190
    aget-object v9, v9, v17

    .line 191
    .line 192
    iget-object v9, v9, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 193
    .line 194
    iget-object v15, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 195
    .line 196
    invoke-static {v4, v5, v15}, Lax/y0/a$d;->f(JLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 197
    .line 198
    .line 199
    move-result-object v15

    .line 200
    invoke-virtual {v2, v9, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    :cond_ca
    iget-boolean v2, v0, Lax/y0/a;->j:Z

    .line 204
    .line 205
    if-eqz v2, :cond_ee

    .line 206
    .line 207
    iget-boolean v2, v0, Lax/y0/a;->k:Z

    .line 208
    .line 209
    if-eqz v2, :cond_f1

    .line 210
    .line 211
    iget-object v2, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 212
    .line 213
    aget-object v2, v2, v3

    .line 214
    .line 215
    iget-object v9, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 216
    .line 217
    invoke-static {v11, v9}, Lax/y0/a$d;->j(ILjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 218
    .line 219
    .line 220
    move-result-object v9

    .line 221
    invoke-virtual {v2, v14, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    iget-object v2, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 225
    .line 226
    aget-object v2, v2, v3

    .line 227
    .line 228
    iget v9, v0, Lax/y0/a;->n:I

    .line 229
    .line 230
    iget-object v10, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 231
    .line 232
    invoke-static {v9, v10}, Lax/y0/a$d;->j(ILjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    invoke-virtual {v2, v12, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    :cond_ee
    move-object v15, v7

    .line 240
    const/4 v12, 0x1

    .line 241
    goto :goto_110

    .line 242
    :cond_f1
    iget-object v2, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 243
    .line 244
    aget-object v2, v2, v3

    .line 245
    .line 246
    iget-object v9, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 247
    .line 248
    invoke-static {v4, v5, v9}, Lax/y0/a$d;->f(JLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    invoke-virtual {v2, v13, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    iget-object v2, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 256
    .line 257
    aget-object v2, v2, v3

    .line 258
    .line 259
    iget v9, v0, Lax/y0/a;->n:I

    .line 260
    .line 261
    move-object v15, v7

    .line 262
    const/4 v12, 0x1

    .line 263
    int-to-long v6, v9

    .line 264
    iget-object v9, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 265
    .line 266
    invoke-static {v6, v7, v9}, Lax/y0/a$d;->f(JLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    invoke-virtual {v2, v10, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    :goto_110
    const/4 v2, 0x0

    .line 274
    :goto_111
    sget-object v6, Lax/y0/a;->l0:[[Lax/y0/a$e;

    .line 275
    .line 276
    array-length v6, v6

    .line 277
    if-ge v2, v6, :cond_144

    .line 278
    .line 279
    iget-object v6, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 280
    .line 281
    aget-object v6, v6, v2

    .line 282
    .line 283
    invoke-virtual {v6}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    const/4 v7, 0x0

    .line 292
    :cond_123
    :goto_123
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 293
    .line 294
    .line 295
    move-result v9

    .line 296
    if-eqz v9, :cond_13d

    .line 297
    .line 298
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v9

    .line 302
    check-cast v9, Ljava/util/Map$Entry;

    .line 303
    .line 304
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v9

    .line 308
    check-cast v9, Lax/y0/a$d;

    .line 309
    .line 310
    invoke-virtual {v9}, Lax/y0/a$d;->p()I

    .line 311
    .line 312
    .line 313
    move-result v9

    .line 314
    if-le v9, v3, :cond_123

    .line 315
    .line 316
    add-int/2addr v7, v9

    .line 317
    goto :goto_123

    .line 318
    :cond_13d
    aget v6, v15, v2

    .line 319
    .line 320
    add-int/2addr v6, v7

    .line 321
    aput v6, v15, v2

    .line 322
    .line 323
    add-int/2addr v2, v12

    .line 324
    goto :goto_111

    .line 325
    :cond_144
    const/4 v2, 0x0

    .line 326
    const/16 v6, 0x8

    .line 327
    .line 328
    :goto_147
    sget-object v7, Lax/y0/a;->l0:[[Lax/y0/a$e;

    .line 329
    .line 330
    array-length v7, v7

    .line 331
    if-ge v2, v7, :cond_16a

    .line 332
    .line 333
    iget-object v7, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 334
    .line 335
    aget-object v7, v7, v2

    .line 336
    .line 337
    invoke-virtual {v7}, Ljava/util/HashMap;->isEmpty()Z

    .line 338
    .line 339
    .line 340
    move-result v7

    .line 341
    if-nez v7, :cond_168

    .line 342
    .line 343
    aput v6, v8, v2

    .line 344
    .line 345
    iget-object v7, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 346
    .line 347
    aget-object v7, v7, v2

    .line 348
    .line 349
    invoke-virtual {v7}, Ljava/util/HashMap;->size()I

    .line 350
    .line 351
    .line 352
    move-result v7

    .line 353
    mul-int/lit8 v7, v7, 0xc

    .line 354
    .line 355
    add-int/lit8 v7, v7, 0x6

    .line 356
    .line 357
    aget v9, v15, v2

    .line 358
    .line 359
    add-int/2addr v7, v9

    .line 360
    add-int/2addr v6, v7

    .line 361
    :cond_168
    add-int/2addr v2, v12

    .line 362
    goto :goto_147

    .line 363
    :cond_16a
    iget-boolean v2, v0, Lax/y0/a;->j:Z

    .line 364
    .line 365
    if-eqz v2, :cond_193

    .line 366
    .line 367
    iget-boolean v2, v0, Lax/y0/a;->k:Z

    .line 368
    .line 369
    if-eqz v2, :cond_180

    .line 370
    .line 371
    iget-object v2, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 372
    .line 373
    aget-object v2, v2, v3

    .line 374
    .line 375
    iget-object v7, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 376
    .line 377
    invoke-static {v6, v7}, Lax/y0/a$d;->j(ILjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    invoke-virtual {v2, v14, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    goto :goto_18e

    .line 385
    :cond_180
    iget-object v2, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 386
    .line 387
    aget-object v2, v2, v3

    .line 388
    .line 389
    int-to-long v9, v6

    .line 390
    iget-object v7, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 391
    .line 392
    invoke-static {v9, v10, v7}, Lax/y0/a$d;->f(JLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 393
    .line 394
    .line 395
    move-result-object v7

    .line 396
    invoke-virtual {v2, v13, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    :goto_18e
    iput v6, v0, Lax/y0/a;->m:I

    .line 400
    .line 401
    iget v2, v0, Lax/y0/a;->n:I

    .line 402
    .line 403
    add-int/2addr v6, v2

    .line 404
    :cond_193
    iget v2, v0, Lax/y0/a;->d:I

    .line 405
    .line 406
    if-ne v2, v3, :cond_199

    .line 407
    .line 408
    add-int/lit8 v6, v6, 0x8

    .line 409
    .line 410
    :cond_199
    sget-boolean v2, Lax/y0/a;->x:Z

    .line 411
    .line 412
    if-eqz v2, :cond_1e1

    .line 413
    .line 414
    const/4 v2, 0x0

    .line 415
    :goto_19e
    sget-object v7, Lax/y0/a;->l0:[[Lax/y0/a$e;

    .line 416
    .line 417
    array-length v7, v7

    .line 418
    if-ge v2, v7, :cond_1e1

    .line 419
    .line 420
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 421
    .line 422
    .line 423
    move-result-object v7

    .line 424
    aget v9, v8, v2

    .line 425
    .line 426
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 427
    .line 428
    .line 429
    move-result-object v9

    .line 430
    iget-object v10, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 431
    .line 432
    aget-object v10, v10, v2

    .line 433
    .line 434
    invoke-virtual {v10}, Ljava/util/HashMap;->size()I

    .line 435
    .line 436
    .line 437
    move-result v10

    .line 438
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 439
    .line 440
    .line 441
    move-result-object v10

    .line 442
    aget v13, v15, v2

    .line 443
    .line 444
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 445
    .line 446
    .line 447
    move-result-object v13

    .line 448
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 449
    .line 450
    .line 451
    move-result-object v14

    .line 452
    const/16 v18, 0x1

    .line 453
    .line 454
    const/4 v12, 0x5

    .line 455
    new-array v12, v12, [Ljava/lang/Object;

    .line 456
    .line 457
    aput-object v7, v12, v11

    .line 458
    .line 459
    aput-object v9, v12, v18

    .line 460
    .line 461
    aput-object v10, v12, v16

    .line 462
    .line 463
    aput-object v13, v12, v17

    .line 464
    .line 465
    aput-object v14, v12, v3

    .line 466
    .line 467
    const-string v7, "index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d"

    .line 468
    .line 469
    invoke-static {v7, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v7

    .line 473
    const-string v9, "ExifInterface"

    .line 474
    .line 475
    invoke-static {v9, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 476
    .line 477
    .line 478
    add-int/lit8 v2, v2, 0x1

    .line 479
    .line 480
    const/4 v12, 0x1

    .line 481
    goto :goto_19e

    .line 482
    :cond_1e1
    const/16 v18, 0x1

    .line 483
    .line 484
    iget-object v2, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 485
    .line 486
    aget-object v2, v2, v18

    .line 487
    .line 488
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 489
    .line 490
    .line 491
    move-result v2

    .line 492
    if-nez v2, :cond_203

    .line 493
    .line 494
    iget-object v2, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 495
    .line 496
    aget-object v2, v2, v11

    .line 497
    .line 498
    sget-object v7, Lax/y0/a;->m0:[Lax/y0/a$e;

    .line 499
    .line 500
    aget-object v7, v7, v18

    .line 501
    .line 502
    iget-object v7, v7, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 503
    .line 504
    aget v9, v8, v18

    .line 505
    .line 506
    int-to-long v9, v9

    .line 507
    iget-object v12, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 508
    .line 509
    invoke-static {v9, v10, v12}, Lax/y0/a$d;->f(JLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 510
    .line 511
    .line 512
    move-result-object v9

    .line 513
    invoke-virtual {v2, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    :cond_203
    iget-object v2, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 517
    .line 518
    aget-object v2, v2, v16

    .line 519
    .line 520
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 521
    .line 522
    .line 523
    move-result v2

    .line 524
    if-nez v2, :cond_223

    .line 525
    .line 526
    iget-object v2, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 527
    .line 528
    aget-object v2, v2, v11

    .line 529
    .line 530
    sget-object v7, Lax/y0/a;->m0:[Lax/y0/a$e;

    .line 531
    .line 532
    aget-object v7, v7, v16

    .line 533
    .line 534
    iget-object v7, v7, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 535
    .line 536
    aget v9, v8, v16

    .line 537
    .line 538
    int-to-long v9, v9

    .line 539
    iget-object v12, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 540
    .line 541
    invoke-static {v9, v10, v12}, Lax/y0/a$d;->f(JLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 542
    .line 543
    .line 544
    move-result-object v9

    .line 545
    invoke-virtual {v2, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    :cond_223
    iget-object v2, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 549
    .line 550
    aget-object v2, v2, v17

    .line 551
    .line 552
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 553
    .line 554
    .line 555
    move-result v2

    .line 556
    if-nez v2, :cond_243

    .line 557
    .line 558
    iget-object v2, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 559
    .line 560
    aget-object v2, v2, v18

    .line 561
    .line 562
    sget-object v7, Lax/y0/a;->m0:[Lax/y0/a$e;

    .line 563
    .line 564
    aget-object v7, v7, v17

    .line 565
    .line 566
    iget-object v7, v7, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 567
    .line 568
    aget v9, v8, v17

    .line 569
    .line 570
    int-to-long v9, v9

    .line 571
    iget-object v12, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 572
    .line 573
    invoke-static {v9, v10, v12}, Lax/y0/a$d;->f(JLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 574
    .line 575
    .line 576
    move-result-object v9

    .line 577
    invoke-virtual {v2, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    :cond_243
    iget v2, v0, Lax/y0/a;->d:I

    .line 581
    .line 582
    const/16 v7, 0xe

    .line 583
    .line 584
    if-eq v2, v3, :cond_263

    .line 585
    .line 586
    const/16 v9, 0xd

    .line 587
    .line 588
    if-eq v2, v9, :cond_259

    .line 589
    .line 590
    if-eq v2, v7, :cond_250

    .line 591
    .line 592
    goto :goto_270

    .line 593
    :cond_250
    sget-object v2, Lax/y0/a;->P:[B

    .line 594
    .line 595
    invoke-virtual {v1, v2}, Lax/y0/a$c;->write([B)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v1, v6}, Lax/y0/a$c;->c(I)V

    .line 599
    .line 600
    .line 601
    goto :goto_270

    .line 602
    :cond_259
    invoke-virtual {v1, v6}, Lax/y0/a$c;->c(I)V

    .line 603
    .line 604
    .line 605
    const v2, 0x65584966

    .line 606
    .line 607
    .line 608
    invoke-virtual {v1, v2}, Lax/y0/a$c;->c(I)V

    .line 609
    .line 610
    .line 611
    goto :goto_270

    .line 612
    :cond_263
    const v2, 0xffff

    .line 613
    .line 614
    .line 615
    if-gt v6, v2, :cond_373

    .line 616
    .line 617
    invoke-virtual {v1, v6}, Lax/y0/a$c;->f(I)V

    .line 618
    .line 619
    .line 620
    sget-object v2, Lax/y0/a;->s0:[B

    .line 621
    .line 622
    invoke-virtual {v1, v2}, Lax/y0/a$c;->write([B)V

    .line 623
    .line 624
    .line 625
    :goto_270
    iget-object v2, v1, Lax/y0/a$c;->q:Ljava/io/DataOutputStream;

    .line 626
    .line 627
    invoke-virtual {v2}, Ljava/io/DataOutputStream;->size()I

    .line 628
    .line 629
    .line 630
    move-result v2

    .line 631
    iget-object v9, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 632
    .line 633
    sget-object v10, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 634
    .line 635
    if-ne v9, v10, :cond_27f

    .line 636
    .line 637
    const/16 v9, 0x4d4d

    .line 638
    .line 639
    goto :goto_281

    .line 640
    :cond_27f
    const/16 v9, 0x4949

    .line 641
    .line 642
    :goto_281
    invoke-virtual {v1, v9}, Lax/y0/a$c;->d(S)V

    .line 643
    .line 644
    .line 645
    iget-object v9, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 646
    .line 647
    invoke-virtual {v1, v9}, Lax/y0/a$c;->a(Ljava/nio/ByteOrder;)V

    .line 648
    .line 649
    .line 650
    const/16 v9, 0x2a

    .line 651
    .line 652
    invoke-virtual {v1, v9}, Lax/y0/a$c;->f(I)V

    .line 653
    .line 654
    .line 655
    const-wide/16 v9, 0x8

    .line 656
    .line 657
    invoke-virtual {v1, v9, v10}, Lax/y0/a$c;->e(J)V

    .line 658
    .line 659
    .line 660
    const/4 v9, 0x0

    .line 661
    :goto_294
    sget-object v10, Lax/y0/a;->l0:[[Lax/y0/a$e;

    .line 662
    .line 663
    array-length v10, v10

    .line 664
    if-ge v9, v10, :cond_356

    .line 665
    .line 666
    iget-object v10, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 667
    .line 668
    aget-object v10, v10, v9

    .line 669
    .line 670
    invoke-virtual {v10}, Ljava/util/HashMap;->isEmpty()Z

    .line 671
    .line 672
    .line 673
    move-result v10

    .line 674
    if-nez v10, :cond_352

    .line 675
    .line 676
    iget-object v10, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 677
    .line 678
    aget-object v10, v10, v9

    .line 679
    .line 680
    invoke-virtual {v10}, Ljava/util/HashMap;->size()I

    .line 681
    .line 682
    .line 683
    move-result v10

    .line 684
    invoke-virtual {v1, v10}, Lax/y0/a$c;->f(I)V

    .line 685
    .line 686
    .line 687
    aget v10, v8, v9

    .line 688
    .line 689
    add-int/lit8 v10, v10, 0x2

    .line 690
    .line 691
    iget-object v12, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 692
    .line 693
    aget-object v12, v12, v9

    .line 694
    .line 695
    invoke-virtual {v12}, Ljava/util/HashMap;->size()I

    .line 696
    .line 697
    .line 698
    move-result v12

    .line 699
    mul-int/lit8 v12, v12, 0xc

    .line 700
    .line 701
    add-int/2addr v10, v12

    .line 702
    add-int/2addr v10, v3

    .line 703
    iget-object v12, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 704
    .line 705
    aget-object v12, v12, v9

    .line 706
    .line 707
    invoke-virtual {v12}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 708
    .line 709
    .line 710
    move-result-object v12

    .line 711
    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 712
    .line 713
    .line 714
    move-result-object v12

    .line 715
    :cond_2ca
    :goto_2ca
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 716
    .line 717
    .line 718
    move-result v13

    .line 719
    if-eqz v13, :cond_314

    .line 720
    .line 721
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v13

    .line 725
    check-cast v13, Ljava/util/Map$Entry;

    .line 726
    .line 727
    sget-object v14, Lax/y0/a;->o0:[Ljava/util/HashMap;

    .line 728
    .line 729
    aget-object v14, v14, v9

    .line 730
    .line 731
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v15

    .line 735
    invoke-virtual {v14, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v14

    .line 739
    check-cast v14, Lax/y0/a$e;

    .line 740
    .line 741
    iget v14, v14, Lax/y0/a$e;->a:I

    .line 742
    .line 743
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object v13

    .line 747
    check-cast v13, Lax/y0/a$d;

    .line 748
    .line 749
    invoke-virtual {v13}, Lax/y0/a$d;->p()I

    .line 750
    .line 751
    .line 752
    move-result v15

    .line 753
    invoke-virtual {v1, v14}, Lax/y0/a$c;->f(I)V

    .line 754
    .line 755
    .line 756
    iget v14, v13, Lax/y0/a$d;->a:I

    .line 757
    .line 758
    invoke-virtual {v1, v14}, Lax/y0/a$c;->f(I)V

    .line 759
    .line 760
    .line 761
    iget v14, v13, Lax/y0/a$d;->b:I

    .line 762
    .line 763
    invoke-virtual {v1, v14}, Lax/y0/a$c;->c(I)V

    .line 764
    .line 765
    .line 766
    if-le v15, v3, :cond_305

    .line 767
    .line 768
    int-to-long v13, v10

    .line 769
    invoke-virtual {v1, v13, v14}, Lax/y0/a$c;->e(J)V

    .line 770
    .line 771
    .line 772
    add-int/2addr v10, v15

    .line 773
    goto :goto_2ca

    .line 774
    :cond_305
    iget-object v13, v13, Lax/y0/a$d;->d:[B

    .line 775
    .line 776
    invoke-virtual {v1, v13}, Lax/y0/a$c;->write([B)V

    .line 777
    .line 778
    .line 779
    if-ge v15, v3, :cond_2ca

    .line 780
    .line 781
    :goto_30c
    if-ge v15, v3, :cond_2ca

    .line 782
    .line 783
    invoke-virtual {v1, v11}, Lax/y0/a$c;->b(I)V

    .line 784
    .line 785
    .line 786
    add-int/lit8 v15, v15, 0x1

    .line 787
    .line 788
    goto :goto_30c

    .line 789
    :cond_314
    if-nez v9, :cond_327

    .line 790
    .line 791
    iget-object v10, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 792
    .line 793
    aget-object v10, v10, v3

    .line 794
    .line 795
    invoke-virtual {v10}, Ljava/util/HashMap;->isEmpty()Z

    .line 796
    .line 797
    .line 798
    move-result v10

    .line 799
    if-nez v10, :cond_327

    .line 800
    .line 801
    aget v10, v8, v3

    .line 802
    .line 803
    int-to-long v12, v10

    .line 804
    invoke-virtual {v1, v12, v13}, Lax/y0/a$c;->e(J)V

    .line 805
    .line 806
    .line 807
    goto :goto_32a

    .line 808
    :cond_327
    invoke-virtual {v1, v4, v5}, Lax/y0/a$c;->e(J)V

    .line 809
    .line 810
    .line 811
    :goto_32a
    iget-object v10, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 812
    .line 813
    aget-object v10, v10, v9

    .line 814
    .line 815
    invoke-virtual {v10}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 816
    .line 817
    .line 818
    move-result-object v10

    .line 819
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 820
    .line 821
    .line 822
    move-result-object v10

    .line 823
    :cond_336
    :goto_336
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 824
    .line 825
    .line 826
    move-result v12

    .line 827
    if-eqz v12, :cond_352

    .line 828
    .line 829
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v12

    .line 833
    check-cast v12, Ljava/util/Map$Entry;

    .line 834
    .line 835
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v12

    .line 839
    check-cast v12, Lax/y0/a$d;

    .line 840
    .line 841
    iget-object v12, v12, Lax/y0/a$d;->d:[B

    .line 842
    .line 843
    array-length v13, v12

    .line 844
    if-le v13, v3, :cond_336

    .line 845
    .line 846
    array-length v13, v12

    .line 847
    invoke-virtual {v1, v12, v11, v13}, Lax/y0/a$c;->write([BII)V

    .line 848
    .line 849
    .line 850
    goto :goto_336

    .line 851
    :cond_352
    add-int/lit8 v9, v9, 0x1

    .line 852
    .line 853
    goto/16 :goto_294

    .line 854
    .line 855
    :cond_356
    iget-boolean v3, v0, Lax/y0/a;->j:Z

    .line 856
    .line 857
    if-eqz v3, :cond_361

    .line 858
    .line 859
    invoke-virtual {v0}, Lax/y0/a;->C()[B

    .line 860
    .line 861
    .line 862
    move-result-object v3

    .line 863
    invoke-virtual {v1, v3}, Lax/y0/a$c;->write([B)V

    .line 864
    .line 865
    .line 866
    :cond_361
    iget v3, v0, Lax/y0/a;->d:I

    .line 867
    .line 868
    if-ne v3, v7, :cond_36d

    .line 869
    .line 870
    rem-int/lit8 v6, v6, 0x2

    .line 871
    .line 872
    const/4 v12, 0x1

    .line 873
    if-ne v6, v12, :cond_36d

    .line 874
    .line 875
    invoke-virtual {v1, v11}, Lax/y0/a$c;->b(I)V

    .line 876
    .line 877
    .line 878
    :cond_36d
    sget-object v3, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 879
    .line 880
    invoke-virtual {v1, v3}, Lax/y0/a$c;->a(Ljava/nio/ByteOrder;)V

    .line 881
    .line 882
    .line 883
    return v2

    .line 884
    :cond_373
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 885
    .line 886
    new-instance v2, Ljava/lang/StringBuilder;

    .line 887
    .line 888
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 889
    .line 890
    .line 891
    const-string v3, "Size of exif data ("

    .line 892
    .line 893
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 894
    .line 895
    .line 896
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 897
    .line 898
    .line 899
    const-string v3, " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"

    .line 900
    .line 901
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 902
    .line 903
    .line 904
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 905
    .line 906
    .line 907
    move-result-object v2

    .line 908
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 909
    .line 910
    .line 911
    throw v1
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
.end method

.method private u(Lax/y0/a$g;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lax/y0/a;->x(Lax/y0/a$g;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    aget-object p1, p1, v0

    .line 8
    .line 9
    const-string v1, "MakerNote"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lax/y0/a$d;

    .line 16
    .line 17
    if-eqz p1, :cond_ef

    .line 18
    .line 19
    new-instance v1, Lax/y0/a$g;

    .line 20
    .line 21
    iget-object p1, p1, Lax/y0/a$d;->d:[B

    .line 22
    .line 23
    invoke-direct {v1, p1}, Lax/y0/a$g;-><init>([B)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Lax/y0/a$b;->e(Ljava/nio/ByteOrder;)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Lax/y0/a;->J:[B

    .line 32
    .line 33
    array-length v2, p1

    .line 34
    new-array v2, v2, [B

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Lax/y0/a$b;->readFully([B)V

    .line 37
    .line 38
    .line 39
    const-wide/16 v3, 0x0

    .line 40
    .line 41
    invoke-virtual {v1, v3, v4}, Lax/y0/a$g;->g(J)V

    .line 42
    .line 43
    .line 44
    sget-object v3, Lax/y0/a;->K:[B

    .line 45
    .line 46
    array-length v4, v3

    .line 47
    new-array v4, v4, [B

    .line 48
    .line 49
    invoke-virtual {v1, v4}, Lax/y0/a$b;->readFully([B)V

    .line 50
    .line 51
    .line 52
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_3f

    .line 57
    .line 58
    const-wide/16 v2, 0x8

    .line 59
    .line 60
    invoke-virtual {v1, v2, v3}, Lax/y0/a$g;->g(J)V

    .line 61
    .line 62
    .line 63
    goto :goto_4a

    .line 64
    :cond_3f
    invoke-static {v4, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_4a

    .line 69
    .line 70
    const-wide/16 v2, 0xc

    .line 71
    .line 72
    invoke-virtual {v1, v2, v3}, Lax/y0/a$g;->g(J)V

    .line 73
    .line 74
    .line 75
    :cond_4a
    :goto_4a
    const/4 p1, 0x6

    .line 76
    invoke-direct {p0, v1, p1}, Lax/y0/a;->b0(Lax/y0/a$g;I)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 80
    .line 81
    const/4 v1, 0x7

    .line 82
    aget-object p1, p1, v1

    .line 83
    .line 84
    const-string v2, "PreviewImageStart"

    .line 85
    .line 86
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Lax/y0/a$d;

    .line 91
    .line 92
    iget-object v2, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 93
    .line 94
    aget-object v1, v2, v1

    .line 95
    .line 96
    const-string v2, "PreviewImageLength"

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Lax/y0/a$d;

    .line 103
    .line 104
    if-eqz p1, :cond_7e

    .line 105
    .line 106
    if-eqz v1, :cond_7e

    .line 107
    .line 108
    iget-object v2, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 109
    .line 110
    const/4 v3, 0x5

    .line 111
    aget-object v2, v2, v3

    .line 112
    .line 113
    const-string v4, "JPEGInterchangeFormat"

    .line 114
    .line 115
    invoke-virtual {v2, v4, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 119
    .line 120
    aget-object p1, p1, v3

    .line 121
    .line 122
    const-string v2, "JPEGInterchangeFormatLength"

    .line 123
    .line 124
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    :cond_7e
    iget-object p1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 128
    .line 129
    const/16 v1, 0x8

    .line 130
    .line 131
    aget-object p1, p1, v1

    .line 132
    .line 133
    const-string v1, "AspectFrame"

    .line 134
    .line 135
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    check-cast p1, Lax/y0/a$d;

    .line 140
    .line 141
    if-eqz p1, :cond_ef

    .line 142
    .line 143
    iget-object v1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 144
    .line 145
    invoke-virtual {p1, v1}, Lax/y0/a$d;->o(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    check-cast p1, [I

    .line 150
    .line 151
    if-eqz p1, :cond_d5

    .line 152
    .line 153
    array-length v1, p1

    .line 154
    const/4 v2, 0x4

    .line 155
    if-eq v1, v2, :cond_9d

    .line 156
    .line 157
    goto :goto_d5

    .line 158
    :cond_9d
    const/4 v1, 0x2

    .line 159
    aget v1, p1, v1

    .line 160
    .line 161
    const/4 v2, 0x0

    .line 162
    aget v3, p1, v2

    .line 163
    .line 164
    if-le v1, v3, :cond_ef

    .line 165
    .line 166
    const/4 v4, 0x3

    .line 167
    aget v4, p1, v4

    .line 168
    .line 169
    aget p1, p1, v0

    .line 170
    .line 171
    if-le v4, p1, :cond_ef

    .line 172
    .line 173
    sub-int/2addr v1, v3

    .line 174
    add-int/2addr v1, v0

    .line 175
    sub-int/2addr v4, p1

    .line 176
    add-int/2addr v4, v0

    .line 177
    if-ge v1, v4, :cond_b6

    .line 178
    .line 179
    add-int/2addr v1, v4

    .line 180
    sub-int v4, v1, v4

    .line 181
    .line 182
    sub-int/2addr v1, v4

    .line 183
    :cond_b6
    iget-object p1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 184
    .line 185
    invoke-static {v1, p1}, Lax/y0/a$d;->j(ILjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    iget-object v0, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 190
    .line 191
    invoke-static {v4, v0}, Lax/y0/a$d;->j(ILjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    iget-object v1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 196
    .line 197
    aget-object v1, v1, v2

    .line 198
    .line 199
    const-string v3, "ImageWidth"

    .line 200
    .line 201
    invoke-virtual {v1, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    iget-object p1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 205
    .line 206
    aget-object p1, p1, v2

    .line 207
    .line 208
    const-string v1, "ImageLength"

    .line 209
    .line 210
    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :cond_d5
    :goto_d5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    const-string v1, "Invalid aspect frame values. frame="

    .line 220
    .line 221
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    const-string v0, "ExifInterface"

    .line 236
    .line 237
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 238
    .line 239
    .line 240
    :cond_ef
    return-void
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method private u0(Lax/y0/a$c;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lax/y0/a$c;

    .line 7
    .line 8
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 9
    .line 10
    invoke-direct {v1, v0, v2}, Lax/y0/a$c;-><init>(Ljava/io/OutputStream;Ljava/nio/ByteOrder;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, v1}, Lax/y0/a;->t0(Lax/y0/a$c;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p1, Lax/y0/a$c;->q:Ljava/io/DataOutputStream;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/io/DataOutputStream;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    add-int/2addr v2, v1

    .line 24
    iput v2, p0, Lax/y0/a;->q:I

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, Lax/y0/a$c;->write([B)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Ljava/util/zip/CRC32;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V

    .line 36
    .line 37
    .line 38
    array-length v2, v0

    .line 39
    const/4 v3, 0x4

    .line 40
    sub-int/2addr v2, v3

    .line 41
    invoke-virtual {v1, v0, v3, v2}, Ljava/util/zip/CRC32;->update([BII)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    long-to-int v1, v0

    .line 49
    invoke-virtual {p1, v1}, Lax/y0/a$c;->c(I)V

    .line 50
    .line 51
    .line 52
    return-void
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private v(Lax/y0/a$b;)V
    .registers 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    sget-boolean v2, Lax/y0/a;->x:Z

    .line 6
    .line 7
    if-eqz v2, :cond_1e

    .line 8
    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v3, "getPngAttributes starting with: "

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "ExifInterface"

    .line 27
    .line 28
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    :cond_1e
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Lax/y0/a$b;->e(Ljava/nio/ByteOrder;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lax/y0/a$b;->b()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    sget-object v3, Lax/y0/a;->L:[B

    .line 41
    .line 42
    array-length v3, v3

    .line 43
    invoke-virtual {v0, v3}, Lax/y0/a$b;->f(I)V

    .line 44
    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v5, 0x0

    .line 49
    :goto_30
    if-eqz v4, :cond_34

    .line 50
    .line 51
    if-nez v5, :cond_62

    .line 52
    .line 53
    :cond_34
    :try_start_34
    invoke-virtual {v0}, Lax/y0/a$b;->readInt()I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    invoke-virtual {v0}, Lax/y0/a$b;->readInt()I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    invoke-virtual {v0}, Lax/y0/a$b;->b()I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    add-int/2addr v8, v6

    .line 66
    add-int/lit8 v8, v8, 0x4

    .line 67
    .line 68
    invoke-virtual {v0}, Lax/y0/a$b;->b()I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    sub-int/2addr v9, v2

    .line 73
    const/16 v10, 0x10

    .line 74
    .line 75
    if-ne v9, v10, :cond_5d

    .line 76
    .line 77
    const v9, 0x49484452

    .line 78
    .line 79
    .line 80
    if-ne v7, v9, :cond_52

    .line 81
    .line 82
    goto :goto_5d

    .line 83
    :cond_52
    new-instance v0, Ljava/io/IOException;

    .line 84
    .line 85
    const-string v2, "Encountered invalid PNG file--IHDR chunk should appear as the first chunk"

    .line 86
    .line 87
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v0

    .line 91
    :catch_5a
    move-exception v0

    .line 92
    goto/16 :goto_fc

    .line 93
    .line 94
    :cond_5d
    :goto_5d
    const v9, 0x49454e44    # 808164.25f

    .line 95
    .line 96
    .line 97
    if-ne v7, v9, :cond_65

    .line 98
    .line 99
    :cond_62
    iput-boolean v5, v1, Lax/y0/a;->w:Z

    .line 100
    .line 101
    return-void

    .line 102
    :cond_65
    const v9, 0x65584966

    .line 103
    .line 104
    .line 105
    const/4 v10, 0x1

    .line 106
    if-ne v7, v9, :cond_c2

    .line 107
    .line 108
    if-nez v4, :cond_c2

    .line 109
    .line 110
    invoke-virtual {v0}, Lax/y0/a$b;->b()I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    sub-int/2addr v4, v2

    .line 115
    iput v4, v1, Lax/y0/a;->q:I

    .line 116
    .line 117
    new-array v4, v6, [B

    .line 118
    .line 119
    invoke-virtual {v0, v4}, Lax/y0/a$b;->readFully([B)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lax/y0/a$b;->readInt()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    new-instance v9, Ljava/util/zip/CRC32;

    .line 127
    .line 128
    invoke-direct {v9}, Ljava/util/zip/CRC32;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-static {v9, v7}, Lax/y0/a;->q0(Ljava/util/zip/CRC32;I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v9, v4}, Ljava/util/zip/CRC32;->update([B)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v9}, Ljava/util/zip/CRC32;->getValue()J

    .line 138
    .line 139
    .line 140
    move-result-wide v11

    .line 141
    long-to-int v7, v11

    .line 142
    if-ne v7, v6, :cond_9f

    .line 143
    .line 144
    invoke-direct {v1, v4, v3}, Lax/y0/a;->a0([BI)V

    .line 145
    .line 146
    .line 147
    invoke-direct {v1}, Lax/y0/a;->s0()V

    .line 148
    .line 149
    .line 150
    new-instance v6, Lax/y0/a$b;

    .line 151
    .line 152
    invoke-direct {v6, v4}, Lax/y0/a$b;-><init>([B)V

    .line 153
    .line 154
    .line 155
    invoke-direct {v1, v6}, Lax/y0/a;->n0(Lax/y0/a$b;)V

    .line 156
    .line 157
    .line 158
    const/4 v4, 0x1

    .line 159
    goto :goto_f2

    .line 160
    :cond_9f
    new-instance v0, Ljava/io/IOException;

    .line 161
    .line 162
    new-instance v2, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    .line 166
    .line 167
    const-string v3, "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "

    .line 168
    .line 169
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v3, ", calculated CRC value: "

    .line 176
    .line 177
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v9}, Ljava/util/zip/CRC32;->getValue()J

    .line 181
    .line 182
    .line 183
    move-result-wide v3

    .line 184
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v0

    .line 195
    :cond_c2
    const v9, 0x69545874

    .line 196
    .line 197
    .line 198
    if-ne v7, v9, :cond_f2

    .line 199
    .line 200
    if-nez v5, :cond_f2

    .line 201
    .line 202
    sget-object v7, Lax/y0/a;->M:[B

    .line 203
    .line 204
    array-length v9, v7

    .line 205
    if-lt v6, v9, :cond_f2

    .line 206
    .line 207
    array-length v9, v7

    .line 208
    new-array v11, v9, [B

    .line 209
    .line 210
    invoke-virtual {v0, v11}, Lax/y0/a$b;->readFully([B)V

    .line 211
    .line 212
    .line 213
    invoke-static {v11, v7}, Ljava/util/Arrays;->equals([B[B)Z

    .line 214
    .line 215
    .line 216
    move-result v7

    .line 217
    if-eqz v7, :cond_f2

    .line 218
    .line 219
    invoke-virtual {v0}, Lax/y0/a$b;->b()I

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    sub-int/2addr v5, v2

    .line 224
    sub-int v13, v6, v9

    .line 225
    .line 226
    new-array v6, v13, [B

    .line 227
    .line 228
    invoke-virtual {v0, v6}, Lax/y0/a$b;->readFully([B)V

    .line 229
    .line 230
    .line 231
    new-instance v11, Lax/y0/a$d;

    .line 232
    .line 233
    const/4 v12, 0x1

    .line 234
    int-to-long v14, v5

    .line 235
    move-object/from16 v16, v6

    .line 236
    .line 237
    invoke-direct/range {v11 .. v16}, Lax/y0/a$d;-><init>(IIJ[B)V

    .line 238
    .line 239
    .line 240
    iput-object v11, v1, Lax/y0/a;->v:Lax/y0/a$d;

    .line 241
    .line 242
    const/4 v5, 0x1

    .line 243
    :cond_f2
    :goto_f2
    invoke-virtual {v0}, Lax/y0/a$b;->b()I

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    sub-int/2addr v8, v6

    .line 248
    invoke-virtual {v0, v8}, Lax/y0/a$b;->f(I)V
    :try_end_fa
    .catch Ljava/io/EOFException; {:try_start_34 .. :try_end_fa} :catch_5a

    .line 249
    .line 250
    .line 251
    goto/16 :goto_30

    .line 252
    .line 253
    :goto_fc
    new-instance v2, Ljava/io/IOException;

    .line 254
    .line 255
    const-string v3, "Encountered corrupt PNG file."

    .line 256
    .line 257
    invoke-direct {v2, v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 258
    .line 259
    .line 260
    throw v2
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method private v0(Lax/y0/a$c;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/y0/a;->v:Lax/y0/a$d;

    .line 2
    .line 3
    iget-object v0, v0, Lax/y0/a$d;->d:[B

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    add-int/lit8 v0, v0, 0x16

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lax/y0/a$c;->c(I)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/zip/CRC32;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    .line 14
    .line 15
    .line 16
    const v1, 0x69545874

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1}, Lax/y0/a$c;->c(I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lax/y0/a;->q0(Ljava/util/zip/CRC32;I)V

    .line 23
    .line 24
    .line 25
    sget-object v1, Lax/y0/a;->M:[B

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lax/y0/a$c;->write([B)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/util/zip/CRC32;->update([B)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lax/y0/a;->v:Lax/y0/a$d;

    .line 34
    .line 35
    iget-object v1, v1, Lax/y0/a$d;->d:[B

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Lax/y0/a$c;->write([B)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lax/y0/a;->v:Lax/y0/a$d;

    .line 41
    .line 42
    iget-object v1, v1, Lax/y0/a$d;->d:[B

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/util/zip/CRC32;->update([B)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    long-to-int v1, v0

    .line 52
    invoke-virtual {p1, v1}, Lax/y0/a$c;->c(I)V

    .line 53
    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    iput-boolean p1, p0, Lax/y0/a;->w:Z

    .line 57
    .line 58
    return-void
    .line 59
    .line 60
    .line 61
.end method

.method private w(Lax/y0/a$b;)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-boolean v0, Lax/y0/a;->x:Z

    .line 2
    .line 3
    const-string v1, "ExifInterface"

    .line 4
    .line 5
    if-eqz v0, :cond_1a

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v3, "getRafAttributes starting with: "

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_1a
    const/16 v2, 0x54

    .line 28
    .line 29
    invoke-virtual {p1, v2}, Lax/y0/a$b;->f(I)V

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    new-array v3, v2, [B

    .line 34
    .line 35
    new-array v4, v2, [B

    .line 36
    .line 37
    new-array v2, v2, [B

    .line 38
    .line 39
    invoke-virtual {p1, v3}, Lax/y0/a$b;->readFully([B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v4}, Lax/y0/a$b;->readFully([B)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v2}, Lax/y0/a$b;->readFully([B)V

    .line 46
    .line 47
    .line 48
    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-static {v4}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->getInt()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    new-array v4, v4, [B

    .line 73
    .line 74
    invoke-virtual {p1}, Lax/y0/a$b;->b()I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    sub-int v5, v3, v5

    .line 79
    .line 80
    invoke-virtual {p1, v5}, Lax/y0/a$b;->f(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v4}, Lax/y0/a$b;->readFully([B)V

    .line 84
    .line 85
    .line 86
    new-instance v5, Lax/y0/a$b;

    .line 87
    .line 88
    invoke-direct {v5, v4}, Lax/y0/a$b;-><init>([B)V

    .line 89
    .line 90
    .line 91
    const/4 v4, 0x5

    .line 92
    invoke-direct {p0, v5, v3, v4}, Lax/y0/a;->r(Lax/y0/a$b;II)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Lax/y0/a$b;->b()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    sub-int/2addr v2, v3

    .line 100
    invoke-virtual {p1, v2}, Lax/y0/a$b;->f(I)V

    .line 101
    .line 102
    .line 103
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 104
    .line 105
    invoke-virtual {p1, v2}, Lax/y0/a$b;->e(Ljava/nio/ByteOrder;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Lax/y0/a$b;->readInt()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v0, :cond_85

    .line 113
    .line 114
    new-instance v0, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    const-string v3, "numberOfDirectoryEntry: "

    .line 120
    .line 121
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    :cond_85
    const/4 v0, 0x0

    .line 135
    const/4 v3, 0x0

    .line 136
    :goto_87
    if-ge v3, v2, :cond_e4

    .line 137
    .line 138
    invoke-virtual {p1}, Lax/y0/a$b;->readUnsignedShort()I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    invoke-virtual {p1}, Lax/y0/a$b;->readUnsignedShort()I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    sget-object v6, Lax/y0/a;->g0:Lax/y0/a$e;

    .line 147
    .line 148
    iget v6, v6, Lax/y0/a$e;->a:I

    .line 149
    .line 150
    if-ne v4, v6, :cond_de

    .line 151
    .line 152
    invoke-virtual {p1}, Lax/y0/a$b;->readShort()S

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    invoke-virtual {p1}, Lax/y0/a$b;->readShort()S

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    iget-object v3, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 161
    .line 162
    invoke-static {v2, v3}, Lax/y0/a$d;->j(ILjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    iget-object v4, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 167
    .line 168
    invoke-static {p1, v4}, Lax/y0/a$d;->j(ILjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    iget-object v5, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 173
    .line 174
    aget-object v5, v5, v0

    .line 175
    .line 176
    const-string v6, "ImageLength"

    .line 177
    .line 178
    invoke-virtual {v5, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    iget-object v3, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 182
    .line 183
    aget-object v0, v3, v0

    .line 184
    .line 185
    const-string v3, "ImageWidth"

    .line 186
    .line 187
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    sget-boolean v0, Lax/y0/a;->x:Z

    .line 191
    .line 192
    if-eqz v0, :cond_e4

    .line 193
    .line 194
    new-instance v0, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    .line 198
    .line 199
    const-string v3, "Updated to length: "

    .line 200
    .line 201
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const-string v2, ", width: "

    .line 208
    .line 209
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :cond_de
    invoke-virtual {p1, v5}, Lax/y0/a$b;->f(I)V

    .line 224
    .line 225
    .line 226
    add-int/lit8 v3, v3, 0x1

    .line 227
    .line 228
    goto :goto_87

    .line 229
    :cond_e4
    return-void
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method private x(Lax/y0/a$g;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lax/y0/a;->X(Lax/y0/a$b;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Lax/y0/a;->b0(Lax/y0/a$g;I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, v0}, Lax/y0/a;->r0(Lax/y0/a$g;I)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x5

    .line 12
    invoke-direct {p0, p1, v0}, Lax/y0/a;->r0(Lax/y0/a$g;I)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    invoke-direct {p0, p1, v0}, Lax/y0/a;->r0(Lax/y0/a$g;I)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lax/y0/a;->s0()V

    .line 20
    .line 21
    .line 22
    iget p1, p0, Lax/y0/a;->d:I

    .line 23
    .line 24
    const/16 v0, 0x8

    .line 25
    .line 26
    if-ne p1, v0, :cond_54

    .line 27
    .line 28
    iget-object p1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    aget-object p1, p1, v0

    .line 32
    .line 33
    const-string v1, "MakerNote"

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lax/y0/a$d;

    .line 40
    .line 41
    if-eqz p1, :cond_54

    .line 42
    .line 43
    new-instance v1, Lax/y0/a$g;

    .line 44
    .line 45
    iget-object p1, p1, Lax/y0/a$d;->d:[B

    .line 46
    .line 47
    invoke-direct {v1, p1}, Lax/y0/a$g;-><init>([B)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 51
    .line 52
    invoke-virtual {v1, p1}, Lax/y0/a$b;->e(Ljava/nio/ByteOrder;)V

    .line 53
    .line 54
    .line 55
    const/4 p1, 0x6

    .line 56
    invoke-virtual {v1, p1}, Lax/y0/a$b;->f(I)V

    .line 57
    .line 58
    .line 59
    const/16 p1, 0x9

    .line 60
    .line 61
    invoke-direct {p0, v1, p1}, Lax/y0/a;->b0(Lax/y0/a$g;I)V

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 65
    .line 66
    aget-object p1, v1, p1

    .line 67
    .line 68
    const-string v1, "ColorSpace"

    .line 69
    .line 70
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Lax/y0/a$d;

    .line 75
    .line 76
    if-eqz p1, :cond_54

    .line 77
    .line 78
    iget-object v2, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 79
    .line 80
    aget-object v0, v2, v0

    .line 81
    .line 82
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    :cond_54
    return-void
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method private z(Lax/y0/a$g;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-boolean v0, Lax/y0/a;->x:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1a

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "getRw2Attributes starting with: "

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "ExifInterface"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_1a
    invoke-direct {p0, p1}, Lax/y0/a;->x(Lax/y0/a$g;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    aget-object p1, p1, v0

    .line 34
    .line 35
    const-string v1, "JpgFromRaw"

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lax/y0/a$d;

    .line 42
    .line 43
    if-eqz p1, :cond_3a

    .line 44
    .line 45
    new-instance v1, Lax/y0/a$b;

    .line 46
    .line 47
    iget-object v2, p1, Lax/y0/a$d;->d:[B

    .line 48
    .line 49
    invoke-direct {v1, v2}, Lax/y0/a$b;-><init>([B)V

    .line 50
    .line 51
    .line 52
    iget-wide v2, p1, Lax/y0/a$d;->c:J

    .line 53
    .line 54
    long-to-int p1, v2

    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {p0, v1, p1, v2}, Lax/y0/a;->r(Lax/y0/a$b;II)V

    .line 57
    .line 58
    .line 59
    :cond_3a
    iget-object p1, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 60
    .line 61
    aget-object p1, p1, v0

    .line 62
    .line 63
    const-string v0, "ISO"

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Lax/y0/a$d;

    .line 70
    .line 71
    iget-object v0, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    aget-object v0, v0, v1

    .line 75
    .line 76
    const-string v2, "PhotographicSensitivity"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lax/y0/a$d;

    .line 83
    .line 84
    if-eqz p1, :cond_5e

    .line 85
    .line 86
    if-nez v0, :cond_5e

    .line 87
    .line 88
    iget-object v0, p0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 89
    .line 90
    aget-object v0, v0, v1

    .line 91
    .line 92
    invoke-virtual {v0, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    :cond_5e
    return-void
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method


# virtual methods
.method public B()[B
    .registers 3

    .line 1
    iget v0, p0, Lax/y0/a;->p:I

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    if-eq v0, v1, :cond_b

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    if-ne v0, v1, :cond_9

    .line 8
    .line 9
    goto :goto_b

    .line 10
    :cond_9
    const/4 v0, 0x0

    .line 11
    return-object v0

    .line 12
    :cond_b
    :goto_b
    invoke-virtual {p0}, Lax/y0/a;->C()[B

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public C()[B
    .registers 9

    .line 1
    const-string v0, "ExifInterface"

    .line 2
    .line 3
    iget-boolean v1, p0, Lax/y0/a;->j:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_8

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_8
    iget-object v1, p0, Lax/y0/a;->o:[B

    .line 10
    .line 11
    if-eqz v1, :cond_d

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_d
    :try_start_d
    iget-object v1, p0, Lax/y0/a;->c:Landroid/content/res/AssetManager$AssetInputStream;
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_f} :catch_3e
    .catchall {:try_start_d .. :try_end_f} :catchall_3b

    .line 15
    .line 16
    if-eqz v1, :cond_2f

    .line 17
    .line 18
    :try_start_11
    invoke-virtual {v1}, Ljava/io/InputStream;->markSupported()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_26

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/io/InputStream;->reset()V

    .line 25
    .line 26
    .line 27
    :goto_1a
    move-object v3, v2

    .line 28
    goto :goto_58

    .line 29
    :catchall_1c
    move-exception v0

    .line 30
    move-object v3, v2

    .line 31
    :goto_1e
    move-object v2, v1

    .line 32
    goto/16 :goto_90

    .line 33
    .line 34
    :catch_21
    move-exception v3

    .line 35
    move-object v4, v3

    .line 36
    move-object v3, v2

    .line 37
    goto/16 :goto_82

    .line 38
    .line 39
    :cond_26
    const-string v3, "Cannot read thumbnail from inputstream without mark/reset support"

    .line 40
    .line 41
    invoke-static {v0, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2b
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_2b} :catch_21
    .catchall {:try_start_11 .. :try_end_2b} :catchall_1c

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 45
    .line 46
    .line 47
    return-object v2

    .line 48
    :cond_2f
    :try_start_2f
    iget-object v1, p0, Lax/y0/a;->a:Ljava/lang/String;

    .line 49
    .line 50
    if-eqz v1, :cond_43

    .line 51
    .line 52
    new-instance v1, Ljava/io/FileInputStream;

    .line 53
    .line 54
    iget-object v3, p0, Lax/y0/a;->a:Ljava/lang/String;

    .line 55
    .line 56
    invoke-direct {v1, v3}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1a

    .line 60
    :catchall_3b
    move-exception v0

    .line 61
    move-object v3, v2

    .line 62
    goto :goto_90

    .line 63
    :catch_3e
    move-exception v3

    .line 64
    move-object v1, v2

    .line 65
    move-object v4, v3

    .line 66
    move-object v3, v1

    .line 67
    goto :goto_82

    .line 68
    :cond_43
    iget-object v1, p0, Lax/y0/a;->b:Ljava/io/FileDescriptor;

    .line 69
    .line 70
    invoke-static {v1}, Landroid/system/Os;->dup(Ljava/io/FileDescriptor;)Ljava/io/FileDescriptor;

    .line 71
    .line 72
    .line 73
    move-result-object v1
    :try_end_49
    .catch Ljava/lang/Exception; {:try_start_2f .. :try_end_49} :catch_3e
    .catchall {:try_start_2f .. :try_end_49} :catchall_3b

    .line 74
    :try_start_49
    sget v3, Landroid/system/OsConstants;->SEEK_SET:I

    .line 75
    .line 76
    const-wide/16 v4, 0x0

    .line 77
    .line 78
    invoke-static {v1, v4, v5, v3}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J

    .line 79
    .line 80
    .line 81
    new-instance v3, Ljava/io/FileInputStream;

    .line 82
    .line 83
    invoke-direct {v3, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_55
    .catch Ljava/lang/Exception; {:try_start_49 .. :try_end_55} :catch_7e
    .catchall {:try_start_49 .. :try_end_55} :catchall_7b

    .line 84
    .line 85
    .line 86
    move-object v7, v3

    .line 87
    move-object v3, v1

    .line 88
    move-object v1, v7

    .line 89
    :goto_58
    :try_start_58
    new-instance v4, Lax/y0/a$b;

    .line 90
    .line 91
    invoke-direct {v4, v1}, Lax/y0/a$b;-><init>(Ljava/io/InputStream;)V

    .line 92
    .line 93
    .line 94
    iget v5, p0, Lax/y0/a;->m:I

    .line 95
    .line 96
    iget v6, p0, Lax/y0/a;->q:I

    .line 97
    .line 98
    add-int/2addr v5, v6

    .line 99
    invoke-virtual {v4, v5}, Lax/y0/a$b;->f(I)V

    .line 100
    .line 101
    .line 102
    iget v5, p0, Lax/y0/a;->n:I

    .line 103
    .line 104
    new-array v5, v5, [B

    .line 105
    .line 106
    invoke-virtual {v4, v5}, Lax/y0/a$b;->readFully([B)V

    .line 107
    .line 108
    .line 109
    iput-object v5, p0, Lax/y0/a;->o:[B
    :try_end_6e
    .catch Ljava/lang/Exception; {:try_start_58 .. :try_end_6e} :catch_79
    .catchall {:try_start_58 .. :try_end_6e} :catchall_77

    .line 110
    .line 111
    invoke-static {v1}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 112
    .line 113
    .line 114
    if-eqz v3, :cond_76

    .line 115
    .line 116
    invoke-static {v3}, Lax/y0/b;->a(Ljava/io/FileDescriptor;)V

    .line 117
    .line 118
    .line 119
    :cond_76
    return-object v5

    .line 120
    :catchall_77
    move-exception v0

    .line 121
    goto :goto_1e

    .line 122
    :catch_79
    move-exception v4

    .line 123
    goto :goto_82

    .line 124
    :catchall_7b
    move-exception v0

    .line 125
    move-object v3, v1

    .line 126
    goto :goto_90

    .line 127
    :catch_7e
    move-exception v3

    .line 128
    move-object v4, v3

    .line 129
    move-object v3, v1

    .line 130
    move-object v1, v2

    .line 131
    :goto_82
    :try_start_82
    const-string v5, "Encountered exception while getting thumbnail"

    .line 132
    .line 133
    invoke-static {v0, v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_87
    .catchall {:try_start_82 .. :try_end_87} :catchall_77

    .line 134
    .line 135
    .line 136
    invoke-static {v1}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 137
    .line 138
    .line 139
    if-eqz v3, :cond_8f

    .line 140
    .line 141
    invoke-static {v3}, Lax/y0/b;->a(Ljava/io/FileDescriptor;)V

    .line 142
    .line 143
    .line 144
    :cond_8f
    return-object v2

    .line 145
    :goto_90
    invoke-static {v2}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 146
    .line 147
    .line 148
    if-eqz v3, :cond_98

    .line 149
    .line 150
    invoke-static {v3}, Lax/y0/b;->a(Ljava/io/FileDescriptor;)V

    .line 151
    .line 152
    .line 153
    :cond_98
    throw v0
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method public f0()V
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const-string v1, "Orientation"

    .line 7
    .line 8
    invoke-virtual {p0, v1, v0}, Lax/y0/a;->m0(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public h0(I)V
    .registers 8

    .line 1
    rem-int/lit8 v0, p1, 0x5a

    .line 2
    .line 3
    if-nez v0, :cond_62

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    const-string v1, "Orientation"

    .line 7
    .line 8
    invoke-virtual {p0, v1, v0}, Lax/y0/a;->l(Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    sget-object v2, Lax/y0/a;->y:Ljava/util/List;

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x4

    .line 24
    if-eqz v3, :cond_34

    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v2, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    div-int/lit8 p1, p1, 0x5a

    .line 35
    .line 36
    add-int/2addr v0, p1

    .line 37
    rem-int/2addr v0, v5

    .line 38
    if-gez v0, :cond_28

    .line 39
    .line 40
    const/4 v4, 0x4

    .line 41
    :cond_28
    add-int/2addr v0, v4

    .line 42
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    goto :goto_5a

    .line 53
    :cond_34
    sget-object v2, Lax/y0/a;->z:Ljava/util/List;

    .line 54
    .line 55
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_5a

    .line 64
    .line 65
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-interface {v2, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    div-int/lit8 p1, p1, 0x5a

    .line 74
    .line 75
    add-int/2addr v0, p1

    .line 76
    rem-int/2addr v0, v5

    .line 77
    if-gez v0, :cond_4f

    .line 78
    .line 79
    const/4 v4, 0x4

    .line 80
    :cond_4f
    add-int/2addr v0, v4

    .line 81
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Ljava/lang/Integer;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    :cond_5a
    :goto_5a
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p0, v1, p1}, Lax/y0/a;->m0(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_62
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 100
    .line 101
    const-string v0, "degree should be a multiple of 90"

    .line 102
    .line 103
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p1
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public i(Ljava/lang/String;)Ljava/lang/String;
    .registers 11

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x3

    .line 5
    if-eqz p1, :cond_b3

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lax/y0/a;->p(Ljava/lang/String;)Lax/y0/a$d;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    const/4 v5, 0x0

    .line 12
    if-nez v4, :cond_e

    .line 13
    .line 14
    return-object v5

    .line 15
    :cond_e
    const-string v6, "GPSTimeStamp"

    .line 16
    .line 17
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    if-eqz v6, :cond_98

    .line 22
    .line 23
    iget p1, v4, Lax/y0/a$d;->a:I

    .line 24
    .line 25
    const/4 v6, 0x5

    .line 26
    const-string v7, "ExifInterface"

    .line 27
    .line 28
    if-eq p1, v6, :cond_38

    .line 29
    .line 30
    const/16 v6, 0xa

    .line 31
    .line 32
    if-eq p1, v6, :cond_38

    .line 33
    .line 34
    new-instance p1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v0, "GPS Timestamp format is not rational. format="

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget v0, v4, Lax/y0/a$d;->a:I

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {v7, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    return-object v5

    .line 57
    :cond_38
    iget-object p1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 58
    .line 59
    invoke-virtual {v4, p1}, Lax/y0/a$d;->o(Ljava/nio/ByteOrder;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, [Lax/y0/a$f;

    .line 64
    .line 65
    if-eqz p1, :cond_7f

    .line 66
    .line 67
    array-length v4, p1

    .line 68
    if-eq v4, v3, :cond_46

    .line 69
    .line 70
    goto :goto_7f

    .line 71
    :cond_46
    aget-object v4, p1, v2

    .line 72
    .line 73
    iget-wide v5, v4, Lax/y0/a$f;->a:J

    .line 74
    .line 75
    long-to-float v5, v5

    .line 76
    iget-wide v6, v4, Lax/y0/a$f;->b:J

    .line 77
    .line 78
    long-to-float v4, v6

    .line 79
    div-float/2addr v5, v4

    .line 80
    float-to-int v4, v5

    .line 81
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    aget-object v5, p1, v1

    .line 86
    .line 87
    iget-wide v6, v5, Lax/y0/a$f;->a:J

    .line 88
    .line 89
    long-to-float v6, v6

    .line 90
    iget-wide v7, v5, Lax/y0/a$f;->b:J

    .line 91
    .line 92
    long-to-float v5, v7

    .line 93
    div-float/2addr v6, v5

    .line 94
    float-to-int v5, v6

    .line 95
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    aget-object p1, p1, v0

    .line 100
    .line 101
    iget-wide v6, p1, Lax/y0/a$f;->a:J

    .line 102
    .line 103
    long-to-float v6, v6

    .line 104
    iget-wide v7, p1, Lax/y0/a$f;->b:J

    .line 105
    .line 106
    long-to-float p1, v7

    .line 107
    div-float/2addr v6, p1

    .line 108
    float-to-int p1, v6

    .line 109
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    new-array v3, v3, [Ljava/lang/Object;

    .line 114
    .line 115
    aput-object v4, v3, v2

    .line 116
    .line 117
    aput-object v5, v3, v1

    .line 118
    .line 119
    aput-object p1, v3, v0

    .line 120
    .line 121
    const-string p1, "%02d:%02d:%02d"

    .line 122
    .line 123
    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    return-object p1

    .line 128
    :cond_7f
    :goto_7f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    const-string v1, "Invalid GPS Timestamp array. array="

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-static {v7, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    return-object v5

    .line 153
    :cond_98
    sget-object v0, Lax/y0/a;->p0:Ljava/util/Set;

    .line 154
    .line 155
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-eqz p1, :cond_ac

    .line 160
    .line 161
    :try_start_a0
    iget-object p1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 162
    .line 163
    invoke-virtual {v4, p1}, Lax/y0/a$d;->l(Ljava/nio/ByteOrder;)D

    .line 164
    .line 165
    .line 166
    move-result-wide v0

    .line 167
    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1
    :try_end_aa
    .catch Ljava/lang/NumberFormatException; {:try_start_a0 .. :try_end_aa} :catch_ab

    .line 171
    return-object p1

    .line 172
    :catch_ab
    return-object v5

    .line 173
    :cond_ac
    iget-object p1, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 174
    .line 175
    invoke-virtual {v4, p1}, Lax/y0/a$d;->n(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    return-object p1

    .line 180
    :cond_b3
    new-instance p1, Ljava/lang/NullPointerException;

    .line 181
    .line 182
    const-string v0, "tag shouldn\'t be null"

    .line 183
    .line 184
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw p1
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
.end method

.method public i0()V
    .registers 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/y0/a;->d:I

    .line 2
    .line 3
    invoke-static {v0}, Lax/y0/a;->R(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_172

    .line 8
    .line 9
    iget-object v0, p0, Lax/y0/a;->b:Ljava/io/FileDescriptor;

    .line 10
    .line 11
    if-nez v0, :cond_19

    .line 12
    .line 13
    iget-object v0, p0, Lax/y0/a;->a:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v0, :cond_11

    .line 16
    .line 17
    goto :goto_19

    .line 18
    :cond_11
    new-instance v0, Ljava/io/IOException;

    .line 19
    .line 20
    const-string v1, "ExifInterface does not support saving attributes for the current input."

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :cond_19
    :goto_19
    iget-boolean v0, p0, Lax/y0/a;->j:Z

    .line 27
    .line 28
    if-eqz v0, :cond_2e

    .line 29
    .line 30
    iget-boolean v0, p0, Lax/y0/a;->k:Z

    .line 31
    .line 32
    if-eqz v0, :cond_2e

    .line 33
    .line 34
    iget-boolean v0, p0, Lax/y0/a;->l:Z

    .line 35
    .line 36
    if-eqz v0, :cond_26

    .line 37
    .line 38
    goto :goto_2e

    .line 39
    :cond_26
    new-instance v0, Ljava/io/IOException;

    .line 40
    .line 41
    const-string v1, "ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips"

    .line 42
    .line 43
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :cond_2e
    :goto_2e
    const/4 v0, 0x1

    .line 48
    iput-boolean v0, p0, Lax/y0/a;->u:Z

    .line 49
    .line 50
    invoke-virtual {p0}, Lax/y0/a;->B()[B

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iput-object v1, p0, Lax/y0/a;->o:[B

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    :try_start_38
    const-string v2, "temp"

    .line 58
    .line 59
    const-string v3, "tmp"

    .line 60
    .line 61
    invoke-static {v2, v3}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget-object v3, p0, Lax/y0/a;->a:Ljava/lang/String;

    .line 66
    .line 67
    const-wide/16 v4, 0x0

    .line 68
    .line 69
    if-eqz v3, :cond_56

    .line 70
    .line 71
    new-instance v3, Ljava/io/FileInputStream;

    .line 72
    .line 73
    iget-object v6, p0, Lax/y0/a;->a:Ljava/lang/String;

    .line 74
    .line 75
    invoke-direct {v3, v6}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_64

    .line 79
    :catchall_4e
    move-exception v0

    .line 80
    move-object v6, v1

    .line 81
    goto/16 :goto_16b

    .line 82
    .line 83
    :catch_52
    move-exception v0

    .line 84
    move-object v6, v1

    .line 85
    goto/16 :goto_162

    .line 86
    .line 87
    :cond_56
    iget-object v3, p0, Lax/y0/a;->b:Ljava/io/FileDescriptor;

    .line 88
    .line 89
    sget v6, Landroid/system/OsConstants;->SEEK_SET:I

    .line 90
    .line 91
    invoke-static {v3, v4, v5, v6}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J

    .line 92
    .line 93
    .line 94
    new-instance v3, Ljava/io/FileInputStream;

    .line 95
    .line 96
    iget-object v6, p0, Lax/y0/a;->b:Ljava/io/FileDescriptor;

    .line 97
    .line 98
    invoke-direct {v3, v6}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_64
    .catch Ljava/lang/Exception; {:try_start_38 .. :try_end_64} :catch_52
    .catchall {:try_start_38 .. :try_end_64} :catchall_4e

    .line 99
    .line 100
    .line 101
    :goto_64
    :try_start_64
    new-instance v6, Ljava/io/FileOutputStream;

    .line 102
    .line 103
    invoke-direct {v6, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_69
    .catch Ljava/lang/Exception; {:try_start_64 .. :try_end_69} :catch_15f
    .catchall {:try_start_64 .. :try_end_69} :catchall_15c

    .line 104
    .line 105
    .line 106
    :try_start_69
    invoke-static {v3, v6}, Lax/y0/b;->d(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    :try_end_6c
    .catch Ljava/lang/Exception; {:try_start_69 .. :try_end_6c} :catch_159
    .catchall {:try_start_69 .. :try_end_6c} :catchall_156

    .line 107
    .line 108
    .line 109
    invoke-static {v3}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v6}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 113
    .line 114
    .line 115
    const/4 v3, 0x0

    .line 116
    :try_start_73
    new-instance v6, Ljava/io/FileInputStream;

    .line 117
    .line 118
    invoke-direct {v6, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_78
    .catch Ljava/lang/Exception; {:try_start_73 .. :try_end_78} :catch_e4
    .catchall {:try_start_73 .. :try_end_78} :catchall_84

    .line 119
    .line 120
    .line 121
    :try_start_78
    iget-object v7, p0, Lax/y0/a;->a:Ljava/lang/String;

    .line 122
    .line 123
    if-eqz v7, :cond_90

    .line 124
    .line 125
    new-instance v7, Ljava/io/FileOutputStream;

    .line 126
    .line 127
    iget-object v8, p0, Lax/y0/a;->a:Ljava/lang/String;

    .line 128
    .line 129
    invoke-direct {v7, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    goto :goto_9e

    .line 133
    :catchall_84
    move-exception v0

    .line 134
    move-object v9, v1

    .line 135
    goto/16 :goto_14a

    .line 136
    .line 137
    :catch_88
    move-exception v7

    .line 138
    move-object v8, v1

    .line 139
    move-object v9, v8

    .line 140
    move-object v1, v6

    .line 141
    :goto_8c
    move-object v6, v7

    .line 142
    move-object v7, v9

    .line 143
    goto/16 :goto_e8

    .line 144
    .line 145
    :cond_90
    iget-object v7, p0, Lax/y0/a;->b:Ljava/io/FileDescriptor;

    .line 146
    .line 147
    sget v8, Landroid/system/OsConstants;->SEEK_SET:I

    .line 148
    .line 149
    invoke-static {v7, v4, v5, v8}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J

    .line 150
    .line 151
    .line 152
    new-instance v7, Ljava/io/FileOutputStream;

    .line 153
    .line 154
    iget-object v8, p0, Lax/y0/a;->b:Ljava/io/FileDescriptor;

    .line 155
    .line 156
    invoke-direct {v7, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_9e
    .catch Ljava/lang/Exception; {:try_start_78 .. :try_end_9e} :catch_88
    .catchall {:try_start_78 .. :try_end_9e} :catchall_84

    .line 157
    .line 158
    .line 159
    :goto_9e
    :try_start_9e
    new-instance v8, Ljava/io/BufferedInputStream;

    .line 160
    .line 161
    invoke-direct {v8, v6}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_a3
    .catch Ljava/lang/Exception; {:try_start_9e .. :try_end_a3} :catch_de
    .catchall {:try_start_9e .. :try_end_a3} :catchall_84

    .line 162
    .line 163
    .line 164
    :try_start_a3
    new-instance v9, Ljava/io/BufferedOutputStream;

    .line 165
    .line 166
    invoke-direct {v9, v7}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_a8
    .catch Ljava/lang/Exception; {:try_start_a3 .. :try_end_a8} :catch_d8
    .catchall {:try_start_a3 .. :try_end_a8} :catchall_d5

    .line 167
    .line 168
    .line 169
    :try_start_a8
    iget v10, p0, Lax/y0/a;->d:I

    .line 170
    .line 171
    const/4 v11, 0x4

    .line 172
    if-ne v10, v11, :cond_ba

    .line 173
    .line 174
    invoke-direct {p0, v8, v9}, Lax/y0/a;->j0(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 175
    .line 176
    .line 177
    goto :goto_c9

    .line 178
    :catchall_b1
    move-exception v0

    .line 179
    :goto_b2
    move-object v1, v8

    .line 180
    goto/16 :goto_14a

    .line 181
    .line 182
    :catch_b5
    move-exception v1

    .line 183
    move-object v12, v6

    .line 184
    move-object v6, v1

    .line 185
    move-object v1, v12

    .line 186
    goto :goto_e8

    .line 187
    :cond_ba
    const/16 v11, 0xd

    .line 188
    .line 189
    if-ne v10, v11, :cond_c2

    .line 190
    .line 191
    invoke-direct {p0, v8, v9}, Lax/y0/a;->k0(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 192
    .line 193
    .line 194
    goto :goto_c9

    .line 195
    :cond_c2
    const/16 v11, 0xe

    .line 196
    .line 197
    if-ne v10, v11, :cond_c9

    .line 198
    .line 199
    invoke-direct {p0, v8, v9}, Lax/y0/a;->l0(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    :try_end_c9
    .catch Ljava/lang/Exception; {:try_start_a8 .. :try_end_c9} :catch_b5
    .catchall {:try_start_a8 .. :try_end_c9} :catchall_b1

    .line 200
    .line 201
    .line 202
    :cond_c9
    :goto_c9
    invoke-static {v8}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 203
    .line 204
    .line 205
    invoke-static {v9}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 209
    .line 210
    .line 211
    iput-object v1, p0, Lax/y0/a;->o:[B

    .line 212
    .line 213
    return-void

    .line 214
    :catchall_d5
    move-exception v0

    .line 215
    move-object v9, v1

    .line 216
    goto :goto_b2

    .line 217
    :catch_d8
    move-exception v9

    .line 218
    move-object v12, v9

    .line 219
    move-object v9, v1

    .line 220
    move-object v1, v6

    .line 221
    move-object v6, v12

    .line 222
    goto :goto_e8

    .line 223
    :catch_de
    move-exception v8

    .line 224
    move-object v9, v1

    .line 225
    move-object v1, v6

    .line 226
    move-object v6, v8

    .line 227
    move-object v8, v9

    .line 228
    goto :goto_e8

    .line 229
    :catch_e4
    move-exception v7

    .line 230
    move-object v8, v1

    .line 231
    move-object v9, v8

    .line 232
    goto :goto_8c

    .line 233
    :goto_e8
    :try_start_e8
    new-instance v10, Ljava/io/FileInputStream;

    .line 234
    .line 235
    invoke-direct {v10, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_ed
    .catch Ljava/lang/Exception; {:try_start_e8 .. :try_end_ed} :catch_121
    .catchall {:try_start_e8 .. :try_end_ed} :catchall_11f

    .line 236
    .line 237
    .line 238
    :try_start_ed
    iget-object v1, p0, Lax/y0/a;->a:Ljava/lang/String;

    .line 239
    .line 240
    if-eqz v1, :cond_ff

    .line 241
    .line 242
    new-instance v1, Ljava/io/FileOutputStream;

    .line 243
    .line 244
    iget-object v4, p0, Lax/y0/a;->a:Ljava/lang/String;

    .line 245
    .line 246
    invoke-direct {v1, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    :goto_f8
    move-object v7, v1

    .line 250
    goto :goto_10e

    .line 251
    :catchall_fa
    move-exception v0

    .line 252
    move-object v1, v10

    .line 253
    goto :goto_143

    .line 254
    :catch_fd
    move-exception v1

    .line 255
    goto :goto_124

    .line 256
    :cond_ff
    iget-object v1, p0, Lax/y0/a;->b:Ljava/io/FileDescriptor;

    .line 257
    .line 258
    sget v11, Landroid/system/OsConstants;->SEEK_SET:I

    .line 259
    .line 260
    invoke-static {v1, v4, v5, v11}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J

    .line 261
    .line 262
    .line 263
    new-instance v1, Ljava/io/FileOutputStream;

    .line 264
    .line 265
    iget-object v4, p0, Lax/y0/a;->b:Ljava/io/FileDescriptor;

    .line 266
    .line 267
    invoke-direct {v1, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 268
    .line 269
    .line 270
    goto :goto_f8

    .line 271
    :goto_10e
    invoke-static {v10, v7}, Lax/y0/b;->d(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    :try_end_111
    .catch Ljava/lang/Exception; {:try_start_ed .. :try_end_111} :catch_fd
    .catchall {:try_start_ed .. :try_end_111} :catchall_fa

    .line 272
    .line 273
    .line 274
    :try_start_111
    invoke-static {v10}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 275
    .line 276
    .line 277
    invoke-static {v7}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 278
    .line 279
    .line 280
    new-instance v0, Ljava/io/IOException;

    .line 281
    .line 282
    const-string v1, "Failed to save new file"

    .line 283
    .line 284
    invoke-direct {v0, v1, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 285
    .line 286
    .line 287
    throw v0
    :try_end_11f
    .catchall {:try_start_111 .. :try_end_11f} :catchall_b1

    .line 288
    :catchall_11f
    move-exception v0

    .line 289
    goto :goto_143

    .line 290
    :catch_121
    move-exception v3

    .line 291
    move-object v10, v1

    .line 292
    move-object v1, v3

    .line 293
    :goto_124
    :try_start_124
    new-instance v3, Ljava/io/IOException;

    .line 294
    .line 295
    new-instance v4, Ljava/lang/StringBuilder;

    .line 296
    .line 297
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 298
    .line 299
    .line 300
    const-string v5, "Failed to save new file. Original file is stored in "

    .line 301
    .line 302
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    invoke-direct {v3, v4, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 317
    .line 318
    .line 319
    throw v3
    :try_end_13f
    .catchall {:try_start_124 .. :try_end_13f} :catchall_13f

    .line 320
    :catchall_13f
    move-exception v1

    .line 321
    move-object v0, v1

    .line 322
    move-object v1, v10

    .line 323
    const/4 v3, 0x1

    .line 324
    :goto_143
    :try_start_143
    invoke-static {v1}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 325
    .line 326
    .line 327
    invoke-static {v7}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 328
    .line 329
    .line 330
    throw v0
    :try_end_14a
    .catchall {:try_start_143 .. :try_end_14a} :catchall_b1

    .line 331
    :goto_14a
    invoke-static {v1}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 332
    .line 333
    .line 334
    invoke-static {v9}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 335
    .line 336
    .line 337
    if-nez v3, :cond_155

    .line 338
    .line 339
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 340
    .line 341
    .line 342
    :cond_155
    throw v0

    .line 343
    :catchall_156
    move-exception v0

    .line 344
    :goto_157
    move-object v1, v3

    .line 345
    goto :goto_16b

    .line 346
    :catch_159
    move-exception v0

    .line 347
    :goto_15a
    move-object v1, v3

    .line 348
    goto :goto_162

    .line 349
    :catchall_15c
    move-exception v0

    .line 350
    move-object v6, v1

    .line 351
    goto :goto_157

    .line 352
    :catch_15f
    move-exception v0

    .line 353
    move-object v6, v1

    .line 354
    goto :goto_15a

    .line 355
    :goto_162
    :try_start_162
    new-instance v2, Ljava/io/IOException;

    .line 356
    .line 357
    const-string v3, "Failed to copy original file to temp file"

    .line 358
    .line 359
    invoke-direct {v2, v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 360
    .line 361
    .line 362
    throw v2
    :try_end_16a
    .catchall {:try_start_162 .. :try_end_16a} :catchall_16a

    .line 363
    :catchall_16a
    move-exception v0

    .line 364
    :goto_16b
    invoke-static {v1}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 365
    .line 366
    .line 367
    invoke-static {v6}, Lax/y0/b;->b(Ljava/io/Closeable;)V

    .line 368
    .line 369
    .line 370
    throw v0

    .line 371
    :cond_172
    new-instance v0, Ljava/io/IOException;

    .line 372
    .line 373
    const-string v1, "ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats."

    .line 374
    .line 375
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    throw v0
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
.end method

.method public j(Ljava/lang/String;)[B
    .registers 3

    .line 1
    if-eqz p1, :cond_d

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lax/y0/a;->p(Ljava/lang/String;)Lax/y0/a$d;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_b

    .line 8
    .line 9
    iget-object p1, p1, Lax/y0/a$d;->d:[B

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_b
    const/4 p1, 0x0

    .line 13
    return-object p1

    .line 14
    :cond_d
    new-instance p1, Ljava/lang/NullPointerException;

    .line 15
    .line 16
    const-string v0, "tag shouldn\'t be null"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1
    .line 22
.end method

.method public k(Ljava/lang/String;D)D
    .registers 5

    .line 1
    if-eqz p1, :cond_11

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lax/y0/a;->p(Ljava/lang/String;)Lax/y0/a$d;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_9

    .line 8
    .line 9
    goto :goto_10

    .line 10
    :cond_9
    :try_start_9
    iget-object v0, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lax/y0/a$d;->l(Ljava/nio/ByteOrder;)D

    .line 13
    .line 14
    .line 15
    move-result-wide p1
    :try_end_f
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_f} :catch_10

    .line 16
    return-wide p1

    .line 17
    :catch_10
    :goto_10
    return-wide p2

    .line 18
    :cond_11
    new-instance p1, Ljava/lang/NullPointerException;

    .line 19
    .line 20
    const-string p2, "tag shouldn\'t be null"

    .line 21
    .line 22
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public l(Ljava/lang/String;I)I
    .registers 4

    .line 1
    if-eqz p1, :cond_11

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lax/y0/a;->p(Ljava/lang/String;)Lax/y0/a$d;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_9

    .line 8
    .line 9
    goto :goto_10

    .line 10
    :cond_9
    :try_start_9
    iget-object v0, p0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lax/y0/a$d;->m(Ljava/nio/ByteOrder;)I

    .line 13
    .line 14
    .line 15
    move-result p1
    :try_end_f
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_f} :catch_10

    .line 16
    return p1

    .line 17
    :catch_10
    :goto_10
    return p2

    .line 18
    :cond_11
    new-instance p1, Ljava/lang/NullPointerException;

    .line 19
    .line 20
    const-string p2, "tag shouldn\'t be null"

    .line 21
    .line 22
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public m()Ljava/lang/Long;
    .registers 4

    .line 1
    const-string v0, "DateTime"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "SubSecTime"

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "OffsetTime"

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v0, v1, v2}, Lax/y0/a;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public m0(Ljava/lang/String;Ljava/lang/String;)V
    .registers 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    if-eqz v1, :cond_3e3

    .line 8
    .line 9
    const-string v3, "ISOSpeedRatings"

    .line 10
    .line 11
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const-string v4, "ExifInterface"

    .line 16
    .line 17
    if-eqz v3, :cond_1d

    .line 18
    .line 19
    sget-boolean v1, Lax/y0/a;->x:Z

    .line 20
    .line 21
    if-eqz v1, :cond_1b

    .line 22
    .line 23
    const-string v1, "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."

    .line 24
    .line 25
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    :cond_1b
    const-string v1, "PhotographicSensitivity"

    .line 29
    .line 30
    :cond_1d
    const/4 v3, 0x3

    .line 31
    const/4 v5, 0x2

    .line 32
    const-string v6, "/"

    .line 33
    .line 34
    const/4 v7, 0x1

    .line 35
    if-eqz v2, :cond_11f

    .line 36
    .line 37
    sget-object v8, Lax/y0/a;->p0:Ljava/util/Set;

    .line 38
    .line 39
    invoke-interface {v8, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    const-string v9, " : "

    .line 44
    .line 45
    const-string v10, "Invalid value for "

    .line 46
    .line 47
    if-eqz v8, :cond_5d

    .line 48
    .line 49
    invoke-virtual {v2, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    if-nez v8, :cond_5d

    .line 54
    .line 55
    :try_start_36
    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 56
    .line 57
    .line 58
    move-result-wide v11

    .line 59
    invoke-static {v11, v12}, Lax/y0/a$f;->b(D)Lax/y0/a$f;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    invoke-virtual {v8}, Lax/y0/a$f;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2
    :try_end_42
    .catch Ljava/lang/NumberFormatException; {:try_start_36 .. :try_end_42} :catch_44

    .line 67
    goto/16 :goto_11f

    .line 68
    .line 69
    :catch_44
    new-instance v3, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_5d
    const-string v8, "GPSTimeStamp"

    .line 95
    .line 96
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-eqz v8, :cond_c2

    .line 101
    .line 102
    sget-object v8, Lax/y0/a;->v0:Ljava/util/regex/Pattern;

    .line 103
    .line 104
    invoke-virtual {v8, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->find()Z

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    if-nez v11, :cond_8a

    .line 113
    .line 114
    new-instance v3, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_8a
    new-instance v2, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v8, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string v9, "/1,"

    .line 156
    .line 157
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v8, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v8, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 179
    .line 180
    .line 181
    move-result v8

    .line 182
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    const-string v8, "/1"

    .line 186
    .line 187
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    goto :goto_11f

    .line 195
    :cond_c2
    const-string v8, "DateTime"

    .line 196
    .line 197
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    if-nez v8, :cond_da

    .line 202
    .line 203
    const-string v8, "DateTimeOriginal"

    .line 204
    .line 205
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    if-nez v8, :cond_da

    .line 210
    .line 211
    const-string v8, "DateTimeDigitized"

    .line 212
    .line 213
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v8

    .line 217
    if-eqz v8, :cond_11f

    .line 218
    .line 219
    :cond_da
    sget-object v8, Lax/y0/a;->w0:Ljava/util/regex/Pattern;

    .line 220
    .line 221
    invoke-virtual {v8, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    invoke-virtual {v8}, Ljava/util/regex/Matcher;->find()Z

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    sget-object v11, Lax/y0/a;->x0:Ljava/util/regex/Pattern;

    .line 230
    .line 231
    invoke-virtual {v11, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 232
    .line 233
    .line 234
    move-result-object v11

    .line 235
    invoke-virtual {v11}, Ljava/util/regex/Matcher;->find()Z

    .line 236
    .line 237
    .line 238
    move-result v11

    .line 239
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 240
    .line 241
    .line 242
    move-result v12

    .line 243
    const/16 v13, 0x13

    .line 244
    .line 245
    if-ne v12, v13, :cond_106

    .line 246
    .line 247
    if-nez v8, :cond_fb

    .line 248
    .line 249
    if-nez v11, :cond_fb

    .line 250
    .line 251
    goto :goto_106

    .line 252
    :cond_fb
    if-eqz v11, :cond_11f

    .line 253
    .line 254
    const-string v8, "-"

    .line 255
    .line 256
    const-string v9, ":"

    .line 257
    .line 258
    invoke-virtual {v2, v8, v9}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    goto :goto_11f

    .line 263
    :cond_106
    :goto_106
    new-instance v3, Ljava/lang/StringBuilder;

    .line 264
    .line 265
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :cond_11f
    :goto_11f
    const-string v8, "Xmp"

    .line 289
    .line 290
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v9

    .line 294
    const/4 v10, 0x0

    .line 295
    if-eqz v9, :cond_15e

    .line 296
    .line 297
    iget-object v9, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 298
    .line 299
    aget-object v9, v9, v10

    .line 300
    .line 301
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v9

    .line 305
    if-nez v9, :cond_140

    .line 306
    .line 307
    iget-object v9, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 308
    .line 309
    const/4 v11, 0x5

    .line 310
    aget-object v9, v9, v11

    .line 311
    .line 312
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v8

    .line 316
    if-eqz v8, :cond_13e

    .line 317
    .line 318
    goto :goto_140

    .line 319
    :cond_13e
    const/4 v8, 0x0

    .line 320
    goto :goto_141

    .line 321
    :cond_140
    :goto_140
    const/4 v8, 0x1

    .line 322
    :goto_141
    iget v9, v0, Lax/y0/a;->d:I

    .line 323
    .line 324
    invoke-static {v9}, Lax/y0/a;->E(I)I

    .line 325
    .line 326
    .line 327
    move-result v9

    .line 328
    if-ne v9, v5, :cond_14f

    .line 329
    .line 330
    iget-object v11, v0, Lax/y0/a;->v:Lax/y0/a$d;

    .line 331
    .line 332
    if-nez v11, :cond_153

    .line 333
    .line 334
    if-eqz v8, :cond_153

    .line 335
    .line 336
    :cond_14f
    if-ne v9, v3, :cond_15e

    .line 337
    .line 338
    if-nez v8, :cond_15e

    .line 339
    .line 340
    :cond_153
    if-eqz v2, :cond_15a

    .line 341
    .line 342
    invoke-static {v2}, Lax/y0/a$d;->a(Ljava/lang/String;)Lax/y0/a$d;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    goto :goto_15b

    .line 347
    :cond_15a
    const/4 v1, 0x0

    .line 348
    :goto_15b
    iput-object v1, v0, Lax/y0/a;->v:Lax/y0/a$d;

    .line 349
    .line 350
    return-void

    .line 351
    :cond_15e
    const/4 v3, 0x0

    .line 352
    :goto_15f
    sget-object v8, Lax/y0/a;->l0:[[Lax/y0/a$e;

    .line 353
    .line 354
    array-length v8, v8

    .line 355
    if-ge v3, v8, :cond_3e2

    .line 356
    .line 357
    const/4 v8, 0x4

    .line 358
    if-ne v3, v8, :cond_173

    .line 359
    .line 360
    iget-boolean v8, v0, Lax/y0/a;->j:Z

    .line 361
    .line 362
    if-nez v8, :cond_173

    .line 363
    .line 364
    :cond_16b
    :goto_16b
    move-object/from16 v22, v6

    .line 365
    .line 366
    const/16 p1, 0x1

    .line 367
    .line 368
    const/16 v20, 0x0

    .line 369
    .line 370
    goto/16 :goto_3d9

    .line 371
    .line 372
    :cond_173
    sget-object v8, Lax/y0/a;->o0:[Ljava/util/HashMap;

    .line 373
    .line 374
    aget-object v8, v8, v3

    .line 375
    .line 376
    invoke-virtual {v8, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v8

    .line 380
    check-cast v8, Lax/y0/a$e;

    .line 381
    .line 382
    if-eqz v8, :cond_16b

    .line 383
    .line 384
    if-nez v2, :cond_189

    .line 385
    .line 386
    iget-object v8, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 387
    .line 388
    aget-object v8, v8, v3

    .line 389
    .line 390
    invoke-virtual {v8, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    goto :goto_16b

    .line 394
    :cond_189
    invoke-static {v2}, Lax/y0/a;->F(Ljava/lang/String;)Landroid/util/Pair;

    .line 395
    .line 396
    .line 397
    move-result-object v9

    .line 398
    iget v11, v8, Lax/y0/a$e;->c:I

    .line 399
    .line 400
    iget-object v12, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v12, Ljava/lang/Integer;

    .line 403
    .line 404
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 405
    .line 406
    .line 407
    move-result v12

    .line 408
    const/4 v13, -0x1

    .line 409
    if-eq v11, v12, :cond_25d

    .line 410
    .line 411
    iget v11, v8, Lax/y0/a$e;->c:I

    .line 412
    .line 413
    iget-object v12, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v12, Ljava/lang/Integer;

    .line 416
    .line 417
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 418
    .line 419
    .line 420
    move-result v12

    .line 421
    if-ne v11, v12, :cond_1a8

    .line 422
    .line 423
    goto/16 :goto_25d

    .line 424
    .line 425
    :cond_1a8
    iget v11, v8, Lax/y0/a$e;->d:I

    .line 426
    .line 427
    if-eq v11, v13, :cond_1c6

    .line 428
    .line 429
    iget-object v12, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v12, Ljava/lang/Integer;

    .line 432
    .line 433
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 434
    .line 435
    .line 436
    move-result v12

    .line 437
    if-eq v11, v12, :cond_1c2

    .line 438
    .line 439
    iget v11, v8, Lax/y0/a$e;->d:I

    .line 440
    .line 441
    iget-object v12, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v12, Ljava/lang/Integer;

    .line 444
    .line 445
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 446
    .line 447
    .line 448
    move-result v12

    .line 449
    if-ne v11, v12, :cond_1c6

    .line 450
    .line 451
    :cond_1c2
    iget v8, v8, Lax/y0/a$e;->d:I

    .line 452
    .line 453
    goto/16 :goto_25f

    .line 454
    .line 455
    :cond_1c6
    iget v11, v8, Lax/y0/a$e;->c:I

    .line 456
    .line 457
    if-eq v11, v7, :cond_25b

    .line 458
    .line 459
    const/4 v12, 0x7

    .line 460
    if-eq v11, v12, :cond_25b

    .line 461
    .line 462
    if-ne v11, v5, :cond_1d1

    .line 463
    .line 464
    goto/16 :goto_25b

    .line 465
    .line 466
    :cond_1d1
    sget-boolean v11, Lax/y0/a;->x:Z

    .line 467
    .line 468
    if-eqz v11, :cond_16b

    .line 469
    .line 470
    new-instance v11, Ljava/lang/StringBuilder;

    .line 471
    .line 472
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 473
    .line 474
    .line 475
    const-string v12, "Given tag ("

    .line 476
    .line 477
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    const-string v12, ") value didn\'t match with one of expected formats: "

    .line 484
    .line 485
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    sget-object v12, Lax/y0/a;->Y:[Ljava/lang/String;

    .line 489
    .line 490
    iget v14, v8, Lax/y0/a$e;->c:I

    .line 491
    .line 492
    aget-object v14, v12, v14

    .line 493
    .line 494
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    iget v14, v8, Lax/y0/a$e;->d:I

    .line 498
    .line 499
    const-string v15, ", "

    .line 500
    .line 501
    const-string v16, ""

    .line 502
    .line 503
    if-ne v14, v13, :cond_1fb

    .line 504
    .line 505
    move-object/from16 v8, v16

    .line 506
    .line 507
    goto :goto_20e

    .line 508
    :cond_1fb
    new-instance v14, Ljava/lang/StringBuilder;

    .line 509
    .line 510
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    iget v8, v8, Lax/y0/a$e;->d:I

    .line 517
    .line 518
    aget-object v8, v12, v8

    .line 519
    .line 520
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v8

    .line 527
    :goto_20e
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 528
    .line 529
    .line 530
    const-string v8, " (guess: "

    .line 531
    .line 532
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    iget-object v8, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast v8, Ljava/lang/Integer;

    .line 538
    .line 539
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 540
    .line 541
    .line 542
    move-result v8

    .line 543
    aget-object v8, v12, v8

    .line 544
    .line 545
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    iget-object v8, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v8, Ljava/lang/Integer;

    .line 551
    .line 552
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 553
    .line 554
    .line 555
    move-result v8

    .line 556
    if-ne v8, v13, :cond_230

    .line 557
    .line 558
    :goto_22d
    move-object/from16 v8, v16

    .line 559
    .line 560
    goto :goto_24a

    .line 561
    :cond_230
    new-instance v8, Ljava/lang/StringBuilder;

    .line 562
    .line 563
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    iget-object v9, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast v9, Ljava/lang/Integer;

    .line 572
    .line 573
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 574
    .line 575
    .line 576
    move-result v9

    .line 577
    aget-object v9, v12, v9

    .line 578
    .line 579
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v16

    .line 586
    goto :goto_22d

    .line 587
    :goto_24a
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 588
    .line 589
    .line 590
    const-string v8, ")"

    .line 591
    .line 592
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v8

    .line 599
    invoke-static {v4, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 600
    .line 601
    .line 602
    goto/16 :goto_16b

    .line 603
    .line 604
    :cond_25b
    :goto_25b
    move v8, v11

    .line 605
    goto :goto_25f

    .line 606
    :cond_25d
    :goto_25d
    iget v8, v8, Lax/y0/a$e;->c:I

    .line 607
    .line 608
    :goto_25f
    const-string v9, ","

    .line 609
    .line 610
    packed-switch v8, :pswitch_data_3ec

    .line 611
    .line 612
    .line 613
    :pswitch_264
    sget-boolean v9, Lax/y0/a;->x:Z

    .line 614
    .line 615
    if-eqz v9, :cond_16b

    .line 616
    .line 617
    new-instance v9, Ljava/lang/StringBuilder;

    .line 618
    .line 619
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 620
    .line 621
    .line 622
    const-string v11, "Data format isn\'t one of expected formats: "

    .line 623
    .line 624
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v8

    .line 634
    invoke-static {v4, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 635
    .line 636
    .line 637
    goto/16 :goto_16b

    .line 638
    .line 639
    :pswitch_27e
    invoke-virtual {v2, v9, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v8

    .line 643
    array-length v9, v8

    .line 644
    new-array v9, v9, [D

    .line 645
    .line 646
    const/4 v11, 0x0

    .line 647
    :goto_286
    array-length v12, v8

    .line 648
    if-ge v11, v12, :cond_294

    .line 649
    .line 650
    aget-object v12, v8, v11

    .line 651
    .line 652
    invoke-static {v12}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 653
    .line 654
    .line 655
    move-result-wide v12

    .line 656
    aput-wide v12, v9, v11

    .line 657
    .line 658
    add-int/lit8 v11, v11, 0x1

    .line 659
    .line 660
    goto :goto_286

    .line 661
    :cond_294
    iget-object v8, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 662
    .line 663
    aget-object v8, v8, v3

    .line 664
    .line 665
    iget-object v11, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 666
    .line 667
    invoke-static {v9, v11}, Lax/y0/a$d;->b([DLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 668
    .line 669
    .line 670
    move-result-object v9

    .line 671
    invoke-virtual {v8, v1, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    goto/16 :goto_16b

    .line 675
    .line 676
    :pswitch_2a3
    invoke-virtual {v2, v9, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v8

    .line 680
    array-length v9, v8

    .line 681
    new-array v9, v9, [Lax/y0/a$f;

    .line 682
    .line 683
    const/4 v11, 0x0

    .line 684
    :goto_2ab
    array-length v12, v8

    .line 685
    if-ge v11, v12, :cond_2dd

    .line 686
    .line 687
    aget-object v12, v8, v11

    .line 688
    .line 689
    invoke-virtual {v12, v6, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v12

    .line 693
    new-instance v14, Lax/y0/a$f;

    .line 694
    .line 695
    aget-object v15, v12, v10

    .line 696
    .line 697
    move-object/from16 p2, v8

    .line 698
    .line 699
    const/16 p1, 0x1

    .line 700
    .line 701
    invoke-static {v15}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 702
    .line 703
    .line 704
    move-result-wide v7

    .line 705
    double-to-long v7, v7

    .line 706
    aget-object v12, v12, p1

    .line 707
    .line 708
    move/from16 v21, v11

    .line 709
    .line 710
    const/16 v20, 0x0

    .line 711
    .line 712
    invoke-static {v12}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 713
    .line 714
    .line 715
    move-result-wide v10

    .line 716
    double-to-long v10, v10

    .line 717
    const/16 v19, 0x0

    .line 718
    .line 719
    move-wide v15, v7

    .line 720
    move-wide/from16 v17, v10

    .line 721
    .line 722
    invoke-direct/range {v14 .. v19}, Lax/y0/a$f;-><init>(JJLax/y0/a$a;)V

    .line 723
    .line 724
    .line 725
    aput-object v14, v9, v21

    .line 726
    .line 727
    add-int/lit8 v11, v21, 0x1

    .line 728
    .line 729
    move-object/from16 v8, p2

    .line 730
    .line 731
    const/4 v7, 0x1

    .line 732
    const/4 v10, 0x0

    .line 733
    goto :goto_2ab

    .line 734
    :cond_2dd
    const/16 p1, 0x1

    .line 735
    .line 736
    const/16 v20, 0x0

    .line 737
    .line 738
    iget-object v7, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 739
    .line 740
    aget-object v7, v7, v3

    .line 741
    .line 742
    iget-object v8, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 743
    .line 744
    invoke-static {v9, v8}, Lax/y0/a$d;->d([Lax/y0/a$f;Ljava/nio/ByteOrder;)Lax/y0/a$d;

    .line 745
    .line 746
    .line 747
    move-result-object v8

    .line 748
    invoke-virtual {v7, v1, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    :goto_2ee
    move-object/from16 v22, v6

    .line 752
    .line 753
    goto/16 :goto_3d9

    .line 754
    .line 755
    :pswitch_2f2
    const/16 p1, 0x1

    .line 756
    .line 757
    const/16 v20, 0x0

    .line 758
    .line 759
    invoke-virtual {v2, v9, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object v7

    .line 763
    array-length v8, v7

    .line 764
    new-array v8, v8, [I

    .line 765
    .line 766
    const/4 v9, 0x0

    .line 767
    :goto_2fe
    array-length v10, v7

    .line 768
    if-ge v9, v10, :cond_30c

    .line 769
    .line 770
    aget-object v10, v7, v9

    .line 771
    .line 772
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 773
    .line 774
    .line 775
    move-result v10

    .line 776
    aput v10, v8, v9

    .line 777
    .line 778
    add-int/lit8 v9, v9, 0x1

    .line 779
    .line 780
    goto :goto_2fe

    .line 781
    :cond_30c
    iget-object v7, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 782
    .line 783
    aget-object v7, v7, v3

    .line 784
    .line 785
    iget-object v9, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 786
    .line 787
    invoke-static {v8, v9}, Lax/y0/a$d;->c([ILjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 788
    .line 789
    .line 790
    move-result-object v8

    .line 791
    invoke-virtual {v7, v1, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    goto :goto_2ee

    .line 795
    :pswitch_31a
    const/16 p1, 0x1

    .line 796
    .line 797
    const/16 v20, 0x0

    .line 798
    .line 799
    invoke-virtual {v2, v9, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 800
    .line 801
    .line 802
    move-result-object v7

    .line 803
    array-length v8, v7

    .line 804
    new-array v8, v8, [Lax/y0/a$f;

    .line 805
    .line 806
    const/4 v9, 0x0

    .line 807
    :goto_326
    array-length v10, v7

    .line 808
    if-ge v9, v10, :cond_351

    .line 809
    .line 810
    aget-object v10, v7, v9

    .line 811
    .line 812
    invoke-virtual {v10, v6, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v10

    .line 816
    new-instance v14, Lax/y0/a$f;

    .line 817
    .line 818
    aget-object v11, v10, v20

    .line 819
    .line 820
    invoke-static {v11}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 821
    .line 822
    .line 823
    move-result-wide v11

    .line 824
    double-to-long v11, v11

    .line 825
    aget-object v10, v10, p1

    .line 826
    .line 827
    move-object/from16 v22, v6

    .line 828
    .line 829
    invoke-static {v10}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 830
    .line 831
    .line 832
    move-result-wide v5

    .line 833
    double-to-long v5, v5

    .line 834
    const/16 v19, 0x0

    .line 835
    .line 836
    move-wide/from16 v17, v5

    .line 837
    .line 838
    move-wide v15, v11

    .line 839
    invoke-direct/range {v14 .. v19}, Lax/y0/a$f;-><init>(JJLax/y0/a$a;)V

    .line 840
    .line 841
    .line 842
    aput-object v14, v8, v9

    .line 843
    .line 844
    add-int/lit8 v9, v9, 0x1

    .line 845
    .line 846
    move-object/from16 v6, v22

    .line 847
    .line 848
    const/4 v5, 0x2

    .line 849
    goto :goto_326

    .line 850
    :cond_351
    move-object/from16 v22, v6

    .line 851
    .line 852
    iget-object v5, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 853
    .line 854
    aget-object v5, v5, v3

    .line 855
    .line 856
    iget-object v6, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 857
    .line 858
    invoke-static {v8, v6}, Lax/y0/a$d;->i([Lax/y0/a$f;Ljava/nio/ByteOrder;)Lax/y0/a$d;

    .line 859
    .line 860
    .line 861
    move-result-object v6

    .line 862
    invoke-virtual {v5, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    goto/16 :goto_3d9

    .line 866
    .line 867
    :pswitch_362
    move-object/from16 v22, v6

    .line 868
    .line 869
    const/16 p1, 0x1

    .line 870
    .line 871
    const/16 v20, 0x0

    .line 872
    .line 873
    invoke-virtual {v2, v9, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v5

    .line 877
    array-length v6, v5

    .line 878
    new-array v6, v6, [J

    .line 879
    .line 880
    const/4 v7, 0x0

    .line 881
    :goto_370
    array-length v8, v5

    .line 882
    if-ge v7, v8, :cond_37e

    .line 883
    .line 884
    aget-object v8, v5, v7

    .line 885
    .line 886
    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 887
    .line 888
    .line 889
    move-result-wide v8

    .line 890
    aput-wide v8, v6, v7

    .line 891
    .line 892
    add-int/lit8 v7, v7, 0x1

    .line 893
    .line 894
    goto :goto_370

    .line 895
    :cond_37e
    iget-object v5, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 896
    .line 897
    aget-object v5, v5, v3

    .line 898
    .line 899
    iget-object v7, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 900
    .line 901
    invoke-static {v6, v7}, Lax/y0/a$d;->g([JLjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 902
    .line 903
    .line 904
    move-result-object v6

    .line 905
    invoke-virtual {v5, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    goto :goto_3d9

    .line 909
    :pswitch_38c
    move-object/from16 v22, v6

    .line 910
    .line 911
    const/16 p1, 0x1

    .line 912
    .line 913
    const/16 v20, 0x0

    .line 914
    .line 915
    invoke-virtual {v2, v9, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v5

    .line 919
    array-length v6, v5

    .line 920
    new-array v6, v6, [I

    .line 921
    .line 922
    const/4 v7, 0x0

    .line 923
    :goto_39a
    array-length v8, v5

    .line 924
    if-ge v7, v8, :cond_3a8

    .line 925
    .line 926
    aget-object v8, v5, v7

    .line 927
    .line 928
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 929
    .line 930
    .line 931
    move-result v8

    .line 932
    aput v8, v6, v7

    .line 933
    .line 934
    add-int/lit8 v7, v7, 0x1

    .line 935
    .line 936
    goto :goto_39a

    .line 937
    :cond_3a8
    iget-object v5, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 938
    .line 939
    aget-object v5, v5, v3

    .line 940
    .line 941
    iget-object v7, v0, Lax/y0/a;->i:Ljava/nio/ByteOrder;

    .line 942
    .line 943
    invoke-static {v6, v7}, Lax/y0/a$d;->k([ILjava/nio/ByteOrder;)Lax/y0/a$d;

    .line 944
    .line 945
    .line 946
    move-result-object v6

    .line 947
    invoke-virtual {v5, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 948
    .line 949
    .line 950
    goto :goto_3d9

    .line 951
    :pswitch_3b6
    move-object/from16 v22, v6

    .line 952
    .line 953
    const/16 p1, 0x1

    .line 954
    .line 955
    const/16 v20, 0x0

    .line 956
    .line 957
    iget-object v5, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 958
    .line 959
    aget-object v5, v5, v3

    .line 960
    .line 961
    invoke-static {v2}, Lax/y0/a$d;->e(Ljava/lang/String;)Lax/y0/a$d;

    .line 962
    .line 963
    .line 964
    move-result-object v6

    .line 965
    invoke-virtual {v5, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 966
    .line 967
    .line 968
    goto :goto_3d9

    .line 969
    :pswitch_3c8
    move-object/from16 v22, v6

    .line 970
    .line 971
    const/16 p1, 0x1

    .line 972
    .line 973
    const/16 v20, 0x0

    .line 974
    .line 975
    iget-object v5, v0, Lax/y0/a;->f:[Ljava/util/HashMap;

    .line 976
    .line 977
    aget-object v5, v5, v3

    .line 978
    .line 979
    invoke-static {v2}, Lax/y0/a$d;->a(Ljava/lang/String;)Lax/y0/a$d;

    .line 980
    .line 981
    .line 982
    move-result-object v6

    .line 983
    invoke-virtual {v5, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    :goto_3d9
    add-int/lit8 v3, v3, 0x1

    .line 987
    .line 988
    move-object/from16 v6, v22

    .line 989
    .line 990
    const/4 v5, 0x2

    .line 991
    const/4 v7, 0x1

    .line 992
    const/4 v10, 0x0

    .line 993
    goto/16 :goto_15f

    .line 994
    .line 995
    :cond_3e2
    return-void

    .line 996
    :cond_3e3
    new-instance v1, Ljava/lang/NullPointerException;

    .line 997
    .line 998
    const-string v2, "tag shouldn\'t be null"

    .line 999
    .line 1000
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1001
    .line 1002
    .line 1003
    throw v1

    .line 1004
    nop

    .line 1005
    :pswitch_data_3ec
    .packed-switch 0x1
        :pswitch_3c8
        :pswitch_3b6
        :pswitch_38c
        :pswitch_362
        :pswitch_31a
        :pswitch_264
        :pswitch_3b6
        :pswitch_264
        :pswitch_2f2
        :pswitch_2a3
        :pswitch_264
        :pswitch_27e
    .end packed-switch
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
.end method

.method public n()Ljava/lang/Long;
    .registers 4

    .line 1
    const-string v0, "DateTimeDigitized"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "SubSecTimeDigitized"

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "OffsetTimeDigitized"

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v0, v1, v2}, Lax/y0/a;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public o()Ljava/lang/Long;
    .registers 4

    .line 1
    const-string v0, "DateTimeOriginal"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "SubSecTimeOriginal"

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "OffsetTimeOriginal"

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v0, v1, v2}, Lax/y0/a;->W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public s()[D
    .registers 13

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    const-string v3, "GPSLatitude"

    .line 5
    .line 6
    invoke-virtual {p0, v3}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const-string v4, "GPSLatitudeRef"

    .line 11
    .line 12
    invoke-virtual {p0, v4}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    const-string v5, "GPSLongitude"

    .line 17
    .line 18
    invoke-virtual {p0, v5}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    const-string v6, "GPSLongitudeRef"

    .line 23
    .line 24
    invoke-virtual {p0, v6}, Lax/y0/a;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    if-eqz v3, :cond_5a

    .line 29
    .line 30
    if-eqz v4, :cond_5a

    .line 31
    .line 32
    if-eqz v5, :cond_5a

    .line 33
    .line 34
    if-eqz v6, :cond_5a

    .line 35
    .line 36
    :try_start_23
    invoke-static {v3, v4}, Lax/y0/a;->f(Ljava/lang/String;Ljava/lang/String;)D

    .line 37
    .line 38
    .line 39
    move-result-wide v7

    .line 40
    invoke-static {v5, v6}, Lax/y0/a;->f(Ljava/lang/String;Ljava/lang/String;)D

    .line 41
    .line 42
    .line 43
    move-result-wide v9

    .line 44
    new-array v11, v2, [D

    .line 45
    .line 46
    aput-wide v7, v11, v1

    .line 47
    .line 48
    aput-wide v9, v11, v0
    :try_end_31
    .catch Ljava/lang/IllegalArgumentException; {:try_start_23 .. :try_end_31} :catch_32

    .line 49
    .line 50
    return-object v11

    .line 51
    :catch_32
    new-instance v7, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v8, "Latitude/longitude values are not parsable. "

    .line 57
    .line 58
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v8, "latValue=%s, latRef=%s, lngValue=%s, lngRef=%s"

    .line 62
    .line 63
    const/4 v9, 0x4

    .line 64
    new-array v9, v9, [Ljava/lang/Object;

    .line 65
    .line 66
    aput-object v3, v9, v1

    .line 67
    .line 68
    aput-object v4, v9, v0

    .line 69
    .line 70
    aput-object v5, v9, v2

    .line 71
    .line 72
    const/4 v0, 0x3

    .line 73
    aput-object v6, v9, v0

    .line 74
    .line 75
    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v1, "ExifInterface"

    .line 87
    .line 88
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    :cond_5a
    const/4 v0, 0x0

    .line 92
    return-object v0
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method public y()I
    .registers 3

    .line 1
    const-string v0, "Orientation"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {p0, v0, v1}, Lax/y0/a;->l(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    packed-switch v0, :pswitch_data_16

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return v0

    .line 13
    :pswitch_c
    const/16 v0, 0x5a

    .line 14
    .line 15
    return v0

    .line 16
    :pswitch_f
    const/16 v0, 0x10e

    .line 17
    .line 18
    return v0

    .line 19
    :pswitch_12
    const/16 v0, 0xb4

    .line 20
    .line 21
    return v0

    .line 22
    nop

    .line 23
    :pswitch_data_16
    .packed-switch 0x3
        :pswitch_12
        :pswitch_12
        :pswitch_f
        :pswitch_c
        :pswitch_c
        :pswitch_f
    .end packed-switch
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
