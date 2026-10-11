.class public Lax/G4/n0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/G4/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field protected final a:Ljava/lang/String;

.field protected b:Lax/G4/q0;

.field protected c:Lax/G4/s0;

.field protected d:Lax/G4/r0;


# direct methods
.method protected constructor <init>(Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_24

    .line 5
    .line 6
    const-string v0, "(/(.|[\\r\\n])*|id:.*)|(rev:[0-9a-f]{9,})|(ns:[0-9]+(/.*)?)"

    .line 7
    .line 8
    invoke-static {v0, p1}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1c

    .line 13
    .line 14
    iput-object p1, p0, Lax/G4/n0$a;->a:Ljava/lang/String;

    .line 15
    .line 16
    sget-object p1, Lax/G4/q0;->q:Lax/G4/q0;

    .line 17
    .line 18
    iput-object p1, p0, Lax/G4/n0$a;->b:Lax/G4/q0;

    .line 19
    .line 20
    sget-object p1, Lax/G4/s0;->c0:Lax/G4/s0;

    .line 21
    .line 22
    iput-object p1, p0, Lax/G4/n0$a;->c:Lax/G4/s0;

    .line 23
    .line 24
    sget-object p1, Lax/G4/r0;->q:Lax/G4/r0;

    .line 25
    .line 26
    iput-object p1, p0, Lax/G4/n0$a;->d:Lax/G4/r0;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    const-string v0, "String \'path\' does not match pattern"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_24
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    const-string v0, "Required value for \'path\' is null"

    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
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


# virtual methods
.method public a()Lax/G4/n0;
    .registers 6

    .line 1
    new-instance v0, Lax/G4/n0;

    .line 2
    .line 3
    iget-object v1, p0, Lax/G4/n0$a;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lax/G4/n0$a;->b:Lax/G4/q0;

    .line 6
    .line 7
    iget-object v3, p0, Lax/G4/n0$a;->c:Lax/G4/s0;

    .line 8
    .line 9
    iget-object v4, p0, Lax/G4/n0$a;->d:Lax/G4/r0;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3, v4}, Lax/G4/n0;-><init>(Ljava/lang/String;Lax/G4/q0;Lax/G4/s0;Lax/G4/r0;)V

    .line 12
    .line 13
    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public b(Lax/G4/q0;)Lax/G4/n0$a;
    .registers 2

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    iput-object p1, p0, Lax/G4/n0$a;->b:Lax/G4/q0;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_5
    sget-object p1, Lax/G4/q0;->q:Lax/G4/q0;

    .line 7
    .line 8
    iput-object p1, p0, Lax/G4/n0$a;->b:Lax/G4/q0;

    .line 9
    .line 10
    return-object p0
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

.method public c(Lax/G4/s0;)Lax/G4/n0$a;
    .registers 2

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    iput-object p1, p0, Lax/G4/n0$a;->c:Lax/G4/s0;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_5
    sget-object p1, Lax/G4/s0;->c0:Lax/G4/s0;

    .line 7
    .line 8
    iput-object p1, p0, Lax/G4/n0$a;->c:Lax/G4/s0;

    .line 9
    .line 10
    return-object p0
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
