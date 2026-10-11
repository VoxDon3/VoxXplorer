.class public final enum Lax/Z4/e;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lax/b5/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lax/Z4/e;",
        ">;",
        "Lax/b5/g;"
    }
.end annotation


# static fields
.field public static final enum e0:Lax/Z4/e;

.field public static final enum f0:Lax/Z4/e;

.field public static final enum g0:Lax/Z4/e;

.field public static final enum h0:Lax/Z4/e;

.field public static final enum i0:Lax/Z4/e;

.field public static final enum j0:Lax/Z4/e;

.field public static final enum k0:Lax/Z4/e;

.field public static final enum l0:Lax/Z4/e;

.field public static final enum m0:Lax/Z4/e;

.field public static final enum n0:Lax/Z4/e;

.field public static final enum o0:Lax/Z4/e;

.field public static final enum p0:Lax/Z4/e;

.field public static final enum q0:Lax/Z4/e;

.field private static final synthetic r0:[Lax/Z4/e;


# instance fields
.field private final c0:I

.field private final d0:Lax/T4/j$a;

.field private final q:Z


# direct methods
.method static constructor <clinit>()V
    .registers 28

    .line 1
    new-instance v0, Lax/Z4/e;

    .line 2
    .line 3
    sget-object v1, Lax/T4/j$a;->e0:Lax/T4/j$a;

    .line 4
    .line 5
    const-string v2, "ALLOW_JAVA_COMMENTS"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v3, v1}, Lax/Z4/e;-><init>(Ljava/lang/String;IZLax/T4/j$a;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lax/Z4/e;->e0:Lax/Z4/e;

    .line 12
    .line 13
    new-instance v1, Lax/Z4/e;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    sget-object v4, Lax/T4/j$a;->f0:Lax/T4/j$a;

    .line 17
    .line 18
    const-string v5, "ALLOW_YAML_COMMENTS"

    .line 19
    .line 20
    invoke-direct {v1, v5, v2, v3, v4}, Lax/Z4/e;-><init>(Ljava/lang/String;IZLax/T4/j$a;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lax/Z4/e;->f0:Lax/Z4/e;

    .line 24
    .line 25
    new-instance v4, Lax/Z4/e;

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    sget-object v6, Lax/T4/j$a;->h0:Lax/T4/j$a;

    .line 29
    .line 30
    const-string v7, "ALLOW_SINGLE_QUOTES"

    .line 31
    .line 32
    invoke-direct {v4, v7, v5, v3, v6}, Lax/Z4/e;-><init>(Ljava/lang/String;IZLax/T4/j$a;)V

    .line 33
    .line 34
    .line 35
    sput-object v4, Lax/Z4/e;->g0:Lax/Z4/e;

    .line 36
    .line 37
    new-instance v6, Lax/Z4/e;

    .line 38
    .line 39
    const/4 v7, 0x3

    .line 40
    sget-object v8, Lax/T4/j$a;->g0:Lax/T4/j$a;

    .line 41
    .line 42
    const-string v9, "ALLOW_UNQUOTED_FIELD_NAMES"

    .line 43
    .line 44
    invoke-direct {v6, v9, v7, v3, v8}, Lax/Z4/e;-><init>(Ljava/lang/String;IZLax/T4/j$a;)V

    .line 45
    .line 46
    .line 47
    sput-object v6, Lax/Z4/e;->h0:Lax/Z4/e;

    .line 48
    .line 49
    new-instance v8, Lax/Z4/e;

    .line 50
    .line 51
    const/4 v9, 0x4

    .line 52
    sget-object v10, Lax/T4/j$a;->i0:Lax/T4/j$a;

    .line 53
    .line 54
    const-string v11, "ALLOW_UNESCAPED_CONTROL_CHARS"

    .line 55
    .line 56
    invoke-direct {v8, v11, v9, v3, v10}, Lax/Z4/e;-><init>(Ljava/lang/String;IZLax/T4/j$a;)V

    .line 57
    .line 58
    .line 59
    sput-object v8, Lax/Z4/e;->i0:Lax/Z4/e;

    .line 60
    .line 61
    new-instance v10, Lax/Z4/e;

    .line 62
    .line 63
    const/4 v11, 0x5

    .line 64
    sget-object v12, Lax/T4/j$a;->j0:Lax/T4/j$a;

    .line 65
    .line 66
    const-string v13, "ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER"

    .line 67
    .line 68
    invoke-direct {v10, v13, v11, v3, v12}, Lax/Z4/e;-><init>(Ljava/lang/String;IZLax/T4/j$a;)V

    .line 69
    .line 70
    .line 71
    sput-object v10, Lax/Z4/e;->j0:Lax/Z4/e;

    .line 72
    .line 73
    new-instance v12, Lax/Z4/e;

    .line 74
    .line 75
    const/4 v13, 0x6

    .line 76
    sget-object v14, Lax/T4/j$a;->k0:Lax/T4/j$a;

    .line 77
    .line 78
    const-string v15, "ALLOW_LEADING_ZEROS_FOR_NUMBERS"

    .line 79
    .line 80
    invoke-direct {v12, v15, v13, v3, v14}, Lax/Z4/e;-><init>(Ljava/lang/String;IZLax/T4/j$a;)V

    .line 81
    .line 82
    .line 83
    sput-object v12, Lax/Z4/e;->k0:Lax/Z4/e;

    .line 84
    .line 85
    new-instance v14, Lax/Z4/e;

    .line 86
    .line 87
    const/4 v15, 0x7

    .line 88
    const/16 v16, 0x1

    .line 89
    .line 90
    sget-object v2, Lax/T4/j$a;->l0:Lax/T4/j$a;

    .line 91
    .line 92
    const/16 v17, 0x2

    .line 93
    .line 94
    const-string v5, "ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS"

    .line 95
    .line 96
    invoke-direct {v14, v5, v15, v3, v2}, Lax/Z4/e;-><init>(Ljava/lang/String;IZLax/T4/j$a;)V

    .line 97
    .line 98
    .line 99
    sput-object v14, Lax/Z4/e;->l0:Lax/Z4/e;

    .line 100
    .line 101
    new-instance v2, Lax/Z4/e;

    .line 102
    .line 103
    const/16 v5, 0x8

    .line 104
    .line 105
    const/16 v18, 0x3

    .line 106
    .line 107
    sget-object v7, Lax/T4/j$a;->m0:Lax/T4/j$a;

    .line 108
    .line 109
    const/16 v19, 0x4

    .line 110
    .line 111
    const-string v9, "ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS"

    .line 112
    .line 113
    invoke-direct {v2, v9, v5, v3, v7}, Lax/Z4/e;-><init>(Ljava/lang/String;IZLax/T4/j$a;)V

    .line 114
    .line 115
    .line 116
    sput-object v2, Lax/Z4/e;->m0:Lax/Z4/e;

    .line 117
    .line 118
    new-instance v7, Lax/Z4/e;

    .line 119
    .line 120
    const/16 v9, 0x9

    .line 121
    .line 122
    const/16 v20, 0x8

    .line 123
    .line 124
    sget-object v5, Lax/T4/j$a;->n0:Lax/T4/j$a;

    .line 125
    .line 126
    const/16 v21, 0x5

    .line 127
    .line 128
    const-string v11, "ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS"

    .line 129
    .line 130
    invoke-direct {v7, v11, v9, v3, v5}, Lax/Z4/e;-><init>(Ljava/lang/String;IZLax/T4/j$a;)V

    .line 131
    .line 132
    .line 133
    sput-object v7, Lax/Z4/e;->n0:Lax/Z4/e;

    .line 134
    .line 135
    new-instance v5, Lax/Z4/e;

    .line 136
    .line 137
    const/16 v11, 0xa

    .line 138
    .line 139
    const/16 v22, 0x9

    .line 140
    .line 141
    sget-object v9, Lax/T4/j$a;->o0:Lax/T4/j$a;

    .line 142
    .line 143
    const/16 v23, 0x6

    .line 144
    .line 145
    const-string v13, "ALLOW_NON_NUMERIC_NUMBERS"

    .line 146
    .line 147
    invoke-direct {v5, v13, v11, v3, v9}, Lax/Z4/e;-><init>(Ljava/lang/String;IZLax/T4/j$a;)V

    .line 148
    .line 149
    .line 150
    sput-object v5, Lax/Z4/e;->o0:Lax/Z4/e;

    .line 151
    .line 152
    new-instance v9, Lax/Z4/e;

    .line 153
    .line 154
    const/16 v13, 0xb

    .line 155
    .line 156
    const/16 v24, 0xa

    .line 157
    .line 158
    sget-object v11, Lax/T4/j$a;->p0:Lax/T4/j$a;

    .line 159
    .line 160
    const/16 v25, 0x7

    .line 161
    .line 162
    const-string v15, "ALLOW_MISSING_VALUES"

    .line 163
    .line 164
    invoke-direct {v9, v15, v13, v3, v11}, Lax/Z4/e;-><init>(Ljava/lang/String;IZLax/T4/j$a;)V

    .line 165
    .line 166
    .line 167
    sput-object v9, Lax/Z4/e;->p0:Lax/Z4/e;

    .line 168
    .line 169
    new-instance v11, Lax/Z4/e;

    .line 170
    .line 171
    const/16 v15, 0xc

    .line 172
    .line 173
    const/16 v26, 0xb

    .line 174
    .line 175
    sget-object v13, Lax/T4/j$a;->q0:Lax/T4/j$a;

    .line 176
    .line 177
    move-object/from16 v27, v0

    .line 178
    .line 179
    const-string v0, "ALLOW_TRAILING_COMMA"

    .line 180
    .line 181
    invoke-direct {v11, v0, v15, v3, v13}, Lax/Z4/e;-><init>(Ljava/lang/String;IZLax/T4/j$a;)V

    .line 182
    .line 183
    .line 184
    sput-object v11, Lax/Z4/e;->q0:Lax/Z4/e;

    .line 185
    .line 186
    const/16 v0, 0xd

    .line 187
    .line 188
    new-array v0, v0, [Lax/Z4/e;

    .line 189
    .line 190
    aput-object v27, v0, v3

    .line 191
    .line 192
    aput-object v1, v0, v16

    .line 193
    .line 194
    aput-object v4, v0, v17

    .line 195
    .line 196
    aput-object v6, v0, v18

    .line 197
    .line 198
    aput-object v8, v0, v19

    .line 199
    .line 200
    aput-object v10, v0, v21

    .line 201
    .line 202
    aput-object v12, v0, v23

    .line 203
    .line 204
    aput-object v14, v0, v25

    .line 205
    .line 206
    aput-object v2, v0, v20

    .line 207
    .line 208
    aput-object v7, v0, v22

    .line 209
    .line 210
    aput-object v5, v0, v24

    .line 211
    .line 212
    aput-object v9, v0, v26

    .line 213
    .line 214
    aput-object v11, v0, v15

    .line 215
    .line 216
    sput-object v0, Lax/Z4/e;->r0:[Lax/Z4/e;

    .line 217
    .line 218
    return-void
    .line 219
.end method

.method private constructor <init>(Ljava/lang/String;IZLax/T4/j$a;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lax/T4/j$a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Lax/Z4/e;->q:Z

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
    iput p1, p0, Lax/Z4/e;->c0:I

    .line 13
    .line 14
    iput-object p4, p0, Lax/Z4/e;->d0:Lax/T4/j$a;

    .line 15
    .line 16
    return-void
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

.method public static valueOf(Ljava/lang/String;)Lax/Z4/e;
    .registers 2

    .line 1
    const-class v0, Lax/Z4/e;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lax/Z4/e;

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

.method public static values()[Lax/Z4/e;
    .registers 1

    .line 1
    sget-object v0, Lax/Z4/e;->r0:[Lax/Z4/e;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lax/Z4/e;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lax/Z4/e;

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
.method public d()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/Z4/e;->q:Z

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

.method public h()I
    .registers 2

    .line 1
    iget v0, p0, Lax/Z4/e;->c0:I

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

.method public j()Lax/T4/j$a;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Z4/e;->d0:Lax/T4/j$a;

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
