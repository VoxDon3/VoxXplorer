.class public final Lax/P0/C;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/P0/C$a;
    }
.end annotation


# instance fields
.field private final a:[Lax/P0/C$a;

.field public final b:J


# direct methods
.method public constructor <init>(JLjava/util/List;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "Lax/P0/C$a;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 6
    new-array v0, v0, [Lax/P0/C$a;

    invoke-interface {p3, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Lax/P0/C$a;

    invoke-direct {p0, p1, p2, p3}, Lax/P0/C;-><init>(J[Lax/P0/C$a;)V

    return-void
.end method

.method public varargs constructor <init>(J[Lax/P0/C$a;)V
    .registers 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lax/P0/C;->b:J

    .line 4
    iput-object p3, p0, Lax/P0/C;->a:[Lax/P0/C$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lax/P0/C$a;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 5
    new-array v0, v0, [Lax/P0/C$a;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lax/P0/C$a;

    invoke-direct {p0, p1}, Lax/P0/C;-><init>([Lax/P0/C$a;)V

    return-void
.end method

.method public varargs constructor <init>([Lax/P0/C$a;)V
    .registers 4

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 1
    invoke-direct {p0, v0, v1, p1}, Lax/P0/C;-><init>(J[Lax/P0/C$a;)V

    return-void
.end method


# virtual methods
.method public varargs a([Lax/P0/C$a;)Lax/P0/C;
    .registers 6

    .line 1
    array-length v0, p1

    .line 2
    if-nez v0, :cond_4

    .line 3
    .line 4
    return-object p0

    .line 5
    :cond_4
    new-instance v0, Lax/P0/C;

    .line 6
    .line 7
    iget-wide v1, p0, Lax/P0/C;->b:J

    .line 8
    .line 9
    iget-object v3, p0, Lax/P0/C;->a:[Lax/P0/C$a;

    .line 10
    .line 11
    invoke-static {v3, p1}, Lax/S0/d0;->f1([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, [Lax/P0/C$a;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, p1}, Lax/P0/C;-><init>(J[Lax/P0/C$a;)V

    .line 18
    .line 19
    .line 20
    return-object v0
    .line 21
    .line 22
.end method

.method public b(Lax/P0/C;)Lax/P0/C;
    .registers 2

    .line 1
    if-nez p1, :cond_3

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_3
    iget-object p1, p1, Lax/P0/C;->a:[Lax/P0/C$a;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lax/P0/C;->a([Lax/P0/C$a;)Lax/P0/C;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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

.method public c(J)Lax/P0/C;
    .registers 6

    .line 1
    iget-wide v0, p0, Lax/P0/C;->b:J

    .line 2
    .line 3
    cmp-long v2, v0, p1

    .line 4
    .line 5
    if-nez v2, :cond_7

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_7
    new-instance v0, Lax/P0/C;

    .line 9
    .line 10
    iget-object v1, p0, Lax/P0/C;->a:[Lax/P0/C$a;

    .line 11
    .line 12
    invoke-direct {v0, p1, p2, v1}, Lax/P0/C;-><init>(J[Lax/P0/C$a;)V

    .line 13
    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public d(I)Lax/P0/C$a;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/P0/C;->a:[Lax/P0/C$a;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
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

.method public e()I
    .registers 2

    .line 1
    iget-object v0, p0, Lax/P0/C;->a:[Lax/P0/C$a;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
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

.method public equals(Ljava/lang/Object;)Z
    .registers 8

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_4

    .line 3
    .line 4
    return v0

    .line 5
    :cond_4
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_25

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, Lax/P0/C;

    .line 13
    .line 14
    if-eq v3, v2, :cond_10

    .line 15
    .line 16
    goto :goto_25

    .line 17
    :cond_10
    check-cast p1, Lax/P0/C;

    .line 18
    .line 19
    iget-object v2, p0, Lax/P0/C;->a:[Lax/P0/C$a;

    .line 20
    .line 21
    iget-object v3, p1, Lax/P0/C;->a:[Lax/P0/C$a;

    .line 22
    .line 23
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_25

    .line 28
    .line 29
    iget-wide v2, p0, Lax/P0/C;->b:J

    .line 30
    .line 31
    iget-wide v4, p1, Lax/P0/C;->b:J

    .line 32
    .line 33
    cmp-long p1, v2, v4

    .line 34
    .line 35
    if-nez p1, :cond_25

    .line 36
    .line 37
    return v0

    .line 38
    :cond_25
    :goto_25
    return v1
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

.method public hashCode()I
    .registers 4

    .line 1
    iget-object v0, p0, Lax/P0/C;->a:[Lax/P0/C$a;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-wide v1, p0, Lax/P0/C;->b:J

    .line 10
    .line 11
    invoke-static {v1, v2}, Lax/u7/h;->g(J)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public toString()Ljava/lang/String;
    .registers 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "entries="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lax/P0/C;->a:[Lax/P0/C$a;

    .line 12
    .line 13
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-wide v1, p0, Lax/P0/C;->b:J

    .line 21
    .line 22
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v5, v1, v3

    .line 28
    .line 29
    if-nez v5, :cond_21

    .line 30
    .line 31
    const-string v1, ""

    .line 32
    .line 33
    goto :goto_34

    .line 34
    :cond_21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v2, ", presentationTimeUs="

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-wide v2, p0, Lax/P0/C;->b:J

    .line 45
    .line 46
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :goto_34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
