.class public final synthetic Lax/k2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:[Ljava/lang/String;

.field public final synthetic q:Lax/k2/r;


# direct methods
.method public synthetic constructor <init>(Lax/k2/r;[Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/k2/s;->q:Lax/k2/r;

    iput-object p2, p0, Lax/k2/s;->c0:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/k2/s;->q:Lax/k2/r;

    iget-object v1, p0, Lax/k2/s;->c0:[Ljava/lang/String;

    invoke-static {v0, v1}, Lax/k2/r$b;->w(Lax/k2/r;[Ljava/lang/String;)V

    return-void
.end method
