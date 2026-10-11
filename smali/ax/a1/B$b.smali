.class public final Lax/a1/B$b;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a1/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final q:Lax/P0/v;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lax/P0/v;)V
    .registers 3

    .line 3
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 4
    iput-object p2, p0, Lax/a1/B$b;->q:Lax/P0/v;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Lax/P0/v;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 2
    iput-object p2, p0, Lax/a1/B$b;->q:Lax/P0/v;

    return-void
.end method
