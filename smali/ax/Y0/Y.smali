.class public final Lax/Y0/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/Y0/Y$b;
    }
.end annotation


# static fields
.field public static final i:Lax/Y0/Y;


# instance fields
.field public final a:Lax/r7/C;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/r7/C<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Double;

.field public final c:Ljava/lang/Double;

.field public final d:Z

.field public final e:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final f:Z

.field public final g:Z

.field public final h:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/Y0/Y$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/Y0/Y$b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lax/Y0/Y$b;->h()Lax/Y0/Y;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lax/Y0/Y;->i:Lax/Y0/Y;

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
.end method

.method private constructor <init>(Lax/Y0/Y$b;)V
    .registers 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lax/Y0/Y$b;->a(Lax/Y0/Y$b;)Lax/r7/C;

    move-result-object v0

    iput-object v0, p0, Lax/Y0/Y;->a:Lax/r7/C;

    .line 4
    invoke-static {p1}, Lax/Y0/Y$b;->b(Lax/Y0/Y$b;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lax/Y0/Y;->b:Ljava/lang/Double;

    .line 5
    invoke-static {p1}, Lax/Y0/Y$b;->c(Lax/Y0/Y$b;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lax/Y0/Y;->c:Ljava/lang/Double;

    .line 6
    invoke-static {p1}, Lax/Y0/Y$b;->d(Lax/Y0/Y$b;)Z

    move-result v0

    iput-boolean v0, p0, Lax/Y0/Y;->d:Z

    .line 7
    invoke-static {p1}, Lax/Y0/Y$b;->e(Lax/Y0/Y$b;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lax/Y0/Y;->e:Z

    .line 8
    invoke-static {p1}, Lax/Y0/Y$b;->e(Lax/Y0/Y$b;)Z

    move-result v0

    iput-boolean v0, p0, Lax/Y0/Y;->f:Z

    .line 9
    invoke-static {p1}, Lax/Y0/Y$b;->f(Lax/Y0/Y$b;)Z

    move-result v0

    iput-boolean v0, p0, Lax/Y0/Y;->g:Z

    .line 10
    invoke-static {p1}, Lax/Y0/Y$b;->g(Lax/Y0/Y$b;)Z

    move-result p1

    iput-boolean p1, p0, Lax/Y0/Y;->h:Z

    return-void
.end method

.method synthetic constructor <init>(Lax/Y0/Y$b;Lax/Y0/Y$a;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/Y0/Y;-><init>(Lax/Y0/Y$b;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 5

    .line 1
    instance-of v0, p1, Lax/Y0/Y;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    check-cast p1, Lax/Y0/Y;

    .line 8
    .line 9
    iget-object v0, p0, Lax/Y0/Y;->a:Lax/r7/C;

    .line 10
    .line 11
    iget-object v2, p1, Lax/Y0/Y;->a:Lax/r7/C;

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Lax/r7/C;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_40

    .line 18
    .line 19
    iget-boolean v0, p0, Lax/Y0/Y;->f:Z

    .line 20
    .line 21
    iget-boolean v2, p1, Lax/Y0/Y;->f:Z

    .line 22
    .line 23
    if-ne v0, v2, :cond_40

    .line 24
    .line 25
    iget-object v0, p0, Lax/Y0/Y;->b:Ljava/lang/Double;

    .line 26
    .line 27
    iget-object v2, p1, Lax/Y0/Y;->b:Ljava/lang/Double;

    .line 28
    .line 29
    invoke-static {v0, v2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_40

    .line 34
    .line 35
    iget-object v0, p0, Lax/Y0/Y;->c:Ljava/lang/Double;

    .line 36
    .line 37
    iget-object v2, p1, Lax/Y0/Y;->c:Ljava/lang/Double;

    .line 38
    .line 39
    invoke-static {v0, v2}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_40

    .line 44
    .line 45
    iget-boolean v0, p0, Lax/Y0/Y;->d:Z

    .line 46
    .line 47
    iget-boolean v2, p1, Lax/Y0/Y;->d:Z

    .line 48
    .line 49
    if-ne v0, v2, :cond_40

    .line 50
    .line 51
    iget-boolean v0, p0, Lax/Y0/Y;->g:Z

    .line 52
    .line 53
    iget-boolean v2, p1, Lax/Y0/Y;->g:Z

    .line 54
    .line 55
    if-ne v0, v2, :cond_40

    .line 56
    .line 57
    iget-boolean v0, p0, Lax/Y0/Y;->h:Z

    .line 58
    .line 59
    iget-boolean p1, p1, Lax/Y0/Y;->h:Z

    .line 60
    .line 61
    if-ne v0, p1, :cond_40

    .line 62
    .line 63
    const/4 p1, 0x1

    .line 64
    return p1

    .line 65
    :cond_40
    return v1
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

.method public hashCode()I
    .registers 10

    .line 1
    iget-object v0, p0, Lax/Y0/Y;->a:Lax/r7/C;

    .line 2
    .line 3
    iget-object v1, p0, Lax/Y0/Y;->b:Ljava/lang/Double;

    .line 4
    .line 5
    iget-object v2, p0, Lax/Y0/Y;->c:Ljava/lang/Double;

    .line 6
    .line 7
    iget-boolean v3, p0, Lax/Y0/Y;->d:Z

    .line 8
    .line 9
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-boolean v4, p0, Lax/Y0/Y;->f:Z

    .line 14
    .line 15
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    iget-boolean v5, p0, Lax/Y0/Y;->g:Z

    .line 20
    .line 21
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget-boolean v6, p0, Lax/Y0/Y;->h:Z

    .line 26
    .line 27
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    const/4 v7, 0x7

    .line 32
    new-array v7, v7, [Ljava/lang/Object;

    .line 33
    .line 34
    const/4 v8, 0x0

    .line 35
    aput-object v0, v7, v8

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    aput-object v1, v7, v0

    .line 39
    .line 40
    const/4 v0, 0x2

    .line 41
    aput-object v2, v7, v0

    .line 42
    .line 43
    const/4 v0, 0x3

    .line 44
    aput-object v3, v7, v0

    .line 45
    .line 46
    const/4 v0, 0x4

    .line 47
    aput-object v4, v7, v0

    .line 48
    .line 49
    const/4 v0, 0x5

    .line 50
    aput-object v5, v7, v0

    .line 51
    .line 52
    const/4 v0, 0x6

    .line 53
    aput-object v6, v7, v0

    .line 54
    .line 55
    invoke-static {v7}, Lj$/util/Objects;->hash([Ljava/lang/Object;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    return v0
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
