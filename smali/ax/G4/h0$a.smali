.class public Lax/G4/h0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/G4/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field protected final a:Ljava/lang/String;

.field protected b:Lax/G4/f0;

.field protected c:Lax/G4/c0;

.field protected d:Ljava/lang/Boolean;


# direct methods
.method protected constructor <init>(Ljava/lang/String;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1f

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x3e8

    .line 11
    .line 12
    if-gt v0, v1, :cond_17

    .line 13
    .line 14
    iput-object p1, p0, Lax/G4/h0$a;->a:Ljava/lang/String;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput-object p1, p0, Lax/G4/h0$a;->b:Lax/G4/f0;

    .line 18
    .line 19
    iput-object p1, p0, Lax/G4/h0$a;->c:Lax/G4/c0;

    .line 20
    .line 21
    iput-object p1, p0, Lax/G4/h0$a;->d:Ljava/lang/Boolean;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_17
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    const-string v0, "String \'query\' is longer than 1000"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    const-string v0, "Required value for \'query\' is null"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1
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


# virtual methods
.method public a()Lax/G4/h0;
    .registers 6

    .line 1
    new-instance v0, Lax/G4/h0;

    .line 2
    .line 3
    iget-object v1, p0, Lax/G4/h0$a;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lax/G4/h0$a;->b:Lax/G4/f0;

    .line 6
    .line 7
    iget-object v3, p0, Lax/G4/h0$a;->c:Lax/G4/c0;

    .line 8
    .line 9
    iget-object v4, p0, Lax/G4/h0$a;->d:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3, v4}, Lax/G4/h0;-><init>(Ljava/lang/String;Lax/G4/f0;Lax/G4/c0;Ljava/lang/Boolean;)V

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

.method public b(Lax/G4/f0;)Lax/G4/h0$a;
    .registers 2

    .line 1
    iput-object p1, p0, Lax/G4/h0$a;->b:Lax/G4/f0;

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
