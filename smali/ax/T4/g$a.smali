.class public final enum Lax/T4/g$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/T4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lax/T4/g$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum d0:Lax/T4/g$a;

.field public static final enum e0:Lax/T4/g$a;

.field public static final enum f0:Lax/T4/g$a;

.field public static final enum g0:Lax/T4/g$a;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum h0:Lax/T4/g$a;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum i0:Lax/T4/g$a;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum j0:Lax/T4/g$a;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum k0:Lax/T4/g$a;

.field public static final enum l0:Lax/T4/g$a;

.field public static final enum m0:Lax/T4/g$a;

.field public static final enum n0:Lax/T4/g$a;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum o0:Lax/T4/g$a;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final synthetic p0:[Lax/T4/g$a;


# instance fields
.field private final c0:I

.field private final q:Z


# direct methods
.method static constructor <clinit>()V
    .registers 25

    .line 1
    new-instance v0, Lax/T4/g$a;

    .line 2
    .line 3
    const-string v1, "AUTO_CLOSE_TARGET"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lax/T4/g$a;-><init>(Ljava/lang/String;IZ)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lax/T4/g$a;->d0:Lax/T4/g$a;

    .line 11
    .line 12
    new-instance v1, Lax/T4/g$a;

    .line 13
    .line 14
    const-string v4, "AUTO_CLOSE_JSON_CONTENT"

    .line 15
    .line 16
    invoke-direct {v1, v4, v3, v3}, Lax/T4/g$a;-><init>(Ljava/lang/String;IZ)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lax/T4/g$a;->e0:Lax/T4/g$a;

    .line 20
    .line 21
    new-instance v4, Lax/T4/g$a;

    .line 22
    .line 23
    const-string v5, "FLUSH_PASSED_TO_STREAM"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v4, v5, v6, v3}, Lax/T4/g$a;-><init>(Ljava/lang/String;IZ)V

    .line 27
    .line 28
    .line 29
    sput-object v4, Lax/T4/g$a;->f0:Lax/T4/g$a;

    .line 30
    .line 31
    new-instance v5, Lax/T4/g$a;

    .line 32
    .line 33
    const-string v7, "QUOTE_FIELD_NAMES"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8, v3}, Lax/T4/g$a;-><init>(Ljava/lang/String;IZ)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lax/T4/g$a;->g0:Lax/T4/g$a;

    .line 40
    .line 41
    new-instance v7, Lax/T4/g$a;

    .line 42
    .line 43
    const-string v9, "QUOTE_NON_NUMERIC_NUMBERS"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10, v3}, Lax/T4/g$a;-><init>(Ljava/lang/String;IZ)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lax/T4/g$a;->h0:Lax/T4/g$a;

    .line 50
    .line 51
    new-instance v9, Lax/T4/g$a;

    .line 52
    .line 53
    const-string v11, "ESCAPE_NON_ASCII"

    .line 54
    .line 55
    const/4 v12, 0x5

    .line 56
    invoke-direct {v9, v11, v12, v2}, Lax/T4/g$a;-><init>(Ljava/lang/String;IZ)V

    .line 57
    .line 58
    .line 59
    sput-object v9, Lax/T4/g$a;->i0:Lax/T4/g$a;

    .line 60
    .line 61
    new-instance v11, Lax/T4/g$a;

    .line 62
    .line 63
    const-string v13, "WRITE_NUMBERS_AS_STRINGS"

    .line 64
    .line 65
    const/4 v14, 0x6

    .line 66
    invoke-direct {v11, v13, v14, v2}, Lax/T4/g$a;-><init>(Ljava/lang/String;IZ)V

    .line 67
    .line 68
    .line 69
    sput-object v11, Lax/T4/g$a;->j0:Lax/T4/g$a;

    .line 70
    .line 71
    new-instance v13, Lax/T4/g$a;

    .line 72
    .line 73
    const-string v15, "WRITE_BIGDECIMAL_AS_PLAIN"

    .line 74
    .line 75
    const/16 v16, 0x2

    .line 76
    .line 77
    const/4 v6, 0x7

    .line 78
    invoke-direct {v13, v15, v6, v2}, Lax/T4/g$a;-><init>(Ljava/lang/String;IZ)V

    .line 79
    .line 80
    .line 81
    sput-object v13, Lax/T4/g$a;->k0:Lax/T4/g$a;

    .line 82
    .line 83
    new-instance v15, Lax/T4/g$a;

    .line 84
    .line 85
    const/16 v17, 0x7

    .line 86
    .line 87
    const-string v6, "STRICT_DUPLICATE_DETECTION"

    .line 88
    .line 89
    const/16 v18, 0x3

    .line 90
    .line 91
    const/16 v8, 0x8

    .line 92
    .line 93
    invoke-direct {v15, v6, v8, v2}, Lax/T4/g$a;-><init>(Ljava/lang/String;IZ)V

    .line 94
    .line 95
    .line 96
    sput-object v15, Lax/T4/g$a;->l0:Lax/T4/g$a;

    .line 97
    .line 98
    new-instance v6, Lax/T4/g$a;

    .line 99
    .line 100
    const/16 v19, 0x8

    .line 101
    .line 102
    const-string v8, "IGNORE_UNKNOWN"

    .line 103
    .line 104
    const/16 v20, 0x4

    .line 105
    .line 106
    const/16 v10, 0x9

    .line 107
    .line 108
    invoke-direct {v6, v8, v10, v2}, Lax/T4/g$a;-><init>(Ljava/lang/String;IZ)V

    .line 109
    .line 110
    .line 111
    sput-object v6, Lax/T4/g$a;->m0:Lax/T4/g$a;

    .line 112
    .line 113
    new-instance v8, Lax/T4/g$a;

    .line 114
    .line 115
    const/16 v21, 0x9

    .line 116
    .line 117
    const-string v10, "USE_FAST_DOUBLE_WRITER"

    .line 118
    .line 119
    const/16 v22, 0x5

    .line 120
    .line 121
    const/16 v12, 0xa

    .line 122
    .line 123
    invoke-direct {v8, v10, v12, v2}, Lax/T4/g$a;-><init>(Ljava/lang/String;IZ)V

    .line 124
    .line 125
    .line 126
    sput-object v8, Lax/T4/g$a;->n0:Lax/T4/g$a;

    .line 127
    .line 128
    new-instance v10, Lax/T4/g$a;

    .line 129
    .line 130
    const/16 v23, 0x0

    .line 131
    .line 132
    const-string v2, "WRITE_HEX_UPPER_CASE"

    .line 133
    .line 134
    const/16 v24, 0xa

    .line 135
    .line 136
    const/16 v12, 0xb

    .line 137
    .line 138
    invoke-direct {v10, v2, v12, v3}, Lax/T4/g$a;-><init>(Ljava/lang/String;IZ)V

    .line 139
    .line 140
    .line 141
    sput-object v10, Lax/T4/g$a;->o0:Lax/T4/g$a;

    .line 142
    .line 143
    const/16 v2, 0xc

    .line 144
    .line 145
    new-array v2, v2, [Lax/T4/g$a;

    .line 146
    .line 147
    aput-object v0, v2, v23

    .line 148
    .line 149
    aput-object v1, v2, v3

    .line 150
    .line 151
    aput-object v4, v2, v16

    .line 152
    .line 153
    aput-object v5, v2, v18

    .line 154
    .line 155
    aput-object v7, v2, v20

    .line 156
    .line 157
    aput-object v9, v2, v22

    .line 158
    .line 159
    aput-object v11, v2, v14

    .line 160
    .line 161
    aput-object v13, v2, v17

    .line 162
    .line 163
    aput-object v15, v2, v19

    .line 164
    .line 165
    aput-object v6, v2, v21

    .line 166
    .line 167
    aput-object v8, v2, v24

    .line 168
    .line 169
    aput-object v10, v2, v12

    .line 170
    .line 171
    sput-object v2, Lax/T4/g$a;->p0:[Lax/T4/g$a;

    .line 172
    .line 173
    return-void
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

.method private constructor <init>(Ljava/lang/String;IZ)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Lax/T4/g$a;->q:Z

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    shl-int/2addr p1, p2

    .line 12
    iput p1, p0, Lax/T4/g$a;->c0:I

    .line 13
    .line 14
    return-void
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

.method public static d()I
    .registers 6

    .line 1
    invoke-static {}, Lax/T4/g$a;->values()[Lax/T4/g$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_7
    if-ge v2, v1, :cond_19

    .line 9
    .line 10
    aget-object v4, v0, v2

    .line 11
    .line 12
    invoke-virtual {v4}, Lax/T4/g$a;->h()Z

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    if-eqz v5, :cond_16

    .line 17
    .line 18
    invoke-virtual {v4}, Lax/T4/g$a;->l()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    or-int/2addr v3, v4

    .line 23
    :cond_16
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_7

    .line 26
    :cond_19
    return v3
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

.method public static valueOf(Ljava/lang/String;)Lax/T4/g$a;
    .registers 2

    .line 1
    const-class v0, Lax/T4/g$a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lax/T4/g$a;

    .line 8
    .line 9
    return-object p0
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

.method public static values()[Lax/T4/g$a;
    .registers 1

    .line 1
    sget-object v0, Lax/T4/g$a;->p0:[Lax/T4/g$a;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lax/T4/g$a;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lax/T4/g$a;

    .line 8
    .line 9
    return-object v0
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


# virtual methods
.method public h()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/T4/g$a;->q:Z

    .line 2
    .line 3
    return v0
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

.method public j(I)Z
    .registers 3

    .line 1
    iget v0, p0, Lax/T4/g$a;->c0:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    if-eqz p1, :cond_7

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1

    .line 8
    :cond_7
    const/4 p1, 0x0

    .line 9
    return p1
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

.method public l()I
    .registers 2

    .line 1
    iget v0, p0, Lax/T4/g$a;->c0:I

    .line 2
    .line 3
    return v0
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
