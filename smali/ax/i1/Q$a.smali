.class final Lax/i1/Q$a;
.super Lax/l1/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/i1/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final b:Lax/P0/P;


# direct methods
.method public constructor <init>(Lax/l1/D;Lax/P0/P;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lax/l1/F;-><init>(Lax/l1/D;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lax/i1/Q$a;->b:Lax/P0/P;

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


# virtual methods
.method public b()Lax/P0/P;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i1/Q$a;->b:Lax/P0/P;

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

.method public equals(Ljava/lang/Object;)Z
    .registers 3

    .line 1
    invoke-super {p0, p1}, Lax/l1/F;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_16

    .line 6
    .line 7
    instance-of v0, p1, Lax/i1/Q$a;

    .line 8
    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    goto :goto_16

    .line 12
    :cond_b
    check-cast p1, Lax/i1/Q$a;

    .line 13
    .line 14
    iget-object v0, p0, Lax/i1/Q$a;->b:Lax/P0/P;

    .line 15
    .line 16
    iget-object p1, p1, Lax/i1/Q$a;->b:Lax/P0/P;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lax/P0/P;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_16
    :goto_16
    const/4 p1, 0x0

    .line 24
    return p1
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
.end method

.method public h(I)Lax/P0/v;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/i1/Q$a;->b:Lax/P0/P;

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/l1/F;->u()Lax/l1/D;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1, p1}, Lax/l1/H;->j(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {v0, p1}, Lax/P0/P;->b(I)Lax/P0/v;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public hashCode()I
    .registers 3

    .line 1
    invoke-super {p0}, Lax/l1/F;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object v1, p0, Lax/i1/Q$a;->b:Lax/P0/P;

    .line 8
    .line 9
    invoke-virtual {v1}, Lax/P0/P;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v0, v1

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public m()Lax/P0/v;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i1/Q$a;->b:Lax/P0/P;

    .line 2
    .line 3
    invoke-virtual {p0}, Lax/l1/F;->u()Lax/l1/D;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Lax/l1/D;->l()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, v1}, Lax/P0/P;->b(I)Lax/P0/v;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
