.class public final Lax/G4/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/G4/c$b;,
        Lax/G4/c$c;
    }
.end annotation


# instance fields
.field private a:Lax/G4/c$c;

.field private b:Lax/G4/S0;


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method static synthetic a(Lax/G4/c;)Lax/G4/S0;
    .registers 1

    .line 1
    iget-object p0, p0, Lax/G4/c;->b:Lax/G4/S0;

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

.method public static b(Lax/G4/S0;)Lax/G4/c;
    .registers 3

    .line 1
    if-eqz p0, :cond_e

    .line 2
    .line 3
    new-instance v0, Lax/G4/c;

    .line 4
    .line 5
    invoke-direct {v0}, Lax/G4/c;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lax/G4/c$c;->q:Lax/G4/c$c;

    .line 9
    .line 10
    invoke-direct {v0, v1, p0}, Lax/G4/c;->d(Lax/G4/c$c;Lax/G4/S0;)Lax/G4/c;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    const-string v0, "Value is null"

    .line 18
    .line 19
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p0
.end method

.method private d(Lax/G4/c$c;Lax/G4/S0;)Lax/G4/c;
    .registers 4

    .line 1
    new-instance v0, Lax/G4/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/G4/c;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lax/G4/c;->a:Lax/G4/c$c;

    .line 7
    .line 8
    iput-object p2, v0, Lax/G4/c;->b:Lax/G4/S0;

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
.method public c()Lax/G4/c$c;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/G4/c;->a:Lax/G4/c$c;

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
    instance-of v2, p1, Lax/G4/c;

    .line 10
    .line 11
    if-eqz v2, :cond_2f

    .line 12
    .line 13
    check-cast p1, Lax/G4/c;

    .line 14
    .line 15
    iget-object v2, p0, Lax/G4/c;->a:Lax/G4/c$c;

    .line 16
    .line 17
    iget-object v3, p1, Lax/G4/c;->a:Lax/G4/c$c;

    .line 18
    .line 19
    if-eq v2, v3, :cond_15

    .line 20
    .line 21
    return v1

    .line 22
    :cond_15
    sget-object v3, Lax/G4/c$a;->a:[I

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    aget v2, v3, v2

    .line 29
    .line 30
    if-eq v2, v0, :cond_20

    .line 31
    .line 32
    return v1

    .line 33
    :cond_20
    iget-object v2, p0, Lax/G4/c;->b:Lax/G4/S0;

    .line 34
    .line 35
    iget-object p1, p1, Lax/G4/c;->b:Lax/G4/S0;

    .line 36
    .line 37
    if-eq v2, p1, :cond_2e

    .line 38
    .line 39
    invoke-virtual {v2, p1}, Lax/G4/S0;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_2d

    .line 44
    .line 45
    goto :goto_2e

    .line 46
    :cond_2d
    return v1

    .line 47
    :cond_2e
    :goto_2e
    return v0

    .line 48
    :cond_2f
    return v1
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
    .registers 5

    .line 1
    iget-object v0, p0, Lax/G4/c;->a:Lax/G4/c$c;

    .line 2
    .line 3
    iget-object v1, p0, Lax/G4/c;->b:Lax/G4/S0;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    new-array v2, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v0, v2, v3

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    aput-object v1, v2, v0

    .line 13
    .line 14
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
    .line 19
    .line 20
    .line 21
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    .line 1
    sget-object v0, Lax/G4/c$b;->b:Lax/G4/c$b;

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
