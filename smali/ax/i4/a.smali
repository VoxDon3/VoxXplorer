.class public Lax/i4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/i4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/i4/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lax/i4/b<",
        "TR;>;"
    }
.end annotation


# static fields
.field static final a:Lax/i4/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/i4/a<",
            "*>;"
        }
    .end annotation
.end field

.field private static final b:Lax/i4/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/i4/c<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/i4/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/i4/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/i4/a;->a:Lax/i4/a;

    .line 7
    .line 8
    new-instance v0, Lax/i4/a$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lax/i4/a$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lax/i4/a;->b:Lax/i4/c;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>()V
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

.method public static a()Lax/i4/c;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">()",
            "Lax/i4/c<",
            "TR;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lax/i4/a;->b:Lax/i4/c;

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
