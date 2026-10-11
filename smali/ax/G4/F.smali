.class Lax/G4/F;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/G4/F$a;
    }
.end annotation


# instance fields
.field protected final a:Ljava/lang/String;

.field protected final b:Z

.field protected final c:Z

.field protected final d:Z

.field protected final e:Z

.field protected final f:Z

.field protected final g:Ljava/lang/Long;

.field protected final h:Lax/G4/k0;

.field protected final i:Lax/E4/g;

.field protected final j:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 13

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 19
    invoke-direct/range {v0 .. v10}, Lax/G4/F;-><init>(Ljava/lang/String;ZZZZZLjava/lang/Long;Lax/G4/k0;Lax/E4/g;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZZZZLjava/lang/Long;Lax/G4/k0;Lax/E4/g;Z)V
    .registers 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_51

    .line 2
    const-string v0, "(/(.|[\\r\\n])*)?|id:.*|(ns:[0-9]+(/.*)?)"

    invoke-static {v0, p1}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_49

    .line 3
    iput-object p1, p0, Lax/G4/F;->a:Ljava/lang/String;

    .line 4
    iput-boolean p2, p0, Lax/G4/F;->b:Z

    .line 5
    iput-boolean p3, p0, Lax/G4/F;->c:Z

    .line 6
    iput-boolean p4, p0, Lax/G4/F;->d:Z

    .line 7
    iput-boolean p5, p0, Lax/G4/F;->e:Z

    .line 8
    iput-boolean p6, p0, Lax/G4/F;->f:Z

    if-eqz p7, :cond_40

    .line 9
    invoke-virtual {p7}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    const-wide/16 p3, 0x1

    cmp-long p5, p1, p3

    if-ltz p5, :cond_38

    .line 10
    invoke-virtual {p7}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    const-wide/16 p3, 0x7d0

    cmp-long p5, p1, p3

    if-gtz p5, :cond_30

    goto :goto_40

    .line 11
    :cond_30
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Number \'limit\' is larger than 2000L"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_38
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Number \'limit\' is smaller than 1L"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_40
    :goto_40
    iput-object p7, p0, Lax/G4/F;->g:Ljava/lang/Long;

    .line 14
    iput-object p8, p0, Lax/G4/F;->h:Lax/G4/k0;

    .line 15
    iput-object p9, p0, Lax/G4/F;->i:Lax/E4/g;

    .line 16
    iput-boolean p10, p0, Lax/G4/F;->j:Z

    return-void

    .line 17
    :cond_49
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "String \'path\' does not match pattern"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_51
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value for \'path\' is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .registers 3

    .line 1
    sget-object v0, Lax/G4/F$a;->b:Lax/G4/F$a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p0, v1}, Lax/v4/c;->j(Ljava/lang/Object;Z)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
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

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_8

    .line 7
    .line 8
    return v1

    .line 9
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_73

    .line 22
    .line 23
    check-cast p1, Lax/G4/F;

    .line 24
    .line 25
    iget-object v2, p0, Lax/G4/F;->a:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v3, p1, Lax/G4/F;->a:Ljava/lang/String;

    .line 28
    .line 29
    if-eq v2, v3, :cond_24

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_73

    .line 36
    .line 37
    :cond_24
    iget-boolean v2, p0, Lax/G4/F;->b:Z

    .line 38
    .line 39
    iget-boolean v3, p1, Lax/G4/F;->b:Z

    .line 40
    .line 41
    if-ne v2, v3, :cond_73

    .line 42
    .line 43
    iget-boolean v2, p0, Lax/G4/F;->c:Z

    .line 44
    .line 45
    iget-boolean v3, p1, Lax/G4/F;->c:Z

    .line 46
    .line 47
    if-ne v2, v3, :cond_73

    .line 48
    .line 49
    iget-boolean v2, p0, Lax/G4/F;->d:Z

    .line 50
    .line 51
    iget-boolean v3, p1, Lax/G4/F;->d:Z

    .line 52
    .line 53
    if-ne v2, v3, :cond_73

    .line 54
    .line 55
    iget-boolean v2, p0, Lax/G4/F;->e:Z

    .line 56
    .line 57
    iget-boolean v3, p1, Lax/G4/F;->e:Z

    .line 58
    .line 59
    if-ne v2, v3, :cond_73

    .line 60
    .line 61
    iget-boolean v2, p0, Lax/G4/F;->f:Z

    .line 62
    .line 63
    iget-boolean v3, p1, Lax/G4/F;->f:Z

    .line 64
    .line 65
    if-ne v2, v3, :cond_73

    .line 66
    .line 67
    iget-object v2, p0, Lax/G4/F;->g:Ljava/lang/Long;

    .line 68
    .line 69
    iget-object v3, p1, Lax/G4/F;->g:Ljava/lang/Long;

    .line 70
    .line 71
    if-eq v2, v3, :cond_50

    .line 72
    .line 73
    if-eqz v2, :cond_73

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_73

    .line 80
    .line 81
    :cond_50
    iget-object v2, p0, Lax/G4/F;->h:Lax/G4/k0;

    .line 82
    .line 83
    iget-object v3, p1, Lax/G4/F;->h:Lax/G4/k0;

    .line 84
    .line 85
    if-eq v2, v3, :cond_5e

    .line 86
    .line 87
    if-eqz v2, :cond_73

    .line 88
    .line 89
    invoke-virtual {v2, v3}, Lax/G4/k0;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_73

    .line 94
    .line 95
    :cond_5e
    iget-object v2, p0, Lax/G4/F;->i:Lax/E4/g;

    .line 96
    .line 97
    iget-object v3, p1, Lax/G4/F;->i:Lax/E4/g;

    .line 98
    .line 99
    if-eq v2, v3, :cond_6c

    .line 100
    .line 101
    if-eqz v2, :cond_73

    .line 102
    .line 103
    invoke-virtual {v2, v3}, Lax/E4/g;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_73

    .line 108
    .line 109
    :cond_6c
    iget-boolean v2, p0, Lax/G4/F;->j:Z

    .line 110
    .line 111
    iget-boolean p1, p1, Lax/G4/F;->j:Z

    .line 112
    .line 113
    if-ne v2, p1, :cond_73

    .line 114
    .line 115
    return v0

    .line 116
    :cond_73
    return v1
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

.method public hashCode()I
    .registers 13

    .line 1
    iget-object v0, p0, Lax/G4/F;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-boolean v1, p0, Lax/G4/F;->b:Z

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-boolean v2, p0, Lax/G4/F;->c:Z

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-boolean v3, p0, Lax/G4/F;->d:Z

    .line 16
    .line 17
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-boolean v4, p0, Lax/G4/F;->e:Z

    .line 22
    .line 23
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-boolean v5, p0, Lax/G4/F;->f:Z

    .line 28
    .line 29
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iget-object v6, p0, Lax/G4/F;->g:Ljava/lang/Long;

    .line 34
    .line 35
    iget-object v7, p0, Lax/G4/F;->h:Lax/G4/k0;

    .line 36
    .line 37
    iget-object v8, p0, Lax/G4/F;->i:Lax/E4/g;

    .line 38
    .line 39
    iget-boolean v9, p0, Lax/G4/F;->j:Z

    .line 40
    .line 41
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    const/16 v10, 0xa

    .line 46
    .line 47
    new-array v10, v10, [Ljava/lang/Object;

    .line 48
    .line 49
    const/4 v11, 0x0

    .line 50
    aput-object v0, v10, v11

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    aput-object v1, v10, v0

    .line 54
    .line 55
    const/4 v0, 0x2

    .line 56
    aput-object v2, v10, v0

    .line 57
    .line 58
    const/4 v0, 0x3

    .line 59
    aput-object v3, v10, v0

    .line 60
    .line 61
    const/4 v0, 0x4

    .line 62
    aput-object v4, v10, v0

    .line 63
    .line 64
    const/4 v0, 0x5

    .line 65
    aput-object v5, v10, v0

    .line 66
    .line 67
    const/4 v0, 0x6

    .line 68
    aput-object v6, v10, v0

    .line 69
    .line 70
    const/4 v0, 0x7

    .line 71
    aput-object v7, v10, v0

    .line 72
    .line 73
    const/16 v0, 0x8

    .line 74
    .line 75
    aput-object v8, v10, v0

    .line 76
    .line 77
    const/16 v0, 0x9

    .line 78
    .line 79
    aput-object v9, v10, v0

    .line 80
    .line 81
    invoke-static {v10}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    return v0
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

.method public toString()Ljava/lang/String;
    .registers 3

    .line 1
    sget-object v0, Lax/G4/F$a;->b:Lax/G4/F$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p0, v1}, Lax/v4/c;->j(Ljava/lang/Object;Z)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
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
