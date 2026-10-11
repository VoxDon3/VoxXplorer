.class public Lcom/voxdon/xplorer/file/S;
.super Lcom/voxdon/xplorer/file/n;
.source "SourceFile"


# instance fields
.field private k0:Ljava/lang/String;

.field private l0:Ljava/lang/String;

.field private m0:Ljava/lang/String;

.field private n0:Z

.field private o0:Z

.field private p0:Z

.field private q0:Z

.field private r0:Z

.field private s0:Z

.field private t0:J

.field private u0:J

.field private v0:Lax/pb/b0;

.field private final w0:Z


# direct methods
.method public constructor <init>(Lcom/voxdon/xplorer/file/Q;Lax/pb/b0;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/pb/a0;
        }
    .end annotation

    .line 36
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/n;-><init>(Lcom/voxdon/xplorer/file/m;)V

    const/4 v0, 0x0

    .line 37
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/S;->s0:Z

    const/4 v1, 0x1

    .line 38
    iput-boolean v1, p0, Lcom/voxdon/xplorer/file/S;->w0:Z

    .line 39
    iput-object p2, p0, Lcom/voxdon/xplorer/file/S;->v0:Lax/pb/b0;

    .line 40
    invoke-static {p1, p2}, Lcom/voxdon/xplorer/file/N;->g(Lcom/voxdon/xplorer/file/Q;Lax/pb/b0;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/S;->l0:Ljava/lang/String;

    .line 41
    invoke-virtual {p2}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/S;->m0:Ljava/lang/String;

    .line 42
    invoke-virtual {p2}, Lax/pb/b0;->s()Z

    move-result p1

    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/S;->q0:Z

    .line 43
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/S;->h0()V

    .line 44
    iget-boolean p1, p0, Lcom/voxdon/xplorer/file/S;->q0:Z

    if-eqz p1, :cond_4d

    .line 45
    invoke-virtual {p2}, Lax/pb/b0;->G()Z

    move-result p1

    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/S;->n0:Z

    .line 46
    invoke-virtual {p2}, Lax/pb/b0;->b()Z

    move-result p1

    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/S;->o0:Z

    .line 47
    invoke-virtual {p2}, Lax/pb/b0;->c()Z

    move-result p1

    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/S;->p0:Z

    .line 48
    invoke-virtual {p2}, Lax/pb/b0;->H()Z

    move-result p1

    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/S;->r0:Z

    .line 49
    invoke-virtual {p2}, Lax/pb/b0;->K()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/voxdon/xplorer/file/S;->t0:J

    .line 50
    invoke-virtual {p2}, Lax/pb/b0;->L()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/voxdon/xplorer/file/S;->u0:J

    return-void

    .line 51
    :cond_4d
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/S;->n0:Z

    .line 52
    iput-boolean v1, p0, Lcom/voxdon/xplorer/file/S;->o0:Z

    .line 53
    iput-boolean v1, p0, Lcom/voxdon/xplorer/file/S;->p0:Z

    .line 54
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/S;->r0:Z

    const-wide/16 p1, -0x1

    .line 55
    iput-wide p1, p0, Lcom/voxdon/xplorer/file/S;->t0:J

    const-wide/16 p1, 0x0

    .line 56
    iput-wide p1, p0, Lcom/voxdon/xplorer/file/S;->u0:J

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/Q;Ljava/lang/String;Lax/N8/c;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/k9/d;
        }
    .end annotation

    .line 24
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/n;-><init>(Lcom/voxdon/xplorer/file/m;)V

    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/S;->s0:Z

    .line 26
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/S;->w0:Z

    .line 27
    invoke-virtual {p3}, Lax/N8/c;->a()Lax/N8/e;

    move-result-object v0

    .line 28
    iput-object p2, p0, Lcom/voxdon/xplorer/file/S;->l0:Ljava/lang/String;

    .line 29
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/file/Q;->y0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/S;->m0:Ljava/lang/String;

    const/4 p1, 0x1

    .line 30
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/S;->q0:Z

    .line 31
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/S;->o0:Z

    .line 32
    invoke-virtual {v0}, Lax/N8/e;->c()J

    move-result-wide p1

    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/file/S;->i0(J)V

    .line 33
    invoke-virtual {v0}, Lax/N8/e;->e()Lax/J8/b;

    move-result-object p1

    if-eqz p1, :cond_30

    .line 34
    invoke-virtual {v0}, Lax/N8/e;->e()Lax/J8/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/J8/b;->g()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/voxdon/xplorer/file/S;->t0:J

    .line 35
    :cond_30
    invoke-virtual {p3}, Lax/N8/c;->b()Lax/N8/y;

    move-result-object p1

    invoke-virtual {p1}, Lax/N8/y;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/voxdon/xplorer/file/S;->u0:J

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/Q;Ljava/lang/String;Lax/N8/m;)V
    .registers 5

    .line 13
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/n;-><init>(Lcom/voxdon/xplorer/file/m;)V

    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/S;->s0:Z

    .line 15
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/S;->w0:Z

    .line 16
    iput-object p2, p0, Lcom/voxdon/xplorer/file/S;->l0:Ljava/lang/String;

    .line 17
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/file/Q;->y0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/S;->m0:Ljava/lang/String;

    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/S;->q0:Z

    .line 19
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/S;->o0:Z

    .line 20
    invoke-virtual {p3}, Lax/N8/m;->d()J

    move-result-wide p1

    invoke-direct {p0, p1, p2}, Lcom/voxdon/xplorer/file/S;->i0(J)V

    .line 21
    invoke-virtual {p3}, Lax/N8/m;->e()Lax/J8/b;

    move-result-object p1

    if-eqz p1, :cond_2c

    .line 22
    invoke-virtual {p3}, Lax/N8/m;->e()Lax/J8/b;

    move-result-object p1

    invoke-virtual {p1}, Lax/J8/b;->g()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/voxdon/xplorer/file/S;->t0:J

    .line 23
    :cond_2c
    invoke-virtual {p3}, Lax/N8/m;->c()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/voxdon/xplorer/file/S;->u0:J

    return-void
.end method

.method public constructor <init>(Lcom/voxdon/xplorer/file/Q;Ljava/lang/String;ZZZZ)V
    .registers 8

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/n;-><init>(Lcom/voxdon/xplorer/file/m;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/S;->s0:Z

    .line 3
    iput-boolean p6, p0, Lcom/voxdon/xplorer/file/S;->w0:Z

    .line 4
    iput-object p2, p0, Lcom/voxdon/xplorer/file/S;->l0:Ljava/lang/String;

    .line 5
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/file/Q;->y0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/voxdon/xplorer/file/S;->m0:Ljava/lang/String;

    .line 6
    iput-boolean p3, p0, Lcom/voxdon/xplorer/file/S;->q0:Z

    .line 7
    iput-boolean p4, p0, Lcom/voxdon/xplorer/file/S;->n0:Z

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/S;->o0:Z

    .line 9
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/S;->p0:Z

    .line 10
    iput-boolean p5, p0, Lcom/voxdon/xplorer/file/S;->r0:Z

    const-wide/16 p1, -0x1

    .line 11
    iput-wide p1, p0, Lcom/voxdon/xplorer/file/S;->t0:J

    const-wide/16 p1, 0x0

    .line 12
    iput-wide p1, p0, Lcom/voxdon/xplorer/file/S;->u0:J

    return-void
.end method

.method public static f0(Lcom/voxdon/xplorer/file/Q;Ljava/lang/String;Z)Lcom/voxdon/xplorer/file/S;
    .registers 10

    .line 1
    new-instance v0, Lcom/voxdon/xplorer/file/S;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v5, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    move-object v1, p0

    .line 7
    move-object v2, p1

    .line 8
    move v6, p2

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/voxdon/xplorer/file/S;-><init>(Lcom/voxdon/xplorer/file/Q;Ljava/lang/String;ZZZZ)V

    .line 10
    .line 11
    .line 12
    return-object v0
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

.method public static g0(Lcom/voxdon/xplorer/file/Q;Ljava/lang/String;)Lcom/voxdon/xplorer/file/S;
    .registers 10

    .line 1
    const-string v0, "$"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v6

    .line 7
    new-instance v1, Lcom/voxdon/xplorer/file/S;

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v4, 0x1

    .line 12
    move-object v2, p0

    .line 13
    move-object v3, p1

    .line 14
    invoke-direct/range {v1 .. v7}, Lcom/voxdon/xplorer/file/S;-><init>(Lcom/voxdon/xplorer/file/Q;Ljava/lang/String;ZZZZ)V

    .line 15
    .line 16
    .line 17
    return-object v1
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

.method private h0()V
    .registers 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-static {p0, v0}, Lax/c3/v;->e(Lcom/voxdon/xplorer/file/n;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lcom/voxdon/xplorer/file/S;->k0:Ljava/lang/String;

    .line 8
    .line 9
    return-void
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

.method private i0(J)V
    .registers 10

    .line 1
    sget-object v0, Lax/L8/a;->e0:Lax/L8/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/L8/a;->getValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    and-long/2addr v0, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    cmp-long v6, v0, v4

    .line 13
    .line 14
    if-eqz v6, :cond_11

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_12

    .line 18
    :cond_11
    const/4 v0, 0x0

    .line 19
    :goto_12
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/S;->n0:Z

    .line 20
    .line 21
    sget-object v0, Lax/L8/a;->k0:Lax/L8/a;

    .line 22
    .line 23
    invoke-virtual {v0}, Lax/L8/a;->getValue()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    and-long/2addr v0, p1

    .line 28
    cmp-long v6, v0, v4

    .line 29
    .line 30
    if-nez v6, :cond_21

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    goto :goto_22

    .line 34
    :cond_21
    const/4 v0, 0x0

    .line 35
    :goto_22
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/S;->p0:Z

    .line 36
    .line 37
    sget-object v0, Lax/L8/a;->g0:Lax/L8/a;

    .line 38
    .line 39
    invoke-virtual {v0}, Lax/L8/a;->getValue()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    and-long/2addr v0, p1

    .line 44
    cmp-long v6, v0, v4

    .line 45
    .line 46
    if-eqz v6, :cond_31

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    goto :goto_32

    .line 50
    :cond_31
    const/4 v0, 0x0

    .line 51
    :goto_32
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/S;->r0:Z

    .line 52
    .line 53
    sget-object v0, Lax/L8/a;->l0:Lax/L8/a;

    .line 54
    .line 55
    invoke-virtual {v0}, Lax/L8/a;->getValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    and-long/2addr p1, v0

    .line 60
    cmp-long v0, p1, v4

    .line 61
    .line 62
    if-eqz v0, :cond_40

    .line 63
    .line 64
    const/4 v2, 0x1

    .line 65
    :cond_40
    iput-boolean v2, p0, Lcom/voxdon/xplorer/file/S;->s0:Z

    .line 66
    .line 67
    return-void
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


# virtual methods
.method public C()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/S;->l0:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lax/c3/d0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public F()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/S;->l0:Ljava/lang/String;

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

.method public U()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/S;->l0:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public b0()Z
    .registers 2

    .line 1
    invoke-static {}, Lax/X2/Q;->t1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_8
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/S;->w0:Z

    .line 10
    .line 11
    xor-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .registers 2

    .line 1
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/S;->e0(Lcom/voxdon/xplorer/file/n;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
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

.method public d()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/S;->o0:Z

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

.method public e0(Lcom/voxdon/xplorer/file/n;)I
    .registers 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/file/S;->l0:Ljava/lang/String;

    .line 2
    .line 3
    check-cast p1, Lcom/voxdon/xplorer/file/S;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/voxdon/xplorer/file/S;->l0:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result p1
    :try_end_a
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_a} :catch_b

    .line 11
    return p1

    .line 12
    :catch_b
    const/4 p1, -0x1

    .line 13
    return p1
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

.method public h()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/S;->r0:Z

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

.method public isDirectory()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/S;->n0:Z

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

.method public j()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/S;->p0:Z

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

.method public j0()Lax/pb/b0;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/S;->v0:Lax/pb/b0;

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

.method public k0(Lax/pb/b0;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/S;->v0:Lax/pb/b0;

    .line 2
    .line 3
    return-void
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
    .line 22
.end method

.method public l()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/S;->s0:Z

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

.method public n()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/S;->q0:Z

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

.method public p()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lcom/voxdon/xplorer/file/S;->u0:J

    .line 2
    .line 3
    return-wide v0
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

.method public q()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lcom/voxdon/xplorer/file/S;->t0:J

    .line 2
    .line 3
    return-wide v0
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

.method public r(Z)I
    .registers 2

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/S;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_8

    .line 6
    .line 7
    const/4 p1, -0x2

    .line 8
    return p1

    .line 9
    :cond_8
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->X()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
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

.method public s()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/S;->k0:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/S;->h0()V

    .line 6
    .line 7
    .line 8
    :cond_7
    iget-object v0, p0, Lcom/voxdon/xplorer/file/S;->k0:Ljava/lang/String;

    .line 9
    .line 10
    return-object v0
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

.method public t()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/S;->m0:Ljava/lang/String;

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
