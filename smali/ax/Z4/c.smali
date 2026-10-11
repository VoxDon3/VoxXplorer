.class public abstract Lax/Z4/c;
.super Lax/U4/a;
.source "SourceFile"


# static fields
.field protected static final r0:[I

.field protected static final s0:Lax/b5/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/b5/h<",
            "Lax/T4/t;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected final l0:Lax/W4/e;

.field protected m0:[I

.field protected n0:I

.field protected o0:Lax/T4/p;

.field protected p0:Z

.field protected q0:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    invoke-static {}, Lax/W4/c;->e()[I

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lax/Z4/c;->r0:[I

    .line 6
    .line 7
    sget-object v0, Lax/T4/g;->d0:Lax/b5/h;

    .line 8
    .line 9
    sput-object v0, Lax/Z4/c;->s0:Lax/b5/h;

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

.method public constructor <init>(Lax/W4/e;ILax/T4/n;)V
    .registers 4

    .line 1
    invoke-direct {p0, p2, p3}, Lax/U4/a;-><init>(ILax/T4/n;)V

    .line 2
    .line 3
    .line 4
    sget-object p3, Lax/Z4/c;->r0:[I

    .line 5
    .line 6
    iput-object p3, p0, Lax/Z4/c;->m0:[I

    .line 7
    .line 8
    sget-object p3, Lax/b5/e;->i0:Lax/W4/l;

    .line 9
    .line 10
    iput-object p3, p0, Lax/Z4/c;->o0:Lax/T4/p;

    .line 11
    .line 12
    iput-object p1, p0, Lax/Z4/c;->l0:Lax/W4/e;

    .line 13
    .line 14
    sget-object p1, Lax/T4/g$a;->i0:Lax/T4/g$a;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lax/T4/g$a;->j(I)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_19

    .line 21
    .line 22
    const/16 p1, 0x7f

    .line 23
    .line 24
    iput p1, p0, Lax/Z4/c;->n0:I

    .line 25
    .line 26
    :cond_19
    sget-object p1, Lax/T4/g$a;->o0:Lax/T4/g$a;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Lax/T4/g$a;->j(I)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput-boolean p1, p0, Lax/Z4/c;->q0:Z

    .line 33
    .line 34
    sget-object p1, Lax/T4/g$a;->g0:Lax/T4/g$a;

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Lax/T4/g$a;->j(I)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    xor-int/lit8 p1, p1, 0x1

    .line 41
    .line 42
    iput-boolean p1, p0, Lax/Z4/c;->p0:Z

    .line 43
    .line 44
    return-void
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


# virtual methods
.method protected M0(Ljava/lang/String;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/T4/l;->h()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x2

    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aput-object p1, v1, v2

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    aput-object v0, v1, p1

    .line 15
    .line 16
    const-string p1, "Can not %s, expecting field name (context: %s)"

    .line 17
    .line 18
    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Lax/T4/g;->a(Ljava/lang/String;)V

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
.end method

.method protected T0(Ljava/lang/String;I)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_28

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p2, v0, :cond_22

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p2, v0, :cond_1c

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p2, v0, :cond_16

    .line 11
    .line 12
    const/4 v0, 0x5

    .line 13
    if-eq p2, v0, :cond_12

    .line 14
    .line 15
    invoke-virtual {p0}, Lax/T4/g;->b()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    invoke-virtual {p0, p1}, Lax/Z4/c;->M0(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_16
    iget-object p1, p0, Lax/T4/g;->q:Lax/T4/o;

    .line 24
    .line 25
    invoke-interface {p1, p0}, Lax/T4/o;->i(Lax/T4/g;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1c
    iget-object p1, p0, Lax/T4/g;->q:Lax/T4/o;

    .line 30
    .line 31
    invoke-interface {p1, p0}, Lax/T4/o;->d(Lax/T4/g;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_22
    iget-object p1, p0, Lax/T4/g;->q:Lax/T4/o;

    .line 36
    .line 37
    invoke-interface {p1, p0}, Lax/T4/o;->j(Lax/T4/g;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_28
    iget-object p1, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 42
    .line 43
    invoke-virtual {p1}, Lax/T4/l;->e()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_36

    .line 48
    .line 49
    iget-object p1, p0, Lax/T4/g;->q:Lax/T4/o;

    .line 50
    .line 51
    invoke-interface {p1, p0}, Lax/T4/o;->e(Lax/T4/g;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_36
    iget-object p1, p0, Lax/U4/a;->i0:Lax/Z4/f;

    .line 56
    .line 57
    invoke-virtual {p1}, Lax/T4/l;->f()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_43

    .line 62
    .line 63
    iget-object p1, p0, Lax/T4/g;->q:Lax/T4/o;

    .line 64
    .line 65
    invoke-interface {p1, p0}, Lax/T4/o;->a(Lax/T4/g;)V

    .line 66
    .line 67
    .line 68
    :cond_43
    return-void
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

.method public Y0(Lax/T4/p;)Lax/T4/g;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/Z4/c;->o0:Lax/T4/p;

    .line 2
    .line 3
    return-object p0
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

.method public d(I)Lax/T4/g;
    .registers 2

    .line 1
    if-gez p1, :cond_3

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    :cond_3
    iput p1, p0, Lax/Z4/c;->n0:I

    .line 5
    .line 6
    return-object p0
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
