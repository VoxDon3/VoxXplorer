.class Lax/i2/n$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/i2/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lax/i2/n$d;",
        ">;"
    }
.end annotation


# instance fields
.field public c0:Lax/i2/n$c;

.field public d0:Lax/i2/n$c;

.field public e0:Lax/i2/n$c;

.field public f0:Lax/i2/n$c;

.field public final q:I


# direct methods
.method constructor <init>(Ljava/util/List;I)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/i2/n$c;",
            ">;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/i2/n$c;

    .line 5
    .line 6
    invoke-direct {v0, p2, p2}, Lax/i2/n$c;-><init>(II)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v0}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x3

    .line 14
    if-ltz v0, :cond_1a

    .line 15
    .line 16
    iput v1, p0, Lax/i2/n$d;->q:I

    .line 17
    .line 18
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lax/i2/n$c;

    .line 23
    .line 24
    iput-object p1, p0, Lax/i2/n$d;->c0:Lax/i2/n$c;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    not-int v0, v0

    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v3, 0x1

    .line 30
    if-nez v0, :cond_2a

    .line 31
    .line 32
    iput v3, p0, Lax/i2/n$d;->q:I

    .line 33
    .line 34
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lax/i2/n$c;

    .line 39
    .line 40
    iput-object p1, p0, Lax/i2/n$d;->e0:Lax/i2/n$c;

    .line 41
    .line 42
    return-void

    .line 43
    :cond_2a
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-ne v0, v4, :cond_4d

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    sub-int/2addr v0, v3

    .line 54
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lax/i2/n$c;

    .line 59
    .line 60
    iget v0, p1, Lax/i2/n$c;->q:I

    .line 61
    .line 62
    if-gt v0, p2, :cond_48

    .line 63
    .line 64
    iget v0, p1, Lax/i2/n$c;->c0:I

    .line 65
    .line 66
    if-gt p2, v0, :cond_48

    .line 67
    .line 68
    iput v1, p0, Lax/i2/n$d;->q:I

    .line 69
    .line 70
    iput-object p1, p0, Lax/i2/n$d;->c0:Lax/i2/n$c;

    .line 71
    .line 72
    return-void

    .line 73
    :cond_48
    iput v2, p0, Lax/i2/n$d;->q:I

    .line 74
    .line 75
    iput-object p1, p0, Lax/i2/n$d;->f0:Lax/i2/n$c;

    .line 76
    .line 77
    return-void

    .line 78
    :cond_4d
    add-int/lit8 v2, v0, -0x1

    .line 79
    .line 80
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    check-cast v3, Lax/i2/n$c;

    .line 85
    .line 86
    iget v4, v3, Lax/i2/n$c;->q:I

    .line 87
    .line 88
    if-gt v4, p2, :cond_68

    .line 89
    .line 90
    iget v3, v3, Lax/i2/n$c;->c0:I

    .line 91
    .line 92
    if-gt p2, v3, :cond_68

    .line 93
    .line 94
    iput v1, p0, Lax/i2/n$d;->q:I

    .line 95
    .line 96
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, Lax/i2/n$c;

    .line 101
    .line 102
    iput-object p1, p0, Lax/i2/n$d;->c0:Lax/i2/n$c;

    .line 103
    .line 104
    return-void

    .line 105
    :cond_68
    const/4 p2, 0x2

    .line 106
    iput p2, p0, Lax/i2/n$d;->q:I

    .line 107
    .line 108
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    check-cast p2, Lax/i2/n$c;

    .line 113
    .line 114
    iput-object p2, p0, Lax/i2/n$d;->c0:Lax/i2/n$c;

    .line 115
    .line 116
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    check-cast p1, Lax/i2/n$c;

    .line 121
    .line 122
    iput-object p1, p0, Lax/i2/n$d;->d0:Lax/i2/n$c;

    .line 123
    .line 124
    return-void
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


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .registers 2

    .line 1
    check-cast p1, Lax/i2/n$d;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/i2/n$d;->d(Lax/i2/n$d;)I

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

.method public d(Lax/i2/n$d;)I
    .registers 3

    .line 1
    invoke-virtual {p0}, Lax/i2/n$d;->h()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lax/i2/n$d;->h()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    sub-int/2addr v0, p1

    .line 10
    return v0
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

.method public equals(Ljava/lang/Object;)Z
    .registers 4

    .line 1
    instance-of v0, p1, Lax/i2/n$d;

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
    check-cast p1, Lax/i2/n$d;

    .line 8
    .line 9
    invoke-virtual {p0}, Lax/i2/n$d;->h()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Lax/i2/n$d;->h()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-ne v0, p1, :cond_14

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_14
    return v1
    .line 22
.end method

.method h()I
    .registers 4

    .line 1
    iget v0, p0, Lax/i2/n$d;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_b

    .line 5
    .line 6
    iget-object v0, p0, Lax/i2/n$d;->e0:Lax/i2/n$c;

    .line 7
    .line 8
    iget v0, v0, Lax/i2/n$c;->q:I

    .line 9
    .line 10
    sub-int/2addr v0, v1

    .line 11
    return v0

    .line 12
    :cond_b
    if-nez v0, :cond_13

    .line 13
    .line 14
    iget-object v0, p0, Lax/i2/n$d;->f0:Lax/i2/n$c;

    .line 15
    .line 16
    iget v0, v0, Lax/i2/n$c;->c0:I

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    return v0

    .line 20
    :cond_13
    const/4 v2, 0x2

    .line 21
    if-ne v0, v2, :cond_1c

    .line 22
    .line 23
    iget-object v0, p0, Lax/i2/n$d;->c0:Lax/i2/n$c;

    .line 24
    .line 25
    iget v0, v0, Lax/i2/n$c;->c0:I

    .line 26
    .line 27
    add-int/2addr v0, v1

    .line 28
    return v0

    .line 29
    :cond_1c
    iget-object v0, p0, Lax/i2/n$d;->c0:Lax/i2/n$c;

    .line 30
    .line 31
    iget v0, v0, Lax/i2/n$c;->q:I

    .line 32
    .line 33
    return v0
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

.method public hashCode()I
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i2/n$d;->e0:Lax/i2/n$c;

    .line 2
    .line 3
    iget v0, v0, Lax/i2/n$c;->q:I

    .line 4
    .line 5
    iget-object v1, p0, Lax/i2/n$d;->f0:Lax/i2/n$c;

    .line 6
    .line 7
    iget v1, v1, Lax/i2/n$c;->c0:I

    .line 8
    .line 9
    xor-int/2addr v0, v1

    .line 10
    iget-object v1, p0, Lax/i2/n$d;->c0:Lax/i2/n$c;

    .line 11
    .line 12
    iget v2, v1, Lax/i2/n$c;->c0:I

    .line 13
    .line 14
    xor-int/2addr v0, v2

    .line 15
    iget v1, v1, Lax/i2/n$c;->q:I

    .line 16
    .line 17
    xor-int/2addr v0, v1

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
.end method
