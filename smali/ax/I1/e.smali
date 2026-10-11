.class public Lax/I1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/I1/e$b;,
        Lax/I1/e$c;
    }
.end annotation


# static fields
.field public static final f0:Lax/q1/x;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final g0:[B

.field private static final h0:[B

.field private static final i0:[B

.field private static final j0:[B

.field private static final k0:Ljava/util/UUID;

.field private static final l0:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private A:J

.field private B:Z

.field private C:J

.field private D:J

.field private E:J

.field private F:Lax/S0/v;

.field private G:Lax/S0/v;

.field private H:Z

.field private I:Z

.field private J:I

.field private K:J

.field private L:J

.field private M:I

.field private N:I

.field private O:[I

.field private P:I

.field private Q:I

.field private R:I

.field private S:I

.field private T:Z

.field private U:J

.field private V:I

.field private W:I

.field private X:I

.field private Y:Z

.field private Z:Z

.field private final a:Lax/I1/c;

.field private a0:Z

.field private final b:Lax/I1/g;

.field private b0:I

.field private final c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lax/I1/e$c;",
            ">;"
        }
    .end annotation
.end field

.field private c0:B

.field private final d:Z

.field private d0:Z

.field private final e:Z

.field private e0:Lax/q1/t;

.field private final f:Lax/N1/t$a;

.field private final g:Lax/S0/G;

.field private final h:Lax/S0/G;

.field private final i:Lax/S0/G;

.field private final j:Lax/S0/G;

.field private final k:Lax/S0/G;

.field private final l:Lax/S0/G;

.field private final m:Lax/S0/G;

.field private final n:Lax/S0/G;

.field private final o:Lax/S0/G;

.field private final p:Lax/S0/G;

.field private q:Ljava/nio/ByteBuffer;

.field private r:J

.field private s:J

.field private t:J

.field private u:J

.field private v:J

.field private w:Z

.field private x:Lax/I1/e$c;

.field private y:Z

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 1
    new-instance v0, Lax/I1/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/I1/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/I1/e;->f0:Lax/q1/x;

    .line 7
    .line 8
    const/16 v0, 0x20

    .line 9
    .line 10
    new-array v1, v0, [B

    .line 11
    .line 12
    fill-array-data v1, :array_70

    .line 13
    .line 14
    .line 15
    sput-object v1, Lax/I1/e;->g0:[B

    .line 16
    .line 17
    const-string v1, "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text"

    .line 18
    .line 19
    invoke-static {v1}, Lax/S0/d0;->x0(Ljava/lang/String;)[B

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sput-object v1, Lax/I1/e;->h0:[B

    .line 24
    .line 25
    new-array v0, v0, [B

    .line 26
    .line 27
    fill-array-data v0, :array_84

    .line 28
    .line 29
    .line 30
    sput-object v0, Lax/I1/e;->i0:[B

    .line 31
    .line 32
    const/16 v0, 0x26

    .line 33
    .line 34
    new-array v0, v0, [B

    .line 35
    .line 36
    fill-array-data v0, :array_98

    .line 37
    .line 38
    .line 39
    sput-object v0, Lax/I1/e;->j0:[B

    .line 40
    .line 41
    new-instance v0, Ljava/util/UUID;

    .line 42
    .line 43
    const-wide v1, 0x100000000001000L

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    const-wide v3, -0x7fffff55ffc7648fL    # -3.607411173533E-312

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Lax/I1/e;->k0:Ljava/util/UUID;

    .line 57
    .line 58
    new-instance v0, Ljava/util/HashMap;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const-string v2, "htc_video_rotA-000"

    .line 69
    .line 70
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    const/16 v1, 0x5a

    .line 74
    .line 75
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    const-string v2, "htc_video_rotA-090"

    .line 80
    .line 81
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    const/16 v1, 0xb4

    .line 85
    .line 86
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const-string v2, "htc_video_rotA-180"

    .line 91
    .line 92
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    const/16 v1, 0x10e

    .line 96
    .line 97
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    const-string v2, "htc_video_rotA-270"

    .line 102
    .line 103
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    sput-object v0, Lax/I1/e;->l0:Ljava/util/Map;

    .line 111
    .line 112
    return-void

    .line 113
    :array_70
    .array-data 1
        0x31t
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data

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
    :array_84
    .array-data 1
        0x44t
        0x69t
        0x61t
        0x6ct
        0x6ft
        0x67t
        0x75t
        0x65t
        0x3at
        0x20t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
    .end array-data

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
    :array_98
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x56t
        0x54t
        0x54t
        0xat
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data
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

.method constructor <init>(Lax/I1/c;ILax/N1/t$a;)V
    .registers 8

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 3
    iput-wide v0, p0, Lax/I1/e;->s:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    iput-wide v2, p0, Lax/I1/e;->t:J

    .line 5
    iput-wide v2, p0, Lax/I1/e;->u:J

    .line 6
    iput-wide v2, p0, Lax/I1/e;->v:J

    .line 7
    iput-wide v0, p0, Lax/I1/e;->C:J

    .line 8
    iput-wide v0, p0, Lax/I1/e;->D:J

    .line 9
    iput-wide v2, p0, Lax/I1/e;->E:J

    .line 10
    iput-object p1, p0, Lax/I1/e;->a:Lax/I1/c;

    .line 11
    new-instance v0, Lax/I1/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lax/I1/e$b;-><init>(Lax/I1/e;Lax/I1/e$a;)V

    invoke-interface {p1, v0}, Lax/I1/c;->c(Lax/I1/b;)V

    .line 12
    iput-object p3, p0, Lax/I1/e;->f:Lax/N1/t$a;

    and-int/lit8 p1, p2, 0x1

    const/4 p3, 0x0

    const/4 v0, 0x1

    if-nez p1, :cond_2d

    const/4 p1, 0x1

    goto :goto_2e

    :cond_2d
    const/4 p1, 0x0

    .line 13
    :goto_2e
    iput-boolean p1, p0, Lax/I1/e;->d:Z

    and-int/lit8 p1, p2, 0x2

    if-nez p1, :cond_35

    const/4 p3, 0x1

    .line 14
    :cond_35
    iput-boolean p3, p0, Lax/I1/e;->e:Z

    .line 15
    new-instance p1, Lax/I1/g;

    invoke-direct {p1}, Lax/I1/g;-><init>()V

    iput-object p1, p0, Lax/I1/e;->b:Lax/I1/g;

    .line 16
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lax/I1/e;->c:Landroid/util/SparseArray;

    .line 17
    new-instance p1, Lax/S0/G;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, Lax/S0/G;-><init>(I)V

    iput-object p1, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 18
    new-instance p1, Lax/S0/G;

    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p3

    const/4 v1, -0x1

    invoke-virtual {p3, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p3

    invoke-direct {p1, p3}, Lax/S0/G;-><init>([B)V

    iput-object p1, p0, Lax/I1/e;->j:Lax/S0/G;

    .line 19
    new-instance p1, Lax/S0/G;

    invoke-direct {p1, p2}, Lax/S0/G;-><init>(I)V

    iput-object p1, p0, Lax/I1/e;->k:Lax/S0/G;

    .line 20
    new-instance p1, Lax/S0/G;

    sget-object p3, Lax/T0/h;->a:[B

    invoke-direct {p1, p3}, Lax/S0/G;-><init>([B)V

    iput-object p1, p0, Lax/I1/e;->g:Lax/S0/G;

    .line 21
    new-instance p1, Lax/S0/G;

    invoke-direct {p1, p2}, Lax/S0/G;-><init>(I)V

    iput-object p1, p0, Lax/I1/e;->h:Lax/S0/G;

    .line 22
    new-instance p1, Lax/S0/G;

    invoke-direct {p1}, Lax/S0/G;-><init>()V

    iput-object p1, p0, Lax/I1/e;->l:Lax/S0/G;

    .line 23
    new-instance p1, Lax/S0/G;

    invoke-direct {p1}, Lax/S0/G;-><init>()V

    iput-object p1, p0, Lax/I1/e;->m:Lax/S0/G;

    .line 24
    new-instance p1, Lax/S0/G;

    const/16 p2, 0x8

    invoke-direct {p1, p2}, Lax/S0/G;-><init>(I)V

    iput-object p1, p0, Lax/I1/e;->n:Lax/S0/G;

    .line 25
    new-instance p1, Lax/S0/G;

    invoke-direct {p1}, Lax/S0/G;-><init>()V

    iput-object p1, p0, Lax/I1/e;->o:Lax/S0/G;

    .line 26
    new-instance p1, Lax/S0/G;

    invoke-direct {p1}, Lax/S0/G;-><init>()V

    iput-object p1, p0, Lax/I1/e;->p:Lax/S0/G;

    .line 27
    new-array p1, v0, [I

    iput-object p1, p0, Lax/I1/e;->O:[I

    return-void
.end method

.method public constructor <init>(Lax/N1/t$a;I)V
    .registers 4

    .line 1
    new-instance v0, Lax/I1/a;

    invoke-direct {v0}, Lax/I1/a;-><init>()V

    invoke-direct {p0, v0, p2, p1}, Lax/I1/e;-><init>(Lax/I1/c;ILax/N1/t$a;)V

    return-void
.end method

.method private static B(Ljava/lang/String;)Z
    .registers 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v2, -0x1

    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    sparse-switch v3, :sswitch_data_1d8

    .line 12
    .line 13
    .line 14
    goto/16 :goto_1d2

    .line 15
    .line 16
    :sswitch_f
    const-string v3, "A_OPUS"

    .line 17
    .line 18
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-nez p0, :cond_19

    .line 23
    .line 24
    goto/16 :goto_1d2

    .line 25
    .line 26
    :cond_19
    const/16 v2, 0x21

    .line 27
    .line 28
    goto/16 :goto_1d2

    .line 29
    .line 30
    :sswitch_1d
    const-string v3, "A_FLAC"

    .line 31
    .line 32
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_27

    .line 37
    .line 38
    goto/16 :goto_1d2

    .line 39
    .line 40
    :cond_27
    const/16 v2, 0x20

    .line 41
    .line 42
    goto/16 :goto_1d2

    .line 43
    .line 44
    :sswitch_2b
    const-string v3, "A_EAC3"

    .line 45
    .line 46
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_35

    .line 51
    .line 52
    goto/16 :goto_1d2

    .line 53
    .line 54
    :cond_35
    const/16 v2, 0x1f

    .line 55
    .line 56
    goto/16 :goto_1d2

    .line 57
    .line 58
    :sswitch_39
    const-string v3, "V_MPEG2"

    .line 59
    .line 60
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez p0, :cond_43

    .line 65
    .line 66
    goto/16 :goto_1d2

    .line 67
    .line 68
    :cond_43
    const/16 v2, 0x1e

    .line 69
    .line 70
    goto/16 :goto_1d2

    .line 71
    .line 72
    :sswitch_47
    const-string v3, "S_TEXT/UTF8"

    .line 73
    .line 74
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-nez p0, :cond_51

    .line 79
    .line 80
    goto/16 :goto_1d2

    .line 81
    .line 82
    :cond_51
    const/16 v2, 0x1d

    .line 83
    .line 84
    goto/16 :goto_1d2

    .line 85
    .line 86
    :sswitch_55
    const-string v3, "S_TEXT/WEBVTT"

    .line 87
    .line 88
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-nez p0, :cond_5f

    .line 93
    .line 94
    goto/16 :goto_1d2

    .line 95
    .line 96
    :cond_5f
    const/16 v2, 0x1c

    .line 97
    .line 98
    goto/16 :goto_1d2

    .line 99
    .line 100
    :sswitch_63
    const-string v3, "V_MPEGH/ISO/HEVC"

    .line 101
    .line 102
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-nez p0, :cond_6d

    .line 107
    .line 108
    goto/16 :goto_1d2

    .line 109
    .line 110
    :cond_6d
    const/16 v2, 0x1b

    .line 111
    .line 112
    goto/16 :goto_1d2

    .line 113
    .line 114
    :sswitch_71
    const-string v3, "S_TEXT/SSA"

    .line 115
    .line 116
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    if-nez p0, :cond_7b

    .line 121
    .line 122
    goto/16 :goto_1d2

    .line 123
    .line 124
    :cond_7b
    const/16 v2, 0x1a

    .line 125
    .line 126
    goto/16 :goto_1d2

    .line 127
    .line 128
    :sswitch_7f
    const-string v3, "S_TEXT/ASS"

    .line 129
    .line 130
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    if-nez p0, :cond_89

    .line 135
    .line 136
    goto/16 :goto_1d2

    .line 137
    .line 138
    :cond_89
    const/16 v2, 0x19

    .line 139
    .line 140
    goto/16 :goto_1d2

    .line 141
    .line 142
    :sswitch_8d
    const-string v3, "A_PCM/INT/LIT"

    .line 143
    .line 144
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-nez p0, :cond_97

    .line 149
    .line 150
    goto/16 :goto_1d2

    .line 151
    .line 152
    :cond_97
    const/16 v2, 0x18

    .line 153
    .line 154
    goto/16 :goto_1d2

    .line 155
    .line 156
    :sswitch_9b
    const-string v3, "A_PCM/INT/BIG"

    .line 157
    .line 158
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-nez p0, :cond_a5

    .line 163
    .line 164
    goto/16 :goto_1d2

    .line 165
    .line 166
    :cond_a5
    const/16 v2, 0x17

    .line 167
    .line 168
    goto/16 :goto_1d2

    .line 169
    .line 170
    :sswitch_a9
    const-string v3, "A_PCM/FLOAT/IEEE"

    .line 171
    .line 172
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    if-nez p0, :cond_b3

    .line 177
    .line 178
    goto/16 :goto_1d2

    .line 179
    .line 180
    :cond_b3
    const/16 v2, 0x16

    .line 181
    .line 182
    goto/16 :goto_1d2

    .line 183
    .line 184
    :sswitch_b7
    const-string v3, "A_DTS/EXPRESS"

    .line 185
    .line 186
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    if-nez p0, :cond_c1

    .line 191
    .line 192
    goto/16 :goto_1d2

    .line 193
    .line 194
    :cond_c1
    const/16 v2, 0x15

    .line 195
    .line 196
    goto/16 :goto_1d2

    .line 197
    .line 198
    :sswitch_c5
    const-string v3, "V_THEORA"

    .line 199
    .line 200
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    if-nez p0, :cond_cf

    .line 205
    .line 206
    goto/16 :goto_1d2

    .line 207
    .line 208
    :cond_cf
    const/16 v2, 0x14

    .line 209
    .line 210
    goto/16 :goto_1d2

    .line 211
    .line 212
    :sswitch_d3
    const-string v3, "S_HDMV/PGS"

    .line 213
    .line 214
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result p0

    .line 218
    if-nez p0, :cond_dd

    .line 219
    .line 220
    goto/16 :goto_1d2

    .line 221
    .line 222
    :cond_dd
    const/16 v2, 0x13

    .line 223
    .line 224
    goto/16 :goto_1d2

    .line 225
    .line 226
    :sswitch_e1
    const-string v3, "V_VP9"

    .line 227
    .line 228
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result p0

    .line 232
    if-nez p0, :cond_eb

    .line 233
    .line 234
    goto/16 :goto_1d2

    .line 235
    .line 236
    :cond_eb
    const/16 v2, 0x12

    .line 237
    .line 238
    goto/16 :goto_1d2

    .line 239
    .line 240
    :sswitch_ef
    const-string v3, "V_VP8"

    .line 241
    .line 242
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    if-nez p0, :cond_f9

    .line 247
    .line 248
    goto/16 :goto_1d2

    .line 249
    .line 250
    :cond_f9
    const/16 v2, 0x11

    .line 251
    .line 252
    goto/16 :goto_1d2

    .line 253
    .line 254
    :sswitch_fd
    const-string v3, "V_AV1"

    .line 255
    .line 256
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result p0

    .line 260
    if-nez p0, :cond_107

    .line 261
    .line 262
    goto/16 :goto_1d2

    .line 263
    .line 264
    :cond_107
    const/16 v2, 0x10

    .line 265
    .line 266
    goto/16 :goto_1d2

    .line 267
    .line 268
    :sswitch_10b
    const-string v3, "A_DTS"

    .line 269
    .line 270
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result p0

    .line 274
    if-nez p0, :cond_115

    .line 275
    .line 276
    goto/16 :goto_1d2

    .line 277
    .line 278
    :cond_115
    const/16 v2, 0xf

    .line 279
    .line 280
    goto/16 :goto_1d2

    .line 281
    .line 282
    :sswitch_119
    const-string v3, "A_AC3"

    .line 283
    .line 284
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result p0

    .line 288
    if-nez p0, :cond_123

    .line 289
    .line 290
    goto/16 :goto_1d2

    .line 291
    .line 292
    :cond_123
    const/16 v2, 0xe

    .line 293
    .line 294
    goto/16 :goto_1d2

    .line 295
    .line 296
    :sswitch_127
    const-string v3, "A_AAC"

    .line 297
    .line 298
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result p0

    .line 302
    if-nez p0, :cond_131

    .line 303
    .line 304
    goto/16 :goto_1d2

    .line 305
    .line 306
    :cond_131
    const/16 v2, 0xd

    .line 307
    .line 308
    goto/16 :goto_1d2

    .line 309
    .line 310
    :sswitch_135
    const-string v3, "A_DTS/LOSSLESS"

    .line 311
    .line 312
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result p0

    .line 316
    if-nez p0, :cond_13f

    .line 317
    .line 318
    goto/16 :goto_1d2

    .line 319
    .line 320
    :cond_13f
    const/16 v2, 0xc

    .line 321
    .line 322
    goto/16 :goto_1d2

    .line 323
    .line 324
    :sswitch_143
    const-string v3, "S_VOBSUB"

    .line 325
    .line 326
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result p0

    .line 330
    if-nez p0, :cond_14d

    .line 331
    .line 332
    goto/16 :goto_1d2

    .line 333
    .line 334
    :cond_14d
    const/16 v2, 0xb

    .line 335
    .line 336
    goto/16 :goto_1d2

    .line 337
    .line 338
    :sswitch_151
    const-string v3, "V_MPEG4/ISO/AVC"

    .line 339
    .line 340
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result p0

    .line 344
    if-nez p0, :cond_15b

    .line 345
    .line 346
    goto/16 :goto_1d2

    .line 347
    .line 348
    :cond_15b
    const/16 v2, 0xa

    .line 349
    .line 350
    goto/16 :goto_1d2

    .line 351
    .line 352
    :sswitch_15f
    const-string v3, "V_MPEG4/ISO/ASP"

    .line 353
    .line 354
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result p0

    .line 358
    if-nez p0, :cond_169

    .line 359
    .line 360
    goto/16 :goto_1d2

    .line 361
    .line 362
    :cond_169
    const/16 v2, 0x9

    .line 363
    .line 364
    goto/16 :goto_1d2

    .line 365
    .line 366
    :sswitch_16d
    const-string v3, "S_DVBSUB"

    .line 367
    .line 368
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result p0

    .line 372
    if-nez p0, :cond_177

    .line 373
    .line 374
    goto/16 :goto_1d2

    .line 375
    .line 376
    :cond_177
    const/16 v2, 0x8

    .line 377
    .line 378
    goto/16 :goto_1d2

    .line 379
    .line 380
    :sswitch_17b
    const-string v3, "V_MS/VFW/FOURCC"

    .line 381
    .line 382
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result p0

    .line 386
    if-nez p0, :cond_184

    .line 387
    .line 388
    goto :goto_1d2

    .line 389
    :cond_184
    const/4 v2, 0x7

    .line 390
    goto :goto_1d2

    .line 391
    :sswitch_186
    const-string v3, "A_MPEG/L3"

    .line 392
    .line 393
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result p0

    .line 397
    if-nez p0, :cond_18f

    .line 398
    .line 399
    goto :goto_1d2

    .line 400
    :cond_18f
    const/4 v2, 0x6

    .line 401
    goto :goto_1d2

    .line 402
    :sswitch_191
    const-string v3, "A_MPEG/L2"

    .line 403
    .line 404
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result p0

    .line 408
    if-nez p0, :cond_19a

    .line 409
    .line 410
    goto :goto_1d2

    .line 411
    :cond_19a
    const/4 v2, 0x5

    .line 412
    goto :goto_1d2

    .line 413
    :sswitch_19c
    const-string v3, "A_VORBIS"

    .line 414
    .line 415
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result p0

    .line 419
    if-nez p0, :cond_1a5

    .line 420
    .line 421
    goto :goto_1d2

    .line 422
    :cond_1a5
    const/4 v2, 0x4

    .line 423
    goto :goto_1d2

    .line 424
    :sswitch_1a7
    const-string v3, "A_TRUEHD"

    .line 425
    .line 426
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result p0

    .line 430
    if-nez p0, :cond_1b0

    .line 431
    .line 432
    goto :goto_1d2

    .line 433
    :cond_1b0
    const/4 v2, 0x3

    .line 434
    goto :goto_1d2

    .line 435
    :sswitch_1b2
    const-string v3, "A_MS/ACM"

    .line 436
    .line 437
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result p0

    .line 441
    if-nez p0, :cond_1bb

    .line 442
    .line 443
    goto :goto_1d2

    .line 444
    :cond_1bb
    const/4 v2, 0x2

    .line 445
    goto :goto_1d2

    .line 446
    :sswitch_1bd
    const-string v3, "V_MPEG4/ISO/SP"

    .line 447
    .line 448
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result p0

    .line 452
    if-nez p0, :cond_1c6

    .line 453
    .line 454
    goto :goto_1d2

    .line 455
    :cond_1c6
    const/4 v2, 0x1

    .line 456
    goto :goto_1d2

    .line 457
    :sswitch_1c8
    const-string v3, "V_MPEG4/ISO/AP"

    .line 458
    .line 459
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result p0

    .line 463
    if-nez p0, :cond_1d1

    .line 464
    .line 465
    goto :goto_1d2

    .line 466
    :cond_1d1
    const/4 v2, 0x0

    .line 467
    :goto_1d2
    packed-switch v2, :pswitch_data_262

    .line 468
    .line 469
    .line 470
    return v1

    .line 471
    :pswitch_1d6
    return v0

    .line 472
    nop

    .line 473
    :sswitch_data_1d8
    .sparse-switch
        -0x7ce7f5de -> :sswitch_1c8
        -0x7ce7f3b0 -> :sswitch_1bd
        -0x76567dc0 -> :sswitch_1b2
        -0x6a615338 -> :sswitch_1a7
        -0x672350af -> :sswitch_19c
        -0x585f4fce -> :sswitch_191
        -0x585f4fcd -> :sswitch_186
        -0x51dc40b2 -> :sswitch_17b
        -0x37a9c464 -> :sswitch_16d
        -0x2016c535 -> :sswitch_15f
        -0x2016c4e5 -> :sswitch_151
        -0x19552dbd -> :sswitch_143
        -0x1538b2ba -> :sswitch_135
        0x3c02325 -> :sswitch_127
        0x3c02353 -> :sswitch_119
        0x3c030c5 -> :sswitch_10b
        0x4e81333 -> :sswitch_fd
        0x4e86155 -> :sswitch_ef
        0x4e86156 -> :sswitch_e1
        0x5e8da3e -> :sswitch_d3
        0x1a8350d6 -> :sswitch_c5
        0x2056f406 -> :sswitch_b7
        0x25e26ee2 -> :sswitch_a9
        0x2b45174d -> :sswitch_9b
        0x2b453ce4 -> :sswitch_8d
        0x2c0618eb -> :sswitch_7f
        0x2c065c6b -> :sswitch_71
        0x32fdf009 -> :sswitch_63
        0x3e4ca2d8 -> :sswitch_55
        0x54c61e47 -> :sswitch_47
        0x6bd6c624 -> :sswitch_39
        0x7446132a -> :sswitch_2b
        0x7446b0a6 -> :sswitch_1d
        0x744ad97d -> :sswitch_f
    .end sparse-switch

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
    :pswitch_data_262
    .packed-switch 0x0
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
        :pswitch_1d6
    .end packed-switch
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

.method private D(Lax/q1/M;J)Z
    .registers 9

    .line 1
    iget-boolean v0, p0, Lax/I1/e;->B:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_f

    .line 6
    .line 7
    iput-wide p2, p0, Lax/I1/e;->D:J

    .line 8
    .line 9
    iget-wide p2, p0, Lax/I1/e;->C:J

    .line 10
    .line 11
    iput-wide p2, p1, Lax/q1/M;->a:J

    .line 12
    .line 13
    iput-boolean v2, p0, Lax/I1/e;->B:Z

    .line 14
    .line 15
    return v1

    .line 16
    :cond_f
    iget-boolean p2, p0, Lax/I1/e;->y:Z

    .line 17
    .line 18
    if-eqz p2, :cond_20

    .line 19
    .line 20
    iget-wide p2, p0, Lax/I1/e;->D:J

    .line 21
    .line 22
    const-wide/16 v3, -0x1

    .line 23
    .line 24
    cmp-long v0, p2, v3

    .line 25
    .line 26
    if-eqz v0, :cond_20

    .line 27
    .line 28
    iput-wide p2, p1, Lax/q1/M;->a:J

    .line 29
    .line 30
    iput-wide v3, p0, Lax/I1/e;->D:J

    .line 31
    .line 32
    return v1

    .line 33
    :cond_20
    return v2
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private E(Lax/q1/s;I)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/S0/G;->j()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lt v0, p2, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget-object v0, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 11
    .line 12
    invoke-virtual {v0}, Lax/S0/G;->b()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ge v0, p2, :cond_20

    .line 17
    .line 18
    iget-object v0, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 19
    .line 20
    invoke-virtual {v0}, Lax/S0/G;->b()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    mul-int/lit8 v1, v1, 0x2

    .line 25
    .line 26
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v0, v1}, Lax/S0/G;->d(I)V

    .line 31
    .line 32
    .line 33
    :cond_20
    iget-object v0, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 34
    .line 35
    invoke-virtual {v0}, Lax/S0/G;->f()[B

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v1, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 40
    .line 41
    invoke-virtual {v1}, Lax/S0/G;->j()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iget-object v2, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 46
    .line 47
    invoke-virtual {v2}, Lax/S0/G;->j()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    sub-int v2, p2, v2

    .line 52
    .line 53
    invoke-interface {p1, v0, v1, v2}, Lax/q1/s;->readFully([BII)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Lax/S0/G;->a0(I)V

    .line 59
    .line 60
    .line 61
    return-void
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
.end method

.method private F()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lax/I1/e;->V:I

    .line 3
    .line 4
    iput v0, p0, Lax/I1/e;->W:I

    .line 5
    .line 6
    iput v0, p0, Lax/I1/e;->X:I

    .line 7
    .line 8
    iput-boolean v0, p0, Lax/I1/e;->Y:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lax/I1/e;->Z:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lax/I1/e;->a0:Z

    .line 13
    .line 14
    iput v0, p0, Lax/I1/e;->b0:I

    .line 15
    .line 16
    iput-byte v0, p0, Lax/I1/e;->c0:B

    .line 17
    .line 18
    iput-boolean v0, p0, Lax/I1/e;->d0:Z

    .line 19
    .line 20
    iget-object v1, p0, Lax/I1/e;->l:Lax/S0/G;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Lax/S0/G;->X(I)V

    .line 23
    .line 24
    .line 25
    return-void
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

.method private G(J)J
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    iget-wide v2, p0, Lax/I1/e;->t:J

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v2, v0

    .line 9
    .line 10
    if-eqz v4, :cond_13

    .line 11
    .line 12
    const-wide/16 v4, 0x3e8

    .line 13
    .line 14
    move-wide v0, p1

    .line 15
    invoke-static/range {v0 .. v5}, Lax/S0/d0;->p1(JJJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    return-wide p1

    .line 20
    :cond_13
    const-string p1, "Can\'t scale timecode prior to timecodeScale being set."

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-static {p1, p2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    throw p1
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

.method private static H(Ljava/lang/String;J[B)V
    .registers 9

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    const-wide/16 v1, 0x3e8

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    sparse-switch v4, :sswitch_data_64

    .line 13
    .line 14
    .line 15
    goto :goto_3a

    .line 16
    :sswitch_f
    const-string v4, "S_TEXT/UTF8"

    .line 17
    .line 18
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-nez p0, :cond_18

    .line 23
    .line 24
    goto :goto_3a

    .line 25
    :cond_18
    const/4 v3, 0x3

    .line 26
    goto :goto_3a

    .line 27
    :sswitch_1a
    const-string v4, "S_TEXT/WEBVTT"

    .line 28
    .line 29
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-nez p0, :cond_23

    .line 34
    .line 35
    goto :goto_3a

    .line 36
    :cond_23
    const/4 v3, 0x2

    .line 37
    goto :goto_3a

    .line 38
    :sswitch_25
    const-string v4, "S_TEXT/SSA"

    .line 39
    .line 40
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-nez p0, :cond_2e

    .line 45
    .line 46
    goto :goto_3a

    .line 47
    :cond_2e
    const/4 v3, 0x1

    .line 48
    goto :goto_3a

    .line 49
    :sswitch_30
    const-string v4, "S_TEXT/ASS"

    .line 50
    .line 51
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_39

    .line 56
    .line 57
    goto :goto_3a

    .line 58
    :cond_39
    const/4 v3, 0x0

    .line 59
    :goto_3a
    packed-switch v3, :pswitch_data_76

    .line 60
    .line 61
    .line 62
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 63
    .line 64
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 65
    .line 66
    .line 67
    throw p0

    .line 68
    :pswitch_43
    const-string p0, "%02d:%02d:%02d,%03d"

    .line 69
    .line 70
    invoke-static {p1, p2, p0, v1, v2}, Lax/I1/e;->v(JLjava/lang/String;J)[B

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const/16 p1, 0x13

    .line 75
    .line 76
    goto :goto_5f

    .line 77
    :pswitch_4c
    const-string p0, "%02d:%02d:%02d.%03d"

    .line 78
    .line 79
    invoke-static {p1, p2, p0, v1, v2}, Lax/I1/e;->v(JLjava/lang/String;J)[B

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const/16 p1, 0x19

    .line 84
    .line 85
    goto :goto_5f

    .line 86
    :pswitch_55
    const-string p0, "%01d:%02d:%02d:%02d"

    .line 87
    .line 88
    const-wide/16 v1, 0x2710

    .line 89
    .line 90
    invoke-static {p1, p2, p0, v1, v2}, Lax/I1/e;->v(JLjava/lang/String;J)[B

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    const/16 p1, 0x15

    .line 95
    .line 96
    :goto_5f
    array-length p2, p0

    .line 97
    invoke-static {p0, v0, p3, p1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :sswitch_data_64
    .sparse-switch
        0x2c0618eb -> :sswitch_30
        0x2c065c6b -> :sswitch_25
        0x3e4ca2d8 -> :sswitch_1a
        0x54c61e47 -> :sswitch_f
    .end sparse-switch

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
    :pswitch_data_76
    .packed-switch 0x0
        :pswitch_55
        :pswitch_55
        :pswitch_4c
        :pswitch_43
    .end packed-switch
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

.method private K(Lax/q1/s;Lax/I1/e$c;IZ)I
    .registers 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p2, Lax/I1/e$c;->c:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "S_TEXT/UTF8"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_14

    .line 10
    .line 11
    sget-object p2, Lax/I1/e;->g0:[B

    .line 12
    .line 13
    invoke-direct {p0, p1, p2, p3}, Lax/I1/e;->L(Lax/q1/s;[BI)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lax/I1/e;->t()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_14
    const-string v0, "S_TEXT/ASS"

    .line 22
    .line 23
    iget-object v1, p2, Lax/I1/e$c;->c:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2ac

    .line 30
    .line 31
    const-string v0, "S_TEXT/SSA"

    .line 32
    .line 33
    iget-object v1, p2, Lax/I1/e$c;->c:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2a

    .line 40
    .line 41
    goto/16 :goto_2ac

    .line 42
    .line 43
    :cond_2a
    const-string v0, "S_TEXT/WEBVTT"

    .line 44
    .line 45
    iget-object v1, p2, Lax/I1/e$c;->c:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3e

    .line 52
    .line 53
    sget-object p2, Lax/I1/e;->j0:[B

    .line 54
    .line 55
    invoke-direct {p0, p1, p2, p3}, Lax/I1/e;->L(Lax/q1/s;[BI)V

    .line 56
    .line 57
    .line 58
    invoke-direct {p0}, Lax/I1/e;->t()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    return p1

    .line 63
    :cond_3e
    iget-object v0, p2, Lax/I1/e$c;->Z:Lax/q1/U;

    .line 64
    .line 65
    iget-boolean v1, p0, Lax/I1/e;->Y:Z

    .line 66
    .line 67
    const/4 v2, 0x4

    .line 68
    const/4 v3, 0x2

    .line 69
    const/4 v4, 0x1

    .line 70
    const/4 v5, 0x0

    .line 71
    if-nez v1, :cond_1f6

    .line 72
    .line 73
    iget-boolean v1, p2, Lax/I1/e$c;->i:Z

    .line 74
    .line 75
    if-eqz v1, :cond_18c

    .line 76
    .line 77
    iget v1, p0, Lax/I1/e;->R:I

    .line 78
    .line 79
    const v6, -0x40000001    # -1.9999999f

    .line 80
    .line 81
    .line 82
    and-int/2addr v1, v6

    .line 83
    iput v1, p0, Lax/I1/e;->R:I

    .line 84
    .line 85
    iget-boolean v1, p0, Lax/I1/e;->Z:Z

    .line 86
    .line 87
    const/16 v6, 0x80

    .line 88
    .line 89
    if-nez v1, :cond_88

    .line 90
    .line 91
    iget-object v1, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 92
    .line 93
    invoke-virtual {v1}, Lax/S0/G;->f()[B

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-interface {p1, v1, v5, v4}, Lax/q1/s;->readFully([BII)V

    .line 98
    .line 99
    .line 100
    iget v1, p0, Lax/I1/e;->V:I

    .line 101
    .line 102
    add-int/2addr v1, v4

    .line 103
    iput v1, p0, Lax/I1/e;->V:I

    .line 104
    .line 105
    iget-object v1, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 106
    .line 107
    invoke-virtual {v1}, Lax/S0/G;->f()[B

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    aget-byte v1, v1, v5

    .line 112
    .line 113
    and-int/2addr v1, v6

    .line 114
    if-eq v1, v6, :cond_80

    .line 115
    .line 116
    iget-object v1, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 117
    .line 118
    invoke-virtual {v1}, Lax/S0/G;->f()[B

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    aget-byte v1, v1, v5

    .line 123
    .line 124
    iput-byte v1, p0, Lax/I1/e;->c0:B

    .line 125
    .line 126
    iput-boolean v4, p0, Lax/I1/e;->Z:Z

    .line 127
    .line 128
    goto :goto_88

    .line 129
    :cond_80
    const-string p1, "Extension bit is set in signal byte"

    .line 130
    .line 131
    const/4 p2, 0x0

    .line 132
    invoke-static {p1, p2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    throw p1

    .line 137
    :cond_88
    :goto_88
    iget-byte v1, p0, Lax/I1/e;->c0:B

    .line 138
    .line 139
    and-int/lit8 v7, v1, 0x1

    .line 140
    .line 141
    if-ne v7, v4, :cond_196

    .line 142
    .line 143
    and-int/2addr v1, v3

    .line 144
    if-ne v1, v3, :cond_93

    .line 145
    .line 146
    const/4 v1, 0x1

    .line 147
    goto :goto_94

    .line 148
    :cond_93
    const/4 v1, 0x0

    .line 149
    :goto_94
    iget v7, p0, Lax/I1/e;->R:I

    .line 150
    .line 151
    const/high16 v8, 0x40000000    # 2.0f

    .line 152
    .line 153
    or-int/2addr v7, v8

    .line 154
    iput v7, p0, Lax/I1/e;->R:I

    .line 155
    .line 156
    iget-boolean v7, p0, Lax/I1/e;->d0:Z

    .line 157
    .line 158
    if-nez v7, :cond_dd

    .line 159
    .line 160
    iget-object v7, p0, Lax/I1/e;->n:Lax/S0/G;

    .line 161
    .line 162
    invoke-virtual {v7}, Lax/S0/G;->f()[B

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    const/16 v8, 0x8

    .line 167
    .line 168
    invoke-interface {p1, v7, v5, v8}, Lax/q1/s;->readFully([BII)V

    .line 169
    .line 170
    .line 171
    iget v7, p0, Lax/I1/e;->V:I

    .line 172
    .line 173
    add-int/2addr v7, v8

    .line 174
    iput v7, p0, Lax/I1/e;->V:I

    .line 175
    .line 176
    iput-boolean v4, p0, Lax/I1/e;->d0:Z

    .line 177
    .line 178
    iget-object v7, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 179
    .line 180
    invoke-virtual {v7}, Lax/S0/G;->f()[B

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    if-eqz v1, :cond_ba

    .line 185
    .line 186
    goto :goto_bb

    .line 187
    :cond_ba
    const/4 v6, 0x0

    .line 188
    :goto_bb
    or-int/2addr v6, v8

    .line 189
    int-to-byte v6, v6

    .line 190
    aput-byte v6, v7, v5

    .line 191
    .line 192
    iget-object v6, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 193
    .line 194
    invoke-virtual {v6, v5}, Lax/S0/G;->b0(I)V

    .line 195
    .line 196
    .line 197
    iget-object v6, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 198
    .line 199
    invoke-interface {v0, v6, v4, v4}, Lax/q1/U;->b(Lax/S0/G;II)V

    .line 200
    .line 201
    .line 202
    iget v6, p0, Lax/I1/e;->W:I

    .line 203
    .line 204
    add-int/2addr v6, v4

    .line 205
    iput v6, p0, Lax/I1/e;->W:I

    .line 206
    .line 207
    iget-object v6, p0, Lax/I1/e;->n:Lax/S0/G;

    .line 208
    .line 209
    invoke-virtual {v6, v5}, Lax/S0/G;->b0(I)V

    .line 210
    .line 211
    .line 212
    iget-object v6, p0, Lax/I1/e;->n:Lax/S0/G;

    .line 213
    .line 214
    invoke-interface {v0, v6, v8, v4}, Lax/q1/U;->b(Lax/S0/G;II)V

    .line 215
    .line 216
    .line 217
    iget v6, p0, Lax/I1/e;->W:I

    .line 218
    .line 219
    add-int/2addr v6, v8

    .line 220
    iput v6, p0, Lax/I1/e;->W:I

    .line 221
    .line 222
    :cond_dd
    if-eqz v1, :cond_196

    .line 223
    .line 224
    iget-boolean v1, p0, Lax/I1/e;->a0:Z

    .line 225
    .line 226
    if-nez v1, :cond_100

    .line 227
    .line 228
    iget-object v1, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 229
    .line 230
    invoke-virtual {v1}, Lax/S0/G;->f()[B

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-interface {p1, v1, v5, v4}, Lax/q1/s;->readFully([BII)V

    .line 235
    .line 236
    .line 237
    iget v1, p0, Lax/I1/e;->V:I

    .line 238
    .line 239
    add-int/2addr v1, v4

    .line 240
    iput v1, p0, Lax/I1/e;->V:I

    .line 241
    .line 242
    iget-object v1, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 243
    .line 244
    invoke-virtual {v1, v5}, Lax/S0/G;->b0(I)V

    .line 245
    .line 246
    .line 247
    iget-object v1, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 248
    .line 249
    invoke-virtual {v1}, Lax/S0/G;->M()I

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    iput v1, p0, Lax/I1/e;->b0:I

    .line 254
    .line 255
    iput-boolean v4, p0, Lax/I1/e;->a0:Z

    .line 256
    .line 257
    :cond_100
    iget v1, p0, Lax/I1/e;->b0:I

    .line 258
    .line 259
    mul-int/lit8 v1, v1, 0x4

    .line 260
    .line 261
    iget-object v6, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 262
    .line 263
    invoke-virtual {v6, v1}, Lax/S0/G;->X(I)V

    .line 264
    .line 265
    .line 266
    iget-object v6, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 267
    .line 268
    invoke-virtual {v6}, Lax/S0/G;->f()[B

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    invoke-interface {p1, v6, v5, v1}, Lax/q1/s;->readFully([BII)V

    .line 273
    .line 274
    .line 275
    iget v6, p0, Lax/I1/e;->V:I

    .line 276
    .line 277
    add-int/2addr v6, v1

    .line 278
    iput v6, p0, Lax/I1/e;->V:I

    .line 279
    .line 280
    iget v1, p0, Lax/I1/e;->b0:I

    .line 281
    .line 282
    div-int/2addr v1, v3

    .line 283
    add-int/2addr v1, v4

    .line 284
    int-to-short v1, v1

    .line 285
    mul-int/lit8 v6, v1, 0x6

    .line 286
    .line 287
    add-int/2addr v6, v3

    .line 288
    iget-object v7, p0, Lax/I1/e;->q:Ljava/nio/ByteBuffer;

    .line 289
    .line 290
    if-eqz v7, :cond_129

    .line 291
    .line 292
    invoke-virtual {v7}, Ljava/nio/Buffer;->capacity()I

    .line 293
    .line 294
    .line 295
    move-result v7

    .line 296
    if-ge v7, v6, :cond_12f

    .line 297
    .line 298
    :cond_129
    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    iput-object v7, p0, Lax/I1/e;->q:Ljava/nio/ByteBuffer;

    .line 303
    .line 304
    :cond_12f
    iget-object v7, p0, Lax/I1/e;->q:Ljava/nio/ByteBuffer;

    .line 305
    .line 306
    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 307
    .line 308
    .line 309
    iget-object v7, p0, Lax/I1/e;->q:Ljava/nio/ByteBuffer;

    .line 310
    .line 311
    invoke-virtual {v7, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 312
    .line 313
    .line 314
    const/4 v1, 0x0

    .line 315
    const/4 v7, 0x0

    .line 316
    :goto_13b
    iget v8, p0, Lax/I1/e;->b0:I

    .line 317
    .line 318
    if-ge v1, v8, :cond_15d

    .line 319
    .line 320
    iget-object v8, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 321
    .line 322
    invoke-virtual {v8}, Lax/S0/G;->Q()I

    .line 323
    .line 324
    .line 325
    move-result v8

    .line 326
    rem-int/lit8 v9, v1, 0x2

    .line 327
    .line 328
    if-nez v9, :cond_152

    .line 329
    .line 330
    iget-object v9, p0, Lax/I1/e;->q:Ljava/nio/ByteBuffer;

    .line 331
    .line 332
    sub-int v7, v8, v7

    .line 333
    .line 334
    int-to-short v7, v7

    .line 335
    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 336
    .line 337
    .line 338
    goto :goto_159

    .line 339
    :cond_152
    iget-object v9, p0, Lax/I1/e;->q:Ljava/nio/ByteBuffer;

    .line 340
    .line 341
    sub-int v7, v8, v7

    .line 342
    .line 343
    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 344
    .line 345
    .line 346
    :goto_159
    add-int/lit8 v1, v1, 0x1

    .line 347
    .line 348
    move v7, v8

    .line 349
    goto :goto_13b

    .line 350
    :cond_15d
    iget v1, p0, Lax/I1/e;->V:I

    .line 351
    .line 352
    sub-int v1, p3, v1

    .line 353
    .line 354
    sub-int/2addr v1, v7

    .line 355
    rem-int/2addr v8, v3

    .line 356
    if-ne v8, v4, :cond_16b

    .line 357
    .line 358
    iget-object v7, p0, Lax/I1/e;->q:Ljava/nio/ByteBuffer;

    .line 359
    .line 360
    invoke-virtual {v7, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 361
    .line 362
    .line 363
    goto :goto_176

    .line 364
    :cond_16b
    iget-object v7, p0, Lax/I1/e;->q:Ljava/nio/ByteBuffer;

    .line 365
    .line 366
    int-to-short v1, v1

    .line 367
    invoke-virtual {v7, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 368
    .line 369
    .line 370
    iget-object v1, p0, Lax/I1/e;->q:Ljava/nio/ByteBuffer;

    .line 371
    .line 372
    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 373
    .line 374
    .line 375
    :goto_176
    iget-object v1, p0, Lax/I1/e;->o:Lax/S0/G;

    .line 376
    .line 377
    iget-object v7, p0, Lax/I1/e;->q:Ljava/nio/ByteBuffer;

    .line 378
    .line 379
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->array()[B

    .line 380
    .line 381
    .line 382
    move-result-object v7

    .line 383
    invoke-virtual {v1, v7, v6}, Lax/S0/G;->Z([BI)V

    .line 384
    .line 385
    .line 386
    iget-object v1, p0, Lax/I1/e;->o:Lax/S0/G;

    .line 387
    .line 388
    invoke-interface {v0, v1, v6, v4}, Lax/q1/U;->b(Lax/S0/G;II)V

    .line 389
    .line 390
    .line 391
    iget v1, p0, Lax/I1/e;->W:I

    .line 392
    .line 393
    add-int/2addr v1, v6

    .line 394
    iput v1, p0, Lax/I1/e;->W:I

    .line 395
    .line 396
    goto :goto_196

    .line 397
    :cond_18c
    iget-object v1, p2, Lax/I1/e$c;->j:[B

    .line 398
    .line 399
    if-eqz v1, :cond_196

    .line 400
    .line 401
    iget-object v6, p0, Lax/I1/e;->l:Lax/S0/G;

    .line 402
    .line 403
    array-length v7, v1

    .line 404
    invoke-virtual {v6, v1, v7}, Lax/S0/G;->Z([BI)V

    .line 405
    .line 406
    .line 407
    :cond_196
    :goto_196
    invoke-static {p2, p4}, Lax/I1/e$c;->e(Lax/I1/e$c;Z)Z

    .line 408
    .line 409
    .line 410
    move-result p4

    .line 411
    if-eqz p4, :cond_1f4

    .line 412
    .line 413
    iget p4, p0, Lax/I1/e;->R:I

    .line 414
    .line 415
    const/high16 v1, 0x10000000

    .line 416
    .line 417
    or-int/2addr p4, v1

    .line 418
    iput p4, p0, Lax/I1/e;->R:I

    .line 419
    .line 420
    iget-object p4, p0, Lax/I1/e;->p:Lax/S0/G;

    .line 421
    .line 422
    invoke-virtual {p4, v5}, Lax/S0/G;->X(I)V

    .line 423
    .line 424
    .line 425
    iget-object p4, p0, Lax/I1/e;->l:Lax/S0/G;

    .line 426
    .line 427
    invoke-virtual {p4}, Lax/S0/G;->j()I

    .line 428
    .line 429
    .line 430
    move-result p4

    .line 431
    add-int/2addr p4, p3

    .line 432
    iget v1, p0, Lax/I1/e;->V:I

    .line 433
    .line 434
    sub-int/2addr p4, v1

    .line 435
    iget-object v1, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 436
    .line 437
    invoke-virtual {v1, v2}, Lax/S0/G;->X(I)V

    .line 438
    .line 439
    .line 440
    iget-object v1, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 441
    .line 442
    invoke-virtual {v1}, Lax/S0/G;->f()[B

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    shr-int/lit8 v6, p4, 0x18

    .line 447
    .line 448
    and-int/lit16 v6, v6, 0xff

    .line 449
    .line 450
    int-to-byte v6, v6

    .line 451
    aput-byte v6, v1, v5

    .line 452
    .line 453
    iget-object v1, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 454
    .line 455
    invoke-virtual {v1}, Lax/S0/G;->f()[B

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    shr-int/lit8 v6, p4, 0x10

    .line 460
    .line 461
    and-int/lit16 v6, v6, 0xff

    .line 462
    .line 463
    int-to-byte v6, v6

    .line 464
    aput-byte v6, v1, v4

    .line 465
    .line 466
    iget-object v1, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 467
    .line 468
    invoke-virtual {v1}, Lax/S0/G;->f()[B

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    shr-int/lit8 v6, p4, 0x8

    .line 473
    .line 474
    and-int/lit16 v6, v6, 0xff

    .line 475
    .line 476
    int-to-byte v6, v6

    .line 477
    aput-byte v6, v1, v3

    .line 478
    .line 479
    iget-object v1, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 480
    .line 481
    invoke-virtual {v1}, Lax/S0/G;->f()[B

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    and-int/lit16 p4, p4, 0xff

    .line 486
    .line 487
    int-to-byte p4, p4

    .line 488
    const/4 v6, 0x3

    .line 489
    aput-byte p4, v1, v6

    .line 490
    .line 491
    iget-object p4, p0, Lax/I1/e;->i:Lax/S0/G;

    .line 492
    .line 493
    invoke-interface {v0, p4, v2, v3}, Lax/q1/U;->b(Lax/S0/G;II)V

    .line 494
    .line 495
    .line 496
    iget p4, p0, Lax/I1/e;->W:I

    .line 497
    .line 498
    add-int/2addr p4, v2

    .line 499
    iput p4, p0, Lax/I1/e;->W:I

    .line 500
    .line 501
    :cond_1f4
    iput-boolean v4, p0, Lax/I1/e;->Y:Z

    .line 502
    .line 503
    :cond_1f6
    iget-object p4, p0, Lax/I1/e;->l:Lax/S0/G;

    .line 504
    .line 505
    invoke-virtual {p4}, Lax/S0/G;->j()I

    .line 506
    .line 507
    .line 508
    move-result p4

    .line 509
    add-int/2addr p3, p4

    .line 510
    const-string p4, "V_MPEG4/ISO/AVC"

    .line 511
    .line 512
    iget-object v1, p2, Lax/I1/e$c;->c:Ljava/lang/String;

    .line 513
    .line 514
    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-result p4

    .line 518
    if-nez p4, :cond_23d

    .line 519
    .line 520
    const-string p4, "V_MPEGH/ISO/HEVC"

    .line 521
    .line 522
    iget-object v1, p2, Lax/I1/e$c;->c:Ljava/lang/String;

    .line 523
    .line 524
    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result p4

    .line 528
    if-eqz p4, :cond_212

    .line 529
    .line 530
    goto :goto_23d

    .line 531
    :cond_212
    iget-object p4, p2, Lax/I1/e$c;->V:Lax/q1/V;

    .line 532
    .line 533
    if-eqz p4, :cond_228

    .line 534
    .line 535
    iget-object p4, p0, Lax/I1/e;->l:Lax/S0/G;

    .line 536
    .line 537
    invoke-virtual {p4}, Lax/S0/G;->j()I

    .line 538
    .line 539
    .line 540
    move-result p4

    .line 541
    if-nez p4, :cond_21f

    .line 542
    .line 543
    goto :goto_220

    .line 544
    :cond_21f
    const/4 v4, 0x0

    .line 545
    :goto_220
    invoke-static {v4}, Lax/S0/a;->g(Z)V

    .line 546
    .line 547
    .line 548
    iget-object p4, p2, Lax/I1/e$c;->V:Lax/q1/V;

    .line 549
    .line 550
    invoke-virtual {p4, p1}, Lax/q1/V;->d(Lax/q1/s;)V

    .line 551
    .line 552
    .line 553
    :cond_228
    :goto_228
    iget p4, p0, Lax/I1/e;->V:I

    .line 554
    .line 555
    if-ge p4, p3, :cond_28e

    .line 556
    .line 557
    sub-int p4, p3, p4

    .line 558
    .line 559
    invoke-direct {p0, p1, v0, p4}, Lax/I1/e;->M(Lax/q1/s;Lax/q1/U;I)I

    .line 560
    .line 561
    .line 562
    move-result p4

    .line 563
    iget v1, p0, Lax/I1/e;->V:I

    .line 564
    .line 565
    add-int/2addr v1, p4

    .line 566
    iput v1, p0, Lax/I1/e;->V:I

    .line 567
    .line 568
    iget v1, p0, Lax/I1/e;->W:I

    .line 569
    .line 570
    add-int/2addr v1, p4

    .line 571
    iput v1, p0, Lax/I1/e;->W:I

    .line 572
    .line 573
    goto :goto_228

    .line 574
    :cond_23d
    :goto_23d
    iget-object p4, p0, Lax/I1/e;->h:Lax/S0/G;

    .line 575
    .line 576
    invoke-virtual {p4}, Lax/S0/G;->f()[B

    .line 577
    .line 578
    .line 579
    move-result-object p4

    .line 580
    aput-byte v5, p4, v5

    .line 581
    .line 582
    aput-byte v5, p4, v4

    .line 583
    .line 584
    aput-byte v5, p4, v3

    .line 585
    .line 586
    iget v1, p2, Lax/I1/e$c;->a0:I

    .line 587
    .line 588
    rsub-int/lit8 v3, v1, 0x4

    .line 589
    .line 590
    :goto_24d
    iget v4, p0, Lax/I1/e;->V:I

    .line 591
    .line 592
    if-ge v4, p3, :cond_28e

    .line 593
    .line 594
    iget v4, p0, Lax/I1/e;->X:I

    .line 595
    .line 596
    if-nez v4, :cond_27a

    .line 597
    .line 598
    invoke-direct {p0, p1, p4, v3, v1}, Lax/I1/e;->N(Lax/q1/s;[BII)V

    .line 599
    .line 600
    .line 601
    iget v4, p0, Lax/I1/e;->V:I

    .line 602
    .line 603
    add-int/2addr v4, v1

    .line 604
    iput v4, p0, Lax/I1/e;->V:I

    .line 605
    .line 606
    iget-object v4, p0, Lax/I1/e;->h:Lax/S0/G;

    .line 607
    .line 608
    invoke-virtual {v4, v5}, Lax/S0/G;->b0(I)V

    .line 609
    .line 610
    .line 611
    iget-object v4, p0, Lax/I1/e;->h:Lax/S0/G;

    .line 612
    .line 613
    invoke-virtual {v4}, Lax/S0/G;->Q()I

    .line 614
    .line 615
    .line 616
    move-result v4

    .line 617
    iput v4, p0, Lax/I1/e;->X:I

    .line 618
    .line 619
    iget-object v4, p0, Lax/I1/e;->g:Lax/S0/G;

    .line 620
    .line 621
    invoke-virtual {v4, v5}, Lax/S0/G;->b0(I)V

    .line 622
    .line 623
    .line 624
    iget-object v4, p0, Lax/I1/e;->g:Lax/S0/G;

    .line 625
    .line 626
    invoke-interface {v0, v4, v2}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 627
    .line 628
    .line 629
    iget v4, p0, Lax/I1/e;->W:I

    .line 630
    .line 631
    add-int/2addr v4, v2

    .line 632
    iput v4, p0, Lax/I1/e;->W:I

    .line 633
    .line 634
    goto :goto_24d

    .line 635
    :cond_27a
    invoke-direct {p0, p1, v0, v4}, Lax/I1/e;->M(Lax/q1/s;Lax/q1/U;I)I

    .line 636
    .line 637
    .line 638
    move-result v4

    .line 639
    iget v6, p0, Lax/I1/e;->V:I

    .line 640
    .line 641
    add-int/2addr v6, v4

    .line 642
    iput v6, p0, Lax/I1/e;->V:I

    .line 643
    .line 644
    iget v6, p0, Lax/I1/e;->W:I

    .line 645
    .line 646
    add-int/2addr v6, v4

    .line 647
    iput v6, p0, Lax/I1/e;->W:I

    .line 648
    .line 649
    iget v6, p0, Lax/I1/e;->X:I

    .line 650
    .line 651
    sub-int/2addr v6, v4

    .line 652
    iput v6, p0, Lax/I1/e;->X:I

    .line 653
    .line 654
    goto :goto_24d

    .line 655
    :cond_28e
    const-string p1, "A_VORBIS"

    .line 656
    .line 657
    iget-object p2, p2, Lax/I1/e$c;->c:Ljava/lang/String;

    .line 658
    .line 659
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    move-result p1

    .line 663
    if-eqz p1, :cond_2a7

    .line 664
    .line 665
    iget-object p1, p0, Lax/I1/e;->j:Lax/S0/G;

    .line 666
    .line 667
    invoke-virtual {p1, v5}, Lax/S0/G;->b0(I)V

    .line 668
    .line 669
    .line 670
    iget-object p1, p0, Lax/I1/e;->j:Lax/S0/G;

    .line 671
    .line 672
    invoke-interface {v0, p1, v2}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 673
    .line 674
    .line 675
    iget p1, p0, Lax/I1/e;->W:I

    .line 676
    .line 677
    add-int/2addr p1, v2

    .line 678
    iput p1, p0, Lax/I1/e;->W:I

    .line 679
    .line 680
    :cond_2a7
    invoke-direct {p0}, Lax/I1/e;->t()I

    .line 681
    .line 682
    .line 683
    move-result p1

    .line 684
    return p1

    .line 685
    :cond_2ac
    :goto_2ac
    sget-object p2, Lax/I1/e;->i0:[B

    .line 686
    .line 687
    invoke-direct {p0, p1, p2, p3}, Lax/I1/e;->L(Lax/q1/s;[BI)V

    .line 688
    .line 689
    .line 690
    invoke-direct {p0}, Lax/I1/e;->t()I

    .line 691
    .line 692
    .line 693
    move-result p1

    .line 694
    return p1
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
.end method

.method private L(Lax/q1/s;[BI)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    array-length v0, p2

    .line 2
    add-int/2addr v0, p3

    .line 3
    iget-object v1, p0, Lax/I1/e;->m:Lax/S0/G;

    .line 4
    .line 5
    invoke-virtual {v1}, Lax/S0/G;->b()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-ge v1, v0, :cond_17

    .line 11
    .line 12
    iget-object v1, p0, Lax/I1/e;->m:Lax/S0/G;

    .line 13
    .line 14
    add-int v3, v0, p3

    .line 15
    .line 16
    invoke-static {p2, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v1, v3}, Lax/S0/G;->Y([B)V

    .line 21
    .line 22
    .line 23
    goto :goto_21

    .line 24
    :cond_17
    iget-object v1, p0, Lax/I1/e;->m:Lax/S0/G;

    .line 25
    .line 26
    invoke-virtual {v1}, Lax/S0/G;->f()[B

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    array-length v3, p2

    .line 31
    invoke-static {p2, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    .line 33
    .line 34
    :goto_21
    iget-object v1, p0, Lax/I1/e;->m:Lax/S0/G;

    .line 35
    .line 36
    invoke-virtual {v1}, Lax/S0/G;->f()[B

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    array-length p2, p2

    .line 41
    invoke-interface {p1, v1, p2, p3}, Lax/q1/s;->readFully([BII)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lax/I1/e;->m:Lax/S0/G;

    .line 45
    .line 46
    invoke-virtual {p1, v2}, Lax/S0/G;->b0(I)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lax/I1/e;->m:Lax/S0/G;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Lax/S0/G;->a0(I)V

    .line 52
    .line 53
    .line 54
    return-void
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

.method private M(Lax/q1/s;Lax/q1/U;I)I
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/I1/e;->l:Lax/S0/G;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/S0/G;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lez v0, :cond_12

    .line 8
    .line 9
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iget-object p3, p0, Lax/I1/e;->l:Lax/S0/G;

    .line 14
    .line 15
    invoke-interface {p2, p3, p1}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 16
    .line 17
    .line 18
    return p1

    .line 19
    :cond_12
    const/4 v0, 0x0

    .line 20
    invoke-interface {p2, p1, p3, v0}, Lax/q1/U;->a(Lax/P0/k;IZ)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
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

.method private N(Lax/q1/s;[BII)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/I1/e;->l:Lax/S0/G;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/S0/G;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    add-int v1, p3, v0

    .line 12
    .line 13
    sub-int/2addr p4, v0

    .line 14
    invoke-interface {p1, p2, v1, p4}, Lax/q1/s;->readFully([BII)V

    .line 15
    .line 16
    .line 17
    if-lez v0, :cond_17

    .line 18
    .line 19
    iget-object p1, p0, Lax/I1/e;->l:Lax/S0/G;

    .line 20
    .line 21
    invoke-virtual {p1, p2, p3, v0}, Lax/S0/G;->q([BII)V

    .line 22
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

.method public static synthetic g()[Lax/q1/r;
    .registers 3

    .line 1
    new-instance v0, Lax/I1/e;

    .line 2
    .line 3
    sget-object v1, Lax/N1/t$a;->a:Lax/N1/t$a;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v0, v1, v2}, Lax/I1/e;-><init>(Lax/N1/t$a;I)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    new-array v1, v1, [Lax/q1/r;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aput-object v0, v1, v2

    .line 14
    .line 15
    return-object v1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method static synthetic h()[B
    .registers 1

    .line 1
    sget-object v0, Lax/I1/e;->h0:[B

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

.method static synthetic i()Ljava/util/Map;
    .registers 1

    .line 1
    sget-object v0, Lax/I1/e;->l0:Ljava/util/Map;

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

.method static synthetic j()Ljava/util/UUID;
    .registers 1

    .line 1
    sget-object v0, Lax/I1/e;->k0:Ljava/util/UUID;

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

.method private l(I)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/I1/e;->F:Lax/S0/v;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    iget-object v0, p0, Lax/I1/e;->G:Lax/S0/v;

    .line 6
    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "Element "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p1, " must be in a Cues"

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-static {p1, v0}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    throw p1
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

.method private m(I)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "Element "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, " must be in a TrackEntry"

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-static {p1, v0}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    throw p1
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

.method private n()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/I1/e;->e0:Lax/q1/t;

    .line 2
    .line 3
    invoke-static {v0}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
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

.method private p(Lax/S0/v;Lax/S0/v;)Lax/q1/N;
    .registers 14

    .line 1
    iget-wide v0, p0, Lax/I1/e;->s:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    if-eqz v4, :cond_a3

    .line 8
    .line 9
    iget-wide v0, p0, Lax/I1/e;->v:J

    .line 10
    .line 11
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v4, v0, v2

    .line 17
    .line 18
    if-eqz v4, :cond_a3

    .line 19
    .line 20
    if-eqz p1, :cond_a3

    .line 21
    .line 22
    invoke-virtual {p1}, Lax/S0/v;->d()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_a3

    .line 27
    .line 28
    if-eqz p2, :cond_a3

    .line 29
    .line 30
    invoke-virtual {p2}, Lax/S0/v;->d()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p1}, Lax/S0/v;->d()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eq v0, v1, :cond_29

    .line 39
    .line 40
    goto/16 :goto_a3

    .line 41
    .line 42
    :cond_29
    invoke-virtual {p1}, Lax/S0/v;->d()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    new-array v1, v0, [I

    .line 47
    .line 48
    new-array v2, v0, [J

    .line 49
    .line 50
    new-array v3, v0, [J

    .line 51
    .line 52
    new-array v4, v0, [J

    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    const/4 v6, 0x0

    .line 56
    :goto_37
    if-ge v6, v0, :cond_4b

    .line 57
    .line 58
    invoke-virtual {p1, v6}, Lax/S0/v;->c(I)J

    .line 59
    .line 60
    .line 61
    move-result-wide v7

    .line 62
    aput-wide v7, v4, v6

    .line 63
    .line 64
    iget-wide v7, p0, Lax/I1/e;->s:J

    .line 65
    .line 66
    invoke-virtual {p2, v6}, Lax/S0/v;->c(I)J

    .line 67
    .line 68
    .line 69
    move-result-wide v9

    .line 70
    add-long/2addr v7, v9

    .line 71
    aput-wide v7, v2, v6

    .line 72
    .line 73
    add-int/lit8 v6, v6, 0x1

    .line 74
    .line 75
    goto :goto_37

    .line 76
    :cond_4b
    :goto_4b
    add-int/lit8 p1, v0, -0x1

    .line 77
    .line 78
    if-ge v5, p1, :cond_62

    .line 79
    .line 80
    add-int/lit8 p1, v5, 0x1

    .line 81
    .line 82
    aget-wide v6, v2, p1

    .line 83
    .line 84
    aget-wide v8, v2, v5

    .line 85
    .line 86
    sub-long/2addr v6, v8

    .line 87
    long-to-int p2, v6

    .line 88
    aput p2, v1, v5

    .line 89
    .line 90
    aget-wide v6, v4, p1

    .line 91
    .line 92
    aget-wide v8, v4, v5

    .line 93
    .line 94
    sub-long/2addr v6, v8

    .line 95
    aput-wide v6, v3, v5

    .line 96
    .line 97
    move v5, p1

    .line 98
    goto :goto_4b

    .line 99
    :cond_62
    move p2, p1

    .line 100
    :goto_63
    if-lez p2, :cond_70

    .line 101
    .line 102
    aget-wide v5, v4, p2

    .line 103
    .line 104
    iget-wide v7, p0, Lax/I1/e;->v:J

    .line 105
    .line 106
    cmp-long v0, v5, v7

    .line 107
    .line 108
    if-lez v0, :cond_70

    .line 109
    .line 110
    add-int/lit8 p2, p2, -0x1

    .line 111
    .line 112
    goto :goto_63

    .line 113
    :cond_70
    iget-wide v5, p0, Lax/I1/e;->s:J

    .line 114
    .line 115
    iget-wide v7, p0, Lax/I1/e;->r:J

    .line 116
    .line 117
    add-long/2addr v5, v7

    .line 118
    aget-wide v7, v2, p2

    .line 119
    .line 120
    sub-long/2addr v5, v7

    .line 121
    long-to-int v0, v5

    .line 122
    aput v0, v1, p2

    .line 123
    .line 124
    iget-wide v5, p0, Lax/I1/e;->v:J

    .line 125
    .line 126
    aget-wide v7, v4, p2

    .line 127
    .line 128
    sub-long/2addr v5, v7

    .line 129
    aput-wide v5, v3, p2

    .line 130
    .line 131
    if-ge p2, p1, :cond_9d

    .line 132
    .line 133
    const-string p1, "MatroskaExtractor"

    .line 134
    .line 135
    const-string v0, "Discarding trailing cue points with timestamps greater than total duration"

    .line 136
    .line 137
    invoke-static {p1, v0}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    add-int/lit8 p2, p2, 0x1

    .line 141
    .line 142
    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([II)[I

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-static {v2, p2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-static {v3, p2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-static {v4, p2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    :cond_9d
    new-instance p1, Lax/q1/h;

    .line 159
    .line 160
    invoke-direct {p1, v1, v2, v3, v4}, Lax/q1/h;-><init>([I[J[J[J)V

    .line 161
    .line 162
    .line 163
    return-object p1

    .line 164
    :cond_a3
    :goto_a3
    new-instance p1, Lax/q1/N$b;

    .line 165
    .line 166
    iget-wide v0, p0, Lax/I1/e;->v:J

    .line 167
    .line 168
    invoke-direct {p1, v0, v1}, Lax/q1/N$b;-><init>(J)V

    .line 169
    .line 170
    .line 171
    return-object p1
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

.method private q(Lax/I1/e$c;JIII)V
    .registers 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lax/I1/e$c;->V:Lax/q1/V;

    .line 6
    .line 7
    const/4 v9, 0x1

    .line 8
    if-eqz v2, :cond_1c

    .line 9
    .line 10
    move-object v3, v2

    .line 11
    iget-object v2, v1, Lax/I1/e$c;->Z:Lax/q1/U;

    .line 12
    .line 13
    iget-object v8, v1, Lax/I1/e$c;->k:Lax/q1/U$a;

    .line 14
    .line 15
    move/from16 v5, p4

    .line 16
    .line 17
    move/from16 v6, p5

    .line 18
    .line 19
    move/from16 v7, p6

    .line 20
    .line 21
    move-object v1, v3

    .line 22
    move-wide/from16 v3, p2

    .line 23
    .line 24
    invoke-virtual/range {v1 .. v8}, Lax/q1/V;->c(Lax/q1/U;JIIILax/q1/U$a;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_d2

    .line 28
    .line 29
    :cond_1c
    const-string v2, "S_TEXT/UTF8"

    .line 30
    .line 31
    iget-object v3, v1, Lax/I1/e$c;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_44

    .line 38
    .line 39
    const-string v2, "S_TEXT/ASS"

    .line 40
    .line 41
    iget-object v3, v1, Lax/I1/e$c;->c:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_44

    .line 48
    .line 49
    const-string v2, "S_TEXT/SSA"

    .line 50
    .line 51
    iget-object v3, v1, Lax/I1/e$c;->c:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_44

    .line 58
    .line 59
    const-string v2, "S_TEXT/WEBVTT"

    .line 60
    .line 61
    iget-object v3, v1, Lax/I1/e$c;->c:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_60

    .line 68
    .line 69
    :cond_44
    iget v2, v0, Lax/I1/e;->N:I

    .line 70
    .line 71
    const-string v3, "MatroskaExtractor"

    .line 72
    .line 73
    if-le v2, v9, :cond_50

    .line 74
    .line 75
    const-string v2, "Skipping subtitle sample in laced block."

    .line 76
    .line 77
    invoke-static {v3, v2}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_60

    .line 81
    :cond_50
    iget-wide v4, v0, Lax/I1/e;->L:J

    .line 82
    .line 83
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    cmp-long v2, v4, v6

    .line 89
    .line 90
    if-nez v2, :cond_63

    .line 91
    .line 92
    const-string v2, "Skipping subtitle sample with no duration."

    .line 93
    .line 94
    invoke-static {v3, v2}, Lax/S0/u;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_60
    :goto_60
    move/from16 v2, p5

    .line 98
    .line 99
    goto :goto_a2

    .line 100
    :cond_63
    iget-object v2, v1, Lax/I1/e$c;->c:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v3, v0, Lax/I1/e;->m:Lax/S0/G;

    .line 103
    .line 104
    invoke-virtual {v3}, Lax/S0/G;->f()[B

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-static {v2, v4, v5, v3}, Lax/I1/e;->H(Ljava/lang/String;J[B)V

    .line 109
    .line 110
    .line 111
    iget-object v2, v0, Lax/I1/e;->m:Lax/S0/G;

    .line 112
    .line 113
    invoke-virtual {v2}, Lax/S0/G;->g()I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    :goto_74
    iget-object v3, v0, Lax/I1/e;->m:Lax/S0/G;

    .line 118
    .line 119
    invoke-virtual {v3}, Lax/S0/G;->j()I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-ge v2, v3, :cond_8f

    .line 124
    .line 125
    iget-object v3, v0, Lax/I1/e;->m:Lax/S0/G;

    .line 126
    .line 127
    invoke-virtual {v3}, Lax/S0/G;->f()[B

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    aget-byte v3, v3, v2

    .line 132
    .line 133
    if-nez v3, :cond_8c

    .line 134
    .line 135
    iget-object v3, v0, Lax/I1/e;->m:Lax/S0/G;

    .line 136
    .line 137
    invoke-virtual {v3, v2}, Lax/S0/G;->a0(I)V

    .line 138
    .line 139
    .line 140
    goto :goto_8f

    .line 141
    :cond_8c
    add-int/lit8 v2, v2, 0x1

    .line 142
    .line 143
    goto :goto_74

    .line 144
    :cond_8f
    :goto_8f
    iget-object v2, v1, Lax/I1/e$c;->Z:Lax/q1/U;

    .line 145
    .line 146
    iget-object v3, v0, Lax/I1/e;->m:Lax/S0/G;

    .line 147
    .line 148
    invoke-virtual {v3}, Lax/S0/G;->j()I

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    invoke-interface {v2, v3, v4}, Lax/q1/U;->g(Lax/S0/G;I)V

    .line 153
    .line 154
    .line 155
    iget-object v2, v0, Lax/I1/e;->m:Lax/S0/G;

    .line 156
    .line 157
    invoke-virtual {v2}, Lax/S0/G;->j()I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    add-int v2, p5, v2

    .line 162
    .line 163
    :goto_a2
    const/high16 v3, 0x10000000

    .line 164
    .line 165
    and-int v3, p4, v3

    .line 166
    .line 167
    if-eqz v3, :cond_c2

    .line 168
    .line 169
    iget v3, v0, Lax/I1/e;->N:I

    .line 170
    .line 171
    if-le v3, v9, :cond_b3

    .line 172
    .line 173
    iget-object v3, v0, Lax/I1/e;->p:Lax/S0/G;

    .line 174
    .line 175
    const/4 v4, 0x0

    .line 176
    invoke-virtual {v3, v4}, Lax/S0/G;->X(I)V

    .line 177
    .line 178
    .line 179
    goto :goto_c2

    .line 180
    :cond_b3
    iget-object v3, v0, Lax/I1/e;->p:Lax/S0/G;

    .line 181
    .line 182
    invoke-virtual {v3}, Lax/S0/G;->j()I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    iget-object v4, v1, Lax/I1/e$c;->Z:Lax/q1/U;

    .line 187
    .line 188
    iget-object v5, v0, Lax/I1/e;->p:Lax/S0/G;

    .line 189
    .line 190
    const/4 v6, 0x2

    .line 191
    invoke-interface {v4, v5, v3, v6}, Lax/q1/U;->b(Lax/S0/G;II)V

    .line 192
    .line 193
    .line 194
    add-int/2addr v2, v3

    .line 195
    :cond_c2
    :goto_c2
    move v14, v2

    .line 196
    iget-object v10, v1, Lax/I1/e$c;->Z:Lax/q1/U;

    .line 197
    .line 198
    iget-object v1, v1, Lax/I1/e$c;->k:Lax/q1/U$a;

    .line 199
    .line 200
    move-wide/from16 v11, p2

    .line 201
    .line 202
    move/from16 v13, p4

    .line 203
    .line 204
    move/from16 v15, p6

    .line 205
    .line 206
    move-object/from16 v16, v1

    .line 207
    .line 208
    invoke-interface/range {v10 .. v16}, Lax/q1/U;->f(JIIILax/q1/U$a;)V

    .line 209
    .line 210
    .line 211
    :goto_d2
    iput-boolean v9, v0, Lax/I1/e;->I:Z

    .line 212
    .line 213
    return-void
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
.end method

.method private static s([II)[I
    .registers 3

    .line 1
    if-nez p0, :cond_5

    .line 2
    .line 3
    new-array p0, p1, [I

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_5
    array-length v0, p0

    .line 7
    if-lt v0, p1, :cond_9

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_9
    array-length p0, p0

    .line 11
    mul-int/lit8 p0, p0, 0x2

    .line 12
    .line 13
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    new-array p0, p0, [I

    .line 18
    .line 19
    return-object p0
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

.method private t()I
    .registers 2

    .line 1
    iget v0, p0, Lax/I1/e;->W:I

    .line 2
    .line 3
    invoke-direct {p0}, Lax/I1/e;->F()V

    .line 4
    .line 5
    .line 6
    return v0
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

.method private static v(JLjava/lang/String;J)[B
    .registers 15

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, p0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_d

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    goto :goto_e

    .line 14
    :cond_d
    const/4 v2, 0x0

    .line 15
    :goto_e
    invoke-static {v2}, Lax/S0/a;->a(Z)V

    .line 16
    .line 17
    .line 18
    const-wide v2, 0xd693a400L

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    div-long v4, p0, v2

    .line 24
    .line 25
    long-to-int v5, v4

    .line 26
    int-to-long v6, v5

    .line 27
    mul-long v6, v6, v2

    .line 28
    .line 29
    sub-long/2addr p0, v6

    .line 30
    const-wide/32 v2, 0x3938700

    .line 31
    .line 32
    .line 33
    div-long v6, p0, v2

    .line 34
    .line 35
    long-to-int v4, v6

    .line 36
    int-to-long v6, v4

    .line 37
    mul-long v6, v6, v2

    .line 38
    .line 39
    sub-long/2addr p0, v6

    .line 40
    const-wide/32 v2, 0xf4240

    .line 41
    .line 42
    .line 43
    div-long v6, p0, v2

    .line 44
    .line 45
    long-to-int v7, v6

    .line 46
    int-to-long v8, v7

    .line 47
    mul-long v8, v8, v2

    .line 48
    .line 49
    sub-long/2addr p0, v8

    .line 50
    div-long/2addr p0, p3

    .line 51
    long-to-int p1, p0

    .line 52
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 53
    .line 54
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p4

    .line 62
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const/4 v3, 0x4

    .line 71
    new-array v3, v3, [Ljava/lang/Object;

    .line 72
    .line 73
    aput-object p3, v3, v0

    .line 74
    .line 75
    aput-object p4, v3, v1

    .line 76
    .line 77
    const/4 p3, 0x2

    .line 78
    aput-object v2, v3, p3

    .line 79
    .line 80
    const/4 p3, 0x3

    .line 81
    aput-object p1, v3, p3

    .line 82
    .line 83
    invoke-static {p0, p2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {p0}, Lax/S0/d0;->x0(Ljava/lang/String;)[B

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
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


# virtual methods
.method protected A(IJ)V
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/16 v0, 0x5031

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, " not supported"

    .line 5
    .line 6
    if-eq p1, v0, :cond_238

    .line 7
    .line 8
    const/16 v0, 0x5032

    .line 9
    .line 10
    const-wide/16 v3, 0x1

    .line 11
    .line 12
    if-eq p1, v0, :cond_21a

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v5, 0x3

    .line 16
    const/4 v6, 0x2

    .line 17
    const/4 v7, 0x1

    .line 18
    sparse-switch p1, :sswitch_data_258

    .line 19
    .line 20
    .line 21
    const/4 v0, -0x1

    .line 22
    packed-switch p1, :pswitch_data_2de

    .line 23
    .line 24
    .line 25
    goto/16 :goto_23e

    .line 26
    .line 27
    :pswitch_1a
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    long-to-int p3, p2

    .line 32
    iput p3, p1, Lax/I1/e$c;->E:I

    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_22
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    long-to-int p3, p2

    .line 40
    iput p3, p1, Lax/I1/e$c;->D:I

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_2a
    invoke-direct {p0, p1}, Lax/I1/e;->m(I)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 47
    .line 48
    iput-boolean v7, p1, Lax/I1/e$c;->z:Z

    .line 49
    .line 50
    long-to-int p1, p2

    .line 51
    invoke-static {p1}, Lax/P0/j;->k(I)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eq p1, v0, :cond_23e

    .line 56
    .line 57
    iget-object p2, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 58
    .line 59
    iput p1, p2, Lax/I1/e$c;->A:I

    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_3d
    invoke-direct {p0, p1}, Lax/I1/e;->m(I)V

    .line 63
    .line 64
    .line 65
    long-to-int p1, p2

    .line 66
    invoke-static {p1}, Lax/P0/j;->l(I)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eq p1, v0, :cond_23e

    .line 71
    .line 72
    iget-object p2, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 73
    .line 74
    iput p1, p2, Lax/I1/e$c;->B:I

    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_4c
    invoke-direct {p0, p1}, Lax/I1/e;->m(I)V

    .line 78
    .line 79
    .line 80
    long-to-int p1, p2

    .line 81
    if-eq p1, v7, :cond_5b

    .line 82
    .line 83
    if-eq p1, v6, :cond_56

    .line 84
    .line 85
    goto/16 :goto_23e

    .line 86
    .line 87
    :cond_56
    iget-object p1, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 88
    .line 89
    iput v7, p1, Lax/I1/e$c;->C:I

    .line 90
    .line 91
    return-void

    .line 92
    :cond_5b
    iget-object p1, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 93
    .line 94
    iput v6, p1, Lax/I1/e$c;->C:I

    .line 95
    .line 96
    return-void

    .line 97
    :sswitch_60
    iput-wide p2, p0, Lax/I1/e;->t:J

    .line 98
    .line 99
    return-void

    .line 100
    :sswitch_63
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    long-to-int p3, p2

    .line 105
    iput p3, p1, Lax/I1/e$c;->f:I

    .line 106
    .line 107
    return-void

    .line 108
    :sswitch_6b
    invoke-direct {p0, p1}, Lax/I1/e;->m(I)V

    .line 109
    .line 110
    .line 111
    long-to-int p1, p2

    .line 112
    if-eqz p1, :cond_88

    .line 113
    .line 114
    if-eq p1, v7, :cond_83

    .line 115
    .line 116
    if-eq p1, v6, :cond_7e

    .line 117
    .line 118
    if-eq p1, v5, :cond_79

    .line 119
    .line 120
    goto/16 :goto_23e

    .line 121
    .line 122
    :cond_79
    iget-object p1, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 123
    .line 124
    iput v5, p1, Lax/I1/e$c;->t:I

    .line 125
    .line 126
    return-void

    .line 127
    :cond_7e
    iget-object p1, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 128
    .line 129
    iput v6, p1, Lax/I1/e$c;->t:I

    .line 130
    .line 131
    return-void

    .line 132
    :cond_83
    iget-object p1, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 133
    .line 134
    iput v7, p1, Lax/I1/e$c;->t:I

    .line 135
    .line 136
    return-void

    .line 137
    :cond_88
    iget-object p1, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 138
    .line 139
    iput v0, p1, Lax/I1/e$c;->t:I

    .line 140
    .line 141
    return-void

    .line 142
    :sswitch_8d
    iput-wide p2, p0, Lax/I1/e;->U:J

    .line 143
    .line 144
    return-void

    .line 145
    :sswitch_90
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    long-to-int p3, p2

    .line 150
    iput p3, p1, Lax/I1/e$c;->R:I

    .line 151
    .line 152
    return-void

    .line 153
    :sswitch_98
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iput-wide p2, p1, Lax/I1/e$c;->U:J

    .line 158
    .line 159
    return-void

    .line 160
    :sswitch_9f
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    iput-wide p2, p1, Lax/I1/e$c;->T:J

    .line 165
    .line 166
    return-void

    .line 167
    :sswitch_a6
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    long-to-int p3, p2

    .line 172
    iput p3, p1, Lax/I1/e$c;->g:I

    .line 173
    .line 174
    return-void

    .line 175
    :sswitch_ae
    invoke-direct {p0, p1}, Lax/I1/e;->m(I)V

    .line 176
    .line 177
    .line 178
    iget-object p1, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 179
    .line 180
    iput-boolean v7, p1, Lax/I1/e$c;->z:Z

    .line 181
    .line 182
    long-to-int p3, p2

    .line 183
    iput p3, p1, Lax/I1/e$c;->p:I

    .line 184
    .line 185
    return-void

    .line 186
    :sswitch_b9
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    cmp-long v1, p2, v3

    .line 191
    .line 192
    if-nez v1, :cond_c2

    .line 193
    .line 194
    const/4 v0, 0x1

    .line 195
    :cond_c2
    iput-boolean v0, p1, Lax/I1/e$c;->W:Z

    .line 196
    .line 197
    return-void

    .line 198
    :sswitch_c5
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    long-to-int p3, p2

    .line 203
    iput p3, p1, Lax/I1/e$c;->r:I

    .line 204
    .line 205
    return-void

    .line 206
    :sswitch_cd
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    long-to-int p3, p2

    .line 211
    iput p3, p1, Lax/I1/e$c;->s:I

    .line 212
    .line 213
    return-void

    .line 214
    :sswitch_d5
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    long-to-int p3, p2

    .line 219
    iput p3, p1, Lax/I1/e$c;->q:I

    .line 220
    .line 221
    return-void

    .line 222
    :sswitch_dd
    long-to-int p3, p2

    .line 223
    invoke-direct {p0, p1}, Lax/I1/e;->m(I)V

    .line 224
    .line 225
    .line 226
    if-eqz p3, :cond_fc

    .line 227
    .line 228
    if-eq p3, v7, :cond_f7

    .line 229
    .line 230
    if-eq p3, v5, :cond_f2

    .line 231
    .line 232
    const/16 p1, 0xf

    .line 233
    .line 234
    if-eq p3, p1, :cond_ed

    .line 235
    .line 236
    goto/16 :goto_23e

    .line 237
    .line 238
    :cond_ed
    iget-object p1, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 239
    .line 240
    iput v5, p1, Lax/I1/e$c;->y:I

    .line 241
    .line 242
    return-void

    .line 243
    :cond_f2
    iget-object p1, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 244
    .line 245
    iput v7, p1, Lax/I1/e$c;->y:I

    .line 246
    .line 247
    return-void

    .line 248
    :cond_f7
    iget-object p1, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 249
    .line 250
    iput v6, p1, Lax/I1/e$c;->y:I

    .line 251
    .line 252
    return-void

    .line 253
    :cond_fc
    iget-object p1, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 254
    .line 255
    iput v0, p1, Lax/I1/e$c;->y:I

    .line 256
    .line 257
    return-void

    .line 258
    :sswitch_101
    iget-wide v0, p0, Lax/I1/e;->s:J

    .line 259
    .line 260
    add-long/2addr p2, v0

    .line 261
    iput-wide p2, p0, Lax/I1/e;->A:J

    .line 262
    .line 263
    return-void

    .line 264
    :sswitch_107
    cmp-long p1, p2, v3

    .line 265
    .line 266
    if-nez p1, :cond_10d

    .line 267
    .line 268
    goto/16 :goto_23e

    .line 269
    .line 270
    :cond_10d
    new-instance p1, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 273
    .line 274
    .line 275
    const-string v0, "AESSettingsCipherMode "

    .line 276
    .line 277
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    invoke-static {p1, v1}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    throw p1

    .line 295
    :sswitch_126
    const-wide/16 v3, 0x5

    .line 296
    .line 297
    cmp-long p1, p2, v3

    .line 298
    .line 299
    if-nez p1, :cond_12e

    .line 300
    .line 301
    goto/16 :goto_23e

    .line 302
    .line 303
    :cond_12e
    new-instance p1, Ljava/lang/StringBuilder;

    .line 304
    .line 305
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 306
    .line 307
    .line 308
    const-string v0, "ContentEncAlgo "

    .line 309
    .line 310
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    invoke-static {p1, v1}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    throw p1

    .line 328
    :sswitch_147
    cmp-long p1, p2, v3

    .line 329
    .line 330
    if-nez p1, :cond_14d

    .line 331
    .line 332
    goto/16 :goto_23e

    .line 333
    .line 334
    :cond_14d
    new-instance p1, Ljava/lang/StringBuilder;

    .line 335
    .line 336
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 337
    .line 338
    .line 339
    const-string v0, "EBMLReadVersion "

    .line 340
    .line 341
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    invoke-static {p1, v1}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    throw p1

    .line 359
    :sswitch_166
    cmp-long p1, p2, v3

    .line 360
    .line 361
    if-ltz p1, :cond_172

    .line 362
    .line 363
    const-wide/16 v3, 0x2

    .line 364
    .line 365
    cmp-long p1, p2, v3

    .line 366
    .line 367
    if-gtz p1, :cond_172

    .line 368
    .line 369
    goto/16 :goto_23e

    .line 370
    .line 371
    :cond_172
    new-instance p1, Ljava/lang/StringBuilder;

    .line 372
    .line 373
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 374
    .line 375
    .line 376
    const-string v0, "DocTypeReadVersion "

    .line 377
    .line 378
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    invoke-static {p1, v1}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    throw p1

    .line 396
    :sswitch_18b
    const-wide/16 v3, 0x3

    .line 397
    .line 398
    cmp-long p1, p2, v3

    .line 399
    .line 400
    if-nez p1, :cond_193

    .line 401
    .line 402
    goto/16 :goto_23e

    .line 403
    .line 404
    :cond_193
    new-instance p1, Ljava/lang/StringBuilder;

    .line 405
    .line 406
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 407
    .line 408
    .line 409
    const-string v0, "ContentCompAlgo "

    .line 410
    .line 411
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object p1

    .line 424
    invoke-static {p1, v1}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    throw p1

    .line 429
    :sswitch_1ac
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 430
    .line 431
    .line 432
    move-result-object p1

    .line 433
    long-to-int p3, p2

    .line 434
    invoke-static {p1, p3}, Lax/I1/e$c;->c(Lax/I1/e$c;I)I

    .line 435
    .line 436
    .line 437
    return-void

    .line 438
    :sswitch_1b5
    iput-boolean v7, p0, Lax/I1/e;->T:Z

    .line 439
    .line 440
    return-void

    .line 441
    :sswitch_1b8
    iget-boolean v0, p0, Lax/I1/e;->H:Z

    .line 442
    .line 443
    if-nez v0, :cond_23e

    .line 444
    .line 445
    invoke-direct {p0, p1}, Lax/I1/e;->l(I)V

    .line 446
    .line 447
    .line 448
    iget-object p1, p0, Lax/I1/e;->G:Lax/S0/v;

    .line 449
    .line 450
    invoke-virtual {p1, p2, p3}, Lax/S0/v;->a(J)V

    .line 451
    .line 452
    .line 453
    iput-boolean v7, p0, Lax/I1/e;->H:Z

    .line 454
    .line 455
    return-void

    .line 456
    :sswitch_1c7
    long-to-int p1, p2

    .line 457
    iput p1, p0, Lax/I1/e;->S:I

    .line 458
    .line 459
    return-void

    .line 460
    :sswitch_1cb
    invoke-direct {p0, p2, p3}, Lax/I1/e;->G(J)J

    .line 461
    .line 462
    .line 463
    move-result-wide p1

    .line 464
    iput-wide p1, p0, Lax/I1/e;->E:J

    .line 465
    .line 466
    return-void

    .line 467
    :sswitch_1d2
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 468
    .line 469
    .line 470
    move-result-object p1

    .line 471
    long-to-int p3, p2

    .line 472
    iput p3, p1, Lax/I1/e$c;->d:I

    .line 473
    .line 474
    return-void

    .line 475
    :sswitch_1da
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 476
    .line 477
    .line 478
    move-result-object p1

    .line 479
    long-to-int p3, p2

    .line 480
    iput p3, p1, Lax/I1/e$c;->o:I

    .line 481
    .line 482
    return-void

    .line 483
    :sswitch_1e2
    invoke-direct {p0, p1}, Lax/I1/e;->l(I)V

    .line 484
    .line 485
    .line 486
    iget-object p1, p0, Lax/I1/e;->F:Lax/S0/v;

    .line 487
    .line 488
    invoke-direct {p0, p2, p3}, Lax/I1/e;->G(J)J

    .line 489
    .line 490
    .line 491
    move-result-wide p2

    .line 492
    invoke-virtual {p1, p2, p3}, Lax/S0/v;->a(J)V

    .line 493
    .line 494
    .line 495
    return-void

    .line 496
    :sswitch_1ef
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 497
    .line 498
    .line 499
    move-result-object p1

    .line 500
    long-to-int p3, p2

    .line 501
    iput p3, p1, Lax/I1/e$c;->n:I

    .line 502
    .line 503
    return-void

    .line 504
    :sswitch_1f7
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 505
    .line 506
    .line 507
    move-result-object p1

    .line 508
    long-to-int p3, p2

    .line 509
    iput p3, p1, Lax/I1/e$c;->Q:I

    .line 510
    .line 511
    return-void

    .line 512
    :sswitch_1ff
    invoke-direct {p0, p2, p3}, Lax/I1/e;->G(J)J

    .line 513
    .line 514
    .line 515
    move-result-wide p1

    .line 516
    iput-wide p1, p0, Lax/I1/e;->L:J

    .line 517
    .line 518
    return-void

    .line 519
    :sswitch_206
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 520
    .line 521
    .line 522
    move-result-object p1

    .line 523
    cmp-long v1, p2, v3

    .line 524
    .line 525
    if-nez v1, :cond_20f

    .line 526
    .line 527
    const/4 v0, 0x1

    .line 528
    :cond_20f
    iput-boolean v0, p1, Lax/I1/e$c;->X:Z

    .line 529
    .line 530
    return-void

    .line 531
    :sswitch_212
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 532
    .line 533
    .line 534
    move-result-object p1

    .line 535
    long-to-int p3, p2

    .line 536
    iput p3, p1, Lax/I1/e$c;->e:I

    .line 537
    .line 538
    return-void

    .line 539
    :cond_21a
    cmp-long p1, p2, v3

    .line 540
    .line 541
    if-nez p1, :cond_21f

    .line 542
    .line 543
    goto :goto_23e

    .line 544
    :cond_21f
    new-instance p1, Ljava/lang/StringBuilder;

    .line 545
    .line 546
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 547
    .line 548
    .line 549
    const-string v0, "ContentEncodingScope "

    .line 550
    .line 551
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object p1

    .line 564
    invoke-static {p1, v1}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 565
    .line 566
    .line 567
    move-result-object p1

    .line 568
    throw p1

    .line 569
    :cond_238
    const-wide/16 v3, 0x0

    .line 570
    .line 571
    cmp-long p1, p2, v3

    .line 572
    .line 573
    if-nez p1, :cond_23f

    .line 574
    .line 575
    :cond_23e
    :goto_23e
    return-void

    .line 576
    :cond_23f
    new-instance p1, Ljava/lang/StringBuilder;

    .line 577
    .line 578
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 579
    .line 580
    .line 581
    const-string v0, "ContentEncodingOrder "

    .line 582
    .line 583
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object p1

    .line 596
    invoke-static {p1, v1}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 597
    .line 598
    .line 599
    move-result-object p1

    .line 600
    throw p1

    .line 601
    :sswitch_data_258
    .sparse-switch
        0x83 -> :sswitch_212
        0x88 -> :sswitch_206
        0x9b -> :sswitch_1ff
        0x9f -> :sswitch_1f7
        0xb0 -> :sswitch_1ef
        0xb3 -> :sswitch_1e2
        0xba -> :sswitch_1da
        0xd7 -> :sswitch_1d2
        0xe7 -> :sswitch_1cb
        0xee -> :sswitch_1c7
        0xf1 -> :sswitch_1b8
        0xfb -> :sswitch_1b5
        0x41e7 -> :sswitch_1ac
        0x4254 -> :sswitch_18b
        0x4285 -> :sswitch_166
        0x42f7 -> :sswitch_147
        0x47e1 -> :sswitch_126
        0x47e8 -> :sswitch_107
        0x53ac -> :sswitch_101
        0x53b8 -> :sswitch_dd
        0x54b0 -> :sswitch_d5
        0x54b2 -> :sswitch_cd
        0x54ba -> :sswitch_c5
        0x55aa -> :sswitch_b9
        0x55b2 -> :sswitch_ae
        0x55ee -> :sswitch_a6
        0x56aa -> :sswitch_9f
        0x56bb -> :sswitch_98
        0x6264 -> :sswitch_90
        0x75a2 -> :sswitch_8d
        0x7671 -> :sswitch_6b
        0x23e383 -> :sswitch_63
        0x2ad7b1 -> :sswitch_60
    .end sparse-switch

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
    :pswitch_data_2de
    .packed-switch 0x55b9
        :pswitch_4c
        :pswitch_3d
        :pswitch_2a
        :pswitch_22
        :pswitch_1a
    .end packed-switch
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

.method protected C(I)Z
    .registers 3

    .line 1
    const v0, 0x1549a966

    .line 2
    .line 3
    .line 4
    if-eq p1, v0, :cond_17

    .line 5
    .line 6
    const v0, 0x1f43b675

    .line 7
    .line 8
    .line 9
    if-eq p1, v0, :cond_17

    .line 10
    .line 11
    const v0, 0x1c53bb6b

    .line 12
    .line 13
    .line 14
    if-eq p1, v0, :cond_17

    .line 15
    .line 16
    const v0, 0x1654ae6b

    .line 17
    .line 18
    .line 19
    if-ne p1, v0, :cond_15

    .line 20
    .line 21
    goto :goto_17

    .line 22
    :cond_15
    const/4 p1, 0x0

    .line 23
    return p1

    .line 24
    :cond_17
    :goto_17
    const/4 p1, 0x1

    .line 25
    return p1
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

.method protected I(IJJ)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lax/I1/e;->n()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xa0

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eq p1, v0, :cond_99

    .line 8
    .line 9
    const/16 v0, 0xae

    .line 10
    .line 11
    if-eq p1, v0, :cond_8d

    .line 12
    .line 13
    const/16 v0, 0xbb

    .line 14
    .line 15
    if-eq p1, v0, :cond_8a

    .line 16
    .line 17
    const/16 v0, 0x4dbb

    .line 18
    .line 19
    const-wide/16 v1, -0x1

    .line 20
    .line 21
    if-eq p1, v0, :cond_84

    .line 22
    .line 23
    const/16 v0, 0x5035

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    if-eq p1, v0, :cond_7d

    .line 27
    .line 28
    const/16 v0, 0x55d0

    .line 29
    .line 30
    if-eq p1, v0, :cond_76

    .line 31
    .line 32
    const v0, 0x18538067

    .line 33
    .line 34
    .line 35
    if-eq p1, v0, :cond_5e

    .line 36
    .line 37
    const p2, 0x1c53bb6b

    .line 38
    .line 39
    .line 40
    if-eq p1, p2, :cond_4f

    .line 41
    .line 42
    const p2, 0x1f43b675

    .line 43
    .line 44
    .line 45
    if-eq p1, p2, :cond_2f

    .line 46
    .line 47
    goto :goto_4e

    .line 48
    :cond_2f
    iget-boolean p1, p0, Lax/I1/e;->y:Z

    .line 49
    .line 50
    if-nez p1, :cond_4e

    .line 51
    .line 52
    iget-boolean p1, p0, Lax/I1/e;->d:Z

    .line 53
    .line 54
    if-eqz p1, :cond_40

    .line 55
    .line 56
    iget-wide p1, p0, Lax/I1/e;->C:J

    .line 57
    .line 58
    cmp-long p3, p1, v1

    .line 59
    .line 60
    if-eqz p3, :cond_40

    .line 61
    .line 62
    iput-boolean v3, p0, Lax/I1/e;->B:Z

    .line 63
    .line 64
    return-void

    .line 65
    :cond_40
    iget-object p1, p0, Lax/I1/e;->e0:Lax/q1/t;

    .line 66
    .line 67
    new-instance p2, Lax/q1/N$b;

    .line 68
    .line 69
    iget-wide p3, p0, Lax/I1/e;->v:J

    .line 70
    .line 71
    invoke-direct {p2, p3, p4}, Lax/q1/N$b;-><init>(J)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p1, p2}, Lax/q1/t;->h(Lax/q1/N;)V

    .line 75
    .line 76
    .line 77
    iput-boolean v3, p0, Lax/I1/e;->y:Z

    .line 78
    .line 79
    :cond_4e
    :goto_4e
    return-void

    .line 80
    :cond_4f
    new-instance p1, Lax/S0/v;

    .line 81
    .line 82
    invoke-direct {p1}, Lax/S0/v;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, Lax/I1/e;->F:Lax/S0/v;

    .line 86
    .line 87
    new-instance p1, Lax/S0/v;

    .line 88
    .line 89
    invoke-direct {p1}, Lax/S0/v;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, Lax/I1/e;->G:Lax/S0/v;

    .line 93
    .line 94
    return-void

    .line 95
    :cond_5e
    iget-wide v3, p0, Lax/I1/e;->s:J

    .line 96
    .line 97
    cmp-long p1, v3, v1

    .line 98
    .line 99
    if-eqz p1, :cond_71

    .line 100
    .line 101
    cmp-long p1, v3, p2

    .line 102
    .line 103
    if-nez p1, :cond_69

    .line 104
    .line 105
    goto :goto_71

    .line 106
    :cond_69
    const-string p1, "Multiple Segment elements not supported"

    .line 107
    .line 108
    const/4 p2, 0x0

    .line 109
    invoke-static {p1, p2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    throw p1

    .line 114
    :cond_71
    :goto_71
    iput-wide p2, p0, Lax/I1/e;->s:J

    .line 115
    .line 116
    iput-wide p4, p0, Lax/I1/e;->r:J

    .line 117
    .line 118
    return-void

    .line 119
    :cond_76
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iput-boolean v3, p1, Lax/I1/e$c;->z:Z

    .line 124
    .line 125
    return-void

    .line 126
    :cond_7d
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iput-boolean v3, p1, Lax/I1/e$c;->i:Z

    .line 131
    .line 132
    return-void

    .line 133
    :cond_84
    const/4 p1, -0x1

    .line 134
    iput p1, p0, Lax/I1/e;->z:I

    .line 135
    .line 136
    iput-wide v1, p0, Lax/I1/e;->A:J

    .line 137
    .line 138
    return-void

    .line 139
    :cond_8a
    iput-boolean v1, p0, Lax/I1/e;->H:Z

    .line 140
    .line 141
    return-void

    .line 142
    :cond_8d
    new-instance p1, Lax/I1/e$c;

    .line 143
    .line 144
    invoke-direct {p1}, Lax/I1/e$c;-><init>()V

    .line 145
    .line 146
    .line 147
    iput-object p1, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 148
    .line 149
    iget-boolean p2, p0, Lax/I1/e;->w:Z

    .line 150
    .line 151
    iput-boolean p2, p1, Lax/I1/e$c;->a:Z

    .line 152
    .line 153
    return-void

    .line 154
    :cond_99
    iput-boolean v1, p0, Lax/I1/e;->T:Z

    .line 155
    .line 156
    const-wide/16 p1, 0x0

    .line 157
    .line 158
    iput-wide p1, p0, Lax/I1/e;->U:J

    .line 159
    .line 160
    return-void
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

.method protected J(ILjava/lang/String;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/16 v0, 0x86

    .line 2
    .line 3
    if-eq p1, v0, :cond_55

    .line 4
    .line 5
    const/16 v0, 0x4282

    .line 6
    .line 7
    if-eq p1, v0, :cond_21

    .line 8
    .line 9
    const/16 v0, 0x536e

    .line 10
    .line 11
    if-eq p1, v0, :cond_1a

    .line 12
    .line 13
    const v0, 0x22b59c

    .line 14
    .line 15
    .line 16
    if-eq p1, v0, :cond_12

    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1, p2}, Lax/I1/e$c;->d(Lax/I1/e$c;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p2, p1, Lax/I1/e$c;->b:Ljava/lang/String;

    .line 32
    .line 33
    return-void

    .line 34
    :cond_21
    const-string p1, "webm"

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_4e

    .line 41
    .line 42
    const-string v0, "matroska"

    .line 43
    .line 44
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_32

    .line 49
    .line 50
    goto :goto_4e

    .line 51
    :cond_32
    new-instance p1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v0, "DocType "

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p2, " not supported"

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const/4 p2, 0x0

    .line 74
    invoke-static {p1, p2}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    throw p1

    .line 79
    :cond_4e
    :goto_4e
    invoke-static {p2, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    iput-boolean p1, p0, Lax/I1/e;->w:Z

    .line 84
    .line 85
    return-void

    .line 86
    :cond_55
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p2, p1, Lax/I1/e$c;->c:Ljava/lang/String;

    .line 91
    .line 92
    return-void
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

.method public final a(Lax/q1/t;)V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/I1/e;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    new-instance v0, Lax/N1/u;

    .line 6
    .line 7
    iget-object v1, p0, Lax/I1/e;->f:Lax/N1/t$a;

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, Lax/N1/u;-><init>(Lax/q1/t;Lax/N1/t$a;)V

    .line 10
    .line 11
    .line 12
    move-object p1, v0

    .line 13
    :cond_c
    iput-object p1, p0, Lax/I1/e;->e0:Lax/q1/t;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public b(JJ)V
    .registers 5

    .line 1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, Lax/I1/e;->E:J

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lax/I1/e;->J:I

    .line 10
    .line 11
    iget-object p2, p0, Lax/I1/e;->a:Lax/I1/c;

    .line 12
    .line 13
    invoke-interface {p2}, Lax/I1/c;->a()V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lax/I1/e;->b:Lax/I1/g;

    .line 17
    .line 18
    invoke-virtual {p2}, Lax/I1/g;->e()V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lax/I1/e;->F()V

    .line 22
    .line 23
    .line 24
    :goto_17
    iget-object p2, p0, Lax/I1/e;->c:Landroid/util/SparseArray;

    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/util/SparseArray;->size()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-ge p1, p2, :cond_2d

    .line 31
    .line 32
    iget-object p2, p0, Lax/I1/e;->c:Landroid/util/SparseArray;

    .line 33
    .line 34
    invoke-virtual {p2, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, Lax/I1/e$c;

    .line 39
    .line 40
    invoke-virtual {p2}, Lax/I1/e$c;->n()V

    .line 41
    .line 42
    .line 43
    add-int/lit8 p1, p1, 0x1

    .line 44
    .line 45
    goto :goto_17

    .line 46
    :cond_2d
    return-void
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
.end method

.method public final c(Lax/q1/s;)Z
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lax/I1/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/I1/f;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lax/I1/f;->b(Lax/q1/s;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
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
    .line 22
.end method

.method public final d()V
    .registers 1

    .line 1
    return-void
    .line 2
    .line 3
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

.method public synthetic e()Lax/q1/r;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/q1/q;->b(Lax/q1/r;)Lax/q1/r;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lax/q1/s;Lax/q1/M;)I
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/I1/e;->I:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x1

    .line 6
    :cond_5
    if-eqz v2, :cond_1e

    .line 7
    .line 8
    iget-boolean v3, p0, Lax/I1/e;->I:Z

    .line 9
    .line 10
    if-nez v3, :cond_1e

    .line 11
    .line 12
    iget-object v2, p0, Lax/I1/e;->a:Lax/I1/c;

    .line 13
    .line 14
    invoke-interface {v2, p1}, Lax/I1/c;->b(Lax/q1/s;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_5

    .line 19
    .line 20
    invoke-interface {p1}, Lax/q1/s;->getPosition()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    invoke-direct {p0, p2, v3, v4}, Lax/I1/e;->D(Lax/q1/M;J)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_5

    .line 29
    .line 30
    return v1

    .line 31
    :cond_1e
    if-nez v2, :cond_3b

    .line 32
    .line 33
    :goto_20
    iget-object p1, p0, Lax/I1/e;->c:Landroid/util/SparseArray;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-ge v0, p1, :cond_39

    .line 40
    .line 41
    iget-object p1, p0, Lax/I1/e;->c:Landroid/util/SparseArray;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Lax/I1/e$c;

    .line 48
    .line 49
    invoke-static {p1}, Lax/I1/e$c;->a(Lax/I1/e$c;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lax/I1/e$c;->j()V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    goto :goto_20

    .line 58
    :cond_39
    const/4 p1, -0x1

    .line 59
    return p1

    .line 60
    :cond_3b
    return v0
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
.end method

.method public synthetic k()Ljava/util/List;
    .registers 2

    .line 1
    invoke-static {p0}, Lax/q1/q;->a(Lax/q1/r;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected o(IILax/q1/s;)V
    .registers 27
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v7, p3

    .line 8
    .line 9
    const/16 v3, 0xa1

    .line 10
    .line 11
    const/16 v4, 0xa3

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x2

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x1

    .line 17
    if-eq v1, v3, :cond_bf

    .line 18
    .line 19
    if-eq v1, v4, :cond_bf

    .line 20
    .line 21
    const/16 v3, 0xa5

    .line 22
    .line 23
    if-eq v1, v3, :cond_a9

    .line 24
    .line 25
    const/16 v3, 0x41ed

    .line 26
    .line 27
    if-eq v1, v3, :cond_a1

    .line 28
    .line 29
    const/16 v3, 0x4255

    .line 30
    .line 31
    if-eq v1, v3, :cond_94

    .line 32
    .line 33
    const/16 v3, 0x47e2

    .line 34
    .line 35
    if-eq v1, v3, :cond_83

    .line 36
    .line 37
    const/16 v3, 0x53ab

    .line 38
    .line 39
    if-eq v1, v3, :cond_60

    .line 40
    .line 41
    const/16 v3, 0x63a2

    .line 42
    .line 43
    if-eq v1, v3, :cond_53

    .line 44
    .line 45
    const/16 v3, 0x7672

    .line 46
    .line 47
    if-ne v1, v3, :cond_3d

    .line 48
    .line 49
    invoke-direct/range {p0 .. p1}, Lax/I1/e;->m(I)V

    .line 50
    .line 51
    .line 52
    iget-object v1, v0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 53
    .line 54
    new-array v3, v2, [B

    .line 55
    .line 56
    iput-object v3, v1, Lax/I1/e$c;->x:[B

    .line 57
    .line 58
    invoke-interface {v7, v3, v8, v2}, Lax/q1/s;->readFully([BII)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_3d
    new-instance v2, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v3, "Unexpected id: "

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-static {v1, v5}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    throw v1

    .line 84
    :cond_53
    invoke-direct/range {p0 .. p1}, Lax/I1/e;->m(I)V

    .line 85
    .line 86
    .line 87
    iget-object v1, v0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 88
    .line 89
    new-array v3, v2, [B

    .line 90
    .line 91
    iput-object v3, v1, Lax/I1/e$c;->l:[B

    .line 92
    .line 93
    invoke-interface {v7, v3, v8, v2}, Lax/q1/s;->readFully([BII)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_60
    iget-object v1, v0, Lax/I1/e;->k:Lax/S0/G;

    .line 98
    .line 99
    invoke-virtual {v1}, Lax/S0/G;->f()[B

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {v1, v8}, Ljava/util/Arrays;->fill([BB)V

    .line 104
    .line 105
    .line 106
    iget-object v1, v0, Lax/I1/e;->k:Lax/S0/G;

    .line 107
    .line 108
    invoke-virtual {v1}, Lax/S0/G;->f()[B

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    rsub-int/lit8 v3, v2, 0x4

    .line 113
    .line 114
    invoke-interface {v7, v1, v3, v2}, Lax/q1/s;->readFully([BII)V

    .line 115
    .line 116
    .line 117
    iget-object v1, v0, Lax/I1/e;->k:Lax/S0/G;

    .line 118
    .line 119
    invoke-virtual {v1, v8}, Lax/S0/G;->b0(I)V

    .line 120
    .line 121
    .line 122
    iget-object v1, v0, Lax/I1/e;->k:Lax/S0/G;

    .line 123
    .line 124
    invoke-virtual {v1}, Lax/S0/G;->O()J

    .line 125
    .line 126
    .line 127
    move-result-wide v1

    .line 128
    long-to-int v2, v1

    .line 129
    iput v2, v0, Lax/I1/e;->z:I

    .line 130
    .line 131
    return-void

    .line 132
    :cond_83
    new-array v3, v2, [B

    .line 133
    .line 134
    invoke-interface {v7, v3, v8, v2}, Lax/q1/s;->readFully([BII)V

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {p0 .. p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    new-instance v2, Lax/q1/U$a;

    .line 142
    .line 143
    invoke-direct {v2, v9, v3, v8, v8}, Lax/q1/U$a;-><init>(I[BII)V

    .line 144
    .line 145
    .line 146
    iput-object v2, v1, Lax/I1/e$c;->k:Lax/q1/U$a;

    .line 147
    .line 148
    return-void

    .line 149
    :cond_94
    invoke-direct/range {p0 .. p1}, Lax/I1/e;->m(I)V

    .line 150
    .line 151
    .line 152
    iget-object v1, v0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 153
    .line 154
    new-array v3, v2, [B

    .line 155
    .line 156
    iput-object v3, v1, Lax/I1/e$c;->j:[B

    .line 157
    .line 158
    invoke-interface {v7, v3, v8, v2}, Lax/q1/s;->readFully([BII)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_a1
    invoke-virtual/range {p0 .. p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {v0, v1, v7, v2}, Lax/I1/e;->y(Lax/I1/e$c;Lax/q1/s;I)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_a9
    iget v1, v0, Lax/I1/e;->J:I

    .line 171
    .line 172
    if-eq v1, v6, :cond_af

    .line 173
    .line 174
    goto/16 :goto_2fe

    .line 175
    .line 176
    :cond_af
    iget-object v1, v0, Lax/I1/e;->c:Landroid/util/SparseArray;

    .line 177
    .line 178
    iget v3, v0, Lax/I1/e;->P:I

    .line 179
    .line 180
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    check-cast v1, Lax/I1/e$c;

    .line 185
    .line 186
    iget v3, v0, Lax/I1/e;->S:I

    .line 187
    .line 188
    invoke-virtual {v0, v1, v3, v7, v2}, Lax/I1/e;->z(Lax/I1/e$c;ILax/q1/s;I)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_bf
    iget v3, v0, Lax/I1/e;->J:I

    .line 193
    .line 194
    const/16 v10, 0x8

    .line 195
    .line 196
    if-nez v3, :cond_e4

    .line 197
    .line 198
    iget-object v3, v0, Lax/I1/e;->b:Lax/I1/g;

    .line 199
    .line 200
    invoke-virtual {v3, v7, v8, v9, v10}, Lax/I1/g;->d(Lax/q1/s;ZZI)J

    .line 201
    .line 202
    .line 203
    move-result-wide v11

    .line 204
    long-to-int v3, v11

    .line 205
    iput v3, v0, Lax/I1/e;->P:I

    .line 206
    .line 207
    iget-object v3, v0, Lax/I1/e;->b:Lax/I1/g;

    .line 208
    .line 209
    invoke-virtual {v3}, Lax/I1/g;->b()I

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    iput v3, v0, Lax/I1/e;->Q:I

    .line 214
    .line 215
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    iput-wide v11, v0, Lax/I1/e;->L:J

    .line 221
    .line 222
    iput v9, v0, Lax/I1/e;->J:I

    .line 223
    .line 224
    iget-object v3, v0, Lax/I1/e;->i:Lax/S0/G;

    .line 225
    .line 226
    invoke-virtual {v3, v8}, Lax/S0/G;->X(I)V

    .line 227
    .line 228
    .line 229
    :cond_e4
    iget-object v3, v0, Lax/I1/e;->c:Landroid/util/SparseArray;

    .line 230
    .line 231
    iget v11, v0, Lax/I1/e;->P:I

    .line 232
    .line 233
    invoke-virtual {v3, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    check-cast v3, Lax/I1/e$c;

    .line 238
    .line 239
    if-nez v3, :cond_fa

    .line 240
    .line 241
    iget v1, v0, Lax/I1/e;->Q:I

    .line 242
    .line 243
    sub-int v1, v2, v1

    .line 244
    .line 245
    invoke-interface {v7, v1}, Lax/q1/s;->n(I)V

    .line 246
    .line 247
    .line 248
    iput v8, v0, Lax/I1/e;->J:I

    .line 249
    .line 250
    return-void

    .line 251
    :cond_fa
    invoke-static {v3}, Lax/I1/e$c;->a(Lax/I1/e$c;)V

    .line 252
    .line 253
    .line 254
    iget v11, v0, Lax/I1/e;->J:I

    .line 255
    .line 256
    if-ne v11, v9, :cond_2aa

    .line 257
    .line 258
    const/4 v11, 0x3

    .line 259
    invoke-direct {v0, v7, v11}, Lax/I1/e;->E(Lax/q1/s;I)V

    .line 260
    .line 261
    .line 262
    iget-object v12, v0, Lax/I1/e;->i:Lax/S0/G;

    .line 263
    .line 264
    invoke-virtual {v12}, Lax/S0/G;->f()[B

    .line 265
    .line 266
    .line 267
    move-result-object v12

    .line 268
    aget-byte v12, v12, v6

    .line 269
    .line 270
    and-int/lit8 v12, v12, 0x6

    .line 271
    .line 272
    shr-int/2addr v12, v9

    .line 273
    const/16 v13, 0xff

    .line 274
    .line 275
    if-nez v12, :cond_12c

    .line 276
    .line 277
    iput v9, v0, Lax/I1/e;->N:I

    .line 278
    .line 279
    iget-object v5, v0, Lax/I1/e;->O:[I

    .line 280
    .line 281
    invoke-static {v5, v9}, Lax/I1/e;->s([II)[I

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    iput-object v5, v0, Lax/I1/e;->O:[I

    .line 286
    .line 287
    iget v12, v0, Lax/I1/e;->Q:I

    .line 288
    .line 289
    sub-int/2addr v2, v12

    .line 290
    sub-int/2addr v2, v11

    .line 291
    aput v2, v5, v8

    .line 292
    .line 293
    :goto_124
    const/16 v16, 0x1

    .line 294
    .line 295
    const/16 v17, 0x0

    .line 296
    .line 297
    const/16 v18, 0x8

    .line 298
    .line 299
    goto/16 :goto_256

    .line 300
    .line 301
    :cond_12c
    const/4 v14, 0x4

    .line 302
    invoke-direct {v0, v7, v14}, Lax/I1/e;->E(Lax/q1/s;I)V

    .line 303
    .line 304
    .line 305
    iget-object v15, v0, Lax/I1/e;->i:Lax/S0/G;

    .line 306
    .line 307
    invoke-virtual {v15}, Lax/S0/G;->f()[B

    .line 308
    .line 309
    .line 310
    move-result-object v15

    .line 311
    aget-byte v15, v15, v11

    .line 312
    .line 313
    and-int/2addr v15, v13

    .line 314
    add-int/2addr v15, v9

    .line 315
    iput v15, v0, Lax/I1/e;->N:I

    .line 316
    .line 317
    const/16 v16, 0x4

    .line 318
    .line 319
    iget-object v14, v0, Lax/I1/e;->O:[I

    .line 320
    .line 321
    invoke-static {v14, v15}, Lax/I1/e;->s([II)[I

    .line 322
    .line 323
    .line 324
    move-result-object v14

    .line 325
    iput-object v14, v0, Lax/I1/e;->O:[I

    .line 326
    .line 327
    if-ne v12, v6, :cond_154

    .line 328
    .line 329
    iget v5, v0, Lax/I1/e;->Q:I

    .line 330
    .line 331
    sub-int/2addr v2, v5

    .line 332
    add-int/lit8 v2, v2, -0x4

    .line 333
    .line 334
    iget v5, v0, Lax/I1/e;->N:I

    .line 335
    .line 336
    div-int/2addr v2, v5

    .line 337
    invoke-static {v14, v8, v5, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 338
    .line 339
    .line 340
    goto :goto_124

    .line 341
    :cond_154
    if-ne v12, v9, :cond_18e

    .line 342
    .line 343
    const/4 v5, 0x0

    .line 344
    const/4 v11, 0x0

    .line 345
    const/4 v14, 0x4

    .line 346
    :goto_159
    iget v12, v0, Lax/I1/e;->N:I

    .line 347
    .line 348
    add-int/lit8 v15, v12, -0x1

    .line 349
    .line 350
    if-ge v5, v15, :cond_183

    .line 351
    .line 352
    iget-object v12, v0, Lax/I1/e;->O:[I

    .line 353
    .line 354
    aput v8, v12, v5

    .line 355
    .line 356
    :goto_163
    add-int/lit8 v12, v14, 0x1

    .line 357
    .line 358
    invoke-direct {v0, v7, v12}, Lax/I1/e;->E(Lax/q1/s;I)V

    .line 359
    .line 360
    .line 361
    iget-object v15, v0, Lax/I1/e;->i:Lax/S0/G;

    .line 362
    .line 363
    invoke-virtual {v15}, Lax/S0/G;->f()[B

    .line 364
    .line 365
    .line 366
    move-result-object v15

    .line 367
    aget-byte v14, v15, v14

    .line 368
    .line 369
    and-int/2addr v14, v13

    .line 370
    iget-object v15, v0, Lax/I1/e;->O:[I

    .line 371
    .line 372
    aget v16, v15, v5

    .line 373
    .line 374
    add-int v16, v16, v14

    .line 375
    .line 376
    aput v16, v15, v5

    .line 377
    .line 378
    if-eq v14, v13, :cond_181

    .line 379
    .line 380
    add-int v11, v11, v16

    .line 381
    .line 382
    add-int/lit8 v5, v5, 0x1

    .line 383
    .line 384
    move v14, v12

    .line 385
    goto :goto_159

    .line 386
    :cond_181
    move v14, v12

    .line 387
    goto :goto_163

    .line 388
    :cond_183
    iget-object v5, v0, Lax/I1/e;->O:[I

    .line 389
    .line 390
    sub-int/2addr v12, v9

    .line 391
    iget v15, v0, Lax/I1/e;->Q:I

    .line 392
    .line 393
    sub-int/2addr v2, v15

    .line 394
    sub-int/2addr v2, v14

    .line 395
    sub-int/2addr v2, v11

    .line 396
    aput v2, v5, v12

    .line 397
    .line 398
    goto :goto_124

    .line 399
    :cond_18e
    if-ne v12, v11, :cond_294

    .line 400
    .line 401
    const/4 v11, 0x0

    .line 402
    const/4 v12, 0x0

    .line 403
    const/4 v14, 0x4

    .line 404
    :goto_193
    iget v15, v0, Lax/I1/e;->N:I

    .line 405
    .line 406
    const/16 v16, 0x1

    .line 407
    .line 408
    add-int/lit8 v9, v15, -0x1

    .line 409
    .line 410
    if-ge v11, v9, :cond_247

    .line 411
    .line 412
    iget-object v9, v0, Lax/I1/e;->O:[I

    .line 413
    .line 414
    aput v8, v9, v11

    .line 415
    .line 416
    add-int/lit8 v9, v14, 0x1

    .line 417
    .line 418
    invoke-direct {v0, v7, v9}, Lax/I1/e;->E(Lax/q1/s;I)V

    .line 419
    .line 420
    .line 421
    iget-object v15, v0, Lax/I1/e;->i:Lax/S0/G;

    .line 422
    .line 423
    invoke-virtual {v15}, Lax/S0/G;->f()[B

    .line 424
    .line 425
    .line 426
    move-result-object v15

    .line 427
    aget-byte v15, v15, v14

    .line 428
    .line 429
    if-eqz v15, :cond_240

    .line 430
    .line 431
    const/4 v15, 0x0

    .line 432
    :goto_1af
    if-ge v15, v10, :cond_209

    .line 433
    .line 434
    rsub-int/lit8 v17, v15, 0x7

    .line 435
    .line 436
    const/16 v18, 0x8

    .line 437
    .line 438
    shl-int v10, v16, v17

    .line 439
    .line 440
    const/16 v17, 0x0

    .line 441
    .line 442
    iget-object v8, v0, Lax/I1/e;->i:Lax/S0/G;

    .line 443
    .line 444
    invoke-virtual {v8}, Lax/S0/G;->f()[B

    .line 445
    .line 446
    .line 447
    move-result-object v8

    .line 448
    aget-byte v8, v8, v14

    .line 449
    .line 450
    and-int/2addr v8, v10

    .line 451
    if-eqz v8, :cond_1fe

    .line 452
    .line 453
    add-int/2addr v9, v15

    .line 454
    invoke-direct {v0, v7, v9}, Lax/I1/e;->E(Lax/q1/s;I)V

    .line 455
    .line 456
    .line 457
    iget-object v8, v0, Lax/I1/e;->i:Lax/S0/G;

    .line 458
    .line 459
    invoke-virtual {v8}, Lax/S0/G;->f()[B

    .line 460
    .line 461
    .line 462
    move-result-object v8

    .line 463
    add-int/lit8 v19, v14, 0x1

    .line 464
    .line 465
    aget-byte v8, v8, v14

    .line 466
    .line 467
    and-int/2addr v8, v13

    .line 468
    not-int v10, v10

    .line 469
    and-int/2addr v8, v10

    .line 470
    int-to-long v6, v8

    .line 471
    :goto_1d6
    move/from16 v8, v19

    .line 472
    .line 473
    if-ge v8, v9, :cond_1ee

    .line 474
    .line 475
    shl-long v6, v6, v18

    .line 476
    .line 477
    iget-object v14, v0, Lax/I1/e;->i:Lax/S0/G;

    .line 478
    .line 479
    invoke-virtual {v14}, Lax/S0/G;->f()[B

    .line 480
    .line 481
    .line 482
    move-result-object v14

    .line 483
    add-int/lit8 v19, v8, 0x1

    .line 484
    .line 485
    aget-byte v8, v14, v8

    .line 486
    .line 487
    and-int/2addr v8, v13

    .line 488
    move/from16 v20, v11

    .line 489
    .line 490
    int-to-long v10, v8

    .line 491
    or-long/2addr v6, v10

    .line 492
    move/from16 v11, v20

    .line 493
    .line 494
    goto :goto_1d6

    .line 495
    :cond_1ee
    move/from16 v20, v11

    .line 496
    .line 497
    if-lez v20, :cond_1fc

    .line 498
    .line 499
    mul-int/lit8 v15, v15, 0x7

    .line 500
    .line 501
    add-int/lit8 v15, v15, 0x6

    .line 502
    .line 503
    const-wide/16 v10, 0x1

    .line 504
    .line 505
    shl-long v14, v10, v15

    .line 506
    .line 507
    sub-long/2addr v14, v10

    .line 508
    sub-long/2addr v6, v14

    .line 509
    :cond_1fc
    :goto_1fc
    move v14, v9

    .line 510
    goto :goto_212

    .line 511
    :cond_1fe
    move/from16 v20, v11

    .line 512
    .line 513
    add-int/lit8 v15, v15, 0x1

    .line 514
    .line 515
    move-object/from16 v7, p3

    .line 516
    .line 517
    const/4 v6, 0x2

    .line 518
    const/4 v8, 0x0

    .line 519
    const/16 v10, 0x8

    .line 520
    .line 521
    goto :goto_1af

    .line 522
    :cond_209
    move/from16 v20, v11

    .line 523
    .line 524
    const/16 v17, 0x0

    .line 525
    .line 526
    const/16 v18, 0x8

    .line 527
    .line 528
    const-wide/16 v6, 0x0

    .line 529
    .line 530
    goto :goto_1fc

    .line 531
    :goto_212
    const-wide/32 v8, -0x80000000

    .line 532
    .line 533
    .line 534
    cmp-long v10, v6, v8

    .line 535
    .line 536
    if-ltz v10, :cond_239

    .line 537
    .line 538
    const-wide/32 v8, 0x7fffffff

    .line 539
    .line 540
    .line 541
    cmp-long v10, v6, v8

    .line 542
    .line 543
    if-gtz v10, :cond_239

    .line 544
    .line 545
    long-to-int v7, v6

    .line 546
    iget-object v6, v0, Lax/I1/e;->O:[I

    .line 547
    .line 548
    if-nez v20, :cond_226

    .line 549
    .line 550
    goto :goto_22b

    .line 551
    :cond_226
    add-int/lit8 v11, v20, -0x1

    .line 552
    .line 553
    aget v8, v6, v11

    .line 554
    .line 555
    add-int/2addr v7, v8

    .line 556
    :goto_22b
    aput v7, v6, v20

    .line 557
    .line 558
    add-int/2addr v12, v7

    .line 559
    add-int/lit8 v11, v20, 0x1

    .line 560
    .line 561
    move-object/from16 v7, p3

    .line 562
    .line 563
    const/4 v6, 0x2

    .line 564
    const/4 v8, 0x0

    .line 565
    const/4 v9, 0x1

    .line 566
    const/16 v10, 0x8

    .line 567
    .line 568
    goto/16 :goto_193

    .line 569
    .line 570
    :cond_239
    const-string v1, "EBML lacing sample size out of range."

    .line 571
    .line 572
    invoke-static {v1, v5}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    throw v1

    .line 577
    :cond_240
    const-string v1, "No valid varint length mask found"

    .line 578
    .line 579
    invoke-static {v1, v5}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    throw v1

    .line 584
    :cond_247
    const/16 v17, 0x0

    .line 585
    .line 586
    const/16 v18, 0x8

    .line 587
    .line 588
    iget-object v5, v0, Lax/I1/e;->O:[I

    .line 589
    .line 590
    add-int/lit8 v15, v15, -0x1

    .line 591
    .line 592
    iget v6, v0, Lax/I1/e;->Q:I

    .line 593
    .line 594
    sub-int/2addr v2, v6

    .line 595
    sub-int/2addr v2, v14

    .line 596
    sub-int/2addr v2, v12

    .line 597
    aput v2, v5, v15

    .line 598
    .line 599
    :goto_256
    iget-object v2, v0, Lax/I1/e;->i:Lax/S0/G;

    .line 600
    .line 601
    invoke-virtual {v2}, Lax/S0/G;->f()[B

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    aget-byte v2, v2, v17

    .line 606
    .line 607
    shl-int/lit8 v2, v2, 0x8

    .line 608
    .line 609
    iget-object v5, v0, Lax/I1/e;->i:Lax/S0/G;

    .line 610
    .line 611
    invoke-virtual {v5}, Lax/S0/G;->f()[B

    .line 612
    .line 613
    .line 614
    move-result-object v5

    .line 615
    aget-byte v5, v5, v16

    .line 616
    .line 617
    and-int/2addr v5, v13

    .line 618
    or-int/2addr v2, v5

    .line 619
    iget-wide v5, v0, Lax/I1/e;->E:J

    .line 620
    .line 621
    int-to-long v7, v2

    .line 622
    invoke-direct {v0, v7, v8}, Lax/I1/e;->G(J)J

    .line 623
    .line 624
    .line 625
    move-result-wide v7

    .line 626
    add-long/2addr v5, v7

    .line 627
    iput-wide v5, v0, Lax/I1/e;->K:J

    .line 628
    .line 629
    iget v2, v3, Lax/I1/e$c;->e:I

    .line 630
    .line 631
    const/4 v10, 0x2

    .line 632
    if-eq v2, v10, :cond_28b

    .line 633
    .line 634
    if-ne v1, v4, :cond_289

    .line 635
    .line 636
    iget-object v2, v0, Lax/I1/e;->i:Lax/S0/G;

    .line 637
    .line 638
    invoke-virtual {v2}, Lax/S0/G;->f()[B

    .line 639
    .line 640
    .line 641
    move-result-object v2

    .line 642
    aget-byte v2, v2, v10

    .line 643
    .line 644
    const/16 v5, 0x80

    .line 645
    .line 646
    and-int/2addr v2, v5

    .line 647
    if-ne v2, v5, :cond_289

    .line 648
    .line 649
    goto :goto_28b

    .line 650
    :cond_289
    const/4 v2, 0x0

    .line 651
    goto :goto_28c

    .line 652
    :cond_28b
    :goto_28b
    const/4 v2, 0x1

    .line 653
    :goto_28c
    iput v2, v0, Lax/I1/e;->R:I

    .line 654
    .line 655
    iput v10, v0, Lax/I1/e;->J:I

    .line 656
    .line 657
    const/4 v2, 0x0

    .line 658
    iput v2, v0, Lax/I1/e;->M:I

    .line 659
    .line 660
    goto :goto_2ac

    .line 661
    :cond_294
    new-instance v1, Ljava/lang/StringBuilder;

    .line 662
    .line 663
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 664
    .line 665
    .line 666
    const-string v2, "Unexpected lacing value: "

    .line 667
    .line 668
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v1

    .line 678
    invoke-static {v1, v5}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 679
    .line 680
    .line 681
    move-result-object v1

    .line 682
    throw v1

    .line 683
    :cond_2aa
    const/16 v16, 0x1

    .line 684
    .line 685
    :goto_2ac
    if-ne v1, v4, :cond_2e2

    .line 686
    .line 687
    :goto_2ae
    iget v1, v0, Lax/I1/e;->M:I

    .line 688
    .line 689
    iget v2, v0, Lax/I1/e;->N:I

    .line 690
    .line 691
    if-ge v1, v2, :cond_2de

    .line 692
    .line 693
    iget-object v2, v0, Lax/I1/e;->O:[I

    .line 694
    .line 695
    aget v1, v2, v1

    .line 696
    .line 697
    move-object/from16 v7, p3

    .line 698
    .line 699
    const/4 v2, 0x0

    .line 700
    invoke-direct {v0, v7, v3, v1, v2}, Lax/I1/e;->K(Lax/q1/s;Lax/I1/e$c;IZ)I

    .line 701
    .line 702
    .line 703
    move-result v5

    .line 704
    iget-wide v1, v0, Lax/I1/e;->K:J

    .line 705
    .line 706
    iget v4, v0, Lax/I1/e;->M:I

    .line 707
    .line 708
    iget v6, v3, Lax/I1/e$c;->f:I

    .line 709
    .line 710
    mul-int v4, v4, v6

    .line 711
    .line 712
    div-int/lit16 v4, v4, 0x3e8

    .line 713
    .line 714
    int-to-long v8, v4

    .line 715
    add-long/2addr v1, v8

    .line 716
    iget v4, v0, Lax/I1/e;->R:I

    .line 717
    .line 718
    const/4 v6, 0x0

    .line 719
    move-wide/from16 v21, v1

    .line 720
    .line 721
    move-object v1, v3

    .line 722
    move-wide/from16 v2, v21

    .line 723
    .line 724
    invoke-direct/range {v0 .. v6}, Lax/I1/e;->q(Lax/I1/e$c;JIII)V

    .line 725
    .line 726
    .line 727
    iget v2, v0, Lax/I1/e;->M:I

    .line 728
    .line 729
    add-int/lit8 v2, v2, 0x1

    .line 730
    .line 731
    iput v2, v0, Lax/I1/e;->M:I

    .line 732
    .line 733
    move-object v3, v1

    .line 734
    goto :goto_2ae

    .line 735
    :cond_2de
    const/4 v2, 0x0

    .line 736
    iput v2, v0, Lax/I1/e;->J:I

    .line 737
    .line 738
    return-void

    .line 739
    :cond_2e2
    move-object/from16 v7, p3

    .line 740
    .line 741
    move-object v1, v3

    .line 742
    :goto_2e5
    iget v2, v0, Lax/I1/e;->M:I

    .line 743
    .line 744
    iget v3, v0, Lax/I1/e;->N:I

    .line 745
    .line 746
    if-ge v2, v3, :cond_2fe

    .line 747
    .line 748
    iget-object v3, v0, Lax/I1/e;->O:[I

    .line 749
    .line 750
    aget v4, v3, v2

    .line 751
    .line 752
    const/4 v5, 0x1

    .line 753
    invoke-direct {v0, v7, v1, v4, v5}, Lax/I1/e;->K(Lax/q1/s;Lax/I1/e$c;IZ)I

    .line 754
    .line 755
    .line 756
    move-result v4

    .line 757
    aput v4, v3, v2

    .line 758
    .line 759
    iget v2, v0, Lax/I1/e;->M:I

    .line 760
    .line 761
    add-int/2addr v2, v5

    .line 762
    iput v2, v0, Lax/I1/e;->M:I

    .line 763
    .line 764
    const/16 v16, 0x1

    .line 765
    .line 766
    goto :goto_2e5

    .line 767
    :cond_2fe
    :goto_2fe
    return-void
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
.end method

.method protected r(I)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-direct {p0}, Lax/I1/e;->n()V

    .line 4
    .line 5
    .line 6
    const/16 v2, 0xa0

    .line 7
    .line 8
    if-eq p1, v2, :cond_fd

    .line 9
    .line 10
    const/16 v2, 0xae

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eq p1, v2, :cond_d3

    .line 14
    .line 15
    const/16 v2, 0x4dbb

    .line 16
    .line 17
    const v4, 0x1c53bb6b

    .line 18
    .line 19
    .line 20
    if-eq p1, v2, :cond_ba

    .line 21
    .line 22
    const/16 v2, 0x6240

    .line 23
    .line 24
    if-eq p1, v2, :cond_8b

    .line 25
    .line 26
    const/16 v0, 0x6d80

    .line 27
    .line 28
    if-eq p1, v0, :cond_75

    .line 29
    .line 30
    const v0, 0x1549a966

    .line 31
    .line 32
    .line 33
    if-eq p1, v0, :cond_58

    .line 34
    .line 35
    const v0, 0x1654ae6b

    .line 36
    .line 37
    .line 38
    if-eq p1, v0, :cond_43

    .line 39
    .line 40
    if-eq p1, v4, :cond_2b

    .line 41
    .line 42
    goto/16 :goto_102

    .line 43
    .line 44
    :cond_2b
    iget-boolean p1, p0, Lax/I1/e;->y:Z

    .line 45
    .line 46
    if-nez p1, :cond_3e

    .line 47
    .line 48
    iget-object p1, p0, Lax/I1/e;->e0:Lax/q1/t;

    .line 49
    .line 50
    iget-object v0, p0, Lax/I1/e;->F:Lax/S0/v;

    .line 51
    .line 52
    iget-object v2, p0, Lax/I1/e;->G:Lax/S0/v;

    .line 53
    .line 54
    invoke-direct {p0, v0, v2}, Lax/I1/e;->p(Lax/S0/v;Lax/S0/v;)Lax/q1/N;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-interface {p1, v0}, Lax/q1/t;->h(Lax/q1/N;)V

    .line 59
    .line 60
    .line 61
    iput-boolean v1, p0, Lax/I1/e;->y:Z

    .line 62
    .line 63
    :cond_3e
    iput-object v3, p0, Lax/I1/e;->F:Lax/S0/v;

    .line 64
    .line 65
    iput-object v3, p0, Lax/I1/e;->G:Lax/S0/v;

    .line 66
    .line 67
    return-void

    .line 68
    :cond_43
    iget-object p1, p0, Lax/I1/e;->c:Landroid/util/SparseArray;

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_51

    .line 75
    .line 76
    iget-object p1, p0, Lax/I1/e;->e0:Lax/q1/t;

    .line 77
    .line 78
    invoke-interface {p1}, Lax/q1/t;->o()V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_51
    const-string p1, "No valid tracks were found"

    .line 83
    .line 84
    invoke-static {p1, v3}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    throw p1

    .line 89
    :cond_58
    iget-wide v0, p0, Lax/I1/e;->t:J

    .line 90
    .line 91
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    cmp-long p1, v0, v2

    .line 97
    .line 98
    if-nez p1, :cond_68

    .line 99
    .line 100
    const-wide/32 v0, 0xf4240

    .line 101
    .line 102
    .line 103
    iput-wide v0, p0, Lax/I1/e;->t:J

    .line 104
    .line 105
    :cond_68
    iget-wide v0, p0, Lax/I1/e;->u:J

    .line 106
    .line 107
    cmp-long p1, v0, v2

    .line 108
    .line 109
    if-eqz p1, :cond_102

    .line 110
    .line 111
    invoke-direct {p0, v0, v1}, Lax/I1/e;->G(J)J

    .line 112
    .line 113
    .line 114
    move-result-wide v0

    .line 115
    iput-wide v0, p0, Lax/I1/e;->v:J

    .line 116
    .line 117
    return-void

    .line 118
    :cond_75
    invoke-direct {p0, p1}, Lax/I1/e;->m(I)V

    .line 119
    .line 120
    .line 121
    iget-object p1, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 122
    .line 123
    iget-boolean v0, p1, Lax/I1/e$c;->i:Z

    .line 124
    .line 125
    if-eqz v0, :cond_102

    .line 126
    .line 127
    iget-object p1, p1, Lax/I1/e$c;->j:[B

    .line 128
    .line 129
    if-nez p1, :cond_84

    .line 130
    .line 131
    goto/16 :goto_102

    .line 132
    .line 133
    :cond_84
    const-string p1, "Combining encryption and compression is not supported"

    .line 134
    .line 135
    invoke-static {p1, v3}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    throw p1

    .line 140
    :cond_8b
    invoke-direct {p0, p1}, Lax/I1/e;->m(I)V

    .line 141
    .line 142
    .line 143
    iget-object p1, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 144
    .line 145
    iget-boolean v2, p1, Lax/I1/e$c;->i:Z

    .line 146
    .line 147
    if-eqz v2, :cond_102

    .line 148
    .line 149
    iget-object v2, p1, Lax/I1/e$c;->k:Lax/q1/U$a;

    .line 150
    .line 151
    if-eqz v2, :cond_b3

    .line 152
    .line 153
    new-instance v2, Lax/P0/o;

    .line 154
    .line 155
    new-instance v3, Lax/P0/o$b;

    .line 156
    .line 157
    sget-object v4, Lax/P0/i;->a:Ljava/util/UUID;

    .line 158
    .line 159
    iget-object v5, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 160
    .line 161
    iget-object v5, v5, Lax/I1/e$c;->k:Lax/q1/U$a;

    .line 162
    .line 163
    iget-object v5, v5, Lax/q1/U$a;->b:[B

    .line 164
    .line 165
    const-string v6, "video/webm"

    .line 166
    .line 167
    invoke-direct {v3, v4, v6, v5}, Lax/P0/o$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    .line 168
    .line 169
    .line 170
    new-array v1, v1, [Lax/P0/o$b;

    .line 171
    .line 172
    aput-object v3, v1, v0

    .line 173
    .line 174
    invoke-direct {v2, v1}, Lax/P0/o;-><init>([Lax/P0/o$b;)V

    .line 175
    .line 176
    .line 177
    iput-object v2, p1, Lax/I1/e$c;->m:Lax/P0/o;

    .line 178
    .line 179
    return-void

    .line 180
    :cond_b3
    const-string p1, "Encrypted Track found but ContentEncKeyID was not found"

    .line 181
    .line 182
    invoke-static {p1, v3}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    throw p1

    .line 187
    :cond_ba
    iget p1, p0, Lax/I1/e;->z:I

    .line 188
    .line 189
    const/4 v0, -0x1

    .line 190
    if-eq p1, v0, :cond_cc

    .line 191
    .line 192
    iget-wide v0, p0, Lax/I1/e;->A:J

    .line 193
    .line 194
    const-wide/16 v5, -0x1

    .line 195
    .line 196
    cmp-long v2, v0, v5

    .line 197
    .line 198
    if-eqz v2, :cond_cc

    .line 199
    .line 200
    if-ne p1, v4, :cond_102

    .line 201
    .line 202
    iput-wide v0, p0, Lax/I1/e;->C:J

    .line 203
    .line 204
    return-void

    .line 205
    :cond_cc
    const-string p1, "Mandatory element SeekID or SeekPosition not found"

    .line 206
    .line 207
    invoke-static {p1, v3}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    throw p1

    .line 212
    :cond_d3
    iget-object p1, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 213
    .line 214
    invoke-static {p1}, Lax/S0/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    check-cast p1, Lax/I1/e$c;

    .line 219
    .line 220
    iget-object v0, p1, Lax/I1/e$c;->c:Ljava/lang/String;

    .line 221
    .line 222
    if-eqz v0, :cond_f6

    .line 223
    .line 224
    invoke-static {v0}, Lax/I1/e;->B(Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_f3

    .line 229
    .line 230
    iget-object v0, p0, Lax/I1/e;->e0:Lax/q1/t;

    .line 231
    .line 232
    iget v1, p1, Lax/I1/e$c;->d:I

    .line 233
    .line 234
    invoke-virtual {p1, v0, v1}, Lax/I1/e$c;->i(Lax/q1/t;I)V

    .line 235
    .line 236
    .line 237
    iget-object v0, p0, Lax/I1/e;->c:Landroid/util/SparseArray;

    .line 238
    .line 239
    iget v1, p1, Lax/I1/e$c;->d:I

    .line 240
    .line 241
    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :cond_f3
    iput-object v3, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 245
    .line 246
    return-void

    .line 247
    :cond_f6
    const-string p1, "CodecId is missing in TrackEntry element"

    .line 248
    .line 249
    invoke-static {p1, v3}, Lax/P0/E;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lax/P0/E;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    throw p1

    .line 254
    :cond_fd
    iget p1, p0, Lax/I1/e;->J:I

    .line 255
    .line 256
    const/4 v2, 0x2

    .line 257
    if-eq p1, v2, :cond_103

    .line 258
    .line 259
    :cond_102
    :goto_102
    return-void

    .line 260
    :cond_103
    iget-object p1, p0, Lax/I1/e;->c:Landroid/util/SparseArray;

    .line 261
    .line 262
    iget v2, p0, Lax/I1/e;->P:I

    .line 263
    .line 264
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    move-object v3, p1

    .line 269
    check-cast v3, Lax/I1/e$c;

    .line 270
    .line 271
    invoke-static {v3}, Lax/I1/e$c;->a(Lax/I1/e$c;)V

    .line 272
    .line 273
    .line 274
    iget-wide v4, p0, Lax/I1/e;->U:J

    .line 275
    .line 276
    const-wide/16 v6, 0x0

    .line 277
    .line 278
    cmp-long p1, v4, v6

    .line 279
    .line 280
    if-lez p1, :cond_13e

    .line 281
    .line 282
    const-string p1, "A_OPUS"

    .line 283
    .line 284
    iget-object v2, v3, Lax/I1/e$c;->c:Ljava/lang/String;

    .line 285
    .line 286
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result p1

    .line 290
    if-eqz p1, :cond_13e

    .line 291
    .line 292
    iget-object p1, p0, Lax/I1/e;->p:Lax/S0/G;

    .line 293
    .line 294
    const/16 v2, 0x8

    .line 295
    .line 296
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 301
    .line 302
    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    iget-wide v4, p0, Lax/I1/e;->U:J

    .line 307
    .line 308
    invoke-virtual {v2, v4, v5}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    invoke-virtual {p1, v2}, Lax/S0/G;->Y([B)V

    .line 317
    .line 318
    .line 319
    :cond_13e
    const/4 p1, 0x0

    .line 320
    const/4 v2, 0x0

    .line 321
    :goto_140
    iget v4, p0, Lax/I1/e;->N:I

    .line 322
    .line 323
    if-ge p1, v4, :cond_14b

    .line 324
    .line 325
    iget-object v4, p0, Lax/I1/e;->O:[I

    .line 326
    .line 327
    aget v4, v4, p1

    .line 328
    .line 329
    add-int/2addr v2, v4

    .line 330
    add-int/2addr p1, v1

    .line 331
    goto :goto_140

    .line 332
    :cond_14b
    const/4 p1, 0x0

    .line 333
    :goto_14c
    iget v4, p0, Lax/I1/e;->N:I

    .line 334
    .line 335
    if-ge p1, v4, :cond_170

    .line 336
    .line 337
    iget-wide v4, p0, Lax/I1/e;->K:J

    .line 338
    .line 339
    iget v6, v3, Lax/I1/e$c;->f:I

    .line 340
    .line 341
    mul-int v6, v6, p1

    .line 342
    .line 343
    div-int/lit16 v6, v6, 0x3e8

    .line 344
    .line 345
    int-to-long v6, v6

    .line 346
    add-long/2addr v4, v6

    .line 347
    iget v6, p0, Lax/I1/e;->R:I

    .line 348
    .line 349
    if-nez p1, :cond_163

    .line 350
    .line 351
    iget-boolean v7, p0, Lax/I1/e;->T:Z

    .line 352
    .line 353
    if-nez v7, :cond_163

    .line 354
    .line 355
    or-int/2addr v6, v1

    .line 356
    :cond_163
    iget-object v7, p0, Lax/I1/e;->O:[I

    .line 357
    .line 358
    aget v7, v7, p1

    .line 359
    .line 360
    sub-int v8, v2, v7

    .line 361
    .line 362
    move-object v2, p0

    .line 363
    invoke-direct/range {v2 .. v8}, Lax/I1/e;->q(Lax/I1/e$c;JIII)V

    .line 364
    .line 365
    .line 366
    add-int/2addr p1, v1

    .line 367
    move v2, v8

    .line 368
    goto :goto_14c

    .line 369
    :cond_170
    move-object v2, p0

    .line 370
    iput v0, v2, Lax/I1/e;->J:I

    .line 371
    .line 372
    return-void
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

.method protected u(ID)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    const/16 v0, 0xb5

    .line 2
    .line 3
    if-eq p1, v0, :cond_7b

    .line 4
    .line 5
    const/16 v0, 0x4489

    .line 6
    .line 7
    if-eq p1, v0, :cond_77

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_84

    .line 10
    .line 11
    .line 12
    packed-switch p1, :pswitch_data_9c

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_f
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    double-to-float p2, p2

    .line 21
    iput p2, p1, Lax/I1/e$c;->w:F

    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_17
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    double-to-float p2, p2

    .line 29
    iput p2, p1, Lax/I1/e$c;->v:F

    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1f
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    double-to-float p2, p2

    .line 37
    iput p2, p1, Lax/I1/e$c;->u:F

    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_27
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    double-to-float p2, p2

    .line 45
    iput p2, p1, Lax/I1/e$c;->O:F

    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_2f
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    double-to-float p2, p2

    .line 53
    iput p2, p1, Lax/I1/e$c;->N:F

    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_37
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    double-to-float p2, p2

    .line 61
    iput p2, p1, Lax/I1/e$c;->M:F

    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_3f
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    double-to-float p2, p2

    .line 69
    iput p2, p1, Lax/I1/e$c;->L:F

    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_47
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    double-to-float p2, p2

    .line 77
    iput p2, p1, Lax/I1/e$c;->K:F

    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_4f
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    double-to-float p2, p2

    .line 85
    iput p2, p1, Lax/I1/e$c;->J:F

    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_57
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    double-to-float p2, p2

    .line 93
    iput p2, p1, Lax/I1/e$c;->I:F

    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_5f
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    double-to-float p2, p2

    .line 101
    iput p2, p1, Lax/I1/e$c;->H:F

    .line 102
    .line 103
    return-void

    .line 104
    :pswitch_67
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    double-to-float p2, p2

    .line 109
    iput p2, p1, Lax/I1/e$c;->G:F

    .line 110
    .line 111
    return-void

    .line 112
    :pswitch_6f
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    double-to-float p2, p2

    .line 117
    iput p2, p1, Lax/I1/e$c;->F:F

    .line 118
    .line 119
    return-void

    .line 120
    :cond_77
    double-to-long p1, p2

    .line 121
    iput-wide p1, p0, Lax/I1/e;->u:J

    .line 122
    .line 123
    return-void

    .line 124
    :cond_7b
    invoke-virtual {p0, p1}, Lax/I1/e;->w(I)Lax/I1/e$c;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    double-to-int p2, p2

    .line 129
    iput p2, p1, Lax/I1/e$c;->S:I

    .line 130
    .line 131
    return-void

    .line 132
    nop

    .line 133
    :pswitch_data_84
    .packed-switch 0x55d1
        :pswitch_6f
        :pswitch_67
        :pswitch_5f
        :pswitch_57
        :pswitch_4f
        :pswitch_47
        :pswitch_3f
        :pswitch_37
        :pswitch_2f
        :pswitch_27
    .end packed-switch

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    :pswitch_data_9c
    .packed-switch 0x7673
        :pswitch_1f
        :pswitch_17
        :pswitch_f
    .end packed-switch
.end method

.method protected w(I)Lax/I1/e$c;
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/P0/E;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lax/I1/e;->m(I)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lax/I1/e;->x:Lax/I1/e$c;

    .line 5
    .line 6
    return-object p1
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
    .line 22
.end method

.method protected x(I)I
    .registers 2

    .line 1
    sparse-switch p1, :sswitch_data_10

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    return p1

    .line 6
    :sswitch_5
    const/4 p1, 0x5

    .line 7
    return p1

    .line 8
    :sswitch_7
    const/4 p1, 0x4

    .line 9
    return p1

    .line 10
    :sswitch_9
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :sswitch_b
    const/4 p1, 0x3

    .line 13
    return p1

    .line 14
    :sswitch_d
    const/4 p1, 0x2

    .line 15
    return p1

    .line 16
    nop

    .line 17
    :sswitch_data_10
    .sparse-switch
        0x83 -> :sswitch_d
        0x86 -> :sswitch_b
        0x88 -> :sswitch_d
        0x9b -> :sswitch_d
        0x9f -> :sswitch_d
        0xa0 -> :sswitch_9
        0xa1 -> :sswitch_7
        0xa3 -> :sswitch_7
        0xa5 -> :sswitch_7
        0xa6 -> :sswitch_9
        0xae -> :sswitch_9
        0xb0 -> :sswitch_d
        0xb3 -> :sswitch_d
        0xb5 -> :sswitch_5
        0xb7 -> :sswitch_9
        0xba -> :sswitch_d
        0xbb -> :sswitch_9
        0xd7 -> :sswitch_d
        0xe0 -> :sswitch_9
        0xe1 -> :sswitch_9
        0xe7 -> :sswitch_d
        0xee -> :sswitch_d
        0xf1 -> :sswitch_d
        0xfb -> :sswitch_d
        0x41e4 -> :sswitch_9
        0x41e7 -> :sswitch_d
        0x41ed -> :sswitch_7
        0x4254 -> :sswitch_d
        0x4255 -> :sswitch_7
        0x4282 -> :sswitch_b
        0x4285 -> :sswitch_d
        0x42f7 -> :sswitch_d
        0x4489 -> :sswitch_5
        0x47e1 -> :sswitch_d
        0x47e2 -> :sswitch_7
        0x47e7 -> :sswitch_9
        0x47e8 -> :sswitch_d
        0x4dbb -> :sswitch_9
        0x5031 -> :sswitch_d
        0x5032 -> :sswitch_d
        0x5034 -> :sswitch_9
        0x5035 -> :sswitch_9
        0x536e -> :sswitch_b
        0x53ab -> :sswitch_7
        0x53ac -> :sswitch_d
        0x53b8 -> :sswitch_d
        0x54b0 -> :sswitch_d
        0x54b2 -> :sswitch_d
        0x54ba -> :sswitch_d
        0x55aa -> :sswitch_d
        0x55b0 -> :sswitch_9
        0x55b2 -> :sswitch_d
        0x55b9 -> :sswitch_d
        0x55ba -> :sswitch_d
        0x55bb -> :sswitch_d
        0x55bc -> :sswitch_d
        0x55bd -> :sswitch_d
        0x55d0 -> :sswitch_9
        0x55d1 -> :sswitch_5
        0x55d2 -> :sswitch_5
        0x55d3 -> :sswitch_5
        0x55d4 -> :sswitch_5
        0x55d5 -> :sswitch_5
        0x55d6 -> :sswitch_5
        0x55d7 -> :sswitch_5
        0x55d8 -> :sswitch_5
        0x55d9 -> :sswitch_5
        0x55da -> :sswitch_5
        0x55ee -> :sswitch_d
        0x56aa -> :sswitch_d
        0x56bb -> :sswitch_d
        0x6240 -> :sswitch_9
        0x6264 -> :sswitch_d
        0x63a2 -> :sswitch_7
        0x6d80 -> :sswitch_9
        0x75a1 -> :sswitch_9
        0x75a2 -> :sswitch_d
        0x7670 -> :sswitch_9
        0x7671 -> :sswitch_d
        0x7672 -> :sswitch_7
        0x7673 -> :sswitch_5
        0x7674 -> :sswitch_5
        0x7675 -> :sswitch_5
        0x22b59c -> :sswitch_b
        0x23e383 -> :sswitch_d
        0x2ad7b1 -> :sswitch_d
        0x114d9b74 -> :sswitch_9
        0x1549a966 -> :sswitch_9
        0x1654ae6b -> :sswitch_9
        0x18538067 -> :sswitch_9
        0x1a45dfa3 -> :sswitch_9
        0x1c53bb6b -> :sswitch_9
        0x1f43b675 -> :sswitch_9
    .end sparse-switch
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method protected y(Lax/I1/e$c;Lax/q1/s;I)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lax/I1/e$c;->b(Lax/I1/e$c;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x64767643

    .line 6
    .line 7
    .line 8
    if-eq v0, v1, :cond_17

    .line 9
    .line 10
    invoke-static {p1}, Lax/I1/e$c;->b(Lax/I1/e$c;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const v1, 0x64766343

    .line 15
    .line 16
    .line 17
    if-ne v0, v1, :cond_13

    .line 18
    .line 19
    goto :goto_17

    .line 20
    :cond_13
    invoke-interface {p2, p3}, Lax/q1/s;->n(I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_17
    :goto_17
    new-array v0, p3, [B

    .line 25
    .line 26
    iput-object v0, p1, Lax/I1/e$c;->P:[B

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-interface {p2, v0, p1, p3}, Lax/q1/s;->readFully([BII)V

    .line 30
    .line 31
    .line 32
    return-void
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

.method protected z(Lax/I1/e$c;ILax/q1/s;I)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x4

    .line 2
    if-ne p2, v0, :cond_1d

    .line 3
    .line 4
    const-string p2, "V_VP9"

    .line 5
    .line 6
    iget-object p1, p1, Lax/I1/e$c;->c:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_1d

    .line 13
    .line 14
    iget-object p1, p0, Lax/I1/e;->p:Lax/S0/G;

    .line 15
    .line 16
    invoke-virtual {p1, p4}, Lax/S0/G;->X(I)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lax/I1/e;->p:Lax/S0/G;

    .line 20
    .line 21
    invoke-virtual {p1}, Lax/S0/G;->f()[B

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 p2, 0x0

    .line 26
    invoke-interface {p3, p1, p2, p4}, Lax/q1/s;->readFully([BII)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1d
    invoke-interface {p3, p4}, Lax/q1/s;->n(I)V

    .line 31
    .line 32
    .line 33
    return-void
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
