.class public Lax/H/j;
.super Lax/H/e;
.source "SourceFile"

# interfaces
.implements Lax/H/i;


# instance fields
.field public L0:[Lax/H/e;

.field public M0:I


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/H/e;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v0, v0, [Lax/H/e;

    .line 6
    .line 7
    iput-object v0, p0, Lax/H/j;->L0:[Lax/H/e;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lax/H/j;->M0:I

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


# virtual methods
.method public a(Lax/H/f;)V
    .registers 2

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
    .line 22
.end method

.method public b()V
    .registers 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lax/H/j;->M0:I

    .line 3
    .line 4
    iget-object v0, p0, Lax/H/j;->L0:[Lax/H/e;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public c(Lax/H/e;)V
    .registers 5

    .line 1
    if-eq p1, p0, :cond_23

    .line 2
    .line 3
    if-nez p1, :cond_5

    .line 4
    .line 5
    goto :goto_23

    .line 6
    :cond_5
    iget v0, p0, Lax/H/j;->M0:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    iget-object v1, p0, Lax/H/j;->L0:[Lax/H/e;

    .line 11
    .line 12
    array-length v2, v1

    .line 13
    if-le v0, v2, :cond_19

    .line 14
    .line 15
    array-length v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x2

    .line 17
    .line 18
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, [Lax/H/e;

    .line 23
    .line 24
    iput-object v0, p0, Lax/H/j;->L0:[Lax/H/e;

    .line 25
    .line 26
    :cond_19
    iget-object v0, p0, Lax/H/j;->L0:[Lax/H/e;

    .line 27
    .line 28
    iget v1, p0, Lax/H/j;->M0:I

    .line 29
    .line 30
    aput-object p1, v0, v1

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    iput v1, p0, Lax/H/j;->M0:I

    .line 35
    .line 36
    :cond_23
    :goto_23
    return-void
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

.method public r1(Ljava/util/ArrayList;ILax/I/o;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lax/I/o;",
            ">;I",
            "Lax/I/o;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_2
    iget v2, p0, Lax/H/j;->M0:I

    .line 4
    .line 5
    if-ge v1, v2, :cond_10

    .line 6
    .line 7
    iget-object v2, p0, Lax/H/j;->L0:[Lax/H/e;

    .line 8
    .line 9
    aget-object v2, v2, v1

    .line 10
    .line 11
    invoke-virtual {p3, v2}, Lax/I/o;->a(Lax/H/e;)Z

    .line 12
    .line 13
    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_10
    :goto_10
    iget v1, p0, Lax/H/j;->M0:I

    .line 18
    .line 19
    if-ge v0, v1, :cond_1e

    .line 20
    .line 21
    iget-object v1, p0, Lax/H/j;->L0:[Lax/H/e;

    .line 22
    .line 23
    aget-object v1, v1, v0

    .line 24
    .line 25
    invoke-static {v1, p2, p1, p3}, Lax/I/i;->a(Lax/H/e;ILjava/util/ArrayList;Lax/I/o;)Lax/I/o;

    .line 26
    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    goto :goto_10

    .line 31
    :cond_1e
    return-void
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

.method public s1(I)I
    .registers 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_1
    iget v1, p0, Lax/H/j;->M0:I

    .line 3
    .line 4
    const/4 v2, -0x1

    .line 5
    if-ge v0, v1, :cond_1c

    .line 6
    .line 7
    iget-object v1, p0, Lax/H/j;->L0:[Lax/H/e;

    .line 8
    .line 9
    aget-object v1, v1, v0

    .line 10
    .line 11
    if-nez p1, :cond_11

    .line 12
    .line 13
    iget v3, v1, Lax/H/e;->I0:I

    .line 14
    .line 15
    if-eq v3, v2, :cond_11

    .line 16
    .line 17
    return v3

    .line 18
    :cond_11
    const/4 v3, 0x1

    .line 19
    if-ne p1, v3, :cond_19

    .line 20
    .line 21
    iget v1, v1, Lax/H/e;->J0:I

    .line 22
    .line 23
    if-eq v1, v2, :cond_19

    .line 24
    .line 25
    return v1

    .line 26
    :cond_19
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1c
    return v2
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
