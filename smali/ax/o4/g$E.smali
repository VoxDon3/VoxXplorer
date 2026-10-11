.class Lax/o4/g$E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/o4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "E"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/o4/g$E$e;,
        Lax/o4/g$E$i;,
        Lax/o4/g$E$h;,
        Lax/o4/g$E$g;,
        Lax/o4/g$E$f;,
        Lax/o4/g$E$b;,
        Lax/o4/g$E$d;,
        Lax/o4/g$E$c;,
        Lax/o4/g$E$a;
    }
.end annotation


# instance fields
.field A0:Ljava/lang/String;

.field B0:Ljava/lang/Boolean;

.field C0:Ljava/lang/Boolean;

.field D0:Lax/o4/g$O;

.field E0:Ljava/lang/Float;

.field F0:Ljava/lang/String;

.field G0:Lax/o4/g$E$a;

.field H0:Ljava/lang/String;

.field I0:Lax/o4/g$O;

.field J0:Ljava/lang/Float;

.field K0:Lax/o4/g$O;

.field L0:Ljava/lang/Float;

.field M0:Lax/o4/g$E$i;

.field N0:Lax/o4/g$E$e;

.field c0:Lax/o4/g$O;

.field d0:Lax/o4/g$E$a;

.field e0:Ljava/lang/Float;

.field f0:Lax/o4/g$O;

.field g0:Ljava/lang/Float;

.field h0:Lax/o4/g$p;

.field i0:Lax/o4/g$E$c;

.field j0:Lax/o4/g$E$d;

.field k0:Ljava/lang/Float;

.field l0:[Lax/o4/g$p;

.field m0:Lax/o4/g$p;

.field n0:Ljava/lang/Float;

.field o0:Lax/o4/g$f;

.field p0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field q:J

.field q0:Lax/o4/g$p;

.field r0:Ljava/lang/Integer;

.field s0:Lax/o4/g$E$b;

.field t0:Lax/o4/g$E$g;

.field u0:Lax/o4/g$E$h;

.field v0:Lax/o4/g$E$f;

.field w0:Ljava/lang/Boolean;

.field x0:Lax/o4/g$c;

.field y0:Ljava/lang/String;

.field z0:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lax/o4/g$E;->q:J

    .line 7
    .line 8
    return-void
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

.method static b()Lax/o4/g$E;
    .registers 8

    .line 1
    new-instance v0, Lax/o4/g$E;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/o4/g$E;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, -0x1

    .line 7
    .line 8
    iput-wide v1, v0, Lax/o4/g$E;->q:J

    .line 9
    .line 10
    sget-object v1, Lax/o4/g$f;->c0:Lax/o4/g$f;

    .line 11
    .line 12
    iput-object v1, v0, Lax/o4/g$E;->c0:Lax/o4/g$O;

    .line 13
    .line 14
    sget-object v2, Lax/o4/g$E$a;->q:Lax/o4/g$E$a;

    .line 15
    .line 16
    iput-object v2, v0, Lax/o4/g$E;->d0:Lax/o4/g$E$a;

    .line 17
    .line 18
    const/high16 v3, 0x3f800000    # 1.0f

    .line 19
    .line 20
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iput-object v4, v0, Lax/o4/g$E;->e0:Ljava/lang/Float;

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    iput-object v5, v0, Lax/o4/g$E;->f0:Lax/o4/g$O;

    .line 28
    .line 29
    iput-object v4, v0, Lax/o4/g$E;->g0:Ljava/lang/Float;

    .line 30
    .line 31
    new-instance v6, Lax/o4/g$p;

    .line 32
    .line 33
    invoke-direct {v6, v3}, Lax/o4/g$p;-><init>(F)V

    .line 34
    .line 35
    .line 36
    iput-object v6, v0, Lax/o4/g$E;->h0:Lax/o4/g$p;

    .line 37
    .line 38
    sget-object v3, Lax/o4/g$E$c;->q:Lax/o4/g$E$c;

    .line 39
    .line 40
    iput-object v3, v0, Lax/o4/g$E;->i0:Lax/o4/g$E$c;

    .line 41
    .line 42
    sget-object v3, Lax/o4/g$E$d;->q:Lax/o4/g$E$d;

    .line 43
    .line 44
    iput-object v3, v0, Lax/o4/g$E;->j0:Lax/o4/g$E$d;

    .line 45
    .line 46
    const/high16 v3, 0x40800000    # 4.0f

    .line 47
    .line 48
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    iput-object v3, v0, Lax/o4/g$E;->k0:Ljava/lang/Float;

    .line 53
    .line 54
    iput-object v5, v0, Lax/o4/g$E;->l0:[Lax/o4/g$p;

    .line 55
    .line 56
    new-instance v3, Lax/o4/g$p;

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    invoke-direct {v3, v6}, Lax/o4/g$p;-><init>(F)V

    .line 60
    .line 61
    .line 62
    iput-object v3, v0, Lax/o4/g$E;->m0:Lax/o4/g$p;

    .line 63
    .line 64
    iput-object v4, v0, Lax/o4/g$E;->n0:Ljava/lang/Float;

    .line 65
    .line 66
    iput-object v1, v0, Lax/o4/g$E;->o0:Lax/o4/g$f;

    .line 67
    .line 68
    iput-object v5, v0, Lax/o4/g$E;->p0:Ljava/util/List;

    .line 69
    .line 70
    new-instance v3, Lax/o4/g$p;

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    sget-object v7, Lax/o4/g$d0;->h0:Lax/o4/g$d0;

    .line 75
    .line 76
    invoke-direct {v3, v6, v7}, Lax/o4/g$p;-><init>(FLax/o4/g$d0;)V

    .line 77
    .line 78
    .line 79
    iput-object v3, v0, Lax/o4/g$E;->q0:Lax/o4/g$p;

    .line 80
    .line 81
    const/16 v3, 0x190

    .line 82
    .line 83
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    iput-object v3, v0, Lax/o4/g$E;->r0:Ljava/lang/Integer;

    .line 88
    .line 89
    sget-object v3, Lax/o4/g$E$b;->q:Lax/o4/g$E$b;

    .line 90
    .line 91
    iput-object v3, v0, Lax/o4/g$E;->s0:Lax/o4/g$E$b;

    .line 92
    .line 93
    sget-object v3, Lax/o4/g$E$g;->q:Lax/o4/g$E$g;

    .line 94
    .line 95
    iput-object v3, v0, Lax/o4/g$E;->t0:Lax/o4/g$E$g;

    .line 96
    .line 97
    sget-object v3, Lax/o4/g$E$h;->q:Lax/o4/g$E$h;

    .line 98
    .line 99
    iput-object v3, v0, Lax/o4/g$E;->u0:Lax/o4/g$E$h;

    .line 100
    .line 101
    sget-object v3, Lax/o4/g$E$f;->q:Lax/o4/g$E$f;

    .line 102
    .line 103
    iput-object v3, v0, Lax/o4/g$E;->v0:Lax/o4/g$E$f;

    .line 104
    .line 105
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 106
    .line 107
    iput-object v3, v0, Lax/o4/g$E;->w0:Ljava/lang/Boolean;

    .line 108
    .line 109
    iput-object v5, v0, Lax/o4/g$E;->x0:Lax/o4/g$c;

    .line 110
    .line 111
    iput-object v5, v0, Lax/o4/g$E;->y0:Ljava/lang/String;

    .line 112
    .line 113
    iput-object v5, v0, Lax/o4/g$E;->z0:Ljava/lang/String;

    .line 114
    .line 115
    iput-object v5, v0, Lax/o4/g$E;->A0:Ljava/lang/String;

    .line 116
    .line 117
    iput-object v3, v0, Lax/o4/g$E;->B0:Ljava/lang/Boolean;

    .line 118
    .line 119
    iput-object v3, v0, Lax/o4/g$E;->C0:Ljava/lang/Boolean;

    .line 120
    .line 121
    iput-object v1, v0, Lax/o4/g$E;->D0:Lax/o4/g$O;

    .line 122
    .line 123
    iput-object v4, v0, Lax/o4/g$E;->E0:Ljava/lang/Float;

    .line 124
    .line 125
    iput-object v5, v0, Lax/o4/g$E;->F0:Ljava/lang/String;

    .line 126
    .line 127
    iput-object v2, v0, Lax/o4/g$E;->G0:Lax/o4/g$E$a;

    .line 128
    .line 129
    iput-object v5, v0, Lax/o4/g$E;->H0:Ljava/lang/String;

    .line 130
    .line 131
    iput-object v5, v0, Lax/o4/g$E;->I0:Lax/o4/g$O;

    .line 132
    .line 133
    iput-object v4, v0, Lax/o4/g$E;->J0:Ljava/lang/Float;

    .line 134
    .line 135
    iput-object v5, v0, Lax/o4/g$E;->K0:Lax/o4/g$O;

    .line 136
    .line 137
    iput-object v4, v0, Lax/o4/g$E;->L0:Ljava/lang/Float;

    .line 138
    .line 139
    sget-object v1, Lax/o4/g$E$i;->q:Lax/o4/g$E$i;

    .line 140
    .line 141
    iput-object v1, v0, Lax/o4/g$E;->M0:Lax/o4/g$E$i;

    .line 142
    .line 143
    sget-object v1, Lax/o4/g$E$e;->q:Lax/o4/g$E$e;

    .line 144
    .line 145
    iput-object v1, v0, Lax/o4/g$E;->N0:Lax/o4/g$E$e;

    .line 146
    .line 147
    return-object v0
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


# virtual methods
.method c(Z)V
    .registers 4

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    iput-object v0, p0, Lax/o4/g$E;->B0:Ljava/lang/Boolean;

    .line 4
    .line 5
    if-eqz p1, :cond_7

    .line 6
    .line 7
    goto :goto_9

    .line 8
    :cond_7
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 9
    .line 10
    :goto_9
    iput-object v0, p0, Lax/o4/g$E;->w0:Ljava/lang/Boolean;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lax/o4/g$E;->x0:Lax/o4/g$c;

    .line 14
    .line 15
    iput-object p1, p0, Lax/o4/g$E;->F0:Ljava/lang/String;

    .line 16
    .line 17
    const/high16 v0, 0x3f800000    # 1.0f

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, p0, Lax/o4/g$E;->n0:Ljava/lang/Float;

    .line 24
    .line 25
    sget-object v1, Lax/o4/g$f;->c0:Lax/o4/g$f;

    .line 26
    .line 27
    iput-object v1, p0, Lax/o4/g$E;->D0:Lax/o4/g$O;

    .line 28
    .line 29
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iput-object v1, p0, Lax/o4/g$E;->E0:Ljava/lang/Float;

    .line 34
    .line 35
    iput-object p1, p0, Lax/o4/g$E;->H0:Ljava/lang/String;

    .line 36
    .line 37
    iput-object p1, p0, Lax/o4/g$E;->I0:Lax/o4/g$O;

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, p0, Lax/o4/g$E;->J0:Ljava/lang/Float;

    .line 44
    .line 45
    iput-object p1, p0, Lax/o4/g$E;->K0:Lax/o4/g$O;

    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lax/o4/g$E;->L0:Ljava/lang/Float;

    .line 52
    .line 53
    sget-object p1, Lax/o4/g$E$i;->q:Lax/o4/g$E$i;

    .line 54
    .line 55
    iput-object p1, p0, Lax/o4/g$E;->M0:Lax/o4/g$E$i;

    .line 56
    .line 57
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method protected clone()Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lax/o4/g$E;

    .line 6
    .line 7
    iget-object v1, p0, Lax/o4/g$E;->l0:[Lax/o4/g$p;

    .line 8
    .line 9
    if-eqz v1, :cond_12

    .line 10
    .line 11
    invoke-virtual {v1}, [Lax/o4/g$p;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, [Lax/o4/g$p;

    .line 16
    .line 17
    iput-object v1, v0, Lax/o4/g$E;->l0:[Lax/o4/g$p;

    .line 18
    .line 19
    :cond_12
    return-object v0
    .line 20
    .line 21
.end method
