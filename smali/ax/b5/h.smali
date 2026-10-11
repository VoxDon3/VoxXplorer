.class public final Lax/b5/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<F::",
        "Lax/b5/g;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected a:I


# direct methods
.method protected constructor <init>(I)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lax/b5/h;->a:I

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
    .line 22
.end method

.method public static a([Lax/b5/g;)Lax/b5/h;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F::",
            "Lax/b5/g;",
            ">([TF;)",
            "Lax/b5/h<",
            "TF;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    array-length v1, p0

    .line 3
    const/16 v2, 0x1f

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-gt v1, v2, :cond_20

    .line 7
    .line 8
    array-length v1, p0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_9
    if-ge v3, v1, :cond_1a

    .line 11
    .line 12
    aget-object v4, p0, v3

    .line 13
    .line 14
    invoke-interface {v4}, Lax/b5/g;->d()Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-eqz v5, :cond_18

    .line 19
    .line 20
    invoke-interface {v4}, Lax/b5/g;->h()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    or-int/2addr v2, v4

    .line 25
    :cond_18
    add-int/2addr v3, v0

    .line 26
    goto :goto_9

    .line 27
    :cond_1a
    new-instance p0, Lax/b5/h;

    .line 28
    .line 29
    invoke-direct {p0, v2}, Lax/b5/h;-><init>(I)V

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_20
    aget-object v1, p0, v3

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    array-length p0, p0

    .line 46
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const/4 v4, 0x2

    .line 51
    new-array v4, v4, [Ljava/lang/Object;

    .line 52
    .line 53
    aput-object v1, v4, v3

    .line 54
    .line 55
    aput-object p0, v4, v0

    .line 56
    .line 57
    const-string p0, "Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)"

    .line 58
    .line 59
    invoke-static {p0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-direct {v2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v2
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


# virtual methods
.method public b(Lax/b5/g;)Lax/b5/h;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TF;)",
            "Lax/b5/h<",
            "TF;>;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lax/b5/h;->a:I

    .line 2
    .line 3
    invoke-interface {p1}, Lax/b5/g;->h()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    or-int/2addr p1, v0

    .line 8
    iget v0, p0, Lax/b5/h;->a:I

    .line 9
    .line 10
    if-ne p1, v0, :cond_c

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_c
    new-instance v0, Lax/b5/h;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Lax/b5/h;-><init>(I)V

    .line 16
    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
.end method
